package fossils.fossils.client.blockentity.model.wendiceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class WendiceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftCheek;
	private final ModelPart rightCheek;
	private final ModelPart leftBeak;
	private final ModelPart rightBeak;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart frill;
	private final ModelPart leftFrill;
	private final ModelPart rightFrill;
	private final ModelPart jaw;
	private final ModelPart leftLowerbeak;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public WendiceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftCheek = this.head.getChild("leftCheek");
		this.rightCheek = this.head.getChild("rightCheek");
		this.leftBeak = this.head.getChild("leftBeak");
		this.rightBeak = this.head.getChild("rightBeak");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.frill = this.head.getChild("frill");
		this.leftFrill = this.frill.getChild("leftFrill");
		this.rightFrill = this.frill.getChild("rightFrill");
		this.jaw = this.head.getChild("jaw");
		this.leftLowerbeak = this.jaw.getChild("leftLowerbeak");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -1.2889F, -5.6091F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(1.0F, -0.2889F, -4.6091F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).mirror().addBox(-3.0F, -0.2889F, -4.6091F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -14.1081F, 14.1982F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 114).addBox(0.0F, -2.2F, -6.8F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6769F, 2.4243F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(53, 48).addBox(0.0F, -2.2F, -4.8F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6769F, 2.4243F, -0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3866F, 0.6185F, 0.511F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(120, 3).addBox(-0.4F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3866F, 0.428F, -3.3413F, 1.1525F, -0.0464F, -0.0242F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(73, 9).addBox(-0.4F, -0.5675F, -7.3924F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(9, 76).addBox(-0.4F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3866F, 0.428F, -3.3413F, 0.5416F, -0.0464F, -0.0242F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 125).addBox(-0.5F, -0.7251F, -1.012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1134F, -1.5802F, 7.9182F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 123).addBox(-1.7933F, 2.6395F, -0.3586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4715F, 1.8533F, 5.3723F, 0.6732F, -0.0899F, 0.0339F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(106, 121).addBox(-1.7933F, 4.0409F, 1.368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4715F, 1.8533F, 5.3723F, 0.2805F, -0.0899F, 0.0339F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(101, 121).addBox(-1.7933F, 5.5379F, 2.381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4715F, 1.8533F, 5.3723F, 0.106F, -0.0899F, 0.0339F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 60).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0726F, -2.0781F, 1.333F, 0.1208F, 0.0492F, 0.0211F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 15).addBox(-0.8879F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1056F, -3.4517F, -3.5206F, -0.0014F, 0.0492F, 0.0211F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(126, 0).addBox(0.15F, -0.0897F, -1.5918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6681F, -3.0042F, -6.011F, 0.4379F, -0.2389F, -0.0656F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(113, 8).addBox(-0.92F, 0.0058F, -1.9675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4681F, -2.2042F, -7.911F, 0.8454F, -0.2208F, -0.2035F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(113, 12).addBox(-0.0284F, -0.0088F, -1.9703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4681F, -2.2042F, -7.911F, 0.8191F, -0.0654F, -0.0103F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(113, 4).addBox(0.6601F, -0.096F, -2.0699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6681F, -3.0042F, -6.011F, 0.4256F, -0.0644F, 0.0156F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(78, 114).addBox(-0.7621F, -0.0722F, -2.1718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6681F, -3.0042F, -6.011F, 0.4446F, -0.2815F, -0.1026F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(104, 14).addBox(-0.4132F, -0.8549F, -2.7078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6681F, -2.6792F, -3.711F, 0.2133F, -0.2511F, -0.0284F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(104, 9).addBox(0.511F, -0.8612F, -2.2545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6681F, -2.6792F, -3.711F, 0.207F, -0.0633F, 0.0121F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 4).addBox(-0.501F, -0.4002F, 0.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7056F, -2.4517F, -6.9205F, 0.2177F, -0.3006F, -0.0547F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(94, 46).addBox(-1.0116F, -0.4569F, 0.1245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5134F, -3.1602F, 2.072F, -0.2468F, -0.1348F, 0.0364F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(97, 85).addBox(3.0F, -0.8383F, -0.9482F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.3866F, -2.5363F, 3.0935F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 104).addBox(-1.1586F, 0.038F, 0.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4715F, 1.8533F, 5.3723F, -0.6839F, -0.2477F, 0.1914F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 13).addBox(0.5196F, -0.3565F, 1.415F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4715F, -0.1467F, 0.1723F, -0.4562F, -0.2573F, 0.1781F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 114).addBox(0.5159F, -1.1339F, -0.5206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.4715F, -0.1467F, 0.1723F, -1.0077F, -0.2595F, 0.1919F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(71, 103).addBox(0.5024F, 0.119F, -0.6086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4715F, -0.1467F, 0.1723F, -0.2642F, -0.2573F, 0.1781F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(22, 78).addBox(-0.4667F, -0.1089F, -2.5791F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7901F, 1.4477F, -1.5548F, -0.0087F, -0.2527F, -0.0692F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(103, 52).addBox(-0.4F, -0.908F, -3.0168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3866F, 0.428F, -3.3413F, 0.9779F, -0.0464F, -0.0242F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(112, 23).addBox(-0.4F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3866F, 0.428F, -3.3413F, 1.4143F, -0.0464F, -0.0242F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, -2.2F, -3.2F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2311F, -0.4014F, -1.4076F, 0.0651F, -0.0404F, 0.1367F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(114, 16).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1134F, -2.3787F, -3.8521F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1134F, -2.6248F, -3.3235F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 23).addBox(-0.9507F, -0.6464F, -0.1243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8321F, -2.0206F, 5.9721F, -0.3905F, -0.6599F, 0.2472F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(91, 125).addBox(0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 68).addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1134F, -2.6792F, 5.2876F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 64).addBox(-0.5F, -0.666F, -6.893F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1134F, -1.5802F, 7.9182F, -0.096F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3866F, 0.6185F, 0.511F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(120, 3).mirror().addBox(-0.6F, -3.5303F, -5.1626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3866F, 0.428F, -3.3413F, 1.1525F, 0.0464F, 0.0242F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 9).mirror().addBox(-0.6F, -0.5675F, -7.3924F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(9, 76).mirror().addBox(-0.6F, 0.4325F, -5.0923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3866F, 0.428F, -3.3413F, 0.5416F, 0.0464F, 0.0242F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 125).mirror().addBox(-0.5F, -0.7251F, -1.012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1134F, -1.5802F, 7.9182F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(0.7933F, 2.6395F, -0.3586F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4715F, 1.8533F, 5.3723F, 0.6732F, 0.0899F, -0.0339F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(106, 121).mirror().addBox(0.7933F, 4.0409F, 1.368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4715F, 1.8533F, 5.3723F, 0.2805F, 0.0899F, -0.0339F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(101, 121).mirror().addBox(0.7933F, 5.5379F, 2.381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4715F, 1.8533F, 5.3723F, 0.106F, 0.0899F, -0.0339F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(51, 60).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0726F, -2.0781F, 1.333F, 0.1208F, -0.0492F, -0.0211F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(46, 15).mirror().addBox(-2.1121F, -0.1296F, -0.1578F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1056F, -3.4517F, -3.5206F, -0.0014F, -0.0492F, -0.0211F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-1.15F, -0.0897F, -1.5918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6681F, -3.0042F, -6.011F, 0.4379F, 0.2389F, 0.0656F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(113, 8).mirror().addBox(-0.08F, 0.0058F, -1.9675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4681F, -2.2042F, -7.911F, 0.8454F, 0.2208F, 0.2035F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(113, 12).mirror().addBox(-0.9716F, -0.0088F, -1.9703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4681F, -2.2042F, -7.911F, 0.8191F, 0.0654F, 0.0103F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(113, 4).mirror().addBox(-1.6601F, -0.096F, -2.0699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6681F, -3.0042F, -6.011F, 0.4256F, 0.0644F, -0.0156F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(78, 114).mirror().addBox(-0.2379F, -0.0722F, -2.1718F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6681F, -3.0042F, -6.011F, 0.4446F, 0.2815F, 0.1026F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 14).mirror().addBox(-0.5868F, -0.8549F, -2.7078F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6681F, -2.6792F, -3.711F, 0.2133F, 0.2511F, 0.0284F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(104, 9).mirror().addBox(-1.511F, -0.8612F, -2.2545F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6681F, -2.6792F, -3.711F, 0.207F, 0.0633F, -0.0121F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-0.499F, -0.4002F, 0.7932F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7056F, -2.4517F, -6.9205F, 0.2177F, 0.3006F, 0.0547F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 46).mirror().addBox(0.0116F, -0.4569F, 0.1245F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5134F, -3.1602F, 2.072F, -0.2468F, 0.1348F, -0.0364F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(97, 85).mirror().addBox(-5.0F, -0.8383F, -0.9482F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.3866F, -2.5363F, 3.0935F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(0.1586F, 0.038F, 0.0716F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4715F, 1.8533F, 5.3723F, -0.6839F, 0.2477F, -0.1914F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-1.5196F, -0.3565F, 1.415F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4715F, -0.1467F, 0.1723F, -0.4562F, 0.2573F, -0.1781F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 114).mirror().addBox(-1.5159F, -1.1339F, -0.5206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.4715F, -0.1467F, 0.1723F, -1.0077F, 0.2595F, -0.1919F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 103).mirror().addBox(-1.5024F, 0.119F, -0.6086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4715F, -0.1467F, 0.1723F, -0.2642F, 0.2573F, -0.1781F));

		PartDefinition cube_r56 = bone4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(22, 78).mirror().addBox(-0.5333F, -0.1089F, -2.5791F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7901F, 1.4477F, -1.5548F, -0.0087F, 0.2527F, 0.0692F));

		PartDefinition cube_r57 = bone4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.6F, -0.908F, -3.0168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3866F, 0.428F, -3.3413F, 0.9779F, 0.0464F, 0.0242F));

		PartDefinition cube_r58 = bone4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-0.6F, -3.6241F, -5.3343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3866F, 0.428F, -3.3413F, 1.4143F, 0.0464F, 0.0242F));

		PartDefinition cube_r59 = bone4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(19, 47).mirror().addBox(-0.5F, -2.2F, -3.2F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2311F, -0.4014F, -1.4076F, 0.0651F, 0.0404F, -0.1367F));

		PartDefinition cube_r60 = bone4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(114, 16).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1134F, -2.3787F, -3.8521F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1134F, -2.6248F, -3.3235F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-0.0493F, -0.6464F, -0.1243F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8321F, -2.0206F, 5.9721F, -0.3905F, 0.6599F, -0.2472F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 125).mirror().addBox(-1.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 68).mirror().addBox(-0.5F, -0.0777F, -0.0902F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1134F, -2.6792F, 5.2876F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-0.5F, -0.666F, -6.893F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1134F, -1.5802F, 7.9182F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(67, 0).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -0.1437F, -0.722F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r65 = leftleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 93).addBox(0.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 16).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r68 = leftleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(61, 80).addBox(-0.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.6858F, -4.8767F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftleg2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(43, 63).addBox(-0.1F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(98, 29).addBox(-0.1F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r70 = leftleg2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(93, 7).addBox(-1.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = leftleg2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(103, 33).addBox(-1.601F, 6.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 96).addBox(-1.101F, -1.7989F, 0.7208F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r72 = leftleg2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(34, 85).addBox(-1.5F, -5.8767F, 1.1508F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.4017F, 5.9752F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r73 = leftleg3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(98, 40).addBox(-1.102F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(9, 107).addBox(-1.102F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7542F, -1.1405F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r74 = leftfoot.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(97, 101).addBox(-1.0F, -2.1328F, 0.6483F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.499F, 2.9705F, -0.2306F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create().texOffs(48, 0).addBox(-1.999F, -0.3974F, -4.7394F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5398F, -1.0108F, 1.0734F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(43, 68).addBox(-1.5F, 10.1833F, -5.8553F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9F, -0.1437F, -0.722F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r75 = rightleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(34, 96).addBox(-3.5F, -2.9871F, -0.0736F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(2.0F, 10.1705F, -5.7817F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(81, 47).addBox(-1.5F, -1.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2898F, -0.3371F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(41, 75).addBox(-1.5F, -0.1075F, -1.9404F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 2.2114F, 0.1013F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r78 = rightleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(27, 85).addBox(-1.5F, -5.9225F, -1.5513F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, 7.5114F, -2.2987F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.6858F, -4.8767F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightleg2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(111, 106).addBox(-0.9F, -1.4383F, -0.6279F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(57, 100).addBox(-0.9F, -0.4383F, -0.1279F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.3503F, 1.0988F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r80 = rightleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(86, 96).addBox(-0.5F, -2.1773F, 0.1893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 1.7007F, -0.2686F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r81 = rightleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(106, 77).addBox(-0.399F, 6.3011F, 0.6208F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(27, 97).addBox(0.101F, -1.7989F, 0.7208F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.001F, 3.3596F, 0.4581F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r82 = rightleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(52, 89).addBox(-0.5F, -5.8767F, 1.1508F, 2.0F, 9.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1F, 6.7126F, 2.6598F, 0.4538F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.4017F, 5.9752F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r83 = rightleg3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(101, 90).addBox(-1.898F, -2.4938F, -0.3569F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(110, 72).addBox(-1.898F, -0.4938F, 0.1431F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.499F, 2.0848F, -1.2602F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2542F, 0.3595F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r84 = rightfoot.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(103, 19).addBox(-2.0F, -2.1328F, 0.6483F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.499F, 3.5993F, -1.6813F, 0.9599F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create().texOffs(34, 48).addBox(-2.001F, -0.5009F, -4.5412F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2686F, -2.6616F, 1.2915F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3713F, -5.4155F, 0.1635F, -0.2096F, -0.061F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(35, 116).addBox(0.0F, -5.5616F, -0.9978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 116).addBox(0.0F, -5.2616F, -2.8978F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 68).addBox(0.0F, -4.8616F, -4.6978F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(21, 28).addBox(0.0F, -4.6908F, -0.3637F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9877F, -6.5747F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(-15.8265F, -3.7453F, -0.5175F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.0304F, 0.175F, -1.3785F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(121, 19).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.2048F, 0.0392F, -0.3116F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(56, 123).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.1143F, 0.1362F, -0.8498F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(115, 85).mirror().addBox(-1.8257F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -9.6747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(121, 17).mirror().addBox(-2.9009F, -0.4505F, -0.3268F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, 0.0222F, -0.02F, -0.3134F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-4.2475F, -1.8939F, -0.398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, -0.012F, -0.0087F, -0.8579F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(46, 23).mirror().addBox(-13.6513F, -3.7639F, -0.7897F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, -0.0061F, 0.1435F, -1.3824F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(71, 7).mirror().addBox(-14.7298F, -3.7098F, -1.5495F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0039F, 0.2124F, -1.3807F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-6.8531F, -3.731F, -0.8417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0038F, 0.1077F, -1.3811F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(121, 15).mirror().addBox(-4.3767F, -1.7813F, -0.6009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0223F, 0.0309F, -0.8575F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(120, 103).mirror().addBox(-2.9569F, -0.2948F, -0.5346F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.072F, -0.0038F, -0.314F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(27, 13).mirror().addBox(-14.8265F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.0271F, 0.1579F, -1.3791F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(120, 13).mirror().addBox(-4.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.1027F, 0.1231F, -0.8513F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(120, 11).mirror().addBox(-2.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.1882F, 0.0338F, -0.3122F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-5.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6877F, -4.7747F, -0.0641F, -0.078F, -1.3874F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(120, 9).mirror().addBox(-6.133F, -3.7878F, -3.7682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6877F, -4.7747F, -0.0599F, 0.4265F, -1.4142F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(120, 7).mirror().addBox(-4.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6877F, -4.7747F, -0.3217F, -0.3463F, -0.8019F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(119, 74).mirror().addBox(-2.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6877F, -4.7747F, -0.4988F, -0.1768F, -0.2608F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 2).mirror().addBox(-11.1153F, -3.7578F, -2.4801F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.0496F, 0.2344F, -1.3991F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 87).mirror().addBox(-5.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.0482F, 0.0078F, -1.388F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(119, 52).mirror().addBox(-4.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.1621F, -0.1796F, -0.8437F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(115, 82).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4464F, -0.7624F, -4.5841F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(115, 79).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3464F, -1.0624F, -6.5841F, -0.0072F, -0.0098F, 0.5446F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(115, 76).mirror().addBox(-1.6633F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 115).mirror().addBox(-1.8257F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, -0.1385F, 0.558F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(114, 37).mirror().addBox(-1.8257F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, -0.1385F, 0.558F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(119, 35).mirror().addBox(-2.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.2782F, -0.1145F, -0.293F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(27, 11).addBox(2.8266F, -3.7453F, -0.5175F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.0304F, -0.175F, 1.3785F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(121, 19).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.2048F, -0.0392F, 0.3116F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(56, 123).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -14.2747F, 0.1143F, -0.1362F, 0.8498F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(115, 85).addBox(-0.1743F, -1.6761F, -4.8973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -9.6747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(44, 121).addBox(0.0F, -4.5679F, 0.0877F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7123F, -14.8747F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(29, 115).addBox(0.0F, -4.6749F, -0.1539F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2123F, -12.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 115).addBox(0.0F, -4.5105F, -0.1351F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3877F, -10.8747F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(12, 115).addBox(0.0F, -4.6762F, -0.8887F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(121, 17).addBox(0.9009F, -0.4505F, -0.3268F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, 0.0222F, 0.02F, 0.3134F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(48, 9).addBox(2.2475F, -1.8939F, -0.398F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, -0.012F, 0.0087F, 0.8579F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(46, 23).addBox(2.6513F, -3.7639F, -0.7897F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -8.9747F, -0.0061F, -0.1435F, 1.3824F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 7).addBox(6.7298F, -3.7098F, -1.5495F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0039F, -0.2124F, 1.3807F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 0).addBox(2.8531F, -3.731F, -0.8417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0038F, -0.1077F, 1.3811F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(121, 15).addBox(2.3767F, -1.7813F, -0.6009F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.0223F, -0.0309F, 0.8575F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(120, 103).addBox(0.9569F, -0.2948F, -0.5346F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1127F, -10.7747F, 0.072F, 0.0038F, 0.314F));

		PartDefinition cube_r128 = body.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(27, 13).addBox(2.8266F, -3.7453F, -0.5175F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.0271F, -0.1579F, 1.3791F));

		PartDefinition cube_r129 = body.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(120, 13).addBox(2.3205F, -1.8302F, -0.5175F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.1027F, -0.1231F, 0.8513F));

		PartDefinition cube_r130 = body.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(120, 11).addBox(0.9327F, -0.3626F, -0.449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4877F, -12.6747F, 0.1882F, -0.0338F, 0.3122F));

		PartDefinition cube_r131 = body.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 91).addBox(2.37F, -3.7856F, -1.3321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.6877F, -4.7747F, -0.0641F, 0.078F, 1.3874F));

		PartDefinition cube_r132 = body.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(120, 9).addBox(4.133F, -3.7878F, -3.7682F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.6877F, -4.7747F, -0.0599F, -0.4265F, 1.4142F));

		PartDefinition cube_r133 = body.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(120, 7).addBox(2.1928F, -1.941F, -0.4342F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.6877F, -4.7747F, -0.3217F, 0.3463F, 0.8019F));

		PartDefinition cube_r134 = body.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(119, 74).addBox(0.8871F, -0.493F, -0.3247F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.6877F, -4.7747F, -0.4988F, 0.1768F, 0.2608F));

		PartDefinition cube_r135 = body.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(95, 2).addBox(5.1153F, -3.7578F, -2.4801F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.0496F, -0.2344F, 1.3991F));

		PartDefinition cube_r136 = body.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(41, 87).addBox(2.5514F, -3.7553F, -1.2656F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.0482F, -0.0078F, 1.388F));

		PartDefinition cube_r137 = body.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(119, 52).addBox(2.2788F, -1.8659F, -0.5984F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.1621F, 0.1796F, 0.8437F));

		PartDefinition cube_r138 = body.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(115, 82).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4464F, -0.7624F, -4.5841F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r139 = body.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(115, 79).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3464F, -1.0624F, -6.5841F, -0.0072F, 0.0098F, -0.5446F));

		PartDefinition cube_r140 = body.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(115, 76).addBox(-0.3367F, -0.9132F, -0.9878F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 115).addBox(-0.1743F, -1.2627F, -2.9906F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2664F, 0.1385F, -0.558F));

		PartDefinition cube_r141 = body.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(114, 37).addBox(-0.1743F, -1.6761F, -4.8972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.3537F, 0.1385F, -0.558F));

		PartDefinition cube_r142 = body.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(119, 35).addBox(0.929F, -0.3768F, -0.482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1877F, -6.5747F, -0.2782F, 0.1145F, 0.293F));

		PartDefinition cube_r143 = body.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(25, 15).addBox(-1.0F, -0.3573F, -7.8422F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5877F, -8.0747F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r144 = body.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(25, 26).addBox(-1.0F, -1.3073F, -7.6535F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4123F, -0.3747F, -0.0087F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8866F, -15.4671F, -0.0862F, -0.1299F, -0.016F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(41, 119).addBox(0.0F, -4.7175F, -0.2314F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4641F, -2.6052F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(63, 116).addBox(0.0F, -4.4054F, 0.0064F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5644F, -0.9791F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(38, 119).addBox(0.0F, -4.885F, -0.1423F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9356F, -4.4791F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 121).addBox(0.0F, -3.9837F, 0.0289F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5356F, -6.3791F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(121, 45).mirror().addBox(-2.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.5228F, 0.2021F, -0.3214F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(121, 43).mirror().addBox(-4.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.313F, 0.4361F, -0.8414F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-9.7642F, -3.7644F, -0.2185F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.0353F, 0.5298F, -1.4253F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(121, 37).mirror().addBox(-2.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.4914F, 0.1205F, -0.3216F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(121, 29).mirror().addBox(-4.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.3273F, 0.3499F, -0.8311F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-12.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.101F, 0.4643F, -1.3892F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(121, 27).mirror().addBox(-2.9152F, -0.4179F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.4051F, 0.1022F, -0.2974F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(46, 25).mirror().addBox(-13.77F, -3.756F, -0.5341F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.0732F, 0.3804F, -1.3667F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(122, 100).mirror().addBox(-4.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.2581F, 0.2917F, -0.8191F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(121, 21).mirror().addBox(-2.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.3549F, 0.0867F, -0.3021F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(38, 37).mirror().addBox(-14.6845F, -3.7724F, -0.5521F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.062F, 0.3291F, -1.3706F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(105, 50).mirror().addBox(-4.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.2212F, 0.2532F, -0.829F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(34, 55).mirror().addBox(-0.3533F, -0.0103F, -0.7415F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1737F, 14.095F, 1.5642F, 0.4577F, -1.1546F, -0.1895F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(56, 116).mirror().addBox(-0.8F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 116).mirror().addBox(-0.7F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2322F, -2.484F, 0.4373F, -0.2635F, 0.5083F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(121, 45).addBox(0.9138F, -0.4154F, -0.1482F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.5228F, -0.2021F, 0.3214F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(121, 43).addBox(2.2761F, -1.8779F, -0.2185F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.313F, -0.4361F, 0.8414F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(82, 0).addBox(2.7642F, -3.7644F, -0.2185F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9728F, -5.9283F, 0.0353F, -0.5298F, 1.4253F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(121, 37).addBox(0.9789F, -0.2358F, -0.5082F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.4914F, -0.1205F, 0.3216F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(121, 29).addBox(2.426F, -1.7433F, -0.5728F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.3273F, -0.3499F, 0.8311F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(48, 7).addBox(2.9613F, -3.7227F, -0.5728F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -4.1874F, 0.101F, -0.4643F, 1.3892F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(121, 27).addBox(0.9152F, -0.4179F, -0.4639F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.4051F, -0.1022F, 0.2974F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(46, 25).addBox(2.77F, -3.756F, -0.5341F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.0732F, -0.3804F, 1.3667F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(122, 100).addBox(2.2769F, -1.8678F, -0.5341F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1356F, -2.2791F, 0.2581F, -0.2917F, 0.8191F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(121, 21).addBox(0.8886F, -0.5014F, -0.4794F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.3549F, -0.0867F, 0.3021F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(38, 37).addBox(2.6845F, -3.7724F, -0.5521F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.062F, -0.3291F, 1.3706F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(105, 50).addBox(2.211F, -1.9247F, -0.5521F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7644F, -0.5791F, 0.2212F, -0.2532F, 0.829F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1463F, 11.7173F, 2.553F, 0.5728F, -1.0434F, -0.2919F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(82, 59).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1463F, 11.7173F, 2.553F, 0.5728F, 1.0434F, 0.2919F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(34, 55).addBox(-0.6468F, -0.0103F, -0.7415F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1737F, 14.095F, 1.5642F, 0.4577F, 1.1546F, 0.1895F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(96, 95).mirror().addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9198F, 10.6176F, -0.7899F, 1.0333F, -1.0663F, -0.4452F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(96, 95).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9198F, 10.6176F, -0.7899F, 1.0333F, 1.0663F, 0.4452F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(-0.5F, 0.0F, -6.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6317F, 11.7988F, 1.1919F, 0.6196F, -1.0283F, -0.3194F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(80, 54).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6317F, 11.7988F, 1.1919F, 0.6196F, 1.0283F, 0.3194F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(101, 125).addBox(-2.1737F, 1.6076F, 2.6693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6737F, 11.6646F, -1.2122F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(26, 71).addBox(-2.1737F, 1.6076F, -2.3307F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1737F, 11.6646F, -1.1122F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(56, 9).addBox(-4.2737F, -0.2194F, -3.7626F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2737F, 13.0646F, -3.7122F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(56, 116).addBox(-1.2F, -0.2F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 116).addBox(-1.3F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2322F, -2.484F, 0.4373F, 0.2635F, -0.5083F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -0.907F, -0.4666F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5356F, -6.3791F, 0.5061F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.9446F, 11.942F, -7.2887F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(57, 39).addBox(-0.5F, -1.0F, -2.875F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1677F, -10.3577F, 6.9212F, 1.1413F, 0.0392F, -0.0971F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -12.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0166F, -12.8242F, 9.1898F, 0.8097F, 0.0392F, -0.0971F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(104, 105).addBox(-0.5F, -1.9F, -0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7063F, -2.573F, 1.3321F, 1.5947F, 0.0924F, -0.0493F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0137F, -0.522F, -0.9738F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0066F, -4.219F, -0.0839F, 0.6613F, 0.0392F, -0.0971F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(68, 85).addBox(-0.2606F, -3.2F, -0.1133F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 1.1232F, 0.2448F, 0.4676F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(87, 23).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2335F, -1.4151F, -1.763F, 1.6201F, 0.3434F, 1.0338F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.9446F, 11.942F, -7.2887F));

		PartDefinition cube_r193 = bone3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(57, 39).mirror().addBox(-0.5F, -1.0F, -2.875F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1677F, -10.3577F, 6.9212F, 1.1413F, -0.0392F, 0.0971F));

		PartDefinition cube_r194 = bone3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, 0.0F, -12.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0166F, -12.8242F, 9.1898F, 0.8097F, -0.0392F, 0.0971F));

		PartDefinition cube_r195 = bone3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(-0.5F, -1.9F, -0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7063F, -2.573F, 1.3321F, 1.5947F, -0.0924F, 0.0493F));

		PartDefinition cube_r196 = bone3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.0137F, -0.522F, -0.9738F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0066F, -4.219F, -0.0839F, 0.6613F, -0.0392F, 0.0971F));

		PartDefinition cube_r197 = bone3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(68, 85).mirror().addBox(-0.7394F, -3.2F, -0.1133F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, 1.1232F, -0.2448F, -0.4676F));

		PartDefinition cube_r198 = bone3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(87, 23).mirror().addBox(-0.5F, 0.0F, -3.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2335F, -1.4151F, -1.763F, 1.6201F, -0.3434F, -1.0338F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6737F, 10.8863F, -4.2998F, 1.0549F, 0.3144F, -0.3351F));

		PartDefinition cube_r199 = leftarm.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(9, 83).addBox(-0.0544F, -5.224F, -2.1389F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.246F, 4.1247F, 0.087F, 0.0714F, -0.5672F, -0.0056F));

		PartDefinition cube_r200 = leftarm.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(94, 52).addBox(-1.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r201 = leftarm.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(81, 66).addBox(-2.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftarm.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(59, 92).addBox(-0.9824F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6479F, 8.6571F, 4.5001F, -1.8731F, 0.2824F, 0.2241F));

		PartDefinition cube_r203 = leftarm2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(11, 93).addBox(-1.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 23).addBox(0.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7276F, 5.0627F, -2.0934F, -0.3054F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7757F, 8.019F, -2.3125F, 1.8163F, 0.0469F, 0.2377F));

		PartDefinition cube_r204 = lefthand.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(32, 102).addBox(-0.9935F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.0013F, 1.3347F, -2.5899F, -0.0242F, 0.2026F, -0.2301F));

		PartDefinition cube_r205 = lefthand.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(82, 2).addBox(-1.5205F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.8327F, 0.0511F, -0.1759F));

		PartDefinition cube_r206 = lefthand.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(62, 108).addBox(0.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5013F, 0.5347F, -1.2899F, -0.9763F, -0.3374F, 0.2997F));

		PartDefinition cube_r207 = lefthand.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(41, 107).addBox(0.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1013F, 1.2347F, -2.7899F, -0.0166F, -0.1742F, 0.1964F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6737F, 10.8863F, -4.2998F, 0.984F, -0.2943F, -0.1031F));

		PartDefinition cube_r208 = rightarm.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(18, 85).addBox(-0.9456F, -5.224F, -2.1389F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.246F, 4.1247F, 0.087F, 0.0714F, 0.5672F, 0.0056F));

		PartDefinition cube_r209 = rightarm.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(77, 95).addBox(-0.5F, -2.5F, -1.3F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 1.0521F, 0.6065F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightarm.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(84, 84).addBox(-1.0F, -1.1F, -1.7F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.2559F, 7.1432F, 3.4116F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightarm.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(18, 95).addBox(-1.0176F, -3.7907F, -0.4712F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7735F, 6.7896F, 2.8281F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6479F, 7.5571F, 4.5001F, -1.6576F, -0.506F, -1.6624F));

		PartDefinition cube_r212 = rightarm2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(96, 19).addBox(0.1933F, -4.4546F, 0.3397F, 1.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 80).addBox(-2.1067F, -5.4546F, 0.3397F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.192F, 4.5523F, -2.4156F, -0.3054F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1439F, 7.5086F, -2.6347F, 0.3026F, -1.2932F, 1.3506F));

		PartDefinition cube_r213 = righthand.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(11, 103).addBox(-2.0065F, -1.3221F, 1.0007F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.0013F, 1.3347F, -2.5899F, -0.0242F, -0.2026F, 0.2301F));

		PartDefinition cube_r214 = righthand.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(77, 90).addBox(-1.4795F, -0.294F, -2.8905F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.3964F, -0.0511F, 0.1759F));

		PartDefinition cube_r215 = righthand.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(110, 0).addBox(-2.0983F, -0.2372F, -2.3475F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5013F, 0.5347F, -1.2899F, -0.5836F, 0.3374F, -0.2997F));

		PartDefinition cube_r216 = righthand.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(109, 40).addBox(-2.0183F, -1.3256F, 0.9975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1013F, 1.2347F, -2.7899F, -0.0166F, 0.1742F, -0.1964F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8356F, -6.4791F, -0.0365F, -0.2559F, -0.0557F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(50, 121).addBox(0.0F, -3.2703F, -0.1461F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, -1.8F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(35, 123).addBox(0.0F, -2.9919F, 0.0011F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 100).mirror().addBox(-2.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.0382F, 0.7136F, -1.3963F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(121, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4156F, -3.4754F, 0.4804F, 0.5595F, -0.7408F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(121, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.3968F, 0.3193F, -0.4319F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(121, 54).mirror().addBox(-3.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, 0.1295F, 0.4734F, -1.0001F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(103, 38).mirror().addBox(-6.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0156F, -1.4754F, -0.1445F, 0.4693F, -1.5896F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(62, 100).addBox(1.7107F, -1.0354F, -0.5375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.0382F, -0.7136F, 1.3963F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(121, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4156F, -3.4754F, 0.4804F, -0.5595F, 0.7408F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(121, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.3968F, -0.3193F, 0.4319F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(121, 54).addBox(1.7107F, -1.0354F, -0.5375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, 0.1295F, -0.4734F, 1.0001F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(103, 38).addBox(2.6959F, -2.752F, -0.5375F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0156F, -1.4754F, -0.1445F, -0.4693F, 1.5896F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(63, 27).addBox(-1.0F, -1.1F, -3.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -4.6F, -0.1372F, -0.3027F, 0.0411F));

		PartDefinition cube_r230 = neck.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(110, 131).addBox(0.0F, -3.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(28, 58).addBox(0.0F, -3.4F, -4.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 37).addBox(-1.0F, -1.4F, -6.7F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -0.2F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(121, 60).mirror().addBox(-2.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0844F, -2.7754F, 0.3928F, 0.8184F, -1.059F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(121, 60).addBox(0.7792F, 0.2788F, 0.0614F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0844F, -2.7754F, 0.3928F, -0.8184F, 1.059F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 39).addBox(-2.5F, -2.7799F, -3.9581F, 5.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.0241F, -6.6823F, 0.1975F, -0.4538F, -0.3253F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(46, 27).addBox(-2.0F, -4.9828F, -0.0309F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9567F, -4.8375F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(84, 78).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2514F, -7.3268F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(71, 78).addBox(-1.5F, -2.7845F, -0.0223F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.3567F, -7.1375F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(111, 121).addBox(-0.5F, -1.3F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -2.233F, -8.9413F, -1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(121, 115).addBox(-0.5F, -1.7F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7835F, -12.7438F, 3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(126, 73).addBox(-0.6F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(126, 67).addBox(-0.4F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -4.3327F, -11.0305F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(116, 121).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.4717F, -11.8184F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(114, 44).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -4.4019F, -12.6153F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(126, 50).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.0325F, -13.3249F, -2.6616F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(126, 34).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.0F, -3.1016F, -13.3632F, -3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(97, 77).addBox(-0.5F, -3.9F, -2.925F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -3.2243F, -13.2849F, -2.8885F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(108, 82).addBox(-0.5F, -3.15F, -0.125F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.1255F, -10.7397F, -2.4522F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(22, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3643F, -7.3824F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(125, 111).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.7597F, -13.4885F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(66, 121).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.5903F, -9.061F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(122, 96).addBox(-0.5F, -1.55F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.781F, -11.7707F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(71, 108).addBox(-0.5F, 1.0636F, -1.6461F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7433F, -12.9125F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(77, 85).addBox(0.0F, 2.5514F, -2.2027F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 0.8433F, -13.5125F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(41, 89).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 1.5604F, -12.6248F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(114, 27).addBox(-0.5F, -0.8F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, 1.7659F, -13.4655F, -2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(111, 125).addBox(0.0F, -0.0838F, 0.0192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.8433F, -13.5125F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(64, 112).addBox(-1.0F, -1.6194F, -0.9205F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.0433F, -8.0625F, 2.7227F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(108, 99).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7663F, -9.3499F, 2.7314F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(108, 95).addBox(-1.0F, -1.725F, -0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0144F, -8.3454F, -3.1154F, 0.0F, 0.0F));

		PartDefinition leftCheek = head.addOrReplaceChild("leftCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(3.742F, -0.0934F, -1.8441F, -1.3701F, 0.0349F, 0.0F));

		PartDefinition cube_r258 = leftCheek.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(125, 105).addBox(-0.425F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4236F, -0.8038F, 2.5079F, -0.1361F, 0.4069F, 0.1059F));

		PartDefinition cube_r259 = leftCheek.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(87, 32).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3412F, -1.2244F, 2.3652F, 0.0249F, 0.4497F, 0.1153F));

		PartDefinition cube_r260 = leftCheek.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(126, 125).addBox(-0.5488F, -1.0027F, 0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(121, 62).addBox(-0.5488F, -2.0027F, 0.0572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 0.8913F, 2.2955F, 1.1206F, 0.4069F, 0.1059F));

		PartDefinition cube_r261 = leftCheek.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(94, 60).addBox(-0.7909F, -1.2904F, -4.4875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.174F, 3.0717F, 0.3417F, 2.2616F, 0.5192F, 0.6417F));

		PartDefinition cube_r262 = leftCheek.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(112, 33).addBox(-0.8764F, -0.8479F, -1.1306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.174F, 3.0717F, 0.3417F, 1.5931F, 0.6816F, 0.4262F));

		PartDefinition cube_r263 = leftCheek.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(89, 106).addBox(-0.5142F, -2.9475F, -1.713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.474F, 1.9717F, 1.1417F, 1.1218F, 0.6816F, 0.4262F));

		PartDefinition cube_r264 = leftCheek.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(50, 75).addBox(-1.0057F, -0.9948F, -0.2791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.174F, 1.2717F, 0.3417F, 0.763F, 0.4192F, 0.0217F));

		PartDefinition rightCheek = head.addOrReplaceChild("rightCheek", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.742F, -0.0934F, -1.8441F, -1.3701F, -0.0349F, 0.0F));

		PartDefinition cube_r265 = rightCheek.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(125, 105).mirror().addBox(-0.575F, -0.525F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4236F, -0.8038F, 2.5079F, -0.1361F, -0.4069F, -0.1059F));

		PartDefinition cube_r266 = rightCheek.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(87, 32).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3412F, -1.2244F, 2.3652F, 0.0249F, -0.4497F, -0.1153F));

		PartDefinition cube_r267 = rightCheek.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(126, 125).mirror().addBox(-0.4512F, -1.0027F, 0.4572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(121, 62).mirror().addBox(-0.4512F, -2.0027F, 0.0572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 0.8913F, 2.2955F, 1.1206F, -0.4069F, -0.1059F));

		PartDefinition cube_r268 = rightCheek.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.2091F, -1.2904F, -4.4875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.174F, 3.0717F, 0.3417F, 2.2616F, -0.5192F, -0.6417F));

		PartDefinition cube_r269 = rightCheek.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(112, 33).mirror().addBox(-0.1236F, -0.8479F, -1.1306F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.174F, 3.0717F, 0.3417F, 1.5931F, -0.6816F, -0.4262F));

		PartDefinition cube_r270 = rightCheek.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(89, 106).mirror().addBox(-0.4858F, -2.9475F, -1.713F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.474F, 1.9717F, 1.1417F, 1.1218F, -0.6816F, -0.4262F));

		PartDefinition cube_r271 = rightCheek.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(0.0057F, -0.9948F, -0.2791F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.174F, 1.2717F, 0.3417F, 0.763F, -0.4192F, -0.0217F));

		PartDefinition leftBeak = head.addOrReplaceChild("leftBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4154F, 7.0619F, -12.673F, -0.0018F, 0.0523F, 0.0F));

		PartDefinition cube_r272 = leftBeak.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(122, 80).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3204F, 0.8455F, -0.2413F, -0.632F, 0.0636F, 0.0753F));

		PartDefinition cube_r273 = leftBeak.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(125, 108).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3014F, 0.0652F, -0.8665F, 0.677F, 0.0636F, 0.0753F));

		PartDefinition cube_r274 = leftBeak.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(66, 116).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.1143F, -0.8263F, 1.0102F, -1.2167F, 0.0636F, 0.0753F));

		PartDefinition cube_r275 = leftBeak.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(106, 125).addBox(-1.2653F, 0.0084F, -0.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5704F, -1.7934F, -1.3304F, 0.1185F, 0.0636F, 0.0753F));

		PartDefinition cube_r276 = leftBeak.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(112, 50).addBox(-1.2653F, 0.9275F, -0.2942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5704F, -1.7934F, -1.3304F, 0.3803F, 0.0636F, 0.0753F));

		PartDefinition rightBeak = head.addOrReplaceChild("rightBeak", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4154F, 7.0619F, -12.673F, -0.0018F, -0.0523F, 0.0F));

		PartDefinition cube_r277 = rightBeak.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(122, 80).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3204F, 0.8455F, -0.2413F, -0.632F, -0.0636F, -0.0753F));

		PartDefinition cube_r278 = rightBeak.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(125, 108).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3014F, 0.0652F, -0.8665F, 0.677F, -0.0636F, -0.0753F));

		PartDefinition cube_r279 = rightBeak.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(66, 116).mirror().addBox(-0.5F, -1.3F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.1143F, -0.8263F, 1.0102F, -1.2167F, -0.0636F, -0.0753F));

		PartDefinition cube_r280 = rightBeak.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(106, 125).mirror().addBox(0.2653F, 0.0084F, -0.0619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.7934F, -1.3304F, 0.1185F, -0.0636F, -0.0753F));

		PartDefinition cube_r281 = rightBeak.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(112, 50).mirror().addBox(0.2653F, 0.9275F, -0.2942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5704F, -1.7934F, -1.3304F, 0.3803F, -0.0636F, -0.0753F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.3F, 5.108F, -6.8808F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(13, 67).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4945F, -7.6589F, -0.1662F, 2.5563F, 0.2443F, 0.0873F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(105, 67).addBox(-1.025F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5044F, 0.1841F, -7.2048F, -1.5726F, 0.0546F, -0.082F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 57).addBox(-2.0111F, -1.3545F, -3.4791F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 1.8582F, 0.2443F, 0.0873F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(0, 109).addBox(-1.0F, -3.0383F, -1.9896F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5184F, -4.1298F, -3.9638F, -2.1236F, 0.1316F, 0.086F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(85, 116).addBox(-1.0F, -3.3383F, -0.3897F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -3.6647F, -5.7816F, -0.9892F, 0.1316F, 0.086F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(71, 118).addBox(-1.7605F, -1.166F, -1.2868F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 1.9286F, 0.2443F, 0.0873F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(119, 0).addBox(-1.7605F, -1.7652F, 2.0543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(118, 112).addBox(-1.7605F, -1.9651F, 2.0543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, -2.3126F, 0.2443F, 0.0873F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(114, 20).addBox(-1.7605F, -3.3275F, 0.4172F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, -2.9583F, 0.2443F, 0.0873F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(118, 109).addBox(-1.7605F, -1.8497F, -2.9278F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 2.1031F, 0.2443F, 0.0873F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(118, 106).addBox(-1.7605F, 0.9366F, -2.5509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 1.0996F, 0.2443F, 0.0873F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(104, 118).addBox(-1.7605F, 1.3407F, 0.4242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, -0.2094F, 0.2443F, 0.0873F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(90, 118).addBox(-1.7605F, -0.7414F, 1.0919F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, -1.3875F, 0.2443F, 0.0873F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(78, 118).addBox(-1.7605F, -1.5997F, -0.1447F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, -2.522F, 0.2443F, 0.0873F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(45, 118).addBox(-1.7605F, -1.4046F, -0.7264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 2.9758F, 0.2443F, 0.0873F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(118, 40).addBox(-1.7605F, -0.0263F, -1.8677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 0.6632F, 0.2443F, 0.0873F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(105, 62).addBox(-1.7605F, 0.9531F, -1.4173F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 0.0087F, 0.2443F, 0.0873F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(5, 118).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.202F, -11.0143F, -0.0956F, 2.7478F, 0.1683F, -2.7449F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(117, 93).addBox(-0.0182F, -1.4516F, 0.3771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(117, 88).addBox(-0.0182F, -1.4516F, 1.0771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, 2.7305F, 0.1169F, -2.8666F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(117, 98).addBox(0.0818F, 0.301F, 1.0666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, -3.1163F, 0.1169F, -2.8666F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(15, 118).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1981F, -10.7247F, -0.7329F, 2.7478F, 0.1683F, -2.7449F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(106, 112).addBox(0.0818F, -0.5169F, -0.6318F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, 1.6678F, -0.2305F, -2.8999F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(54, 131).addBox(-0.9966F, -0.7824F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8667F, -11.9653F, -1.8688F, 2.3311F, 0.1963F, -2.7734F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 122).addBox(-0.9933F, -1.4669F, -0.1598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.3667F, -12.8653F, -2.5688F, 2.2425F, 0.237F, -2.77F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(126, 122).addBox(-0.7588F, -0.7408F, -0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0667F, -13.2653F, -3.6688F, 2.2939F, 0.2776F, -2.7658F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(122, 76).addBox(-0.7588F, -2.3185F, -0.4107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(2.0667F, -13.2653F, -3.6688F, 1.9972F, 0.2776F, -2.7658F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(25, 122).addBox(-0.7588F, -2.3392F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0667F, -13.2653F, -3.6688F, 1.8575F, 0.2776F, -2.7658F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(121, 126).addBox(-0.7588F, -0.8711F, -0.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(2.0667F, -13.2653F, -3.6688F, 1.9448F, 0.2776F, -2.7658F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(121, 119).addBox(-0.9933F, -1.5659F, -0.3828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3667F, -12.8653F, -2.5688F, 2.0854F, 0.237F, -2.77F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(126, 119).addBox(-0.9966F, -0.8373F, -0.7803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8667F, -11.9653F, -1.8688F, 2.1391F, 0.1963F, -2.7734F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(30, 123).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1997F, -11.1629F, -0.0034F, 2.1797F, 0.1887F, -2.8164F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(15, 123).addBox(-0.0182F, -3.735F, -0.7214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, 2.172F, 0.1169F, -2.8666F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(0, 120).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4779F, -11.2751F, -1.166F, 2.446F, 0.1846F, -2.7857F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(20, 123).addBox(-0.0182F, -3.6414F, 0.5143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, 2.4338F, 0.1169F, -2.8666F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(20, 118).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2633F, -11.2369F, -0.0992F, 2.3733F, 0.1779F, -2.8034F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(116, 116).addBox(-0.0182F, -1.8408F, -0.3771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8667F, -9.7653F, 1.4312F, 2.364F, 0.1169F, -2.8666F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(0, 99).addBox(-2.2205F, 0.6771F, -1.9944F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(105, 57).addBox(-1.5505F, 0.6771F, -1.9944F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.2338F, -9.0281F, 2.0814F, 0.4014F, 0.2443F, 0.0873F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(58, 72).addBox(-0.5033F, -1.8538F, 0.0548F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.648F, -0.6762F, 0.1048F, 0.4244F, 0.2091F, 0.0111F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(57, 112).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7565F, -0.7276F, -0.3934F, 0.6818F, 0.2091F, 0.0111F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(87, 39).addBox(0.1967F, -0.4538F, -3.4452F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1627F, -1.6904F, 2.3377F, 0.42F, 0.2091F, 0.0111F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(62, 102).addBox(-1.0551F, 0.0693F, -0.2205F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5252F, -10.7819F, 6.1274F, -0.2215F, 0.8448F, 0.0631F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(105, 45).addBox(-4.0496F, 0.3491F, -5.0783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.251F, -11.3604F, 6.7296F, -0.3965F, 0.9517F, -0.285F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(50, 80).addBox(-1.025F, -2.0F, 0.1F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3034F, -3.95F, -2.4449F, 0.4827F, 0.2095F, 0.1086F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(46, 114).addBox(-0.5F, -1.0F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0095F, 0.9297F, -5.7322F, -0.4525F, 0.0056F, -0.0228F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(32, 106).addBox(-1.025F, 0.4987F, -3.8996F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, 0.5819F, -1.6656F, -0.2793F, 0.1222F, 0.0175F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(0, 127).addBox(-1.025F, 0.5639F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.025F, 0.5819F, -1.6656F, -1.2828F, 0.1222F, 0.0175F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(35, 78).addBox(0.3F, -3.8457F, -0.2155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -1.9647F, -0.2816F, 2.6267F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.3F, 5.108F, -6.8808F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(13, 67).mirror().addBox(-1.0F, -2.0F, -4.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4945F, -7.6589F, -0.1662F, 2.5563F, -0.2443F, -0.0873F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(105, 67).mirror().addBox(0.025F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5044F, 0.1841F, -7.2048F, -1.5726F, -0.0546F, 0.082F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(0.0111F, -1.3545F, -3.4791F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 1.8582F, -0.2443F, -0.0873F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(0.0F, -3.0383F, -1.9896F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5184F, -4.1298F, -3.9638F, -2.1236F, -0.1316F, -0.086F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(85, 116).mirror().addBox(0.0F, -3.3383F, -0.3897F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8F, -3.6647F, -5.7816F, -0.9892F, -0.1316F, -0.086F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(71, 118).mirror().addBox(-0.2395F, -1.166F, -1.2868F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 1.9286F, -0.2443F, -0.0873F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.2395F, -1.7652F, 2.0543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(118, 112).mirror().addBox(-0.2395F, -1.9651F, 2.0543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, -2.3126F, -0.2443F, -0.0873F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(114, 20).mirror().addBox(-0.2395F, -3.3275F, 0.4172F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, -2.9583F, -0.2443F, -0.0873F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 109).mirror().addBox(-0.2395F, -1.8497F, -2.9278F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 2.1031F, -0.2443F, -0.0873F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(118, 106).mirror().addBox(-0.2395F, 0.9366F, -2.5509F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 1.0996F, -0.2443F, -0.0873F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(104, 118).mirror().addBox(-0.2395F, 1.3407F, 0.4242F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, -0.2094F, -0.2443F, -0.0873F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(90, 118).mirror().addBox(-0.2395F, -0.7414F, 1.0919F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, -1.3875F, -0.2443F, -0.0873F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(78, 118).mirror().addBox(-0.2395F, -1.5997F, -0.1447F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, -2.522F, -0.2443F, -0.0873F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(45, 118).mirror().addBox(-0.2395F, -1.4046F, -0.7264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 2.9758F, -0.2443F, -0.0873F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(118, 40).mirror().addBox(-0.2395F, -0.0263F, -1.8677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 0.6632F, -0.2443F, -0.0873F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(105, 62).mirror().addBox(-0.2395F, 0.9531F, -1.4173F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 0.0087F, -0.2443F, -0.0873F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(5, 118).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.202F, -11.0143F, -0.0956F, 2.7478F, -0.1683F, 2.7449F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(117, 93).mirror().addBox(-0.9818F, -1.4516F, 0.3771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(117, 88).mirror().addBox(-0.9818F, -1.4516F, 1.0771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, 2.7305F, -0.1169F, 2.8666F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(117, 98).mirror().addBox(-1.0818F, 0.301F, 1.0666F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, -3.1163F, -0.1169F, 2.8666F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(15, 118).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1981F, -10.7247F, -0.7329F, 2.7478F, -0.1683F, 2.7449F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(106, 112).mirror().addBox(-1.0818F, -0.5169F, -0.6318F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, 1.6678F, 0.2305F, 2.8999F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(54, 131).mirror().addBox(-0.0034F, -0.7824F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -11.9653F, -1.8688F, 2.3311F, -0.1963F, 2.7734F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(10, 122).mirror().addBox(-0.0067F, -1.4669F, -0.1598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.3667F, -12.8653F, -2.5688F, 2.2425F, -0.237F, 2.77F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(126, 122).mirror().addBox(-0.2412F, -0.7408F, -0.3235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0667F, -13.2653F, -3.6688F, 2.2939F, -0.2776F, 2.7658F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(122, 76).mirror().addBox(-0.2412F, -2.3185F, -0.4107F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-2.0667F, -13.2653F, -3.6688F, 1.9972F, -0.2776F, 2.7658F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(25, 122).mirror().addBox(-0.2412F, -2.3392F, -0.6944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0667F, -13.2653F, -3.6688F, 1.8575F, -0.2776F, 2.7658F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(121, 126).mirror().addBox(-0.2412F, -0.8711F, -0.5372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-2.0667F, -13.2653F, -3.6688F, 1.9448F, -0.2776F, 2.7658F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(121, 119).mirror().addBox(-0.0067F, -1.5659F, -0.3828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3667F, -12.8653F, -2.5688F, 2.0854F, -0.237F, 2.77F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(126, 119).mirror().addBox(-0.0034F, -0.8373F, -0.7803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -11.9653F, -1.8688F, 2.1391F, -0.1963F, 2.7734F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(30, 123).mirror().addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1997F, -11.1629F, -0.0034F, 2.1797F, -0.1887F, 2.8164F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(15, 123).mirror().addBox(-0.9818F, -3.735F, -0.7214F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, 2.172F, -0.1169F, 2.8666F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 120).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4779F, -11.2751F, -1.166F, 2.446F, -0.1846F, 2.7857F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(20, 123).mirror().addBox(-0.9818F, -3.6414F, 0.5143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, 2.4338F, -0.1169F, 2.8666F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(20, 118).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2633F, -11.2369F, -0.0992F, 2.3733F, -0.1779F, 2.8034F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(116, 116).mirror().addBox(-0.9818F, -1.8408F, -0.3771F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8667F, -9.7653F, 1.4312F, 2.364F, -0.1169F, 2.8666F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-0.7795F, 0.6771F, -1.9944F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(105, 57).mirror().addBox(-0.4495F, 0.6771F, -1.9944F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.2338F, -9.0281F, 2.0814F, 0.4014F, -0.2443F, -0.0873F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(58, 72).mirror().addBox(-0.4967F, -1.8538F, 0.0548F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.648F, -0.6762F, 0.1048F, 0.4244F, -0.2091F, -0.0111F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(57, 112).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7565F, -0.7276F, -0.3934F, 0.6818F, -0.2091F, -0.0111F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-0.1967F, -0.4538F, -3.4452F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1627F, -1.6904F, 2.3377F, 0.42F, -0.2091F, -0.0111F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(62, 102).mirror().addBox(0.0551F, 0.0693F, -0.2205F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5252F, -10.7819F, 6.1274F, -0.2215F, -0.8448F, -0.0631F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(105, 45).mirror().addBox(3.0496F, 0.3491F, -5.0783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.251F, -11.3604F, 6.7296F, -0.3965F, -0.9517F, 0.285F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(0.025F, -2.0F, 0.1F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3034F, -3.95F, -2.4449F, 0.4827F, -0.2095F, -0.1086F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(46, 114).mirror().addBox(-0.5F, -1.0F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0095F, 0.9297F, -5.7322F, -0.4525F, -0.0056F, 0.0228F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(32, 106).mirror().addBox(0.025F, 0.4987F, -3.8996F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 0.5819F, -1.6656F, -0.2793F, -0.1222F, -0.0175F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(0.025F, 0.5639F, -0.2194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 0.5819F, -1.6656F, -1.2828F, -0.1222F, -0.0175F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-1.3F, -3.8457F, -0.2155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -1.9647F, -0.2816F, 2.6267F, 0.0F, 0.0F));

		PartDefinition frill = head.addOrReplaceChild("frill", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0234F, -3.8806F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r374 = frill.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(68, 94).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -3.0847F, 1.7757F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r375 = frill.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(127, 9).addBox(-0.5F, 0.0007F, -0.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3699F, 1.1247F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r376 = frill.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(65, 35).addBox(-0.5F, -0.5536F, -0.4803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3699F, 1.1247F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r377 = frill.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(127, 6).addBox(-0.5F, 0.0007F, -0.6493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.7949F, 1.9747F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r378 = frill.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(114, 58).addBox(-0.5F, -0.5536F, -0.4803F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.7949F, 1.9747F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r379 = frill.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(114, 54).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.2767F, 2.2616F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r380 = frill.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(5, 127).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -6.2868F, 2.615F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r381 = frill.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(97, 105).addBox(-1.0F, -10.524F, -0.7971F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6015F, 1.4349F, -0.3316F, 0.0F, 0.0F));

		PartDefinition leftFrill = frill.addOrReplaceChild("leftFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(1.471F, -5.1075F, 3.5343F, 0.1F, -0.3365F, 0.1941F));

		PartDefinition cube_r382 = leftFrill.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(99, 72).addBox(-2.825F, -1.825F, 0.35F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.314F, 4.2996F, -2.7953F, 0.2309F, -0.5132F, -1.2028F));

		PartDefinition cube_r383 = leftFrill.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(95, 4).addBox(-0.05F, -0.95F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4207F, -0.8718F, -0.3062F, -0.317F, 0.2903F, 1.4176F));

		PartDefinition cube_r384 = leftFrill.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(111, 103).addBox(-0.05F, -0.95F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4207F, -0.8718F, -0.3062F, -0.1665F, 0.3945F, 1.8585F));

		PartDefinition cube_r385 = leftFrill.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(39, 111).addBox(-3.075F, -1.8F, -0.35F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1713F, -1.087F, 1.7277F, -0.5516F, -0.3067F, 0.3596F));

		PartDefinition cube_r386 = leftFrill.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(103, 23).addBox(-1.5F, 0.2F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1713F, -1.087F, 1.7277F, -0.5728F, 0.1182F, 1.0283F));

		PartDefinition cube_r387 = leftFrill.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(16, 111).addBox(-0.5694F, -4.4095F, -0.954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.0131F, -4.0549F, 2.1857F, 0.4763F, 0.0676F, 3.0848F));

		PartDefinition cube_r388 = leftFrill.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(99, 116).addBox(-1.0993F, -2.3836F, -0.954F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0131F, -4.0549F, 2.1857F, 0.4756F, -0.0732F, -2.9271F));

		PartDefinition cube_r389 = leftFrill.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(86, 72).addBox(-1.3F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7585F, -0.1313F, -0.5485F, 0.1019F, 0.4081F, 1.9015F));

		PartDefinition cube_r390 = leftFrill.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(78, 110).addBox(-3.05F, -0.05F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.094F, 1.1891F, 1.1321F, -0.4129F, 0.3807F, 1.518F));

		PartDefinition cube_r391 = leftFrill.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(86, 102).addBox(-0.1269F, -0.5137F, 0.003F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.6653F, 3.7673F, -0.8306F, 0.2264F, 0.3744F, -3.0508F));

		PartDefinition cube_r392 = leftFrill.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(127, 82).addBox(-0.3681F, -0.5693F, -0.5125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.0705F, -2.1431F, 1.5279F, 1.3635F, -0.7514F, 1.3045F));

		PartDefinition cube_r393 = leftFrill.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(66, 125).addBox(-0.5683F, -0.3675F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.0705F, -2.1431F, 1.5279F, 0.9119F, -1.3226F, 1.8058F));

		PartDefinition cube_r394 = leftFrill.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(127, 85).addBox(-0.2042F, -0.2797F, -0.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.0441F, -2.0444F, 1.6797F, 0.1612F, -0.6974F, 2.7692F));

		PartDefinition cube_r395 = leftFrill.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(127, 88).addBox(-0.2054F, -0.7106F, -0.3957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.0441F, -2.0444F, 1.6797F, 0.4289F, -0.4232F, 2.2192F));

		PartDefinition cube_r396 = leftFrill.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(127, 76).addBox(-0.7988F, -0.2544F, -0.4308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4941F, -0.0444F, 1.4797F, 0.3582F, -0.3524F, 3.0483F));

		PartDefinition cube_r397 = leftFrill.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(49, 127).addBox(-0.3042F, -0.2797F, -0.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4941F, -0.0444F, 1.4797F, 0.4558F, -0.1094F, -3.1333F));

		PartDefinition cube_r398 = leftFrill.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(127, 79).addBox(-0.6218F, -0.6089F, -0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4941F, -0.0444F, 1.4797F, 0.4888F, -0.0942F, 2.4784F));

		PartDefinition cube_r399 = leftFrill.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(44, 127).addBox(-0.1054F, -0.6105F, -0.3957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4941F, -0.0444F, 1.4797F, 0.3987F, 0.2209F, 2.7247F));

		PartDefinition cube_r400 = leftFrill.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(56, 125).addBox(-0.95F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(125, 39).addBox(-0.45F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(6.9303F, 1.7272F, 0.8162F, -0.376F, 0.3346F, 1.8526F));

		PartDefinition cube_r401 = leftFrill.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(131, 48).addBox(-0.65F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 127).addBox(-0.35F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(6.547F, 3.0178F, 0.3442F, -0.3063F, 0.399F, 2.0465F));

		PartDefinition cube_r402 = leftFrill.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(28, 127).addBox(-0.875F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(127, 12).addBox(-0.475F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(5.9373F, 4.4434F, -0.2698F, -0.1538F, 0.4755F, 2.4031F));

		PartDefinition cube_r403 = leftFrill.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(18, 127).addBox(0.0938F, -1.0602F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 125).addBox(0.7938F, -1.0602F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.6653F, 3.7673F, -0.8306F, 0.2587F, 0.3535F, -2.9602F));

		PartDefinition cube_r404 = leftFrill.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(32, 111).addBox(0.9087F, -0.426F, 0.0322F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.08F, 1.8785F, 0.195F, -0.2293F, 0.4175F, 2.1943F));

		PartDefinition cube_r405 = leftFrill.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(111, 111).addBox(-2.037F, -0.0603F, 0.0322F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.8229F, 2.7928F, -0.1179F, -0.3155F, 0.3998F, 1.812F));

		PartDefinition cube_r406 = leftFrill.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(80, 106).addBox(-0.0584F, 0.0323F, -0.1807F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.7116F, -4.3834F, 2.2014F, -0.3672F, 0.1248F, 1.0797F));

		PartDefinition cube_r407 = leftFrill.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(103, 29).addBox(-3.9817F, -0.1131F, -0.0018F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.6116F, -4.3834F, 2.0014F, -0.3025F, 0.1087F, 0.6297F));

		PartDefinition cube_r408 = leftFrill.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(125, 3).addBox(-0.1945F, 0.5947F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.786F, -0.3632F, -0.1265F));

		PartDefinition cube_r409 = leftFrill.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(130, 105).addBox(-0.4154F, 0.2562F, 0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.1326F, -0.2459F, -0.0318F));

		PartDefinition cube_r410 = leftFrill.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(130, 111).addBox(-0.3693F, 1.2104F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 108).addBox(-0.6693F, 1.2104F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 3.0627F, -0.3281F, -0.0623F));

		PartDefinition cube_r411 = leftFrill.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(23, 131).addBox(-0.3693F, 0.2872F, -1.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -2.3827F, -0.3281F, -0.0623F));

		PartDefinition cube_r412 = leftFrill.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(131, 32).addBox(-0.8166F, -1.4725F, 0.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(114, 66).addBox(-0.8166F, -1.4725F, -1.431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -1.3684F, -0.3966F, 0.0522F));

		PartDefinition cube_r413 = leftFrill.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(131, 0).addBox(-0.7623F, 0.2671F, -1.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -2.4067F, -0.3874F, 0.0061F));

		PartDefinition cube_r414 = leftFrill.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(49, 130).addBox(-0.5429F, 0.2476F, 0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.1641F, -0.3922F, -0.1321F));

		PartDefinition cube_r415 = leftFrill.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(119, 48).addBox(-0.4116F, -0.3876F, 0.3786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.8186F, -0.3922F, -0.215F));

		PartDefinition cube_r416 = leftFrill.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(5, 130).addBox(0.301F, 1.0539F, -1.1219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -2.7107F, -0.2214F, 0.152F));

		PartDefinition cube_r417 = leftFrill.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(0, 115).addBox(0.3594F, -1.2745F, 0.3786F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.7095F, -0.2655F, 0.1192F));

		PartDefinition cube_r418 = leftFrill.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(124, 31).addBox(-1.5012F, -1.1218F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -2.7708F, -0.3476F, -1.7854F));

		PartDefinition cube_r419 = leftFrill.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(124, 70).addBox(-0.4582F, -1.5153F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(124, 47).addBox(-0.4582F, -0.9153F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.9557F, -0.4698F, -0.5405F));

		PartDefinition cube_r420 = leftFrill.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(56, 119).addBox(-0.1218F, -0.3262F, 0.3786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 2.6953F, -0.2395F, 0.1763F));

		PartDefinition cube_r421 = leftFrill.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(13, 130).addBox(-0.0706F, 1.013F, -1.139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -2.6705F, -0.1922F, 0.0495F));

		PartDefinition cube_r422 = leftFrill.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(114, 62).addBox(-0.672F, -1.4577F, 0.4671F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 0.2278F, -0.1811F, -0.036F));

		PartDefinition cube_r423 = leftFrill.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(122, 92).addBox(0.4873F, -1.3633F, 0.5921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, 0.2264F, -0.0438F, -0.049F));

		PartDefinition cube_r424 = leftFrill.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(44, 130).addBox(0.203F, -2.0845F, -1.2797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -0.8353F, -0.0914F, 0.1644F));

		PartDefinition cube_r425 = leftFrill.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(130, 37).addBox(0.1558F, -0.6197F, -2.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -1.6776F, -0.2176F, 0.2279F));

		PartDefinition cube_r426 = leftFrill.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(18, 130).addBox(-0.0425F, -0.6197F, -2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -1.6335F, -0.2339F, 0.0316F));

		PartDefinition cube_r427 = leftFrill.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(28, 130).addBox(-0.0425F, -1.9818F, -1.2635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3572F, -6.1933F, 1.4952F, -0.8045F, -0.2339F, 0.0316F));

		PartDefinition cube_r428 = leftFrill.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(119, 23).addBox(-0.475F, -0.5216F, -0.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1725F, -6.742F, 2.4281F, 0.1272F, 0.3689F, 0.3242F));

		PartDefinition cube_r429 = leftFrill.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(126, 128).addBox(-0.5F, -0.7798F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1725F, -6.742F, 2.4281F, -0.809F, 0.3534F, 0.416F));

		PartDefinition cube_r430 = leftFrill.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(129, 21).addBox(-0.5F, -0.1337F, -1.019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1725F, -6.742F, 2.4281F, -1.6729F, 0.3534F, 0.416F));

		PartDefinition cube_r431 = leftFrill.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(119, 70).addBox(0.1F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(119, 31).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3329F, -7.3839F, 2.9925F, 0.0539F, 0.0425F, 0.2475F));

		PartDefinition cube_r432 = leftFrill.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(33, 131).addBox(-0.2935F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 29).addBox(-0.8935F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5758F, -7.0072F, 1.8904F, -0.8886F, 0.0599F, 0.2484F));

		PartDefinition cube_r433 = leftFrill.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(38, 131).addBox(-0.2935F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(129, 45).addBox(-0.8935F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5758F, -7.0072F, 1.8904F, -1.7176F, 0.0599F, 0.2484F));

		PartDefinition cube_r434 = leftFrill.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(129, 62).addBox(-0.2074F, -0.6318F, -0.3295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.0758F, -7.7822F, 1.9904F, -2.7512F, -0.0585F, 0.1961F));

		PartDefinition cube_r435 = leftFrill.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(129, 70).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7483F, -7.4582F, 1.925F, -2.7497F, 0.1029F, 0.2625F));

		PartDefinition cube_r436 = leftFrill.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(122, 84).addBox(0.5566F, -1.8778F, -0.385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(2.0758F, -7.7822F, 1.9904F, 2.6539F, 0.0631F, 0.3895F));

		PartDefinition cube_r437 = leftFrill.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(81, 125).addBox(-0.2F, -0.7875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(86, 125).addBox(-0.2F, -1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9821F, -6.5194F, 1.1952F, 2.7541F, -0.3103F, -0.3712F));

		PartDefinition cube_r438 = leftFrill.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(122, 88).addBox(-0.85F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(3.0614F, -5.8007F, 0.9793F, 2.6512F, 0.0344F, 0.3355F));

		PartDefinition cube_r439 = leftFrill.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(129, 114).addBox(0.7876F, -0.5483F, -0.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0758F, -7.7822F, 1.9904F, -2.7594F, 0.0801F, 0.3649F));

		PartDefinition cube_r440 = leftFrill.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(119, 129).addBox(-0.2288F, -1.0906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 130).addBox(-0.2288F, -1.6906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(130, 3).addBox(-0.0288F, -1.0906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(2.0758F, -7.7822F, 1.9904F, 2.6569F, -0.0846F, 0.1119F));

		PartDefinition cube_r441 = leftFrill.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(128, 53).addBox(-0.6558F, -0.4231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F))
				.texOffs(54, 128).addBox(-0.8558F, -0.6231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(128, 56).addBox(-0.8558F, -0.4231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, 2.6768F, 0.0359F, 0.6874F));

		PartDefinition cube_r442 = leftFrill.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(0, 124).addBox(-0.5435F, 0.2691F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(121, 123).addBox(-0.5435F, -0.3309F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(124, 23).addBox(-0.8935F, 0.2691F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(80, 103).addBox(-0.8935F, -0.3309F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, 0.1586F, 0.0599F, 0.772F));

		PartDefinition cube_r443 = leftFrill.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(104, 128).addBox(-0.5435F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 128).addBox(-0.8935F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -0.8886F, 0.0599F, 0.772F));

		PartDefinition cube_r444 = leftFrill.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(69, 131).addBox(-0.1052F, -0.3477F, 0.3444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(131, 65).addBox(-0.1052F, 0.2523F, 0.3444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, 0.1482F, 0.1635F, 0.7565F));

		PartDefinition cube_r445 = leftFrill.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(114, 128).addBox(-0.1052F, -1.2446F, -0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -0.8554F, 0.1635F, 0.7565F));

		PartDefinition cube_r446 = leftFrill.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(109, 128).addBox(-0.1052F, -0.795F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -1.7193F, 0.1635F, 0.7565F));

		PartDefinition cube_r447 = leftFrill.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(99, 128).addBox(-0.6435F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(89, 128).addBox(-0.8935F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -1.7176F, 0.0599F, 0.772F));

		PartDefinition cube_r448 = leftFrill.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(84, 128).addBox(-0.8935F, -0.0602F, -0.6497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(79, 128).addBox(-0.6685F, -0.0602F, -0.6497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -2.7212F, 0.0599F, 0.772F));

		PartDefinition cube_r449 = leftFrill.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(59, 128).addBox(-0.227F, -0.0515F, -0.6529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, -2.7091F, 0.1917F, 0.9477F));

		PartDefinition cube_r450 = leftFrill.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(128, 59).addBox(-0.246F, -0.4118F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(74, 128).addBox(-0.246F, -0.7617F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, 2.7068F, 0.1734F, 0.9717F));

		PartDefinition cube_r451 = leftFrill.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(64, 128).addBox(-0.9743F, -0.9776F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(69, 128).addBox(-0.9743F, -0.7026F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.5758F, -5.5072F, 1.6904F, 2.7526F, -0.2635F, 0.05F));

		PartDefinition cube_r452 = leftFrill.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(127, 97).addBox(-0.8691F, -0.8984F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(127, 94).addBox(-0.8691F, -0.6234F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(6.6777F, -3.9563F, 1.5702F, 1.7767F, -0.6912F, 0.8332F));

		PartDefinition cube_r453 = leftFrill.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(33, 128).addBox(-0.8261F, -0.4948F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.6777F, -3.9563F, 1.5702F, 1.729F, -0.0036F, 0.965F));

		PartDefinition cube_r454 = leftFrill.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(128, 42).addBox(-0.6585F, -1.3123F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(128, 26).addBox(-0.8585F, -1.3123F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(6.0777F, -3.5063F, 2.7202F, 1.729F, -0.0036F, 0.965F));

		PartDefinition cube_r455 = leftFrill.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(59, 131).addBox(0.0262F, -0.8265F, -0.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 125).addBox(0.0262F, -0.8265F, 0.2274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.0777F, -3.5063F, 2.7202F, 2.1731F, 0.3066F, 1.0161F));

		PartDefinition cube_r456 = leftFrill.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(128, 18).addBox(-0.5581F, -0.8401F, -0.3379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.0777F, -3.5063F, 2.7202F, 2.1994F, 0.0508F, 0.78F));

		PartDefinition cube_r457 = leftFrill.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(64, 131).addBox(-0.9173F, -0.8401F, -0.3489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(128, 15).addBox(-0.9173F, -0.8401F, 0.2511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(127, 102).addBox(-0.6673F, -0.8401F, 0.2511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(6.0777F, -3.5063F, 2.7202F, 2.197F, -0.0776F, 0.9566F));

		PartDefinition cube_r458 = leftFrill.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(71, 125).addBox(0.0262F, -1.2582F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(6.0777F, -3.5063F, 2.7202F, 1.7368F, 0.3066F, 1.0161F));

		PartDefinition cube_r459 = leftFrill.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(127, 91).addBox(-0.2574F, -0.6305F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(6.6777F, -3.9563F, 1.5702F, 1.7368F, 0.3066F, 1.0161F));

		PartDefinition cube_r460 = leftFrill.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(87, 112).addBox(-6.0375F, -5.2302F, -0.2356F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6116F, -4.3834F, 2.0014F, -0.2302F, -0.2224F, -0.5846F));

		PartDefinition cube_r461 = leftFrill.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(7, 111).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9647F, -5.5764F, 2.4076F, -0.3045F, -0.0956F, -0.1245F));

		PartDefinition rightFrill = frill.addOrReplaceChild("rightFrill", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.471F, -5.1075F, 3.5343F, 0.1F, 0.3365F, -0.1941F));

		PartDefinition cube_r462 = rightFrill.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-1.175F, -1.825F, 0.35F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.314F, 4.2996F, -2.7953F, 0.2309F, 0.5132F, 1.2028F));

		PartDefinition cube_r463 = rightFrill.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(95, 4).mirror().addBox(-2.95F, -0.95F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4207F, -0.8718F, -0.3062F, -0.317F, -0.2903F, -1.4176F));

		PartDefinition cube_r464 = rightFrill.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(111, 103).mirror().addBox(-2.95F, -0.95F, -0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4207F, -0.8718F, -0.3062F, -0.1665F, -0.3945F, -1.8585F));

		PartDefinition cube_r465 = rightFrill.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(1.075F, -1.8F, -0.35F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1713F, -1.087F, 1.7277F, -0.5516F, 0.3067F, -0.3596F));

		PartDefinition cube_r466 = rightFrill.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(103, 23).mirror().addBox(-1.5F, 0.2F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1713F, -1.087F, 1.7277F, -0.5728F, -0.1182F, -1.0283F));

		PartDefinition cube_r467 = rightFrill.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(16, 111).mirror().addBox(-0.4306F, -4.4095F, -0.954F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.0131F, -4.0549F, 2.1857F, 0.4763F, -0.0676F, -3.0848F));

		PartDefinition cube_r468 = rightFrill.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(99, 116).mirror().addBox(0.0993F, -2.3836F, -0.954F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0131F, -4.0549F, 2.1857F, 0.4756F, 0.0732F, 2.9271F));

		PartDefinition cube_r469 = rightFrill.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-3.7F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7585F, -0.1313F, -0.5485F, 0.1019F, -0.4081F, -1.9015F));

		PartDefinition cube_r470 = rightFrill.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(78, 110).mirror().addBox(0.05F, -0.05F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.094F, 1.1891F, 1.1321F, -0.4129F, -0.3807F, -1.518F));

		PartDefinition cube_r471 = rightFrill.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(86, 102).mirror().addBox(-3.8731F, -0.5137F, 0.003F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.6653F, 3.7673F, -0.8306F, 0.2264F, -0.3744F, 3.0508F));

		PartDefinition cube_r472 = rightFrill.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(127, 82).mirror().addBox(-0.6319F, -0.5693F, -0.5125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.0705F, -2.1431F, 1.5279F, 1.3635F, 0.7514F, -1.3045F));

		PartDefinition cube_r473 = rightFrill.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(-0.4317F, -0.3675F, -0.4875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.0705F, -2.1431F, 1.5279F, 0.9119F, 1.3226F, -1.8058F));

		PartDefinition cube_r474 = rightFrill.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(127, 85).mirror().addBox(-0.7958F, -0.2797F, -0.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.0441F, -2.0444F, 1.6797F, 0.1612F, 0.6974F, -2.7692F));

		PartDefinition cube_r475 = rightFrill.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(127, 88).mirror().addBox(-0.7946F, -0.7106F, -0.3957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.0441F, -2.0444F, 1.6797F, 0.4289F, 0.4232F, -2.2192F));

		PartDefinition cube_r476 = rightFrill.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(127, 76).mirror().addBox(-0.2012F, -0.2544F, -0.4308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.4941F, -0.0444F, 1.4797F, 0.3582F, 0.3524F, -3.0483F));

		PartDefinition cube_r477 = rightFrill.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(49, 127).mirror().addBox(-0.6958F, -0.2797F, -0.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.4941F, -0.0444F, 1.4797F, 0.4558F, 0.1094F, 3.1333F));

		PartDefinition cube_r478 = rightFrill.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(127, 79).mirror().addBox(-0.3782F, -0.6089F, -0.4558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.4941F, -0.0444F, 1.4797F, 0.4888F, 0.0942F, -2.4784F));

		PartDefinition cube_r479 = rightFrill.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(44, 127).mirror().addBox(-0.8946F, -0.6105F, -0.3957F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-7.4941F, -0.0444F, 1.4797F, 0.3987F, -0.2209F, -2.7247F));

		PartDefinition cube_r480 = rightFrill.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(56, 125).mirror().addBox(-0.05F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(125, 39).mirror().addBox(-0.55F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-6.9303F, 1.7272F, 0.8162F, -0.376F, -0.3346F, -1.8526F));

		PartDefinition cube_r481 = rightFrill.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(131, 48).mirror().addBox(-0.35F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(13, 127).mirror().addBox(-0.65F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-6.547F, 3.0178F, 0.3442F, -0.3063F, -0.399F, -2.0465F));

		PartDefinition cube_r482 = rightFrill.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(28, 127).mirror().addBox(-0.125F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(127, 12).mirror().addBox(-0.525F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-5.9373F, 4.4434F, -0.2698F, -0.1538F, -0.4755F, -2.4031F));

		PartDefinition cube_r483 = rightFrill.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(18, 127).mirror().addBox(-1.0938F, -1.0602F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(61, 125).mirror().addBox(-1.7938F, -1.0602F, 0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.6653F, 3.7673F, -0.8306F, 0.2587F, -0.3535F, 2.9602F));

		PartDefinition cube_r484 = rightFrill.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(32, 111).mirror().addBox(-2.9087F, -0.426F, 0.0322F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.08F, 1.8785F, 0.195F, -0.2293F, -0.4175F, -2.1943F));

		PartDefinition cube_r485 = rightFrill.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(111, 111).mirror().addBox(0.037F, -0.0603F, 0.0322F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-6.8229F, 2.7928F, -0.1179F, -0.3155F, -0.3998F, -1.812F));

		PartDefinition cube_r486 = rightFrill.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(80, 106).mirror().addBox(-2.9416F, 0.0323F, -0.1807F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.7116F, -4.3834F, 2.2014F, -0.3672F, -0.1248F, -1.0797F));

		PartDefinition cube_r487 = rightFrill.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-0.0183F, -0.1131F, -0.0018F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.6116F, -4.3834F, 2.0014F, -0.3025F, -0.1087F, -0.6297F));

		PartDefinition cube_r488 = rightFrill.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(125, 3).mirror().addBox(-0.8055F, 0.5947F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.786F, 0.3632F, 0.1265F));

		PartDefinition cube_r489 = rightFrill.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(130, 105).mirror().addBox(-0.5846F, 0.2562F, 0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.1326F, 0.2459F, 0.0318F));

		PartDefinition cube_r490 = rightFrill.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(130, 111).mirror().addBox(-0.6307F, 1.2104F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 108).mirror().addBox(-0.3307F, 1.2104F, -0.5472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 3.0627F, 0.3281F, 0.0623F));

		PartDefinition cube_r491 = rightFrill.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(23, 131).mirror().addBox(-0.6307F, 0.2872F, -1.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -2.3827F, 0.3281F, 0.0623F));

		PartDefinition cube_r492 = rightFrill.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(131, 32).mirror().addBox(-0.1834F, -1.4725F, 0.169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(114, 66).mirror().addBox(-0.1834F, -1.4725F, -1.431F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -1.3684F, 0.3966F, -0.0522F));

		PartDefinition cube_r493 = rightFrill.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(131, 0).mirror().addBox(-0.2377F, 0.2671F, -1.9264F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -2.4067F, 0.3874F, -0.0061F));

		PartDefinition cube_r494 = rightFrill.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(49, 130).mirror().addBox(-0.4571F, 0.2476F, 0.9638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.1641F, 0.3922F, 0.1321F));

		PartDefinition cube_r495 = rightFrill.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(119, 48).mirror().addBox(-0.5884F, -0.3876F, 0.3786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.8186F, 0.3922F, 0.215F));

		PartDefinition cube_r496 = rightFrill.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(5, 130).mirror().addBox(-1.301F, 1.0539F, -1.1219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -2.7107F, 0.2214F, -0.152F));

		PartDefinition cube_r497 = rightFrill.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(0, 115).mirror().addBox(-1.3594F, -1.2745F, 0.3786F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.7095F, 0.2655F, -0.1192F));

		PartDefinition cube_r498 = rightFrill.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(124, 31).mirror().addBox(0.5012F, -1.1218F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -2.7708F, 0.3476F, 1.7854F));

		PartDefinition cube_r499 = rightFrill.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(124, 70).mirror().addBox(-0.5418F, -1.5153F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(124, 47).mirror().addBox(-0.5418F, -0.9153F, 0.3786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.9557F, 0.4698F, 0.5405F));

		PartDefinition cube_r500 = rightFrill.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(56, 119).mirror().addBox(-0.8782F, -0.3262F, 0.3786F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 2.6953F, 0.2395F, -0.1763F));

		PartDefinition cube_r501 = rightFrill.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(13, 130).mirror().addBox(-0.9294F, 1.013F, -1.139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -2.6705F, 0.1922F, -0.0495F));

		PartDefinition cube_r502 = rightFrill.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(114, 62).mirror().addBox(-1.328F, -1.4577F, 0.4671F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 0.2278F, 0.1811F, 0.036F));

		PartDefinition cube_r503 = rightFrill.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(122, 92).mirror().addBox(-1.4873F, -1.3633F, 0.5921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, 0.2264F, 0.0438F, 0.049F));

		PartDefinition cube_r504 = rightFrill.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(44, 130).mirror().addBox(-1.203F, -2.0845F, -1.2797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -0.8353F, 0.0914F, -0.1644F));

		PartDefinition cube_r505 = rightFrill.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(130, 37).mirror().addBox(-1.1558F, -0.6197F, -2.3393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -1.6776F, 0.2176F, -0.2279F));

		PartDefinition cube_r506 = rightFrill.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(18, 130).mirror().addBox(-0.9575F, -0.6197F, -2.2321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -1.6335F, 0.2339F, -0.0316F));

		PartDefinition cube_r507 = rightFrill.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(28, 130).mirror().addBox(-0.9575F, -1.9818F, -1.2635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3572F, -6.1933F, 1.4952F, -0.8045F, 0.2339F, -0.0316F));

		PartDefinition cube_r508 = rightFrill.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(119, 23).mirror().addBox(-0.525F, -0.5216F, -0.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1725F, -6.742F, 2.4281F, 0.1272F, -0.3689F, -0.3242F));

		PartDefinition cube_r509 = rightFrill.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(126, 128).mirror().addBox(-0.5F, -0.7798F, -0.7823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1725F, -6.742F, 2.4281F, -0.809F, -0.3534F, -0.416F));

		PartDefinition cube_r510 = rightFrill.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(129, 21).mirror().addBox(-0.5F, -0.1337F, -1.019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1725F, -6.742F, 2.4281F, -1.6729F, -0.3534F, -0.416F));

		PartDefinition cube_r511 = rightFrill.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(119, 70).mirror().addBox(-1.1F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(119, 31).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3329F, -7.3839F, 2.9925F, 0.0539F, -0.0425F, -0.2475F));

		PartDefinition cube_r512 = rightFrill.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(33, 131).mirror().addBox(-0.7065F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(129, 29).mirror().addBox(-0.1065F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5758F, -7.0072F, 1.8904F, -0.8886F, -0.0599F, -0.2484F));

		PartDefinition cube_r513 = rightFrill.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(38, 131).mirror().addBox(-0.7065F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(129, 45).mirror().addBox(-0.1065F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5758F, -7.0072F, 1.8904F, -1.7176F, -0.0599F, -0.2484F));

		PartDefinition cube_r514 = rightFrill.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(129, 62).mirror().addBox(-0.7926F, -0.6318F, -0.3295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, -7.7822F, 1.9904F, -2.7512F, 0.0585F, -0.1961F));

		PartDefinition cube_r515 = rightFrill.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(129, 70).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7483F, -7.4582F, 1.925F, -2.7497F, -0.1029F, -0.2625F));

		PartDefinition cube_r516 = rightFrill.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(122, 84).mirror().addBox(-1.5566F, -1.8778F, -0.385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, -7.7822F, 1.9904F, 2.6539F, -0.0631F, -0.3895F));

		PartDefinition cube_r517 = rightFrill.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(81, 125).mirror().addBox(-0.8F, -0.7875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(86, 125).mirror().addBox(-0.8F, -1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9821F, -6.5194F, 1.1952F, 2.7541F, 0.3103F, 0.3712F));

		PartDefinition cube_r518 = rightFrill.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(122, 88).mirror().addBox(-0.15F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-3.0614F, -5.8007F, 0.9793F, 2.6512F, -0.0344F, -0.3355F));

		PartDefinition cube_r519 = rightFrill.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(129, 114).mirror().addBox(-1.7876F, -0.5483F, -0.4301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, -7.7822F, 1.9904F, -2.7594F, -0.0801F, -0.3649F));

		PartDefinition cube_r520 = rightFrill.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(119, 129).mirror().addBox(-0.7712F, -1.0906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 130).mirror().addBox(-0.7712F, -1.6906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(130, 3).mirror().addBox(-0.9712F, -1.0906F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-2.0758F, -7.7822F, 1.9904F, 2.6569F, 0.0846F, -0.1119F));

		PartDefinition cube_r521 = rightFrill.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(128, 53).mirror().addBox(-0.3442F, -0.4231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false)
				.texOffs(54, 128).mirror().addBox(-0.1442F, -0.6231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(128, 56).mirror().addBox(-0.1442F, -0.4231F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, 2.6768F, -0.0359F, -0.6874F));

		PartDefinition cube_r522 = rightFrill.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(0, 124).mirror().addBox(-0.4565F, 0.2691F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(121, 123).mirror().addBox(-0.4565F, -0.3309F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(124, 23).mirror().addBox(-0.1065F, 0.2691F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(80, 103).mirror().addBox(-0.1065F, -0.3309F, 0.3151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, 0.1586F, -0.0599F, -0.772F));

		PartDefinition cube_r523 = rightFrill.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(104, 128).mirror().addBox(-0.4565F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 128).mirror().addBox(-0.1065F, -1.2312F, -0.3558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -0.8886F, -0.0599F, -0.772F));

		PartDefinition cube_r524 = rightFrill.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(69, 131).mirror().addBox(-0.8948F, -0.3477F, 0.3444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(131, 65).mirror().addBox(-0.8948F, 0.2523F, 0.3444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, 0.1482F, -0.1635F, -0.7565F));

		PartDefinition cube_r525 = rightFrill.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(114, 128).mirror().addBox(-0.8948F, -1.2446F, -0.3097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -0.8554F, -0.1635F, -0.7565F));

		PartDefinition cube_r526 = rightFrill.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(109, 128).mirror().addBox(-0.8948F, -0.795F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -1.7193F, -0.1635F, -0.7565F));

		PartDefinition cube_r527 = rightFrill.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(99, 128).mirror().addBox(-0.3565F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(89, 128).mirror().addBox(-0.1065F, -0.7818F, -1.0655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -1.7176F, -0.0599F, -0.772F));

		PartDefinition cube_r528 = rightFrill.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(84, 128).mirror().addBox(-0.1065F, -0.0602F, -0.6497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(79, 128).mirror().addBox(-0.3315F, -0.0602F, -0.6497F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -2.7212F, -0.0599F, -0.772F));

		PartDefinition cube_r529 = rightFrill.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(59, 128).mirror().addBox(-0.773F, -0.0515F, -0.6529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, -2.7091F, -0.1917F, -0.9477F));

		PartDefinition cube_r530 = rightFrill.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(128, 59).mirror().addBox(-0.754F, -0.4118F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(74, 128).mirror().addBox(-0.754F, -0.7617F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, 2.7068F, -0.1734F, -0.9717F));

		PartDefinition cube_r531 = rightFrill.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(64, 128).mirror().addBox(-0.0257F, -0.9776F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(69, 128).mirror().addBox(-0.0257F, -0.7026F, -0.1371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.5758F, -5.5072F, 1.6904F, 2.7526F, 0.2635F, -0.05F));

		PartDefinition cube_r532 = rightFrill.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(127, 97).mirror().addBox(-0.1309F, -0.8984F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(127, 94).mirror().addBox(-0.1309F, -0.6234F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-6.6777F, -3.9563F, 1.5702F, 1.7767F, 0.6912F, -0.8332F));

		PartDefinition cube_r533 = rightFrill.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(33, 128).mirror().addBox(-0.1739F, -0.4948F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.6777F, -3.9563F, 1.5702F, 1.729F, 0.0036F, -0.965F));

		PartDefinition cube_r534 = rightFrill.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(128, 42).mirror().addBox(-0.3415F, -1.3123F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(128, 26).mirror().addBox(-0.1415F, -1.3123F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-6.0777F, -3.5063F, 2.7202F, 1.729F, 0.0036F, -0.965F));

		PartDefinition cube_r535 = rightFrill.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(59, 131).mirror().addBox(-1.0262F, -0.8265F, -0.3726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 125).mirror().addBox(-1.0262F, -0.8265F, 0.2274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.0777F, -3.5063F, 2.7202F, 2.1731F, -0.3066F, -1.0161F));

		PartDefinition cube_r536 = rightFrill.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(128, 18).mirror().addBox(-0.4419F, -0.8401F, -0.3379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.0777F, -3.5063F, 2.7202F, 2.1994F, -0.0508F, -0.78F));

		PartDefinition cube_r537 = rightFrill.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(64, 131).mirror().addBox(-0.0827F, -0.8401F, -0.3489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(128, 15).mirror().addBox(-0.0827F, -0.8401F, 0.2511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 102).mirror().addBox(-0.3327F, -0.8401F, 0.2511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-6.0777F, -3.5063F, 2.7202F, 2.197F, 0.0776F, -0.9566F));

		PartDefinition cube_r538 = rightFrill.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(71, 125).mirror().addBox(-1.0262F, -1.2582F, 0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-6.0777F, -3.5063F, 2.7202F, 1.7368F, -0.3066F, -1.0161F));

		PartDefinition cube_r539 = rightFrill.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(127, 91).mirror().addBox(-0.7426F, -0.6305F, -0.8013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-6.6777F, -3.9563F, 1.5702F, 1.7368F, -0.3066F, -1.0161F));

		PartDefinition cube_r540 = rightFrill.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(87, 112).mirror().addBox(4.0375F, -5.2302F, -0.2356F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6116F, -4.3834F, 2.0014F, -0.2302F, 0.2224F, 0.5846F));

		PartDefinition cube_r541 = rightFrill.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(7, 111).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9647F, -5.5764F, 2.4076F, -0.3045F, 0.0956F, 0.1245F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 2.9693F, -0.5023F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r542 = jaw.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(53, 121).mirror().addBox(-0.5019F, 0.8459F, -1.0394F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.6547F, -1.8973F, -1.0419F, -0.0881F, -0.138F));

		PartDefinition cube_r543 = jaw.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(99, 112).mirror().addBox(-0.5071F, 6.0237F, -3.3232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.6547F, -1.8973F, -0.5701F, -0.1153F, -0.0907F));

		PartDefinition cube_r544 = jaw.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(116, 125).mirror().addBox(-0.5653F, 5.8012F, 1.0186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.6547F, -1.8973F, -1.217F, -0.13F, -0.0812F));

		PartDefinition cube_r545 = jaw.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(94, 112).mirror().addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0072F, 4.7062F, -6.4228F, -0.911F, -0.0881F, -0.138F));

		PartDefinition cube_r546 = jaw.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(50, 109).mirror().addBox(-0.35F, -0.8F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2803F, 3.8679F, -6.319F, -0.7398F, -0.1224F, -0.2016F));

		PartDefinition cube_r547 = jaw.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(121, 66).mirror().addBox(-0.9373F, -1.9048F, -1.7395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9914F, 1.7547F, -0.5973F, -1.3496F, -0.3996F, -0.3071F));

		PartDefinition cube_r548 = jaw.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(111, 116).mirror().addBox(-0.9336F, -2.8546F, -0.8172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9914F, 1.7547F, -0.5973F, -1.0148F, -0.417F, -0.2867F));

		PartDefinition cube_r549 = jaw.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(27, 108).mirror().addBox(-0.5F, 1.3F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.41F, 1.5275F, 0.2572F, -1.1F, -0.1418F, -0.1368F));

		PartDefinition cube_r550 = jaw.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-0.7338F, -0.9982F, -0.413F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9164F, 0.6547F, -1.8973F, -1.0642F, -0.0855F, -0.1974F));

		PartDefinition cube_r551 = jaw.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(-0.8206F, -4.1324F, -0.3663F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.9914F, 1.7547F, -0.5973F, 0.7958F, -0.34F, -0.3682F));

		PartDefinition cube_r552 = jaw.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(21, 112).mirror().addBox(-0.8206F, -3.8327F, 1.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9914F, 1.7547F, -0.5973F, 1.1623F, -0.34F, -0.3682F));

		PartDefinition cube_r553 = jaw.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(53, 121).addBox(0.5019F, 0.8459F, -1.0394F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 0.6547F, -1.8973F, -1.0419F, 0.0881F, 0.138F));

		PartDefinition cube_r554 = jaw.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(99, 112).addBox(-0.4929F, 6.0237F, -3.3232F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 0.6547F, -1.8973F, -0.5701F, 0.1153F, 0.0907F));

		PartDefinition cube_r555 = jaw.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(116, 125).addBox(-0.4347F, 5.8012F, 1.0186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7165F, 0.6547F, -1.8973F, -1.217F, 0.13F, 0.0812F));

		PartDefinition cube_r556 = jaw.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(94, 112).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1927F, 4.7062F, -6.4228F, -0.911F, 0.0881F, 0.138F));

		PartDefinition cube_r557 = jaw.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(50, 109).addBox(-0.65F, -0.8F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0804F, 3.8679F, -6.319F, -0.7398F, 0.1224F, 0.2016F));

		PartDefinition cube_r558 = jaw.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(121, 66).addBox(-0.0627F, -1.9048F, -1.7395F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7915F, 1.7547F, -0.5973F, -1.3496F, 0.3996F, 0.3071F));

		PartDefinition cube_r559 = jaw.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(111, 116).addBox(-0.0664F, -2.8546F, -0.8172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7915F, 1.7547F, -0.5973F, -1.0148F, 0.417F, 0.2867F));

		PartDefinition cube_r560 = jaw.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(27, 108).addBox(-0.5F, 1.3F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.21F, 1.5275F, 0.2572F, -1.1F, 0.1418F, 0.1368F));

		PartDefinition cube_r561 = jaw.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(50, 100).addBox(-0.2662F, -0.9982F, -0.413F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.7165F, 0.6547F, -1.8973F, -1.0642F, 0.0855F, 0.1974F));

		PartDefinition cube_r562 = jaw.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(112, 88).addBox(-0.1794F, -4.1324F, -0.3663F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.7915F, 1.7547F, -0.5973F, 0.7958F, 0.34F, 0.3682F));

		PartDefinition cube_r563 = jaw.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(21, 112).addBox(-0.1794F, -3.8327F, 1.0833F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7915F, 1.7547F, -0.5973F, 1.1623F, 0.34F, 0.3682F));

		PartDefinition leftLowerbeak = jaw.addOrReplaceChild("leftLowerbeak", CubeListBuilder.create(), PartPose.offset(-0.0033F, 5.0221F, -9.3912F));

		PartDefinition cube_r564 = leftLowerbeak.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(96, 121).mirror().addBox(0.1576F, 0.0697F, 0.4888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -2.2515F, -0.0873F, 0.0F));

		PartDefinition cube_r565 = leftLowerbeak.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(91, 121).mirror().addBox(0.1576F, -1.5701F, 0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.0123F, -0.0873F, 0.0F));

		PartDefinition cube_r566 = leftLowerbeak.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(86, 121).mirror().addBox(0.1576F, -0.9608F, -0.2044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.4661F, -0.0873F, 0.0F));

		PartDefinition cube_r567 = leftLowerbeak.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(81, 121).mirror().addBox(0.1576F, 0.3648F, -0.0388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.9548F, -0.0873F, 0.0F));

		PartDefinition cube_r568 = leftLowerbeak.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(76, 121).mirror().addBox(0.1576F, -1.0144F, 0.0819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.8326F, -0.0873F, 0.0F));

		PartDefinition cube_r569 = leftLowerbeak.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(71, 121).mirror().addBox(0.1565F, -2.5174F, 0.3571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3881F, -0.2786F, -0.0682F, -1.4681F, -0.0343F, 0.0455F));

		PartDefinition cube_r570 = leftLowerbeak.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(96, 121).addBox(-1.1576F, 0.0697F, 0.4888F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -2.2515F, 0.0873F, 0.0F));

		PartDefinition cube_r571 = leftLowerbeak.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(91, 121).addBox(-1.1576F, -1.5701F, 0.1422F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.0123F, 0.0873F, 0.0F));

		PartDefinition cube_r572 = leftLowerbeak.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(86, 121).addBox(-1.1576F, -0.9608F, -0.2044F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4661F, 0.0873F, 0.0F));

		PartDefinition cube_r573 = leftLowerbeak.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(81, 121).addBox(-1.1576F, 0.3648F, -0.0388F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.9548F, 0.0873F, 0.0F));

		PartDefinition cube_r574 = leftLowerbeak.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(76, 121).addBox(-1.1576F, -1.0144F, 0.0819F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.8326F, 0.0873F, 0.0F));

		PartDefinition cube_r575 = leftLowerbeak.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(71, 121).addBox(-1.1565F, -2.5174F, 0.3571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1947F, -0.2786F, -0.0682F, -1.4681F, 0.0343F, -0.0455F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 63).addBox(-1.0F, -0.1961F, 0.0069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.004F))
				.texOffs(72, 41).addBox(1.0F, 0.8039F, 0.0069F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(72, 41).mirror().addBox(-3.0F, 0.8039F, 0.0069F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1323F, 4.291F, -0.2628F, 0.0843F, -0.0226F));

		PartDefinition cube_r576 = tail.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(38, 126).addBox(0.0F, -2.1473F, -0.0968F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2081F, 4.2394F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r577 = tail.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(25, 126).addBox(0.0F, -4.582F, 1.192F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r578 = tail.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(10, 126).addBox(0.0F, -4.582F, -0.808F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7357F, 0.4245F, -0.1222F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -0.4627F, -0.1225F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2361F, 4.9961F, -0.1264F, 0.2598F, -0.0326F));

		PartDefinition cube_r579 = tail2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(18, 107).addBox(0.0F, -1.8408F, 0.008F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.514F, 4.9274F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r580 = tail2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(126, 114).addBox(0.0F, -2.0443F, 0.0821F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.514F, 2.8274F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r581 = tail2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(126, 62).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.178F, 5.5842F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r582 = tail2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(93, 19).addBox(0.0F, 0.7024F, 4.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2539F, -2.2269F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r583 = tail2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(41, 126).addBox(0.0F, -2.2547F, 0.0262F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.314F, 0.8274F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r584 = tail2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(72, 35).mirror().addBox(-1.4F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.5373F, 3.3775F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r585 = tail2.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(72, 35).addBox(-0.6F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.5373F, 3.3775F, 0.0F, -0.0873F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(13, 58).addBox(-0.5F, -1.1697F, -0.1085F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.707F, 5.786F, 0.0467F, 0.2608F, 0.0233F));

		PartDefinition cube_r586 = tail3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(80, 131).addBox(0.0F, -3.7294F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 131).addBox(0.0F, -3.4294F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r587 = tail3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(10, 131).addBox(0.0F, -0.8F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7414F, 3.9485F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r588 = tail3.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(68, 80).addBox(0.0F, -1.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4635F, 2.0807F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r589 = tail3.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(74, 131).addBox(0.0F, -1.6297F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r590 = tail3.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(71, 72).mirror().addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.1697F, 3.3915F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r591 = tail3.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(71, 72).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1697F, 3.3915F, 0.0F, -0.1309F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(65, 15).addBox(-0.5F, -1.1697F, -0.1085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, -0.0481F, 0.2598F, 0.0326F));

		PartDefinition cube_r592 = tail4.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(89, 131).addBox(0.0F, -3.8544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 131).addBox(0.0F, -3.5544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r593 = tail4.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(83, 131).addBox(0.0F, -1.4547F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r594 = tail4.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(116, 131).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7084F, 4.9614F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r595 = tail4.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(107, 131).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1636F, 2.8559F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r596 = tail4.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(104, 131).addBox(0.0F, 0.9F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7414F, -1.9515F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(66, 48).addBox(-0.5F, -1.1697F, -0.1085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.05F, 6.05F, 0.1469F, 0.3367F, 0.0939F));

		PartDefinition cube_r597 = tail5.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(98, 131).addBox(0.0F, -3.7544F, 3.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 131).addBox(0.0F, -3.4544F, 1.2508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7791F, 1.3414F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r598 = tail5.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(92, 131).addBox(0.0F, -1.4547F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0209F, 0.8414F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r599 = tail5.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(131, 120).addBox(0.0F, 2.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 117).addBox(0.0F, 1.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 126).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1215F, 0.9691F, 0.5498F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(66, 56).addBox(-0.5F, -0.447F, -0.0205F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.725F, 5.8F, -0.0196F, 0.2569F, 0.0511F));

		PartDefinition cube_r600 = tail6.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(131, 73).addBox(0.0F, -3.2544F, 3.2508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 111).addBox(0.0F, -3.0294F, 1.2508F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5017F, 1.4294F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r601 = tail6.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(101, 131).addBox(0.0F, -1.3548F, 0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2983F, 0.9294F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r602 = tail6.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(124, 131).addBox(0.0F, 0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 123).addBox(0.0F, 0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0716F, 1.6435F, 0.3316F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(94, 66).addBox(-0.5F, -0.447F, -0.0205F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.007F, 5.9505F, 0.143F, 0.216F, 0.0308F));

		PartDefinition cube_r603 = tail7.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(113, 131).addBox(0.0F, -0.7547F, 0.0262F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2983F, 0.9294F, -0.2443F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(80, 9).addBox(-0.5F, -0.447F, -0.0205F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0315F, 3.8443F, -0.3514F, 0.2465F, -0.0892F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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