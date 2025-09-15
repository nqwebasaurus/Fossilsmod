package fossils.fossils.client.blockentity.model.datheosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DatheosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Datheosaurus;
	private final ModelPart hips;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart skullTop;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart skullJaw;

	public DatheosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Datheosaurus = this.fossil.getChild("Datheosaurus");
		this.hips = this.Datheosaurus.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck = this.chest.getChild("neck");
		this.skullTop = this.neck.getChild("skullTop");
		this.leftFace = this.skullTop.getChild("leftFace");
		this.rightFace = this.skullTop.getChild("rightFace");
		this.skullJaw = this.skullTop.getChild("skullJaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Datheosaurus = fossil.addOrReplaceChild("Datheosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.5F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = Datheosaurus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1199F, 11.9095F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(81, 52).addBox(0.0F, -1.1963F, 0.0626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7266F, 2.8245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 81).addBox(0.0F, -1.3051F, 0.0273F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, 0.9245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 81).addBox(0.0F, -1.4139F, -0.0081F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, -0.9755F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 80).addBox(0.0F, -1.4227F, -0.0434F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -2.8755F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-2.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 0).addBox(0.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(19, 22).addBox(-0.5F, -1.0904F, -0.109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(50, 70).addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.644F, 1.7111F, -1.7597F, -0.464F, -0.0857F, -1.4488F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(69, 35).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(45, 69).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, -2.4F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.3672F, 0.8319F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3884F, 5.3559F, -0.4402F, 1.2481F, -1.1797F, 0.1203F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(72, 41).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 3.0105F, 0.6723F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4576F, 3.0105F, 0.6723F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(71, 57).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(30, 65).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3136F, 1.8544F, 0.5169F, -0.3491F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(66, 12).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r7 = Rightshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(66, 0).addBox(-0.4039F, -0.9602F, -1.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(13, 53).addBox(0.0F, -0.4F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8224F, 5.695F, 0.4719F, 2.8663F, 0.6868F, -3.1353F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(17, 40).addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.644F, 1.7111F, -1.7597F, -0.1586F, 0.0857F, 1.4488F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(45, 69).mirror().addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(57, 63).mirror().addBox(-0.5F, -2.4F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.3672F, 0.8319F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3884F, 5.3559F, -0.4402F, 1.4295F, 0.5391F, 0.1066F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0105F, 0.6723F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0105F, 0.6723F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3136F, 1.8544F, 0.5169F, -0.3491F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(66, 12).mirror().addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r7 = Leftshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5961F, -0.9602F, -1.5071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(13, 53).mirror().addBox(-2.0F, -0.4F, -2.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8224F, 5.695F, 0.4719F, 2.5907F, -0.2567F, 3.0772F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(17, 40).mirror().addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0416F, 1.0794F, -1.2317F, 0.1309F, 0.0F, 0.2618F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.5F, -2.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.174F, -2.1052F, -0.2835F, 1.9199F, 0.0F, 0.1745F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(60, 73).addBox(-0.5F, 0.3F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(71, 13).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4301F, -3.6741F, -0.142F, 1.1292F, 0.0105F, 0.1748F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(36, 59).addBox(-0.675F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2813F, -1.7599F, 0.9461F, 0.5184F, 0.0105F, 0.1748F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(11, 59).addBox(-0.8792F, -1.5271F, -1.6687F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1812F, 0.0374F, 0.3849F, 0.8378F, 0.0F, -0.1571F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(72, 61).addBox(-1.0414F, 0.7195F, -0.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1812F, -0.1626F, 1.7849F, -0.2967F, 0.0F, -0.192F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(35, 73).addBox(-0.9024F, 1.4498F, 0.3503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1812F, 0.0374F, 0.3849F, -1.7363F, -0.0113F, -0.1558F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(40, 73).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0343F, 1.4157F, -3.442F, -1.9545F, -0.0113F, -0.1558F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(69, 5).addBox(-0.9024F, 0.7039F, 0.2595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1812F, 0.0374F, 0.3849F, -1.3F, -0.0113F, -0.1558F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(67, 43).addBox(-0.9024F, 0.5874F, -1.5056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1812F, 0.0374F, 0.3849F, -0.9509F, -0.0113F, -0.1558F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(29, 59).addBox(-1.036F, 1.5125F, -1.5992F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7812F, -2.4626F, 1.7849F, -0.4276F, 0.0F, 0.1745F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0414F, -0.9851F, -2.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1812F, -0.1626F, 1.7849F, 1.7715F, 0.0F, -0.192F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(72, 67).addBox(-1.0414F, -1.459F, -1.2419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1812F, -0.1626F, 1.7849F, 1.0123F, 0.0F, -0.192F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(55, 69).addBox(-1.0414F, 0.541F, -0.7919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1812F, -0.1626F, 1.7849F, 0.3578F, 0.0F, -0.192F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0416F, 1.0794F, -1.2317F, 0.1309F, 0.0F, -0.2618F));

		PartDefinition Hips_r14 = bone3.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.5F, -0.5F, -2.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.174F, -2.1052F, -0.2835F, 1.9199F, 0.0F, -0.1745F));

		PartDefinition Hips_r15 = bone3.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.5F, 0.3F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 13).mirror().addBox(-0.5F, -0.5F, -0.775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4301F, -3.6741F, -0.142F, 1.1292F, -0.0105F, -0.1748F));

		PartDefinition Hips_r16 = bone3.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(36, 59).mirror().addBox(-0.325F, -1.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2813F, -1.7599F, 0.9461F, 0.5184F, -0.0105F, -0.1748F));

		PartDefinition Hips_r17 = bone3.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(11, 59).mirror().addBox(-0.1208F, -1.5271F, -1.6687F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, 0.0374F, 0.3849F, 0.8378F, 0.0F, 0.1571F));

		PartDefinition Hips_r18 = bone3.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(0.0414F, 0.7195F, -0.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, -0.1626F, 1.7849F, -0.2967F, 0.0F, 0.192F));

		PartDefinition Hips_r19 = bone3.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.0976F, 1.4498F, 0.3503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, 0.0374F, 0.3849F, -1.7363F, 0.0113F, 0.1558F));

		PartDefinition Hips_r20 = bone3.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0343F, 1.4157F, -3.442F, -1.9545F, 0.0113F, 0.1558F));

		PartDefinition Hips_r21 = bone3.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-0.0976F, 0.7039F, 0.2595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, 0.0374F, 0.3849F, -1.3F, 0.0113F, 0.1558F));

		PartDefinition Hips_r22 = bone3.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.0976F, 0.5874F, -1.5056F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, 0.0374F, 0.3849F, -0.9509F, 0.0113F, 0.1558F));

		PartDefinition Hips_r23 = bone3.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(0.036F, 1.5125F, -1.5992F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7812F, -2.4626F, 1.7849F, -0.4276F, 0.0F, -0.1745F));

		PartDefinition Hips_r24 = bone3.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(0.0414F, -0.9851F, -2.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, -0.1626F, 1.7849F, 1.7715F, 0.0F, 0.192F));

		PartDefinition Hips_r25 = bone3.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(72, 67).mirror().addBox(0.0414F, -1.459F, -1.2419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, -0.1626F, 1.7849F, 1.0123F, 0.0F, 0.192F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(55, 69).mirror().addBox(0.0414F, 0.541F, -0.7919F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, -0.1626F, 1.7849F, 0.3578F, 0.0F, 0.192F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.0703F, 0.2612F, 0.0182F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 70).addBox(0.0F, -0.9332F, -0.0313F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5844F, 7.6155F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 82).addBox(0.0F, -0.9782F, -0.0196F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6844F, 5.8155F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 82).addBox(0.0F, -1.0562F, 0.0405F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8844F, 3.9155F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(79, 81).addBox(0.0F, -1.0496F, -0.0807F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0844F, 2.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 81).addBox(0.0F, 4.5631F, 7.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 6).addBox(0.0F, 3.3631F, 5.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 81).addBox(0.0F, 2.5631F, 3.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 80).addBox(0.0F, 1.8631F, 1.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 81).addBox(0.0F, 1.0631F, -0.3783F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(76, 81).addBox(0.0F, -1.0369F, 0.0217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9432F, -0.4009F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8392F, 9.1501F, -0.0247F, 0.2181F, -0.0053F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 82).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(15, 32).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(82, 49).addBox(0.0F, -0.653F, 0.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(47, 80).addBox(0.0F, 6.4631F, 13.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 80).addBox(0.0F, 5.9631F, 11.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 61).addBox(0.0F, 5.1631F, 9.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6548F, -8.8346F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 81).addBox(0.0F, -0.7169F, 0.0026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-1.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 49).addBox(0.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.0191F, 0.3054F, -0.0058F));

		PartDefinition cube_r21 = tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(82, 67).addBox(-0.5F, -0.8257F, 3.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 61).addBox(-0.5F, -0.6257F, 1.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 58).addBox(-0.5F, -0.5257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(82, 40).addBox(0.0F, 7.7631F, 15.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 30).addBox(0.0F, 8.1631F, 17.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5664F, -14.4357F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1425F, 0.216F, -0.0307F));

		PartDefinition cube_r24 = tail4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 81).addBox(0.0F, -0.893F, 3.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(70, 81).addBox(0.0F, -0.893F, 1.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(45, 37).addBox(0.0F, -0.793F, -0.1134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(82, 46).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 43).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 30).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.1179F, 0.1968F, -0.2375F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 46).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0788F, 0.5613F, 0.1622F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, -0.0662F, 0.6108F, 0.0121F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.0177F, 0.2181F, 0.0038F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.0962F, -0.2182F, -0.0019F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(39, 46).addBox(-0.5623F, -0.5575F, 0.0192F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0623F, 0.0379F, 5.0301F, -0.0333F, -0.5236F, -0.0052F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5176F, -0.5575F, 0.0194F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0447F, -0.0075F, 4.9427F, -0.0011F, -0.3904F, 0.138F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.901F, -3.0697F, -0.2112F, -0.128F, 0.0274F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 79).addBox(0.0F, -1.421F, 0.0427F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5254F, -1.9819F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(54, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -1.4789F, -0.0137F, 0.0563F, -0.6514F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(42, 79).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -1.4789F, -0.0394F, 0.09F, -0.9998F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -3.4789F, -0.0137F, 0.0563F, -0.6689F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(68, 17).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -3.4789F, -0.0394F, 0.09F, -1.0173F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -5.4789F, -0.0525F, 0.0362F, -0.6358F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -5.4789F, -0.0691F, 0.0579F, -0.9846F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(81, 13).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0678F, -5.4789F, -0.0859F, 0.0271F, -1.3764F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(54, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -1.4789F, -0.0137F, -0.0563F, 0.6514F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(42, 79).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -1.4789F, -0.0394F, -0.09F, 0.9998F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(37, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -3.4789F, -0.0137F, -0.0563F, 0.6689F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(68, 17).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -3.4789F, -0.0394F, -0.09F, 1.0173F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(79, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -5.4789F, -0.0525F, -0.0362F, 0.6358F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(71, 23).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -5.4789F, -0.0691F, -0.0579F, 0.9846F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(81, 13).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0678F, -5.4789F, -0.0859F, -0.0271F, 1.3764F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 79).addBox(0.0F, -1.4039F, -0.0547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6254F, -3.8819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(79, 30).addBox(0.0F, -1.0957F, 0.052F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8254F, -5.9819F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 40).addBox(-2.5F, -1.9747F, 0.7062F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6639F, -4.8053F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2746F, -12.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3215F, -6.0276F, -0.0643F, -0.0871F, 0.0056F));

		PartDefinition Bodyfront_r15 = body2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -1.3213F, 0.0252F, 0.0763F, -0.5441F));

		PartDefinition Bodyfront_r16 = body2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -1.3213F, -0.0096F, 0.122F, -0.892F));

		PartDefinition Bodyfront_r17 = body2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4342F, 5.1982F, -0.6754F, -0.0859F, 0.0872F, -1.5933F));

		PartDefinition Bodyfront_r18 = body2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(64, 27).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -1.3213F, -0.0557F, 0.109F, -1.2871F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(81, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -1.3213F, 0.0252F, -0.0763F, 0.5441F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(72, 65).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -1.3213F, -0.0096F, -0.122F, 0.892F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(80, 75).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4342F, 5.1982F, -0.6754F, -0.0859F, -0.0872F, 1.5933F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(64, 27).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -1.3213F, -0.0557F, -0.109F, 1.2871F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(11, 81).addBox(0.0F, -1.5212F, -0.7673F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -1.1507F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(40, 15).addBox(-2.5F, -1.3351F, 2.7809F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.5074F, -3.3296F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 30).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2404F, -2.9212F, 0.0501F, -0.1743F, -0.0087F));

		PartDefinition cube_r35 = body3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 81).addBox(0.0F, -1.2509F, -0.8779F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -2.0507F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = body3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(81, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9142F, 5.9884F, 0.0024F, -0.0897F, 0.0088F, -1.5585F));

		PartDefinition Bodyfront_r24 = body3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(62, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -0.3075F, -0.0447F, 0.0403F, -0.5133F));

		PartDefinition Bodyfront_r25 = body3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(69, 39).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -0.3075F, -0.0631F, 0.0643F, -0.862F));

		PartDefinition Bodyfront_r26 = body3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -0.3075F, -0.0829F, 0.0353F, -1.2542F));

		PartDefinition Bodyfront_r27 = body3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1147F, 6.0514F, -1.7995F, -0.0898F, 0.0397F, -1.5671F));

		PartDefinition Bodyfront_r28 = body3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(58, 35).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -2.3075F, -0.0709F, 0.068F, -1.2186F));

		PartDefinition Bodyfront_r29 = body3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -2.3075F, -0.0394F, 0.09F, -0.8253F));

		PartDefinition Bodyfront_r30 = body3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(79, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -2.3075F, -0.0137F, 0.0563F, -0.4769F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(62, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -0.3075F, -0.0447F, -0.0403F, 0.5133F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(69, 39).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -0.3075F, -0.0631F, -0.0643F, 0.862F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(0, 59).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -0.3075F, -0.0829F, -0.0353F, 1.2542F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(81, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9142F, 5.9884F, 0.0024F, -0.0897F, -0.0088F, 1.5585F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(81, 15).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1147F, 6.0514F, -1.7995F, -0.0898F, -0.0397F, 1.5671F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(58, 35).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -2.3075F, -0.0709F, -0.068F, 1.2186F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(69, 9).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -2.3075F, -0.0394F, -0.09F, 0.8253F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(79, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -2.3075F, -0.0137F, -0.0563F, 0.4769F));

		PartDefinition cube_r36 = body3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(15, 80).addBox(0.0F, -1.6366F, 0.0412F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -0.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 8).addBox(-2.5F, -1.618F, -3.2035F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.0868F, 1.1841F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 55).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.221F, -2.9507F, 0.1202F, -0.13F, -0.0157F));

		PartDefinition Bodyfront_r39 = body4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(81, 56).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4075F, 5.7867F, -1.3641F, -0.0902F, -0.0737F, -1.5147F));

		PartDefinition Bodyfront_r40 = body4.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(18, 59).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -1.2272F, -0.1099F, -0.0385F, -1.1669F));

		PartDefinition Bodyfront_r41 = body4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -1.2272F, -0.1163F, 0.0064F, -0.7767F));

		PartDefinition Bodyfront_r42 = body4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(81, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -1.2272F, -0.1144F, 0.004F, -0.4276F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(81, 56).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4075F, 5.7867F, -1.3641F, -0.0902F, 0.0737F, 1.5147F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(18, 59).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -1.2272F, -0.1099F, 0.0385F, 1.1669F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(5, 73).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -1.2272F, -0.1163F, -0.0064F, 0.7767F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(81, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -1.2272F, -0.1144F, -0.004F, 0.4276F));

		PartDefinition cube_r39 = body4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(62, 81).addBox(0.0F, -1.3585F, 0.0302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -1.9507F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 15).addBox(-2.0F, -1.185F, -8.725F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.255F, 4.7626F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 12).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -2.8855F, 0.0953F, -0.2172F, -0.0206F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 79).addBox(0.0F, -1.9932F, 0.0552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -0.9507F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(37, 81).addBox(0.0F, -1.6369F, 0.0333F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -2.9507F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 61).addBox(0.0F, -1.8715F, 3.9779F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(30, 32).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(37, 53).addBox(-1.7866F, -0.2845F, -0.8851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.4369F, -5.8437F, -0.2346F, 0.2549F, -0.0602F));

		PartDefinition Bodyfront_r47 = chest.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0835F, 0.0201F, -0.4098F));

		PartDefinition Bodyfront_r48 = chest.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(71, 11).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0927F, 0.0322F, -0.7587F));

		PartDefinition Bodyfront_r49 = chest.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.094F, 4.5796F, -0.2743F, -0.125F, -0.0174F, -1.4534F));

		PartDefinition Bodyfront_r50 = chest.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0979F, -0.0057F, -1.1497F));

		PartDefinition Bodyfront_r51 = chest.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0678F, 0.0762F, -1.201F));

		PartDefinition Bodyfront_r52 = chest.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0335F, 0.0964F, -0.8073F));

		PartDefinition Bodyfront_r53 = chest.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(81, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0059F, 0.0603F, -0.459F));

		PartDefinition Bodyfront_r54 = chest.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0564F, 0.0922F, -0.4717F));

		PartDefinition Bodyfront_r55 = chest.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0144F, 0.1475F, -0.8189F));

		PartDefinition Bodyfront_r56 = chest.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, -0.0435F, 0.1417F, -1.2158F));

		PartDefinition Bodyfront_r57 = chest.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(80, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0835F, -0.0201F, 0.4098F));

		PartDefinition Bodyfront_r58 = chest.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(71, 11).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0927F, -0.0322F, 0.7587F));

		PartDefinition Bodyfront_r59 = chest.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(80, 77).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.094F, 4.5796F, -0.2743F, -0.125F, 0.0174F, 1.4534F));

		PartDefinition Bodyfront_r60 = chest.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(62, 41).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0979F, 0.0057F, 1.1497F));

		PartDefinition Bodyfront_r61 = chest.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(0, 65).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0678F, -0.0762F, 1.201F));

		PartDefinition Bodyfront_r62 = chest.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(12, 73).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0335F, -0.0964F, 0.8073F));

		PartDefinition Bodyfront_r63 = chest.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(81, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0059F, -0.0603F, 0.459F));

		PartDefinition Bodyfront_r64 = chest.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(79, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0564F, -0.0922F, 0.4717F));

		PartDefinition Bodyfront_r65 = chest.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(71, 2).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0144F, -0.1475F, 0.8189F));

		PartDefinition Bodyfront_r66 = chest.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(71, 0).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, -0.0435F, -0.1417F, 1.2158F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 53).addBox(0.7866F, -0.2845F, -0.8851F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.4369F, -5.8437F, -0.2346F, -0.2549F, 0.0602F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(53, 21).addBox(-1.0F, -0.2845F, -0.3865F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.4369F, -5.8437F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(52, 44).addBox(-2.0F, -0.1507F, -3.0899F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.4369F, -5.8437F, -0.576F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(66, 58).addBox(-0.599F, 1.9702F, -0.8446F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(72, 45).addBox(-0.599F, -0.0298F, -0.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1405F, 5.0386F, -5.5873F, 0.8495F, 0.1425F, -1.2048F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(62, 63).addBox(-0.5F, -1.5F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 1.8991F, 0.2812F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(19, 73).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(43, 60).addBox(-0.5F, 0.2F, 2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(20, 69).addBox(-0.5F, 0.6F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(60, 69).addBox(-0.3997F, -0.8984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5088F, 5.8349F, -0.3301F, -1.7211F, 0.2324F, -0.4085F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(50, 65).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 2.0016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(30, 70).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 4.3016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(66, 53).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 1.5289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(10, 69).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 1.5289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(67, 63).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.6016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 53).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1121F, 4.7957F, 0.2085F, -0.2076F, 0.1373F, 0.9926F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(34, 40).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(66, 58).mirror().addBox(-0.401F, 1.9702F, -0.8446F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(72, 45).mirror().addBox(-0.401F, -0.0298F, -0.8446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1405F, 5.0386F, -5.5873F, -0.6479F, -0.2539F, 1.275F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-0.5F, -1.5F, -0.575F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 1.8991F, 0.2812F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(-0.5F, 0.2F, 2.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-0.5F, 0.6F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.6003F, -0.8984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5088F, 5.8349F, -0.3301F, -1.228F, -0.356F, 0.3634F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 2.0016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 4.3016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 1.5289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 1.5289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(67, 63).mirror().addBox(-0.5F, -1.75F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 3.6016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1121F, 4.7957F, 0.2085F, -0.1203F, -0.1373F, -0.9926F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(34, 40).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9395F, 2.3127F, -7.1117F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Bodyfront_r67 = bone.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(0, 61).addBox(-0.3854F, -0.1577F, -0.5176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0307F, 1.5997F, -0.1488F, 1.178F, -0.0115F, 0.2717F));

		PartDefinition Bodyfront_r68 = bone.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(65, 49).addBox(-0.3554F, -0.1204F, -1.9706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0307F, 1.5997F, -0.1488F, 0.7015F, 0.0552F, 0.4331F));

		PartDefinition Bodyfront_r69 = bone.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(40, 69).addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8387F, 3.1586F, 0.4266F, 2.1729F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r70 = bone.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(5, 69).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8387F, 3.1586F, 0.4266F, 1.5621F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r71 = bone.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(66, 20).addBox(-1.2F, 0.7863F, -1.5768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 1.1694F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r72 = bone.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(57, 55).addBox(-0.25F, -0.375F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6681F, 3.5495F, 1.2549F, -0.4534F, -0.0004F, 1.1329F));

		PartDefinition Bodyfront_r73 = bone.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(15, 69).addBox(-0.5F, -0.65F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7464F, 2.9607F, 2.2813F, 0.0785F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r74 = bone.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(55, 6).addBox(-1.2F, -1.3016F, -0.1527F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, -0.4451F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r75 = bone.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(64, 6).addBox(-0.4723F, -2.3242F, -0.0526F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0277F, -0.47F, 2.1901F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r76 = bone.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(35, 68).addBox(-0.4723F, -2.3105F, -0.6883F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0277F, -0.47F, 2.1901F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r77 = bone.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(50, 60).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1064F, 0.4002F, 0.0283F, 0.0254F, 0.1041F));

		PartDefinition Bodyfront_r78 = bone.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(72, 49).addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.8624F, 1.2054F, -0.6632F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9395F, 2.3127F, -7.1117F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Bodyfront_r79 = bone4.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.6146F, -0.1577F, -0.5176F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0307F, 1.5997F, -0.1488F, 1.178F, 0.0115F, -0.2717F));

		PartDefinition Bodyfront_r80 = bone4.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-0.6446F, -0.1204F, -1.9706F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0307F, 1.5997F, -0.1488F, 0.7015F, -0.0552F, -0.4331F));

		PartDefinition Bodyfront_r81 = bone4.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-0.5F, -1.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 3.1586F, 0.4266F, 2.1729F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r82 = bone4.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.8387F, 3.1586F, 0.4266F, 1.5621F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r83 = bone4.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(0.2F, 0.7863F, -1.5768F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 1.1694F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r84 = bone4.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(57, 55).mirror().addBox(-0.75F, -0.375F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6681F, 3.5495F, 1.2549F, -0.4534F, 0.0004F, -1.1329F));

		PartDefinition Bodyfront_r85 = bone4.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(15, 69).mirror().addBox(-0.5F, -0.65F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7464F, 2.9607F, 2.2813F, 0.0785F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r86 = bone4.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(55, 6).mirror().addBox(0.2F, -1.3016F, -0.1527F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, -0.4451F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r87 = bone4.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.5277F, -2.3242F, -0.0526F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0277F, -0.47F, 2.1901F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = bone4.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(-0.5277F, -2.3105F, -0.6883F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0277F, -0.47F, 2.1901F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r89 = bone4.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(-0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1064F, 0.4002F, 0.0283F, -0.0254F, -0.1041F));

		PartDefinition Bodyfront_r90 = bone4.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-0.5F, -2.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8624F, 1.2054F, -0.6632F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, -0.0734F, -0.3492F, -0.0868F));

		PartDefinition cube_r49 = neck.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 79).addBox(-0.5F, -1.3505F, 0.0535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.0392F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = neck.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(66, 25).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, -0.0124F, 0.2235F, -1.4196F));

		PartDefinition Bodyfront_r92 = neck.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0753F, 0.211F, -1.0175F));

		PartDefinition Bodyfront_r93 = neck.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.1348F, 0.1315F, -0.6724F));

		PartDefinition Bodyfront_r94 = neck.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(66, 25).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, -0.0124F, -0.2235F, 1.4196F));

		PartDefinition Bodyfront_r95 = neck.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(38, 30).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0753F, -0.211F, 1.0175F));

		PartDefinition Bodyfront_r96 = neck.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(77, 73).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.1348F, -0.1315F, 0.6724F));

		PartDefinition cube_r50 = neck.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 68).addBox(-0.5F, -1.2721F, -2.0499F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.9392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r51 = neck.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 7).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition skullTop = neck.addOrReplaceChild("skullTop", CubeListBuilder.create().texOffs(78, 25).addBox(0.0F, -1.8096F, -2.459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, -0.3611F, -3.7373F, -0.3936F, -0.3051F, 0.0134F));

		PartDefinition skullT5_r1 = skullTop.addOrReplaceChild("skullT5_r1", CubeListBuilder.create().texOffs(74, 4).addBox(-0.5F, 0.0337F, -0.0509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -0.8718F, -6.0379F, 0.3578F, 0.0F, 0.0F));

		PartDefinition skullT5_r2 = skullTop.addOrReplaceChild("skullT5_r2", CubeListBuilder.create().texOffs(77, 46).addBox(-0.5F, -0.0105F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, -0.1718F, -6.8379F, 0.3752F, 0.0F, 0.0F));

		PartDefinition skullT4_r1 = skullTop.addOrReplaceChild("skullT4_r1", CubeListBuilder.create().texOffs(77, 43).addBox(-0.5F, 0.0145F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1718F, -6.8379F, 0.7243F, 0.0F, 0.0F));

		PartDefinition skullT3_r1 = skullTop.addOrReplaceChild("skullT3_r1", CubeListBuilder.create().texOffs(67, 29).addBox(-1.0F, -0.0263F, -1.0266F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3744F, -4.1913F, 0.2313F, 0.0F, 0.0F));

		PartDefinition skullT4_r2 = skullTop.addOrReplaceChild("skullT4_r2", CubeListBuilder.create().texOffs(57, 17).addBox(-1.0F, 0.0262F, -2.3969F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(53, 27).addBox(-1.0F, 0.0262F, -1.4469F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.5006F, -0.9201F, -0.0262F, 0.0F, 0.0F));

		PartDefinition skullT2_r1 = skullTop.addOrReplaceChild("skullT2_r1", CubeListBuilder.create().texOffs(57, 60).addBox(-1.0F, -0.025F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4974F, -3.3019F, 0.1265F, 0.0F, 0.0F));

		PartDefinition leftFace = skullTop.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -1.1F, -0.1F));

		PartDefinition skullT6_r1 = leftFace.addOrReplaceChild("skullT6_r1", CubeListBuilder.create().texOffs(55, 73).addBox(-1.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8223F, 0.2035F, -5.8471F, 0.6722F, 0.4329F, 0.0232F));

		PartDefinition skullT6_r2 = leftFace.addOrReplaceChild("skullT6_r2", CubeListBuilder.create().texOffs(10, 78).addBox(-1.0F, -1.0105F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 1.8586F, -6.3714F, 0.3779F, 0.4779F, 0.0987F));

		PartDefinition skullT5_r3 = leftFace.addOrReplaceChild("skullT5_r3", CubeListBuilder.create().texOffs(74, 28).addBox(-0.95F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2327F, -0.1047F, -4.9889F, 0.3236F, 0.4851F, 0.0234F));

		PartDefinition skullT4_r3 = leftFace.addOrReplaceChild("skullT4_r3", CubeListBuilder.create().texOffs(62, 37).addBox(-0.425F, -0.5F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1392F, 0.2368F, -3.8164F, 0.1539F, 0.3575F, -0.0067F));

		PartDefinition skullT3_r2 = leftFace.addOrReplaceChild("skullT3_r2", CubeListBuilder.create().texOffs(5, 75).addBox(-0.4138F, -0.5899F, 0.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9121F, 1.0468F, -4.4434F, -0.0139F, 0.349F, -0.0076F));

		PartDefinition skullT5_r4 = leftFace.addOrReplaceChild("skullT5_r4", CubeListBuilder.create().texOffs(10, 75).addBox(-0.4717F, -0.5115F, -1.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(50, 74).addBox(-0.4717F, -0.5115F, -0.881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9121F, 1.0468F, -4.4434F, 0.0971F, 0.4524F, 0.0337F));

		PartDefinition skullT9_r1 = leftFace.addOrReplaceChild("skullT9_r1", CubeListBuilder.create().texOffs(72, 71).addBox(-0.5F, -1.225F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3688F, 1.5999F, -5.9469F, 0.228F, 0.4524F, 0.0337F));

		PartDefinition skullT8_r1 = leftFace.addOrReplaceChild("skullT8_r1", CubeListBuilder.create().texOffs(71, 53).addBox(-0.4717F, -0.5865F, -1.606F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(71, 19).addBox(-0.4717F, -0.5115F, -0.981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0871F, 1.0468F, -4.4434F, 0.0971F, 0.4524F, 0.0337F));

		PartDefinition skullT10_r1 = leftFace.addOrReplaceChild("skullT10_r1", CubeListBuilder.create().texOffs(74, 34).addBox(-0.65F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 31).addBox(-0.65F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7184F, 1.4959F, -3.1703F, 0.0898F, 0.2352F, 0.0121F));

		PartDefinition skullT8_r2 = leftFace.addOrReplaceChild("skullT8_r2", CubeListBuilder.create().texOffs(29, 74).addBox(-0.4717F, 0.1885F, -0.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0871F, 0.9218F, -4.4434F, 0.0971F, 0.4524F, 0.0337F));

		PartDefinition skullT5_r5 = leftFace.addOrReplaceChild("skullT5_r5", CubeListBuilder.create().texOffs(77, 49).addBox(-0.15F, -0.45F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(77, 59).addBox(-0.15F, -0.45F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0133F)), PartPose.offsetAndRotation(0.5F, 0.4682F, -0.967F, -0.9427F, 0.9482F, -0.9419F));

		PartDefinition skullT4_r4 = leftFace.addOrReplaceChild("skullT4_r4", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F))
				.texOffs(75, 78).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0133F)), PartPose.offsetAndRotation(1.5F, 0.4888F, -0.0658F, -0.6109F, 0.0F, 0.0F));

		PartDefinition skullT2_r2 = leftFace.addOrReplaceChild("skullT2_r2", CubeListBuilder.create().texOffs(18, 61).addBox(-0.2F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4784F, 0.9692F, -2.083F, -0.5585F, 0.6344F, 0.2127F));

		PartDefinition skullT3_r3 = leftFace.addOrReplaceChild("skullT3_r3", CubeListBuilder.create().texOffs(5, 78).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2224F, 0.6335F, -0.829F, 0.0F, 0.0F));

		PartDefinition skullT10_r2 = leftFace.addOrReplaceChild("skullT10_r2", CubeListBuilder.create().texOffs(76, 16).addBox(-0.5F, -0.3646F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.45F, 0.298F, -3.59F, -2.2777F, 0.3752F, 0.0262F));

		PartDefinition skullT9_r2 = leftFace.addOrReplaceChild("skullT9_r2", CubeListBuilder.create().texOffs(76, 13).addBox(-0.5F, -0.6776F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.45F, 0.298F, -3.59F, -1.5097F, 0.3752F, 0.0262F));

		PartDefinition skullT9_r3 = leftFace.addOrReplaceChild("skullT9_r3", CubeListBuilder.create().texOffs(76, 53).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.825F, 0.1167F, -2.7313F, -0.7505F, 0.0F, 0.0F));

		PartDefinition skullT8_r3 = leftFace.addOrReplaceChild("skullT8_r3", CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.825F, -0.0058F, -3.0592F, -0.1833F, 0.0F, 0.0F));

		PartDefinition skullT9_r4 = leftFace.addOrReplaceChild("skullT9_r4", CubeListBuilder.create().texOffs(75, 75).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 76).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.7F, 0.331F, -3.4374F, -0.0151F, 0.3497F, 0.0276F));

		PartDefinition skullT7_r1 = leftFace.addOrReplaceChild("skullT7_r1", CubeListBuilder.create().texOffs(34, 76).addBox(-0.45F, -0.3971F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(1.625F, 0.3641F, -3.0142F, 0.0611F, 0.0F, 0.0F));

		PartDefinition skullT13_r1 = leftFace.addOrReplaceChild("skullT13_r1", CubeListBuilder.create().texOffs(77, 70).addBox(-0.5F, -0.175F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(77, 67).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.825F, 0.5379F, -0.8943F, -1.5315F, 0.0F, 0.0F));

		PartDefinition skullT13_r2 = leftFace.addOrReplaceChild("skullT13_r2", CubeListBuilder.create().texOffs(78, 25).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.525F, 0.9458F, -6.1823F, -1.1619F, 0.4854F, 0.1215F));

		PartDefinition skullT11_r1 = leftFace.addOrReplaceChild("skullT11_r1", CubeListBuilder.create().texOffs(78, 22).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.725F, 0.0699F, -1.2698F, -2.4653F, 0.0F, 0.0F));

		PartDefinition skullT10_r3 = leftFace.addOrReplaceChild("skullT10_r3", CubeListBuilder.create().texOffs(78, 10).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.725F, -0.1717F, -1.819F, 2.7271F, 0.0F, 0.0F));

		PartDefinition skullT9_r5 = leftFace.addOrReplaceChild("skullT9_r5", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.725F, 0.415F, -2.432F, 1.549F, 0.0F, 0.0F));

		PartDefinition skullT8_r4 = leftFace.addOrReplaceChild("skullT8_r4", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -0.775F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.725F, 0.755F, -1.9682F, 0.9381F, 0.0F, 0.0F));

		PartDefinition skullT7_r2 = leftFace.addOrReplaceChild("skullT7_r2", CubeListBuilder.create().texOffs(39, 76).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.725F, 0.5563F, -1.5664F, -0.288F, 0.0F, 0.0F));

		PartDefinition skullT5_r6 = leftFace.addOrReplaceChild("skullT5_r6", CubeListBuilder.create().texOffs(76, 7).addBox(-0.5F, -0.3272F, -0.3055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.45F, 0.298F, -3.59F, 0.0785F, 0.3752F, 0.0262F));

		PartDefinition skullT4_r5 = leftFace.addOrReplaceChild("skullT4_r5", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, 0.8731F, -2.701F, -0.0087F, 0.0F, 0.0F));

		PartDefinition skullT4_r6 = leftFace.addOrReplaceChild("skullT4_r6", CubeListBuilder.create().texOffs(9, 65).addBox(-0.25F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 1.0818F, -1.2156F, -0.2955F, 1.0725F, -0.2612F));

		PartDefinition skullT3_r4 = leftFace.addOrReplaceChild("skullT3_r4", CubeListBuilder.create().texOffs(36, 64).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 1.7161F, -0.2949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition skullT2_r3 = leftFace.addOrReplaceChild("skullT2_r3", CubeListBuilder.create().texOffs(20, 79).addBox(1.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2745F, 0.338F, -1.3963F, 0.0F, 0.0F));

		PartDefinition skullT4_r7 = leftFace.addOrReplaceChild("skullT4_r7", CubeListBuilder.create().texOffs(65, 73).addBox(-0.447F, -0.5044F, 0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9121F, 1.0468F, -4.4434F, 0.0907F, 0.3834F, 0.006F));

		PartDefinition rightFace = skullTop.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -1.1F, -0.1F));

		PartDefinition skullT7_r3 = rightFace.addOrReplaceChild("skullT7_r3", CubeListBuilder.create().texOffs(55, 73).mirror().addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8223F, 0.2035F, -5.8471F, 0.6722F, -0.4329F, -0.0232F));

		PartDefinition skullT7_r4 = rightFace.addOrReplaceChild("skullT7_r4", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(0.0F, -1.0105F, 0.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.8586F, -6.3714F, 0.3779F, -0.4779F, -0.0987F));

		PartDefinition skullT6_r3 = rightFace.addOrReplaceChild("skullT6_r3", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-0.05F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2327F, -0.1047F, -4.9889F, 0.3236F, -0.4851F, -0.0234F));

		PartDefinition skullT5_r7 = rightFace.addOrReplaceChild("skullT5_r7", CubeListBuilder.create().texOffs(62, 37).mirror().addBox(-0.575F, -0.5F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1392F, 0.2368F, -3.8164F, 0.1539F, -0.3575F, 0.0067F));

		PartDefinition skullT4_r8 = rightFace.addOrReplaceChild("skullT4_r8", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5862F, -0.5899F, 0.5743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9121F, 1.0468F, -4.4434F, -0.0139F, -0.349F, 0.0076F));

		PartDefinition skullT6_r4 = rightFace.addOrReplaceChild("skullT6_r4", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5283F, -0.5115F, -1.581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(50, 74).mirror().addBox(-0.5283F, -0.5115F, -0.881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9121F, 1.0468F, -4.4434F, 0.0971F, -0.4524F, -0.0337F));

		PartDefinition skullT10_r4 = rightFace.addOrReplaceChild("skullT10_r4", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-0.5F, -1.225F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3688F, 1.5999F, -5.9469F, 0.228F, -0.4524F, -0.0337F));

		PartDefinition skullT9_r6 = rightFace.addOrReplaceChild("skullT9_r6", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-0.5283F, -0.5865F, -1.606F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(71, 19).mirror().addBox(-0.5283F, -0.5115F, -0.981F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0871F, 1.0468F, -4.4434F, 0.0971F, -0.4524F, -0.0337F));

		PartDefinition skullT11_r2 = rightFace.addOrReplaceChild("skullT11_r2", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-0.35F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 31).mirror().addBox(-0.35F, -0.5F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7184F, 1.4959F, -3.1703F, 0.0898F, -0.2352F, -0.0121F));

		PartDefinition skullT9_r7 = rightFace.addOrReplaceChild("skullT9_r7", CubeListBuilder.create().texOffs(29, 74).mirror().addBox(-0.5283F, 0.1885F, -0.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.0871F, 0.9218F, -4.4434F, 0.0971F, -0.4524F, -0.0337F));

		PartDefinition skullT6_r5 = rightFace.addOrReplaceChild("skullT6_r5", CubeListBuilder.create().texOffs(77, 49).mirror().addBox(-0.85F, -0.45F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(77, 59).mirror().addBox(-0.85F, -0.45F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0133F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4682F, -0.967F, -0.9427F, -0.9482F, 0.9419F));

		PartDefinition skullT5_r8 = rightFace.addOrReplaceChild("skullT5_r8", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(75, 78).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0133F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.4888F, -0.0658F, -0.6109F, 0.0F, 0.0F));

		PartDefinition skullT3_r5 = rightFace.addOrReplaceChild("skullT3_r5", CubeListBuilder.create().texOffs(18, 61).mirror().addBox(-0.8F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4784F, 0.9692F, -2.083F, -0.5585F, -0.6344F, -0.2127F));

		PartDefinition skullT4_r9 = rightFace.addOrReplaceChild("skullT4_r9", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2224F, 0.6335F, -0.829F, 0.0F, 0.0F));

		PartDefinition skullT11_r3 = rightFace.addOrReplaceChild("skullT11_r3", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.5F, -0.3646F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.298F, -3.59F, -2.2777F, -0.3752F, -0.0262F));

		PartDefinition skullT10_r5 = rightFace.addOrReplaceChild("skullT10_r5", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-0.5F, -0.6776F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.298F, -3.59F, -1.5097F, -0.3752F, -0.0262F));

		PartDefinition skullT10_r6 = rightFace.addOrReplaceChild("skullT10_r6", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.825F, 0.1167F, -2.7313F, -0.7505F, 0.0F, 0.0F));

		PartDefinition skullT9_r8 = rightFace.addOrReplaceChild("skullT9_r8", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.825F, -0.0058F, -3.0592F, -0.1833F, 0.0F, 0.0F));

		PartDefinition skullT10_r7 = rightFace.addOrReplaceChild("skullT10_r7", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 76).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.331F, -3.4374F, -0.0151F, -0.3497F, -0.0276F));

		PartDefinition skullT8_r5 = rightFace.addOrReplaceChild("skullT8_r5", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-0.55F, -0.3971F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-1.625F, 0.3641F, -3.0142F, 0.0611F, 0.0F, 0.0F));

		PartDefinition skullT14_r1 = rightFace.addOrReplaceChild("skullT14_r1", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-0.5F, -0.175F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(77, 67).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.825F, 0.5379F, -0.8943F, -1.5315F, 0.0F, 0.0F));

		PartDefinition skullT14_r2 = rightFace.addOrReplaceChild("skullT14_r2", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 0.9458F, -6.1823F, -1.1619F, -0.4854F, -0.1215F));

		PartDefinition skullT12_r1 = rightFace.addOrReplaceChild("skullT12_r1", CubeListBuilder.create().texOffs(78, 22).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.725F, 0.0699F, -1.2698F, -2.4653F, 0.0F, 0.0F));

		PartDefinition skullT11_r4 = rightFace.addOrReplaceChild("skullT11_r4", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -0.1717F, -1.819F, 2.7271F, 0.0F, 0.0F));

		PartDefinition skullT10_r8 = rightFace.addOrReplaceChild("skullT10_r8", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.725F, 0.415F, -2.432F, 1.549F, 0.0F, 0.0F));

		PartDefinition skullT9_r9 = rightFace.addOrReplaceChild("skullT9_r9", CubeListBuilder.create().texOffs(44, 76).mirror().addBox(-0.5F, -0.775F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.725F, 0.755F, -1.9682F, 0.9381F, 0.0F, 0.0F));

		PartDefinition skullT8_r6 = rightFace.addOrReplaceChild("skullT8_r6", CubeListBuilder.create().texOffs(39, 76).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.725F, 0.5563F, -1.5664F, -0.288F, 0.0F, 0.0F));

		PartDefinition skullT6_r6 = rightFace.addOrReplaceChild("skullT6_r6", CubeListBuilder.create().texOffs(76, 7).mirror().addBox(-0.5F, -0.3272F, -0.3055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.45F, 0.298F, -3.59F, 0.0785F, -0.3752F, -0.0262F));

		PartDefinition skullT5_r9 = rightFace.addOrReplaceChild("skullT5_r9", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.8731F, -2.701F, -0.0087F, 0.0F, 0.0F));

		PartDefinition skullT5_r10 = rightFace.addOrReplaceChild("skullT5_r10", CubeListBuilder.create().texOffs(9, 65).mirror().addBox(-0.75F, -0.5F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.0818F, -1.2156F, -0.2955F, -1.0725F, 0.2612F));

		PartDefinition skullT4_r10 = rightFace.addOrReplaceChild("skullT4_r10", CubeListBuilder.create().texOffs(36, 64).mirror().addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7161F, -0.2949F, -0.1396F, 0.0F, 0.0F));

		PartDefinition skullT3_r6 = rightFace.addOrReplaceChild("skullT3_r6", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-2.0F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2745F, 0.338F, -1.3963F, 0.0F, 0.0F));

		PartDefinition skullT5_r11 = rightFace.addOrReplaceChild("skullT5_r11", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.553F, -0.5044F, 0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9121F, 1.0468F, -4.4434F, 0.0907F, -0.3834F, -0.006F));

		PartDefinition skullJaw = skullTop.addOrReplaceChild("skullJaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5012F, 0.9486F, 0.4826F, 0.5934F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r1 = skullJaw.addOrReplaceChild("skullJ1b_r1", CubeListBuilder.create().texOffs(60, 76).mirror().addBox(-0.5767F, -0.3704F, -1.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(60, 76).addBox(2.6283F, -0.3704F, -1.2879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, 0.2531F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r2 = skullJaw.addOrReplaceChild("skullJ1b_r2", CubeListBuilder.create().texOffs(76, 56).mirror().addBox(-0.5767F, -0.1292F, -1.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(76, 56).addBox(2.6283F, -0.1292F, -1.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, 0.0436F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r3 = skullJaw.addOrReplaceChild("skullJ1b_r3", CubeListBuilder.create().texOffs(24, 76).mirror().addBox(-0.5767F, 0.1861F, -2.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(24, 76).addBox(2.6283F, 0.1861F, -2.5983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, -0.1309F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r4 = skullJaw.addOrReplaceChild("skullJ1b_r4", CubeListBuilder.create().texOffs(70, 75).mirror().addBox(-0.5767F, -0.2811F, -0.8882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(70, 75).addBox(2.6283F, -0.2811F, -0.8882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, 0.0349F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r5 = skullJaw.addOrReplaceChild("skullJ1b_r5", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.1687F, -0.1489F, -1.6323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-1.952F, 0.1089F, -2.1431F, -0.0349F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r6 = skullJaw.addOrReplaceChild("skullJ1b_r6", CubeListBuilder.create().texOffs(79, 3).mirror().addBox(-0.2441F, -1.2143F, -0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.302F, 0.3839F, -5.293F, 0.5847F, -0.5061F, 0.0F));

		PartDefinition skullJ1b_r7 = skullJaw.addOrReplaceChild("skullJ1b_r7", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.1441F, -0.6726F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.302F, 0.3839F, -5.293F, -0.2007F, -0.5061F, 0.0F));

		PartDefinition skullJ1b_r8 = skullJaw.addOrReplaceChild("skullJ1b_r8", CubeListBuilder.create().texOffs(43, 65).mirror().addBox(-0.114F, -0.204F, -1.8633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 0.1089F, -3.6431F, -0.1134F, -0.3316F, 0.0F));

		PartDefinition skullJ1b_r9 = skullJaw.addOrReplaceChild("skullJ1b_r9", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-0.1441F, -1.1398F, -1.0162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.302F, 0.3839F, -5.293F, 0.0262F, -0.5061F, 0.0F));

		PartDefinition skullJ1b_r10 = skullJaw.addOrReplaceChild("skullJ1b_r10", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-0.114F, -0.9184F, -2.0641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 77).mirror().addBox(-0.114F, -0.7607F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 0.1089F, -3.6431F, 0.0698F, -0.3316F, 0.0F));

		PartDefinition skullJ1b_r11 = skullJaw.addOrReplaceChild("skullJ1b_r11", CubeListBuilder.create().texOffs(29, 77).mirror().addBox(-0.114F, -0.7912F, -1.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 0.1089F, -3.6431F, 0.0262F, -0.3316F, 0.0F));

		PartDefinition skullJ1b_r12 = skullJaw.addOrReplaceChild("skullJ1b_r12", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(-0.114F, -0.3761F, -1.9236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 0.1089F, -3.6431F, -0.0175F, -0.3316F, 0.0F));

		PartDefinition skullJ1b_r13 = skullJaw.addOrReplaceChild("skullJ1b_r13", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(-0.1687F, -0.5811F, -1.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.952F, 0.1089F, -2.1431F, 0.1309F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r14 = skullJaw.addOrReplaceChild("skullJ1b_r14", CubeListBuilder.create().texOffs(24, 73).mirror().addBox(-0.1687F, -0.6524F, -0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.952F, 0.1089F, -2.1431F, 0.2182F, -0.0698F, 0.0F));

		PartDefinition skullJ1b_r15 = skullJaw.addOrReplaceChild("skullJ1b_r15", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-0.5767F, -0.5677F, -2.5591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(49, 77).mirror().addBox(-0.5767F, -0.5677F, -2.0591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(78, 0).addBox(2.6283F, -0.5677F, -2.5591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(49, 77).addBox(2.6283F, -0.5677F, -2.0591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, -0.0349F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r16 = skullJaw.addOrReplaceChild("skullJ1b_r16", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-0.5767F, 0.0569F, -1.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(76, 19).addBox(2.6283F, 0.0569F, -1.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.527F, 0.1089F, 0.157F, -0.5323F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r17 = skullJaw.addOrReplaceChild("skullJ1b_r17", CubeListBuilder.create().texOffs(16, 65).addBox(-0.8313F, -0.1489F, -1.6323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.9495F, 0.1089F, -2.1431F, -0.0349F, 0.0698F, 0.0F));

		PartDefinition skullJ1b_r18 = skullJaw.addOrReplaceChild("skullJ1b_r18", CubeListBuilder.create().texOffs(67, 32).addBox(-1.7092F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7079F, 0.0295F, -5.8325F, 0.5847F, 0.0F, 0.0F));

		PartDefinition skullJ1b_r19 = skullJaw.addOrReplaceChild("skullJ1b_r19", CubeListBuilder.create().texOffs(79, 3).addBox(-0.7559F, -1.2143F, -0.937F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.2995F, 0.3839F, -5.293F, 0.5847F, 0.5061F, 0.0F));

		PartDefinition skullJ1b_r20 = skullJaw.addOrReplaceChild("skullJ1b_r20", CubeListBuilder.create().texOffs(65, 76).addBox(-0.8559F, -0.6726F, -0.9291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2995F, 0.3839F, -5.293F, -0.2007F, 0.5061F, 0.0F));

		PartDefinition skullJ1b_r21 = skullJaw.addOrReplaceChild("skullJ1b_r21", CubeListBuilder.create().texOffs(43, 65).addBox(-0.886F, -0.204F, -1.8633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8995F, 0.1089F, -3.6431F, -0.1134F, 0.3316F, 0.0F));

		PartDefinition skullJ1b_r22 = skullJaw.addOrReplaceChild("skullJ1b_r22", CubeListBuilder.create().texOffs(77, 40).addBox(-0.8559F, -1.1398F, -1.0162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2995F, 0.3839F, -5.293F, 0.0262F, 0.5061F, 0.0F));

		PartDefinition skullJ1b_r23 = skullJaw.addOrReplaceChild("skullJ1b_r23", CubeListBuilder.create().texOffs(70, 78).addBox(-0.886F, -0.9184F, -2.0641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 77).addBox(-0.886F, -0.7607F, -0.6761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8995F, 0.1089F, -3.6431F, 0.0698F, 0.3316F, 0.0F));

		PartDefinition skullJ1b_r24 = skullJaw.addOrReplaceChild("skullJ1b_r24", CubeListBuilder.create().texOffs(29, 77).addBox(-0.886F, -0.7912F, -1.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8995F, 0.1089F, -3.6431F, 0.0262F, 0.3316F, 0.0F));

		PartDefinition skullJ1b_r25 = skullJaw.addOrReplaceChild("skullJ1b_r25", CubeListBuilder.create().texOffs(23, 65).addBox(-0.886F, -0.3761F, -1.9236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.8995F, 0.1089F, -3.6431F, -0.0175F, 0.3316F, 0.0F));

		PartDefinition skullJ1b_r26 = skullJaw.addOrReplaceChild("skullJ1b_r26", CubeListBuilder.create().texOffs(73, 25).addBox(-0.8313F, -0.5811F, -1.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9495F, 0.1089F, -2.1431F, 0.1309F, 0.0698F, 0.0F));

		PartDefinition skullJ1b_r27 = skullJaw.addOrReplaceChild("skullJ1b_r27", CubeListBuilder.create().texOffs(24, 73).addBox(-0.8313F, -0.6524F, -0.8967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9495F, 0.1089F, -2.1431F, 0.2182F, 0.0698F, 0.0F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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