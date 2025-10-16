package fossils.fossils.client.blockentity.model.postosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PostosuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
	private final ModelPart crestl3;
	private final ModelPart crestl4;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;
	private final ModelPart tail8;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;

	public PostosuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.crestl.getChild("crestl2");
		this.crestl3 = this.head.getChild("crestl3");
		this.crestl4 = this.crestl3.getChild("crestl4");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
		this.tail8 = this.tail2.getChild("tail8");
		this.tail3 = this.tail8.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.5387F, 0.0263F, 0.2143F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 57).addBox(0.0F, -2.438F, -0.0036F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 63).addBox(0.0F, 0.1062F, -2.8741F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 1.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 59).addBox(-1.0F, -1.0718F, -3.4119F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8F, 0.4F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 50).addBox(-1.0F, -0.0872F, -3.6601F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4F, 4.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 40).mirror().addBox(-2.5F, 0.5F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 40).addBox(0.5F, 0.5F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0311F, -0.9296F, -1.1182F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 87).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0188F, -2.6453F, 1.076F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 72).addBox(3.0F, -0.1662F, -0.1198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.4812F, -3.0161F, 2.3182F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 25).addBox(3.0F, -0.154F, -0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.4812F, -3.0161F, 1.6182F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 87).addBox(3.0F, -0.18F, -0.1163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-3.4812F, -2.9411F, 0.9182F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 19).addBox(3.0F, -0.4909F, -4.0701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-3.4812F, -2.4411F, 2.8182F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(35, 63).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0188F, -2.2532F, 2.9917F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 5).addBox(-0.9F, -0.6072F, -2.443F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, 0.4189F, 0.0F, 0.1222F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 56).addBox(-0.9F, -0.2144F, -2.609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, 0.2531F, 0.0F, 0.1222F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 70).addBox(-0.9F, 0.023F, -1.2298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, -0.4363F, 0.0F, 0.1222F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 38).addBox(-0.8703F, 1.698F, 1.8875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0938F, 0.1601F, 1.5058F, 0.1802F, -0.3423F, 0.2925F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(71, 27).addBox(-0.8703F, -0.6539F, 1.3849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0938F, 0.1601F, 1.5058F, -0.6489F, -0.3423F, 0.2925F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0079F, -0.6232F, -0.7447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2938F, -0.3399F, 1.2058F, -0.8814F, 0.0F, 0.1222F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 89).addBox(-0.2177F, 0.1346F, 0.362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6539F, 2.925F, -3.7174F, -0.8814F, 0.0F, 0.2443F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 75).addBox(-0.2177F, 0.8695F, -1.3142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-1.6539F, 2.925F, -3.7174F, 0.384F, 0.0F, 0.2443F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 47).addBox(-0.2177F, -0.6489F, -1.766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.6539F, 2.925F, -3.7174F, 1.4748F, 0.0F, 0.2443F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 92).addBox(-0.846F, -1.9603F, -3.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0938F, -0.0399F, -1.6942F, 1.3701F, 0.0F, 0.3491F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 75).addBox(-0.846F, -1.001F, -3.5307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0938F, -0.0399F, -1.6942F, 1.0734F, 0.0F, 0.3491F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 12).addBox(-0.846F, -0.8491F, -1.8974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0938F, -0.0399F, -1.6942F, 0.9861F, 0.0F, 0.3491F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(87, 6).addBox(-0.9F, -1.9014F, -3.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, 0.9861F, 0.0F, 0.1222F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 78).addBox(-0.9F, -1.7232F, -2.7335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, 0.9163F, 0.0F, 0.1222F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(75, 8).addBox(-0.8703F, -0.4951F, -0.2755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0938F, 0.1601F, 1.5058F, -0.5442F, -0.3423F, 0.2925F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(23, 74).addBox(-1.0079F, 0.0275F, -1.4722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2938F, -0.3399F, 1.2058F, -0.0524F, 0.0F, 0.1222F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(16, 71).addBox(-0.9F, 0.1983F, -1.8753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, 0.3316F, 0.0F, 0.1222F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(70, 60).addBox(-0.9F, 0.8337F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0311F, -0.9296F, -1.1182F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(85, 87).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.6453F, 1.076F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-4.0F, -0.1662F, -0.1198F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.4812F, -3.0161F, 2.3182F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(88, 25).mirror().addBox(-4.0F, -0.154F, -0.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(3.4812F, -3.0161F, 1.6182F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-4.0F, -0.18F, -0.1163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(3.4812F, -2.9411F, 0.9182F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 19).mirror().addBox(-4.0F, -0.4909F, -4.0701F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(3.4812F, -2.4411F, 2.8182F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -2.2532F, 2.9917F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(-0.1F, -0.6072F, -2.443F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, 0.4189F, 0.0F, -0.1222F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(56, 56).mirror().addBox(-0.1F, -0.2144F, -2.609F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, 0.2531F, 0.0F, -0.1222F));

		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(41, 70).mirror().addBox(-0.1F, 0.023F, -1.2298F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, -0.4363F, 0.0F, -0.1222F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(85, 38).mirror().addBox(-0.1297F, 1.698F, 1.8875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, 0.1601F, 1.5058F, 0.1802F, 0.3423F, -0.2925F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 27).mirror().addBox(-0.1297F, -0.6539F, 1.3849F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, 0.1601F, 1.5058F, -0.6489F, 0.3423F, -0.2925F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(0.0079F, -0.6232F, -0.7447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.2938F, -0.3399F, 1.2058F, -0.8814F, 0.0F, -0.1222F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.7822F, 0.1346F, 0.362F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.6539F, 2.925F, -3.7174F, -0.8814F, 0.0F, -0.2443F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 75).mirror().addBox(-0.7822F, 0.8695F, -1.3142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(1.6539F, 2.925F, -3.7174F, 0.384F, 0.0F, -0.2443F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-0.7822F, -0.6489F, -1.766F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.6539F, 2.925F, -3.7174F, 1.4748F, 0.0F, -0.2443F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 92).mirror().addBox(-0.154F, -1.9603F, -3.8366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, -0.0399F, -1.6942F, 1.3701F, 0.0F, -0.3491F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(39, 75).mirror().addBox(-0.154F, -1.001F, -3.5307F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, -0.0399F, -1.6942F, 1.0734F, 0.0F, -0.3491F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 12).mirror().addBox(-0.154F, -0.8491F, -1.8974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, -0.0399F, -1.6942F, 0.9861F, 0.0F, -0.3491F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.1F, -1.9014F, -3.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, 0.9861F, 0.0F, -0.1222F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 78).mirror().addBox(-0.1F, -1.7232F, -2.7335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, 0.9163F, 0.0F, -0.1222F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-0.1297F, -0.4951F, -0.2755F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0938F, 0.1601F, 1.5058F, -0.5442F, 0.3423F, -0.2925F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(23, 74).mirror().addBox(0.0079F, 0.0275F, -1.4722F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.2938F, -0.3399F, 1.2058F, -0.0524F, 0.0F, -0.1222F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(16, 71).mirror().addBox(-0.1F, 0.1983F, -1.8753F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, 0.3316F, 0.0F, -0.1222F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-0.1F, 0.8337F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3938F, -2.0399F, 0.9058F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -2.3232F, -1.0535F, -0.0593F, -0.0574F, -0.1177F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(80, 0).addBox(0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3639F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(86, 56).addBox(0.5F, -1.0032F, -0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.7754F, -0.5097F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(52, 86).addBox(0.5F, -0.9031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.6534F, -0.2882F, 0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(5, 83).addBox(0.5F, -1.9032F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.5371F, -0.0402F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(27, 66).addBox(0.5F, -0.0686F, -1.0385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(30, 86).addBox(0.0F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 8.5299F, 0.2094F, -0.4014F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg2.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(25, 86).addBox(0.0F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9605F, 0.744F, 0.1222F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(86, 50).addBox(0.0F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.9605F, 0.744F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 8.5325F, 1.4718F, 1.0688F, -0.0632F, 0.0943F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(55, 72).addBox(-0.2F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4535F, 2.5773F, 0.804F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(65, 77).addBox(-1.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4535F, 6.1385F, 0.0506F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(10, 86).addBox(-0.9F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 0.0786F, -0.0092F, -1.5708F, 1.0297F, -1.5708F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(88, 22).addBox(-0.375F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-2.1465F, 0.4899F, -0.1802F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(0, 82).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-2.1465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(35, 87).addBox(-0.9821F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(15, 87).addBox(-0.9821F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 0.9402F, -0.6918F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition leg4_r3 = leg2.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(78, 24).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-2.1465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg4_r4 = leg2.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(92, 90).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(87, 9).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-2.1465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(17, 10).addBox(-2.0487F, -0.4749F, -3.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 7.0264F, -0.3761F, -0.0476F, 0.0429F, -0.0077F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(51, 14).addBox(-1.9987F, -0.4978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.3873F, -0.1745F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -2.3232F, -1.0535F, -0.5929F, -0.0402F, -0.0271F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(82, 12).addBox(-1.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.3639F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg3.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(80, 86).addBox(-1.5F, -1.0032F, -0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.7754F, -0.5097F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg6_r2 = upperleg3.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(75, 86).addBox(-1.5F, -0.9031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.6534F, -0.2882F, 0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(83, 24).addBox(-1.5F, -1.9032F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.5371F, -0.0402F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg3.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(67, 52).addBox(-1.5F, -0.0686F, -1.0385F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg3.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(47, 86).addBox(-1.0F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 8.5299F, 0.2094F, -0.4014F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg3.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(42, 86).addBox(-1.0F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.9605F, 0.744F, 0.1222F, 0.0F, 0.0F));

		PartDefinition upperleg3_r3 = upperleg3.addOrReplaceChild("upperleg3_r3", CubeListBuilder.create().texOffs(62, 86).addBox(-1.0F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 7.9605F, 0.744F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 8.5325F, 1.4718F, 0.8328F, 0.0252F, -0.0356F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(0, 76).addBox(-0.8F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4535F, 2.5773F, 0.804F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition leg4_r5 = leg3.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(78, 34).addBox(0.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4535F, 6.1385F, 0.0506F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition leg5_r4 = leg3.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(20, 86).addBox(-0.1F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 0.0786F, -0.0092F, -1.5708F, -1.0297F, 1.5708F));

		PartDefinition leg4_r6 = leg3.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(88, 65).addBox(-0.625F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.1465F, 0.4899F, -0.1802F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition leg6_r1 = leg3.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(10, 82).addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.1465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg6_r2 = leg3.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(87, 59).addBox(-0.0179F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(57, 87).addBox(-0.0179F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 0.9402F, -0.6918F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition leg5_r5 = leg3.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(78, 29).addBox(-0.9F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.1465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg5_r6 = leg3.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(93, 21).addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r7 = leg3.addOrReplaceChild("leg4_r7", CubeListBuilder.create().texOffs(87, 12).addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.1465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(17, 17).addBox(-1.9513F, -0.4749F, -3.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 7.0264F, -0.3761F, -0.0901F, 0.0229F, 0.0842F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(13, 54).addBox(-2.0013F, -0.4978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0229F, -3.3873F, -0.3491F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(51, 7).addBox(-0.5F, -0.5001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(29, 46).addBox(-1.0F, -3.1265F, -5.0646F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.7F, -3.0F, -0.0352F, 0.1308F, -0.0046F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5001F, -1.0122F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(53, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5001F, -3.0122F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(50, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4001F, -5.0122F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(77, 81).mirror().addBox(-1.6403F, 0.3469F, -0.5511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -0.5122F, 0.2585F, 0.2375F, -0.7463F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 79).mirror().addBox(-1.6143F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -2.5122F, 0.276F, 0.231F, -0.6743F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(71, 39).mirror().addBox(-3.6259F, -0.2529F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -2.5122F, 0.1805F, 0.3109F, -1.0272F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 51).mirror().addBox(-1.6132F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -4.5122F, 0.3255F, 0.2689F, -0.662F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 8).mirror().addBox(-3.6244F, -0.2537F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -4.5122F, 0.2143F, 0.363F, -1.016F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(93, 48).mirror().addBox(-4.0977F, -1.8986F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -4.5122F, 0.0136F, 0.4189F, -1.5326F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(77, 81).addBox(-0.3597F, 0.3469F, -0.5511F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -0.5122F, 0.2585F, -0.2375F, 0.7463F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(70, 79).addBox(-0.3857F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -2.5122F, 0.276F, -0.231F, 0.6743F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(71, 39).addBox(1.6259F, -0.2529F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -2.5122F, 0.1805F, -0.3109F, 1.0272F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(79, 51).addBox(-0.3868F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -4.5122F, 0.3255F, -0.2689F, 0.662F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(28, 8).addBox(1.6244F, -0.2537F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -4.5122F, 0.2143F, -0.363F, 1.016F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(93, 48).addBox(3.0977F, -1.8986F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -4.5122F, 0.0136F, -0.4189F, 1.5326F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -2.0F, -2.9F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.8584F, -2.401F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(15, 47).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(53, 94).addBox(0.0F, -2.4F, -4.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, 0.051F, 0.0872F, -0.0032F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(72, 4).addBox(-1.0F, -0.0392F, -0.0427F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.9F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, -1.525F, -10.375F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, 5.5F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 87).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.286F, 0.3549F, -0.9918F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.3878F, 0.2383F, -0.6473F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(42, 80).mirror().addBox(-5.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.0823F, 0.4449F, -1.5047F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(26, 80).mirror().addBox(-4.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -3.6F, 0.1079F, 0.4851F, -1.4615F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(80, 6).mirror().addBox(-3.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -3.6F, 0.3286F, 0.3786F, -0.9448F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(80, 4).mirror().addBox(-1.3105F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, -3.6F, 0.4345F, 0.2473F, -0.6044F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(70, 81).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.286F, -0.3549F, 0.9918F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(79, 57).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.3878F, -0.2383F, 0.6473F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 80).addBox(3.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.0823F, -0.4449F, 1.5047F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(26, 80).addBox(2.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -3.6F, 0.1079F, -0.4851F, 1.4615F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(80, 6).addBox(1.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -3.6F, 0.3286F, -0.3786F, 0.9448F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 4).addBox(-0.6895F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, -3.6F, 0.4345F, -0.2473F, 0.6044F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(15, 40).addBox(-1.5F, -1.8F, -3.9F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1572F, -4.9912F, -0.0915F, -0.0169F, -0.0085F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(46, 21).addBox(-0.9942F, -0.6739F, 2.5001F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, -0.9767F, -7.4223F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(60, 67).addBox(-0.9942F, -0.9961F, -2.0522F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0058F, 7.0603F, 0.689F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(28, 53).addBox(-0.4941F, 0.1395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 94).addBox(0.0F, -1.9413F, -0.0449F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(75, 89).addBox(0.5F, -2.3328F, -0.037F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5059F, 0.758F, -5.0253F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(89, 68).addBox(0.0F, -2.3505F, 0.0138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(32, 68).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2089F, -4.8062F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 62).addBox(-2.1157F, 0.4311F, -3.88F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6157F, 5.6515F, -0.7084F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(94, 62).mirror().addBox(-0.9709F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4941F, 1.2233F, -4.5223F, 0.5938F, 0.4209F, -0.5741F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.8F, -0.1F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4299F, 6.5254F, -1.6939F, 0.3939F, -0.3909F, -0.2822F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(60, 31).mirror().addBox(-0.7255F, 0.0642F, -0.5077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4933F, 6.0836F, -1.6435F, 0.4092F, -0.5605F, -0.3796F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(66, 15).mirror().addBox(-0.9F, -0.3F, -0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5912F, 6.4553F, -1.6202F, 0.6049F, -0.7093F, -0.1397F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 63).mirror().addBox(-2.9388F, -0.2595F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4941F, 1.2233F, -4.5223F, 0.4225F, 0.5927F, -0.9229F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(-5.4869F, -1.5872F, -0.4759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4941F, 1.2233F, -4.5223F, 0.0578F, 0.7109F, -1.5122F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(69, 45).mirror().addBox(-5.6221F, -1.9295F, -0.3348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.9233F, -0.5223F, 0.1481F, 0.5484F, -1.4627F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-3.2167F, -0.5008F, -0.3348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.9233F, -0.5223F, 0.3956F, 0.4162F, -0.9398F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 79).mirror().addBox(-1.3146F, -0.0544F, -0.3348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.9233F, -0.5223F, 0.5076F, 0.2624F, -0.6069F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-3.7049F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.6233F, -2.5223F, 0.4618F, 0.4782F, -0.9997F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 19).mirror().addBox(-6.1784F, -1.9179F, -0.6508F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.6233F, -2.5223F, 0.1724F, 0.6321F, -1.5376F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-1.6819F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9941F, 0.6233F, -2.5223F, 0.5873F, 0.3017F, -0.6732F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 36).addBox(-0.2F, -0.1F, -0.4F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4299F, 6.5254F, -1.6939F, 0.3939F, 0.3909F, 0.2822F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 31).addBox(-0.2745F, 0.0642F, -0.5077F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4933F, 6.0836F, -1.6435F, 0.4092F, 0.5605F, 0.3796F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(66, 15).addBox(-0.1F, -0.3F, -0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5912F, 6.4553F, -1.6202F, 0.6049F, 0.7093F, 0.1397F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(82, 63).addBox(0.9388F, -0.2595F, -0.4759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.2233F, -4.5223F, 0.4225F, -0.5927F, 0.9229F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(94, 62).addBox(-0.0291F, 0.0772F, -0.4759F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.2233F, -4.5223F, 0.5938F, -0.4209F, 0.5741F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(19, 8).addBox(2.4869F, -1.5872F, -0.4759F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.2233F, -4.5223F, 0.0578F, -0.7109F, 1.5122F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(69, 45).addBox(2.6221F, -1.9295F, -0.3348F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.9233F, -0.5223F, 0.1481F, -0.5484F, 1.4627F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 28).addBox(1.2167F, -0.5008F, -0.3348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.9233F, -0.5223F, 0.3956F, -0.4162F, 0.9398F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(77, 79).addBox(-0.6854F, -0.0544F, -0.3348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.9233F, -0.5223F, 0.5076F, -0.2624F, 0.6069F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(15, 82).addBox(1.7049F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.4618F, -0.4782F, 0.9997F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(51, 19).addBox(3.1784F, -1.9179F, -0.6508F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.1724F, -0.6321F, 1.5376F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(70, 65).addBox(-0.3181F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.5873F, -0.3017F, 0.6732F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2894F, 3.7489F, -5.5662F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(9, 70).addBox(-0.4985F, -1.8432F, -1.0237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9594F, 1.334F, 0.4924F, 1.2407F, 0.3453F, 0.911F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 66).addBox(-0.4985F, -0.5137F, -0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9594F, 1.334F, 0.4924F, 1.5461F, 0.3453F, 0.911F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 53).addBox(-0.4985F, -0.3564F, -0.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9594F, 1.334F, 0.4924F, 1.197F, 0.3453F, 0.911F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(78, 16).addBox(-0.6252F, 0.069F, 1.4968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.4202F, 0.0843F, -0.1262F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(5, 87).addBox(-0.6252F, 2.5359F, 1.9107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 2.2754F, 0.0843F, -0.1262F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(87, 3).addBox(-0.6252F, 1.227F, 3.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.6645F, 0.0843F, -0.1262F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(32, 72).addBox(-0.6252F, -1.2637F, 2.7925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.9402F, 0.0843F, -0.1262F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(71, 35).addBox(-0.6013F, -0.5282F, -0.0211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.0546F, 0.1243F, -0.1531F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(85, 19).addBox(-0.5759F, -0.2392F, -0.387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.7692F, 0.0843F, -0.1262F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5759F, -0.9759F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.2857F, 0.0843F, -0.1262F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2894F, 3.7489F, -5.5662F));

		PartDefinition cube_r128 = bone4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-0.5015F, -1.8432F, -1.0237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 1.334F, 0.4924F, 1.2407F, -0.3453F, -0.911F));

		PartDefinition cube_r129 = bone4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.5015F, -0.5137F, -0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 1.334F, 0.4924F, 1.5461F, -0.3453F, -0.911F));

		PartDefinition cube_r130 = bone4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(-0.5015F, -0.3564F, -0.0735F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 1.334F, 0.4924F, 1.197F, -0.3453F, -0.911F));

		PartDefinition cube_r131 = bone4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(78, 16).mirror().addBox(-0.3748F, 0.069F, 1.4968F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.4202F, -0.0843F, 0.1262F));

		PartDefinition cube_r132 = bone4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.3748F, 2.5359F, 1.9107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 2.2754F, -0.0843F, 0.1262F));

		PartDefinition cube_r133 = bone4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-0.3748F, 1.227F, 3.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.6645F, -0.0843F, 0.1262F));

		PartDefinition cube_r134 = bone4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(-0.3748F, -1.2637F, 2.7925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.9402F, -0.0843F, 0.1262F));

		PartDefinition cube_r135 = bone4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-0.3987F, -0.5282F, -0.0211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.0546F, -0.1243F, 0.1531F));

		PartDefinition cube_r136 = bone4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-0.4241F, -0.2392F, -0.387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.7692F, -0.0843F, 0.1262F));

		PartDefinition cube_r137 = bone4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.4241F, -0.9759F, -0.4669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.2857F, -0.0843F, 0.1262F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create().texOffs(93, 24).addBox(-0.027F, -0.2648F, -0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.9786F, 5.1786F, -4.902F, 0.9873F, 0.209F, -0.1198F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(93, 27).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.473F, 2.7352F, 0.3069F, -0.1012F, -0.0234F, -0.0062F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(83, 30).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.473F, 0.6351F, 0.3069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(89, 53).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.473F, 0.2352F, 0.3069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(60, 71).addBox(-0.5F, -0.35F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 77).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.3638F, 4.0497F, 0.482F, -1.1046F, 0.0653F, 0.1135F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(52, 62).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4889F, 3.7879F, 0.3F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create().texOffs(93, 30).addBox(-0.973F, -0.2648F, -0.1931F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-1.9786F, 5.1786F, -4.902F, 0.4312F, -0.0994F, 0.0474F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5F, -0.1796F, -0.2077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.473F, 2.7352F, 0.3069F, -0.1012F, 0.0234F, 0.0062F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(83, 34).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.473F, 0.6351F, 0.3069F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(56, 90).addBox(-0.5F, -0.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.473F, 0.2352F, 0.3069F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(65, 71).addBox(-0.5F, -0.35F, 0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 60).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-0.3638F, 4.0497F, 0.482F, -0.8428F, -0.0653F, -0.1135F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(61, 62).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4889F, 3.7879F, 0.3F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.3913F, 0.3699F, -0.1319F));

		PartDefinition cube_r138 = neck3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(60, 41).mirror().addBox(-0.001F, -0.6025F, -0.1773F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4881F, 0.3019F, -1.9026F, -0.5711F, -0.3233F, 0.0746F));

		PartDefinition cube_r139 = neck3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(60, 41).addBox(0.001F, -0.6025F, -0.1773F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3019F, -1.9026F, -0.5711F, 0.3233F, -0.0746F));

		PartDefinition cube_r140 = neck3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(89, 73).addBox(0.5F, -2.5805F, -0.1119F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6131F, -2.1009F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r141 = neck3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(29, 89).addBox(-0.9942F, -0.0712F, 0.5663F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3655F, -1.7305F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r142 = neck3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(71, 56).addBox(-0.9942F, -0.2445F, -1.2077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3655F, -1.7305F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r143 = neck3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(67, 47).addBox(0.0059F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(8, 65).addBox(-0.9942F, -3.9883F, -3.162F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.1219F, 0.1347F, -0.0019F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(78, 89).addBox(0.5F, -3.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 67).addBox(0.0059F, -0.1F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(84, 90).addBox(0.5F, -2.6401F, -0.2996F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -2.6738F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(-0.1081F, -1.6991F, -0.4714F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4881F, 1.2144F, -2.7755F, -0.3093F, -0.3233F, 0.0746F));

		PartDefinition cube_r147 = neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(27, 82).mirror().addBox(0.0052F, -0.6806F, -0.0845F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4881F, 0.1144F, -0.9755F, -0.3966F, -0.3233F, 0.0746F));

		PartDefinition cube_r148 = neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(27, 82).addBox(-0.0052F, -0.6806F, -0.0845F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1144F, -0.9755F, -0.3966F, 0.3233F, -0.0746F));

		PartDefinition cube_r149 = neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(22, 82).addBox(0.1081F, -1.6991F, -0.4714F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2144F, -2.7755F, -0.3093F, 0.3233F, -0.0746F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0994F, -2.9738F, -0.07F, 0.0901F, 0.0374F));

		PartDefinition cube_r150 = neck.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(14, 76).addBox(0.5F, -2.0F, 0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-0.1125F, -1.7784F, -0.4059F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4881F, 1.315F, -1.8017F, -0.172F, -0.2389F, 0.0518F));

		PartDefinition cube_r152 = neck.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(32, 82).addBox(0.1125F, -1.7784F, -0.4059F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.315F, -1.8017F, -0.172F, 0.2389F, -0.0518F));

		PartDefinition cube_r153 = neck.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(65, 10).addBox(-0.9941F, -0.0164F, -2.9441F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -3.8372F, -1.5415F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r154 = neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(24, 49).addBox(-2.0942F, -1.0474F, -1.0375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -3.0394F, -0.2712F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r155 = neck.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 57).addBox(0.0059F, -0.5F, -0.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1239F, -3.0873F, 0.0869F, -0.0076F, 0.0869F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(65, 90).addBox(-1.0F, -0.5355F, -1.5463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5F, -0.2907F, -7.4959F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(36, 21).addBox(-1.4923F, -0.0096F, -0.0243F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0018F, 1.8947F, -3.0029F, 1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 45).addBox(-1.0F, -0.1009F, -0.1037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.5082F, 1.6652F, -7.7694F, 1.8412F, 0.0049F, -0.0092F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 65).addBox(-1.0F, -0.1009F, -0.1037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5094F, 1.5316F, -7.2876F, 1.2303F, 0.0049F, -0.0092F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 42).addBox(-1.0F, -0.1009F, -0.9037F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 1.0221F, -8.2452F, 2.2077F, 0.0049F, -0.0092F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(37, 83).addBox(-1.0F, -0.0997F, -0.8985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.2907F, -7.4959F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(82, 59).addBox(-0.4941F, -0.201F, -3.0241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3301F, -4.6516F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(52, 82).addBox(-0.4941F, -0.0576F, -2.0326F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.3301F, -4.6516F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(57, 83).addBox(-0.4941F, -0.0266F, -1.0317F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3301F, -4.6516F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 25).addBox(-1.4941F, -0.0405F, -2.0136F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8318F, -1.7176F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(70, 75).addBox(-0.9941F, -0.1915F, -3.0143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.8318F, -1.7176F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(47, 28).addBox(-1.4941F, -0.5F, -0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.5934F, -1.5505F, 1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(60, 36).addBox(-1.9941F, -0.0974F, -0.0135F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.7062F, -1.3285F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, -0.1F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.203F, -0.4041F, 1.0385F, 0.0F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(88, 30).addBox(-2.0F, -0.7509F, -1.3252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5F, -1.8579F, 0.2926F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(24, 60).addBox(-2.9941F, 0.0491F, -2.0252F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, -1.8579F, 0.2926F, -0.0349F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2549F, -0.5969F, -6.7907F, 0.5009F, 0.5964F, 0.0524F));

		PartDefinition cube_r172 = crestl.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 31).addBox(-0.425F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2329F, 0.4703F, 0.6164F, -0.0179F, -0.3054F, 0.0016F));

		PartDefinition cube_r173 = crestl.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(69, 41).addBox(-1.8F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.222F, 0.2314F, 2.0515F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition cube_r174 = crestl.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 47).addBox(-1.5F, -0.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0803F, 0.1826F, 1.3048F, -0.0698F, -0.2182F, 0.0F));

		PartDefinition crestl2 = crestl.addOrReplaceChild("crestl2", CubeListBuilder.create().texOffs(69, 67).addBox(-1.4605F, -0.2281F, -0.301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4758F, 0.541F, 3.3676F, -0.3681F, -0.5263F, -0.0234F));

		PartDefinition cube_r175 = crestl2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(30, 76).addBox(-1.128F, -0.1017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5423F, -0.251F, 1.7687F, -0.0356F, -0.5238F, -0.013F));

		PartDefinition cube_r176 = crestl2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 39).addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.4605F, 0.2719F, 1.274F, 0.2618F, 0.0F, 0.0F));

		PartDefinition crestl3 = head.addOrReplaceChild("crestl3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2668F, -0.5969F, -6.7907F, 0.5009F, -0.5964F, -0.0524F));

		PartDefinition cube_r177 = crestl3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(71, 31).mirror().addBox(-0.575F, -0.5F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2329F, 0.4703F, 0.6164F, -0.0179F, 0.3054F, -0.0016F));

		PartDefinition cube_r178 = crestl3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-0.2F, -0.2F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.222F, 0.2314F, 2.0515F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition cube_r179 = crestl3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-0.5F, -0.2F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0803F, 0.1826F, 1.3048F, -0.0698F, 0.2182F, 0.0F));

		PartDefinition crestl4 = crestl3.addOrReplaceChild("crestl4", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-0.5395F, -0.2281F, -0.301F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4758F, 0.541F, 3.3676F, -0.3681F, 0.5263F, 0.0234F));

		PartDefinition cube_r180 = crestl4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(0.128F, -0.1017F, -0.3172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5423F, -0.251F, 1.7687F, -0.0356F, 0.5238F, 0.013F));

		PartDefinition cube_r181 = crestl4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.4605F, 0.2719F, 1.274F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.0277F, 2.9692F, -7.6683F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(82, 8).addBox(-0.5F, -2.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1223F, -1.0271F, 8.9319F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.1223F, -1.0271F, 8.9319F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 52).addBox(-0.975F, -0.95F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4723F, -1.6753F, 4.6715F, 1.4481F, 0.2132F, -0.0463F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(25, 89).addBox(0.0F, -2.0974F, 1.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4723F, -0.6192F, 9.8683F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(92, 93).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8723F, -1.0715F, 4.5206F, 1.7568F, 0.1716F, 0.0321F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(45, 89).addBox(-0.5F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9723F, -3.2419F, 8.3314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(20, 89).addBox(-0.5F, -1.4F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9723F, -2.7812F, 8.1371F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5F, -3.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9723F, -2.4089F, 9.6258F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.1326F, -1.9973F, 6.005F, -1.8063F, 0.0032F, 0.015F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(34, 93).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1423F, -2.7663F, 5.4383F, -1.6841F, 0.0032F, 0.015F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(88, 47).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2423F, -3.0229F, 6.231F, -1.1169F, 0.0022F, 0.0135F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(88, 44).addBox(-0.5F, -0.7F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2423F, -1.8416F, 6.7061F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(88, 41).addBox(-0.5F, -0.3F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(88, 33).addBox(-0.6F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2423F, -3.063F, 6.3774F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 93).addBox(-0.4F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1923F, -3.6803F, 6.2455F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(93, 39).addBox(-0.665F, -0.8536F, -0.1678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.3073F, -2.7464F, 5.4461F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(90, 84).addBox(-0.665F, -0.1536F, -0.1428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.3073F, -3.6962F, 4.3164F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, 0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(91, 56).addBox(-0.5F, 0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(87, 90).addBox(-0.5F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.1423F, -3.6693F, 5.5518F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(92, 6).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1326F, -2.2723F, 4.805F, -2.0332F, 0.0032F, 0.015F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(92, 3).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.1423F, -3.0413F, 4.2383F, -1.6841F, 0.0032F, 0.015F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(8, 92).addBox(-0.375F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 81).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2173F, -3.818F, 4.9776F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(91, 50).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(90, 87).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1423F, -3.9553F, 5.0455F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 71).addBox(-0.5F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.1423F, -3.9765F, 4.8857F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(18, 92).addBox(-0.5F, -0.2139F, -0.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0919F, -2.4856F, 0.3518F, -1.6887F, -0.0347F, 0.0568F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(92, 9).addBox(-0.5F, -0.3532F, -0.5729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0919F, -2.4856F, 0.3518F, -1.0778F, -0.0347F, 0.0568F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(92, 12).addBox(-0.5F, -0.9184F, -0.576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1669F, -2.4856F, 0.3518F, -1.1956F, 0.1509F, 0.1239F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(83, 65).addBox(-0.5F, -0.2678F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9242F, -2.3471F, 3.5955F, -1.4344F, 0.2159F, 0.0371F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(70, 83).addBox(-0.5F, -0.2178F, -0.2119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.9076F, -3.0591F, 3.458F, -1.3317F, 0.2181F, 0.0195F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.7759F, -0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8173F, -2.6164F, 3.0895F, -0.4503F, 0.2181F, 0.0195F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(37, 79).addBox(-1.0F, -0.0021F, -1.0118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3723F, -4.4192F, 3.9933F, 0.2618F, 0.2269F, 0.0349F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 46).addBox(-1.0F, -0.0608F, -1.9827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3723F, -4.4192F, 3.9933F, 0.3142F, 0.2269F, 0.0349F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(42, 82).addBox(-1.0F, -0.2356F, -2.9704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3723F, -4.4192F, 3.9933F, 0.4014F, 0.2269F, 0.0349F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(47, 82).addBox(-1.0F, -0.4441F, -3.9472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3723F, -4.4192F, 3.9933F, 0.4712F, 0.2269F, 0.0349F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(85, 16).addBox(-1.0619F, -3.6173F, -1.408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.0346F, 0.2515F, -0.0262F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(85, 0).addBox(-1.0619F, -3.0446F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.34F, 0.2515F, -0.0262F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(78, 42).addBox(-1.0619F, -2.1216F, 0.0759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.6367F, 0.2515F, -0.0262F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0619F, -0.7119F, 0.0182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.5495F, 0.2515F, -0.0262F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(84, 53).addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0337F, -1.3821F, 0.143F, 1.8857F, 0.1216F, 0.0118F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(71, 23).addBox(-0.9255F, -3.343F, -1.1361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.582F, 0.27F, 0.0121F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(70, 71).addBox(-0.9255F, -2.4265F, -0.5891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.8962F, 0.27F, 0.0121F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 84).addBox(-1.098F, -1.4874F, -0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.8949F, 0.1652F, 0.0118F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(56, 93).addBox(-0.998F, -0.6322F, -0.6784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3473F, -1.1432F, 3.7215F, 1.6506F, 0.1652F, 0.0118F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.0158F, 2.9692F, -7.6683F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(82, 8).mirror().addBox(-0.5F, -2.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1223F, -1.0271F, 8.9319F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5F, -1.8F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.1223F, -1.0271F, 8.9319F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-0.025F, -0.95F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4723F, -1.6753F, 4.6715F, 1.4481F, -0.2132F, 0.0463F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(25, 89).mirror().addBox(-1.0F, -2.0974F, 1.1365F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4723F, -0.6192F, 9.8683F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(92, 93).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8723F, -1.0715F, 4.5206F, 1.7568F, -0.1716F, -0.0321F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.5F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9723F, -3.2419F, 8.3314F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(20, 89).mirror().addBox(-0.5F, -1.4F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9723F, -2.7812F, 8.1371F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.5F, -3.0F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9723F, -2.4089F, 9.6258F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.1326F, -1.9973F, 6.005F, -1.8063F, -0.0032F, -0.015F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(34, 93).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -2.7663F, 5.4383F, -1.6841F, -0.0032F, -0.015F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2423F, -3.0229F, 6.231F, -1.1169F, -0.0022F, -0.0135F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(-0.5F, -0.7F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2423F, -1.8416F, 6.7061F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-0.5F, -0.3F, 0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(88, 33).mirror().addBox(-0.4F, -0.2F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2423F, -3.063F, 6.3774F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(65, 93).mirror().addBox(-0.6F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.1923F, -3.6803F, 6.2455F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(93, 39).mirror().addBox(-0.335F, -0.8536F, -0.1678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.3073F, -2.7464F, 5.4461F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-0.335F, -0.1536F, -0.1428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.3073F, -3.6962F, 4.3164F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, 0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(91, 56).mirror().addBox(-0.5F, 0.55F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(87, 90).mirror().addBox(-0.5F, -0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -3.6693F, 5.5518F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1326F, -2.2723F, 4.805F, -2.0332F, -0.0032F, -0.015F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -3.0413F, 4.2383F, -1.6841F, -0.0032F, -0.015F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(8, 92).mirror().addBox(-0.625F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 81).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2173F, -3.818F, 4.9776F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(91, 50).mirror().addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(90, 87).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -3.9553F, 5.0455F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(92, 71).mirror().addBox(-0.5F, -0.575F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -3.9765F, 4.8857F, 1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-0.5F, -0.2139F, -0.2394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0919F, -2.4856F, 0.3518F, -1.6887F, 0.0347F, -0.0568F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(-0.5F, -0.3532F, -0.5729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.0919F, -2.4856F, 0.3518F, -1.0778F, 0.0347F, -0.0568F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(92, 12).mirror().addBox(-0.5F, -0.9184F, -0.576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1669F, -2.4856F, 0.3518F, -1.1956F, -0.1509F, -0.1239F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-0.5F, -0.2678F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9242F, -2.3471F, 3.5955F, -1.4344F, -0.2159F, -0.0371F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(70, 83).mirror().addBox(-0.5F, -0.2178F, -0.2119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.9076F, -3.0591F, 3.458F, -1.3317F, -0.2181F, -0.0195F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -0.7759F, -0.0702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8173F, -2.6164F, 3.0895F, -0.4503F, -0.2181F, -0.0195F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(37, 79).mirror().addBox(0.0F, -0.0021F, -1.0118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3723F, -4.4192F, 3.9933F, 0.2618F, -0.2269F, -0.0349F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(0.0F, -0.0608F, -1.9827F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3723F, -4.4192F, 3.9933F, 0.3142F, -0.2269F, -0.0349F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(0.0F, -0.2356F, -2.9704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3723F, -4.4192F, 3.9933F, 0.4014F, -0.2269F, -0.0349F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(47, 82).mirror().addBox(0.0F, -0.4441F, -3.9472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3723F, -4.4192F, 3.9933F, 0.4712F, -0.2269F, -0.0349F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(0.0619F, -3.6173F, -1.408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.0346F, -0.2515F, 0.0262F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(0.0619F, -3.0446F, -0.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.34F, -0.2515F, 0.0262F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(0.0619F, -2.1216F, 0.0759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.6367F, -0.2515F, 0.0262F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(0.0619F, -0.7119F, 0.0182F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.5495F, -0.2515F, 0.0262F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-0.5F, -0.4F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0337F, -1.3821F, 0.143F, 1.8857F, -0.1216F, -0.0118F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-0.0745F, -3.343F, -1.1361F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.582F, -0.27F, -0.0121F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(70, 71).mirror().addBox(-0.0745F, -2.4265F, -0.5891F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.8962F, -0.27F, -0.0121F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(0.098F, -1.4874F, -0.3068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.8949F, -0.1652F, -0.0118F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(56, 93).mirror().addBox(-0.002F, -0.6322F, -0.6784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -1.1432F, 3.7215F, 1.6506F, -0.1652F, -0.0118F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 1.9998F, 0.9737F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(70, 92).addBox(-0.9481F, 0.2205F, -1.9669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.446F, -2.8755F, -6.001F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(84, 78).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7514F, -1.7249F, -3.7716F, -0.3606F, -0.1606F, 0.1111F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-0.4191F, -0.4733F, 0.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5528F, -2.411F, -5.0264F, -0.4915F, -0.1606F, 0.1111F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(53, 78).mirror().addBox(-0.5F, -1.125F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8876F, -3.9637F, -7.5396F, -0.4915F, -0.1606F, 0.1111F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 79).mirror().addBox(-0.5F, -1.125F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(75, 83).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.236F, -2.8444F, -6.1679F, -0.6224F, -0.1606F, 0.1111F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(84, 72).mirror().addBox(-0.4191F, -0.5233F, -0.8586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5528F, -2.411F, -5.0264F, -0.3606F, -0.1606F, 0.1111F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-0.4191F, 0.0268F, -0.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5528F, -2.411F, -5.0264F, -0.0552F, -0.1606F, 0.1111F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(23, 92).mirror().addBox(-0.4191F, -0.0232F, 1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3422F, -2.8755F, -6.001F, -0.4566F, -0.1606F, 0.1111F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.4267F, 0.3673F, -1.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(92, 74).mirror().addBox(-0.4267F, 0.3673F, -1.7102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3422F, -2.8755F, -6.001F, -0.9F, -0.0892F, 0.1313F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(71, 19).mirror().addBox(-0.4267F, 0.1374F, -1.3533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.3422F, -2.8755F, -6.001F, -0.7516F, -0.0892F, 0.1313F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(35, 60).mirror().addBox(-0.4267F, 0.196F, -0.6641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3422F, -2.8755F, -6.001F, -0.5335F, -0.0892F, 0.1313F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(19, 78).mirror().addBox(-0.5F, -0.7F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6146F, -0.965F, -4.5619F, -0.6283F, -0.0873F, 0.0F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.4191F, -0.2196F, -1.6358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7319F, -1.4812F, -4.5643F, -0.5439F, -0.1606F, 0.1111F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(0.0F, -0.4488F, -1.0728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2881F, -0.1F, -2.6F, -0.3665F, -0.0873F, 0.0F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-1.0F, -1.025F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(77, 71).addBox(0.7881F, -1.025F, -2.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.2881F, 1.1691F, -0.9375F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(90, 15).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(90, 15).addBox(1.2881F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.7881F, -0.7004F, -2.107F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(-1.0F, -1.7F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(46, 76).addBox(0.7881F, -1.7F, -1.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2881F, 1.0F, -1.3F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.6989F, -1.4008F, -3.5978F, -0.1834F, -0.0876F, 0.0031F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(35, 90).mirror().addBox(-0.5F, -0.5883F, -0.0774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0081F, -0.3778F, -2.3276F, 2.5918F, -0.0611F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(92, 68).mirror().addBox(-0.5F, -0.386F, 0.2173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(92, 59).mirror().addBox(-0.5F, -0.386F, -0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-2.0081F, -0.3778F, -2.3276F, 2.8711F, -0.0611F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-0.0634F, -0.7528F, -0.7273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.433F, -0.3078F, -2.5323F, -2.1555F, 0.0175F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(90, 36).mirror().addBox(-0.0634F, -1.3672F, -0.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(89, 62).mirror().addBox(-0.0634F, -0.8422F, -0.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.433F, -0.3078F, -2.5323F, -1.9286F, 0.0175F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(48, 94).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(48, 94).addBox(1.2881F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.7881F, 0.0034F, 0.2949F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(94, 53).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 53).addBox(1.2881F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7881F, 0.4772F, 0.1065F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-0.5F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(87, 93).addBox(1.2881F, -0.425F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.7881F, 0.4209F, -0.6685F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(84, 78).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0367F, -1.7249F, -3.7716F, -0.3606F, 0.1606F, -0.1111F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(84, 75).addBox(-0.5809F, -0.4733F, 0.0414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2353F, -2.411F, -5.0264F, -0.4915F, 0.1606F, -0.1111F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(53, 78).addBox(-0.5F, -1.125F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9006F, -3.9637F, -7.5396F, -0.4915F, 0.1606F, -0.1111F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -1.125F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 83).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5522F, -2.8444F, -6.1679F, -0.6224F, 0.1606F, -0.1111F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(84, 72).addBox(-0.5809F, -0.5233F, -0.8586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2353F, -2.411F, -5.0264F, -0.3606F, 0.1606F, -0.1111F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(84, 69).addBox(-0.5809F, 0.0268F, -0.9086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2353F, -2.411F, -5.0264F, -0.0552F, 0.1606F, -0.1111F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(23, 92).addBox(-0.5809F, -0.0232F, 1.1914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.446F, -2.8755F, -6.001F, -0.4566F, 0.1606F, -0.1111F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(80, 83).addBox(-0.5733F, 0.3673F, -1.1852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(92, 74).addBox(-0.5733F, 0.3673F, -1.7102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.446F, -2.8755F, -6.001F, -0.9F, 0.0892F, -0.1313F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(71, 19).addBox(-0.5733F, 0.1374F, -1.3533F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.446F, -2.8755F, -6.001F, -0.7516F, 0.0892F, -0.1313F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(35, 60).addBox(-0.5733F, 0.196F, -0.6641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.446F, -2.8755F, -6.001F, -0.5335F, 0.0892F, -0.1313F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(19, 78).addBox(-0.5F, -0.7F, -0.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1735F, -0.965F, -4.5619F, -0.6283F, 0.0873F, 0.0F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(78, 20).addBox(-0.5809F, -0.2196F, -1.6358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0563F, -1.4812F, -4.5643F, -0.5439F, 0.1606F, -0.1111F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(93, 42).addBox(-1.0F, -0.4488F, -1.0728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -2.6F, -0.3665F, 0.0873F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0892F, -1.4008F, -3.5978F, -0.1834F, 0.0876F, -0.0031F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(35, 90).addBox(-0.5F, -0.5883F, -0.0774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.22F, -0.3778F, -2.3276F, 2.5918F, 0.0611F, 0.0F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(92, 68).addBox(-0.5F, -0.386F, 0.2173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(92, 59).addBox(-0.5F, -0.386F, -0.0827F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.22F, -0.3778F, -2.3276F, 2.8711F, 0.0611F, 0.0F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(90, 18).addBox(-0.9366F, -0.7528F, -0.7273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6449F, -0.3078F, -2.5323F, -2.1555F, -0.0175F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(90, 36).addBox(-0.9366F, -1.3672F, -0.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(89, 62).addBox(-0.9366F, -0.8422F, -0.5769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6449F, -0.3078F, -2.5323F, -1.9286F, -0.0175F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 24).addBox(-0.5F, -0.7531F, -0.0963F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0743F, 4.0076F, 0.0906F, -0.1738F, -0.0157F));

		PartDefinition cube_r307 = tail.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(15, 90).addBox(0.0F, -2.2527F, 0.0304F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6531F, 3.9037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r308 = tail.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(31, 92).addBox(0.0F, 0.0217F, -0.0783F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1867F, 3.9578F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r309 = tail.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(12, 95).addBox(0.0F, 0.4147F, -0.066F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1867F, -0.5422F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r310 = tail.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(28, 92).addBox(0.0F, -0.0565F, -0.0999F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1867F, 1.7578F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r311 = tail.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6531F, 1.9037F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r312 = tail.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(81, 89).addBox(0.0F, -2.6044F, 0.0292F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6531F, -0.0963F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r313 = tail.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, 0.0996F, -0.0313F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.4531F, 3.2037F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r314 = tail.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(18, 66).addBox(-0.5F, -0.0052F, -0.0331F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.4531F, 0.2037F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r315 = tail.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(45, 38).mirror().addBox(-1.5015F, 0.0F, 0.0349F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2531F, -0.0963F, 0.0F, 0.07F, -0.0023F));

		PartDefinition cube_r316 = tail.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(45, 38).addBox(-0.4985F, 0.0F, 0.0349F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2531F, -0.0963F, 0.0F, -0.07F, 0.0023F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0469F, 5.9037F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r317 = tail7.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 94).addBox(0.0F, -1.2706F, -0.1121F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r318 = tail7.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(94, 77).addBox(0.0F, -1.7581F, 0.0912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r319 = tail7.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(75, 94).addBox(0.0F, -2.0054F, 0.0608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r320 = tail7.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(81, 94).addBox(0.0F, 0.7334F, -0.1787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0603F, 2.7541F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r321 = tail7.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(40, 92).addBox(0.0F, -0.0101F, 0.0372F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1397F, 0.2541F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r322 = tail7.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(43, 50).addBox(-0.5F, -0.0716F, -0.0516F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r323 = tail7.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(45, 32).mirror().addBox(-1.5198F, 0.0F, 6.0203F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3F, -6.0F, 0.0F, 0.0525F, -0.0023F));

		PartDefinition cube_r324 = tail7.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(45, 32).addBox(-0.4802F, 0.0F, 6.0203F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -6.0F, 0.0F, -0.0525F, 0.0023F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 24).addBox(-0.5F, -0.5857F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, 4.9F, -0.0787F, -0.0872F, 0.0031F));

		PartDefinition cube_r325 = tail2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(75, 16).addBox(0.0F, -0.7706F, -0.0527F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5857F, 5.0362F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r326 = tail2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(23, 71).addBox(0.0F, -0.9503F, -0.0086F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4857F, 3.0362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r327 = tail2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(9, 62).addBox(0.0F, -1.2092F, -0.0816F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2857F, 1.1362F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r328 = tail2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(3, 95).addBox(0.0F, -0.0366F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3541F, 4.6903F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r329 = tail2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -0.0261F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4541F, 2.3903F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r330 = tail2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(18, 95).addBox(0.0F, 0.3163F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4541F, -0.0097F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r331 = tail2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(30, 32).addBox(-0.5F, -0.1573F, -0.2136F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7857F, 0.2362F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r332 = tail2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-1.1297F, 0.0143F, 11.9225F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1F, -10.9F, 0.0F, 0.0264F, -0.0029F));

		PartDefinition cube_r333 = tail2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(45, 44).addBox(-0.8703F, 0.0143F, 11.9225F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1F, -10.9F, 0.0F, -0.0264F, 0.0029F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(51, 0).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2143F, 6.0362F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r334 = tail8.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(10, 79).addBox(0.0F, -2.6F, 8.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -5.9F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r335 = tail8.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(21, 95).addBox(0.0F, -0.5889F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r336 = tail8.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(15, 95).addBox(0.0F, -0.2837F, 0.0485F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2397F, 3.0541F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r337 = tail8.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(6, 95).addBox(0.0F, -0.1479F, -0.1812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1397F, 1.0541F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r338 = tail8.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, 0.0497F, 5.3865F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.4F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.6985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 4.9F, -0.0818F, 0.245F, -0.0096F));

		PartDefinition cube_r339 = tail3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(84, 95).addBox(0.0F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6244F, 6.4808F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r340 = tail3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(43, 95).addBox(0.0F, -1.0518F, -0.1486F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 3.9651F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r341 = tail3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(95, 36).addBox(-0.0106F, 0.4259F, -0.2538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 4.9651F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r342 = tail3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(9, 95).addBox(-0.0106F, -0.2093F, -0.0686F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2413F, 2.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r343 = tail3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(95, 15).addBox(-0.0106F, -0.2218F, -0.1654F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2413F, 0.5192F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r344 = tail3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5985F, 0.0651F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r345 = tail3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(62, 83).addBox(0.0F, -1.2F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 95).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3985F, -0.0349F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4026F, 6.9304F, -0.088F, 0.1304F, -0.0115F));

		PartDefinition cube_r346 = tail4.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(95, 0).addBox(-0.0106F, 12.1582F, 32.3956F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9397F, -29.8459F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r347 = tail4.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(95, 81).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0106F, 0.7205F, 3.2088F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r348 = tail4.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(70, 95).addBox(0.0F, -0.7F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0106F, 0.9314F, 1.1003F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r349 = tail4.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(15, 32).addBox(-0.5F, -0.293F, -0.1999F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0209F, 6.0515F, -0.2454F, 0.1741F, -0.0123F));

		PartDefinition cube_r350 = tail5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(36, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.693F, -0.1999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.293F, -0.1999F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(36, 14).addBox(-0.5F, -0.493F, -0.2999F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1584F, 0.1293F, -0.0206F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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