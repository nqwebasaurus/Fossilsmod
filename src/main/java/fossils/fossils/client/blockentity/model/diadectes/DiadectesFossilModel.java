package fossils.fossils.client.blockentity.model.diadectes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DiadectesFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart diadectes;
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
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
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
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public DiadectesFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.diadectes = this.fossil.getChild("diadectes");
		this.hips = this.diadectes.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
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
		this.bone3 = this.chest.getChild("bone3");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition diadectes = fossil.addOrReplaceChild("diadectes", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.0F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = diadectes.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9196F, 18.4022F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 97).addBox(0.0F, -2.4963F, 0.0626F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7266F, 2.8245F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 97).addBox(0.0F, -2.8051F, 0.0273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, 0.9245F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 97).addBox(0.0F, -3.0139F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, -0.9755F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 24).addBox(0.0F, -3.1227F, -0.0434F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -2.8755F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 31).mirror().addBox(-2.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(40, 31).addBox(0.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-0.5F, -1.0904F, -0.109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4774F, 2.2686F, -0.0034F, 0.1087F, 0.6782F, -1.4167F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, 2.375F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 73).addBox(-0.5F, -1.625F, -0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(101, 87).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 4.4552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(89, 91).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 4.5264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(97, 16).addBox(-0.475F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1711F, 4.3467F, -1.1801F, -0.5345F, -0.0141F, 0.0055F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(84, 88).addBox(-0.5F, -2.225F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(48, 82).addBox(-0.5F, -2.4F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 1.753F, 0.3096F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(82, 62).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1864F, 0.3672F, 0.0319F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1015F, 5.9802F, -1.6137F, 1.2916F, -0.9629F, 0.4228F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(84, 54).addBox(-0.5901F, 2.3768F, -0.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0078F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(101, 56).addBox(-0.5F, -0.45F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(1.1699F, 6.6376F, 0.8975F, -1.2217F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(97, 101).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4409F, 5.4366F, 0.7358F, -0.8727F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -4.5F, -0.525F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0387F, 5.083F, 0.8684F, -0.1745F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(74, 88).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(93, 95).addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1213F, 1.6649F, 0.4205F, 0.1745F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r7 = Rightshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(88, 47).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1213F, 1.6649F, 0.4205F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r8 = Rightshin.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(0, 78).addBox(-0.4039F, -2.9602F, -1.5071F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -0.4F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0827F, 7.7886F, 0.5834F, -0.3517F, 0.55F, 1.0602F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -1.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offset(3.0195F, 0.6233F, 1.0F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4774F, 2.2686F, -0.0034F, -0.3439F, -0.2911F, 1.9674F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(7, 87).addBox(-0.5F, 2.375F, -1.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(79, 87).addBox(-0.5F, -1.625F, -0.625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1787F, 4.4552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 4.5264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(97, 12).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(97, 30).addBox(-0.525F, -1.0F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1711F, 4.3467F, -1.1801F, -0.5345F, 0.0141F, -0.0055F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(53, 90).addBox(-0.5F, -2.225F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(87, 4).addBox(-0.5F, -2.4F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 1.753F, 0.3096F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(83, 13).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1864F, 0.3672F, 0.0319F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1015F, 5.9802F, -1.6137F, 1.0759F, 0.8815F, -0.777F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(86, 69).addBox(-0.4099F, 2.3768F, -0.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0078F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(101, 63).addBox(-0.5F, -0.45F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.1699F, 6.6376F, 0.8975F, -1.2217F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, 0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4409F, 5.4366F, 0.7358F, -0.8727F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, -4.5F, -0.525F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0387F, 5.083F, 0.8684F, -0.1745F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(38, 90).addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(10, 96).addBox(-0.5F, -1.6F, -0.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1213F, 1.6649F, 0.4205F, 0.1745F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r7 = Leftshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(48, 88).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1213F, 1.6649F, 0.4205F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r8 = Leftshin.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5961F, -2.9602F, -1.5071F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(19, 49).addBox(-3.0F, -0.4F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0827F, 7.7886F, 0.5834F, -0.1203F, -0.5633F, -1.0188F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(23, 0).addBox(-5.0F, -1.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.0195F, 0.6233F, 1.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5734F, 3.526F, 1.3557F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(65, 95).addBox(-0.5F, -2.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0551F, -3.8105F, -2.12F, 0.0875F, 0.0962F, -0.0754F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(100, 50).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0551F, -3.8105F, -2.12F, -0.0434F, 0.0962F, -0.0754F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(88, 95).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 95).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0551F, -3.8105F, -2.12F, -0.7415F, 0.0962F, -0.0754F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(80, 80).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.94F, 0.3129F, 3.8062F, -2.1378F, 0.0962F, -0.0754F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(83, 28).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9152F, 0.9596F, 3.0438F, -0.8724F, 0.0962F, -0.0754F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(59, 31).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -2.3225F, -1.2458F, -0.3924F, 0.0962F, -0.0754F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(36, 81).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7609F, 1.4059F, 1.1004F, 0.2184F, 0.0962F, -0.0754F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(7, 91).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0509F, 0.7754F, -5.7474F, -0.7851F, 0.0962F, -0.0754F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(68, 100).addBox(-0.5F, -3.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(81, 38).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2824F, 1.4434F, -3.8765F, -0.3488F, 0.0962F, -0.0754F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(32, 59).addBox(-0.5F, -1.0F, -2.7F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3146F, -1.5683F, -1.1898F, 0.0003F, 0.0962F, -0.0754F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(74, 29).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1921F, -3.4628F, -0.9753F, -0.2179F, 0.0962F, -0.0754F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(29, 82).addBox(-0.2F, -0.076F, -2.0202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2622F, -6.3354F, -0.303F, -0.0434F, 0.0962F, -0.0754F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(21, 87).addBox(-0.2F, 0.124F, -2.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0383F, -5.8338F, 1.6201F, 0.6984F, 0.0962F, -0.0754F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(67, 81).addBox(-0.2F, -0.076F, -2.0202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0383F, -5.8338F, 1.6201F, -0.2615F, 0.0962F, -0.0754F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(14, 87).addBox(-0.2F, -0.376F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -5.5596F, 1.4987F, -0.4186F, 0.0962F, -0.0754F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.983F, -0.961F, 1.3557F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Hips_r16 = bone4.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(65, 95).mirror().addBox(-0.5F, -2.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0551F, 1.1895F, -2.12F, 0.0875F, -0.0962F, 0.0754F));

		PartDefinition Hips_r17 = bone4.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(100, 50).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0551F, 1.1895F, -2.12F, -0.0434F, -0.0962F, 0.0754F));

		PartDefinition Hips_r18 = bone4.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 95).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0551F, 1.1895F, -2.12F, -0.7415F, -0.0962F, 0.0754F));

		PartDefinition Hips_r19 = bone4.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.94F, 5.3129F, 3.8062F, -2.1378F, -0.0962F, 0.0754F));

		PartDefinition Hips_r20 = bone4.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9152F, 5.9596F, 3.0438F, -0.8724F, -0.0962F, 0.0754F));

		PartDefinition Hips_r21 = bone4.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, 2.6776F, -1.2458F, -0.3924F, -0.0962F, 0.0754F));

		PartDefinition Hips_r22 = bone4.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(36, 81).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7609F, 6.4059F, 1.1004F, 0.2184F, -0.0962F, 0.0754F));

		PartDefinition Hips_r23 = bone4.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(7, 91).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0509F, 5.7754F, -5.7474F, -0.7851F, -0.0962F, 0.0754F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(68, 100).mirror().addBox(-0.5F, -3.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(81, 38).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2824F, 6.4434F, -3.8765F, -0.3488F, -0.0962F, 0.0754F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-0.5F, -1.0F, -2.7F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3146F, 3.4317F, -1.1898F, 0.0003F, -0.0962F, 0.0754F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1921F, 1.5372F, -0.9753F, -0.2179F, -0.0962F, 0.0754F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-0.8F, -0.076F, -2.0202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2622F, -1.3354F, -0.303F, -0.0434F, -0.0962F, 0.0754F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-0.8F, 0.124F, -2.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0383F, -0.8338F, 1.6201F, 0.6984F, -0.0962F, 0.0754F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(67, 81).mirror().addBox(-0.8F, -0.076F, -2.0202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0383F, -0.8338F, 1.6201F, -0.2615F, -0.0962F, 0.0754F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(14, 87).mirror().addBox(-0.8F, -0.376F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, -0.4186F, -0.0962F, 0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6591F, 4.5244F, 0.1208F, 0.1733F, 0.0209F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 102).addBox(0.0F, -1.5782F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6844F, 5.8155F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 37).addBox(0.0F, -1.8562F, 0.0405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8844F, 3.9155F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(102, 29).addBox(0.0F, -1.9496F, -0.0807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0844F, 2.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(97, 79).addBox(0.0F, -0.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9939F, 6.4706F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 95).addBox(0.0F, -0.9369F, -0.3783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1494F, 4.3415F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 99).addBox(0.0F, -0.7369F, -0.3783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1669F, 2.3328F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 102).addBox(0.0F, 0.0631F, -0.3783F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1843F, 0.3242F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 102).addBox(0.0F, -2.0369F, 0.0217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 44).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9798F, 7.2921F, -0.0246F, 0.2181F, -0.0053F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 73).addBox(0.0F, -1.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 60).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(70, 103).addBox(0.0F, -1.353F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 102).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8849F, 5.3447F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 102).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3024F, 3.3395F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 103).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8198F, 1.3352F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(56, 102).addBox(0.0F, -1.4169F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-1.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 68).addBox(0.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, 0.0509F, 0.218F, -0.0079F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(59, 12).addBox(-0.5F, -0.6757F, 3.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 94).addBox(-0.5F, -0.7757F, 1.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 87).addBox(-0.5F, -0.8257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(104, 3).addBox(0.0F, 0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6557F, 1.7496F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(103, 97).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0382F, 3.7617F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 55).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1062F, 0.2613F, -0.0162F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(104, 23).addBox(0.0F, 0.4F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 20).addBox(0.0F, 0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 6).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 63).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(38, 50).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0449F, 0.218F, -0.0097F));

		PartDefinition cube_r31 = tail5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(27, 104).addBox(0.0F, 0.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 104).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, -4.793F, 0.096F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3823F, -3.1544F, -0.1879F, -0.1368F, -0.0181F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(27, 93).addBox(0.0F, -3.0336F, 0.0403F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, -1.9819F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 99).addBox(0.0F, -2.921F, 0.0427F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1254F, -3.9819F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(78, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -1.4788F, 0.4298F, 0.3516F, -0.5417F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(102, 76).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -1.4788F, 0.285F, 0.5144F, -0.8828F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(102, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -3.4788F, 0.3472F, 0.3119F, -0.5841F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(102, 72).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -3.4788F, 0.2171F, 0.4507F, -0.9298F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(62, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -5.4788F, 0.4595F, 0.3899F, -0.5608F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -5.4788F, 0.3004F, 0.5598F, -0.9048F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(102, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4788F, 0.4191F, 0.3524F, -0.4546F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(92, 85).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4788F, 0.2739F, 0.5118F, -0.7975F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(100, 82).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4788F, 0.0362F, 0.5737F, -1.2516F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(78, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -1.4788F, 0.4298F, -0.3516F, 0.5417F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(102, 76).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -1.4788F, 0.285F, -0.5144F, 0.8828F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(102, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -3.4788F, 0.3472F, -0.3119F, 0.5841F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(102, 72).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -3.4788F, 0.2171F, -0.4507F, 0.9298F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(62, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -5.4788F, 0.4595F, -0.3899F, 0.5608F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 93).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -5.4788F, 0.3004F, -0.5598F, 0.9048F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(102, 41).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4788F, 0.4191F, -0.3524F, 0.4546F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(92, 85).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4788F, 0.2739F, -0.5118F, 0.7975F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(100, 82).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4788F, 0.0362F, -0.5737F, 1.2516F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(28, 99).addBox(0.0F, -2.7039F, -0.0547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2254F, -5.8819F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(53, 100).addBox(0.0F, -2.2957F, 0.052F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4254F, -7.9819F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(19, 31).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5275F, -0.5314F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 39).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8418F, -7.9575F, -0.0294F, -0.1308F, 0.0038F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(100, 67).addBox(0.0F, -2.1948F, -0.984F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5094F, -0.9507F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(83, 102).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.3552F, 0.2843F, -0.3635F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(93, 46).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.2353F, 0.4273F, -0.7039F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.0423F, 0.4826F, -1.1374F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-1.8324F, -0.1628F, -0.6031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.348F, 0.259F, -0.5594F));

		PartDefinition Bodyfront_r23 = body2.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-3.6623F, -0.7744F, -0.6782F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.2373F, 0.4011F, -0.897F));

		PartDefinition Bodyfront_r24 = body2.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(63, 29).mirror().addBox(-7.0872F, -2.117F, -0.6782F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.0564F, 0.4596F, -1.325F));

		PartDefinition Bodyfront_r25 = body2.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(83, 102).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.3552F, -0.2843F, 0.3635F));

		PartDefinition Bodyfront_r26 = body2.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(93, 46).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.2353F, -0.4273F, 0.7039F));

		PartDefinition Bodyfront_r27 = body2.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(81, 43).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.0423F, -0.4826F, 1.1374F));

		PartDefinition Bodyfront_r28 = body2.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(35, 95).addBox(-0.1676F, -0.1628F, -0.6031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.348F, -0.259F, 0.5594F));

		PartDefinition Bodyfront_r29 = body2.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(89, 65).addBox(1.6623F, -0.7744F, -0.6782F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.2373F, -0.4011F, 0.897F));

		PartDefinition Bodyfront_r30 = body2.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(63, 29).addBox(3.0871F, -2.117F, -0.6782F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.0564F, -0.4596F, 1.325F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(81, 97).addBox(0.0F, -2.2212F, -0.7673F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.1507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(23, 15).addBox(-2.5F, -2.125F, -5.1F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.0308F, 3.177F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(58, 63).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, 0.0498F, -0.1307F, -0.0065F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 103).addBox(0.0F, -1.4509F, -0.8779F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -4.0507F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(46, 12).mirror().addBox(-8.1027F, -2.1076F, -0.6657F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, 0.0169F, 0.3523F, -1.304F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-3.6731F, -0.7598F, -0.6657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, 0.1551F, 0.3181F, -0.8894F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(95, 37).mirror().addBox(-1.8371F, -0.1455F, -0.5903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, 0.2449F, 0.2064F, -0.5466F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-1.8397F, -0.1311F, -0.5876F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, 0.2488F, 0.1991F, -0.4779F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-3.6806F, -0.7472F, -0.6632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, 0.1614F, 0.3125F, -0.8195F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(71, 68).mirror().addBox(-7.1145F, -2.0988F, -0.6632F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, 0.0252F, 0.3496F, -1.2332F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(32, 57).mirror().addBox(-7.1541F, -4.1411F, -0.6632F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, -0.0854F, 0.3403F, -1.5578F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(91, 67).mirror().addBox(-7.9965F, -4.3961F, -0.6573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0887F, 0.319F, -1.5669F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-7.1384F, -2.08F, -0.6573F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, 0.0298F, 0.3294F, -1.1986F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(92, 8).mirror().addBox(-3.6955F, -0.7207F, -0.6573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, 0.1571F, 0.2922F, -0.7877F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(-1.8393F, -0.1379F, -0.5812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, 0.2299F, 0.1915F, -0.4901F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(46, 12).addBox(3.1027F, -2.1076F, -0.6657F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, 0.0169F, -0.3523F, 1.304F));

		PartDefinition Bodyfront_r43 = body3.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(90, 42).addBox(1.6731F, -0.7598F, -0.6657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, 0.1551F, -0.3181F, 0.8894F));

		PartDefinition Bodyfront_r44 = body3.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(95, 37).addBox(-0.1629F, -0.1455F, -0.5903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, 0.2449F, -0.2064F, 0.5466F));

		PartDefinition Bodyfront_r45 = body3.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(90, 16).addBox(-0.1603F, -0.1311F, -0.5876F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, 0.2488F, -0.1991F, 0.4779F));

		PartDefinition Bodyfront_r46 = body3.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(92, 22).addBox(1.6806F, -0.7472F, -0.6632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, 0.1614F, -0.3125F, 0.8195F));

		PartDefinition Bodyfront_r47 = body3.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(71, 68).addBox(3.1145F, -2.0988F, -0.6632F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, 0.0252F, -0.3496F, 1.2332F));

		PartDefinition Bodyfront_r48 = body3.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(32, 57).addBox(6.1541F, -4.1411F, -0.6632F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, -0.0854F, -0.3403F, 1.5578F));

		PartDefinition Bodyfront_r49 = body3.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(91, 67).addBox(5.9965F, -4.3961F, -0.6573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0887F, -0.319F, 1.5669F));

		PartDefinition Bodyfront_r50 = body3.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(72, 45).addBox(3.1384F, -2.08F, -0.6573F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, 0.0298F, -0.3294F, 1.1986F));

		PartDefinition Bodyfront_r51 = body3.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(92, 8).addBox(1.6955F, -0.7207F, -0.6573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, 0.1571F, -0.2922F, 0.7877F));

		PartDefinition Bodyfront_r52 = body3.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(94, 35).addBox(-0.1607F, -0.1379F, -0.5812F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, 0.2299F, -0.1915F, 0.4901F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(102, 16).addBox(0.0F, -2.0942F, 0.0316F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -0.9507F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(88, 102).addBox(0.0F, -1.8366F, 0.0412F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -2.9507F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 23).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.9416F, 2.6284F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(63, 22).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.8803F, 0.0756F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 102).addBox(0.0F, -1.4157F, 0.0286F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -1.9507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r53 = body4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(53, 95).mirror().addBox(-1.8478F, -0.0855F, -0.5628F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1212F, 0.1194F, -0.4479F));

		PartDefinition Bodyfront_r54 = body4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-3.7047F, -0.7073F, -0.6391F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0666F, 0.195F, -0.7931F));

		PartDefinition Bodyfront_r55 = body4.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(76, 26).mirror().addBox(-7.152F, -2.0711F, -0.6391F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0142F, 0.2054F, -1.1938F));

		PartDefinition Bodyfront_r56 = body4.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(81, 52).mirror().addBox(-9.1982F, -4.1259F, -0.6391F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.076F, 0.1915F, -1.505F));

		PartDefinition Bodyfront_r57 = body4.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(83, 45).mirror().addBox(-9.0406F, -4.382F, -0.6259F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, -0.0775F, 0.1528F, -1.5142F));

		PartDefinition Bodyfront_r58 = body4.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(77, 60).mirror().addBox(-7.175F, -2.0518F, -0.6259F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, -0.0201F, 0.17F, -1.1609F));

		PartDefinition Bodyfront_r59 = body4.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-3.7185F, -0.6806F, -0.6259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, 0.0471F, 0.1647F, -0.7626F));

		PartDefinition Bodyfront_r60 = body4.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-1.8512F, -0.0558F, -0.5492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -3.2272F, 0.0927F, 0.0974F, -0.417F));

		PartDefinition Bodyfront_r61 = body4.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(53, 95).addBox(-0.1522F, -0.0855F, -0.5628F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1212F, -0.1194F, 0.4479F));

		PartDefinition Bodyfront_r62 = body4.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(95, 39).addBox(1.7047F, -0.7073F, -0.6391F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0666F, -0.195F, 0.7931F));

		PartDefinition Bodyfront_r63 = body4.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(76, 26).addBox(3.152F, -2.0711F, -0.6391F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0142F, -0.2054F, 1.1938F));

		PartDefinition Bodyfront_r64 = body4.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(81, 52).addBox(6.1982F, -4.1259F, -0.6391F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.076F, -0.1915F, 1.505F));

		PartDefinition Bodyfront_r65 = body4.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(83, 45).addBox(6.0406F, -4.382F, -0.6259F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, -0.0775F, -0.1528F, 1.5142F));

		PartDefinition Bodyfront_r66 = body4.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(77, 60).addBox(3.175F, -2.0518F, -0.6259F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, -0.0201F, -0.17F, 1.1609F));

		PartDefinition Bodyfront_r67 = body4.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(92, 6).addBox(1.7185F, -0.6806F, -0.6259F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, 0.0471F, -0.1647F, 0.7626F));

		PartDefinition Bodyfront_r68 = body4.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(92, 4).addBox(-0.1488F, -0.0558F, -0.5492F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -3.2272F, 0.0927F, -0.0974F, 0.417F));

		PartDefinition cube_r48 = body4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(91, 102).addBox(0.0F, -1.2585F, 0.0302F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(44, 15).addBox(-2.0F, -2.05F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.6117F, 1.7751F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(65, 0).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -4.8855F, 0.0756F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(103, 68).addBox(0.0F, -1.6932F, 0.0552F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -0.9507F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, -1.4369F, 0.0333F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -2.9507F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(102, 101).addBox(0.0F, -1.7716F, -0.0221F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2768F, -4.863F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r69 = chest.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(93, 69).mirror().addBox(-1.8522F, -0.0408F, -0.5459F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.0127F, 0.0617F, -0.4407F));

		PartDefinition Bodyfront_r70 = chest.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(93, 58).mirror().addBox(-3.7247F, -0.6668F, -0.6228F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0163F, 0.1041F, -0.7884F));

		PartDefinition Bodyfront_r71 = chest.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-8.2905F, -3.7873F, -0.8407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.1127F, 0.0866F, -1.4879F));

		PartDefinition Bodyfront_r72 = chest.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-6.186F, -2.0415F, -0.6228F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.055F, 0.0899F, -1.1828F));

		PartDefinition Bodyfront_r73 = chest.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(-7.2452F, -3.8257F, -0.6324F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0853F, 0.0872F, -1.5932F));

		PartDefinition Bodyfront_r74 = chest.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-6.1529F, -2.0714F, -0.6324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0552F, 0.1088F, -1.2871F));

		PartDefinition Bodyfront_r75 = chest.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-3.7056F, -0.7072F, -0.6324F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0092F, 0.1216F, -0.8919F));

		PartDefinition Bodyfront_r76 = chest.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(92, 44).mirror().addBox(-1.8483F, -0.0852F, -0.556F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.0255F, 0.0757F, -0.5441F));

		PartDefinition Bodyfront_r77 = chest.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(93, 48).mirror().addBox(-1.5798F, 0.0372F, -0.5496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0564F, 0.0922F, -0.5241F));

		PartDefinition Bodyfront_r78 = chest.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(92, 24).mirror().addBox(-3.4951F, -0.5009F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0144F, 0.1475F, -0.8713F));

		PartDefinition Bodyfront_r79 = chest.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-6.0374F, -1.8003F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, -0.0435F, 0.1417F, -1.2681F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(71, 77).mirror().addBox(-4.162F, -0.7745F, 3.9566F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.1457F, -6.2175F, 0.0361F, 0.2616F, 0.0094F));

		PartDefinition Bodyfront_r80 = chest.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(93, 69).addBox(-0.1478F, -0.0408F, -0.5459F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.0127F, -0.0617F, 0.4407F));

		PartDefinition Bodyfront_r81 = chest.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(93, 58).addBox(1.7247F, -0.6668F, -0.6228F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0163F, -0.1041F, 0.7884F));

		PartDefinition Bodyfront_r82 = chest.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(83, 18).addBox(5.2905F, -3.7873F, -0.8407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.1127F, -0.0866F, 1.4879F));

		PartDefinition Bodyfront_r83 = chest.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(84, 58).addBox(3.186F, -2.0415F, -0.6228F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.055F, -0.0899F, 1.1828F));

		PartDefinition Bodyfront_r84 = chest.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(93, 50).addBox(5.2452F, -3.8257F, -0.6324F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0853F, -0.0872F, 1.5932F));

		PartDefinition Bodyfront_r85 = chest.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(85, 36).addBox(3.1529F, -2.0714F, -0.6324F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0552F, -0.1088F, 1.2871F));

		PartDefinition Bodyfront_r86 = chest.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(90, 52).addBox(1.7056F, -0.7072F, -0.6324F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0092F, -0.1216F, 0.8919F));

		PartDefinition Bodyfront_r87 = chest.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(92, 44).addBox(-0.1517F, -0.0852F, -0.556F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.0255F, -0.0757F, 0.5441F));

		PartDefinition Bodyfront_r88 = chest.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(93, 48).addBox(-0.4202F, 0.0372F, -0.5496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0564F, -0.0922F, 0.5241F));

		PartDefinition Bodyfront_r89 = chest.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(92, 24).addBox(1.4951F, -0.5009F, -0.6156F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0144F, -0.1475F, 0.8713F));

		PartDefinition Bodyfront_r90 = chest.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(82, 67).addBox(3.0374F, -1.8003F, -0.6156F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, -0.0435F, -0.1417F, 1.2681F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 77).addBox(2.162F, -0.7745F, 3.9566F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 10.1457F, -6.2175F, 0.0361F, -0.2616F, -0.0094F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(62, 77).addBox(-1.0F, -0.7745F, 4.4448F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.1457F, -6.2175F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 8).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.1457F, -6.2175F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(46, 8).addBox(-3.0F, -0.2F, -1.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.2139F, -6.3652F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(76, 13).addBox(-0.599F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(26, 69).addBox(-0.599F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4095F, 9.2333F, -4.2865F, 0.2977F, 0.0434F, -1.6962F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(17, 95).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(89, 60).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(29, 76).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(48, 93).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(92, 31).addBox(-0.3997F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8686F, 7.0572F, -0.5472F, -1.5662F, 0.2156F, 0.0344F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(43, 89).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(87, 20).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(58, 90).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(74, 81).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, -0.4F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.0179F, 0.1562F, 1.3891F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0086F, -0.0005F, -0.1229F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(22, 76).addBox(-0.401F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(70, 47).addBox(-0.401F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4095F, 9.2333F, -4.2865F, 0.1791F, 0.34F, 1.4883F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(94, 91).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(92, 81).addBox(-0.6003F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8686F, 7.0572F, -0.5472F, -1.9601F, -0.3404F, 0.164F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(90, 26).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(28, 87).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(63, 90).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(95, 26).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(43, 82).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(55, 39).addBox(-2.0F, -0.4F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.057F, -0.1543F, -1.6983F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(0, 8).addBox(-5.0F, -1.0F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0086F, 0.0005F, 0.1229F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.3298F, 1.3421F, -3.5144F, -0.087F, 0.1385F, -0.0003F));

		PartDefinition Bodyfront_r91 = bone.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(50, 70).addBox(-1.2443F, -3.8039F, -1.4102F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, 1.3054F, 0.0059F, 0.0237F));

		PartDefinition Bodyfront_r92 = bone.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(78, 0).addBox(-1.0569F, -1.7505F, 1.9427F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, 0.734F, 0.0524F, 0.0175F));

		PartDefinition Bodyfront_r93 = bone.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(79, 70).addBox(-0.2273F, -4.0557F, 1.2618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, 0.1531F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r94 = bone.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(70, 54).addBox(-0.2273F, -8.365F, -2.3985F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.7195F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r95 = bone.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(12, 91).addBox(-0.2273F, -8.7904F, 0.0794F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.4141F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r96 = bone.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(97, 41).addBox(-0.2273F, -7.4771F, -4.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -1.1122F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r97 = bone.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(13, 73).addBox(-0.2273F, -7.5756F, 1.4744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, 0.1095F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r98 = bone.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(37, 75).addBox(-0.2273F, -6.0499F, -4.8618F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.7632F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r99 = bone.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(61, 70).addBox(-0.2273F, -5.8373F, -2.4425F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.2832F, 0.0508F, -0.2447F));

		PartDefinition Bodyfront_r100 = bone.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(15, 65).addBox(-1.0569F, -2.9528F, -1.2254F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, 0.1667F, 0.0524F, 0.0175F));

		PartDefinition Bodyfront_r101 = bone.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(63, 15).addBox(-1.0F, 0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.111F, 7.778F, -0.5438F, -0.0819F, -0.0948F, 0.8662F));

		PartDefinition Bodyfront_r102 = bone.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(55, 47).addBox(-1.0F, 0.1F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.111F, 7.778F, -0.5438F, 0.1362F, -0.0948F, 0.8662F));

		PartDefinition Bodyfront_r103 = bone.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(38, 39).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2366F, 6.3149F, -0.7749F, 0.1658F, 0.0F, 0.2618F));

		PartDefinition Bodyfront_r104 = bone.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(70, 70).addBox(-1.0569F, -0.6899F, -3.5383F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.4005F, 0.0524F, 0.0175F));

		PartDefinition Bodyfront_r105 = bone.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(46, 76).addBox(-1.0569F, -2.4382F, -3.5609F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2727F, 4.8694F, -0.3148F, -0.7496F, 0.0524F, 0.0175F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.3298F, 1.3421F, -3.5144F, -0.087F, -0.1385F, 0.0003F));

		PartDefinition Bodyfront_r106 = bone3.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(0.2443F, -3.8039F, -1.4102F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, 1.3054F, -0.0059F, -0.0237F));

		PartDefinition Bodyfront_r107 = bone3.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0569F, -1.7505F, 1.9427F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, 0.734F, -0.0524F, -0.0175F));

		PartDefinition Bodyfront_r108 = bone3.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(79, 70).mirror().addBox(-0.7727F, -4.0557F, 1.2618F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, 0.1531F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r109 = bone3.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(70, 54).mirror().addBox(-0.7727F, -8.365F, -2.3985F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.7195F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r110 = bone3.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.7727F, -8.7904F, 0.0794F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.4141F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r111 = bone3.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(97, 41).mirror().addBox(-0.7727F, -7.4771F, -4.73F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -1.1122F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r112 = bone3.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(13, 73).mirror().addBox(-0.7727F, -7.5756F, 1.4744F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, 0.1095F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r113 = bone3.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-0.7727F, -6.0499F, -4.8618F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.7632F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r114 = bone3.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(61, 70).mirror().addBox(-0.7727F, -5.8373F, -2.4425F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.2832F, -0.0508F, 0.2447F));

		PartDefinition Bodyfront_r115 = bone3.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(15, 65).mirror().addBox(0.0569F, -2.9528F, -1.2254F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, 0.1667F, -0.0524F, -0.0175F));

		PartDefinition Bodyfront_r116 = bone3.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(0.0F, 0.3F, -1.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.111F, 7.778F, -0.5438F, -0.0819F, 0.0948F, -0.8662F));

		PartDefinition Bodyfront_r117 = bone3.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(55, 47).mirror().addBox(0.0F, 0.1F, -2.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.111F, 7.778F, -0.5438F, 0.1362F, 0.0948F, -0.8662F));

		PartDefinition Bodyfront_r118 = bone3.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2366F, 6.3149F, -0.7749F, 0.1658F, 0.0F, -0.2618F));

		PartDefinition Bodyfront_r119 = bone3.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(0.0569F, -0.6899F, -3.5383F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.4005F, -0.0524F, -0.0175F));

		PartDefinition Bodyfront_r120 = bone3.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(0.0569F, -2.4382F, -3.5609F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2727F, 4.8694F, -0.3148F, -0.7496F, -0.0524F, -0.0175F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, -0.1255F, -0.387F, -0.0685F));

		PartDefinition cube_r60 = neck.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(48, 103).addBox(-0.5F, -1.1505F, 0.0535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.0392F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r121 = neck.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.9909F, 0.3762F, 0.3109F, -0.6729F));

		PartDefinition Bodyfront_r122 = neck.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.9909F, 0.2465F, 0.459F, -1.0146F));

		PartDefinition Bodyfront_r123 = neck.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, -0.0124F, 0.2235F, -1.2974F));

		PartDefinition Bodyfront_r124 = neck.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0753F, 0.211F, -0.8953F));

		PartDefinition Bodyfront_r125 = neck.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(8, 103).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.1348F, 0.1315F, -0.5502F));

		PartDefinition Bodyfront_r126 = neck.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(94, 10).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.9909F, 0.2465F, -0.459F, 1.0146F));

		PartDefinition Bodyfront_r127 = neck.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(103, 66).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.9909F, 0.3762F, -0.3109F, 0.6729F));

		PartDefinition Bodyfront_r128 = neck.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(34, 103).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, -0.0124F, -0.2235F, 1.2974F));

		PartDefinition Bodyfront_r129 = neck.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(93, 71).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0753F, -0.211F, 0.8953F));

		PartDefinition Bodyfront_r130 = neck.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(8, 103).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.1348F, -0.1315F, 0.5502F));

		PartDefinition cube_r61 = neck.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 90).addBox(-0.5F, -1.672F, -2.0499F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.9392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r62 = neck.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(63, 8).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5753F, -4.8025F, -0.1637F, -0.3448F, 0.0558F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, 1.3017F, -8.1683F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 13).addBox(-1.0F, 0.773F, -0.4012F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(0, 90).addBox(-1.0F, 0.473F, -0.4012F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1588F, -7.9588F, -0.3534F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 88).addBox(-1.0F, -0.1548F, -0.8569F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1588F, -7.9588F, 0.9381F, 0.0F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(58, 99).addBox(-0.5F, -0.0102F, -1.0026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5133F, -7.2361F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 10).addBox(-1.0F, -0.0176F, -0.9704F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.9883F, -6.4111F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 23).addBox(-2.0F, -1.5F, 0.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.014F))
				.texOffs(71, 63).addBox(-1.0F, -0.5F, -2.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.924F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(45, 59).addBox(-2.0F, -0.05F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -0.9666F, -6.4158F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 20).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.8269F, -3.982F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(76, 10).addBox(-1.4F, -0.125F, -0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -1.3156F, 0.4636F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(96, 64).addBox(-0.5F, -0.325F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.2515F, -1.5893F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(76, 7).addBox(-2.5F, -0.05F, 0.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -2.2998F, -0.3231F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 35).addBox(-2.5F, -0.05F, -0.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.2998F, -0.3231F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(72, 39).addBox(-0.5F, -1.5F, -1.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.3976F, -1.555F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(76, 23).addBox(-2.5F, -0.025F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -2.1858F, -2.2723F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, -0.025F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -2.3852F, -1.2924F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(37, 70).addBox(-2.0F, 0.8F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.625F, -4.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(22, 91).addBox(-0.1211F, -1.3782F, -3.9809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2548F, 0.2675F, 0.315F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 98).addBox(-0.3F, -3.4037F, -5.1823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.2793F, 0.2618F, 0.0698F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(97, 73).addBox(-1.3438F, -4.4985F, 1.4817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 1.8153F, 0.0082F, 0.0384F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(98, 95).addBox(-0.0176F, -0.0129F, 4.5432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 3.0545F, 0.2831F, 0.0385F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(102, 13).addBox(-0.0176F, 4.5125F, 1.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -2.2339F, 0.2831F, 0.0385F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(73, 97).addBox(-0.0176F, 3.4208F, -3.973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -1.1343F, 0.2831F, 0.0385F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(88, 38).addBox(-1.4615F, -3.4432F, -4.148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(99, 91).addBox(-0.3F, -4.3589F, -5.3774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.48F, 0.2618F, 0.0698F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(78, 93).addBox(-2.8951F, 2.9768F, -8.3618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(102, 10).addBox(-1.3283F, -4.165F, 1.7766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 1.8851F, 0.0082F, 0.021F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(53, 97).addBox(-1.3283F, -3.2817F, -4.0513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.3667F, 0.0082F, 0.021F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(99, 20).addBox(-1.3283F, -1.078F, -5.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.2093F, 0.0082F, 0.021F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(92, 73).addBox(-0.2353F, -1.9974F, -5.1446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(60, 81).addBox(-0.2353F, -1.9974F, -6.4446F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.1849F, 0.2459F, -0.0169F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(53, 81).addBox(0.2886F, -1.1605F, -7.679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.0501F, 0.3316F, 0.0F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(96, 87).addBox(-3.0452F, 3.9619F, -5.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.6917F, -0.1028F, -0.1397F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(96, 54).addBox(-3.0138F, 3.3043F, -7.2709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.5187F, -0.0742F, -0.1383F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(83, 93).addBox(-2.6327F, 2.8547F, -8.2368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.3925F, -0.0134F, -0.0323F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(87, 99).addBox(0.1997F, -4.2564F, -6.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.4683F, 0.3401F, 0.0715F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 100).addBox(-1.3656F, -6.1871F, -5.9554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.7536F, 0.1573F, 0.0876F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 99).addBox(-1.8603F, -6.1912F, -5.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.7567F, 0.1147F, 0.1076F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(35, 97).addBox(-0.6192F, -5.1457F, -6.0644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.5658F, 0.2518F, 0.0885F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 84).addBox(-0.1839F, -4.0943F, -6.0064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.379F, 0.3148F, 0.106F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(101, 53).addBox(0.1997F, -5.2968F, -6.8277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(43, 101).addBox(0.1997F, -5.2968F, -6.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.6429F, 0.3401F, 0.0715F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(100, 79).addBox(0.4717F, -0.5692F, -8.8271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.032F, 0.3401F, 0.0715F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 100).addBox(0.4717F, -6.2794F, -6.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.7738F, 0.3401F, 0.0715F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(5, 100).addBox(0.1997F, -1.6086F, -8.4923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.1629F, 0.3401F, 0.0715F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(99, 84).addBox(0.1997F, -0.9091F, -8.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.0756F, 0.3401F, 0.0715F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(63, 99).addBox(0.1997F, -1.0221F, -7.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.0931F, 0.3401F, 0.0715F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(73, 93).addBox(-0.3F, -2.4274F, -6.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.1571F, 0.2618F, 0.0698F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(17, 91).addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3789F, -0.2914F, -4.2431F, 0.2269F, 0.0029F, -0.0128F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(26, 65).addBox(-0.3F, -2.8073F, -5.4187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, 0.2269F, 0.2618F, 0.0698F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(101, 34).addBox(-1.1992F, 2.0809F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -3.1154F, 0.0873F, 0.0F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(10, 100).addBox(-1.1992F, 2.1243F, -1.3246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -2.2864F, 0.0873F, 0.0F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(81, 47).addBox(-1.1992F, 0.7976F, -3.26F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -1.3701F, 0.0873F, 0.0F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(85, 80).addBox(-0.8518F, -0.1555F, -1.2023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -1.4371F, 0.1554F, -0.2636F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(85, 32).addBox(-0.8518F, 0.2383F, -1.1185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -1.6815F, 0.1554F, -0.2636F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(85, 0).addBox(-0.8518F, 1.0664F, -0.9168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -1.856F, 0.1554F, -0.2636F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(91, 54).addBox(-0.8518F, -0.36F, -2.6594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.5819F, 0.1554F, -0.2636F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(80, 75).addBox(-0.8518F, -1.036F, -4.4756F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3403F, 0.6218F, 0.0077F, -0.3201F, 0.1554F, -0.2636F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(22, 91).mirror().addBox(-0.8788F, -1.3782F, -3.9809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.2548F, 0.2675F, 0.315F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(43, 98).mirror().addBox(-0.7F, -3.4037F, -5.1823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.2793F, -0.2618F, -0.0698F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(0.3439F, -4.4985F, 1.4817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 1.8153F, -0.0082F, -0.0384F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.9824F, -0.0129F, 4.5432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 3.0545F, -0.2831F, -0.0385F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(102, 13).mirror().addBox(-0.9824F, 4.5125F, 1.9915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -2.2339F, -0.2831F, -0.0385F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(73, 97).mirror().addBox(-0.9824F, 3.4208F, -3.973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -1.1343F, -0.2831F, -0.0385F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(88, 38).mirror().addBox(0.4615F, -3.4432F, -4.148F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-0.7F, -4.3589F, -5.3774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.48F, -0.2618F, -0.0698F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 93).mirror().addBox(1.8951F, 2.9768F, -8.3618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(102, 10).mirror().addBox(0.3283F, -4.165F, 1.7766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 1.8851F, -0.0082F, -0.021F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(0.3283F, -3.2817F, -4.0513F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.3667F, -0.0082F, -0.021F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(99, 20).mirror().addBox(0.3283F, -1.078F, -5.2814F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.2093F, -0.0082F, -0.021F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-0.7647F, -1.9974F, -5.1446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(60, 81).mirror().addBox(-0.7647F, -1.9974F, -6.4446F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.1849F, -0.2459F, 0.0169F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 81).mirror().addBox(-1.2886F, -1.1605F, -7.679F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.0501F, -0.3316F, 0.0F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(2.0452F, 3.9619F, -5.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.6917F, 0.1028F, 0.1397F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(2.0138F, 3.3043F, -7.2709F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.5187F, 0.0742F, 0.1383F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(83, 93).mirror().addBox(1.6327F, 2.8547F, -8.2368F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.3925F, 0.0134F, 0.0323F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(87, 99).mirror().addBox(-1.1997F, -4.2564F, -6.3635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.4683F, -0.3401F, -0.0715F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(48, 100).mirror().addBox(0.3656F, -6.1871F, -5.9554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.7536F, -0.1573F, -0.0876F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(92, 99).mirror().addBox(0.8603F, -6.1912F, -5.7675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.7567F, -0.1147F, -0.1076F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 97).mirror().addBox(-0.3808F, -5.1457F, -6.0644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.5658F, -0.2518F, -0.0885F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.8161F, -4.0943F, -6.0064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.379F, -0.3148F, -0.106F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-1.1997F, -5.2968F, -6.8277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(43, 101).mirror().addBox(-1.1997F, -5.2968F, -6.5277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.6429F, -0.3401F, -0.0715F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-1.4717F, -0.5692F, -8.8271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.032F, -0.3401F, -0.0715F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(73, 100).mirror().addBox(-1.4717F, -6.2794F, -6.3638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.7738F, -0.3401F, -0.0715F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-1.1997F, -1.6086F, -8.4923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.1629F, -0.3401F, -0.0715F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(99, 84).mirror().addBox(-1.1997F, -0.9091F, -8.2575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.0756F, -0.3401F, -0.0715F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 99).mirror().addBox(-1.1997F, -1.0221F, -7.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.0931F, -0.3401F, -0.0715F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(73, 93).mirror().addBox(-0.7F, -2.4274F, -6.4618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.1571F, -0.2618F, -0.0698F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3789F, -0.2914F, -4.2431F, 0.2269F, -0.0029F, 0.0128F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(26, 65).mirror().addBox(-0.7F, -2.8073F, -5.4187F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, 0.2269F, -0.2618F, -0.0698F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(101, 34).mirror().addBox(0.1992F, 2.0809F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -3.1154F, -0.0873F, 0.0F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(0.1992F, 2.1243F, -1.3246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -2.2864F, -0.0873F, 0.0F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(0.1992F, 0.7976F, -3.26F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -1.3701F, -0.0873F, 0.0F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(-0.1482F, -0.1555F, -1.2023F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -1.4371F, -0.1554F, 0.2636F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(85, 32).mirror().addBox(-0.1482F, 0.2383F, -1.1185F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -1.6815F, -0.1554F, 0.2636F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.1482F, 1.0664F, -0.9168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -1.856F, -0.1554F, 0.2636F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.1482F, -0.36F, -2.6594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.5819F, -0.1554F, 0.2636F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(80, 75).mirror().addBox(-0.1482F, -1.036F, -4.4756F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3403F, 0.6218F, 0.0077F, -0.3201F, -0.1554F, 0.2636F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create().texOffs(99, 60).addBox(1.269F, -0.01F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(99, 60).mirror().addBox(-2.269F, -0.01F, -0.4685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5126F, -0.904F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r155 = lower_jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(100, 44).mirror().addBox(0.0F, 1.3374F, 0.2615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.01F, -0.9685F, -1.3265F, -0.1745F, 0.0F));

		PartDefinition cube_r156 = lower_jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(100, 47).mirror().addBox(0.0F, 1.0158F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 26).mirror().addBox(0.0F, 0.5158F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.01F, -0.9685F, -0.7156F, -0.1745F, 0.0F));

		PartDefinition cube_r157 = lower_jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(0.0F, -0.0732F, -1.0038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.01F, -0.9685F, -0.1047F, -0.1745F, 0.0F));

		PartDefinition cube_r158 = lower_jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 94).addBox(3.0379F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.769F, -0.01F, -0.2685F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r159 = lower_jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(0.0664F, -1.4888F, -0.0367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.969F, 0.89F, -3.0685F, -3.0281F, -0.3796F, 0.0F));

		PartDefinition cube_r160 = lower_jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(99, 7).mirror().addBox(0.0795F, 0.3821F, -0.9174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, 0.1571F, -0.192F, 0.0F));

		PartDefinition cube_r161 = lower_jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(99, 4).mirror().addBox(0.1099F, 0.3853F, -1.197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, 0.1571F, -0.1222F, 0.0F));

		PartDefinition cube_r162 = lower_jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(99, 23).mirror().addBox(0.2849F, -1.4082F, -1.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(97, 76).mirror().addBox(-0.0401F, -1.4082F, -1.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 99).mirror().addBox(0.1099F, -0.7082F, -1.8075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, 0.8552F, -0.1222F, 0.0F));

		PartDefinition cube_r163 = lower_jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(48, 97).mirror().addBox(0.1099F, -1.7319F, -0.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, 1.9024F, -0.1222F, 0.0F));

		PartDefinition cube_r164 = lower_jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(0.0795F, -0.9462F, -0.1983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, 3.1241F, -0.192F, 0.0F));

		PartDefinition cube_r165 = lower_jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(-0.1205F, -0.3132F, -0.5216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 99).mirror().addBox(-0.1205F, -0.3132F, -0.1216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.269F, 1.19F, -4.8685F, -3.1241F, -0.192F, 0.0F));

		PartDefinition cube_r166 = lower_jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(22, 95).mirror().addBox(0.1982F, 0.099F, 0.4189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(92, 77).mirror().addBox(-0.2018F, -0.026F, 0.2189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.869F, 1.19F, -5.5685F, -2.1206F, 0.0698F, 0.0F));

		PartDefinition cube_r167 = lower_jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.3018F, -0.5248F, -0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.869F, 1.19F, -5.5685F, -2.2951F, 0.0698F, 0.0F));

		PartDefinition cube_r168 = lower_jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.4018F, -1.1426F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.869F, 1.19F, -5.5685F, -2.6005F, 0.0698F, 0.0F));

		PartDefinition cube_r169 = lower_jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(67, 86).mirror().addBox(-0.1336F, -0.2902F, 0.0932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 86).mirror().addBox(0.0664F, -0.9152F, -0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.969F, 0.89F, -3.0685F, -2.9671F, -0.3796F, 0.0F));

		PartDefinition cube_r170 = lower_jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(36, 86).mirror().addBox(0.0F, -2.2923F, 0.0748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.269F, -0.01F, -0.9685F, -3.098F, -0.1745F, 0.0F));

		PartDefinition cube_r171 = lower_jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(34, 100).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(34, 100).addBox(3.0379F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.769F, 1.7834F, -0.0773F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r172 = lower_jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 86).addBox(3.0379F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.769F, 1.7834F, -0.0773F, 0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r173 = lower_jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(100, 44).addBox(-1.0F, 1.3374F, 0.2615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.269F, -0.01F, -0.9685F, -1.3265F, 0.1745F, 0.0F));

		PartDefinition cube_r174 = lower_jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(100, 47).addBox(-1.0F, 1.0158F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 26).addBox(-1.0F, 0.5158F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.269F, -0.01F, -0.9685F, -0.7156F, 0.1745F, 0.0F));

		PartDefinition cube_r175 = lower_jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(94, 60).addBox(-1.0F, -0.0732F, -1.0038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.269F, -0.01F, -0.9685F, -0.1047F, 0.1745F, 0.0F));

		PartDefinition cube_r176 = lower_jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(60, 86).addBox(-1.0664F, -1.4888F, -0.0367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.969F, 0.89F, -3.0685F, -3.0281F, 0.3796F, 0.0F));

		PartDefinition cube_r177 = lower_jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(99, 7).addBox(-1.0795F, 0.3821F, -0.9174F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, 0.1571F, 0.192F, 0.0F));

		PartDefinition cube_r178 = lower_jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(99, 4).addBox(-1.1099F, 0.3853F, -1.197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, 0.1571F, 0.1222F, 0.0F));

		PartDefinition cube_r179 = lower_jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(99, 23).addBox(-1.2849F, -1.4082F, -1.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(97, 76).addBox(-0.9599F, -1.4082F, -1.9575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 99).addBox(-1.1099F, -0.7082F, -1.8075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, 0.8552F, 0.1222F, 0.0F));

		PartDefinition cube_r180 = lower_jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(48, 97).addBox(-1.1099F, -1.7319F, -0.6585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, 1.9024F, 0.1222F, 0.0F));

		PartDefinition cube_r181 = lower_jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 98).addBox(-1.0795F, -0.9462F, -0.1983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, 3.1241F, 0.192F, 0.0F));

		PartDefinition cube_r182 = lower_jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(20, 99).addBox(-0.8795F, -0.3132F, -0.5216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(15, 99).addBox(-0.8795F, -0.3132F, -0.1216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.269F, 1.19F, -4.8685F, -3.1241F, 0.192F, 0.0F));

		PartDefinition cube_r183 = lower_jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(22, 95).addBox(-1.1982F, 0.099F, 0.4189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(92, 77).addBox(-0.7982F, -0.026F, 0.2189F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.869F, 1.19F, -5.5685F, -2.1206F, -0.0698F, 0.0F));

		PartDefinition cube_r184 = lower_jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(5, 96).addBox(-0.6982F, -0.5248F, -0.0831F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.869F, 1.19F, -5.5685F, -2.2951F, -0.0698F, 0.0F));

		PartDefinition cube_r185 = lower_jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5982F, -1.1426F, -0.4011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.869F, 1.19F, -5.5685F, -2.6005F, -0.0698F, 0.0F));

		PartDefinition cube_r186 = lower_jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(67, 86).addBox(-0.8664F, -0.2902F, 0.0932F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 86).addBox(-1.0664F, -0.9152F, -0.0068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.969F, 0.89F, -3.0685F, -2.9671F, 0.3796F, 0.0F));

		PartDefinition cube_r187 = lower_jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(36, 86).addBox(-1.0F, -2.2923F, 0.0748F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.269F, -0.01F, -0.9685F, -3.098F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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