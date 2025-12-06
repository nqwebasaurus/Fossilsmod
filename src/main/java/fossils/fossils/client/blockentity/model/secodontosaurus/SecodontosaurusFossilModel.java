package fossils.fossils.client.blockentity.model.secodontosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SecodontosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public SecodontosaurusFossilModel(ModelPart root) {
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
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.chest = this.body7.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -15.7764F, 20.5767F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 39).mirror().addBox(-2.4F, -0.5904F, 6.891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 59).mirror().addBox(-2.4F, -0.5904F, 0.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 39).addBox(0.4F, -0.5904F, 6.891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).addBox(0.4F, -0.5904F, 0.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -1.0904F, 0.891F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 120).addBox(0.003F, -4.4541F, -0.7319F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2035F, 4.5515F, -0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 120).addBox(0.0F, -0.5444F, -0.6693F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2035F, 4.5515F, -0.781F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 129).addBox(0.0F, -2.1039F, -0.2013F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7449F, 1.8235F, -0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 127).addBox(-0.006F, -4.9575F, -0.8486F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7449F, 1.8235F, -1.1039F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 129).addBox(0.0F, -1.7872F, -0.0625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.5146F, 0.0573F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 118).addBox(-0.005F, -3.9122F, -0.1625F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.5916F, 1.4996F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(127, 75).addBox(0.005F, -2.5867F, -0.6121F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.005F, -1.6846F, -1.3201F, -0.9032F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(117, 103).addBox(0.0F, -6.3307F, -1.2074F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.005F, -1.6846F, -1.3201F, -1.1476F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(101, 36).addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8291F, 2.3146F, -0.7783F, -0.7049F, 0.1978F, -0.5173F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(125, 49).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 4).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(127, 64).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 6.0552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(70, 118).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 6.1264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(118, 26).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(114, 65).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(117, 0).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 8.0502F, -0.6217F, 1.0841F, -1.0933F, -0.6303F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(114, 60).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(114, 41).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(116, 46).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 113).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(39, 114).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(114, 4).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(112, 104).addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(70, 31).addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0562F, 6.1685F, 0.6928F, 2.5363F, 0.2903F, 2.1376F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(46, 8).addBox(0.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.7418F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(33, 105).addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.8291F, 2.3146F, -0.7783F, 0.6034F, -0.4081F, 0.2407F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(127, 61).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 125).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(127, 67).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1787F, 6.0552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(5, 125).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 6.1264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(0, 125).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(0, 116).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(124, 121).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 8.0502F, -0.6217F, 1.0841F, 1.0933F, 0.6303F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(115, 114).addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(115, 86).addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(93, 124).addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(57, 115).addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(81, 115).addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(62, 115).addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(52, 115).addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(79, 37).addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0562F, 6.1685F, 0.6928F, 2.9568F, -0.4936F, 2.9738F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(46, 14).addBox(-5.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3093F, -1.711F, 0.1557F, 0.0F, -0.0349F, 0.3927F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(108, 125).addBox(-0.9F, -1.045F, -2.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.2705F, 0.0305F, 0.0F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(105, 31).addBox(-0.9601F, -5.3887F, -3.5374F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -2.8502F, 0.0301F, -0.1746F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8022F, 5.926F, 6.3892F, 2.1817F, 0.0F, -0.1745F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(119, 30).addBox(0.0F, 3.7772F, 0.0383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.2875F, 1.3178F, 1.0647F, 0.0F, -0.1745F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(68, 97).addBox(-0.9601F, 1.3519F, -2.5607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.452F, 0.0301F, -0.1746F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(103, 125).addBox(-0.9905F, 1.6529F, 0.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.7975F, 0.0301F, -0.1746F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(57, 106).addBox(-0.9151F, -6.3494F, -1.3069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.1084F, 0.0603F, -0.1722F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(103, 0).addBox(-0.9151F, 2.3345F, 1.8678F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.4608F, 0.0603F, -0.1722F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(105, 105).addBox(-0.9905F, -1.5695F, 0.4119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.022F, 0.0301F, -0.1746F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(96, 67).addBox(-0.9905F, -0.1825F, 0.7916F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -0.6293F, 0.0301F, -0.1746F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(89, 45).addBox(-0.9905F, -3.0807F, 1.6862F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.5892F, 0.0301F, -0.1746F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(119, 12).addBox(-0.9151F, 6.0108F, 1.4665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.2165F, 0.0603F, -0.1722F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(98, 125).addBox(-0.9151F, -3.5613F, -8.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.9652F, 0.0603F, -0.1722F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(119, 8).addBox(-0.9151F, -7.9474F, 1.2809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.3702F, 0.0603F, -0.1722F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(50, 105).addBox(-0.9905F, -4.3847F, 0.7465F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.5778F, 0.0301F, -0.1746F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(20, 65).addBox(-0.9905F, -2.8881F, -4.2347F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.5742F, 0.0301F, -0.1746F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(114, 93).addBox(-0.9F, -2.1895F, -0.6001F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.5795F, 0.0305F, 0.0F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(125, 86).addBox(-0.5F, -0.325F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2884F, 2.3715F, 0.4264F, 2.3213F, 0.0F, -0.1745F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(91, 12).addBox(-0.5F, -1.0F, -2.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0596F, 0.3982F, 1.184F, 0.6807F, 0.0F, -0.1745F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(98, 105).addBox(-0.5F, -1.0F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1698F, 1.6989F, -1.5019F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(96, 31).addBox(-0.5F, -0.625F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1239F, 0.0334F, 3.7842F, 0.2705F, 0.0F, -0.1745F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(109, 47).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, -0.118F, 3.9317F, 0.0197F, 0.0886F, -0.1745F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(96, 7).addBox(-1.1F, -3.981F, -0.8851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, -0.1745F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(105, 74).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.9649F, -1.6745F, 0.5585F, 0.0F, -0.1745F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(96, 0).addBox(-1.1F, -4.049F, -1.6422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3093F, -1.711F, 0.1557F, 0.0F, 0.0349F, -0.3927F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(108, 125).mirror().addBox(-0.1F, -1.045F, -2.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.2705F, -0.0305F, 0.0F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(105, 31).mirror().addBox(-0.0399F, -5.3887F, -3.5374F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -2.8502F, -0.0301F, 0.1746F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8022F, 5.926F, 6.3892F, 2.1817F, 0.0F, 0.1745F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-1.0F, 3.7772F, 0.0383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.2875F, 1.3178F, 1.0647F, 0.0F, 0.1745F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(68, 97).mirror().addBox(-0.0399F, 1.3519F, -2.5607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.452F, -0.0301F, 0.1746F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(103, 125).mirror().addBox(-0.0095F, 1.6529F, 0.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.7975F, -0.0301F, 0.1746F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(-0.0849F, -6.3494F, -1.3069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.1084F, -0.0603F, 0.1722F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-0.0849F, 2.3345F, 1.8678F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.4608F, -0.0603F, 0.1722F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(105, 105).mirror().addBox(-0.0095F, -1.5695F, 0.4119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.022F, -0.0301F, 0.1746F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(96, 67).mirror().addBox(-0.0095F, -0.1825F, 0.7916F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -0.6293F, -0.0301F, 0.1746F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(89, 45).mirror().addBox(-0.0095F, -3.0807F, 1.6862F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.5892F, -0.0301F, 0.1746F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(119, 12).mirror().addBox(-0.0849F, 6.0108F, 1.4665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.2165F, -0.0603F, 0.1722F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(98, 125).mirror().addBox(-0.0849F, -3.5613F, -8.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.9652F, -0.0603F, 0.1722F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(119, 8).mirror().addBox(-0.0849F, -7.9474F, 1.2809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.3702F, -0.0603F, 0.1722F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(50, 105).mirror().addBox(-0.0095F, -4.3847F, 0.7465F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.5778F, -0.0301F, 0.1746F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(20, 65).mirror().addBox(-0.0095F, -2.8881F, -4.2347F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.5742F, -0.0301F, 0.1746F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(114, 93).mirror().addBox(-0.1F, -2.1895F, -0.6001F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.5795F, -0.0305F, 0.0F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(125, 86).mirror().addBox(-0.5F, -0.325F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2884F, 2.3715F, 0.4264F, 2.3213F, 0.0F, 0.1745F));

		PartDefinition Hips_r44 = bone4.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-0.5F, -1.0F, -2.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0596F, 0.3982F, 1.184F, 0.6807F, 0.0F, 0.1745F));

		PartDefinition Hips_r45 = bone4.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(98, 105).mirror().addBox(-0.5F, -1.0F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1698F, 1.6989F, -1.5019F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition Hips_r46 = bone4.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(96, 31).mirror().addBox(-0.5F, -0.625F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1239F, 0.0334F, 3.7842F, 0.2705F, 0.0F, 0.1745F));

		PartDefinition Hips_r47 = bone4.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(109, 47).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.064F, -0.118F, 3.9317F, 0.0197F, -0.0886F, 0.1745F));

		PartDefinition Hips_r48 = bone4.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(96, 7).mirror().addBox(0.1F, -3.981F, -0.8851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, 0.1745F));

		PartDefinition Hips_r49 = bone4.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9649F, -1.6745F, 0.5585F, 0.0F, 0.1745F));

		PartDefinition Hips_r50 = bone4.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(0.1F, -4.049F, -1.6422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.3446F, -0.2974F, 0.1655F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-1.6F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 20).addBox(-0.4F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 118).addBox(0.0F, -3.4434F, -0.0861F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3396F, 4.912F, -1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(75, 118).addBox(0.0F, -4.1434F, -0.1611F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5809F, 3.1026F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(93, 115).addBox(0.0F, -4.4434F, -0.1361F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3684F, 1.3855F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 125).addBox(0.0F, -1.8F, -2.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8892F, 6.3344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1641F, 5.6001F, -0.2169F, -0.0852F, 0.0188F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(128, 22).addBox(0.0F, -2.25F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6798F, 4.8832F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(116, 125).addBox(0.0F, -2.653F, 0.0375F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.7039F, 2.8534F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 129).addBox(0.0F, 1.1F, 3.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 116).addBox(0.0F, 0.3F, 1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(113, 125).addBox(0.0F, -1.2F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(127, 103).addBox(0.0F, -3.1169F, 0.1026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1293F, 0.9576F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-1.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 73).addBox(0.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 49).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.2398F, -0.1696F, 0.0412F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(111, 63).addBox(-0.5F, -1.4257F, 0.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.043F, 3.8453F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(128, 129).addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4721F, 5.1299F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(129, 120).addBox(0.0F, 3.1F, 7.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1866F, -4.8668F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(129, 89).addBox(0.0F, 0.4F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7231F, 0.3403F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(127, 112).addBox(-0.5F, -1.3257F, 0.9823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3589F, 1.9659F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(127, 93).addBox(-0.5F, -1.5257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0244F, 1.0402F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(35, 49).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1677F, -0.1721F, 0.029F));

		PartDefinition cube_r32 = tail4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 130).addBox(0.0F, -1.393F, 2.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(130, 49).addBox(0.0F, -1.268F, -0.1134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1817F, 1.0056F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(39, 130).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 130).addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7332F, 1.4092F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(65, 12).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(31, 65).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(56, 130).addBox(0.0F, -1.0325F, 2.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 130).addBox(0.0F, -0.8825F, 4.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0266F, 0.1309F, -0.0035F));

		PartDefinition cube_r36 = tail5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 130).addBox(-0.5F, -0.9F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2825F, 0.0688F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.1238F, 0.1732F, 0.0214F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(63, 65).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, 0.0729F, 0.3047F, 0.0219F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(66, 39).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 4.851F, 0.0272F, 0.3053F, 0.0082F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2823F, -2.1294F, -0.672F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(52, 128).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -1.4021F, 0.1389F, 0.3527F, -0.9416F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(128, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -1.4021F, 0.2422F, 0.2442F, -0.5941F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(119, 41).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -3.4021F, 0.128F, 0.3386F, -0.9453F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(127, 70).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -3.4021F, 0.2273F, 0.2344F, -0.5976F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(117, 91).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -5.4021F, 0.0443F, 0.2244F, -0.9686F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(74, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -5.4021F, 0.1106F, 0.1544F, -0.6202F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(52, 128).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -1.4021F, 0.1389F, -0.3527F, 0.9416F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(128, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -1.4021F, 0.2422F, -0.2442F, 0.5941F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(119, 41).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -3.4021F, 0.128F, -0.3386F, 0.9453F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(127, 70).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -3.4021F, 0.2273F, -0.2344F, 0.5976F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(117, 91).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -5.4021F, 0.0443F, -0.2244F, 0.9686F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(74, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -5.4021F, 0.1106F, -0.1544F, 0.6202F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(19, 116).addBox(0.0F, -3.4462F, -1.0422F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.8196F, -0.2836F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 119).addBox(-0.005F, -7.1124F, -1.8376F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5964F, -0.8196F, -0.528F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 112).addBox(0.0F, -5.3989F, -0.2336F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0425F, -3.3966F, -0.3622F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(37, 119).addBox(-0.008F, -9.1135F, -1.5246F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0425F, -3.3966F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 124).addBox(0.008F, -3.8098F, -0.1792F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.008F, -1.0306F, -4.9627F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(78, 113).addBox(0.008F, -8.7178F, -0.5884F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.008F, -1.0306F, -4.9627F, -0.432F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(119, 125).addBox(0.0F, -3.0458F, -0.1319F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.008F, -9.0748F, -1.7593F, -0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 119).addBox(-0.008F, -4.0078F, 0.0324F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -9.7786F, -3.4518F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 119).addBox(0.0F, -4.0564F, -0.0009F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.1065F, -5.0676F, -0.4232F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 108).addBox(0.0F, -5.5788F, 0.0372F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8065F, -6.6176F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(34, 40).addBox(-0.5F, -1.3F, 8.9974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.197F, -15.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6384F, -6.8808F, 0.0581F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = body2.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(119, 74).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -0.3213F, 0.0537F, 0.2063F, -0.8988F));

		PartDefinition Bodyfront_r14 = body2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(91, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -0.3213F, 0.1131F, 0.1343F, -0.5521F));

		PartDefinition Bodyfront_r15 = body2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(75, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.3594F, 0.2755F, -0.5016F));

		PartDefinition Bodyfront_r16 = body2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(119, 43).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.2428F, 0.4203F, -0.8401F));

		PartDefinition Bodyfront_r17 = body2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(57, 128).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.0525F, 0.4791F, -1.272F));

		PartDefinition Bodyfront_r18 = body2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(119, 74).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -0.3213F, 0.0537F, -0.2063F, 0.8988F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(91, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -0.3213F, 0.1131F, -0.1343F, 0.5521F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(75, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.3594F, -0.2755F, 0.5016F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(119, 43).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.2428F, -0.4203F, 0.8401F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(57, 128).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.0525F, -0.4791F, 1.272F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(122, 125).addBox(0.0F, -2.975F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.008F, -11.7097F, 3.3167F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(40, 105).addBox(0.0F, -6.9802F, 0.0281F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.4567F, 0.1835F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(90, 109).addBox(0.0F, -5.2896F, -0.113F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3568F, -1.2665F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(119, 68).addBox(0.0F, -3.3369F, 0.0291F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2487F, -3.0044F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(119, 62).addBox(0.005F, -7.0488F, -0.646F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4487F, -2.9044F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(87, 109).addBox(0.0F, -5.9754F, 0.0145F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.2987F, -1.1794F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(119, 56).addBox(-0.008F, -9.9057F, -0.5369F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -7.2987F, -1.1794F, -0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 82).addBox(-0.5F, -0.3716F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4653F, -3.7638F, 0.3736F, 0.0813F, 0.0318F));

		PartDefinition Bodyfront_r23 = body3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(119, 99).mirror().addBox(-4.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, -0.0332F, 0.2028F, -1.2654F));

		PartDefinition Bodyfront_r24 = body3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(99, 119).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, 0.048F, 0.1999F, -0.8645F));

		PartDefinition Bodyfront_r25 = body3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(128, 125).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, 0.1056F, 0.1302F, -0.5176F));

		PartDefinition Bodyfront_r26 = body3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(106, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.2488F, 0.1991F, -0.4779F));

		PartDefinition Bodyfront_r27 = body3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(119, 84).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.1614F, 0.3125F, -0.8195F));

		PartDefinition Bodyfront_r28 = body3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(98, 50).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.0252F, 0.3496F, -1.2332F));

		PartDefinition Bodyfront_r29 = body3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(101, 128).mirror().addBox(-6.6968F, -3.6044F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, -0.0885F, 0.3714F, -1.5668F));

		PartDefinition Bodyfront_r30 = body3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.0503F, 0.3781F, -1.1915F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(119, 82).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.1961F, 0.3291F, -0.7757F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(96, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.2861F, 0.2038F, -0.4376F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(119, 99).addBox(2.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, -0.0332F, -0.2028F, 1.2654F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(99, 119).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, 0.048F, -0.1999F, 0.8645F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(128, 125).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, 0.1056F, -0.1302F, 0.5176F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(106, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.2488F, -0.1991F, 0.4779F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(119, 84).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.1614F, -0.3125F, 0.8195F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(98, 50).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.0252F, -0.3496F, 1.2332F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(101, 128).addBox(5.6968F, -3.6044F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, -0.0885F, -0.3714F, 1.5668F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(66, 46).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.0503F, -0.3781F, 1.1915F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(119, 82).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.1961F, -0.3291F, 0.7757F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(96, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.2861F, -0.2038F, 0.4376F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0979F, 0.0516F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 12.7917F, -3.6012F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(6, 93).addBox(0.0F, -10.0238F, -0.0085F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -12.1374F, 1.2189F, -0.6501F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(75, 97).addBox(0.005F, -8.9428F, -0.0478F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -4.5373F, -3.4811F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(116, 9).addBox(0.0F, -4.5825F, -0.1958F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2624F, -4.9061F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(119, 93).addBox(0.0F, -3.7523F, -0.09F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.569F, -1.1925F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(84, 97).addBox(0.0F, -8.9988F, -0.1038F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -9.219F, 5.0325F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 106).addBox(0.0F, -10.7097F, -0.5283F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.569F, -1.1925F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(86, 117).addBox(0.0F, -3.8192F, -0.0535F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.514F, -2.8156F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(125, 125).addBox(0.005F, -6.6664F, -0.555F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.514F, -2.8156F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(43, 96).addBox(0.0F, -8.8705F, -0.1573F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.414F, 0.4844F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 130).addBox(-0.005F, -13.4655F, -3.0556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.414F, 0.4844F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(119, 76).addBox(0.0F, -12.8096F, -1.0725F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.414F, 0.4844F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(50, 49).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9764F, 0.1803F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(61, 26).mirror().addBox(-8.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, -0.0748F, 0.2089F, -1.5048F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(102, 52).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, -0.0076F, 0.2216F, -1.1924F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(129, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, 0.137F, 0.1269F, -0.446F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(119, 109).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, 0.0791F, 0.2074F, -0.7906F));

		PartDefinition Bodyfront_r47 = body4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(0, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.1848F, 0.1494F, -0.4394F));

		PartDefinition Bodyfront_r48 = body4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(106, 119).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.117F, 0.2445F, -0.7821F));

		PartDefinition Bodyfront_r49 = body4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(100, 64).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.0125F, 0.2702F, -1.1875F));

		PartDefinition Bodyfront_r50 = body4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(100, 29).mirror().addBox(-9.8486F, -3.3525F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, -0.0713F, 0.2612F, -1.504F));

		PartDefinition Bodyfront_r51 = body4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-10.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, -0.0714F, 0.2574F, -1.513F));

		PartDefinition Bodyfront_r52 = body4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(100, 27).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.0231F, 0.2659F, -1.1516F));

		PartDefinition Bodyfront_r53 = body4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(119, 101).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.1249F, 0.2365F, -0.7471F));

		PartDefinition Bodyfront_r54 = body4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(128, 127).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.1894F, 0.1393F, -0.4056F));

		PartDefinition Bodyfront_r55 = body4.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(61, 26).addBox(5.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, -0.0748F, -0.2089F, 1.5048F));

		PartDefinition Bodyfront_r56 = body4.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(102, 52).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, -0.0076F, -0.2216F, 1.1924F));

		PartDefinition Bodyfront_r57 = body4.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(129, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, 0.137F, -0.1269F, 0.446F));

		PartDefinition Bodyfront_r58 = body4.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(119, 109).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, 0.0791F, -0.2074F, 0.7906F));

		PartDefinition Bodyfront_r59 = body4.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(0, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.1848F, -0.1494F, 0.4394F));

		PartDefinition Bodyfront_r60 = body4.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(106, 119).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.117F, -0.2445F, 0.7821F));

		PartDefinition Bodyfront_r61 = body4.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(100, 64).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.0125F, -0.2702F, 1.1875F));

		PartDefinition Bodyfront_r62 = body4.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(100, 29).addBox(5.8486F, -3.3525F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, -0.0713F, -0.2612F, 1.504F));

		PartDefinition Bodyfront_r63 = body4.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(87, 65).addBox(5.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, -0.0714F, -0.2574F, 1.513F));

		PartDefinition Bodyfront_r64 = body4.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(100, 27).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.0231F, -0.2659F, 1.1516F));

		PartDefinition Bodyfront_r65 = body4.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(119, 101).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.1249F, -0.2365F, 0.7471F));

		PartDefinition Bodyfront_r66 = body4.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(128, 127).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.1894F, -0.1393F, 0.4056F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(17, 33).addBox(-2.5F, -0.5489F, 0.2421F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.668F, -3.7302F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(33, 111).addBox(0.0F, -5.764F, 0.125F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3836F, -1.0547F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(59, 94).addBox(0.005F, -9.9468F, -0.0482F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.4086F, 1.8703F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 94).addBox(0.0F, -19.8766F, -1.036F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.4086F, 1.8703F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 110).addBox(0.0F, -5.9816F, -0.0496F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1836F, -2.8547F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(78, 97).addBox(0.005F, -9.0686F, -0.0513F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.6336F, -0.5547F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 81).addBox(0.0F, -19.9303F, -1.2517F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -5.6336F, -0.5547F, -0.6676F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(25, 88).addBox(0.007F, -11.0506F, 0.0789F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -5.379F, -3.088F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(93, 0).addBox(0.007F, -10.0228F, 0.0409F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -15.279F, 1.712F, -0.5541F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 113).addBox(0.002F, -5.6694F, -0.0827F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.029F, -4.813F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(44, 66).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.425F, -4.85F, 0.0843F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = body5.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(129, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1529F, 0.1344F, -0.4439F));

		PartDefinition Bodyfront_r68 = body5.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(113, 119).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0917F, 0.2198F, -0.7879F));

		PartDefinition Bodyfront_r69 = body5.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(103, 68).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0009F, 0.2378F, -1.1909F));

		PartDefinition Bodyfront_r70 = body5.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-10.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0737F, 0.2264F, -1.5045F));

		PartDefinition Bodyfront_r71 = body5.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r72 = body5.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r73 = body5.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(119, 111).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r74 = body5.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(5, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r75 = body5.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(129, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1529F, -0.1344F, 0.4439F));

		PartDefinition Bodyfront_r76 = body5.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(113, 119).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0917F, -0.2198F, 0.7879F));

		PartDefinition Bodyfront_r77 = body5.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(103, 68).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0009F, -0.2378F, 1.1909F));

		PartDefinition Bodyfront_r78 = body5.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(91, 55).addBox(5.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0737F, -0.2264F, 1.5045F));

		PartDefinition Bodyfront_r79 = body5.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(83, 84).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r80 = body5.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(103, 66).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r81 = body5.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(119, 111).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r82 = body5.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(5, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition cube_r80 = body5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 33).addBox(-2.5F, 12.8656F, 4.3735F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(72, 84).addBox(-0.5F, -0.3716F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(130, 75).addBox(-0.003F, -27.7653F, -5.4545F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.379F, -2.038F, -0.6763F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(13, 65).addBox(0.007F, -27.3143F, -2.2725F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.379F, -2.038F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 79).addBox(0.002F, -12.4935F, 0.0093F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.379F, -2.038F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(95, 95).addBox(0.002F, -8.6663F, -0.0828F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.179F, -3.838F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(47, 95).addBox(0.007F, -18.6335F, -0.9072F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.179F, -3.838F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(22, 88).addBox(0.002F, -29.4359F, -2.7795F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.179F, -3.838F, -0.4931F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(75, 130).addBox(-0.003F, -29.9662F, -5.8464F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.179F, -3.838F, -0.5978F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.325F, -3.9F, 0.0407F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r83 = body6.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(45, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, 0.1212F, 0.1194F, -0.4479F));

		PartDefinition Bodyfront_r84 = body6.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, 0.0666F, 0.195F, -0.7931F));

		PartDefinition Bodyfront_r85 = body6.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, -0.0142F, 0.2054F, -1.1938F));

		PartDefinition Bodyfront_r86 = body6.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(79, 43).mirror().addBox(-11.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, -0.076F, 0.1915F, -1.505F));

		PartDefinition Bodyfront_r87 = body6.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(55, 37).mirror().addBox(-13.6968F, -3.6044F, -0.5417F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r88 = body6.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r89 = body6.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(120, 34).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r90 = body6.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(129, 7).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r91 = body6.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(29, 8).mirror().addBox(-12.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r92 = body6.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(103, 70).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r93 = body6.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(22, 120).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r94 = body6.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(129, 5).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r95 = body6.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(45, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, 0.1212F, -0.1194F, 0.4479F));

		PartDefinition Bodyfront_r96 = body6.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(91, 57).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, 0.0666F, -0.195F, 0.7931F));

		PartDefinition Bodyfront_r97 = body6.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(65, 55).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, -0.0142F, -0.2054F, 1.1938F));

		PartDefinition Bodyfront_r98 = body6.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(79, 43).addBox(5.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, -0.076F, -0.1915F, 1.505F));

		PartDefinition Bodyfront_r99 = body6.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(55, 37).addBox(5.6968F, -3.6044F, -0.5417F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r100 = body6.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(103, 72).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r101 = body6.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(120, 34).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r102 = body6.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(129, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition Bodyfront_r103 = body6.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(29, 8).addBox(5.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r104 = body6.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(103, 70).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r105 = body6.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(22, 120).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r106 = body6.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(129, 5).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition cube_r88 = body6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 24).addBox(-2.5F, -1.1917F, -6.8413F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.9711F, 1.208F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(94, 106).addBox(0.002F, -31.3826F, -2.6174F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.404F, -1.838F, -0.4494F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(65, 94).addBox(0.007F, -14.5829F, -0.4093F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.404F, -1.838F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(3, 93).addBox(0.007F, -24.5163F, -1.4425F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.404F, -1.838F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(44, 114).addBox(0.002F, -4.6444F, -0.0369F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.404F, -1.838F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(16, 113).addBox(0.002F, -4.6722F, -0.1697F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.204F, -3.738F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body6.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(17, 49).addBox(0.007F, -23.6045F, -0.6796F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.204F, -3.738F, -0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body6.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(81, 97).addBox(0.002F, -32.4776F, 1.0555F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.204F, -3.738F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body6.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(47, 81).addBox(0.002F, -31.2065F, 0.0895F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.1432F, -5.8604F, -0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body6.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 93).addBox(0.007F, -19.2534F, -1.007F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.1432F, -5.8604F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body6.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(23, 101).addBox(0.007F, -8.2981F, -0.1319F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.1432F, -5.8604F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body6.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(20, 57).addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5026F, -5.925F, -0.0641F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r107 = body7.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(129, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1688F, 0.1419F, -0.4417F));

		PartDefinition Bodyfront_r108 = body7.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(47, 120).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1043F, 0.2321F, -0.7851F));

		PartDefinition Bodyfront_r109 = body7.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(3, 105).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0058F, 0.2541F, -1.1892F));

		PartDefinition Bodyfront_r110 = body7.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(29, 10).mirror().addBox(-12.8486F, -3.3525F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0725F, 0.2438F, -1.5043F));

		PartDefinition Bodyfront_r111 = body7.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(85, 25).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, -0.0745F, 0.2051F, -1.5137F));

		PartDefinition Bodyfront_r112 = body7.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(104, 54).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.0012F, 0.218F, -1.1568F));

		PartDefinition Bodyfront_r113 = body7.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.0857F, 0.2007F, -0.7556F));

		PartDefinition Bodyfront_r114 = body7.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(129, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.1409F, 0.1185F, -0.4119F));

		PartDefinition Bodyfront_r115 = body7.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(76, 67).mirror().addBox(-12.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r116 = body7.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r117 = body7.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(122, 38).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r118 = body7.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(70, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r119 = body7.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(129, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1688F, -0.1419F, 0.4417F));

		PartDefinition Bodyfront_r120 = body7.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(47, 120).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1043F, -0.2321F, 0.7851F));

		PartDefinition Bodyfront_r121 = body7.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(3, 105).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0058F, -0.2541F, 1.1892F));

		PartDefinition Bodyfront_r122 = body7.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(29, 10).addBox(5.8486F, -3.3525F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0725F, -0.2438F, 1.5043F));

		PartDefinition Bodyfront_r123 = body7.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(85, 25).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, -0.0745F, -0.2051F, 1.5137F));

		PartDefinition Bodyfront_r124 = body7.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(104, 54).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.0012F, -0.218F, 1.1568F));

		PartDefinition Bodyfront_r125 = body7.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(120, 36).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.0857F, -0.2007F, 0.7556F));

		PartDefinition Bodyfront_r126 = body7.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(129, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.1409F, -0.1185F, 0.4119F));

		PartDefinition Bodyfront_r127 = body7.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(76, 67).addBox(5.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition cube_r100 = body7.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(58, 79).addBox(0.005F, -17.7147F, -1.2721F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.083F, -5.8802F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body7.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(70, 110).addBox(0.0F, -4.9008F, -0.1071F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.083F, -5.8802F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body7.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(10, 107).addBox(0.0F, -24.6212F, 0.1104F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.083F, -5.8802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body7.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(7, 107).addBox(0.002F, -6.6317F, -0.1563F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.3391F, -1.7667F, -0.0305F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body7.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(31, 93).addBox(-0.002F, -16.5084F, -1.2618F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.3391F, -1.7667F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body7.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(55, 79).addBox(0.002F, -29.4551F, 0.1743F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.002F, -0.3391F, -1.7667F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body7.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(28, 93).addBox(0.0F, -28.1287F, 1.0003F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.265F, -3.7287F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body7.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(16, 70).addBox(-0.004F, -18.2851F, -1.0451F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.265F, -3.7287F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body7.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 116).addBox(0.005F, -4.4494F, -0.1706F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.265F, -3.7287F, 0.0305F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r128 = body7.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(105, 10).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r129 = body7.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(122, 38).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r130 = body7.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(70, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition cube_r109 = body7.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(23, 24).addBox(-2.5F, -2.0F, -6.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 13.9711F, 1.208F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body7.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 57).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4543F, -5.8605F, -0.1702F, 0.129F, -0.0221F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(63, 126).addBox(-0.004F, -18.9866F, 0.7974F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3054F, -1.6754F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 81).addBox(-0.004F, -16.1234F, -1.7093F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3054F, -1.6754F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 124).addBox(0.0F, -3.5266F, -0.5147F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3054F, -1.6754F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r131 = chest.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(18, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.2726F, 0.1687F, -0.3758F));

		PartDefinition Bodyfront_r132 = chest.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(120, 105).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.1951F, 0.2915F, -0.7117F));

		PartDefinition Bodyfront_r133 = chest.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(85, 29).mirror().addBox(-10.8995F, -3.036F, -0.7277F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, -0.078F, 0.3638F, -1.4451F));

		PartDefinition Bodyfront_r134 = chest.addOrReplaceChild("Bodyfront_r134", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.0654F, 0.3433F, -1.1217F));

		PartDefinition Bodyfront_r135 = chest.addOrReplaceChild("Bodyfront_r135", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-9.8949F, -3.0518F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, -0.07F, 0.3136F, -1.5029F));

		PartDefinition Bodyfront_r136 = chest.addOrReplaceChild("Bodyfront_r136", CubeListBuilder.create().texOffs(105, 61).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.0309F, 0.3196F, -1.1814F));

		PartDefinition Bodyfront_r137 = chest.addOrReplaceChild("Bodyfront_r137", CubeListBuilder.create().texOffs(120, 103).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.154F, 0.2828F, -0.7717F));

		PartDefinition Bodyfront_r138 = chest.addOrReplaceChild("Bodyfront_r138", CubeListBuilder.create().texOffs(129, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.2319F, 0.1735F, -0.4311F));

		PartDefinition Bodyfront_r139 = chest.addOrReplaceChild("Bodyfront_r139", CubeListBuilder.create().texOffs(129, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.2916F, 0.2124F, -0.5411F));

		PartDefinition Bodyfront_r140 = chest.addOrReplaceChild("Bodyfront_r140", CubeListBuilder.create().texOffs(120, 54).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.1985F, 0.3389F, -0.8796F));

		PartDefinition Bodyfront_r141 = chest.addOrReplaceChild("Bodyfront_r141", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.0482F, 0.388F, -1.2969F));

		PartDefinition Bodyfront_r142 = chest.addOrReplaceChild("Bodyfront_r142", CubeListBuilder.create().texOffs(18, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.2726F, -0.1687F, 0.3758F));

		PartDefinition Bodyfront_r143 = chest.addOrReplaceChild("Bodyfront_r143", CubeListBuilder.create().texOffs(120, 105).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.1951F, -0.2915F, 0.7117F));

		PartDefinition Bodyfront_r144 = chest.addOrReplaceChild("Bodyfront_r144", CubeListBuilder.create().texOffs(85, 29).addBox(4.8995F, -3.036F, -0.7277F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, -0.078F, -0.3638F, 1.4451F));

		PartDefinition Bodyfront_r145 = chest.addOrReplaceChild("Bodyfront_r145", CubeListBuilder.create().texOffs(108, 91).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.0654F, -0.3433F, 1.1217F));

		PartDefinition Bodyfront_r146 = chest.addOrReplaceChild("Bodyfront_r146", CubeListBuilder.create().texOffs(85, 82).addBox(4.8949F, -3.0518F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, -0.07F, -0.3136F, 1.5029F));

		PartDefinition Bodyfront_r147 = chest.addOrReplaceChild("Bodyfront_r147", CubeListBuilder.create().texOffs(105, 61).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.0309F, -0.3196F, 1.1814F));

		PartDefinition Bodyfront_r148 = chest.addOrReplaceChild("Bodyfront_r148", CubeListBuilder.create().texOffs(120, 103).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.154F, -0.2828F, 0.7717F));

		PartDefinition Bodyfront_r149 = chest.addOrReplaceChild("Bodyfront_r149", CubeListBuilder.create().texOffs(129, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.2319F, -0.1735F, 0.4311F));

		PartDefinition Bodyfront_r150 = chest.addOrReplaceChild("Bodyfront_r150", CubeListBuilder.create().texOffs(129, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.2916F, -0.2124F, 0.5411F));

		PartDefinition Bodyfront_r151 = chest.addOrReplaceChild("Bodyfront_r151", CubeListBuilder.create().texOffs(120, 54).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.1985F, -0.3389F, 0.8796F));

		PartDefinition Bodyfront_r152 = chest.addOrReplaceChild("Bodyfront_r152", CubeListBuilder.create().texOffs(85, 27).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.0482F, -0.388F, 1.2969F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(29, 0).addBox(-2.0418F, 0.3892F, 5.8401F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.9739F, -6.9671F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(72, 79).addBox(-2.0418F, -0.7557F, 2.9995F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.9739F, -6.9671F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(70, 26).addBox(-2.5418F, -1.0856F, 0.0392F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 11.9739F, -6.9671F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 130).addBox(-0.505F, -5.4513F, -2.1339F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2569F, -5.99F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(36, 111).addBox(-0.5F, -4.9474F, -0.1609F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2569F, -5.99F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(16, 120).addBox(-0.505F, -8.4513F, -2.1339F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2569F, -3.99F, -0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(97, 110).addBox(-0.5F, -4.9474F, -0.1609F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2569F, -3.99F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.588F, -8.9257F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6889F, 7.9136F, -4.7747F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Bodyfront_r153 = bone.addOrReplaceChild("Bodyfront_r153", CubeListBuilder.create().texOffs(61, 86).addBox(-1.275F, 0.2234F, -0.5277F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6106F, 0.5528F, -0.4997F, 0.8738F, -0.0076F, 0.3744F));

		PartDefinition Bodyfront_r154 = bone.addOrReplaceChild("Bodyfront_r154", CubeListBuilder.create().texOffs(88, 95).addBox(-0.5159F, -5.2246F, 0.0676F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4265F, -3.8972F, 0.3463F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r155 = bone.addOrReplaceChild("Bodyfront_r155", CubeListBuilder.create().texOffs(98, 57).addBox(-0.5159F, -0.1246F, 1.0676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4265F, -4.3198F, -0.5601F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r156 = bone.addOrReplaceChild("Bodyfront_r156", CubeListBuilder.create().texOffs(44, 73).addBox(-0.7478F, -3.189F, -1.3366F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.4362F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r157 = bone.addOrReplaceChild("Bodyfront_r157", CubeListBuilder.create().texOffs(61, 79).addBox(-0.7481F, -0.7282F, -1.0233F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.0696F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r158 = bone.addOrReplaceChild("Bodyfront_r158", CubeListBuilder.create().texOffs(0, 65).addBox(-0.9F, -2.2F, -1.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3529F, 2.3146F, -1.4364F, -0.318F, 0.0313F, 0.4319F));

		PartDefinition Bodyfront_r159 = bone.addOrReplaceChild("Bodyfront_r159", CubeListBuilder.create().texOffs(0, 79).addBox(-0.9F, -3.2F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3529F, 2.3146F, -1.4364F, 0.4233F, 0.0645F, 0.421F));

		PartDefinition Bodyfront_r160 = bone.addOrReplaceChild("Bodyfront_r160", CubeListBuilder.create().texOffs(46, 20).addBox(-0.7481F, -0.5563F, -6.6368F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.314F, 0.0089F, 0.5746F));

		PartDefinition Bodyfront_r161 = bone.addOrReplaceChild("Bodyfront_r161", CubeListBuilder.create().texOffs(5, 116).addBox(-0.5119F, 0.1683F, 0.2904F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4265F, -4.3198F, -1.5601F, -0.6566F, 0.0806F, 0.2315F));

		PartDefinition Bodyfront_r162 = bone.addOrReplaceChild("Bodyfront_r162", CubeListBuilder.create().texOffs(92, 36).addBox(-0.077F, -0.0968F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5861F, 0.0822F, -2.3626F, -1.0662F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r163 = bone.addOrReplaceChild("Bodyfront_r163", CubeListBuilder.create().texOffs(88, 90).addBox(-1.9F, -0.25F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0648F, 1.0968F, -3.9592F, -0.5377F, -0.3763F, 0.0448F));

		PartDefinition Bodyfront_r164 = bone.addOrReplaceChild("Bodyfront_r164", CubeListBuilder.create().texOffs(98, 42).addBox(-0.077F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-0.5861F, 0.0822F, -2.3626F, -0.7607F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r165 = bone.addOrReplaceChild("Bodyfront_r165", CubeListBuilder.create().texOffs(120, 50).addBox(-0.5119F, 3.1364F, 0.0279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4265F, -4.3198F, -1.5601F, -0.5693F, 0.0806F, 0.2315F));

		PartDefinition Bodyfront_r166 = bone.addOrReplaceChild("Bodyfront_r166", CubeListBuilder.create().texOffs(34, 125).addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3159F, -0.6725F, -0.4937F, -0.8044F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r167 = bone.addOrReplaceChild("Bodyfront_r167", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5515F, -1.9938F, -0.0069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4158F, -2.339F, -1.7289F, -1.2313F, 0.0158F, -0.0039F));

		PartDefinition Bodyfront_r168 = bone.addOrReplaceChild("Bodyfront_r168", CubeListBuilder.create().texOffs(87, 103).addBox(-0.5515F, -0.6938F, -0.0069F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4265F, -4.3198F, -0.5601F, -0.5332F, 0.0158F, -0.0039F));

		PartDefinition Bodyfront_r169 = bone.addOrReplaceChild("Bodyfront_r169", CubeListBuilder.create().texOffs(108, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4857F, -7.8272F, 3.5647F, -0.4727F, 0.0149F, 0.014F));

		PartDefinition Bodyfront_r170 = bone.addOrReplaceChild("Bodyfront_r170", CubeListBuilder.create().texOffs(70, 90).addBox(-0.5515F, -3.3682F, 1.2393F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F))
				.texOffs(9, 98).addBox(-0.5515F, -3.3682F, -0.0607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4265F, -4.3198F, -0.5601F, 0.0334F, 0.0149F, 0.014F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6889F, 7.9136F, -4.7747F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Bodyfront_r171 = bone3.addOrReplaceChild("Bodyfront_r171", CubeListBuilder.create().texOffs(61, 86).mirror().addBox(0.275F, 0.2234F, -0.5277F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6106F, 0.5528F, -0.4997F, 0.8738F, 0.0076F, -0.3744F));

		PartDefinition Bodyfront_r172 = bone3.addOrReplaceChild("Bodyfront_r172", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.4841F, -5.2246F, 0.0676F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -3.8972F, 0.3463F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r173 = bone3.addOrReplaceChild("Bodyfront_r173", CubeListBuilder.create().texOffs(98, 57).mirror().addBox(-0.4841F, -0.1246F, 1.0676F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -4.3198F, -0.5601F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r174 = bone3.addOrReplaceChild("Bodyfront_r174", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-0.2522F, -3.189F, -1.3366F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.4362F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r175 = bone3.addOrReplaceChild("Bodyfront_r175", CubeListBuilder.create().texOffs(61, 79).mirror().addBox(-0.2519F, -0.7282F, -1.0233F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.0696F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r176 = bone3.addOrReplaceChild("Bodyfront_r176", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.1F, -2.2F, -1.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3529F, 2.3146F, -1.4364F, -0.318F, -0.0313F, -0.4319F));

		PartDefinition Bodyfront_r177 = bone3.addOrReplaceChild("Bodyfront_r177", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.1F, -3.2F, -1.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3529F, 2.3146F, -1.4364F, 0.4233F, -0.0645F, -0.421F));

		PartDefinition Bodyfront_r178 = bone3.addOrReplaceChild("Bodyfront_r178", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-0.2519F, -0.5563F, -6.6368F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.314F, -0.0089F, -0.5746F));

		PartDefinition Bodyfront_r179 = bone3.addOrReplaceChild("Bodyfront_r179", CubeListBuilder.create().texOffs(5, 116).mirror().addBox(-0.4881F, 0.1683F, 0.2904F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -4.3198F, -1.5601F, -0.6566F, -0.0806F, -0.2315F));

		PartDefinition Bodyfront_r180 = bone3.addOrReplaceChild("Bodyfront_r180", CubeListBuilder.create().texOffs(92, 36).mirror().addBox(-0.923F, -0.0968F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.0822F, -2.3626F, -1.0662F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r181 = bone3.addOrReplaceChild("Bodyfront_r181", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-0.1F, -0.25F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0648F, 1.0968F, -3.9592F, -0.5377F, 0.3763F, -0.0448F));

		PartDefinition Bodyfront_r182 = bone3.addOrReplaceChild("Bodyfront_r182", CubeListBuilder.create().texOffs(98, 42).mirror().addBox(-0.923F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.0822F, -2.3626F, -0.7607F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r183 = bone3.addOrReplaceChild("Bodyfront_r183", CubeListBuilder.create().texOffs(120, 50).mirror().addBox(-0.4881F, 3.1364F, 0.0279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -4.3198F, -1.5601F, -0.5693F, -0.0806F, -0.2315F));

		PartDefinition Bodyfront_r184 = bone3.addOrReplaceChild("Bodyfront_r184", CubeListBuilder.create().texOffs(34, 125).mirror().addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3159F, -0.6725F, -0.4937F, -0.8044F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r185 = bone3.addOrReplaceChild("Bodyfront_r185", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.4485F, -1.9938F, -0.0069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4158F, -2.339F, -1.7289F, -1.2313F, -0.0158F, 0.0039F));

		PartDefinition Bodyfront_r186 = bone3.addOrReplaceChild("Bodyfront_r186", CubeListBuilder.create().texOffs(87, 103).mirror().addBox(-0.4485F, -0.6938F, -0.0069F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -4.3198F, -0.5601F, -0.5332F, -0.0158F, 0.0039F));

		PartDefinition Bodyfront_r187 = bone3.addOrReplaceChild("Bodyfront_r187", CubeListBuilder.create().texOffs(108, 86).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4857F, -7.8272F, 3.5647F, -0.4727F, -0.0149F, -0.014F));

		PartDefinition Bodyfront_r188 = bone3.addOrReplaceChild("Bodyfront_r188", CubeListBuilder.create().texOffs(70, 90).mirror().addBox(-0.4485F, -3.3682F, 1.2393F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(9, 98).mirror().addBox(-0.4485F, -3.3682F, -0.0607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -4.3198F, -0.5601F, 0.0334F, -0.0149F, -0.014F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(98, 74).addBox(-0.599F, 2.8676F, -0.9195F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(19, 74).addBox(-0.599F, -0.1324F, -1.8195F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8498F, 9.9083F, -1.4568F, -0.2491F, 0.1114F, -0.4752F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(120, 86).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 3.8676F, 1.6805F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(105, 114).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 5.8676F, -0.4195F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(68, 104).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 9.0996F, 0.8001F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(78, 120).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 7.6801F, -3.4053F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(59, 120).addBox(-0.3997F, -1.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2549F, 8.2932F, -0.5251F, -1.1743F, 1.295F, -0.8455F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(100, 114).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(114, 98).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 0.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(54, 120).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(43, 107).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 2.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(76, 19).addBox(0.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.0308F, 0.1527F, 1.292F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(63, 0).addBox(0.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, -0.0027F, -0.0029F, -0.6021F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(16, 101).addBox(-0.401F, 2.8676F, -0.9195F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(30, 79).addBox(-0.401F, -0.1324F, -1.8195F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8498F, 9.9083F, -1.4568F, 1.1471F, -0.1114F, 0.4752F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(75, 124).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 3.8676F, 1.6805F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(115, 51).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 5.8676F, -0.4195F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(26, 105).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 9.0996F, 0.8001F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(58, 124).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 7.6801F, -3.4053F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(53, 124).addBox(-0.6003F, -1.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2549F, 8.2932F, -0.5251F, -1.3745F, -1.0012F, 1.0625F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(47, 115).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 1.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(11, 82).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 3.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(115, 34).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 0.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(124, 28).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 0.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(82, 108).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 2.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(78, 12).addBox(-2.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.1233F, -0.3189F, -0.6071F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(65, 6).addBox(-3.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, -0.0035F, 0.0018F, 0.253F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.3443F, 0.1712F, 0.2208F));

		PartDefinition cube_r122 = neck.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(94, 42).addBox(-0.505F, -4.3731F, -1.3518F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8733F, -1.7142F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(89, 117).addBox(-0.5F, -3.6379F, -0.2778F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8733F, -1.7142F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(78, 130).addBox(-0.505F, -3.493F, -0.5611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9733F, -3.9142F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 126).addBox(-0.5F, -2.5898F, -0.0862F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9733F, -3.9142F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r189 = neck.addOrReplaceChild("Bodyfront_r189", CubeListBuilder.create().texOffs(120, 119).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -5.6658F, 0.3177F, 0.5443F, -0.9265F));

		PartDefinition Bodyfront_r190 = neck.addOrReplaceChild("Bodyfront_r190", CubeListBuilder.create().texOffs(129, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -5.6658F, 0.4689F, 0.3704F, -0.5881F));

		PartDefinition Bodyfront_r191 = neck.addOrReplaceChild("Bodyfront_r191", CubeListBuilder.create().texOffs(120, 117).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.2476F, 0.4595F, -0.9603F));

		PartDefinition Bodyfront_r192 = neck.addOrReplaceChild("Bodyfront_r192", CubeListBuilder.create().texOffs(120, 115).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.0382F, 0.5164F, -1.401F));

		PartDefinition Bodyfront_r193 = neck.addOrReplaceChild("Bodyfront_r193", CubeListBuilder.create().texOffs(28, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.3774F, 0.3109F, -0.6187F));

		PartDefinition Bodyfront_r194 = neck.addOrReplaceChild("Bodyfront_r194", CubeListBuilder.create().texOffs(120, 113).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.0129F, 0.3787F, -1.412F));

		PartDefinition Bodyfront_r195 = neck.addOrReplaceChild("Bodyfront_r195", CubeListBuilder.create().texOffs(120, 107).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.1628F, 0.3437F, -0.9935F));

		PartDefinition Bodyfront_r196 = neck.addOrReplaceChild("Bodyfront_r196", CubeListBuilder.create().texOffs(23, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.2607F, 0.2281F, -0.6498F));

		PartDefinition Bodyfront_r197 = neck.addOrReplaceChild("Bodyfront_r197", CubeListBuilder.create().texOffs(120, 119).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -5.6658F, 0.3177F, -0.5443F, 0.9265F));

		PartDefinition Bodyfront_r198 = neck.addOrReplaceChild("Bodyfront_r198", CubeListBuilder.create().texOffs(129, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -5.6658F, 0.4689F, -0.3704F, 0.5881F));

		PartDefinition Bodyfront_r199 = neck.addOrReplaceChild("Bodyfront_r199", CubeListBuilder.create().texOffs(120, 117).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.2476F, -0.4595F, 0.9603F));

		PartDefinition Bodyfront_r200 = neck.addOrReplaceChild("Bodyfront_r200", CubeListBuilder.create().texOffs(120, 115).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.0382F, -0.5164F, 1.401F));

		PartDefinition Bodyfront_r201 = neck.addOrReplaceChild("Bodyfront_r201", CubeListBuilder.create().texOffs(28, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.3774F, -0.3109F, 0.6187F));

		PartDefinition Bodyfront_r202 = neck.addOrReplaceChild("Bodyfront_r202", CubeListBuilder.create().texOffs(120, 113).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.0129F, -0.3787F, 1.412F));

		PartDefinition Bodyfront_r203 = neck.addOrReplaceChild("Bodyfront_r203", CubeListBuilder.create().texOffs(120, 107).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.1628F, -0.3437F, 0.9935F));

		PartDefinition Bodyfront_r204 = neck.addOrReplaceChild("Bodyfront_r204", CubeListBuilder.create().texOffs(23, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.2607F, -0.2281F, 0.6498F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(107, 79).addBox(-0.5F, -3.7977F, -1.4575F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6733F, -5.6142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(17, 40).addBox(-1.0F, -2.9F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2267F, -1.3142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -1.2587F, -7.4801F, 0.1446F, 0.325F, 0.2532F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(110, 114).addBox(-0.5F, -0.05F, -0.95F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-0.049F, 0.2075F, -22.2829F, 1.7322F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(126, 43).addBox(-1.449F, -0.0126F, -0.9808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -0.4643F, -21.6387F, 0.7723F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(42, 126).addBox(-1.4486F, 0.0043F, -1.0021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.9F, -0.7644F, -20.6887F, 0.2923F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(111, 26).addBox(-1.449F, -0.9658F, -1.9747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -0.0394F, -18.6387F, 0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 29).addBox(-0.8F, -0.2F, -3.55F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.451F, -1.5184F, -17.052F, 0.1186F, 0.2486F, -1.1196F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(30, 87).addBox(-1.449F, -0.9348F, -4.01F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -1.1643F, -14.8637F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 87).addBox(-0.9986F, -0.0033F, -3.9475F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.0143F)), PartPose.offsetAndRotation(0.45F, -3.4406F, -11.696F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(26, 111).addBox(-0.9986F, -0.0033F, -1.9725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.45F, -3.8905F, -9.7473F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(83, 31).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.05F, 0.1666F, -9.0538F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 12).addBox(-0.401F, -1.05F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.149F, 1.173F, -10.2706F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(99, 89).addBox(-0.999F, -0.0299F, -0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.45F, -3.8756F, -9.7478F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(80, 6).addBox(-4.4F, 0.283F, 0.4819F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.35F, -2.0967F, 0.5423F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(98, 47).addBox(-4.4F, -0.0009F, -0.013F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.35F, -2.0967F, 0.5423F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(96, 86).addBox(-4.4F, -0.0364F, -0.9772F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.35F, -2.0967F, 0.5423F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 86).addBox(-4.4F, 0.0293F, 0.0457F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.35F, -3.6114F, -1.3035F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(51, 40).addBox(-2.05F, -4.7007F, -3.5993F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.9507F, -3.9532F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(78, 0).addBox(-2.5F, 0.0543F, -5.0543F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.95F, -2.5899F, -0.3657F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 42).addBox(-2.5F, 0.0543F, -4.5543F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, -2.5899F, -0.3657F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(127, 0).addBox(-1.5F, -0.1212F, 0.8512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(89, 52).addBox(-3.5F, 0.0288F, 1.5512F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(76, 55).addBox(-3.5F, 0.0288F, -0.0488F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, -4.2334F, -3.7368F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(85, 78).addBox(-3.5F, -0.0131F, -0.9955F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.95F, -4.2166F, -3.8186F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(83, 74).addBox(-3.5F, -0.0972F, -1.9911F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, -4.2166F, -3.8186F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(83, 69).addBox(-2.5F, -0.0017F, -1.9707F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -4.253F, -5.8407F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4307F, -0.2982F, -16.7897F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(114, 121).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0954F, -2.7308F, 13.1349F, -0.3204F, 0.0634F, 0.1395F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(112, 56).addBox(-0.9986F, -0.0033F, -1.9725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0193F, -3.5923F, 7.0424F, 0.108F, 0.1999F, -1.0713F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(89, 18).addBox(-0.8486F, -0.1533F, -3.8225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0193F, -3.1424F, 5.0937F, 0.1875F, 0.3371F, -1.0501F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(23, 12).addBox(-0.401F, -1.05F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.4203F, 1.4712F, 6.5191F, -0.0482F, 0.0872F, -0.0042F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(107, 110).addBox(0.5F, 0.15F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1778F, -3.3857F, 15.5776F, -0.1861F, -0.0689F, -0.0116F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(100, 17).addBox(-0.999F, -0.0299F, -0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.112F, -3.5997F, 7.0027F, -0.2894F, 0.2651F, -1.0201F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(100, 12).addBox(-0.899F, -0.0299F, -0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0193F, -3.5773F, 7.0418F, 0.0753F, 0.383F, 0.0282F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(114, 109).addBox(-1.0083F, -0.1523F, 0.8735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.5543F, -4.2016F, 11.1168F, -0.3316F, 0.1517F, 0.1461F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(50, 57).addBox(-0.525F, -0.025F, -5.025F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8376F, -4.3409F, 10.2892F, 0.3617F, 0.2636F, 0.1078F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(116, 21).addBox(-0.5125F, -0.0039F, -0.036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8293F, -4.3516F, 10.2668F, -0.0273F, 0.2794F, 0.1181F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(116, 16).addBox(-1.0159F, -0.0097F, -0.0724F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5543F, -4.2016F, 11.1168F, -0.1762F, 0.1604F, 0.1551F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(124, 90).addBox(-1.0955F, -0.6269F, 0.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, 0.0874F, 0.118F, 0.0419F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(109, 22).addBox(-0.5165F, -0.6096F, -1.8689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, 0.1809F, 0.2618F, 0.0431F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(127, 58).addBox(-0.5165F, -1.9514F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, 1.3154F, 0.2618F, 0.0431F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(127, 55).addBox(-0.5165F, -0.8406F, 0.9191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, 2.1008F, 0.2618F, 0.0431F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(127, 52).addBox(-0.5165F, 0.7042F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, 3.1043F, 0.2618F, 0.0431F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(86, 127).addBox(-1.0955F, -0.7095F, -1.6633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, -1.7408F, 0.118F, 0.0419F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(124, 12).addBox(-1.0955F, -1.7486F, -0.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, -0.7416F, 0.118F, 0.0419F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(127, 35).addBox(-1.0955F, 0.743F, -0.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, 1.1346F, 0.118F, 0.0419F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(112, 82).addBox(-1.0955F, -0.6481F, -1.7591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, 2.2691F, 0.118F, 0.0419F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(127, 32).addBox(-1.0955F, -1.7348F, -0.7106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5616F, -2.2762F, 11.1396F, 3.0981F, 0.118F, 0.0419F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(10, 127).addBox(-0.5165F, -0.4553F, 0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, -1.9571F, 0.2618F, 0.0431F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(126, 40).addBox(-0.5165F, 0.7476F, -0.7977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9616F, -2.2762F, 11.1396F, -0.8226F, 0.2618F, 0.0431F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(16, 98).addBox(-0.7112F, -0.59F, -0.66F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(23, 126).addBox(-0.2887F, -0.56F, -0.69F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8226F, -2.318F, 11.1733F, 0.0427F, 0.1933F, 0.0024F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(114, 70).addBox(-0.9384F, -4.7268F, -6.6188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(126, 72).addBox(-0.9384F, -3.8268F, -5.6188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.528F, 0.0398F, -0.1042F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(122, 60).addBox(-0.9384F, -1.6448F, -5.4366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.0044F, 0.0398F, -0.1042F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(122, 56).addBox(-0.9384F, -0.8958F, -4.4655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, -0.1265F, 0.0398F, -0.1042F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(48, 122).addBox(-0.9215F, -0.8953F, -3.4675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, -0.0748F, 0.045F, -0.0952F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(126, 80).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.503F, 2.3185F, 0.1749F, 0.0648F, 0.045F, -0.0952F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(43, 122).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4948F, 2.0705F, 0.519F, -0.1621F, 0.045F, -0.0952F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(24, 122).addBox(-0.8868F, -0.9816F, -4.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(19, 122).addBox(-0.8868F, -0.9816F, -3.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(122, 0).addBox(-0.8868F, -0.7816F, -2.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3789F, 1.5917F, 5.6654F, -0.0379F, 0.1145F, -0.0957F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(109, 121).addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.894F, 2.0033F, 4.9341F, 0.026F, 0.1753F, -0.0966F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(104, 121).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0556F, 1.8741F, 5.9125F, 0.1133F, 0.1753F, -0.0966F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(99, 121).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2065F, 1.6593F, 6.8774F, 0.2005F, 0.1753F, -0.0966F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(121, 45).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3393F, 1.3195F, 7.8085F, 0.3314F, 0.1753F, -0.0966F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(121, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4587F, 0.8995F, 8.7081F, 0.4187F, 0.1753F, -0.0966F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(126, 19).addBox(-0.7092F, -6.3976F, 2.3058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0289F, 1.3917F, 2.2904F, 1.8245F, 0.0744F, -0.0858F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(18, 126).addBox(-0.7092F, -6.6199F, -3.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.0289F, 1.3917F, 2.2904F, 0.9693F, 0.0744F, -0.0858F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(126, 16).addBox(-0.7092F, -2.2094F, -6.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0289F, 1.3917F, 2.2904F, 0.1315F, 0.0744F, -0.0858F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(98, 95).addBox(-0.2648F, -0.0235F, -1.9524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0132F)), PartPose.offsetAndRotation(0.6471F, 0.0529F, 12.0927F, -0.8418F, 0.0998F, -0.0344F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(121, 16).addBox(-0.2335F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6471F, 0.0529F, 12.0927F, -0.6586F, 0.0998F, -0.0344F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(78, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.3725F, -2.8024F, 5.3794F, 0.1626F, 0.1772F, -0.1131F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(57, 72).addBox(-0.9918F, -2.9975F, -4.6953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.2297F, 0.0471F, -0.1114F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(63, 57).addBox(-0.946F, -4.369F, -3.9437F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3789F, 1.5917F, 5.6654F, 0.3266F, 0.1165F, -0.112F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(76, 59).addBox(-0.946F, -3.0236F, -3.7827F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3789F, 1.5917F, 5.6654F, -0.0224F, 0.1165F, -0.112F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 112).addBox(-0.9871F, -2.6021F, -6.8217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.1425F, 0.0471F, -0.1114F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(70, 126).addBox(-0.9871F, -5.4154F, -5.8968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.6137F, 0.0471F, -0.1114F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(55, 111).addBox(-0.9871F, -3.2006F, -7.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.2821F, 0.0471F, -0.1114F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(48, 111).addBox(-0.9871F, -1.8535F, -6.4967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, 0.0639F, 0.0471F, -0.1114F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(70, 72).addBox(-0.5F, -0.475F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.2487F, 0.0398F, -0.0259F, 0.0159F, 0.0471F, -0.1114F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(31, 72).addBox(-0.9871F, -0.8376F, -5.0929F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9789F, 1.3917F, 2.3654F, -0.1542F, 0.0471F, -0.1114F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 121).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4735F, 0.9393F, 8.8013F, 0.3481F, 0.1802F, -0.1265F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(107, 42).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 1.2335F, 7.8553F, 0.2782F, 0.1802F, -0.1265F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 121).addBox(-0.6937F, -1.959F, -1.0641F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3849F, 1.4627F, 6.9506F, 0.0695F, 0.1886F, -0.1136F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(112, 30).addBox(0.0793F, -0.7623F, -1.7122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.5414F, 0.2325F, 16.4117F, -0.4409F, -0.1167F, -0.0085F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(100, 110).addBox(0.0793F, -0.7373F, -0.8872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.7008F, -0.2883F, 15.0141F, -0.3275F, -0.1167F, -0.0085F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(105, 56).addBox(-1.5F, -0.2F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2015F, -3.2145F, 15.4528F, 0.9303F, -0.1135F, -0.0287F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 69).addBox(-0.9207F, -0.9841F, -0.6688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(105, 6).addBox(-0.9207F, -1.7841F, -0.6688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7008F, -0.2883F, 15.0141F, -0.7202F, -0.1167F, -0.0085F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(110, 0).addBox(0.2181F, -0.8649F, -2.2482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7008F, -0.2883F, 15.0141F, -0.0638F, 0.0836F, -0.0777F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(98, 81).addBox(-1.525F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0648F, -1.2187F, 13.1249F, -0.9963F, 0.1563F, -0.1618F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(46, 29).addBox(-1.55F, -0.85F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1717F, -0.6066F, 13.1694F, 0.1223F, 0.1177F, -0.1196F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(34, 94).addBox(-0.9927F, -2.067F, -0.0349F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1501F, 0.5602F, 9.6299F, 0.3476F, 0.1739F, -0.1446F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(9, 94).addBox(-1.775F, -0.425F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5768F, -0.1674F, 16.7648F, -1.6888F, -0.0364F, 1.5738F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5307F, -0.2982F, -16.7897F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(114, 121).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0954F, -2.7308F, 13.1349F, -0.3204F, -0.0634F, -0.1395F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(112, 56).mirror().addBox(-0.0014F, -0.0033F, -1.9725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -3.5923F, 7.0424F, 0.108F, -0.1999F, 1.0713F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-0.1514F, -0.1533F, -3.8225F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -3.1424F, 5.0937F, 0.1875F, -0.3371F, 1.0501F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(23, 12).mirror().addBox(-0.599F, -1.05F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.4203F, 1.4712F, 6.5191F, -0.0482F, -0.0872F, 0.0042F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(107, 110).mirror().addBox(-1.5F, 0.15F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1778F, -3.3857F, 15.5776F, -0.1861F, 0.0689F, 0.0116F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(100, 17).mirror().addBox(-0.001F, -0.0299F, -0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.112F, -3.5997F, 7.0027F, -0.2894F, -0.2651F, 1.0201F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-0.101F, -0.0299F, -0.0129F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -3.5773F, 7.0418F, 0.0753F, -0.383F, -0.0282F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(114, 109).mirror().addBox(0.0083F, -0.1523F, 0.8735F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.5543F, -4.2016F, 11.1168F, -0.3316F, -0.1517F, -0.1461F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-0.475F, -0.025F, -5.025F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8376F, -4.3409F, 10.2892F, 0.3617F, -0.2636F, -0.1078F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(116, 21).mirror().addBox(-0.4875F, -0.0039F, -0.036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, -4.3516F, 10.2668F, -0.0273F, -0.2794F, -0.1181F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(116, 16).mirror().addBox(0.0159F, -0.0097F, -0.0724F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5543F, -4.2016F, 11.1168F, -0.1762F, -0.1604F, -0.1551F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(124, 90).mirror().addBox(0.0955F, -0.6269F, 0.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, 0.0874F, -0.118F, -0.0419F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(109, 22).mirror().addBox(-0.4835F, -0.6096F, -1.8689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, 0.1809F, -0.2618F, -0.0431F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(127, 58).mirror().addBox(-0.4835F, -1.9514F, -0.2374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, 1.3154F, -0.2618F, -0.0431F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(127, 55).mirror().addBox(-0.4835F, -0.8406F, 0.9191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, 2.1008F, -0.2618F, -0.0431F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(127, 52).mirror().addBox(-0.4835F, 0.7042F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, 3.1043F, -0.2618F, -0.0431F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 127).mirror().addBox(0.0955F, -0.7095F, -1.6633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, -1.7408F, -0.118F, -0.0419F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(124, 12).mirror().addBox(0.0955F, -1.7486F, -0.248F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, -0.7416F, -0.118F, -0.0419F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(127, 35).mirror().addBox(0.0955F, 0.743F, -0.4245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, 1.1346F, -0.118F, -0.0419F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(112, 82).mirror().addBox(0.0955F, -0.6481F, -1.7591F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, 2.2691F, -0.118F, -0.0419F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 32).mirror().addBox(0.0955F, -1.7348F, -0.7106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5616F, -2.2762F, 11.1396F, 3.0981F, -0.118F, -0.0419F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(10, 127).mirror().addBox(-0.4835F, -0.4553F, 0.6467F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, -1.9571F, -0.2618F, -0.0431F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(126, 40).mirror().addBox(-0.4835F, 0.7476F, -0.7977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9616F, -2.2762F, 11.1396F, -0.8226F, -0.2618F, -0.0431F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(16, 98).mirror().addBox(-0.2887F, -0.59F, -0.66F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).mirror(false)
				.texOffs(23, 126).mirror().addBox(-0.7113F, -0.56F, -0.69F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8226F, -2.318F, 11.1733F, 0.0427F, -0.1933F, -0.0024F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(114, 70).mirror().addBox(-0.0616F, -4.7268F, -6.6188F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(126, 72).mirror().addBox(-0.0616F, -3.8268F, -5.6188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.528F, -0.0398F, 0.1042F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(122, 60).mirror().addBox(-0.0616F, -1.6448F, -5.4366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.0044F, -0.0398F, 0.1042F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(122, 56).mirror().addBox(-0.0616F, -0.8958F, -4.4655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, -0.1265F, -0.0398F, 0.1042F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(48, 122).mirror().addBox(-0.0785F, -0.8953F, -3.4675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, -0.0748F, -0.045F, 0.0952F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(126, 80).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.503F, 2.3185F, 0.1749F, 0.0648F, -0.045F, 0.0952F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(43, 122).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4948F, 2.0705F, 0.519F, -0.1621F, -0.045F, 0.0952F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(24, 122).mirror().addBox(-0.1132F, -0.9816F, -4.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(19, 122).mirror().addBox(-0.1132F, -0.9816F, -3.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(122, 0).mirror().addBox(-0.1132F, -0.7816F, -2.3095F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3789F, 1.5917F, 5.6654F, -0.0379F, -0.1145F, 0.0957F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(109, 121).mirror().addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.894F, 2.0033F, 4.9341F, 0.026F, -0.1753F, 0.0966F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(104, 121).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0556F, 1.8741F, 5.9125F, 0.1133F, -0.1753F, 0.0966F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(99, 121).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2065F, 1.6593F, 6.8774F, 0.2005F, -0.1753F, 0.0966F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(121, 45).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3393F, 1.3195F, 7.8085F, 0.3314F, -0.1753F, 0.0966F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(121, 20).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4587F, 0.8995F, 8.7081F, 0.4187F, -0.1753F, 0.0966F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(126, 19).mirror().addBox(-0.2908F, -6.3976F, 2.3058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0289F, 1.3917F, 2.2904F, 1.8245F, -0.0744F, 0.0858F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(18, 126).mirror().addBox(-0.2908F, -6.6199F, -3.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.0289F, 1.3917F, 2.2904F, 0.9693F, -0.0744F, 0.0858F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(126, 16).mirror().addBox(-0.2908F, -2.2094F, -6.6852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0289F, 1.3917F, 2.2904F, 0.1315F, -0.0744F, 0.0858F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.7352F, -0.0235F, -1.9524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0132F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.0529F, 12.0927F, -0.8418F, -0.0998F, 0.0344F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(121, 16).mirror().addBox(-0.7665F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.0529F, 12.0927F, -0.6586F, -0.0998F, 0.0344F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 46).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.3725F, -2.8024F, 5.3794F, 0.1626F, -0.1772F, 0.1131F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.0082F, -2.9975F, -4.6953F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.2297F, -0.0471F, 0.1114F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(63, 57).mirror().addBox(-0.054F, -4.369F, -3.9437F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3789F, 1.5917F, 5.6654F, 0.3266F, -0.1165F, 0.112F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(76, 59).mirror().addBox(-0.054F, -3.0236F, -3.7827F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3789F, 1.5917F, 5.6654F, -0.0224F, -0.1165F, 0.112F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.0129F, -2.6021F, -6.8217F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.1425F, -0.0471F, 0.1114F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(70, 126).mirror().addBox(-0.0129F, -5.4154F, -5.8968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.6137F, -0.0471F, 0.1114F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(55, 111).mirror().addBox(-0.0129F, -3.2006F, -7.3387F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.2821F, -0.0471F, 0.1114F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(48, 111).mirror().addBox(-0.0129F, -1.8535F, -6.4967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, 0.0639F, -0.0471F, 0.1114F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(70, 72).mirror().addBox(-0.5F, -0.475F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.2487F, 0.0398F, -0.0259F, 0.0159F, -0.0471F, 0.1114F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(31, 72).mirror().addBox(-0.0129F, -0.8376F, -5.0929F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9789F, 1.3917F, 2.3654F, -0.1542F, -0.0471F, 0.1114F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 121).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4735F, 0.9393F, 8.8013F, 0.3481F, -0.1802F, 0.1265F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3372F, 1.2335F, 7.8553F, 0.2782F, -0.1802F, 0.1265F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 121).mirror().addBox(-0.3063F, -1.959F, -1.0641F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3849F, 1.4627F, 6.9506F, 0.0695F, -0.1886F, 0.1136F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-1.0793F, -0.7623F, -1.7122F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.5414F, 0.2325F, 16.4117F, -0.4409F, 0.1167F, 0.0085F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(100, 110).mirror().addBox(-1.0793F, -0.7373F, -0.8872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.7008F, -0.2883F, 15.0141F, -0.3275F, 0.1167F, 0.0085F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(105, 56).mirror().addBox(-0.5F, -0.2F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.2015F, -3.2145F, 15.4528F, 0.9303F, 0.1135F, 0.0287F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(76, 69).mirror().addBox(-1.0793F, -0.9841F, -0.6688F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(105, 6).mirror().addBox(-1.0793F, -1.7841F, -0.6688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7008F, -0.2883F, 15.0141F, -0.7202F, 0.1167F, 0.0085F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-1.2181F, -0.8649F, -2.2482F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7008F, -0.2883F, 15.0141F, -0.0638F, -0.0836F, 0.0777F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(98, 81).mirror().addBox(-0.475F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0648F, -1.2187F, 13.1249F, -0.9963F, -0.1563F, 0.1618F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.45F, -0.85F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1717F, -0.6066F, 13.1694F, 0.1223F, -0.1177F, 0.1196F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(34, 94).mirror().addBox(-0.0073F, -2.067F, -0.0349F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1501F, 0.5602F, 9.6299F, 0.3476F, -0.1739F, 0.1446F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(9, 94).mirror().addBox(-1.225F, -0.425F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5768F, -0.1674F, 16.7648F, -1.6888F, 0.0364F, -1.5738F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9829F, -0.8493F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r276 = lower_jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(126, 109).mirror().addBox(-0.8467F, -2.8462F, 6.7596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 88).mirror().addBox(-0.8467F, -2.8462F, 3.2596F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.6699F, -0.1192F, 0.0047F));

		PartDefinition cube_r277 = lower_jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(124, 8).mirror().addBox(-0.9885F, 2.0036F, 6.3419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -1.9704F, -0.1129F, -0.0258F));

		PartDefinition cube_r278 = lower_jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(124, 4).mirror().addBox(-0.9885F, -1.4562F, 6.3142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.4503F, -0.1129F, -0.0258F));

		PartDefinition cube_r279 = lower_jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(88, 123).mirror().addBox(-0.9885F, -2.4906F, 5.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(83, 123).mirror().addBox(-0.9885F, -2.5906F, 4.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.6074F, -0.1129F, -0.0258F));

		PartDefinition cube_r280 = lower_jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(-0.9885F, -2.2295F, 3.2681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.5202F, -0.1129F, -0.0258F));

		PartDefinition cube_r281 = lower_jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(10, 123).mirror().addBox(-0.9885F, -1.7272F, 2.3964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(50, 100).mirror().addBox(-0.9543F, -1.6556F, 0.9647F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.3893F, -0.1129F, -0.0258F));

		PartDefinition cube_r282 = lower_jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(122, 93).mirror().addBox(-0.0259F, 0.1417F, 3.4872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.3892F, -0.1216F, -0.0215F));

		PartDefinition cube_r283 = lower_jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(122, 76).mirror().addBox(-0.0259F, 0.467F, 2.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.3194F, -0.1216F, -0.0215F));

		PartDefinition cube_r284 = lower_jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(70, 122).mirror().addBox(-0.0259F, 0.4668F, 1.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.267F, -0.1216F, -0.0215F));

		PartDefinition cube_r285 = lower_jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(122, 68).mirror().addBox(-0.0259F, 0.5295F, 0.27F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.2321F, -0.1216F, -0.0215F));

		PartDefinition cube_r286 = lower_jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(122, 64).mirror().addBox(-0.5F, -0.925F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1963F, 8.5717F, -7.418F, -2.2319F, -0.1303F, -0.0433F));

		PartDefinition cube_r287 = lower_jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(98, 100).mirror().addBox(-0.8467F, -2.5094F, 3.4998F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.6176F, -0.1192F, 0.0047F));

		PartDefinition cube_r288 = lower_jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(112, 78).mirror().addBox(-0.9543F, 1.0733F, -1.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, 0.7611F, -0.1129F, -0.0258F));

		PartDefinition cube_r289 = lower_jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(126, 100).mirror().addBox(-0.9543F, -2.7696F, -2.2707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, 2.2271F, -0.1129F, -0.0258F));

		PartDefinition cube_r290 = lower_jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(126, 97).mirror().addBox(-0.9543F, -2.3893F, 2.6679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.602F, 8.6816F, -8.3507F, -2.5289F, -0.1129F, -0.0258F));

		PartDefinition cube_r291 = lower_jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(126, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.402F, 8.6816F, -5.5507F, 2.5415F, -0.1303F, -0.0433F));

		PartDefinition cube_r292 = lower_jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(34, 100).mirror().addBox(0.0083F, 0.6598F, -0.005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.2583F, -0.1216F, -0.0215F));

		PartDefinition cube_r293 = lower_jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(100, 22).mirror().addBox(0.0083F, -0.0396F, -0.0085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.902F, 8.6816F, -5.6507F, -2.3456F, -0.1216F, -0.0215F));

		PartDefinition cube_r294 = lower_jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(112, 74).mirror().addBox(-0.5F, -0.575F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.432F, 7.1962F, -5.209F, -2.2656F, -0.1185F, -0.0696F));

		PartDefinition cube_r295 = lower_jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-0.5043F, -1.6614F, -0.1974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1408F, 1.0992F, -2.0397F, -0.264F, -0.0121F, -0.0555F));

		PartDefinition cube_r296 = lower_jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(108, 36).mirror().addBox(-0.5043F, -0.2942F, -0.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1408F, 1.0992F, -2.0397F, -1.8943F, -0.0343F, -0.1217F));

		PartDefinition cube_r297 = lower_jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(13, 108).mirror().addBox(-0.6097F, -0.5656F, -5.3408F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0111F, 8.7854F, -6.8803F, -2.3528F, -0.1185F, -0.0696F));

		PartDefinition cube_r298 = lower_jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(50, 94).mirror().addBox(-0.5F, -0.325F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9338F, 3.9019F, -3.0327F, -1.9608F, -0.126F, -0.0546F));

		PartDefinition cube_r299 = lower_jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(47, 126).mirror().addBox(-0.5F, -1.725F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6844F, 2.8385F, -5.5908F, -2.1621F, -0.1303F, -0.0433F));

		PartDefinition cube_r300 = lower_jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(0.075F, -0.95F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.247F, 4.3388F, -4.9686F, -2.101F, -0.1303F, -0.0433F));

		PartDefinition cube_r301 = lower_jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-0.5043F, -0.9769F, -1.3583F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1408F, 1.0992F, -2.0397F, -1.093F, -0.0121F, -0.0555F));

		PartDefinition cube_r302 = lower_jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(26, 115).mirror().addBox(0.0907F, -1.0008F, 0.0323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8551F, -0.8303F, 0.8734F, -1.213F, -0.0349F, 0.0F));

		PartDefinition cube_r303 = lower_jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(79, 90).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.2664F, 2.7122F, 0.8954F, 0.6021F, -0.0349F, 0.0F));

		PartDefinition cube_r304 = lower_jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(109, 17).mirror().addBox(-0.4509F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.3071F, 2.121F, 0.6549F, 1.1694F, -0.0349F, 0.0F));

		PartDefinition cube_r305 = lower_jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(107, 94).mirror().addBox(0.0F, -1.525F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4979F, 4.6365F, -2.5226F, 0.7248F, -0.0698F, -0.0363F));

		PartDefinition cube_r306 = lower_jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(119, 121).mirror().addBox(-0.4493F, -2.5007F, 0.1032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3621F, 0.9635F, 2.129F, 1.5882F, -0.0349F, 0.0F));

		PartDefinition cube_r307 = lower_jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(126, 46).mirror().addBox(0.0893F, -0.5893F, -1.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.89F, 0.1784F, 1.8741F, -0.3054F, -0.0349F, 0.0F));

		PartDefinition cube_r308 = lower_jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(108, 36).addBox(-0.4957F, -0.2942F, -0.1966F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0408F, 1.0992F, -2.0397F, -1.8943F, 0.0343F, 0.1217F));

		PartDefinition cube_r309 = lower_jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(112, 74).addBox(-0.5F, -0.575F, -1.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3319F, 7.1962F, -5.209F, -2.2656F, 0.1185F, 0.0696F));

		PartDefinition cube_r310 = lower_jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(13, 108).addBox(-0.3903F, -0.5656F, -5.3408F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9111F, 8.7854F, -6.8803F, -2.3528F, 0.1185F, 0.0696F));

		PartDefinition cube_r311 = lower_jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(50, 94).addBox(-0.5F, -0.325F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8338F, 3.9019F, -3.0327F, -1.9608F, 0.126F, 0.0546F));

		PartDefinition cube_r312 = lower_jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(124, 8).addBox(-0.0115F, 2.0036F, 6.3419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -1.9704F, 0.1129F, 0.0258F));

		PartDefinition cube_r313 = lower_jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(124, 4).addBox(-0.0115F, -1.4562F, 6.3142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.4503F, 0.1129F, 0.0258F));

		PartDefinition cube_r314 = lower_jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(88, 123).addBox(-0.0115F, -2.4906F, 5.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 123).addBox(-0.0115F, -2.5906F, 4.1472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.6074F, 0.1129F, 0.0258F));

		PartDefinition cube_r315 = lower_jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(123, 24).addBox(-0.0115F, -2.2295F, 3.2681F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.5202F, 0.1129F, 0.0258F));

		PartDefinition cube_r316 = lower_jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 123).addBox(-0.0115F, -1.7272F, 2.3964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 100).addBox(-0.0457F, -1.6556F, 0.9647F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.3893F, 0.1129F, 0.0258F));

		PartDefinition cube_r317 = lower_jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(122, 93).addBox(-0.9741F, 0.1417F, 3.4872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.3892F, 0.1216F, 0.0215F));

		PartDefinition cube_r318 = lower_jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(122, 76).addBox(-0.9741F, 0.467F, 2.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.3194F, 0.1216F, 0.0215F));

		PartDefinition cube_r319 = lower_jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(70, 122).addBox(-0.9741F, 0.4668F, 1.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.267F, 0.1216F, 0.0215F));

		PartDefinition cube_r320 = lower_jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(122, 68).addBox(-0.9741F, 0.5295F, 0.27F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.2321F, 0.1216F, 0.0215F));

		PartDefinition cube_r321 = lower_jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(122, 64).addBox(-0.5F, -0.925F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0963F, 8.5717F, -7.418F, -2.2319F, 0.1303F, 0.0433F));

		PartDefinition cube_r322 = lower_jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(47, 126).addBox(-0.5F, -1.725F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5844F, 2.8385F, -5.5908F, -2.1621F, 0.1303F, 0.0433F));

		PartDefinition cube_r323 = lower_jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(112, 78).addBox(-0.0457F, 1.0733F, -1.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, 0.7611F, 0.1129F, 0.0258F));

		PartDefinition cube_r324 = lower_jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(126, 100).addBox(-0.0457F, -2.7696F, -2.2707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, 2.2271F, 0.1129F, 0.0258F));

		PartDefinition cube_r325 = lower_jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(126, 97).addBox(-0.0457F, -2.3893F, 2.6679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.5289F, 0.1129F, 0.0258F));

		PartDefinition cube_r326 = lower_jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(126, 109).addBox(-0.1533F, -2.8462F, 6.7596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 88).addBox(-0.1533F, -2.8462F, 3.2596F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.6699F, 0.1192F, -0.0047F));

		PartDefinition cube_r327 = lower_jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(98, 100).addBox(-0.1533F, -2.5094F, 3.4998F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.502F, 8.6816F, -8.3507F, -2.6176F, 0.1192F, -0.0047F));

		PartDefinition cube_r328 = lower_jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(34, 100).addBox(-1.0083F, 0.6598F, -0.005F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.2583F, 0.1216F, 0.0215F));

		PartDefinition cube_r329 = lower_jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(126, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.302F, 8.6816F, -5.5507F, 2.5415F, 0.1303F, 0.0433F));

		PartDefinition cube_r330 = lower_jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(100, 22).addBox(-1.0083F, -0.0396F, -0.0085F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.802F, 8.6816F, -5.6507F, -2.3456F, 0.1216F, 0.0215F));

		PartDefinition cube_r331 = lower_jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(87, 59).addBox(-1.075F, -0.95F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.147F, 4.3388F, -4.9686F, -2.101F, 0.1303F, 0.0433F));

		PartDefinition cube_r332 = lower_jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(75, 108).addBox(-0.4957F, -1.6614F, -0.1974F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0408F, 1.0992F, -2.0397F, -0.264F, 0.0121F, 0.0555F));

		PartDefinition cube_r333 = lower_jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(107, 99).addBox(-0.4957F, -0.9769F, -1.3583F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.0408F, 1.0992F, -2.0397F, -1.093F, 0.0121F, 0.0555F));

		PartDefinition cube_r334 = lower_jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(26, 115).addBox(-1.0907F, -1.0008F, 0.0323F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7551F, -0.8303F, 0.8734F, -1.213F, 0.0349F, 0.0F));

		PartDefinition cube_r335 = lower_jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 90).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1664F, 2.7122F, 0.8954F, 0.6021F, 0.0349F, 0.0F));

		PartDefinition cube_r336 = lower_jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(109, 17).addBox(-0.5491F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.2071F, 2.121F, 0.6549F, 1.1694F, 0.0349F, 0.0F));

		PartDefinition cube_r337 = lower_jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(107, 94).addBox(-1.0F, -1.525F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.3979F, 4.6365F, -2.5226F, 0.7248F, 0.0698F, 0.0363F));

		PartDefinition cube_r338 = lower_jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(119, 121).addBox(-0.5507F, -2.5007F, 0.1032F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2621F, 0.9635F, 2.129F, 1.5882F, 0.0349F, 0.0F));

		PartDefinition cube_r339 = lower_jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(126, 46).addBox(-1.0893F, -0.5893F, -1.1557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.79F, 0.1784F, 1.8741F, -0.3054F, 0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
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