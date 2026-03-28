package fossils.fossils.client.blockentity.model.piscobalaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PiscobalaenaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart Baleen;
	private final ModelPart Baleen2;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public PiscobalaenaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.Baleen = this.head.getChild("Baleen");
		this.Baleen2 = this.head.getChild("Baleen2");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -165.0543F, -13.5138F, -1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(121, 196).addBox(-0.5F, -6.2869F, 0.2355F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(111, 134).addBox(-0.5F, -6.2869F, -2.7645F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(69, 193).addBox(-0.5F, -8.9869F, 6.2355F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(195, 72).addBox(-0.5F, -7.6869F, 3.2355F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -4.4206F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(194, 170).mirror().addBox(2.666F, -0.7805F, 7.9666F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0354F, -2.6206F, 0.3834F, 0.3737F, -1.477F));

		PartDefinition chest16_r1 = chest.addOrReplaceChild("chest16_r1", CubeListBuilder.create().texOffs(180, 72).mirror().addBox(-10.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.1354F, 3.0794F, 0.2671F, 0.2419F, -0.2151F));

		PartDefinition chest17_r1 = chest.addOrReplaceChild("chest17_r1", CubeListBuilder.create().texOffs(143, 125).mirror().addBox(-17.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.1354F, 3.0794F, 0.139F, 0.3314F, -0.6608F));

		PartDefinition chest18_r1 = chest.addOrReplaceChild("chest18_r1", CubeListBuilder.create().texOffs(135, 9).mirror().addBox(-22.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.1354F, 3.0794F, -0.0686F, 0.352F, -1.2635F));

		PartDefinition chest19_r1 = chest.addOrReplaceChild("chest19_r1", CubeListBuilder.create().texOffs(96, 41).mirror().addBox(-25.7926F, -24.5393F, -0.86F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.1354F, 3.0794F, -0.2389F, 0.2697F, -1.8074F));

		PartDefinition chest16_r2 = chest.addOrReplaceChild("chest16_r2", CubeListBuilder.create().texOffs(180, 78).mirror().addBox(-10.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3F, 1.6354F, -2.0206F, 0.093F, 0.2013F, -0.2534F));

		PartDefinition chest17_r2 = chest.addOrReplaceChild("chest17_r2", CubeListBuilder.create().texOffs(142, 73).mirror().addBox(-17.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3F, 1.6354F, -2.0206F, -0.002F, 0.2214F, -0.6994F));

		PartDefinition chest18_r2 = chest.addOrReplaceChild("chest18_r2", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-22.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3F, 1.6354F, -2.0206F, -0.1221F, 0.1852F, -1.2777F));

		PartDefinition chest19_r2 = chest.addOrReplaceChild("chest19_r2", CubeListBuilder.create().texOffs(154, 36).mirror().addBox(-18.7926F, -24.5393F, -0.86F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3F, 1.6354F, -2.0206F, -0.198F, 0.0998F, -1.7999F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(196, 63).mirror().addBox(2.666F, -2.3379F, 5.5728F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8354F, -5.7206F, 0.1216F, 0.3737F, -1.477F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(196, 57).mirror().addBox(2.666F, 0.1195F, 8.2666F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8354F, -5.7206F, 0.3834F, 0.3737F, -1.477F));

		PartDefinition chest18_r3 = chest.addOrReplaceChild("chest18_r3", CubeListBuilder.create().texOffs(119, 88).mirror().addBox(-23.7926F, -24.5394F, -0.86F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, 0.9354F, 0.5794F, -0.2222F, 0.2018F, -1.8035F));

		PartDefinition chest17_r3 = chest.addOrReplaceChild("chest17_r3", CubeListBuilder.create().texOffs(135, 12).mirror().addBox(-22.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, 0.9354F, 0.5794F, -0.0906F, 0.2854F, -1.2704F));

		PartDefinition chest16_r3 = chest.addOrReplaceChild("chest16_r3", CubeListBuilder.create().texOffs(144, 79).mirror().addBox(-17.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, 0.9354F, 0.5794F, 0.0815F, 0.2881F, -0.6783F));

		PartDefinition chest15_r1 = chest.addOrReplaceChild("chest15_r1", CubeListBuilder.create().texOffs(180, 38).mirror().addBox(-10.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, 0.9354F, 0.5794F, 0.1971F, 0.2264F, -0.2313F));

		PartDefinition chest14_r1 = chest.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(184, 130).mirror().addBox(-9.6206F, -1.9477F, -0.7327F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6F, 1.8354F, -3.6206F, 0.1145F, 0.0627F, -0.3528F));

		PartDefinition chest15_r2 = chest.addOrReplaceChild("chest15_r2", CubeListBuilder.create().texOffs(144, 76).mirror().addBox(-17.8961F, -5.8311F, -0.7327F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6F, 1.8354F, -3.6206F, 0.0774F, 0.1051F, -0.7886F));

		PartDefinition chest16_r4 = chest.addOrReplaceChild("chest16_r4", CubeListBuilder.create().texOffs(135, 3).mirror().addBox(-22.9363F, -14.5543F, -0.754F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6F, 1.8354F, -3.6206F, 0.0085F, 0.1302F, -1.3594F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(196, 63).addBox(-3.666F, -2.3379F, 5.5728F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -5.7206F, 0.1216F, -0.3737F, 1.477F));

		PartDefinition chest18_r4 = chest.addOrReplaceChild("chest18_r4", CubeListBuilder.create().texOffs(96, 41).addBox(11.7926F, -24.5393F, -0.86F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.1354F, 3.0794F, -0.2389F, -0.2697F, 1.8074F));

		PartDefinition chest17_r4 = chest.addOrReplaceChild("chest17_r4", CubeListBuilder.create().texOffs(135, 9).addBox(11.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.1354F, 3.0794F, -0.0686F, -0.352F, 1.2635F));

		PartDefinition chest16_r5 = chest.addOrReplaceChild("chest16_r5", CubeListBuilder.create().texOffs(143, 125).addBox(7.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.1354F, 3.0794F, 0.139F, -0.3314F, 0.6608F));

		PartDefinition chest15_r3 = chest.addOrReplaceChild("chest15_r3", CubeListBuilder.create().texOffs(180, 72).addBox(5.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.1354F, 3.0794F, 0.2671F, -0.2419F, 0.2151F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(194, 170).addBox(-3.666F, -0.7805F, 7.9666F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.0354F, -2.6206F, 0.3834F, -0.3737F, 1.477F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(196, 57).addBox(-3.666F, 0.1195F, 8.2666F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -5.7206F, 0.3834F, -0.3737F, 1.477F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(179, 194).addBox(-0.5F, -4.4127F, 1.1154F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.5646F, 2.8794F, 0.0698F, 0.0F, 0.0F));

		PartDefinition chest18_r5 = chest.addOrReplaceChild("chest18_r5", CubeListBuilder.create().texOffs(154, 36).addBox(11.7926F, -24.5393F, -0.86F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 1.6354F, -2.0206F, -0.198F, -0.0998F, 1.7999F));

		PartDefinition chest17_r5 = chest.addOrReplaceChild("chest17_r5", CubeListBuilder.create().texOffs(135, 0).addBox(11.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 1.6354F, -2.0206F, -0.1221F, -0.1852F, 1.2777F));

		PartDefinition chest16_r6 = chest.addOrReplaceChild("chest16_r6", CubeListBuilder.create().texOffs(142, 73).addBox(7.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 1.6354F, -2.0206F, -0.002F, -0.2214F, 0.6994F));

		PartDefinition chest15_r4 = chest.addOrReplaceChild("chest15_r4", CubeListBuilder.create().texOffs(180, 78).addBox(5.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3F, 1.6354F, -2.0206F, 0.093F, -0.2013F, 0.2534F));

		PartDefinition chest17_r6 = chest.addOrReplaceChild("chest17_r6", CubeListBuilder.create().texOffs(119, 88).addBox(11.7926F, -24.5394F, -0.86F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 0.9354F, 0.5794F, -0.2222F, -0.2018F, 1.8035F));

		PartDefinition chest16_r7 = chest.addOrReplaceChild("chest16_r7", CubeListBuilder.create().texOffs(135, 12).addBox(11.4857F, -15.3813F, -0.86F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 0.9354F, 0.5794F, -0.0906F, -0.2854F, 1.2704F));

		PartDefinition chest15_r5 = chest.addOrReplaceChild("chest15_r5", CubeListBuilder.create().texOffs(144, 79).addBox(7.9605F, -6.7707F, -0.8387F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 0.9354F, 0.5794F, 0.0815F, -0.2881F, 0.6783F));

		PartDefinition chest14_r2 = chest.addOrReplaceChild("chest14_r2", CubeListBuilder.create().texOffs(180, 38).addBox(5.0761F, -2.772F, -0.8387F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, 0.9354F, 0.5794F, 0.1971F, -0.2264F, 0.2313F));

		PartDefinition chest13_r1 = chest.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(184, 130).addBox(5.6206F, -1.9477F, -0.7327F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 1.8354F, -3.6206F, 0.1145F, -0.0627F, 0.3528F));

		PartDefinition chest14_r3 = chest.addOrReplaceChild("chest14_r3", CubeListBuilder.create().texOffs(144, 76).addBox(7.8961F, -5.8311F, -0.7327F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 1.8354F, -3.6206F, 0.0774F, -0.1051F, 0.7886F));

		PartDefinition chest15_r6 = chest.addOrReplaceChild("chest15_r6", CubeListBuilder.create().texOffs(135, 3).addBox(11.9362F, -14.5543F, -0.754F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6F, 1.8354F, -3.6206F, 0.0085F, -0.1302F, 1.3594F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 94).addBox(-2.0F, -3.9834F, 0.0097F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.8354F, -4.4206F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(82, 91).addBox(-2.0F, -1.5841F, -0.1731F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2027F, 6.8691F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(38, 187).addBox(-0.5F, -4.5056F, 0.1123F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6841F, 9.9269F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(31, 187).addBox(-0.5F, -4.4001F, -1.1087F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0841F, 7.9269F, -0.2793F, 0.0F, 0.0F));

		PartDefinition chest14_r4 = body6.addOrReplaceChild("chest14_r4", CubeListBuilder.create().texOffs(189, 69).mirror().addBox(-8.0009F, -1.9891F, -0.7822F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2616F, -0.8177F, 8.4655F, 0.0292F, 0.3601F, -0.3515F));

		PartDefinition chest15_r7 = body6.addOrReplaceChild("chest15_r7", CubeListBuilder.create().texOffs(61, 144).mirror().addBox(-16.4106F, -5.1841F, -0.7822F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2616F, -0.8177F, 8.4655F, -0.1319F, 0.3372F, -0.8156F));

		PartDefinition chest16_r8 = body6.addOrReplaceChild("chest16_r8", CubeListBuilder.create().texOffs(138, 141).mirror().addBox(-22.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2616F, -0.8177F, 8.4655F, -0.2932F, 0.214F, -1.3921F));

		PartDefinition chest17_r7 = body6.addOrReplaceChild("chest17_r7", CubeListBuilder.create().texOffs(148, 88).mirror().addBox(-21.4842F, -22.432F, -0.8035F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2616F, -0.8177F, 8.4655F, -0.3588F, 0.0427F, -1.8917F));

		PartDefinition cube_r12 = body6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(158, 188).mirror().addBox(-0.5F, -3.0F, -0.7F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8713F, -1.6951F, 10.313F, 0.0694F, 0.0985F, -1.3584F));

		PartDefinition cube_r13 = body6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 191).mirror().addBox(-1.1F, -4.6F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5228F, -1.7731F, 7.3569F, 0.1479F, 0.0187F, -1.326F));

		PartDefinition cube_r14 = body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(193, 184).mirror().addBox(-1.0F, -2.9F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1458F, -1.7768F, 0.3637F, 0.1043F, 0.0187F, -1.326F));

		PartDefinition cube_r15 = body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(191, 8).mirror().addBox(-1.1F, -4.9F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5841F, 5.3269F, 0.2875F, 0.0187F, -1.326F));

		PartDefinition chest13_r2 = body6.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(177, 106).mirror().addBox(-7.8983F, -1.956F, -0.7912F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5384F, -1.1177F, -0.9345F, 0.0624F, 0.3249F, -0.34F));

		PartDefinition chest14_r5 = body6.addOrReplaceChild("chest14_r5", CubeListBuilder.create().texOffs(144, 82).mirror().addBox(-16.3316F, -5.1107F, -0.7912F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5384F, -1.1177F, -0.9345F, -0.0858F, 0.3197F, -0.8004F));

		PartDefinition chest15_r8 = body6.addOrReplaceChild("chest15_r8", CubeListBuilder.create().texOffs(142, 67).mirror().addBox(-22.0038F, -13.1061F, -0.8125F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5384F, -1.1177F, -0.9345F, -0.246F, 0.2232F, -1.3815F));

		PartDefinition chest16_r9 = body6.addOrReplaceChild("chest16_r9", CubeListBuilder.create().texOffs(96, 44).mirror().addBox(-25.5128F, -22.328F, -0.8125F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5384F, -1.1177F, -0.9345F, -0.3228F, 0.073F, -1.8893F));

		PartDefinition chest15_r9 = body6.addOrReplaceChild("chest15_r9", CubeListBuilder.create().texOffs(142, 64).mirror().addBox(-22.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2384F, -1.1177F, 5.6655F, -0.2964F, 0.1968F, -1.3928F));

		PartDefinition chest16_r10 = body6.addOrReplaceChild("chest16_r10", CubeListBuilder.create().texOffs(111, 140).mirror().addBox(-23.4842F, -22.432F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2384F, -1.1177F, 5.6655F, -0.3533F, 0.0261F, -1.8915F));

		PartDefinition chest14_r6 = body6.addOrReplaceChild("chest14_r6", CubeListBuilder.create().texOffs(144, 85).mirror().addBox(-16.4106F, -5.1841F, -0.7823F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2384F, -1.1177F, 5.6655F, -0.1445F, 0.3245F, -0.8197F));

		PartDefinition chest13_r3 = body6.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(174, 60).mirror().addBox(-8.0009F, -1.9891F, -0.7823F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2384F, -1.1177F, 5.6655F, 0.0118F, 0.354F, -0.3576F));

		PartDefinition chest12_r1 = body6.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(173, 35).mirror().addBox(-8.0009F, -1.9891F, -0.7823F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4384F, -1.1177F, 2.1655F, 0.0118F, 0.354F, -0.3576F));

		PartDefinition chest13_r4 = body6.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(136, 144).mirror().addBox(-16.4106F, -5.1841F, -0.7823F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4384F, -1.1177F, 2.1655F, -0.1445F, 0.3245F, -0.8197F));

		PartDefinition chest15_r10 = body6.addOrReplaceChild("chest15_r10", CubeListBuilder.create().texOffs(125, 38).mirror().addBox(-24.4842F, -22.432F, -0.8035F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4384F, -1.1177F, 2.1655F, -0.3533F, 0.0261F, -1.8915F));

		PartDefinition chest14_r7 = body6.addOrReplaceChild("chest14_r7", CubeListBuilder.create().texOffs(142, 70).mirror().addBox(-22.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4384F, -1.1177F, 2.1655F, -0.2964F, 0.1968F, -1.3928F));

		PartDefinition cube_r16 = body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(158, 188).addBox(-0.5F, -3.0F, -0.7F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8713F, -1.6951F, 10.313F, 0.0694F, -0.0985F, 1.3584F));

		PartDefinition cube_r17 = body6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 191).addBox(0.1F, -4.6F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5228F, -1.7731F, 7.3569F, 0.1479F, -0.0187F, 1.326F));

		PartDefinition cube_r18 = body6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(193, 184).addBox(0.0F, -2.9F, -0.9F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1458F, -1.7768F, 0.3637F, 0.1043F, -0.0187F, 1.326F));

		PartDefinition cube_r19 = body6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(191, 8).addBox(0.1F, -4.9F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5841F, 5.3269F, 0.2875F, -0.0187F, 1.326F));

		PartDefinition cube_r20 = body6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(186, 184).addBox(-0.5F, -5.0651F, -0.0003F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5841F, 3.8269F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(191, 0).addBox(-0.5F, -4.4495F, -0.184F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0841F, -0.0731F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest12_r2 = body6.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(177, 106).addBox(2.8983F, -1.956F, -0.7912F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5384F, -1.1177F, -0.9345F, 0.0624F, -0.3249F, 0.34F));

		PartDefinition chest13_r5 = body6.addOrReplaceChild("chest13_r5", CubeListBuilder.create().texOffs(144, 82).addBox(6.3316F, -5.1107F, -0.7912F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5384F, -1.1177F, -0.9345F, -0.0858F, -0.3197F, 0.8004F));

		PartDefinition chest14_r8 = body6.addOrReplaceChild("chest14_r8", CubeListBuilder.create().texOffs(142, 67).addBox(11.0038F, -13.1061F, -0.8125F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5384F, -1.1177F, -0.9345F, -0.246F, -0.2232F, 1.3815F));

		PartDefinition chest15_r11 = body6.addOrReplaceChild("chest15_r11", CubeListBuilder.create().texOffs(96, 44).addBox(12.5128F, -22.328F, -0.8125F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5384F, -1.1177F, -0.9345F, -0.3228F, -0.073F, 1.8893F));

		PartDefinition chest16_r11 = body6.addOrReplaceChild("chest16_r11", CubeListBuilder.create().texOffs(148, 88).addBox(12.4842F, -22.432F, -0.8035F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.8177F, 8.4655F, -0.3588F, -0.0427F, 1.8917F));

		PartDefinition chest15_r12 = body6.addOrReplaceChild("chest15_r12", CubeListBuilder.create().texOffs(138, 141).addBox(11.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.8177F, 8.4655F, -0.2932F, -0.214F, 1.3921F));

		PartDefinition chest14_r9 = body6.addOrReplaceChild("chest14_r9", CubeListBuilder.create().texOffs(61, 144).addBox(6.4106F, -5.1841F, -0.7822F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.8177F, 8.4655F, -0.1319F, -0.3372F, 0.8156F));

		PartDefinition chest13_r6 = body6.addOrReplaceChild("chest13_r6", CubeListBuilder.create().texOffs(189, 69).addBox(5.0009F, -1.9891F, -0.7822F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2616F, -0.8177F, 8.4655F, 0.0292F, -0.3601F, 0.3515F));

		PartDefinition chest14_r10 = body6.addOrReplaceChild("chest14_r10", CubeListBuilder.create().texOffs(142, 64).addBox(11.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2384F, -1.1177F, 5.6655F, -0.2964F, -0.1968F, 1.3928F));

		PartDefinition chest15_r13 = body6.addOrReplaceChild("chest15_r13", CubeListBuilder.create().texOffs(111, 140).addBox(12.4842F, -22.432F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2384F, -1.1177F, 5.6655F, -0.3533F, -0.0261F, 1.8915F));

		PartDefinition chest13_r7 = body6.addOrReplaceChild("chest13_r7", CubeListBuilder.create().texOffs(144, 85).addBox(6.4106F, -5.1841F, -0.7823F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2384F, -1.1177F, 5.6655F, -0.1445F, -0.3245F, 0.8197F));

		PartDefinition chest12_r3 = body6.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(174, 60).addBox(3.0009F, -1.9891F, -0.7823F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2384F, -1.1177F, 5.6655F, 0.0118F, -0.354F, 0.3576F));

		PartDefinition chest11_r1 = body6.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(173, 35).addBox(3.0009F, -1.9891F, -0.7823F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4384F, -1.1177F, 2.1655F, 0.0118F, -0.354F, 0.3576F));

		PartDefinition chest12_r4 = body6.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(136, 144).addBox(6.4106F, -5.1841F, -0.7823F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4384F, -1.1177F, 2.1655F, -0.1445F, -0.3245F, 0.8197F));

		PartDefinition chest14_r11 = body6.addOrReplaceChild("chest14_r11", CubeListBuilder.create().texOffs(125, 38).addBox(12.4842F, -22.432F, -0.8035F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4384F, -1.1177F, 2.1655F, -0.3533F, -0.0261F, 1.8915F));

		PartDefinition chest13_r8 = body6.addOrReplaceChild("chest13_r8", CubeListBuilder.create().texOffs(142, 70).addBox(11.031F, -13.2105F, -0.8035F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4384F, -1.1177F, 2.1655F, -0.2964F, -0.1968F, 1.3928F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5893F, 12.8291F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 164).addBox(-0.5F, -7.0611F, -0.052F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 12.6F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(163, 163).addBox(-0.5F, -7.0372F, -0.0391F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 7.6F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(73, 123).addBox(-0.5F, -6.79F, -0.0264F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 3.6F, -0.288F, 0.0F, 0.0F));

		PartDefinition chest21_r1 = body.addOrReplaceChild("chest21_r1", CubeListBuilder.create().texOffs(143, 122).mirror().addBox(-12.0847F, -0.1393F, -0.1348F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 8.2171F, 0.0094F, 0.438F, -0.718F));

		PartDefinition chest20_r1 = body.addOrReplaceChild("chest20_r1", CubeListBuilder.create().texOffs(186, 151).mirror().addBox(-1.9483F, 0.7548F, -0.1348F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 8.2171F, 0.2036F, 0.3906F, -0.2434F));

		PartDefinition chest22_r1 = body.addOrReplaceChild("chest22_r1", CubeListBuilder.create().texOffs(169, 23).mirror().addBox(-16.0931F, -6.6314F, -0.1561F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 8.2171F, -0.239F, 0.3707F, -1.3324F));

		PartDefinition chest21_r2 = body.addOrReplaceChild("chest21_r2", CubeListBuilder.create().texOffs(129, 61).mirror().addBox(-21.0931F, -6.6314F, -0.1561F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 4.0171F, -0.2434F, 0.3538F, -1.334F));

		PartDefinition chest19_r3 = body.addOrReplaceChild("chest19_r3", CubeListBuilder.create().texOffs(185, 167).mirror().addBox(-1.9483F, 0.7548F, -0.1348F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 4.0171F, 0.1853F, 0.3864F, -0.2503F));

		PartDefinition chest20_r2 = body.addOrReplaceChild("chest20_r2", CubeListBuilder.create().texOffs(111, 143).mirror().addBox(-12.0847F, -0.1393F, -0.1348F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5384F, -2.3748F, 4.0171F, -0.005F, 0.4265F, -0.7241F));

		PartDefinition chest21_r3 = body.addOrReplaceChild("chest21_r3", CubeListBuilder.create().texOffs(180, 75).mirror().addBox(-20.0931F, -16.316F, -0.1339F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1384F, -2.7748F, 0.6171F, -0.4005F, 0.1669F, -1.8961F));

		PartDefinition chest20_r3 = body.addOrReplaceChild("chest20_r3", CubeListBuilder.create().texOffs(135, 6).mirror().addBox(-21.2324F, -6.6094F, -0.1339F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1384F, -2.7748F, 0.6171F, -0.2686F, 0.3428F, -1.3853F));

		PartDefinition chest19_r4 = body.addOrReplaceChild("chest19_r4", CubeListBuilder.create().texOffs(143, 119).mirror().addBox(-12.1903F, -0.046F, -0.1126F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1384F, -2.7748F, 0.6171F, -0.0333F, 0.431F, -0.7786F));

		PartDefinition chest18_r6 = body.addOrReplaceChild("chest18_r6", CubeListBuilder.create().texOffs(192, 105).mirror().addBox(-2.0045F, 0.884F, -0.1126F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1384F, -2.7748F, 0.6171F, 0.1628F, 0.4021F, -0.3017F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(172, 170).mirror().addBox(-0.5F, -3.7F, -0.4F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-3.0532F, -2.7677F, 13.7973F, 0.1257F, -0.0166F, -1.2653F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 185).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.6151F, -2.4909F, 9.7252F, 0.0384F, -0.0166F, -1.2653F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(189, 60).mirror().addBox(-0.9F, -6.0561F, 1.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 2.9F, -0.0489F, -0.0166F, -1.2653F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(84, 190).mirror().addBox(-1.0F, -5.8561F, -2.4883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 2.9F, -0.0052F, -0.0166F, -1.2653F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(172, 170).addBox(-0.5F, -3.7F, -0.4F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(3.0532F, -2.7677F, 13.7973F, 0.1257F, 0.0166F, 1.2653F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 185).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.6151F, -2.4909F, 9.7252F, 0.0384F, 0.0166F, 1.2653F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(189, 60).addBox(-0.1F, -6.0561F, 1.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 2.9F, -0.0489F, 0.0166F, 1.2653F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(84, 190).addBox(0.0F, -5.8561F, -2.4883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 2.9F, -0.0052F, 0.0166F, 1.2653F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(179, 184).addBox(-0.5F, -5.8996F, -0.3212F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, -0.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition chest17_r8 = body.addOrReplaceChild("chest17_r8", CubeListBuilder.create().texOffs(192, 105).addBox(-0.9955F, 0.884F, -0.1126F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1384F, -2.7748F, 0.6171F, 0.1628F, -0.4021F, 0.3017F));

		PartDefinition chest18_r7 = body.addOrReplaceChild("chest18_r7", CubeListBuilder.create().texOffs(143, 119).addBox(2.1903F, -0.046F, -0.1126F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1384F, -2.7748F, 0.6171F, -0.0333F, -0.431F, 0.7786F));

		PartDefinition chest19_r5 = body.addOrReplaceChild("chest19_r5", CubeListBuilder.create().texOffs(135, 6).addBox(10.2324F, -6.6094F, -0.1339F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1384F, -2.7748F, 0.6171F, -0.2686F, -0.3428F, 1.3853F));

		PartDefinition chest20_r4 = body.addOrReplaceChild("chest20_r4", CubeListBuilder.create().texOffs(180, 75).addBox(15.0931F, -16.316F, -0.1339F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1384F, -2.7748F, 0.6171F, -0.4005F, -0.1669F, 1.8961F));

		PartDefinition chest21_r4 = body.addOrReplaceChild("chest21_r4", CubeListBuilder.create().texOffs(169, 23).addBox(10.0931F, -6.6314F, -0.1561F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 8.2171F, -0.239F, -0.3707F, 1.3324F));

		PartDefinition chest19_r6 = body.addOrReplaceChild("chest19_r6", CubeListBuilder.create().texOffs(186, 151).addBox(-1.0517F, 0.7548F, -0.1348F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 8.2171F, 0.2036F, -0.3906F, 0.2434F));

		PartDefinition chest20_r5 = body.addOrReplaceChild("chest20_r5", CubeListBuilder.create().texOffs(143, 122).addBox(2.0847F, -0.1393F, -0.1348F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 8.2171F, 0.0094F, -0.438F, 0.718F));

		PartDefinition chest19_r7 = body.addOrReplaceChild("chest19_r7", CubeListBuilder.create().texOffs(111, 143).addBox(2.0847F, -0.1393F, -0.1348F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 4.0171F, -0.005F, -0.4265F, 0.7241F));

		PartDefinition chest18_r8 = body.addOrReplaceChild("chest18_r8", CubeListBuilder.create().texOffs(185, 167).addBox(-1.0517F, 0.7548F, -0.1348F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 4.0171F, 0.1853F, -0.3864F, 0.2503F));

		PartDefinition chest20_r6 = body.addOrReplaceChild("chest20_r6", CubeListBuilder.create().texOffs(129, 61).addBox(10.0931F, -6.6314F, -0.1561F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5384F, -2.3748F, 4.0171F, -0.2434F, -0.3538F, 1.334F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -3.9154F, -0.9206F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, 0.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(49, 24).addBox(-2.0F, -2.4F, 0.0F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 17.9254F, 0.1924F, 0.0868F, 0.0091F));

		PartDefinition cube_r35 = body5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 174).addBox(-0.5F, -6.2F, 0.9F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 12.1F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(171, 0).addBox(-0.5F, -5.3F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 164).mirror().addBox(-0.9298F, -8.143F, 0.2764F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0689F, -2.2426F, 12.7905F, 0.1349F, -0.0296F, -1.4091F));

		PartDefinition cube_r38 = body5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 164).mirror().addBox(-0.9298F, -8.143F, -1.7236F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2065F, -2.3505F, 8.7944F, 0.0855F, -0.0758F, -1.4551F));

		PartDefinition cube_r39 = body5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 164).mirror().addBox(-1.0F, -7.5F, -1.3F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2738F, -2.4236F, 2.9874F, 0.1408F, 0.0145F, -1.3881F));

		PartDefinition cube_r40 = body5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(70, 164).addBox(-0.0702F, -8.143F, 0.2764F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0689F, -2.2426F, 12.7905F, 0.1349F, 0.0296F, 1.4091F));

		PartDefinition cube_r41 = body5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(61, 164).addBox(-0.0702F, -8.143F, -1.7236F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2065F, -2.3505F, 8.7944F, 0.0855F, 0.0758F, 1.4551F));

		PartDefinition cube_r42 = body5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 164).addBox(0.0F, -7.5F, -1.3F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2738F, -2.4236F, 2.9874F, 0.1408F, -0.0145F, 1.3881F));

		PartDefinition cube_r43 = body5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(88, 170).addBox(-0.5F, -5.9152F, 0.1254F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 1.0F, -0.3752F, 0.0F, 0.0F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 73).addBox(-2.0F, -1.0F, 0.1F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2523F, 18.4632F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(118, 164).addBox(-0.5F, -7.1294F, 0.8199F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 11.1F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(174, 49).addBox(-0.5F, -6.6F, 1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.1F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(109, 164).addBox(-0.5F, -6.8F, -1.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.1F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(150, 46).mirror().addBox(-6.1879F, -0.6275F, 10.555F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2F, 1.6F, -0.0525F, 0.1253F, -0.1114F));

		PartDefinition cube_r48 = body4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(150, 41).mirror().addBox(-5.4488F, -0.8103F, 4.412F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2F, 1.6F, -0.0519F, 0.0367F, -0.133F));

		PartDefinition cube_r49 = body4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(150, 22).mirror().addBox(-5.8543F, -1.0103F, -1.0272F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.2F, 1.6F, -0.052F, -0.0504F, -0.1285F));

		PartDefinition cube_r50 = body4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(150, 46).addBox(0.1879F, -0.6275F, 10.555F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2F, 1.6F, -0.0525F, -0.1253F, 0.1114F));

		PartDefinition cube_r51 = body4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(150, 41).addBox(-0.5512F, -0.8103F, 4.412F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2F, 1.6F, -0.0519F, -0.0367F, 0.133F));

		PartDefinition cube_r52 = body4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(150, 22).addBox(-0.1457F, -1.0103F, -1.0272F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.2F, 1.6F, -0.052F, 0.0504F, 0.1285F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -1.85F, 0.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9113F, 17.9951F, 0.0786F, 0.0435F, 0.0034F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(154, 163).addBox(-0.5F, -6.3233F, -0.0464F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.95F, 13.1F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(165, 135).addBox(-0.5F, -6.4332F, -0.6208F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 6.8F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(165, 51).addBox(-0.5F, -6.5099F, -0.016F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, 0.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(31, 107).mirror().addBox(-2.2F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.15F, 15.3F, -0.0204F, 0.1716F, -0.1308F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(173, 114).mirror().addBox(-3.3F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.15F, 7.3F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(173, 109).mirror().addBox(-2.6F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1276F, 0.2399F, 1.0227F, 0.0F, 0.1309F, -0.0873F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(31, 107).addBox(-0.8F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.15F, 15.3F, -0.0204F, -0.1716F, 0.1308F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(173, 114).addBox(-0.7F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.15F, 7.3F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(173, 109).addBox(-1.4F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1276F, 0.2399F, 1.0227F, 0.0F, -0.1309F, 0.0873F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2362F, 20.061F, 0.3406F, 0.0411F, 0.0146F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(43, 156).addBox(-0.5F, -6.3458F, -0.1161F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9344F, 12.3003F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(139, 165).addBox(-0.5F, -6.3691F, -0.379F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0344F, 6.2003F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(97, 174).addBox(-0.5F, -6.552F, 0.1012F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4656F, 0.2003F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(171, 127).mirror().addBox(-1.0F, -1.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.437F, 11.9859F, 2.5556F, -0.2667F, 0.3045F, 0.0247F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(44, 198).mirror().addBox(-0.5F, -0.1772F, 0.6544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.2454F, 14.8108F, 5.3561F, -0.6024F, -0.3855F, 0.3824F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(164, 101).mirror().addBox(-0.5F, -0.9571F, -4.1851F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2454F, 14.8108F, 5.3561F, -0.8206F, -0.3855F, 0.3824F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(141, 147).mirror().addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1931F, 12.0395F, 7.0136F, 0.0752F, 0.2606F, -0.0257F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(197, 130).mirror().addBox(-3.1F, 0.2079F, -3.0782F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.4801F, 16.1443F, -0.333F, -0.7683F, 0.1732F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(195, 38).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.8168F, 8.3192F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(194, 177).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.8852F, 3.0066F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(197, 130).addBox(1.1F, 0.2079F, -3.0782F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.4801F, 16.1443F, -0.333F, 0.7683F, -0.1732F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(171, 127).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.437F, 11.9859F, 2.5556F, -0.2667F, -0.3045F, -0.0247F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(141, 147).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1931F, 12.0395F, 7.0136F, 0.0752F, -0.2606F, 0.0257F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(164, 101).addBox(-0.5F, -0.9571F, -4.1851F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.2454F, 14.8108F, 5.3561F, -0.8206F, 0.3855F, -0.3824F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(44, 198).addBox(-0.5F, -0.1772F, 0.6544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.2454F, 14.8108F, 5.3561F, -0.6024F, 0.3855F, -0.3824F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(195, 38).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.8168F, 8.3192F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(194, 177).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.8852F, 3.0066F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(61, 0).addBox(-1.5F, -0.1513F, 7.7474F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -7.3997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 18.2822F, 0.3344F, -0.0016F, 0.1379F));

		PartDefinition cube_r80 = hips.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(147, 190).addBox(-0.5F, -4.5037F, 0.8836F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.0076F, 11.4101F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r81 = hips.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(91, 190).addBox(-0.5F, -4.7505F, 0.5778F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.7F, 6.9F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r82 = hips.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(127, 168).addBox(-0.5F, -5.8032F, 0.1348F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r83 = hips.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(85, 161).addBox(-0.5F, -1.4F, -2.8F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.1381F, 2.3924F, -1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r84 = hips.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(180, 0).addBox(-0.5F, -2.4F, -2.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4568F, -2.9574F, -1.8675F, 0.0F, 0.0F));

		PartDefinition cube_r85 = hips.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(141, 156).addBox(-0.5F, -1.1F, -1.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1849F, 8.1733F, -1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r86 = hips.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(182, 81).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6855F, 12.939F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r87 = hips.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(197, 149).mirror().addBox(-0.8F, 0.4305F, -1.1026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.2296F, 12.3502F, -0.6646F, -0.7982F, 0.5113F));

		PartDefinition cube_r88 = hips.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(135, 196).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.5075F, 8.7398F, -0.6937F, -0.8321F, 0.5513F));

		PartDefinition cube_r89 = hips.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(195, 159).mirror().addBox(-1.3F, 0.4305F, -1.4026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0634F, 1.5191F, -0.5934F, -0.6922F, 0.4065F));

		PartDefinition cube_r90 = hips.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(197, 149).addBox(-1.2F, 0.4305F, -1.1026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 6.2296F, 12.3502F, -0.6646F, 0.7982F, -0.5113F));

		PartDefinition cube_r91 = hips.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(135, 196).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.5075F, 8.7398F, -0.6937F, 0.8321F, -0.5513F));

		PartDefinition cube_r92 = hips.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(195, 159).addBox(-0.7F, 0.4305F, -1.4026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0634F, 1.5191F, -0.5934F, 0.6922F, -0.4065F));

		PartDefinition cube_r93 = hips.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 49).addBox(-1.5F, -0.0986F, 0.0389F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(45, 73).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8175F, 17.2382F, -0.661F, 0.0731F, 0.1645F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(114, 196).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 13.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(165, 192).addBox(-0.5F, -3.7002F, 0.9869F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 5.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(192, 118).addBox(-0.5F, -1.2F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8322F, 14.1366F, -1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(180, 41).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3936F, 9.6992F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(106, 182).addBox(-0.5F, -0.6F, -2.4F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8552F, 4.7456F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(77, 190).addBox(-0.5F, -3.4002F, -1.0131F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(96, 24).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.009F))
				.texOffs(98, 196).addBox(-0.5F, -3.5F, 1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(197, 144).addBox(-0.5F, -2.9F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0898F, 15.5733F, -0.2646F, -0.0194F, 0.0956F));

		PartDefinition cube_r100 = tail2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(40, 132).addBox(-0.5F, -15.9F, 3.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(196, 162).addBox(-0.5F, -11.1F, 2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3037F, -6.274F, -1.3439F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(119, 64).addBox(-1.0F, -1.3F, 0.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(193, 196).addBox(-0.5F, -2.7F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(198, 0).addBox(-0.5F, -2.3F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6394F, 11.8232F, -0.1633F, -0.0144F, 0.1793F));

		PartDefinition cube_r101 = tail3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(141, 185).addBox(-0.5F, -24.8F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 128).addBox(-0.5F, -21.1F, 4.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5487F, -18.0312F, -1.3439F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(118, 115).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, -0.086F, -0.0283F, 0.1776F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.7F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(20.7166F, 18.2534F, 3.3773F, 0.4553F, -0.2023F, -0.6705F));

		PartDefinition cube_r102 = leftarm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(105, 198).addBox(-1.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0062F, 5.824F, -0.1751F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r103 = leftarm.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(178, 26).addBox(-1.5F, -4.0F, -0.8F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0061F, 7.1647F, -1.0709F, -0.0699F, 0.0014F, -0.001F));

		PartDefinition cube_r104 = leftarm.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(188, 98).addBox(-1.5F, -2.4F, -0.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.0049F, 5.7072F, 0.7773F, 0.4537F, 0.0014F, -0.001F));

		PartDefinition cube_r105 = leftarm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(9, 182).addBox(-1.5F, -1.45F, -1.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0091F, 2.1599F, 0.2237F, -0.3753F, 0.0014F, -0.001F));

		PartDefinition cube_r106 = leftarm.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(158, 147).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5106F, -0.2658F, 0.8287F, -0.2444F, 0.0014F, -0.001F));

		PartDefinition cube_r107 = leftarm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(156, 135).addBox(-1.5F, 1.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r108 = leftarm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(98, 156).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 7.9428F, 0.4483F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = leftarm2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(92, 185).addBox(-2.4523F, -0.4529F, -1.0079F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, 1.5708F, -0.8116F, -1.5708F));

		PartDefinition cube_r110 = leftarm2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(180, 63).addBox(-2.0392F, -4.6421F, -1.0079F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, 1.5708F, -1.4224F, -1.5708F));

		PartDefinition cube_r111 = leftarm2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 176).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6764F, -0.7848F, 4.3656F, -1.5708F, 1.2741F, 1.5708F));

		PartDefinition cube_r112 = leftarm2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(98, 190).addBox(-5.1534F, -2.1552F, -1.0079F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, -1.5708F, -0.5585F, 1.5708F));

		PartDefinition cube_r113 = leftarm2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(7, 189).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1764F, 1.4441F, -0.3362F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r114 = leftarm2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(181, 170).addBox(-1.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 0.5919F, -0.9948F, -1.5708F, -1.0385F, 1.5708F));

		PartDefinition cube_r115 = leftarm2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(185, 162).addBox(0.125F, -4.8F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6764F, 11.9719F, 2.4845F, 1.5708F, -0.925F, -1.5708F));

		PartDefinition cube_r116 = leftarm2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(169, 13).addBox(-2.0335F, 0.4378F, 0.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1778F, 8.2202F, 2.6692F, 0.7731F, 0.0442F, 0.0229F));

		PartDefinition cube_r117 = leftArm3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(80, 109).addBox(0.4F, -2.0F, -5.5F, 0.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.7166F, 18.2534F, 3.3773F, 0.495F, 0.0207F, 1.0214F));

		PartDefinition cube_r118 = rightarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(198, 133).addBox(-0.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0062F, 5.824F, -0.1751F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r119 = rightarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 179).addBox(-0.5F, -4.0F, -0.8F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0061F, 7.1647F, -1.0709F, -0.0699F, -0.0014F, 0.001F));

		PartDefinition cube_r120 = rightarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(189, 22).addBox(-0.5F, -2.4F, -0.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0049F, 5.7072F, 0.7773F, 0.4537F, -0.0014F, 0.001F));

		PartDefinition cube_r121 = rightarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 182).addBox(-0.5F, -1.45F, -1.3F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0091F, 2.1599F, 0.2237F, -0.3753F, -0.0014F, 0.001F));

		PartDefinition cube_r122 = rightarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 159).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5106F, -0.2658F, 0.8287F, -0.2444F, -0.0014F, 0.001F));

		PartDefinition cube_r123 = rightarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(189, 138).addBox(-0.5F, 1.0F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r124 = rightarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(156, 128).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 7.9428F, 0.4483F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightarm2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(130, 185).addBox(-0.5477F, -0.4529F, -1.0079F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, 1.5708F, 0.8116F, 1.5708F));

		PartDefinition cube_r126 = rightarm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(83, 181).addBox(0.0392F, -4.6421F, -1.0079F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, 1.5708F, 1.4224F, 1.5708F));

		PartDefinition cube_r127 = rightarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(128, 196).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6764F, -0.7848F, 4.3656F, -1.5708F, -1.2741F, -1.5708F));

		PartDefinition cube_r128 = rightarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(129, 190).addBox(3.1534F, -2.1552F, -1.0079F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, -1.5708F, 0.5585F, -1.5708F));

		PartDefinition cube_r129 = rightarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(189, 29).addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1764F, 1.4441F, -0.3362F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r130 = rightarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(181, 175).addBox(-3.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 0.5919F, -0.9948F, -1.5708F, 1.0385F, -1.5708F));

		PartDefinition cube_r131 = rightarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(55, 186).addBox(-3.125F, -4.8F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6764F, 11.9719F, 2.4845F, 1.5708F, 0.925F, 1.5708F));

		PartDefinition cube_r132 = rightarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(37, 169).addBox(-0.9665F, 0.4378F, 0.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.402F, 12.6065F, 8.9206F, 2.3685F, 0.0442F, 3.1187F));

		PartDefinition cube_r133 = rightArm3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(99, 109).addBox(-0.4F, -2.0F, -5.5F, 0.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -5.5F, -1.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(16.4183F, 24.875F, 2.6768F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(85, 151).addBox(-0.4355F, -3.044F, 0.5425F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, 1.8186F, 0.4541F, 1.1994F));

		PartDefinition cube_r135 = bone.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(170, 184).addBox(-0.4192F, 0.6567F, 1.3801F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, 0.3487F, 0.4575F, 1.2254F));

		PartDefinition cube_r136 = bone.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(163, 91).addBox(-0.4355F, -1.7044F, -1.0874F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, 1.0332F, 0.4541F, 1.1994F));

		PartDefinition cube_r137 = bone.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(162, 0).addBox(-0.6007F, -5.5506F, 0.817F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, -1.7158F, 0.4309F, 1.245F));

		PartDefinition cube_r138 = bone.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(171, 82).addBox(-0.6007F, -2.7627F, 0.4549F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, -3.0248F, 0.4309F, 1.245F));

		PartDefinition cube_r139 = bone.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(169, 154).addBox(-0.585F, -1.7409F, 2.0254F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, 2.7086F, 0.4309F, 1.245F));

		PartDefinition cube_r140 = bone.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(169, 73).addBox(-0.585F, 0.8943F, -0.0816F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.9665F, -0.4198F, -3.5823F, -2.3965F, 0.4309F, 1.245F));

		PartDefinition cube_r141 = bone.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(148, 175).addBox(-1.8874F, -6.1752F, -4.6159F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 176).addBox(-0.8874F, -4.1752F, -4.6159F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.0672F, 0.2516F, -0.1727F));

		PartDefinition cube_r142 = bone.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(39, 196).addBox(-0.7613F, -7.6839F, -4.5109F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.8709F, -0.3132F, -0.2749F));

		PartDefinition cube_r143 = bone.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(25, 189).addBox(-0.7613F, -7.8745F, -3.4986F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.9582F, -0.3132F, -0.2749F));

		PartDefinition cube_r144 = bone.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 164).addBox(-0.7613F, -9.8177F, -1.5277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.2549F, -0.3132F, -0.2749F));

		PartDefinition cube_r145 = bone.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(37, 164).addBox(-0.7613F, -9.8227F, 1.4953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.5603F, -0.3132F, -0.2749F));

		PartDefinition cube_r146 = bone.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(148, 165).addBox(-0.7613F, -8.2029F, -2.3282F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.0891F, -0.3132F, -0.2749F));

		PartDefinition cube_r147 = bone.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(46, 184).addBox(-1.1849F, -8.4429F, -1.7686F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.8927F, 0.2516F, -0.1727F));

		PartDefinition cube_r148 = bone.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(21, 132).addBox(-1.1849F, -4.533F, -0.3043F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.7653F, 0.2516F, -0.1727F));

		PartDefinition cube_r149 = bone.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(143, 109).addBox(-1.1849F, -1.6257F, 4.9207F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, -3.1252F, 0.2516F, -0.1727F));

		PartDefinition cube_r150 = bone.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(174, 91).addBox(-1.1849F, -2.7237F, 7.6114F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.8962F, 0.2516F, -0.1727F));

		PartDefinition cube_r151 = bone.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(173, 147).addBox(-1.1849F, -6.8492F, 5.4041F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.329F, 0.2516F, -0.1727F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(146, 91).addBox(-1.1849F, -7.4526F, 1.5107F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 2.0236F, 0.2516F, -0.1727F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(107, 146).addBox(-1.1849F, 1.0827F, -2.0711F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 0.8629F, 0.2516F, -0.1727F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(106, 0).addBox(-1.1849F, 0.1928F, -1.81F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 0.6273F, 0.2516F, -0.1727F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(174, 134).addBox(-1.1849F, -6.9478F, 5.463F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, -0.1581F, 0.2516F, -0.1727F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 166).addBox(-1.1849F, -0.717F, 7.5156F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 0.6709F, 0.2516F, -0.1727F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(165, 27).addBox(-1.1849F, 0.7444F, 6.9134F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.0636F, 0.2516F, -0.1727F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(118, 128).addBox(-1.1849F, 4.2342F, 0.205F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.7181F, 0.2516F, -0.1727F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(27, 112).addBox(-1.1849F, -5.0903F, -0.906F, 2.0F, 11.0F, 8.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.8503F, -12.889F, -0.2694F, 1.9363F, 0.2516F, -0.1727F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.4183F, 24.875F, 2.6768F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(85, 151).mirror().addBox(-0.5645F, -3.044F, 0.5425F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, 1.8186F, -0.4541F, -1.1994F));

		PartDefinition cube_r161 = bone2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(170, 184).mirror().addBox(-0.5808F, 0.6567F, 1.3801F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, 0.3487F, -0.4575F, -1.2254F));

		PartDefinition cube_r162 = bone2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(163, 91).mirror().addBox(-0.5645F, -1.7044F, -1.0874F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, 1.0332F, -0.4541F, -1.1994F));

		PartDefinition cube_r163 = bone2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(162, 0).mirror().addBox(-0.3993F, -5.5506F, 0.817F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, -1.7158F, -0.4309F, -1.245F));

		PartDefinition cube_r164 = bone2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(171, 82).mirror().addBox(-0.3993F, -2.7627F, 0.4549F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, -3.0248F, -0.4309F, -1.245F));

		PartDefinition cube_r165 = bone2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(169, 154).mirror().addBox(-0.415F, -1.7409F, 2.0254F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, 2.7086F, -0.4309F, -1.245F));

		PartDefinition cube_r166 = bone2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(169, 73).mirror().addBox(-0.415F, 0.8943F, -0.0816F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.9665F, -0.4198F, -3.5823F, -2.3965F, -0.4309F, -1.245F));

		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(148, 175).mirror().addBox(-2.1126F, -6.1752F, -4.6159F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 176).mirror().addBox(-1.1126F, -4.1752F, -4.6159F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.0672F, -0.2516F, 0.1727F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(39, 196).mirror().addBox(-0.2387F, -7.6839F, -4.5109F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.8709F, 0.3132F, 0.2749F));

		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 189).mirror().addBox(-0.2387F, -7.8745F, -3.4986F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.9582F, 0.3132F, 0.2749F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(79, 164).mirror().addBox(-0.2387F, -9.8177F, -1.5277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.2549F, 0.3132F, 0.2749F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(37, 164).mirror().addBox(-0.2387F, -9.8227F, 1.4953F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.5603F, 0.3132F, 0.2749F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(148, 165).mirror().addBox(-0.2387F, -8.2029F, -2.3282F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.0891F, 0.3132F, 0.2749F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(46, 184).mirror().addBox(0.1849F, -8.4429F, -1.7686F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.8927F, -0.2516F, 0.1727F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(21, 132).mirror().addBox(-0.8151F, -4.533F, -0.3043F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.7653F, -0.2516F, 0.1727F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(143, 109).mirror().addBox(-0.8151F, -1.6257F, 4.9207F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, -3.1252F, -0.2516F, 0.1727F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(174, 91).mirror().addBox(-0.8151F, -2.7237F, 7.6114F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.8962F, -0.2516F, 0.1727F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(173, 147).mirror().addBox(-0.8151F, -6.8492F, 5.4041F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.329F, -0.2516F, 0.1727F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(146, 91).mirror().addBox(-0.8151F, -7.4526F, 1.5107F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 2.0236F, -0.2516F, 0.1727F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(107, 146).mirror().addBox(-0.8151F, 1.0827F, -2.0711F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 0.8629F, -0.2516F, 0.1727F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-0.8151F, 0.1928F, -1.81F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 0.6273F, -0.2516F, 0.1727F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(174, 134).mirror().addBox(-0.8151F, -6.9478F, 5.463F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, -0.1581F, -0.2516F, 0.1727F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 166).mirror().addBox(-0.8151F, -0.717F, 7.5156F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 0.6709F, -0.2516F, 0.1727F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(165, 27).mirror().addBox(-0.8151F, 0.7444F, 6.9134F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.0636F, -0.2516F, 0.1727F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(118, 128).mirror().addBox(-0.8151F, 4.2342F, 0.205F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.7181F, -0.2516F, 0.1727F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(27, 112).mirror().addBox(-0.8151F, -5.0903F, -0.906F, 2.0F, 11.0F, 8.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.8503F, -12.889F, -0.2694F, 1.9363F, -0.2516F, 0.1727F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r186 = neck.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 150).addBox(-2.5F, -3.2679F, -0.3951F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r187 = neck.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(62, 193).mirror().addBox(0.633F, 1.0613F, 0.4609F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.3088F, -4.1916F, -0.282F, 0.1593F, 0.5009F));

		PartDefinition cube_r188 = neck.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(62, 193).addBox(-0.633F, 1.0613F, 0.4609F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3088F, -4.1916F, -0.282F, -0.1593F, -0.5009F));

		PartDefinition cube_r189 = neck.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(172, 181).mirror().addBox(-8.4296F, -2.5422F, -6.6869F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 10.0161F, -23.7238F, -2.0883F, 0.5293F, 0.0614F));

		PartDefinition cube_r190 = neck.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(196, 167).mirror().addBox(-1.6225F, -0.1F, -3.8287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 7.2161F, -21.9238F, -3.1416F, -0.9774F, 1.5708F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(154, 197).mirror().addBox(-1.0953F, 0.3714F, -3.8287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 7.2161F, -21.9238F, -2.5819F, -0.8501F, 0.8757F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(180, 159).mirror().addBox(-8.4805F, -1.3335F, -6.6869F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 10.0161F, -23.7238F, -2.133F, 0.6417F, -0.0193F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(172, 181).addBox(2.4296F, -2.5422F, -6.6869F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 10.0161F, -23.7238F, -2.0883F, -0.5293F, -0.0614F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(196, 167).addBox(-1.3775F, -0.1F, -3.8287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 7.2161F, -21.9238F, -3.1416F, 0.9774F, -1.5708F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(154, 197).addBox(-1.9047F, 0.3714F, -3.8287F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9F, 7.2161F, -21.9238F, -2.5819F, 0.8501F, -0.8757F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(180, 159).addBox(2.4805F, -1.3335F, -6.6869F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9F, 10.0161F, -23.7238F, -2.133F, -0.6417F, 0.0193F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(188, 34).addBox(-2.0F, -2.2775F, -3.8287F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5516F, -21.4264F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 140).addBox(-2.5F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -0.938F, -5.8409F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2643F, -8.2586F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r199 = head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(117, 91).addBox(-6.5F, 3.1F, -5.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -7.6277F, -4.926F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r200 = head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 128).addBox(-2.0F, -2.9F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1112F, -11.4692F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r201 = head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(139, 128).addBox(-3.0F, 0.625F, -3.8F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -7.918F, -7.6852F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r202 = head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(129, 51).addBox(-3.0F, -3.175F, -5.95F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -7.7471F, -5.4905F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r203 = head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(19, 144).addBox(-2.0F, 0.025F, -6.05F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, -7.8471F, -5.6637F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r204 = head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(28, 156).addBox(-1.5F, 0.275F, 1.15F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F))
				.texOffs(59, 176).addBox(-0.5F, 0.275F, 0.15F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.7794F, -12.8197F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(129, 41).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.8537F, -14.5158F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(183, 48).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.2208F, -51.8848F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(193, 154).addBox(-0.5F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5853F, -48.7376F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(186, 146).addBox(-1.0F, -0.0529F, -2.2963F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9902F, -47.8872F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(92, 134).addBox(-1.5F, -5.0F, 0.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 2.7017F, -6.3403F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(70, 147).addBox(-1.5F, -5.0F, 0.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.171F, -9.3034F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(118, 101).addBox(-1.5F, -5.1F, -1.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 2.5387F, -16.2755F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 112).addBox(-1.5F, -5.1F, -8.0F, 3.0F, 5.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.4689F, -18.2743F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(48, 112).addBox(-1.0F, -3.9635F, 0.0954F, 2.0F, 4.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.9778F, -36.234F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(36, 146).addBox(-0.5F, -1.9869F, 0.0007F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.7338F, -43.0571F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(165, 188).addBox(-0.5F, -1.0356F, 0.0069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7643F, -44.0149F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(159, 182).addBox(-0.5F, -1.0356F, -0.0681F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.32F, -47.9147F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(70, 156).addBox(-1.0F, -0.0367F, -5.1354F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.5152F, -42.7872F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 134).addBox(-1.5F, -0.0144F, -6.9627F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1152F, -35.9872F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(125, 16).addBox(-2.0F, 0.1075F, -8.0978F, 4.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -3.3652F, -29.6872F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 73).addBox(-2.0F, 0.0F, 0.0889F, 4.0F, 3.0F, 14.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -3.1844F, -29.9858F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Baleen = head.addOrReplaceChild("Baleen", CubeListBuilder.create(), PartPose.offsetAndRotation(7.1161F, -1.0034F, -30.1406F, -0.6975F, 0.0336F, 0.0401F));

		PartDefinition cube_r221 = Baleen.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, 1.675F, -11.5F, 7.0F, 0.0F, 23.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3967F, -0.7147F, 1.0392F));

		PartDefinition Baleen2 = head.addOrReplaceChild("Baleen2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.1161F, -1.0034F, -30.1406F, -0.6975F, -0.0336F, -0.0401F));

		PartDefinition cube_r222 = Baleen2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.2F, 1.675F, -11.5F, 7.0F, 0.0F, 23.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3967F, 0.7147F, -1.0392F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r223 = leftOrbit.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(194, 45).addBox(0.9346F, 1.8243F, 2.0099F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.2457F, -11.5663F, -8.5208F, 0.3805F, -0.5316F, 0.3408F));

		PartDefinition cube_r224 = leftOrbit.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(14, 198).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.4269F, -10.5411F, -6.095F, -0.0827F, 0.0107F, 0.3603F));

		PartDefinition cube_r225 = leftOrbit.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(198, 8).addBox(-0.2985F, 0.5438F, 1.5509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2457F, -11.5663F, -8.5208F, -0.0833F, -0.1197F, 0.3712F));

		PartDefinition cube_r226 = leftOrbit.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(198, 137).addBox(-1.9F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.5933F, -10.6371F, -8.7238F, -0.403F, 0.4927F, 0.4354F));

		PartDefinition cube_r227 = leftOrbit.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(198, 12).addBox(-0.9799F, 0.1502F, -0.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3827F, -11.9379F, -8.1786F, -0.3046F, 0.5164F, 0.3511F));

		PartDefinition cube_r228 = leftOrbit.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(198, 4).addBox(-0.9799F, 0.1502F, -0.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.2457F, -11.5663F, -8.5208F, -0.2813F, 0.3492F, 0.4066F));

		PartDefinition cube_r229 = leftOrbit.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(119, 180).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7635F, -14.4867F, -9.5925F, 1.2354F, 1.4827F, 1.6248F));

		PartDefinition cube_r230 = leftOrbit.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(53, 147).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7635F, -14.4867F, -9.5925F, 2.9451F, 0.9762F, -2.9654F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(156, 60).addBox(-0.2F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.0075F, -12.9426F, -7.3321F, 0.3191F, 0.6683F, 0.7262F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(59, 182).addBox(-2.15F, -0.5F, -2.325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0939F, -16.3361F, -4.4232F, 1.0668F, 1.0653F, 1.7692F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(52, 157).addBox(1.5F, 0.0F, -0.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3276F, -17.8831F, -2.8649F, 1.0561F, 1.042F, 1.6934F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(154, 156).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3276F, -17.8831F, -2.8649F, 1.6227F, 1.1155F, 2.331F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(92, 181).addBox(0.9F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(130, 180).addBox(0.1F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.1924F, -13.5225F, -1.8941F, -0.197F, 0.7546F, 0.8239F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(198, 26).addBox(-0.9F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(5.0517F, -14.051F, -3.1983F, -0.3441F, 1.1343F, 0.6458F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(194, 94).addBox(1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5711F, -14.6251F, -3.4911F, 0.106F, 0.487F, 0.4928F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(106, 16).addBox(-0.2F, -0.5F, -3.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5711F, -14.6251F, -3.4911F, 0.2231F, 1.1343F, 0.6458F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(197, 124).addBox(-2.4F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.5072F, -12.0831F, -0.94F, 0.0883F, 1.4076F, 0.026F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(198, 140).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2142F, -14.0501F, 0.0824F, 1.2977F, 0.9274F, 1.2869F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(184, 126).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.5577F, -11.0835F, 6.1202F, -1.9304F, 0.9692F, -2.0976F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(197, 127).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.5467F, -11.2713F, 6.2942F, -1.4617F, 1.0088F, -1.5412F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(180, 154).addBox(-2.125F, -0.125F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7401F, -11.6546F, 4.9645F, -0.2123F, 0.0921F, 0.9789F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(30, 196).addBox(-1.925F, 0.075F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.7401F, -11.6546F, 4.9645F, -1.8445F, -0.4065F, 3.0701F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(86, 145).addBox(-0.9F, -1.0F, -0.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.6375F, -10.1599F, 5.7455F, -2.7475F, 0.2196F, -3.1375F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(174, 141).addBox(-4.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(5.7471F, -11.8597F, 2.2182F, -1.4172F, 1.1818F, -1.4913F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(191, 41).addBox(-4.1981F, 0.0344F, 0.0429F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.7062F, -13.9566F, -0.1442F, -0.9385F, 1.4725F, -1.0036F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(113, 157).addBox(-3.0008F, -0.027F, -3.9571F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.082F, -14.8671F, 5.4884F, 0.1782F, 0.741F, 0.0262F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(187, 133).addBox(-3.0008F, -0.027F, -1.9571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.9188F, -15.832F, 5.2824F, 0.5134F, 0.621F, 0.3892F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(66, 188).addBox(-3.0008F, 0.173F, -1.9571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.4806F, -14.7126F, 2.9785F, 0.3575F, 1.0069F, 0.2336F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(106, 176).addBox(-3.0008F, -0.027F, -2.9571F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4806F, -14.7126F, 2.9785F, 0.6734F, 0.8756F, 0.6219F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(187, 180).addBox(-3.1508F, -0.127F, 0.2429F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.3253F, -14.2423F, 0.7352F, -0.1342F, 0.3775F, 0.2595F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(195, 112).addBox(-1.5F, -1.0F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.1812F, -13.3442F, 1.6531F, 0.4837F, 1.0689F, 0.3822F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(195, 108).addBox(-3.1508F, -0.027F, 0.0429F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7062F, -13.9566F, -0.1442F, 1.3172F, 1.3375F, 1.261F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 64).addBox(-2.5F, -0.55F, -4.8F, 5.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.8013F, -14.0547F, -6.7031F, 0.4726F, 1.2878F, 0.9082F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(22, 176).addBox(-0.975F, -0.625F, -1.825F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.9626F, -12.5853F, -9.7383F, 0.6906F, 1.3046F, 1.1112F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(150, 15).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.3404F, -13.1127F, -13.303F, 0.1017F, 0.4003F, 0.4828F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(125, 27).addBox(-0.5F, -0.5F, -7.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8144F, -13.6382F, -15.2122F, 0.0938F, 0.0528F, 0.448F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(92, 48).addBox(-0.1F, -0.025F, -0.025F, 4.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3023F, -14.9059F, -22.3196F, 0.0937F, -0.0341F, 0.4398F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(119, 176).addBox(-1.1F, -0.1F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.3985F, -11.7245F, -45.47F, 0.0335F, 0.9449F, 0.4192F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 151).addBox(-1.0F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0583F, -11.1368F, -42.9141F, 0.0487F, 0.5492F, 0.4765F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(148, 27).addBox(-0.925F, -0.1F, 0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0583F, -11.1368F, -42.9141F, 0.1312F, 0.1995F, 0.4711F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(40, 137).addBox(-3.0F, -0.1F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8873F, -11.7335F, -35.9891F, 0.1289F, 0.0697F, 0.454F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(143, 101).addBox(-3.0F, 0.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3488F, -12.4519F, -30.0501F, 0.1242F, 0.0178F, 0.4466F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(119, 77).addBox(-3.1893F, -0.8024F, -8.7257F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6432F, -12.24F, -21.6486F, 0.1418F, 0.0126F, 0.4473F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(48, 127).addBox(-2.1F, -0.825F, 0.175F, 3.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1837F, -12.0647F, -30.1681F, 0.142F, -0.0685F, 0.4343F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(124, 147).addBox(-1.0F, 0.0F, -5.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3F, -13.6426F, -29.9824F, 0.0876F, 0.0869F, 0.0076F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(149, 198).addBox(-1.0F, 1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(144, 198).addBox(-1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(193, 191).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.439F, -12.5192F, -44.4579F, -0.0997F, 0.0867F, -0.9893F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(183, 54).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, -11.9847F, -46.4317F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(181, 119).addBox(-0.6F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.027F, -17.5039F, 6.9565F, -0.7556F, 0.5051F, -0.0735F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(122, 187).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4905F, -18.5298F, 5.0245F, -0.5594F, 0.3412F, 0.0846F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(13, 167).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.7225F, -15.9732F, 1.5845F, -0.2519F, 0.537F, 0.0942F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(177, 98).addBox(-1.0F, -0.05F, -0.025F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4644F, -18.1055F, 3.2904F, -0.6494F, 0.1564F, -0.6386F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(115, 187).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.551F, -19.1193F, 3.3602F, -0.2767F, 0.5256F, 0.0454F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(150, 51).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2218F, -16.2857F, 0.1814F, -0.1309F, 0.829F, 0.0F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(136, 177).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0072F, -18.3889F, 1.9324F, -0.7168F, 0.4768F, -0.9093F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(187, 89).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9109F, -19.3803F, 2.0206F, -0.1309F, 0.829F, 0.0F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(197, 98).addBox(-0.7F, 0.075F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.0528F, -19.4553F, 1.1304F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(7, 194).addBox(-0.5F, -2.0F, -1.175F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8162F, -18.1822F, -3.5654F, 1.3759F, -0.2494F, -0.0314F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 194).addBox(-0.4957F, 0.15F, -0.9581F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2588F, -18.3922F, -5.7962F, 1.1141F, -0.2494F, -0.0314F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(194, 87).addBox(-0.4957F, 0.1301F, -0.6421F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0528F, -17.738F, -6.5239F, 0.7214F, -0.2494F, -0.0314F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(180, 15).addBox(-0.9172F, -0.0067F, -3.9751F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9813F, -16.0235F, -12.0953F, 0.1954F, 0.2709F, 0.1197F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(31, 96).addBox(-1.5F, -3.5F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7681F, -14.3514F, 2.8352F, 0.6488F, 0.5435F, -0.5985F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(180, 8).addBox(-0.9172F, -0.0067F, -3.9751F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.54F, -16.5703F, -8.1575F, 0.1469F, 0.0983F, 0.0933F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(191, 16).addBox(-0.4172F, 0.2933F, -2.9751F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1171F, -17.8784F, -6.6423F, 0.531F, -0.0995F, 0.0594F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(168, 119).addBox(-1.0F, 0.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -13.1793F, -35.4622F, 0.0965F, 0.1042F, 0.0101F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r287 = rightOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(194, 45).mirror().addBox(-1.9346F, 1.8243F, 2.0099F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.2457F, -11.5663F, -8.5208F, 0.3805F, 0.5316F, -0.3408F));

		PartDefinition cube_r288 = rightOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(14, 198).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.4269F, -10.5411F, -6.095F, -0.0827F, -0.0107F, -0.3603F));

		PartDefinition cube_r289 = rightOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(198, 8).mirror().addBox(-0.7015F, 0.5438F, 1.5509F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.2457F, -11.5663F, -8.5208F, -0.0833F, 0.1197F, -0.3712F));

		PartDefinition cube_r290 = rightOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(198, 137).mirror().addBox(-0.1F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.5933F, -10.6371F, -8.7238F, -0.403F, -0.4927F, -0.4354F));

		PartDefinition cube_r291 = rightOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(198, 12).mirror().addBox(-0.0201F, 0.1502F, -0.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3827F, -11.9379F, -8.1786F, -0.3046F, -0.5164F, -0.3511F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(198, 4).mirror().addBox(-0.0201F, 0.1502F, -0.0331F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.2457F, -11.5663F, -8.5208F, -0.2813F, -0.3492F, -0.4066F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(119, 180).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7635F, -14.4867F, -9.5925F, 1.2354F, -1.4827F, -1.6248F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(53, 147).mirror().addBox(0.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7635F, -14.4867F, -9.5925F, 2.9451F, -0.9762F, 2.9654F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(156, 60).mirror().addBox(-1.8F, -0.5F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.0075F, -12.9426F, -7.3321F, 0.3191F, -0.6683F, -0.7262F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(59, 182).mirror().addBox(-1.85F, -0.5F, -2.325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.0939F, -16.3361F, -4.4232F, 1.0668F, -1.0653F, -1.7692F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(52, 157).mirror().addBox(-3.5F, 0.0F, -0.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, -17.8831F, -2.8649F, 1.0561F, -1.042F, -1.6934F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(154, 156).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3276F, -17.8831F, -2.8649F, 1.6227F, -1.1155F, -2.331F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(92, 181).mirror().addBox(-1.9F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(130, 180).mirror().addBox(-1.1F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.1924F, -13.5225F, -1.8941F, -0.197F, -0.7546F, -0.8239F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(198, 26).mirror().addBox(-1.1F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0517F, -14.051F, -3.1983F, -0.3441F, -1.1343F, -0.6458F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(194, 94).mirror().addBox(-3.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5711F, -14.6251F, -3.4911F, 0.106F, -0.487F, -0.4928F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(106, 16).mirror().addBox(-1.8F, -0.5F, -3.6F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5711F, -14.6251F, -3.4911F, 0.2231F, -1.1343F, -0.6458F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(197, 124).mirror().addBox(-0.6F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.5072F, -12.0831F, -0.94F, 0.0883F, -1.4076F, -0.026F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(198, 140).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2142F, -14.0501F, 0.0824F, 1.2977F, -0.9274F, -1.2869F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(184, 126).mirror().addBox(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.5577F, -11.0835F, 6.1202F, -1.9304F, -0.9692F, 2.0976F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(197, 127).mirror().addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.5467F, -11.2713F, 6.2942F, -1.4617F, -1.0088F, 1.5412F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(180, 154).mirror().addBox(-0.875F, -0.125F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7401F, -11.6546F, 4.9645F, -0.2123F, -0.0921F, -0.9789F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(30, 196).mirror().addBox(-0.075F, 0.075F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.7401F, -11.6546F, 4.9645F, -1.8445F, 0.4065F, -3.0701F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(86, 145).mirror().addBox(-5.1F, -1.0F, -0.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.6375F, -10.1599F, 5.7455F, -2.7475F, -0.2196F, 3.1375F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(174, 141).mirror().addBox(0.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-5.7471F, -11.8597F, 2.2182F, -1.4172F, -1.1818F, 1.4913F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(191, 41).mirror().addBox(0.1981F, 0.0344F, 0.0429F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.7062F, -13.9566F, -0.1442F, -0.9385F, -1.4725F, 1.0036F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(113, 157).mirror().addBox(0.0008F, -0.027F, -3.9571F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.082F, -14.8671F, 5.4884F, 0.1782F, -0.741F, -0.0262F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(187, 133).mirror().addBox(0.0008F, -0.027F, -1.9571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.9188F, -15.832F, 5.2824F, 0.5134F, -0.621F, -0.3892F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(66, 188).mirror().addBox(0.0008F, 0.173F, -1.9571F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.4806F, -14.7126F, 2.9785F, 0.3575F, -1.0069F, -0.2336F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(106, 176).mirror().addBox(0.0008F, -0.027F, -2.9571F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4806F, -14.7126F, 2.9785F, 0.6734F, -0.8756F, -0.6219F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(187, 180).mirror().addBox(-0.8492F, -0.127F, 0.2429F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.3253F, -14.2423F, 0.7352F, -0.1342F, -0.3775F, -0.2595F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(195, 112).mirror().addBox(-1.5F, -1.0F, -0.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.1812F, -13.3442F, 1.6531F, 0.4837F, -1.0689F, -0.3822F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(195, 108).mirror().addBox(0.1508F, -0.027F, 0.0429F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7062F, -13.9566F, -0.1442F, 1.3172F, -1.3375F, -1.261F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(92, 64).mirror().addBox(-2.5F, -0.55F, -4.8F, 5.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.8013F, -14.0547F, -6.7031F, 0.4726F, -1.2878F, -0.9082F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(22, 176).mirror().addBox(-1.025F, -0.625F, -1.825F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9626F, -12.5853F, -9.7383F, 0.6906F, -1.3046F, -1.1112F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(150, 15).mirror().addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.3404F, -13.1127F, -13.303F, 0.1017F, -0.4003F, -0.4828F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(125, 27).mirror().addBox(-1.5F, -0.5F, -7.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8144F, -13.6382F, -15.2122F, 0.0938F, -0.0528F, -0.448F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(92, 48).mirror().addBox(-3.9F, -0.025F, -0.025F, 4.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3023F, -14.9059F, -22.3196F, 0.0937F, 0.0341F, -0.4398F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(119, 176).mirror().addBox(0.1F, -0.1F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.3985F, -11.7245F, -45.47F, 0.0335F, -0.9449F, -0.4192F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 151).mirror().addBox(0.0F, -0.1F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0583F, -11.1368F, -42.9141F, 0.0487F, -0.5492F, -0.4765F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(148, 27).mirror().addBox(-0.075F, -0.1F, 0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.0583F, -11.1368F, -42.9141F, 0.1312F, -0.1995F, -0.4711F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(40, 137).mirror().addBox(0.0F, -0.1F, -7.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8873F, -11.7335F, -35.9891F, 0.1289F, -0.0697F, -0.454F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(143, 101).mirror().addBox(-1.0F, 0.0F, -6.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3488F, -12.4519F, -30.0501F, 0.1242F, -0.0178F, -0.4466F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(119, 77).mirror().addBox(0.1893F, -0.8024F, -8.7257F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6432F, -12.24F, -21.6486F, 0.1418F, -0.0126F, -0.4473F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(48, 127).mirror().addBox(-0.9F, -0.825F, 0.175F, 3.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1837F, -12.0647F, -30.1681F, 0.142F, 0.0685F, -0.4343F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(124, 147).mirror().addBox(0.0F, 0.0F, -5.5F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.3F, -13.6426F, -29.9824F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(149, 198).mirror().addBox(0.0F, 1.0F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(144, 198).mirror().addBox(0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(193, 191).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(2.439F, -12.5192F, -44.4579F, -0.0997F, -0.0867F, 0.9893F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(183, 54).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7F, -11.9847F, -46.4317F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(181, 119).mirror().addBox(-1.4F, 0.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.027F, -17.5039F, 6.9565F, -0.7556F, -0.5051F, 0.0735F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(122, 187).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4905F, -18.5298F, 5.0245F, -0.5594F, -0.3412F, -0.0846F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(13, 167).mirror().addBox(0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7225F, -15.9732F, 1.5845F, -0.2519F, -0.537F, -0.0942F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(177, 98).mirror().addBox(0.0F, -0.05F, -0.025F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.4644F, -18.1055F, 3.2904F, -0.6494F, -0.1564F, 0.6386F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(115, 187).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.551F, -19.1193F, 3.3602F, -0.2767F, -0.5256F, -0.0454F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(150, 51).mirror().addBox(0.0F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2218F, -16.2857F, 0.1814F, -0.1309F, -0.829F, 0.0F));

		PartDefinition cube_r340 = rightOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(136, 177).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0072F, -18.3889F, 1.9324F, -0.7168F, -0.4768F, 0.9093F));

		PartDefinition cube_r341 = rightOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(187, 89).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9109F, -19.3803F, 2.0206F, -0.1309F, -0.829F, 0.0F));

		PartDefinition cube_r342 = rightOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(197, 98).mirror().addBox(-0.3F, 0.075F, 0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.0528F, -19.4553F, 1.1304F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r343 = rightOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(7, 194).mirror().addBox(-0.5F, -2.0F, -1.175F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.8162F, -18.1822F, -3.5654F, 1.3759F, 0.2494F, 0.0314F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 194).mirror().addBox(-0.5043F, 0.15F, -0.9581F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2588F, -18.3922F, -5.7962F, 1.1141F, 0.2494F, 0.0314F));

		PartDefinition cube_r345 = rightOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(194, 87).mirror().addBox(-0.5043F, 0.1301F, -0.6421F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0528F, -17.738F, -6.5239F, 0.7214F, 0.2494F, 0.0314F));

		PartDefinition cube_r346 = rightOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(180, 15).mirror().addBox(-0.0828F, -0.0067F, -3.9751F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9813F, -16.0235F, -12.0953F, 0.1954F, -0.2709F, -0.1197F));

		PartDefinition cube_r347 = rightOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(-1.5F, -3.5F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7681F, -14.3514F, 2.8352F, 0.6488F, -0.5435F, 0.5985F));

		PartDefinition cube_r348 = rightOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(180, 8).mirror().addBox(-0.0828F, -0.0067F, -3.9751F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.54F, -16.5703F, -8.1575F, 0.1469F, -0.0983F, -0.0933F));

		PartDefinition cube_r349 = rightOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(191, 16).mirror().addBox(-0.5828F, 0.2933F, -2.9751F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1171F, -17.8784F, -6.6423F, 0.531F, 0.0995F, -0.0594F));

		PartDefinition cube_r350 = rightOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(168, 119).mirror().addBox(0.0F, 0.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, -13.1793F, -35.4622F, 0.0965F, -0.1042F, -0.0101F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.8218F, -3.2457F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r351 = jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(194, 50).mirror().addBox(-18.4473F, 43.2653F, 9.48F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(186, 193).mirror().addBox(-18.4473F, 43.2653F, 10.18F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.8774F, -0.4662F, 0.3413F));

		PartDefinition cube_r352 = jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(147, 184).mirror().addBox(-0.0312F, 2.9489F, -9.6189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -0.7564F, -0.0101F, -0.0951F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(61, 137).mirror().addBox(-0.0312F, 6.0609F, -8.0302F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.1054F, -0.0101F, -0.0951F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(25, 197).mirror().addBox(-0.1301F, 10.8171F, -4.9461F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.4122F, 0.0843F, 0.3462F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(45, 192).mirror().addBox(0.2243F, -1.4577F, -3.0765F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -0.443F, 0.1335F, 0.3482F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(138, 190).mirror().addBox(0.2243F, -1.6911F, -1.349F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, 0.5605F, 0.1335F, 0.3482F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(191, 81).mirror().addBox(0.2243F, 0.5705F, -3.3562F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.0539F, 0.1335F, 0.3482F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(72, 181).mirror().addBox(-0.1301F, 7.2064F, -2.0129F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5954F, 0.0843F, 0.3462F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(73, 112).mirror().addBox(-0.1301F, 7.4433F, -2.2112F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5867F, 0.0843F, 0.3462F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(172, 192).mirror().addBox(0.2718F, 16.0991F, -3.6613F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.4992F, 0.1089F, 0.3471F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(107, 190).mirror().addBox(-2.3991F, 21.8141F, -3.6556F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5F, -0.0143F, 0.345F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 189).mirror().addBox(-5.8315F, 26.9954F, -0.182F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.55F, -0.1385F, 0.3044F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(188, 109).mirror().addBox(-10.7875F, 32.499F, 3.5893F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.663F, -0.2872F, 0.315F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(159, 175).mirror().addBox(-13.8501F, -7.1824F, 37.6094F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, 2.9804F, -0.3666F, 0.3051F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(9, 175).mirror().addBox(-13.1221F, -12.5521F, 40.4984F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, 2.8505F, -0.3494F, 0.3021F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(172, 163).mirror().addBox(-18.4473F, -17.9746F, 40.5454F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, 2.7041F, -0.4662F, 0.3413F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(198, 22).mirror().addBox(-18.4473F, 37.2833F, 29.1887F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -2.305F, -0.4662F, 0.3413F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(17, 155).mirror().addBox(0.2243F, 0.1269F, -1.1937F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.7084F, 0.1335F, 0.3482F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(169, 39).mirror().addBox(-0.1301F, 10.0481F, -2.8824F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5082F, 0.0843F, 0.3462F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(169, 63).mirror().addBox(0.2718F, 15.9907F, -2.3601F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5429F, 0.1089F, 0.3471F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(162, 109).mirror().addBox(-2.3991F, 21.8784F, -2.3409F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.5436F, -0.0143F, 0.345F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(128, 157).mirror().addBox(-5.8315F, 26.9855F, -0.8404F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.6024F, -0.1385F, 0.3044F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(98, 163).mirror().addBox(-10.7875F, 32.509F, 0.2507F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.6368F, -0.2872F, 0.315F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(79, 170).mirror().addBox(-13.9268F, 37.6891F, 5.7633F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-9.4214F, 2.6944F, 1.7235F, -1.783F, -0.3687F, 0.325F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(45, 192).addBox(-2.2243F, -1.4577F, -3.0765F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -0.443F, -0.1335F, -0.3482F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(138, 190).addBox(-2.2243F, -1.6911F, -1.349F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, 0.5605F, -0.1335F, -0.3482F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(191, 81).addBox(-2.2243F, 0.5705F, -3.3562F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.0539F, -0.1335F, -0.3482F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(17, 155).addBox(-2.2243F, 0.1269F, -1.1937F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.7084F, -0.1335F, -0.3482F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(72, 181).addBox(-1.8699F, 7.2064F, -2.0129F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5954F, -0.0843F, -0.3462F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(147, 184).addBox(-0.9688F, 2.9489F, -9.6189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -0.7564F, 0.0101F, 0.0951F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(61, 137).addBox(-0.9688F, 6.0609F, -8.0302F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.1054F, 0.0101F, 0.0951F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(25, 197).addBox(-0.8699F, 10.8171F, -4.9461F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.4122F, -0.0843F, -0.3462F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(73, 112).addBox(-1.8699F, 7.4433F, -2.2112F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5867F, -0.0843F, -0.3462F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(169, 39).addBox(-1.8699F, 10.0481F, -2.8824F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5082F, -0.0843F, -0.3462F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(172, 192).addBox(-2.2718F, 16.0991F, -3.6613F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.4992F, -0.1089F, -0.3471F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(169, 63).addBox(-2.2718F, 15.9907F, -2.3601F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5429F, -0.1089F, -0.3471F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(107, 190).addBox(0.3991F, 21.8141F, -3.6556F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5F, 0.0143F, -0.345F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(162, 109).addBox(0.3991F, 21.8784F, -2.3409F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.5436F, 0.0143F, -0.345F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(18, 189).addBox(3.8315F, 26.9954F, -0.182F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.55F, 0.1385F, -0.3044F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(128, 157).addBox(3.8315F, 26.9855F, -0.8404F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.6024F, 0.1385F, -0.3044F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(188, 109).addBox(8.7875F, 32.499F, 3.5893F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.663F, 0.2872F, -0.315F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(98, 163).addBox(8.7875F, 32.509F, 0.2507F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.6368F, 0.2872F, -0.315F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(79, 170).addBox(11.9268F, 37.6891F, 5.7633F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.783F, 0.3687F, -0.325F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(159, 175).addBox(11.8501F, -7.1824F, 37.6094F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, 2.9804F, 0.3666F, -0.3051F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(9, 175).addBox(11.1221F, -12.5521F, 40.4984F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, 2.8505F, 0.3494F, -0.3021F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(172, 163).addBox(16.4473F, -17.9746F, 40.5454F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, 2.7041F, 0.4662F, -0.3413F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(198, 22).addBox(16.4473F, 37.2833F, 29.1887F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -2.305F, 0.4662F, -0.3413F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(194, 50).addBox(16.4473F, 43.2653F, 9.48F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(186, 193).addBox(16.4473F, 43.2653F, 10.18F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(8.2214F, 2.6944F, 1.7235F, -1.8774F, 0.4662F, -0.3413F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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