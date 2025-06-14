package fossils.fossils.client.blockentity.model.geikiaelginensis;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GeikiaelginensisFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftTusk;
	private final ModelPart rightTusk;

	public GeikiaelginensisFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
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

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.6401F, 11.6712F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 43).addBox(0.0F, -1.8423F, 3.7997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, -0.8778F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 38).addBox(0.0F, -1.4423F, -0.2003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 38).addBox(0.0F, -0.4423F, -0.2003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4445F, 1.0016F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 72).addBox(0.0F, -0.2423F, -0.2003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 72).addBox(0.0F, -1.2423F, -0.2003F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7605F, -0.8778F, -0.2618F, 0.0F, 0.0F));

		PartDefinition basin_r1 = body.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(0.5F, -1.6F, -2.2F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 24).addBox(2.5F, -1.6F, -2.2F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 4.6902F, 3.4647F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 10).addBox(-0.5F, -0.0121F, -0.0463F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.0F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4374F, 4.8973F, 3.7317F, 0.0F, 0.0F, 0.1745F));

		PartDefinition basin_r2 = bone.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(5, 55).addBox(0.0F, -0.05F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.2994F, 0.0713F, -0.7679F, 0.0F, 0.0F));

		PartDefinition basin_r3 = bone.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(7, 49).addBox(0.0F, -0.05F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.9174F, -1.8308F, -0.3142F, 0.0F, 0.0F));

		PartDefinition basin_r4 = bone.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(12, 55).addBox(0.0F, -0.85F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7708F, -4.1524F, -1.5969F, 0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r5 = bone.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(62, 31).addBox(0.0F, -1.0F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7708F, -1.5259F, 2.0065F, -0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r6 = bone.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(29, 70).addBox(0.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7708F, -1.5259F, 2.0065F, -1.2479F, 0.0F, 0.0F));

		PartDefinition basin_r7 = bone.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(70, 10).addBox(0.7708F, -3.0202F, -1.4451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r8 = bone.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(19, 55).addBox(0.0F, -0.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7708F, -3.3958F, -2.7286F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r9 = bone.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(61, 52).addBox(0.0F, -1.2F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7708F, -0.7579F, -3.9531F, 0.6196F, 0.0F, 0.0F));

		PartDefinition basin_r10 = bone.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(42, 32).addBox(0.7708F, 1.266F, -0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(48, 64).addBox(-0.5F, -1.225F, -1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6805F, 1.4147F, 1.2144F, -2.2026F, -0.0255F, 0.111F));

		PartDefinition basin_r12 = bone.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.925F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6805F, 1.4147F, 1.2144F, -1.4609F, -0.0255F, 0.111F));

		PartDefinition basin_r13 = bone.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, -2.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6914F, 1.6133F, -0.0702F, -1.0245F, -0.0255F, 0.111F));

		PartDefinition basin_r14 = bone.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(32, 6).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0882F, -1.8227F, -0.6055F, -1.4172F, -0.0255F, 0.111F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4374F, 4.8973F, 3.7317F, 0.0F, 0.0F, -0.1745F));

		PartDefinition basin_r15 = bone3.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(5, 55).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.2994F, 0.0713F, -0.7679F, 0.0F, 0.0F));

		PartDefinition basin_r16 = bone3.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(7, 49).mirror().addBox(-1.0F, -0.05F, -0.025F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.9174F, -1.8308F, -0.3142F, 0.0F, 0.0F));

		PartDefinition basin_r17 = bone3.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(12, 55).mirror().addBox(-1.0F, -0.85F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -4.1524F, -1.5969F, 0.2967F, 0.0F, 0.0F));

		PartDefinition basin_r18 = bone3.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(62, 31).mirror().addBox(-1.0F, -1.0F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -1.5259F, 2.0065F, -0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r19 = bone3.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(29, 70).mirror().addBox(-1.0F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -1.5259F, 2.0065F, -1.2479F, 0.0F, 0.0F));

		PartDefinition basin_r20 = bone3.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(70, 10).mirror().addBox(-1.7708F, -3.0202F, -1.4451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8988F, 0.0F, 0.0F));

		PartDefinition basin_r21 = bone3.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(19, 55).mirror().addBox(-1.0F, -0.3F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -3.3958F, -2.7286F, -0.5411F, 0.0F, 0.0F));

		PartDefinition basin_r22 = bone3.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-1.0F, -1.2F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7708F, -0.7579F, -3.9531F, 0.6196F, 0.0F, 0.0F));

		PartDefinition basin_r23 = bone3.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(42, 32).mirror().addBox(-1.7708F, 1.266F, -0.9279F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, -3.9F, 0.0524F, 0.0F, 0.0F));

		PartDefinition basin_r24 = bone3.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(48, 64).mirror().addBox(-0.5F, -1.225F, -1.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, 1.4147F, 1.2144F, -2.2026F, 0.0255F, -0.111F));

		PartDefinition basin_r25 = bone3.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -1.925F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6805F, 1.4147F, 1.2144F, -1.4609F, 0.0255F, -0.111F));

		PartDefinition basin_r26 = bone3.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(11, 36).mirror().addBox(-0.5F, -2.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6914F, 1.6133F, -0.0702F, -1.0245F, 0.0255F, -0.111F));

		PartDefinition basin_r27 = bone3.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(32, 6).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0882F, -1.8227F, -0.6055F, -1.4172F, 0.0255F, -0.111F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create().texOffs(46, 54).addBox(0.0F, 2.8F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 43).addBox(0.0F, 5.1F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(33, 30).addBox(0.0F, -0.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 6.168F, 4.4033F, -0.429F, 0.092F, -1.102F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1222F, 6.8553F, -0.6478F, 0.4589F, -0.6789F, 0.7475F));

		PartDefinition leg3_r1 = leg1.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(65, 65).addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6736F, 4.7545F, 0.1303F, 1.47F, 1.5246F, 1.7815F));

		PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(31, 60).addBox(0.5469F, -3.5317F, 0.0108F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1816F, 3.2372F, 1.1145F, 1.7754F, 1.5246F, 1.7815F));

		PartDefinition leg1_r1 = leg1.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(41, 54).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0575F, 4.037F, 0.1965F, 1.6445F, 1.5246F, 1.7815F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.273F, 5.308F, -0.1457F, 0.1023F, 0.3512F, 0.301F));

		PartDefinition feet2_r1 = feet1.addOrReplaceChild("feet2_r1", CubeListBuilder.create().texOffs(32, 13).addBox(-3.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 2.7818F, -0.718F, 0.6197F, 0.01F, -0.1073F));

		PartDefinition feet1_r1 = feet1.addOrReplaceChild("feet1_r1", CubeListBuilder.create().texOffs(11, 25).addBox(-3.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7012F, 1.7818F, -3.018F, -0.0036F, -0.0062F, -0.1214F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create().texOffs(46, 54).mirror().addBox(-1.0F, 2.8F, -1.4F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 43).mirror().addBox(-1.0F, 5.1F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(33, 30).mirror().addBox(-1.0F, -0.2F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 6.168F, 4.4033F, 0.4327F, -0.2618F, 0.6657F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1222F, 6.8553F, -0.6478F, 0.7226F, 0.2566F, -0.502F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(65, 65).mirror().addBox(-0.5F, -1.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, 4.7545F, 0.1303F, 1.47F, -1.5246F, -1.7815F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(31, 60).mirror().addBox(-1.5469F, -3.5317F, 0.0108F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1816F, 3.2372F, 1.1145F, 1.7754F, -1.5246F, -1.7815F));

		PartDefinition leg2_r2 = leg2.addOrReplaceChild("leg2_r2", CubeListBuilder.create().texOffs(41, 54).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0575F, 4.037F, 0.1965F, 1.6445F, -1.5246F, -1.7815F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.273F, 5.308F, -0.1457F, -0.9828F, -0.4076F, -0.1158F));

		PartDefinition feet3_r1 = feet2.addOrReplaceChild("feet3_r1", CubeListBuilder.create().texOffs(32, 13).mirror().addBox(0.1772F, -1.9865F, 0.4319F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7012F, 2.7818F, -0.718F, 0.6197F, -0.01F, 0.1073F));

		PartDefinition feet2_r2 = feet2.addOrReplaceChild("feet2_r2", CubeListBuilder.create().texOffs(11, 25).mirror().addBox(0.1978F, -0.9966F, -0.9638F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7012F, 1.7818F, -3.018F, -0.0036F, 0.0062F, 0.1214F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, 0.022F, 0.0628F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9721F, 4.4354F, 1.2217F, -0.1745F, 0.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 72).addBox(-15.0F, 4.0F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 72).addBox(-15.0F, 2.0F, 0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 66).addBox(-15.0F, 0.0F, -0.8F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.022F, 1.0628F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(71, 3).addBox(0.0F, 1.2F, -1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 0).addBox(0.0F, -0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4166F, -0.2509F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 53).addBox(-0.5F, -0.1285F, -0.4852F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 47).addBox(0.0F, 0.8715F, 0.2148F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0753F, 0.4747F, -0.1745F, 0.0F, 0.48F));

		PartDefinition cube_r7 = tail2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 72).addBox(0.0F, -0.5F, -0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3715F, 0.6148F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6F, -1.2F, -0.0873F, -0.1309F, 0.0F));

		PartDefinition cube_r8 = body2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(72, 13).addBox(0.0F, -0.3419F, 0.0206F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 13).addBox(0.0F, -1.3419F, 0.0206F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.8F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 72).addBox(0.0F, -1.369F, 0.0191F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 72).addBox(0.0F, -0.369F, 0.0191F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 22).addBox(0.0F, -0.5954F, 0.0063F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 22).addBox(0.0F, -1.5954F, 0.0063F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -5.8F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 55).addBox(0.0F, -1.3237F, 0.0274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -7.8F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3F, 10.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -17.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition neck23_r1 = body2.addOrReplaceChild("neck23_r1", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-4.6386F, -0.9872F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5823F, -1.3412F, 0.072F, -0.008F, -1.2431F));

		PartDefinition neck22_r1 = body2.addOrReplaceChild("neck22_r1", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5823F, -1.3412F, 0.0565F, -0.0454F, -0.6768F));

		PartDefinition neck23_r2 = body2.addOrReplaceChild("neck23_r2", CubeListBuilder.create().texOffs(37, 28).mirror().addBox(-5.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5823F, -3.3412F, 0.0686F, 0.0232F, -1.5736F));

		PartDefinition neck22_r2 = body2.addOrReplaceChild("neck22_r2", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5823F, -3.3412F, 0.072F, -0.008F, -1.1384F));

		PartDefinition neck21_r1 = body2.addOrReplaceChild("neck21_r1", CubeListBuilder.create().texOffs(68, 16).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5823F, -3.3412F, 0.0565F, -0.0454F, -0.5721F));

		PartDefinition neck22_r3 = body2.addOrReplaceChild("neck22_r3", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(-6.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.7823F, -5.3412F, 0.0709F, 0.058F, -1.5037F));

		PartDefinition neck21_r2 = body2.addOrReplaceChild("neck21_r2", CubeListBuilder.create().texOffs(43, 52).mirror().addBox(-5.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.7823F, -5.3412F, 0.0888F, 0.0226F, -1.0684F));

		PartDefinition neck20_r1 = body2.addOrReplaceChild("neck20_r1", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-1.5622F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.7823F, -5.3412F, 0.0871F, -0.0285F, -0.5034F));

		PartDefinition neck19_r1 = body2.addOrReplaceChild("neck19_r1", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-1.9109F, 0.0459F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7823F, -7.3412F, 0.1264F, -0.0231F, -0.4768F));

		PartDefinition neck20_r2 = body2.addOrReplaceChild("neck20_r2", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7823F, -7.3412F, 0.1098F, 0.0609F, -1.0326F));

		PartDefinition neck21_r3 = body2.addOrReplaceChild("neck21_r3", CubeListBuilder.create().texOffs(63, 49).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7823F, -7.3412F, 0.0739F, 0.1015F, -1.4686F));

		PartDefinition neck21_r4 = body2.addOrReplaceChild("neck21_r4", CubeListBuilder.create().texOffs(17, 68).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5823F, -1.3412F, 0.0565F, 0.0454F, 0.6768F));

		PartDefinition neck22_r4 = body2.addOrReplaceChild("neck22_r4", CubeListBuilder.create().texOffs(61, 20).addBox(1.6386F, -0.9872F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5823F, -1.3412F, 0.072F, 0.008F, 1.2431F));

		PartDefinition neck20_r3 = body2.addOrReplaceChild("neck20_r3", CubeListBuilder.create().texOffs(68, 16).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5823F, -3.3412F, 0.0565F, 0.0454F, 0.5721F));

		PartDefinition neck21_r5 = body2.addOrReplaceChild("neck21_r5", CubeListBuilder.create().texOffs(52, 48).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5823F, -3.3412F, 0.072F, 0.008F, 1.1384F));

		PartDefinition neck22_r5 = body2.addOrReplaceChild("neck22_r5", CubeListBuilder.create().texOffs(37, 28).addBox(4.6725F, -3.2692F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5823F, -3.3412F, 0.0686F, -0.0232F, 1.5736F));

		PartDefinition neck19_r2 = body2.addOrReplaceChild("neck19_r2", CubeListBuilder.create().texOffs(53, 68).addBox(-0.4378F, 0.2392F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7823F, -5.3412F, 0.0871F, 0.0285F, 0.5034F));

		PartDefinition neck20_r4 = body2.addOrReplaceChild("neck20_r4", CubeListBuilder.create().texOffs(43, 52).addBox(1.4461F, -0.6376F, -0.5334F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7823F, -5.3412F, 0.0888F, -0.0226F, 1.0684F));

		PartDefinition neck21_r6 = body2.addOrReplaceChild("neck21_r6", CubeListBuilder.create().texOffs(5, 68).addBox(4.6457F, -2.871F, -0.5334F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7823F, -5.3412F, 0.0709F, -0.058F, 1.5037F));

		PartDefinition neck20_r5 = body2.addOrReplaceChild("neck20_r5", CubeListBuilder.create().texOffs(63, 49).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7823F, -7.3412F, 0.0739F, -0.1015F, 1.4686F));

		PartDefinition neck19_r3 = body2.addOrReplaceChild("neck19_r3", CubeListBuilder.create().texOffs(52, 14).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7823F, -7.3412F, 0.1098F, -0.0609F, 1.0326F));

		PartDefinition neck18_r1 = body2.addOrReplaceChild("neck18_r1", CubeListBuilder.create().texOffs(67, 62).addBox(-0.0891F, 0.0459F, -0.5007F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7823F, -7.3412F, 0.1264F, 0.0231F, 0.4768F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.551F, -7.8061F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(70, 68).addBox(0.0F, -1.8F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8165F, -4.9593F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 64).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.599F, -2.9611F, 0.0611F, 0.0F, 0.0F));

		PartDefinition neck18_r2 = body3.addOrReplaceChild("neck18_r2", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8937F, -1.4351F, 0.1559F, 0.0094F, -0.4343F));

		PartDefinition neck19_r4 = body3.addOrReplaceChild("neck19_r4", CubeListBuilder.create().texOffs(51, 32).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8937F, -1.4351F, 0.1267F, 0.0914F, -0.9964F));

		PartDefinition neck20_r6 = body3.addOrReplaceChild("neck20_r6", CubeListBuilder.create().texOffs(52, 12).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8937F, -1.4351F, 0.0763F, 0.1364F, -1.4334F));

		PartDefinition neck17_r1 = body3.addOrReplaceChild("neck17_r1", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9937F, -3.4351F, 0.1711F, 0.0178F, -0.4166F));

		PartDefinition neck18_r3 = body3.addOrReplaceChild("neck18_r3", CubeListBuilder.create().texOffs(50, 20).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9937F, -3.4351F, 0.1352F, 0.1067F, -0.9782F));

		PartDefinition neck19_r5 = body3.addOrReplaceChild("neck19_r5", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.9937F, -3.4351F, 0.0774F, 0.1538F, -1.4157F));

		PartDefinition neck16_r1 = body3.addOrReplaceChild("neck16_r1", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1937F, -5.4352F, 0.217F, 0.0431F, -0.4152F));

		PartDefinition neck17_r2 = body3.addOrReplaceChild("neck17_r2", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1937F, -5.4352F, 0.1608F, 0.1525F, -0.9748F));

		PartDefinition neck18_r4 = body3.addOrReplaceChild("neck18_r4", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1937F, -5.4352F, 0.0811F, 0.206F, -1.4151F));

		PartDefinition neck19_r6 = body3.addOrReplaceChild("neck19_r6", CubeListBuilder.create().texOffs(52, 12).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8937F, -1.4351F, 0.0763F, -0.1364F, 1.4334F));

		PartDefinition neck18_r5 = body3.addOrReplaceChild("neck18_r5", CubeListBuilder.create().texOffs(51, 32).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8937F, -1.4351F, 0.1267F, -0.0914F, 0.9964F));

		PartDefinition neck17_r3 = body3.addOrReplaceChild("neck17_r3", CubeListBuilder.create().texOffs(67, 60).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8937F, -1.4351F, 0.1559F, -0.0094F, 0.4343F));

		PartDefinition neck18_r6 = body3.addOrReplaceChild("neck18_r6", CubeListBuilder.create().texOffs(25, 53).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9937F, -3.4351F, 0.0774F, -0.1538F, 1.4157F));

		PartDefinition neck17_r4 = body3.addOrReplaceChild("neck17_r4", CubeListBuilder.create().texOffs(50, 20).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9937F, -3.4351F, 0.1352F, -0.1067F, 0.9782F));

		PartDefinition neck16_r2 = body3.addOrReplaceChild("neck16_r2", CubeListBuilder.create().texOffs(67, 58).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.9937F, -3.4351F, 0.1711F, -0.0178F, 0.4166F));

		PartDefinition neck15_r1 = body3.addOrReplaceChild("neck15_r1", CubeListBuilder.create().texOffs(67, 56).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1937F, -5.4352F, 0.217F, -0.0431F, 0.4152F));

		PartDefinition neck16_r3 = body3.addOrReplaceChild("neck16_r3", CubeListBuilder.create().texOffs(50, 18).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1937F, -5.4352F, 0.1608F, -0.1525F, 0.9748F));

		PartDefinition neck17_r5 = body3.addOrReplaceChild("neck17_r5", CubeListBuilder.create().texOffs(14, 53).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1937F, -5.4352F, 0.0811F, -0.206F, 1.4151F));

		PartDefinition cube_r15 = body3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 70).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4903F, -1.962F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, 0.3F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.651F, -6.6189F, 0.0524F, -0.2618F, 0.0F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 70).addBox(0.0F, -1.7693F, -0.5104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5782F, -0.7479F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 19).addBox(0.0F, -1.7693F, -0.6104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.189F, -2.5751F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 70).addBox(0.0F, -1.6693F, -0.8104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1004F, -4.3961F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, 0.0019F, 2.1302F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.3F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck17_r6 = chest.addOrReplaceChild("neck17_r6", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.2784F, 0.0766F, -0.5163F));

		PartDefinition neck18_r7 = chest.addOrReplaceChild("neck18_r7", CubeListBuilder.create().texOffs(50, 16).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.1956F, 0.2134F, -1.0732F));

		PartDefinition neck19_r7 = chest.addOrReplaceChild("neck19_r7", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(-6.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4927F, -4.7162F, 0.086F, 0.2757F, -1.5186F));

		PartDefinition neck16_r4 = chest.addOrReplaceChild("neck16_r4", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.2477F, 0.0599F, -0.4835F));

		PartDefinition neck17_r7 = chest.addOrReplaceChild("neck17_r7", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.1781F, 0.183F, -1.0418F));

		PartDefinition neck18_r8 = chest.addOrReplaceChild("neck18_r8", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-7.6724F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1927F, -2.7162F, 0.0835F, 0.2409F, -1.4844F));

		PartDefinition neck15_r2 = chest.addOrReplaceChild("neck15_r2", CubeListBuilder.create().texOffs(65, 39).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.217F, 0.0431F, -0.4501F));

		PartDefinition neck17_r8 = chest.addOrReplaceChild("neck17_r8", CubeListBuilder.create().texOffs(52, 50).mirror().addBox(-8.6724F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.0811F, 0.206F, -1.45F));

		PartDefinition neck16_r5 = chest.addOrReplaceChild("neck16_r5", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2073F, -0.7162F, 0.1608F, 0.1525F, -1.0097F));

		PartDefinition neck18_r9 = chest.addOrReplaceChild("neck18_r9", CubeListBuilder.create().texOffs(34, 66).addBox(4.6725F, -3.2692F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.086F, -0.2757F, 1.5186F));

		PartDefinition neck17_r9 = chest.addOrReplaceChild("neck17_r9", CubeListBuilder.create().texOffs(50, 16).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.1956F, -0.2134F, 1.0732F));

		PartDefinition neck16_r6 = chest.addOrReplaceChild("neck16_r6", CubeListBuilder.create().texOffs(53, 66).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4927F, -4.7162F, 0.2784F, -0.0766F, 0.5163F));

		PartDefinition neck17_r10 = chest.addOrReplaceChild("neck17_r10", CubeListBuilder.create().texOffs(63, 14).addBox(4.6725F, -3.2692F, -0.5067F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.0835F, -0.2409F, 1.4844F));

		PartDefinition neck16_r7 = chest.addOrReplaceChild("neck16_r7", CubeListBuilder.create().texOffs(49, 41).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.1781F, -0.183F, 1.0418F));

		PartDefinition neck15_r3 = chest.addOrReplaceChild("neck15_r3", CubeListBuilder.create().texOffs(66, 8).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1927F, -2.7162F, 0.2477F, -0.0599F, 0.4835F));

		PartDefinition neck14_r1 = chest.addOrReplaceChild("neck14_r1", CubeListBuilder.create().texOffs(65, 39).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.217F, -0.0431F, 0.4501F));

		PartDefinition neck16_r8 = chest.addOrReplaceChild("neck16_r8", CubeListBuilder.create().texOffs(52, 50).addBox(4.6725F, -3.2692F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.0811F, -0.206F, 1.45F));

		PartDefinition neck15_r4 = chest.addOrReplaceChild("neck15_r4", CubeListBuilder.create().texOffs(19, 7).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2073F, -0.7162F, 0.1608F, -0.1525F, 1.0097F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create().texOffs(0, 37).addBox(-0.3797F, -0.0885F, -1.6806F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3087F, 5.5365F, -6.642F, 1.1968F, 0.5539F, -0.6815F));

		PartDefinition upperarm3_r1 = upperarm1.addOrReplaceChild("upperarm3_r1", CubeListBuilder.create().texOffs(22, 35).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3797F, 4.4115F, -0.4806F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.693F, 5.388F, -0.1855F, -0.6945F, -0.5351F, 1.3421F));

		PartDefinition lowerarm3_r1 = lowerarm1.addOrReplaceChild("lowerarm3_r1", CubeListBuilder.create().texOffs(60, 61).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6615F, 0.2404F, -0.2897F, 0.5155F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r1 = lowerarm1.addOrReplaceChild("lowerarm2_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -3.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.262F, 3.1956F, -0.6172F, -0.3572F, 1.2533F, -0.2064F));

		PartDefinition lowerarm2_r2 = lowerarm1.addOrReplaceChild("lowerarm2_r2", CubeListBuilder.create().texOffs(60, 65).addBox(0.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3115F, 2.0518F, -0.2838F, -0.2961F, 1.2533F, -0.2064F));

		PartDefinition lowerarm1_r1 = lowerarm1.addOrReplaceChild("lowerarm1_r1", CubeListBuilder.create().texOffs(12, 60).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3239F, 4.1855F, -0.6257F, -0.2001F, 1.2533F, -0.2064F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2002F, 6.1609F, -0.8725F, 0.3333F, 1.1611F, -0.3931F));

		PartDefinition hand2_r1 = hand1.addOrReplaceChild("hand2_r1", CubeListBuilder.create().texOffs(24, 25).addBox(0.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.446F, 3.4811F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand2_r2 = hand1.addOrReplaceChild("hand2_r2", CubeListBuilder.create().texOffs(41, 6).addBox(1.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4807F, 2.2517F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand2_r3 = hand1.addOrReplaceChild("hand2_r3", CubeListBuilder.create().texOffs(17, 60).addBox(0.8417F, -0.3794F, -0.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.246F, 0.6068F, -0.5623F, 0.532F, -0.2071F, 0.3361F));

		PartDefinition hand1_r1 = hand1.addOrReplaceChild("hand1_r1", CubeListBuilder.create().texOffs(43, 48).addBox(3.0998F, -0.0153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.6203F, -0.0885F, -1.6806F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3087F, 5.5365F, -6.642F, 0.5866F, 0.0397F, 0.8486F));

		PartDefinition upperarm4_r1 = upperarm2.addOrReplaceChild("upperarm4_r1", CubeListBuilder.create().texOffs(22, 35).mirror().addBox(-1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.3797F, 4.4115F, -0.4806F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.693F, 5.388F, -0.1855F, -0.7267F, 0.4074F, -1.3568F));

		PartDefinition lowerarm4_r1 = lowerarm2.addOrReplaceChild("lowerarm4_r1", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6615F, 0.2404F, -0.2897F, 0.5155F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r2 = lowerarm2.addOrReplaceChild("lowerarm3_r2", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.5F, -3.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.262F, 3.1956F, -0.6172F, -0.3572F, -1.2533F, 0.2064F));

		PartDefinition lowerarm3_r3 = lowerarm2.addOrReplaceChild("lowerarm3_r3", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-1.1881F, -1.8891F, 0.9791F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3115F, 2.0518F, -0.2838F, -0.2961F, -1.2533F, 0.2064F));

		PartDefinition lowerarm2_r3 = lowerarm2.addOrReplaceChild("lowerarm2_r3", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3239F, 4.1855F, -0.6257F, -0.2001F, -1.2533F, 0.2064F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2002F, 6.1609F, -0.8725F, 1.0029F, -0.9274F, -0.1544F));

		PartDefinition hand3_r1 = hand2.addOrReplaceChild("hand3_r1", CubeListBuilder.create().texOffs(24, 25).mirror().addBox(-3.9998F, -1.9393F, -3.2994F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.446F, 3.4811F, -2.4371F, -0.4363F, 0.0F, 0.0F));

		PartDefinition hand3_r2 = hand2.addOrReplaceChild("hand3_r2", CubeListBuilder.create().texOffs(41, 6).mirror().addBox(-4.0345F, -0.8694F, -0.1001F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4807F, 2.2517F, -2.7835F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hand3_r3 = hand2.addOrReplaceChild("hand3_r3", CubeListBuilder.create().texOffs(17, 60).mirror().addBox(-1.8417F, -0.3794F, -0.9728F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.246F, 0.6068F, -0.5623F, 0.532F, 0.2071F, -0.3361F));

		PartDefinition hand2_r4 = hand2.addOrReplaceChild("hand2_r4", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-5.0998F, -0.0153F, -0.9728F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.446F, 0.6068F, -0.5623F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.0F, 14.4834F, -4.9304F));

		PartDefinition chest_r1 = bone2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(43, 10).addBox(-1.3532F, -0.6005F, -0.9219F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2716F, -7.3193F, -2.9703F, 1.1669F, 0.0F, -0.2568F));

		PartDefinition chest_r2 = bone2.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(5, 60).addBox(-1.4074F, -2.7778F, -1.0996F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2716F, -7.3193F, -2.9703F, 0.4433F, -0.0874F, -0.0786F));

		PartDefinition chest_r3 = bone2.addOrReplaceChild("chest_r3", CubeListBuilder.create().texOffs(24, 64).addBox(-0.7153F, -2.8531F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1348F, -10.2337F, -3.9063F, -1.2849F, -0.8896F, 1.5717F));

		PartDefinition chest_r4 = bone2.addOrReplaceChild("chest_r4", CubeListBuilder.create().texOffs(65, 35).addBox(-0.6908F, -0.1442F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1348F, -10.2337F, -3.9063F, -0.7188F, -1.0514F, 1.3101F));

		PartDefinition chest_r5 = bone2.addOrReplaceChild("chest_r5", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -1.7F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.6967F, -13.2784F, -1.1323F, 1.5476F, 0.0122F, -0.3769F));

		PartDefinition chest_r6 = bone2.addOrReplaceChild("chest_r6", CubeListBuilder.create().texOffs(31, 37).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6967F, -13.2784F, -1.1323F, 0.8494F, 0.0122F, -0.3769F));

		PartDefinition chest_r7 = bone2.addOrReplaceChild("chest_r7", CubeListBuilder.create().texOffs(40, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0056F, -10.2266F, -3.0568F, 1.4291F, 0.1166F, -0.1848F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.0F, 14.4834F, -4.9304F));

		PartDefinition chest_r8 = bone4.addOrReplaceChild("chest_r8", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-1.6468F, -0.6005F, -0.9219F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2716F, -7.3193F, -2.9703F, 1.1669F, 0.0F, 0.2568F));

		PartDefinition chest_r9 = bone4.addOrReplaceChild("chest_r9", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.5926F, -2.7778F, -1.0996F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2716F, -7.3193F, -2.9703F, 0.4433F, 0.0874F, 0.0786F));

		PartDefinition chest_r10 = bone4.addOrReplaceChild("chest_r10", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(-0.2847F, -2.8531F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1348F, -10.2337F, -3.9063F, -1.2849F, 0.8896F, -1.5717F));

		PartDefinition chest_r11 = bone4.addOrReplaceChild("chest_r11", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-0.3092F, -0.1442F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1348F, -10.2337F, -3.9063F, -0.7188F, 1.0514F, -1.3101F));

		PartDefinition chest_r12 = bone4.addOrReplaceChild("chest_r12", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.5F, -1.7F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.6967F, -13.2784F, -1.1323F, 1.5476F, -0.0122F, 0.3769F));

		PartDefinition chest_r13 = bone4.addOrReplaceChild("chest_r13", CubeListBuilder.create().texOffs(31, 37).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6967F, -13.2784F, -1.1323F, 0.8494F, -0.0122F, 0.3769F));

		PartDefinition chest_r14 = bone4.addOrReplaceChild("chest_r14", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0056F, -10.2266F, -3.0568F, 1.4291F, -0.1166F, 0.1848F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6F, -5.075F, -0.2117F, -0.3065F, -0.1488F));

		PartDefinition cube_r21 = neck2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(7, 37).addBox(0.0F, -1.7693F, -0.0854F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1173F, -1.9608F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r22 = neck2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 70).addBox(0.0F, -1.3693F, -0.0104F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.9F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r23 = neck2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, 0.0052F, 1.0067F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck20_r7 = neck2.addOrReplaceChild("neck20_r7", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-2.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.335F, 0.4884F, -1.3584F));

		PartDefinition neck19_r8 = neck2.addOrReplaceChild("neck19_r8", CubeListBuilder.create().texOffs(34, 68).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8927F, -3.3412F, 0.5374F, 0.2421F, -0.8084F));

		PartDefinition neck18_r10 = neck2.addOrReplaceChild("neck18_r10", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-1.9124F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.432F, 0.1615F, -0.6725F));

		PartDefinition neck19_r9 = neck2.addOrReplaceChild("neck19_r9", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-5.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2927F, -1.4412F, 0.2845F, 0.3658F, -1.2223F));

		PartDefinition neck18_r11 = neck2.addOrReplaceChild("neck18_r11", CubeListBuilder.create().texOffs(34, 68).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.5374F, -0.2421F, 0.8084F));

		PartDefinition neck19_r10 = neck2.addOrReplaceChild("neck19_r10", CubeListBuilder.create().texOffs(70, 20).addBox(1.6386F, -0.9872F, -0.5067F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8927F, -3.3412F, 0.335F, -0.4884F, 1.3584F));

		PartDefinition neck18_r12 = neck2.addOrReplaceChild("neck18_r12", CubeListBuilder.create().texOffs(51, 34).addBox(1.6386F, -0.9872F, -0.5067F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.2845F, -0.3658F, 1.2223F));

		PartDefinition neck17_r11 = neck2.addOrReplaceChild("neck17_r11", CubeListBuilder.create().texOffs(68, 18).addBox(-0.0876F, 0.0478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2927F, -1.4412F, 0.432F, -0.1615F, 0.6725F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5953F, -3.5292F, -0.0873F, -0.3491F, -0.0873F));

		PartDefinition cube_r24 = neck.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 72).addBox(0.0F, -1.378F, -0.3611F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1006F, -1.8665F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r25 = neck.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(29, 43).addBox(-0.5F, -0.1214F, 0.8322F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition neck20_r8 = neck.addOrReplaceChild("neck20_r8", CubeListBuilder.create().texOffs(68, 51).mirror().addBox(-2.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0026F, -1.8121F, 0.6973F, 0.5725F, -0.8767F));

		PartDefinition neck19_r11 = neck.addOrReplaceChild("neck19_r11", CubeListBuilder.create().texOffs(68, 51).addBox(0.1124F, 0.1478F, -0.5067F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0026F, -1.8121F, 0.6973F, -0.5725F, 0.8767F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8807F, -2.3828F, 0.2607F, -0.0142F, -0.2909F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(5, 65).addBox(-1.0F, -0.575F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.4452F, -6.8386F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 43).addBox(-1.5F, 4.1F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 2.371F, -11.5216F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 48).addBox(-0.5F, -1.0599F, 0.0046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.5315F, -2.7481F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(53, 28).addBox(-1.5F, -1.7099F, -1.0954F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 2.3416F, -4.5794F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -1.1599F, 0.0046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 2.3416F, -4.5794F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -4.1599F, -0.7954F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 4.2985F, -5.8485F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -0.5F, -3.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.1031F, -3.1456F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 18).addBox(-1.0F, 0.4151F, 0.0506F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5371F, -7.3018F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, -0.275F, -0.675F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -3.0799F, -0.7934F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(34, 48).mirror().addBox(-0.8868F, -0.6517F, -3.5194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(26, 55).mirror().addBox(-0.7614F, -1.0436F, -1.0057F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 48).mirror().addBox(-1.0815F, -1.0436F, -1.0057F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-1.9279F, -1.2697F, -5.5294F, 0.7391F, -0.3932F, -0.162F));

		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-0.2414F, -0.9473F, -0.979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9279F, -1.2697F, -5.5294F, 0.2591F, -0.3932F, -0.162F));

		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(56, 43).addBox(-0.7586F, -0.9473F, -0.979F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.9279F, -1.2697F, -5.5294F, 0.2591F, 0.3932F, 0.162F));

		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 55).addBox(-0.2386F, -1.0436F, -1.0057F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(34, 48).addBox(-1.1132F, -0.6517F, -3.5194F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(34, 48).addBox(-0.9185F, -1.0436F, -1.0057F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.9279F, -1.2697F, -5.5294F, 0.7391F, 0.3932F, 0.162F));

		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(11, 30).addBox(-1.0F, -0.9F, -1.1F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -1.509F, -3.2629F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 22).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6521F, -2.1768F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 37).addBox(-1.0F, 0.0F, -1.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3177F, -4.9273F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 30).addBox(-1.0F, 0.0F, 0.05F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.3177F, -4.9273F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 28).addBox(-2.0F, -1.8F, -0.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.4305F, -0.8752F, 0.0436F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.68F, -1.4655F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(24, 60).mirror().addBox(-1.6164F, 0.1173F, -5.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(46, 60).mirror().addBox(-1.6164F, -0.5827F, -5.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, 0.2222F, -0.3774F, 0.0449F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(10, 70).mirror().addBox(-0.0477F, 1.9563F, -1.8499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, -1.2592F, -0.3251F, -0.0082F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.0477F, 1.3369F, -2.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, -0.8229F, -0.3251F, -0.0082F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(69, 29).mirror().addBox(-0.0477F, 0.6504F, -1.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, -0.3865F, -0.3251F, -0.0082F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(24, 69).mirror().addBox(-0.0477F, -0.2024F, -1.7038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, 0.2243F, -0.3251F, -0.0082F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.0477F, -0.4228F, -0.9446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, 0.4861F, -0.3251F, -0.0082F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-0.0477F, -0.4002F, -2.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, -0.1684F, -0.3251F, -0.0082F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(69, 26).mirror().addBox(-0.0477F, -0.9118F, -1.9088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0198F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, 0.0934F, -0.3251F, -0.0082F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(-0.0477F, -1.1309F, -1.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.6394F, 1.5293F, -2.8517F, 0.3116F, -0.3251F, -0.0082F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 44).mirror().addBox(-0.5F, 0.8476F, -0.5451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, -0.9163F, -0.0524F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-0.5F, 1.2067F, -2.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, -0.3054F, -0.0524F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(70, 35).mirror().addBox(-0.5F, 2.1194F, -2.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, -0.3927F, -0.0524F, 0.0F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.5F, 2.4476F, -0.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, -1.0036F, -0.0524F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.5F, 0.8F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(62, 27).mirror().addBox(-0.5F, -0.1F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.5F, -0.2419F, -3.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(46, 69).mirror().addBox(-0.5F, -1.0919F, -3.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.0736F, 2.0275F, 0.3491F, -0.0524F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(24, 60).addBox(0.6164F, 0.1173F, -5.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F))
				.texOffs(46, 60).addBox(0.6164F, -0.5827F, -5.0674F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, 0.2222F, 0.3774F, -0.0449F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 70).addBox(-0.9523F, 1.9563F, -1.8499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, -1.2592F, 0.3251F, 0.0082F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 70).addBox(-0.9523F, 1.3369F, -2.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, -0.8229F, 0.3251F, 0.0082F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(69, 29).addBox(-0.9523F, 0.6504F, -1.9526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, -0.3865F, 0.3251F, 0.0082F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(24, 69).addBox(-0.9523F, -0.2024F, -1.7038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, 0.2243F, 0.3251F, 0.0082F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(5, 70).addBox(-0.9523F, -0.4228F, -0.9446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, 0.4861F, 0.3251F, 0.0082F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(68, 53).addBox(-0.9523F, -0.4002F, -2.8367F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.023F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, -0.1684F, 0.3251F, 0.0082F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(69, 26).addBox(-0.9523F, -0.9118F, -1.9088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0198F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, 0.0934F, 0.3251F, 0.0082F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(65, 69).addBox(-0.9523F, -1.1309F, -1.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.6394F, 1.5293F, -2.8517F, 0.3116F, 0.3251F, 0.0082F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 44).addBox(-0.5F, 0.8476F, -0.5451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, -0.9163F, 0.0524F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 41).addBox(-0.5F, 1.2067F, -2.1689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, -0.3054F, 0.0524F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(70, 35).addBox(-0.5F, 2.1194F, -2.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, -0.3927F, 0.0524F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(41, 69).addBox(-0.5F, 2.4476F, -0.4931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, -1.0036F, 0.0524F, 0.0F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(69, 32).addBox(-0.5F, 0.8F, -2.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(62, 27).addBox(-0.5F, -0.1F, -2.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(60, 69).addBox(-0.5F, -0.2419F, -3.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(46, 69).addBox(-0.5F, -1.0919F, -3.7251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.025F)), PartPose.offsetAndRotation(1.8F, -0.0736F, 2.0275F, 0.3491F, 0.0524F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.8122F, -3.6136F, -1.6327F));

		PartDefinition cube_r74 = leftFace.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 22).addBox(-0.5382F, -0.5725F, -1.5416F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7199F, 0.8712F, -2.6346F, -0.4666F, -0.3555F, 0.7574F));

		PartDefinition cube_r75 = leftFace.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(25, 48).addBox(-0.1396F, -0.9755F, -2.7235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2F, 3.6F, -5.6F, -1.0461F, -0.4283F, 0.5437F));

		PartDefinition cube_r76 = leftFace.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(48, 23).addBox(-0.1396F, -0.7938F, -2.6341F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2F, 3.6F, -5.6F, -0.8541F, -0.4283F, 0.5437F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(50, 0).addBox(-0.3F, -1.1F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4446F, 1.1678F, -4.7867F, -1.1727F, -0.5561F, 0.9077F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(43, 64).addBox(-0.5F, -1.325F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9967F, 1.9131F, -4.276F, -1.265F, -0.4384F, 0.5724F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(57, 0).addBox(-0.5382F, -0.6308F, -0.6247F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.7199F, 0.8712F, -2.6346F, -0.3357F, -0.3555F, 0.7574F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(66, 4).addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.3886F, 4.6548F, 1.1314F, -1.8969F, 1.2167F, 0.2524F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(1.3886F, 4.6548F, 1.1314F, -2.2888F, 1.2577F, 0.207F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 25).addBox(-0.9F, -0.775F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.3798F, 1.18F, 0.7938F, -1.5471F, 1.2577F, 0.207F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(19, 0).addBox(-0.9F, -1.275F, -0.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.3798F, 1.18F, 0.7938F, 3.1217F, 1.2577F, 0.207F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(54, 52).addBox(-0.4063F, -0.7401F, -2.1605F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(2.7711F, 1.8915F, -0.4254F, -2.9477F, -0.2917F, 0.087F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(59, 5).addBox(-0.4063F, -0.8989F, -0.7584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.7711F, 1.8915F, -0.4254F, -2.6423F, -0.2917F, 0.087F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(12, 66).addBox(0.0577F, -0.8989F, 0.5497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(2.7711F, 1.8915F, -0.4254F, -2.6534F, 0.2108F, 0.3532F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 0).addBox(-0.4027F, -1.3169F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.1077F, 3.246F, -3.1665F, -2.4251F, 0.7612F, 0.3458F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(17, 64).addBox(-0.4027F, -0.6811F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 45).addBox(-0.4027F, -0.081F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1077F, 3.246F, -3.1665F, -2.5124F, 0.7612F, 0.3458F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(63, 41).addBox(-0.437F, -1.0058F, -0.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0594F, 4.2758F, -3.0999F, -1.7737F, 0.0925F, 0.1916F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(63, 10).addBox(-0.437F, -0.5089F, -0.7236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0594F, 4.2758F, -3.0999F, -1.9046F, 0.0925F, 0.1916F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(15, 70).addBox(-0.725F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1878F, 3.7057F, -5.5148F, 0.7856F, -0.5648F, 0.5064F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(41, 17).addBox(-1.45F, -0.525F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6878F, 2.954F, -3.8199F, 0.4896F, -0.4396F, 0.6739F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 16).addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8369F, 4.1452F, -5.4442F, -1.7261F, -0.1364F, -3.0586F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(60, 57).addBox(-0.4F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2017F, 4.2144F, -4.7285F, -2.324F, -0.122F, -3.1258F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(58, 36).addBox(-0.437F, -0.4304F, -0.5328F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.0594F, 4.2758F, -3.0999F, -2.3409F, 0.0925F, 0.1916F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(53, 57).addBox(-0.1733F, -1.178F, -1.5898F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1077F, 3.246F, -3.1665F, -2.1101F, 0.196F, 0.7497F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(53, 62).addBox(-0.3098F, -0.2508F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.8095F, -2.9618F, -1.138F, -0.0715F, -0.6504F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(34, 70).addBox(-0.5437F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3149F, 0.8095F, -2.9618F, -0.9934F, 0.1468F, -0.9777F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(20, 42).addBox(-0.4F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1969F, -0.3844F, 0.3608F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.8122F, -3.6136F, -1.6327F));

		PartDefinition cube_r100 = rightFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 22).mirror().addBox(-0.4618F, -0.5725F, -1.5416F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7199F, 0.8712F, -2.6346F, -0.4666F, 0.3555F, -0.7574F));

		PartDefinition cube_r101 = rightFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(25, 48).mirror().addBox(-0.8604F, -0.9755F, -2.7235F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.6F, -5.6F, -1.0461F, 0.4283F, -0.5437F));

		PartDefinition cube_r102 = rightFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(48, 23).mirror().addBox(-0.8604F, -0.7938F, -2.6341F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 3.6F, -5.6F, -0.8541F, 0.4283F, -0.5437F));

		PartDefinition cube_r103 = rightFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.7F, -1.1F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4446F, 1.1678F, -4.7867F, -1.1727F, 0.5561F, -0.9077F));

		PartDefinition cube_r104 = rightFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-0.5F, -1.325F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9967F, 1.9131F, -4.276F, -1.265F, 0.4384F, -0.5724F));

		PartDefinition cube_r105 = rightFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.4618F, -0.6308F, -0.6247F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.7199F, 0.8712F, -2.6346F, -0.3357F, 0.3555F, -0.7574F));

		PartDefinition cube_r106 = rightFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.5F, -1.5F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.3886F, 4.6548F, 1.1314F, -1.8969F, -1.2167F, -0.2524F));

		PartDefinition cube_r107 = rightFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-1.3886F, 4.6548F, 1.1314F, -2.2888F, -1.2577F, -0.207F));

		PartDefinition cube_r108 = rightFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.1F, -0.775F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.3798F, 1.18F, 0.7938F, -1.5471F, -1.2577F, -0.207F));

		PartDefinition cube_r109 = rightFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-0.1F, -1.275F, -0.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.3798F, 1.18F, 0.7938F, 3.1217F, -1.2577F, -0.207F));

		PartDefinition cube_r110 = rightFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(54, 52).mirror().addBox(-0.5936F, -0.7401F, -2.1605F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-2.7711F, 1.8915F, -0.4254F, -2.9477F, 0.2917F, -0.087F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-0.5936F, -0.8989F, -0.7584F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.7711F, 1.8915F, -0.4254F, -2.6423F, 0.2917F, -0.087F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(12, 66).mirror().addBox(-1.0577F, -0.8989F, 0.5497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-2.7711F, 1.8915F, -0.4254F, -2.6534F, -0.2108F, -0.3532F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.5973F, -1.3169F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.1077F, 3.246F, -3.1665F, -2.4251F, -0.7612F, -0.3458F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(17, 64).mirror().addBox(-0.5973F, -0.6811F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 45).mirror().addBox(-0.5973F, -0.081F, -2.7836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1077F, 3.246F, -3.1665F, -2.5124F, -0.7612F, -0.3458F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(63, 41).mirror().addBox(-0.5629F, -1.0058F, -0.7554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0594F, 4.2758F, -3.0999F, -1.7737F, -0.0925F, -0.1916F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(63, 10).mirror().addBox(-0.5629F, -0.5089F, -0.7236F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0594F, 4.2758F, -3.0999F, -1.9046F, -0.0925F, -0.1916F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.275F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1878F, 3.7057F, -5.5148F, 0.7856F, 0.5648F, -0.5064F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(41, 17).mirror().addBox(0.45F, -0.525F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6878F, 2.954F, -3.8199F, 0.4896F, 0.4396F, -0.6739F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-0.5F, -0.6F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8369F, 4.1452F, -5.4442F, -1.7261F, 0.1364F, 3.0586F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-0.6F, -0.7F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2017F, 4.2144F, -4.7285F, -2.324F, 0.122F, 3.1258F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-0.5629F, -0.4304F, -0.5328F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.0594F, 4.2758F, -3.0999F, -2.3409F, -0.0925F, -0.1916F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-0.8267F, -1.178F, -1.5898F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1077F, 3.246F, -3.1665F, -2.1101F, -0.196F, -0.7497F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(53, 62).mirror().addBox(-0.6902F, -0.2508F, 0.3561F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.8095F, -2.9618F, -1.138F, 0.0715F, 0.6504F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(-0.4563F, -0.1597F, -0.1745F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.3149F, 0.8095F, -2.9618F, -0.9934F, -0.1468F, 0.9777F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(20, 42).mirror().addBox(-0.6F, -0.171F, -2.5043F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1969F, 0.3844F, -0.3608F));

		PartDefinition leftTusk = head.addOrReplaceChild("leftTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6125F, -4.2219F, 2.8679F, -0.0196F, 0.1264F, -0.0341F));

		PartDefinition cube_r126 = leftTusk.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 45).addBox(-0.6F, -1.4F, -0.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1193F, 5.867F, -8.5379F, 0.7774F, -0.0465F, 0.1286F));

		PartDefinition rightTusk = head.addOrReplaceChild("rightTusk", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6125F, -4.2219F, 2.8679F, -0.0196F, -0.1264F, 0.0341F));

		PartDefinition cube_r127 = rightTusk.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.4F, -1.4F, -0.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1193F, 5.867F, -8.5379F, 0.7774F, 0.0465F, -0.1286F));

		return LayerDefinition.create(meshdefinition, 76, 76);
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