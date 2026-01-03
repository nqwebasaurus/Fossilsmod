package fossils.fossils.client.blockentity.model.dimetrodongrandis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DimetrodonFossilModel extends SkullModelBase {
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
	private final ModelPart bone5;
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

	public DimetrodonFossilModel(ModelPart root) {
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
		this.bone5 = this.hips.getChild("bone5");
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

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -15.4764F, 20.5767F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 36).addBox(0.4F, -0.5904F, 6.891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 32).addBox(0.4F, -0.5904F, 0.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(70, 36).mirror().addBox(-2.4F, -0.5904F, 6.891F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 32).mirror().addBox(-2.4F, -0.5904F, 0.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 32).mirror().addBox(-0.5F, -1.0904F, 0.891F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 124).mirror().addBox(0.0F, -3.1872F, 0.0375F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5463F, 3.8447F, -0.6065F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 118).mirror().addBox(0.0F, -3.8872F, -0.0625F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9921F, 1.895F, -0.8683F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(78, 114).mirror().addBox(0.0F, -4.7872F, -0.0625F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5146F, 0.0573F, -0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(63, 121).mirror().addBox(0.0F, -3.4872F, -0.0625F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.304F, -1.548F, -0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 126).mirror().addBox(0.005F, -6.1274F, -1.6049F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.304F, -1.548F, -1.3744F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(102, 14).mirror().addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8291F, 2.3146F, -0.7783F, -0.4794F, -0.3791F, 0.6442F));

		PartDefinition Leftthigh_r1 = Rightthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(125, 62).mirror().addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 0).mirror().addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Rightthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(125, 59).mirror().addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1787F, 6.0552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Rightthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(52, 118).mirror().addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1845F, 6.1264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Rightthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(47, 118).mirror().addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 4.4672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Rightthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(73, 113).mirror().addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 3.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Rightthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(117, 118).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 8.0502F, -0.6217F, 1.0841F, 1.0933F, 0.6303F));

		PartDefinition Leftshin_r1 = Rightshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(111, 89).mirror().addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Rightshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(111, 84).mirror().addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Rightshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(37, 113).mirror().addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Rightshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(112, 112).mirror().addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Rightshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(113, 54).mirror().addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Rightshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(32, 113).mirror().addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0562F, 6.1685F, 0.6928F, 2.7388F, -0.6285F, -2.9398F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(73, 103).mirror().addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.8291F, 2.3146F, -0.7783F, -0.0124F, 0.2489F, -0.4051F));

		PartDefinition Rightthigh_r1 = Leftthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(119, 126).mirror().addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 118).mirror().addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Leftthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(114, 126).mirror().addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1787F, 6.0552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Leftthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(100, 118).mirror().addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1845F, 6.1264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Leftthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(95, 118).mirror().addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1864F, 4.4672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Leftthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(90, 116).mirror().addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1864F, 3.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Leftthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(113, 122).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1864F, 3.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 8.0502F, -0.6217F, 1.5762F, -0.5595F, -0.9313F));

		PartDefinition Rightshin_r1 = Leftshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(112, 107).mirror().addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Leftshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(112, 62).mirror().addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Leftshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(52, 101).mirror().addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(116, 84).mirror().addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Leftshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Leftshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(116, 89).mirror().addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Leftshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(116, 79).mirror().addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0562F, 6.1685F, 0.6928F, 3.0367F, 0.7311F, -2.6773F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(0.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3093F, -1.711F, 0.1557F, 0.0F, 0.0349F, -0.3927F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(94, 126).mirror().addBox(-0.1F, -1.045F, -2.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.2705F, -0.0305F, 0.0F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(107, 70).mirror().addBox(-0.0399F, -5.3887F, -3.5374F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -2.8502F, -0.0301F, 0.1746F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(42, 106).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8022F, 5.926F, 6.3892F, 2.1817F, 0.0F, 0.1745F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(89, 121).mirror().addBox(-1.0F, 3.7772F, 0.0383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1707F, 3.2875F, 1.3178F, 1.0647F, 0.0F, 0.1745F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(20, 101).mirror().addBox(-0.0399F, 1.3519F, -2.5607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.452F, -0.0301F, 0.1746F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(124, 32).mirror().addBox(-0.0095F, 1.6529F, 0.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.7975F, -0.0301F, 0.1746F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(27, 106).mirror().addBox(-0.0849F, -6.3494F, -1.3069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.1084F, -0.0603F, 0.1722F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(103, 37).mirror().addBox(-0.0849F, 2.3345F, 1.8678F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.4608F, -0.0603F, 0.1722F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(20, 108).mirror().addBox(-0.0095F, -1.5694F, 0.4119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.022F, -0.0301F, 0.1746F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(13, 101).mirror().addBox(-0.0095F, -0.1825F, 0.7916F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -0.6293F, -0.0301F, 0.1746F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(22, 94).mirror().addBox(-0.0095F, -3.0806F, 1.6862F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.5892F, -0.0301F, 0.1746F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(121, 86).mirror().addBox(-0.0849F, 6.0108F, 1.4665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, -1.2165F, -0.0603F, 0.1722F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(126, 91).mirror().addBox(-0.0849F, -3.5613F, -8.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 0.9652F, -0.0603F, 0.1722F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(66, 121).mirror().addBox(-0.0849F, -7.9474F, 1.2809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.3702F, -0.0603F, 0.1722F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(87, 104).mirror().addBox(-0.0095F, -4.3847F, 0.7465F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 2.5778F, -0.0301F, 0.1746F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(3, 76).mirror().addBox(-0.0095F, -2.8881F, -4.2347F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.5742F, -0.0301F, 0.1746F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(117, 73).mirror().addBox(-0.1F, -2.1895F, -0.6001F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, 2.8625F, -0.1322F, 1.5795F, -0.0305F, 0.0F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(126, 28).mirror().addBox(-0.5F, -0.325F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2884F, 2.3715F, 0.4264F, 2.3213F, 0.0F, 0.1745F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(94, 31).mirror().addBox(-0.5F, -1.0F, -2.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0596F, 0.3982F, 1.184F, 0.6807F, 0.0F, 0.1745F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(108, 43).mirror().addBox(-0.5F, -1.0F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1698F, 1.6989F, -1.5019F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(57, 100).mirror().addBox(-0.5F, -0.625F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.1239F, 0.0334F, 3.7842F, 0.2705F, 0.0F, 0.1745F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(111, 22).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.064F, -0.118F, 3.9317F, 0.0197F, -0.0886F, 0.1745F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(0.1F, -3.981F, -0.8851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, 0.1745F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(58, 105).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.3F, -0.9649F, -1.6745F, 0.5585F, 0.0F, 0.1745F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(97, 83).mirror().addBox(0.1F, -4.049F, -1.6422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, 0.1745F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3093F, -1.711F, 0.1557F, 0.0F, -0.0349F, 0.3927F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(94, 126).addBox(-0.9F, -1.045F, -2.8908F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.2705F, 0.0305F, 0.0F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(107, 70).addBox(-0.9601F, -5.3887F, -3.5374F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -2.8502F, 0.0301F, -0.1746F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(42, 106).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8022F, 5.926F, 6.3892F, 2.1817F, 0.0F, -0.1745F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(89, 121).addBox(0.0F, 3.7772F, 0.0383F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1707F, 3.2875F, 1.3178F, 1.0647F, 0.0F, -0.1745F));

		PartDefinition Hips_r30 = bone5.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(20, 101).addBox(-0.9601F, 1.3519F, -2.5607F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.452F, 0.0301F, -0.1746F));

		PartDefinition Hips_r31 = bone5.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(124, 32).addBox(-0.9905F, 1.6529F, 0.0871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.7975F, 0.0301F, -0.1746F));

		PartDefinition Hips_r32 = bone5.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(27, 106).addBox(-0.9151F, -6.3494F, -1.3069F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.1084F, 0.0603F, -0.1722F));

		PartDefinition Hips_r33 = bone5.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(103, 37).addBox(-0.9151F, 2.3345F, 1.8678F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.4608F, 0.0603F, -0.1722F));

		PartDefinition Hips_r34 = bone5.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(20, 108).addBox(-0.9905F, -1.5694F, 0.4119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.022F, 0.0301F, -0.1746F));

		PartDefinition Hips_r35 = bone5.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(13, 101).addBox(-0.9905F, -0.1825F, 0.7916F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -0.6293F, 0.0301F, -0.1746F));

		PartDefinition Hips_r36 = bone5.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(22, 94).addBox(-0.9905F, -3.0806F, 1.6862F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.5892F, 0.0301F, -0.1746F));

		PartDefinition Hips_r37 = bone5.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(121, 86).addBox(-0.9151F, 6.0108F, 1.4665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, -1.2165F, 0.0603F, -0.1722F));

		PartDefinition Hips_r38 = bone5.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(126, 91).addBox(-0.9151F, -3.5613F, -8.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 0.9652F, 0.0603F, -0.1722F));

		PartDefinition Hips_r39 = bone5.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(66, 121).addBox(-0.9151F, -7.9474F, 1.2809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.3702F, 0.0603F, -0.1722F));

		PartDefinition Hips_r40 = bone5.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(87, 104).addBox(-0.9905F, -4.3847F, 0.7465F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 2.5778F, 0.0301F, -0.1746F));

		PartDefinition Hips_r41 = bone5.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(3, 76).addBox(-0.9905F, -2.8881F, -4.2347F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.5742F, 0.0301F, -0.1746F));

		PartDefinition Hips_r42 = bone5.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(117, 73).addBox(-0.9F, -2.1895F, -0.6001F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7293F, 2.8625F, -0.1322F, 1.5795F, 0.0305F, 0.0F));

		PartDefinition Hips_r43 = bone5.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(126, 28).addBox(-0.5F, -0.325F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2884F, 2.3715F, 0.4264F, 2.3213F, 0.0F, -0.1745F));

		PartDefinition Hips_r44 = bone5.addOrReplaceChild("Hips_r44", CubeListBuilder.create().texOffs(94, 31).addBox(-0.5F, -1.0F, -2.025F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0596F, 0.3982F, 1.184F, 0.6807F, 0.0F, -0.1745F));

		PartDefinition Hips_r45 = bone5.addOrReplaceChild("Hips_r45", CubeListBuilder.create().texOffs(108, 43).addBox(-0.5F, -1.0F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1698F, 1.6989F, -1.5019F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition Hips_r46 = bone5.addOrReplaceChild("Hips_r46", CubeListBuilder.create().texOffs(57, 100).addBox(-0.5F, -0.625F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.1239F, 0.0334F, 3.7842F, 0.2705F, 0.0F, -0.1745F));

		PartDefinition Hips_r47 = bone5.addOrReplaceChild("Hips_r47", CubeListBuilder.create().texOffs(111, 22).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.064F, -0.118F, 3.9317F, 0.0197F, 0.0886F, -0.1745F));

		PartDefinition Hips_r48 = bone5.addOrReplaceChild("Hips_r48", CubeListBuilder.create().texOffs(86, 99).addBox(-1.1F, -3.981F, -0.8851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, -0.1222F, 0.0F, -0.1745F));

		PartDefinition Hips_r49 = bone5.addOrReplaceChild("Hips_r49", CubeListBuilder.create().texOffs(58, 105).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.9649F, -1.6745F, 0.5585F, 0.0F, -0.1745F));

		PartDefinition Hips_r50 = bone5.addOrReplaceChild("Hips_r50", CubeListBuilder.create().texOffs(97, 83).addBox(-1.1F, -4.049F, -1.6422F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9293F, 2.5513F, 0.6762F, 0.1833F, 0.0F, -0.1745F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.381F, 0.2109F, -0.0548F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 38).addBox(-0.4F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-1.6F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 124).mirror().addBox(0.0F, -2.3434F, -0.0861F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3396F, 4.912F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 127).mirror().addBox(0.0F, -2.6434F, -0.1611F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5809F, 3.1026F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(124, 126).mirror().addBox(0.0F, -2.7434F, -0.1361F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3684F, 1.3855F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(126, 86).mirror().addBox(0.0F, -1.8F, -2.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8892F, 6.3344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(30, 58).mirror().addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1642F, 5.6001F, -0.2211F, 0.213F, -0.0475F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 127).mirror().addBox(0.0F, -1.65F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6798F, 4.8832F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(114, 50).mirror().addBox(0.0F, -1.853F, 1.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(113, 99).mirror().addBox(0.0F, 1.1F, 3.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 100).mirror().addBox(0.0F, 0.3F, 1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 125).mirror().addBox(0.0F, -1.2F, -0.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(5, 125).mirror().addBox(0.0F, -2.1169F, 0.1026F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1293F, 0.9576F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 44).addBox(0.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-1.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(3, 62).mirror().addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.2382F, 0.1272F, -0.0308F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(3, 130).mirror().addBox(0.5F, -1.4257F, 0.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.043F, 3.8453F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(127, 129).mirror().addBox(0.0F, -0.9F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4721F, 5.1299F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(120, 129).mirror().addBox(0.0F, 3.1F, 7.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1866F, -4.8668F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(114, 15).mirror().addBox(0.0F, 0.4F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7231F, 0.3403F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(17, 128).mirror().addBox(0.5F, -1.3257F, 0.9823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3589F, 1.9659F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(0.5F, -1.2257F, 0.9823F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3251F, 0.0865F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 7).mirror().addBox(0.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1691F, 0.2152F, -0.0364F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 130).mirror().addBox(0.0F, -1.393F, 2.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(14, 130).mirror().addBox(0.0F, -1.268F, -0.1134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1817F, 1.0056F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(113, 59).mirror().addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 130).mirror().addBox(0.0F, -0.8F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7332F, 1.4092F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 66).mirror().addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 130).mirror().addBox(0.0F, -1.0325F, 2.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 55).mirror().addBox(0.0F, -0.8825F, 4.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0271F, 0.2181F, -0.0059F));

		PartDefinition cube_r33 = tail5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(130, 47).mirror().addBox(0.5F, -0.9F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2825F, 0.0688F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.1249F, 0.2165F, 0.027F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(31, 73).mirror().addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, -0.016F, 0.2176F, 0.0154F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0115F, 4.851F, -0.148F, 0.2181F, 0.0057F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2823F, -2.1294F, -0.672F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(128, 21).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -1.4021F, 0.1389F, -0.3527F, 0.9416F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(20, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -1.4021F, 0.2422F, -0.2442F, 0.5941F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(94, 61).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -3.4021F, 0.128F, -0.3386F, 0.9453F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(124, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5394F, -3.4021F, 0.2273F, -0.2344F, 0.5976F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(94, 54).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -5.4021F, 0.0443F, -0.2244F, 0.9686F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(113, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4394F, -5.4021F, 0.1106F, -0.1544F, 0.6202F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(128, 21).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -1.4021F, 0.1389F, 0.3527F, -0.9416F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(20, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -1.4021F, 0.2422F, 0.2442F, -0.5941F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(94, 61).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -3.4021F, 0.128F, 0.3386F, -0.9453F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(124, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5394F, -3.4021F, 0.2273F, 0.2344F, -0.5976F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -5.4021F, 0.0443F, 0.2244F, -0.9686F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(113, 20).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4394F, -5.4021F, 0.1106F, 0.1544F, -0.6202F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(8, 121).mirror().addBox(0.0F, -3.4872F, -0.0625F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8217F, -2.0685F, -0.2662F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(106, 113).mirror().addBox(0.005F, -8.1274F, -1.6049F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8217F, -2.0685F, -0.7199F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 113).mirror().addBox(0.0F, -0.1207F, -0.0225F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.1425F, -2.2966F, -0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(114, 67).mirror().addBox(0.008F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.264F, -2.2497F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 126).mirror().addBox(0.0F, -2.674F, -0.7173F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5741F, -4.3636F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(75, 126).mirror().addBox(0.0F, -8.2208F, -2.3225F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4259F, -4.8886F, -0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(58, 110).mirror().addBox(0.008F, -6.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.964F, -3.2497F, -0.7985F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 114).mirror().addBox(0.008F, -8.045F, -0.6949F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.0741F, -4.8636F, -0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(69, 126).mirror().addBox(0.0F, -3.1144F, -0.0019F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.0741F, -4.8636F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 110).mirror().addBox(0.0F, -5.2947F, -0.5903F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9741F, -5.9636F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(45, 11).mirror().addBox(-0.5F, -1.3F, 8.9974F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.197F, -15.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6384F, -6.8808F, 0.0581F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = body2.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(107, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -0.3213F, 0.1131F, -0.1343F, 0.5521F));

		PartDefinition Bodyfront_r14 = body2.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(121, 84).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -0.3213F, 0.0537F, -0.2063F, 0.8988F));

		PartDefinition Bodyfront_r15 = body2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(128, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.3594F, -0.2755F, 0.5016F));

		PartDefinition Bodyfront_r16 = body2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(118, 57).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.2428F, -0.4203F, 0.8401F));

		PartDefinition Bodyfront_r17 = body2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(128, 23).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -2.3213F, 0.0525F, -0.4791F, 1.272F));

		PartDefinition Bodyfront_r18 = body2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(121, 84).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -0.3213F, 0.0537F, 0.2063F, -0.8988F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(107, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -0.3213F, 0.1131F, 0.1343F, -0.5521F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(128, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.3594F, 0.2755F, -0.5016F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(118, 57).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.2428F, 0.4203F, -0.8401F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(128, 23).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -2.3213F, 0.0525F, 0.4791F, -1.272F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(13, 113).mirror().addBox(0.008F, -4.9999F, 0.0178F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.1357F, 4.0172F, -0.9556F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(61, 114).mirror().addBox(0.0F, -4.9235F, -0.0999F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.4237F, 0.8706F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(110, 54).mirror().addBox(0.0F, -5.4216F, -0.5113F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2487F, -0.9044F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(51, 126).mirror().addBox(0.0F, -0.0618F, -0.0739F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6487F, -2.7044F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 121).mirror().addBox(-0.005F, -3.9825F, -0.1181F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5971F, -2.6949F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(0.0F, -6.9502F, -0.0324F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.1221F, -0.7449F, -0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(118, 15).mirror().addBox(0.008F, -5.0041F, -0.0511F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -11.3354F, 3.7697F, -0.8508F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4652F, -3.7638F, 0.3723F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = body3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(121, 82).addBox(2.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, -0.0332F, -0.2028F, 1.2654F));

		PartDefinition Bodyfront_r24 = body3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(121, 80).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, 0.048F, -0.1999F, 0.8645F));

		PartDefinition Bodyfront_r25 = body3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(129, 102).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0089F, -0.5036F, 0.1056F, -0.1302F, 0.5176F));

		PartDefinition Bodyfront_r26 = body3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(115, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.2488F, -0.1991F, 0.4779F));

		PartDefinition Bodyfront_r27 = body3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(119, 11).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.1614F, -0.3125F, 0.8195F));

		PartDefinition Bodyfront_r28 = body3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(18, 62).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1161F, -2.4536F, 0.0252F, -0.3496F, 1.2332F));

		PartDefinition Bodyfront_r29 = body3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(128, 77).addBox(5.6968F, -3.6044F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, -0.0885F, -0.3714F, 1.5668F));

		PartDefinition Bodyfront_r30 = body3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(15, 48).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.0503F, -0.3781F, 1.1915F));

		PartDefinition Bodyfront_r31 = body3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(119, 9).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.1961F, -0.3291F, 0.7757F));

		PartDefinition Bodyfront_r32 = body3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(128, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2161F, -4.4535F, 0.2861F, -0.2038F, 0.4376F));

		PartDefinition Bodyfront_r33 = body3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(121, 82).mirror().addBox(-4.5846F, -1.4487F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, -0.0332F, 0.2028F, -1.2654F));

		PartDefinition Bodyfront_r34 = body3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(121, 80).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, 0.048F, 0.1999F, -0.8645F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(129, 102).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0089F, -0.5036F, 0.1056F, 0.1302F, -0.5176F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(115, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.2488F, 0.1991F, -0.4779F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(119, 11).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.1614F, 0.3125F, -0.8195F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(18, 62).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1161F, -2.4536F, 0.0252F, 0.3496F, -1.2332F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(128, 77).mirror().addBox(-6.6968F, -3.6044F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, -0.0885F, 0.3714F, -1.5668F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.0503F, 0.3781F, -1.1915F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(119, 9).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.1961F, 0.3291F, -0.7757F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(128, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2161F, -4.4535F, 0.2861F, 0.2038F, -0.4376F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.5F, 0.0979F, 0.0516F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 12.7917F, -3.6012F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(99, 129).mirror().addBox(0.005F, -24.4207F, -4.8592F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7623F, -3.2311F, -0.973F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(0.0F, -22.9063F, -1.3117F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7623F, -3.2311F, -0.8159F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-0.005F, -11.9825F, -0.1181F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.7623F, -3.2311F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 114).mirror().addBox(0.0F, -3.7618F, -0.0739F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5623F, -5.0061F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(42, 121).mirror().addBox(0.0F, -3.8118F, -0.0989F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.269F, -0.8925F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(0.0F, 0.0303F, -0.1579F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -13.2424F, 13.6019F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(8, 127).mirror().addBox(0.005F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -13.3164F, 13.4239F, -1.2523F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(129, 98).mirror().addBox(0.0F, -0.0618F, -0.0739F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.114F, -2.0406F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(48, 126).mirror().addBox(-0.005F, -2.9825F, -0.1181F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0623F, -2.0311F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(83, 14).mirror().addBox(0.0F, -13.9767F, 0.0512F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6373F, -0.4811F, -0.781F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(0.005F, -3.0404F, -0.0298F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -16.7971F, 12.5513F, -1.1999F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(121, 15).mirror().addBox(0.0F, -17.7404F, -2.1298F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6373F, -0.4811F, -0.9381F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9764F, 0.1804F, -0.0429F, -0.0078F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(121, 78).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, 0.0791F, -0.2074F, 0.7906F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(102, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, 0.137F, -0.1269F, 0.446F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(103, 35).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, -0.0076F, -0.2216F, 1.1924F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(109, 18).addBox(5.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0051F, -0.3272F, -0.0748F, -0.2089F, 1.5048F));

		PartDefinition Bodyfront_r47 = body4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(128, 81).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.1848F, -0.1494F, 0.4394F));

		PartDefinition Bodyfront_r48 = body4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(119, 26).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.117F, -0.2445F, 0.7821F));

		PartDefinition Bodyfront_r49 = body4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(99, 10).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, 0.0125F, -0.2702F, 1.1875F));

		PartDefinition Bodyfront_r50 = body4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(96, 50).addBox(5.8486F, -3.3525F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1949F, -2.3272F, -0.0713F, -0.2612F, 1.504F));

		PartDefinition Bodyfront_r51 = body4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(94, 12).addBox(5.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, -0.0714F, -0.2574F, 1.513F));

		PartDefinition Bodyfront_r52 = body4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(18, 64).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.0231F, -0.2659F, 1.1516F));

		PartDefinition Bodyfront_r53 = body4.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(119, 13).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.1249F, -0.2365F, 0.7471F));

		PartDefinition Bodyfront_r54 = body4.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(128, 79).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3949F, -4.2272F, 0.1894F, -0.1393F, 0.4056F));

		PartDefinition Bodyfront_r55 = body4.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(109, 18).mirror().addBox(-8.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, -0.0748F, 0.2089F, -1.5048F));

		PartDefinition Bodyfront_r56 = body4.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(103, 35).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, -0.0076F, 0.2216F, -1.1924F));

		PartDefinition Bodyfront_r57 = body4.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(102, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, 0.137F, 0.1269F, -0.446F));

		PartDefinition Bodyfront_r58 = body4.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(121, 78).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0051F, -0.3272F, 0.0791F, 0.2074F, -0.7906F));

		PartDefinition Bodyfront_r59 = body4.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.1848F, 0.1494F, -0.4394F));

		PartDefinition Bodyfront_r60 = body4.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(119, 26).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.117F, 0.2445F, -0.7821F));

		PartDefinition Bodyfront_r61 = body4.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(99, 10).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, 0.0125F, 0.2702F, -1.1875F));

		PartDefinition Bodyfront_r62 = body4.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(96, 50).mirror().addBox(-9.8486F, -3.3525F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1949F, -2.3272F, -0.0713F, 0.2612F, -1.504F));

		PartDefinition Bodyfront_r63 = body4.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(-10.6968F, -3.6044F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, -0.0714F, 0.2574F, -1.513F));

		PartDefinition Bodyfront_r64 = body4.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.0231F, 0.2659F, -1.1516F));

		PartDefinition Bodyfront_r65 = body4.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(119, 13).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.1249F, 0.2365F, -0.7471F));

		PartDefinition Bodyfront_r66 = body4.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(128, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3949F, -4.2272F, 0.1894F, 0.1393F, -0.4056F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(47, 41).mirror().addBox(-2.5F, -0.5489F, 0.2421F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.668F, -3.7302F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(52, 110).mirror().addBox(0.0F, -6.006F, -0.2481F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1836F, -1.3047F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 89).mirror().addBox(-0.005F, -11.921F, -0.0858F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0836F, 1.9953F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(86, 129).mirror().addBox(0.005F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -19.9106F, 19.4226F, -1.0777F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(0.0F, -22.8484F, -1.2734F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0836F, 1.9953F, -0.9207F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-0.007F, -24.9717F, -0.014F, 0.0F, 25.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -4.829F, -1.088F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(98, 110).mirror().addBox(-0.002F, -4.8257F, -0.4978F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.354F, -2.588F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 126).mirror().addBox(0.005F, 0.019F, -0.5588F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.8836F, 18.2953F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.425F, -4.85F, 0.0843F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = body5.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(89, 128).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1529F, -0.1344F, 0.4439F));

		PartDefinition Bodyfront_r68 = body5.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(119, 30).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0917F, -0.2198F, 0.7879F));

		PartDefinition Bodyfront_r69 = body5.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(101, 68).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0009F, -0.2378F, 1.1909F));

		PartDefinition Bodyfront_r70 = body5.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(94, 52).addBox(5.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0737F, -0.2264F, 1.5045F));

		PartDefinition Bodyfront_r71 = body5.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(79, 52).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r72 = body5.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(101, 29).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r73 = body5.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(119, 28).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r74 = body5.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(128, 83).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition Bodyfront_r75 = body5.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(89, 128).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1529F, 0.1344F, -0.4439F));

		PartDefinition Bodyfront_r76 = body5.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(119, 30).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0917F, 0.2198F, -0.7879F));

		PartDefinition Bodyfront_r77 = body5.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(101, 68).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0009F, 0.2378F, -1.1909F));

		PartDefinition Bodyfront_r78 = body5.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(94, 52).mirror().addBox(-10.8486F, -3.3525F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0737F, 0.2264F, -1.5045F));

		PartDefinition Bodyfront_r79 = body5.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(79, 52).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r80 = body5.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(101, 29).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r81 = body5.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(119, 28).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r82 = body5.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(128, 83).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition cube_r76 = body5.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-2.5F, 12.8656F, 4.3735F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(25, 88).mirror().addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body5.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 126).mirror().addBox(0.003F, -35.348F, -6.7346F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.379F, -0.338F, -0.8858F, 0.0F, 0.0F));

		PartDefinition cube_r78 = body5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.007F, -33.1666F, -2.8741F, 0.0F, 21.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.379F, -0.338F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(83, 85).mirror().addBox(-0.002F, -12.4749F, -0.1839F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.379F, -0.338F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.002F, -8.4795F, -0.1864F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.379F, -2.338F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-0.007F, -10.9702F, -0.1004F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -7.904F, 1.462F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(54, 86).mirror().addBox(-0.002F, -13.0281F, -0.0207F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -16.904F, 7.662F, -0.7112F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(49, 110).mirror().addBox(0.005F, 0.0F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -30.8446F, 20.4391F, -0.8159F, 0.0F, 0.0F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.325F, -3.9F, 0.0407F, -0.0436F, -0.0018F));

		PartDefinition Bodyfront_r83 = body6.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(129, 85).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, 0.1212F, -0.1194F, 0.4479F));

		PartDefinition Bodyfront_r84 = body6.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(120, 71).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, 0.0666F, -0.195F, 0.7931F));

		PartDefinition Bodyfront_r85 = body6.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(102, 99).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, -0.0142F, -0.2054F, 1.1938F));

		PartDefinition Bodyfront_r86 = body6.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(88, 64).addBox(5.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2199F, -1.2022F, -0.076F, -0.1915F, 1.505F));

		PartDefinition Bodyfront_r87 = body6.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(62, 15).addBox(5.6968F, -3.6044F, -0.5417F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r88 = body6.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(102, 97).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r89 = body6.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(120, 69).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r90 = body6.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(129, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4199F, -5.3022F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition Bodyfront_r91 = body6.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(77, 12).addBox(5.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r92 = body6.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(102, 20).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r93 = body6.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(120, 67).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r94 = body6.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(129, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2522F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition Bodyfront_r95 = body6.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(129, 85).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, 0.1212F, 0.1194F, -0.4479F));

		PartDefinition Bodyfront_r96 = body6.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(120, 71).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, 0.0666F, 0.195F, -0.7931F));

		PartDefinition Bodyfront_r97 = body6.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(102, 99).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, -0.0142F, 0.2054F, -1.1938F));

		PartDefinition Bodyfront_r98 = body6.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(-11.8486F, -3.3525F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2199F, -1.2022F, -0.076F, 0.1915F, -1.505F));

		PartDefinition Bodyfront_r99 = body6.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-13.6968F, -3.6044F, -0.5417F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r100 = body6.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(102, 97).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r101 = body6.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(120, 69).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r102 = body6.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(129, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4199F, -5.3022F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition Bodyfront_r103 = body6.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-12.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition Bodyfront_r104 = body6.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(102, 20).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r105 = body6.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(120, 67).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r106 = body6.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(129, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2522F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition cube_r84 = body6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(3, 12).mirror().addBox(-2.5F, -1.1917F, -6.8413F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.9711F, 1.208F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(105, 120).mirror().addBox(0.003F, -4.121F, -0.0503F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -31.0267F, 19.3528F, -0.7985F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(39, 92).mirror().addBox(-0.002F, -9.9886F, -0.0676F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -23.304F, 13.362F, -0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(9, 30).mirror().addBox(-0.007F, -27.3683F, -0.9195F, 0.0F, 23.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.004F, -0.738F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body6.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(117, 106).mirror().addBox(-0.002F, -4.4795F, -0.1864F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.004F, -0.738F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body6.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(35, 126).mirror().addBox(0.003F, -3.0376F, -1.0843F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -33.1497F, 17.4717F, -0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body6.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(-0.002F, -12.008F, -0.0011F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -24.254F, 9.737F, -0.624F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body6.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(6, 30).mirror().addBox(-0.007F, -23.0162F, -0.1078F, 0.0F, 23.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -4.204F, -1.238F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body6.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(5, 118).mirror().addBox(-0.002F, -4.5129F, -0.0922F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.004F, -2.738F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body6.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(117, 66).mirror().addBox(-0.002F, -4.4594F, -0.2849F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.004F, -4.238F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body6.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.007F, -32.0122F, -0.1026F, 0.0F, 32.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -4.304F, -3.238F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body6.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(39, 104).mirror().addBox(-0.002F, -6.9798F, 0.0746F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -33.6793F, 9.2758F, -0.7287F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body6.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(26, 24).mirror().addBox(-0.002F, -25.0444F, -0.9011F, 0.0F, 25.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -17.404F, -0.438F, -0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body6.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(117, 59).mirror().addBox(-0.007F, -5.1086F, -0.0686F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -12.9433F, -2.9604F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body6.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.007F, -0.1086F, -0.0686F, 0.0F, 14.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -12.9432F, -2.9604F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r99 = body6.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(62, 57).mirror().addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5026F, -5.925F, -0.0641F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r107 = body7.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(94, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1688F, -0.1419F, 0.4417F));

		PartDefinition Bodyfront_r108 = body7.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(120, 110).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.1043F, -0.2321F, 0.7851F));

		PartDefinition Bodyfront_r109 = body7.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(103, 33).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0058F, -0.2541F, 1.1892F));

		PartDefinition Bodyfront_r110 = body7.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(79, 50).addBox(5.8486F, -3.3525F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0725F, -0.2438F, 1.5043F));

		PartDefinition Bodyfront_r111 = body7.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(88, 66).addBox(5.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, -0.0745F, -0.2051F, 1.5137F));

		PartDefinition Bodyfront_r112 = body7.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(103, 31).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.0012F, -0.218F, 1.1568F));

		PartDefinition Bodyfront_r113 = body7.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(120, 108).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.0857F, -0.2007F, 0.7556F));

		PartDefinition Bodyfront_r114 = body7.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(129, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -5.4272F, 0.1409F, -0.1185F, 0.4119F));

		PartDefinition Bodyfront_r115 = body7.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(77, 62).addBox(5.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, -0.0734F, -0.2225F, 1.5135F));

		PartDefinition Bodyfront_r116 = body7.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(102, 101).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.0085F, -0.234F, 1.1552F));

		PartDefinition Bodyfront_r117 = body7.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(120, 106).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.0987F, -0.2127F, 0.7529F));

		PartDefinition Bodyfront_r118 = body7.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(129, 87).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1699F, -3.3772F, 0.157F, -0.1254F, 0.4099F));

		PartDefinition Bodyfront_r119 = body7.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(94, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1688F, 0.1419F, -0.4417F));

		PartDefinition Bodyfront_r120 = body7.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(120, 110).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.1043F, 0.2321F, -0.7851F));

		PartDefinition Bodyfront_r121 = body7.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(103, 33).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0058F, 0.2541F, -1.1892F));

		PartDefinition Bodyfront_r122 = body7.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(79, 50).mirror().addBox(-12.8486F, -3.3525F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0725F, 0.2438F, -1.5043F));

		PartDefinition Bodyfront_r123 = body7.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(88, 66).mirror().addBox(-11.6968F, -3.6044F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, -0.0745F, 0.2051F, -1.5137F));

		PartDefinition Bodyfront_r124 = body7.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(103, 31).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.0012F, 0.218F, -1.1568F));

		PartDefinition Bodyfront_r125 = body7.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(120, 108).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.0857F, 0.2007F, -0.7556F));

		PartDefinition Bodyfront_r126 = body7.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(129, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -5.4272F, 0.1409F, 0.1185F, -0.4119F));

		PartDefinition Bodyfront_r127 = body7.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(77, 62).mirror().addBox(-12.6968F, -3.6044F, -0.5417F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, -0.0734F, 0.2225F, -1.5135F));

		PartDefinition cube_r100 = body7.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(3, 30).mirror().addBox(-0.007F, -24.0631F, -0.388F, 0.0F, 24.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -4.8391F, -4.9417F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body7.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(117, 46).mirror().addBox(0.0F, -4.7874F, 0.1497F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.183F, -5.5802F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r102 = body7.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(32, 126).mirror().addBox(-0.002F, -3.0068F, -0.0169F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -28.7457F, -4.6344F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body7.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.002F, -14.6232F, -0.1597F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -0.3391F, -1.6667F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body7.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(15, 30).mirror().addBox(0.002F, -15.785F, -0.0867F, 0.0F, 16.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -14.8391F, -0.2667F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body7.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(46, 88).mirror().addBox(-0.002F, -12.005F, 0.0182F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -29.9917F, 3.2159F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body7.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(86, 118).mirror().addBox(-0.002F, -3.3426F, -0.8561F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -33.9391F, -0.0667F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body7.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 88).mirror().addBox(0.002F, 0.159F, -0.0773F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.002F, -33.8212F, -0.969F, -0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body7.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(12, 30).mirror().addBox(-0.005F, -0.0624F, -0.0003F, 0.0F, 22.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -21.765F, -1.8287F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r128 = body7.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(102, 101).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.0085F, 0.234F, -1.1552F));

		PartDefinition Bodyfront_r129 = body7.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(120, 106).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.0987F, 0.2127F, -0.7529F));

		PartDefinition Bodyfront_r130 = body7.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(129, 87).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1699F, -3.3772F, 0.157F, 0.1254F, -0.4099F));

		PartDefinition cube_r109 = body7.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(3, 21).mirror().addBox(-2.5F, -2.0F, -6.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 13.9711F, 1.208F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body7.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 48).mirror().addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body7.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4543F, -5.8605F, -0.1713F, -0.172F, 0.0296F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(112, 129).mirror().addBox(-0.004F, -2.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.004F, -20.8791F, -3.7765F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(21, 30).mirror().addBox(0.004F, -20.5719F, -0.5329F, 0.0F, 15.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4874F, -1.0197F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(87, 110).mirror().addBox(0.0F, -5.5932F, -0.0448F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4874F, -1.0197F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(86, 14).mirror().addBox(0.004F, -13.0178F, -0.0836F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0874F, -4.1197F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(109, 115).mirror().addBox(0.0F, -4.5932F, -0.0448F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1126F, -2.3197F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r131 = chest.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(129, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.2726F, -0.1687F, 0.3758F));

		PartDefinition Bodyfront_r132 = chest.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(120, 36).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.1951F, -0.2915F, 0.7117F));

		PartDefinition Bodyfront_r133 = chest.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(86, 29).addBox(4.8995F, -3.0361F, -0.7277F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, -0.078F, -0.3638F, 1.4451F));

		PartDefinition Bodyfront_r134 = chest.addOrReplaceChild("Bodyfront_r134", CubeListBuilder.create().texOffs(108, 48).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -1.4167F, 0.0654F, -0.3433F, 1.1217F));

		PartDefinition Bodyfront_r135 = chest.addOrReplaceChild("Bodyfront_r135", CubeListBuilder.create().texOffs(92, 27).addBox(4.8949F, -3.0518F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, -0.07F, -0.3136F, 1.5029F));

		PartDefinition Bodyfront_r136 = chest.addOrReplaceChild("Bodyfront_r136", CubeListBuilder.create().texOffs(105, 27).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.0309F, -0.3196F, 1.1814F));

		PartDefinition Bodyfront_r137 = chest.addOrReplaceChild("Bodyfront_r137", CubeListBuilder.create().texOffs(120, 6).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.154F, -0.2828F, 0.7717F));

		PartDefinition Bodyfront_r138 = chest.addOrReplaceChild("Bodyfront_r138", CubeListBuilder.create().texOffs(128, 96).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0656F, -3.4167F, 0.2319F, -0.1735F, 0.4311F));

		PartDefinition Bodyfront_r139 = chest.addOrReplaceChild("Bodyfront_r139", CubeListBuilder.create().texOffs(128, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.2916F, -0.2124F, 0.5411F));

		PartDefinition Bodyfront_r140 = chest.addOrReplaceChild("Bodyfront_r140", CubeListBuilder.create().texOffs(120, 4).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.1985F, -0.3389F, 0.8796F));

		PartDefinition Bodyfront_r141 = chest.addOrReplaceChild("Bodyfront_r141", CubeListBuilder.create().texOffs(79, 54).addBox(2.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2656F, -5.4167F, 0.0482F, -0.388F, 1.2969F));

		PartDefinition Bodyfront_r142 = chest.addOrReplaceChild("Bodyfront_r142", CubeListBuilder.create().texOffs(129, 14).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.2726F, 0.1687F, -0.3758F));

		PartDefinition Bodyfront_r143 = chest.addOrReplaceChild("Bodyfront_r143", CubeListBuilder.create().texOffs(120, 36).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.1951F, 0.2915F, -0.7117F));

		PartDefinition Bodyfront_r144 = chest.addOrReplaceChild("Bodyfront_r144", CubeListBuilder.create().texOffs(86, 29).mirror().addBox(-10.8995F, -3.0361F, -0.7277F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, -0.078F, 0.3638F, -1.4451F));

		PartDefinition Bodyfront_r145 = chest.addOrReplaceChild("Bodyfront_r145", CubeListBuilder.create().texOffs(108, 48).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -1.4167F, 0.0654F, 0.3433F, -1.1217F));

		PartDefinition Bodyfront_r146 = chest.addOrReplaceChild("Bodyfront_r146", CubeListBuilder.create().texOffs(92, 27).mirror().addBox(-9.8949F, -3.0518F, -0.5417F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, -0.07F, 0.3136F, -1.5029F));

		PartDefinition Bodyfront_r147 = chest.addOrReplaceChild("Bodyfront_r147", CubeListBuilder.create().texOffs(105, 27).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.0309F, 0.3196F, -1.1814F));

		PartDefinition Bodyfront_r148 = chest.addOrReplaceChild("Bodyfront_r148", CubeListBuilder.create().texOffs(120, 6).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.154F, 0.2828F, -0.7717F));

		PartDefinition Bodyfront_r149 = chest.addOrReplaceChild("Bodyfront_r149", CubeListBuilder.create().texOffs(128, 96).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0656F, -3.4167F, 0.2319F, 0.1735F, -0.4311F));

		PartDefinition Bodyfront_r150 = chest.addOrReplaceChild("Bodyfront_r150", CubeListBuilder.create().texOffs(128, 94).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.2916F, 0.2124F, -0.5411F));

		PartDefinition Bodyfront_r151 = chest.addOrReplaceChild("Bodyfront_r151", CubeListBuilder.create().texOffs(120, 4).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.1985F, 0.3389F, -0.8796F));

		PartDefinition Bodyfront_r152 = chest.addOrReplaceChild("Bodyfront_r152", CubeListBuilder.create().texOffs(79, 54).mirror().addBox(-8.586F, -1.4386F, -0.5417F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2656F, -5.4167F, 0.0482F, 0.388F, -1.2969F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(32, 24).mirror().addBox(-0.9582F, 0.3892F, 5.8401F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5418F, 11.9739F, -6.9671F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.9582F, -0.7557F, 2.9995F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5418F, 11.9739F, -6.9671F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-1.4582F, -1.0856F, 0.0392F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5418F, 11.9739F, -6.9671F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(11, 124).mirror().addBox(0.5F, -3.351F, -0.2875F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0431F, -5.69F, 0.3971F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(0.505F, -10.2848F, -0.5644F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0431F, -5.69F, 0.3098F, 0.0F, 0.0F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(24, 113).mirror().addBox(0.505F, -9.7695F, -1.4346F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2569F, -3.89F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(95, 110).mirror().addBox(0.5F, -4.9924F, -0.2502F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2569F, -3.89F, 0.4669F, 0.0F, 0.0F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(-0.5F, -0.3716F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.588F, -8.9257F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6889F, 7.9136F, -4.7747F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Bodyfront_r153 = bone.addOrReplaceChild("Bodyfront_r153", CubeListBuilder.create().texOffs(61, 110).mirror().addBox(-0.2519F, -1.9F, -4.2338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, 0.262F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r154 = bone.addOrReplaceChild("Bodyfront_r154", CubeListBuilder.create().texOffs(86, 91).mirror().addBox(0.325F, -1.0016F, -0.9527F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6106F, 0.5528F, -0.4997F, 0.0785F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r155 = bone.addOrReplaceChild("Bodyfront_r155", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(0.275F, 0.2234F, -0.5277F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6106F, 0.5528F, -0.4997F, 0.8738F, 0.0076F, -0.3744F));

		PartDefinition Bodyfront_r156 = bone.addOrReplaceChild("Bodyfront_r156", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-0.5F, -1.425F, -1.575F, 1.0F, 9.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4106F, -7.6157F, 2.0717F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r157 = bone.addOrReplaceChild("Bodyfront_r157", CubeListBuilder.create().texOffs(26, 12).mirror().addBox(-0.2522F, -3.189F, -1.3366F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.4362F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r158 = bone.addOrReplaceChild("Bodyfront_r158", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-0.2519F, -0.7282F, -1.0233F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.0696F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r159 = bone.addOrReplaceChild("Bodyfront_r159", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.2519F, -1.5563F, -4.7618F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7343F, 3.6355F, 2.9226F, -0.2616F, 0.0077F, -0.58F));

		PartDefinition Bodyfront_r160 = bone.addOrReplaceChild("Bodyfront_r160", CubeListBuilder.create().texOffs(115, 4).mirror().addBox(-0.5F, -3.125F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6168F, -1.1545F, -1.7406F, -0.368F, -0.0102F, -0.2447F));

		PartDefinition Bodyfront_r161 = bone.addOrReplaceChild("Bodyfront_r161", CubeListBuilder.create().texOffs(95, 91).mirror().addBox(-0.923F, -0.0968F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.8822F, -1.3626F, -1.0662F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r162 = bone.addOrReplaceChild("Bodyfront_r162", CubeListBuilder.create().texOffs(126, 123).mirror().addBox(-0.923F, 1.5582F, 0.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.8822F, -1.3626F, -0.4815F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r163 = bone.addOrReplaceChild("Bodyfront_r163", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.1F, -0.25F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.0648F, 1.8968F, -2.9592F, -0.5377F, 0.3763F, -0.0448F));

		PartDefinition Bodyfront_r164 = bone.addOrReplaceChild("Bodyfront_r164", CubeListBuilder.create().texOffs(99, 5).mirror().addBox(-0.923F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.8822F, -1.3626F, -0.7607F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r165 = bone.addOrReplaceChild("Bodyfront_r165", CubeListBuilder.create().texOffs(110, 37).mirror().addBox(-0.923F, -1.2951F, -0.661F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5861F, 0.8822F, -1.3626F, 0.1992F, -0.0102F, -0.8119F));

		PartDefinition Bodyfront_r166 = bone.addOrReplaceChild("Bodyfront_r166", CubeListBuilder.create().texOffs(118, 22).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, -0.3262F, -1.6989F, -0.2808F, -0.0102F, -0.2447F));

		PartDefinition Bodyfront_r167 = bone.addOrReplaceChild("Bodyfront_r167", CubeListBuilder.create().texOffs(37, 118).mirror().addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3159F, -0.6725F, -0.4937F, -0.8044F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r168 = bone.addOrReplaceChild("Bodyfront_r168", CubeListBuilder.create().texOffs(19, 113).mirror().addBox(-0.5F, 0.0F, 0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3714F, -4.2262F, -1.2477F, -0.0626F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r169 = bone.addOrReplaceChild("Bodyfront_r169", CubeListBuilder.create().texOffs(81, 114).mirror().addBox(-0.5F, -1.3F, 1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(95, 14).mirror().addBox(-0.5F, -1.3F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4265F, -7.2198F, -1.0601F, 0.3301F, -0.0102F, -0.0178F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6889F, 7.9136F, -4.7747F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Bodyfront_r170 = bone3.addOrReplaceChild("Bodyfront_r170", CubeListBuilder.create().texOffs(61, 110).addBox(-0.7481F, -1.9F, -4.2338F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, 0.262F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r171 = bone3.addOrReplaceChild("Bodyfront_r171", CubeListBuilder.create().texOffs(86, 91).addBox(-1.325F, -1.0016F, -0.9527F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.6106F, 0.5528F, -0.4997F, 0.0785F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r172 = bone3.addOrReplaceChild("Bodyfront_r172", CubeListBuilder.create().texOffs(70, 89).addBox(-1.275F, 0.2234F, -0.5277F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.6106F, 0.5528F, -0.4997F, 0.8738F, -0.0076F, 0.3744F));

		PartDefinition Bodyfront_r173 = bone3.addOrReplaceChild("Bodyfront_r173", CubeListBuilder.create().texOffs(36, 80).addBox(-0.5F, -1.425F, -1.575F, 1.0F, 9.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4106F, -7.6157F, 2.0717F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r174 = bone3.addOrReplaceChild("Bodyfront_r174", CubeListBuilder.create().texOffs(26, 12).addBox(-0.7478F, -3.189F, -1.3366F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.4362F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r175 = bone3.addOrReplaceChild("Bodyfront_r175", CubeListBuilder.create().texOffs(29, 0).addBox(-0.7481F, -0.7282F, -1.0233F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.0696F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r176 = bone3.addOrReplaceChild("Bodyfront_r176", CubeListBuilder.create().texOffs(25, 80).addBox(-0.7481F, -1.5563F, -4.7618F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7343F, 3.6355F, 2.9226F, -0.2616F, -0.0077F, 0.58F));

		PartDefinition Bodyfront_r177 = bone3.addOrReplaceChild("Bodyfront_r177", CubeListBuilder.create().texOffs(115, 4).addBox(-0.5F, -3.125F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6168F, -1.1545F, -1.7406F, -0.368F, 0.0102F, 0.2447F));

		PartDefinition Bodyfront_r178 = bone3.addOrReplaceChild("Bodyfront_r178", CubeListBuilder.create().texOffs(95, 91).addBox(-0.077F, -0.0968F, -1.4515F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5861F, 0.8822F, -1.3626F, -1.0662F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r179 = bone3.addOrReplaceChild("Bodyfront_r179", CubeListBuilder.create().texOffs(126, 123).addBox(-0.077F, 1.5582F, 0.3769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5861F, 0.8822F, -1.3626F, -0.4815F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r180 = bone3.addOrReplaceChild("Bodyfront_r180", CubeListBuilder.create().texOffs(90, 56).addBox(-1.9F, -0.25F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0648F, 1.8968F, -2.9592F, -0.5377F, -0.3763F, 0.0448F));

		PartDefinition Bodyfront_r181 = bone3.addOrReplaceChild("Bodyfront_r181", CubeListBuilder.create().texOffs(99, 5).addBox(-0.077F, 1.3552F, -1.9326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-0.5861F, 0.8822F, -1.3626F, -0.7607F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r182 = bone3.addOrReplaceChild("Bodyfront_r182", CubeListBuilder.create().texOffs(110, 37).addBox(-0.077F, -1.2951F, -0.661F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5861F, 0.8822F, -1.3626F, 0.1992F, 0.0102F, 0.8119F));

		PartDefinition Bodyfront_r183 = bone3.addOrReplaceChild("Bodyfront_r183", CubeListBuilder.create().texOffs(118, 22).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4105F, -0.3262F, -1.6989F, -0.2808F, 0.0102F, 0.2447F));

		PartDefinition Bodyfront_r184 = bone3.addOrReplaceChild("Bodyfront_r184", CubeListBuilder.create().texOffs(37, 118).addBox(-0.5F, -1.1F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3159F, -0.6725F, -0.4937F, -0.8044F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r185 = bone3.addOrReplaceChild("Bodyfront_r185", CubeListBuilder.create().texOffs(19, 113).addBox(-0.5F, 0.0F, 0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.3714F, -4.2262F, -1.2477F, -0.0626F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r186 = bone3.addOrReplaceChild("Bodyfront_r186", CubeListBuilder.create().texOffs(81, 114).addBox(-0.5F, -1.3F, 1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(95, 14).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4265F, -7.2198F, -1.0601F, 0.3301F, 0.0102F, 0.0178F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(95, 97).mirror().addBox(-0.401F, 2.8676F, -0.9195F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(14, 80).mirror().addBox(-0.401F, -0.1324F, -1.8195F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8737F, 9.4774F, 0.496F, -0.031F, -0.1114F, 0.4752F));

		PartDefinition Leftupperarm_r1 = Rightupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(119, 102).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 3.8676F, 1.6805F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Rightupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(101, 113).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 5.8676F, -0.4195F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Rightupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(103, 76).mirror().addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.099F, 9.0995F, 0.8001F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Rightupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(119, 98).mirror().addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.099F, 7.6801F, -3.4053F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(81, 119).mirror().addBox(-0.6003F, -1.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2549F, 8.2932F, -0.5251F, -1.4615F, -0.2667F, 1.1996F));

		PartDefinition Leftlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(113, 94).mirror().addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 1.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 3.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(112, 117).mirror().addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 0.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(119, 32).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 0.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(31, 94).mirror().addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 2.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-2.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.2988F, -0.1475F, -1.8217F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-3.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, -0.0039F, -0.0007F, -0.4015F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(101, 43).mirror().addBox(-0.599F, 2.8676F, -0.9195F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(43, 80).mirror().addBox(-0.599F, -0.1324F, -1.8195F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8737F, 9.4774F, 0.496F, 0.5799F, 0.1114F, -0.4752F));

		PartDefinition Rightupperarm_r1 = Leftupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(122, 112).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.099F, 3.8676F, 1.6805F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Leftupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(67, 116).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.099F, 5.8676F, -0.4195F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Leftupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(102, 103).mirror().addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.099F, 9.0995F, 0.8001F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Leftupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(108, 122).mirror().addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.099F, 7.6801F, -3.4053F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(99, 122).mirror().addBox(-0.3997F, -1.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2549F, 8.2932F, -0.5251F, -1.3745F, 1.0012F, -1.0625F));

		PartDefinition Rightlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(42, 116).mirror().addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.1003F, 1.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(68, 110).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1003F, 3.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(117, 113).mirror().addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1003F, 0.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(94, 122).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1003F, 0.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(34, 106).mirror().addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1003F, 2.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(81, 37).mirror().addBox(0.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.1914F, 0.0497F, 0.2435F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(0.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, -0.0037F, -0.0013F, -0.1221F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(0.0F, -6.4711F, -7.6717F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.2657F, -0.1703F, -0.0383F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(109, 107).mirror().addBox(0.505F, -6.002F, -0.0801F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.3733F, -2.6142F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(123, 120).mirror().addBox(0.5F, -3.9945F, -0.1652F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4733F, -1.9142F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(57, 118).mirror().addBox(0.505F, -4.0785F, -0.0378F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.4733F, -4.2142F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(116, 99).mirror().addBox(0.5F, -0.0803F, -0.0222F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -5.4733F, -4.2142F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r187 = neck.addOrReplaceChild("Bodyfront_r187", CubeListBuilder.create().texOffs(120, 46).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -5.6658F, 0.3177F, -0.5443F, 0.9265F));

		PartDefinition Bodyfront_r188 = neck.addOrReplaceChild("Bodyfront_r188", CubeListBuilder.create().texOffs(25, 129).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -5.6658F, 0.4689F, -0.3704F, 0.5881F));

		PartDefinition Bodyfront_r189 = neck.addOrReplaceChild("Bodyfront_r189", CubeListBuilder.create().texOffs(120, 44).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.2476F, -0.4595F, 0.9603F));

		PartDefinition Bodyfront_r190 = neck.addOrReplaceChild("Bodyfront_r190", CubeListBuilder.create().texOffs(120, 42).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.0382F, -0.5164F, 1.401F));

		PartDefinition Bodyfront_r191 = neck.addOrReplaceChild("Bodyfront_r191", CubeListBuilder.create().texOffs(129, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -3.6658F, 0.3774F, -0.3109F, 0.6187F));

		PartDefinition Bodyfront_r192 = neck.addOrReplaceChild("Bodyfront_r192", CubeListBuilder.create().texOffs(120, 40).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.0129F, -0.3787F, 1.412F));

		PartDefinition Bodyfront_r193 = neck.addOrReplaceChild("Bodyfront_r193", CubeListBuilder.create().texOffs(120, 38).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.1628F, -0.3437F, 0.9935F));

		PartDefinition Bodyfront_r194 = neck.addOrReplaceChild("Bodyfront_r194", CubeListBuilder.create().texOffs(129, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1759F, -1.6658F, 0.2607F, -0.2281F, 0.6498F));

		PartDefinition Bodyfront_r195 = neck.addOrReplaceChild("Bodyfront_r195", CubeListBuilder.create().texOffs(120, 46).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -5.6658F, 0.3177F, 0.5443F, -0.9265F));

		PartDefinition Bodyfront_r196 = neck.addOrReplaceChild("Bodyfront_r196", CubeListBuilder.create().texOffs(25, 129).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -5.6658F, 0.4689F, 0.3704F, -0.5881F));

		PartDefinition Bodyfront_r197 = neck.addOrReplaceChild("Bodyfront_r197", CubeListBuilder.create().texOffs(120, 44).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.2476F, 0.4595F, -0.9603F));

		PartDefinition Bodyfront_r198 = neck.addOrReplaceChild("Bodyfront_r198", CubeListBuilder.create().texOffs(120, 42).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.0382F, 0.5164F, -1.401F));

		PartDefinition Bodyfront_r199 = neck.addOrReplaceChild("Bodyfront_r199", CubeListBuilder.create().texOffs(129, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -3.6658F, 0.3774F, 0.3109F, -0.6187F));

		PartDefinition Bodyfront_r200 = neck.addOrReplaceChild("Bodyfront_r200", CubeListBuilder.create().texOffs(120, 40).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.0129F, 0.3787F, -1.412F));

		PartDefinition Bodyfront_r201 = neck.addOrReplaceChild("Bodyfront_r201", CubeListBuilder.create().texOffs(120, 38).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.1628F, 0.3437F, -0.9935F));

		PartDefinition Bodyfront_r202 = neck.addOrReplaceChild("Bodyfront_r202", CubeListBuilder.create().texOffs(129, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1759F, -1.6658F, 0.2607F, 0.2281F, -0.6498F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(49, 32).mirror().addBox(0.0F, -2.9F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.2267F, -1.3142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.05F, -1.2587F, -7.4801F, 0.0708F, -0.4354F, -0.0299F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(89, 125).mirror().addBox(0.449F, -0.0065F, -0.9608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.6913F, -18.0442F, 1.7061F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 123).mirror().addBox(0.449F, -0.033F, -1.0048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.3196F, -17.9885F, 1.5141F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(81, 123).mirror().addBox(0.4486F, -0.0041F, -0.9528F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.1446F, -17.5885F, 1.1039F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(123, 52).mirror().addBox(0.449F, -0.1866F, 0.016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.9752F, -17.4974F, 0.7898F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(3, 85).mirror().addBox(0.449F, -0.012F, -4.2342F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -3.8312F, -13.211F, 0.5018F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(0.449F, -0.187F, -0.0117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -1.6144F, -16.4637F, 0.6327F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(90, 5).mirror().addBox(-0.0014F, -0.0033F, -2.9475F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.0143F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -4.7656F, -11.696F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(3, 102).mirror().addBox(-0.0014F, -0.0033F, -1.9725F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -5.2155F, -9.7473F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 71).mirror().addBox(-0.5F, -0.0846F, -1.4992F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.05F, 0.0982F, -14.765F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(42, 102).mirror().addBox(-1.049F, -1.0F, -2.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.099F, 2.0059F, -11.8939F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-1.0F, -0.9898F, -0.0014F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 1.7698F, -8.9667F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(-1.599F, -1.0F, -2.95F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.149F, 1.7926F, -8.9944F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(66, 97).mirror().addBox(-0.001F, -0.0299F, -2.0129F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -5.2704F, -7.749F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-2.15F, -0.55F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.4297F, -0.0727F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-1.59F, -0.1F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.86F, -1.6717F, 0.1673F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(66, 44).mirror().addBox(-0.6F, -0.1F, -0.9F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.85F, -1.6717F, 0.1673F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(124, 101).mirror().addBox(0.9F, -0.1894F, -0.1397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.35F, -3.6114F, -1.6035F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.6F, 0.0293F, 0.0457F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.85F, -3.6114F, -1.6035F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-0.95F, -4.0007F, -3.5993F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9507F, -3.9532F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-0.5F, 0.8543F, -4.5543F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -2.5899F, -0.3657F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(30, 52).mirror().addBox(-2.0F, -0.0462F, -3.0238F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -3.5184F, -1.5835F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(77, 56).mirror().addBox(-2.0F, -0.0047F, 0.5201F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(77, 6).mirror().addBox(-2.0F, -0.0047F, -0.0299F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -5.198F, -5.7446F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(99, 126).addBox(-1.0F, -0.0047F, -0.0299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -5.2853F, -7.7427F, -0.0167F, -0.0403F, -1.1778F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(99, 126).mirror().addBox(0.0F, -0.0047F, -0.0299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -5.2853F, -7.7427F, -0.0167F, 0.0403F, 1.1778F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-1.5F, -0.0047F, 0.9701F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 97).mirror().addBox(0.0F, -0.0047F, -0.0299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -5.2853F, -7.7427F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.4307F, 0.6018F, -16.7897F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(27, 111).mirror().addBox(-0.425F, -2.1952F, -0.4324F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0534F, -2.9351F, 12.4186F, -0.6254F, -0.1956F, -0.0961F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(109, 103).mirror().addBox(-1.5F, 0.15F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0778F, -4.4857F, 15.0776F, -0.1992F, 0.0689F, 0.0116F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-0.6022F, -2.2211F, -0.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.5698F, 11.2936F, -0.572F, -0.024F, 0.2694F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(110, 75).mirror().addBox(-0.001F, -0.0299F, -2.0129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -5.8721F, 9.0406F, 0.0139F, -0.032F, 1.1604F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 110).mirror().addBox(-0.0014F, -0.0033F, -1.9725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -5.8173F, 7.0424F, 0.0973F, -0.2053F, 1.1244F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 101).mirror().addBox(-0.1764F, -0.2033F, -2.7476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -5.4424F, 5.0937F, 0.2487F, -0.4856F, 1.0726F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-0.1764F, 0.1717F, -4.6975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0193F, -5.4424F, 5.0937F, 0.0916F, -0.4856F, 1.0726F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 113).mirror().addBox(-0.4511F, -2.685F, 0.1462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.681F, -3.4883F, 11.0709F, -0.7136F, -0.2801F, -0.0688F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(0.8744F, -1.1166F, -1.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6313F, -3.3198F, 11.1686F, 0.5307F, 0.2713F, -0.8241F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(18, 66).mirror().addBox(-0.5F, -0.025F, -5.025F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8376F, -5.841F, 11.0892F, 0.2221F, -0.2636F, -0.1078F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(111, 79).mirror().addBox(-0.7611F, -0.0073F, -1.0031F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8293F, -5.7516F, 12.0668F, -0.0996F, -0.2869F, -0.0979F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 111).mirror().addBox(-1.2465F, -0.0996F, -0.8806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5293F, -5.4016F, 12.9668F, -0.3417F, -0.2658F, -0.1127F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(59, 127).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6162F, -5.038F, 10.4487F, 1.926F, -0.2575F, -0.0081F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(54, 127).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4738F, -4.1925F, 9.9342F, 1.0098F, -0.2575F, -0.0081F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(127, 44).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4561F, -3.1933F, 9.898F, -0.0374F, -0.2575F, -0.0081F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(127, 110).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6234F, -2.4588F, 10.5557F, -0.8228F, -0.2575F, -0.0081F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(127, 107).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.878F, -2.4629F, 11.5227F, -1.5646F, -0.2575F, -0.0081F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(127, 41).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1018F, -2.9665F, 12.3572F, -2.6118F, -0.2575F, -0.0081F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(127, 104).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2054F, -3.8919F, 12.7217F, 2.7551F, -0.2575F, -0.0081F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(81, 127).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1458F, -4.8567F, 12.4657F, 1.8388F, -0.2575F, -0.0081F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(127, 113).mirror().addBox(-0.5835F, -0.5739F, 0.8707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 74).mirror().addBox(-0.5835F, -0.2739F, 0.8707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.681F, -3.4883F, 11.0709F, 1.1232F, -0.2575F, -0.0081F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(124, 98).mirror().addBox(-0.3607F, -0.9094F, -0.2578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
				.texOffs(55, 124).mirror().addBox(-0.6832F, -0.8794F, -0.2878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.681F, -3.4883F, 11.0709F, 0.0433F, -0.25F, 0.0298F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(122, 73).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4018F, 1.6052F, 2.4927F, -0.1925F, -0.1718F, 0.1027F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(71, 122).mirror().addBox(-0.5F, -1.75F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6027F, 2.2544F, 3.0612F, 0.1129F, -0.1718F, 0.1027F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(50, 122).mirror().addBox(-0.5F, -1.85F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8634F, 3.8388F, 3.6195F, 0.3398F, -0.1718F, 0.1027F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(115, 36).mirror().addBox(-0.5F, -0.45F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6725F, 1.4487F, 3.937F, 0.0256F, -0.1718F, 0.1027F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 122).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.894F, 2.0033F, 4.9341F, 0.026F, -0.1753F, 0.0966F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(37, 122).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0556F, 1.8741F, 5.9125F, 0.1133F, -0.1753F, 0.0966F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(32, 122).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2065F, 1.6593F, 6.8774F, 0.2005F, -0.1753F, 0.0966F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(27, 122).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3393F, 1.3195F, 7.8085F, 0.3314F, -0.1753F, 0.0966F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(121, 90).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4587F, 0.8995F, 8.7081F, 0.4187F, -0.1753F, 0.0966F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(120, 59).mirror().addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5487F, 0.3291F, 9.5245F, 0.5932F, -0.1753F, 0.0966F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(122, 116).mirror().addBox(-0.4906F, -1.2527F, 1.3052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 1.5808F, -0.8905F, 0.3325F, -0.2603F, 0.0301F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(114, 26).mirror().addBox(0.0397F, -0.9484F, -0.0369F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 1.5808F, -0.9905F, 0.4933F, -0.2157F, -0.0966F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(-0.4906F, -0.7138F, 0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 1.5808F, -0.8905F, 0.4197F, -0.2603F, 0.0301F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(127, 71).mirror().addBox(-0.4902F, -0.2971F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.2531F, -1.0159F, -0.0113F, 1.6082F, -0.1229F, 0.1146F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(127, 38).mirror().addBox(-0.4902F, -0.639F, -0.6926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.2531F, -1.0159F, -0.0113F, 0.753F, -0.1229F, 0.1146F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(127, 68).mirror().addBox(-0.4902F, -0.285F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2531F, -1.0159F, -0.0113F, -0.0847F, -0.1229F, 0.1146F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(-0.5F, -0.825F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2756F, 1.2555F, 2.2734F, -1.0638F, -0.1348F, 0.1274F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(73, 109).mirror().addBox(-0.7352F, -0.0235F, -0.9524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0132F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.4529F, 10.1927F, -0.5787F, -0.1053F, 0.0074F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(22, 120).mirror().addBox(-0.7665F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6471F, 0.4529F, 10.1927F, -0.3954F, -0.1053F, 0.0074F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(104, 88).mirror().addBox(-0.4491F, -2.6259F, -1.7991F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0722F, -0.8113F, 12.1748F, 0.2326F, -0.1859F, 0.1211F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(114, 10).mirror().addBox(-0.4386F, -0.0016F, -0.0437F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 1.2808F, -0.8905F, 1.9455F, -0.2119F, 0.0365F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(127, 35).mirror().addBox(-0.4328F, -0.0221F, 0.4176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(123, 94).mirror().addBox(-0.4328F, -0.0221F, 0.0176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5641F, -0.6368F, -1.1664F, 1.1141F, -0.1852F, 0.0926F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(13, 120).mirror().addBox(-0.4328F, -0.4221F, 0.9176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4347F, 1.2808F, -0.8905F, 1.5091F, -0.2119F, 0.0365F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(104, 82).mirror().addBox(-0.4491F, 0.1241F, -1.7491F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.4464F, -2.9612F, 0.8087F, 0.5511F, -0.1859F, 0.1211F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(32, 41).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4837F, -5.3456F, 6.5668F, 0.0385F, -0.1931F, 0.0847F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(0.1259F, -0.5984F, -4.2741F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9355F, -4.1734F, 5.1004F, 0.3876F, -0.1931F, 0.0847F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(94, 104).mirror().addBox(-0.2603F, -2.8406F, -3.0445F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3849F, 1.4627F, 6.9506F, -0.0468F, -0.1772F, 0.1131F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(80, 104).mirror().addBox(-0.2612F, -3.0588F, -2.1313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8826F, 1.6302F, 4.0575F, -0.2039F, -0.1772F, 0.1131F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(27, 117).mirror().addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.4735F, 0.9393F, 8.8013F, 0.3481F, -0.1802F, 0.1265F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(66, 104).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3372F, 1.2335F, 7.8553F, 0.2782F, -0.1802F, 0.1265F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 118).mirror().addBox(-0.3063F, -2.959F, -1.0641F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3849F, 1.4627F, 6.9506F, 0.0695F, -0.1886F, 0.1136F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-1.0793F, -0.1873F, -0.9122F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6008F, -0.2883F, 15.0141F, -0.4584F, 0.1167F, 0.0085F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(90, 110).mirror().addBox(-0.45F, -1.74F, -0.68F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1059F, -2.736F, 15.7532F, 0.6511F, 0.1135F, 0.0287F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(108, 5).mirror().addBox(-1.0793F, -1.8591F, -0.8188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6008F, -0.2883F, 15.0141F, -0.7202F, 0.1167F, 0.0085F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-1.2181F, -1.1399F, -2.8482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6008F, -0.2883F, 15.0141F, -0.0638F, -0.0836F, 0.0777F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(3, 108).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0648F, -1.2187F, 13.1249F, -0.9963F, -0.1563F, 0.1618F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(101, 54).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1717F, -0.6066F, 13.1694F, -0.2522F, -0.0761F, 0.1409F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-0.0073F, -3.067F, -0.0349F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1501F, 0.5602F, 9.6299F, 0.5395F, -0.1739F, 0.1446F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(0.0F, 0.0F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3633F, -5.8832F, 9.1025F, -0.0581F, 0.1901F, 1.4373F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(103, 64).mirror().addBox(-1.0F, -0.375F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4768F, -0.1674F, 16.7648F, -1.6888F, 0.0364F, -1.5738F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 94).mirror().addBox(-1.1599F, -2.0179F, 1.2073F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6008F, -0.2883F, 15.0141F, -1.4073F, 0.035F, -0.1941F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(127, 65).mirror().addBox(-1.1591F, -1.2484F, 1.4074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6008F, -0.2883F, 15.0141F, -1.0583F, 0.035F, -0.1941F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5307F, 0.6018F, -16.7897F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(27, 111).addBox(-0.575F, -2.1952F, -0.4324F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0534F, -2.9351F, 12.4186F, -0.6254F, 0.1956F, 0.0961F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(109, 103).addBox(0.5F, 0.15F, -2.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0778F, -4.4857F, 15.0776F, -0.1992F, -0.0689F, -0.0116F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 17).addBox(-1.3978F, -2.2211F, -0.1258F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.5698F, 11.2936F, -0.572F, 0.024F, -0.2694F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(110, 75).addBox(-0.999F, -0.0299F, -2.0129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0193F, -5.8721F, 9.0406F, 0.0139F, 0.032F, -1.1604F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(80, 110).addBox(-0.9986F, -0.0033F, -1.9725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0193F, -5.8173F, 7.0424F, 0.0973F, 0.2053F, -1.1244F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(27, 101).addBox(-0.8236F, -0.2033F, -2.7476F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0193F, -5.4424F, 5.0937F, 0.2487F, 0.4856F, -1.0726F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(75, 65).addBox(-0.8236F, 0.1717F, -4.6975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0193F, -5.4424F, 5.0937F, 0.0916F, 0.4856F, -1.0726F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 113).addBox(-0.5489F, -2.685F, 0.1462F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.681F, -3.4883F, 11.0709F, -0.7136F, 0.2801F, 0.0688F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 109).addBox(-1.8744F, -1.1166F, -1.3602F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6313F, -3.3198F, 11.1686F, 0.5307F, -0.2713F, 0.8241F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(18, 66).addBox(-0.5F, -0.025F, -5.025F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8376F, -5.841F, 11.0892F, 0.2221F, 0.2636F, 0.1078F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(111, 79).addBox(-0.2389F, -0.0073F, -1.0031F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8293F, -5.7516F, 12.0668F, -0.0996F, 0.2869F, 0.0979F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(42, 111).addBox(0.2465F, -0.0996F, -0.8806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5293F, -5.4016F, 12.9668F, -0.3417F, 0.2658F, 0.1127F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(59, 127).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6162F, -5.038F, 10.4487F, 1.926F, 0.2575F, 0.0081F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(54, 127).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4738F, -4.1925F, 9.9342F, 1.0098F, 0.2575F, 0.0081F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(127, 44).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4561F, -3.1933F, 9.898F, -0.0374F, 0.2575F, 0.0081F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(127, 110).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6234F, -2.4588F, 10.5557F, -0.8228F, 0.2575F, 0.0081F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(127, 107).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.878F, -2.4629F, 11.5227F, -1.5646F, 0.2575F, 0.0081F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(127, 41).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1018F, -2.9665F, 12.3572F, -2.6118F, 0.2575F, 0.0081F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(127, 104).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2054F, -3.8919F, 12.7217F, 2.7551F, 0.2575F, 0.0081F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(81, 127).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1458F, -4.8567F, 12.4657F, 1.8388F, 0.2575F, 0.0081F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(127, 113).addBox(-0.4165F, -0.5739F, 0.8707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 74).addBox(-0.4165F, -0.2739F, 0.8707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.681F, -3.4883F, 11.0709F, 1.1232F, 0.2575F, 0.0081F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(124, 98).addBox(-0.6393F, -0.9094F, -0.2578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(55, 124).addBox(-0.3168F, -0.8794F, -0.2878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.681F, -3.4883F, 11.0709F, 0.0433F, 0.25F, -0.0298F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(122, 73).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4018F, 1.6052F, 2.4927F, -0.1925F, 0.1718F, -0.1027F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(71, 122).addBox(-0.5F, -1.75F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6027F, 2.2544F, 3.0612F, 0.1129F, 0.1718F, -0.1027F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(50, 122).addBox(-0.5F, -1.85F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8634F, 3.8388F, 3.6195F, 0.3398F, 0.1718F, -0.1027F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(115, 36).addBox(-0.5F, -0.45F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.6725F, 1.4487F, 3.937F, 0.0256F, 0.1718F, -0.1027F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(45, 122).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.894F, 2.0033F, 4.9341F, 0.026F, 0.1753F, -0.0966F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(37, 122).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0556F, 1.8741F, 5.9125F, 0.1133F, 0.1753F, -0.0966F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(32, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2065F, 1.6593F, 6.8774F, 0.2005F, 0.1753F, -0.0966F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(27, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3393F, 1.3195F, 7.8085F, 0.3314F, 0.1753F, -0.0966F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(121, 90).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4587F, 0.8995F, 8.7081F, 0.4187F, 0.1753F, -0.0966F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(120, 59).addBox(-0.5F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5487F, 0.3291F, 9.5245F, 0.5932F, 0.1753F, -0.0966F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(122, 116).addBox(-0.5094F, -1.2527F, 1.3052F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4347F, 1.5808F, -0.8905F, 0.3325F, 0.2603F, -0.0301F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(114, 26).addBox(-1.0396F, -0.9484F, -0.0369F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4347F, 1.5808F, -0.9905F, 0.4933F, 0.2157F, 0.0966F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(120, 48).addBox(-0.5094F, -0.7138F, 0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4347F, 1.5808F, -0.8905F, 0.4197F, 0.2603F, -0.0301F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(127, 71).addBox(-0.5098F, -0.2971F, -0.3571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.2531F, -1.0159F, -0.0113F, 1.6082F, 0.1229F, -0.1146F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(127, 38).addBox(-0.5098F, -0.639F, -0.6926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.2531F, -1.0159F, -0.0113F, 0.753F, 0.1229F, -0.1146F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(127, 68).addBox(-0.5098F, -0.285F, -0.3026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2531F, -1.0159F, -0.0113F, -0.0847F, 0.1229F, -0.1146F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(107, 50).addBox(-0.5F, -0.825F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2756F, 1.2555F, 2.2734F, -1.0638F, 0.1348F, -0.1274F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(73, 109).addBox(-0.2648F, -0.0235F, -0.9524F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0132F)), PartPose.offsetAndRotation(0.6471F, 0.4529F, 10.1927F, -0.5787F, 0.1053F, -0.0074F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(22, 120).addBox(-0.2335F, -0.092F, -0.109F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6471F, 0.4529F, 10.1927F, -0.3954F, 0.1053F, -0.0074F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(104, 88).addBox(-0.5509F, -2.6259F, -1.7991F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0722F, -0.8113F, 12.1748F, 0.2326F, 0.1859F, -0.1211F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(114, 10).addBox(-0.5614F, -0.0016F, -0.0437F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4347F, 1.2808F, -0.8905F, 1.9455F, 0.2119F, -0.0365F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(127, 35).addBox(-0.5671F, -0.0221F, 0.4176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(123, 94).addBox(-0.5671F, -0.0221F, 0.0176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5641F, -0.6368F, -1.1664F, 1.1141F, 0.1852F, -0.0926F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(13, 120).addBox(-0.5671F, -0.4221F, 0.9176F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4347F, 1.2808F, -0.8905F, 1.5091F, 0.2119F, -0.0365F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(104, 82).addBox(-0.5509F, 0.1241F, -1.7491F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4464F, -2.9612F, 0.8087F, 0.5511F, 0.1859F, -0.1211F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(32, 41).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4837F, -5.3456F, 6.5668F, 0.0385F, 0.1931F, -0.0847F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(15, 51).addBox(-1.1259F, -0.5984F, -4.2741F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9355F, -4.1734F, 5.1004F, 0.3876F, 0.1931F, -0.0847F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(94, 104).addBox(-0.7397F, -2.8406F, -3.0445F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.3849F, 1.4627F, 6.9506F, -0.0468F, 0.1772F, -0.1131F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(80, 104).addBox(-0.7388F, -3.0588F, -2.1313F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8826F, 1.6302F, 4.0575F, -0.2039F, 0.1772F, -0.1131F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(27, 117).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.4735F, 0.9393F, 8.8013F, 0.3481F, 0.1802F, -0.1265F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 104).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 1.2335F, 7.8553F, 0.2782F, 0.1802F, -0.1265F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(0, 118).addBox(-0.6937F, -2.959F, -1.0641F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3849F, 1.4627F, 6.9506F, 0.0695F, 0.1886F, -0.1136F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(95, 22).addBox(0.0793F, -0.1873F, -0.9122F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6008F, -0.2883F, 15.0141F, -0.4584F, -0.1167F, -0.0085F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(90, 110).addBox(-0.55F, -1.74F, -0.68F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1059F, -2.736F, 15.7532F, 0.6511F, -0.1135F, -0.0287F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(108, 5).addBox(0.0793F, -1.8591F, -0.8188F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6008F, -0.2883F, 15.0141F, -0.7202F, -0.1167F, -0.0085F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(101, 59).addBox(0.2181F, -1.1399F, -2.8482F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6008F, -0.2883F, 15.0141F, -0.0638F, 0.0836F, -0.0777F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(3, 108).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0648F, -1.2187F, 13.1249F, -0.9963F, 0.1563F, -0.1618F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(101, 54).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1717F, -0.6066F, 13.1694F, -0.2522F, 0.0761F, -0.1409F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(13, 94).addBox(-0.9927F, -3.067F, -0.0349F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1501F, 0.5602F, 9.6299F, 0.5395F, 0.1739F, -0.1446F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(95, 0).addBox(-1.0F, 0.0F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3633F, -5.8832F, 9.1025F, -0.0581F, -0.1901F, -1.4373F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(103, 64).addBox(-1.0F, -0.375F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4768F, -0.1674F, 16.7648F, -1.6888F, -0.0364F, 1.5738F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(104, 94).addBox(-1.8401F, -2.0179F, 1.2073F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.6008F, -0.2883F, 15.0141F, -1.4073F, -0.035F, 0.1941F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(127, 65).addBox(0.1591F, -1.2484F, 1.4074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6008F, -0.2883F, 15.0141F, -1.0583F, -0.035F, 0.1941F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1597F, 0.0393F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r282 = lower_jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(115, 41).addBox(-0.5F, -1.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6197F, 8.7688F, -13.1464F, -2.2582F, 0.0981F, 0.0999F));

		PartDefinition cube_r283 = lower_jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(118, 94).addBox(-0.5F, -0.4F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 118).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9906F, 8.1801F, -10.7797F, -2.4763F, 0.1303F, 0.0433F));

		PartDefinition cube_r284 = lower_jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(76, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1263F, 7.648F, -9.9204F, -2.389F, 0.1303F, 0.0433F));

		PartDefinition cube_r285 = lower_jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(123, 0).addBox(-0.5F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2448F, 6.9026F, -9.2639F, -2.3192F, 0.1303F, 0.0433F));

		PartDefinition cube_r286 = lower_jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(125, 56).addBox(-0.5F, -0.4F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(125, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4678F, 5.2911F, -8.0963F, -2.2494F, 0.1303F, 0.0433F));

		PartDefinition cube_r287 = lower_jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(109, 126).addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 126).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(126, 25).addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6844F, 3.6386F, -6.9908F, -2.1621F, 0.1303F, 0.0433F));

		PartDefinition cube_r288 = lower_jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(22, 124).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 124).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5967F, 10.9327F, -11.0925F, 0.3836F, 0.1764F, 0.1086F));

		PartDefinition cube_r289 = lower_jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 43).addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.2664F, 3.5122F, -0.5046F, 0.6894F, 0.0349F, 0.0F));

		PartDefinition cube_r290 = lower_jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(104, 22).addBox(-0.5F, -0.925F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.8524F, 2.4773F, -5.115F, -1.8548F, 0.0947F, 0.0995F));

		PartDefinition cube_r291 = lower_jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(118, 122).addBox(0.1251F, 3.5025F, 0.5117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0111F, 8.4854F, -6.6803F, -1.538F, 0.1769F, 0.0978F));

		PartDefinition cube_r292 = lower_jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(124, 15).addBox(0.1297F, 3.3533F, -4.5921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0111F, 8.4854F, -6.6803F, -0.62F, 0.1764F, 0.1086F));

		PartDefinition cube_r293 = lower_jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(127, 116).addBox(0.1297F, 2.554F, -5.478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0111F, 8.4854F, -6.6803F, -0.2273F, 0.1764F, 0.1086F));

		PartDefinition cube_r294 = lower_jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(127, 126).addBox(0.1297F, 1.7046F, -5.1296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0111F, 8.4854F, -6.6803F, -0.0527F, 0.1764F, 0.1086F));

		PartDefinition cube_r295 = lower_jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(83, 78).addBox(-0.0576F, 0.0193F, -0.028F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0111F, 7.7854F, -6.6803F, -2.4314F, 0.1197F, 0.0675F));

		PartDefinition cube_r296 = lower_jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(118, 53).addBox(0.2597F, -0.6333F, 1.7217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0111F, 5.5854F, -5.2803F, -2.379F, 0.1185F, 0.0696F));

		PartDefinition cube_r297 = lower_jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(51, 105).addBox(0.2597F, -0.5656F, -0.1658F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0111F, 5.5854F, -5.2803F, -2.3528F, 0.1185F, 0.0696F));

		PartDefinition cube_r298 = lower_jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(94, 37).addBox(-0.4347F, -1.6159F, -6.9383F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1205F, 6.6835F, -9.4696F, -2.6502F, 0.126F, 0.0546F));

		PartDefinition cube_r299 = lower_jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(111, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8573F, 8.9881F, -10.8205F, -2.9325F, 0.1764F, 0.1086F));

		PartDefinition cube_r300 = lower_jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(3, 56).addBox(-0.5F, -0.4F, -2.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.217F, 7.41F, -8.8885F, -2.2482F, 0.1197F, 0.0675F));

		PartDefinition cube_r301 = lower_jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(126, 120).addBox(0.2597F, 1.3351F, 0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0111F, 5.5854F, -5.2803F, -2.1783F, 0.1185F, 0.0696F));

		PartDefinition cube_r302 = lower_jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(27, 126).addBox(-0.2304F, 4.3462F, 4.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0111F, 8.4854F, -6.6803F, -2.1711F, 0.1102F, 0.0863F));

		PartDefinition cube_r303 = lower_jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(114, 31).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6197F, 8.7688F, -13.1464F, -2.4328F, 0.0981F, 0.0999F));

		PartDefinition cube_r304 = lower_jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(94, 77).addBox(-0.5104F, -1.5288F, -1.9164F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.691F, 4.1727F, -6.6847F, -2.1272F, 0.1303F, 0.0433F));

		PartDefinition cube_r305 = lower_jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(57, 94).addBox(-1.094F, 0.0427F, -0.0486F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7338F, 0.3049F, -4.436F, -0.8949F, 0.0947F, 0.0995F));

		PartDefinition cube_r306 = lower_jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(57, 86).addBox(-1.0907F, -0.0008F, 0.0323F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8551F, -0.0303F, -0.5266F, -1.5097F, 0.0349F, 0.0F));

		PartDefinition cube_r307 = lower_jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(104, 0).addBox(-0.5491F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(2.3071F, 2.921F, -0.7451F, 1.1694F, 0.0349F, 0.0F));

		PartDefinition cube_r308 = lower_jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(13, 108).addBox(-1.0F, -1.825F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4979F, 5.4365F, -3.9226F, 0.2448F, 0.0698F, 0.0363F));

		PartDefinition cube_r309 = lower_jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(126, 11).addBox(-1.09F, -1.0636F, -1.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.89F, 0.9784F, 0.4741F, 0.7854F, 0.0349F, 0.0F));

		PartDefinition cube_r310 = lower_jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(120, 63).addBox(-0.5507F, -2.5007F, -0.0218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3621F, 1.7635F, 0.729F, 1.5882F, 0.0349F, 0.0F));

		PartDefinition cube_r311 = lower_jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(127, 4).addBox(-1.0893F, -1.0393F, -0.8307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.89F, 0.9784F, 0.4741F, 0.3057F, 0.0286F, 0.02F));

		PartDefinition cube_r312 = lower_jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(126, 8).addBox(-1.0893F, -0.6393F, -1.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.89F, 0.9784F, 0.4741F, -0.3054F, 0.0349F, 0.0F));

		PartDefinition cube_r313 = lower_jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(104, 22).mirror().addBox(-0.5F, -0.925F, -0.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7524F, 2.4773F, -5.115F, -1.8548F, -0.0947F, -0.0995F));

		PartDefinition cube_r314 = lower_jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(118, 122).mirror().addBox(-1.1251F, 3.5025F, 0.5117F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 8.4854F, -6.6803F, -1.538F, -0.1769F, -0.0978F));

		PartDefinition cube_r315 = lower_jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(124, 15).mirror().addBox(-1.1297F, 3.3533F, -4.5921F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 8.4854F, -6.6803F, -0.62F, -0.1764F, -0.1086F));

		PartDefinition cube_r316 = lower_jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(127, 116).mirror().addBox(-1.1297F, 2.554F, -5.478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 8.4854F, -6.6803F, -0.2273F, -0.1764F, -0.1086F));

		PartDefinition cube_r317 = lower_jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(127, 126).mirror().addBox(-1.1297F, 1.7046F, -5.1296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 8.4854F, -6.6803F, -0.0527F, -0.1764F, -0.1086F));

		PartDefinition cube_r318 = lower_jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(22, 124).mirror().addBox(-0.5F, -2.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 124).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4967F, 10.9327F, -11.0925F, 0.3836F, -0.1764F, -0.1086F));

		PartDefinition cube_r319 = lower_jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-0.9424F, 0.0193F, -0.028F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 7.7854F, -6.6803F, -2.4314F, -0.1197F, -0.0675F));

		PartDefinition cube_r320 = lower_jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(118, 53).mirror().addBox(-1.2597F, -0.6333F, 1.7217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 5.5854F, -5.2803F, -2.379F, -0.1185F, -0.0696F));

		PartDefinition cube_r321 = lower_jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(51, 105).mirror().addBox(-1.2597F, -0.5656F, -0.1658F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 5.5854F, -5.2803F, -2.3528F, -0.1185F, -0.0696F));

		PartDefinition cube_r322 = lower_jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(94, 37).mirror().addBox(-0.5653F, -1.6159F, -6.9383F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0205F, 6.6835F, -9.4696F, -2.6502F, -0.126F, -0.0546F));

		PartDefinition cube_r323 = lower_jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.7573F, 8.9881F, -10.8205F, -2.9325F, -0.1764F, -0.1086F));

		PartDefinition cube_r324 = lower_jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(3, 56).mirror().addBox(-0.5F, -0.4F, -2.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.117F, 7.41F, -8.8885F, -2.2482F, -0.1197F, -0.0675F));

		PartDefinition cube_r325 = lower_jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(126, 120).mirror().addBox(-1.2597F, 1.3351F, 0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 5.5854F, -5.2803F, -2.1783F, -0.1185F, -0.0696F));

		PartDefinition cube_r326 = lower_jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(27, 126).mirror().addBox(-0.7696F, 4.3462F, 4.4402F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9111F, 8.4854F, -6.6803F, -2.1711F, -0.1102F, -0.0863F));

		PartDefinition cube_r327 = lower_jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(115, 41).mirror().addBox(-0.5F, -1.5F, -0.725F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, 8.7688F, -13.1464F, -2.2582F, -0.0981F, -0.0999F));

		PartDefinition cube_r328 = lower_jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(114, 31).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.5197F, 8.7688F, -13.1464F, -2.4328F, -0.0981F, -0.0999F));

		PartDefinition cube_r329 = lower_jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(118, 94).mirror().addBox(-0.5F, -0.4F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(72, 118).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8906F, 8.1801F, -10.7797F, -2.4763F, -0.1303F, -0.0433F));

		PartDefinition cube_r330 = lower_jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(76, 122).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0263F, 7.648F, -9.9204F, -2.389F, -0.1303F, -0.0433F));

		PartDefinition cube_r331 = lower_jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(123, 0).mirror().addBox(-0.5F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1448F, 6.9026F, -9.2639F, -2.3192F, -0.1303F, -0.0433F));

		PartDefinition cube_r332 = lower_jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(125, 56).mirror().addBox(-0.5F, -0.4F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(125, 48).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3678F, 5.2911F, -8.0963F, -2.2494F, -0.1303F, -0.0433F));

		PartDefinition cube_r333 = lower_jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(109, 126).mirror().addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 126).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(126, 25).mirror().addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5844F, 3.6386F, -6.9908F, -2.1621F, -0.1303F, -0.0433F));

		PartDefinition cube_r334 = lower_jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(94, 77).mirror().addBox(-0.4896F, -1.5288F, -1.9164F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.591F, 4.1727F, -6.6847F, -2.1272F, -0.1303F, -0.0433F));

		PartDefinition cube_r335 = lower_jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(57, 94).mirror().addBox(0.094F, 0.0427F, -0.0486F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6338F, 0.3049F, -4.436F, -0.8949F, -0.0947F, -0.0995F));

		PartDefinition cube_r336 = lower_jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(0.0907F, -0.0008F, 0.0323F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7551F, -0.0303F, -0.5266F, -1.5097F, -0.0349F, 0.0F));

		PartDefinition cube_r337 = lower_jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-0.5F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1664F, 3.5122F, -0.5046F, 0.6894F, -0.0349F, 0.0F));

		PartDefinition cube_r338 = lower_jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(104, 0).mirror().addBox(-0.4509F, -1.5491F, -0.4509F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-2.2071F, 2.921F, -0.7451F, 1.1694F, -0.0349F, 0.0F));

		PartDefinition cube_r339 = lower_jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(13, 108).mirror().addBox(0.0F, -1.825F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3979F, 5.4365F, -3.9226F, 0.2448F, -0.0698F, -0.0363F));

		PartDefinition cube_r340 = lower_jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(126, 11).mirror().addBox(0.09F, -1.0636F, -1.5936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.79F, 0.9784F, 0.4741F, 0.7854F, -0.0349F, 0.0F));

		PartDefinition cube_r341 = lower_jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(120, 63).mirror().addBox(-0.4493F, -2.5007F, -0.0218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2621F, 1.7635F, 0.729F, 1.5882F, -0.0349F, 0.0F));

		PartDefinition cube_r342 = lower_jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(127, 4).mirror().addBox(0.0893F, -1.0393F, -0.8307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.79F, 0.9784F, 0.4741F, 0.3057F, -0.0286F, -0.02F));

		PartDefinition cube_r343 = lower_jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(126, 8).mirror().addBox(0.0893F, -0.6393F, -1.2307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.79F, 0.9784F, 0.4741F, -0.3054F, -0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 134, 134);
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