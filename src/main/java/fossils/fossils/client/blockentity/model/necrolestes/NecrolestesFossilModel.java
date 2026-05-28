package fossils.fossils.client.blockentity.model.necrolestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NecrolestesFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;

	public NecrolestesFossilModel(ModelPart root) {
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
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.3142F, 8.6479F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 58).addBox(0.0F, -1.4F, -0.35F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0108F, 0.957F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 57).addBox(0.0F, -1.55F, -0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1106F, -0.9639F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 53).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, -2.9602F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, 0.0F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(81, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7455F, -1.9176F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.1708F, 4.051F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.4491F, 2.0704F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(69, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6408F, 0.0796F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(69, 44).addBox(-0.5F, -1.6F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(63, 19).mirror().addBox(-2.0F, 0.05F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0093F, 0.9945F, -0.0511F, -0.0113F, -0.2179F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(63, 19).addBox(0.0F, 0.05F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0093F, 0.9945F, -0.0511F, 0.0113F, 0.2179F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3564F, 1.2032F, 0.6971F, 0.1402F, -0.1664F, 1.3046F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 71).addBox(-0.9729F, -0.9317F, 0.3067F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.0409F, 1.9118F, -0.0659F, -0.8764F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(79, 0).addBox(-0.9729F, 0.1786F, 1.3881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.0409F, 1.0391F, -0.0659F, -0.8764F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(91, 69).addBox(-0.9729F, -0.3194F, 1.8276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.0409F, 0.2537F, -0.0659F, -0.8764F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 73).addBox(-0.475F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.6199F, 0.0625F, 2.5993F, 1.1845F, -0.0333F, -0.9001F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 62).addBox(-0.3122F, -0.0662F, -1.7091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.7078F, 0.2317F, 2.4409F, 1.1847F, -0.001F, -0.9133F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 53).addBox(-0.8783F, -0.8262F, -1.7831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.2058F, 0.9954F, 3.5266F, 0.8077F, -0.0494F, -0.9541F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 54).addBox(-0.825F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(2.3289F, 2.8257F, 1.9444F, 1.3675F, -0.1367F, -1.3388F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(91, 75).addBox(-0.8F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 91).addBox(-0.8F, -0.25F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9973F, 2.116F, 0.3994F, 1.9749F, -0.3062F, -1.3683F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(73, 61).addBox(-1.85F, -0.875F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(2.5918F, 1.94F, 2.3271F, 1.3526F, -0.3928F, -1.2822F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(56, 84).addBox(-0.8783F, -1.6426F, -2.0637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(1.2058F, 0.9954F, 3.5266F, 1.3313F, -0.0494F, -0.9541F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(79, 8).addBox(-1.0003F, -1.6434F, 1.0804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.3409F, -0.6626F, -0.0659F, -0.8764F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(78, 39).addBox(-0.5F, -1.55F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.751F, 1.0531F, 2.1361F, -2.6393F, -0.0494F, -0.9541F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(91, 58).addBox(-0.8735F, -2.0952F, -1.289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(46, 80).addBox(-0.8735F, -1.8952F, -1.289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.286F, -0.6244F, -2.9197F, -0.4644F, -0.0946F, -0.805F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(35, 84).addBox(-0.8735F, -1.0765F, -1.6624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(25, 80).addBox(-0.8735F, -1.0765F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(-0.286F, -0.6244F, -2.9197F, -1.2498F, -0.0946F, -0.805F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 49).addBox(-0.325F, -0.1F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-2.2341F, 1.6623F, 3.2668F, -0.4013F, -0.364F, -1.0059F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(60, 46).addBox(-3.175F, -0.1F, -0.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.8836F, -0.1393F, 4.5669F, -0.5025F, -0.7107F, -0.8117F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(63, 16).addBox(-0.1F, -0.1F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(62, 0).addBox(-0.1F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.8034F, 1.3263F, 1.5926F, -0.374F, -0.0404F, -1.14F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 13).addBox(-0.1F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-3.7731F, 0.6921F, -2.6487F, -0.2062F, 0.2589F, -1.2017F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(63, 3).addBox(-0.1F, -0.1F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.6423F, 0.787F, -1.8652F, -0.1994F, -0.0404F, -1.14F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(66, 28).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.2821F, -2.1438F, -1.6871F, -0.1875F, -0.2093F, -1.0958F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 66).addBox(-0.775F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.096F, -1.5039F, -0.0104F, -0.2573F, -0.2093F, -1.0958F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 44).addBox(-0.1F, -0.1F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-3.2642F, 1.0382F, -0.1234F, -0.2518F, -0.0404F, -1.14F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 64).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-1.6352F, -1.2159F, 1.7056F, -0.3057F, -0.107F, -1.119F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 36).addBox(-0.1F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-3.0338F, 1.1823F, 0.7346F, -0.3041F, -0.0404F, -1.14F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(94, 0).addBox(-0.8735F, -0.6443F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F))
				.texOffs(45, 84).addBox(-0.8735F, -0.3443F, -0.2488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-0.286F, -0.6244F, -2.9197F, -2.297F, -0.0946F, -0.805F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 67).addBox(-0.8735F, 0.0604F, -1.4616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.286F, -0.6244F, -2.9197F, 2.3368F, -0.0946F, -0.805F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 38).addBox(-0.9729F, -0.2455F, -0.5854F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.138F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.0409F, 2.9153F, -0.0659F, -0.8764F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(81, 34).addBox(-1.0003F, -1.7345F, -0.688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.5922F, 0.2317F, 0.3409F, -2.277F, -0.0659F, -0.8764F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3564F, 1.2032F, 0.6971F, 0.1402F, 0.1664F, -1.3046F));

		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-0.0271F, -0.9317F, 0.3067F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.0409F, 1.9118F, 0.0659F, 0.8764F));

		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.0271F, 0.1786F, 1.3881F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.0409F, 1.0391F, 0.0659F, 0.8764F));

		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 69).mirror().addBox(-0.0271F, -0.3194F, 1.8276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.0409F, 0.2537F, 0.0659F, 0.8764F));

		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 73).mirror().addBox(-0.525F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.6199F, 0.0625F, 2.5993F, 1.1845F, 0.0333F, 0.9001F));

		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(-0.6878F, -0.0662F, -1.7091F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.7078F, 0.2317F, 2.4409F, 1.1847F, 0.001F, 0.9133F));

		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 53).mirror().addBox(-0.1217F, -0.8262F, -1.7831F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.2058F, 0.9954F, 3.5266F, 0.8077F, 0.0494F, 0.9541F));

		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-0.175F, -0.875F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-2.3289F, 2.8257F, 1.9444F, 1.3675F, 0.1367F, 1.3388F));

		PartDefinition cube_r46 = bone3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(91, 75).mirror().addBox(-0.2F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 91).mirror().addBox(-0.2F, -0.25F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9973F, 2.116F, 0.3994F, 1.9749F, 0.3062F, 1.3683F));

		PartDefinition cube_r47 = bone3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-0.15F, -0.875F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-2.5918F, 1.94F, 2.3271F, 1.3526F, 0.3928F, 1.2822F));

		PartDefinition cube_r48 = bone3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(-0.1217F, -1.6426F, -2.0637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-1.2058F, 0.9954F, 3.5266F, 1.3313F, 0.0494F, 0.9541F));

		PartDefinition cube_r49 = bone3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(79, 8).mirror().addBox(0.0003F, -1.6434F, 1.0804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.3409F, -0.6626F, 0.0659F, 0.8764F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-0.5F, -1.55F, 0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.751F, 1.0531F, 2.1361F, -2.6393F, 0.0494F, 0.9541F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(91, 58).mirror().addBox(-0.1265F, -2.0952F, -1.289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(46, 80).mirror().addBox(-0.1265F, -1.8952F, -1.289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.286F, -0.6244F, -2.9197F, -0.4644F, 0.0946F, 0.805F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.1265F, -1.0765F, -1.6624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(25, 80).mirror().addBox(-0.1265F, -1.0765F, -0.9874F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(0.286F, -0.6244F, -2.9197F, -1.2498F, 0.0946F, 0.805F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 49).mirror().addBox(-2.675F, -0.1F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(2.2341F, 1.6623F, 3.2668F, -0.4013F, 0.364F, 1.0059F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(60, 46).mirror().addBox(0.175F, -0.1F, -0.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.8836F, -0.1393F, 4.5669F, -0.5025F, 0.7107F, 0.8117F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 16).mirror().addBox(-2.9F, -0.1F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(-2.9F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.8034F, 1.3263F, 1.5926F, -0.374F, 0.0404F, 1.14F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(63, 13).mirror().addBox(-2.9F, -0.1F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(3.7731F, 0.6921F, -2.6487F, -0.2062F, -0.2589F, 1.2017F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(63, 3).mirror().addBox(-2.9F, -0.1F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.6423F, 0.787F, -1.8652F, -0.1994F, 0.0404F, 1.14F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.2821F, -2.1438F, -1.6871F, -0.1875F, 0.2093F, 1.0958F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(14, 66).mirror().addBox(-0.225F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.096F, -1.5039F, -0.0104F, -0.2573F, 0.2093F, 1.0958F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-2.9F, -0.1F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(3.2642F, 1.0382F, -0.1234F, -0.2518F, 0.0404F, 1.14F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(1.6352F, -1.2159F, 1.7056F, -0.3057F, 0.107F, 1.119F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-2.9F, -0.1F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(3.0338F, 1.1823F, 0.7346F, -0.3041F, 0.0404F, 1.14F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-0.1265F, -0.6443F, -0.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false)
				.texOffs(45, 84).mirror().addBox(-0.1265F, -0.3443F, -0.2488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(0.286F, -0.6244F, -2.9197F, -2.297F, 0.0946F, 0.805F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(39, 67).mirror().addBox(-0.1265F, 0.0604F, -1.4616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.286F, -0.6244F, -2.9197F, 2.3368F, 0.0946F, 0.805F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-0.0271F, -0.2455F, -0.5854F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.138F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.0409F, 2.9153F, 0.0659F, 0.8764F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(0.0003F, -1.7345F, -0.688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.5922F, 0.2317F, 0.3409F, -2.277F, 0.0659F, 0.8764F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5092F, 1.8047F, 2.1423F, -0.9087F, 0.4053F, -1.1867F));

		PartDefinition upperleg8_r1 = upperleg2.addOrReplaceChild("upperleg8_r1", CubeListBuilder.create().texOffs(91, 55).addBox(-0.4611F, -3.4554F, 1.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4611F, 3.733F, -0.5478F, -2.3736F, 0.0F, 3.1416F));

		PartDefinition upperleg8_r2 = upperleg2.addOrReplaceChild("upperleg8_r2", CubeListBuilder.create().texOffs(5, 80).addBox(-0.4611F, -2.9628F, -0.4281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4611F, 3.733F, -0.5478F, -2.7314F, 0.0F, 3.1416F));

		PartDefinition upperleg7_r1 = upperleg2.addOrReplaceChild("upperleg7_r1", CubeListBuilder.create().texOffs(24, 84).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4372F, 1.1941F, 1.0412F, -3.0718F, 0.0F, 3.1416F));

		PartDefinition upperleg6_r1 = upperleg2.addOrReplaceChild("upperleg6_r1", CubeListBuilder.create().texOffs(91, 85).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4222F, 5.5557F, 0.1283F, -2.522F, 0.0F, 3.1416F));

		PartDefinition upperleg5_r1 = upperleg2.addOrReplaceChild("upperleg5_r1", CubeListBuilder.create().texOffs(47, 71).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4222F, 5.8404F, -0.8611F, -2.9147F, 0.0F, 3.1416F));

		PartDefinition upperleg4_r1 = upperleg2.addOrReplaceChild("upperleg4_r1", CubeListBuilder.create().texOffs(59, 73).addBox(-0.4611F, -0.845F, -0.4707F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4611F, 3.733F, -0.5478F, -2.7402F, 0.0F, 3.1416F));

		PartDefinition upperleg3_r1 = upperleg2.addOrReplaceChild("upperleg3_r1", CubeListBuilder.create().texOffs(43, 75).addBox(-0.4611F, -3.7138F, -0.601F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4611F, 3.733F, -0.5478F, -2.9147F, 0.0F, 3.1416F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0663F, 6.3087F, -0.5407F, 1.4785F, -1.295F, 0.3769F));

		PartDefinition leg7_r1 = leg2.addOrReplaceChild("leg7_r1", CubeListBuilder.create().texOffs(36, 80).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.7341F, -0.1289F, -1.0053F, 1.5598F, 1.3613F, 1.5165F));

		PartDefinition leg6_r1 = leg2.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(21, 67).addBox(-0.15F, -3.85F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8623F, 2.8506F, -0.263F, -1.5544F, 1.4312F, -1.5981F));

		PartDefinition leg8_r1 = leg2.addOrReplaceChild("leg8_r1", CubeListBuilder.create().texOffs(64, 91).addBox(-0.15F, 0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(53, 93).addBox(-0.15F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6773F, -1.4281F, -0.941F, 1.5682F, 0.4625F, 1.5261F));

		PartDefinition leg6_r2 = leg2.addOrReplaceChild("leg6_r2", CubeListBuilder.create().texOffs(84, 92).addBox(-0.9F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6924F, -1.1198F, -1.6532F, 1.5554F, 1.4224F, 1.512F));

		PartDefinition leg5_r1 = leg2.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(14, 70).addBox(-0.85F, -3.825F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(0.8405F, 2.3151F, -0.9359F, 1.5617F, 1.3177F, 1.5184F));

		PartDefinition leg5_r2 = leg2.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(79, 92).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9779F, 5.4761F, -0.7511F, -1.5669F, 0.9513F, -1.6112F));

		PartDefinition leg4_r1 = leg2.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(11, 50).addBox(1.8F, -3.5F, -1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4465F, 2.5773F, 1.704F, -1.5272F, 1.5184F, -1.5708F));

		PartDefinition leg6_r3 = leg2.addOrReplaceChild("leg6_r3", CubeListBuilder.create().texOffs(67, 6).addBox(-1.0679F, 0.2762F, -0.4687F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, 1.5708F, 1.4399F, 1.501F));

		PartDefinition leg7_r2 = leg2.addOrReplaceChild("leg7_r2", CubeListBuilder.create().texOffs(10, 85).addBox(-0.0371F, -0.6448F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(67, 69).addBox(-0.5371F, -1.7448F, -0.4687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F))
				.texOffs(48, 75).addBox(-1.237F, -1.7448F, -0.4687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, -1.5708F, 1.4835F, -1.6406F));

		PartDefinition leg10_r1 = leg2.addOrReplaceChild("leg10_r1", CubeListBuilder.create().texOffs(59, 91).addBox(-0.4131F, -0.6437F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5465F, -1.8735F, -2.1038F, 1.5708F, 0.8901F, 1.5708F));

		PartDefinition leg10_r2 = leg2.addOrReplaceChild("leg10_r2", CubeListBuilder.create().texOffs(76, 73).addBox(-1.1143F, -1.1498F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5465F, -1.982F, -0.5313F, 1.5708F, -1.2043F, 1.5708F));

		PartDefinition leg9_r1 = leg2.addOrReplaceChild("leg9_r1", CubeListBuilder.create().texOffs(69, 76).addBox(-0.2969F, -0.8027F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5465F, -2.3769F, -1.4821F, 1.5708F, -0.1134F, 1.5708F));

		PartDefinition leg8_r2 = leg2.addOrReplaceChild("leg8_r2", CubeListBuilder.create().texOffs(0, 84).addBox(1.9107F, -1.8661F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(19, 73).addBox(0.9107F, -1.0661F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.5465F, -0.4239F, 0.1027F, 1.5708F, 1.501F, 1.5708F));

		PartDefinition leg7_r3 = leg2.addOrReplaceChild("leg7_r3", CubeListBuilder.create().texOffs(84, 66).addBox(-0.0754F, -1.413F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F))
				.texOffs(73, 28).addBox(-0.0754F, -0.613F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5465F, -0.4239F, 0.1027F, -1.5708F, 1.2915F, -1.5708F));

		PartDefinition leg11_r1 = leg2.addOrReplaceChild("leg11_r1", CubeListBuilder.create().texOffs(95, 24).addBox(-0.9429F, -2.273F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(73, 94).addBox(-0.2429F, -2.273F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, -1.5708F, 1.309F, -1.6406F));

		PartDefinition leg9_r2 = leg2.addOrReplaceChild("leg9_r2", CubeListBuilder.create().texOffs(15, 85).addBox(1.3309F, -0.5205F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, -1.5708F, 0.2182F, -1.6406F));

		PartDefinition leg8_r3 = leg2.addOrReplaceChild("leg8_r3", CubeListBuilder.create().texOffs(51, 81).addBox(-0.3969F, 0.3063F, -0.4687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, -1.5708F, -0.9599F, -1.6406F));

		PartDefinition leg7_r4 = leg2.addOrReplaceChild("leg7_r4", CubeListBuilder.create().texOffs(84, 6).addBox(-1.9272F, 0.3717F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F))
				.texOffs(5, 84).addBox(-1.9272F, 0.1716F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, 1.5708F, -1.3526F, 1.501F));

		PartDefinition leg5_r3 = leg2.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(63, 78).addBox(-1.1847F, -1.5953F, -0.4687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, 1.5708F, -0.2618F, 1.501F));

		PartDefinition leg4_r2 = leg2.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(73, 56).addBox(0.2949F, -1.043F, -0.4687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, 1.5708F, 0.829F, 1.501F));

		PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(61, 28).addBox(-0.3824F, -0.6171F, -0.4687F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-0.5778F, 1.9368F, -1.5337F, 1.5708F, 1.1781F, 1.501F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0487F, -0.575F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1632F, 6.5492F, 0.0815F, -0.1212F, -0.0415F, -0.0973F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0487F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4229F, -2.7873F, -0.261F, 0.0048F, 0.0107F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5092F, 1.8047F, 2.1423F, -0.6936F, -0.507F, 1.0948F));

		PartDefinition upperleg9_r1 = upperleg3.addOrReplaceChild("upperleg9_r1", CubeListBuilder.create().texOffs(91, 55).mirror().addBox(-0.5389F, -3.4554F, 1.5479F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4611F, 3.733F, -0.5478F, -2.3736F, 0.0F, -3.1416F));

		PartDefinition upperleg9_r2 = upperleg3.addOrReplaceChild("upperleg9_r2", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.5389F, -2.9628F, -0.4281F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4611F, 3.733F, -0.5478F, -2.7314F, 0.0F, -3.1416F));

		PartDefinition upperleg8_r3 = upperleg3.addOrReplaceChild("upperleg8_r3", CubeListBuilder.create().texOffs(24, 84).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4372F, 1.1941F, 1.0412F, -3.0718F, 0.0F, -3.1416F));

		PartDefinition upperleg7_r2 = upperleg3.addOrReplaceChild("upperleg7_r2", CubeListBuilder.create().texOffs(91, 85).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4222F, 5.5557F, 0.1283F, -2.522F, 0.0F, -3.1416F));

		PartDefinition upperleg6_r2 = upperleg3.addOrReplaceChild("upperleg6_r2", CubeListBuilder.create().texOffs(47, 71).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4222F, 5.8404F, -0.8611F, -2.9147F, 0.0F, -3.1416F));

		PartDefinition upperleg5_r2 = upperleg3.addOrReplaceChild("upperleg5_r2", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-0.5389F, -0.845F, -0.4707F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4611F, 3.733F, -0.5478F, -2.7402F, 0.0F, -3.1416F));

		PartDefinition upperleg4_r2 = upperleg3.addOrReplaceChild("upperleg4_r2", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(-0.5389F, -3.7138F, -0.601F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4611F, 3.733F, -0.5478F, -2.9147F, 0.0F, -3.1416F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0663F, 6.3087F, -0.5407F, 1.5658F, 1.295F, -0.3769F));

		PartDefinition leg8_r4 = leg3.addOrReplaceChild("leg8_r4", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-0.7341F, -0.1289F, -1.0053F, 1.5598F, -1.3613F, -1.5165F));

		PartDefinition leg7_r5 = leg3.addOrReplaceChild("leg7_r5", CubeListBuilder.create().texOffs(21, 67).mirror().addBox(-0.85F, -3.85F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8623F, 2.8506F, -0.263F, -1.5544F, -1.4312F, 1.5981F));

		PartDefinition leg9_r3 = leg3.addOrReplaceChild("leg9_r3", CubeListBuilder.create().texOffs(64, 91).mirror().addBox(-0.85F, 0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(53, 93).mirror().addBox(-0.85F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6773F, -1.4281F, -0.941F, 1.5682F, -0.4625F, -1.5261F));

		PartDefinition leg7_r6 = leg3.addOrReplaceChild("leg7_r6", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(-0.1F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6924F, -1.1198F, -1.6532F, 1.5554F, -1.4224F, -1.512F));

		PartDefinition leg6_r4 = leg3.addOrReplaceChild("leg6_r4", CubeListBuilder.create().texOffs(14, 70).mirror().addBox(-0.15F, -3.825F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-0.8405F, 2.3151F, -0.9359F, 1.5617F, -1.3177F, -1.5184F));

		PartDefinition leg6_r5 = leg3.addOrReplaceChild("leg6_r5", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9779F, 5.4761F, -0.7511F, -1.5669F, -0.9513F, 1.6112F));

		PartDefinition leg5_r4 = leg3.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(11, 50).mirror().addBox(-2.8F, -3.5F, -1.1F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4465F, 2.5773F, 1.704F, -1.5272F, -1.5184F, 1.5708F));

		PartDefinition leg7_r7 = leg3.addOrReplaceChild("leg7_r7", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(0.0679F, 0.2762F, -0.4687F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, 1.5708F, -1.4399F, -1.501F));

		PartDefinition leg8_r5 = leg3.addOrReplaceChild("leg8_r5", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.9629F, -0.6448F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false)
				.texOffs(67, 69).mirror().addBox(-1.4629F, -1.7448F, -0.4687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false)
				.texOffs(48, 75).mirror().addBox(0.237F, -1.7448F, -0.4687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, -1.5708F, -1.4835F, 1.6406F));

		PartDefinition leg11_r2 = leg3.addOrReplaceChild("leg11_r2", CubeListBuilder.create().texOffs(59, 91).mirror().addBox(-0.5869F, -0.6437F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5465F, -1.8735F, -2.1038F, 1.5708F, -0.8901F, -1.5708F));

		PartDefinition leg11_r3 = leg3.addOrReplaceChild("leg11_r3", CubeListBuilder.create().texOffs(76, 73).mirror().addBox(-0.8857F, -1.1498F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5465F, -1.982F, -0.5313F, 1.5708F, 1.2043F, -1.5708F));

		PartDefinition leg10_r3 = leg3.addOrReplaceChild("leg10_r3", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-1.7031F, -0.8027F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5465F, -2.3769F, -1.4821F, 1.5708F, 0.1134F, -1.5708F));

		PartDefinition leg9_r4 = leg3.addOrReplaceChild("leg9_r4", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-2.9107F, -1.8661F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(19, 73).mirror().addBox(-2.9107F, -1.0661F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.5465F, -0.4239F, 0.1027F, 1.5708F, -1.501F, -1.5708F));

		PartDefinition leg8_r6 = leg3.addOrReplaceChild("leg8_r6", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-0.9246F, -1.413F, -0.8426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(73, 28).mirror().addBox(-1.9246F, -0.613F, -0.8426F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5465F, -0.4239F, 0.1027F, -1.5708F, -1.2915F, 1.5708F));

		PartDefinition leg12_r1 = leg3.addOrReplaceChild("leg12_r1", CubeListBuilder.create().texOffs(95, 24).mirror().addBox(-0.0571F, -2.273F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(73, 94).mirror().addBox(-0.7571F, -2.273F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, -1.5708F, -1.309F, 1.6406F));

		PartDefinition leg10_r4 = leg3.addOrReplaceChild("leg10_r4", CubeListBuilder.create().texOffs(15, 85).mirror().addBox(-2.3309F, -0.5205F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, -1.5708F, -0.2182F, 1.6406F));

		PartDefinition leg9_r5 = leg3.addOrReplaceChild("leg9_r5", CubeListBuilder.create().texOffs(51, 81).mirror().addBox(-0.6031F, 0.3063F, -0.4687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, -1.5708F, 0.9599F, 1.6406F));

		PartDefinition leg8_r7 = leg3.addOrReplaceChild("leg8_r7", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(0.9272F, 0.3717F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false)
				.texOffs(5, 84).mirror().addBox(0.9272F, 0.1716F, -0.4687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, 1.5708F, 1.3526F, -1.501F));

		PartDefinition leg6_r6 = leg3.addOrReplaceChild("leg6_r6", CubeListBuilder.create().texOffs(63, 78).mirror().addBox(0.1847F, -1.5953F, -0.4687F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, 1.5708F, 0.2618F, -1.501F));

		PartDefinition leg5_r5 = leg3.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(73, 56).mirror().addBox(-1.2949F, -1.043F, -0.4687F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, 1.5708F, -0.829F, -1.501F));

		PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-0.6176F, -0.6171F, -0.4687F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(0.5778F, 1.9368F, -1.5337F, 1.5708F, -1.1781F, -1.501F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create().texOffs(19, 0).mirror().addBox(-2.9513F, -0.575F, -2.7509F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1632F, 6.5492F, 0.0815F, -0.4323F, 0.0522F, 0.0395F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-2.9513F, -0.9978F, -4.9636F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4229F, -2.7873F, -0.261F, -0.0048F, -0.0107F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 5).addBox(-0.5F, -0.0008F, -5.0384F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(13, 97).addBox(0.0F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0008F, -2.0384F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(10, 97).addBox(0.0F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0992F, -4.0384F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-1.7728F, -0.0037F, -0.4624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3981F, -3.5645F, -0.1512F, -0.048F, -0.4425F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(79, 71).mirror().addBox(-2.2228F, -0.0037F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3981F, -1.5645F, -0.1548F, -0.2205F, -0.4157F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(82, 30).addBox(-0.2272F, -0.0037F, -0.4624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3981F, -3.5645F, -0.1512F, 0.048F, 0.4425F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 71).addBox(0.2228F, -0.0037F, -0.4124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3981F, -1.5645F, -0.1548F, 0.2205F, 0.4157F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5F, -0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.3992F, -4.9384F, 0.1839F, 0.0858F, 0.0159F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(16, 97).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -5.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 67).addBox(0.0F, -1.275F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2953F, -1.1018F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(39, 58).addBox(0.0F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -4.6261F, 0.1238F, 0.3392F, -0.4062F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -4.6261F, -0.0047F, 0.3603F, -0.7774F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-8.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -4.6261F, -0.1762F, 0.3159F, -1.2846F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(68, 26).mirror().addBox(-6.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -2.6261F, -0.2138F, 0.1901F, -1.294F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -2.6261F, -0.1013F, 0.267F, -0.8072F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(83, 52).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -2.6261F, -0.0015F, 0.2851F, -0.4448F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(84, 18).mirror().addBox(-4.121F, -2.399F, -0.5124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -0.6261F, -0.2589F, 0.0305F, -1.299F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -0.6261F, -0.2169F, 0.1457F, -0.831F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0011F, -0.6261F, -0.1544F, 0.2108F, -0.4824F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(63, 83).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -0.6261F, -0.1544F, -0.2108F, 0.4824F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 24).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -0.6261F, -0.2169F, -0.1457F, 0.831F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(84, 18).addBox(3.121F, -2.399F, -0.5124F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -0.6261F, -0.2589F, -0.0305F, 1.299F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(83, 52).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -2.6261F, -0.0015F, -0.2851F, 0.4448F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(82, 22).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -2.6261F, -0.1013F, -0.267F, 0.8072F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 26).addBox(3.121F, -2.399F, -0.5124F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -2.6261F, -0.2138F, -0.1901F, 1.294F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(83, 50).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -4.6261F, 0.1238F, -0.3392F, 0.4062F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(82, 20).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -4.6261F, -0.0047F, -0.3603F, 0.7774F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(49, 44).addBox(3.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0011F, -4.6261F, -0.1762F, -0.3159F, 1.2846F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.1011F, -6.1261F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.0F, 0.262F, 0.0421F, 0.0113F));

		PartDefinition cube_r94 = body3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 94).addBox(0.0F, -2.7467F, -0.114F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0245F, -6.0431F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(45, 97).addBox(0.0F, -2.1349F, -0.0006F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0245F, -4.1431F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(96, 84).addBox(0.0F, -1.675F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1011F, -2.1261F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(-9.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -5.7261F, -0.2354F, 0.1145F, -1.2973F));

		PartDefinition cube_r98 = body3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(82, 32).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -5.7261F, -0.1568F, 0.2099F, -0.8204F));

		PartDefinition cube_r99 = body3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 82).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -5.7261F, -0.0746F, 0.2506F, -0.4641F));

		PartDefinition cube_r100 = body3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(36, 2).mirror().addBox(-9.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -3.7261F, -0.2258F, 0.1481F, -1.2961F));

		PartDefinition cube_r101 = body3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -3.7261F, -0.1323F, 0.2353F, -0.8149F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(17, 83).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -3.7261F, -0.0423F, 0.2661F, -0.4559F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -1.7261F, -0.0423F, 0.2661F, -0.4559F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(83, 40).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -1.7261F, -0.1323F, 0.2353F, -0.8149F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(41, 12).mirror().addBox(-9.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.2989F, -1.7261F, -0.2258F, 0.1481F, -1.2961F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 12).addBox(3.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -1.7261F, -0.2258F, -0.1481F, 1.2961F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(83, 40).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -1.7261F, -0.1323F, -0.2353F, 0.8149F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(83, 38).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -1.7261F, -0.0423F, -0.2661F, 0.4559F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(17, 83).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -3.7261F, -0.0423F, -0.2661F, 0.4559F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(10, 83).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -3.7261F, -0.1323F, -0.2353F, 0.8149F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(36, 2).addBox(3.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -3.7261F, -0.2258F, -0.1481F, 1.2961F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 82).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -5.7261F, -0.0746F, -0.2506F, 0.4641F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(82, 32).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -5.7261F, -0.1568F, -0.2099F, 0.8204F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(36, 0).addBox(3.121F, -2.399F, -0.5124F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2989F, -5.7261F, -0.2354F, -0.1145F, 1.2973F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0708F, 0.1432F, -6.0884F, -0.1264F, 0.0255F, -0.012F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.4557F, -1.5378F, 0.0398F, 0.3037F, -0.4328F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.4557F, -1.5378F, -0.0697F, 0.2984F, -0.7984F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(45, 10).mirror().addBox(-8.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.4557F, -1.5378F, -0.2015F, 0.2321F, -1.2915F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-7.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.9557F, -3.4378F, -0.2162F, 0.1817F, -1.2945F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-3.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.9557F, -3.4378F, -0.1075F, 0.2607F, -0.8089F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-1.9978F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2708F, 0.9557F, -3.4378F, -0.0097F, 0.2813F, -0.4471F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(49, 40).mirror().addBox(-0.4681F, -0.4777F, -0.9072F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9432F, 6.4049F, -7.3576F, -0.771F, -1.1875F, 0.6873F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(83, 48).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.9557F, -3.4378F, -0.0097F, -0.2813F, 0.4471F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(83, 46).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.9557F, -3.4378F, -0.1075F, -0.2607F, 0.8089F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(60, 42).addBox(3.121F, -2.399F, -0.5124F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.9557F, -3.4378F, -0.2162F, -0.1817F, 1.2945F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(83, 42).addBox(-0.0022F, -0.0037F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.4557F, -1.5378F, 0.0398F, -0.3037F, 0.4328F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(83, 44).addBox(1.8761F, -0.6868F, -0.5124F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.4557F, -1.5378F, -0.0697F, -0.2984F, 0.7984F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(45, 10).addBox(3.121F, -2.399F, -0.5124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, 0.4557F, -1.5378F, -0.2015F, -0.2321F, 1.2915F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(24, 37).addBox(-0.5648F, 0.1395F, 3.1618F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0042F, 1.0055F, -7.1239F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(7, 61).addBox(0.0F, -2.9049F, -0.0095F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0042F, 0.1055F, -2.0239F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 55).addBox(0.0F, -3.2796F, -0.0811F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0042F, 0.5055F, -3.9239F, -0.2007F, -0.0017F, 0.0046F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(49, 40).addBox(-2.5319F, -0.4777F, -0.9072F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 6.4049F, -7.3576F, -0.771F, 1.1875F, -0.6873F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 20).addBox(-2.7999F, -0.366F, -2.0102F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 6.4049F, -7.3576F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(58, 8).addBox(-1.3724F, -0.4559F, -0.5236F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8017F, 6.4049F, -7.3576F, -0.2618F, 0.0F, 0.0F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create().texOffs(78, 81).addBox(-1.0F, 0.9641F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2593F, 4.6812F, -6.7385F, 0.8966F, 0.1485F, -0.7888F));

		PartDefinition cube_r134 = UpperArmL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(35, 37).addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0554F, 4.0605F, -0.2506F, -1.5912F, -1.1883F, -0.1728F));

		PartDefinition cube_r135 = UpperArmL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(78, 47).addBox(-0.5F, -0.7454F, -0.4346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(94, 15).addBox(-0.5F, -0.7546F, -0.7654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5135F, 5.4399F, -0.4264F, 2.5741F, -1.1928F, -0.0861F));

		PartDefinition cube_r136 = UpperArmL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 30).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r137 = UpperArmL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(5, 96).addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r138 = UpperArmL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(20, 96).addBox(-0.4665F, 0.0108F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 96).addBox(-0.4665F, -0.5892F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1585F, 5.283F, -0.1952F, 1.7413F, -0.8218F, -0.2645F));

		PartDefinition cube_r139 = UpperArmL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(53, 76).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r140 = UpperArmL.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(95, 44).addBox(-0.5F, 0.825F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 41).addBox(-0.5F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.7496F, -0.2181F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r141 = UpperArmL.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(81, 55).addBox(-0.5F, 0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.035F, -0.4531F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r142 = UpperArmL.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 76).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.035F, -0.4531F, 0.8727F, 0.0F, 0.0F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6658F, 6.0812F, -0.1323F, -1.9086F, 0.2248F, 0.6413F));

		PartDefinition cube_r143 = LowerArmL.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(34, 64).addBox(-0.5082F, -0.4606F, -0.907F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(61, 56).addBox(-0.5082F, -2.6606F, 0.243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.1918F, 0.0607F, 0.457F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r144 = LowerArmL.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(96, 50).addBox(-0.5F, -1.075F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4475F, -3.5224F, 0.7307F, -2.0944F, 1.1781F, 0.0F));

		PartDefinition cube_r145 = LowerArmL.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(53, 96).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.4959F, -4.1202F, 0.7507F, -1.6581F, 1.1781F, 0.0F));

		PartDefinition cube_r146 = LowerArmL.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(30, 96).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6548F, -3.4672F, 1.2308F, -1.2654F, 1.1781F, 0.0F));

		PartDefinition cube_r147 = LowerArmL.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(40, 96).addBox(-0.5F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.6548F, -2.4672F, 1.2308F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r148 = LowerArmL.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(76, 76).addBox(-0.5F, -2.0F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.9535F, -0.6F, 0.9402F, -0.2618F, 1.1781F, 0.0F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create().texOffs(43, 19).addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0939F, 3.2383F, 0.7319F, 1.435F, -0.1733F, 0.0837F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create().texOffs(40, 49).addBox(-2.0F, -1.0F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(31, 43).addBox(-1.5F, -2.0F, -5.4F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6087F, -1.9028F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r149 = HandL2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(32, 58).addBox(0.1F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -1.0F, -2.9F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r150 = HandL2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(30, 12).addBox(0.1F, -1.0F, -4.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -1.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create().texOffs(78, 81).mirror().addBox(0.0F, 0.9641F, -0.4483F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.4009F, 4.6812F, -6.7385F, 0.4937F, -0.0788F, 1.0452F));

		PartDefinition cube_r151 = UpperArmL2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(35, 37).mirror().addBox(-0.5F, -0.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0554F, 4.0605F, -0.2506F, -1.5912F, 1.1883F, 0.1728F));

		PartDefinition cube_r152 = UpperArmL2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.5F, -0.7454F, -0.4346F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(94, 15).mirror().addBox(-0.5F, -0.7546F, -0.7654F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5135F, 5.4399F, -0.4264F, 2.5741F, 1.1928F, 0.0861F));

		PartDefinition cube_r153 = UpperArmL2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(35, 96).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 30).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.6737F, 1.0068F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r154 = UpperArmL2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.5F, 0.2515F, -0.5952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 5.9134F, 0.1182F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r155 = UpperArmL2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.5335F, 0.0108F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-0.5335F, -0.5892F, -1.221F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1585F, 5.283F, -0.1952F, 1.7413F, 0.8218F, 0.2645F));

		PartDefinition cube_r156 = UpperArmL2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(53, 76).mirror().addBox(-0.5F, -0.05F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 2.9641F, -0.4483F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r157 = UpperArmL2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(95, 44).mirror().addBox(-0.5F, 0.825F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 41).mirror().addBox(-0.5F, -0.175F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.7496F, -0.2181F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r158 = UpperArmL2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(81, 55).mirror().addBox(-0.5F, 0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.035F, -0.4531F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r159 = UpperArmL2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(81, 76).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.035F, -0.4531F, 0.8727F, 0.0F, 0.0F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6658F, 6.0812F, -0.1323F, -1.6481F, 0.0896F, -1.1135F));

		PartDefinition cube_r160 = LowerArmL2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-0.4918F, -0.4606F, -0.907F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(61, 56).mirror().addBox(-0.4918F, -2.6606F, 0.243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.1918F, 0.0607F, 0.457F, 0.0F, -1.1781F, 0.0F));

		PartDefinition cube_r161 = LowerArmL2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(96, 50).mirror().addBox(-0.5F, -1.075F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4475F, -3.5224F, 0.7307F, -2.0944F, -1.1781F, 0.0F));

		PartDefinition cube_r162 = LowerArmL2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(53, 96).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.4959F, -4.1202F, 0.7507F, -1.6581F, -1.1781F, 0.0F));

		PartDefinition cube_r163 = LowerArmL2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(30, 96).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6548F, -3.4672F, 1.2308F, -1.2654F, -1.1781F, 0.0F));

		PartDefinition cube_r164 = LowerArmL2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(-0.5F, -0.975F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-1.6548F, -2.4672F, 1.2308F, 0.0F, -1.1781F, 0.0F));

		PartDefinition cube_r165 = LowerArmL2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(76, 76).mirror().addBox(-0.5F, -2.0F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9535F, -0.6F, 0.9402F, -0.2618F, -1.1781F, 0.0F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-1.5F, -0.4F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0939F, 3.2383F, 0.7319F, 1.3072F, 0.0891F, -0.0607F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create().texOffs(40, 49).mirror().addBox(-1.0F, -1.0F, -1.9F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(31, 43).mirror().addBox(1.5F, -2.0F, -5.4F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r166 = HandL4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(-0.1F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, -1.0F, -2.9F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r167 = HandL4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 12).mirror().addBox(-0.1F, -1.0F, -4.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.0F, -1.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0999F, 2.0642F, -3.4983F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(58, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1637F, -3.2266F, -0.5813F, -0.1342F, 0.0258F, -0.1343F));

		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(86, 69).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2137F, -3.7592F, 0.2635F, 0.5639F, 0.0258F, -0.1343F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(46, 62).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.116F, -3.4153F, 2.2313F, 1.3929F, 0.0258F, -0.1343F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(7, 66).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0345F, -2.6571F, 4.0759F, 2.7456F, 0.0258F, -0.1343F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(68, 32).addBox(-0.5F, 0.6F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(52, 57).addBox(-0.5F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.3287F, -0.2438F, 2.8556F, -2.6649F, 0.0258F, -0.1343F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(86, 76).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2435F, -1.2508F, 4.8098F, -1.9232F, 0.0258F, -0.1343F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(34, 5).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5423F, 1.7651F, 0.6378F, -2.4031F, 0.0258F, -0.1343F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0068F, -1.8771F, 0.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, -2.125F, 0.2171F, 0.0859F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 92).addBox(-1.0068F, 1.0653F, 1.568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, -0.9905F, 0.2171F, 0.0859F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(41, 14).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1385F, 3.6396F, -2.484F, -0.132F, 0.1818F, -0.805F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(40, 43).addBox(-1.0068F, 1.2566F, -3.5046F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, 0.0567F, 0.2171F, 0.0859F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(13, 32).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1806F, -0.4628F, -1.6948F, 0.9915F, 0.0258F, -0.1343F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(22, 43).addBox(-1.0068F, -1.308F, -2.5678F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, 0.7461F, 0.2171F, 0.0859F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(26, 67).addBox(-1.0068F, -0.3167F, -4.1543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, 0.397F, 0.2171F, 0.0859F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(69, 36).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.386F, 3.5147F, -4.9013F, -0.2311F, -0.0119F, -0.8538F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(31, 78).addBox(-1.0068F, 1.965F, -3.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8236F, 0.3212F, -0.7111F, -0.1702F, 0.2171F, 0.0859F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2414F, 2.0642F, -3.4983F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r184 = bone4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(58, 78).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1637F, -3.2266F, -0.5813F, -0.1342F, -0.0258F, 0.1343F));

		PartDefinition cube_r185 = bone4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(86, 69).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2137F, -3.7592F, 0.2635F, 0.5639F, -0.0258F, 0.1343F));

		PartDefinition cube_r186 = bone4.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(46, 62).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.116F, -3.4153F, 2.2313F, 1.3929F, -0.0258F, 0.1343F));

		PartDefinition cube_r187 = bone4.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0345F, -2.6571F, 4.0759F, 2.7456F, -0.0258F, 0.1343F));

		PartDefinition cube_r188 = bone4.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(68, 32).mirror().addBox(-0.5F, 0.6F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(52, 57).mirror().addBox(-0.5F, 0.0F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3287F, -0.2438F, 2.8556F, -2.6649F, -0.0258F, 0.1343F));

		PartDefinition cube_r189 = bone4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2435F, -1.2508F, 4.8098F, -1.9232F, -0.0258F, 0.1343F));

		PartDefinition cube_r190 = bone4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(34, 5).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5423F, 1.7651F, 0.6378F, -2.4031F, -0.0258F, 0.1343F));

		PartDefinition cube_r191 = bone4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(0.0068F, -1.8771F, 0.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, -2.125F, -0.2171F, -0.0859F));

		PartDefinition cube_r192 = bone4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(0.0068F, 1.0653F, 1.568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, -0.9905F, -0.2171F, -0.0859F));

		PartDefinition cube_r193 = bone4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(41, 14).mirror().addBox(0.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1385F, 3.6396F, -2.484F, -0.132F, -0.1818F, 0.805F));

		PartDefinition cube_r194 = bone4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 43).mirror().addBox(0.0068F, 1.2566F, -3.5046F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, 0.0567F, -0.2171F, -0.0859F));

		PartDefinition cube_r195 = bone4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(13, 32).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1806F, -0.4628F, -1.6948F, 0.9915F, -0.0258F, 0.1343F));

		PartDefinition cube_r196 = bone4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(22, 43).mirror().addBox(0.0068F, -1.308F, -2.5678F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, 0.7461F, -0.2171F, -0.0859F));

		PartDefinition cube_r197 = bone4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(0.0068F, -0.3167F, -4.1543F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, 0.397F, -0.2171F, -0.0859F));

		PartDefinition cube_r198 = bone4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(69, 36).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.386F, 3.5147F, -4.9013F, -0.2311F, 0.0119F, 0.8538F));

		PartDefinition cube_r199 = bone4.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(31, 78).mirror().addBox(0.0068F, 1.965F, -3.6738F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8236F, 0.3212F, -0.7111F, -0.1702F, -0.2171F, -0.0859F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0042F, 1.3341F, -3.717F, 0.0088F, 0.1309F, 0.0011F));

		PartDefinition cube_r200 = neck3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(20, 85).addBox(0.5F, -2.9786F, -0.1177F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5965F, -2.0791F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r201 = neck3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-1.6552F, 0.0397F, -1.6747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3332F, -0.2286F, -0.5069F, 0.1943F, 0.3517F, -0.3559F));

		PartDefinition cube_r202 = neck3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(62, 44).addBox(-0.3448F, 0.0397F, -1.6747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -0.5069F, 0.1943F, -0.3517F, 0.3559F));

		PartDefinition cube_r203 = neck3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(53, 67).addBox(-0.0648F, -1.8046F, 2.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -1.975F, -0.4152F, 0.3215F, -0.1384F));

		PartDefinition cube_r204 = neck2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(25, 97).addBox(0.5F, -1.6673F, -0.0184F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5965F, -2.1791F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r205 = neck2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(53, 62).mirror().addBox(-1.6552F, 0.0397F, -1.6747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3332F, -0.2286F, -0.5069F, 0.1943F, 0.3517F, -0.3559F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(53, 62).addBox(-0.3448F, 0.0397F, -1.6747F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.2286F, -0.5069F, 0.1943F, -0.3517F, 0.3559F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(43, 57).addBox(-0.0648F, -1.8046F, 1.876F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0039F, -0.0423F, -2.8208F, 0.7296F, 0.0067F, 0.1232F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.125F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, -3.0913F, -11.2778F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(70, 88).addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2731F, -4.0458F, -15.0342F, -1.8096F, -0.0479F, -0.0044F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(34, 87).addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0574F, -4.0474F, -15.0403F, 3.1242F, -0.0015F, 0.002F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(23, 87).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0581F, -3.9541F, -14.6514F, -1.8064F, -0.0015F, 0.002F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0598F, -3.6609F, -13.907F, -0.3752F, -0.0015F, 0.002F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, -3.4656F, -13.3397F, -0.3316F, -0.0015F, 0.002F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(66, 56).addBox(-0.5F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.061F, -3.1854F, -12.1729F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(68, 22).addBox(-0.5F, -0.575F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0645F, -2.6817F, -11.9242F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(57, 35).addBox(-1.9916F, 0.65F, -0.225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(0, 55).addBox(-1.9916F, 0.25F, -0.225F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0711F, 0.2384F, -1.6143F, -2.6181F, 0.0102F, -0.0063F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(49, 46).addBox(-1.9916F, -0.35F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0711F, 0.2384F, -1.6143F, -3.0108F, 0.0102F, -0.0063F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(52, 14).addBox(-1.9938F, -0.725F, -0.325F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.069F, 0.1427F, -1.3458F, 2.5742F, 0.0102F, -0.0063F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0099F, -1.525F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 49).addBox(-2.0099F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0529F, 0.6379F, -0.075F, 1.9197F, 0.0102F, -0.0063F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 58).addBox(-2.0075F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0553F, -0.3017F, 0.2672F, 1.2216F, 0.0102F, -0.0063F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(51, 0).addBox(-1.9957F, -0.5F, -0.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0671F, -0.4467F, -0.7964F, 0.3489F, 0.0102F, -0.0063F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(50, 32).addBox(-2.0F, -0.925F, -0.95F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0535F, -1.0629F, 0.1539F, 0.9597F, 0.0184F, -0.0064F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(50, 29).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0532F, -1.0629F, 0.3539F, 0.0F, 0.0016F, -0.0017F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(50, 26).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0538F, -1.9063F, 0.8913F, -0.5673F, 0.0016F, -0.0017F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(25, 50).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.0558F, -2.86F, 0.5906F, -1.2654F, 0.0016F, -0.0017F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(10, 88).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.942F, -3.768F, 0.1664F, -2.612F, 0.3545F, 0.3298F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(50, 23).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.058F, -3.7663F, 0.168F, -2.7053F, 0.0016F, -0.0017F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(88, 72).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.942F, -3.7697F, 0.1649F, 2.3495F, 0.01F, -0.4426F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(53, 64).addBox(-1.5F, -1.0F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(25, 64).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -4.6446F, -0.7904F, 2.3998F, 0.0016F, -0.0017F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(60, 38).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9731F, -3.8476F, -1.0722F, 1.3467F, -0.1924F, -1.5389F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.5F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(26, 31).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.061F, -5.0202F, -2.2426F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(11, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -5.1421F, -3.2352F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(86, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -3.3102F, -9.2786F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(74, 68).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -4.2264F, -6.9525F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(69, 73).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -3.4458F, -5.7732F, -2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(45, 4).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -4.9172F, -4.2095F, -2.8711F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(26, 25).addBox(-1.0F, -0.575F, -0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.061F, -4.5256F, -3.683F, -1.3439F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.2692F, -9.2683F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(44, 87).addBox(0.0F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(39, 87).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -7.2895F, 7.0257F, 1.3504F, 0.1255F, 0.5097F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(7, 71).addBox(-1.0F, 0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(51, 52).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6773F, -6.8054F, 6.9005F, 1.3179F, 0.0109F, 0.0422F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(55, 87).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -7.4114F, 6.0331F, -0.106F, 0.061F, 0.5204F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -3.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6901F, -6.1922F, 3.259F, -2.4575F, -1.1428F, -0.4393F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(62, 64).addBox(-1.0F, -1.7598F, 1.253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6855F, -3.569F, 4.6083F, 0.1349F, -0.0698F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(54, 90).addBox(-1.0F, -1.831F, -1.1464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6855F, -3.569F, 4.6083F, -1.0432F, -0.0698F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(46, 67).addBox(-0.7706F, -0.831F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5855F, -4.0888F, 3.8256F, -2.7114F, 0.3484F, 0.1787F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(11, 40).addBox(-0.7456F, -0.8123F, -0.205F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1093F, -3.5719F, 2.7882F, -3.1206F, 0.5662F, 0.2289F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(10, 76).addBox(-1.7956F, -0.8123F, 0.995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 48).addBox(-2.7956F, -0.8123F, -0.605F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6233F, -3.6637F, 1.9177F, -2.652F, 0.2976F, 1.2575F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(93, 72).addBox(-0.7F, 0.4792F, 0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(93, 61).addBox(-0.7F, 0.4792F, -0.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5855F, -2.8888F, 4.8256F, -2.9456F, 0.1745F, 0.0873F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(40, 84).addBox(-0.7F, 0.7593F, -0.5341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(2.5855F, -2.8888F, 4.8256F, -2.5268F, 0.1745F, 0.0873F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(90, 49).addBox(-1.0F, -0.1566F, -1.1373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.6855F, -3.569F, 4.6083F, -2.3086F, -0.0698F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(21, 12).addBox(-1.0F, -0.0035F, -3.0028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6855F, -3.569F, 4.6083F, 2.9269F, -0.0738F, 0.0081F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 48).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6855F, -3.569F, 4.6083F, -2.8758F, -0.0698F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(61, 22).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6901F, -6.7266F, 5.1863F, -2.8758F, -0.051F, 0.1852F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(26, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -7.1864F, 5.0587F, -2.9025F, -0.1279F, 0.482F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(89, 21).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5269F, -5.6514F, 2.4338F, 2.329F, 0.0541F, 0.6026F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(49, 88).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -6.652F, 3.1315F, 2.1589F, -0.1279F, 0.482F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 20).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -6.4956F, 2.3158F, -2.987F, -0.6632F, -1.0217F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(28, 88).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -6.695F, 3.2957F, -3.0184F, 0.1588F, -0.9065F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(60, 52).addBox(-2.7008F, -1.2289F, -0.4737F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3353F, -3.2165F, 1.5911F, -1.278F, 0.9864F, 1.8281F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(89, 66).addBox(0.0056F, -0.995F, -0.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3353F, -3.2165F, 1.5911F, -1.4034F, -0.2988F, 1.5321F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(89, 29).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3459F, -2.255F, 1.8867F, -0.6573F, -1.3683F, 0.6783F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 79).addBox(1.0422F, -0.0199F, -0.9855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2897F, -2.2665F, 0.9161F, 1.4418F, 1.1275F, -1.6766F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(89, 92).addBox(0.1163F, -1.0359F, -0.9855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2897F, -2.2665F, 0.9161F, 1.5129F, -0.3087F, -1.5423F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(18, 60).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2362F, -5.6305F, 2.5822F, 1.4405F, 0.3867F, -1.4871F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(5, 75).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -6.4956F, 2.3158F, 1.8531F, 0.2971F, -0.3718F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(31, 75).addBox(-0.1F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1644F, -3.1446F, -1.4962F, -1.1165F, -1.5051F, -0.4088F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(75, 23).addBox(-0.1F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1644F, -3.1446F, -1.4962F, -2.1761F, -1.4989F, 0.6529F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(93, 95).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1718F, -3.5766F, -4.0729F, -3.0787F, -0.3511F, 1.5082F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(94, 6).addBox(-0.4F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(94, 3).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2384F, -3.6827F, -2.8753F, -3.0825F, -0.0027F, 1.5297F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(58, 94).addBox(-0.6F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(94, 27).addBox(-0.6F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3387F, -2.7335F, -0.5746F, -3.0765F, 0.4328F, 1.5572F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(94, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4368F, -2.342F, 2.5075F, -3.0796F, -0.3076F, 1.5111F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(94, 18).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4127F, -2.1701F, 1.9802F, -3.0816F, -0.1769F, 1.5193F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(94, 64).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3824F, -2.1893F, 1.4815F, -3.0825F, 0.0409F, 1.5323F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(63, 94).addBox(-0.525F, -0.6F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 94).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4081F, -2.4066F, 0.3732F, -3.0811F, 0.2151F, 1.5428F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(76, 52).addBox(-1.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2678F, -3.054F, -1.5504F, -3.0545F, 0.8244F, 1.5938F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(76, 44).addBox(-1.0171F, -0.5F, -0.3264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2822F, -2.8909F, -1.4199F, -3.0797F, 0.3022F, 1.5483F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(0, 93).addBox(-0.0407F, -0.5F, -0.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2822F, -2.8909F, -1.4199F, -3.0825F, -0.0027F, 1.5297F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(75, 31).addBox(-0.3F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.2433F, -3.0283F, -1.982F, -0.0628F, -0.3457F, -1.5904F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(90, 89).addBox(-0.8683F, -0.5F, -0.4157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2822F, -2.8909F, -1.4199F, -2.1761F, -1.4989F, 0.5656F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(20, 90).addBox(-0.575F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(5, 90).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1899F, -3.8933F, -1.6523F, -0.0769F, -0.694F, -1.4752F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 90).addBox(-0.375F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.1372F, -4.1604F, -2.751F, -0.0628F, -0.3457F, -1.5032F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(29, 85).addBox(0.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(85, 26).addBox(-0.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0613F, -5.357F, -5.862F, -0.1413F, 0.3414F, -1.6465F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(86, 34).addBox(-0.3F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2595F, -5.3626F, -5.8885F, -0.6649F, 0.3414F, -1.6465F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(86, 57).addBox(0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(90, 24).addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0218F, -4.3612F, -4.8586F, -0.1863F, 0.7722F, -1.7297F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(83, 95).addBox(-0.1F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0161F, -3.6872F, -4.4277F, -0.0701F, 0.5688F, -1.5623F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(78, 95).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(95, 47).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0884F, -4.1256F, -3.5487F, -0.0591F, 0.0463F, -1.5272F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(85, 89).addBox(-1.0F, -0.9F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 17).addBox(-0.9F, -0.9F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(0.68F, -4.728F, -0.8033F, -0.0591F, 0.0463F, -1.5272F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(25, 53).addBox(-0.9F, -0.1F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3113F, -5.4379F, -0.8118F, 0.0106F, 0.0743F, -0.4782F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(33, 71).addBox(-0.9F, -0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3113F, -5.4379F, -0.8118F, 0.0437F, 0.061F, 0.0027F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8113F, -6.4956F, 2.3158F, 1.9505F, 0.1501F, 0.0596F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(71, 40).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5772F, -4.7176F, -2.6804F, -0.0092F, -0.1043F, -1.4831F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(40, 71).addBox(-0.9F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2078F, -5.371F, -2.109F, -0.093F, -0.0483F, -0.4777F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(72, 12).addBox(-0.9F, -0.925F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5807F, -4.7646F, -3.0703F, -0.0558F, -0.2347F, -1.4811F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(66, 60).addBox(-0.9F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2113F, -5.4546F, -2.9046F, -0.2142F, -0.0988F, -0.4257F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(43, 90).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2142F, -6.2229F, -5.3828F, -2.1421F, 1.0108F, -1.128F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(90, 46).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4397F, -5.9131F, -5.4977F, -2.8569F, -0.4168F, -1.7112F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(90, 43).addBox(-0.7F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4397F, -5.9131F, -5.4977F, -1.7225F, -0.2497F, -1.6579F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(90, 40).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2142F, -6.2229F, -5.3828F, -1.8621F, 0.0033F, -0.6302F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(88, 63).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2142F, -6.2229F, -5.3828F, -1.8127F, 0.1641F, -0.0563F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(33, 90).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1455F, -6.315F, -5.7659F, -1.7338F, 0.1892F, -0.6765F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(65, 88).addBox(-0.7F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1455F, -6.315F, -5.7659F, -1.5831F, 0.2488F, -0.008F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(54, 3).addBox(-1.0F, -0.975F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6773F, -6.7049F, 5.1956F, -1.0997F, -1.0528F, -0.3718F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(89, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8185F, -4.1789F, 10.1564F, -0.5574F, -0.6208F, 0.0083F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(89, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8165F, -5.1326F, 9.8557F, -1.152F, -0.7386F, -0.2933F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(89, 3).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5209F, -5.7413F, 8.7911F, -1.2175F, -1.1036F, -1.9649F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(89, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8143F, -6.0389F, 9.4331F, -2.5594F, -0.6942F, -0.401F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(75, 88).addBox(-1.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(88, 79).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8143F, -6.0389F, 9.4331F, 2.374F, 0.2194F, -0.2306F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(88, 82).addBox(-1.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8143F, -6.0389F, 9.4331F, 2.3495F, 0.01F, -0.4426F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(89, 9).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5031F, -6.6792F, 8.7308F, 1.542F, -0.8999F, 0.4831F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(39, 30).addBox(0.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9538F, -5.9079F, 6.7877F, -1.2118F, -0.5124F, 3.0804F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(39, 24).addBox(0.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5429F, -5.595F, 7.5328F, -1.1808F, -0.6343F, 3.0235F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2098F, -6.341F, 8.1094F, -1.9936F, -0.6146F, -1.9907F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(81, 59).addBox(1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(76, 34).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5525F, -3.7821F, 7.6654F, -1.6054F, -1.1344F, 1.8081F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(26, 75).addBox(0.0F, -0.175F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7355F, -5.0282F, 8.1035F, -2.6612F, -0.4175F, 3.1325F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(89, 12).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.521F, -5.7008F, 8.8117F, 3.0395F, -0.787F, -1.8795F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(89, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8143F, -6.0389F, 9.4331F, 2.4172F, -0.3547F, -0.8264F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(68, 79).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3113F, -6.9139F, 8.4779F, 1.2845F, 0.069F, -0.6107F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(79, 67).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3113F, -6.9139F, 8.4779F, 1.3642F, 0.2111F, -0.0555F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(34, 53).addBox(-1.0F, -0.575F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6773F, -6.7948F, 5.5853F, -1.3441F, -0.0098F, 0.0425F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(90, 37).addBox(-0.8F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5241F, -5.2435F, -4.9076F, -0.1001F, -0.3622F, -1.2889F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(72, 8).addBox(-0.9F, -0.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2125F, -5.9293F, -4.6382F, -0.3473F, -0.145F, -0.3742F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(38, 90).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0998F, -4.9678F, -4.8741F, 1.0196F, -0.2853F, -1.4424F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 95).addBox(-0.9F, -0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5867F, -5.1981F, -4.7104F, -0.0451F, -0.2853F, -1.4424F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(15, 88).addBox(0.0F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8113F, -7.282F, 5.4729F, -1.3735F, -0.1127F, 0.5124F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(80, 89).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.773F, -4.6191F, -0.3487F, 1.4971F, 0.2515F, -1.3954F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(60, 88).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3113F, -5.4926F, -0.5027F, 1.7289F, 0.2096F, -0.4531F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(20, 79).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.6773F, -6.9151F, 5.9722F, -0.1221F, 0.0053F, 0.0433F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2532F, 2.2692F, -9.2683F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(44, 87).mirror().addBox(-1.0F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(39, 87).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -7.2895F, 7.0257F, 1.3504F, -0.1255F, -0.5097F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(0.0F, 0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(51, 52).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6773F, -6.8054F, 6.9005F, 1.3179F, -0.0109F, -0.0422F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -7.4114F, 6.0331F, -0.106F, -0.061F, -0.5204F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(0.0F, -3.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6901F, -6.1922F, 3.259F, -2.4575F, 1.1428F, 0.4393F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(0.0F, -1.7598F, 1.253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6855F, -3.569F, 4.6083F, 0.1349F, 0.0698F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(0.0F, -1.831F, -1.1464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6855F, -3.569F, 4.6083F, -1.0432F, 0.0698F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.2294F, -0.831F, -0.1823F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5855F, -4.0888F, 3.8256F, -2.7114F, -0.3484F, -0.1787F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(11, 40).mirror().addBox(-0.2544F, -0.8123F, -0.205F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1093F, -3.5719F, 2.7882F, -3.1206F, -0.5662F, -0.2289F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.2044F, -0.8123F, 0.995F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 48).mirror().addBox(-0.2044F, -0.8123F, -0.605F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6233F, -3.6637F, 1.9177F, -2.652F, -0.2976F, -1.2575F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(93, 72).mirror().addBox(-0.3F, 0.4792F, 0.1461F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(93, 61).mirror().addBox(-0.3F, 0.4792F, -0.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5855F, -2.8888F, 4.8256F, -2.9456F, -0.1745F, -0.0873F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(-0.3F, 0.7593F, -0.5341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.5855F, -2.8888F, 4.8256F, -2.5268F, -0.1745F, -0.0873F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(0.0F, -0.1566F, -1.1373F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.6855F, -3.569F, 4.6083F, -2.3086F, 0.0698F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(21, 12).mirror().addBox(0.0F, -0.0035F, -3.0028F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6855F, -3.569F, 4.6083F, 2.9269F, 0.0738F, -0.0081F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6855F, -3.569F, 4.6083F, -2.8758F, 0.0698F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(61, 22).mirror().addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6901F, -6.7266F, 5.1863F, -2.8758F, 0.051F, -0.1852F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(26, 71).mirror().addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -7.1864F, 5.0587F, -2.9025F, 0.1279F, -0.482F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(89, 21).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5269F, -5.6514F, 2.4338F, 2.329F, -0.0541F, -0.6026F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(49, 88).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -6.652F, 3.1315F, 2.1589F, 0.1279F, -0.482F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(75, 20).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -6.4956F, 2.3158F, -2.987F, 0.6632F, 1.0217F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(28, 88).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -6.695F, 3.2957F, -3.0184F, -0.1588F, 0.9065F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(60, 52).mirror().addBox(0.7008F, -1.2289F, -0.4737F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3353F, -3.2165F, 1.5911F, -1.278F, -0.9864F, -1.8281F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-1.0056F, -0.995F, -0.4737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3353F, -3.2165F, 1.5911F, -1.4034F, 0.2988F, -1.5321F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 29).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3459F, -2.255F, 1.8867F, -0.6573F, 1.3683F, -0.6783F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(10, 79).mirror().addBox(-2.0422F, -0.0199F, -0.9855F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2897F, -2.2665F, 0.9161F, 1.4418F, -1.1275F, 1.6766F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(89, 92).mirror().addBox(-1.1163F, -1.0359F, -0.9855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2897F, -2.2665F, 0.9161F, 1.5129F, 0.3087F, 1.5423F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(0.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.2362F, -5.6305F, 2.5822F, 1.4405F, -0.3867F, 1.4871F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -6.4956F, 2.3158F, 1.8531F, -0.2971F, 0.3718F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-1.9F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.1644F, -3.1446F, -1.4962F, -1.1165F, 1.5051F, 0.4088F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(75, 23).mirror().addBox(-1.9F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.1644F, -3.1446F, -1.4962F, -2.1761F, 1.4989F, -0.6529F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1718F, -3.5766F, -4.0729F, -3.0787F, 0.3511F, -1.5082F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-0.6F, -0.5F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 3).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2384F, -3.6827F, -2.8753F, -3.0825F, 0.0027F, -1.5297F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(58, 94).mirror().addBox(-0.4F, -0.6F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(94, 27).mirror().addBox(-0.4F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3387F, -2.7335F, -0.5746F, -3.0765F, -0.4328F, -1.5572F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(94, 21).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4368F, -2.342F, 2.5075F, -3.0796F, 0.3076F, -1.5111F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(94, 18).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4127F, -2.1701F, 1.9802F, -3.0816F, 0.1769F, -1.5193F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3824F, -2.1893F, 1.4815F, -3.0825F, -0.0409F, -1.5323F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(63, 94).mirror().addBox(-0.475F, -0.6F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 94).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4081F, -2.4066F, 0.3732F, -3.0811F, -0.2151F, -1.5428F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(76, 52).mirror().addBox(-0.5F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2678F, -3.054F, -1.5504F, -3.0545F, -0.8244F, -1.5938F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.9829F, -0.5F, -0.3264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.2822F, -2.8909F, -1.4199F, -3.0797F, -0.3022F, -1.5483F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(0, 93).mirror().addBox(-0.9593F, -0.5F, -0.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2822F, -2.8909F, -1.4199F, -3.0825F, 0.0027F, -1.5297F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(75, 31).mirror().addBox(-1.7F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.2433F, -3.0283F, -1.982F, -0.0628F, 0.3457F, 1.5904F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-0.1317F, -0.5F, -0.4157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2822F, -2.8909F, -1.4199F, -2.1761F, 1.4989F, -0.5656F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.425F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(5, 90).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.1899F, -3.8933F, -1.6523F, -0.0769F, 0.694F, 1.4752F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.625F, -0.5F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.1372F, -4.1604F, -2.751F, -0.0628F, 0.3457F, 1.5032F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(29, 85).mirror().addBox(-1.0F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(85, 26).mirror().addBox(-0.7F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0613F, -5.357F, -5.862F, -0.1413F, -0.3414F, 1.6465F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-0.7F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2595F, -5.3626F, -5.8885F, -0.6649F, -0.3414F, 1.6465F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(86, 57).mirror().addBox(-1.5F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(90, 24).mirror().addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.0218F, -4.3612F, -4.8586F, -0.1863F, -0.7722F, 1.7297F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.9F, -0.5F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.0161F, -3.6872F, -4.4277F, -0.0701F, -0.5688F, 1.5623F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(78, 95).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(95, 47).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.0884F, -4.1256F, -3.5487F, -0.0591F, -0.0463F, 1.5272F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(85, 89).mirror().addBox(0.0F, -0.9F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(54, 17).mirror().addBox(-0.1F, -0.9F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-0.68F, -4.728F, -0.8033F, -0.0591F, -0.0463F, 1.5272F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-0.1F, -0.1F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3113F, -5.4379F, -0.8118F, 0.0106F, -0.0743F, 0.4782F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-0.1F, -0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3113F, -5.4379F, -0.8118F, 0.0437F, -0.061F, -0.0027F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -6.4956F, 2.3158F, 1.9505F, -0.1501F, -0.0596F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(71, 40).mirror().addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5772F, -4.7176F, -2.6804F, -0.0092F, 0.1043F, 1.4831F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-0.1F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2078F, -5.371F, -2.109F, -0.093F, 0.0483F, 0.4777F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(72, 12).mirror().addBox(-0.1F, -0.925F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5807F, -4.7646F, -3.0703F, -0.0558F, 0.2347F, 1.4811F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(66, 60).mirror().addBox(-0.1F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2113F, -5.4546F, -2.9046F, -0.2142F, 0.0988F, 0.4257F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, -6.2229F, -5.3828F, -2.1421F, -1.0108F, 1.128F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(90, 46).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4397F, -5.9131F, -5.4977F, -2.8569F, 0.4168F, 1.7112F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(90, 43).mirror().addBox(-0.3F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4397F, -5.9131F, -5.4977F, -1.7225F, 0.2497F, 1.6579F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, -6.2229F, -5.3828F, -1.8621F, -0.0033F, 0.6302F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(88, 63).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2142F, -6.2229F, -5.3828F, -1.8127F, -0.1641F, 0.0563F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(33, 90).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1455F, -6.315F, -5.7659F, -1.7338F, -0.1892F, 0.6765F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(65, 88).mirror().addBox(-0.3F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1455F, -6.315F, -5.7659F, -1.5831F, -0.2488F, 0.008F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(54, 3).mirror().addBox(0.0F, -0.975F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6773F, -6.7049F, 5.1956F, -1.0997F, 1.0528F, 0.3718F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8185F, -4.1789F, 10.1564F, -0.5574F, 0.6208F, -0.0083F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8165F, -5.1326F, 9.8557F, -1.152F, 0.7386F, 0.2933F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5209F, -5.7413F, 8.7911F, -1.2175F, 1.1036F, 1.9649F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8143F, -6.0389F, 9.4331F, -2.5594F, 0.6942F, 0.401F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(0.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(88, 79).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8143F, -6.0389F, 9.4331F, 2.374F, -0.2194F, 0.2306F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(0.0F, -1.0F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8143F, -6.0389F, 9.4331F, 2.3495F, -0.01F, 0.4426F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5031F, -6.6792F, 8.7308F, 1.542F, 0.8999F, -0.4831F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(39, 30).mirror().addBox(-2.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9538F, -5.9079F, 6.7877F, -1.2118F, 0.5124F, -3.0804F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-2.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5429F, -5.595F, 7.5328F, -1.1808F, 0.6343F, -3.0235F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2098F, -6.341F, 8.1094F, -1.9936F, 0.6146F, 1.9907F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-2.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(76, 34).mirror().addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5525F, -3.7821F, 7.6654F, -1.6054F, 1.1344F, -1.8081F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(26, 75).mirror().addBox(-1.0F, -0.175F, -0.15F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7355F, -5.0282F, 8.1035F, -2.6612F, 0.4175F, -3.1325F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.521F, -5.7008F, 8.8117F, 3.0395F, 0.787F, 1.8795F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8143F, -6.0389F, 9.4331F, 2.4172F, 0.3547F, 0.8264F));

		PartDefinition cube_r405 = rightFace.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(68, 79).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3113F, -6.9139F, 8.4779F, 1.2845F, -0.069F, 0.6107F));

		PartDefinition cube_r406 = rightFace.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3113F, -6.9139F, 8.4779F, 1.3642F, -0.2111F, 0.0555F));

		PartDefinition cube_r407 = rightFace.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(34, 53).mirror().addBox(0.0F, -0.575F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6773F, -6.7948F, 5.5853F, -1.3441F, 0.0098F, -0.0425F));

		PartDefinition cube_r408 = rightFace.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(90, 37).mirror().addBox(-0.2F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5241F, -5.2435F, -4.9076F, -0.1001F, 0.3622F, 1.2889F));

		PartDefinition cube_r409 = rightFace.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.1F, -0.1F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2125F, -5.9293F, -4.6382F, -0.3473F, 0.145F, 0.3742F));

		PartDefinition cube_r410 = rightFace.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(38, 90).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0998F, -4.9678F, -4.8741F, 1.0196F, 0.2853F, 1.4424F));

		PartDefinition cube_r411 = rightFace.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.1F, -0.95F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5867F, -5.1981F, -4.7104F, -0.0451F, 0.2853F, 1.4424F));

		PartDefinition cube_r412 = rightFace.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-1.0F, -0.575F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8113F, -7.282F, 5.4729F, -1.3735F, 0.1127F, -0.5124F));

		PartDefinition cube_r413 = rightFace.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.773F, -4.6191F, -0.3487F, 1.4971F, -0.2515F, 1.3954F));

		PartDefinition cube_r414 = rightFace.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3113F, -5.4926F, -0.5027F, 1.7289F, -0.2096F, 0.4531F));

		PartDefinition cube_r415 = rightFace.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6773F, -6.9151F, 5.9722F, -0.1221F, -0.0053F, -0.0433F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9287F, -0.8651F, -3.5949F, 1.5967F, 0.0044F, -0.0057F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.1463F, 0.0242F, 0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -2.7316F, -0.2977F, 0.224F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(16, 55).mirror().addBox(-0.1463F, -0.0578F, -2.3368F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -0.4191F, -0.2977F, 0.224F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(83, 63).mirror().addBox(-0.1463F, -0.5255F, 0.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -1.1608F, -0.2977F, 0.224F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-0.1463F, -0.2003F, 0.6162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.8098F, -0.2977F, 0.224F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-0.1463F, -1.0036F, 0.8138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.4171F, -0.2977F, 0.224F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.1463F, -2.0433F, 1.2087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.8062F, -0.2977F, 0.224F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(93, 78).mirror().addBox(-0.1463F, -1.2058F, 0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(86, 60).mirror().addBox(-0.1463F, -0.7058F, 0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.3699F, -0.2977F, 0.224F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(-0.1463F, 0.3968F, -2.8135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(69, 91).mirror().addBox(-0.1463F, -0.2032F, -3.1135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -0.6372F, -0.2977F, 0.224F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(94, 9).mirror().addBox(0.0499F, 0.4295F, -3.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -0.6251F, -0.2403F, 0.1561F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(95, 35).mirror().addBox(-0.1463F, 1.3472F, -1.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(80, 26).mirror().addBox(-0.1463F, 0.3472F, -1.2707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -1.1172F, -0.2977F, 0.224F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.1463F, 1.472F, 0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -1.6844F, -0.2977F, 0.224F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(10, 91).mirror().addBox(0.0499F, 0.5518F, -3.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -0.8869F, -0.2403F, 0.1561F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(0.0499F, -3.7203F, -2.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 0.7014F, -0.2403F, 0.1561F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(95, 38).mirror().addBox(0.0499F, -2.7178F, 3.0581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.1151F, -0.2403F, 0.1561F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(0.0499F, -2.9842F, 3.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(84, 9).mirror().addBox(0.0499F, -2.4092F, 3.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.0453F, -0.2403F, 0.1561F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(41, 80).mirror().addBox(0.8177F, 3.4852F, 2.6633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -2.8301F, -0.1353F, 0.0376F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(0.8177F, 4.494F, 3.5364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -3.0047F, -0.1353F, 0.0376F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(0.8177F, 2.5418F, -7.3745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -1.2593F, -0.1353F, 0.0376F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(0.8177F, -7.3758F, -4.7448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 0.1369F, -0.1353F, 0.0376F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(73, 81).mirror().addBox(0.8177F, -8.1376F, -2.7419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(91, 32).mirror().addBox(0.8177F, -6.5377F, -2.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 0.3987F, -0.1353F, 0.0376F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(38, 75).mirror().addBox(0.8177F, 2.8752F, 1.7373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, -2.7429F, -0.1353F, 0.0376F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(0.0499F, -1.7321F, 3.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(61, 85).mirror().addBox(0.0499F, -1.3321F, 2.5736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(66, 85).mirror().addBox(0.0499F, -1.3821F, 3.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.2198F, -0.2403F, 0.1561F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(84, 3).mirror().addBox(0.0499F, -1.4026F, 2.8712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.3071F, -0.2403F, 0.1561F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(0.7965F, -5.7515F, 6.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.5873F, -0.1374F, 0.0158F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(94, 12).mirror().addBox(0.731F, -6.336F, 6.1917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(15, 94).mirror().addBox(0.731F, -6.336F, 6.5917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.4992F, -0.137F, 0.0258F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(0.6677F, -3.315F, 7.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.8735F, -0.1353F, 0.0376F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(0.0499F, -2.259F, 3.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.0016F, -0.2403F, 0.1561F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(20, 93).mirror().addBox(0.8177F, -2.2435F, 3.9609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 93).mirror().addBox(0.8177F, -2.1435F, 4.6609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 93).mirror().addBox(0.8177F, -2.1435F, 5.3359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.0132F, -0.1353F, 0.0376F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(83, 73).mirror().addBox(0.7177F, -2.4945F, 5.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 80).mirror().addBox(0.7177F, -2.4945F, 6.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(83, 83).mirror().addBox(0.7186F, -2.458F, 8.1066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 1.9434F, -0.1353F, 0.0376F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(95, 88).mirror().addBox(-0.1595F, -0.5016F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 0.1627F, 0.0814F, -1.5716F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(76, 64).mirror().addBox(-0.5246F, -0.5016F, -0.4181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 2.905F, 0.811F, 1.3836F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.7012F, -0.5016F, -0.9648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(76, 85).mirror().addBox(-0.7762F, -0.5016F, -0.6648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 0.2481F, -0.8534F, -1.7736F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-0.4482F, -0.5016F, -0.329F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 2.9666F, 0.3834F, 1.4906F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(48, 91).mirror().addBox(-0.5499F, -0.5016F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(84, 15).mirror().addBox(-0.8499F, -0.5016F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 0.6369F, 1.2959F, -0.9662F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(68, 94).mirror().addBox(-0.7193F, -0.5016F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.2733F, -6.6387F, -4.2614F, 2.7751F, 1.1035F, 1.2264F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(0.7341F, 3.1431F, 8.1344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 2.5556F, -0.1558F, 0.0214F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(0.731F, -9.8159F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.2759F, -0.1997F, -0.1888F, 0.5829F, -0.137F, 0.0258F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(83, 63).addBox(-0.8537F, -0.5255F, 0.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -1.1608F, 0.2977F, -0.224F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(91, 32).addBox(-1.8177F, -6.5377F, -2.7419F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(73, 81).addBox(-1.8177F, -8.1376F, -2.7419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 0.3987F, 0.1353F, -0.0376F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(84, 15).addBox(-0.1501F, -0.5016F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 91).addBox(-0.4501F, -0.5016F, -0.1806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 0.6369F, -1.2959F, 0.9662F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(95, 88).addBox(-0.8405F, -0.5016F, -0.687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 0.1627F, -0.0814F, 1.5716F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(68, 94).addBox(-0.2807F, -0.5016F, -0.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 2.7751F, -1.1035F, -1.2264F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(76, 64).addBox(-1.4754F, -0.5016F, -0.4181F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 2.905F, -0.811F, -1.3836F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(76, 85).addBox(-0.2238F, -0.5016F, -0.6648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F))
				.texOffs(71, 85).addBox(-0.2988F, -0.5016F, -0.9648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 0.2481F, 0.8534F, 1.7736F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(17, 76).addBox(-1.5518F, -0.5016F, -0.329F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.7097F, -6.6387F, -4.2614F, 2.9666F, -0.3834F, -1.4906F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(72, 0).addBox(-1.6677F, -3.315F, 7.01F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.8735F, 0.1353F, -0.0376F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(91, 52).addBox(-1.731F, -9.8159F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 0.5829F, 0.137F, -0.0258F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(15, 94).addBox(-1.731F, -6.336F, 6.5917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(94, 12).addBox(-1.731F, -6.336F, 6.1917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.4992F, 0.137F, -0.0258F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(10, 94).addBox(-1.7965F, -5.7515F, 6.2766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.5873F, 0.1374F, -0.0158F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(25, 94).addBox(-1.8177F, -7.3758F, -4.7448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 0.1369F, 0.1353F, -0.0376F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(72, 16).addBox(-1.8177F, 2.5418F, -7.3745F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -1.2593F, 0.1353F, -0.0376F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(25, 91).addBox(-1.8177F, 4.494F, 3.5364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -3.0047F, 0.1353F, -0.0376F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(38, 75).addBox(-1.8177F, 2.8752F, 1.7373F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -2.7429F, 0.1353F, -0.0376F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(41, 80).addBox(-1.8177F, 3.4852F, 2.6633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -2.8301F, 0.1353F, -0.0376F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(84, 3).addBox(-1.0499F, -1.4026F, 2.8712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.3071F, 0.2403F, -0.1561F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(61, 85).addBox(-1.0499F, -1.3321F, 2.5736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(66, 85).addBox(-1.0499F, -1.3821F, 3.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 0).addBox(-1.0499F, -1.7321F, 3.2736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.2198F, 0.2403F, -0.1561F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(30, 82).addBox(-1.7341F, 3.1431F, 8.1344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.5556F, 0.1558F, -0.0214F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(83, 83).addBox(-1.7186F, -2.458F, 8.1066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 80).addBox(-1.7177F, -2.4945F, 6.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(83, 73).addBox(-1.7177F, -2.4945F, 5.8383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.9434F, 0.1353F, -0.0376F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(35, 93).addBox(-1.8177F, -2.1435F, 5.3359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 93).addBox(-1.8177F, -2.1435F, 4.6609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 93).addBox(-1.8177F, -2.2435F, 3.9609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.0132F, 0.1353F, -0.0376F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(84, 12).addBox(-1.0499F, -2.259F, 3.5899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.0016F, 0.2403F, -0.1561F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(84, 9).addBox(-1.0499F, -2.4092F, 3.6445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(15, 91).addBox(-1.0499F, -2.9842F, 3.5694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.0453F, 0.2403F, -0.1561F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(95, 38).addBox(-1.0499F, -2.7178F, 3.0581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.1151F, 0.2403F, -0.1561F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(50, 85).addBox(-1.0499F, -3.7203F, -2.1844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 0.7014F, 0.2403F, -0.1561F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(94, 9).addBox(-1.0499F, 0.4295F, -3.4272F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -0.6251F, 0.2403F, -0.1561F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(5, 93).addBox(-0.8537F, 1.472F, 0.1925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -1.6844F, 0.2977F, -0.224F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(80, 26).addBox(-0.8537F, 0.3472F, -1.2707F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F))
				.texOffs(95, 35).addBox(-0.8537F, 1.3472F, -1.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -1.1172F, 0.2977F, -0.224F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(10, 91).addBox(-1.0499F, 0.5518F, -3.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -0.8869F, 0.2403F, -0.1561F));

		PartDefinition cube_r483 = jaw.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(69, 91).addBox(-0.8537F, -0.2032F, -3.1135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(93, 81).addBox(-0.8537F, 0.3968F, -2.8135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -0.6372F, 0.2977F, -0.224F));

		PartDefinition cube_r484 = jaw.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(16, 55).addBox(-0.8537F, -0.0578F, -2.3368F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -0.4191F, 0.2977F, -0.224F));

		PartDefinition cube_r485 = jaw.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(86, 60).addBox(-0.8537F, -0.7058F, 0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F))
				.texOffs(93, 78).addBox(-0.8537F, -1.2058F, 0.9318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.3699F, 0.2977F, -0.224F));

		PartDefinition cube_r486 = jaw.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(79, 4).addBox(-0.8537F, -2.0433F, 1.2087F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 1.8062F, 0.2977F, -0.224F));

		PartDefinition cube_r487 = jaw.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(79, 12).addBox(-0.8537F, -1.0036F, 0.8138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.4171F, 0.2977F, -0.224F));

		PartDefinition cube_r488 = jaw.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(72, 4).addBox(-0.8537F, -0.2003F, 0.6162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, 2.8098F, 0.2977F, -0.224F));

		PartDefinition cube_r489 = jaw.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(40, 93).addBox(-0.8537F, 0.0242F, 0.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(0.2929F, -0.1997F, -0.1888F, -2.7316F, 0.2977F, -0.224F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 50).addBox(-0.5F, -0.4281F, 2.0037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2726F, 0.5817F, 2.9695F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition cube_r490 = tail.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(70, 97).addBox(0.0F, -1.175F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 97).addBox(0.0F, -0.875F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3531F, 3.0037F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r491 = tail.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(46, 40).addBox(0.0F, -0.275F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5746F, 4.5287F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r492 = tail.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(67, 97).addBox(0.0F, -0.475F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7906F, 2.552F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r493 = tail.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(11, 46).mirror().addBox(-1.5015F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0469F, 1.0037F, -0.0239F, 0.0657F, -0.3521F));

		PartDefinition cube_r494 = tail.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(11, 46).addBox(-0.4985F, 0.025F, 1.0349F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0469F, 1.0037F, -0.0239F, -0.0657F, 0.3521F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, -0.9731F, -0.061F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.5469F, 5.0037F, 0.2464F, -0.127F, -0.0318F));

		PartDefinition cube_r495 = tail7.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(61, 97).addBox(0.0F, -0.6074F, -0.2891F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8981F, 3.2389F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r496 = tail7.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(58, 97).addBox(0.0F, -0.877F, 0.0642F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8981F, 0.839F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r497 = tail7.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(96, 75).addBox(0.0F, -0.575F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1626F, 3.5767F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r498 = tail7.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(36, 50).addBox(0.0F, -0.175F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0957F, 1.483F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 17).addBox(-0.5F, -0.9601F, 0.0013F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0022F, 4.8599F, 0.2768F, -0.2101F, -0.0592F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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