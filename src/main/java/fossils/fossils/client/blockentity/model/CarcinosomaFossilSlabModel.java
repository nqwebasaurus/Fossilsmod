package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CarcinosomaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart segments;
	private final ModelPart metasoma1;
	private final ModelPart metasoma2;
	private final ModelPart metasoma3;
	private final ModelPart metasoma4;
	private final ModelPart metasoma5;
	private final ModelPart telson;
	private final ModelPart leg1L;
	private final ModelPart leg2L;
	private final ModelPart leg2L2;
	private final ModelPart leg2L3;
	private final ModelPart leg3L;
	private final ModelPart leg3L2;
	private final ModelPart leg3L3;
	private final ModelPart leg4L;
	private final ModelPart leg4L2;
	private final ModelPart leg4L3;
	private final ModelPart leg5L;
	private final ModelPart leg5L2;
	private final ModelPart leg5L3;
	private final ModelPart leg1R;
	private final ModelPart leg2R;
	private final ModelPart leg2R2;
	private final ModelPart leg2R3;
	private final ModelPart leg3R;
	private final ModelPart leg3R2;
	private final ModelPart leg3R3;
	private final ModelPart leg4R;
	private final ModelPart leg4R2;
	private final ModelPart leg4R3;
	private final ModelPart leg5R;
	private final ModelPart leg5R2;
	private final ModelPart leg5R3;

	public CarcinosomaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.segments = this.body.getChild("segments");
		this.metasoma1 = this.segments.getChild("metasoma1");
		this.metasoma2 = this.metasoma1.getChild("metasoma2");
		this.metasoma3 = this.metasoma2.getChild("metasoma3");
		this.metasoma4 = this.metasoma3.getChild("metasoma4");
		this.metasoma5 = this.metasoma4.getChild("metasoma5");
		this.telson = this.metasoma5.getChild("telson");
		this.leg1L = this.body.getChild("leg1L");
		this.leg2L = this.body.getChild("leg2L");
		this.leg2L2 = this.leg2L.getChild("leg2L2");
		this.leg2L3 = this.leg2L2.getChild("leg2L3");
		this.leg3L = this.body.getChild("leg3L");
		this.leg3L2 = this.leg3L.getChild("leg3L2");
		this.leg3L3 = this.leg3L2.getChild("leg3L3");
		this.leg4L = this.body.getChild("leg4L");
		this.leg4L2 = this.leg4L.getChild("leg4L2");
		this.leg4L3 = this.leg4L2.getChild("leg4L3");
		this.leg5L = this.body.getChild("leg5L");
		this.leg5L2 = this.leg5L.getChild("leg5L2");
		this.leg5L3 = this.leg5L2.getChild("leg5L3");
		this.leg1R = this.body.getChild("leg1R");
		this.leg2R = this.body.getChild("leg2R");
		this.leg2R2 = this.leg2R.getChild("leg2R2");
		this.leg2R3 = this.leg2R2.getChild("leg2R3");
		this.leg3R = this.body.getChild("leg3R");
		this.leg3R2 = this.leg3R.getChild("leg3R2");
		this.leg3R3 = this.leg3R2.getChild("leg3R3");
		this.leg4R = this.body.getChild("leg4R");
		this.leg4R2 = this.leg4R.getChild("leg4R2");
		this.leg4R3 = this.leg4R2.getChild("leg4R3");
		this.leg5R = this.body.getChild("leg5R");
		this.leg5R2 = this.leg5R.getChild("leg5R2");
		this.leg5R3 = this.leg5R2.getChild("leg5R3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 34).addBox(-17.0F, -2.0F, -21.0F, 33.0F, 2.0F, 31.0F, new CubeDeformation(0.003F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-19.5F, -1.0F, -7.7F, 34.0F, 2.0F, 31.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 9.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 68).addBox(-20.8F, -1.0F, -13.2F, 26.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -1.0F, -22.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-4.5F, 0.5F, -3.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 34).addBox(-2.0F, 0.5F, -8.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(-3.0F, 0.5F, -4.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -3.0F));

		PartDefinition eyeR_r1 = body.addOrReplaceChild("eyeR_r1", CubeListBuilder.create().texOffs(77, 92).addBox(-5.25F, -1.25F, -6.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition eyeL_r1 = body.addOrReplaceChild("eyeL_r1", CubeListBuilder.create().texOffs(82, 93).addBox(4.25F, -1.25F, -6.5F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition carapace5_r1 = body.addOrReplaceChild("carapace5_r1", CubeListBuilder.create().texOffs(10, 40).addBox(-5.25F, 0.01F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition carapace4_r1 = body.addOrReplaceChild("carapace4_r1", CubeListBuilder.create().texOffs(0, 45).addBox(3.25F, 0.01F, -5.25F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition segments = body.addOrReplaceChild("segments", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.97F, 0.0F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-2.5F, 1.0F, 7.001F, 5.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-5.5F, 1.15F, 0.0F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 11).addBox(-6.0F, 1.15F, 1.0F, 12.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-6.5F, 1.15F, 9.0F, 13.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-4.5F, 1.15F, 11.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 68).addBox(-7.0F, 1.15F, 3.0F, 14.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition metasoma1 = segments.addOrReplaceChild("metasoma1", CubeListBuilder.create().texOffs(71, 75).addBox(-1.99F, 0.99F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 12.7F, 0.0F, -0.1745F, 0.0F));

		PartDefinition metasoma2 = metasoma1.addOrReplaceChild("metasoma2", CubeListBuilder.create().texOffs(15, 61).addBox(-2.0F, 1.0F, 0.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition metasoma3 = metasoma2.addOrReplaceChild("metasoma3", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, 0.99F, 0.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition metasoma4 = metasoma3.addOrReplaceChild("metasoma4", CubeListBuilder.create().texOffs(0, 51).addBox(-1.49F, 1.0F, 0.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition metasoma5 = metasoma4.addOrReplaceChild("metasoma5", CubeListBuilder.create().texOffs(11, 49).addBox(-1.5F, 0.99F, 0.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(87, 87).addBox(-2.0F, 1.05F, 1.75F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition telson = metasoma5.addOrReplaceChild("telson", CubeListBuilder.create().texOffs(0, 14).addBox(1.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).addBox(1.0F, -0.5F, 2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.3124F, 0.0F, 1.5042F));

		PartDefinition spine3_r1 = telson.addOrReplaceChild("spine3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.501F, -19.75F, 31.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -30.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition leg1L = body.addOrReplaceChild("leg1L", CubeListBuilder.create().texOffs(12, 34).addBox(-2.0F, 0.499F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(17, 14).addBox(0.0F, 0.401F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 0.2F, -7.25F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leg2L = body.addOrReplaceChild("leg2L", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, 0.4F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(65, 89).addBox(0.0F, 0.5F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3F, -6.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition leg2L2 = leg2L.addOrReplaceChild("leg2L2", CubeListBuilder.create().texOffs(26, 89).addBox(0.0F, 0.401F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 89).addBox(0.0F, 0.501F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition leg2L3 = leg2L2.addOrReplaceChild("leg2L3", CubeListBuilder.create().texOffs(52, 89).addBox(0.0F, 0.5F, -2.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(85, 81).addBox(0.0F, 0.4F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition leg3L = body.addOrReplaceChild("leg3L", CubeListBuilder.create().texOffs(71, 79).addBox(-1.0F, 0.4F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 78).addBox(0.0F, 0.5F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.3F, -4.25F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leg3L2 = leg3L.addOrReplaceChild("leg3L2", CubeListBuilder.create().texOffs(55, 92).addBox(0.0F, 0.501F, -3.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 92).addBox(0.0F, 0.401F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition leg3L3 = leg3L2.addOrReplaceChild("leg3L3", CubeListBuilder.create().texOffs(22, 51).addBox(0.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 92).addBox(0.0F, 0.5F, -2.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leg4L = body.addOrReplaceChild("leg4L", CubeListBuilder.create().texOffs(83, 75).addBox(0.0F, 0.4F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 82).addBox(0.0F, 0.5F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.3F, -2.5F, 0.0F, -0.1745F, 0.0F));

		PartDefinition leg4L2 = leg4L.addOrReplaceChild("leg4L2", CubeListBuilder.create().texOffs(0, 92).addBox(0.0F, 0.501F, -3.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(87, 90).addBox(0.0F, 0.401F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition leg4L3 = leg4L2.addOrReplaceChild("leg4L3", CubeListBuilder.create().texOffs(22, 36).addBox(0.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 89).addBox(0.0F, 0.5F, -2.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition leg5L = body.addOrReplaceChild("leg5L", CubeListBuilder.create().texOffs(13, 54).addBox(0.0F, 1.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -0.1F, -1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition leg5L2 = leg5L.addOrReplaceChild("leg5L2", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, 1.001F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition leg5L3 = leg5L2.addOrReplaceChild("leg5L3", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, 1.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(23, 21).addBox(4.0F, 1.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leg1R = body.addOrReplaceChild("leg1R", CubeListBuilder.create().texOffs(18, 24).addBox(-1.0F, 0.401F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(0.0F, 0.499F, -5.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, 0.1F, -7.25F, 0.0F, 0.3491F, 0.0F));

		PartDefinition leg2R = body.addOrReplaceChild("leg2R", CubeListBuilder.create().texOffs(0, 79).addBox(-4.0F, 0.4F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 89).addBox(-4.0F, 0.5F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.2F, -6.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition leg2R2 = leg2R.addOrReplaceChild("leg2R2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leg2R3 = leg2R2.addOrReplaceChild("leg2R3", CubeListBuilder.create().texOffs(0, 89).addBox(-4.0F, 0.5F, -2.5F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 43).addBox(-4.0F, 0.4F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 5.0F, -3.1416F, 1.3963F, 3.1416F));

		PartDefinition leg3R = body.addOrReplaceChild("leg3R", CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, 0.4F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(82, 83).addBox(-4.0F, 0.5F, -3.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.3F, -4.25F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leg3R2 = leg3R.addOrReplaceChild("leg3R2", CubeListBuilder.create().texOffs(33, 92).addBox(-3.0F, 0.501F, -3.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(22, 92).addBox(-3.0F, 0.401F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition leg3R3 = leg3R2.addOrReplaceChild("leg3R3", CubeListBuilder.create().texOffs(22, 49).addBox(-3.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 92).addBox(-3.0F, 0.6F, -2.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));

		PartDefinition leg4R = body.addOrReplaceChild("leg4R", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leg4R2 = leg4R.addOrReplaceChild("leg4R2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leg4R3 = leg4R2.addOrReplaceChild("leg4R3", CubeListBuilder.create().texOffs(22, 34).addBox(-3.0F, 0.4F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 40).addBox(-3.0F, 0.5F, -2.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition leg5R = body.addOrReplaceChild("leg5R", CubeListBuilder.create().texOffs(10, 46).addBox(-6.0F, 1.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -0.1F, -1.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition leg5R2 = leg5R.addOrReplaceChild("leg5R2", CubeListBuilder.create().texOffs(0, 61).addBox(-4.0F, 1.001F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, -1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition leg5R3 = leg5R2.addOrReplaceChild("leg5R3", CubeListBuilder.create().texOffs(15, 57).addBox(-4.0F, 1.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 57).addBox(-5.0F, 1.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 4.0F, 0.0F, 1.3963F, 0.0F));

		return LayerDefinition.create(meshdefinition, 133, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}