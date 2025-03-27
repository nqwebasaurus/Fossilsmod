package fossils.fossils.client.blockentity.model.stahleckeria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StahleckeriaFossilModel extends SkullModelBase {
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

	public StahleckeriaFossilModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, -1.6976F, -0.1335F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5605F, 26.1222F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 48).addBox(0.0F, -2.7423F, 5.9997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 56).addBox(0.0F, -2.7423F, 3.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 67).addBox(0.0F, -2.7423F, 1.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 85).addBox(0.0F, -2.7423F, -0.0003F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, 18.1222F, -0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-2.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -2.2557F, 0.1346F, -0.4439F));

		PartDefinition basin_r2 = body.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(89, 76).mirror().addBox(-2.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8456F, 0.1346F, -0.4439F));

		PartDefinition basin_r3 = body.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-2.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.034F, 0.1346F, -0.4439F));

		PartDefinition basin_r4 = body.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(38, 14).mirror().addBox(-2.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2696F, 0.1346F, -0.4439F));

		PartDefinition basin_r5 = body.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(63, 50).mirror().addBox(-2.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8368F, 0.1346F, -0.4439F));

		PartDefinition basin_r6 = body.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(95, 40).mirror().addBox(-1.7708F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 79).mirror().addBox(-1.7708F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r7 = body.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(5, 42).mirror().addBox(-1.7708F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(5, 42).addBox(8.2292F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2392F, 0.0F, 0.0F));

		PartDefinition basin_r8 = body.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(9, 0).mirror().addBox(-1.7708F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(9, 0).addBox(8.2292F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.2705F, 0.0F, 0.0F));

		PartDefinition basin_r9 = body.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(26, 57).mirror().addBox(-1.7708F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 57).addBox(8.2292F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r10 = body.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(46, 27).mirror().addBox(-1.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 27).addBox(3.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 4.6902F, 22.4647F, -0.192F, 0.0F, 0.0F));

		PartDefinition basin_r11 = body.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(95, 40).addBox(-0.2292F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 79).addBox(-0.2292F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r12 = body.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(38, 14).addBox(0.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.2696F, -0.1346F, 0.4439F));

		PartDefinition basin_r13 = body.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(63, 50).addBox(0.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8368F, -0.1346F, 0.4439F));

		PartDefinition basin_r14 = body.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(86, 21).addBox(0.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -2.2557F, -0.1346F, 0.4439F));

		PartDefinition basin_r15 = body.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(5, 86).addBox(0.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.034F, -0.1346F, 0.4439F));

		PartDefinition basin_r16 = body.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(89, 76).addBox(0.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8456F, -0.1346F, 0.4439F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 21).addBox(-1.0F, -0.0121F, -0.0463F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(75, 56).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 34).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, -0.2144F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 1.2368F, 0.0407F, 0.2725F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(0, 93).addBox(-0.4531F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 85).addBox(-0.535F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 4.2372F, 1.1145F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.0274F, 0.1098F, -0.0142F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(50, 14).addBox(-3.1772F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 3.3818F, -2.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(5, 57).addBox(-3.1978F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 2.3818F, -5.018F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(75, 23).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(80, 3).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.258F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(29, 92).addBox(-1.5469F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 67).addBox(-1.465F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1816F, 4.2372F, 1.1145F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, -0.1153F, 0.0204F, 0.0277F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(46, 48).addBox(-2.8228F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 3.3818F, -2.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(46, 55).addBox(-2.8022F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 2.3818F, -5.018F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0F, 0.022F, -0.9372F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8651F, 0.1334F, -0.1129F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 21).addBox(-15.0F, 8.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 21).addBox(-15.0F, 6.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 29).addBox(-15.0F, 4.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 23).addBox(-15.0F, 2.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 72).addBox(-15.0F, 0.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 94).addBox(-0.5F, -0.8285F, -0.4852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1289F, 0.0227F, -0.1731F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 99).addBox(0.0F, -7.1693F, 9.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 99).addBox(0.0F, -6.7693F, 7.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(0.0F, -6.1693F, 5.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 78).addBox(0.0F, -5.7693F, 3.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 83).addBox(0.0F, -5.1693F, 1.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 99).addBox(0.0F, -4.5693F, -0.0104F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -28.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(29, 67).mirror().addBox(-0.3946F, -5.5187F, -0.6277F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5611F, 10.9542F, -28.7862F, -0.8776F, 1.3668F, -2.2897F));

		PartDefinition chest_r2 = body2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-0.6966F, -0.5643F, -0.4332F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8611F, 11.2542F, -28.2862F, 1.2442F, 0.5347F, 0.1257F));

		PartDefinition chest_r3 = body2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(14, 94).mirror().addBox(2.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, 14.5834F, -22.3554F, 1.1669F, 0.0F, 0.0822F));

		PartDefinition chest_r4 = body2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.8243F, 7.0169F, -24.4459F, 1.2754F, -0.4137F, -0.5237F));

		PartDefinition chest_r5 = body2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(88, 42).mirror().addBox(-1.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4707F, 5.4763F, -22.1293F, 1.08F, -0.1166F, 0.1848F));

		PartDefinition chest_r6 = body2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-1.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4707F, 4.2763F, -21.0293F, 1.0676F, -0.0122F, 0.3769F));

		PartDefinition chest_r7 = body2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(0, 21).addBox(0.8386F, -3.7428F, -0.9843F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4707F, 4.2763F, -21.0293F, 1.0676F, 0.0122F, -0.3769F));

		PartDefinition chest_r8 = body2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(88, 42).addBox(0.9763F, -2.3126F, -2.6082F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4707F, 5.4763F, -22.1293F, 1.08F, 0.1166F, -0.1848F));

		PartDefinition chest_r9 = body2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.4595F, -2.0343F, -5.4464F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8243F, 7.0169F, -24.4459F, 1.2754F, 0.4137F, 0.5237F));

		PartDefinition chest_r10 = body2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(29, 67).addBox(-0.6054F, -5.5187F, -0.6277F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5611F, 10.9542F, -28.7862F, -0.8776F, -1.3668F, 2.2897F));

		PartDefinition chest_r11 = body2.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(99, 45).addBox(-1.3034F, -0.5643F, -0.4332F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8611F, 11.2542F, -28.2862F, 1.2442F, -0.5347F, -0.1257F));

		PartDefinition chest_r12 = body2.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(14, 94).addBox(-5.1518F, -5.0246F, 0.4449F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 14.5834F, -22.3554F, 1.1669F, 0.0F, -0.0822F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(70, 9).addBox(-1.0F, 0.0052F, 0.0067F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -29.1F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 36).addBox(-1.0F, 0.0019F, 0.1302F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5F, -24.4F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 99).addBox(0.0F, -3.1419F, 0.0207F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 99).addBox(0.0F, -3.4689F, 0.0191F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 99).addBox(0.0F, -3.6954F, 0.0063F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(86, 99).addBox(0.0F, -3.6237F, 0.0274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(89, 99).addBox(0.0F, -3.7507F, 0.0258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -9.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 13).addBox(0.0F, -3.9771F, 0.013F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -11.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, -4.2036F, 0.0001F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 27).addBox(0.0F, -4.43F, -0.0127F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -15.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-8.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0557F, -0.0835F, -1.2905F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-10.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0366F, -0.0443F, -1.2743F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(79, 1).mirror().addBox(-12.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0213F, -0.0129F, -1.2049F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(58, 41).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0175F, -0.005F, -1.1526F));

		PartDefinition neck17_r1 = body2.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0175F, -0.005F, -1.109F));

		PartDefinition neck16_r1 = body2.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(46, 46).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.009F, 0.0102F, -1.0828F));

		PartDefinition neck15_r1 = body2.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0005F, 0.0249F, -1.0826F));

		PartDefinition neck16_r2 = body2.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0095F, 0.0399F, -1.0998F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.032F, 0.0772F, -1.1159F));

		PartDefinition neck18_r2 = body2.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(55, 2).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.052F, 0.1161F, -1.1314F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(59, 4).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.0844F, 0.1781F, -1.1616F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(-13.6791F, -3.3688F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.1175F, 0.24F, -1.1722F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(88, 50).mirror().addBox(-11.6791F, -3.3688F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.1603F, 0.3169F, -1.1953F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(23, 8).mirror().addBox(-7.6791F, -3.3688F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.0944F, 0.4171F, -1.363F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.2674F, 0.3371F, -0.9009F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.2795F, 0.2201F, -0.7535F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(96, 54).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.208F, 0.1681F, -0.7324F));

		PartDefinition neck18_r3 = body2.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(96, 56).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.1518F, 0.1259F, -0.7232F));

		PartDefinition neck17_r3 = body2.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.0962F, 0.0832F, -0.6941F));

		PartDefinition neck16_r3 = body2.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(97, 76).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0617F, 0.0565F, -0.6791F));

		PartDefinition neck15_r2 = body2.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(97, 94).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0255F, 0.0321F, -0.6632F));

		PartDefinition neck14_r1 = body2.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.011F, 0.0223F, -0.6462F));

		PartDefinition neck15_r3 = body2.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(90, 52).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.0038F, 0.0131F, -0.6464F));

		PartDefinition neck16_r4 = body2.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(80, 11).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0179F, 0.0028F, -0.6727F));

		PartDefinition neck17_r4 = body2.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0179F, 0.0028F, -0.7163F));

		PartDefinition neck18_r4 = body2.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(95, 22).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0247F, -0.0027F, -0.7687F));

		PartDefinition neck19_r4 = body2.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0518F, -0.0247F, -0.8381F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0858F, -0.0521F, -0.8543F));

		PartDefinition neck19_r5 = body2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(99, 30).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.1003F, 0.002F, -0.2894F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(85, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.057F, 0.007F, -0.2717F));

		PartDefinition neck17_r5 = body2.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0223F, 0.011F, -0.2016F));

		PartDefinition neck16_r5 = body2.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(74, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0136F, 0.012F, -0.1492F));

		PartDefinition neck15_r4 = body2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(53, 76).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0136F, 0.012F, -0.1055F));

		PartDefinition neck14_r2 = body2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, 0.0038F, 0.0131F, -0.0791F));

		PartDefinition neck13_r1 = body2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(83, 23).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0213F, 0.0129F, -0.0789F));

		PartDefinition neck14_r3 = body2.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(99, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0387F, 0.0134F, -0.0961F));

		PartDefinition neck16_r6 = body2.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(14, 88).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2073F, -19.3162F, 0.1258F, 0.0187F, -0.1297F));

		PartDefinition neck15_r5 = body2.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(99, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0823F, 0.0145F, -0.113F));

		PartDefinition neck17_r6 = body2.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.0073F, -21.3162F, 0.1953F, 0.0252F, -0.1631F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.3927F, -23.3162F, 0.2648F, 0.0317F, -0.1786F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(45, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.8927F, -25.3162F, 0.3518F, 0.0395F, -0.2104F));

		PartDefinition neck19_r6 = body2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(63, 48).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.3927F, -27.3162F, 0.403F, 0.1455F, -0.3497F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(98, 91).addBox(4.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0557F, 0.0835F, 1.2905F));

		PartDefinition neck19_r7 = body2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(98, 82).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0858F, 0.0521F, 0.8543F));

		PartDefinition neck18_r7 = body2.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(99, 30).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.1003F, -0.002F, 0.2894F));

		PartDefinition neck19_r8 = body2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(38, 27).addBox(4.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0366F, 0.0443F, 1.2743F));

		PartDefinition neck18_r8 = body2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(93, 9).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0518F, 0.0247F, 0.8381F));

		PartDefinition neck17_r7 = body2.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(85, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.057F, -0.007F, 0.2717F));

		PartDefinition neck18_r9 = body2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(79, 1).addBox(4.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0213F, 0.0129F, 1.2049F));

		PartDefinition neck17_r8 = body2.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(95, 22).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0247F, 0.0027F, 0.7687F));

		PartDefinition neck16_r7 = body2.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(85, 44).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0223F, -0.011F, 0.2016F));

		PartDefinition neck17_r9 = body2.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(58, 41).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0175F, 0.005F, 1.1526F));

		PartDefinition neck16_r8 = body2.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(65, 43).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0179F, -0.0028F, 0.7163F));

		PartDefinition neck15_r6 = body2.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(74, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0136F, -0.012F, 0.1492F));

		PartDefinition neck16_r9 = body2.addOrReplaceChild("neck16_r9", CubeListBuilder.create().texOffs(55, 0).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0175F, 0.005F, 1.109F));

		PartDefinition neck15_r7 = body2.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(80, 11).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0179F, -0.0028F, 0.6727F));

		PartDefinition neck14_r4 = body2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(53, 76).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0136F, -0.012F, 0.1055F));

		PartDefinition neck15_r8 = body2.addOrReplaceChild("neck15_r8", CubeListBuilder.create().texOffs(46, 46).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.009F, -0.0102F, 1.0828F));

		PartDefinition neck14_r5 = body2.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(90, 52).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.0038F, -0.0131F, 0.6464F));

		PartDefinition neck13_r2 = body2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(82, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, 0.0038F, -0.0131F, 0.0791F));

		PartDefinition neck15_r9 = body2.addOrReplaceChild("neck15_r9", CubeListBuilder.create().texOffs(48, 9).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0095F, -0.0399F, 1.0998F));

		PartDefinition neck14_r6 = body2.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(97, 94).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0255F, -0.0321F, 0.6632F));

		PartDefinition neck13_r3 = body2.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(99, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0387F, -0.0134F, 0.0961F));

		PartDefinition neck12_r1 = body2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(83, 23).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0213F, -0.0129F, 0.0789F));

		PartDefinition neck13_r4 = body2.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(92, 74).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.011F, -0.0223F, 0.6462F));

		PartDefinition neck14_r7 = body2.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(47, 12).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0005F, -0.0249F, 1.0826F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck20_r7 = body2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(96, 28).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.2795F, -0.2201F, 0.7535F));

		PartDefinition neck19_r9 = body2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(45, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.3518F, -0.0395F, 0.2104F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(88, 50).addBox(4.6791F, -3.3688F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.8927F, -25.3162F, 0.1603F, -0.3169F, 1.1953F));

		PartDefinition neck20_r8 = body2.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(23, 8).addBox(4.6791F, -3.3688F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.0944F, -0.4171F, 1.363F));

		PartDefinition neck19_r10 = body2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(5, 54).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.2674F, -0.3371F, 0.9009F));

		PartDefinition neck18_r10 = body2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(63, 48).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.3927F, -27.3162F, 0.403F, -0.1455F, 0.3497F));

		PartDefinition neck19_r11 = body2.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(59, 6).addBox(4.6791F, -3.3688F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.1175F, -0.24F, 1.1722F));

		PartDefinition neck18_r11 = body2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(96, 54).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.208F, -0.1681F, 0.7324F));

		PartDefinition neck17_r10 = body2.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(14, 86).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.3927F, -23.3162F, 0.2648F, -0.0317F, 0.1786F));

		PartDefinition neck18_r12 = body2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(59, 4).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.0844F, -0.1781F, 1.1616F));

		PartDefinition neck17_r11 = body2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(96, 56).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.1518F, -0.1259F, 0.7232F));

		PartDefinition neck16_r10 = body2.addOrReplaceChild("neck16_r10", CubeListBuilder.create().texOffs(84, 87).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.0073F, -21.3162F, 0.1953F, -0.0252F, 0.1631F));

		PartDefinition neck17_r12 = body2.addOrReplaceChild("neck17_r12", CubeListBuilder.create().texOffs(55, 2).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.052F, -0.1161F, 1.1314F));

		PartDefinition neck16_r11 = body2.addOrReplaceChild("neck16_r11", CubeListBuilder.create().texOffs(97, 0).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.0962F, -0.0832F, 0.6941F));

		PartDefinition neck15_r10 = body2.addOrReplaceChild("neck15_r10", CubeListBuilder.create().texOffs(14, 88).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2073F, -19.3162F, 0.1258F, -0.0187F, 0.1297F));

		PartDefinition neck14_r8 = body2.addOrReplaceChild("neck14_r8", CubeListBuilder.create().texOffs(99, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0823F, -0.0145F, 0.113F));

		PartDefinition neck16_r12 = body2.addOrReplaceChild("neck16_r12", CubeListBuilder.create().texOffs(57, 21).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.032F, -0.0772F, 1.1159F));

		PartDefinition neck15_r11 = body2.addOrReplaceChild("neck15_r11", CubeListBuilder.create().texOffs(97, 76).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0617F, -0.0565F, 0.6791F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(36, 62).addBox(0.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(93, 34).addBox(0.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(81, 13).addBox(0.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 9.6611F, -23.7721F, 0.1168F, 0.0778F, -0.6333F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -0.6293F, 0.0923F, 0.5673F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(53, 94).addBox(0.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 87).addBox(-0.8188F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 21).addBox(-0.3188F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(95, 17).addBox(-0.3119F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(0.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 0.7857F, 0.0383F, 0.0694F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(5, 64).addBox(-1.0002F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(73, 50).addBox(-0.9655F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(71, 17).addBox(0.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(94, 87).addBox(0.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.754F, 0.4068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(90, 95).addBox(3.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(60, 23).addBox(-2.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(93, 3).addBox(-2.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(79, 79).addBox(-2.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3F, 9.6611F, -23.7721F, 0.7297F, -0.0487F, 0.6007F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.9746F, -0.1179F, -0.6028F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(29, 47).addBox(-1.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(86, 55).addBox(-2.1812F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 0).addBox(-1.6812F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(72, 94).addBox(-1.6881F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.2438F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 1.1784F, -0.0383F, -0.0694F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(51, 62).addBox(-4.9998F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(17, 42).addBox(-5.0345F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(22, 57).addBox(-2.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(56, 68).addBox(-2.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.754F, 0.4068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(81, 95).addBox(-5.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7F, -28.7F, -0.134F, 0.2163F, -0.0289F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 99).addBox(0.0F, -4.278F, 2.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 100).addBox(0.0F, -3.578F, 0.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, -3.2511F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck21_r5 = neck.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(38, 29).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.3263F, 0.4049F, -0.8795F));

		PartDefinition neck20_r9 = neck.addOrReplaceChild("neck20_r9", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.4862F, 0.1749F, -0.3364F));

		PartDefinition neck21_r6 = neck.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(17, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.8726F, 0.2891F, -0.2463F));

		PartDefinition neck20_r10 = neck.addOrReplaceChild("neck20_r10", CubeListBuilder.create().texOffs(17, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.8726F, -0.2891F, 0.2463F));

		PartDefinition neck22_r2 = neck.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(23, 29).mirror().addBox(-3.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.6476F, 0.688F, -0.7098F));

		PartDefinition neck21_r7 = neck.addOrReplaceChild("neck21_r7", CubeListBuilder.create().texOffs(23, 29).addBox(1.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.6476F, -0.688F, 0.7098F));

		PartDefinition neck19_r12 = neck.addOrReplaceChild("neck19_r12", CubeListBuilder.create().texOffs(58, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.6983F, -0.2426F, 0.2923F));

		PartDefinition neck20_r11 = neck.addOrReplaceChild("neck20_r11", CubeListBuilder.create().texOffs(38, 29).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.4907F, -0.5679F, 0.8023F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(29, 72).addBox(-1.0F, -0.1214F, -1.1678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0723F, -4.0511F, -0.0052F, 0.2098F, 0.0085F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 86).mirror().addBox(0.1625F, -3.4097F, -2.1166F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 87).mirror().addBox(0.1625F, -0.4097F, -2.1166F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.1922F, -8.8457F, -0.6981F, -0.1745F, 0.48F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 21).mirror().addBox(0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(9, 21).addBox(4.44F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-2.97F, 2.1969F, -11.5054F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 99).mirror().addBox(-6.02F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 97).mirror().addBox(-6.46F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(36, 97).mirror().addBox(-6.34F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(36, 97).addBox(-0.66F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 97).addBox(-0.54F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(43, 99).addBox(-0.98F, -0.9F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(38, 0).addBox(-6.0F, -2.0F, -3.7F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.8078F, -5.8457F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(0.0F, -0.3302F, -1.0114F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.3879F, -5.3673F, 0.2313F, -0.7641F, 0.1948F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.4117F, -0.3774F, -0.0391F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4789F, -0.4577F, -3.0873F, 0.3172F, -0.8104F, 0.6053F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-6.5F, -3.3F, -1.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 72).mirror().addBox(-4.5F, -4.3F, -1.2F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 83).addBox(4.5F, -3.3F, -1.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 72).addBox(1.5F, -4.3F, -1.2F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8078F, 0.1543F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(7, 93).mirror().addBox(-2.6663F, 0.0507F, -0.7379F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.9796F, -0.3007F, -0.6748F, 0.6629F, -0.4576F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(18, 86).addBox(-1.1625F, -3.4097F, -2.1166F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(87, 87).addBox(-1.1625F, -0.4097F, -2.1166F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.1922F, -8.8457F, -0.6981F, 0.1745F, -0.48F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(90, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 3.597F, -13.5825F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 43).addBox(-2.0F, -0.089F, -0.0483F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.5691F, -13.4852F, 1.3875F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 11).addBox(0.5F, 2.0046F, -2.7878F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 13).addBox(-0.5F, 0.0046F, -2.7878F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 13).addBox(-1.0F, 0.0046F, -1.9878F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, -1.5078F, -11.3457F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(47, 88).addBox(0.5F, 1.8911F, -1.8424F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(23, 34).addBox(-0.5F, -0.1089F, -1.8424F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-2.5F, -2.3078F, -9.6457F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5883F, -0.3774F, -0.0391F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4789F, -0.4577F, -3.0873F, 0.3172F, 0.8104F, -0.6053F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(92, 68).addBox(-1.0F, -0.3302F, -1.0114F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.3879F, -5.3673F, 0.2313F, 0.7641F, -0.1948F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(7, 93).addBox(0.6663F, 0.0507F, -0.7379F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9796F, -0.3007F, -0.6748F, -0.6629F, 0.4576F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 72).addBox(-1.5F, -3.052F, 0.0423F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6922F, -5.0457F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 33).addBox(-1.5F, -0.0062F, -4.9557F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(65, 63).addBox(-1.0F, 1.9938F, -4.9557F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.3078F, -3.8457F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 62).addBox(-1.0F, 0.0F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 28).addBox(-1.5F, 0.0F, -2.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 75).addBox(-1.0F, 2.0F, -2.8F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8078F, -1.0457F, 0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.4922F, -2.3457F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(10, 70).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.1F, 1.7918F, -8.8438F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(44, 94).mirror().addBox(1.15F, -1.6031F, -9.639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(57, 23).mirror().addBox(0.25F, -1.6031F, -6.639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(67, 59).mirror().addBox(0.25F, -1.6031F, -4.639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, 0.3126F, -0.1736F, 0.0184F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(47, 76).mirror().addBox(1.15F, 6.5039F, -6.1419F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, -0.6648F, -0.1736F, 0.0184F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(65, 95).mirror().addBox(1.15F, 6.4356F, -0.2387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, -1.3979F, -0.1736F, 0.0184F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(0.25F, 5.0028F, 0.2824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, -1.0313F, -0.1736F, 0.0184F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 32).mirror().addBox(0.25F, 4.4606F, -4.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, -0.4379F, -0.1736F, 0.0184F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 42).mirror().addBox(0.25F, -3.9144F, -6.0002F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, 0.8012F, -0.1736F, 0.0184F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-0.55F, 0.145F, 0.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 76).mirror().addBox(-0.55F, 0.145F, -4.825F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, -0.0016F, -0.1736F, 0.0184F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-0.55F, 0.713F, -5.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.55F, -0.1051F, -0.4048F, 0.522F, -0.1736F, 0.0184F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 32).addBox(-1.25F, 5.0028F, 0.2824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, -1.0313F, 0.1736F, -0.0184F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(47, 76).addBox(-2.15F, 6.5039F, -6.1419F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, -0.6648F, 0.1736F, -0.0184F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(65, 95).addBox(-2.15F, 6.4356F, -0.2387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, -1.3979F, 0.1736F, -0.0184F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(10, 32).addBox(-1.25F, 4.4606F, -4.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, -0.4379F, 0.1736F, -0.0184F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 82).addBox(-0.45F, 0.713F, -5.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, 0.522F, 0.1736F, -0.0184F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(44, 94).addBox(-2.15F, -1.6031F, -9.639F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F))
				.texOffs(67, 59).addBox(-1.25F, -1.6031F, -4.639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(57, 23).addBox(-1.25F, -1.6031F, -6.639F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, 0.3126F, 0.1736F, -0.0184F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(5, 42).addBox(-1.25F, -3.9144F, -6.0002F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, 0.8012F, 0.1736F, -0.0184F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(46, 36).addBox(-0.45F, 0.145F, 0.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 76).addBox(-0.45F, 0.145F, -4.825F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.55F, -0.1051F, -0.4048F, -0.0016F, 0.1736F, -0.0184F));

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