package fossils.fossils.client.blockentity.model.kannemeyeria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KannemeyeriaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart body2;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public KannemeyeriaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.body2 = this.body.getChild("body2");
		this.upperarm1 = this.body2.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.body2.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.neck = this.body2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 26).addBox(0.0F, -1.6976F, -0.1335F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5605F, 26.1222F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 52).addBox(0.0F, -2.7423F, 5.9997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 95).addBox(0.0F, -2.7423F, 3.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 94).addBox(0.0F, -2.6423F, 1.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 16).addBox(0.0F, -2.4423F, -0.0003F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, 18.1222F, -0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.7708F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 58).addBox(8.2292F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r2 = body.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-1.7708F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 34).addBox(8.2292F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2392F, 0.0F, 0.0F));

		PartDefinition basin_r3 = body.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(22, 93).mirror().addBox(-1.7708F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(22, 93).addBox(8.2292F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.2705F, 0.0F, 0.0F));

		PartDefinition basin_r4 = body.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-1.7708F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 72).mirror().addBox(-1.7708F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r5 = body.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(25, 21).mirror().addBox(-2.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2696F, 0.1346F, -0.4439F));

		PartDefinition basin_r6 = body.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(32, 61).mirror().addBox(-2.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8368F, 0.1346F, -0.4439F));

		PartDefinition basin_r7 = body.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-2.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -2.2557F, 0.1346F, -0.4439F));

		PartDefinition basin_r8 = body.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(79, 66).mirror().addBox(-2.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.034F, 0.1346F, -0.4439F));

		PartDefinition basin_r9 = body.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(11, 88).mirror().addBox(-2.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8456F, 0.1346F, -0.4439F));

		PartDefinition basin_r10 = body.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(19, 34).mirror().addBox(-1.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(19, 34).addBox(3.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 4.6902F, 22.4647F, -0.192F, 0.0F, 0.0F));

		PartDefinition basin_r11 = body.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(0, 95).addBox(-0.2292F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 72).addBox(-0.2292F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r12 = body.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(25, 21).addBox(0.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.2696F, -0.1346F, 0.4439F));

		PartDefinition basin_r13 = body.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(32, 61).addBox(0.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8368F, -0.1346F, 0.4439F));

		PartDefinition basin_r14 = body.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(81, 4).addBox(0.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -2.2557F, -0.1346F, 0.4439F));

		PartDefinition basin_r15 = body.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(79, 66).addBox(0.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.034F, -0.1346F, 0.4439F));

		PartDefinition basin_r16 = body.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(11, 88).addBox(0.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8456F, -0.1346F, 0.4439F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.0121F, -0.0463F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(69, 26).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(58, 75).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, -0.0399F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.4068F, -0.083F, 0.3154F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(33, 85).addBox(-0.4531F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 26).addBox(-0.535F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 4.2372F, 1.1145F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.3334F, -0.0204F, -0.0277F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(41, 2).addBox(-3.1772F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 3.3818F, -2.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(44, 16).addBox(-3.1978F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 2.3818F, -5.018F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(47, 69).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(71, 75).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.258F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(50, 89).addBox(-1.5469F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 80).addBox(-1.465F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1816F, 4.2372F, 1.1145F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(41, 9).addBox(-2.8228F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 3.3818F, -2.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(44, 23).addBox(-2.8022F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 2.3818F, -5.018F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, 0.022F, -0.9372F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8239F, -0.3297F, 0.2912F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 23).addBox(-15.0F, 8.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 47).addBox(-15.0F, 6.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 69).addBox(-15.0F, 4.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(105, 52).addBox(-15.0F, 2.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 104).addBox(-15.0F, 0.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(68, 91).addBox(-0.5F, -0.8285F, -0.4852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1289F, 0.0227F, -0.1731F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.2628F, 0.0843F, 0.0226F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 100).addBox(0.0F, -6.7693F, 9.9896F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -28.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(107, 19).addBox(-1.1F, -4.0625F, -2.7484F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 106).addBox(-1.1F, -3.0625F, -4.7484F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 106).addBox(-1.1F, -2.1625F, -6.7484F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 108).addBox(-1.1F, -1.0625F, -8.7484F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 108).addBox(-1.1F, -0.4625F, -10.7484F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(34, 50).mirror().addBox(-7.0377F, -3.3543F, -9.3892F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.2466F, -0.0823F, 0.3684F));

		PartDefinition chest_r2 = body2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-8.7802F, -2.3543F, -11.2559F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.2708F, -0.1495F, 0.1594F));

		PartDefinition chest_r3 = body2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(-14.2353F, -3.3543F, -8.8241F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.4499F, -0.3123F, -0.5859F));

		PartDefinition chest_r4 = body2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(49, 99).mirror().addBox(9.4549F, -4.5969F, -14.0999F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, -2.0144F, 1.4319F, 2.8697F));

		PartDefinition chest_r5 = body2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(98, 103).mirror().addBox(3.7029F, -6.2695F, -15.4343F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.4616F, 0.5002F, 0.2336F));

		PartDefinition chest_r6 = body2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(40, 92).mirror().addBox(-3.6566F, -3.4427F, -16.2378F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.3582F, -0.0157F, 0.0807F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(103, 10).mirror().addBox(-8.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0557F, -0.0835F, -1.2905F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(103, 8).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0858F, -0.0521F, -0.8543F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(61, 108).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.1003F, 0.002F, -0.2894F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-10.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0366F, -0.0443F, -1.2743F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(102, 38).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0518F, -0.0247F, -0.8381F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(75, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.057F, 0.007F, -0.2717F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-12.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0213F, -0.0129F, -1.2049F));

		PartDefinition neck18_r2 = body2.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0247F, -0.0027F, -0.7687F));

		PartDefinition neck17_r1 = body2.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(47, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0223F, 0.011F, -0.2016F));

		PartDefinition neck18_r3 = body2.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0175F, -0.005F, -1.1526F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0179F, 0.0028F, -0.7163F));

		PartDefinition neck16_r1 = body2.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(107, 33).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0136F, 0.012F, -0.1492F));

		PartDefinition neck17_r3 = body2.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(44, 30).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0175F, -0.005F, -1.109F));

		PartDefinition neck16_r2 = body2.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(73, 100).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0179F, 0.0028F, -0.6727F));

		PartDefinition neck15_r1 = body2.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(107, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0136F, 0.012F, -0.1055F));

		PartDefinition neck16_r3 = body2.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(40, 36).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.009F, 0.0102F, -1.0828F));

		PartDefinition neck15_r2 = body2.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(54, 100).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.0038F, 0.0131F, -0.6464F));

		PartDefinition neck14_r1 = body2.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(107, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, 0.0038F, 0.0131F, -0.0791F));

		PartDefinition neck16_r4 = body2.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0095F, 0.0399F, -1.0998F));

		PartDefinition neck15_r3 = body2.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(103, 6).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0255F, 0.0321F, -0.6632F));

		PartDefinition neck14_r2 = body2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(54, 108).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0387F, 0.0134F, -0.0961F));

		PartDefinition neck13_r1 = body2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0213F, 0.0129F, -0.0789F));

		PartDefinition neck14_r3 = body2.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.011F, 0.0223F, -0.6462F));

		PartDefinition neck15_r4 = body2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(40, 34).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0005F, 0.0249F, -1.0826F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(103, 4).mirror().addBox(-6.654F, -3.6405F, -8.5845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4281F, 0.3487F, -0.7117F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(28, 108).mirror().addBox(-4.1944F, -1.6444F, -8.5845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.5401F, 0.0787F, -0.1992F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(79, 73).mirror().addBox(-11.4714F, -6.103F, -8.5845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.2399F, 0.4945F, -1.1637F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(103, 61).mirror().addBox(-6.0211F, -6.0204F, -10.5667F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1423F, 0.6046F, -1.3395F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(98, 36).mirror().addBox(-5.3047F, -4.1785F, -10.5667F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4017F, 0.4846F, -0.8471F));

		PartDefinition neck19_r4 = body2.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-3.3455F, -2.8231F, -10.5667F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.5873F, 0.2085F, -0.3171F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-14.1777F, -5.6502F, -6.6386F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1985F, 0.416F, -1.1459F));

		PartDefinition neck19_r5 = body2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(65, 102).mirror().addBox(-7.1028F, -2.9316F, -6.6386F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3568F, 0.2942F, -0.6982F));

		PartDefinition neck18_r4 = body2.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(21, 108).mirror().addBox(-4.192F, -0.8053F, -6.6386F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4541F, 0.065F, -0.1694F));

		PartDefinition neck19_r6 = body2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(62, 2).mirror().addBox(-15.5793F, -5.4085F, -4.633F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1654F, 0.3535F, -1.1402F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(54, 102).mirror().addBox(-7.3646F, -2.5428F, -4.633F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3001F, 0.2511F, -0.6953F));

		PartDefinition neck17_r4 = body2.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(14, 108).mirror().addBox(-4.2039F, -0.3368F, -4.633F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.385F, 0.0558F, -0.1554F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(34, 48).mirror().addBox(-16.9451F, -5.2008F, -2.6321F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1368F, 0.2892F, -1.1143F));

		PartDefinition neck17_r5 = body2.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(102, 42).mirror().addBox(-7.6084F, -2.2F, -2.6321F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.2466F, 0.2047F, -0.6725F));

		PartDefinition neck16_r5 = body2.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(7, 108).mirror().addBox(-4.2254F, 0.0833F, -2.6321F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3163F, 0.043F, -0.1238F));

		PartDefinition neck15_r5 = body2.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0823F, 0.0145F, -0.113F));

		PartDefinition neck17_r6 = body2.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(44, 32).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.032F, 0.0772F, -1.1159F));

		PartDefinition neck16_r6 = body2.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(102, 40).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0617F, 0.0565F, -0.6791F));

		PartDefinition chest_r7 = body2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(34, 50).addBox(3.9923F, -3.7667F, -8.6919F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.2466F, 0.0823F, -0.3684F));

		PartDefinition chest_r8 = body2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(63, 83).addBox(5.6324F, -2.7667F, -11.0178F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.2708F, 0.1495F, -0.1594F));

		PartDefinition chest_r9 = body2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(19, 43).addBox(11.4909F, -3.7667F, -10.0996F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.4499F, 0.3123F, 0.5859F));

		PartDefinition chest_r10 = body2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(49, 99).addBox(-10.1614F, -2.4476F, -13.7329F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, -2.0144F, -1.4319F, -2.8697F));

		PartDefinition chest_r11 = body2.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(98, 103).addBox(-7.5809F, -5.3046F, -14.8163F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.4616F, -0.5002F, -0.2336F));

		PartDefinition chest_r12 = body2.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(40, 92).addBox(-1.536F, -3.5137F, -16.0716F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 1.3582F, 0.0157F, -0.0807F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 59).addBox(-2.1F, -1.5732F, -11.8493F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 38).addBox(-2.1F, -0.835F, -6.9757F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 46).addBox(0.0F, -2.8419F, 0.0207F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(106, 73).addBox(0.0F, -2.9689F, 0.0191F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 106).addBox(0.0F, -3.1954F, 0.0063F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(41, 106).addBox(0.0F, -3.0237F, 0.0274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(38, 106).addBox(0.0F, -3.0507F, 0.0258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -9.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(35, 106).addBox(0.0F, -3.2771F, 0.013F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -11.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(105, 102).addBox(0.0F, -3.6036F, 0.0001F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 100).addBox(0.0F, -3.93F, -0.0127F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -15.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(103, 10).addBox(4.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0557F, 0.0835F, 1.2905F));

		PartDefinition neck19_r7 = body2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(103, 8).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0858F, 0.0521F, 0.8543F));

		PartDefinition neck18_r7 = body2.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(61, 108).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.1003F, -0.002F, 0.2894F));

		PartDefinition neck19_r8 = body2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(91, 45).addBox(4.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0366F, 0.0443F, 1.2743F));

		PartDefinition neck18_r8 = body2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(102, 38).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0518F, 0.0247F, 0.8381F));

		PartDefinition neck17_r7 = body2.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(75, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.057F, -0.007F, 0.2717F));

		PartDefinition neck18_r9 = body2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(68, 0).addBox(4.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0213F, 0.0129F, 1.2049F));

		PartDefinition neck17_r8 = body2.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(100, 84).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0247F, 0.0027F, 0.7687F));

		PartDefinition neck16_r7 = body2.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(47, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0223F, -0.011F, 0.2016F));

		PartDefinition neck17_r9 = body2.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(59, 38).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0175F, 0.005F, 1.1526F));

		PartDefinition neck16_r8 = body2.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(100, 80).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0179F, -0.0028F, 0.7163F));

		PartDefinition neck15_r6 = body2.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(107, 33).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0136F, -0.012F, 0.1492F));

		PartDefinition neck16_r9 = body2.addOrReplaceChild("neck16_r9", CubeListBuilder.create().texOffs(44, 30).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0175F, 0.005F, 1.109F));

		PartDefinition neck15_r7 = body2.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(73, 100).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0179F, -0.0028F, 0.6727F));

		PartDefinition neck14_r4 = body2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(107, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0136F, -0.012F, 0.1055F));

		PartDefinition neck15_r8 = body2.addOrReplaceChild("neck15_r8", CubeListBuilder.create().texOffs(40, 36).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.009F, -0.0102F, 1.0828F));

		PartDefinition neck14_r5 = body2.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(54, 100).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.0038F, -0.0131F, 0.6464F));

		PartDefinition neck13_r2 = body2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(107, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, 0.0038F, -0.0131F, 0.0791F));

		PartDefinition neck15_r9 = body2.addOrReplaceChild("neck15_r9", CubeListBuilder.create().texOffs(41, 0).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0095F, -0.0399F, 1.0998F));

		PartDefinition neck14_r6 = body2.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(103, 6).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0255F, -0.0321F, 0.6632F));

		PartDefinition neck13_r3 = body2.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(54, 108).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0387F, -0.0134F, 0.0961F));

		PartDefinition neck12_r1 = body2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(107, 27).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0213F, -0.0129F, 0.0789F));

		PartDefinition neck13_r4 = body2.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(98, 91).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.011F, -0.0223F, 0.6462F));

		PartDefinition neck14_r7 = body2.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(40, 34).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0005F, -0.0249F, 1.0826F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck20_r7 = body2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(103, 4).addBox(1.0884F, -2.097F, -8.663F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4281F, -0.3487F, 0.7117F));

		PartDefinition neck19_r9 = body2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(28, 108).addBox(0.0446F, -1.1838F, -8.663F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.5401F, -0.0787F, 0.1992F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(79, 73).addBox(3.7047F, -4.0424F, -8.663F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.2399F, -0.4945F, 1.1637F));

		PartDefinition neck20_r8 = body2.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(103, 61).addBox(2.6061F, -3.86F, -10.5867F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1423F, -0.6046F, 1.3395F));

		PartDefinition neck19_r10 = body2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(98, 36).addBox(0.0156F, -2.3959F, -10.5867F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4017F, -0.4846F, 0.8471F));

		PartDefinition neck18_r10 = body2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(50, 80).addBox(-0.6996F, -2.0123F, -10.5867F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.5873F, -0.2085F, 0.3171F));

		PartDefinition neck19_r11 = body2.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(65, 24).addBox(4.3482F, -3.6129F, -6.6747F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1985F, -0.416F, 1.1459F));

		PartDefinition neck18_r11 = body2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(65, 102).addBox(1.4901F, -1.4357F, -6.6747F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3568F, -0.2942F, 0.6982F));

		PartDefinition neck17_r10 = body2.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(21, 108).addBox(0.0281F, -0.4102F, -6.6747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.4541F, -0.065F, 0.1694F));

		PartDefinition neck18_r12 = body2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(62, 2).addBox(4.7178F, -3.3842F, -4.6486F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1654F, -0.3535F, 1.1402F));

		PartDefinition neck17_r11 = body2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(54, 102).addBox(1.7283F, -1.0723F, -4.6486F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3001F, -0.2511F, 0.6953F));

		PartDefinition neck16_r10 = body2.addOrReplaceChild("neck16_r10", CubeListBuilder.create().texOffs(14, 108).addBox(0.0338F, 0.0243F, -4.6486F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.385F, -0.0558F, 0.1554F));

		PartDefinition neck17_r12 = body2.addOrReplaceChild("neck17_r12", CubeListBuilder.create().texOffs(34, 48).addBox(5.0156F, -3.2069F, -2.6274F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.1368F, -0.2892F, 1.1143F));

		PartDefinition neck16_r11 = body2.addOrReplaceChild("neck16_r11", CubeListBuilder.create().texOffs(102, 42).addBox(1.9233F, -0.7857F, -2.6274F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.2466F, -0.2047F, 0.6725F));

		PartDefinition neck15_r10 = body2.addOrReplaceChild("neck15_r10", CubeListBuilder.create().texOffs(7, 108).addBox(0.0442F, 0.3707F, -2.6274F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.8473F, -17.2534F, 0.3163F, -0.043F, 0.1238F));

		PartDefinition neck14_r8 = body2.addOrReplaceChild("neck14_r8", CubeListBuilder.create().texOffs(0, 108).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0823F, -0.0145F, 0.113F));

		PartDefinition neck16_r12 = body2.addOrReplaceChild("neck16_r12", CubeListBuilder.create().texOffs(44, 32).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.032F, -0.0772F, 1.1159F));

		PartDefinition neck15_r11 = body2.addOrReplaceChild("neck15_r11", CubeListBuilder.create().texOffs(102, 40).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0617F, -0.0565F, 0.6791F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(59, 40).addBox(0.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(91, 39).addBox(0.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 77).addBox(0.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 11.6535F, -23.9464F, 0.5952F, 0.275F, -1.127F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6698F, 10.7583F, -0.2355F, -1.3796F, 0.1114F, 1.1764F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(101, 63).addBox(5.9564F, 15.1555F, 9.2664F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 81).addBox(4.9564F, 18.1555F, 8.6664F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 23).addBox(5.4564F, 21.1555F, 9.1664F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.7346F, -19.4761F, 5.7607F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(31, 95).addBox(5.4632F, 21.2393F, 4.2766F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(58, 69).addBox(5.9632F, 23.2393F, 4.7766F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.7346F, -19.4761F, 5.7607F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9069F, 7.8177F, -1.1504F, 1.0772F, -0.0743F, 0.0966F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(62, 4).addBox(4.3815F, 29.7217F, 1.1496F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.8183F, -27.2277F, 6.683F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(74, 40).addBox(4.3815F, 26.9596F, -13.5421F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8183F, -27.2277F, 6.683F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(18, 99).addBox(-7.6799F, 19.1222F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8183F, -27.2277F, 6.683F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(98, 87).addBox(15.25F, 14.0934F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8183F, -27.2277F, 6.683F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(100, 0).addBox(6.4815F, 18.8316F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.8183F, -27.2277F, 6.683F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(49, 59).addBox(-2.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(57, 91).addBox(-2.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(79, 58).addBox(-2.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3F, 11.6535F, -23.9464F, 0.5578F, -0.4887F, 1.038F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4698F, 9.1583F, -0.1355F, -1.6795F, -0.0826F, -0.773F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(9, 102).addBox(-7.6285F, 14.8625F, 11.3406F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 50).addBox(-8.6285F, 17.8625F, 10.7406F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 31).addBox(-8.1285F, 20.8625F, 11.2406F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0876F, -19.1176F, 5.7509F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(73, 95).addBox(-8.1354F, 21.183F, 6.3706F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 75).addBox(-7.6354F, 23.183F, 6.8706F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0876F, -19.1176F, 5.7509F, -0.2438F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8611F, 7.3052F, -1.0514F, 1.0829F, 0.1829F, -0.2617F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(62, 10).addBox(-12.5815F, 29.7217F, 1.1496F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.0277F, -27.2938F, 6.9112F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(74, 45).addBox(-12.5815F, 26.9596F, -13.5421F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0277F, -27.2938F, 6.9112F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(0, 100).addBox(3.8778F, 20.3841F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0277F, -27.2938F, 6.9112F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(94, 99).addBox(-19.2825F, 13.2515F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0277F, -27.2938F, 6.9112F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(27, 100).addBox(-10.6815F, 18.8316F, -22.1593F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.0277F, -27.2938F, 6.9112F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.7613F, -27.8333F, 0.2049F, 0.2224F, 0.0023F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(108, 102).addBox(-1.1F, -1.3164F, -12.6622F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 108).addBox(-1.1F, -1.6164F, -14.6622F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck22_r2 = neck.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(106, 44).mirror().addBox(2.0645F, -8.072F, -11.5383F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.6476F, 0.688F, -0.7098F));

		PartDefinition neck21_r5 = neck.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(107, 25).mirror().addBox(-0.9091F, -8.9917F, -11.5383F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.8726F, 0.2891F, -0.2463F));

		PartDefinition neck20_r9 = neck.addOrReplaceChild("neck20_r9", CubeListBuilder.create().texOffs(107, 25).addBox(-3.1359F, -8.1808F, -11.5582F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.8726F, -0.2891F, 0.2463F));

		PartDefinition neck21_r6 = neck.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(106, 44).addBox(-5.3536F, -6.2893F, -11.5582F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.6476F, -0.688F, 0.7098F));

		PartDefinition neck20_r10 = neck.addOrReplaceChild("neck20_r10", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-2.0179F, -6.1837F, -11.0701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.6983F, 0.2426F, -0.2923F));

		PartDefinition neck21_r7 = neck.addOrReplaceChild("neck21_r7", CubeListBuilder.create().texOffs(100, 82).mirror().addBox(-2.3794F, -6.2995F, -11.0701F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.4907F, 0.5679F, -0.8023F));

		PartDefinition neck19_r12 = neck.addOrReplaceChild("neck19_r12", CubeListBuilder.create().texOffs(82, 38).addBox(-2.0271F, -5.3728F, -11.0901F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.6983F, -0.2426F, 0.2923F));

		PartDefinition neck20_r11 = neck.addOrReplaceChild("neck20_r11", CubeListBuilder.create().texOffs(100, 82).addBox(-2.9097F, -4.5168F, -11.0901F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.4907F, -0.5679F, 0.8023F));

		PartDefinition cube_r19 = neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 16).addBox(-2.1F, -2.3481F, -16.5017F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -2.5473F, 11.2466F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.1F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 68).addBox(-2.6F, -26.5896F, -11.398F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(81, 11).addBox(-2.6F, -29.5383F, -2.2538F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(50, 83).addBox(-2.6F, -9.8373F, -25.2419F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 16).addBox(-2.6F, -17.7267F, -23.61F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(57, 97).addBox(-3.1F, -14.734F, -23.9069F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(94, 53).addBox(-3.1F, -14.734F, -23.4069F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(87, 0).addBox(-3.6F, -11.8909F, -24.0333F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(30, 70).addBox(-3.6F, -5.9688F, -25.2135F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 64).addBox(-2.6F, 7.1561F, -25.2472F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F))
				.texOffs(80, 16).addBox(-3.1F, 3.5153F, -20.7825F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(74, 83).addBox(-3.1F, 3.4885F, -21.8244F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(87, 87).addBox(-2.1F, -4.2628F, -23.5903F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 67).addBox(-3.6F, -3.0589F, -23.8928F, 5.0F, 5.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 63).mirror().addBox(1.5574F, 6.8448F, -14.0707F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.358F, 0.4346F, -0.0406F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-11.5972F, 8.1728F, -2.4182F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -1.2612F, -0.797F, 0.8907F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(11, 94).mirror().addBox(0.0254F, 7.1944F, -12.9341F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.5236F, 0.4747F, -0.2305F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-16.061F, 0.9178F, -19.2936F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.233F, -0.6108F, 0.2093F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-2.8911F, -0.8506F, -20.0527F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3598F, -0.0434F, 0.8416F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(74, 89).mirror().addBox(-9.4268F, -0.8506F, -19.2892F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3843F, -0.3528F, 0.7191F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-4.5897F, -0.8506F, -17.3811F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3606F, -0.0761F, 0.8292F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 104).mirror().addBox(-1.3513F, -0.8506F, -14.3251F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3634F, 0.1444F, 0.9126F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(92, 57).mirror().addBox(-9.4264F, -0.8506F, -12.9821F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.4199F, -0.5296F, 0.6361F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(15, 56).addBox(12.2981F, 0.1881F, -20.3889F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.233F, 0.6108F, -0.2093F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 57).addBox(6.8991F, -2.4084F, -13.2656F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.4199F, 0.5296F, -0.6361F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(54, 104).addBox(-0.9805F, -2.4084F, -13.5254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3634F, -0.1444F, -0.9126F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(84, 75).addBox(-0.5733F, -2.4084F, -19.5346F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3598F, 0.0434F, -0.8416F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 81).addBox(1.1081F, -2.4084F, -16.9145F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3606F, 0.0761F, -0.8292F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(74, 89).addBox(6.8734F, -2.4084F, -19.2761F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.3843F, 0.3528F, -0.7191F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(-3.0031F, -3.4393F, -21.9544F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(98, 26).mirror().addBox(-3.8431F, -3.4393F, -21.9544F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(103, 56).mirror().addBox(-3.5231F, -3.4393F, -21.9544F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.2443F, -0.0024F, 0.0301F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(103, 98).mirror().addBox(-2.2926F, -9.612F, -25.5424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.5236F, 0.0018F, 0.0302F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 108).mirror().addBox(-10.5165F, 1.6857F, -24.0378F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.0912F, -0.2937F, 0.0035F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(68, 108).addBox(7.4107F, 1.6199F, -24.6713F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.0912F, 0.2937F, -0.0035F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(103, 98).addBox(-0.9064F, -9.6675F, -25.5057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.5236F, -0.0018F, -0.0302F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(91, 103).addBox(-0.1959F, -3.5049F, -21.9434F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(103, 56).addBox(0.3241F, -3.5049F, -21.9434F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 26).addBox(-0.3559F, -3.5049F, -21.9434F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.2443F, 0.0024F, -0.0301F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(66, 50).addBox(-3.1F, -11.9779F, -16.9012F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 104).addBox(-2.1F, -12.0779F, -13.9012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(98, 21).addBox(-2.1F, -0.9299F, -16.0025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(97, 75).addBox(-2.1F, -10.1706F, -14.4601F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(96, 70).addBox(-1.6F, -7.604F, -18.9316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 100).addBox(-2.1F, 1.7742F, -15.6179F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(49, 50).addBox(-2.6F, 5.7742F, -19.6179F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(11, 94).addBox(-3.9305F, 7.1401F, -11.835F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.5236F, -0.4747F, 0.2305F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 46).addBox(9.6303F, 8.5942F, -4.3488F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -1.2612F, 0.797F, -0.8907F));

		PartDefinition cube_r58 = head.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 63).addBox(-6.5513F, 6.6041F, -13.1726F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -3.6473F, 14.3466F, -0.358F, -0.4346F, 0.0406F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0446F, -1.7846F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(103, 12).addBox(-2.6F, 5.557F, -25.5848F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(104, 15).mirror().addBox(-8.2737F, 21.3502F, -16.4323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.5395F, -0.2745F, 0.0522F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-13.4515F, 23.1544F, -2.2525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.1179F, -0.376F, -0.2123F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 47).mirror().addBox(-13.6485F, 21.0076F, 2.6521F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.3022F, -0.4405F, -0.0562F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(22, 81).mirror().addBox(-11.3066F, 21.41F, 13.6949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.7549F, -0.4246F, 0.1653F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(-12.4116F, 5.9153F, -18.0632F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.0785F, -0.4014F, 0.0F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-12.4116F, 1.0467F, -22.9518F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.3403F, -0.4014F, 0.0F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(85, 94).mirror().addBox(-12.4116F, -2.5941F, -22.7154F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.576F, -0.4014F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-12.4116F, 2.2843F, -20.0171F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.3316F, -0.4014F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-5.6F, 14.5507F, -11.5181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(0, 104).mirror().addBox(-5.6F, 13.6507F, -11.5181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(94, 94).addBox(2.4F, 14.5507F, -11.5181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 104).addBox(2.4F, 13.6507F, -11.5181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(41, 77).mirror().addBox(-5.6F, 7.2407F, -17.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(41, 77).addBox(2.4F, 7.2407F, -17.4978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(16, 103).mirror().addBox(-5.6F, -3.1617F, -20.6707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(16, 103).addBox(2.4F, -3.1617F, -20.6707F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(94, 4).mirror().addBox(-5.6F, 11.2564F, -17.765F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(94, 4).addBox(2.4F, 11.2564F, -17.765F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(68, 104).mirror().addBox(-8.3316F, 15.1657F, -21.4213F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.1905F, -0.2745F, 0.0522F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(104, 15).addBox(5.1589F, 21.5576F, -17.0022F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.5395F, 0.2745F, -0.0522F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(98, 108).addBox(-1.6F, 26.9345F, -9.5309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 104).addBox(-1.6F, 21.7021F, -18.3603F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(68, 104).addBox(5.2168F, 15.1657F, -22.0277F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.1905F, 0.2745F, -0.0522F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(98, 31).addBox(-1.6F, 15.1657F, -22.8766F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r78 = jaw.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(103, 93).addBox(10.4511F, 24.0675F, -2.1813F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.1179F, 0.376F, 0.2123F));

		PartDefinition cube_r79 = jaw.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(94, 47).addBox(10.6616F, 21.9433F, 2.5226F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.3022F, 0.4405F, 0.0562F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(22, 81).addBox(8.3292F, 22.3551F, 13.5026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, -1.7549F, 0.4246F, -0.1653F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(103, 47).addBox(9.3865F, 5.8479F, -18.9201F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.0785F, 0.4014F, 0.0F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 88).addBox(9.3865F, 0.7597F, -23.7621F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.3403F, 0.4014F, 0.0F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(85, 94).addBox(9.3865F, -3.0622F, -23.4363F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.576F, 0.4014F, 0.0F));

		PartDefinition cube_r84 = jaw.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(94, 10).addBox(9.3865F, 2.0044F, -20.8299F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -6.692F, 16.1312F, 0.3316F, 0.4014F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(3.159F, 0.6541F, -4.1995F, -0.0196F, 0.1264F, -0.0341F));

		PartDefinition cube_r85 = leftTusk.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(76, 102).addBox(5.0535F, 5.7809F, -26.1275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, 0.0372F, 0.1717F, -0.1961F));

		PartDefinition cube_r86 = leftTusk.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(34, 43).addBox(5.0535F, -0.6826F, -27.2541F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, 0.3514F, 0.1717F, -0.1961F));

		PartDefinition cube_r87 = leftTusk.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(36, 100).addBox(5.0535F, 21.0277F, -12.5281F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, -0.7569F, 0.1717F, -0.1961F));

		PartDefinition cube_r88 = leftTusk.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(108, 63).addBox(9.2981F, 4.7051F, -26.1666F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, 0.2343F, 0.2543F, 0.0253F));

		PartDefinition cube_r89 = leftTusk.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(107, 86).addBox(5.3534F, 12.56F, -23.717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, -0.135F, 0.1852F, -0.1868F));

		PartDefinition cube_r90 = leftTusk.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(22, 85).addBox(3.3214F, 10.7351F, -23.5416F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.059F, -4.3014F, 18.5461F, -0.259F, 0.1577F, -0.3994F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.159F, 0.6541F, -4.1995F, -0.0196F, -0.1264F, 0.0341F));

		PartDefinition cube_r91 = rightTusk.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(76, 102).mirror().addBox(-8.1796F, 6.223F, -25.775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, 0.0372F, -0.1717F, 0.1961F));

		PartDefinition cube_r92 = rightTusk.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(34, 43).mirror().addBox(-8.1796F, -0.1533F, -27.0555F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, 0.3514F, -0.1717F, 0.1961F));

		PartDefinition cube_r93 = rightTusk.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(36, 100).mirror().addBox(-8.1796F, 21.0862F, -11.9657F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, -0.7569F, -0.1717F, 0.1961F));

		PartDefinition cube_r94 = rightTusk.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(108, 63).mirror().addBox(-12.4266F, 4.7795F, -25.6155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, 0.2343F, -0.2543F, -0.0253F));

		PartDefinition cube_r95 = rightTusk.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-8.4782F, 12.9114F, -23.2676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, -0.135F, -0.1852F, 0.1868F));

		PartDefinition cube_r96 = rightTusk.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(22, 85).mirror().addBox(-6.323F, 11.4806F, -23.0148F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.259F, -4.3014F, 18.5461F, -0.259F, -0.1577F, 0.3994F));

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