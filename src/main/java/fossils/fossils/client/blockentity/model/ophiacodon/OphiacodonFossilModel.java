package fossils.fossils.client.blockentity.model.ophiacodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OphiacodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart ophiacodon;
	private final ModelPart hips;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
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
	private final ModelPart tail9;
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
	private final ModelPart head;
	private final ModelPart lower_jaw;
	private final ModelPart bone3;

	public OphiacodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.ophiacodon = this.fossil.getChild("ophiacodon");
		this.hips = this.ophiacodon.getChild("hips");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
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
		this.tail9 = this.tail8.getChild("tail9");
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
		this.head = this.neck.getChild("head");
		this.lower_jaw = this.head.getChild("lower_jaw");
		this.bone3 = this.lower_jaw.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ophiacodon = fossil.addOrReplaceChild("ophiacodon", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.0F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = ophiacodon.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3775F, 18.3413F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 96).addBox(0.0F, -3.6963F, 0.0626F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7266F, 2.8245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(85, 97).addBox(0.0F, -3.9051F, 0.0273F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, 0.9245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(95, 74).addBox(0.0F, -4.0139F, -0.0081F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, -0.9755F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(85, 90).addBox(0.0F, -4.2227F, -0.0434F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -2.8755F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 30).mirror().addBox(-2.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 30).addBox(0.4F, -0.5904F, -0.109F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(19, 30).addBox(-0.5F, -1.0904F, -0.109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(14, 85).addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.065F, 1.9482F, -3.1222F, -0.464F, 0.0857F, 1.4488F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(100, 89).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 84).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(88, 102).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1787F, 4.4552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(98, 68).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 4.5264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(95, 80).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(80, 95).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(57, 98).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.548F, 6.235F, -0.549F, 1.2783F, 1.1381F, -0.0873F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(93, 93).addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(95, 54).addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(88, 93).addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(72, 90).addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(52, 93).addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(80, 90).addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(42, 87).addBox(-0.5961F, -0.9602F, -1.5071F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(39, 62).addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6002F, 7.6337F, -0.3354F, 2.6833F, -0.592F, -2.843F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(23, 16).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(86, 17).addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.065F, 1.9482F, -3.1222F, 0.3212F, 0.08F, -1.3937F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(62, 101).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 96).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(93, 102).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 4.4552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(98, 76).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 4.5264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(95, 88).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(98, 72).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.548F, 6.235F, -0.549F, 1.3409F, -1.0116F, 0.0163F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(95, 35).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(95, 59).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(95, 30).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 91).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(57, 93).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(27, 91).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(88, 22).addBox(-0.4039F, -0.9602F, -1.5071F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(52, 62).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6002F, 7.6337F, -0.3354F, 2.8514F, 0.722F, -3.0871F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -1.0904F, -1.6443F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(88, 73).addBox(-0.2F, 0.024F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, 0.0524F, 0.0F, -0.0524F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(28, 87).addBox(-1.036F, -0.82F, -1.7619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, 2.0944F, 0.0F, 0.1745F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(70, 86).addBox(-1.036F, -0.3035F, -3.6344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, 1.789F, 0.0F, 0.1745F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(87, 62).addBox(-0.2F, -0.776F, -1.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0563F, 1.0753F, -0.0245F, 0.829F, 0.0F, -0.0524F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(70, 32).addBox(-0.2F, 0.024F, -2.4202F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, 0.0F, -0.0524F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(82, 50).addBox(-0.8792F, -1.5271F, -1.6687F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, 0.8378F, 0.0F, -0.1571F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(79, 25).addBox(-1.0414F, 0.7195F, -0.6396F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, -0.2967F, 0.0F, -0.192F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(100, 60).addBox(-0.9024F, 1.4498F, 0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 86).addBox(-0.9024F, 3.0498F, 1.4504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, -1.7363F, -0.0113F, -0.1558F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(93, 13).addBox(-0.9024F, 0.7039F, 0.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, -1.3872F, -0.0113F, -0.1558F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(90, 68).addBox(-0.9024F, 0.9874F, -1.7805F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, -0.9509F, -0.0113F, -0.1558F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(33, 75).addBox(-1.036F, 0.6125F, -1.2992F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, -0.733F, 0.0F, 0.1745F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(64, 90).addBox(-1.0414F, 0.8149F, -3.4944F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 1.7715F, 0.0F, -0.192F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(19, 90).addBox(-0.8914F, -0.8293F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 1.2527F, 0.0385F, -0.0208F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(39, 58).addBox(-1.0414F, 2.8898F, -0.1171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 0.9861F, 0.0F, -0.192F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(35, 87).addBox(-1.0414F, 2.541F, -0.7919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 0.7505F, 0.0F, -0.192F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -1.0904F, -1.6443F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Hips_r16 = bone5.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-0.8F, 0.024F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, 0.0524F, 0.0F, 0.0524F));

		PartDefinition Hips_r17 = bone5.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(28, 87).mirror().addBox(0.036F, -0.82F, -1.7619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, 2.0944F, 0.0F, -0.1745F));

		PartDefinition Hips_r18 = bone5.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(0.036F, -0.3035F, -3.6344F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, 1.789F, 0.0F, -0.1745F));

		PartDefinition Hips_r19 = bone5.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-0.8F, -0.776F, -1.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0563F, 1.0753F, -0.0245F, 0.829F, 0.0F, 0.0524F));

		PartDefinition Hips_r20 = bone5.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-0.8F, 0.024F, -2.4202F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, 0.0F, 0.0524F));

		PartDefinition Hips_r21 = bone5.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-0.1208F, -1.5271F, -1.6687F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, 0.8378F, 0.0F, 0.1571F));

		PartDefinition Hips_r22 = bone5.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(0.0414F, 0.7195F, -0.6396F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, -0.2967F, 0.0F, 0.192F));

		PartDefinition Hips_r23 = bone5.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(100, 60).mirror().addBox(-0.0976F, 1.4498F, 0.3504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 86).mirror().addBox(-0.0976F, 3.0498F, 1.4504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, -1.7363F, 0.0113F, 0.1558F));

		PartDefinition Hips_r24 = bone5.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(93, 13).mirror().addBox(-0.0976F, 0.7039F, 0.2595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, -1.3872F, 0.0113F, 0.1558F));

		PartDefinition Hips_r25 = bone5.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(90, 68).mirror().addBox(-0.0976F, 0.9874F, -1.7805F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, -0.9509F, 0.0113F, 0.1558F));

		PartDefinition Hips_r26 = bone5.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(0.036F, 0.6125F, -1.2992F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, -0.733F, 0.0F, -0.1745F));

		PartDefinition Hips_r27 = bone5.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(64, 90).mirror().addBox(0.0414F, 0.8149F, -3.4944F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 1.7715F, 0.0F, 0.192F));

		PartDefinition Hips_r28 = bone5.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(19, 90).mirror().addBox(-0.1086F, -0.8293F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 1.2527F, -0.0385F, 0.0208F));

		PartDefinition Hips_r29 = bone5.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(39, 58).mirror().addBox(0.0414F, 2.8898F, -0.1171F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 0.9861F, 0.0F, 0.192F));

		PartDefinition Hips_r30 = bone5.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(0.0414F, 2.541F, -0.7919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 0.7505F, 0.0F, 0.192F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.1977F, 0.2998F, 0.0591F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(87, 105).addBox(0.0F, -1.7332F, -0.0313F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5844F, 7.6155F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 105).addBox(0.0F, -1.9782F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6844F, 5.8155F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(103, 16).addBox(0.0F, -2.4562F, 0.0405F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8844F, 3.9155F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(103, 11).addBox(0.0F, -2.8496F, -0.0807F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0844F, 2.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(105, 86).addBox(0.0F, 4.8631F, 7.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 101).addBox(0.0F, 3.3631F, 5.6217F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 100).addBox(0.0F, 2.5631F, 3.6217F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 101).addBox(0.0F, 1.8631F, 1.6217F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 21).addBox(0.0F, 1.0631F, -0.3783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 96).addBox(0.0F, -3.3369F, 0.0217F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8391F, 9.1501F, 0.0637F, 0.1306F, 0.0083F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(106, 11).addBox(0.0F, -1.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(44, 0).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(33, 71).addBox(0.0F, -1.353F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 6).addBox(0.0F, 6.6631F, 13.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 105).addBox(0.0F, 6.0631F, 11.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 54).addBox(0.0F, 5.5631F, 9.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6548F, -8.8346F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 105).addBox(0.0F, -1.5169F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-1.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(66, 38).addBox(0.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.0006F, 0.0436F, 0.0F));

		PartDefinition cube_r21 = tail3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(106, 20).addBox(-0.5F, -1.0257F, 3.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 17).addBox(-0.5F, -1.0257F, 1.9823F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 14).addBox(-0.5F, -1.0257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(84, 103).addBox(0.0F, 7.3631F, 15.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 13).addBox(0.0F, 7.5631F, 17.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5664F, -14.4357F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1456F, 0.3024F, -0.0437F));

		PartDefinition cube_r24 = tail4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 105).addBox(0.0F, -0.893F, 3.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(93, 105).addBox(0.0F, -0.893F, 1.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(29, 79).addBox(0.0F, -0.893F, -0.1134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(106, 23).addBox(0.0F, 0.4F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 106).addBox(0.0F, 0.2F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 104).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 55).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(57, 24).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0534F, 0.1743F, -0.0093F));

		PartDefinition cube_r27 = tail5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(70, 106).addBox(0.0F, 0.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 62).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, -4.793F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(57, 31).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0176F, 0.2181F, 0.0038F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 58).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, -0.0188F, -0.349F, 0.0064F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0188F, -0.349F, 0.0064F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(71, 52).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0195F, -0.4363F, 0.0083F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3823F, -3.1544F, -0.2126F, -0.1707F, 0.0366F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 90).addBox(0.0F, -4.4336F, 0.0403F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, -1.9819F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 86).addBox(0.0F, -4.421F, 0.0427F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1254F, -3.9819F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(53, 105).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -1.4788F, -0.0394F, 0.09F, -0.9824F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(48, 105).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -1.4788F, -0.0137F, 0.0563F, -0.634F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(43, 105).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -3.4788F, -0.0394F, 0.09F, -0.9998F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(105, 38).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -3.4788F, -0.0137F, 0.0563F, -0.6514F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(96, 52).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -5.4788F, -0.0394F, 0.09F, -1.0173F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(38, 105).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -5.4788F, -0.0137F, 0.0563F, -0.6689F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(105, 36).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4789F, -0.0859F, 0.0271F, -1.3764F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(96, 50).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4789F, -0.0691F, 0.0579F, -0.9846F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -7.4789F, -0.0525F, 0.0362F, -0.6358F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(48, 105).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -1.4788F, -0.0137F, -0.0563F, 0.634F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(53, 105).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -1.4788F, -0.0394F, -0.09F, 0.9824F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(105, 38).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -3.4788F, -0.0137F, -0.0563F, 0.6514F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(43, 105).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -3.4788F, -0.0394F, -0.09F, 0.9998F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(38, 105).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -5.4788F, -0.0137F, -0.0563F, 0.6689F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(96, 52).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -5.4788F, -0.0394F, -0.09F, 1.0173F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(105, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4789F, -0.0525F, -0.0362F, 0.6358F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(96, 50).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4789F, -0.0691F, -0.0579F, 0.9846F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(105, 36).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -7.4789F, -0.0859F, -0.0271F, 1.3764F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(10, 91).addBox(0.0F, -4.4039F, -0.0547F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2254F, -5.8819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 90).addBox(0.0F, -4.0957F, 0.052F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4254F, -7.9819F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(59, 0).addBox(-2.5F, -1.6F, -1.9F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8872F, -3.3881F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8418F, -7.9576F, -0.047F, -0.1308F, 0.0061F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(68, 97).addBox(0.0F, -3.8948F, -0.984F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5094F, -0.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = body2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(97, 2).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0678F, 0.0762F, -1.3057F));

		PartDefinition Bodyfront_r20 = body2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4342F, 5.1982F, -2.6754F, -0.0859F, 0.0872F, -1.5933F));

		PartDefinition Bodyfront_r21 = body2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(88, 28).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0849F, 4.206F, -0.9162F, -0.0852F, 0.0561F, -1.5673F));

		PartDefinition Bodyfront_r22 = body2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(96, 48).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0335F, 0.0964F, -0.912F));

		PartDefinition Bodyfront_r23 = body2.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(33, 105).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0059F, 0.0603F, -0.5637F));

		PartDefinition Bodyfront_r24 = body2.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, -0.0557F, 0.109F, -1.2871F));

		PartDefinition Bodyfront_r25 = body2.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(96, 46).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, -0.0096F, 0.122F, -0.892F));

		PartDefinition Bodyfront_r26 = body2.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(105, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.0252F, 0.0763F, -0.5441F));

		PartDefinition Bodyfront_r27 = body2.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(33, 105).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0059F, -0.0603F, 0.5637F));

		PartDefinition Bodyfront_r28 = body2.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(96, 48).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0335F, -0.0964F, 0.912F));

		PartDefinition Bodyfront_r29 = body2.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(97, 2).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0678F, -0.0762F, 1.3057F));

		PartDefinition Bodyfront_r30 = body2.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(88, 28).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0849F, 4.206F, -0.9162F, -0.0852F, -0.0561F, 1.5673F));

		PartDefinition Bodyfront_r31 = body2.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(105, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.0252F, -0.0763F, 0.5441F));

		PartDefinition Bodyfront_r32 = body2.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(96, 46).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, -0.0096F, -0.122F, 0.892F));

		PartDefinition Bodyfront_r33 = body2.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(70, 84).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4342F, 5.1982F, -2.6754F, -0.0859F, -0.0872F, 1.5933F));

		PartDefinition Bodyfront_r34 = body2.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(87, 66).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, -0.0557F, -0.109F, 1.2871F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 93).addBox(0.0F, -3.9212F, -0.7673F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.1507F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(23, 8).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.8339F, 3.5252F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(13, 54).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, 0.1717F, -0.043F, -0.0075F));

		PartDefinition cube_r38 = body3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(65, 95).addBox(0.0F, -3.2509F, -0.8779F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -4.0507F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, -0.1009F, -0.0139F, -1.2718F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -2.3075F, -0.0829F, 0.0353F, -1.2542F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(20, 77).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1147F, 6.0514F, -3.7995F, -0.0898F, 0.0397F, -1.5671F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(105, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, -0.0912F, 0.0161F, -0.5321F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(96, 44).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.3075F, -0.0986F, 0.0257F, -0.8811F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8119F, 5.9555F, -0.2954F, -0.0921F, -0.0435F, -1.5759F));

		PartDefinition Bodyfront_r41 = body3.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9142F, 5.9884F, -1.9976F, -0.0897F, 0.0088F, -1.5585F));

		PartDefinition Bodyfront_r42 = body3.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -2.3075F, -0.0631F, 0.0643F, -0.862F));

		PartDefinition Bodyfront_r43 = body3.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(105, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1837F, -2.3075F, -0.0447F, 0.0403F, -0.5133F));

		PartDefinition Bodyfront_r44 = body3.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(54, 82).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0709F, 0.068F, -1.2186F));

		PartDefinition Bodyfront_r45 = body3.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(34, 96).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0394F, 0.09F, -0.8253F));

		PartDefinition Bodyfront_r46 = body3.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(28, 105).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0137F, 0.0563F, -0.4769F));

		PartDefinition Bodyfront_r47 = body3.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(84, 60).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, -0.1009F, 0.0139F, 1.2718F));

		PartDefinition Bodyfront_r48 = body3.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(82, 56).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8119F, 5.9555F, -0.2954F, -0.0921F, 0.0435F, 1.5759F));

		PartDefinition Bodyfront_r49 = body3.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(96, 44).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, -0.0986F, -0.0257F, 0.8811F));

		PartDefinition Bodyfront_r50 = body3.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(105, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.3075F, -0.0912F, -0.0161F, 0.5321F));

		PartDefinition Bodyfront_r51 = body3.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(105, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -2.3075F, -0.0447F, -0.0403F, 0.5133F));

		PartDefinition Bodyfront_r52 = body3.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(96, 42).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -2.3075F, -0.0631F, -0.0643F, 0.862F));

		PartDefinition Bodyfront_r53 = body3.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(84, 58).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1837F, -2.3075F, -0.0829F, -0.0353F, 1.2542F));

		PartDefinition Bodyfront_r54 = body3.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(71, 60).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9142F, 5.9884F, -1.9976F, -0.0897F, -0.0088F, 1.5585F));

		PartDefinition Bodyfront_r55 = body3.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(20, 77).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1147F, 6.0514F, -3.7995F, -0.0898F, -0.0397F, 1.5671F));

		PartDefinition Bodyfront_r56 = body3.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(54, 82).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0709F, -0.068F, 1.2186F));

		PartDefinition Bodyfront_r57 = body3.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(34, 96).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0394F, -0.09F, 0.8253F));

		PartDefinition Bodyfront_r58 = body3.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(28, 105).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0137F, -0.0563F, 0.4769F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 68).addBox(0.0F, -3.7942F, 0.0317F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -0.9507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(100, 80).addBox(0.0F, -3.6366F, 0.0412F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -2.9507F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(19, 22).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.4816F, 2.1504F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 55).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.8803F, 0.1284F, -0.0866F, -0.0112F));

		PartDefinition cube_r43 = body4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(100, 54).addBox(0.0F, -3.4157F, 0.0286F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -1.9507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r59 = body4.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(54, 84).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.116F, -0.0548F, -1.2015F));

		PartDefinition Bodyfront_r60 = body4.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4075F, 5.7867F, -3.3641F, -0.0902F, -0.0737F, -1.5147F));

		PartDefinition Bodyfront_r61 = body4.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2134F, 5.7165F, -1.5634F, -0.0942F, -0.0871F, -1.506F));

		PartDefinition Bodyfront_r62 = body4.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.1281F, -0.0064F, -0.8116F));

		PartDefinition Bodyfront_r63 = body4.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(103, 98).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.1299F, -0.004F, -0.4625F));

		PartDefinition Bodyfront_r64 = body4.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.1099F, -0.0385F, -1.1669F));

		PartDefinition Bodyfront_r65 = body4.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(95, 40).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.1163F, 0.0064F, -0.7767F));

		PartDefinition Bodyfront_r66 = body4.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.1144F, 0.004F, -0.4276F));

		PartDefinition Bodyfront_r67 = body4.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(103, 98).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.1299F, 0.004F, 0.4625F));

		PartDefinition Bodyfront_r68 = body4.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(27, 96).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.1281F, 0.0064F, 0.8116F));

		PartDefinition Bodyfront_r69 = body4.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(54, 84).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.116F, 0.0548F, 1.2015F));

		PartDefinition Bodyfront_r70 = body4.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(71, 58).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2134F, 5.7165F, -1.5634F, -0.0942F, 0.0871F, 1.506F));

		PartDefinition Bodyfront_r71 = body4.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(77, 15).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4075F, 5.7867F, -3.3641F, -0.0902F, 0.0737F, 1.5147F));

		PartDefinition Bodyfront_r72 = body4.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(81, 36).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.1099F, 0.0385F, 1.1669F));

		PartDefinition Bodyfront_r73 = body4.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(95, 40).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.1163F, -0.0064F, 0.7767F));

		PartDefinition Bodyfront_r74 = body4.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(103, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.1144F, -0.004F, 0.4276F));

		PartDefinition cube_r44 = body4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 95).addBox(0.0F, -3.3585F, 0.0303F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.9507F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -1.9F, -5.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 12.202F, 0.6612F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 38).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -4.8855F, 0.0408F, -0.0872F, -0.0036F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(10, 98).addBox(0.0F, -3.6932F, 0.0552F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -0.9507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(62, 95).addBox(0.0F, -3.3369F, 0.0333F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -2.9507F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(18, 102).addBox(0.0F, -3.3715F, 3.9779F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(17, 40).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(0.0F, -1.0112F, 0.1746F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 11.2315F, -7.2219F, -0.0994F, 0.2606F, -0.0257F));

		PartDefinition Bodyfront_r75 = chest.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(9, 83).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8526F, 4.7376F, -1.8605F, -0.0876F, 0.0523F, -1.5061F));

		PartDefinition Bodyfront_r76 = chest.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.094F, 4.5796F, -0.2743F, -0.125F, -0.0174F, -1.4534F));

		PartDefinition Bodyfront_r77 = chest.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(86, 11).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0979F, -0.0057F, -1.1497F));

		PartDefinition Bodyfront_r78 = chest.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(95, 10).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0927F, 0.0322F, -0.7587F));

		PartDefinition Bodyfront_r79 = chest.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(103, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0835F, 0.0201F, -0.4098F));

		PartDefinition Bodyfront_r80 = chest.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(103, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0059F, 0.0603F, -0.459F));

		PartDefinition Bodyfront_r81 = chest.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0335F, 0.0964F, -0.8073F));

		PartDefinition Bodyfront_r82 = chest.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0678F, 0.0762F, -1.201F));

		PartDefinition Bodyfront_r83 = chest.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, -0.0435F, 0.1417F, -1.2158F));

		PartDefinition Bodyfront_r84 = chest.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(53, 45).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0144F, 0.1475F, -0.8189F));

		PartDefinition Bodyfront_r85 = chest.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2682F, -4.3417F, 0.0564F, 0.0922F, -0.4717F));

		PartDefinition Bodyfront_r86 = chest.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(103, 58).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0835F, -0.0201F, 0.4098F));

		PartDefinition Bodyfront_r87 = chest.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(95, 10).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0927F, -0.0322F, 0.7587F));

		PartDefinition Bodyfront_r88 = chest.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(77, 13).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.094F, 4.5796F, -0.2743F, -0.125F, 0.0174F, 1.4534F));

		PartDefinition Bodyfront_r89 = chest.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(86, 11).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0979F, 0.0057F, 1.1497F));

		PartDefinition Bodyfront_r90 = chest.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(9, 83).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8526F, 4.7376F, -1.8605F, -0.0876F, -0.0523F, 1.5061F));

		PartDefinition Bodyfront_r91 = chest.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(70, 82).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0678F, -0.0762F, 1.201F));

		PartDefinition Bodyfront_r92 = chest.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(94, 64).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0335F, -0.0964F, 0.8073F));

		PartDefinition Bodyfront_r93 = chest.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(103, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0059F, -0.0603F, 0.459F));

		PartDefinition Bodyfront_r94 = chest.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(89, 54).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0564F, -0.0922F, 0.4717F));

		PartDefinition Bodyfront_r95 = chest.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(53, 45).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, 0.0144F, -0.1475F, 0.8189F));

		PartDefinition Bodyfront_r96 = chest.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(60, 52).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2682F, -4.3417F, -0.0435F, -0.1417F, 1.2158F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(70, 68).addBox(-1.0F, -1.0112F, 0.1746F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 11.2315F, -7.2219F, -0.0994F, -0.2606F, 0.0257F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(66, 18).addBox(-1.0F, -1.0112F, 0.1746F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.2315F, -7.2219F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(30, 53).addBox(-2.0F, -0.2431F, -0.3376F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.4605F, -9.1176F, -0.4451F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(82, 43).addBox(-0.599F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(48, 68).addBox(-0.599F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4095F, 9.2333F, -4.2865F, 0.8117F, 0.2384F, -1.5151F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(75, 99).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(88, 98).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(100, 32).addBox(-0.3997F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8686F, 7.0572F, -0.5472F, -1.3311F, 1.0F, 0.1302F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(93, 18).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(42, 93).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(0, 100).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(54, 86).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(24, 65).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.1492F, 0.0497F, 0.2524F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(40, 24).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offset(2.0F, 0.6F, 0.0F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(47, 82).addBox(-0.401F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(59, 68).addBox(-0.401F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4095F, 9.2333F, -4.2865F, -0.4855F, -0.3001F, 1.6348F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(80, 99).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(93, 5).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(7, 85).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(98, 92).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(100, 36).addBox(-0.6003F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8686F, 7.0572F, -0.5472F, -1.2447F, -0.6342F, -0.2217F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(93, 23).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(47, 93).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(59, 86).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(65, 62).addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.061F, -0.1175F, -0.7735F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(32, 47).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 3.3089F, -5.0411F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Bodyfront_r97 = bone.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(74, 0).addBox(-0.9F, 0.0F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5702F, 4.4757F, -2.9341F, 1.3042F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r98 = bone.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(79, 74).addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.34F, 5.18F, -3.2013F, 0.8203F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r99 = bone.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(38, 82).addBox(-0.8F, -0.4637F, -4.8268F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 1.0385F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r100 = bone.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(0, 77).addBox(-0.8F, -0.3266F, -1.7277F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, -0.0087F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r101 = bone.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -0.0281F, -0.0772F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -2.1F, 3.9F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r102 = bone.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(37, 91).addBox(-0.5F, -0.0507F, -0.0004F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 2.9F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r103 = bone.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(32, 91).addBox(-0.5F, 0.0167F, 0.0414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.8F, 1.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r104 = bone.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(38, 38).addBox(-0.8F, 0.9973F, -5.4676F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.733F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r105 = bone.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(60, 75).addBox(-0.5F, -2.4456F, -0.0367F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r106 = bone.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(73, 44).addBox(-0.5F, -1.4309F, -1.1315F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 3.3089F, -5.0411F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Bodyfront_r107 = bone4.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.1F, 0.0F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5702F, 4.4757F, -2.9341F, 1.3042F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r108 = bone4.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-0.5F, -0.5F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.34F, 5.18F, -3.2013F, 0.8203F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r109 = bone4.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(38, 82).mirror().addBox(-0.2F, -0.4637F, -4.8268F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 1.0385F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r110 = bone4.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.2F, -0.3266F, -1.7277F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, -0.0087F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r111 = bone4.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, -0.0281F, -0.0772F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 3.9F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r112 = bone4.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(37, 91).mirror().addBox(-0.5F, -0.0507F, -0.0004F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.5F, 2.9F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r113 = bone4.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(32, 91).mirror().addBox(-0.5F, 0.0167F, 0.0414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8F, 1.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r114 = bone4.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(38, 38).mirror().addBox(-0.2F, 0.9973F, -5.4676F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.733F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r115 = bone4.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-0.5F, -2.4456F, -0.0367F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r116 = bone4.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-0.5F, -1.4309F, -1.1315F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.2004F, -0.0713F, -0.1322F));

		PartDefinition cube_r54 = neck.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(13, 96).addBox(-0.5F, -3.0505F, 0.0535F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.0392F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r117 = neck.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, -0.0124F, 0.2235F, -1.4196F));

		PartDefinition Bodyfront_r118 = neck.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0753F, 0.211F, -1.0175F));

		PartDefinition Bodyfront_r119 = neck.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(105, 60).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.1348F, 0.1315F, -0.6724F));

		PartDefinition Bodyfront_r120 = neck.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(97, 0).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, -0.0124F, -0.2235F, 1.4196F));

		PartDefinition Bodyfront_r121 = neck.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(96, 66).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0753F, -0.211F, 1.0175F));

		PartDefinition Bodyfront_r122 = neck.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(105, 60).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.1348F, -0.1315F, 0.6724F));

		PartDefinition cube_r55 = neck.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(32, 40).addBox(-0.5F, -3.2721F, -2.0499F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.9392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r56 = neck.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(22, 71).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(47, 47).addBox(-2.0F, -2.375F, -7.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7112F, -3.4044F, -0.5485F, -0.1233F, -0.1593F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(89, 42).addBox(-2.0F, -0.05F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 3.3132F, -20.0897F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(88, 85).addBox(-2.0F, -0.05F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, 2.4295F, -19.6776F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r59 = head.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(88, 81).addBox(-2.0F, -0.05F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 1.8293F, -18.9093F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r60 = head.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 38).addBox(-1.0F, -0.05F, -1.95F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, 0.896F, -17.2257F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r61 = head.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(51, 75).addBox(-1.0F, -0.05F, -1.975F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0429F, -15.4598F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r62 = head.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(42, 75).addBox(-1.0F, -0.05F, -2.025F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.8564F, -13.6327F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r63 = head.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(70, 24).addBox(-2.0F, -0.05F, -1.975F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.475F, -11.8362F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r64 = head.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(70, 74).addBox(-2.0F, -0.05F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -1.8908F, -9.8799F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r65 = head.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(79, 17).mirror().addBox(0.0F, 0.0F, 0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.375F, -7.1F, 0.0F, -0.2443F, 0.0F));

		PartDefinition cube_r66 = head.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(0.125F, -0.05F, 0.075F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -1.8908F, -9.8799F, 0.1485F, -0.3455F, -0.0506F));

		PartDefinition cube_r67 = head.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -1.1186F, -0.0704F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1854F, -0.083F, -10.5285F, 0.1579F, -0.0848F, 0.1143F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(37, 68).mirror().addBox(-0.5F, -1.1175F, -3.9296F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1854F, -0.083F, -10.5285F, 0.28F, -0.0848F, 0.1143F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-0.5F, -0.1033F, -0.1956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 2.9396F, -18.2332F, 1.0996F, -0.0567F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.5F, -0.4077F, -0.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 2.9396F, -18.2332F, 1.7541F, -0.0567F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(25, 102).mirror().addBox(-0.5F, -0.8044F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 2.9396F, -18.2332F, 2.6704F, -0.0567F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 102).mirror().addBox(-0.5F, -0.7182F, -0.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.575F, 2.9396F, -18.2332F, 0.1396F, -0.0567F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(103, 72).mirror().addBox(-0.8469F, -2.3414F, -6.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, 0.3342F, -0.1743F, 0.0009F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(103, 69).mirror().addBox(-0.8469F, 0.5632F, -5.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 24).mirror().addBox(-0.8469F, 0.1632F, -3.0242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(27, 98).mirror().addBox(-0.8469F, -0.0368F, -4.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, -0.1894F, -0.1743F, 0.0009F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(0.1118F, -1.9376F, -0.3193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1096F, 4.0503F, -18.4261F, -0.2331F, -0.1874F, 0.0882F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(0.1118F, -1.7175F, 0.2354F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1096F, 4.0503F, -18.4261F, 0.5F, -0.1874F, 0.0882F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(103, 66).mirror().addBox(-0.9178F, 1.1405F, 5.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 55).mirror().addBox(-0.9178F, 1.1405F, 4.462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, 0.3013F, -0.0526F, -0.0004F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(103, 52).mirror().addBox(-0.9178F, 0.4788F, 3.6337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 20).mirror().addBox(-0.9178F, -0.3212F, 2.5337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 16).mirror().addBox(-0.9178F, -0.1212F, 1.4337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(98, 12).mirror().addBox(-0.9178F, -0.1212F, 0.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, 0.1704F, -0.0526F, -0.0004F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(98, 4).mirror().addBox(-0.8469F, -0.2036F, -0.6579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, 0.0724F, -0.1743F, 0.0009F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 97).mirror().addBox(-0.8469F, 0.1072F, -1.6879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1629F, 4.1589F, -13.0497F, -0.0149F, -0.1743F, 0.0009F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(0.1118F, -2.3589F, 2.6036F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1096F, 4.0503F, -18.4261F, -0.0149F, -0.1874F, 0.0882F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(0.0036F, -3.6366F, -7.9288F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.6062F, -6.0582F, 0.0793F, -0.0848F, 0.1143F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(11, 75).mirror().addBox(0.0036F, -3.7576F, -6.9346F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.6062F, -6.0582F, 0.0968F, -0.0848F, 0.1143F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0036F, -3.9983F, -3.9436F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.6062F, -6.0582F, 0.1579F, -0.0848F, 0.1143F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(81, 84).mirror().addBox(-0.375F, -1.925F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.4887F, -5.9356F, 0.3794F, -0.087F, 0.1345F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(21, 85).mirror().addBox(-2.0F, -2.025F, 1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 85).addBox(2.0F, -2.025F, 1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.6264F, -6.0152F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(101, 100).mirror().addBox(-0.5F, -0.6205F, -1.418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.6356F, -0.5061F, -0.2313F, 0.0087F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(102, 8).mirror().addBox(-0.5F, 0.356F, -0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.6356F, -1.4224F, -0.2313F, 0.0087F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(103, 40).mirror().addBox(-0.5F, -1.3965F, -0.5082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(100, 28).mirror().addBox(-0.5F, -1.9965F, -1.1082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.6356F, 3.0718F, -0.2313F, 0.0087F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 98).mirror().addBox(-0.5F, -1.9809F, -1.0381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6186F, -0.1411F, -6.9591F, -2.6878F, -0.2313F, 0.0087F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(98, 96).mirror().addBox(-0.5F, -2.1115F, -1.3689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.4856F, 2.8449F, -0.2313F, 0.0087F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(13, 102).mirror().addBox(-0.5F, 0.3176F, -0.4684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.4856F, 1.5359F, -0.2313F, 0.0087F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(103, 43).mirror().addBox(-0.5F, -0.9249F, 0.4188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.4856F, 0.4014F, -0.2313F, 0.0087F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-0.5F, -1.3074F, -0.8286F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.925F, -0.7448F, -5.6356F, 0.0873F, -0.2313F, 0.0087F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 102).mirror().addBox(-0.4F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(50, 102).mirror().addBox(-0.675F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9133F, -0.9073F, -5.6792F, 0.0611F, -0.2313F, 0.0087F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(103, 49).mirror().addBox(-2.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 49).addBox(1.55F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -0.1083F, -3.0586F, -3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(103, 46).mirror().addBox(-2.5F, 0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(103, 46).addBox(1.55F, 0.3F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.025F, 0.7256F, -4.7775F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(60, 45).mirror().addBox(-0.8F, -0.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3633F, 2.4294F, -5.8726F, -0.2552F, -0.1683F, -0.0213F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-2.0F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 4).addBox(2.0F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.9104F, 0.1196F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(-2.0F, -0.575F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(88, 77).addBox(2.0F, -0.575F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 2.9104F, 0.1196F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 10).addBox(-2.125F, -0.05F, 0.075F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1F, -1.8908F, -9.8799F, 0.1485F, 0.3455F, 0.0506F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(55, 15).addBox(-1.5F, -0.05F, -3.025F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -2.3083F, -6.9091F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(60, 45).addBox(-0.2F, -0.1F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3633F, 2.4294F, -5.8726F, -0.2552F, 0.1683F, 0.0213F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(81, 84).addBox(-0.625F, -1.925F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.4887F, -5.9356F, 0.3794F, 0.087F, -0.1345F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 53).addBox(-1.1118F, -1.7175F, 0.2354F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1096F, 4.0503F, -18.4261F, 0.5F, 0.1874F, -0.0882F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(78, 62).addBox(-1.1118F, -1.9376F, -0.3193F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1096F, 4.0503F, -18.4261F, -0.2331F, 0.1874F, -0.0882F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(103, 66).addBox(-0.0822F, 1.1405F, 5.562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 55).addBox(-0.0822F, 1.1405F, 4.462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, 0.3013F, 0.0526F, 0.0004F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(103, 52).addBox(-0.0822F, 0.4788F, 3.6337F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 20).addBox(-0.0822F, -0.3212F, 2.5337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 16).addBox(-0.0822F, -0.1212F, 1.4337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 12).addBox(-0.0822F, -0.1212F, 0.2337F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, 0.1704F, 0.0526F, 0.0004F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(98, 4).addBox(-0.1531F, -0.2036F, -0.6579F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, 0.0724F, 0.1743F, -0.0009F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(103, 72).addBox(-0.1531F, -2.3414F, -6.5085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, 0.3342F, 0.1743F, -0.0009F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(103, 69).addBox(-0.1531F, 0.5632F, -5.6242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 98).addBox(-0.1531F, -0.0368F, -4.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(98, 24).addBox(-0.1531F, 0.1632F, -3.0242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, -0.1894F, 0.1743F, -0.0009F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(22, 97).addBox(-0.1531F, 0.1072F, -1.6879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1629F, 4.1589F, -13.0497F, -0.0149F, 0.1743F, -0.0009F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 84).addBox(-1.1118F, -2.3589F, 2.6036F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1096F, 4.0503F, -18.4261F, -0.0149F, 0.1874F, -0.0882F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(90, 30).addBox(-1.0036F, -3.6366F, -7.9288F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.6062F, -6.0582F, 0.0793F, 0.0848F, -0.1143F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 75).addBox(-1.0036F, -3.7576F, -6.9346F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 3.6062F, -6.0582F, 0.0968F, 0.0848F, -0.1143F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(37, 68).addBox(-0.5F, -1.1175F, -3.9296F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1854F, -0.083F, -10.5285F, 0.28F, 0.0848F, -0.1143F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -1.1186F, -0.0704F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1854F, -0.083F, -10.5285F, 0.1579F, 0.0848F, -0.1143F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0036F, -3.9983F, -3.9436F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5F, 3.6062F, -6.0582F, 0.1579F, 0.0848F, -0.1143F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(23, 0).addBox(-3.0F, -1.925F, -4.4F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 2.9229F, -1.1453F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(59, 5).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 0.3838F, -0.2216F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 48).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.382F, -1.1605F, -1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -2.1313F, -3.0149F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(44, 8).addBox(-3.0F, 0.0F, 0.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, -2.375F, -5.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(103, 43).addBox(-0.5F, -0.9249F, 0.4188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.4856F, 0.4014F, 0.2313F, -0.0087F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(13, 102).addBox(-0.5F, 0.3176F, -0.4684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.4856F, 1.5359F, 0.2313F, -0.0087F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(40, 102).addBox(-0.5F, -0.7182F, -0.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.575F, 2.9396F, -18.2332F, 0.1396F, 0.0567F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(35, 102).addBox(-0.5F, -0.1033F, -0.1956F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.575F, 2.9396F, -18.2332F, 1.0996F, 0.0567F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(30, 102).addBox(-0.5F, -0.4077F, -0.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.575F, 2.9396F, -18.2332F, 1.7541F, 0.0567F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(25, 102).addBox(-0.5F, -0.8044F, -0.1033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.575F, 2.9396F, -18.2332F, 2.6704F, 0.0567F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(98, 96).addBox(-0.5F, -2.1115F, -1.3689F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.4856F, 2.8449F, 0.2313F, -0.0087F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(100, 28).addBox(-0.5F, -1.9965F, -1.1082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(103, 40).addBox(-0.5F, -1.3965F, -0.5082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.6356F, 3.0718F, 0.2313F, -0.0087F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(93, 98).addBox(-0.5F, -1.9809F, -1.0381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6186F, -0.1411F, -6.9591F, -2.6878F, 0.2313F, -0.0087F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(102, 8).addBox(-0.5F, 0.356F, -0.5622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.6356F, -1.4224F, 0.2313F, -0.0087F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(50, 102).addBox(-0.325F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(45, 102).addBox(-0.6F, -0.4F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.9133F, -0.9073F, -5.6792F, 0.0611F, 0.2313F, -0.0087F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(101, 100).addBox(-0.5F, -0.6205F, -1.418F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.6356F, -0.5061F, 0.2313F, -0.0087F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(59, 10).addBox(-0.5F, -1.3074F, -0.8286F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.925F, -0.7448F, -5.6356F, 0.0873F, 0.2313F, -0.0087F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(79, 17).addBox(-1.0F, 0.0F, 0.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0F, -2.375F, -7.1F, 0.0F, 0.2443F, 0.0F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.9376F, 1.3523F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone3 = lower_jaw.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(88, 38).addBox(1.5F, 0.09F, -0.79F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(88, 38).mirror().addBox(-2.1F, 0.09F, -0.79F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.6F, -1.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r138 = bone3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-0.0312F, -1.2078F, -4.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(104, 0).mirror().addBox(-0.0312F, -0.6523F, -1.2214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7983F, -15.702F, -0.2531F, -0.2793F, 0.0F));

		PartDefinition cube_r139 = bone3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(55, 102).mirror().addBox(-0.0312F, -0.2389F, -3.2092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7983F, -15.702F, -0.5149F, -0.2793F, 0.0F));

		PartDefinition cube_r140 = bone3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-0.0312F, -0.376F, -2.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7983F, -15.702F, -0.4276F, -0.2793F, 0.0F));

		PartDefinition cube_r141 = bone3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(0.0F, 0.3481F, -6.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 75).mirror().addBox(0.0F, 1.0551F, -6.714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(74, 103).mirror().addBox(0.0F, 1.0551F, -6.514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, -0.1222F, -0.0873F, 0.0F));

		PartDefinition cube_r142 = bone3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(0.0F, -0.4107F, -5.7024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, 0.0087F, -0.0873F, 0.0F));

		PartDefinition cube_r143 = bone3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(0.0F, -0.7644F, -4.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 95).mirror().addBox(0.0F, -0.7644F, -3.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(29, 82).mirror().addBox(0.0F, -0.1645F, -5.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, 0.096F, -0.0873F, 0.0F));

		PartDefinition cube_r144 = bone3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(103, 92).mirror().addBox(-2.5F, -0.65F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 92).addBox(1.1F, -0.65F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, 0.4983F, -9.202F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(103, 81).mirror().addBox(0.0F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 78).mirror().addBox(0.0F, -0.65F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(81, 31).mirror().addBox(0.0F, -0.05F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, 0.0524F, -0.0873F, 0.0F));

		PartDefinition cube_r146 = bone3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(79, 103).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.4114F, -10.4082F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r147 = bone3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.0312F, 0.3907F, -3.7634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7983F, -15.702F, -0.5585F, -0.2793F, 0.0F));

		PartDefinition cube_r148 = bone3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-0.0312F, 0.0547F, -2.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7983F, -15.702F, -0.384F, -0.2793F, 0.0F));

		PartDefinition cube_r149 = bone3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(47, 89).mirror().addBox(0.0F, 1.6846F, -6.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, -0.2094F, -0.0873F, 0.0F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(0.0F, 1.07F, -4.8442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, -0.0785F, -0.0873F, 0.0F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(0.0F, 0.9192F, -2.9529F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.4983F, -9.202F, -0.0262F, -0.0873F, 0.0F));

		PartDefinition cube_r152 = bone3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-3.0F, 0.0F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(86, 6).addBox(0.6F, 0.0F, -1.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, -1.2506F, -4.5788F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r153 = bone3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-3.0F, 0.0F, -2.975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(20, 79).addBox(0.6F, 0.0F, -2.975F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -0.9913F, -1.6151F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r154 = bone3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(77, 6).mirror().addBox(-3.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(77, 6).addBox(0.6F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9F, 2.9353F, -2.4461F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r155 = bone3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 98).mirror().addBox(-3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 98).addBox(0.6F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 2.6764F, -1.4802F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r156 = bone3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(-3.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(47, 98).addBox(0.6F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, -0.5687F, -0.7089F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r157 = bone3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(-3.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(42, 98).addBox(0.6F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9F, 0.09F, 0.01F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r158 = bone3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(37, 98).mirror().addBox(-3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(37, 98).addBox(0.6F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9F, 2.3344F, -0.5405F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r159 = bone3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(32, 98).mirror().addBox(-3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 98).addBox(0.6F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.7971F, 0.3029F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(-2.5F, -2.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(11, 68).addBox(1.1F, -2.0F, -3.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.5507F, -5.4066F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(101, 63).mirror().addBox(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(101, 63).addBox(0.6F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9F, 1.09F, 1.01F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(79, 79).mirror().addBox(-2.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(79, 79).addBox(1.1F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4F, -0.3F, -6.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 104).addBox(-0.9688F, -1.2078F, -4.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(104, 0).addBox(-0.9688F, -0.6523F, -1.2214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 0.7983F, -15.702F, -0.2531F, 0.2793F, 0.0F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 102).addBox(-0.9688F, -0.2389F, -3.2092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 0.7983F, -15.702F, -0.5149F, 0.2793F, 0.0F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 104).addBox(-0.9688F, -0.376F, -2.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9F, 0.7983F, -15.702F, -0.4276F, 0.2793F, 0.0F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 104).addBox(-1.0F, 0.3481F, -6.6377F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 75).addBox(-1.0F, 1.0551F, -6.714F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(74, 103).addBox(-1.0F, 1.0551F, -6.514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, -0.1222F, 0.0873F, 0.0F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(101, 103).addBox(-1.0F, -0.4107F, -5.7024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, 0.0087F, 0.0873F, 0.0F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(65, 104).addBox(-1.0F, -0.7644F, -4.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 95).addBox(-1.0F, -0.7644F, -3.6904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(29, 82).addBox(-1.0F, -0.1645F, -5.6475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, 0.096F, 0.0873F, 0.0F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(103, 81).addBox(-1.0F, -0.65F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 78).addBox(-1.0F, -0.65F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(81, 31).addBox(-1.0F, -0.05F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, 0.0524F, 0.0873F, 0.0F));

		PartDefinition cube_r170 = bone3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 103).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, 0.4114F, -10.4082F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r171 = bone3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(88, 89).addBox(-0.9688F, 0.3907F, -3.7634F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.9F, 0.7983F, -15.702F, -0.5585F, 0.2793F, 0.0F));

		PartDefinition cube_r172 = bone3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(89, 50).addBox(-0.9688F, 0.0547F, -2.0273F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.9F, 0.7983F, -15.702F, -0.384F, 0.2793F, 0.0F));

		PartDefinition cube_r173 = bone3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(47, 89).addBox(-1.0F, 1.6846F, -6.5326F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, -0.2094F, 0.0873F, 0.0F));

		PartDefinition cube_r174 = bone3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(89, 46).addBox(-1.0F, 1.07F, -4.8442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, -0.0785F, 0.0873F, 0.0F));

		PartDefinition cube_r175 = bone3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(81, 68).addBox(-1.0F, 0.9192F, -2.9529F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.5F, 0.4983F, -9.202F, -0.0262F, 0.0873F, 0.0F));

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