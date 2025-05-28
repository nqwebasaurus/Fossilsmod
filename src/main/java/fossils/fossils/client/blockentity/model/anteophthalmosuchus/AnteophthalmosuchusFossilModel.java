package fossils.fossils.client.blockentity.model.anteophthalmosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AnteophthalmosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart hindlegL9;
	private final ModelPart hindlegL5;
	private final ModelPart hindlegL6;
	private final ModelPart hindlegL7;
	private final ModelPart hindlegL8;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart forelegLx;
	private final ModelPart forelegL2;
	private final ModelPart forelegLx2;
	private final ModelPart forelegL3;
	private final ModelPart forelegLx3;
	private final ModelPart forelegL4;
	private final ModelPart forelegLx4;
	private final ModelPart forelegL5;
	private final ModelPart body4;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart eye;
	private final ModelPart eye3;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public AnteophthalmosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.hindlegL2 = this.bone.getChild("hindlegL2");
		this.hindlegL3 = this.hindlegL2.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.hindlegL9 = this.hindlegL4.getChild("hindlegL9");
		this.hindlegL5 = this.bone.getChild("hindlegL5");
		this.hindlegL6 = this.hindlegL5.getChild("hindlegL6");
		this.hindlegL7 = this.hindlegL6.getChild("hindlegL7");
		this.hindlegL8 = this.hindlegL7.getChild("hindlegL8");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.forelegLx = this.body3.getChild("forelegLx");
		this.forelegL2 = this.forelegLx.getChild("forelegL2");
		this.forelegLx2 = this.forelegL2.getChild("forelegLx2");
		this.forelegL3 = this.forelegLx2.getChild("forelegL3");
		this.forelegLx3 = this.body3.getChild("forelegLx3");
		this.forelegL4 = this.forelegLx3.getChild("forelegL4");
		this.forelegLx4 = this.forelegL4.getChild("forelegLx4");
		this.forelegL5 = this.forelegLx4.getChild("forelegL5");
		this.body4 = this.body3.getChild("body4");
		this.neck = this.body4.getChild("neck");
		this.head = this.neck.getChild("head");
		this.eye = this.head.getChild("eye");
		this.eye3 = this.head.getChild("eye3");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.5F, 1.3F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(-0.5F, -10.25F, 1.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 80).addBox(0.0F, -1.0832F, 0.0195F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8488F, 2.5443F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 51).addBox(0.0F, -1.0108F, -0.1049F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.7F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(79, 48).addBox(0.0F, -0.8256F, 0.0312F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.4F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 46).mirror().addBox(-1.5F, 0.9824F, 4.7432F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 46).addBox(0.5F, 0.9824F, 4.7432F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(15, 39).addBox(-0.5F, 0.4824F, 4.7432F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0F, -6.0F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 44).addBox(-2.5F, 0.0274F, 0.0034F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.4F, 2.2F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 37).addBox(-3.0F, -0.8605F, 0.0549F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.7F, -0.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.3F, 0.1978F, 2.117F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-0.4862F, -0.155F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(78, 14).mirror().addBox(-0.4862F, -0.155F, -0.7171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8905F, 2.8817F, 0.4797F, 0.3562F, 0.0246F, -0.3557F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-0.4862F, -1.0113F, -1.1057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8905F, 2.8817F, 0.4797F, 1.2725F, 0.0246F, -0.3557F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-1.0F, -0.0361F, -2.0007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(65, 44).addBox(1.8F, -0.0361F, -2.0007F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.2F, 0.0F, 0.0F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 67).mirror().addBox(0.5316F, 0.3384F, 1.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.5512F, -1.0259F, -1.831F, -0.0568F, -0.0362F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(0.5316F, 0.3029F, 1.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.5512F, -1.0259F, -2.18F, -0.0568F, -0.0362F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(0.5316F, 1.2326F, 0.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.5512F, -1.0259F, -1.3597F, -0.0568F, -0.0362F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 74).mirror().addBox(0.5316F, 1.5171F, 0.6795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.5512F, -1.0259F, -1.6215F, -0.0568F, -0.0362F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.5268F, -1.0277F, -0.6582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.8905F, 2.8817F, 0.4797F, 0.1613F, -0.0858F, -0.3594F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(0.0039F, -0.1595F, -0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.5512F, -1.0259F, -0.8502F, 0.0388F, -0.5128F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.3F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.4477F, -0.217F, -0.1434F, -0.0383F, -0.2591F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 65).mirror().addBox(-1.5F, -0.1397F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(42, 65).addBox(1.3F, -0.1397F, 0.001F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.7F, 0.1022F, -0.017F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(56, 67).addBox(-1.5316F, 0.3384F, 1.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3F, 1.5512F, -1.0259F, -1.831F, 0.0568F, 0.0362F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 14).addBox(-1.5316F, 0.3029F, 1.692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.5512F, -1.0259F, -2.18F, 0.0568F, 0.0362F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 78).addBox(-1.5316F, 1.2326F, 0.2672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, 1.5512F, -1.0259F, -1.3597F, 0.0568F, 0.0362F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 74).addBox(-1.5316F, 1.5171F, 0.6795F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.3F, 1.5512F, -1.0259F, -1.6215F, 0.0568F, 0.0362F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 66).addBox(-0.5138F, -1.0113F, -1.1057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7095F, 2.8817F, 0.4797F, 1.2725F, -0.0246F, 0.3557F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 17).addBox(-0.5138F, -0.155F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(78, 14).addBox(-0.5138F, -0.155F, -0.7171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7095F, 2.8817F, 0.4797F, 0.3562F, -0.0246F, 0.3557F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 78).addBox(-0.4732F, -1.0277F, -0.6582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7095F, 2.8817F, 0.4797F, 0.1613F, 0.0858F, 0.3594F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 71).addBox(-1.0039F, -0.1595F, -0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 1.5512F, -1.0259F, -0.8502F, -0.0388F, 0.5128F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 64).addBox(-0.7F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.4477F, -0.217F, -0.1434F, 0.0383F, 0.2591F));

		PartDefinition hindlegL2 = bone.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3529F, 2.2019F, -0.6808F, 0.1492F, -0.1608F, 0.2965F));

		PartDefinition cube_r27 = hindlegL2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(51, 26).addBox(0.0F, -0.3F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0603F, 0.0F, 0.842F, -0.0193F, 0.2173F, -0.0894F));

		PartDefinition hindlegL3 = hindlegL2.addOrReplaceChild("hindlegL3", CubeListBuilder.create().texOffs(11, 57).addBox(0.41F, -0.21F, -0.89F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 59).addBox(0.41F, -0.21F, 0.21F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.1397F, -0.7F, -0.558F, 0.0F, 0.0436F, 1.1781F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL9 = hindlegL4.addOrReplaceChild("hindlegL9", CubeListBuilder.create().texOffs(0, 49).addBox(-0.48F, -2.49F, -0.28F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0997F, 0.0F, -0.0131F, -1.658F, 1.5632F, -1.4836F));

		PartDefinition hindlegL5 = bone.addOrReplaceChild("hindlegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9529F, 2.2019F, -0.6808F, 0.1559F, 0.3334F, -0.2692F));

		PartDefinition cube_r28 = hindlegL5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 7).addBox(-6.0F, -0.3F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0603F, 0.0F, 0.842F, -0.0193F, -0.2173F, 0.0894F));

		PartDefinition hindlegL6 = hindlegL5.addOrReplaceChild("hindlegL6", CubeListBuilder.create().texOffs(11, 60).addBox(-4.41F, -0.21F, -0.89F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 29).addBox(-4.41F, -0.21F, 0.21F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-6.1397F, -0.7F, -0.558F, 0.0F, 0.48F, -1.1781F));

		PartDefinition hindlegL7 = hindlegL6.addOrReplaceChild("hindlegL7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.8F, 0.2F, -0.6981F, 0.0F, 0.0F));

		PartDefinition hindlegL8 = hindlegL7.addOrReplaceChild("hindlegL8", CubeListBuilder.create().texOffs(28, 49).addBox(-4.52F, -2.49F, -0.28F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0997F, 0.0F, -0.0131F, 2.1678F, -1.2667F, -2.4627F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.85F, -1.4F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(43, 80).addBox(-1.5F, -0.9F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 80).addBox(-1.5F, -0.9F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-4.5F, -1.8F, 5.6F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(54, 47).addBox(-2.0F, 0.0F, 5.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, -1.1F, -9.9F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.025F, -1.6F, 0.6643F, 0.1509F, -0.2999F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(79, 44).mirror().addBox(-1.8154F, -0.4758F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.025F, -1.6F, 0.5608F, 0.4048F, -0.6703F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-0.9401F, -0.0867F, -0.4439F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.225F, -3.6F, 0.4663F, 0.0533F, -0.3319F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-2.8154F, -0.4758F, -0.4439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.225F, -3.6F, 0.4068F, 0.2403F, -0.7311F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(79, 44).addBox(0.8154F, -0.4758F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.025F, -1.6F, 0.5608F, -0.4048F, 0.6703F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(79, 46).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.025F, -1.6F, 0.6643F, -0.1509F, 0.2999F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(14, 73).addBox(0.8154F, -0.4758F, -0.4439F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.225F, -3.6F, 0.4068F, -0.2403F, 0.7311F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(79, 42).addBox(-0.0599F, -0.0867F, -0.4439F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.225F, -3.6F, 0.4663F, -0.0533F, 0.3319F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 31).addBox(-3.5F, -0.9324F, -0.0647F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.5F, 5.1F, -3.9F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 31).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(0, 0).addBox(-3.0F, -2.25F, -6.125F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.425F, -4.0F, 0.0361F, -0.2616F, -0.0094F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(28, 42).addBox(-0.5F, -7.6755F, 0.7517F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.9163F, -6.3434F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-1.8506F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.479F, 4.0491F, -1.3364F, 0.7729F, 0.6839F, 0.7211F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-3.7626F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.479F, 4.0491F, -1.3364F, 0.8966F, 0.476F, 0.945F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 39).mirror().addBox(-1.8506F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.479F, 4.2491F, -1.9364F, 0.1496F, 0.2844F, 0.4984F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 47).mirror().addBox(-3.7626F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.479F, 4.2491F, -1.9364F, 0.2226F, 0.2324F, 0.7823F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-1.8506F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.579F, 4.5491F, -3.4364F, 0.1514F, 0.1033F, 0.311F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 51).mirror().addBox(-3.7626F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.579F, 4.5491F, -3.4364F, 0.1738F, 0.0578F, 0.5874F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -5.5F, 0.1689F, -0.0169F, -0.1279F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-2.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -5.5F, 0.1604F, 0.0558F, -0.5584F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 55).mirror().addBox(-3.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -5.5F, 0.0936F, 0.1417F, -1.2107F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -3.5F, 0.2113F, -0.0068F, -0.0761F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 2).mirror().addBox(-2.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -3.5F, 0.1949F, 0.0826F, -0.5036F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-3.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -3.5F, 0.1048F, 0.184F, -1.1565F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.5F, 0.2962F, 0.0134F, -0.1282F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-2.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.5F, 0.2644F, 0.1359F, -0.5484F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-2.9373F, -2.1002F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.5F, 0.1278F, 0.2683F, -1.2037F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(55, 19).mirror().addBox(-1.2609F, -0.0223F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.804F, 4.5491F, -4.8364F, 0.118F, -0.1123F, 0.2762F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(38, 29).mirror().addBox(-3.2182F, 0.3261F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.804F, 4.5491F, -4.8364F, 0.0825F, -0.1404F, 0.5563F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 49).addBox(1.7625F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.479F, 4.0491F, -1.3364F, 0.8966F, -0.476F, -0.945F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 41).addBox(-0.1494F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.479F, 4.0491F, -1.3364F, 0.7729F, -0.6839F, -0.7211F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(72, 47).addBox(1.7625F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.479F, 4.2491F, -1.9364F, 0.2226F, -0.2324F, -0.7823F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 39).addBox(-0.1494F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.479F, 4.2491F, -1.9364F, 0.1496F, -0.2844F, -0.4984F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 51).addBox(1.7626F, 0.5672F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.579F, 4.5491F, -3.4364F, 0.1738F, -0.0578F, -0.5874F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 8).addBox(-0.1494F, 0.0594F, -0.396F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.579F, 4.5491F, -3.4364F, 0.1514F, -0.1033F, -0.311F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(55, 19).addBox(-0.7391F, -0.0223F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.804F, 4.5491F, -4.8364F, 0.118F, 0.1123F, -0.2762F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 55).addBox(1.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -5.5F, 0.0936F, -0.1417F, 1.2107F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(73, 10).addBox(0.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -5.5F, 0.1604F, -0.0558F, 0.5584F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 38).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -5.5F, 0.1689F, 0.0169F, 0.1279F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 53).addBox(1.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.5F, 0.1048F, -0.184F, 1.1565F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(73, 2).addBox(0.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.5F, 0.1949F, -0.0826F, 0.5036F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(77, 72).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -3.5F, 0.2113F, 0.0068F, 0.0761F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 65).addBox(1.9373F, -2.1002F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.5F, 0.1278F, -0.2683F, 1.2037F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(73, 0).addBox(0.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.5F, 0.2644F, -0.1359F, 0.5484F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(73, 20).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2F, -1.5F, 0.2962F, -0.0134F, 0.1282F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(38, 29).addBox(1.2182F, 0.3261F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.804F, 4.5491F, -4.8364F, 0.0825F, 0.1404F, -0.5563F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.25F, -3.125F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(80, 6).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(80, 3).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(79, 54).addBox(-2.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -6.0F, -0.044F, -0.1308F, 0.0057F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 43).mirror().addBox(-3.2182F, 0.3261F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.204F, 4.3991F, -0.5364F, 0.0918F, -0.1256F, 0.4329F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-1.2609F, -0.0223F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.204F, 4.3991F, -0.5364F, 0.1228F, -0.0955F, 0.1536F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 40).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -1.5F, 0.2962F, 0.0134F, -0.3201F));

		PartDefinition cube_r81 = body3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-2.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -1.5F, 0.2644F, 0.1359F, -0.7404F));

		PartDefinition cube_r82 = body3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(72, 57).mirror().addBox(-3.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.05F, -1.5F, 0.1278F, 0.2683F, -1.3957F));

		PartDefinition cube_r83 = body3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-1.0F, 0.096F, -0.9634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(50, 74).addBox(4.0F, 0.096F, -0.9634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 0.2833F, -3.3317F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(65, 40).mirror().addBox(-0.2968F, -1.2337F, 2.0874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8663F, -1.8434F, 2.1767F, -0.0454F, -0.9954F));

		PartDefinition cube_r85 = body3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(45, 74).mirror().addBox(-1.0F, -2.3253F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(45, 74).addBox(4.0F, -2.3253F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-2.0F, 2.1914F, -2.5546F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(60, 32).mirror().addBox(-1.0F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(60, 32).addBox(4.0F, -1.0F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0F, 1.2914F, -2.9546F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-2.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.25F, -3.5F, 0.2301F, 0.4003F, -0.9271F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.9401F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.25F, -3.5F, 0.377F, 0.2676F, -0.4863F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(65, 40).addBox(-0.7032F, -1.2337F, 2.0874F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.8663F, -1.8434F, 2.1767F, 0.0454F, 0.9954F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(14, 69).addBox(-0.5F, -7.8006F, 1.3123F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.6663F, -3.3434F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 21).addBox(-1.5F, -0.9354F, -3.0049F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(71, 60).addBox(-1.0F, -0.9354F, -4.0049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 4.8663F, -1.8434F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(79, 80).addBox(-1.0F, -1.4883F, -0.0829F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(80, 0).addBox(-1.0F, -1.1488F, -0.0878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -3.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 23).addBox(-2.5F, -1.0358F, -5.0525F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.6694F, 0.1986F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(23, 16).addBox(-2.5F, -0.575F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.6784F, -2.1005F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 54).addBox(-1.5F, 0.0F, 4.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 0.0F, -8.9F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 73).addBox(0.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -3.5F, 0.2301F, -0.4003F, 0.9271F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(72, 45).addBox(-0.7391F, -0.0223F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.204F, 4.3991F, -0.5364F, 0.1228F, 0.0955F, -0.1536F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 43).addBox(1.2182F, 0.3261F, -0.3217F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.204F, 4.3991F, -0.5364F, 0.0918F, 0.1256F, -0.4329F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(79, 40).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -1.5F, 0.2962F, -0.0134F, 0.3201F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(73, 12).addBox(0.8154F, -0.4758F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -1.5F, 0.2644F, -0.1359F, 0.7404F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 57).addBox(1.9373F, -2.1002F, -0.4438F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.05F, -1.5F, 0.1278F, -0.2683F, 1.3957F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(21, 69).addBox(-0.0599F, -0.0867F, -0.4438F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.25F, -3.5F, 0.377F, -0.2676F, 0.4863F));

		PartDefinition forelegLx = body3.addOrReplaceChild("forelegLx", CubeListBuilder.create().texOffs(63, 57).addBox(1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 63).addBox(4.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7186F, 2.8426F, -4.1166F, 0.0922F, 0.2163F, 0.1355F));

		PartDefinition forelegL2 = forelegLx.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3F, -0.5F, -0.1F, 0.0F, 0.0F, 1.1781F));

		PartDefinition forelegLx2 = forelegL2.addOrReplaceChild("forelegLx2", CubeListBuilder.create().texOffs(60, 37).addBox(-0.09F, -1.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-0.09F, -0.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3846F, -0.6916F, -0.1166F, -0.4705F, 0.4385F, 0.1001F));

		PartDefinition forelegL3 = forelegLx2.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3369F, -0.0703F, 0.2854F, 0.2738F, 1.1589F, 0.1358F));

		PartDefinition cube_r104 = forelegL3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(41, 54).addBox(-3.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.02F, 0.01F, -0.38F, -0.0873F, 0.0F, 0.0F));

		PartDefinition forelegLx3 = body3.addOrReplaceChild("forelegLx3", CubeListBuilder.create().texOffs(62, 63).addBox(-4.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 63).addBox(-6.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 65).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7186F, 2.8426F, -4.1166F, 0.1474F, 0.8286F, -0.0496F));

		PartDefinition forelegL4 = forelegLx3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3F, -0.5F, -0.1F, 0.0F, 0.0F, -1.1781F));

		PartDefinition forelegLx4 = forelegL4.addOrReplaceChild("forelegLx4", CubeListBuilder.create().texOffs(53, 60).addBox(-3.91F, -1.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 62).addBox(-3.91F, -0.01F, 0.06F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3846F, -0.6916F, -0.1166F, 0.1145F, -0.5275F, -0.3253F));

		PartDefinition forelegL5 = forelegLx4.addOrReplaceChild("forelegL5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3369F, -0.0703F, 0.2854F, 0.2167F, -1.2008F, -0.1684F));

		PartDefinition cube_r105 = forelegL5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(54, 41).addBox(-1.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.02F, 0.01F, -0.38F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(65, 48).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(53, 10).addBox(-2.0F, -2.3F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(80, 9).addBox(0.0F, -1.3F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, -4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r106 = body4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 49).addBox(-2.0F, -1.0F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 4.7F, -0.4F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck = body4.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.3253F, -0.4538F, 0.023F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(40, 79).addBox(0.0F, -0.2F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -0.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0F, -0.9744F, -2.0293F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 3.7F, 0.2F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -0.0079F, -3.9837F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.6F, -0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -0.85F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -0.6F, -9.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4886F, -0.3535F, -1.9604F, -0.4357F, -0.2267F, -0.2993F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(7, 72).addBox(-1.0F, 0.0372F, -0.9413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.2725F, -5.4249F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 22).addBox(-1.0F, -0.45F, -0.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1307F, 1.7052F, -11.1127F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-0.025F, -0.3989F, 0.3667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(63, 53).mirror().addBox(-0.125F, -0.8989F, -0.1333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6807F, 1.3996F, -7.4559F, 0.153F, -0.0647F, -0.01F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(0.0F, -0.4115F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(71, 36).mirror().addBox(-0.1F, -1.0115F, 0.1848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6307F, 1.8996F, -8.2309F, 0.415F, -0.0479F, -0.0211F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(38, 76).mirror().addBox(-0.54F, -0.1149F, -0.3907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(27, 67).mirror().addBox(-0.64F, -0.5149F, -1.4907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9307F, 1.3079F, -9.0995F, 0.185F, -0.5007F, -0.1602F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.6F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1023F)).mirror(false)
				.texOffs(0, 78).mirror().addBox(-0.6F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5475F, 2.1516F, -9.8252F, 0.4061F, -0.1002F, 0.0992F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(76, 66).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7307F, 2.2229F, -10.7805F, 0.9192F, 0.1337F, 0.173F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-0.05F, -0.45F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 75).mirror().addBox(-0.65F, -0.45F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1307F, 1.9637F, -11.265F, 0.7903F, -0.818F, -0.5572F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.6F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1307F, 1.9637F, -11.265F, 1.2695F, -0.6216F, -0.9218F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-2.1F, -0.8906F, -0.1407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(71, 29).addBox(-0.9F, -0.8906F, -0.1407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.3693F, 1.8996F, -8.5309F, 0.4145F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(-2.1F, -0.8935F, -0.3576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(28, 71).addBox(-0.9F, -0.8935F, -0.3576F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3693F, 1.5996F, -9.0309F, -0.5454F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4307F, 0.7996F, -5.7809F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(55, 14).mirror().addBox(-1.1F, -0.1F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0307F, 0.2851F, -5.1405F, 0.3453F, -0.3331F, -0.1332F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-2.125F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0307F, -0.2004F, -1.5559F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-1.0479F, -0.4F, -1.9475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1307F, -0.2004F, -1.0559F, 0.0143F, -0.6344F, -0.0218F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-2.3F, -0.3545F, -0.2677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 60).addBox(0.3F, -0.3545F, -0.2677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1307F, -1.1053F, -2.5943F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-0.072F, -0.05F, -1.9751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2307F, 0.0245F, -5.8294F, 0.3562F, -0.2732F, -0.036F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(0.0516F, -0.0755F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7307F, -0.1755F, -5.4294F, 0.533F, -0.6213F, -0.2394F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.15F, -0.1012F, -0.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9307F, -0.5755F, -4.5294F, 0.4557F, -0.3518F, -0.0759F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(76, 66).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4693F, 2.2229F, -10.7805F, 0.9192F, -0.1337F, -0.173F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(5, 75).addBox(0.0F, -0.4337F, 0.4129F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 4).addBox(0.0F, -0.4337F, -0.1871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6307F, 2.1996F, -11.4809F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(75, 74).addBox(-0.95F, -0.45F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 75).addBox(-0.35F, -0.45F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1307F, 1.9637F, -11.265F, 0.7903F, 0.818F, 0.5572F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(20, 75).addBox(-0.4F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1307F, 1.9637F, -11.265F, 1.2695F, 0.6216F, 0.9218F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(38, 76).addBox(-0.46F, -0.1149F, -0.3907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(27, 67).addBox(-0.36F, -0.5149F, -1.4907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6693F, 1.3079F, -9.0995F, 0.185F, 0.5007F, 0.1602F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-0.1F, -0.3216F, 0.9361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5307F, 1.05F, -10.0618F, 0.0218F, -0.2094F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.1F, 0.058F, 1.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5307F, 1.05F, -10.0618F, 0.24F, -0.2094F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.1F, 0.0769F, -0.1283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5307F, 1.05F, -11.0618F, 0.2836F, -0.2094F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(34, 67).mirror().addBox(-0.2303F, -0.1456F, -1.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6307F, 0.875F, -8.9618F, 0.0739F, -0.0699F, -0.0006F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(34, 67).addBox(-0.7697F, -0.1456F, -1.4647F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3693F, 0.875F, -8.9618F, 0.0739F, 0.0699F, 0.0006F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 7).addBox(-0.9F, -0.3216F, 0.9361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2693F, 1.05F, -10.0618F, 0.0218F, 0.2094F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(10, 75).addBox(-0.9F, 0.0769F, -0.1283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2693F, 1.05F, -11.0618F, 0.2836F, 0.2094F, 0.0F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(15, 75).addBox(-0.9F, 0.058F, 1.5655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2693F, 1.05F, -10.0618F, 0.24F, 0.2094F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 67).addBox(-1.0F, -0.1555F, -1.4684F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.3693F, 0.875F, -8.9618F, 0.0654F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -0.1072F, -0.8651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1307F, 0.9246F, -10.3309F, 0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(70, 74).addBox(-0.5F, -0.911F, -1.1824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1307F, 1.5996F, -8.2309F, 0.0742F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(5, 78).addBox(-0.4F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1023F))
				.texOffs(0, 78).addBox(-0.4F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2861F, 2.1516F, -9.8252F, 0.4061F, 0.1002F, -0.0992F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 32).addBox(-1.0F, -0.4115F, -0.0152F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(71, 36).addBox(-1.9F, -1.0115F, 0.1848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3693F, 1.8996F, -8.2309F, 0.415F, 0.0479F, 0.0211F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(65, 74).addBox(-0.5F, -0.911F, -0.8824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1307F, 1.5996F, -8.2309F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(60, 74).addBox(0.0F, -0.9069F, -0.907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6307F, 1.3996F, -7.4309F, 0.24F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(63, 70).addBox(-0.975F, -0.3989F, 0.3667F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 53).addBox(-1.875F, -0.8989F, -0.1333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4193F, 1.3996F, -7.4559F, 0.153F, 0.0647F, 0.01F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(48, 71).addBox(-0.5F, -0.8719F, -0.9373F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6307F, 1.0996F, -6.6559F, 0.3272F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 63).addBox(-0.5F, -0.0849F, -0.8725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6307F, 0.0996F, -6.2559F, 0.3709F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(69, 66).addBox(-0.928F, -0.05F, -1.9751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9693F, 0.0245F, -5.8294F, 0.3562F, 0.2732F, 0.036F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(78, 35).addBox(-1.0516F, -0.0755F, -0.934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4693F, -0.1755F, -5.4294F, 0.533F, 0.6213F, 0.2394F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(43, 77).addBox(-0.85F, -0.1012F, -0.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6693F, -0.5755F, -4.5294F, 0.4557F, 0.3518F, 0.0759F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(64, 19).addBox(-1.5F, 0.0001F, -1.0268F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.7053F, -4.4943F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(77, 69).mirror().addBox(-0.2F, -0.2295F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.4557F, -1.1053F, -2.5943F, 0.3148F, 0.7167F, 0.2107F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-1.5F, -0.2295F, -1.8677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(66, 26).mirror().addBox(-2.0F, -0.2295F, -1.3677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false)
				.texOffs(66, 26).addBox(0.05F, -0.2295F, -1.3677F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F))
				.texOffs(68, 4).addBox(0.55F, -0.2295F, -1.8677F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(13, 52).addBox(-1.975F, -0.0545F, -1.9677F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1557F, -1.1053F, -2.5943F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(73, 77).mirror().addBox(-0.8F, 0.1674F, -0.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.8557F, -1.1053F, -4.2943F, 0.3166F, 0.7277F, 0.2009F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.15F, 0.1674F, -0.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-1.5557F, -1.1053F, -4.2943F, 0.3037F, -0.6752F, -0.1934F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-0.8F, -0.2295F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.8557F, -1.1053F, -2.5943F, 0.3037F, -0.6752F, -0.1934F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(68, 77).addBox(-0.2F, -0.2295F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.5943F, -1.1053F, -2.5943F, 0.3037F, 0.6752F, 0.1934F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(77, 69).addBox(-0.8F, -0.2295F, -0.8677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1943F, -1.1053F, -2.5943F, 0.3148F, -0.7167F, -0.2107F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 77).addBox(-0.2F, 0.1674F, -0.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5943F, -1.1053F, -4.2943F, 0.3166F, -0.7277F, -0.2009F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(20, 78).addBox(-0.85F, 0.1674F, -0.2146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(1.2943F, -1.1053F, -4.2943F, 0.3037F, 0.6752F, 0.1934F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(33, 60).addBox(-2.0F, -0.4F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1307F, -0.4053F, -2.8943F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(55, 14).addBox(-0.9F, -0.1F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7693F, 0.2851F, -5.1405F, 0.3453F, 0.3331F, 0.1332F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(78, 62).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1693F, 0.7996F, -5.7809F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(26, 55).addBox(-1.0F, -1.625F, -1.425F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6307F, 1.8996F, -4.5559F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 68).addBox(0.0479F, -0.4F, -1.9475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8693F, -0.2004F, -1.0559F, 0.0143F, 0.6344F, 0.0218F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(66, 0).addBox(1.125F, -0.4F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7693F, -0.2004F, -1.5559F, 0.0F, 0.0436F, 0.0F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5434F, -0.1015F, -5.2119F, 0.3471F, 0.7173F, 0.1955F));

		PartDefinition cube_r172 = eye.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 29).addBox(-0.85F, -0.225F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, 0.2993F, 1.1741F, 0.5843F, -0.3655F, 0.0838F));

		PartDefinition cube_r173 = eye.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 59).addBox(-0.475F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0026F, 0.4031F, 0.1373F, -0.1067F, -0.1906F));

		PartDefinition eye3 = head.addOrReplaceChild("eye3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8048F, -0.1015F, -5.2119F, 0.3471F, -0.7173F, -0.1955F));

		PartDefinition cube_r174 = eye3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(-0.15F, -0.225F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.375F, 0.2993F, 1.1741F, 0.5843F, 0.3655F, -0.0838F));

		PartDefinition cube_r175 = eye3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-0.525F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0026F, 0.4031F, 0.1373F, 0.1067F, 0.1906F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2517F, -1.1581F, -2.9965F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1307F, 0.1619F, -1.0032F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(21, 71).mirror().addBox(-0.1053F, -0.2601F, -1.9016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.2355F, -4.1837F, 0.4276F, -0.0698F, -0.0175F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(78, 26).mirror().addBox(-0.65F, -0.5F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2762F, -9.1889F, 0.5305F, -0.8438F, -0.413F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(41, 69).mirror().addBox(-0.5596F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.0596F, 4.1081F, -8.718F, 0.343F, 0.0F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.0254F, -1.3712F, -0.9017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(69, 32).mirror().addBox(-0.0754F, -0.6712F, -1.9017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.4153F, 3.8659F, -7.3099F, 0.3031F, -0.3204F, -0.095F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(78, 23).mirror().addBox(-0.375F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5526F, 3.4646F, -8.6644F, 0.3745F, -0.1584F, -0.028F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-0.0989F, -0.8982F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5153F, 3.8659F, -6.5099F, 0.2908F, -0.1535F, -0.0425F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.0303F, -0.51F, -2.9056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.2355F, -4.1837F, 0.3316F, -0.0698F, -0.0175F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(11, 63).mirror().addBox(-0.1053F, -0.01F, -2.9056F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 2.2355F, -4.1837F, 0.288F, -0.0698F, -0.0175F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(0.0F, 0.7438F, -3.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.2094F, -0.3665F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(56, 70).mirror().addBox(0.0F, 0.0565F, -3.7994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.3752F, -0.3665F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(0.0F, 0.1942F, -1.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(55, 74).mirror().addBox(0.0F, 0.1942F, -0.1545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 1.0079F, -0.3665F, 0.0F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(0.0F, -0.1296F, -0.2432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.6632F, -0.3665F, 0.0F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(53, 77).mirror().addBox(0.0F, 0.773F, -1.7884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.192F, -0.3665F, 0.0F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(48, 77).mirror().addBox(0.0F, 0.496F, -1.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.4538F, -0.3665F, 0.0F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(0.0F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 0.6355F, -0.9837F, 0.4363F, -0.3665F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(21, 71).addBox(-0.8947F, -0.2601F, -1.9016F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.7F, 2.2355F, -4.1837F, 0.4276F, 0.0698F, 0.0175F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(78, 26).addBox(-0.35F, -0.5F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.2762F, -9.1889F, 0.5305F, 0.8438F, 0.413F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 20).addBox(-0.9746F, -1.3712F, -0.9017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(69, 32).addBox(-0.9246F, -0.6712F, -1.9017F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.4153F, 3.8659F, -7.3099F, 0.3031F, 0.3204F, 0.095F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(78, 23).addBox(-0.625F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5526F, 3.4646F, -8.6644F, 0.3745F, 0.1584F, 0.028F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 78).addBox(-0.9011F, -0.8982F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5153F, 3.8659F, -6.5099F, 0.2908F, 0.1535F, 0.0425F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(55, 0).addBox(-0.9697F, -0.51F, -2.9056F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, 2.2355F, -4.1837F, 0.3316F, 0.0698F, 0.0175F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(11, 63).addBox(-0.8947F, -0.01F, -2.9056F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, 2.2355F, -4.1837F, 0.288F, 0.0698F, 0.0175F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(70, 70).addBox(-1.0F, 0.7438F, -3.7671F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.2094F, 0.3665F, 0.0F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(56, 70).addBox(-1.0F, 0.0565F, -3.7994F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.3752F, 0.3665F, 0.0F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(25, 77).addBox(-1.0F, 0.1942F, -1.0045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(55, 74).addBox(-1.0F, 0.1942F, -0.1545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 1.0079F, 0.3665F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(66, 14).addBox(-1.0F, -0.1296F, -0.2432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.6632F, 0.3665F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(53, 77).addBox(-1.0F, 0.773F, -1.7884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.192F, 0.3665F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(48, 77).addBox(-1.0F, 0.496F, -1.2256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.4538F, 0.3665F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(66, 10).addBox(-1.0F, -0.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.9F, 0.6355F, -0.9837F, 0.4363F, 0.3665F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 7).addBox(-0.5F, -0.1552F, -0.085F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(47, 29).addBox(0.5F, 0.3448F, 0.915F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(47, 29).mirror().addBox(-1.5F, 0.3448F, 0.915F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0482F, 3.5269F, -0.4334F, 0.319F, -0.1441F));

		PartDefinition cube_r205 = tail.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(55, 80).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 80).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 80).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1552F, 0.915F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r206 = tail.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 64).addBox(0.0F, 1.4F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 55).addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5534F, 1.4027F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r207 = tail.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.8552F, 0.815F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.1594F, 0.1708F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(58, 80).addBox(0.0F, -0.6594F, 1.1708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 80).addBox(0.0F, -0.6594F, 3.1708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 80).addBox(0.0F, -0.6594F, 5.1708F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0103F, 5.6741F, 0.0804F, -0.2175F, -0.0174F));

		PartDefinition cube_r208 = tail2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(47, 35).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3406F, 1.1708F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r209 = tail2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(47, 35).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3406F, 1.1708F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r210 = tail2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(21, 23).addBox(-0.5F, -0.1F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -1.4594F, 0.1708F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r211 = tail2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(76, 80).addBox(0.0F, 5.3F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 74).addBox(0.0F, 4.2F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 80).addBox(0.0F, 3.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5637F, -4.2714F, 0.5934F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, -0.0381F, -0.2468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1153F, 6.1118F, 0.2346F, -0.2549F, -0.0602F));

		PartDefinition cube_r212 = tail3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(70, 80).addBox(0.0F, -0.45F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 80).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0381F, 0.7532F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r213 = tail3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, 7.3F, 11.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 81).addBox(0.0F, 6.0F, 9.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.679F, -10.3832F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r214 = tail3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 17).addBox(0.5F, 2.0934F, 3.205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -1.2381F, 0.1532F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r215 = tail3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(63, 77).addBox(0.5F, 0.9837F, 1.5335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -1.2381F, 0.1532F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r216 = tail3.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(58, 77).addBox(0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -1.2381F, 0.1532F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r217 = tail3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(42, 14).addBox(0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -1.2381F, 0.1532F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.413F, -0.1774F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(38, 22).addBox(-0.5F, -1.4053F, 0.0696F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3792F, 4.8499F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition cube_r218 = tail4.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(40, 73).addBox(0.5F, 1.3381F, 2.8263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
				.texOffs(73, 25).addBox(0.5F, 0.0131F, 1.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -0.4243F, 0.0252F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, -0.1322F, -0.0375F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2521F, 4.7427F, 0.1372F, -0.3027F, -0.0411F));

		PartDefinition cube_r219 = tail5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(35, 79).addBox(0.5F, 3.4527F, 6.1279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -0.1722F, -4.7175F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r220 = tail5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(78, 77).addBox(0.5F, 2.684F, 4.2552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-1.0F, -0.1722F, -4.7175F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r221 = tail5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(44, 60).addBox(0.5F, -1.1898F, 4.9951F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.0F, -0.1722F, -4.7175F, -0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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