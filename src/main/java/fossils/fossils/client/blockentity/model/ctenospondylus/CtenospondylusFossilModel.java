package fossils.fossils.client.blockentity.model.ctenospondylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CtenospondylusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
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
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
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
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public CtenospondylusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
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
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.chest = this.body6.getChild("chest");
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
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8764F, 23.3767F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-2.4F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 22).addBox(0.4F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(36, 17).addBox(-0.5F, -1.0904F, 0.891F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 120).addBox(0.0F, -3.7434F, -0.3361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0633F, 2.5101F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(122, 8).addBox(-0.006F, -5.5738F, 0.3056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0633F, 2.5101F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 109).addBox(0.0F, -3.7434F, -0.3361F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.1383F, 1.1101F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(122, 4).addBox(-0.006F, -5.5738F, 0.3056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.1383F, 1.1101F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 118).addBox(-0.006F, -2.9911F, -0.9843F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.0633F, 2.7101F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 110).addBox(0.0F, -3.8411F, -0.0844F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7213F, -1.0089F, -0.9948F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(89, 60).addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9082F, 2.6579F, 0.8702F, -1.587F, -0.4317F, -0.3336F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(0, 120).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 35).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(120, 22).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 6.0552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(111, 31).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 6.1264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(111, 20).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(69, 106).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(18, 112).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 8.0502F, -0.6217F, 1.7889F, 0.1206F, -1.0963F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(27, 105).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(13, 105).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(111, 16).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(102, 103).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(104, 4).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(8, 105).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(3, 105).addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(13, 67).addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0562F, 6.1685F, 0.6928F, 2.8559F, 0.645F, 2.99F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(34, 36).addBox(0.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(59, 90).addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9082F, 2.6579F, 0.8702F, -1.5652F, 0.5116F, 0.191F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(15, 120).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 0).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(89, 120).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1787F, 6.0552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(111, 71).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 6.1264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(69, 111).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(107, 103).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(38, 114).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 8.0502F, -0.6217F, 1.354F, -0.0354F, 1.0774F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(106, 34).addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(105, 83).addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(111, 56).addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 41).addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(90, 104).addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(105, 78).addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(105, 67).addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(68, 0).addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0562F, 6.1685F, 0.6928F, 2.7344F, -0.2112F, -2.9713F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(0, 38).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(118, 74).addBox(-0.5F, -2.7F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 100).addBox(-0.5F, -2.2F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3293F, 1.6625F, -0.1322F, 1.5795F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(26, 70).addBox(0.0F, -4.0868F, -3.4397F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -2.9322F, 0.0F, -0.1745F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(120, 60).addBox(0.0F, 1.9218F, -4.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 2.1118F, 0.0F, -0.1745F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(120, 50).addBox(0.0F, 4.7772F, 0.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(102, 13).addBox(0.0F, 4.1772F, -0.9617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.0647F, 0.0F, -0.1745F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(59, 96).addBox(0.0F, 2.294F, -1.7028F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.2392F, 0.0F, -0.1745F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(120, 25).addBox(0.0F, 0.8658F, 1.0396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 0.4102F, 0.0F, -0.1745F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(84, 113).addBox(0.0F, -7.9466F, -0.4633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.9417F, 0.0F, -0.1745F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(71, 80).addBox(0.0F, -0.8724F, 2.5509F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -1.5752F, 0.0F, -0.1745F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(119, 103).addBox(0.0F, 0.2976F, 3.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -1.1912F, 0.0F, -0.1745F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(119, 100).addBox(0.0F, 0.2004F, 3.2655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -1.453F, 0.0F, -0.1745F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(38, 89).addBox(0.0F, 0.2487F, 3.4242F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -1.6712F, 0.0F, -0.1745F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(99, 113).addBox(0.0F, 6.312F, 2.7336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, -1.5577F, 0.0F, -0.1745F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(39, 118).addBox(0.0F, -0.8331F, -9.4767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 0.4494F, 0.0F, -0.1745F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(49, 121).addBox(0.0F, -4.0844F, -8.9622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 0.7985F, 0.0F, -0.1745F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(120, 63).addBox(0.0F, -8.8219F, 0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 2.0639F, 0.0F, -0.1745F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(88, 79).addBox(0.0F, -5.9695F, -1.8795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.8719F, 0.0F, -0.1745F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(115, 45).addBox(0.0F, -3.7873F, -1.4949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.5359F, 0.0F, -0.1745F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(49, 94).addBox(0.0F, -3.5879F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 2.0159F, 0.0F, -0.1745F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(50, 72).addBox(0.0F, -2.7843F, -3.0001F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1707F, 3.4625F, -0.1322F, 1.5795F, 0.0F, -0.1745F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(52, 81).addBox(-1.1F, -2.944F, -0.2569F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 1.405F, 0.0F, -0.1745F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(3, 91).addBox(-1.1F, -2.43F, 0.6346F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.7505F, 0.0F, -0.1745F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(95, 27).addBox(-1.1F, -2.5968F, -3.3714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(98, 79).addBox(-1.1F, -1.5968F, 2.2786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.3142F, 0.0F, -0.1745F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(99, 121).addBox(-1.3009F, -3.7298F, 0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(102, 99).addBox(-1.3009F, -4.4298F, 0.6203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, -0.4602F, 0.0886F, -0.1745F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(3, 80).addBox(-1.1F, -3.981F, -0.8851F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, -0.1745F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(99, 37).addBox(-1.1F, 1.5275F, -4.3875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, -0.7854F, 0.0F, -0.1745F));

		PartDefinition Hips_r26 = bone2.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(5, 120).addBox(-1.1F, -3.0639F, -4.6236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.1571F, 0.0F, -0.1745F));

		PartDefinition Hips_r27 = bone2.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(12, 80).addBox(-1.1F, -4.3427F, -3.4255F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.4712F, 0.0F, -0.1745F));

		PartDefinition Hips_r28 = bone2.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(89, 66).addBox(-1.1F, -4.049F, -1.6422F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2328F, -1.5262F, 1.1557F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(118, 74).mirror().addBox(-0.5F, -2.7F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(69, 100).mirror().addBox(-0.5F, -2.2F, -1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3293F, 1.6625F, -0.1322F, 1.5795F, 0.0F, 0.0F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(26, 70).mirror().addBox(-1.0F, -4.0868F, -3.4397F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -2.9322F, 0.0F, 0.1745F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(120, 60).mirror().addBox(-1.0F, 1.9218F, -4.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 2.1118F, 0.0F, 0.1745F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(120, 50).mirror().addBox(-1.0F, 4.7772F, 0.0383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(102, 13).mirror().addBox(-1.0F, 4.1772F, -0.9617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.0647F, 0.0F, 0.1745F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(59, 96).mirror().addBox(-1.0F, 2.294F, -1.7028F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.2392F, 0.0F, 0.1745F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(-1.0F, 0.8658F, 1.0396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 0.4102F, 0.0F, 0.1745F));

		PartDefinition Hips_r35 = bone3.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(84, 113).mirror().addBox(-1.0F, -7.9466F, -0.4633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.9417F, 0.0F, 0.1745F));

		PartDefinition Hips_r36 = bone3.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(-1.0F, -0.8724F, 2.5509F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -1.5752F, 0.0F, 0.1745F));

		PartDefinition Hips_r37 = bone3.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(119, 103).mirror().addBox(-1.0F, 0.2976F, 3.0683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -1.1912F, 0.0F, 0.1745F));

		PartDefinition Hips_r38 = bone3.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(119, 100).mirror().addBox(-1.0F, 0.2004F, 3.2655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -1.453F, 0.0F, 0.1745F));

		PartDefinition Hips_r39 = bone3.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-1.0F, 0.2487F, 3.4242F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -1.6712F, 0.0F, 0.1745F));

		PartDefinition Hips_r40 = bone3.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(99, 113).mirror().addBox(-1.0F, 6.312F, 2.7336F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, -1.5577F, 0.0F, 0.1745F));

		PartDefinition Hips_r41 = bone3.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(39, 118).mirror().addBox(-1.0F, -0.8331F, -9.4767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 0.4494F, 0.0F, 0.1745F));

		PartDefinition Hips_r42 = bone3.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(49, 121).mirror().addBox(-1.0F, -4.0844F, -8.9622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 0.7985F, 0.0F, 0.1745F));

		PartDefinition Hips_r43 = bone3.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(120, 63).mirror().addBox(-1.0F, -8.8219F, 0.5011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 2.0639F, 0.0F, 0.1745F));

		PartDefinition Hips_r44 = bone3.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(-1.0F, -5.9695F, -1.8795F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.8719F, 0.0F, 0.1745F));

		PartDefinition Hips_r45 = bone3.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(115, 45).mirror().addBox(-1.0F, -3.7873F, -1.4949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.5359F, 0.0F, 0.1745F));

		PartDefinition Hips_r46 = bone3.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(49, 94).mirror().addBox(-1.0F, -3.5879F, -0.6902F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 2.0159F, 0.0F, 0.1745F));

		PartDefinition Hips_r47 = bone3.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-1.0F, -2.7843F, -3.0001F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.4625F, -0.1322F, 1.5795F, 0.0F, 0.1745F));

		PartDefinition Hips_r48 = bone3.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(52, 81).mirror().addBox(0.1F, -2.944F, -0.2569F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 1.405F, 0.0F, 0.1745F));

		PartDefinition Hips_r49 = bone3.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(3, 91).mirror().addBox(0.1F, -2.43F, 0.6346F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.7505F, 0.0F, 0.1745F));

		PartDefinition Hips_r50 = bone3.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(95, 27).mirror().addBox(0.1F, -2.5968F, -3.3714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 79).mirror().addBox(0.1F, -1.5968F, 2.2786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.3142F, 0.0F, 0.1745F));

		PartDefinition Hips_r51 = bone3.addOrReplaceChild("Hips_r51", CubeListBuilder.create().texOffs(99, 121).mirror().addBox(0.3009F, -3.7298F, 0.6203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(102, 99).mirror().addBox(0.3009F, -4.4298F, 0.6203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, -0.4602F, -0.0886F, 0.1745F));

		PartDefinition Hips_r52 = bone3.addOrReplaceChild("Hips_r52", CubeListBuilder.create().texOffs(3, 80).mirror().addBox(0.1F, -3.981F, -0.8851F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, 0.1745F));

		PartDefinition Hips_r53 = bone3.addOrReplaceChild("Hips_r53", CubeListBuilder.create().texOffs(99, 37).mirror().addBox(0.1F, 1.5275F, -4.3875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, -0.7854F, 0.0F, 0.1745F));

		PartDefinition Hips_r54 = bone3.addOrReplaceChild("Hips_r54", CubeListBuilder.create().texOffs(5, 120).mirror().addBox(0.1F, -3.0639F, -4.6236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.1571F, 0.0F, 0.1745F));

		PartDefinition Hips_r55 = bone3.addOrReplaceChild("Hips_r55", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(0.1F, -4.3427F, -3.4255F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.4712F, 0.0F, 0.1745F));

		PartDefinition Hips_r56 = bone3.addOrReplaceChild("Hips_r56", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(0.1F, -4.049F, -1.6422F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.305F, 0.289F, -0.0426F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(53, 16).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(3, 110).addBox(0.0F, -4.2434F, 1.6639F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0986F, 2.4595F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 103).addBox(0.0F, -4.0434F, -0.2361F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0986F, 2.4595F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(74, 101).addBox(0.0F, -4.2434F, -0.4361F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5675F, 0.8858F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 50).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1642F, 5.6001F, -0.1567F, 0.2484F, -0.1551F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 118).addBox(0.0F, -3.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1976F, 3.8945F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 24).addBox(0.0F, -3.453F, 0.0375F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 110).addBox(0.0F, 0.8F, 3.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 110).addBox(0.0F, 0.2F, 1.1F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 60).addBox(0.0F, 0.0F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 117).addBox(0.0F, -3.6169F, 0.0026F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-1.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(68, 6).addBox(0.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.1883F, 0.2144F, -0.0405F));

		PartDefinition cube_r21 = tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 122).addBox(-0.5F, -2.2257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.043F, 3.8453F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(112, 121).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4721F, 5.1299F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 73).addBox(0.0F, 3.4F, 7.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 117).addBox(0.0F, 2.2F, 5.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1866F, -4.8668F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(57, 120).addBox(-0.5F, -2.4257F, -0.0177F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3589F, 1.9659F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 45).addBox(-0.5F, -2.7257F, -0.0177F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 8).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.2281F, 0.1275F, -0.0295F));

		PartDefinition cube_r27 = tail4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(63, 112).addBox(0.0F, -1.493F, 3.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(76, 122).addBox(0.0F, -1.693F, 1.8866F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 122).addBox(0.0F, -1.868F, -0.1134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(92, 9).addBox(0.0F, 0.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 121).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7332F, 1.4092F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(43, 59).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(54, 123).addBox(0.0F, -1.3325F, 1.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 124).addBox(0.0F, -1.0325F, 3.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.1154F, 0.1734F, -0.02F));

		PartDefinition cube_r31 = tail5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(95, 88).addBox(0.0F, 0.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 32).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, -4.793F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(56, 59).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(124, 39).addBox(0.0F, -0.8325F, 0.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0623F, 0.2178F, 0.0135F));

		PartDefinition cube_r32 = tail6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(103, 34).addBox(0.0F, 0.65F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0916F, -9.7286F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, 0.0374F, -0.3596F, 0.1508F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(13, 60).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.074F, -0.3482F, -0.0253F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.0469F, -0.3054F, 0.0056F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2823F, -2.1294F, -0.6196F, -0.0431F, 0.0147F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(33, 124).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -0.4021F, 0.0677F, 0.1239F, -0.6262F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(77, 113).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -0.4021F, 0.0142F, 0.1811F, -0.9746F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(111, 60).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -2.4021F, -0.0545F, 0.0797F, -0.9836F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -2.4021F, -0.0314F, 0.0518F, -0.6349F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(110, 85).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -4.4021F, -0.1414F, -0.0512F, -0.9848F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(122, 118).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -4.4021F, -0.1578F, -0.0416F, -0.6355F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -6.4021F, -0.0155F, 0.1377F, -0.9793F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(99, 46).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -6.4021F, 0.0251F, 0.0931F, -0.6308F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(77, 113).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -0.4021F, 0.0142F, -0.1811F, 0.9746F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(33, 124).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -0.4021F, 0.0677F, -0.1239F, 0.6262F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(111, 60).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -2.4021F, -0.0545F, -0.0797F, 0.9836F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -2.4021F, -0.0314F, -0.0518F, 0.6349F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(110, 85).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -4.4021F, -0.1414F, 0.0512F, 0.9848F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(122, 118).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -4.4021F, -0.1578F, 0.0416F, 0.6355F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(68, 38).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -6.4021F, -0.0155F, -0.1377F, 0.9793F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(99, 46).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -6.4021F, 0.0251F, -0.0931F, 0.6308F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(122, 0).addBox(-0.008F, -5.5554F, 0.9727F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.3156F, -0.4767F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(15, 110).addBox(-0.005F, -3.9469F, -0.0094F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.3156F, -0.4767F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(118, 121).addBox(0.0F, -1.4411F, -0.6844F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7157F, -0.2767F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(74, 108).addBox(0.0F, -4.1421F, -0.9034F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.9217F, -1.0685F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(23, 118).addBox(-0.005F, -7.0213F, -1.3303F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.9217F, -1.0685F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(104, 117).addBox(-0.005F, -8.3079F, -0.8107F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6701F, -2.8737F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 97).addBox(0.0F, -5.3541F, -0.4379F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6701F, -2.8737F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 81).addBox(0.0F, -9.1928F, -0.2623F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5163F, -4.191F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 79).addBox(0.0F, -9.4929F, -0.0623F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6972F, -5.4784F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 80).addBox(0.0F, -9.6928F, -0.2623F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.76F, -6.3762F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -1.3F, 8.9974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.197F, -15.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6384F, -6.8808F, 0.0756F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r17 = body2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(5, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.1131F, 0.1343F, -0.5521F));

		PartDefinition Bodyfront_r18 = body2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.0537F, 0.2063F, -0.8988F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(111, 75).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0305F, 0.2109F, -1.3003F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(5, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.1131F, -0.1343F, 0.5521F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(112, 12).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.0537F, -0.2063F, 0.8988F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(111, 75).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0305F, -0.2109F, 1.3003F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(109, 91).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1216F, -0.7954F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(108, 56).addBox(-0.004F, -9.8597F, -0.5867F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1216F, -0.7954F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(108, 17).addBox(-0.004F, -9.8597F, -0.5867F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2216F, -1.7954F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 109).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2216F, -1.7954F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(98, 83).addBox(-0.5F, -0.3716F, 6.9779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3152F, -1.7638F, 0.2501F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = body3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(112, 87).mirror().addBox(-4.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5035F, -0.0596F, 0.1195F, -1.2696F));

		PartDefinition Bodyfront_r24 = body3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(112, 43).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5035F, -0.0091F, 0.1332F, -0.874F));

		PartDefinition Bodyfront_r25 = body3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(23, 123).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -1.5035F, 0.0295F, 0.0867F, -0.5259F));

		PartDefinition Bodyfront_r26 = body3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(15, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4035F, 0.1859F, 0.1666F, -0.4893F));

		PartDefinition Bodyfront_r27 = body3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(112, 41).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4035F, 0.1121F, 0.2611F, -0.8334F));

		PartDefinition Bodyfront_r28 = body3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1911F, -3.4035F, 0.0011F, 0.2837F, -1.2407F));

		PartDefinition Bodyfront_r29 = body3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(41, 112).mirror().addBox(-7.6968F, -3.6044F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4035F, -0.0885F, 0.3714F, -1.5668F));

		PartDefinition Bodyfront_r30 = body3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(86, 7).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4035F, 0.0503F, 0.3781F, -1.1915F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(112, 39).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4035F, 0.1961F, 0.3291F, -0.7757F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(10, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2911F, -5.4035F, 0.2861F, 0.2038F, -0.4376F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(112, 87).addBox(2.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5035F, -0.0596F, -0.1195F, 1.2696F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(112, 43).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5035F, -0.0091F, -0.1332F, 0.874F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(23, 123).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -1.5035F, 0.0295F, -0.0867F, 0.5259F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(15, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4035F, 0.1859F, -0.1666F, 0.4893F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(112, 41).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4035F, 0.1121F, -0.2611F, 0.8334F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(88, 33).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1911F, -3.4035F, 0.0011F, -0.2837F, 1.2407F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(41, 112).addBox(5.6968F, -3.6044F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4035F, -0.0885F, -0.3714F, 1.5668F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(86, 7).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4035F, 0.0503F, -0.3781F, 1.1915F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(93, 109).addBox(0.0F, -4.8928F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6368F, -0.8316F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(52, 107).addBox(-0.004F, -9.8597F, -0.5867F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6368F, -0.8316F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(66, 108).addBox(0.0F, -4.8928F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1632F, -1.7816F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 100).addBox(-0.004F, -10.8597F, -0.5867F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1632F, -1.7816F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(99, 96).addBox(-0.004F, -10.8597F, -0.5867F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -2.7816F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(109, 24).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -2.7816F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 99).addBox(-0.004F, -10.8597F, -0.5867F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -3.7816F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(109, 7).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -3.7816F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(109, 39).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -4.8566F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 101).addBox(-0.004F, -10.8597F, -0.5867F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -4.8566F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(109, 0).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -5.8816F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(49, 99).addBox(-0.004F, -10.8597F, -0.5867F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0882F, -5.8816F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(112, 39).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4035F, 0.1961F, -0.3291F, 0.7757F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(10, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2911F, -5.4035F, 0.2861F, -0.2038F, 0.4376F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.7997F, -3.574F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.3904F, -0.0581F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(23, 107).addBox(0.0F, -4.9009F, -4.5675F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(96, 115).addBox(0.0F, -3.7009F, -3.3675F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9763F, 0.1634F, -0.0861F, -0.0142F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(123, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1848F, 0.1494F, -0.4394F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(112, 91).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.117F, 0.2445F, -0.7821F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0125F, 0.2702F, -1.1875F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-8.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0713F, 0.2612F, -1.504F));

		PartDefinition Bodyfront_r47 = body4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-9.6968F, -3.6044F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.0714F, 0.2574F, -1.513F));

		PartDefinition Bodyfront_r48 = body4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(88, 38).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0231F, 0.2659F, -1.1516F));

		PartDefinition Bodyfront_r49 = body4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.1249F, 0.2365F, -0.7471F));

		PartDefinition Bodyfront_r50 = body4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(123, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.1894F, 0.1393F, -0.4056F));

		PartDefinition Bodyfront_r51 = body4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(123, 47).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1848F, -0.1494F, 0.4394F));

		PartDefinition Bodyfront_r52 = body4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(112, 91).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.117F, -0.2445F, 0.7821F));

		PartDefinition Bodyfront_r53 = body4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(88, 46).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0125F, -0.2702F, 1.1875F));

		PartDefinition Bodyfront_r54 = body4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(60, 57).addBox(5.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0713F, -0.2612F, 1.504F));

		PartDefinition cube_r63 = body4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(27, 96).addBox(-0.004F, -11.8597F, -0.5867F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.642F, -1.0052F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(20, 116).addBox(0.0F, -4.8929F, -0.0623F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.642F, -1.0052F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, -4.8928F, -0.0623F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.492F, -2.0052F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(95, 79).addBox(-0.004F, -11.8597F, -0.5867F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.492F, -2.0052F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(46, 89).addBox(-0.004F, -12.8597F, -0.5867F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.192F, -3.3052F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(77, 96).addBox(-0.004F, -11.8597F, -0.5867F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.008F, -4.5052F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r55 = body4.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(88, 40).addBox(5.6968F, -3.6044F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.0714F, -0.2574F, 1.513F));

		PartDefinition Bodyfront_r56 = body4.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(88, 38).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0231F, -0.2659F, 1.1516F));

		PartDefinition Bodyfront_r57 = body4.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(112, 89).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.1249F, -0.2365F, 0.7471F));

		PartDefinition Bodyfront_r58 = body4.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(123, 45).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.1894F, -0.1393F, 0.4056F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(23, 10).addBox(-2.5F, -1.9F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.3494F, 1.46F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 50).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.425F, -4.85F, 0.0668F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r59 = body5.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(28, 124).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.1529F, 0.1344F, -0.4439F));

		PartDefinition Bodyfront_r60 = body5.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(113, 62).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.0917F, 0.2198F, -0.7879F));

		PartDefinition Bodyfront_r61 = body5.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, -0.0009F, 0.2378F, -1.1909F));

		PartDefinition Bodyfront_r62 = body5.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-10.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, -0.0737F, 0.2264F, -1.5045F));

		PartDefinition Bodyfront_r63 = body5.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(75, 42).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r64 = body5.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(89, 72).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r65 = body5.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(110, 112).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r66 = body5.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(121, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -2.2272F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r67 = body5.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(28, 124).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.1529F, -0.1344F, 0.4439F));

		PartDefinition Bodyfront_r68 = body5.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(113, 62).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.0917F, -0.2198F, 0.7879F));

		PartDefinition Bodyfront_r69 = body5.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(90, 18).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, -0.0009F, -0.2378F, 1.1909F));

		PartDefinition cube_r71 = body5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(71, 90).addBox(-0.004F, -7.9741F, -0.0161F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.4255F, -0.7404F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(77, 105).addBox(0.0F, -4.1933F, -0.0378F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.208F, -0.8552F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(63, 105).addBox(0.0F, -4.1933F, -0.0378F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.408F, -2.1552F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body5.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(43, 89).addBox(-0.004F, -12.1741F, -0.4161F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.408F, -2.1552F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 94).addBox(-0.004F, -12.5719F, -0.5329F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.067F, -3.4552F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(93, 96).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.067F, -3.4552F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r70 = body5.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(77, 18).addBox(5.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, -0.0737F, -0.2264F, 1.5045F));

		PartDefinition Bodyfront_r71 = body5.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(75, 42).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r72 = body5.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(89, 72).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r73 = body5.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(110, 112).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r74 = body5.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(121, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -2.2272F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition cube_r77 = body5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(34, 29).addBox(-2.5F, 12.1285F, 5.2779F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(77, 12).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.325F, -3.9F, 0.0583F, -0.0871F, -0.0051F));

		PartDefinition Bodyfront_r75 = body6.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(63, 122).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -4.4272F, 0.0927F, 0.0974F, -0.417F));

		PartDefinition Bodyfront_r76 = body6.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(113, 64).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -4.4272F, 0.0471F, 0.1647F, -0.7626F));

		PartDefinition Bodyfront_r77 = body6.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -4.4272F, -0.0201F, 0.17F, -1.1609F));

		PartDefinition Bodyfront_r78 = body6.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-10.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -4.4272F, -0.0775F, 0.1528F, -1.5142F));

		PartDefinition Bodyfront_r79 = body6.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(68, 122).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.1212F, 0.1194F, -0.4479F));

		PartDefinition Bodyfront_r80 = body6.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(110, 54).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.0666F, 0.195F, -0.7931F));

		PartDefinition Bodyfront_r81 = body6.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, -0.0142F, 0.2054F, -1.1938F));

		PartDefinition Bodyfront_r82 = body6.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-11.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, -0.076F, 0.1915F, -1.505F));

		PartDefinition Bodyfront_r83 = body6.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -2.3772F, -0.0765F, 0.1703F, -1.514F));

		PartDefinition Bodyfront_r84 = body6.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(53, 40).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -2.3772F, -0.013F, 0.186F, -1.1597F));

		PartDefinition Bodyfront_r85 = body6.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(109, 14).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -2.3772F, 0.0599F, 0.1767F, -0.7604F));

		PartDefinition Bodyfront_r86 = body6.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(122, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -2.3772F, 0.1088F, 0.1044F, -0.4154F));

		PartDefinition Bodyfront_r87 = body6.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(68, 122).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.1212F, -0.1194F, 0.4479F));

		PartDefinition Bodyfront_r88 = body6.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(110, 54).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.0666F, -0.195F, 0.7931F));

		PartDefinition Bodyfront_r89 = body6.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(90, 20).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, -0.0142F, -0.2054F, 1.1938F));

		PartDefinition Bodyfront_r90 = body6.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(75, 44).addBox(5.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, -0.076F, -0.1915F, 1.505F));

		PartDefinition Bodyfront_r91 = body6.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(77, 20).addBox(5.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -4.4272F, -0.0775F, -0.1528F, 1.5142F));

		PartDefinition Bodyfront_r92 = body6.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(90, 22).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -4.4272F, -0.0201F, -0.17F, 1.1609F));

		PartDefinition Bodyfront_r93 = body6.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(113, 64).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -4.4272F, 0.0471F, -0.1647F, 0.7626F));

		PartDefinition Bodyfront_r94 = body6.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(63, 122).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -4.4272F, 0.0927F, -0.0974F, 0.417F));

		PartDefinition Bodyfront_r95 = body6.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(36, 26).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -2.3772F, -0.0765F, -0.1703F, 1.514F));

		PartDefinition cube_r78 = body6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(90, 96).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.258F, -0.8552F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(74, 92).addBox(-0.004F, -12.5719F, -0.5329F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.258F, -0.8552F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(24, 92).addBox(-0.004F, -12.5719F, -0.5329F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.058F, -2.1802F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(3, 97).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.058F, -2.1802F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.683F, -3.5802F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(46, 99).addBox(-0.004F, -11.5719F, -0.5329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.683F, -3.5802F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 99).addBox(-0.004F, -11.5719F, -0.5329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.283F, -5.0802F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(96, 96).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.283F, -5.0802F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r96 = body6.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(53, 40).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -2.3772F, -0.013F, -0.186F, 1.1597F));

		PartDefinition Bodyfront_r97 = body6.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(109, 14).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -2.3772F, 0.0599F, -0.1767F, 0.7604F));

		PartDefinition Bodyfront_r98 = body6.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(122, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -2.3772F, 0.1088F, -0.1044F, 0.4154F));

		PartDefinition cube_r86 = body6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 9).addBox(-2.5F, -2.0F, -6.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.9711F, 1.208F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(49, 42).addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body6.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5017F, -5.9355F, 0.0671F, -0.0871F, -0.0058F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(40, 97).addBox(-0.004F, -11.5719F, -0.5329F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4848F, -0.6447F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(6, 97).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4848F, -0.6447F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(37, 97).addBox(-0.004F, -5.9932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.4829F, -2.3913F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(19, 97).addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1152F, -2.2447F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 79).addBox(0.0F, -10.2369F, -0.1667F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1466F, -3.7482F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(28, 85).addBox(0.0F, -8.2715F, -0.1221F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0569F, -5.5821F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r99 = chest.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(84, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -0.3417F, 0.0933F, 0.0959F, -0.3995F));

		PartDefinition Bodyfront_r100 = chest.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(112, 102).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -0.3417F, 0.0481F, 0.1635F, -0.7449F));

		PartDefinition Bodyfront_r101 = chest.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(75, 46).mirror().addBox(-9.8995F, -3.0361F, -0.7277F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -0.3417F, -0.1023F, 0.1733F, -1.4516F));

		PartDefinition Bodyfront_r102 = chest.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(96, 69).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -0.3417F, -0.0187F, 0.1694F, -1.1432F));

		PartDefinition Bodyfront_r103 = chest.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(86, 5).mirror().addBox(-8.8949F, -3.0518F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -2.3417F, -0.0784F, 0.1917F, -1.505F));

		PartDefinition Bodyfront_r104 = chest.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(94, 35).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -2.3417F, -0.0164F, 0.2063F, -1.1937F));

		PartDefinition Bodyfront_r105 = chest.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(112, 95).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -2.3417F, 0.0648F, 0.1966F, -0.7929F));

		PartDefinition Bodyfront_r106 = chest.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(79, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -2.3417F, 0.1201F, 0.1215F, -0.4475F));

		PartDefinition Bodyfront_r107 = chest.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(123, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.2007F, 0.1576F, -0.5578F));

		PartDefinition Bodyfront_r108 = chest.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(112, 93).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.1295F, 0.2575F, -0.8999F));

		PartDefinition Bodyfront_r109 = chest.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(68, 36).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.0187F, 0.287F, -1.3067F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(98, 87).mirror().addBox(-0.7963F, -0.1618F, 0.3694F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5418F, 11.6765F, -2.3921F, -0.15F, 0.2487F, -0.0826F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-0.7963F, -0.2258F, -2.4876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5418F, 11.6765F, -2.3921F, -0.3245F, 0.2487F, -0.0826F));

		PartDefinition Bodyfront_r110 = chest.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(84, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -0.3417F, 0.0933F, -0.0959F, 0.3995F));

		PartDefinition Bodyfront_r111 = chest.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(112, 102).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -0.3417F, 0.0481F, -0.1635F, 0.7449F));

		PartDefinition Bodyfront_r112 = chest.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(75, 46).addBox(4.8995F, -3.0361F, -0.7277F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -0.3417F, -0.1023F, -0.1733F, 1.4516F));

		PartDefinition Bodyfront_r113 = chest.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(96, 69).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -0.3417F, -0.0187F, -0.1694F, 1.1432F));

		PartDefinition Bodyfront_r114 = chest.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(86, 5).addBox(4.8949F, -3.0518F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -2.3417F, -0.0784F, -0.1917F, 1.505F));

		PartDefinition Bodyfront_r115 = chest.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(94, 35).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -2.3417F, -0.0164F, -0.2063F, 1.1937F));

		PartDefinition Bodyfront_r116 = chest.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(112, 95).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -2.3417F, 0.0648F, -0.1966F, 0.7929F));

		PartDefinition Bodyfront_r117 = chest.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(79, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -2.3417F, 0.1201F, -0.1215F, 0.4475F));

		PartDefinition Bodyfront_r118 = chest.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(123, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.2007F, -0.1576F, 0.5578F));

		PartDefinition Bodyfront_r119 = chest.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(112, 93).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.1295F, -0.2575F, 0.8999F));

		PartDefinition Bodyfront_r120 = chest.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(68, 36).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.0187F, -0.287F, 1.3067F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(98, 87).addBox(-0.2037F, -0.1618F, 0.3694F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5418F, 11.6765F, -2.3921F, -0.15F, -0.2487F, 0.0826F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(79, 86).addBox(-0.2037F, -0.2258F, -2.4876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5418F, 11.6765F, -2.3921F, -0.3245F, -0.2487F, 0.0826F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(95, 14).addBox(-1.0418F, -0.081F, 0.644F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.6765F, -2.3921F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 65).addBox(-1.5418F, -0.2258F, -2.1908F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.6765F, -2.3921F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(26, 65).addBox(-2.5418F, 0.0728F, -5.0479F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.6765F, -2.3921F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(17, 47).addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(31, 84).addBox(-0.599F, 2.8702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(68, 28).addBox(-0.599F, -0.1298F, -1.7446F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3819F, 9.0442F, -1.6418F, -0.0479F, -0.0081F, -1.1923F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(116, 56).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 3.8702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(37, 105).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 5.8702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(88, 12).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 9.1021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(31, 110).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 7.6827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(112, 4).addBox(-0.3997F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2549F, 8.2932F, -0.5251F, -1.4548F, 0.3495F, -0.6053F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(32, 105).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(22, 101).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(80, 103).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(26, 110).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(80, 96).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(41, 66).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.2391F, 0.0302F, 1.1814F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(53, 28).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, -0.0039F, -0.0008F, 0.0088F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(84, 48).addBox(-0.401F, 2.8702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(69, 57).addBox(-0.401F, -0.1298F, -1.7446F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3819F, 9.0442F, -1.6418F, -0.1888F, -0.1828F, 1.1751F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 3.8702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(58, 105).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 5.8702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(88, 27).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 9.1021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(110, 81).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 7.6827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(112, 8).addBox(-0.6003F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2549F, 8.2932F, -0.5251F, -1.4516F, -0.2274F, 0.8504F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(105, 51).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(103, 56).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(85, 103).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(110, 77).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(85, 96).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(54, 66).addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.4716F, -0.3453F, -1.1645F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(53, 34).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, -0.0038F, 0.0011F, 0.0785F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4986F, 5.899F, -5.2689F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Bodyfront_r121 = bone.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(38, 84).addBox(-0.9F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0004F, 2.4223F, -1.7499F, 1.1297F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r122 = bone.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(86, 91).addBox(-0.625F, 0.8F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.0636F, 4.0452F, -2.4741F, 1.6057F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r123 = bone.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(12, 97).addBox(-0.5F, -1.0633F, -2.2864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2441F, 4.4888F, 0.6555F, 0.262F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r124 = bone.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7637F, 3.116F, -1.0537F, 0.6021F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r125 = bone.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(79, 91).addBox(-1.15F, -1.2016F, -1.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.0785F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r126 = bone.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(68, 12).addBox(-1.15F, 0.2234F, -0.3277F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.9425F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r127 = bone.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(91, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.2689F, 3.6677F, -2.33F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r128 = bone.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(31, 91).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.7783F, 4.9798F, -2.2864F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r129 = bone.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(115, 66).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -3.7395F, 5.2554F, -1.85F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r130 = bone.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(63, 115).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -4.7272F, 5.099F, -1.4137F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r131 = bone.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(115, 49).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -5.5799F, 4.5765F, -1.021F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r132 = bone.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(109, 114).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -4.5105F, 3.8306F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r133 = bone.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(81, 22).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9727F, 4.8599F, 0.8814F, -0.3925F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r134 = bone.addOrReplaceChild("Bodyfront_r134", CubeListBuilder.create().texOffs(72, 74).addBox(-0.5F, -1.8F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9727F, 4.8599F, 0.8814F, -0.567F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r135 = bone.addOrReplaceChild("Bodyfront_r135", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, -0.2F, -3.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.5727F, 4.8599F, 0.9814F, -0.2616F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r136 = bone.addOrReplaceChild("Bodyfront_r136", CubeListBuilder.create().texOffs(10, 91).addBox(-0.5F, 0.0544F, 0.0633F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4495F, 1.6789F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r137 = bone.addOrReplaceChild("Bodyfront_r137", CubeListBuilder.create().texOffs(99, 74).addBox(-0.5F, -2.4456F, 0.2633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -3.7F, -0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r138 = bone.addOrReplaceChild("Bodyfront_r138", CubeListBuilder.create().texOffs(115, 108).addBox(0.1776F, -3.6883F, 0.5163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.2371F, 0.0102F, 0.2447F));

		PartDefinition Bodyfront_r139 = bone.addOrReplaceChild("Bodyfront_r139", CubeListBuilder.create().texOffs(108, 63).addBox(-0.077F, 0.4032F, -0.2765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -1.5025F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r140 = bone.addOrReplaceChild("Bodyfront_r140", CubeListBuilder.create().texOffs(121, 56).addBox(-0.077F, 1.5582F, 0.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.4815F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r141 = bone.addOrReplaceChild("Bodyfront_r141", CubeListBuilder.create().texOffs(3, 86).addBox(-0.9F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4754F, 2.3314F, -4.0267F, -0.5377F, -0.3763F, 0.0448F));

		PartDefinition Bodyfront_r142 = bone.addOrReplaceChild("Bodyfront_r142", CubeListBuilder.create().texOffs(86, 0).addBox(-0.077F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F))
				.texOffs(115, 77).addBox(-0.077F, 0.3552F, -0.2326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.7607F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r143 = bone.addOrReplaceChild("Bodyfront_r143", CubeListBuilder.create().texOffs(121, 34).addBox(-0.077F, 0.9235F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, 0.0683F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r144 = bone.addOrReplaceChild("Bodyfront_r144", CubeListBuilder.create().texOffs(15, 116).addBox(-0.077F, -0.6201F, -0.261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.4989F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r145 = bone.addOrReplaceChild("Bodyfront_r145", CubeListBuilder.create().texOffs(116, 18).addBox(-0.077F, -0.8913F, -0.6309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.9789F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r146 = bone.addOrReplaceChild("Bodyfront_r146", CubeListBuilder.create().texOffs(115, 81).addBox(0.1776F, -2.0838F, 0.0342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9967F, 1.3168F, -2.4301F, -0.4989F, 0.0102F, 0.2447F));

		PartDefinition Bodyfront_r147 = bone.addOrReplaceChild("Bodyfront_r147", CubeListBuilder.create().texOffs(22, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0392F, -2.1916F, -0.7152F, 0.0247F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r148 = bone.addOrReplaceChild("Bodyfront_r148", CubeListBuilder.create().texOffs(79, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0159F, -5.1852F, -0.5276F, -0.0626F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r149 = bone.addOrReplaceChild("Bodyfront_r149", CubeListBuilder.create().texOffs(102, 30).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.034F, -5.5297F, 0.6433F, -0.3244F, 0.0102F, 0.0178F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4986F, 5.899F, -5.2689F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Bodyfront_r150 = bone4.addOrReplaceChild("Bodyfront_r150", CubeListBuilder.create().texOffs(38, 84).mirror().addBox(-0.1F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0004F, 2.4223F, -1.7499F, 1.1297F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r151 = bone4.addOrReplaceChild("Bodyfront_r151", CubeListBuilder.create().texOffs(86, 91).mirror().addBox(-0.375F, 0.8F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.0636F, 4.0452F, -2.4741F, 1.6057F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r152 = bone4.addOrReplaceChild("Bodyfront_r152", CubeListBuilder.create().texOffs(12, 97).mirror().addBox(-0.5F, -1.0633F, -2.2864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.2441F, 4.4888F, 0.6555F, 0.262F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r153 = bone4.addOrReplaceChild("Bodyfront_r153", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7637F, 3.116F, -1.0537F, 0.6021F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r154 = bone4.addOrReplaceChild("Bodyfront_r154", CubeListBuilder.create().texOffs(79, 91).mirror().addBox(0.15F, -1.2016F, -1.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.0785F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r155 = bone4.addOrReplaceChild("Bodyfront_r155", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(0.15F, 0.2234F, -0.3277F, 1.0F, 6.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.9425F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r156 = bone4.addOrReplaceChild("Bodyfront_r156", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2689F, 3.6677F, -2.33F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r157 = bone4.addOrReplaceChild("Bodyfront_r157", CubeListBuilder.create().texOffs(31, 91).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.7783F, 4.9798F, -2.2864F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r158 = bone4.addOrReplaceChild("Bodyfront_r158", CubeListBuilder.create().texOffs(115, 66).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7395F, 5.2554F, -1.85F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r159 = bone4.addOrReplaceChild("Bodyfront_r159", CubeListBuilder.create().texOffs(63, 115).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.7272F, 5.099F, -1.4137F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r160 = bone4.addOrReplaceChild("Bodyfront_r160", CubeListBuilder.create().texOffs(115, 49).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5799F, 4.5765F, -1.021F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r161 = bone4.addOrReplaceChild("Bodyfront_r161", CubeListBuilder.create().texOffs(109, 114).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.5105F, 3.8306F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r162 = bone4.addOrReplaceChild("Bodyfront_r162", CubeListBuilder.create().texOffs(81, 22).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.9727F, 4.8599F, 0.8814F, -0.3925F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r163 = bone4.addOrReplaceChild("Bodyfront_r163", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(-0.5F, -1.8F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9727F, 4.8599F, 0.8814F, -0.567F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r164 = bone4.addOrReplaceChild("Bodyfront_r164", CubeListBuilder.create().texOffs(17, 29).mirror().addBox(-0.5F, -0.2F, -3.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.5727F, 4.8599F, 0.9814F, -0.2616F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r165 = bone4.addOrReplaceChild("Bodyfront_r165", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(-0.5F, 0.0544F, 0.0633F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.4495F, 1.6789F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r166 = bone4.addOrReplaceChild("Bodyfront_r166", CubeListBuilder.create().texOffs(99, 74).mirror().addBox(-0.5F, -2.4456F, 0.2633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7F, -0.2F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r167 = bone4.addOrReplaceChild("Bodyfront_r167", CubeListBuilder.create().texOffs(115, 108).mirror().addBox(-1.1776F, -3.6883F, 0.5163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.2371F, -0.0102F, -0.2447F));

		PartDefinition Bodyfront_r168 = bone4.addOrReplaceChild("Bodyfront_r168", CubeListBuilder.create().texOffs(108, 63).mirror().addBox(-0.923F, 0.4032F, -0.2765F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -1.5025F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r169 = bone4.addOrReplaceChild("Bodyfront_r169", CubeListBuilder.create().texOffs(121, 56).mirror().addBox(-0.923F, 1.5582F, 0.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.4815F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r170 = bone4.addOrReplaceChild("Bodyfront_r170", CubeListBuilder.create().texOffs(3, 86).mirror().addBox(-0.1F, -0.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4754F, 2.3314F, -4.0267F, -0.5377F, 0.3763F, -0.0448F));

		PartDefinition Bodyfront_r171 = bone4.addOrReplaceChild("Bodyfront_r171", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.923F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F)).mirror(false)
				.texOffs(115, 77).mirror().addBox(-0.923F, 0.3552F, -0.2326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.7607F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r172 = bone4.addOrReplaceChild("Bodyfront_r172", CubeListBuilder.create().texOffs(121, 34).mirror().addBox(-0.923F, 0.9235F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, 0.0683F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r173 = bone4.addOrReplaceChild("Bodyfront_r173", CubeListBuilder.create().texOffs(15, 116).mirror().addBox(-0.923F, -0.6201F, -0.261F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.4989F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r174 = bone4.addOrReplaceChild("Bodyfront_r174", CubeListBuilder.create().texOffs(116, 18).mirror().addBox(-0.923F, -0.8913F, -0.6309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.9789F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r175 = bone4.addOrReplaceChild("Bodyfront_r175", CubeListBuilder.create().texOffs(115, 81).mirror().addBox(-1.1776F, -2.0838F, 0.0342F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9967F, 1.3168F, -2.4301F, -0.4989F, -0.0102F, -0.2447F));

		PartDefinition Bodyfront_r176 = bone4.addOrReplaceChild("Bodyfront_r176", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0392F, -2.1916F, -0.7152F, 0.0247F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r177 = bone4.addOrReplaceChild("Bodyfront_r177", CubeListBuilder.create().texOffs(79, 28).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0159F, -5.1852F, -0.5276F, -0.0626F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r178 = bone4.addOrReplaceChild("Bodyfront_r178", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.034F, -5.5297F, 0.6433F, -0.3244F, -0.0102F, -0.0178F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.0368F, -0.2616F, -0.0095F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(66, 91).addBox(-0.5F, -6.8815F, -0.0548F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0207F, -1.4892F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(104, 122).addBox(-0.505F, -1.9803F, -0.0187F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.5707F, -2.8392F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r104 = neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 110).addBox(-0.5F, -3.878F, -0.1548F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -2.8392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r179 = neck.addOrReplaceChild("Bodyfront_r179", CubeListBuilder.create().texOffs(121, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -4.5909F, 0.275F, 0.2386F, -0.6465F));

		PartDefinition Bodyfront_r180 = neck.addOrReplaceChild("Bodyfront_r180", CubeListBuilder.create().texOffs(121, 37).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -4.5909F, 0.1729F, 0.3583F, -0.99F));

		PartDefinition Bodyfront_r181 = neck.addOrReplaceChild("Bodyfront_r181", CubeListBuilder.create().texOffs(59, 72).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.1729F, 0.3583F, -0.99F));

		PartDefinition Bodyfront_r182 = neck.addOrReplaceChild("Bodyfront_r182", CubeListBuilder.create().texOffs(121, 121).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.0159F, 0.3959F, -1.4109F));

		PartDefinition Bodyfront_r183 = neck.addOrReplaceChild("Bodyfront_r183", CubeListBuilder.create().texOffs(120, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.275F, 0.2386F, -0.6465F));

		PartDefinition Bodyfront_r184 = neck.addOrReplaceChild("Bodyfront_r184", CubeListBuilder.create().texOffs(112, 106).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0071F, 0.3442F, -1.4141F));

		PartDefinition Bodyfront_r185 = neck.addOrReplaceChild("Bodyfront_r185", CubeListBuilder.create().texOffs(112, 104).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.1427F, 0.3144F, -1.0F));

		PartDefinition Bodyfront_r186 = neck.addOrReplaceChild("Bodyfront_r186", CubeListBuilder.create().texOffs(89, 123).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.2323F, 0.2069F, -0.6559F));

		PartDefinition Bodyfront_r187 = neck.addOrReplaceChild("Bodyfront_r187", CubeListBuilder.create().texOffs(121, 37).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -4.5909F, 0.1729F, -0.3583F, 0.99F));

		PartDefinition Bodyfront_r188 = neck.addOrReplaceChild("Bodyfront_r188", CubeListBuilder.create().texOffs(121, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -4.5909F, 0.275F, -0.2386F, 0.6465F));

		PartDefinition Bodyfront_r189 = neck.addOrReplaceChild("Bodyfront_r189", CubeListBuilder.create().texOffs(59, 72).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.1729F, -0.3583F, 0.99F));

		PartDefinition Bodyfront_r190 = neck.addOrReplaceChild("Bodyfront_r190", CubeListBuilder.create().texOffs(121, 121).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.0159F, -0.3959F, 1.4109F));

		PartDefinition Bodyfront_r191 = neck.addOrReplaceChild("Bodyfront_r191", CubeListBuilder.create().texOffs(120, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.275F, -0.2386F, 0.6465F));

		PartDefinition Bodyfront_r192 = neck.addOrReplaceChild("Bodyfront_r192", CubeListBuilder.create().texOffs(112, 106).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0071F, -0.3442F, 1.4141F));

		PartDefinition Bodyfront_r193 = neck.addOrReplaceChild("Bodyfront_r193", CubeListBuilder.create().texOffs(112, 104).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.1427F, -0.3144F, 1.0F));

		PartDefinition Bodyfront_r194 = neck.addOrReplaceChild("Bodyfront_r194", CubeListBuilder.create().texOffs(89, 123).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.2323F, -0.2069F, 0.6559F));

		PartDefinition cube_r105 = neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5F, -5.7721F, -2.0499F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -3.5392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(34, 42).addBox(-1.0F, -2.9F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -0.5601F, -5.9352F, -0.1022F, -0.4789F, -0.0334F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(121, 15).addBox(-0.549F, 0.132F, -0.7212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 0.9292F, -17.4676F, 2.1598F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(115, 24).addBox(-1.449F, -8.0358F, -4.8757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -4.3068F, -9.5906F, 1.5839F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(114, 114).addBox(-1.4486F, -0.0041F, -0.9528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.9F, -1.1421F, -17.1135F, 1.069F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(116, 32).addBox(-1.449F, -0.1866F, 0.016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -0.9726F, -17.0224F, 0.7898F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(96, 59).addBox(-1.449F, -0.187F, -0.0342F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -2.1689F, -15.638F, 0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(58, 116).addBox(-1.449F, -0.187F, -0.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.9F, -1.6118F, -16.3888F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(47, 50).addBox(-0.9986F, -0.0283F, -4.9726F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.45F, -4.6511F, -9.6709F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(102, 9).addBox(-0.451F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.099F, -0.382F, -14.9287F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(68, 22).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.099F, 1.9555F, -11.5322F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(15, 55).addBox(-2.049F, -0.1148F, -0.2264F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.45F, 0.8746F, -8.7907F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 74).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.149F, 1.7755F, -8.5449F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 85).addBox(-0.999F, -0.4799F, -1.8129F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.45F, -4.5993F, -7.8131F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(80, 56).addBox(-2.0F, -0.55F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.4271F, 0.0023F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(83, 35).addBox(-2.56F, -0.1F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.36F, -1.6691F, 0.2422F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(81, 9).addBox(-3.55F, -0.1F, -0.9F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, -1.6691F, 0.2422F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(121, 12).addBox(-0.5F, -0.3F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.05F, -3.0913F, -1.1438F, -0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 38).addBox(-3.5507F, 0.1543F, -1.5543F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.35F, -2.5873F, -0.2908F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(19, 38).addBox(-2.05F, -4.0007F, -3.5993F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.9533F, -3.8782F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(23, 0).addBox(-2.5F, 0.4543F, -4.5543F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.95F, -2.5873F, -0.2908F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 70).addBox(-2.5512F, -0.3462F, -0.7238F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.012F))
				.texOffs(37, 72).addBox(-2.5512F, -0.3462F, -2.1238F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -3.3167F, -1.8832F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 40).addBox(-1.0F, -0.0547F, -0.0299F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -5.0377F, -7.7175F, -0.2007F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4385F, 0.7768F, -16.9895F, 0.0F, -0.0393F, 0.0F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(110, 50).addBox(-0.5F, -0.0452F, -0.4324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0534F, -2.9325F, 12.4936F, -0.526F, 0.1751F, 0.0674F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(98, 48).addBox(0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0778F, -4.4831F, 15.1526F, -0.1992F, -0.0689F, -0.0116F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(110, 46).addBox(-0.5F, -1.9549F, -0.4341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0534F, -2.9325F, 12.4936F, -0.3863F, 0.1751F, 0.0674F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(109, 98).addBox(-0.5372F, -2.0135F, -0.7046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, -3.0484F, 12.4392F, -0.6481F, 0.1751F, 0.1197F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(105, 88).addBox(-1.3978F, -2.2211F, -0.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.5673F, 11.3686F, -0.572F, 0.024F, -0.2694F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 65).addBox(-0.7851F, -0.1724F, -4.8689F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2678F, -5.4098F, 7.3549F, 0.1633F, 0.333F, -0.963F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(102, 26).addBox(-0.685F, 0.2365F, -6.4892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 58).addBox(-0.7851F, 0.2115F, -4.8892F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.2678F, -5.4098F, 7.3549F, 0.076F, 0.333F, -0.963F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 101).addBox(-0.999F, -0.099F, -0.901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.36F, -3.3629F, 2.1562F, 0.1836F, 0.3441F, -1.0676F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(121, 18).addBox(-0.999F, -0.099F, -0.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.36F, -3.6594F, 2.871F, 0.2416F, 0.4741F, -1.0758F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 107).addBox(-0.4888F, -2.52F, -0.1258F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.3173F, 11.2436F, -0.5152F, 0.2618F, 0.1221F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(101, 22).addBox(-1.8744F, -1.1166F, -1.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.3173F, 11.2436F, 0.5307F, -0.2713F, 0.8241F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 66).addBox(-0.9572F, -0.3185F, -3.9382F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1491F, -5.2433F, 10.473F, 0.2762F, 0.2326F, 0.1631F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(68, 115).addBox(-1.9326F, -1.0601F, -0.1191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.5673F, 11.3686F, 0.1395F, -0.226F, 0.9951F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(42, 107).addBox(-0.4888F, -2.4302F, -0.1896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.3173F, 11.2436F, 0.244F, 0.2618F, 0.1221F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 115).addBox(-2.0416F, -1.0236F, -0.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.5673F, 11.3686F, 0.0307F, 0.3987F, 1.0851F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(18, 107).addBox(-0.4895F, -2.4993F, -0.571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6313F, -3.3173F, 11.2436F, -0.3058F, 0.2618F, 0.1221F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(119, 88).addBox(-0.5095F, -0.7213F, 0.8554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 0.5484F, 0.2532F, 0.0211F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(119, 85).addBox(-0.5584F, -0.2344F, 0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 1.3215F, 0.2511F, 0.0582F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 119).addBox(-0.5086F, -0.3883F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 2.1891F, 0.2532F, 0.0211F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(73, 119).addBox(-0.509F, 0.6428F, -0.953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 1.4473F, 0.2532F, 0.0211F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(68, 119).addBox(-0.5086F, 0.6553F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 1.4822F, 0.2532F, 0.0211F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(63, 119).addBox(-0.358F, -0.891F, -1.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6313F, -3.7173F, 11.2436F, 1.8039F, 0.2684F, 0.0196F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(119, 42).addBox(-0.5062F, -0.2791F, -0.7831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.617F, -2.3976F, 10.5401F, -3.031F, 0.251F, -0.0023F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 110).addBox(-0.5259F, -1.7267F, -0.6312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, -3.031F, 0.251F, 0.0195F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(119, 39).addBox(-0.506F, -0.6579F, -0.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.617F, -2.3976F, 10.5401F, 2.493F, 0.251F, -0.0023F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(117, 118).addBox(-0.5067F, -0.2696F, -0.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.617F, -2.3976F, 10.5401F, -2.6121F, 0.251F, -0.0023F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(112, 118).addBox(-0.5251F, -0.6746F, -1.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, -0.3257F, 0.251F, 0.0195F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(107, 118).addBox(-0.5246F, 0.644F, -0.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, -1.242F, 0.251F, 0.0195F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 74).addBox(-0.525F, -0.925F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7205F, -3.9006F, 10.7583F, 0.2686F, 0.2636F, 0.0231F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(10, 120).addBox(-0.7801F, -0.7749F, -0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(49, 118).addBox(-0.4576F, -0.7449F, -0.3582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8002F, -3.2718F, 11.1142F, 0.2415F, 0.251F, 0.0195F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(28, 114).addBox(-0.3476F, -1.0068F, -0.2503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2871F, 0.7512F, 8.2745F, 0.4187F, 0.1753F, -0.0966F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(23, 114).addBox(-0.3476F, -0.8268F, -0.1603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1586F, 0.9975F, 7.4184F, 0.2616F, 0.1753F, -0.0966F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(104, 113).addBox(-0.3476F, -0.8268F, -0.3403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.06F, 1.106F, 6.8057F, 0.1569F, 0.1753F, -0.0966F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(114, 97).addBox(-0.3476F, -0.0168F, 0.8297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.7846F, 0.0871F, 0.1753F, -0.0966F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(53, 114).addBox(-0.3476F, -0.0168F, 0.1097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.6946F, 0.0871F, 0.1753F, -0.0966F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(48, 114).addBox(-0.3476F, -0.0168F, -0.6103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.6046F, 0.0871F, 0.1753F, -0.0966F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(100, 108).addBox(-0.4256F, -0.7554F, -1.1792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.4246F, -0.0405F, 0.1409F, -0.0915F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(85, 108).addBox(-0.4257F, -1.2219F, -0.2739F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4182F, 0.5711F, 2.6999F, -0.1627F, 0.1409F, -0.0915F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(39, 121).addBox(-0.9064F, -0.3472F, -0.8606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7422F, -0.2794F, 1.874F, 0.0805F, 0.2451F, -0.0934F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(105, 108).addBox(-0.8304F, -1.8573F, -0.1078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3071F, 0.9422F, 0.2126F, 0.2432F, 0.2325F, 0.0407F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 116).addBox(-0.528F, -1.2709F, -0.2752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.197F, 0.7501F, 0.8798F, 0.1678F, 0.2451F, -0.0934F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(29, 121).addBox(-0.5098F, -0.2971F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.0469F, -1.6133F, 1.1386F, 1.596F, 0.2269F, -0.1167F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(34, 121).addBox(-0.5098F, -0.639F, -0.6926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0469F, -1.6133F, 1.1386F, 0.7407F, 0.2269F, -0.1167F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(44, 121).addBox(-0.5098F, -0.285F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0469F, -1.6133F, 1.1386F, -0.097F, 0.2269F, -0.1167F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(101, 18).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4282F, 0.5902F, 2.6481F, -0.8194F, 0.1348F, -0.1274F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(120, 109).addBox(-0.2648F, -0.0235F, 0.0476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0132F))
				.texOffs(120, 106).addBox(-0.2335F, 0.6378F, -0.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6471F, 0.4555F, 10.2676F, -0.7096F, 0.1053F, -0.0074F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(43, 114).addBox(-0.2335F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6471F, 0.4555F, 10.2676F, -0.3954F, 0.1053F, -0.0074F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(100, 91).addBox(-0.4358F, -0.9552F, -0.622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5796F, 0.9505F, 8.9626F, -0.4287F, 0.1934F, -0.082F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(97, 5).addBox(-0.5509F, -1.0009F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0722F, -0.8087F, 12.2498F, 0.2326F, 0.1859F, -0.1211F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 7).addBox(-0.5509F, -1.2109F, -3.5091F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6902F, -3.5628F, 12.0023F, 0.0581F, 0.1859F, -0.1211F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 108).addBox(-0.5F, -0.35F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1874F, -0.46F, 0.1732F, 1.6964F, 0.1967F, -0.0873F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(34, 118).addBox(-1.0234F, -0.0109F, -0.8991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1813F, -1.8068F, -0.0439F, 1.2601F, 0.1967F, -0.0873F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(96, 64).addBox(-0.5509F, -0.0009F, -1.7491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1464F, -2.8586F, 1.4587F, 0.6079F, 0.1859F, -0.1211F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(19, 18).addBox(-1.0509F, 0.0016F, -4.0491F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9355F, -4.1708F, 5.1754F, 0.2991F, 0.177F, -0.0914F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(52, 88).addBox(-0.4576F, -2.2319F, -0.0124F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.4246F, -0.1172F, 0.1689F, -0.1252F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(88, 85).addBox(-0.4567F, -2.2477F, -1.64F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.649F, 0.4102F, 4.4246F, -0.3441F, 0.1689F, -0.1252F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(105, 46).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4735F, 1.0418F, 8.1763F, 0.3481F, 0.1802F, -0.1265F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(106, 72).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 1.3361F, 7.2303F, 0.2782F, 0.1802F, -0.1265F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(103, 62).addBox(-0.9329F, -2.9107F, 0.2138F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.5349F, 1.2153F, 5.9755F, -0.001F, 0.1802F, -0.1265F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(80, 60).addBox(0.3955F, 0.7885F, 0.6131F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3828F, -2.5427F, 13.8684F, -0.2827F, -0.1135F, -0.0287F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(95, 104).addBox(-0.55F, -1.74F, -0.18F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1059F, -2.7334F, 15.8282F, 0.8081F, -0.1135F, -0.0287F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(44, 118).addBox(-0.55F, -0.94F, -0.88F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1059F, -2.7334F, 15.8282F, 0.0664F, -0.1135F, -0.0287F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(17, 92).addBox(0.3955F, -1.3113F, 0.8071F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.3828F, -2.5427F, 13.8684F, -0.5445F, -0.1135F, -0.0287F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(29, 118).addBox(-0.55F, -0.37F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2859F, -1.7106F, 14.1906F, 0.1106F, 0.0567F, -0.0663F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(100, 71).addBox(0.2514F, 0.9028F, 0.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4078F, -2.5427F, 13.8684F, -0.1512F, 0.0567F, -0.0663F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(97, 42).addBox(0.0122F, -0.7377F, -1.6659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(90, 42).addBox(0.0122F, -0.3977F, -1.6659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7428F, -1.2376F, 13.7784F, -0.0794F, 0.182F, -0.1322F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(31, 77).addBox(-0.9927F, -3.067F, -0.035F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1501F, 0.6628F, 9.0048F, 0.5395F, 0.1739F, -0.1446F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3665F, -5.8612F, 9.2755F, 0.0825F, 0.1908F, -0.9887F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(121, 28).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3665F, -5.8612F, 9.2755F, -0.1308F, -0.15F, -1.0142F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(59, 85).addBox(-1.0F, 0.0F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3633F, -5.8807F, 9.1775F, -0.0581F, -0.1901F, -1.4373F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(98, 52).addBox(-1.0F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 97).addBox(0.0F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4622F, -1.3805F, 16.9579F, -1.6871F, -0.081F, 1.5583F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(90, 24).addBox(-1.9996F, -0.5811F, -0.4146F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.4361F, -0.139F, 16.9857F, -1.2357F, -0.0679F, 0.1852F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(117, 53).addBox(-0.0004F, -0.453F, -0.608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4361F, -0.139F, 16.9857F, -0.8867F, -0.0679F, 0.1852F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5385F, 0.7768F, -16.9895F, 0.0F, 0.0393F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(110, 50).mirror().addBox(-0.5F, -0.0452F, -0.4324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0534F, -2.9325F, 12.4936F, -0.526F, -0.1751F, -0.0674F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(98, 48).mirror().addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0778F, -4.4831F, 15.1526F, -0.1992F, 0.0689F, 0.0116F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(110, 46).mirror().addBox(-0.5F, -1.9549F, -0.4341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0534F, -2.9325F, 12.4936F, -0.3863F, -0.1751F, -0.0674F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(109, 98).mirror().addBox(-0.4628F, -2.0135F, -0.7046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9707F, -3.0484F, 12.4392F, -0.6481F, -0.1751F, -0.1197F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(105, 88).mirror().addBox(-0.6022F, -2.2211F, -0.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.5673F, 11.3686F, -0.572F, -0.024F, 0.2694F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.2149F, -0.1724F, -4.8689F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2678F, -5.4098F, 7.3549F, 0.1633F, -0.333F, 0.963F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(-0.3149F, 0.2365F, -6.4892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(0, 58).mirror().addBox(-0.2149F, 0.2115F, -4.8892F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.2678F, -5.4098F, 7.3549F, 0.076F, -0.333F, 0.963F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(30, 101).mirror().addBox(-0.001F, -0.099F, -0.901F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.36F, -3.3629F, 2.1562F, 0.1836F, -0.3441F, 1.0676F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(121, 18).mirror().addBox(-0.001F, -0.099F, -0.451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.36F, -3.6594F, 2.871F, 0.2416F, -0.4741F, 1.0758F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(47, 107).mirror().addBox(-0.5112F, -2.52F, -0.1258F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.3173F, 11.2436F, -0.5152F, -0.2618F, -0.1221F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(101, 22).mirror().addBox(0.8744F, -1.1166F, -1.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.3173F, 11.2436F, 0.5307F, 0.2713F, -0.8241F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.0428F, -0.3185F, -3.9382F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1491F, -5.2433F, 10.473F, 0.2762F, -0.2326F, -0.1631F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(68, 115).mirror().addBox(0.9326F, -1.0601F, -0.1191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.5673F, 11.3686F, 0.1395F, 0.226F, -0.9951F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(42, 107).mirror().addBox(-0.5112F, -2.4302F, -0.1896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.3173F, 11.2436F, 0.244F, -0.2618F, -0.1221F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(78, 115).mirror().addBox(1.0416F, -1.0236F, -0.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.5673F, 11.3686F, 0.0307F, -0.3987F, -1.0851F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(18, 107).mirror().addBox(-0.5105F, -2.4993F, -0.571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.3173F, 11.2436F, -0.3058F, -0.2618F, -0.1221F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(119, 88).mirror().addBox(-0.4905F, -0.7213F, 0.8554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 0.5484F, -0.2532F, -0.0211F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(119, 85).mirror().addBox(-0.4416F, -0.2344F, 0.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 1.3215F, -0.2511F, -0.0582F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(78, 119).mirror().addBox(-0.4914F, -0.3883F, -1.8094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 2.1891F, -0.2532F, -0.0211F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(73, 119).mirror().addBox(-0.491F, 0.6428F, -0.953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 1.4473F, -0.2532F, -0.0211F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(68, 119).mirror().addBox(-0.4914F, 0.6553F, -0.1297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 1.4822F, -0.2532F, -0.0211F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(63, 119).mirror().addBox(-0.642F, -0.891F, -1.7034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.7173F, 11.2436F, 1.8039F, -0.2684F, -0.0196F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(119, 42).mirror().addBox(-0.4938F, -0.2791F, -0.7831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.617F, -2.3976F, 10.5401F, -3.031F, -0.251F, 0.0023F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(36, 110).mirror().addBox(-0.4741F, -1.7267F, -0.6312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, -3.031F, -0.251F, -0.0195F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(119, 39).mirror().addBox(-0.494F, -0.6579F, -0.8529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.617F, -2.3976F, 10.5401F, 2.493F, -0.251F, 0.0023F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(117, 118).mirror().addBox(-0.4933F, -0.2696F, -0.3656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.617F, -2.3976F, 10.5401F, -2.6121F, -0.251F, 0.0023F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(112, 118).mirror().addBox(-0.4749F, -0.6746F, -1.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, -0.3257F, -0.251F, -0.0195F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(107, 118).mirror().addBox(-0.4754F, 0.644F, -0.8501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, -1.242F, -0.251F, -0.0195F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-0.475F, -0.925F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7205F, -3.9006F, 10.7583F, 0.2686F, -0.2636F, -0.0231F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 120).mirror().addBox(-0.2199F, -0.7749F, -0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
				.texOffs(49, 118).mirror().addBox(-0.5424F, -0.7449F, -0.3582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8002F, -3.2718F, 11.1142F, 0.2415F, -0.251F, -0.0195F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(28, 114).mirror().addBox(-0.6524F, -1.0068F, -0.2503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2871F, 0.7512F, 8.2745F, 0.4187F, -0.1753F, 0.0966F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(23, 114).mirror().addBox(-0.6524F, -0.8268F, -0.1603F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1586F, 0.9975F, 7.4184F, 0.2616F, -0.1753F, 0.0966F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(104, 113).mirror().addBox(-0.6524F, -0.8268F, -0.3403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.06F, 1.106F, 6.8057F, 0.1569F, -0.1753F, 0.0966F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(114, 97).mirror().addBox(-0.6524F, -0.0168F, 0.8297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.7846F, 0.0871F, -0.1753F, 0.0966F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(53, 114).mirror().addBox(-0.6524F, -0.0168F, 0.1097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.6946F, 0.0871F, -0.1753F, 0.0966F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(48, 114).mirror().addBox(-0.6524F, -0.0168F, -0.6103F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.6046F, 0.0871F, -0.1753F, 0.0966F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(100, 108).mirror().addBox(-0.5743F, -0.7554F, -1.1792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.4246F, -0.0405F, -0.1409F, 0.0915F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(85, 108).mirror().addBox(-0.5743F, -1.2219F, -0.2739F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4182F, 0.5711F, 2.6999F, -0.1627F, -0.1409F, 0.0915F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(39, 121).mirror().addBox(-0.0936F, -0.3472F, -0.8606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7422F, -0.2794F, 1.874F, 0.0805F, -0.2451F, 0.0934F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.1696F, -1.8573F, -0.1078F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3071F, 0.9422F, 0.2126F, 0.2432F, -0.2325F, -0.0407F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 116).mirror().addBox(-0.472F, -1.2709F, -0.2752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.197F, 0.7501F, 0.8798F, 0.1678F, -0.2451F, 0.0934F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(29, 121).mirror().addBox(-0.4902F, -0.2971F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.0469F, -1.6133F, 1.1386F, 1.596F, -0.2269F, 0.1167F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(34, 121).mirror().addBox(-0.4902F, -0.639F, -0.6926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0469F, -1.6133F, 1.1386F, 0.7407F, -0.2269F, 0.1167F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(44, 121).mirror().addBox(-0.4902F, -0.285F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0469F, -1.6133F, 1.1386F, -0.097F, -0.2269F, 0.1167F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4282F, 0.5902F, 2.6481F, -0.8194F, -0.1348F, 0.1274F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(120, 109).mirror().addBox(-0.7352F, -0.0235F, 0.0476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0132F)).mirror(false)
				.texOffs(120, 106).mirror().addBox(-0.7665F, 0.6378F, -0.2537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.4555F, 10.2676F, -0.7096F, -0.1053F, 0.0074F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(43, 114).mirror().addBox(-0.7665F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.4555F, 10.2676F, -0.3954F, -0.1053F, 0.0074F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(100, 91).mirror().addBox(-0.5642F, -0.9552F, -0.622F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5796F, 0.9505F, 8.9626F, -0.4287F, -0.1934F, 0.082F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-0.4491F, -1.0009F, -1.7991F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0722F, -0.8087F, 12.2498F, 0.2326F, -0.1859F, 0.1211F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(-0.4491F, -1.2109F, -3.5091F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6902F, -3.5628F, 12.0023F, 0.0581F, -0.1859F, 0.1211F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-0.5F, -0.35F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1874F, -0.46F, 0.1732F, 1.6964F, -0.1967F, 0.0873F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(34, 118).mirror().addBox(0.0234F, -0.0109F, -0.8991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1813F, -1.8068F, -0.0439F, 1.2601F, -0.1967F, 0.0873F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-0.4491F, -0.0009F, -1.7491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1464F, -2.8586F, 1.4587F, 0.6079F, -0.1859F, 0.1211F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(19, 18).mirror().addBox(0.0509F, 0.0016F, -4.0491F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9355F, -4.1708F, 5.1754F, 0.2991F, -0.177F, 0.0914F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-0.5424F, -2.2319F, -0.0124F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.4246F, -0.1172F, -0.1689F, 0.1252F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(88, 85).mirror().addBox(-0.5433F, -2.2477F, -1.64F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.649F, 0.4102F, 4.4246F, -0.3441F, -0.1689F, 0.1252F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(105, 46).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4735F, 1.0418F, 8.1763F, 0.3481F, -0.1802F, 0.1265F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(106, 72).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3372F, 1.3361F, 7.2303F, 0.2782F, -0.1802F, 0.1265F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-0.0671F, -2.9107F, 0.2138F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.5349F, 1.2153F, 5.9755F, -0.001F, -0.1802F, 0.1265F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(-1.3955F, 0.7885F, 0.6131F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3828F, -2.5427F, 13.8684F, -0.2827F, 0.1135F, 0.0287F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(95, 104).mirror().addBox(-0.45F, -1.74F, -0.18F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1059F, -2.7334F, 15.8282F, 0.8081F, 0.1135F, 0.0287F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(44, 118).mirror().addBox(-0.45F, -0.94F, -0.88F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1059F, -2.7334F, 15.8282F, 0.0664F, 0.1135F, 0.0287F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(17, 92).mirror().addBox(-1.3955F, -1.3113F, 0.8071F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3828F, -2.5427F, 13.8684F, -0.5445F, 0.1135F, 0.0287F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(29, 118).mirror().addBox(-0.45F, -0.37F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2859F, -1.7106F, 14.1906F, 0.1106F, -0.0567F, 0.0663F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(100, 71).mirror().addBox(-1.2514F, 0.9028F, 0.0479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.4078F, -2.5427F, 13.8684F, -0.1512F, -0.0567F, 0.0663F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-1.0122F, -0.7377F, -1.6659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(90, 42).mirror().addBox(-1.0122F, -0.3977F, -1.6659F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7428F, -1.2376F, 13.7784F, -0.0794F, -0.182F, 0.1322F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(-0.0073F, -3.067F, -0.035F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1501F, 0.6628F, 9.0048F, 0.5395F, -0.1739F, 0.1446F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3665F, -5.8612F, 9.2755F, 0.0825F, -0.1908F, 0.9887F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(121, 28).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3665F, -5.8612F, 9.2755F, -0.1308F, 0.15F, 1.0142F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(0.0F, 0.0F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3633F, -5.8807F, 9.1775F, -0.0581F, 0.1901F, 1.4373F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(98, 52).mirror().addBox(0.0F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 97).mirror().addBox(-1.0F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4622F, -1.3805F, 16.9579F, -1.6871F, 0.081F, -1.5583F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-1.0004F, -0.5811F, -0.4146F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4361F, -0.139F, 16.9857F, -1.2357F, 0.0679F, -0.1852F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(117, 53).mirror().addBox(-0.9996F, -0.453F, -0.608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4361F, -0.139F, 16.9857F, -0.8867F, 0.0679F, -0.1852F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3786F, 0.2125F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r274 = lower_jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-0.5F, -0.85F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9531F, 2.2234F, -4.7676F, -1.8818F, -0.1219F, -0.0632F));

		PartDefinition cube_r275 = lower_jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(110, 67).mirror().addBox(-0.6201F, 0.9608F, 1.2483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -1.644F, -0.1861F, -0.0786F));

		PartDefinition cube_r276 = lower_jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(121, 31).mirror().addBox(-0.6329F, 3.0972F, 0.292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -1.3368F, -0.1868F, -0.0894F));

		PartDefinition cube_r277 = lower_jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(121, 69).mirror().addBox(-0.6329F, 3.3942F, -2.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -0.7259F, -0.1868F, -0.0894F));

		PartDefinition cube_r278 = lower_jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(107, 121).mirror().addBox(-0.6329F, 2.6123F, -2.8308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -0.3332F, -0.1868F, -0.0894F));

		PartDefinition cube_r279 = lower_jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(120, 66).mirror().addBox(-0.6329F, 2.2217F, -2.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -0.1587F, -0.1868F, -0.0894F));

		PartDefinition cube_r280 = lower_jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(33, 114).mirror().addBox(-0.6329F, 0.9627F, -2.0685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -0.0191F, -0.1868F, -0.0894F));

		PartDefinition cube_r281 = lower_jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(59, 101).mirror().addBox(-0.6329F, 0.7646F, 0.8628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.4611F, -9.3946F, -1.3717F, -0.1868F, -0.0894F));

		PartDefinition cube_r282 = lower_jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(116, 28).mirror().addBox(-0.6328F, -2.2685F, 0.9159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.4611F, -9.3946F, -2.5062F, -0.1868F, -0.0894F));

		PartDefinition cube_r283 = lower_jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(79, 80).mirror().addBox(-0.5653F, -2.1337F, -1.6029F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.5542F, -0.126F, -0.0546F));

		PartDefinition cube_r284 = lower_jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(119, 112).mirror().addBox(-0.5F, -0.025F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.5732F, 7.0471F, -6.1915F, -2.5019F, -0.126F, -0.0546F));

		PartDefinition cube_r285 = lower_jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-0.5653F, -2.2624F, -4.091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.4757F, -0.126F, -0.0546F));

		PartDefinition cube_r286 = lower_jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.5653F, -1.5409F, -5.9383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.6502F, -0.126F, -0.0546F));

		PartDefinition cube_r287 = lower_jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(102, 95).mirror().addBox(-0.6328F, -1.2317F, 0.8746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(116, 14).mirror().addBox(-0.6535F, -1.0064F, 2.7719F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 116).mirror().addBox(-0.6535F, -1.1864F, 1.9619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.8203F, -0.1868F, -0.0894F));

		PartDefinition cube_r288 = lower_jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-0.5653F, -1.0139F, -3.0595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9304F, 7.3906F, -10.5894F, -2.5717F, -0.126F, -0.0546F));

		PartDefinition cube_r289 = lower_jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(116, 70).mirror().addBox(-0.5653F, -2.2813F, -2.1571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(120, 77).mirror().addBox(-0.586F, -0.6626F, -2.8547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.3535F, -0.126F, -0.0546F));

		PartDefinition cube_r290 = lower_jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(116, 36).mirror().addBox(-0.5653F, -1.3926F, -2.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.3011F, -0.126F, -0.0546F));

		PartDefinition cube_r291 = lower_jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(94, 121).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4195F, 8.1942F, -13.7201F, -2.2762F, -0.1187F, -0.0743F));

		PartDefinition cube_r292 = lower_jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(117, 8).mirror().addBox(-0.4465F, 1.3556F, 3.5508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.3635F, -0.1187F, -0.0743F));

		PartDefinition cube_r293 = lower_jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(73, 115).mirror().addBox(-0.4965F, 0.1512F, 3.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.6689F, -0.1187F, -0.0743F));

		PartDefinition cube_r294 = lower_jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(5, 116).mirror().addBox(-0.6535F, -1.2441F, 1.1519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.733F, -0.1868F, -0.0894F));

		PartDefinition cube_r295 = lower_jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(99, 117).mirror().addBox(-0.586F, -1.1624F, 0.4014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(117, 4).mirror().addBox(-0.586F, -1.1174F, -0.4086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.6328F, -0.126F, -0.0546F));

		PartDefinition cube_r296 = lower_jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(89, 116).mirror().addBox(-0.586F, -1.2052F, -1.2174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.5979F, -0.126F, -0.0546F));

		PartDefinition cube_r297 = lower_jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(120, 80).mirror().addBox(-0.586F, -0.3746F, -2.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.4931F, -0.126F, -0.0546F));

		PartDefinition cube_r298 = lower_jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(-0.586F, -1.1814F, -3.5827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.1615F, -0.126F, -0.0546F));

		PartDefinition cube_r299 = lower_jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(59, 79).mirror().addBox(-0.5653F, -3.1096F, -5.3095F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1205F, 6.6861F, -9.3946F, -2.0393F, -0.126F, -0.0546F));

		PartDefinition cube_r300 = lower_jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(119, 115).mirror().addBox(0.0008F, 0.7163F, 0.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(11, 73).mirror().addBox(0.0008F, -0.7837F, 0.0134F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6338F, 0.6325F, -4.161F, -1.2448F, -0.1219F, -0.0632F));

		PartDefinition cube_r301 = lower_jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(0.0907F, 0.0192F, 0.0123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7863F, 0.182F, -2.4194F, -1.3874F, -0.0345F, -0.0055F));

		PartDefinition cube_r302 = lower_jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(0.0907F, 0.8992F, -1.0677F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.89F, 0.981F, 0.549F, -1.4748F, -0.0349F, 0.0F));

		PartDefinition cube_r303 = lower_jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.4509F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3071F, 2.9236F, -0.6701F, 1.1694F, -0.0349F, 0.0F));

		PartDefinition cube_r304 = lower_jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(73, 49).mirror().addBox(0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4979F, 5.4391F, -3.8477F, 0.3844F, -0.0698F, -0.0363F));

		PartDefinition cube_r305 = lower_jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(119, 94).mirror().addBox(0.09F, -1.0636F, -1.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.89F, 0.981F, 0.549F, 0.7854F, -0.0349F, 0.0F));

		PartDefinition cube_r306 = lower_jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(55, 110).mirror().addBox(-0.4493F, -2.0007F, -0.0218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3621F, 1.7661F, 0.804F, 1.5882F, -0.0349F, 0.0F));

		PartDefinition cube_r307 = lower_jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(110, 108).mirror().addBox(-0.4493F, -1.6407F, -0.5618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.346F, 1.9812F, 0.3428F, 1.2217F, -0.0349F, 0.0F));

		PartDefinition cube_r308 = lower_jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(119, 97).mirror().addBox(0.0893F, -0.6393F, -0.8307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(119, 91).mirror().addBox(0.0893F, -0.6393F, -1.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.89F, 0.981F, 0.549F, -0.3054F, -0.0349F, 0.0F));

		PartDefinition cube_r309 = lower_jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5F, -0.85F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8531F, 2.2234F, -4.7676F, -1.8818F, 0.1219F, 0.0632F));

		PartDefinition cube_r310 = lower_jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(110, 67).addBox(-0.3799F, 0.9608F, 1.2483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -1.644F, 0.1861F, 0.0786F));

		PartDefinition cube_r311 = lower_jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(121, 31).addBox(-0.3671F, 3.0972F, 0.292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -1.3368F, 0.1868F, 0.0894F));

		PartDefinition cube_r312 = lower_jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(121, 69).addBox(-0.3671F, 3.3942F, -2.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -0.7259F, 0.1868F, 0.0894F));

		PartDefinition cube_r313 = lower_jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(107, 121).addBox(-0.3671F, 2.6123F, -2.8308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -0.3332F, 0.1868F, 0.0894F));

		PartDefinition cube_r314 = lower_jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(120, 66).addBox(-0.3671F, 2.2217F, -2.5328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -0.1587F, 0.1868F, 0.0894F));

		PartDefinition cube_r315 = lower_jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(33, 114).addBox(-0.3671F, 0.9627F, -2.0685F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -0.0191F, 0.1868F, 0.0894F));

		PartDefinition cube_r316 = lower_jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(59, 101).addBox(-0.3671F, 0.7646F, 0.8628F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.4611F, -9.3946F, -1.3717F, 0.1868F, 0.0894F));

		PartDefinition cube_r317 = lower_jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(116, 28).addBox(-0.3672F, -2.2685F, 0.9159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.4611F, -9.3946F, -2.5062F, 0.1868F, 0.0894F));

		PartDefinition cube_r318 = lower_jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(79, 80).addBox(-0.4347F, -2.1337F, -1.6029F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.5542F, 0.126F, 0.0546F));

		PartDefinition cube_r319 = lower_jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(119, 112).addBox(-0.5F, -0.025F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.4732F, 7.0471F, -6.1915F, -2.5019F, 0.126F, 0.0546F));

		PartDefinition cube_r320 = lower_jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(91, 54).addBox(-0.4347F, -2.2624F, -4.091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.4757F, 0.126F, 0.0546F));

		PartDefinition cube_r321 = lower_jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(95, 9).addBox(-0.4347F, -1.5409F, -5.9383F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.6502F, 0.126F, 0.0546F));

		PartDefinition cube_r322 = lower_jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(102, 95).addBox(-0.3672F, -1.2317F, 0.8746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(116, 14).addBox(-0.3465F, -1.0064F, 2.7719F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 116).addBox(-0.3465F, -1.1864F, 1.9619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.8203F, 0.1868F, 0.0894F));

		PartDefinition cube_r323 = lower_jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(12, 86).addBox(-0.4347F, -1.0139F, -3.0595F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8304F, 7.3906F, -10.5894F, -2.5717F, 0.126F, 0.0546F));

		PartDefinition cube_r324 = lower_jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(116, 70).addBox(-0.4347F, -2.2813F, -2.1571F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(120, 77).addBox(-0.414F, -0.6626F, -2.8547F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.3535F, 0.126F, 0.0546F));

		PartDefinition cube_r325 = lower_jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(116, 36).addBox(-0.4347F, -1.3926F, -2.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.3011F, 0.126F, 0.0546F));

		PartDefinition cube_r326 = lower_jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(94, 121).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3195F, 8.1942F, -13.7201F, -2.2762F, 0.1187F, 0.0743F));

		PartDefinition cube_r327 = lower_jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(117, 8).addBox(-0.5535F, 1.3556F, 3.5508F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.3635F, 0.1187F, 0.0743F));

		PartDefinition cube_r328 = lower_jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(73, 115).addBox(-0.5035F, 0.1512F, 3.492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.6689F, 0.1187F, 0.0743F));

		PartDefinition cube_r329 = lower_jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(5, 116).addBox(-0.3465F, -1.2441F, 1.1519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.733F, 0.1868F, 0.0894F));

		PartDefinition cube_r330 = lower_jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(99, 117).addBox(-0.414F, -1.1624F, 0.4014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(117, 4).addBox(-0.414F, -1.1174F, -0.4086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.6328F, 0.126F, 0.0546F));

		PartDefinition cube_r331 = lower_jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(89, 116).addBox(-0.414F, -1.2052F, -1.2174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.5979F, 0.126F, 0.0546F));

		PartDefinition cube_r332 = lower_jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(120, 80).addBox(-0.414F, -0.3746F, -2.0478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.4931F, 0.126F, 0.0546F));

		PartDefinition cube_r333 = lower_jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(98, 56).addBox(-0.414F, -1.1814F, -3.5827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.1615F, 0.126F, 0.0546F));

		PartDefinition cube_r334 = lower_jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(59, 79).addBox(-0.4347F, -3.1096F, -5.3095F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0205F, 6.6861F, -9.3946F, -2.0393F, 0.126F, 0.0546F));

		PartDefinition cube_r335 = lower_jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(119, 115).addBox(-1.0008F, 0.7163F, 0.0134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(11, 73).addBox(-1.0008F, -0.7837F, 0.0134F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5338F, 0.6325F, -4.161F, -1.2448F, 0.1219F, 0.0632F));

		PartDefinition cube_r336 = lower_jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 74).addBox(-1.0907F, 0.0192F, 0.0123F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.6863F, 0.182F, -2.4194F, -1.3874F, 0.0345F, 0.0055F));

		PartDefinition cube_r337 = lower_jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0907F, 0.8992F, -1.0677F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.79F, 0.981F, 0.549F, -1.4748F, 0.0349F, 0.0F));

		PartDefinition cube_r338 = lower_jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(93, 91).addBox(-0.5491F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2071F, 2.9236F, -0.6701F, 1.1694F, 0.0349F, 0.0F));

		PartDefinition cube_r339 = lower_jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(73, 49).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3979F, 5.4391F, -3.8477F, 0.3844F, 0.0698F, 0.0363F));

		PartDefinition cube_r340 = lower_jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(119, 94).addBox(-1.09F, -1.0636F, -1.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.79F, 0.981F, 0.549F, 0.7854F, 0.0349F, 0.0F));

		PartDefinition cube_r341 = lower_jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(55, 110).addBox(-0.5507F, -2.0007F, -0.0218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2621F, 1.7661F, 0.804F, 1.5882F, 0.0349F, 0.0F));

		PartDefinition cube_r342 = lower_jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(110, 108).addBox(-0.5507F, -1.6407F, -0.5618F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.246F, 1.9812F, 0.3428F, 1.2217F, 0.0349F, 0.0F));

		PartDefinition cube_r343 = lower_jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(119, 97).addBox(-1.0893F, -0.6393F, -0.8307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 91).addBox(-1.0893F, -0.6393F, -1.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.79F, 0.981F, 0.549F, -0.3054F, 0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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