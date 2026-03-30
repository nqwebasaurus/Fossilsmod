package fossils.fossils.client.blockentity.model.kostensuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KostensuchusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
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
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart crestl;
	private final ModelPart crestl2;
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

	public KostensuchusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
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
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone3 = this.chest.getChild("bone3");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.crestl = this.head.getChild("crestl");
		this.crestl2 = this.head.getChild("crestl2");
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -14.3142F, 5.6479F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(5, 95).addBox(0.0F, -2.338F, -0.0036F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 38).addBox(0.0F, 0.0062F, -4.0741F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 1.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -1.4718F, -3.9119F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 0.4F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 51).addBox(-1.0F, -0.4622F, -4.1601F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -2.4F, 4.5F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 7).mirror().addBox(-2.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 7).addBox(0.2F, 0.5F, 0.0F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0596F, 1.419F, 0.6773F, 0.1745F, 0.0F, 0.0436F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, -0.375F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0187F, -2.6069F, 3.166F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 74).addBox(-0.5F, 0.325F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 0).addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0187F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 59).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(0.0187F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(74, 50).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0187F, -2.6653F, -1.9626F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 73).addBox(-0.55F, -0.45F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0187F, -1.747F, 0.9859F, 1.1894F, 0.0457F, 0.1134F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 90).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0187F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 72).addBox(-0.5F, -0.85F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.0187F, -2.2532F, 2.9917F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(22, 58).addBox(-0.5F, -0.825F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.0823F, -1.4447F, 0.3497F, -0.1309F, 0.0F, 0.1222F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 85).addBox(-0.5F, -1.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5668F, 2.5013F, 0.5534F, 0.6021F, 0.0F, 0.1222F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(62, 12).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.5856F, 2.6543F, 1.1295F, -0.576F, 0.0F, 0.1222F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 46).addBox(-0.5F, -1.125F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5668F, 2.5013F, 0.5534F, -0.8378F, 0.0F, 0.1222F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3958F, 1.1083F, 0.1657F, -1.5795F, 0.0F, 0.1222F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 72).addBox(-0.5F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3954F, 1.1049F, -0.2343F, -1.5795F, 0.0F, 0.1222F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.8173F, 3.056F, -6.0194F, 2.1105F, 0.0829F, 0.3407F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 21).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-1.7691F, 3.0935F, -5.3221F, 1.5433F, 0.0829F, 0.3407F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(58, 31).addBox(-0.846F, -0.8491F, -2.8974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-0.7054F, 1.6582F, -3.2063F, 0.6706F, 0.0829F, 0.3407F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 26).addBox(-0.846F, -0.8491F, -2.8974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.7054F, 1.6582F, -3.2063F, 0.5397F, 0.0829F, 0.3407F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(31, 60).addBox(-0.846F, -0.8491F, -2.5974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.0187F, 0.0101F, -1.6192F, 0.8452F, 0.0829F, 0.3407F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(67, 83).addBox(-0.5F, -1.825F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.2951F, 0.2882F, -1.4057F, -0.9338F, 0.0F, 0.1222F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(8, 94).addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.1988F, -0.4964F, -1.7765F, 0.0262F, 0.0F, 0.1222F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(94, 51).addBox(-0.9F, -1.8514F, -3.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.3937F, -2.0399F, 0.9058F, 0.9861F, 0.0F, 0.1222F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 91).addBox(-0.9F, -1.6732F, -2.7335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3937F, -2.0399F, 0.9058F, 0.9163F, 0.0F, 0.1222F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 36).addBox(-1.0079F, -0.1225F, -1.9472F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2938F, -0.3399F, 1.2058F, -0.4014F, 0.0F, 0.1222F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -1.675F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1955F, -0.5228F, 0.3118F, 0.0698F, 0.0F, 0.1222F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 67).addBox(-0.9F, 0.2337F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(0.3937F, -2.0399F, 0.9058F, -0.2618F, 0.0F, 0.1222F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0596F, 1.419F, 0.6773F, 0.1745F, 0.0F, -0.0436F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.5F, -0.375F, -2.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -2.6069F, 3.166F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(-0.5F, 0.325F, 0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(73, 0).mirror().addBox(-0.5F, -0.175F, -0.175F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -3.2594F, -0.4313F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -2.1871F, -1.8165F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -2.6653F, -1.9626F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(-0.45F, -0.45F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -1.747F, 0.9859F, 1.1894F, -0.0457F, -0.1134F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(47, 90).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -1.9946F, 1.8712F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 72).mirror().addBox(-0.5F, -0.85F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, -2.2532F, 2.9917F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(22, 58).mirror().addBox(-0.5F, -0.825F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.0823F, -1.4447F, 0.3497F, -0.1309F, 0.0F, -0.1222F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(92, 85).mirror().addBox(-0.5F, -1.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.5668F, 2.5013F, 0.5534F, 0.6021F, 0.0F, -0.1222F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.5856F, 2.6543F, 1.1295F, -0.576F, 0.0F, -0.1222F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(74, 46).mirror().addBox(-0.5F, -1.125F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.5668F, 2.5013F, 0.5534F, -0.8378F, 0.0F, -0.1222F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3958F, 1.1083F, 0.1657F, -1.5795F, 0.0F, -0.1222F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.5F, -1.3F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3954F, 1.1049F, -0.2343F, -1.5795F, 0.0F, -0.1222F));

		PartDefinition cube_r44 = bone4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.8173F, 3.056F, -6.0194F, 2.1105F, -0.0829F, -0.3407F));

		PartDefinition cube_r45 = bone4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(69, 21).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(1.7691F, 3.0935F, -5.3221F, 1.5433F, -0.0829F, -0.3407F));

		PartDefinition cube_r46 = bone4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(58, 31).mirror().addBox(-0.154F, -0.8491F, -2.8974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(0.7054F, 1.6582F, -3.2063F, 0.6706F, -0.0829F, -0.3407F));

		PartDefinition cube_r47 = bone4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-0.154F, -0.8491F, -2.8974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.7054F, 1.6582F, -3.2063F, 0.5397F, -0.0829F, -0.3407F));

		PartDefinition cube_r48 = bone4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 60).mirror().addBox(-0.154F, -0.8491F, -2.5974F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.0187F, 0.0101F, -1.6192F, 0.8452F, -0.0829F, -0.3407F));

		PartDefinition cube_r49 = bone4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(-0.5F, -1.825F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.2951F, 0.2882F, -1.4057F, -0.9338F, 0.0F, -0.1222F));

		PartDefinition cube_r50 = bone4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(8, 94).mirror().addBox(-0.5F, -0.025F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.1988F, -0.4964F, -1.7765F, 0.0262F, 0.0F, -0.1222F));

		PartDefinition cube_r51 = bone4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(94, 51).mirror().addBox(-0.1F, -1.8514F, -3.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -2.0399F, 0.9058F, 0.9861F, 0.0F, -0.1222F));

		PartDefinition cube_r52 = bone4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-0.1F, -1.6732F, -2.7335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -2.0399F, 0.9058F, 0.9163F, 0.0F, -0.1222F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(0.0079F, -0.1225F, -1.9472F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.2938F, -0.3399F, 1.2058F, -0.4014F, 0.0F, -0.1222F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(68, 54).mirror().addBox(-0.5F, -1.675F, -1.075F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1955F, -0.5228F, 0.3118F, 0.0698F, 0.0F, -0.1222F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-0.1F, 0.2337F, -2.1348F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-0.3937F, -2.0399F, 0.9058F, -0.2618F, 0.0F, -0.1222F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, 0.0295F, 0.5216F, -0.3123F, 0.0F, 0.0F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(62, 83).addBox(0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3638F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(18, 94).addBox(0.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(94, 17).addBox(0.5F, -1.1031F, -0.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5097F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg7_r2 = upperleg2.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(94, 54).addBox(0.5F, -0.8032F, -0.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.7753F, -0.5097F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(83, 77).addBox(0.5F, -1.5031F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.6534F, -0.2882F, 0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg4_r2 = upperleg2.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(81, 46).addBox(0.5F, -1.9032F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.5371F, -0.0402F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(73, 4).addBox(0.5F, -0.0686F, -1.0385F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg4_r3 = upperleg2.addOrReplaceChild("upperleg4_r3", CubeListBuilder.create().texOffs(90, 11).addBox(0.0F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.2298F, 0.8094F, -0.4014F, 0.0F, 0.0F));

		PartDefinition upperleg4_r4 = upperleg2.addOrReplaceChild("upperleg4_r4", CubeListBuilder.create().texOffs(88, 73).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(88, 70).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 7.2268F, 0.8342F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg2_r1 = upperleg2.addOrReplaceChild("upperleg2_r1", CubeListBuilder.create().texOffs(88, 67).addBox(0.0F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.6605F, 1.344F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 6.8893F, 2.1215F, 1.4004F, 0.0F, 0.0F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(14, 70).addBox(-0.2F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4535F, 2.5773F, 0.804F, -1.5708F, 1.5184F, -1.5708F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(14, 76).addBox(-1.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.4535F, 6.1385F, 0.0506F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(88, 64).addBox(-0.9F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 0.0786F, -0.0092F, -1.5708F, 1.0297F, -1.5708F));

		PartDefinition leg3_r2 = leg2.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(42, 88).addBox(-0.375F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-2.1465F, 0.4899F, -0.1802F, 1.5708F, 1.3526F, 1.5708F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(81, 58).addBox(-0.45F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-2.1465F, 2.1365F, 0.1654F, 1.5708F, 1.4399F, 1.5708F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(0, 88).addBox(-0.9821F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(88, 33).addBox(-0.9821F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 0.9402F, -0.6918F, 1.5708F, 1.2828F, 1.5708F));

		PartDefinition leg4_r3 = leg2.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(63, 78).addBox(-0.1F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-2.1465F, 3.7792F, 0.6775F, -1.5708F, 1.4661F, -1.5708F));

		PartDefinition leg4_r4 = leg2.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(93, 64).addBox(-0.1F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.1465F, 3.2811F, 0.6339F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3_r3 = leg2.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(91, 48).addBox(-0.1F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-2.1465F, 2.5837F, 0.5729F, 1.5708F, 1.4835F, 1.5708F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0487F, -0.475F, -3.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.9476F, -0.6656F, -0.0911F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(13, 45).addBox(-2.0487F, -0.9978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -3.3873F, -0.9599F, 0.0F, 0.0F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, 0.0295F, 0.5216F, -0.705F, 0.0F, 0.0F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(83, 66).addBox(-1.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 0.3638F, 0.014F, 0.2269F, 0.0F, 0.0F));

		PartDefinition upperleg8_r1 = upperleg3.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(94, 42).addBox(-1.5F, -1.1031F, 0.097F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(36, 94).addBox(-1.5F, -1.1031F, -0.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5097F, 0.0262F, 0.0F, 0.0F));

		PartDefinition upperleg8_r2 = upperleg3.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(77, 94).addBox(-1.5F, -0.8032F, -0.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.7753F, -0.5097F, -0.4974F, 0.0F, 0.0F));

		PartDefinition upperleg6_r1 = upperleg3.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(0, 84).addBox(-1.5F, -1.5031F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 1.6534F, -0.2882F, 0.3578F, 0.0F, 0.0F));

		PartDefinition upperleg5_r3 = upperleg3.addOrReplaceChild("upperleg5_r3", CubeListBuilder.create().texOffs(81, 50).addBox(-1.5F, -1.9032F, 0.097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 3.5371F, -0.0402F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upperleg4_r5 = upperleg3.addOrReplaceChild("upperleg4_r5", CubeListBuilder.create().texOffs(74, 21).addBox(-1.5F, -0.0686F, -1.0385F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6641F, 1.1007F, 0.0087F, 0.0F, 0.0F));

		PartDefinition upperleg5_r4 = upperleg3.addOrReplaceChild("upperleg5_r4", CubeListBuilder.create().texOffs(90, 26).addBox(-1.0F, -1.0F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.2298F, 0.8094F, -0.4014F, 0.0F, 0.0F));

		PartDefinition upperleg5_r5 = upperleg3.addOrReplaceChild("upperleg5_r5", CubeListBuilder.create().texOffs(89, 55).addBox(-0.5F, -1.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(89, 52).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 7.2268F, 0.8342F, 0.4276F, 0.0F, 0.0F));

		PartDefinition upperleg3_r2 = upperleg3.addOrReplaceChild("upperleg3_r2", CubeListBuilder.create().texOffs(89, 42).addBox(-1.0F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 6.6605F, 1.344F, 0.5585F, 0.0F, 0.0F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 6.8893F, 2.1215F, 0.9193F, 0.0175F, 0.0028F));

		PartDefinition leg5_r3 = leg3.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(19, 72).addBox(-0.8F, -0.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4535F, 2.5773F, 0.804F, -1.5708F, -1.5184F, 1.5708F));

		PartDefinition leg4_r5 = leg3.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(29, 77).addBox(0.2F, -6.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4535F, 6.1385F, 0.0506F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition leg5_r4 = leg3.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(28, 89).addBox(-0.1F, -0.15F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 0.0786F, -0.0092F, -1.5708F, -1.0297F, 1.5708F));

		PartDefinition leg4_r6 = leg3.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(89, 19).addBox(-0.625F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.1465F, 0.4899F, -0.1802F, 1.5708F, -1.3526F, -1.5708F));

		PartDefinition leg6_r1 = leg3.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(81, 62).addBox(-0.55F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.1465F, 2.1365F, 0.1654F, 1.5708F, -1.4399F, -1.5708F));

		PartDefinition leg6_r2 = leg3.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(13, 88).addBox(-0.0179F, -0.6095F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(77, 88).addBox(-0.0179F, 0.1905F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 0.9402F, -0.6918F, 1.5708F, -1.2828F, -1.5708F));

		PartDefinition leg5_r5 = leg3.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(68, 78).addBox(-0.9F, 0.2F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.1465F, 3.7792F, 0.6775F, -1.5708F, -1.4661F, 1.5708F));

		PartDefinition leg5_r6 = leg3.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(93, 67).addBox(-0.9F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.1465F, 3.2811F, 0.6339F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leg4_r7 = leg3.addOrReplaceChild("leg4_r7", CubeListBuilder.create().texOffs(28, 92).addBox(-0.9F, -0.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(2.1465F, 2.5837F, 0.5729F, 1.5708F, -1.4835F, -1.5708F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(0, 7).addBox(-1.9513F, -0.475F, -3.3509F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.9476F, -0.6656F, -0.1609F, 0.0F, 0.0F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(45, 21).addBox(-1.9513F, -0.9978F, -2.9636F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5229F, -3.3873F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(28, 45).addBox(-0.5F, -0.5001F, -5.0122F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3F, -3.0F, -0.0532F, -0.1743F, 0.0092F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(28, 95).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5001F, -2.0122F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(56, 95).addBox(0.0F, -2.25F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4001F, -4.0122F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 56).mirror().addBox(-1.6143F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -1.5122F, 0.27F, 0.105F, -0.71F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-1.6132F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -3.5122F, 0.0254F, 0.0243F, -0.7065F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-2.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2001F, -3.5122F, 0.0156F, 0.0315F, -1.0556F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 56).addBox(-0.3857F, 0.3184F, -0.5374F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -1.5122F, 0.27F, -0.105F, 0.71F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 28).addBox(-0.3868F, 0.3172F, -0.537F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -3.5122F, 0.0254F, -0.0243F, 0.7065F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 10).addBox(1.6244F, -0.2537F, -0.537F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2001F, -3.5122F, 0.0156F, -0.0315F, 1.0556F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(13, 50).addBox(-1.0F, -0.0264F, 0.0477F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.5001F, -4.5122F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0F, -3.0F, -2.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.8584F, -2.4011F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(45, 26).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(95, 94).addBox(0.0F, -2.5203F, -1.1018F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1001F, -4.9122F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(30, 31).addBox(-1.0F, -0.3F, 0.0026F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1756F, -4.5503F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(92, 94).addBox(0.0F, -2.125F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(59, 95).addBox(0.0F, -2.175F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-4.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.6F, 0.072F, 0.1552F, -1.473F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(-3.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.6F, 0.1356F, 0.1045F, -0.9915F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-1.6054F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.6F, 0.1629F, 0.0521F, -0.6453F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.6F, 0.0706F, 0.0132F, -1.0319F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.6F, 0.0708F, -0.0117F, -0.6838F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(79, 24).mirror().addBox(-4.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.6F, 0.0843F, 0.2768F, -1.4703F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-3.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.6F, 0.2038F, 0.2065F, -0.981F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(60, 24).mirror().addBox(-1.3105F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.5F, -4.6F, 0.2612F, 0.1252F, -0.6366F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(81, 73).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.6F, 0.0706F, -0.0132F, 1.0319F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 34).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -0.6F, 0.0708F, 0.0117F, 0.6838F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(15, 83).addBox(-0.3945F, 0.3087F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.6F, 0.1629F, -0.0521F, 0.6453F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(83, 15).addBox(1.6142F, -0.2591F, -0.4993F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.6F, 0.1356F, -0.1045F, 0.9915F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(68, 59).addBox(3.0862F, -1.8986F, -0.4993F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.6F, 0.072F, -0.1552F, 1.473F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(79, 24).addBox(2.6077F, -1.9371F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.6F, 0.0843F, -0.2768F, 1.4703F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(62, 17).addBox(1.2075F, -0.5142F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.6F, 0.2038F, -0.2065F, 0.981F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(60, 24).addBox(-0.6895F, -0.0702F, -0.3596F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, -4.6F, 0.2612F, -0.1252F, 0.6366F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(15, 31).addBox(-1.5F, -1.9F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1222F, -0.3535F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(63, 41).addBox(-0.5F, -0.4F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.1226F, -0.0866F, -0.0107F));

		PartDefinition cube_r86 = body3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 0).addBox(-1.0F, -0.6638F, -1.3584F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -1.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 20).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.1F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(41, 45).addBox(-1.5F, -1.85F, -3.325F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.2918F, 0.2106F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r89 = body3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 9).mirror().addBox(-3.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.1795F, 0.1925F, -1.0207F));

		PartDefinition cube_r90 = body3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(-1.6103F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.2339F, 0.1201F, -0.6749F));

		PartDefinition cube_r91 = body3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-5.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.6F, 0.0693F, 0.2533F, -1.5092F));

		PartDefinition cube_r92 = body3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 9).addBox(1.6195F, -0.2585F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.1795F, -0.1925F, 1.0207F));

		PartDefinition cube_r93 = body3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(83, 7).addBox(-0.3897F, 0.311F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.2339F, -0.1201F, 0.6749F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 82).addBox(3.0912F, -1.9006F, -0.5393F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.6F, 0.0693F, -0.2533F, 1.5092F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0516F, -0.2083F, -2.9595F, -0.0304F, -0.0174F, -0.0073F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(34, 14).addBox(-1.1276F, 0.179F, -4.6615F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.076F, -3.9105F, -0.6177F, 0.0F, 0.0009F, -0.0018F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5457F, 0.1395F, 2.1618F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0059F, 1.0233F, -7.2223F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(43, 91).addBox(0.0F, -2.6413F, -0.0199F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, -0.0767F, -1.1223F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 36).addBox(0.5F, -3.9328F, -0.037F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5059F, 0.758F, -5.0253F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(59, 83).addBox(0.0F, -3.3505F, 0.0138F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0059F, 0.4233F, -3.1223F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(46, 65).addBox(-1.9135F, 0.2834F, -3.468F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9135F, 4.5768F, -2.0814F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(59, 56).addBox(-1.4135F, -0.0967F, -2.0786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9135F, 4.5768F, -2.0814F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6333F, 5.484F, -1.8767F, 0.1793F, -0.442F, -0.1879F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(11, 56).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4599F, 5.1937F, -1.7623F, 0.2164F, -0.7393F, -0.2617F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 46).mirror().addBox(-0.5F, 0.0F, -1.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9193F, 5.1504F, -1.6235F, 0.1394F, -0.7704F, -0.1335F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 26).mirror().addBox(-2.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.4354F, 0.6066F, -0.9157F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 36).mirror().addBox(-0.9709F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.6099F, 0.4303F, -0.5674F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-3.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5973F, 1.1233F, -4.7223F, 0.0592F, 0.7284F, -1.5113F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(-5.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.1298F, 0.3922F, -1.471F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(34, 21).mirror().addBox(-3.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.2992F, 0.2877F, -0.9732F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(22, 83).mirror().addBox(-1.59F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.4233F, -0.5223F, 0.3768F, 0.1709F, -0.6351F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 19).mirror().addBox(-3.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.4306F, 0.4339F, -1.0134F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(81, 75).mirror().addBox(-5.1784F, -1.9179F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.1703F, 0.5797F, -1.5388F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(83, 17).mirror().addBox(-1.6819F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0973F, 0.6233F, -2.5223F, 0.5449F, 0.2688F, -0.6852F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5301F, 5.484F, -1.8767F, 0.1793F, 0.442F, 0.1879F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(11, 56).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3567F, 5.1937F, -1.7623F, 0.2164F, 0.7393F, 0.2617F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(54, 46).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8161F, 5.1504F, -1.6235F, 0.1394F, 0.7704F, 0.1335F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(83, 26).addBox(0.9388F, -0.2595F, -0.4758F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.4354F, -0.6066F, 0.9157F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(58, 36).addBox(-0.0291F, 0.0772F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.6099F, -0.4303F, 0.5674F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(31, 58).addBox(2.4869F, -1.5872F, -0.4758F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4941F, 1.1233F, -4.7223F, 0.0592F, -0.7284F, 1.5113F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 54).addBox(3.0462F, -1.9144F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.1298F, -0.3922F, 1.471F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(34, 21).addBox(1.586F, -0.2915F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.2992F, -0.2877F, 0.9732F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(22, 83).addBox(-0.41F, 0.2686F, -0.599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.4233F, -0.5223F, 0.3768F, -0.1709F, 0.6351F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(49, 19).addBox(1.7048F, -0.2336F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.4306F, -0.4339F, 1.0134F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 75).addBox(3.1784F, -1.9179F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.1703F, -0.5797F, 1.5388F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 17).addBox(-0.3181F, 0.3636F, -0.6508F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9941F, 0.6233F, -2.5223F, 0.5449F, -0.2688F, 0.6852F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(78, 7).addBox(-1.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5484F, 2.2205F, -3.828F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r126 = UpperArmL.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(34, 83).addBox(-0.5F, -1.6042F, -0.3533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(77, 91).addBox(-0.5F, -1.6042F, -0.3533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 1.1115F, -0.4073F, -0.2182F, -0.6109F, 0.0F));

		PartDefinition cube_r127 = UpperArmL.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(13, 85).addBox(-1.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 0.5481F, 1.074F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r128 = UpperArmL.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 93).addBox(-1.5F, -2.05F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.1178F, -0.4447F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r129 = UpperArmL.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(88, 76).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1201F, 2.1895F, -0.8644F, -0.1658F, -0.6109F, 0.0F));

		PartDefinition cube_r130 = UpperArmL.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(86, 61).addBox(-0.5F, -0.0145F, 0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.2F, 1.1115F, -0.4073F, -1.0472F, -0.6109F, 0.0F));

		PartDefinition cube_r131 = UpperArmL.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 74).addBox(-0.4993F, -0.7286F, -1.4318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, 1.1115F, -0.4073F, -1.0958F, -0.607F, 0.0088F));

		PartDefinition cube_r132 = UpperArmL.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(67, 90).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.4069F, -0.407F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r133 = UpperArmL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(62, 90).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.8316F, 0.8849F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r134 = UpperArmL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(19, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create().texOffs(20, 64).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(24, 72).addBox(-2.0F, 2.0F, -1.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0F, 7.5295F, 0.058F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r135 = LowerArmL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.0F, 2.2F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r136 = LowerArmL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(50, 79).addBox(-1.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 2.2F, -1.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(37, 56).addBox(-3.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 6.0514F, -0.4615F, 1.1732F, 0.0019F, -0.0502F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(45, 33).addBox(-3.0F, -0.5F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, -0.096F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(24, 78).addBox(0.0F, -0.0359F, -0.4483F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.6516F, 2.2205F, -3.828F, 0.9536F, -0.1546F, 0.0812F));

		PartDefinition cube_r137 = UpperArmL2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(49, 83).addBox(-0.5F, -1.6042F, -0.3533F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(92, 36).addBox(-0.5F, -1.6042F, -0.3533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.1115F, -0.4073F, -0.2182F, 0.6109F, 0.0F));

		PartDefinition cube_r138 = UpperArmL2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 85).addBox(0.5F, 0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 0.5481F, 1.074F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r139 = UpperArmL2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 94).addBox(0.5F, -2.05F, -1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1178F, -0.4447F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r140 = UpperArmL2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(57, 89).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1201F, 2.1895F, -0.8644F, -0.1658F, 0.6109F, 0.0F));

		PartDefinition cube_r141 = UpperArmL2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(87, 87).addBox(-0.5F, -0.0145F, 0.6528F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2F, 1.1115F, -0.4073F, -1.0472F, 0.6109F, 0.0F));

		PartDefinition cube_r142 = UpperArmL2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5007F, -0.7286F, -1.4318F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 1.1115F, -0.4073F, -1.0958F, 0.607F, -0.0088F));

		PartDefinition cube_r143 = UpperArmL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(90, 79).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.4069F, -0.407F, 2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r144 = UpperArmL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(72, 90).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, 5.8316F, 0.8849F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r145 = UpperArmL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(58, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create().texOffs(25, 64).addBox(1.0F, 0.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(72, 40).addBox(1.0F, 2.0F, -1.85F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-1.0F, 7.5295F, 0.058F, -0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r146 = LowerArmL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(39, 80).addBox(0.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0F, 2.2F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r147 = LowerArmL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(80, 0).addBox(0.0F, -1.8F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 2.2F, -1.0F, 0.2094F, 0.0F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(48, 56).addBox(0.0F, -0.4F, -1.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 6.0514F, -0.4615F, 1.0488F, -0.0403F, -0.0774F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(41, 51).addBox(0.0F, -0.5F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1087F, -1.5985F, -1.1432F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.2893F, 2.9489F, -4.5662F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(67, 24).addBox(-0.4985F, -1.8432F, -1.0237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.9594F, 0.884F, 0.9424F, 1.1456F, 0.4541F, 0.8739F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(10, 81).addBox(-0.4985F, -0.5137F, -0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9594F, 0.884F, 0.9424F, 1.451F, 0.4541F, 0.8739F));

		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(5, 81).addBox(-0.4985F, -0.3564F, -0.0736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9594F, 0.884F, 0.9424F, 1.1019F, 0.4541F, 0.8739F));

		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(69, 17).addBox(-0.4428F, -1.2033F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F))
				.texOffs(74, 32).addBox(-0.4428F, -0.6033F, -2.2763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.1147F, 0.0843F, -0.2571F));

		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 73).addBox(-0.4428F, -1.098F, -2.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.7692F, 0.0843F, -0.2571F));

		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(67, 61).addBox(-0.4653F, -2.0104F, -1.7371F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 0.6173F, 0.0843F, -0.2571F));

		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(86, 58).addBox(-0.4653F, -2.271F, 0.4212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.3155F, 0.0843F, -0.2571F));

		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(91, 58).addBox(-0.4653F, -0.6729F, 1.4199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 2.0136F, 0.0843F, -0.2571F));

		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(75, 54).addBox(-0.4653F, -0.5203F, 0.3858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.6645F, 0.0843F, -0.2571F));

		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 66).addBox(-0.4653F, -0.8897F, -0.7881F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 2.3365F, 0.0843F, -0.2571F));

		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(91, 61).addBox(-0.4653F, 1.0068F, 1.0234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(62, 70).addBox(-0.4653F, 0.1004F, 0.446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.5074F, 0.0843F, -0.2571F));

		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 66).addBox(-0.4653F, -0.0364F, 0.6819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3032F, -2.8602F, 1.5579F, 1.0711F, 0.0843F, -0.2571F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.3925F, 2.9489F, -4.5662F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(67, 24).mirror().addBox(-0.5015F, -1.8432F, -1.0237F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 0.884F, 0.9424F, 1.1456F, -0.4541F, -0.8739F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.5015F, -0.5137F, -0.9594F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 0.884F, 0.9424F, 1.451F, -0.4541F, -0.8739F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5015F, -0.3564F, -0.0736F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.9594F, 0.884F, 0.9424F, 1.1019F, -0.4541F, -0.8739F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-0.5572F, -1.2033F, -2.5763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(74, 32).mirror().addBox(-0.5572F, -0.6033F, -2.2763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.1147F, -0.0843F, 0.2571F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-0.5572F, -1.098F, -2.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.7692F, -0.0843F, 0.2571F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.5347F, -2.0104F, -1.7371F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 0.6173F, -0.0843F, 0.2571F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(86, 58).mirror().addBox(-0.5347F, -2.271F, 0.4212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.3155F, -0.0843F, 0.2571F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(91, 58).mirror().addBox(-0.5347F, -0.6729F, 1.4199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 2.0136F, -0.0843F, 0.2571F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(75, 54).mirror().addBox(-0.5347F, -0.5203F, 0.3858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.6645F, -0.0843F, 0.2571F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(55, 66).mirror().addBox(-0.5347F, -0.8897F, -0.7881F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 2.3365F, -0.0843F, 0.2571F));

		PartDefinition cube_r170 = bone3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-0.5347F, 1.0068F, 1.0234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(62, 70).mirror().addBox(-0.5347F, 0.1004F, 0.446F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.5074F, -0.0843F, 0.2571F));

		PartDefinition cube_r171 = bone3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.5347F, -0.0364F, 0.6819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3032F, -2.8602F, 1.5579F, 1.0711F, -0.0843F, 0.2571F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0059F, 1.558F, -4.8253F, -0.0813F, -0.2464F, 0.0468F));

		PartDefinition cube_r172 = neck3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-0.001F, -0.6025F, -0.1773F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5913F, 0.3019F, -1.9026F, -0.5275F, -0.3233F, 0.0746F));

		PartDefinition cube_r173 = neck3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(81, 30).addBox(0.001F, -0.6025F, -0.1773F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3019F, -1.9026F, -0.5275F, 0.3233F, -0.0746F));

		PartDefinition cube_r174 = neck3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(39, 84).addBox(0.5F, -3.0805F, -0.1119F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.6131F, -2.1009F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r175 = neck3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(78, 12).addBox(-1.1276F, -1.4804F, -5.7584F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 46).addBox(-1.1276F, -1.4804F, -7.7584F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.082F, -5.4686F, 4.2076F, 0.349F, 0.001F, -0.0017F));

		PartDefinition cube_r176 = neck3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(49, 60).addBox(-0.0457F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2557F, -3.0053F, -0.1227F, -0.39F, 0.0469F));

		PartDefinition cube_r177 = neck2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(95, 0).addBox(0.5F, -2.4F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5878F, 0.0254F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r178 = neck2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(96, 57).addBox(0.5F, -1.6401F, -0.2996F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -2.6738F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r179 = neck2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(62, 93).addBox(-0.5736F, -3.0989F, -10.8041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(65, 50).addBox(-1.1276F, -3.0989F, -9.8041F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.082F, -5.7243F, 7.2129F, 0.541F, 0.0012F, -0.0016F));

		PartDefinition cube_r180 = neck2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 52).addBox(-0.0457F, -0.1F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.5006F, -4.9738F, 0.0175F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0001F, 0.1119F, -4.8285F, 0.4838F, -0.1125F, -0.0905F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 91).addBox(-0.5515F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, 0.4088F, -10.2883F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(91, 22).addBox(-0.5515F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, -0.6045F, -10.6531F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5515F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0059F, -0.9299F, -9.9223F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(87, 90).addBox(-0.0515F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4941F, -1.1207F, -8.9407F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(95, 25).addBox(-0.0456F, -0.041F, -0.0139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.0818F, -8.9176F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r186 = head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(7, 74).addBox(0.4485F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9941F, -1.4345F, -6.1126F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r187 = head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(82, 90).addBox(0.4485F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9941F, -1.2628F, -6.996F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r188 = head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(74, 74).addBox(-1.0515F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0059F, -1.9818F, -3.3212F, 0.1396F, 0.001F, -0.0032F));

		PartDefinition cube_r189 = head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(30, 65).addBox(-1.5515F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0059F, -1.9469F, -2.3218F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r190 = head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(51, 6).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0456F, -1.9469F, -2.3218F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r191 = head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5515F, 0.0F, 0.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4941F, -1.401F, -6.3818F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r192 = head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(64, 9).addBox(-1.5515F, 0.4F, 0.625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0059F, 0.9854F, -0.5845F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r193 = head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(13, 94).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.6622F, 0.3776F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r194 = head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -2.0192F, -0.3383F, 1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r195 = head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(30, 69).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, -1.9837F, -1.1438F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r196 = head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 23).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.5553F, -0.7208F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r197 = head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(67, 29).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0456F, -0.8066F, 0.6632F, -0.1658F, 0.0F, 0.0F));

		PartDefinition crestl = head.addOrReplaceChild("crestl", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9711F, -1.4508F, -3.7513F, 0.3318F, 0.3507F, -0.0497F));

		PartDefinition cube_r198 = crestl.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 60).addBox(-0.8158F, -0.5626F, -2.7377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0962F, -0.4272F, -1.8306F, -0.0174F, -0.0436F, -0.0006F));

		PartDefinition cube_r199 = crestl.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(43, 77).addBox(-1.2977F, -0.7663F, -1.1557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(77, 40).addBox(-1.2977F, -0.7663F, -0.6557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.0344F, 1.3912F, 3.796F, 2.4942F, -0.1966F, -0.0308F));

		PartDefinition cube_r200 = crestl.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(64, 5).addBox(-2.0238F, -0.4904F, -0.1876F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.3095F, 1.5977F, 3.7923F, 2.6751F, -0.2293F, 0.0162F));

		PartDefinition cube_r201 = crestl.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(9, 66).addBox(-1.8F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2837F, 0.2702F, 2.1645F, 2.5593F, -0.4775F, 0.1196F));

		PartDefinition cube_r202 = crestl.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(51, 76).addBox(-1.7F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2752F, 0.0404F, 1.9865F, 0.9774F, -0.3578F, 0.0698F));

		PartDefinition cube_r203 = crestl.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(76, 70).addBox(-1.7895F, -0.293F, 0.3806F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 78).addBox(-1.7895F, -0.293F, -0.2193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8924F, -0.2986F, 0.6585F, -0.3316F, -0.3578F, 0.0698F));

		PartDefinition cube_r204 = crestl.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(62, 66).addBox(-1.7802F, -0.2094F, -1.801F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8809F, -0.3834F, 0.6677F, -0.1571F, -0.0785F, 0.0F));

		PartDefinition cube_r205 = crestl.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(77, 43).addBox(-1.7802F, -0.1815F, -2.4009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8809F, -0.3834F, 0.6677F, -0.1745F, -0.0785F, 0.0F));

		PartDefinition cube_r206 = crestl.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(74, 63).addBox(-1.7802F, -0.4116F, -2.9907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8809F, -0.3834F, 0.6677F, -0.0698F, -0.0785F, 0.0F));

		PartDefinition crestl2 = head.addOrReplaceChild("crestl2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0623F, -1.4508F, -3.7513F, 0.3318F, -0.3507F, 0.0497F));

		PartDefinition cube_r207 = crestl2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(40, 60).mirror().addBox(-0.1842F, -0.5626F, -2.7377F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0962F, -0.4272F, -1.8306F, -0.0174F, 0.0436F, 0.0006F));

		PartDefinition cube_r208 = crestl2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(43, 77).mirror().addBox(-0.7023F, -0.7663F, -1.1557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(77, 40).mirror().addBox(-0.7023F, -0.7663F, -0.6557F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(1.0344F, 1.3912F, 3.796F, 2.4942F, 0.1966F, 0.0308F));

		PartDefinition cube_r209 = crestl2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(64, 5).mirror().addBox(0.0238F, -0.4904F, -0.1876F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.3095F, 1.5977F, 3.7923F, 2.6751F, 0.2293F, -0.0162F));

		PartDefinition cube_r210 = crestl2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(9, 66).mirror().addBox(-0.2F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2837F, 0.2702F, 2.1645F, 2.5593F, 0.4775F, -0.1196F));

		PartDefinition cube_r211 = crestl2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(51, 76).mirror().addBox(-0.3F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2752F, 0.0404F, 1.9865F, 0.9774F, 0.3578F, -0.0698F));

		PartDefinition cube_r212 = crestl2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.2105F, -0.293F, 0.3806F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 78).mirror().addBox(-0.2105F, -0.293F, -0.2193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8924F, -0.2986F, 0.6585F, -0.3316F, 0.3578F, -0.0698F));

		PartDefinition cube_r213 = crestl2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 66).mirror().addBox(-0.2198F, -0.2094F, -1.801F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8809F, -0.3834F, 0.6677F, -0.1571F, 0.0785F, 0.0F));

		PartDefinition cube_r214 = crestl2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(77, 43).mirror().addBox(-0.2198F, -0.1815F, -2.4009F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.8809F, -0.3834F, 0.6677F, -0.1745F, 0.0785F, 0.0F));

		PartDefinition cube_r215 = crestl2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 63).mirror().addBox(-0.2198F, -0.4116F, -2.9907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8809F, -0.3834F, 0.6677F, -0.0698F, 0.0785F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.1692F, -9.6683F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(79, 36).addBox(-0.9F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(2.3566F, -1.9262F, 9.3986F, 1.2661F, -0.0289F, 0.0567F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(78, 4).addBox(-0.9263F, 4.8655F, 0.8896F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.41F, 0.0137F, -0.014F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 73).addBox(-1.3541F, 3.0777F, 0.4525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.4964F, 0.0999F, -0.0281F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(92, 39).addBox(-0.687F, 2.3007F, 0.0498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.6225F, 0.2045F, -0.0289F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(84, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9867F, -3.2187F, 4.8659F, 0.2211F, 0.3091F, -0.0302F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(23, 88).addBox(-0.9224F, 0.6523F, 0.9395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.181F, 0.3091F, -0.0302F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(18, 88).addBox(-0.9224F, 1.5285F, -0.6864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.9228F, 0.3091F, -0.0302F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(18, 85).addBox(-0.9224F, 0.58F, -0.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.7919F, 0.3091F, -0.0302F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(91, 29).addBox(-0.8816F, -0.3119F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1473F, -1.5432F, 3.8215F, 1.6666F, 0.2655F, -0.0317F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(69, 70).addBox(-0.6853F, -3.312F, -1.0355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -1.3362F, 2.113F, 1.4484F, 0.1771F, -0.0715F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(7, 70).addBox(-0.5603F, -2.5087F, -1.2401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -1.3362F, 2.113F, 1.5357F, 0.1771F, -0.0715F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(85, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5245F, -0.9639F, 1.6853F, 1.4334F, 0.1658F, -0.1593F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(46, 69).addBox(-0.5853F, -0.1483F, -1.4345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -1.3362F, 2.113F, 1.5715F, 0.1773F, -0.1158F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 30).addBox(-0.6145F, 0.7624F, -0.7372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 86).addBox(-0.6145F, 1.5624F, -0.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -1.3362F, 2.113F, 1.5829F, 0.2468F, -0.0708F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(18, 91).addBox(-0.6145F, 2.3072F, -0.9932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.636F, -1.3362F, 2.113F, 1.7574F, 0.2468F, -0.0708F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(76, 27).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3144F, -2.0778F, 9.4538F, -0.0876F, -0.0605F, 0.0311F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(67, 93).addBox(0.6988F, -3.9466F, 4.6927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.9473F, -1.5432F, 3.8215F, -0.4602F, -0.0594F, -0.2956F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(87, 93).addBox(-1.025F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.0501F, -2.7364F, 7.3975F, 1.3051F, -0.0021F, -0.1883F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(93, 6).addBox(-0.7594F, 4.8104F, 3.348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.9473F, -1.5432F, 3.8215F, 1.1426F, 0.096F, 0.0174F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(54, 83).addBox(-0.5F, -1.0081F, -0.412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.4635F, -2.9021F, 8.5428F, -1.669F, -0.1174F, -0.1869F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(73, 78).addBox(-0.5F, -1.3804F, -0.5862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4635F, -2.9021F, 8.5428F, -1.7999F, -0.1174F, -0.1869F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(95, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3016F, -3.1022F, 4.8123F, -2.2037F, 0.2644F, -0.1203F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(42, 84).addBox(-0.5648F, -0.9619F, -0.8429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.4873F, -3.0605F, 6.175F, 2.8332F, 0.2435F, -0.1485F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(76, 16).addBox(-0.5648F, -0.5167F, -1.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4873F, -3.0605F, 6.175F, 1.6551F, 0.2435F, -0.1485F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(84, 19).addBox(-0.5648F, -1.0489F, -0.913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.4873F, -3.0605F, 6.175F, 0.4334F, 0.2435F, -0.1485F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(33, 90).addBox(-0.5F, -0.438F, -0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1315F, -2.3701F, -0.512F, -1.6827F, 0.0699F, 0.0569F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(90, 14).addBox(-0.5F, -0.6185F, -0.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1315F, -2.3701F, -0.512F, -1.0719F, 0.0699F, 0.0569F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(78, 78).addBox(-1.1362F, -0.9673F, -0.3772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3473F, -2.5432F, 3.8215F, 0.2599F, 0.192F, 0.052F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(78, 66).addBox(-1.1182F, -0.938F, -1.3184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.3473F, -2.5432F, 3.8215F, 0.1798F, 0.2291F, 0.0069F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(79, 20).addBox(-1.2691F, -0.8504F, -2.2447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.3473F, -2.5432F, 3.8215F, 0.1366F, 0.1397F, 0.0343F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(37, 71).addBox(-1.0744F, -0.9987F, -1.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6941F, -2.0038F, 0.7082F, 0.1104F, 0.1397F, 0.0343F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(85, 3).addBox(0.0321F, -0.6176F, 2.3353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0527F, -1.6432F, 2.7215F, 3.044F, 0.1642F, -0.0257F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(8, 85).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5854F, -1.2722F, 0.2006F, 1.819F, 0.0374F, -0.0582F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(13, 91).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.3365F, -1.1203F, 1.7789F, 1.2036F, 0.2411F, -0.0751F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(95, 79).addBox(0.0327F, -0.8519F, -0.5578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0527F, -1.6432F, 2.7215F, 1.5518F, 0.1642F, -0.0257F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(8, 91).addBox(-0.9917F, 0.0291F, 0.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9845F, -1.1047F, 2.5857F, 1.6001F, 0.204F, -0.0336F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(58, 61).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8267F, -3.6037F, 3.5557F, 0.1943F, 0.1542F, 0.0302F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2189F, 2.1692F, -9.6683F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(79, 36).mirror().addBox(-0.1F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-2.3566F, -1.9262F, 9.3986F, 1.2661F, 0.0289F, -0.0567F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-1.0737F, 4.8655F, 0.8896F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.41F, -0.0137F, 0.014F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-0.6459F, 3.0777F, 0.4525F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.4964F, -0.0999F, 0.0281F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-0.313F, 2.3007F, 0.0498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.6225F, -0.2045F, 0.0289F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 42).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9867F, -3.2187F, 4.8659F, 0.2211F, -0.3091F, 0.0302F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(23, 88).mirror().addBox(-0.0776F, 0.6523F, 0.9395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.181F, -0.3091F, 0.0302F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(18, 88).mirror().addBox(-0.0776F, 1.5285F, -0.6864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.9228F, -0.3091F, 0.0302F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(18, 85).mirror().addBox(-0.0776F, 0.58F, -0.481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.7919F, -0.3091F, 0.0302F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(91, 29).mirror().addBox(-0.1184F, -0.3119F, -0.3876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1473F, -1.5432F, 3.8215F, 1.6666F, -0.2655F, 0.0317F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-0.3147F, -3.312F, -1.0355F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -1.3362F, 2.113F, 1.4484F, -0.1771F, 0.0715F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-0.4397F, -2.5087F, -1.2401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -1.3362F, 2.113F, 1.5357F, -0.1771F, 0.0715F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5245F, -0.9639F, 1.6853F, 1.4334F, -0.1658F, 0.1593F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(46, 69).mirror().addBox(-0.4147F, -0.1483F, -1.4345F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -1.3362F, 2.113F, 1.5715F, -0.1773F, 0.1158F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(86, 30).mirror().addBox(-0.3855F, 0.7624F, -0.7372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 86).mirror().addBox(-0.3855F, 1.5624F, -0.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -1.3362F, 2.113F, 1.5829F, -0.2468F, 0.0708F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(18, 91).mirror().addBox(-0.3855F, 2.3072F, -0.9932F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.636F, -1.3362F, 2.113F, 1.7574F, -0.2468F, 0.0708F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(76, 27).mirror().addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3144F, -2.0778F, 9.4538F, -0.0876F, 0.0605F, -0.0311F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(67, 93).mirror().addBox(-1.6988F, -3.9466F, 4.6927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9473F, -1.5432F, 3.8215F, -0.4602F, 0.0594F, 0.2956F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(0.025F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.0501F, -2.7364F, 7.3975F, 1.3051F, 0.0021F, 0.1883F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-0.2406F, 4.8104F, 3.348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9473F, -1.5432F, 3.8215F, 1.1426F, -0.096F, -0.0174F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(54, 83).mirror().addBox(-0.5F, -1.0081F, -0.412F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.4635F, -2.9021F, 8.5428F, -1.669F, 0.1174F, 0.1869F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.5F, -1.3804F, -0.5862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4635F, -2.9021F, 8.5428F, -1.7999F, 0.1174F, 0.1869F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3016F, -3.1022F, 4.8123F, -2.2037F, -0.2644F, 0.1203F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-0.4352F, -0.9619F, -0.8429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.4873F, -3.0605F, 6.175F, 2.8332F, -0.2435F, 0.1485F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-0.4352F, -0.5167F, -1.0268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4873F, -3.0605F, 6.175F, 1.6551F, -0.2435F, 0.1485F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(84, 19).mirror().addBox(-0.4352F, -1.0489F, -0.913F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-1.4873F, -3.0605F, 6.175F, 0.4334F, -0.2435F, 0.1485F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-0.5F, -0.438F, -0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1315F, -2.3701F, -0.512F, -1.6827F, -0.0699F, -0.0569F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.5F, -0.6185F, -0.5612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1315F, -2.3701F, -0.512F, -1.0719F, -0.0699F, -0.0569F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(0.1362F, -0.9673F, -0.3772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -2.5432F, 3.8215F, 0.2599F, -0.192F, -0.052F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(0.1182F, -0.938F, -1.3184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -2.5432F, 3.8215F, 0.1798F, -0.2291F, -0.0069F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(79, 20).mirror().addBox(0.2691F, -0.8504F, -2.2447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3473F, -2.5432F, 3.8215F, 0.1366F, -0.1397F, -0.0343F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(37, 71).mirror().addBox(0.0744F, -0.9987F, -1.0093F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6941F, -2.0038F, 0.7082F, 0.1104F, -0.1397F, -0.0343F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(85, 3).mirror().addBox(-1.0321F, -0.6176F, 2.3353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0527F, -1.6432F, 2.7215F, 3.044F, -0.1642F, 0.0257F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(8, 85).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5854F, -1.2722F, 0.2006F, 1.819F, -0.0374F, 0.0582F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(13, 91).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.3365F, -1.1203F, 1.7789F, 1.2036F, -0.2411F, 0.0751F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-1.0327F, -0.8519F, -0.5578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0527F, -1.6432F, 2.7215F, 1.5518F, -0.1642F, 0.0257F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(8, 91).mirror().addBox(-0.0083F, 0.0291F, 0.0089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9845F, -1.1047F, 2.5857F, 1.6001F, -0.204F, 0.0336F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8267F, -3.6037F, 3.5557F, 0.1943F, -0.1542F, -0.0302F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9822F, 1.3011F, 0.9361F, 0.6892F, 0.0194F, -0.0038F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(72, 93).mirror().addBox(-0.2079F, -0.1661F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(93, 70).mirror().addBox(-0.3079F, -0.1661F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.6694F, -6.7948F, -8.9226F, 1.9193F, 0.1461F, -0.3578F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(82, 84).mirror().addBox(-0.5F, -0.45F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 11).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9676F, -3.8459F, -5.4369F, 2.4534F, -0.0704F, 0.0653F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(92, 82).mirror().addBox(-1.028F, -0.9215F, -2.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5055F, -2.6966F, -5.8051F, -0.8191F, -0.0595F, 0.0754F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-1.028F, 0.0349F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5055F, -2.6966F, -5.8051F, -2.3463F, -0.0595F, 0.0754F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(8, 88).mirror().addBox(-0.1053F, -0.2542F, 1.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, 2.5569F, -0.0873F, 0.0349F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(34, 79).mirror().addBox(-0.1053F, -2.1853F, 0.3824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, 1.2915F, -0.0873F, 0.0349F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-1.5747F, 1.0125F, 1.4292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, 2.6337F, -0.2405F, 0.3002F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(92, 88).mirror().addBox(-1.0216F, 0.5523F, 0.8391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5055F, -2.6966F, -5.8051F, 2.3226F, -0.0606F, 0.0732F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(23, 94).mirror().addBox(-1.03F, 0.1897F, -0.363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 76).mirror().addBox(-1.03F, 0.2897F, 0.437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, 2.3175F, -0.117F, 0.1173F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(0.0418F, -1.3668F, -1.6257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, -0.6666F, -0.2017F, 0.1619F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-1.1479F, 0.3157F, 1.0691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, 2.4419F, -0.1853F, 0.0643F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(51, 93).mirror().addBox(-0.227F, -0.1661F, 0.1142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(93, 32).mirror().addBox(-0.227F, -0.1661F, -0.1858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-2.9805F, -5.7466F, -8.5051F, 1.9331F, -0.1058F, 0.2952F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(46, 93).mirror().addBox(-0.227F, 0.0969F, -0.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.9805F, -5.7466F, -8.5051F, 2.5876F, -0.1058F, 0.2952F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(77, 84).mirror().addBox(-1.022F, -0.2205F, -0.7264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, -2.4462F, -0.1226F, 0.1098F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(29, 82).mirror().addBox(-1.0071F, -0.0724F, -1.2627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5055F, -2.6966F, -5.8051F, -2.3107F, -0.0661F, 0.0658F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(0.0418F, 0.8731F, -2.0674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, -2.0192F, -0.2017F, 0.1619F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(-0.0053F, -1.4646F, 0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 87).addBox(3.6608F, -1.4646F, 0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, 2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-1.0338F, -1.8642F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, 0.5719F, -0.1159F, 0.1195F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(90, 3).mirror().addBox(-1.0338F, -0.5589F, -0.9553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.3055F, -4.3966F, -6.9051F, -0.8243F, -0.1159F, 0.1195F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(0.0154F, 0.9891F, -1.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, -2.3616F, -0.1949F, 0.1716F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(71, 12).mirror().addBox(0.0154F, -0.0262F, -0.0059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, 2.2199F, -0.1949F, 0.1716F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(44, 80).mirror().addBox(0.0947F, -3.2338F, -1.1486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, 0.8116F, -0.0873F, 0.0349F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(0.0947F, -0.2755F, -1.5221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, -0.4538F, -0.0873F, 0.0349F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(0.0947F, -0.4168F, -0.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, -1.9373F, -0.0873F, 0.0349F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(62, 87).mirror().addBox(-0.0053F, -1.2498F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(62, 87).addBox(3.6608F, -1.2498F, 0.7906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, 2.4696F, 0.0F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(52, 87).mirror().addBox(-0.0053F, -0.3053F, -1.7117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(52, 87).addBox(3.6608F, -0.3053F, -1.7117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(47, 87).mirror().addBox(-0.0053F, 0.8461F, 0.0674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(47, 87).addBox(3.6608F, 0.8461F, 0.0674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(87, 39).mirror().addBox(-0.0053F, 0.5713F, 0.4416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 39).addBox(3.6608F, 0.5713F, 0.4416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(0.0418F, -0.1411F, -2.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, -1.8883F, -0.2017F, 0.1619F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(0.0418F, -2.1945F, 0.0454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0305F, -1.3966F, -4.7051F, -0.3611F, -0.2017F, 0.1619F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(39, 65).mirror().addBox(0.1128F, -2.976F, -0.4578F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4305F, 0.0034F, -1.6051F, 0.8911F, -0.0942F, 0.0254F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-0.0053F, -0.9734F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 36).addBox(3.6608F, -0.9734F, 0.6996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, 2.3824F, 0.0F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(-0.0053F, -0.2999F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(33, 87).addBox(3.6608F, -0.2999F, 0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, -2.3736F, 0.0F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.0053F, -0.2185F, 0.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 49).addBox(3.6608F, -0.2185F, 0.2056F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3555F, 0.0034F, 0.5949F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(77, 84).addBox(0.022F, -0.2205F, -0.7264F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, -2.4462F, 0.1226F, -0.1098F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(29, 82).addBox(0.0071F, -0.0724F, -1.2627F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.55F, -2.6966F, -5.8051F, -2.3107F, 0.0661F, -0.0658F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(87, 84).addBox(-1.0418F, 0.8731F, -2.0674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, -2.0192F, 0.2017F, -0.1619F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(38, 91).addBox(-1.0418F, -0.1411F, -2.1905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, -1.8883F, 0.2017F, -0.1619F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(67, 32).addBox(-1.0418F, -1.3668F, -1.6257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, -0.6666F, 0.2017F, -0.1619F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(86, 46).addBox(-1.0418F, -2.1945F, 0.0454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, -0.3611F, 0.2017F, -0.1619F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(39, 65).addBox(-1.1128F, -2.976F, -0.4578F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, 0.8911F, 0.0942F, -0.0254F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(82, 84).addBox(-0.5F, -0.45F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 11).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0879F, -3.8459F, -5.4369F, 2.4534F, 0.0704F, -0.0653F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(92, 88).addBox(0.0216F, 0.5523F, 0.8391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.55F, -2.6966F, -5.8051F, 2.3226F, 0.0606F, -0.0732F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(23, 94).addBox(0.03F, 0.1897F, -0.363F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 76).addBox(0.03F, 0.2897F, 0.437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, 2.3175F, 0.117F, -0.1173F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(52, 90).addBox(0.5747F, 1.0125F, 1.4292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, 2.6337F, 0.2405F, -0.3002F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(72, 83).addBox(0.1479F, 0.3157F, 1.0691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, 2.4419F, 0.1853F, -0.0643F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(46, 93).addBox(-0.773F, 0.0969F, -0.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.075F, -5.7466F, -8.5051F, 2.5876F, 0.1058F, -0.2952F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(72, 93).addBox(-0.7921F, -0.1661F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 70).addBox(-0.6921F, -0.1661F, -0.9832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3861F, -6.7948F, -8.9226F, 1.9193F, -0.1461F, 0.3578F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(51, 93).addBox(-0.773F, -0.1661F, 0.1142F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(93, 32).addBox(-0.773F, -0.1661F, -0.1858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-1.075F, -5.7466F, -8.5051F, 1.9331F, 0.1058F, -0.2952F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(91, 45).addBox(0.0338F, -1.8642F, -0.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, 0.5719F, 0.1159F, -0.1195F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(92, 82).addBox(0.028F, -0.9215F, -2.0324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.55F, -2.6966F, -5.8051F, -0.8191F, 0.0595F, -0.0754F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(90, 3).addBox(0.0338F, -0.5589F, -0.9553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.75F, -4.3966F, -6.9051F, -0.8243F, 0.1159F, -0.1195F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(57, 92).addBox(0.028F, 0.0349F, -0.9633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.55F, -2.6966F, -5.8051F, -2.3463F, 0.0595F, -0.0754F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(83, 70).addBox(-1.0154F, 0.9891F, -1.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, -2.3616F, 0.1949F, -0.1716F));

		PartDefinition cube_r344 = jaw.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(71, 12).addBox(-1.0154F, -0.0262F, -0.0059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.025F, -1.3966F, -4.7051F, 2.2199F, 0.1949F, -0.1716F));

		PartDefinition cube_r345 = jaw.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(8, 88).addBox(-0.8947F, -0.2542F, 1.9512F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, 2.5569F, 0.0873F, -0.0349F));

		PartDefinition cube_r346 = jaw.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(34, 79).addBox(-0.8947F, -2.1853F, 0.3824F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, 1.2915F, 0.0873F, -0.0349F));

		PartDefinition cube_r347 = jaw.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(44, 80).addBox(-1.0947F, -3.2338F, -1.1486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, 0.8116F, 0.0873F, -0.0349F));

		PartDefinition cube_r348 = jaw.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(72, 87).addBox(-1.0947F, -0.2755F, -1.5221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, -0.4538F, 0.0873F, -0.0349F));

		PartDefinition cube_r349 = jaw.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(67, 87).addBox(-1.0947F, -0.4168F, -0.3238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.375F, 0.0034F, -1.6051F, -1.9373F, 0.0873F, -0.0349F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(41, 38).addBox(-0.5F, -0.4531F, 0.0037F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5808F, 2.9336F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r350 = tail.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(5, 85).addBox(0.0F, 0.0147F, -0.066F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.767F, 0.8431F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r351 = tail.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(90, 6).addBox(0.0F, 0.3435F, -0.0999F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4867F, 2.8578F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r352 = tail.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(53, 96).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 3.0037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r353 = tail.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(33, 93).addBox(0.0F, -2.2044F, 0.0292F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 1.0037F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r354 = tail.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.0F, -0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.558F, -0.1161F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r355 = tail.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.5015F, 0.0F, 0.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, 0.0F, 0.07F, -0.0023F));

		PartDefinition cube_r356 = tail.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(0, 58).addBox(-0.4985F, 0.0F, 0.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, 0.0F, -0.07F, 0.0023F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(15, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(0, 62).addBox(-0.5F, -2.5838F, -0.6951F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.4531F, 5.0037F, -0.2173F, 0.3011F, -0.052F));

		PartDefinition cube_r357 = tail7.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(96, 45).addBox(0.0F, -1.7206F, -0.1121F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 4.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r358 = tail7.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(62, 96).addBox(0.0F, -1.9581F, 0.0912F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r359 = tail7.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(68, 96).addBox(0.0F, -1.9054F, 0.0608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r360 = tail7.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(44, 96).addBox(0.0F, 0.1334F, -0.1787F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5058F, 3.3969F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r361 = tail7.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, 0.3899F, 0.0372F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9397F, 0.2541F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r362 = tail7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(63, 36).addBox(-0.5F, 0.0034F, -0.0516F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5871F, 2.3565F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r363 = tail7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(36, 7).mirror().addBox(-1.5198F, 0.0F, 6.0203F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5F, -6.0F, 0.0F, 0.0525F, -0.0023F));

		PartDefinition cube_r364 = tail7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(36, 7).addBox(-0.4802F, 0.0F, 6.0203F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5F, -6.0F, 0.0F, -0.0525F, 0.0023F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, 0.0143F, 0.0362F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.9209F, 0.0709F, 0.1741F, 0.0123F));

		PartDefinition cube_r365 = tail2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(65, 96).addBox(0.0F, -1.2206F, -0.0527F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0143F, 5.0362F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r366 = tail2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(50, 96).addBox(0.0F, -1.5003F, -0.0085F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1143F, 3.0362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r367 = tail2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(71, 96).addBox(0.0F, -1.8092F, -0.0816F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3143F, 1.1362F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r368 = tail2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(41, 96).addBox(0.0F, -0.3366F, -0.0865F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9541F, 4.6903F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(96, 28).addBox(0.0F, -0.0261F, -0.0479F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0541F, 2.3903F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r370 = tail2.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(47, 96).addBox(0.0F, 0.2163F, 0.0353F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3217F, 0.2876F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r371 = tail2.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, -0.9823F, -0.0136F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1857F, 0.2362F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail2.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(28, 38).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8143F, 6.0362F, 0.2024F, -0.1283F, -0.0262F));

		PartDefinition cube_r372 = tail8.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(11, 97).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0023F, 3.5698F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r373 = tail8.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(74, 96).addBox(0.0F, -0.8889F, -0.016F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r374 = tail8.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(55, 79).addBox(0.0F, -0.5837F, 0.0485F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2397F, 3.0541F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r375 = tail8.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(37, 52).addBox(0.0F, -0.3479F, -0.1812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1397F, 1.0541F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r376 = tail8.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(26, 52).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5957F, 0.5978F, -0.0698F, 0.0F, 0.0F));

		PartDefinition tail3 = tail8.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 14).addBox(-0.5F, -0.1985F, -0.0349F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0032F, -0.591F, 4.8057F, -0.0291F, -0.2347F, 0.0062F));

		PartDefinition cube_r377 = tail3.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(96, 61).addBox(0.0F, -1.1768F, -0.1486F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6015F, 3.9651F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r378 = tail3.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 97).addBox(-0.0106F, -0.0741F, -0.2538F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6015F, 4.9651F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r379 = tail3.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(88, 96).addBox(-0.0106F, 0.0907F, -0.0686F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 2.6192F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r380 = tail3.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(85, 96).addBox(-0.0106F, 0.1782F, -0.1654F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7412F, 0.5192F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r381 = tail3.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(17, 14).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0985F, 0.0651F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail3.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(8, 97).addBox(0.0F, -1.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 96).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1015F, -0.0349F, -0.2269F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7948F, 6.8694F, -0.128F, -0.3031F, 0.0384F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(60, 19).addBox(-0.5F, -0.293F, -0.1999F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6791F, 6.0515F, -0.2823F, -0.3786F, 0.1068F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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