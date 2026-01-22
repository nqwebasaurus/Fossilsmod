package fossils.fossils.client.blockentity.model.eorhynchochelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EorhynchochelysFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart eorhynchochelys;
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
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw2;

	public EorhynchochelysFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.eorhynchochelys = this.fossil.getChild("eorhynchochelys");
		this.hips = this.eorhynchochelys.getChild("hips");
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
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head2 = this.neck3.getChild("head2");
		this.leftFace = this.head2.getChild("leftFace");
		this.rightFace = this.head2.getChild("rightFace");
		this.lower_jaw2 = this.head2.getChild("lower_jaw2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition eorhynchochelys = fossil.addOrReplaceChild("eorhynchochelys", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition hips = eorhynchochelys.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.5223F, 13.8744F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 19).addBox(-0.5F, -1.9051F, 0.0273F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(26, 105).addBox(0.0F, -1.9051F, 0.0273F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, 0.9245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 26).addBox(-1.0F, -2.2139F, -0.0081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(86, 101).addBox(0.0F, -2.2139F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, -0.9755F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.6517F, -2.1795F, -0.4081F, 0.7426F, -0.2844F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 41).addBox(0.0F, -2.5227F, -1.0434F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -2.8755F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 41).mirror().addBox(-3.4F, -0.5904F, -0.109F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 41).addBox(0.4F, -0.5904F, -0.109F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(-0.5F, -1.0904F, -1.109F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 60).addBox(-1.5F, -0.425F, -2.375F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 2.9445F, -0.6826F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(28, 74).addBox(-0.3136F, 0.8672F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7444F, 1.3764F, -1.9794F, -0.2371F, -0.1365F, -0.5994F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(20, 95).addBox(-0.5F, -1.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1909F, 6.7059F, -0.6003F, -0.2174F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(53, 69).addBox(-0.5F, 0.275F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 4.3672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(100, 0).addBox(-0.5F, -0.9F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 5.9552F, 0.9001F, 0.7861F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(95, 19).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 6.0264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(75, 90).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1835F, 5.0438F, 0.2384F, 0.0095F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(59, 94).addBox(-0.5F, -1.625F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 4.3672F, -0.1681F, 0.0444F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(36, 95).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.8672F, 0.8319F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6395F, 7.775F, -0.544F, 1.6485F, -0.8769F, -1.2183F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(25, 85).addBox(-0.5F, -0.4933F, -0.3686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0487F, 3.0978F, 0.9443F, -0.2182F, 1.3526F, 0.096F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -2.9994F, -0.3021F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0487F, 3.0978F, 0.9443F, 0.0F, 1.3526F, 0.096F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(90, 34).addBox(-0.5F, -1.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3136F, 1.8544F, 0.5169F, -0.3491F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(89, 82).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(89, 64).addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(54, 57).addBox(0.0F, -0.4F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0261F, 5.9481F, 0.1834F, 2.3591F, 0.2491F, 2.2835F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.7F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r7 = leftFoot4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 47).addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(35, 74).addBox(-0.6864F, 0.8672F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.7444F, 1.3764F, -1.9794F, 0.3403F, 0.0683F, 1.02F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(95, 34).addBox(-0.5F, -1.075F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1909F, 6.7059F, -0.6003F, -0.2174F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(53, 90).addBox(-0.5F, 0.275F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 4.3672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(100, 19).addBox(-0.5F, -0.9F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1787F, 5.9552F, 0.9001F, 0.7861F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(25, 95).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 6.0264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(5, 91).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1835F, 5.0438F, 0.2384F, 0.0095F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -1.625F, -0.45F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 4.3672F, -0.1681F, 0.0444F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(41, 95).addBox(-0.5F, -1.1F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.8672F, 0.8319F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6395F, 7.775F, -0.544F, 1.6485F, 0.8769F, 1.2183F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(85, 35).addBox(-0.5F, -0.4933F, -0.3686F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0487F, 3.0978F, 0.9443F, -0.2182F, -1.3526F, -0.096F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(60, 89).addBox(-0.5F, -2.9994F, -0.3021F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0487F, 3.0978F, 0.9443F, 0.0F, -1.3526F, -0.096F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(37, 90).addBox(-0.5F, -1.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3136F, 1.8544F, 0.5169F, -0.3491F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(90, 4).addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(65, 89).addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(59, 0).addBox(-2.0F, -0.4F, -2.3F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0261F, 5.9481F, 0.1834F, 2.4463F, -0.2491F, -2.2835F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.7F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r8 = rightFoot4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 32).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.225F, -0.075F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3706F, -0.6074F, -0.4443F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(59, 68).addBox(-0.2F, -0.176F, -2.7202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, -0.2967F, 0.0F, -0.0524F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(30, 87).addBox(-0.2F, -0.376F, -0.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, 0.1571F, 0.0F, -0.0524F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(73, 33).addBox(-1.0198F, 0.0246F, -1.3815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8563F, 0.6753F, -1.0245F, 0.6981F, 0.0F, 0.1222F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(25, 102).addBox(-1.0763F, -1.0884F, -0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -0.3245F, -2.7144F, -0.1326F, 0.4383F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(101, 28).addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3881F, 3.0325F, 0.358F, -1.4927F, -0.1326F, 0.4383F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(64, 32).addBox(-1.0763F, 0.2827F, -0.2557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -0.3245F, -0.7945F, -0.1326F, 0.4383F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(62, 44).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9522F, 5.0218F, 1.6389F, -0.2321F, -0.3049F, -0.1259F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(59, 63).addBox(-1.0763F, 1.3949F, 1.5224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -0.3245F, -0.3582F, -0.1326F, 0.4383F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(101, 25).addBox(-1.0763F, 1.8645F, 0.9654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -0.3245F, -0.14F, -0.1326F, 0.4383F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(55, 83).addBox(-1.0763F, 0.9177F, 0.3367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -0.3245F, -0.6985F, -0.1326F, 0.4383F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(92, 48).addBox(-1.1034F, 0.0048F, -0.3671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7564F, 2.1753F, -1.0245F, -0.1851F, 0.0387F, 0.4193F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(81, 87).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0787F, 4.0997F, -1.8574F, 0.2111F, 0.4047F, -0.2424F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(50, 63).addBox(-1.0068F, 1.4089F, -1.8924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.3924F, 0.234F, 0.3193F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(33, 70).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8824F, 4.5602F, -4.1545F, -0.009F, 0.3365F, -0.1684F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(0, 79).addBox(-0.9143F, 2.734F, -3.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.1524F, 0.3013F, 0.3363F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(70, 21).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4003F, 4.5234F, -5.7666F, -0.1618F, 0.2563F, -0.1612F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(41, 79).addBox(-0.9143F, 3.1997F, -4.3143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, -0.0222F, 0.3013F, 0.3363F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(102, 22).addBox(-0.9143F, 1.5311F, -5.8984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.3269F, 0.3013F, 0.3363F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(0, 85).addBox(-0.9143F, 0.8892F, -5.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.4578F, 0.3013F, 0.3363F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(9, 76).addBox(-0.9143F, 0.5856F, -3.5083F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.5451F, 0.3013F, 0.3363F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(73, 38).addBox(-1.0068F, 0.1576F, -1.9171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7564F, 0.9003F, -2.7745F, 0.7851F, 0.234F, 0.3193F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(73, 43).addBox(-1.0448F, -0.6413F, -0.508F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8563F, 0.6753F, -1.0245F, 1.3123F, 0.0101F, -0.043F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(73, 28).addBox(-1.0198F, -0.5913F, -1.508F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8563F, 0.6753F, -1.0245F, 0.5236F, 0.0F, 0.1222F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(77, 70).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3284F, 0.5345F, 1.4105F, 0.4014F, 0.0F, -0.0524F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(68, 81).addBox(-0.2F, -0.376F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, -0.0524F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3706F, -0.6074F, -0.4443F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(59, 68).mirror().addBox(-0.8F, -0.176F, -2.7202F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, -0.2967F, 0.0F, 0.0524F));

		PartDefinition Hips_r27 = bone3.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(30, 87).mirror().addBox(-0.8F, -0.376F, -0.5452F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, 0.1571F, 0.0F, 0.0524F));

		PartDefinition Hips_r28 = bone3.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(73, 33).mirror().addBox(0.0198F, 0.0246F, -1.3815F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8563F, 0.6753F, -1.0245F, 0.6981F, 0.0F, -0.1222F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(25, 102).mirror().addBox(0.0763F, -1.0884F, -0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -0.3245F, -2.7144F, 0.1326F, -0.4383F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(101, 28).mirror().addBox(-0.5F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3881F, 3.0325F, 0.358F, -1.4927F, 0.1326F, -0.4383F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(0.0763F, 0.2827F, -0.2557F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -0.3245F, -0.7945F, 0.1326F, -0.4383F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(0.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9522F, 5.0218F, 1.6389F, -0.2321F, 0.3049F, 0.1259F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(59, 63).mirror().addBox(0.0763F, 1.3949F, 1.5224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -0.3245F, -0.3582F, 0.1326F, -0.4383F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(101, 25).mirror().addBox(0.0763F, 1.8645F, 0.9654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -0.3245F, -0.14F, 0.1326F, -0.4383F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(55, 83).mirror().addBox(0.0763F, 0.9177F, 0.3367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -0.3245F, -0.6985F, 0.1326F, -0.4383F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(92, 48).mirror().addBox(0.1034F, 0.0048F, -0.3671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 2.1753F, -1.0245F, -0.1851F, -0.0387F, -0.4193F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(81, 87).mirror().addBox(0.0F, -1.0F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0787F, 4.0997F, -1.8574F, 0.2111F, -0.4047F, 0.2424F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(50, 63).mirror().addBox(0.0068F, 1.4089F, -1.8924F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.3924F, -0.234F, -0.3193F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(33, 70).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8824F, 4.5602F, -4.1545F, -0.009F, -0.3365F, 0.1684F));

		PartDefinition Hips_r40 = bone3.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.0857F, 2.734F, -3.0085F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.1524F, -0.3013F, -0.3363F));

		PartDefinition Hips_r41 = bone3.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4003F, 4.5234F, -5.7666F, -0.1618F, -0.2563F, 0.1612F));

		PartDefinition Hips_r42 = bone3.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(41, 79).mirror().addBox(-0.0857F, 3.1997F, -4.3143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, -0.0222F, -0.3013F, -0.3363F));

		PartDefinition Hips_r43 = bone3.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(102, 22).mirror().addBox(-0.0857F, 1.5311F, -5.8984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.3269F, -0.3013F, -0.3363F));

		PartDefinition Hips_r44 = bone3.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.0857F, 0.8892F, -5.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.4578F, -0.3013F, -0.3363F));

		PartDefinition Hips_r45 = bone3.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(9, 76).mirror().addBox(-0.0857F, 0.5856F, -3.5083F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.5451F, -0.3013F, -0.3363F));

		PartDefinition Hips_r46 = bone3.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(0.0068F, 0.1576F, -1.9171F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7564F, 0.9003F, -2.7745F, 0.7851F, -0.234F, -0.3193F));

		PartDefinition Hips_r47 = bone3.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(0.0448F, -0.6413F, -0.508F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8563F, 0.6753F, -1.0245F, 1.3123F, -0.0101F, 0.043F));

		PartDefinition Hips_r48 = bone3.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(0.0198F, -0.5913F, -1.508F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8563F, 0.6753F, -1.0245F, 0.5236F, 0.0F, -0.1222F));

		PartDefinition Hips_r49 = bone3.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3284F, 0.5345F, 1.4105F, 0.4014F, 0.0F, 0.0524F));

		PartDefinition Hips_r50 = bone3.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(68, 81).mirror().addBox(-0.8F, -0.376F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.0F, 0.0524F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3458F, 2.6243F, -0.0904F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 87).addBox(0.0F, -0.7582F, -0.0313F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0755F, 7.5216F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 105).addBox(-0.5F, -0.8782F, -0.0196F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 62).addBox(0.0F, -0.8782F, -0.0196F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1755F, 5.7216F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 34).addBox(-0.5F, -1.2312F, 0.0405F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 0).addBox(0.0F, -1.2312F, 0.0405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3755F, 3.8216F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(21, 105).addBox(-0.5F, -1.4496F, -0.0807F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 104).addBox(0.0F, -1.4496F, -0.0807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5755F, 2.1216F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(104, 100).addBox(0.0F, 4.2631F, 7.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 105).addBox(0.0F, 3.3631F, 5.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 105).addBox(0.0F, 2.5631F, 3.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3245F, 0.2216F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 73).addBox(-0.5F, -1.6869F, 0.0217F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 105).addBox(0.0F, -1.6869F, 0.0217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3245F, 0.2216F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-2.9F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1044F, 0.0455F, -0.4411F, 0.1423F, -0.0668F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 21).addBox(-0.1F, 0.0F, 0.0F, 3.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1044F, 0.0455F, -0.4411F, -0.1423F, 0.0668F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.9432F, -0.4009F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6755F, 0.2216F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3303F, 9.0562F, -0.0066F, 0.0873F, -0.0006F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 107).addBox(0.0F, -0.675F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(106, 29).addBox(0.0F, -0.503F, 0.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.3883F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(106, 63).addBox(0.0F, 7.2631F, 13.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 106).addBox(0.0F, 6.5631F, 11.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 106).addBox(0.0F, 5.6631F, 9.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6548F, -8.8346F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(11, 107).addBox(0.0F, -0.4919F, 0.0026F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 33).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, 0.0779F, 0.0873F, -0.0008F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(85, 106).addBox(0.0F, 7.7631F, 15.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 106).addBox(0.0F, 8.2631F, 17.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5665F, -14.4357F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.0649F, 0.0435F, -0.0028F));

		PartDefinition cube_r25 = tail4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 106).addBox(0.0F, 0.3F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 106).addBox(0.0F, 0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 106).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 8).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 49).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3431F, 4.8332F, -0.0353F, 0.0872F, -0.0031F));

		PartDefinition cube_r27 = tail5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(100, 106).addBox(0.0F, 0.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 106).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, -4.793F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(50, 15).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0178F, 0.2618F, 0.0046F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(47, 50).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, -0.0527F, 0.0436F, -0.0023F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0002F, 0.1309F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(62, 38).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0531F, 0.1307F, -0.0069F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(42, 24).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.0701F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8823F, -3.0544F, -0.1927F, -0.0857F, 0.0167F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1679F, -2.775F, -0.0863F, 0.7835F, -0.061F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 79).addBox(0.0F, -2.621F, 0.0428F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6155F, -3.9758F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2194F, -5.8212F, -0.0617F, 0.7844F, -0.0436F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 79).addBox(0.0F, -2.5039F, -1.0547F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7155F, -5.8758F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.4503F, -0.8152F, 0.0391F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2943F, -7.5824F, 0.2124F, -0.0151F, 0.1914F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(93, 87).mirror().addBox(-3.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0086F, -1.0567F, 0.1513F, 0.4444F, -0.6375F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(16, 105).mirror().addBox(-1.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0086F, -1.0567F, 0.2655F, 0.3898F, -0.3572F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 105).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0086F, -1.0567F, 0.3413F, 0.3153F, -0.1386F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 90).mirror().addBox(-6.1806F, -2.694F, -1.312F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -3.0088F, 0.1794F, 0.4084F, -0.7644F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-5.0685F, -0.627F, -0.9407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 60).mirror().addBox(-5.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -3.0088F, 0.2935F, 0.2198F, -0.3402F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(105, 4).mirror().addBox(-1.3115F, -0.0727F, -0.6338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0109F, -0.2349F, -2.6352F, 0.3466F, 0.3169F, -0.0693F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(104, 91).mirror().addBox(-1.3368F, -0.1727F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0573F, -0.0072F, -3.0788F, 0.3287F, 0.0037F, -0.1801F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 46).mirror().addBox(-6.2316F, -2.669F, 0.1325F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -3.0088F, 0.17F, 0.2537F, -0.7933F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-5.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 56).mirror().addBox(-5.0685F, -0.627F, -0.9407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -5.2088F, 0.4291F, 0.2092F, -0.3102F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 81).mirror().addBox(-7.2316F, -2.669F, 0.1325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -5.2088F, 0.2988F, 0.3019F, -0.7568F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(104, 83).mirror().addBox(-1.3368F, -0.1727F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0573F, -0.0072F, -5.2788F, 0.4583F, -0.0259F, -0.1805F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(104, 12).mirror().addBox(-1.3115F, -0.1477F, -0.6338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0109F, -0.2349F, -4.8352F, 0.4768F, 0.2707F, -0.0304F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(33, 65).mirror().addBox(-7.084F, -4.7417F, -0.6657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -5.2088F, 0.1776F, 0.4424F, -1.0577F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(103, 69).mirror().addBox(-6.9683F, -4.7667F, 0.5637F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -5.2088F, 0.1673F, 0.2876F, -1.0865F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 54).mirror().addBox(-7.1806F, -2.694F, -1.312F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9166F, -0.2235F, -5.2088F, 0.3177F, 0.4516F, -0.7056F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.3547F, 0.4115F, -0.6901F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 80).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.2398F, 0.5181F, -1.0098F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 13).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.2153F, 0.2629F, -1.0734F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-5.0685F, -0.627F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.4452F, 0.1593F, -0.3072F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(71, 94).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.4891F, 0.2957F, 0.0119F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.4723F, -0.1552F, -0.2207F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-7.2316F, -2.669F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6166F, -0.3235F, -7.2088F, 0.336F, 0.2636F, -0.7464F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(78, 60).addBox(2.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 74).addBox(2.0685F, -0.627F, -0.9407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -3.0088F, 0.2935F, -0.2198F, 0.3402F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(92, 46).addBox(4.2316F, -2.669F, 0.1325F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -3.0088F, 0.17F, -0.2537F, 0.7933F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(104, 91).addBox(0.3368F, -0.1727F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0573F, -0.0072F, -3.0788F, 0.3287F, -0.0037F, 0.1801F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 4).addBox(0.3115F, -0.0727F, -0.6338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0109F, -0.2349F, -2.6352F, 0.3466F, -0.3169F, 0.0693F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(80, 90).addBox(4.1806F, -2.694F, -1.312F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -3.0088F, 0.1794F, -0.4084F, 0.7644F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 54).addBox(4.1806F, -2.694F, -1.312F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -5.2088F, 0.3177F, -0.4516F, 0.7056F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 69).addBox(5.9683F, -4.7667F, 0.5637F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -5.2088F, 0.1673F, -0.2876F, 1.0865F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(33, 65).addBox(6.084F, -4.7417F, -0.6657F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -5.2088F, 0.1776F, -0.4424F, 1.0577F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(78, 58).addBox(2.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 56).addBox(2.0685F, -0.627F, -0.9407F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -5.2088F, 0.4291F, -0.2092F, 0.3102F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(104, 12).addBox(0.3115F, -0.1477F, -0.6338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0109F, -0.2349F, -4.8352F, 0.4768F, -0.2707F, 0.0304F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(104, 83).addBox(0.3368F, -0.1727F, -0.499F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0573F, -0.0072F, -5.2788F, 0.4583F, 0.0259F, 0.1805F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(7, 81).addBox(4.2316F, -2.669F, 0.1325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9166F, -0.2235F, -5.2088F, 0.2988F, -0.3019F, 0.7568F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(81, 4).addBox(4.2316F, -2.669F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.336F, -0.2636F, 0.7464F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(94, 66).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.4723F, 0.1552F, 0.2207F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(71, 94).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.4891F, -0.2957F, -0.0119F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(67, 56).addBox(2.0685F, -0.627F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.4452F, -0.1593F, 0.3072F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(92, 13).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.2153F, -0.2629F, 1.0734F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 80).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.2398F, -0.5181F, 1.0098F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 6).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6166F, -0.3235F, -7.2088F, 0.3547F, -0.4115F, 0.6901F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 87).addBox(1.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0086F, -1.0567F, 0.1513F, -0.4444F, 0.6375F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(16, 105).addBox(0.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0086F, -1.0567F, 0.2655F, -0.3898F, 0.3572F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(11, 105).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0086F, -1.0567F, 0.3413F, -0.3153F, 0.1386F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 0).addBox(0.4503F, -0.8152F, 0.0391F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2943F, -7.5824F, 0.2124F, 0.0151F, -0.1914F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.901F, 0.0196F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2943F, -7.5824F, 0.2138F, 0.0007F, -0.0174F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(25, 24).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1845F, -14.9758F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3319F, -7.9514F, -0.0815F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(74, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.7912F, -1.1946F, 0.1598F, 0.779F, 0.1127F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(80, 35).addBox(0.0F, -2.2948F, -0.984F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5094F, -0.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(53, 73).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.5098F, -4.1516F, 0.1353F, 0.7808F, 0.0956F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(48, 85).addBox(0.0F, -2.3187F, -1.079F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.8507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(25, 17).mirror().addBox(-7.0695F, -1.2712F, -2.9986F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.3236F, -0.87F, 0.1988F, -0.0217F, 0.1732F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(-7.2316F, -2.669F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.4337F, 0.2897F, -0.7216F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.5685F, -0.1778F, -0.2386F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(52, 94).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.5787F, 0.25F, 0.0342F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(22, 68).mirror().addBox(-5.0685F, -0.627F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.5426F, 0.1435F, -0.2944F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(64, 94).mirror().addBox(-2.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.5588F, 0.029F, -0.1079F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(24, 93).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.2994F, 0.3179F, -1.0513F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(17, 93).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.3385F, 0.5667F, -0.9607F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.2085F, -1.2574F, 0.4593F, 0.4314F, -0.6492F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.5218F, 0.4729F, -0.6219F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 57).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.3877F, 0.6234F, -0.933F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.3367F, 0.3783F, -1.0385F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(94, 32).mirror().addBox(-2.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.6282F, 0.0365F, -0.1056F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(-5.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.6103F, 0.1635F, -0.2841F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(94, 30).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.6506F, 0.247F, 0.0519F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.6373F, -0.1609F, -0.2502F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-7.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1166F, 0.4085F, -3.6574F, 0.4892F, 0.3354F, -0.7046F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 49).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.4593F, -0.4314F, 0.6492F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(17, 93).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.3385F, -0.5667F, 0.9607F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(24, 93).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.2994F, -0.3179F, 1.0513F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(64, 94).addBox(0.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.5588F, -0.029F, 0.1079F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(22, 68).addBox(2.0685F, -0.627F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.5426F, -0.1435F, 0.2944F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(52, 94).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.5787F, -0.25F, -0.0342F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(94, 64).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.5685F, 0.1778F, 0.2386F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(84, 80).addBox(4.2316F, -2.669F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.2085F, -1.2574F, 0.4337F, -0.2897F, 0.7216F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(83, 47).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.5218F, -0.4729F, 0.6219F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 8).addBox(4.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.4892F, -0.3354F, 0.7046F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(94, 28).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.6373F, 0.1609F, 0.2502F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(94, 30).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.6506F, -0.247F, -0.0519F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(92, 57).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.3877F, -0.6234F, 0.933F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(92, 55).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.3367F, -0.3783F, 1.0385F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 68).addBox(2.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.6103F, -0.1635F, 0.2841F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(94, 32).addBox(0.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1166F, 0.4085F, -3.6574F, 0.6282F, -0.0365F, 0.1056F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 17).addBox(0.0695F, -1.2712F, -2.9986F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.3236F, -0.87F, 0.1988F, 0.0217F, -0.1732F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.7859F, -3.701F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.6768F, -0.3069F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, -0.099F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(69, 74).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.9305F, -5.228F, 0.2444F, 0.7703F, 0.1719F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(17, 87).addBox(0.0F, -1.8009F, -1.8779F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -4.0507F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.4495F, -2.1694F, 0.1598F, 0.779F, 0.1127F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(85, 41).addBox(0.0F, -2.2366F, 0.0412F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -2.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(23, 9).mirror().addBox(-6.0695F, -1.0655F, -8.9787F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9334F, 4.0438F, 0.129F, -0.0222F, 0.1731F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.4399F, 0.4828F, -0.6784F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-7.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.4116F, 0.3397F, -0.7491F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(22, 91).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.5733F, -0.1238F, -0.2599F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.5987F, 0.3007F, 0.019F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(-5.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.5444F, 0.1978F, -0.3148F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.261F, 0.3583F, -1.0846F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(93, 2).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2166F, 0.4182F, -5.6436F, 0.2993F, 0.61F, -1.003F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(9, 83).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.5027F, 0.5258F, -0.648F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-7.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.4667F, 0.3867F, -0.7295F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.6412F, -0.1056F, -0.2677F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(90, 44).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.6717F, 0.2986F, 0.0406F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-5.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.6124F, 0.2189F, -0.3007F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-2.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.6401F, 0.0907F, -0.1219F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.2967F, 0.4198F, -1.0711F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(87, 92).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -3.6436F, 0.3471F, 0.6684F, -0.9745F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-7.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.4868F, 0.5152F, -0.656F));

		PartDefinition cube_r141 = body3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(83, 51).mirror().addBox(-7.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.4528F, 0.3751F, -0.7347F));

		PartDefinition cube_r142 = body3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.6242F, -0.1102F, -0.2659F));

		PartDefinition cube_r143 = body3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(91, 71).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.6535F, 0.2993F, 0.0352F));

		PartDefinition cube_r144 = body3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(67, 59).mirror().addBox(-5.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.5953F, 0.2137F, -0.3043F));

		PartDefinition cube_r145 = body3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(17, 31).mirror().addBox(-2.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.6227F, 0.0886F, -0.1234F));

		PartDefinition cube_r146 = body3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 92).mirror().addBox(-7.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.2876F, 0.4045F, -1.0747F));

		PartDefinition cube_r147 = body3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(92, 59).mirror().addBox(-8.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2834F, 0.3182F, -1.1436F, 0.3347F, 0.6539F, -0.9821F));

		PartDefinition cube_r148 = body3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(23, 9).addBox(0.0695F, -1.0655F, -8.9787F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 7.9334F, 4.0438F, 0.129F, 0.0222F, -0.1731F));

		PartDefinition cube_r149 = body3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 33).addBox(-0.5F, -0.5225F, -9.6692F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.2728F, 4.6286F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 2).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.2993F, -0.61F, 1.003F));

		PartDefinition cube_r152 = body3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 93).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.261F, -0.3583F, 1.0846F));

		PartDefinition cube_r153 = body3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 67).addBox(2.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.5444F, -0.1978F, 0.3148F));

		PartDefinition cube_r154 = body3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(10, 91).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.5987F, -0.3007F, -0.019F));

		PartDefinition cube_r155 = body3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(22, 91).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.5733F, 0.1238F, 0.2599F));

		PartDefinition cube_r156 = body3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(83, 10).addBox(4.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.4116F, -0.3397F, 0.7491F));

		PartDefinition cube_r157 = body3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(83, 12).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2166F, 0.4182F, -5.6436F, 0.4399F, -0.4828F, 0.6784F));

		PartDefinition cube_r158 = body3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(87, 92).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.3471F, -0.6684F, 0.9745F));

		PartDefinition cube_r159 = body3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 0).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.2967F, -0.4198F, 1.0711F));

		PartDefinition cube_r160 = body3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(89, 53).addBox(0.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.6401F, -0.0907F, 0.1219F));

		PartDefinition cube_r161 = body3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 68).addBox(2.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.6124F, -0.2189F, 0.3007F));

		PartDefinition cube_r162 = body3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(90, 44).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.6717F, -0.2986F, -0.0406F));

		PartDefinition cube_r163 = body3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(90, 78).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.6412F, 0.1056F, 0.2677F));

		PartDefinition cube_r164 = body3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 83).addBox(4.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.4667F, -0.3867F, 0.7295F));

		PartDefinition cube_r165 = body3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(9, 83).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -3.6436F, 0.5027F, -0.5258F, 0.648F));

		PartDefinition cube_r166 = body3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(92, 59).addBox(6.0202F, -4.7417F, -1.4303F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.3347F, -0.6539F, 0.9821F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 92).addBox(5.9683F, -4.7667F, 0.6887F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.2876F, -0.4045F, 1.0747F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(17, 31).addBox(0.2061F, -0.1977F, -0.5657F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.6227F, -0.0886F, 0.1234F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(67, 59).addBox(2.0685F, -0.652F, -1.0657F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.5953F, -0.2137F, 0.3043F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 71).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.6535F, -0.2993F, -0.0352F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(50, 22).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.6242F, 0.1102F, 0.2659F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(83, 51).addBox(4.2316F, -2.719F, 0.2325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.4528F, -0.3751F, 0.7347F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(75, 81).addBox(4.1806F, -2.694F, -1.437F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2834F, 0.3182F, -1.1436F, 0.4868F, -0.5152F, 0.656F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2404F, -5.902F, -0.0815F, 0.0F, 0.0F));

		PartDefinition cube_r174 = body4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(72, 8).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8826F, -2.0403F, 0.0863F, 0.7835F, 0.061F));

		PartDefinition cube_r175 = body4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(62, 83).addBox(0.0F, -1.7585F, 0.0303F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0645F, -2.9613F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(57, 28).mirror().addBox(-5.0F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.8148F, 0.1741F, 0.0086F, -0.0014F, 0.1658F));

		PartDefinition cube_r177 = body4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(79, 62).mirror().addBox(-5.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 25).mirror().addBox(-5.0685F, -0.652F, -0.9657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.4631F, 0.1624F, -0.3639F));

		PartDefinition cube_r178 = body4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 54).mirror().addBox(-7.1806F, -2.694F, -1.337F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.3713F, 0.4208F, -0.743F));

		PartDefinition cube_r179 = body4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(-7.2316F, -2.719F, 0.1325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.3512F, 0.2739F, -0.802F));

		PartDefinition cube_r180 = body4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(92, 11).mirror().addBox(-2.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.4876F, -0.1151F, -0.2624F));

		PartDefinition cube_r181 = body4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(-2.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.5017F, 0.2548F, -0.0642F));

		PartDefinition cube_r182 = body4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(102, 17).mirror().addBox(-6.9683F, -4.7667F, 0.5887F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.2263F, 0.2773F, -1.1301F));

		PartDefinition cube_r183 = body4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(-7.0202F, -4.7417F, -1.3303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5166F, 0.3778F, -2.1416F, 0.253F, 0.5317F, -1.0627F));

		PartDefinition cube_r184 = body4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(44, 67).addBox(6.0202F, -4.7417F, -1.3303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.253F, -0.5317F, 1.0627F));

		PartDefinition cube_r185 = body4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(102, 17).addBox(5.9683F, -4.7667F, 0.5887F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.2263F, -0.2773F, 1.1301F));

		PartDefinition cube_r186 = body4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(79, 62).addBox(2.0685F, -0.627F, -0.1657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 25).addBox(2.0685F, -0.652F, -0.9657F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.4631F, -0.1624F, 0.3639F));

		PartDefinition cube_r187 = body4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(92, 9).addBox(0.3115F, -0.1477F, -0.6338F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.5017F, -0.2548F, 0.0642F));

		PartDefinition cube_r188 = body4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(92, 11).addBox(0.3368F, -0.1727F, -0.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.4876F, 0.1151F, 0.2624F));

		PartDefinition cube_r189 = body4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(83, 14).addBox(4.2316F, -2.719F, 0.1325F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.3512F, -0.2739F, 0.802F));

		PartDefinition cube_r190 = body4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 54).addBox(4.1806F, -2.694F, -1.337F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5166F, 0.3778F, -2.1416F, 0.3713F, -0.4208F, 0.743F));

		PartDefinition cube_r191 = body4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(57, 28).addBox(0.0F, -1.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 8.8148F, 0.1741F, 0.0086F, 0.0014F, -0.1658F));

		PartDefinition cube_r192 = body4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.8148F, 0.1741F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r193 = body4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.7355F, -7.8613F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5716F, -3.896F, -0.0117F, 0.0F, 0.0F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(0.0311F, -0.2814F, 0.1212F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.791F, 7.4336F, -2.9763F, -0.0962F, 0.0608F, -0.0059F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-0.0064F, -0.3143F, -1.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.791F, 7.4336F, -2.9763F, -0.2552F, 0.1267F, -0.033F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.995F, -0.3256F, -2.0796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.791F, 7.4336F, -2.9763F, -0.272F, -0.0901F, 0.033F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(105, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5211F, -5.3935F, 0.7345F, 0.2519F, -0.3885F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(105, 75).mirror().addBox(-1.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5211F, -5.3935F, 0.6803F, 0.4012F, -0.5568F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(95, 42).mirror().addBox(-3.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5211F, -5.3935F, 0.5696F, 0.5552F, -0.7958F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(93, 89).mirror().addBox(-5.5353F, -1.693F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5211F, -5.3935F, 0.4043F, 0.6786F, -1.0796F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-6.5353F, -1.693F, -0.5094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2211F, -3.1935F, 0.2657F, 0.4837F, -1.0333F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(95, 23).mirror().addBox(-3.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2211F, -3.1935F, 0.3837F, 0.3996F, -0.7588F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(105, 38).mirror().addBox(-1.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2211F, -3.1935F, 0.4699F, 0.2906F, -0.5056F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(105, 36).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2211F, -3.1935F, 0.515F, 0.1789F, -0.3128F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 23).mirror().addBox(-3.9772F, -0.1302F, -0.3141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 21).mirror().addBox(-3.9772F, -0.1552F, -0.9141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 0.0062F, -0.6456F, 0.3397F, 0.2425F, -0.4296F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-1.0951F, 0.101F, -0.4804F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 0.0062F, -0.6456F, 0.3977F, 0.3186F, -0.1563F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(29, 91).mirror().addBox(-1.2527F, 0.076F, -0.5616F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 0.0062F, -0.6456F, 0.3794F, -0.1186F, -0.3343F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-6.4578F, -1.8076F, -0.0701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 0.0062F, -0.6456F, 0.2016F, 0.2939F, -0.8847F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(-6.4002F, -1.7826F, -1.2173F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4834F, 0.0062F, -0.6456F, 0.2142F, 0.4476F, -0.85F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-0.6602F, -0.1555F, -2.3725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.791F, 7.4336F, -2.9763F, -0.3787F, 0.3261F, -0.1268F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 16).addBox(3.4002F, -1.7826F, -1.2173F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4834F, 0.0062F, -0.6456F, 0.2142F, -0.4476F, 0.85F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(83, 18).addBox(3.4578F, -1.8076F, -0.0701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4834F, 0.0062F, -0.6456F, 0.2016F, -0.2939F, 0.8847F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(29, 91).addBox(-0.7473F, 0.076F, -0.5616F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4834F, 0.0062F, -0.6456F, 0.3794F, 0.1186F, 0.3343F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(91, 69).addBox(-0.9049F, 0.101F, -0.4804F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4834F, 0.0062F, -0.6456F, 0.3977F, -0.3186F, 0.1563F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(79, 23).addBox(0.9772F, -0.1302F, -0.3141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 21).addBox(0.9772F, -0.1552F, -0.9141F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4834F, 0.0062F, -0.6456F, 0.3397F, -0.2425F, 0.4296F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(88, 20).addBox(-0.5F, -1.9932F, -0.9448F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(26, 79).addBox(0.0F, -1.9932F, -0.9448F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -0.9507F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(105, 95).addBox(-0.5F, -1.5369F, 0.0333F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(106, 25).addBox(0.0F, -1.5369F, 0.0333F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0262F, -5.9451F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(105, 71).addBox(-0.5F, -1.5869F, -0.9667F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(105, 85).addBox(0.0F, -1.5869F, -0.9667F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -2.9507F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(39, 61).addBox(-1.0311F, -0.2814F, 0.1212F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.791F, 7.4336F, -2.9763F, -0.0962F, -0.0608F, 0.0059F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(30, 101).addBox(-1.291F, -0.0794F, -2.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.791F, 7.4336F, -2.9763F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 31).addBox(-0.9936F, -0.3143F, -1.6942F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.791F, 7.4336F, -2.9763F, -0.2552F, -0.1267F, 0.033F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 101).addBox(-0.005F, -0.3256F, -2.0796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.791F, 7.4336F, -2.9763F, -0.272F, 0.0901F, -0.033F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(74, 87).addBox(-1.3398F, -0.1555F, -2.3725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.791F, 7.4336F, -2.9763F, -0.3787F, -0.3261F, 0.1268F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(93, 89).addBox(3.5353F, -1.693F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5211F, -5.3935F, 0.4043F, -0.6786F, 1.0796F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(95, 42).addBox(1.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5211F, -5.3935F, 0.5696F, -0.5552F, 0.7958F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 75).addBox(0.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5211F, -5.3935F, 0.6803F, -0.4012F, 0.5568F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(105, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5211F, -5.3935F, 0.7345F, -0.2519F, 0.3885F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(105, 36).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2211F, -3.1935F, 0.515F, -0.1789F, 0.3128F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(105, 38).addBox(0.9763F, -0.2162F, -0.5094F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2211F, -3.1935F, 0.4699F, -0.2906F, 0.5056F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(30, 85).addBox(3.5353F, -1.693F, -0.5094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2211F, -3.1935F, 0.2657F, -0.4837F, 1.0333F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(95, 23).addBox(1.853F, -0.7204F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2211F, -3.1935F, 0.3837F, -0.3996F, 0.7588F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 41).addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7218F, 5.2938F, -2.426F, 1.1288F, 0.038F, -0.5635F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -0.65F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 1.1507F, -0.8168F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(99, 57).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 1.474F, -0.6583F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(71, 49).addBox(-0.5F, -0.35F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 7.2374F, -0.5178F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(70, 90).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 7.2129F, 0.1818F, 1.6057F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(100, 34).addBox(-0.5F, 0.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 5.4294F, 0.3889F, 0.384F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightupperarm.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(56, 76).addBox(-0.5F, -0.1F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.099F, 1.7702F, -0.6196F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightupperarm.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(7, 85).addBox(-0.5F, -0.1F, 0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 1.7702F, -0.6196F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(90, 39).addBox(-0.9997F, 1.4358F, -1.3395F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3635F, 7.3032F, -0.6168F, -0.9412F, 0.4918F, -0.7011F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(16, 76).addBox(-0.5F, -2.0F, -0.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4997F, 1.5684F, 0.5071F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(46, 95).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4997F, 0.8684F, -0.7929F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(13, 56).addBox(0.0F, -0.4F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3934F, 4.2492F, -0.454F, -0.4524F, 0.3914F, 0.6648F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.6F, 1.0F));

		PartDefinition cube_r233 = leftFoot2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(47, 38).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7218F, 5.2938F, -2.426F, 0.7558F, -0.3129F, 0.6991F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(14, 71).addBox(-0.5F, -0.65F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 1.1507F, -0.8168F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(99, 82).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 1.474F, -0.6583F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.35F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 7.2374F, -0.5178F, 2.0333F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(90, 74).addBox(-0.5F, -0.975F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 7.2129F, 0.1818F, 1.6057F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(100, 37).addBox(-0.5F, 0.0F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 5.4294F, 0.3889F, 0.384F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftupperarm.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(78, 48).addBox(-0.5F, -0.1F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.099F, 1.7702F, -0.6196F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftupperarm.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(12, 85).addBox(-0.5F, -0.1F, 0.075F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 1.7702F, -0.6196F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(42, 90).addBox(-0.0003F, 1.4358F, -1.3395F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3635F, 7.3032F, -0.6168F, -1.2203F, -0.2196F, 0.1035F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(21, 76).addBox(-0.5F, -2.0F, -0.575F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4997F, 1.5684F, 0.5071F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(95, 73).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4997F, 0.8684F, -0.7929F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(57, 22).addBox(-2.0F, -0.4F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3934F, 4.2492F, -0.454F, -0.0706F, 0.0928F, -1.0017F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(47, 44).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 1.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9602F, 2.5567F, -2.3991F, -0.1405F, 0.1264F, 0.264F));

		PartDefinition Bodyfront_r1 = bone.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(69, 96).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6434F, 5.9649F, -1.9169F, 1.6183F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r2 = bone.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(64, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4013F, 5.1843F, -2.493F, 2.1856F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r3 = bone.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(97, 15).addBox(-0.5F, -1.425F, -2.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7529F, 2.6302F, -1.3918F, 1.6969F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r4 = bone.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(11, 62).addBox(-0.9F, 0.25F, 0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7702F, 4.4757F, -2.9341F, 1.1733F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r5 = bone.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(42, 74).addBox(-0.5F, -1.375F, -0.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0217F, 4.4975F, -0.2358F, 1.2566F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r6 = bone.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(65, 103).addBox(-1.0038F, -1.2626F, 0.5904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 103).addBox(-1.0038F, -1.2626F, -0.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7162F, 4.8088F, 1.7681F, -0.9183F, -0.0791F, 0.4378F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(83, 76).addBox(0.05F, -0.5F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9205F, 5.8784F, 3.6961F, 0.1299F, 0.4684F, -0.3295F));

		PartDefinition Bodyfront_r8 = bone.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(41, 83).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3436F, 5.7715F, 3.7401F, 0.1158F, 0.0092F, -0.3873F));

		PartDefinition Bodyfront_r9 = bone.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(18, 83).addBox(-1.0038F, 0.3021F, 0.8744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7162F, 4.8088F, 1.7681F, 0.0852F, -0.0791F, 0.4378F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(88, 61).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2218F, 6.3366F, 0.7056F, 0.0542F, 0.6069F, -0.4041F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(68, 70).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1988F, 5.9452F, 0.7693F, 0.0446F, -0.0207F, -0.436F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(62, 74).addBox(-1.0438F, -0.1716F, -0.0164F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3476F, 4.3387F, -0.2343F, 0.0128F, -0.0475F, 0.4369F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(95, 38).addBox(-1.0038F, -0.779F, -0.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7162F, 4.8088F, 1.7681F, -0.0021F, -0.0791F, 0.4378F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(49, 76).addBox(-0.8F, 0.3363F, -2.8268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.8203F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0438F, -1.3225F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3476F, 4.3387F, -0.2343F, -0.0309F, -0.0475F, 0.4369F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(102, 77).addBox(-1.0F, -3.9124F, -0.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5771F, 0.0268F, -0.0524F, 0.0F, -0.2094F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(87, 56).addBox(-1.0F, -3.9696F, -1.0181F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.5771F, 0.0268F, -0.2269F, 0.0F, -0.2094F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(21, 71).addBox(-1.0438F, 0.0606F, -0.6136F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3476F, 4.3387F, -0.2343F, 0.9727F, -0.0475F, 0.4369F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(47, 91).addBox(-1.0F, 0.2222F, -0.4899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0735F, -0.18F, 0.1963F, 0.0F, 0.1571F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(78, 94).addBox(-1.0F, 0.227F, -0.5625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0735F, -0.18F, -0.1527F, 0.0F, 0.1571F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(84, 64).addBox(-1.0F, -4.0749F, -0.7626F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5771F, 0.0268F, 0.0785F, 0.0F, -0.2094F));

		PartDefinition Bodyfront_r22 = bone.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(88, 87).addBox(-1.0F, -2.9724F, -0.7362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.5771F, 0.0268F, -0.192F, 0.0F, -0.2094F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9602F, 2.5567F, -2.3991F, -0.1405F, -0.1264F, -0.264F));

		PartDefinition Bodyfront_r23 = bone4.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(69, 96).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6434F, 5.9649F, -1.9169F, 1.6183F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r24 = bone4.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(64, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4013F, 5.1843F, -2.493F, 2.1856F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r25 = bone4.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(-0.5F, -1.425F, -2.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7529F, 2.6302F, -1.3918F, 1.6969F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r26 = bone4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(11, 62).mirror().addBox(-0.1F, 0.25F, 0.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7702F, 4.4757F, -2.9341F, 1.1733F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r27 = bone4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-0.5F, -1.375F, -0.475F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0217F, 4.4975F, -0.2358F, 1.2566F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r28 = bone4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(65, 103).mirror().addBox(0.0038F, -1.2626F, 0.5904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 103).mirror().addBox(0.0038F, -1.2626F, -0.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7162F, 4.8088F, 1.7681F, -0.9183F, 0.0791F, -0.4378F));

		PartDefinition Bodyfront_r29 = bone4.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-1.05F, -0.5F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9205F, 5.8784F, 3.6961F, 0.1299F, -0.4684F, 0.3295F));

		PartDefinition Bodyfront_r30 = bone4.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3436F, 5.7715F, 3.7401F, 0.1158F, -0.0092F, 0.3873F));

		PartDefinition Bodyfront_r31 = bone4.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(18, 83).mirror().addBox(0.0038F, 0.3021F, 0.8744F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7162F, 4.8088F, 1.7681F, 0.0852F, 0.0791F, -0.4378F));

		PartDefinition Bodyfront_r32 = bone4.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(88, 61).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2218F, 6.3366F, 0.7056F, 0.0542F, -0.6069F, 0.4041F));

		PartDefinition Bodyfront_r33 = bone4.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1988F, 5.9452F, 0.7693F, 0.0446F, 0.0207F, 0.436F));

		PartDefinition Bodyfront_r34 = bone4.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(62, 74).mirror().addBox(0.0438F, -0.1716F, -0.0164F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3476F, 4.3387F, -0.2343F, 0.0128F, 0.0475F, -0.4369F));

		PartDefinition Bodyfront_r35 = bone4.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(95, 38).mirror().addBox(0.0038F, -0.779F, -0.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7162F, 4.8088F, 1.7681F, -0.0021F, 0.0791F, -0.4378F));

		PartDefinition Bodyfront_r36 = bone4.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(49, 76).mirror().addBox(-0.2F, 0.3363F, -2.8268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.8203F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r37 = bone4.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(0.0438F, -1.3225F, -0.0015F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3476F, 4.3387F, -0.2343F, -0.0309F, 0.0475F, -0.4369F));

		PartDefinition Bodyfront_r38 = bone4.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(102, 77).mirror().addBox(0.0F, -3.9124F, -0.3285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5771F, 0.0268F, -0.0524F, 0.0F, 0.2094F));

		PartDefinition Bodyfront_r39 = bone4.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(87, 56).mirror().addBox(0.0F, -3.9696F, -1.0181F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5771F, 0.0268F, -0.2269F, 0.0F, 0.2094F));

		PartDefinition Bodyfront_r40 = bone4.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(0.0438F, 0.0606F, -0.6136F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3476F, 4.3387F, -0.2343F, 0.9727F, 0.0475F, -0.4369F));

		PartDefinition Bodyfront_r41 = bone4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(47, 91).mirror().addBox(0.0F, 0.2222F, -0.4899F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0735F, -0.18F, 0.1963F, 0.0F, -0.1571F));

		PartDefinition Bodyfront_r42 = bone4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(78, 94).mirror().addBox(0.0F, 0.227F, -0.5625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0735F, -0.18F, -0.1527F, 0.0F, -0.1571F));

		PartDefinition Bodyfront_r43 = bone4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(0.0F, -4.0749F, -0.7626F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5771F, 0.0268F, 0.0785F, 0.0F, 0.2094F));

		PartDefinition Bodyfront_r44 = bone4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(0.0F, -2.9724F, -0.7362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.5771F, 0.0268F, -0.192F, 0.0F, 0.2094F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.0225F, 0.0F, 0.0F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(22, 87).addBox(-0.5F, -1.7877F, 0.0516F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -4.0392F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(40, 105).addBox(-0.5F, -1.3505F, 0.0535F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -2.0392F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3203F, -3.7426F, 0.5791F, 0.9094F, -0.9992F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-2.9763F, -0.2162F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2203F, -1.6426F, 0.4114F, 0.7437F, -0.8641F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(105, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2203F, -1.6426F, 0.5667F, 0.6322F, -0.6207F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(93, 95).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3203F, -3.7426F, 0.5791F, -0.9094F, 0.9992F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(105, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2203F, -1.6426F, 0.5667F, -0.6322F, 0.6207F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(95, 61).addBox(0.9763F, -0.2162F, -0.5094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2203F, -1.6426F, 0.4114F, -0.7437F, 0.8641F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(60, 50).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.35F, -3.925F, -0.2358F, -0.0849F, 0.0204F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(43, 105).addBox(-0.5F, -1.3932F, 0.0448F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5707F, -2.0392F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(51, 96).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1703F, -1.8176F, 0.7799F, 1.0602F, -0.8015F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(51, 96).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1703F, -1.8176F, 0.7799F, -1.0602F, 0.8015F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(68, 65).addBox(-1.0F, -2.9F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2757F, -2.9253F, 0.053F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(26, 49).addBox(-0.5F, -1.0046F, 0.7508F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.7392F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck3.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-2.0F, 0.0F, -0.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1946F, -0.8924F, 0.6327F, 1.0912F, -0.9991F));

		PartDefinition cube_r249 = neck3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(96, 52).addBox(0.0F, 0.0F, -0.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1946F, -0.8924F, 0.6327F, -1.0912F, 0.9991F));

		PartDefinition cube_r250 = neck3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(84, 70).addBox(-1.0F, -2.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head2 = neck3.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2453F, -1.9408F, -0.1098F, -0.1306F, -0.0084F));

		PartDefinition cube_r251 = head2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(63, 15).addBox(-2.5F, -0.1F, -0.6F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.3052F, -0.8343F, 0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(39, 57).addBox(-2.0F, 0.0F, -0.7F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -1.7877F, -1.645F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(68, 62).addBox(-2.0F, -0.05F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(61, 12).addBox(-2.5F, -0.05F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7857F, -2.6463F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(99, 54).addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 1.1046F, -9.9966F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(45, 99).addBox(-1.0F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.8097F, -9.7263F, 2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(99, 44).addBox(-1.0F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 0.8097F, -9.7263F, -2.4435F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 99).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0124F)), PartPose.offsetAndRotation(0.5F, -0.2778F, -8.2924F, -0.9468F, 0.0F, 0.0F));

		PartDefinition cube_r258 = head2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(25, 99).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -0.8261F, -7.4561F, 0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r259 = head2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(53, 87).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0124F)), PartPose.offsetAndRotation(0.0F, -1.2762F, -6.5631F, 2.0377F, 0.0F, 0.0F));

		PartDefinition cube_r260 = head2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(87, 31).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.6059F, -5.619F, -2.8056F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(69, 77).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 1.6771F, -6.023F, -1.645F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(22, 65).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -1.8095F, -4.64F, -1.3657F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head2.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(63, 18).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.8836F, -3.6427F, 0.0742F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 3.4099F, 0.3657F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(79, 98).addBox(-1.025F, -1.2365F, -2.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(98, 68).addBox(-1.025F, -1.2365F, -2.538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, -0.7243F, 0.192F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(104, 80).addBox(-1.025F, -1.9734F, -1.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 0.1658F, 0.192F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(104, 56).addBox(-1.025F, -1.7765F, -0.4129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 0.8203F, 0.192F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(55, 104).addBox(-0.975F, -2.0531F, 1.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 53).addBox(-1.35F, -2.0531F, 1.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.35F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 1.9548F, 0.192F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(87, 27).addBox(-1.025F, -1.8155F, 0.3294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 1.693F, 0.192F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(88, 94).addBox(-1.025F, 0.0896F, 1.8429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 3.1329F, 0.192F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(15, 99).addBox(-0.9703F, -0.0069F, -1.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, -1.693F, 0.384F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(40, 99).addBox(-0.9703F, -0.0639F, -1.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, -1.5184F, 0.384F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(99, 11).addBox(-0.9703F, -1.4214F, -1.6391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, -0.6807F, 0.384F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(104, 43).addBox(-1.025F, -3.4402F, -1.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 0.5061F, 0.192F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(50, 104).addBox(-1.025F, -1.8767F, 1.9923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 1.7453F, 0.192F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(75, 104).addBox(-1.0453F, -0.8855F, 1.4187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, 2.1206F, 0.384F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 14).addBox(-1.0453F, -0.3072F, 0.4018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, 1.946F, 0.384F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(35, 102).addBox(-0.9F, -0.7F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4734F, -2.3723F, -8.3452F, 2.7882F, 0.4064F, 0.0111F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(30, 97).addBox(-1.0453F, -2.6614F, 1.4771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, 2.2166F, 0.384F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(70, 104).addBox(-1.0453F, -2.9281F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, 1.4486F, 0.384F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(100, 74).addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0704F, -1.7704F, -8.6234F, 1.3614F, 0.384F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(89, 100).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.23F, -1.8174F, -7.8797F, 1.4835F, 0.384F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(98, 97).addBox(-1.0453F, -1.7901F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 71).addBox(-1.0453F, -1.9901F, -0.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.525F, -2.2692F, -6.1302F, 1.5359F, 0.384F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(5, 99).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0946F, -1.8145F, -6.7039F, 1.4566F, 0.3055F, -0.0026F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(74, 98).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2175F, -1.8216F, -5.9635F, 1.5788F, 0.3055F, -0.0026F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(51, 98).addBox(-0.7F, 1.0F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 98).addBox(-0.7F, 0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5538F, -1.7541F, -5.2098F, 1.5785F, 0.1746F, -0.0037F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(93, 97).addBox(-0.7F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5538F, -1.7541F, -5.2098F, 1.6658F, 0.1746F, -0.0037F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(101, 31).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8284F, -1.7116F, -6.3987F, 1.5882F, 0.384F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(77, 65).addBox(-1.1F, -2.9245F, -0.5032F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 1.6144F, 0.192F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(44, 69).addBox(-1.1F, -1.0F, -0.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 1.5708F, 0.192F, 0.0F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(10, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.525F, -2.5041F, -2.3673F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(100, 85).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -3.2475F, -2.9482F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(66, 100).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.725F, -3.5833F, -0.0863F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 94).addBox(-0.5F, -0.325F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.725F, -3.4684F, -0.5526F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(55, 101).addBox(-0.7134F, -0.7808F, -0.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.263F, -2.6871F, -9.2696F, -1.0822F, 0.2729F, 0.0155F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(71, 101).addBox(-0.7134F, -0.2716F, -0.6041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.263F, -2.6871F, -9.2696F, 2.3386F, 0.2729F, 0.0155F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 102).addBox(-0.7084F, 0.193F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(81, 101).addBox(-0.7084F, 0.093F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(76, 101).addBox(-0.7084F, -0.3069F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1723F, -2.5097F, -9.4445F, -1.1676F, 0.4034F, 0.1324F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(101, 63).addBox(-0.5F, -0.6332F, -0.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.0527F, -2.5097F, -9.4445F, -2.4078F, 0.3772F, 0.0884F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(50, 101).addBox(-0.5F, -0.4451F, -0.7226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0527F, -2.5097F, -9.4445F, -2.626F, 0.3772F, 0.0884F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(40, 102).addBox(-0.7084F, -0.7468F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(0.1723F, -2.5097F, -9.4445F, 2.1311F, 0.4034F, 0.1324F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(103, 50).addBox(-0.7084F, -1.0843F, -0.3671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.1723F, -2.5097F, -9.4445F, 2.2533F, 0.4034F, 0.1324F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(95, 4).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3F, -1.7429F, -10.2662F, 2.2522F, 0.3772F, 0.1408F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(5, 95).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1231F, -2.993F, -9.6514F, 2.2125F, 0.294F, 0.0734F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(94, 91).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.3F, -1.7429F, -10.2662F, 2.3918F, 0.3772F, 0.1408F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(94, 82).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.3F, -1.7429F, -10.2662F, 1.938F, 0.3772F, 0.1408F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(61, 100).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.725F, -3.4684F, -0.5526F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(100, 88).addBox(-0.5F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -4.0434F, -1.5485F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(100, 71).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5232F, -3.8098F, -8.5419F, -2.4771F, 0.3082F, 0.102F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(84, 98).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.8517F, -4.2798F, -7.7226F, -2.6132F, 0.3219F, 0.1133F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(100, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.1993F, -4.7013F, -6.8851F, -2.6626F, 0.337F, 0.1226F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(79, 0).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.9897F, -5.2828F, -4.0641F, 3.0675F, 0.0128F, 0.0834F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(28, 71).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.7449F, -5.1493F, -5.0244F, -2.9848F, 0.2361F, 0.0951F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(88, 23).addBox(0.5F, 0.225F, -1.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, -4.7151F, -1.2F, 1.1563F, 0.0F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(20, 99).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.5F, -5.0158F, -5.9847F, -2.9848F, 0.2361F, 0.0951F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(76, 77).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -2.2783F, -4.9046F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(76, 77).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -2.2783F, -2.9046F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(37, 87).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0126F)), PartPose.offsetAndRotation(1.5F, -5.0158F, -5.9847F, -2.7906F, 0.2879F, 0.1036F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(61, 79).addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.525F, -4.2036F, -2.0962F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(80, 104).addBox(-1.1F, -3.0047F, -1.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.125F, -2.2692F, -3.3302F, 0.1833F, 0.192F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.525F, -4.7F, -2.575F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 3.4099F, 0.3657F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(0.025F, -1.2365F, -2.888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(98, 68).mirror().addBox(0.025F, -1.2365F, -2.538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, -0.7243F, -0.192F, 0.0F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(104, 80).mirror().addBox(0.025F, -1.9734F, -1.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 0.1658F, -0.192F, 0.0F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(104, 56).mirror().addBox(0.025F, -1.7765F, -0.4129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 0.8203F, -0.192F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.025F, -2.0531F, 1.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 53).mirror().addBox(0.35F, -2.0531F, 1.5973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.35F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 1.9548F, -0.192F, 0.0F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(87, 27).mirror().addBox(0.025F, -1.8155F, 0.3294F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 1.693F, -0.192F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(0.025F, 0.0896F, 1.8429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 3.1329F, -0.192F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(-0.0297F, -0.0069F, -1.1161F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, -1.693F, -0.384F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(-0.0297F, -0.0639F, -1.4099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, -1.5184F, -0.384F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(99, 11).mirror().addBox(-0.0297F, -1.4214F, -1.6391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, -0.6807F, -0.384F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(104, 43).mirror().addBox(0.025F, -3.4402F, -1.8002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 0.5061F, -0.192F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(50, 104).mirror().addBox(0.025F, -1.8767F, 1.9923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 1.7453F, -0.192F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(75, 104).mirror().addBox(0.0453F, -0.8855F, 1.4187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, 2.1206F, -0.384F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(0.0453F, -0.3072F, 0.4018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, 1.946F, -0.384F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-0.1F, -0.7F, 0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4734F, -2.3723F, -8.3452F, 2.7882F, -0.4064F, -0.0111F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(30, 97).mirror().addBox(0.0453F, -2.6614F, 1.4771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, 2.2166F, -0.384F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(70, 104).mirror().addBox(0.0453F, -2.9281F, -0.7961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, 1.4486F, -0.384F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-0.5F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0704F, -1.7704F, -8.6234F, 1.3614F, -0.384F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(89, 100).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.23F, -1.8174F, -7.8797F, 1.4835F, -0.384F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(0.0453F, -1.7901F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 71).mirror().addBox(0.0453F, -1.9901F, -0.625F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.2692F, -6.1302F, 1.5359F, -0.384F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(5, 99).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0946F, -1.8145F, -6.7039F, 1.4566F, -0.3055F, 0.0026F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(74, 98).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2175F, -1.8216F, -5.9635F, 1.5788F, -0.3055F, 0.0026F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(51, 98).mirror().addBox(-0.3F, 1.0F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 98).mirror().addBox(-0.3F, 0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5538F, -1.7541F, -5.2098F, 1.5785F, -0.1746F, 0.0037F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.3F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5538F, -1.7541F, -5.2098F, 1.6658F, -0.1746F, 0.0037F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(101, 31).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8284F, -1.7116F, -6.3987F, 1.5882F, -0.384F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(77, 65).mirror().addBox(0.1F, -2.9245F, -0.5032F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 1.6144F, -0.192F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(44, 69).mirror().addBox(0.1F, -1.0F, -0.525F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 1.5708F, -0.192F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -2.5041F, -2.3673F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(100, 85).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -3.2475F, -2.9482F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(66, 100).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -3.5833F, -0.0863F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-0.5F, -0.325F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -3.4684F, -0.5526F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(55, 101).mirror().addBox(-0.2866F, -0.7808F, -0.5127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.263F, -2.6871F, -9.2696F, -1.0822F, -0.2729F, -0.0155F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(71, 101).mirror().addBox(-0.2866F, -0.2716F, -0.6041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.263F, -2.6871F, -9.2696F, 2.3386F, -0.2729F, -0.0155F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.2916F, 0.193F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(81, 101).mirror().addBox(-0.2916F, 0.093F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(76, 101).mirror().addBox(-0.2916F, -0.3069F, -0.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1723F, -2.5097F, -9.4445F, -1.1676F, -0.4034F, -0.1324F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(101, 63).mirror().addBox(-0.5F, -0.6332F, -0.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.0527F, -2.5097F, -9.4445F, -2.4078F, -0.3772F, -0.0884F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(50, 101).mirror().addBox(-0.5F, -0.4451F, -0.7226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0527F, -2.5097F, -9.4445F, -2.626F, -0.3772F, -0.0884F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(40, 102).mirror().addBox(-0.2916F, -0.7468F, -0.4194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(-0.1723F, -2.5097F, -9.4445F, 2.1311F, -0.4034F, -0.1324F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-0.2916F, -1.0843F, -0.3671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.1723F, -2.5097F, -9.4445F, 2.2533F, -0.4034F, -0.1324F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(95, 4).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.7429F, -10.2662F, 2.2522F, -0.3772F, -0.1408F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(5, 95).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, -2.993F, -9.6514F, 2.2125F, -0.294F, -0.0734F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.7429F, -10.2662F, 2.3918F, -0.3772F, -0.1408F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(94, 82).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.3F, -1.7429F, -10.2662F, 1.938F, -0.3772F, -0.1408F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(61, 100).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.725F, -3.4684F, -0.5526F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(100, 88).mirror().addBox(-0.5F, -0.7F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -4.0434F, -1.5485F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(100, 71).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5232F, -3.8098F, -8.5419F, -2.4771F, -0.3082F, -0.102F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(84, 98).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.8517F, -4.2798F, -7.7226F, -2.6132F, -0.3219F, -0.1133F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.1993F, -4.7013F, -6.8851F, -2.6626F, -0.337F, -0.1226F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.9897F, -5.2828F, -4.0641F, 3.0675F, -0.0128F, -0.0834F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.7449F, -5.1493F, -5.0244F, -2.9848F, -0.2361F, -0.0951F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(88, 23).mirror().addBox(-2.5F, 0.225F, -1.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.7151F, -1.2F, 1.1563F, 0.0F, 0.0F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(20, 99).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -5.0158F, -5.9847F, -2.9848F, -0.2361F, -0.0951F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.2783F, -4.9046F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-1.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.2783F, -2.9046F, -1.5403F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(37, 87).mirror().addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0126F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -5.0158F, -5.9847F, -2.7906F, -0.2879F, -0.1036F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(61, 79).mirror().addBox(-0.5F, -0.225F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -4.2036F, -2.0962F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(80, 104).mirror().addBox(0.1F, -3.0047F, -1.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -2.2692F, -3.3302F, 0.1833F, -0.192F, 0.0F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.425F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.525F, -4.7F, -2.575F, -0.0436F, 0.0F, 0.0F));

		PartDefinition lower_jaw2 = head2.addOrReplaceChild("lower_jaw2", CubeListBuilder.create().texOffs(67, 85).addBox(1.6F, -0.185F, -1.49F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 85).mirror().addBox(-2.6F, -0.185F, -1.49F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3818F, -0.3302F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r376 = lower_jaw2.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(20, 102).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(99, 100).mirror().addBox(-0.5F, 0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(31, 93).mirror().addBox(-0.5F, -0.95F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(31, 93).addBox(3.7F, -0.95F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(20, 102).addBox(3.7F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(99, 100).addBox(3.7F, 0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1F, 1.5778F, -1.551F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r377 = lower_jaw2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(104, 9).mirror().addBox(-0.1586F, -0.6108F, -0.5468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 1.1451F, -7.7534F, -0.0528F, -0.4712F, 0.001F));

		PartDefinition cube_r378 = lower_jaw2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(104, 6).mirror().addBox(-0.0547F, -0.4748F, -2.3375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -0.0524F, -0.384F, 0.0F));

		PartDefinition cube_r379 = lower_jaw2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(99, 8).mirror().addBox(-0.1047F, -0.6599F, -1.5306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, 0.0349F, -0.384F, 0.0F));

		PartDefinition cube_r380 = lower_jaw2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.1047F, -0.6986F, -0.7267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, 0.1047F, -0.384F, 0.0F));

		PartDefinition cube_r381 = lower_jaw2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(56, 98).mirror().addBox(-0.05F, -1.0F, -2.7834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 1.1451F, -2.5534F, 0.0873F, -0.192F, 0.0F));

		PartDefinition cube_r382 = lower_jaw2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-0.05F, -1.1081F, -1.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 53).mirror().addBox(-0.05F, -0.8581F, -2.9464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 1.1451F, -2.5534F, 0.1571F, -0.192F, 0.0F));

		PartDefinition cube_r383 = lower_jaw2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(102, 60).mirror().addBox(-0.2828F, -0.3866F, -1.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(102, 47).mirror().addBox(-0.2828F, -0.3866F, -0.6826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 1.1451F, -7.7534F, -0.3142F, -0.4538F, 0.0F));

		PartDefinition cube_r384 = lower_jaw2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.2828F, -0.4504F, -1.9286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 1.1451F, -7.7534F, -0.2313F, -0.4538F, 0.0F));

		PartDefinition cube_r385 = lower_jaw2.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(-0.2828F, -0.5015F, -0.707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-0.95F, 1.1451F, -7.7534F, -0.1091F, -0.4538F, 0.0F));

		PartDefinition cube_r386 = lower_jaw2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(102, 14).mirror().addBox(-0.2047F, 0.1872F, -2.8011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -0.24F, -0.384F, 0.0F));

		PartDefinition cube_r387 = lower_jaw2.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(45, 102).mirror().addBox(-0.2047F, -0.259F, -2.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -0.0742F, -0.384F, 0.0F));

		PartDefinition cube_r388 = lower_jaw2.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-0.1547F, -0.282F, -2.2911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -0.0393F, -0.384F, 0.0F));

		PartDefinition cube_r389 = lower_jaw2.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.1547F, 0.0823F, -2.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -0.2138F, -0.384F, 0.0F));

		PartDefinition cube_r390 = lower_jaw2.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(97, 48).mirror().addBox(-0.1047F, 0.7231F, -0.1607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -1.6581F, -0.384F, 0.0F));

		PartDefinition cube_r391 = lower_jaw2.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.1047F, -0.4112F, -1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(30, 104).mirror().addBox(-0.1047F, -0.4112F, -0.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, 0.1222F, -0.384F, 0.0F));

		PartDefinition cube_r392 = lower_jaw2.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(97, 77).mirror().addBox(-0.1047F, 0.0691F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.95F, 1.1451F, -5.3534F, -1.5882F, -0.384F, 0.0F));

		PartDefinition cube_r393 = lower_jaw2.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(100, 94).mirror().addBox(-0.05F, 2.2629F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(94, 100).mirror().addBox(-0.05F, 1.5629F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 1.1451F, -2.5534F, -1.5359F, -0.192F, 0.0F));

		PartDefinition cube_r394 = lower_jaw2.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(92, 15).mirror().addBox(-0.05F, -0.1284F, -0.3655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 1.1451F, -2.5534F, -1.5184F, -0.192F, 0.0F));

		PartDefinition cube_r395 = lower_jaw2.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(99, 103).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(99, 103).addBox(3.7F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1F, 1.4322F, -0.8663F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r396 = lower_jaw2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(103, 97).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(103, 97).addBox(3.7F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-2.1F, 1.0875F, -0.2571F, 2.0857F, 0.0F, 0.0F));

		PartDefinition cube_r397 = lower_jaw2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(94, 103).mirror().addBox(-0.5F, -0.525F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(94, 103).addBox(3.7F, -0.525F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1F, 0.315F, 0.01F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r398 = lower_jaw2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(48, 81).mirror().addBox(-0.05F, -1.0378F, -1.5068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.55F, 1.1451F, -2.5534F, 0.3316F, -0.192F, 0.0F));

		PartDefinition cube_r399 = lower_jaw2.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(-0.5F, -0.15F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 66).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(89, 103).addBox(3.7F, -0.15F, -1.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 66).addBox(3.7F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-2.1F, -0.035F, -1.34F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r400 = lower_jaw2.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(10, 99).addBox(-0.8953F, -0.4112F, -1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 104).addBox(-0.8953F, -0.4112F, -0.8027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, 0.1222F, 0.384F, 0.0F));

		PartDefinition cube_r401 = lower_jaw2.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(104, 9).addBox(-0.8414F, -0.6108F, -0.5468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.95F, 1.1451F, -7.7534F, -0.0528F, 0.4712F, -0.001F));

		PartDefinition cube_r402 = lower_jaw2.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(104, 6).addBox(-0.9453F, -0.4748F, -2.3375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -0.0524F, 0.384F, 0.0F));

		PartDefinition cube_r403 = lower_jaw2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(99, 8).addBox(-0.8953F, -0.6599F, -1.5306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, 0.0349F, 0.384F, 0.0F));

		PartDefinition cube_r404 = lower_jaw2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(0, 104).addBox(-0.8953F, -0.6986F, -0.7267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, 0.1047F, 0.384F, 0.0F));

		PartDefinition cube_r405 = lower_jaw2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(56, 98).addBox(-0.95F, -1.0F, -2.7834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.55F, 1.1451F, -2.5534F, 0.0873F, 0.192F, 0.0F));

		PartDefinition cube_r406 = lower_jaw2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(99, 91).addBox(-0.95F, -1.1081F, -1.9464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 53).addBox(-0.95F, -0.8581F, -2.9464F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.55F, 1.1451F, -2.5534F, 0.1571F, 0.192F, 0.0F));

		PartDefinition cube_r407 = lower_jaw2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(48, 81).addBox(-0.95F, -1.0378F, -1.5068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.55F, 1.1451F, -2.5534F, 0.3316F, 0.192F, 0.0F));

		PartDefinition cube_r408 = lower_jaw2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(102, 14).addBox(-0.7953F, 0.1872F, -2.8011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -0.24F, 0.384F, 0.0F));

		PartDefinition cube_r409 = lower_jaw2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(102, 60).addBox(-0.7172F, -0.3866F, -1.0826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 47).addBox(-0.7172F, -0.3866F, -0.6826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.95F, 1.1451F, -7.7534F, -0.3142F, 0.4538F, 0.0F));

		PartDefinition cube_r410 = lower_jaw2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(75, 83).addBox(-0.7172F, -0.4504F, -1.9286F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.95F, 1.1451F, -7.7534F, -0.2313F, 0.4538F, 0.0F));

		PartDefinition cube_r411 = lower_jaw2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(15, 102).addBox(-0.7172F, -0.5015F, -0.707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(0.95F, 1.1451F, -7.7534F, -0.1091F, 0.4538F, 0.0F));

		PartDefinition cube_r412 = lower_jaw2.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(45, 102).addBox(-0.7953F, -0.259F, -2.8427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -0.0742F, 0.384F, 0.0F));

		PartDefinition cube_r413 = lower_jaw2.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(102, 40).addBox(-0.8453F, -0.282F, -2.2911F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -0.0393F, 0.384F, 0.0F));

		PartDefinition cube_r414 = lower_jaw2.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(10, 102).addBox(-0.8453F, 0.0823F, -2.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -0.2138F, 0.384F, 0.0F));

		PartDefinition cube_r415 = lower_jaw2.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(97, 48).addBox(-0.8953F, 0.7231F, -0.1607F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -1.6581F, 0.384F, 0.0F));

		PartDefinition cube_r416 = lower_jaw2.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(97, 77).addBox(-0.8953F, 0.0691F, -0.2233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.95F, 1.1451F, -5.3534F, -1.5882F, 0.384F, 0.0F));

		PartDefinition cube_r417 = lower_jaw2.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(100, 94).addBox(-0.95F, 2.2629F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(94, 100).addBox(-0.95F, 1.5629F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.55F, 1.1451F, -2.5534F, -1.5359F, 0.192F, 0.0F));

		PartDefinition cube_r418 = lower_jaw2.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(92, 15).addBox(-0.95F, -0.1284F, -0.3655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(2.55F, 1.1451F, -2.5534F, -1.5184F, 0.192F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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