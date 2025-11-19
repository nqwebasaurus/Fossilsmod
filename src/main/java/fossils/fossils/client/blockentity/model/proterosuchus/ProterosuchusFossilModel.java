package fossils.fossils.client.blockentity.model.proterosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProterosuchusFossilModel extends SkullModelBase {
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
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart body;
	private final ModelPart body5;
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
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public ProterosuchusFossilModel(ModelPart root) {
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
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.body = this.hips.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body2 = this.body5.getChild("body2");
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
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.5764F, 10.5767F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 100).addBox(0.0F, -1.7963F, 0.0626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7266F, 3.8245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(99, 28).addBox(0.0F, -1.9942F, -0.0378F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0266F, 1.9245F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 94).addBox(0.0F, -1.9139F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, 0.0245F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 96).addBox(0.0F, -1.9227F, -0.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -1.8755F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 24).mirror().addBox(-2.4F, -0.5904F, 2.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 24).addBox(0.4F, -0.5904F, 2.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -1.0904F, -0.109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(100, 5).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4502F, -1.5333F, -0.2852F, -0.1342F, -0.6243F));

		PartDefinition Bodyfront_r2 = hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(100, 5).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4502F, -1.5333F, -0.2852F, 0.1342F, 0.6243F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(72, 51).addBox(-0.3136F, -0.6328F, -1.0681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.5154F, 0.3917F, -0.0168F, 0.1901F, 0.3158F, -0.5899F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(86, 41).addBox(-0.5F, 0.3F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.4672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(36, 87).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 5.1264F, 0.171F, 1.7897F, -0.0087F, 0.0015F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.125F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 3.4672F, -0.1681F, 0.3934F, -0.007F, -0.0024F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(83, 21).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(61, 87).addBox(-0.5F, -1.25F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.3672F, 0.8319F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(51, 87).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1864F, 2.3672F, 0.8319F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 7.0502F, -0.6217F, 1.975F, -1.0085F, -1.4157F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(12, 81).addBox(-0.6569F, 0.4837F, 0.522F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2888F, 2.853F, 0.7859F, 2.8798F, 0.6109F, -3.0543F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(78, 3).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3564F, 4.9779F, 0.6987F, 2.8362F, 0.6109F, -3.0543F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(58, 73).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.2267F, 1.1518F, -0.0633F, 3.0543F, 0.6109F, -3.0543F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(83, 78).addBox(-0.4706F, -2.814F, -1.4621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4888F, 2.853F, 0.5859F, 2.7053F, 0.6109F, -3.0543F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(71, 13).addBox(-0.4706F, -3.2115F, -1.4818F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4888F, 2.853F, 0.5859F, 3.0107F, 0.6109F, -3.0543F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(49, 23).addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0473F, 6.0418F, 1.0578F, 2.6847F, 0.322F, 3.1217F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(15, 30).addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.4363F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(44, 73).addBox(-0.6864F, -0.6328F, -1.0681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-2.5154F, 0.3917F, -0.0168F, -0.3337F, -0.3377F, 0.7262F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(86, 53).addBox(-0.5F, 0.3F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 3.4672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(46, 87).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1845F, 5.1264F, 0.171F, 1.7897F, 0.0087F, -0.0015F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(41, 87).addBox(-0.5F, -0.125F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1864F, 3.4672F, -0.1681F, 0.3934F, 0.007F, 0.0024F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(83, 26).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(87, 65).addBox(-0.5F, -1.25F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.3672F, 0.8319F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(87, 61).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1864F, 2.3672F, 0.8319F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 7.0502F, -0.6217F, 2.0364F, 1.1262F, 1.5353F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(5, 82).addBox(-0.3431F, 0.4837F, 0.522F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.2888F, 2.853F, 0.7859F, 2.8798F, -0.6109F, 3.0543F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(78, 78).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3564F, 4.9779F, 0.6987F, 2.8362F, -0.6109F, 3.0543F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(63, 76).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.2267F, 1.1518F, -0.0633F, 3.0543F, -0.6109F, 3.0543F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(83, 83).addBox(-0.5294F, -2.814F, -1.4621F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4888F, 2.853F, 0.5859F, 2.7053F, -0.6109F, 3.0543F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(71, 21).addBox(-0.5294F, -3.2115F, -1.4818F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4888F, 2.853F, 0.5859F, 3.0107F, -0.6109F, 3.0543F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(49, 29).addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0473F, 6.0418F, 1.0578F, 2.803F, -0.3025F, -3.0807F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(32, 30).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6719F, -0.4443F, 0.9555F, -0.2608F, -0.0226F, 0.2299F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(79, 49).addBox(-0.2F, -1.051F, -1.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, 0.1833F, 0.0F, -0.0524F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(76, 25).addBox(-0.2F, -0.076F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.074F, -1.4116F, 0.2937F, 0.1396F, 0.0F, -0.0524F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(79, 57).addBox(-0.2F, -1.476F, -0.1202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(79, 45).addBox(-0.2F, -2.276F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0564F, 1.0753F, -0.0245F, 0.829F, 0.0F, -0.0524F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(0, 55).addBox(-0.9993F, -0.0258F, 2.2251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7994F, -0.0193F, -2.1215F, -0.384F, 0.0F, 0.2967F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(21, 75).addBox(-0.9993F, 0.1667F, 0.2481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(9, 66).addBox(-0.9993F, 1.1858F, -1.5255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7994F, -0.0193F, -2.1215F, 0.096F, 0.0F, 0.2967F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(56, 92).addBox(-0.9993F, 0.7858F, -1.8766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7994F, -0.0193F, -2.1215F, 0.3142F, 0.0F, 0.2967F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(83, 0).addBox(-0.9993F, 1.8472F, -0.8527F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7994F, -0.0193F, -2.1215F, -0.4276F, 0.0F, 0.2967F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(80, 61).addBox(-0.9993F, -0.0129F, -1.9772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.7994F, -0.0193F, -2.1215F, 1.0559F, 0.0F, 0.2967F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(69, 95).addBox(-0.2F, 0.024F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.0864F, -1.6487F, -0.6515F, 0.096F, 0.0F, -0.0524F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(64, 95).addBox(-0.2F, 0.024F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0778F, -1.4839F, 0.3348F, -0.1658F, 0.0F, -0.0524F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6719F, -0.4443F, 0.9555F, -0.2608F, 0.0226F, -0.2299F));

		PartDefinition Hips_r11 = bone4.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(79, 49).mirror().addBox(-0.8F, -1.051F, -1.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, 0.1833F, 0.0F, 0.0524F));

		PartDefinition Hips_r12 = bone4.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.8F, -0.076F, -0.0202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.074F, -1.4116F, 0.2937F, 0.1396F, 0.0F, 0.0524F));

		PartDefinition Hips_r13 = bone4.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.8F, -1.476F, -0.1202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(79, 45).mirror().addBox(-0.8F, -2.276F, -0.6202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0564F, 1.0753F, -0.0245F, 0.829F, 0.0F, 0.0524F));

		PartDefinition Hips_r14 = bone4.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.0007F, -0.0258F, 2.2251F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7994F, -0.0193F, -2.1215F, -0.384F, 0.0F, -0.2967F));

		PartDefinition Hips_r15 = bone4.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-0.0007F, 0.1667F, 0.2481F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(9, 66).mirror().addBox(-0.0007F, 1.1858F, -1.5255F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7994F, -0.0193F, -2.1215F, 0.096F, 0.0F, -0.2967F));

		PartDefinition Hips_r16 = bone4.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(56, 92).mirror().addBox(-0.0007F, 0.7858F, -1.8766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7994F, -0.0193F, -2.1215F, 0.3142F, 0.0F, -0.2967F));

		PartDefinition Hips_r17 = bone4.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.0007F, 1.8472F, -0.8527F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7994F, -0.0193F, -2.1215F, -0.4276F, 0.0F, -0.2967F));

		PartDefinition Hips_r18 = bone4.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(80, 61).mirror().addBox(-0.0007F, -0.0129F, -1.9772F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.7994F, -0.0193F, -2.1215F, 1.0559F, 0.0F, -0.2967F));

		PartDefinition Hips_r19 = bone4.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(69, 95).mirror().addBox(-0.8F, 0.024F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0864F, -1.6487F, -0.6515F, 0.096F, 0.0F, 0.0524F));

		PartDefinition Hips_r20 = bone4.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(64, 95).mirror().addBox(-0.8F, 0.024F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0778F, -1.4839F, 0.3348F, -0.1658F, 0.0F, 0.0524F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6652F, 4.5249F, 0.0666F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(99, 37).addBox(0.0F, -2.0562F, 0.0405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2788F, 4.7952F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 90).addBox(0.0F, -2.1026F, -0.0919F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3844F, 3.2155F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(93, 81).addBox(0.0F, -1.1369F, -1.7033F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 92).addBox(0.0F, -0.0369F, -0.0033F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7649F, 3.5631F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(28, 75).addBox(0.0F, -2.1011F, -0.0403F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4156F, 1.3155F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.6F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4378F, 0.0791F, -0.037F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 0).addBox(-0.4F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4378F, -0.0791F, 0.037F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1547F, 5.5118F, -0.1827F, 0.1287F, -0.0237F));

		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 99).addBox(0.0F, -1.5F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1976F, 4.9945F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(99, 41).addBox(0.0F, -1.353F, 0.0375F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 3.0704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(20, 92).addBox(0.0F, -0.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8892F, 3.8447F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(91, 42).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3315F, 1.843F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 91).addBox(0.0F, -0.225F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5011F, -0.2872F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 100).addBox(0.0F, -1.4169F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 1.2704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 48).mirror().addBox(-1.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(13, 48).addBox(0.3F, 0.2F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.1618F, 0.2209F, 0.0086F));

		PartDefinition cube_r22 = tail3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(68, 76).addBox(-0.5F, -1.4257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.143F, 4.8453F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 99).addBox(0.0F, 0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6714F, -0.0504F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 99).addBox(0.0F, 0.8F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 45).addBox(0.0F, -0.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0548F, 1.853F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 69).addBox(-0.5F, -1.4257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4589F, 2.9659F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, -1.4257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2251F, 1.0865F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 33).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.124F, 0.1721F, -0.029F));

		PartDefinition cube_r28 = tail4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 82).addBox(0.0F, -1.293F, 2.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(28, 102).addBox(0.0F, -1.368F, 0.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(50, 99).addBox(0.0F, -0.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4428F, 3.7632F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(99, 49).addBox(0.0F, -0.1F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2172F, 1.9331F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(94, 100).addBox(0.0F, -0.5F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(30, 36).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(97, 101).addBox(0.0F, -1.1325F, 2.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 101).addBox(0.0F, -1.1325F, 4.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3436F, 4.7853F, 0.0143F, -0.1304F, -0.0451F));

		PartDefinition cube_r33 = tail5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 101).addBox(-0.5F, -1.05F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2825F, -0.0312F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(53, 101).addBox(0.0F, 0.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3348F, 3.266F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(25, 101).addBox(0.0F, 0.075F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4212F, 1.0641F, 0.3142F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(9, 102).addBox(0.0F, -1.0325F, 1.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 102).addBox(0.0F, -0.9575F, 3.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.1169F, -0.1739F, -0.0112F));

		PartDefinition cube_r36 = tail6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 101).addBox(0.0F, 1.25F, 13.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0916F, -9.7286F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail6.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(59, 101).addBox(0.0F, -0.2F, 0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4504F, 1.9345F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail6.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 101).addBox(0.0F, -0.15F, -0.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4583F, 0.0264F, 0.2007F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(13, 41).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(18, 102).addBox(0.0F, -0.8325F, 0.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 102).addBox(0.0F, -0.7325F, 2.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, 0.0226F, -0.2628F, -0.0783F));

		PartDefinition cube_r39 = tail7.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 101).addBox(0.0F, 1.55F, 17.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 79).addBox(0.0F, 1.45F, 15.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1027F, -14.7292F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 43).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.014F, -0.2325F, 0.1585F));

		PartDefinition cube_r40 = tail8.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 101).addBox(0.0F, 1.75F, 19.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 76).addBox(0.0F, 1.95F, 23.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 101).addBox(0.0F, 1.95F, 21.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1142F, -19.7302F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(43, 36).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.1362F, -0.293F, -0.1235F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 4.9357F, 0.009F, 0.0864F, 0.0122F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3784F, -3.1297F, -0.1584F, -0.1293F, 0.0206F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(31, 95).addBox(0.0F, -2.2336F, 0.0403F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, -0.9819F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(86, 92).addBox(0.0F, -2.521F, 0.0427F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1254F, -2.9819F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(98, 3).mirror().addBox(-1.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -0.4789F, 0.0042F, 0.1667F, -0.9763F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -0.4789F, 0.0534F, 0.1136F, -0.6278F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -2.4789F, 0.0545F, 0.2387F, -0.9662F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(99, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6678F, -2.4789F, 0.125F, 0.1645F, -0.6179F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(98, 3).addBox(0.9397F, -0.3395F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -0.4789F, 0.0042F, -0.1667F, 0.9763F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(97, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -0.4789F, 0.0534F, -0.1136F, 0.6278F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(87, 9).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -2.4789F, 0.0545F, -0.2387F, 0.9662F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(99, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6678F, -2.4789F, 0.125F, -0.1645F, 0.6179F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(17, 24).addBox(-2.5F, -1.1521F, -0.1986F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1364F, -3.5734F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 56).addBox(-0.5F, -1.3F, 10.9974F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4254F, -3.9819F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Bodyfront_r11 = body5.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(73, 3).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8575F, -0.4969F, -0.0356F, 0.2753F, -1.3688F));

		PartDefinition Bodyfront_r12 = body5.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(56, 41).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8575F, -0.4969F, 0.0751F, 0.2674F, -0.9611F));

		PartDefinition Bodyfront_r13 = body5.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8575F, -0.4969F, 0.1539F, 0.1847F, -0.6129F));

		PartDefinition Bodyfront_r14 = body5.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(99, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6575F, -2.4969F, 0.1394F, 0.1746F, -0.6155F));

		PartDefinition Bodyfront_r15 = body5.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6575F, -2.4969F, 0.0647F, 0.2531F, -0.9637F));

		PartDefinition Bodyfront_r16 = body5.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6575F, -2.4969F, -0.0393F, 0.2582F, -1.3698F));

		PartDefinition Bodyfront_r17 = body5.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(73, 3).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8575F, -0.4969F, -0.0356F, -0.2753F, 1.3688F));

		PartDefinition cube_r45 = body5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(56, 35).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -11.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r18 = body5.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(56, 41).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8575F, -0.4969F, 0.0751F, -0.2674F, 0.9611F));

		PartDefinition Bodyfront_r19 = body5.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(30, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8575F, -0.4969F, 0.1539F, -0.1847F, 0.6129F));

		PartDefinition Bodyfront_r20 = body5.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(99, 91).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6575F, -2.4969F, 0.1394F, -0.1746F, 0.6155F));

		PartDefinition Bodyfront_r21 = body5.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(86, 59).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6575F, -2.4969F, 0.0647F, -0.2531F, 0.9637F));

		PartDefinition Bodyfront_r22 = body5.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(86, 57).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6575F, -2.4969F, -0.0393F, -0.2582F, 1.3698F));

		PartDefinition cube_r46 = body5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(53, 91).addBox(0.0F, -2.6039F, -0.0547F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(17, 10).addBox(-2.5F, -1.1196F, -0.063F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.222F, -3.5366F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 94).addBox(0.0F, -2.4957F, 0.052F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5836F, -3.9756F, -0.0822F, 0.1305F, -0.0107F));

		PartDefinition Bodyfront_r23 = body2.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(59, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.024F, -0.3213F, 0.2498F, 0.2152F, -0.5283F));

		PartDefinition Bodyfront_r24 = body2.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(74, 39).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.024F, -0.3213F, 0.0142F, 0.362F, -1.2877F));

		PartDefinition Bodyfront_r25 = body2.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.024F, -0.3213F, 0.1567F, 0.328F, -0.8716F));

		PartDefinition Bodyfront_r26 = body2.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(98, 17).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.224F, -2.3213F, 0.2808F, 0.2327F, -0.5214F));

		PartDefinition Bodyfront_r27 = body2.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.224F, -2.3213F, 0.1807F, 0.3546F, -0.8636F));

		PartDefinition Bodyfront_r28 = body2.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.224F, -2.3213F, 0.0247F, 0.3955F, -1.2838F));

		PartDefinition Bodyfront_r29 = body2.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(22, 86).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.024F, -0.3213F, 0.1567F, -0.328F, 0.8716F));

		PartDefinition Bodyfront_r30 = body2.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(74, 39).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.024F, -0.3213F, 0.0142F, -0.362F, 1.2877F));

		PartDefinition Bodyfront_r31 = body2.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(59, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.024F, -0.3213F, 0.2498F, -0.2152F, 0.5283F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(96, 45).addBox(0.0F, -2.4448F, 0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3962F, -0.9443F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(96, 50).addBox(0.0F, -2.0948F, 0.016F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3962F, -2.9443F, 0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r32 = body2.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(98, 17).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.224F, -2.3213F, 0.2808F, -0.2327F, 0.5214F));

		PartDefinition Bodyfront_r33 = body2.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(83, 39).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.224F, -2.3213F, 0.1807F, -0.3546F, 0.8636F));

		PartDefinition Bodyfront_r34 = body2.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(19, 8).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.224F, -2.3213F, 0.0247F, -0.3955F, 1.2838F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 19).addBox(-2.5F, -1.1319F, 0.1072F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.8587F, -2.0285F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(64, 61).addBox(-0.5F, -0.3716F, 5.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2219F, -2.9209F, 0.0671F, 0.0871F, 0.0058F));

		PartDefinition Bodyfront_r35 = body3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(99, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1337F, -1.4075F, 0.2488F, 0.1991F, -0.4779F));

		PartDefinition Bodyfront_r36 = body3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(85, 69).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1337F, -1.4075F, 0.1614F, 0.3125F, -0.8195F));

		PartDefinition Bodyfront_r37 = body3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1337F, -1.4075F, 0.0252F, 0.3496F, -1.2332F));

		PartDefinition Bodyfront_r38 = body3.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(99, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1337F, -1.4075F, 0.2488F, -0.1991F, 0.4779F));

		PartDefinition Bodyfront_r39 = body3.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(85, 69).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1337F, -1.4075F, 0.1614F, -0.3125F, 0.8195F));

		PartDefinition Bodyfront_r40 = body3.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(25, 67).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1337F, -1.4075F, 0.0252F, -0.3496F, 1.2332F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 95).addBox(0.0F, -2.4366F, 0.0412F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -1.9507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(17, 17).addBox(-2.5F, -1.187F, -3.9821F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.7073F, 0.6189F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(62, 26).addBox(-0.5F, -0.3715F, 5.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2379F, -2.886F, 0.0934F, 0.0869F, 0.0081F));

		PartDefinition cube_r56 = body4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(96, 37).addBox(0.0F, -2.2832F, 0.0286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -0.9507F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 29).addBox(0.0F, -2.0157F, 0.0286F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -2.9507F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r41 = body4.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(29, 100).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.249F, 0.1787F, -0.4289F));

		PartDefinition Bodyfront_r42 = body4.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.1687F, 0.2933F, -0.7683F));

		PartDefinition Bodyfront_r43 = body4.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(71, 11).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -0.3272F, 0.0401F, 0.3349F, -1.1792F));

		PartDefinition Bodyfront_r44 = body4.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(100, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.3272F, 0.3302F, 0.2144F, -0.413F));

		PartDefinition Bodyfront_r45 = body4.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.3272F, 0.2356F, 0.3533F, -0.7471F));

		PartDefinition Bodyfront_r46 = body4.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -2.3272F, 0.0765F, 0.4153F, -1.1659F));

		PartDefinition Bodyfront_r47 = body4.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(71, 11).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.0401F, -0.3349F, 1.1792F));

		PartDefinition Bodyfront_r48 = body4.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(10, 88).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.1687F, -0.2933F, 0.7683F));

		PartDefinition Bodyfront_r49 = body4.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(29, 100).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -0.3272F, 0.249F, -0.1787F, 0.4289F));

		PartDefinition Bodyfront_r50 = body4.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(100, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.3272F, 0.3302F, -0.2144F, 0.413F));

		PartDefinition cube_r58 = body4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 18).addBox(-2.5F, -1.1916F, -1.9381F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.2038F, -1.0836F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r51 = body4.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(88, 0).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.3272F, 0.2356F, -0.3533F, 0.7471F));

		PartDefinition Bodyfront_r52 = body4.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(7, 71).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -2.3272F, 0.0765F, -0.4153F, 1.1659F));

		PartDefinition cube_r59 = body4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(62, 11).addBox(-0.5F, -0.3716F, 5.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2214F, -2.965F, -0.003F, 0.0873F, -0.0003F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(53, 96).addBox(0.0F, -2.4932F, 0.0552F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -1.9507F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(93, 76).addBox(0.0F, -2.2369F, 0.0333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.9507F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-0.1F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.4637F, -1.4412F, -0.2232F, 0.7293F, -0.1501F));

		PartDefinition Bodyfront_r53 = chest.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(83, 100).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -1.3417F, 0.3888F, 0.2123F, -0.3886F));

		PartDefinition Bodyfront_r54 = chest.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(88, 21).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -1.3417F, 0.2942F, 0.3699F, -0.7143F));

		PartDefinition Bodyfront_r55 = chest.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -1.3417F, 0.1243F, 0.4528F, -1.1338F));

		PartDefinition Bodyfront_r56 = chest.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -3.3417F, 0.1215F, 0.512F, -1.2319F));

		PartDefinition Bodyfront_r57 = chest.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -3.3417F, 0.3183F, 0.4249F, -0.8018F));

		PartDefinition Bodyfront_r58 = chest.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(20, 100).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0682F, -3.3417F, 0.4285F, 0.2573F, -0.4762F));

		PartDefinition Bodyfront_r59 = chest.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(83, 100).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -1.3417F, 0.3888F, -0.2123F, 0.3886F));

		PartDefinition Bodyfront_r60 = chest.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(88, 21).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -1.3417F, 0.2942F, -0.3699F, 0.7143F));

		PartDefinition Bodyfront_r61 = chest.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(71, 29).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -1.3417F, 0.1243F, -0.4528F, 1.1338F));

		PartDefinition Bodyfront_r62 = chest.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(78, 9).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -3.3417F, 0.1215F, -0.512F, 1.2319F));

		PartDefinition Bodyfront_r63 = chest.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(88, 6).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -3.3417F, 0.3183F, -0.4249F, 0.8018F));

		PartDefinition Bodyfront_r64 = chest.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0682F, -3.3417F, 0.4285F, -0.2573F, 0.4762F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 66).addBox(-1.9F, -0.5F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 5.4637F, -1.4412F, -0.2232F, -0.7293F, 0.1501F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(62, 31).addBox(-1.5418F, -0.076F, 0.6542F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 4.7725F, -3.0027F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(49, 0).addBox(-2.5418F, -0.2229F, -2.1799F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 4.7725F, -3.0027F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(15, 36).addBox(-2.5418F, 0.0745F, -5.0366F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5418F, 4.7725F, -3.0027F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(52, 43).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(72, 56).addBox(-0.599F, 1.9702F, -0.8446F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.6393F, 4.3121F, -3.8141F, -0.0937F, 0.2022F, -1.132F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -2.6F, -2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 2.9702F, 1.7554F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(57, 67).addBox(-0.509F, -2.1178F, -0.2446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.099F, 0.1107F, -0.5794F, -2.2253F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(37, 78).addBox(-0.509F, -1.5895F, -0.5391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 0.99F, -0.796F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(36, 82).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, -0.5298F, 1.0554F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(88, 2).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 4.7702F, -0.3446F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightupperarm.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -1.4F, 2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 8.0021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightupperarm.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(36, 67).addBox(-0.5F, -2.4F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 5.449F, 0.983F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r8 = Rightupperarm.addOrReplaceChild("Rightupperarm_r8", CubeListBuilder.create().texOffs(73, 61).addBox(-0.5F, 2.0F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.099F, 6.5827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(98, 0).addBox(-0.3997F, -0.4984F, 0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4421F, 6.3688F, -0.4505F, -1.6685F, 0.9297F, -0.7244F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(83, 11).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.4016F, -1.3154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.7016F, -1.3154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(98, 11).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, -0.4984F, 1.4846F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(17, 84).addBox(-0.5F, -2.8F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 1.2356F, -0.5338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(22, 88).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r6 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r6", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(26, 50).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.1145F, 0.108F, 0.6862F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(36, 6).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(37, 73).addBox(-0.401F, 1.9702F, -0.8446F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.6393F, 4.3121F, -3.8141F, 0.9098F, -0.2022F, 1.132F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(50, 67).addBox(-0.5F, -2.6F, -2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 2.9702F, 1.7554F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(25, 69).addBox(-0.491F, -2.1178F, -0.2446F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.099F, 0.1107F, -0.5794F, -2.2253F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(78, 74).addBox(-0.491F, -1.5895F, -0.5391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 0.99F, -0.796F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(51, 82).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, -0.5298F, 1.0554F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(88, 11).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.099F, 4.7702F, -0.3446F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftupperarm.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(18, 67).addBox(-0.5F, -1.4F, 2.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.099F, 8.0021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftupperarm.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(43, 67).addBox(-0.5F, -2.4F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 5.449F, 0.983F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r8 = Leftupperarm.addOrReplaceChild("Leftupperarm_r8", CubeListBuilder.create().texOffs(71, 75).addBox(-0.5F, 2.0F, 2.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.099F, 6.5827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(98, 22).addBox(-0.6003F, -0.4984F, 0.4846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.4421F, 6.3688F, -0.4505F, -1.9873F, -1.0165F, 0.7406F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(83, 16).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 1.4016F, -1.3154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(26, 80).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 3.7016F, -1.3154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(98, 25).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, -0.4984F, 1.4846F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(68, 84).addBox(-0.5F, -2.8F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 1.2356F, -0.5338F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(88, 23).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r6 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r6", CubeListBuilder.create().texOffs(32, 73).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(39, 50).addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.1492F, -0.0497F, -0.2524F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(36, 12).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6125F, 1.2697F, -2.9955F, 0.0306F, 0.23F, 0.4201F));

		PartDefinition Bodyfront_r65 = bone.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(79, 53).addBox(-1.15F, 0.3034F, 0.2626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.8003F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r66 = bone.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(24, 56).addBox(-1.15F, -0.2127F, 1.1849F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.4949F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r67 = bone.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(0, 96).addBox(-1.15F, -4.4369F, 2.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 76).addBox(-1.15F, -4.4369F, 0.9789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, -0.3604F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r68 = bone.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(74, 34).addBox(-1.15F, -3.7045F, 0.5977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.0323F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r69 = bone.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(71, 5).addBox(-1.15F, -2.1601F, 1.0255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.8177F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r70 = bone.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(72, 41).addBox(-1.15F, 0.9984F, -3.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.006F, 0.2961F, -1.9468F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r71 = bone.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(22, 62).addBox(-1.15F, -0.0016F, -3.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.006F, 3.7657F, 2.5456F, -0.5934F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = bone.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(62, 21).addBox(-1.15F, -1.0016F, -0.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.006F, 4.0103F, -0.6072F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r73 = bone.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(11, 60).addBox(-1.15F, -1.0016F, -0.0527F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(62, 16).addBox(-1.15F, -2.0016F, 0.8473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.006F, 2.3833F, -4.2614F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r74 = bone.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(68, 80).addBox(-1.15F, -0.0016F, -1.6527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.006F, 0.8964F, -3.0999F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r75 = bone.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(40, 94).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0655F, 1.0536F, -1.853F, -0.404F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r76 = bone.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(80, 65).addBox(-1.15F, -2.1455F, -1.6441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.5559F, -0.1812F, -0.3996F));

		PartDefinition Bodyfront_r77 = bone.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(64, 70).addBox(-1.15F, -2.233F, -0.3613F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.831F, 1.8785F, -0.3436F, 0.7305F, -0.1812F, -0.3996F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6125F, 1.2697F, -2.9955F, 0.0306F, -0.23F, -0.4201F));

		PartDefinition Bodyfront_r78 = bone3.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(0.15F, 0.3034F, 0.2626F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.8003F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r79 = bone3.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(24, 56).mirror().addBox(0.15F, -0.2127F, 1.1849F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.4949F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r80 = bone3.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(0.15F, -4.4369F, 2.9789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(12, 76).mirror().addBox(0.15F, -4.4369F, 0.9789F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, -0.3604F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r81 = bone3.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(0.15F, -3.7045F, 0.5977F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.0323F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r82 = bone3.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(71, 5).mirror().addBox(0.15F, -2.1601F, 1.0255F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.8177F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r83 = bone3.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(0.15F, 0.9984F, -3.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.006F, 0.2961F, -1.9468F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r84 = bone3.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(0.15F, -0.0016F, -3.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.006F, 3.7657F, 2.5456F, -0.5934F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r85 = bone3.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(62, 21).mirror().addBox(0.15F, -1.0016F, -0.0527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.006F, 4.0103F, -0.6072F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r86 = bone3.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(11, 60).mirror().addBox(0.15F, -1.0016F, -0.0527F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 16).mirror().addBox(0.15F, -2.0016F, 0.8473F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.006F, 2.3833F, -4.2614F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = bone3.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(68, 80).mirror().addBox(0.15F, -0.0016F, -1.6527F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.006F, 0.8964F, -3.0999F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = bone3.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(40, 94).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0655F, 1.0536F, -1.853F, -0.404F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r89 = bone3.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(80, 65).mirror().addBox(0.15F, -2.1455F, -1.6441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.5559F, 0.1812F, 0.3996F));

		PartDefinition Bodyfront_r90 = bone3.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(0.15F, -2.233F, -0.3613F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.831F, 1.8785F, -0.3436F, 0.7305F, 0.1812F, 0.3996F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4703F, -3.7521F, -0.1929F, 0.1285F, -0.025F));

		PartDefinition cube_r68 = neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(56, 98).addBox(-0.5F, -2.1505F, 0.0535F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -2.0392F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = neck.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -3.5909F, 0.3716F, 0.8849F, -0.9168F));

		PartDefinition Bodyfront_r92 = neck.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(99, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -3.5909F, 0.6533F, 0.6745F, -0.5209F));

		PartDefinition Bodyfront_r93 = neck.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(39, 100).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -1.5909F, 0.1152F, 0.8249F, -1.3526F));

		PartDefinition Bodyfront_r94 = neck.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(88, 15).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -1.5909F, 0.4826F, 0.7059F, -0.8296F));

		PartDefinition Bodyfront_r95 = neck.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(34, 100).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -1.5909F, 0.6651F, 0.4798F, -0.5068F));

		PartDefinition Bodyfront_r96 = neck.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(85, 71).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -3.5909F, 0.3716F, -0.8849F, 0.9168F));

		PartDefinition Bodyfront_r97 = neck.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(99, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -3.5909F, 0.6533F, -0.6745F, 0.5209F));

		PartDefinition Bodyfront_r98 = neck.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(39, 100).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -1.5909F, 0.1152F, -0.8249F, 1.3526F));

		PartDefinition Bodyfront_r99 = neck.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(88, 15).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -1.5909F, 0.4826F, -0.7059F, 0.8296F));

		PartDefinition Bodyfront_r100 = neck.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(34, 100).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -1.5909F, 0.6651F, -0.4798F, 0.5068F));

		PartDefinition cube_r69 = neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(81, 94).addBox(-0.5F, -2.6977F, -0.0575F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -3.9392F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(13, 54).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3405F, -3.9069F, -0.077F, 0.229F, 0.1106F));

		PartDefinition cube_r71 = neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(77, 98).addBox(-0.5F, -2.4505F, 0.0535F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -2.0392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r101 = neck2.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -3.5909F, 0.2273F, 0.9832F, -0.991F));

		PartDefinition Bodyfront_r102 = neck2.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(88, 17).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -1.5909F, 0.1687F, 0.9877F, -1.0764F));

		PartDefinition Bodyfront_r103 = neck2.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(85, 73).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -3.5909F, 0.2273F, -0.9832F, 0.991F));

		PartDefinition Bodyfront_r104 = neck2.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(88, 17).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -1.5909F, 0.1687F, -0.9877F, 1.0764F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 14).addBox(-0.5F, -2.689F, 0.0421F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -4.0392F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(52, 55).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3217F, -3.8935F, 0.1805F, 0.3411F, 0.0874F));

		PartDefinition cube_r74 = neck3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 99).addBox(-0.5F, -2.7547F, 0.0489F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -2.0392F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r105 = neck3.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-2.4238F, -0.0541F, -0.3756F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2945F, -0.2729F, -1.6701F, 0.2018F, 0.8979F, -1.0226F));

		PartDefinition Bodyfront_r106 = neck3.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(85, 75).addBox(0.4238F, -0.0541F, -0.3756F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2945F, -0.2729F, -1.6701F, 0.2018F, -0.8979F, 1.0226F));

		PartDefinition cube_r75 = neck3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(31, 62).addBox(-1.0F, -2.9F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.283F, -2.7878F, 0.4517F, 0.1573F, 0.0759F));

		PartDefinition cube_r76 = neck4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 98).addBox(-0.5F, -2.0505F, 0.0535F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.0392F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r107 = neck4.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.2273F, 0.9832F, -0.991F));

		PartDefinition Bodyfront_r108 = neck4.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(88, 19).mirror().addBox(-1.9F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3883F, 0.1091F, -0.5027F, 0.1509F, 0.6744F, -1.0389F));

		PartDefinition Bodyfront_r109 = neck4.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(10, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.2273F, -0.9832F, 0.991F));

		PartDefinition Bodyfront_r110 = neck4.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(88, 19).addBox(-0.1F, -0.1F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3883F, 0.1091F, -0.5027F, 0.1509F, -0.6744F, 1.0389F));

		PartDefinition cube_r77 = neck4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(58, 79).addBox(-0.5F, -2.472F, -2.0499F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.9392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r78 = neck4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(39, 43).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4384F, -4.3963F, -0.1103F, 0.0F, 0.0F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(97, 59).addBox(-1.8F, -0.8454F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(39, 97).addBox(-1.6F, -0.8454F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(5, 97).addBox(-1.2F, -0.8454F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 82).addBox(-1.5F, -0.6954F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.0F, 1.2713F, -11.7811F, 0.2749F, 0.0F, 0.0F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(20, 97).addBox(-2.0F, -0.2954F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, 0.9672F, -11.5213F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(96, 79).addBox(-2.0F, -0.3954F, -0.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, 1.3173F, -11.6888F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(96, 76).addBox(-1.5F, -0.0204F, -0.9738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -0.1353F, -11.578F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(98, 55).addBox(-1.5F, 0.0048F, -0.9729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -0.8599F, -10.9531F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(98, 34).addBox(-1.5F, -0.013F, -0.9962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -1.2849F, -10.0531F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(94, 92).addBox(-2.0F, -0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.5F, -1.5099F, -9.1281F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(76, 17).addBox(-2.0F, 0.0F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.5F, -1.7492F, -7.4619F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(55, 61).addBox(-1.0F, -0.05F, -2.825F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -2.0458F, -4.6581F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0658F, -4.6171F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(51, 12).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4383F, -0.1892F, -1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 5).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0F, -1.561F, -0.2415F, -1.5446F, 0.0F, 0.0F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -1.8055F, -0.0099F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(92, 64).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0128F, -0.4649F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(56, 85).addBox(-0.5F, -0.225F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.0F, -2.5819F, -1.5216F, -1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, 0.05F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, -2.3781F, -0.6029F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(12, 73).addBox(-2.5F, 0.0F, -1.025F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -1.9728F, -1.1174F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(93, 23).addBox(-0.5412F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0412F, 1.363F, -11.1414F, 0.895F, 0.0F, 0.0F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(71, 31).addBox(-2.5F, 0.7F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.3748F, -0.3231F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(73, 0).addBox(-1.5F, -0.6F, -0.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -1.7102F, -2.5924F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 19).addBox(-1.5F, 0.0F, -2.025F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3894F, -2.7122F, 0.1571F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 2.0104F, 3.9196F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(89, 98).addBox(-1.0F, -0.013F, 0.0038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2253F, -2.8508F, -14.8762F, 0.4639F, -0.1568F, -0.1166F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 99).addBox(-0.708F, -0.5217F, 0.0666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.225F, -2.6074F, -14.6492F, 0.4352F, -0.192F, -0.0914F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(99, 8).addBox(-0.708F, -0.4889F, -0.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.225F, -2.6074F, -14.6492F, 0.5225F, -0.192F, -0.0914F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(98, 14).addBox(-0.725F, 0.0654F, -0.6529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.25F, -2.11F, -15.3956F, 0.3914F, 0.0738F, 0.1006F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(97, 98).addBox(-0.7F, -0.2666F, -0.3614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.225F, -2.4574F, -15.0493F, 0.9077F, 0.0175F, -0.0218F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 98).addBox(-0.7F, -0.3465F, -0.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.225F, -2.4574F, -15.0493F, 0.6983F, 0.0175F, -0.0218F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(98, 88).addBox(-0.775F, -0.2235F, -0.7432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.25F, -2.11F, -15.3956F, 1.1419F, 0.0738F, 0.1006F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(98, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.025F, -2.1558F, -15.0197F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(67, 98).addBox(-0.975F, 0.0048F, -0.9729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.2F, -2.8703F, -14.8726F, 0.8201F, -0.0191F, 0.0179F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(97, 71).addBox(-0.5F, -0.4415F, -0.2606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.125F, -0.9062F, -15.3774F, 0.6976F, 0.0781F, 0.105F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(97, 68).addBox(-0.5F, -0.4327F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-0.125F, -0.9062F, -15.3774F, 0.8722F, 0.0781F, 0.105F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(97, 65).addBox(-0.5F, -0.6223F, -0.6553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.125F, -0.9062F, -15.3774F, 0.2831F, 0.0781F, 0.105F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 92).addBox(-0.5F, 0.025F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(46, 61).addBox(-0.5F, 0.025F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.756F, -4.2818F, -6.7623F, -0.3034F, 0.1888F, -0.0984F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(97, 62).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.125F, -1.1261F, -15.6008F, 0.2732F, -0.0307F, 0.1092F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 90).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7782F, -4.095F, -7.3165F, 2.9299F, 0.1888F, -0.0984F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(88, 89).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.7362F, -3.4947F, -7.8437F, 2.4063F, 0.1888F, -0.0984F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(76, 13).addBox(-0.5F, -1.3F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F))
				.texOffs(10, 96).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0072F, -2.8014F, -6.7894F, 1.3591F, 0.1888F, -0.0984F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(76, 89).addBox(-0.511F, -0.9519F, -0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, -0.8017F, 0.3234F, -0.102F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 90).addBox(-0.511F, -0.6402F, -0.7588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, -1.6743F, 0.3234F, -0.102F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 31).addBox(-0.511F, -0.192F, -0.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, -2.8524F, 0.3234F, -0.102F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 90).addBox(-0.511F, -0.8641F, 0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, 2.7326F, 0.3234F, -0.102F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 91).addBox(-0.511F, -0.5476F, -0.7711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, 1.4236F, 0.3234F, -0.102F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(61, 91).addBox(-0.511F, 0.1555F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2044F, -2.6533F, -9.9329F, 1.5632F, 0.3234F, -0.102F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(97, 95).addBox(-0.4827F, 0.4888F, -2.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -1.4213F, 0.1541F, -0.0978F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5827F, 0.8131F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(93, 34).addBox(-0.4802F, -2.3574F, 0.1886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -2.0321F, 0.1541F, -0.0978F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(78, 70).addBox(-0.5827F, 0.5828F, -0.5324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -2.6866F, 0.1541F, -0.0978F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(51, 73).addBox(-0.5827F, -1.0997F, -0.3462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -2.9484F, 0.1541F, -0.0978F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(26, 93).addBox(-0.5827F, -0.9997F, -0.3212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -2.643F, 0.1541F, -0.0978F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(40, 62).addBox(-0.5827F, -1.6777F, 0.1969F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -2.0758F, 0.1541F, -0.0978F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(91, 50).addBox(-0.4802F, -2.1866F, 0.7684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(46, 56).addBox(-0.5827F, -1.5154F, 0.6575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -1.7703F, 0.1541F, -0.0978F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(89, 95).addBox(-0.5827F, 1.1679F, -1.1589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -0.8017F, 0.1541F, -0.0978F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(74, 95).addBox(-0.5827F, -0.1866F, -2.311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, -0.0163F, 0.1541F, -0.0978F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(76, 21).addBox(-0.5827F, -2.1758F, -0.8661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.6528F, -1.6752F, -4.447F, 1.1618F, 0.1541F, -0.0978F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(93, 56).addBox(-0.425F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(92, 70).addBox(-0.55F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9877F, -3.4314F, -7.2326F, 1.3591F, 0.1888F, -0.0984F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(48, 96).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.0163F, -2.0715F, -7.1169F, 2.7117F, 0.1888F, -0.0984F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(91, 39).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.0034F, -1.3895F, -7.5348F, -2.1316F, 0.1888F, -0.0984F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 91).addBox(-0.4F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(5, 94).addBox(-0.5F, -0.525F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9292F, -1.3292F, -7.9519F, -1.5644F, 0.1888F, -0.0984F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(45, 91).addBox(-0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.8684F, -1.8909F, -7.9797F, -0.7353F, 0.1888F, -0.0984F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(71, 70).addBox(-0.5F, -0.95F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5529F, -3.005F, -8.4765F, 0.1373F, 0.1888F, -0.0984F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0096F, -2.0592F, -2.945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, -1.955F, -8.4765F, 0.1171F, 0.3799F, -0.1041F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(51, 78).addBox(-0.5F, -0.225F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6096F, -0.2842F, -3.6772F, -1.7441F, 0.0622F, -0.083F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(91, 47).addBox(-0.9129F, -0.1213F, -0.0316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8163F, -3.2651F, -3.8279F, -1.0913F, 0.1757F, -0.0554F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(84, 97).addBox(-0.9118F, -0.4352F, 0.8853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8163F, -3.2651F, -3.8279F, -1.4009F, 0.1318F, -0.0836F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(79, 41).addBox(-0.9118F, 0.1327F, 0.9549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.8163F, -3.2651F, -3.8279F, -1.0955F, 0.1318F, -0.0836F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(34, 97).addBox(-0.975F, -0.0204F, -0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2011F, -2.1609F, -15.4917F, 1.2069F, 0.059F, 0.1176F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(44, 78).addBox(-0.9118F, 1.2376F, 1.7196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8163F, -3.2651F, -3.8279F, -0.7028F, 0.1318F, -0.0836F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(63, 51).addBox(-0.9118F, 2.6119F, -0.023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.8163F, -3.2651F, -3.8279F, -0.2926F, 0.1318F, -0.0836F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(31, 85).addBox(-0.5F, -0.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.2792F, -2.6869F, -4.7052F, -0.1858F, 0.1837F, -0.102F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(52, 49).addBox(-0.375F, -0.125F, -4.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.95F, -4.121F, -8.4597F, 0.1314F, 0.3766F, 0.0486F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(46, 82).addBox(-0.8F, -0.225F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8026F, -3.4639F, -6.5533F, -0.9771F, 1.2066F, -0.7563F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(81, 36).addBox(-1.8F, -0.45F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6552F, -3.9509F, -6.7685F, -0.7876F, 1.1787F, -0.7387F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(63, 41).addBox(-0.7F, -0.125F, -2.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.95F, -4.121F, -8.4597F, 2.9674F, 0.7909F, 3.0171F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(63, 56).addBox(-0.275F, -0.125F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(0.95F, -4.121F, -8.4597F, 0.1475F, 0.5927F, 0.0828F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(62, 5).addBox(-0.875F, 0.0F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.9F, -4.121F, -8.4597F, 0.1293F, 0.3334F, 0.0425F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 84).addBox(-0.5F, -3.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3672F, 0.2601F, -5.8487F, -0.0549F, 0.1837F, -0.102F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 82).addBox(-0.5F, -3.05F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1715F, 0.1204F, -6.8194F, -0.6396F, 0.1837F, -0.102F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(73, 84).addBox(-0.5F, -1.35F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.1672F, -1.4705F, -5.9713F, -0.1596F, 0.1837F, -0.102F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(92, 61).addBox(-1.0115F, -0.4449F, -1.7158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(63, 46).addBox(-1.0115F, -0.4449F, -1.0158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0603F, -2.2584F, -12.1484F, -0.3184F, 0.0057F, -0.0076F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(88, 35).addBox(-1.0115F, -1.4449F, -0.9908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1529F, -1.955F, -11.2265F, -0.3197F, 0.0886F, -0.035F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(88, 27).addBox(-0.9955F, -1.1195F, -0.9827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4529F, -1.955F, -10.2515F, -0.3471F, 0.3053F, -0.1051F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 46).addBox(-1.0256F, -1.6082F, -3.5934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.4346F, -5.1741F, -0.212F, 0.1837F, -0.102F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(35, 91).addBox(-0.5F, -0.4597F, -0.0953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 67).addBox(-0.5F, -0.5402F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9719F, -0.628F, -8.0747F, -0.0972F, 0.2184F, -0.0914F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5971F, -0.7466F, -9.1795F, -0.098F, 0.34F, -0.1064F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(93, 11).addBox(-0.7789F, -0.7005F, -1.622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0221F, -1.4466F, -12.7795F, -0.4072F, -0.042F, -0.1003F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(10, 93).addBox(-0.7789F, -0.841F, -0.7737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0221F, -1.4466F, -12.7795F, -0.189F, -0.042F, -0.1003F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(93, 89).addBox(-0.575F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1038F, -1.432F, -14.4711F, 1.0632F, 0.1094F, -0.0511F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(93, 86).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3028F, -0.8145F, -14.9451F, 0.905F, 0.1721F, 0.0649F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(86, 49).addBox(-0.723F, -1.328F, -0.8379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0279F, -1.4466F, -11.8795F, -0.1511F, 0.0144F, -0.1003F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(86, 45).addBox(-0.7575F, -1.2448F, -0.0563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0279F, -1.4466F, -11.8795F, -0.1706F, 0.2055F, -0.1024F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(93, 2).addBox(-0.746F, -0.8507F, -0.8119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3971F, -0.7466F, -10.4795F, -0.132F, 0.2532F, -0.1036F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(89, 92).addBox(-0.5013F, -0.6143F, -1.2934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5971F, -0.7466F, -9.1795F, -0.1366F, 0.3478F, -0.0722F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(5, 73).addBox(-1.0167F, -0.7587F, -1.9731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1779F, -1.955F, -8.4765F, -0.2328F, 0.3747F, -0.1077F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 2.0104F, 3.9196F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(89, 98).mirror().addBox(0.0F, -0.013F, 0.0038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2253F, -2.8508F, -14.8762F, 0.4639F, 0.1568F, 0.1166F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-0.292F, -0.5217F, 0.0666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -2.6074F, -14.6492F, 0.4352F, 0.192F, 0.0914F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(99, 8).mirror().addBox(-0.292F, -0.4889F, -0.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -2.6074F, -14.6492F, 0.5225F, 0.192F, 0.0914F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(98, 14).mirror().addBox(-0.275F, 0.0654F, -0.6529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -2.11F, -15.3956F, 0.3914F, -0.0738F, -0.1006F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-0.3F, -0.2666F, -0.3614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -2.4574F, -15.0493F, 0.9077F, -0.0175F, 0.0218F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-0.3F, -0.3465F, -0.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.225F, -2.4574F, -15.0493F, 0.6983F, -0.0175F, 0.0218F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(98, 88).mirror().addBox(-0.225F, -0.2235F, -0.7432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -2.11F, -15.3956F, 1.1419F, -0.0738F, -0.1006F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.025F, -2.1558F, -15.0197F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 98).mirror().addBox(-0.025F, 0.0048F, -0.9729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -2.8703F, -14.8726F, 0.8201F, 0.0191F, -0.0179F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(97, 71).mirror().addBox(-0.5F, -0.4415F, -0.2606F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.125F, -0.9062F, -15.3774F, 0.6976F, -0.0781F, -0.105F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(97, 68).mirror().addBox(-0.5F, -0.4327F, -0.6358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false), PartPose.offsetAndRotation(0.125F, -0.9062F, -15.3774F, 0.8722F, -0.0781F, -0.105F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(97, 65).mirror().addBox(-0.5F, -0.6223F, -0.6553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(0.125F, -0.9062F, -15.3774F, 0.2831F, -0.0781F, -0.105F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(66, 92).mirror().addBox(-0.5F, 0.025F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(46, 61).mirror().addBox(-0.5F, 0.025F, 0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.756F, -4.2818F, -6.7623F, -0.3034F, -0.1888F, 0.0984F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(97, 62).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.125F, -1.1261F, -15.6008F, 0.2732F, 0.0307F, -0.1092F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(27, 90).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7782F, -4.095F, -7.3165F, 2.9299F, -0.1888F, 0.0984F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.7362F, -3.4947F, -7.8437F, 2.4063F, -0.1888F, 0.0984F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-0.5F, -1.3F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(10, 96).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0072F, -2.8014F, -6.7894F, 1.3591F, -0.1888F, 0.0984F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(76, 89).mirror().addBox(-0.489F, -0.9519F, -0.1096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, -0.8017F, -0.3234F, 0.102F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.489F, -0.6402F, -0.7588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, -1.6743F, -0.3234F, 0.102F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-0.489F, -0.192F, -0.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, -2.8524F, -0.3234F, 0.102F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.489F, -0.8641F, 0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, 2.7326F, -0.3234F, 0.102F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-0.489F, -0.5476F, -0.7711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, 1.4236F, -0.3234F, 0.102F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-0.489F, 0.1555F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2044F, -2.6533F, -9.9329F, 1.5632F, -0.3234F, 0.102F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(97, 95).mirror().addBox(-0.5173F, 0.4888F, -2.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -1.4213F, -0.1541F, 0.0978F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.4173F, 0.8131F, -1.3457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(93, 34).mirror().addBox(-0.5198F, -2.3574F, 0.1886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -2.0321F, -0.1541F, 0.0978F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-0.4173F, 0.5828F, -0.5324F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -2.6866F, -0.1541F, 0.0978F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 73).mirror().addBox(-0.4173F, -1.0997F, -0.3462F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -2.9484F, -0.1541F, 0.0978F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(26, 93).mirror().addBox(-0.4173F, -0.9997F, -0.3212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -2.643F, -0.1541F, 0.0978F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(40, 62).mirror().addBox(-0.4173F, -1.6777F, 0.1969F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -2.0758F, -0.1541F, 0.0978F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(91, 50).mirror().addBox(-0.5198F, -2.1866F, 0.7684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(46, 56).mirror().addBox(-0.4173F, -1.5154F, 0.6575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -1.7703F, -0.1541F, 0.0978F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(89, 95).mirror().addBox(-0.4173F, 1.1679F, -1.1589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -0.8017F, -0.1541F, 0.0978F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 95).mirror().addBox(-0.4173F, -0.1866F, -2.311F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, -0.0163F, -0.1541F, 0.0978F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(76, 21).mirror().addBox(-0.4173F, -2.1758F, -0.8661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.6528F, -1.6752F, -4.447F, 1.1618F, -0.1541F, 0.0978F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-0.575F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(92, 70).mirror().addBox(-0.45F, -0.425F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9877F, -3.4314F, -7.2326F, 1.3591F, -0.1888F, 0.0984F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(48, 96).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.0163F, -2.0715F, -7.1169F, 2.7117F, -0.1888F, 0.0984F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.0034F, -1.3895F, -7.5348F, -2.1316F, -0.1888F, 0.0984F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.6F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(5, 94).mirror().addBox(-0.5F, -0.525F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9292F, -1.3292F, -7.9519F, -1.5644F, -0.1888F, 0.0984F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.5F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-0.8684F, -1.8909F, -7.9797F, -0.7353F, -0.1888F, 0.0984F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(71, 70).mirror().addBox(-0.5F, -0.95F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5529F, -3.005F, -8.4765F, 0.1373F, -0.1888F, 0.0984F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0096F, -2.0592F, -2.945F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1779F, -1.955F, -8.4765F, 0.1171F, -0.3799F, 0.1041F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(51, 78).mirror().addBox(-0.5F, -0.225F, -1.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6096F, -0.2842F, -3.6772F, -1.7441F, -0.0622F, 0.083F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-0.0871F, -0.1213F, -0.0316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8163F, -3.2651F, -3.8279F, -1.0913F, -0.1757F, 0.0554F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(84, 97).mirror().addBox(-0.0882F, -0.4352F, 0.8853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8163F, -3.2651F, -3.8279F, -1.4009F, -0.1318F, 0.0836F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(79, 41).mirror().addBox(-0.0882F, 0.1327F, 0.9549F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.8163F, -3.2651F, -3.8279F, -1.0955F, -0.1318F, 0.0836F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(34, 97).mirror().addBox(-0.025F, -0.0204F, -0.9988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.2011F, -2.1609F, -15.4917F, 1.2069F, -0.059F, -0.1176F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-0.0882F, 1.2376F, 1.7196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8163F, -3.2651F, -3.8279F, -0.7028F, -0.1318F, 0.0836F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-0.0882F, 2.6119F, -0.023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.8163F, -3.2651F, -3.8279F, -0.2926F, -0.1318F, 0.0836F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(31, 85).mirror().addBox(-0.5F, -0.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.2792F, -2.6869F, -4.7052F, -0.1858F, -0.1837F, 0.102F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-0.625F, -0.125F, -4.375F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -4.121F, -8.4597F, 0.1314F, -0.3766F, -0.0486F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(46, 82).mirror().addBox(-0.2F, -0.225F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8026F, -3.4639F, -6.5533F, -0.9771F, -1.2066F, 0.7563F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(81, 36).mirror().addBox(-0.2F, -0.45F, 0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6552F, -3.9509F, -6.7685F, -0.7876F, -1.1787F, 0.7387F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-0.3F, -0.125F, -2.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -4.121F, -8.4597F, 2.9674F, -0.7909F, -3.0171F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(63, 56).mirror().addBox(-0.725F, -0.125F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-0.95F, -4.121F, -8.4597F, 0.1475F, -0.5927F, -0.0828F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(62, 5).mirror().addBox(-0.125F, 0.0F, -3.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -4.121F, -8.4597F, 0.1293F, -0.3334F, -0.0425F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 84).mirror().addBox(-0.5F, -3.05F, 0.025F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3672F, 0.2601F, -5.8487F, -0.0549F, -0.1837F, 0.102F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(41, 82).mirror().addBox(-0.5F, -3.05F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1715F, 0.1204F, -6.8194F, -0.6396F, -0.1837F, 0.102F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 84).mirror().addBox(-0.5F, -1.35F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.1672F, -1.4705F, -5.9713F, -0.1596F, -0.1837F, 0.102F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(92, 61).mirror().addBox(0.0115F, -0.4449F, -1.7158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(63, 46).mirror().addBox(0.0115F, -0.4449F, -1.0158F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0603F, -2.2584F, -12.1484F, -0.3184F, -0.0057F, 0.0076F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(0.0115F, -1.4449F, -0.9908F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1529F, -1.955F, -11.2265F, -0.3197F, -0.0886F, 0.035F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.0045F, -1.1195F, -0.9827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4529F, -1.955F, -10.2515F, -0.3471F, -0.3053F, 0.1051F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(72, 46).mirror().addBox(0.0256F, -1.6082F, -3.5934F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, -0.4346F, -5.1741F, -0.212F, -0.1837F, 0.102F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.5F, -0.4597F, -0.0953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(92, 67).mirror().addBox(-0.5F, -0.5402F, -0.9047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9719F, -0.628F, -8.0747F, -0.0972F, -0.2184F, 0.0914F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5971F, -0.7466F, -9.1795F, -0.098F, -0.34F, 0.1064F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(93, 11).mirror().addBox(-0.2211F, -0.7005F, -1.622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0221F, -1.4466F, -12.7795F, -0.4072F, 0.042F, 0.1003F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.2211F, -0.841F, -0.7737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0221F, -1.4466F, -12.7795F, -0.189F, 0.042F, 0.1003F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(93, 89).mirror().addBox(-0.425F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1038F, -1.432F, -14.4711F, 1.0632F, -0.1094F, 0.0511F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(93, 86).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3028F, -0.8145F, -14.9451F, 0.905F, -0.1721F, -0.0649F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.277F, -1.328F, -0.8379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0279F, -1.4466F, -11.8795F, -0.1511F, -0.0144F, 0.1003F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-0.2425F, -1.2448F, -0.0563F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0279F, -1.4466F, -11.8795F, -0.1706F, -0.2055F, 0.1024F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(93, 2).mirror().addBox(-0.254F, -0.8507F, -0.8119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3971F, -0.7466F, -10.4795F, -0.132F, -0.2532F, 0.1036F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(-0.4987F, -0.6143F, -1.2934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5971F, -0.7466F, -9.1795F, -0.1366F, -0.3478F, 0.0722F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(0.0167F, -0.7587F, -1.9731F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1779F, -1.955F, -8.4765F, -0.2328F, -0.3747F, 0.1077F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9262F, 1.8705F, 0.0086F, -0.0296F, -0.043F));

		PartDefinition cube_r244 = lower_jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(0.0291F, 0.8745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(17, 89).mirror().addBox(0.0291F, 1.6745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 86).mirror().addBox(0.0291F, 2.4745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.975F, 1.79F, -6.115F, -1.405F, -0.3491F, 0.0F));

		PartDefinition cube_r245 = lower_jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(0.1441F, 0.6347F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7571F, 1.4548F, -10.8365F, -1.5359F, 0.0349F, 0.0F));

		PartDefinition cube_r246 = lower_jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(0.1441F, -0.1545F, -0.5077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7571F, 1.4548F, -10.8365F, -1.6668F, 0.0349F, 0.0F));

		PartDefinition cube_r247 = lower_jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(83, 88).mirror().addBox(-0.0647F, 0.5241F, -0.2653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7071F, 1.4548F, -9.4615F, -1.6668F, -0.1396F, 0.0F));

		PartDefinition cube_r248 = lower_jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.0647F, -0.2594F, -0.2805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7071F, 1.4548F, -9.4615F, -1.5795F, -0.1396F, 0.0F));

		PartDefinition cube_r249 = lower_jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(83, 5).mirror().addBox(0.0291F, 1.1745F, -0.7004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -1.405F, -0.3491F, 0.0F));

		PartDefinition cube_r250 = lower_jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(66, 89).mirror().addBox(0.0291F, 0.1578F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -1.3177F, -0.3491F, 0.0F));

		PartDefinition cube_r251 = lower_jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(0.0815F, 0.9952F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.79F, -4.615F, -1.2654F, -0.2269F, 0.0F));

		PartDefinition cube_r252 = lower_jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(76, 92).mirror().addBox(0.0815F, 0.0589F, -0.4319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.79F, -4.615F, -1.1606F, -0.2269F, 0.0F));

		PartDefinition cube_r253 = lower_jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(0.1999F, 3.649F, -2.4277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, -1.1606F, -0.1571F, 0.0F));

		PartDefinition cube_r254 = lower_jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(31, 80).mirror().addBox(0.1999F, 2.0256F, -0.4875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(81, 31).mirror().addBox(0.1999F, 1.2256F, -1.1875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, -1.4748F, -0.1571F, 0.0F));

		PartDefinition cube_r255 = lower_jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(1.6579F, 0.7842F, -4.8327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -0.2662F, 0.0873F, 0.0F));

		PartDefinition cube_r256 = lower_jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.108F, 1.7395F, -11.5346F, -0.1353F, 0.0873F, 0.0F));

		PartDefinition cube_r257 = lower_jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(35, 94).mirror().addBox(1.558F, -1.4858F, -6.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, 0.144F, 0.0873F, 0.0F));

		PartDefinition cube_r258 = lower_jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(94, 42).mirror().addBox(1.6579F, 2.1517F, -5.2375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -0.5018F, 0.0873F, 0.0F));

		PartDefinition cube_r259 = lower_jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(81, 91).mirror().addBox(1.6579F, 0.7039F, -5.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -0.1963F, 0.0873F, 0.0F));

		PartDefinition cube_r260 = lower_jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(56, 95).mirror().addBox(0.8589F, 0.2616F, -4.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -0.1091F, -0.0873F, 0.0F));

		PartDefinition cube_r261 = lower_jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(95, 19).mirror().addBox(0.8589F, -0.067F, -3.8077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, -0.0218F, -0.0873F, 0.0F));

		PartDefinition cube_r262 = lower_jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(19, 80).mirror().addBox(0.0291F, -0.1887F, -3.5928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, 0.0131F, -0.3491F, 0.0F));

		PartDefinition cube_r263 = lower_jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(0.0291F, -0.3398F, -1.7588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, 0.1004F, -0.3491F, 0.0F));

		PartDefinition cube_r264 = lower_jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(95, 5).mirror().addBox(0.0291F, -0.3737F, -0.7878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.79F, -6.115F, 0.144F, -0.3491F, 0.0F));

		PartDefinition cube_r265 = lower_jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(73, 66).mirror().addBox(0.0815F, 0.594F, -1.3948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2F, 0.79F, -4.615F, 0.0044F, -0.2269F, 0.0F));

		PartDefinition cube_r266 = lower_jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(0.1999F, -0.0563F, -4.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, 0.144F, -0.1571F, 0.0F));

		PartDefinition cube_r267 = lower_jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(0.1999F, -1.2452F, -3.6243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, 0.1963F, -0.1571F, 0.0F));

		PartDefinition cube_r268 = lower_jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(0.1999F, -1.191F, -2.731F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, 0.5454F, -0.1571F, 0.0F));

		PartDefinition cube_r269 = lower_jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(15, 92).mirror().addBox(0.1999F, -1.1252F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, 0.7418F, -0.0349F, 0.0F));

		PartDefinition cube_r270 = lower_jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(0.1999F, -1.075F, -1.3535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.79F, 0.31F, 0.0F, -0.1571F, 0.0F));

		PartDefinition cube_r271 = lower_jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(56, 89).addBox(-1.0291F, 0.8745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(17, 89).addBox(-1.0291F, 1.6745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 86).addBox(-1.0291F, 2.4745F, -1.2004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.975F, 1.79F, -6.115F, -1.405F, 0.3491F, 0.0F));

		PartDefinition cube_r272 = lower_jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(88, 77).addBox(-1.1441F, 0.6347F, -0.7572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7571F, 1.4548F, -10.8365F, -1.5359F, -0.0349F, 0.0F));

		PartDefinition cube_r273 = lower_jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(88, 83).addBox(-1.1441F, -0.1545F, -0.5077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7571F, 1.4548F, -10.8365F, -1.6668F, -0.0349F, 0.0F));

		PartDefinition cube_r274 = lower_jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(83, 88).addBox(-0.9353F, 0.5241F, -0.2653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7071F, 1.4548F, -9.4615F, -1.6668F, 0.1396F, 0.0F));

		PartDefinition cube_r275 = lower_jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(88, 80).addBox(-0.9353F, -0.2594F, -0.2805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7071F, 1.4548F, -9.4615F, -1.5795F, 0.1396F, 0.0F));

		PartDefinition cube_r276 = lower_jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(83, 5).addBox(-1.0291F, 1.1745F, -0.7004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -1.405F, 0.3491F, 0.0F));

		PartDefinition cube_r277 = lower_jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(66, 89).addBox(-1.0291F, 0.1578F, -0.8025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -1.3177F, 0.3491F, 0.0F));

		PartDefinition cube_r278 = lower_jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(71, 89).addBox(-1.0815F, 0.9952F, -0.3265F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2F, 0.79F, -4.615F, -1.2654F, 0.2269F, 0.0F));

		PartDefinition cube_r279 = lower_jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(76, 92).addBox(-1.0815F, 0.0589F, -0.4319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.2F, 0.79F, -4.615F, -1.1606F, 0.2269F, 0.0F));

		PartDefinition cube_r280 = lower_jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(92, 73).addBox(-1.1999F, 3.649F, -2.4277F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, -1.1606F, 0.1571F, 0.0F));

		PartDefinition cube_r281 = lower_jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(31, 80).addBox(-1.1999F, 2.0256F, -0.4875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(81, 31).addBox(-1.1999F, 1.2256F, -1.1875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, -1.4748F, 0.1571F, 0.0F));

		PartDefinition cube_r282 = lower_jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(15, 98).addBox(-2.6579F, 0.7842F, -4.8327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -0.2662F, -0.0873F, 0.0F));

		PartDefinition cube_r283 = lower_jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(94, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.108F, 1.7395F, -11.5346F, -0.1353F, -0.0873F, 0.0F));

		PartDefinition cube_r284 = lower_jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(35, 94).addBox(-2.558F, -1.4858F, -6.1477F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, 0.144F, -0.0873F, 0.0F));

		PartDefinition cube_r285 = lower_jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(94, 42).addBox(-2.6579F, 2.1517F, -5.2375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -0.5018F, -0.0873F, 0.0F));

		PartDefinition cube_r286 = lower_jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(81, 91).addBox(-2.6579F, 0.7039F, -5.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -0.1963F, -0.0873F, 0.0F));

		PartDefinition cube_r287 = lower_jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(56, 95).addBox(-1.8589F, 0.2616F, -4.7101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -0.1091F, 0.0873F, 0.0F));

		PartDefinition cube_r288 = lower_jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(95, 19).addBox(-1.8589F, -0.067F, -3.8077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, -0.0218F, 0.0873F, 0.0F));

		PartDefinition cube_r289 = lower_jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(19, 80).addBox(-1.0291F, -0.1887F, -3.5928F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, 0.0131F, 0.3491F, 0.0F));

		PartDefinition cube_r290 = lower_jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(15, 95).addBox(-1.0291F, -0.3398F, -1.7588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, 0.1004F, 0.3491F, 0.0F));

		PartDefinition cube_r291 = lower_jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(95, 5).addBox(-1.0291F, -0.3737F, -0.7878F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 1.79F, -6.115F, 0.144F, 0.3491F, 0.0F));

		PartDefinition cube_r292 = lower_jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(73, 66).addBox(-1.0815F, 0.594F, -1.3948F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 0.79F, -4.615F, 0.0044F, 0.2269F, 0.0F));

		PartDefinition cube_r293 = lower_jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(71, 92).addBox(-1.1999F, -0.0563F, -4.5788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, 0.144F, 0.1571F, 0.0F));

		PartDefinition cube_r294 = lower_jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(86, 31).addBox(-1.1999F, -1.2452F, -3.6243F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, 0.1963F, 0.1571F, 0.0F));

		PartDefinition cube_r295 = lower_jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(64, 0).addBox(-1.1999F, -1.191F, -2.731F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, 0.5454F, 0.1571F, 0.0F));

		PartDefinition cube_r296 = lower_jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(15, 92).addBox(-1.1999F, -1.1252F, 0.2493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, 0.7418F, 0.0349F, 0.0F));

		PartDefinition cube_r297 = lower_jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(91, 53).addBox(-1.1999F, -1.075F, -1.3535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 0.79F, 0.31F, 0.0F, 0.1571F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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