package fossils.fossils.client.blockentity.model.rechnisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RechnisaurusFossilModel extends SkullModelBase {
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

	public RechnisaurusFossilModel(ModelPart root) {
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

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, -1.6976F, -0.1335F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5605F, 26.1222F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 45).addBox(0.0F, -2.7423F, 5.9997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 6).addBox(0.0F, -2.7423F, 3.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 71).addBox(0.0F, -2.7423F, 1.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 96).addBox(0.0F, -2.7423F, -0.0003F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, 18.1222F, -0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(23, 52).mirror().addBox(-1.7708F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 52).addBox(8.2292F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r2 = body.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(25, 21).mirror().addBox(-1.7708F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(25, 21).addBox(8.2292F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2392F, 0.0F, 0.0F));

		PartDefinition basin_r3 = body.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(-1.7708F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(9, 0).addBox(8.2292F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.2705F, 0.0F, 0.0F));

		PartDefinition basin_r4 = body.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-1.7708F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 66).mirror().addBox(-1.7708F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r5 = body.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-2.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2696F, 0.1346F, -0.4439F));

		PartDefinition basin_r6 = body.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(23, 62).mirror().addBox(-2.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8368F, 0.1346F, -0.4439F));

		PartDefinition basin_r7 = body.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-2.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -2.2557F, 0.1346F, -0.4439F));

		PartDefinition basin_r8 = body.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-2.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.034F, 0.1346F, -0.4439F));

		PartDefinition basin_r9 = body.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-2.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8456F, 0.1346F, -0.4439F));

		PartDefinition basin_r10 = body.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-1.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(18, 33).addBox(3.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 4.6902F, 22.4647F, -0.192F, 0.0F, 0.0F));

		PartDefinition basin_r11 = body.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(89, 49).addBox(-0.2292F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(68, 66).addBox(-0.2292F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r12 = body.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(23, 0).addBox(0.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.2696F, -0.1346F, 0.4439F));

		PartDefinition basin_r13 = body.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(23, 62).addBox(0.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8368F, -0.1346F, 0.4439F));

		PartDefinition basin_r14 = body.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(20, 80).addBox(0.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -2.2557F, -0.1346F, 0.4439F));

		PartDefinition basin_r15 = body.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(80, 6).addBox(0.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.034F, -0.1346F, 0.4439F));

		PartDefinition basin_r16 = body.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(82, 37).addBox(0.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8456F, -0.1346F, 0.4439F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.0121F, -0.0463F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(68, 51).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(76, 46).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, 0.2219F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.4068F, -0.083F, 0.3154F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(46, 86).addBox(-0.4531F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 75).addBox(-0.535F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 4.2372F, 1.1145F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.4207F, -0.0204F, -0.0277F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(35, 38).addBox(-3.1772F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 3.3818F, -2.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(28, 45).addBox(-3.1978F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 2.3818F, -5.018F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(73, 27).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.4326F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 1.0613F, 0.083F, -0.3154F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(65, 85).addBox(-1.5469F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 76).addBox(-1.465F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1816F, 4.2372F, 1.1145F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(35, 0).addBox(-2.8228F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 3.3818F, -2.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(44, 26).addBox(-2.8022F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 2.3818F, -5.018F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(46, 69).addBox(-1.0F, 0.022F, -0.9372F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8555F, 0.1996F, -0.1706F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 21).addBox(-15.0F, 8.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 21).addBox(-15.0F, 6.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 54).addBox(-15.0F, 4.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 80).addBox(-15.0F, 2.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 2).addBox(-15.0F, 0.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(40, 88).addBox(-0.5F, -0.8285F, -0.4852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.121F, -0.05F, 0.3897F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(67, 95).addBox(0.0F, -7.1693F, 9.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 95).addBox(0.0F, -6.7693F, 7.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 95).addBox(0.0F, -6.1693F, 5.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 95).addBox(0.0F, -5.7693F, 3.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 95).addBox(0.0F, -5.1693F, 1.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 95).addBox(0.0F, -4.5693F, -0.0104F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -28.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-1.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4707F, 4.2763F, -21.0293F, 1.0676F, -0.0122F, 0.3769F));

		PartDefinition chest_r2 = body2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-1.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4707F, 5.4763F, -22.1293F, 1.08F, -0.1166F, 0.1848F));

		PartDefinition chest_r3 = body2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(13, 42).mirror().addBox(-1.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8243F, 7.0169F, -24.4459F, 1.2754F, -0.4137F, -0.5237F));

		PartDefinition chest_r4 = body2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(7, 92).mirror().addBox(-0.3946F, -5.5187F, -0.6277F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5611F, 10.9542F, -28.7862F, -0.8776F, 1.3668F, -2.2897F));

		PartDefinition chest_r5 = body2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(-0.6966F, -0.5643F, -0.4332F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8611F, 11.2542F, -28.2862F, 1.2442F, 0.5347F, 0.1257F));

		PartDefinition chest_r6 = body2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(53, 87).mirror().addBox(2.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 14.5834F, -22.3554F, 1.1669F, 0.0F, 0.0822F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(91, 54).mirror().addBox(-8.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0557F, -0.0835F, -1.2905F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0858F, -0.0521F, -0.8543F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.1003F, 0.002F, -0.2894F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-10.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0366F, -0.0443F, -1.2743F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(90, 37).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0518F, -0.0247F, -0.8381F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(83, 13).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.057F, 0.007F, -0.2717F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-12.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0213F, -0.0129F, -1.2049F));

		PartDefinition neck18_r2 = body2.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0247F, -0.0027F, -0.7687F));

		PartDefinition neck17_r1 = body2.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(86, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0223F, 0.011F, -0.2016F));

		PartDefinition neck18_r3 = body2.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0175F, -0.005F, -1.1526F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(42, 11).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0179F, 0.0028F, -0.7163F));

		PartDefinition neck16_r1 = body2.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(8, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0136F, 0.012F, -0.1492F));

		PartDefinition neck17_r3 = body2.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(32, 35).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0175F, -0.005F, -1.109F));

		PartDefinition neck16_r2 = body2.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(11, 64).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0179F, 0.0028F, -0.6727F));

		PartDefinition neck15_r1 = body2.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0136F, 0.012F, -0.1055F));

		PartDefinition neck16_r3 = body2.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(23, 13).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.009F, 0.0102F, -1.0828F));

		PartDefinition neck15_r2 = body2.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.0038F, 0.0131F, -0.6464F));

		PartDefinition neck14_r1 = body2.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, 0.0038F, 0.0131F, -0.0791F));

		PartDefinition neck16_r4 = body2.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(32, 33).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0095F, 0.0399F, -1.0998F));

		PartDefinition neck15_r3 = body2.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(92, 22).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0255F, 0.0321F, -0.6632F));

		PartDefinition neck14_r2 = body2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0387F, 0.0134F, -0.0961F));

		PartDefinition neck13_r1 = body2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(77, 66).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0213F, 0.0129F, -0.0789F));

		PartDefinition neck14_r3 = body2.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.011F, 0.0223F, -0.6462F));

		PartDefinition neck15_r4 = body2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(23, 15).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0005F, 0.0249F, -1.0826F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(12, 93).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.2795F, 0.2201F, -0.7535F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(94, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.3518F, 0.0395F, -0.2104F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-11.6791F, -3.3688F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.1603F, 0.3169F, -1.1953F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(-7.6791F, -3.3688F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.0944F, 0.4171F, -1.363F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.2674F, 0.3371F, -0.9009F));

		PartDefinition neck19_r4 = body2.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(65, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.403F, 0.1455F, -0.3497F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(61, 39).mirror().addBox(-13.6791F, -3.3688F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.1175F, 0.24F, -1.1722F));

		PartDefinition neck19_r5 = body2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.208F, 0.1681F, -0.7324F));

		PartDefinition neck18_r4 = body2.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.2648F, 0.0317F, -0.1786F));

		PartDefinition neck19_r6 = body2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.0844F, 0.1781F, -1.1616F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.1518F, 0.1259F, -0.7232F));

		PartDefinition neck17_r4 = body2.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(95, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.1953F, 0.0252F, -0.1631F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(42, 7).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.052F, 0.1161F, -1.1314F));

		PartDefinition neck17_r5 = body2.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(93, 56).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.0962F, 0.0832F, -0.6941F));

		PartDefinition neck16_r5 = body2.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(95, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.1258F, 0.0187F, -0.1297F));

		PartDefinition neck15_r5 = body2.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(95, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0823F, 0.0145F, -0.113F));

		PartDefinition neck17_r6 = body2.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.032F, 0.0772F, -1.1159F));

		PartDefinition neck16_r6 = body2.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(72, 93).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0617F, 0.0565F, -0.6791F));

		PartDefinition chest_r7 = body2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(43, 46).addBox(0.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4707F, 4.2763F, -21.0293F, 1.0676F, 0.0122F, -0.3769F));

		PartDefinition chest_r8 = body2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(0, 81).addBox(0.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4707F, 5.4763F, -22.1293F, 1.08F, 0.1166F, -0.1848F));

		PartDefinition chest_r9 = body2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(13, 42).addBox(0.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8243F, 7.0169F, -24.4459F, 1.2754F, 0.4137F, 0.5237F));

		PartDefinition chest_r10 = body2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(7, 92).addBox(-0.6054F, -5.5187F, -0.6277F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5611F, 10.9542F, -28.7862F, -0.8776F, -1.3668F, 2.2897F));

		PartDefinition chest_r11 = body2.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(88, 94).addBox(-1.3034F, -0.5643F, -0.4332F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8611F, 11.2542F, -28.2862F, 1.2442F, -0.5347F, -0.1257F));

		PartDefinition chest_r12 = body2.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(53, 87).addBox(-5.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 14.5834F, -22.3554F, 1.1669F, 0.0F, -0.0822F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 6).addBox(-1.0F, 0.0052F, 0.0067F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -29.1F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 0.0019F, 0.1302F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, -24.4F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 78).addBox(0.0F, -3.1419F, 0.0207F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 95).addBox(0.0F, -3.4689F, 0.0191F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 95).addBox(0.0F, -3.6954F, 0.0063F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(95, 94).addBox(0.0F, -3.6237F, 0.0274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 96).addBox(0.0F, -3.7507F, 0.0258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -9.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 95).addBox(0.0F, -3.9771F, 0.013F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -11.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, -4.2036F, 0.0001F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 90).addBox(0.0F, -4.43F, -0.0127F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -15.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(91, 54).addBox(4.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0557F, 0.0835F, 1.2905F));

		PartDefinition neck19_r7 = body2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(92, 16).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0858F, 0.0521F, 0.8543F));

		PartDefinition neck18_r7 = body2.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(93, 81).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.1003F, -0.002F, 0.2894F));

		PartDefinition neck19_r8 = body2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(0, 16).addBox(4.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0366F, 0.0443F, 1.2743F));

		PartDefinition neck18_r8 = body2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(90, 37).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0518F, 0.0247F, 0.8381F));

		PartDefinition neck17_r7 = body2.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(83, 13).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.057F, -0.007F, 0.2717F));

		PartDefinition neck18_r9 = body2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(0, 45).addBox(4.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0213F, 0.0129F, 1.2049F));

		PartDefinition neck17_r8 = body2.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(91, 33).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0247F, 0.0027F, 0.7687F));

		PartDefinition neck16_r7 = body2.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(86, 29).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0223F, -0.011F, 0.2016F));

		PartDefinition neck17_r9 = body2.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(51, 20).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0175F, 0.005F, 1.1526F));

		PartDefinition neck16_r8 = body2.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(42, 11).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0179F, -0.0028F, 0.7163F));

		PartDefinition neck15_r6 = body2.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(8, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0136F, -0.012F, 0.1492F));

		PartDefinition neck16_r9 = body2.addOrReplaceChild("neck16_r9", CubeListBuilder.create().texOffs(32, 35).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0175F, 0.005F, 1.109F));

		PartDefinition neck15_r7 = body2.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(11, 64).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0179F, -0.0028F, 0.6727F));

		PartDefinition neck14_r4 = body2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(41, 69).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0136F, -0.012F, 0.1055F));

		PartDefinition neck15_r8 = body2.addOrReplaceChild("neck15_r8", CubeListBuilder.create().texOffs(23, 13).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.009F, -0.0102F, 1.0828F));

		PartDefinition neck14_r5 = body2.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(67, 46).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.0038F, -0.0131F, 0.6464F));

		PartDefinition neck13_r2 = body2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(76, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, 0.0038F, -0.0131F, 0.0791F));

		PartDefinition neck15_r9 = body2.addOrReplaceChild("neck15_r9", CubeListBuilder.create().texOffs(32, 33).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0095F, -0.0399F, 1.0998F));

		PartDefinition neck14_r6 = body2.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(92, 22).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0255F, -0.0321F, 0.6632F));

		PartDefinition neck13_r3 = body2.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(94, 43).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0387F, -0.0134F, 0.0961F));

		PartDefinition neck12_r1 = body2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(77, 66).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0213F, -0.0129F, 0.0789F));

		PartDefinition neck13_r4 = body2.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(0, 79).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.011F, -0.0223F, 0.6462F));

		PartDefinition neck14_r7 = body2.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(23, 15).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0005F, -0.0249F, 1.0826F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck20_r7 = body2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(12, 93).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.2795F, -0.2201F, 0.7535F));

		PartDefinition neck19_r9 = body2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(94, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.3518F, -0.0395F, 0.2104F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(0, 14).addBox(4.6791F, -3.3688F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.1603F, -0.3169F, 1.1953F));

		PartDefinition neck20_r8 = body2.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(15, 28).addBox(4.6791F, -3.3688F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.0944F, -0.4171F, 1.363F));

		PartDefinition neck19_r10 = body2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(87, 0).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.2674F, -0.3371F, 0.9009F));

		PartDefinition neck18_r10 = body2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(65, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.403F, -0.1455F, 0.3497F));

		PartDefinition neck19_r11 = body2.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(61, 39).addBox(4.6791F, -3.3688F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.1175F, -0.24F, 1.1722F));

		PartDefinition neck18_r11 = body2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(93, 39).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.208F, -0.1681F, 0.7324F));

		PartDefinition neck17_r10 = body2.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(95, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.2648F, -0.0317F, 0.1786F));

		PartDefinition neck18_r12 = body2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(52, 49).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.0844F, -0.1781F, 1.1616F));

		PartDefinition neck17_r11 = body2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(93, 41).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.1518F, -0.1259F, 0.7232F));

		PartDefinition neck16_r10 = body2.addOrReplaceChild("neck16_r10", CubeListBuilder.create().texOffs(95, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.1953F, -0.0252F, 0.1631F));

		PartDefinition neck17_r12 = body2.addOrReplaceChild("neck17_r12", CubeListBuilder.create().texOffs(42, 7).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.052F, -0.1161F, 1.1314F));

		PartDefinition neck16_r11 = body2.addOrReplaceChild("neck16_r11", CubeListBuilder.create().texOffs(93, 56).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.0962F, -0.0832F, 0.6941F));

		PartDefinition neck15_r10 = body2.addOrReplaceChild("neck15_r10", CubeListBuilder.create().texOffs(95, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.1258F, -0.0187F, 0.1297F));

		PartDefinition neck14_r8 = body2.addOrReplaceChild("neck14_r8", CubeListBuilder.create().texOffs(95, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0823F, -0.0145F, 0.113F));

		PartDefinition neck16_r12 = body2.addOrReplaceChild("neck16_r12", CubeListBuilder.create().texOffs(42, 9).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.032F, -0.0772F, 1.1159F));

		PartDefinition neck15_r11 = body2.addOrReplaceChild("neck15_r11", CubeListBuilder.create().texOffs(72, 93).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0617F, -0.0565F, 0.6791F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(33, 57).addBox(0.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(20, 87).addBox(0.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(75, 58).addBox(0.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 9.6611F, -23.7721F, -0.3196F, 0.0778F, -0.6333F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -0.3651F, 0.0616F, 0.5775F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(92, 88).addBox(0.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 66).addBox(-0.8188F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 85).addBox(-0.3188F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(51, 62).addBox(-0.3119F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(0.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 1.0039F, 0.0383F, 0.0694F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(57, 33).addBox(-1.0002F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(68, 14).addBox(-0.9655F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(75, 6).addBox(0.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(89, 83).addBox(0.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.754F, 0.4068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(91, 29).addBox(3.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(53, 52).addBox(-2.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(86, 43).addBox(-2.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 72).addBox(-2.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3F, 9.6611F, -23.7721F, 0.7297F, -0.0487F, 0.6007F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.7565F, -0.1179F, -0.6028F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(23, 0).addBox(-1.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 80).addBox(-2.1812F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(84, 54).addBox(-1.6812F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(33, 52).addBox(-1.6881F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.2438F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 0.6548F, -0.0383F, -0.0694F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-4.9998F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(67, 41).addBox(-5.0345F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(56, 22).addBox(-2.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(43, 57).addBox(-2.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.754F, 0.4068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(83, 90).addBox(-5.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -28.7F, -0.2988F, -0.1121F, 0.0873F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(72, 85).addBox(0.0F, -4.278F, 2.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 87).addBox(0.0F, -3.578F, 0.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, -3.2511F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck21_r5 = neck.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(28, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.8726F, 0.2891F, -0.2463F));

		PartDefinition neck22_r2 = neck.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-3.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.6476F, 0.688F, -0.7098F));

		PartDefinition neck20_r9 = neck.addOrReplaceChild("neck20_r9", CubeListBuilder.create().texOffs(21, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.6983F, 0.2426F, -0.2923F));

		PartDefinition neck21_r6 = neck.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(37, 26).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.4907F, 0.5679F, -0.8023F));

		PartDefinition neck20_r10 = neck.addOrReplaceChild("neck20_r10", CubeListBuilder.create().texOffs(28, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.8726F, -0.2891F, 0.2463F));

		PartDefinition neck21_r7 = neck.addOrReplaceChild("neck21_r7", CubeListBuilder.create().texOffs(52, 0).addBox(1.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.6476F, -0.688F, 0.7098F));

		PartDefinition neck19_r12 = neck.addOrReplaceChild("neck19_r12", CubeListBuilder.create().texOffs(21, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.6983F, -0.2426F, 0.2923F));

		PartDefinition neck20_r11 = neck.addOrReplaceChild("neck20_r11", CubeListBuilder.create().texOffs(37, 26).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.4907F, -0.5679F, 0.8023F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 62).addBox(-1.0F, -0.1214F, -1.1678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.1F, 0.1077F, 0.0108F, 0.0488F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(55, 70).addBox(-2.0F, -1.8F, -1.1F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 2.3056F, -12.7699F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 0).addBox(-0.5F, -0.0195F, -1.0972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6638F, -14.2879F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 43).addBox(-0.5F, -0.0479F, -0.9968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0638F, -13.4879F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(76, 35).addBox(-0.5F, -0.0544F, -2.066F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2362F, -12.2879F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 0).addBox(1.0F, 0.0252F, 0.0722F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.2358F, -12.6058F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 34).addBox(1.0F, -0.0982F, -0.1021F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 1.7642F, -14.6058F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 59).addBox(-0.5F, 0.0077F, -3.0546F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.9362F, -9.8879F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -0.0299F, -3.9675F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7362F, -9.5879F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.3162F, -2.5641F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9362F, -7.3879F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(93, 76).mirror().addBox(-0.0802F, -0.8031F, -0.9991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(93, 71).mirror().addBox(-0.6002F, -0.8031F, -0.9991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 101).mirror().addBox(-0.9202F, -0.8031F, -0.9991F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-2.8396F, -1.5209F, -6.3906F, 0.2443F, -0.0024F, 0.0301F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(1.1F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-2.4848F, 1.1078F, -12.3207F, 0.7155F, -0.0024F, 0.0301F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.8636F, -0.6824F, -0.1854F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7992F, 1.653F, -14.2793F, 0.6496F, 0.4302F, -0.7207F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(28, 90).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9478F, -1.2171F, -10.1743F, 0.7128F, 0.2329F, -0.9589F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-0.5F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1859F, -1.9828F, -8.1083F, 0.0757F, 0.2329F, -0.9589F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(82, 83).addBox(-0.1364F, -0.6824F, -0.1854F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7992F, 1.653F, -14.2793F, 0.6496F, -0.4302F, 0.7207F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(28, 90).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9478F, -1.2171F, -10.1743F, 0.7128F, -0.2329F, 0.9589F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 10).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1859F, -1.9828F, -8.1083F, 0.0757F, -0.2329F, 0.9589F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(61, 22).addBox(-1.5F, -2.9599F, -3.8954F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.2331F, -7.0968F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(84, 22).addBox(-1.0F, -1.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.9331F, -7.2968F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(15, 21).addBox(-3.0F, -0.0302F, -0.0033F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.5362F, -6.8879F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(51, 11).addBox(-2.5F, -0.1599F, -0.3494F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.6362F, -9.3879F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(86, 73).mirror().addBox(-5.7F, -3.1F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(86, 73).addBox(3.7F, -3.1F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2642F, -0.6058F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 64).mirror().addBox(-4.8419F, -0.5039F, 2.7016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2789F, -0.4372F, -5.0648F, 0.4165F, 0.5165F, 1.073F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 75).mirror().addBox(-1.5F, -3.5F, -1.4F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.3684F, -0.952F, -0.358F, 0.4346F, -0.0406F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(82, 31).mirror().addBox(-0.1933F, -0.5039F, 0.451F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.2789F, -0.4372F, -5.0648F, 0.3598F, -0.0434F, 0.8416F));

		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(11, 56).mirror().addBox(-0.3243F, -0.5096F, -2.4115F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5789F, 0.7628F, -7.8648F, 0.233F, -0.6108F, 0.2093F));

		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-0.4917F, -0.5039F, -0.0334F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2789F, -0.4372F, -5.0648F, 0.3981F, -0.4335F, 0.6831F));

		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1115F, -0.3936F, -0.162F, 1.0F, 7.0F, 6.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.2744F, -6.2901F, -1.7007F, -0.8977F, -0.871F, 0.2653F));

		PartDefinition cube_r47 = head.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8885F, -0.3936F, -0.162F, 1.0F, 7.0F, 6.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.2744F, -6.2901F, -1.7007F, -0.8977F, 0.871F, -0.2653F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(32, 37).addBox(-1.0F, 0.0172F, 0.0541F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -6.6358F, -1.6058F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(11, 56).addBox(-1.6757F, -0.5096F, -2.4115F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5789F, 0.7628F, -7.8648F, 0.233F, 0.6108F, -0.2093F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(91, 64).addBox(2.8419F, -0.5039F, 2.7016F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(5.2789F, -0.4372F, -5.0648F, 0.4165F, -0.5165F, -1.073F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(82, 31).addBox(-1.8067F, -0.5039F, 0.451F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.2789F, -0.4372F, -5.0648F, 0.3598F, 0.0434F, -0.8416F));

		PartDefinition cube_r52 = head.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 60).addBox(-1.5083F, -0.5039F, -0.0334F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2789F, -0.4372F, -5.0648F, 0.3981F, 0.4335F, -0.6831F));

		PartDefinition cube_r53 = head.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 62).addBox(-2.1F, 0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.4848F, 1.1078F, -12.3207F, 0.7155F, 0.0024F, -0.0301F));

		PartDefinition cube_r54 = head.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(93, 76).addBox(-0.9198F, -0.8031F, -0.9991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(93, 71).addBox(-0.3998F, -0.8031F, -0.9991F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(36, 101).addBox(-1.0798F, -0.8031F, -0.9991F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(2.8396F, -1.5209F, -6.3906F, 0.2443F, 0.0024F, -0.0301F));

		PartDefinition cube_r55 = head.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 19).addBox(-2.0F, 0.9172F, -7.0459F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 78).addBox(-1.0F, 0.9172F, -4.0459F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(42, 61).addBox(-0.5F, -0.0828F, -6.0459F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6358F, -1.6058F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r56 = head.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(37, 17).addBox(-2.0F, -6.2F, -4.6F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.2642F, -2.1058F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r57 = head.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(66, 75).addBox(-1.5F, -3.5F, -1.4F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.5F, -0.3684F, -0.952F, -0.358F, -0.4346F, 0.0406F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(33, 67).addBox(3.5F, -0.1736F, -3.8725F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F))
				.texOffs(33, 67).mirror().addBox(-4.5F, -0.1736F, -3.8725F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0642F, -1.5058F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.9088F, -0.9759F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8528F, -7.9821F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 84).mirror().addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4764F, -11.1225F, -0.4069F, -0.2575F, 0.1093F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(61, 41).mirror().addBox(-0.5F, -1.0474F, -0.7609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 93).mirror().addBox(-0.5F, -1.0474F, -0.1609F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.5682F, -8.8849F, -0.7156F, -0.4538F, 0.0F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-0.5F, -1.7371F, -1.2983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 3.5682F, -8.8849F, -0.9774F, -0.4538F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(0.0285F, -0.0761F, -0.0973F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.2563F, -6.5832F, 0.0611F, -0.4014F, 0.0F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(0.0F, -2.5419F, -5.1609F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 0.9563F, -3.6832F, 0.6545F, -0.4014F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(0.0F, -0.9729F, -5.4592F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 0.9563F, -3.6832F, 0.3316F, -0.4014F, 0.0F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(29, 84).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.4764F, -11.1225F, -0.4069F, 0.2575F, -0.1093F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 87).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4764F, -11.1225F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 41).addBox(-0.5F, -1.0474F, -0.7609F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 93).addBox(-0.5F, -1.0474F, -0.1609F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.3F, 3.5682F, -8.8849F, -0.7156F, 0.4538F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 51).addBox(-0.5F, -1.7371F, -1.2983F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, 3.5682F, -8.8849F, -0.9774F, 0.4538F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(22, 42).addBox(-1.0285F, -0.0761F, -0.0973F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(2.9F, 0.2563F, -6.5832F, 0.0611F, 0.4014F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(89, 3).addBox(-1.0F, -2.5419F, -5.1609F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.1F, 0.9563F, -3.6832F, 0.6545F, 0.4014F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, -0.9729F, -5.4592F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 0.9563F, -3.6832F, 0.3316F, 0.4014F, 0.0F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(3.159F, 0.6541F, -4.1995F, -0.0196F, 0.1264F, -0.0341F));

		PartDefinition cube_r72 = leftTusk.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(52, 37).addBox(-1.0F, -1.063F, -1.2348F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8788F, 5.6952F, -7.5367F, 0.3519F, 0.1577F, -0.2075F));

		PartDefinition cube_r73 = leftTusk.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 94).addBox(-1.0F, -1.4886F, -0.2517F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.8788F, 5.6952F, -7.5367F, -1.0444F, 0.1577F, -0.2075F));

		PartDefinition cube_r74 = leftTusk.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 81).addBox(-0.5198F, 0.5439F, -0.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7588F, 5.9733F, -6.5722F, -0.3128F, 0.243F, -0.1333F));

		PartDefinition cube_r75 = leftTusk.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 34).addBox(-0.6198F, -4.2266F, -1.0672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7588F, 5.9733F, -6.5722F, -0.5493F, 0.1321F, -0.3246F));

		PartDefinition cube_r76 = leftTusk.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 89).addBox(-1.6343F, -4.5519F, -0.8534F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3788F, 0.9952F, -4.1367F, -0.9571F, 0.1577F, -0.3994F));

		PartDefinition cube_r77 = leftTusk.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(84, 16).addBox(-1.5F, -1.3F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6482F, 2.0464F, -4.8605F, -0.3151F, 0.2145F, -0.2315F));

		PartDefinition cube_r78 = leftTusk.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(13, 67).addBox(-1.6343F, -0.4666F, -3.4476F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3788F, 0.9952F, -4.1367F, -0.3462F, 0.1577F, -0.3994F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.159F, 0.6541F, -4.1995F, -0.0196F, -0.1264F, 0.0341F));

		PartDefinition cube_r79 = rightTusk.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 37).mirror().addBox(0.0F, -1.063F, -1.2348F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8788F, 5.6952F, -7.5367F, 0.3519F, -0.1577F, 0.2075F));

		PartDefinition cube_r80 = rightTusk.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(81, 94).mirror().addBox(0.0F, -1.4886F, -0.2517F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8788F, 5.6952F, -7.5367F, -1.0444F, -0.1577F, 0.2075F));

		PartDefinition cube_r81 = rightTusk.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(46, 81).mirror().addBox(-0.4802F, 0.5439F, -0.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7588F, 5.9733F, -6.5722F, -0.3128F, -0.243F, 0.1333F));

		PartDefinition cube_r82 = rightTusk.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-0.3802F, -4.2266F, -1.0672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7588F, 5.9733F, -6.5722F, -0.5493F, -0.1321F, 0.3246F));

		PartDefinition cube_r83 = rightTusk.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(0.6343F, -4.5519F, -0.8534F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.9952F, -4.1367F, -0.9571F, -0.1577F, 0.3994F));

		PartDefinition cube_r84 = rightTusk.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-0.5F, -1.3F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6482F, 2.0464F, -4.8605F, -0.3151F, -0.2145F, 0.2315F));

		PartDefinition cube_r85 = rightTusk.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(13, 67).mirror().addBox(0.6343F, -0.4666F, -3.4476F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3788F, 0.9952F, -4.1367F, -0.3462F, -0.1577F, 0.3994F));

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