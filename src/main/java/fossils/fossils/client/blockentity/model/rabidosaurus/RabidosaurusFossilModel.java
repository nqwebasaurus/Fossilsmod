package fossils.fossils.client.blockentity.model.rabidosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RabidosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public RabidosaurusFossilModel(ModelPart root) {
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
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftTusk = this.head.getChild("leftTusk");
		this.rightTusk = this.head.getChild("rightTusk");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -8.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 112).addBox(0.0F, -1.6976F, -0.1335F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5605F, 26.1222F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(41, 85).addBox(0.0F, -2.7423F, 5.9997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 112).addBox(0.0F, -2.7423F, 3.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 70).addBox(0.0F, -2.7423F, 1.9997F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 112).addBox(0.0F, -2.7423F, -0.0003F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, 18.1222F, -0.3491F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(-1.7708F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 59).addBox(8.2292F, -4.3202F, -2.6452F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r2 = body.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-1.7708F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 34).addBox(8.2292F, -1.5256F, -5.0992F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2392F, 0.0F, 0.0F));

		PartDefinition basin_r3 = body.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(100, 86).mirror().addBox(-1.7708F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(100, 86).addBox(8.2292F, -5.0746F, -1.6485F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -0.2705F, 0.0F, 0.0F));

		PartDefinition basin_r4 = body.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-1.7708F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 81).mirror().addBox(-1.7708F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r5 = body.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(25, 32).mirror().addBox(-2.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.2696F, 0.1346F, -0.4439F));

		PartDefinition basin_r6 = body.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-2.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8368F, 0.1346F, -0.4439F));

		PartDefinition basin_r7 = body.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(90, 19).mirror().addBox(-2.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -2.2557F, 0.1346F, -0.4439F));

		PartDefinition basin_r8 = body.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(87, 7).mirror().addBox(-2.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.034F, 0.1346F, -0.4439F));

		PartDefinition basin_r9 = body.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(82, 92).mirror().addBox(-2.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.2292F, 6.0103F, 22.7318F, -1.8456F, 0.1346F, -0.4439F));

		PartDefinition basin_r10 = body.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-1.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(41, 0).addBox(3.5F, -1.6F, -3.5F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5F, 4.6902F, 22.4647F, -0.192F, 0.0F, 0.0F));

		PartDefinition basin_r11 = body.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(102, 47).addBox(-0.2292F, 4.116F, -0.1029F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(15, 81).addBox(-0.2292F, 0.116F, -0.1029F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 2.0103F, 18.8318F, -0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r12 = body.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(25, 32).addBox(0.217F, -2.5284F, 0.7958F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.2696F, -0.1346F, 0.4439F));

		PartDefinition basin_r13 = body.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(0, 66).addBox(0.217F, -6.432F, 1.8078F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8368F, -0.1346F, 0.4439F));

		PartDefinition basin_r14 = body.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(90, 19).addBox(0.217F, -6.0375F, 3.4479F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -2.2557F, -0.1346F, 0.4439F));

		PartDefinition basin_r15 = body.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(87, 7).addBox(0.217F, 2.0288F, 2.3145F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.034F, -0.1346F, 0.4439F));

		PartDefinition basin_r16 = body.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(82, 92).addBox(0.217F, -0.9082F, 1.491F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.2292F, 6.0103F, 22.7318F, -1.8456F, -0.1346F, 0.4439F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.0121F, -0.0463F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 18.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(80, 33).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(79, 84).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, 6.5665F, 23.4382F, 0.1347F, -0.1034F, -0.2533F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2839F, 11.1184F, -0.9447F, 0.7559F, -0.083F, 0.3154F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(93, 86).addBox(-0.4531F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 89).addBox(-0.535F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 4.2372F, 1.1145F, 1.8627F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0885F, 8.9576F, 0.4756F, -0.4207F, -0.0204F, -0.0277F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(19, 45).addBox(-3.1772F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 3.3818F, -2.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(48, 22).addBox(-3.1978F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0012F, 2.3818F, -5.018F, -0.0041F, -0.0059F, -0.0341F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(80, 44).addBox(-1.0F, 3.8F, -2.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(87, 55).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 6.5665F, 23.4382F, -0.5198F, 0.1034F, 0.2533F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2839F, 11.1184F, -0.9447F, 0.4068F, 0.083F, -0.3154F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(59, 94).addBox(-1.5469F, -3.8317F, 0.6108F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 89).addBox(-1.465F, -4.845F, -1.7873F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1816F, 4.2372F, 1.1145F, 1.8627F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0885F, 8.9576F, 0.4756F, 0.3211F, 0.0204F, 0.0277F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(48, 15).addBox(-2.8228F, -1.9865F, 0.4319F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 3.3818F, -2.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(34, 52).addBox(-2.8022F, -0.9966F, -1.9638F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0012F, 2.3818F, -5.018F, -0.0041F, 0.0059F, 0.0341F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, 0.022F, -0.9372F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7F, 27.0F, 0.8012F, 0.3931F, -0.3554F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(83, 67).addBox(-15.0F, 8.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 16).addBox(-15.0F, 6.0F, 0.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 46).addBox(-15.0F, 4.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 32).addBox(-15.0F, 2.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(111, 10).addBox(-15.0F, 0.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(19, 34).addBox(-0.5F, -0.8285F, -0.4852F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.822F, 0.3628F, 0.1041F, 0.0795F, -0.6504F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, 17.8F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 110).addBox(0.0F, -7.1693F, 9.9896F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -28.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 108).addBox(-0.1F, -5.6248F, -2.3826F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 107).addBox(-0.1F, -6.0248F, -4.3826F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 55).addBox(-0.1F, -5.6248F, -6.3826F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 108).addBox(-0.1F, -4.0248F, -8.3826F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 54).addBox(-0.1F, -2.4248F, -10.3826F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -0.0611F, -0.1745F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-6.0815F, -3.1972F, -8.9462F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.0027F, -0.1744F, 0.383F));

		PartDefinition chest_r2 = body2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(91, 33).mirror().addBox(-7.7508F, -2.1972F, -11.0304F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.0467F, -0.288F, 0.1916F));

		PartDefinition chest_r3 = body2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(19, 52).mirror().addBox(-13.324F, -3.1972F, -9.3533F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.3783F, -0.5628F, -0.5721F));

		PartDefinition chest_r4 = body2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(54, 101).mirror().addBox(8.957F, -3.6677F, -13.9447F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.103F, 1.4129F, -1.3224F));

		PartDefinition chest_r5 = body2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(59, 108).mirror().addBox(4.3781F, -5.5125F, -15.1083F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.2209F, 0.3614F, 0.1156F));

		PartDefinition chest_r6 = body2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(11, 97).mirror().addBox(-2.655F, -3.1178F, -16.0745F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.1524F, -0.1739F, 0.0835F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(70, 106).mirror().addBox(-8.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0557F, -0.0835F, -1.2905F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(59, 106).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.0858F, -0.0521F, -0.8543F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(112, 56).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0927F, -1.3162F, -0.1003F, 0.002F, -0.2894F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(99, 14).mirror().addBox(-10.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0366F, -0.0443F, -1.2743F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(105, 2).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.0518F, -0.0247F, -0.8381F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(112, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1073F, -3.3162F, -0.057F, 0.007F, -0.2717F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(69, 27).mirror().addBox(-12.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0213F, -0.0129F, -1.2049F));

		PartDefinition neck18_r2 = body2.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0247F, -0.0027F, -0.7687F));

		PartDefinition neck17_r1 = body2.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(112, 22).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -5.3162F, -0.0223F, 0.011F, -0.2016F));

		PartDefinition neck18_r3 = body2.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(63, 31).mirror().addBox(-14.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0175F, -0.005F, -1.1526F));

		PartDefinition neck17_r2 = body2.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(104, 44).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0179F, 0.0028F, -0.7163F));

		PartDefinition neck16_r1 = body2.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(112, 20).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -7.3162F, -0.0136F, 0.012F, -0.1492F));

		PartDefinition neck17_r3 = body2.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0175F, -0.005F, -1.109F));

		PartDefinition neck16_r2 = body2.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(104, 42).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0179F, 0.0028F, -0.6727F));

		PartDefinition neck15_r1 = body2.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(19, 112).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3073F, -9.3162F, -0.0136F, 0.012F, -0.1055F));

		PartDefinition neck16_r3 = body2.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(41, 11).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.009F, 0.0102F, -1.0828F));

		PartDefinition neck15_r2 = body2.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(103, 75).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, -0.0038F, 0.0131F, -0.6464F));

		PartDefinition neck14_r1 = body2.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(112, 18).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -11.3162F, 0.0038F, 0.0131F, -0.0791F));

		PartDefinition neck16_r4 = body2.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(41, 13).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0095F, 0.0399F, -1.0998F));

		PartDefinition neck15_r3 = body2.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0255F, 0.0321F, -0.6632F));

		PartDefinition neck14_r2 = body2.addOrReplaceChild("neck14_r2", CubeListBuilder.create().texOffs(112, 54).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -15.3162F, 0.0387F, 0.0134F, -0.0961F));

		PartDefinition neck13_r1 = body2.addOrReplaceChild("neck13_r1", CubeListBuilder.create().texOffs(112, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0213F, 0.0129F, -0.0789F));

		PartDefinition neck14_r3 = body2.addOrReplaceChild("neck14_r3", CubeListBuilder.create().texOffs(102, 52).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.011F, 0.0223F, -0.6462F));

		PartDefinition neck15_r4 = body2.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(41, 9).mirror().addBox(-16.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -13.3162F, 0.0005F, 0.0249F, -1.0826F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(105, 81).mirror().addBox(-6.0616F, -2.8017F, -8.3004F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3991F, 0.0916F, -0.7349F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-3.2441F, -1.2552F, -8.3004F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3884F, -0.1312F, -0.2121F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(-11.289F, -5.0924F, -8.3004F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3278F, 0.2489F, -1.1484F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-6.0331F, -4.997F, -10.2703F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2781F, 0.375F, -1.292F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-4.8831F, -3.246F, -10.2703F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.4075F, 0.2259F, -0.8619F));

		PartDefinition neck19_r4 = body2.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(111, 36).mirror().addBox(-2.4888F, -2.2631F, -10.2703F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.4625F, -0.0186F, -0.3459F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(69, 25).mirror().addBox(-13.9406F, -4.6613F, -6.3207F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2806F, 0.1694F, -1.1389F));

		PartDefinition neck19_r5 = body2.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(105, 79).mirror().addBox(-6.47F, -2.1355F, -6.3207F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3245F, 0.0375F, -0.7204F));

		PartDefinition neck18_r4 = body2.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-3.2306F, -0.474F, -6.3207F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.296F, -0.1401F, -0.1803F));

		PartDefinition neck19_r6 = body2.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(64, 65).mirror().addBox(-15.3061F, -4.4353F, -4.296F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2453F, 0.1067F, -1.1387F));

		PartDefinition neck18_r5 = body2.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(105, 77).mirror().addBox(-6.7057F, -1.7763F, -4.296F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.267F, -0.0055F, -0.7163F));

		PartDefinition neck17_r4 = body2.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(112, 28).mirror().addBox(-3.2364F, -0.0443F, -4.296F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2238F, -0.147F, -0.1648F));

		PartDefinition neck18_r6 = body2.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-15.6359F, -3.4419F, -0.2601F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1073F, -19.7162F, 0.1154F, 0.0862F, -1.125F));

		PartDefinition neck17_r5 = body2.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(9, 105).mirror().addBox(-5.6785F, -1.1592F, -0.2601F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1073F, -19.7162F, 0.1409F, 0.0295F, -0.6916F));

		PartDefinition neck16_r5 = body2.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(112, 26).mirror().addBox(-2.0384F, -0.0758F, -0.2601F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1073F, -19.7162F, 0.1348F, -0.0505F, -0.1299F));

		PartDefinition neck15_r5 = body2.addOrReplaceChild("neck15_r5", CubeListBuilder.create().texOffs(26, 112).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0823F, 0.0145F, -0.113F));

		PartDefinition neck17_r6 = body2.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(55, 52).mirror().addBox(-15.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.032F, 0.0772F, -1.1159F));

		PartDefinition neck16_r6 = body2.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(105, 4).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.4073F, -17.3162F, 0.0617F, 0.0565F, -0.6791F));

		PartDefinition chest_r7 = body2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(0, 55).addBox(4.8956F, -3.2347F, -8.8828F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.1323F, -0.15F, -0.3814F));

		PartDefinition chest_r8 = body2.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(91, 33).addBox(6.5555F, -2.2347F, -11.0087F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.112F, -0.055F, -0.1839F));

		PartDefinition chest_r9 = body2.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(19, 52).addBox(12.1654F, -3.2347F, -9.4693F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.1854F, 0.2612F, 0.4938F));

		PartDefinition chest_r10 = body2.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(54, 101).addBox(-9.9303F, -3.4724F, -13.9113F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -1.2749F, -1.2262F, 2.6733F));

		PartDefinition chest_r11 = body2.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(59, 108).addBox(-6.5489F, -5.4248F, -15.0521F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.2728F, -0.7077F, -0.1424F));

		PartDefinition chest_r12 = body2.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(11, 97).addBox(-0.5443F, -3.1243F, -16.0594F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 1.1814F, -0.1739F, -0.0835F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 73).addBox(-1.1F, -1.4185F, -11.5157F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2705F, -0.1745F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 32).addBox(-1.1F, -0.716F, -6.6277F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.1658F, -0.1745F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 110).addBox(0.0F, -3.1419F, 0.0207F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 112).addBox(0.0F, -3.4689F, 0.0191F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 112).addBox(0.0F, -3.6954F, 0.0063F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(110, 111).addBox(0.0F, -3.6237F, 0.0274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 96).addBox(0.0F, -3.7507F, 0.0258F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -9.8F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(79, 108).addBox(0.0F, -3.9771F, 0.013F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -11.8F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 45).addBox(0.0F, -4.2036F, 0.0001F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(109, 85).addBox(0.0F, -4.43F, -0.0127F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -15.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition neck20_r6 = body2.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(70, 106).addBox(4.6791F, -3.3688F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0557F, 0.0835F, 1.2905F));

		PartDefinition neck19_r7 = body2.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(59, 106).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.0858F, 0.0521F, 0.8543F));

		PartDefinition neck18_r7 = body2.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(112, 56).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.0927F, -1.3162F, -0.1003F, -0.002F, 0.2894F));

		PartDefinition neck19_r8 = body2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(99, 14).addBox(4.6791F, -3.3688F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0366F, 0.0443F, 1.2743F));

		PartDefinition neck18_r8 = body2.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(105, 2).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.0518F, 0.0247F, 0.8381F));

		PartDefinition neck17_r7 = body2.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(112, 24).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.1073F, -3.3162F, -0.057F, -0.007F, 0.2717F));

		PartDefinition neck18_r9 = body2.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(69, 27).addBox(4.6791F, -3.3688F, -0.5F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0213F, 0.0129F, 1.2049F));

		PartDefinition neck17_r8 = body2.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(105, 0).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0247F, 0.0027F, 0.7687F));

		PartDefinition neck16_r7 = body2.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(112, 22).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -5.3162F, -0.0223F, -0.011F, 0.2016F));

		PartDefinition neck17_r9 = body2.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(63, 31).addBox(4.6791F, -3.3688F, -0.5F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0175F, 0.005F, 1.1526F));

		PartDefinition neck16_r8 = body2.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(104, 44).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0179F, -0.0028F, 0.7163F));

		PartDefinition neck15_r6 = body2.addOrReplaceChild("neck15_r6", CubeListBuilder.create().texOffs(112, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -7.3162F, -0.0136F, -0.012F, 0.1492F));

		PartDefinition neck16_r9 = body2.addOrReplaceChild("neck16_r9", CubeListBuilder.create().texOffs(48, 29).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0175F, 0.005F, 1.109F));

		PartDefinition neck15_r7 = body2.addOrReplaceChild("neck15_r7", CubeListBuilder.create().texOffs(104, 42).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0179F, -0.0028F, 0.6727F));

		PartDefinition neck14_r4 = body2.addOrReplaceChild("neck14_r4", CubeListBuilder.create().texOffs(19, 112).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.3073F, -9.3162F, -0.0136F, -0.012F, 0.1055F));

		PartDefinition neck15_r8 = body2.addOrReplaceChild("neck15_r8", CubeListBuilder.create().texOffs(41, 11).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.009F, -0.0102F, 1.0828F));

		PartDefinition neck14_r5 = body2.addOrReplaceChild("neck14_r5", CubeListBuilder.create().texOffs(103, 75).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, -0.0038F, -0.0131F, 0.6464F));

		PartDefinition neck13_r2 = body2.addOrReplaceChild("neck13_r2", CubeListBuilder.create().texOffs(112, 18).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -11.3162F, 0.0038F, -0.0131F, 0.0791F));

		PartDefinition neck15_r9 = body2.addOrReplaceChild("neck15_r9", CubeListBuilder.create().texOffs(41, 13).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0095F, -0.0399F, 1.0998F));

		PartDefinition neck14_r6 = body2.addOrReplaceChild("neck14_r6", CubeListBuilder.create().texOffs(105, 83).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0255F, -0.0321F, 0.6632F));

		PartDefinition neck13_r3 = body2.addOrReplaceChild("neck13_r3", CubeListBuilder.create().texOffs(112, 54).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -15.3162F, 0.0387F, -0.0134F, 0.0961F));

		PartDefinition neck12_r1 = body2.addOrReplaceChild("neck12_r1", CubeListBuilder.create().texOffs(112, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0213F, -0.0129F, 0.0789F));

		PartDefinition neck13_r4 = body2.addOrReplaceChild("neck13_r4", CubeListBuilder.create().texOffs(102, 52).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.011F, -0.0223F, 0.6462F));

		PartDefinition neck14_r7 = body2.addOrReplaceChild("neck14_r7", CubeListBuilder.create().texOffs(41, 9).addBox(4.6791F, -3.3688F, -0.5F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -13.3162F, 0.0005F, -0.0249F, 1.0826F));

		PartDefinition cube_r17 = body2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.3F, 0.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck20_r7 = body2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(105, 81).addBox(1.9193F, -2.6614F, -8.3076F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.1529F, -0.3454F, 0.789F));

		PartDefinition neck19_r9 = body2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(33, 112).addBox(1.0486F, -1.2133F, -8.3076F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3147F, -0.2101F, 0.215F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(73, 29).addBox(4.2193F, -4.9051F, -8.3076F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -0.0142F, -0.3762F, 1.2547F));

		PartDefinition neck20_r8 = body2.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(0, 95).addBox(2.9954F, -4.8006F, -10.2721F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -0.0951F, -0.4464F, 1.4425F));

		PartDefinition neck19_r10 = body2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(100, 12).addBox(0.7659F, -3.0839F, -10.2721F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.1163F, -0.4417F, 0.9585F));

		PartDefinition neck18_r10 = body2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(111, 36).addBox(0.3029F, -2.1894F, -10.2721F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.3405F, -0.3091F, 0.3638F));

		PartDefinition neck19_r11 = body2.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(69, 25).addBox(4.8652F, -4.4761F, -6.324F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -0.051F, -0.3042F, 1.2176F));

		PartDefinition neck18_r11 = body2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(105, 79).addBox(2.3233F, -1.9995F, -6.324F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.0863F, -0.2964F, 0.7605F));

		PartDefinition neck17_r10 = body2.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(112, 30).addBox(1.0338F, -0.4381F, -6.324F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.2333F, -0.2034F, 0.1823F));

		PartDefinition neck18_r12 = body2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(64, 65).addBox(5.2278F, -4.2513F, -4.2974F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, -0.0806F, -0.2449F, 1.1963F));

		PartDefinition neck17_r11 = body2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(105, 77).addBox(2.557F, -1.6426F, -4.2974F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.0328F, -0.2555F, 0.7459F));

		PartDefinition neck16_r10 = body2.addOrReplaceChild("neck16_r10", CubeListBuilder.create().texOffs(112, 28).addBox(1.0391F, -0.0115F, -4.2974F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.9073F, -17.6162F, 0.1665F, -0.1974F, 0.1663F));

		PartDefinition neck17_r12 = body2.addOrReplaceChild("neck17_r12", CubeListBuilder.create().texOffs(55, 54).addBox(4.7295F, -3.4515F, -0.4168F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.2073F, -19.2162F, -0.044F, -0.16F, 1.1447F));

		PartDefinition neck16_r11 = body2.addOrReplaceChild("neck16_r11", CubeListBuilder.create().texOffs(9, 105).addBox(1.7674F, -1.1283F, -0.4168F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.2073F, -19.2162F, 0.0284F, -0.1635F, 0.7025F));

		PartDefinition neck15_r10 = body2.addOrReplaceChild("neck15_r10", CubeListBuilder.create().texOffs(112, 26).addBox(0.0968F, -0.002F, -0.4168F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -0.2073F, -19.2162F, 0.1122F, -0.1225F, 0.1307F));

		PartDefinition neck14_r8 = body2.addOrReplaceChild("neck14_r8", CubeListBuilder.create().texOffs(26, 112).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0823F, -0.0145F, 0.113F));

		PartDefinition neck16_r12 = body2.addOrReplaceChild("neck16_r12", CubeListBuilder.create().texOffs(55, 52).addBox(4.6791F, -3.3688F, -0.5F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.032F, -0.0772F, 1.1159F));

		PartDefinition neck15_r11 = body2.addOrReplaceChild("neck15_r11", CubeListBuilder.create().texOffs(105, 4).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.4073F, -17.3162F, 0.0617F, -0.0565F, 0.6791F));

		PartDefinition upperarm1 = body2.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(63, 33).addBox(0.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(93, 96).addBox(0.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 85).addBox(0.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, 9.6611F, -23.7721F, 0.7977F, 0.2039F, -0.7552F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1698F, 8.7583F, 0.8645F, -1.1928F, 0.1179F, 0.6028F));

		PartDefinition lowerarm4_r1 = lowerarm1.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(82, 104).addBox(0.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 26).addBox(-0.8188F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 93).addBox(-0.3188F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(93, 102).addBox(-0.3119F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 59).addBox(0.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5319F, 1.9572F, -0.1557F, -0.2438F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5421F, 8.0269F, -1.4569F, 1.3966F, 0.0383F, 0.0694F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(64, 67).addBox(-1.0002F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(62, 81).addBox(-0.9655F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(103, 16).addBox(0.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.481F, 0.3133F, -0.5334F));

		PartDefinition hand2_r4 = hand1.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(100, 92).addBox(0.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.754F, 0.4068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(103, 28).addBox(3.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = body2.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(49, 65).addBox(-2.4203F, -0.0885F, -2.7806F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 97).addBox(-2.4203F, 3.9115F, -1.7806F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(60, 86).addBox(-2.4203F, 5.9115F, -2.2806F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3F, 9.6611F, -23.7721F, 0.9444F, 0.0993F, 0.5057F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1698F, 8.7583F, 0.8645F, -0.5455F, -0.0729F, -0.5277F));

		PartDefinition lowerarm5_r1 = lowerarm2.addOrReplaceChild("lowerarm5_r1", CubeListBuilder.create().texOffs(104, 96).addBox(-1.1812F, -5.5779F, 1.9498F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(90, 70).addBox(-2.1812F, -2.5779F, 1.3498F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 93).addBox(-1.6812F, 0.4221F, 1.8498F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r1 = lowerarm2.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(102, 102).addBox(-1.6881F, -0.1891F, -0.6459F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 83).addBox(-1.1881F, 1.8109F, -0.1459F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5319F, 1.9572F, -0.1557F, -0.2438F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5421F, 8.0269F, -1.4569F, 0.2621F, -0.0383F, -0.0694F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(68, 8).addBox(-4.9998F, -1.9393F, -3.2994F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.554F, 3.2812F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(82, 14).addBox(-5.0345F, -0.8694F, -0.1001F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5193F, 2.0518F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(103, 24).addBox(-2.6469F, 1.3345F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.481F, -0.3133F, 0.5334F));

		PartDefinition hand3_r4 = hand2.addOrReplaceChild("hand3_r4", CubeListBuilder.create().texOffs(103, 20).addBox(-2.8417F, -0.8794F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.754F, 0.4068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r5 = hand2.addOrReplaceChild("hand2_r5", CubeListBuilder.create().texOffs(103, 67).addBox(-5.0998F, -0.5153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.446F, 0.4068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(1.831F, 1.7473F, -28.3406F, -0.317F, -0.5956F, 0.3607F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 112).addBox(0.0F, -4.278F, 2.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 112).addBox(0.0F, -3.578F, 0.0389F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0723F, -3.2511F, 0.1134F, 0.0F, 0.0F));

		PartDefinition neck21_r5 = neck.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(111, 104).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.8726F, 0.2891F, -0.2463F));

		PartDefinition neck22_r2 = neck.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(111, 102).mirror().addBox(-3.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.765F, -2.4673F, 0.6476F, 0.688F, -0.7098F));

		PartDefinition neck20_r9 = neck.addOrReplaceChild("neck20_r9", CubeListBuilder.create().texOffs(111, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.6983F, 0.2426F, -0.2923F));

		PartDefinition neck21_r6 = neck.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(59, 104).mirror().addBox(-5.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.265F, -0.4673F, 0.4907F, 0.5679F, -0.8023F));

		PartDefinition neck20_r10 = neck.addOrReplaceChild("neck20_r10", CubeListBuilder.create().texOffs(111, 104).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.8726F, -0.2891F, 0.2463F));

		PartDefinition neck21_r7 = neck.addOrReplaceChild("neck21_r7", CubeListBuilder.create().texOffs(111, 102).addBox(1.6868F, -1.0746F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.765F, -2.4673F, 0.6476F, -0.688F, 0.7098F));

		PartDefinition neck19_r12 = neck.addOrReplaceChild("neck19_r12", CubeListBuilder.create().texOffs(111, 50).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.6983F, -0.2426F, 0.2923F));

		PartDefinition neck20_r11 = neck.addOrReplaceChild("neck20_r11", CubeListBuilder.create().texOffs(59, 104).addBox(1.6868F, -1.0746F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.265F, -0.4673F, 0.4907F, -0.5679F, 0.8023F));

		PartDefinition cube_r19 = neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -0.1214F, -1.1678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.1F, 0.6191F, -0.285F, 0.2028F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 101).addBox(-2.0F, -0.0623F, 0.1167F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.6056F, -14.8699F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(29, 101).addBox(1.5F, -0.1318F, -0.0832F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-3.0F, 0.4642F, -13.9058F, 0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(94, 0).addBox(1.0F, 0.1431F, 0.804F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5F, 3.2642F, -14.6058F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(92, 81).addBox(1.0F, -0.5569F, -0.196F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 3.2642F, -14.6058F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(32, 69).addBox(-1.5F, -0.2878F, -1.117F, 3.0F, 4.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.8362F, -12.4879F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 73).addBox(-1.5F, -2.9782F, -0.0194F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.1331F, -10.3968F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(91, 47).addBox(-1.0F, -3.1412F, -0.3233F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.3331F, -7.4968F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(25, 21).addBox(-3.0F, 0.0698F, -1.0033F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.5362F, -6.8879F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 56).addBox(-2.5F, -0.0704F, -0.0302F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.3362F, -8.3879F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(9, 90).addBox(-2.5F, -0.0581F, -0.0105F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1362F, -9.3879F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(87, 63).addBox(-2.5F, -0.0575F, -0.0256F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.7362F, -10.2879F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 70).addBox(-1.5F, -1.2828F, -1.6459F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 90).addBox(-1.0F, -1.2828F, -2.0459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, -8.4358F, -0.7058F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 43).addBox(-2.0F, -0.2837F, -1.9897F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2358F, -4.9058F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 94).addBox(-0.5F, -3.5F, -0.9F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9525F, -1.9113F, -3.0805F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(79, 73).addBox(-0.5F, -5.9685F, -1.9278F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -4.4358F, -1.5058F, 1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(15, 65).addBox(-1.0F, -0.995F, -6.0084F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.1358F, -1.3058F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(72, 56).addBox(-0.5F, 0.9557F, -2.1252F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0056F))
				.texOffs(44, 42).addBox(-0.5F, -0.0443F, -2.1252F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -4.4358F, -5.2058F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 78).addBox(-2.0F, -6.2F, -4.6F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 6.2642F, -2.1058F, -0.1309F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(82, 19).addBox(3.0F, -0.3344F, -1.3581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(82, 19).mirror().addBox(-4.0F, -0.3344F, -1.3581F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.2899F, -2.9681F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 77).addBox(-2.5F, -0.9832F, -0.0084F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0703F, -8.0024F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-0.048F, -0.7732F, -0.4601F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5338F, 0.262F, -10.3821F, -0.8313F, -0.1909F, 0.2051F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 107).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3927F, 1.1739F, -8.4085F, -2.444F, -0.3425F, 0.3038F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 86).mirror().addBox(-1.4466F, -1.8872F, -1.866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5338F, 1.762F, -8.3821F, -1.7284F, -0.3425F, 0.3038F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(38, 101).mirror().addBox(-1.1828F, 0.0461F, -2.4942F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -1.0045F, -4.8688F, 0.2356F, -0.4014F, 0.0F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(89, 107).mirror().addBox(-0.0748F, -0.0387F, -1.6716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -0.3045F, -7.4688F, 0.0262F, -0.4014F, 0.0F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(37, 107).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.0054F, 1.9257F, -7.5457F, -0.7156F, -0.4014F, 0.0F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(109, 92).mirror().addBox(-0.1251F, -1.9888F, -1.0373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.5955F, -6.8688F, -0.3665F, -0.4014F, 0.0F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(112, 66).mirror().addBox(-0.5159F, -2.0235F, -1.0048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.8955F, -5.8688F, -0.2793F, -0.4014F, 0.0F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(100, 54).mirror().addBox(-0.4689F, -2.3508F, -3.0153F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.6955F, -3.8688F, 0.5585F, -0.4014F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-4.5F, -0.0402F, -1.9638F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(100, 61).addBox(2.5F, -0.0402F, -1.9638F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -1.4344F, -3.1581F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(73, 101).mirror().addBox(-4.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 101).addBox(2.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7344F, 0.7419F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(110, 107).addBox(6.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-3.5F, 1.0566F, -3.4412F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(16, 107).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 107).addBox(6.5F, -0.8F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 1.0566F, -3.4412F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(41, 15).mirror().addBox(-0.5F, -1.7F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(41, 15).addBox(6.5F, -1.7F, -0.9F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.5F, 0.9739F, -1.7372F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(47, 108).mirror().addBox(-4.5F, 0.0508F, -1.924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(47, 108).addBox(2.5F, 0.0508F, -1.924F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 1.0656F, 1.5419F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(23, 107).mirror().addBox(-4.5F, -0.3F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(23, 107).addBox(2.5F, -0.3F, -1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -0.3344F, 0.6419F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(100, 6).addBox(-0.952F, -0.7732F, -0.4601F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5338F, 0.262F, -10.3821F, -0.8313F, 0.1909F, -0.2051F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(82, 98).addBox(-1.0338F, -0.7732F, -0.3216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5338F, 0.262F, -10.3821F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 107).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3927F, 1.1739F, -8.4085F, -2.444F, 0.3425F, -0.3038F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(73, 86).addBox(0.4466F, -1.8872F, -1.866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5338F, 1.762F, -8.3821F, -1.7284F, 0.3425F, -0.3038F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(38, 101).addBox(0.1828F, 0.0461F, -2.4942F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(2.4F, -1.0045F, -4.8688F, 0.2356F, 0.4014F, 0.0F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(89, 107).addBox(-0.9252F, -0.0387F, -1.6716F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.5F, -0.3045F, -7.4688F, 0.0262F, 0.4014F, 0.0F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(37, 107).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.0054F, 1.9257F, -7.5457F, -0.7156F, 0.4014F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(109, 92).addBox(-0.8749F, -1.9888F, -1.0373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 3.5955F, -6.8688F, -0.3665F, 0.4014F, 0.0F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(112, 66).addBox(-0.4841F, -2.0235F, -1.0048F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.8955F, -5.8688F, -0.2793F, 0.4014F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(100, 54).addBox(-0.5311F, -2.3508F, -3.0153F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.6F, 1.6955F, -3.8688F, 0.5585F, 0.4014F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.4848F, 0.6078F, -12.7207F));

		PartDefinition cube_r65 = leftFace.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 108).addBox(-2.1136F, -0.1831F, -0.1613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7155F, 0.0024F, -0.0301F));

		PartDefinition cube_r66 = leftFace.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 108).addBox(-1.4F, -0.9077F, -0.9194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3848F, -0.8252F, 1.8299F, 1.3522F, -0.2535F, -0.2186F));

		PartDefinition cube_r67 = leftFace.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(103, 107).addBox(-0.76F, -1.6F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(0, 103).addBox(-0.92F, -1.6F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(96, 107).addBox(-0.24F, -1.6F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.201F, -1.4666F, 6.1731F, 0.2792F, 0.0024F, -0.0301F));

		PartDefinition cube_r68 = leftFace.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 46).addBox(-1.8851F, -0.7679F, -7.1205F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1941F, -1.745F, 10.3559F, 0.2452F, 0.5263F, -0.2351F));

		PartDefinition cube_r69 = leftFace.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(91, 41).addBox(-1.9075F, -0.0371F, 1.5698F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7941F, -1.945F, 9.0559F, 0.3598F, 0.0434F, -0.8416F));

		PartDefinition cube_r70 = leftFace.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 14).addBox(-0.9009F, -0.4365F, -4.6448F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.3439F, -4.8461F, 14.2552F, -0.3333F, 0.5629F, -0.3546F));

		PartDefinition cube_r71 = leftFace.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(102, 33).addBox(-1.5F, -2.9F, -0.4F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3826F, -2.1124F, 13.619F, -0.5145F, -0.2201F, 0.5163F));

		PartDefinition cube_r72 = leftFace.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(103, 71).addBox(-1.3F, 0.0F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4937F, -3.1395F, 15.0679F, 1.0007F, -1.5003F, -2.2086F));

		PartDefinition cube_r73 = leftFace.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(104, 38).addBox(-1.8159F, 0.2178F, -0.5578F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.7917F, -5.0033F, 13.6584F, 0.4736F, -0.6899F, -1.1733F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 0).addBox(-1.5515F, -0.4592F, -0.4561F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7941F, -1.945F, 10.2559F, 0.4241F, 0.5455F, -0.6278F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 82).addBox(-1.9474F, -0.3595F, -0.267F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4937F, -2.2395F, 15.7679F, 3.0245F, -0.6302F, 1.9759F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(47, 75).addBox(-2.0794F, -0.8828F, -0.8151F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.4937F, 0.1605F, 12.9679F, 2.9267F, -1.0297F, 1.8149F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(62, 0).addBox(-1.9929F, -0.8529F, -5.2331F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.4937F, 3.7605F, 10.7679F, 2.1795F, -1.4365F, 2.5878F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.4848F, 0.6078F, -12.7207F));

		PartDefinition cube_r78 = rightFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 108).mirror().addBox(1.1136F, -0.1831F, -0.1613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7155F, -0.0024F, 0.0301F));

		PartDefinition cube_r79 = rightFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(0.4F, -0.9077F, -0.9194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3848F, -0.8252F, 1.8299F, 1.3522F, 0.2535F, 0.2186F));

		PartDefinition cube_r80 = rightFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(103, 107).mirror().addBox(-0.24F, -1.6F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(0, 103).mirror().addBox(-1.08F, -1.6F, -0.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(96, 107).mirror().addBox(-0.76F, -1.6F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.201F, -1.4666F, 6.1731F, 0.2792F, -0.0024F, 0.0301F));

		PartDefinition cube_r81 = rightFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.1149F, -0.7679F, -7.1205F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1941F, -1.745F, 10.3559F, 0.2452F, -0.5263F, 0.2351F));

		PartDefinition cube_r82 = rightFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-0.0925F, -0.0371F, 1.5698F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7941F, -1.945F, 9.0559F, 0.3598F, -0.0434F, 0.8416F));

		PartDefinition cube_r83 = rightFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-0.0991F, -0.4365F, -4.6448F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3439F, -4.8461F, 14.2552F, -0.3333F, -0.5629F, 0.3546F));

		PartDefinition cube_r84 = rightFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(102, 33).mirror().addBox(-1.5F, -2.9F, -0.4F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3826F, -2.1124F, 13.619F, -0.5145F, 0.2201F, -0.5163F));

		PartDefinition cube_r85 = rightFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(103, 71).mirror().addBox(-0.7F, 0.0F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4937F, -3.1395F, 15.0679F, 1.0007F, 1.5003F, 2.2086F));

		PartDefinition cube_r86 = rightFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 38).mirror().addBox(-0.1841F, 0.2178F, -0.5578F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7917F, -5.0033F, 13.6584F, 0.4736F, 0.6899F, 1.1733F));

		PartDefinition cube_r87 = rightFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.4485F, -0.4592F, -0.4561F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7941F, -1.945F, 10.2559F, 0.4241F, -0.5455F, 0.6278F));

		PartDefinition cube_r88 = rightFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(45, 82).mirror().addBox(-0.0526F, -0.3595F, -0.267F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4937F, -2.2395F, 15.7679F, 3.0245F, 0.6302F, -1.9759F));

		PartDefinition cube_r89 = rightFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(47, 75).mirror().addBox(0.0794F, -0.8828F, -0.8151F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4937F, 0.1605F, 12.9679F, 2.9267F, 1.0297F, -1.8149F));

		PartDefinition cube_r90 = rightFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-0.0071F, -0.8529F, -5.2331F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.4937F, 3.7605F, 10.7679F, 2.1795F, 1.4365F, -2.5878F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2895F, 1.0154F, -8.7972F, -0.0349F, 0.1231F, -0.1571F));

		PartDefinition cube_r91 = leftTusk.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(109, 61).addBox(-0.4654F, -0.1099F, 0.0335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9677F, 6.5062F, -0.424F, 0.6755F, 0.3329F, 0.0183F));

		PartDefinition cube_r92 = leftTusk.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 109).addBox(-0.7353F, 0.0512F, -0.7602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9981F, 3.3255F, -0.4833F, 0.2353F, 0.3222F, -0.0856F));

		PartDefinition cube_r93 = leftTusk.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 101).addBox(-0.2304F, -3.9684F, -1.9936F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5822F, 2.2254F, 0.914F, -0.4454F, 0.1831F, -0.3539F));

		PartDefinition cube_r94 = leftTusk.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 107).addBox(-0.2339F, -1.8978F, -1.5491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5822F, 3.6254F, -0.486F, -0.6058F, 0.2991F, -0.3107F));

		PartDefinition cube_r95 = leftTusk.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(111, 6).addBox(-0.9984F, -0.0255F, 0.0403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5822F, 3.0254F, -2.486F, 0.7381F, 0.2991F, -0.3107F));

		PartDefinition cube_r96 = leftTusk.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 92).addBox(-0.4222F, -1.2262F, -4.5264F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0788F, -0.9918F, 1.8992F, 0.04F, 0.2991F, -0.3107F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2895F, 1.0154F, -8.7972F, -0.0349F, -0.1231F, 0.1571F));

		PartDefinition cube_r97 = rightTusk.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(109, 61).mirror().addBox(-0.5346F, -0.1099F, 0.0335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9677F, 6.5062F, -0.424F, 0.6755F, -0.3329F, -0.0183F));

		PartDefinition cube_r98 = rightTusk.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(54, 109).mirror().addBox(-0.2647F, 0.0512F, -0.7602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9981F, 3.3255F, -0.4833F, 0.2353F, -0.3222F, 0.0856F));

		PartDefinition cube_r99 = rightTusk.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(47, 101).mirror().addBox(-0.7696F, -3.9684F, -1.9936F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5822F, 2.2254F, 0.914F, -0.4454F, -0.1831F, 0.3539F));

		PartDefinition cube_r100 = rightTusk.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(9, 107).mirror().addBox(-0.7661F, -1.8978F, -1.5491F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5822F, 3.6254F, -0.486F, -0.6058F, -0.2991F, 0.3107F));

		PartDefinition cube_r101 = rightTusk.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 6).mirror().addBox(-0.0016F, -0.0255F, 0.0403F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5822F, 3.0254F, -2.486F, 0.7381F, -0.2991F, 0.3107F));

		PartDefinition cube_r102 = rightTusk.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(73, 92).mirror().addBox(-0.5778F, -1.2262F, -4.5264F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0788F, -0.9918F, 1.8992F, 0.04F, -0.2991F, 0.3107F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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