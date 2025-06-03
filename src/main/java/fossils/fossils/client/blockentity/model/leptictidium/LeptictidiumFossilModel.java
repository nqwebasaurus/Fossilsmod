package fossils.fossils.client.blockentity.model.leptictidium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LeptictidiumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart bone4;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart bone3;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart leftMaxilla;
	private final ModelPart rightMaxilla;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public LeptictidiumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.leftLeg1 = this.bone.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.bone4 = this.hips.getChild("bone4");
		this.rightLeg1 = this.bone4.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.body2 = this.hips.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body4 = this.body.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.leftArm1 = this.bone2.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.bone3 = this.chest.getChild("bone3");
		this.rightArm1 = this.bone3.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftZygomaticarch = this.head.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.head.getChild("rightZygomaticarch");
		this.leftMaxilla = this.head.getChild("leftMaxilla");
		this.rightMaxilla = this.head.getChild("rightMaxilla");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.7683F, 1.7233F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 32).addBox(0.0F, -0.5F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 44).addBox(0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 21).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-0.5F, 0.4F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.934F, -0.6604F, -0.1707F, -0.0882F, -0.4724F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 18).addBox(-0.5F, 0.4F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.934F, -0.6604F, -0.1707F, 0.0882F, 0.4724F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.95F, 1.0641F, -1.7334F));

		PartDefinition basin_r1 = bone.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(22, 26).addBox(-0.5064F, -0.5106F, -3.3533F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.3327F, -0.0774F, 0.4815F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(46, 3).addBox(-0.5064F, -0.8014F, 0.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.9959F, -0.0774F, 0.4815F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(45, 26).addBox(-0.4936F, -0.1842F, -0.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.9087F, -0.0774F, 0.4815F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(7, 35).addBox(-0.5044F, -0.3306F, -0.9776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.7778F, -0.0774F, 0.4815F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(46, 15).addBox(-0.5064F, -0.9107F, 1.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.6076F, -0.0774F, 0.4815F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(46, 6).addBox(-0.5064F, 0.0918F, 1.159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 46).addBox(-0.5064F, 0.0918F, 0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, 0.1342F, -0.0774F, 0.4815F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5064F, -0.7995F, -0.6116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, -0.5203F, -0.0774F, 0.4815F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5064F, -0.9775F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1564F, -1.051F, 0.7845F, 0.2127F, -0.0774F, 0.4815F));

		PartDefinition leftLeg1 = bone.addOrReplaceChild("leftLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.65F, -0.7548F, 1.3061F, -1.1551F, -0.3634F, -0.0493F));

		PartDefinition cube_r4 = leftLeg1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 21).addBox(-0.5F, -0.875F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 46).addBox(-0.5F, -0.1898F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 49).addBox(-0.5F, -0.8562F, -0.8226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 4.4507F, 0.3941F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 49).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0F, 3.9507F, 0.1941F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(47, 41).addBox(-0.5F, 2.0894F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(49, 12).addBox(-0.5F, 2.0894F, -0.7124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, 0.4536F, -0.2937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 43).addBox(-0.5F, 1.1871F, -2.2673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 2.3506F, -0.4408F, 1.1083F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(27, 43).addBox(-0.5F, 5.3946F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 43).addBox(-0.5F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.8903F, 0.6626F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 27).addBox(-1.1F, -4.5F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(5, 44).addBox(-1.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.9F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(22, 21).addBox(-0.9F, -0.2704F, -3.0543F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 6.2776F, 0.1161F, 0.6985F, 0.0167F, 0.0403F));

		PartDefinition cube_r14 = leftFoot.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(21, 31).addBox(-1.9F, -0.85F, -0.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, 0.5796F, -0.2043F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(0, 26).addBox(-1.4F, -0.5F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.2296F, -2.9543F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.95F, 1.0641F, -1.7334F));

		PartDefinition basin_r9 = bone4.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(0.0087F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0587F, -0.432F, 1.2312F, 0.3134F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone4.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-0.4936F, -0.5106F, -3.3533F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.3327F, 0.0774F, -0.4815F));

		PartDefinition basin_r11 = bone4.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(46, 3).mirror().addBox(-0.4936F, -0.8014F, 0.0905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.9959F, 0.0774F, -0.4815F));

		PartDefinition basin_r12 = bone4.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-0.5064F, -0.1842F, -0.656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.9087F, 0.0774F, -0.4815F));

		PartDefinition basin_r13 = bone4.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(7, 35).mirror().addBox(-0.4956F, -0.3306F, -0.9776F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.7778F, 0.0774F, -0.4815F));

		PartDefinition basin_r14 = bone4.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(46, 15).mirror().addBox(-0.4936F, -0.9107F, 1.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.6076F, 0.0774F, -0.4815F));

		PartDefinition basin_r15 = bone4.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(46, 6).mirror().addBox(-0.4936F, 0.0918F, 1.159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(32, 46).mirror().addBox(-0.4936F, 0.0918F, 0.859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, 0.1342F, 0.0774F, -0.4815F));

		PartDefinition basin_r16 = bone4.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.4936F, -0.7995F, -0.6116F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, -0.5203F, 0.0774F, -0.4815F));

		PartDefinition basin_r17 = bone4.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.4936F, -0.9775F, -0.7526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1564F, -1.051F, 0.7845F, 0.2127F, 0.0774F, -0.4815F));

		PartDefinition rightLeg1 = bone4.addOrReplaceChild("rightLeg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.65F, -0.7548F, 1.3061F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r15 = rightLeg1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(47, 21).mirror().addBox(-0.5F, -0.875F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightLeg1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 46).mirror().addBox(-0.5F, -0.1898F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightLeg1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(29, 39).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5045F, -0.5429F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = rightLeg1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 49).mirror().addBox(-0.5F, -0.8562F, -0.8226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4507F, 0.3941F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r19 = rightLeg1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 49).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.9507F, 0.1941F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightLeg1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-0.5F, 2.0894F, -0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(49, 12).mirror().addBox(-0.5F, 2.0894F, -0.7124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r21 = rightLeg1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 39).mirror().addBox(-0.5F, 0.4536F, -0.2937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4006F, -0.4158F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightLeg1.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 43).mirror().addBox(-0.5F, 1.1871F, -2.2673F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3506F, -0.4408F, 1.1083F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(11, 27).mirror().addBox(-0.5F, -0.0054F, -0.022F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(27, 43).mirror().addBox(-0.5F, 5.3946F, -0.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(37, 43).mirror().addBox(-0.5F, -0.0054F, -0.422F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8903F, 0.6626F, 2.1904F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 27).mirror().addBox(0.1F, -4.5F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.4946F, 0.478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(0.4F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.8446F, -0.272F, 0.576F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(22, 21).mirror().addBox(-1.1F, -0.2704F, -3.0543F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2776F, 0.1161F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightFoot.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 31).mirror().addBox(-0.1F, -0.85F, -0.15F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5796F, -0.2043F, 0.2618F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.6F, -0.5F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2296F, -2.9543F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body2 = hips.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5075F, -1.9306F, 0.2466F, -0.2967F, -0.0735F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(37, 52).addBox(-0.5F, -0.8478F, 2.989F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 52).addBox(-0.5F, -0.7478F, 0.989F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.828F, -3.9592F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.6F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1146F, -0.5649F, -0.1698F, -0.3876F, 0.0647F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1982F, -2.5403F, -0.1608F, -0.2154F, 0.0347F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 52).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1146F, -0.5649F, -0.1698F, 0.3876F, -0.0647F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(50, 27).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1982F, -2.5403F, -0.1608F, 0.2154F, -0.0347F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.828F, -3.9592F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.628F, -3.9592F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(52, 41).addBox(-0.5F, -0.7555F, 0.9522F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0607F, -1.9509F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2607F, -0.5509F, 0.1584F, 0.1293F, 0.0206F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 39).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2607F, -0.5509F, 0.1584F, -0.1293F, -0.0206F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(32, 12).addBox(-1.0F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2607F, -0.5509F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body4 = body.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.4789F, -1.8632F, 0.2803F, -0.0839F, -0.0241F));

		PartDefinition cube_r36 = body4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 20).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.2332F, -0.7027F, 0.1744F, 0.0453F, -0.7236F));

		PartDefinition cube_r37 = body4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(40, 19).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -0.2332F, -0.7027F, 0.1301F, 0.1427F, -1.1869F));

		PartDefinition cube_r38 = body4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(52, 20).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.2332F, -0.7027F, 0.1744F, -0.0453F, 0.7236F));

		PartDefinition cube_r39 = body4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 19).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.2332F, -0.7027F, 0.1301F, -0.1427F, 1.1869F));

		PartDefinition cube_r40 = body4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 52).addBox(-0.5F, -0.5959F, 0.9891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 35).addBox(-1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0978F, -1.7623F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 52).addBox(0.0F, -2.4046F, 5.6654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.178F, -6.6456F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 52).addBox(0.0F, -1.3046F, 1.7654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.578F, -4.6456F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 24).mirror().addBox(-2.2634F, 0.0733F, -0.2891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5526F, 3.4486F, -0.9352F, 0.3793F, 0.3048F, 0.7153F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(17, 39).mirror().addBox(-1.6F, 0.2779F, -0.0356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4753F, -1.9633F, 0.3241F, -0.1067F, 0.3609F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.569F, -2.5404F, 0.3521F, 0.1735F, -0.7914F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.569F, -2.5404F, 0.2343F, 0.3361F, -1.2493F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(39, 17).mirror().addBox(-2.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.031F, -0.9404F, 0.1914F, 0.2591F, -1.0874F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(20, 52).mirror().addBox(-1.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.031F, -0.9404F, 0.2804F, 0.1226F, -0.6274F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(33, 24).addBox(-0.7366F, 0.0733F, -0.2891F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5526F, 3.4486F, -0.9352F, 0.3793F, -0.3048F, -0.7153F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(17, 39).addBox(-0.4F, 0.2779F, -0.0356F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4753F, -1.9633F, 0.3241F, 0.1067F, -0.3609F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 30).addBox(-0.5F, -1.0209F, -0.0704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 3.9753F, -1.9633F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(35, 35).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6753F, -2.4633F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(40, 21).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.569F, -2.5404F, 0.2343F, -0.3361F, 1.2493F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 22).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.569F, -2.5404F, 0.3521F, -0.1735F, 0.7914F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(20, 52).addBox(0.0246F, 0.0542F, -0.3612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.031F, -0.9404F, 0.2804F, -0.1226F, 0.6274F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(39, 17).addBox(0.9408F, -0.417F, -0.3859F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.031F, -0.9404F, 0.1914F, -0.2591F, 1.0874F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(32, 8).addBox(-0.5F, -0.0814F, 2.0405F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.778F, -4.0456F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(31, 26).addBox(-0.5F, -0.8747F, 2.0866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.778F, -5.2456F, 0.4887F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.8806F, 0.628F, -2.5068F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(21, 35).addBox(-1.0276F, -0.4896F, -2.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6024F, 0.3458F, -0.2728F));

		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5857F, -0.196F, -1.7896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7073F, 0.3993F, -0.2246F));

		PartDefinition cube_r62 = bone2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(14, 35).addBox(-0.6023F, 0.0645F, 0.0587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.8241F, 0.8884F, -1.6122F, 0.8555F, 0.3458F, -0.2728F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 33).addBox(-0.5F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5854F, 0.0128F, -0.0177F, -0.0957F, 0.3458F, -0.2728F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(39, 39).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.187F, 0.1983F, 0.9084F, -1.1691F, 0.3458F, -0.2728F));

		PartDefinition leftArm1 = bone2.addOrReplaceChild("leftArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3643F, 1.9547F, -1.2685F, 1.3785F, 0.3187F, -0.1359F));

		PartDefinition cube_r65 = leftArm1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(37, 46).addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r66 = leftArm1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(47, 18).addBox(-0.5F, 0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 47).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0059F, 0.4353F, -0.1475F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r67 = leftArm1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(24, 39).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(12, 39).addBox(-0.45F, -0.2023F, -0.572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(44, 12).addBox(-0.45F, 1.0977F, -0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0101F, 1.7862F, -1.3343F, -2.3566F, 0.0387F, -0.0202F));

		PartDefinition cube_r68 = leftArm2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(39, 13).addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.05F, 1.6595F, 0.2309F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = leftArm2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(44, 38).addBox(-0.5F, -1.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(44, 30).addBox(-0.5F, -0.8F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(0, 46).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.05F, 0.3722F, 0.274F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(22, 46).addBox(-0.9841F, 0.0496F, -0.1032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2214F, 1.7967F, -0.315F, 0.0584F, -0.1042F, 0.449F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.8806F, 0.628F, -2.5068F));

		PartDefinition cube_r70 = bone3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(21, 35).mirror().addBox(0.0276F, -0.4896F, -2.0192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6024F, -0.3458F, 0.2728F));

		PartDefinition cube_r71 = bone3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.4143F, -0.196F, -1.7896F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7073F, -0.3993F, 0.2246F));

		PartDefinition cube_r72 = bone3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(14, 35).mirror().addBox(-0.3977F, 0.0645F, 0.0587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.8241F, 0.8884F, -1.6122F, 0.8555F, -0.3458F, 0.2728F));

		PartDefinition cube_r73 = bone3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 33).mirror().addBox(-0.5F, -0.7F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5854F, 0.0128F, -0.0177F, -0.0957F, -0.3458F, 0.2728F));

		PartDefinition cube_r74 = bone3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(39, 39).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.187F, 0.1983F, 0.9084F, -1.1691F, -0.3458F, 0.2728F));

		PartDefinition rightArm1 = bone3.addOrReplaceChild("rightArm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3643F, 1.9547F, -1.2685F, 1.6839F, -0.3187F, 0.1359F));

		PartDefinition cube_r75 = rightArm1.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(37, 46).mirror().addBox(-0.5F, -0.575F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.0029F, 0.1845F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r76 = rightArm1.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-0.5F, 0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 47).mirror().addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.4353F, -0.1475F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r77 = rightArm1.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0059F, 0.4353F, -0.1475F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(12, 39).mirror().addBox(-0.55F, -0.2023F, -0.572F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 12).mirror().addBox(-0.55F, 1.0977F, -0.572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0101F, 1.7862F, -1.3343F, -2.3566F, -0.0387F, 0.0202F));

		PartDefinition cube_r78 = rightArm2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 13).mirror().addBox(-0.5F, -1.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.05F, 1.6595F, 0.2309F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r79 = rightArm2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-0.5F, -1.1F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(44, 30).mirror().addBox(-0.5F, -0.8F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(0, 46).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.05F, 0.3722F, 0.274F, -0.1134F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(-0.0159F, 0.0496F, -0.1032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2214F, 1.7967F, -0.315F, 0.0938F, 0.074F, -0.0559F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0159F, 0.7712F, -0.0055F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3046F, -3.4131F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(52, 47).addBox(0.0F, -0.4692F, -1.006F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.1F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(30, 31).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.7F, 0.2269F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3992F, -1.597F, -0.4544F, -0.2532F, -0.0195F));

		PartDefinition cube_r82 = neck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(25, 52).addBox(0.0F, -0.8F, 1.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-0.5F, -0.5F, 0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -2.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(39, 0).addBox(-1.0F, -0.7048F, -0.2752F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2827F, -1.4733F, 1.0893F, -0.2366F, -0.4216F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(39, 3).addBox(-1.5F, 0.0015F, 0.0651F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6255F, -0.1868F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(39, 6).addBox(-1.0F, -0.775F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0702F, -0.0752F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(32, 4).addBox(-0.5F, -0.2F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9151F, -1.0461F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(27, 46).addBox(-0.5F, -0.2F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2982F, -5.0692F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(51, 3).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.3716F, -2.0689F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 45).addBox(-0.5F, -0.925F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 0.1132F, -3.535F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 54).addBox(-0.5F, -0.6F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(33, 20).addBox(-0.5F, -0.525F, -0.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -4.5865F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(32, 16).addBox(-0.5F, -0.65F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4332F, -3.3886F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftZygomaticarch = head.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9624F, -0.2068F, -1.2177F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r91 = leftZygomaticarch.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 9).addBox(-0.6F, -1.075F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4505F, 0.3487F, 0.5918F, -1.6005F, -1.0525F, 0.054F));

		PartDefinition cube_r92 = leftZygomaticarch.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(42, 43).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0789F, -0.0145F, 0.1457F, -1.5109F, -0.4285F, -0.1209F));

		PartDefinition cube_r93 = leftZygomaticarch.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(44, 9).addBox(-0.9392F, 0.0307F, 0.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.8022F, -0.1645F, -0.6209F, -2.3325F, -0.2969F, -0.0596F));

		PartDefinition cube_r94 = leftZygomaticarch.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(12, 43).addBox(-0.9392F, -0.9693F, -0.2965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.8022F, -0.1645F, -0.6209F, -1.4162F, -0.2969F, -0.0596F));

		PartDefinition rightZygomaticarch = head.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9624F, -0.2068F, -1.2177F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r95 = rightZygomaticarch.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(39, 9).mirror().addBox(-0.4F, -1.075F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4505F, 0.3487F, 0.5918F, -1.6005F, 1.0525F, -0.054F));

		PartDefinition cube_r96 = rightZygomaticarch.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(42, 43).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0789F, -0.0145F, 0.1457F, -1.5109F, 0.4285F, 0.1209F));

		PartDefinition cube_r97 = rightZygomaticarch.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(44, 9).mirror().addBox(-0.0608F, 0.0307F, 0.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.8022F, -0.1645F, -0.6209F, -2.3325F, 0.2969F, 0.0596F));

		PartDefinition cube_r98 = rightZygomaticarch.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(12, 43).mirror().addBox(-0.0608F, -0.9693F, -0.2965F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8022F, -0.1645F, -0.6209F, -1.4162F, 0.2969F, 0.0596F));

		PartDefinition leftMaxilla = head.addOrReplaceChild("leftMaxilla", CubeListBuilder.create(), PartPose.offset(0.417F, -0.6549F, -8.874F));

		PartDefinition cube_r99 = leftMaxilla.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(38, 26).addBox(-0.7F, -0.7518F, -0.29F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.417F, 0.9825F, 5.8278F, 0.002F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftMaxilla.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(51, 6).addBox(-0.225F, -0.0047F, -0.9098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.417F, -0.9662F, 7.7606F, 0.2234F, 0.0851F, 0.0193F));

		PartDefinition cube_r101 = leftMaxilla.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(14, 55).addBox(-0.5F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0444F, -0.0324F, 7.2485F, -0.1096F, 0.2406F, 0.1043F));

		PartDefinition cube_r102 = leftMaxilla.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 55).addBox(-0.325F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(15, 51).addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3494F, -0.1281F, 6.7062F, 0.414F, 0.2406F, 0.1043F));

		PartDefinition cube_r103 = leftMaxilla.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(42, 23).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.117F, -0.4635F, 8.2297F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition rightMaxilla = head.addOrReplaceChild("rightMaxilla", CubeListBuilder.create(), PartPose.offset(-0.417F, -0.6549F, -8.874F));

		PartDefinition cube_r104 = rightMaxilla.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(38, 26).mirror().addBox(-0.3F, -0.7518F, -0.29F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.417F, 0.9825F, 5.8278F, 0.002F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightMaxilla.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(35, 49).mirror().addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.417F, 0.5825F, 5.7278F, -0.3035F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightMaxilla.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(30, 49).mirror().addBox(-0.5F, -0.425F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(30, 49).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.417F, 0.5742F, 4.9275F, -0.0417F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightMaxilla.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.775F, -0.0047F, -0.9098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.417F, -0.9662F, 7.7606F, 0.2234F, -0.0851F, -0.0193F));

		PartDefinition cube_r108 = rightMaxilla.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-0.5F, -0.225F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0444F, -0.0324F, 7.2485F, -0.1096F, -0.2406F, -0.1043F));

		PartDefinition cube_r109 = rightMaxilla.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.675F, -0.2F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(15, 51).mirror().addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3494F, -0.1281F, 6.7062F, 0.414F, -0.2406F, -0.1043F));

		PartDefinition cube_r110 = rightMaxilla.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(42, 23).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.117F, -0.4635F, 8.2297F, -0.0437F, -0.0436F, 0.0019F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, -0.2814F, -0.4289F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r111 = jaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(-0.5009F, -0.9062F, -0.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(40, 49).mirror().addBox(-0.5009F, -1.3062F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(49, 36).mirror().addBox(-0.5009F, -1.7312F, -0.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(42, 34).mirror().addBox(-0.5009F, -3.2062F, -0.4342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false)
				.texOffs(7, 39).mirror().addBox(-0.5009F, -3.4062F, -0.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.3986F, 0.946F, -4.3553F, -1.4664F, -0.0524F, 0.0F));

		PartDefinition cube_r112 = jaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(49, 9).mirror().addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(22, 43).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8324F, 0.3388F, -0.8478F, -0.1047F, -0.0524F, 0.0F));

		PartDefinition cube_r113 = jaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(45, 50).mirror().addBox(-0.5009F, -0.6842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 24).mirror().addBox(-0.5009F, -1.0842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 50).mirror().addBox(-0.5009F, -1.4842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3986F, 0.946F, -4.3553F, -1.6845F, -0.0524F, 0.0F));

		PartDefinition cube_r114 = jaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5009F, -4.1041F, 0.229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)).mirror(false), PartPose.offsetAndRotation(-0.3986F, 0.946F, -4.3553F, -1.3616F, -0.0524F, 0.0F));

		PartDefinition cube_r115 = jaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(17, 41).mirror().addBox(-0.5009F, -2.8376F, -0.2457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3986F, 0.946F, -4.3553F, -1.5536F, -0.0524F, 0.0F));

		PartDefinition cube_r116 = jaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-0.483F, -1.4397F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(47, 47).mirror().addBox(-0.483F, -0.8397F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8713F, 1.3197F, -0.3055F, 1.1611F, -0.0492F, -0.0179F));

		PartDefinition cube_r117 = jaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(-0.87F, -0.6233F, -0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(51, 0).mirror().addBox(-0.87F, -0.7733F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 50).mirror().addBox(-0.87F, -0.3733F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3232F, -0.1208F, -0.6545F, -0.0524F, 0.0F));

		PartDefinition cube_r118 = jaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(47, 44).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.8713F, 0.9197F, -0.1055F, 0.2448F, -0.0492F, -0.0179F));

		PartDefinition cube_r119 = jaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 47).mirror().addBox(-0.5009F, -3.0019F, 1.2932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3986F, 0.946F, -4.3553F, -0.8991F, -0.0524F, 0.0F));

		PartDefinition cube_r120 = jaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 42).addBox(-0.4991F, -4.1041F, 0.229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.307F)), PartPose.offsetAndRotation(-0.2014F, 0.946F, -4.3553F, -1.3616F, 0.0524F, 0.0F));

		PartDefinition cube_r121 = jaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(45, 50).addBox(-0.4991F, -0.6842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 24).addBox(-0.4991F, -1.0842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 50).addBox(-0.4991F, -1.4842F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2014F, 0.946F, -4.3553F, -1.6845F, 0.0524F, 0.0F));

		PartDefinition cube_r122 = jaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(17, 41).addBox(-0.4991F, -2.8376F, -0.2457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2014F, 0.946F, -4.3553F, -1.5536F, 0.0524F, 0.0F));

		PartDefinition cube_r123 = jaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 50).addBox(-0.4991F, -0.9062F, -0.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(40, 49).addBox(-0.4991F, -1.3062F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(49, 36).addBox(-0.4991F, -1.7312F, -0.5092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(42, 34).addBox(-0.4991F, -3.2062F, -0.4342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.32F))
				.texOffs(7, 39).addBox(-0.4991F, -3.4062F, -0.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.2014F, 0.946F, -4.3553F, -1.4664F, 0.0524F, 0.0F));

		PartDefinition cube_r124 = jaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(5, 47).addBox(-0.4991F, -3.0019F, 1.2932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2014F, 0.946F, -4.3553F, -0.8991F, 0.0524F, 0.0F));

		PartDefinition cube_r125 = jaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(51, 15).addBox(-0.13F, -0.6233F, -0.7245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(51, 0).addBox(-0.13F, -0.7733F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 50).addBox(-0.13F, -0.3733F, -1.3995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.3232F, -0.1208F, -0.6545F, 0.0524F, 0.0F));

		PartDefinition cube_r126 = jaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 48).addBox(-0.517F, -1.4397F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(47, 47).addBox(-0.517F, -0.8397F, -0.2096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2713F, 1.3197F, -0.3055F, 1.1611F, 0.0492F, 0.0179F));

		PartDefinition cube_r127 = jaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(47, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2713F, 0.9197F, -0.1055F, 0.2448F, 0.0492F, 0.0179F));

		PartDefinition cube_r128 = jaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(49, 9).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 49).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(22, 43).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2324F, 0.3388F, -0.8478F, -0.1047F, 0.0524F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 14).addBox(-0.5F, -0.3573F, 0.0074F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.6934F, 1.812F, 0.0925F, 0.2594F, -0.0101F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1932F, 4.8951F, 0.202F, 0.2976F, 0.0696F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0009F, 8.0009F, -0.0464F, 0.3487F, -0.0159F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0256F, 4.9271F, -0.1162F, 0.2167F, -0.0251F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0166F, 4.9336F, -0.2076F, 0.2564F, -0.0534F));

		return LayerDefinition.create(meshdefinition, 57, 57);
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