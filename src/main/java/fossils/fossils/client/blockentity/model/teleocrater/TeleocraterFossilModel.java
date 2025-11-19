package fossils.fossils.client.blockentity.model.teleocrater;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TeleocraterFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Body2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Neck8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart RArm;
	private final ModelPart RArm2;
	private final ModelPart RHand;
	private final ModelPart RHand2;
	private final ModelPart RArm3;
	private final ModelPart RArm4;
	private final ModelPart RHand3;
	private final ModelPart RHand4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart digit;
	private final ModelPart digit2;
	private final ModelPart RFoot;
	private final ModelPart RFoot2;
	private final ModelPart RLeg4;
	private final ModelPart RLeg5;
	private final ModelPart RLeg6;
	private final ModelPart digit3;
	private final ModelPart digit4;
	private final ModelPart RFoot3;
	private final ModelPart RFoot4;

	public TeleocraterFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone4 = this.hips.getChild("bone4");
		this.Body = this.hips.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Body2 = this.body4.getChild("Body2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Neck = this.Body2.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.neck4 = this.Neck2.getChild("neck4");
		this.Neck3 = this.neck4.getChild("Neck3");
		this.Neck5 = this.Neck3.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Neck8 = this.Neck7.getChild("Neck8");
		this.Head = this.Neck8.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.RArm = this.Body2.getChild("RArm");
		this.RArm2 = this.RArm.getChild("RArm2");
		this.RHand = this.RArm2.getChild("RHand");
		this.RHand2 = this.RHand.getChild("RHand2");
		this.RArm3 = this.Body2.getChild("RArm3");
		this.RArm4 = this.RArm3.getChild("RArm4");
		this.RHand3 = this.RArm4.getChild("RHand3");
		this.RHand4 = this.RHand3.getChild("RHand4");
		this.Tail = this.hips.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.RLeg = this.hips.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.digit = this.RLeg3.getChild("digit");
		this.digit2 = this.digit.getChild("digit2");
		this.RFoot = this.RLeg3.getChild("RFoot");
		this.RFoot2 = this.RFoot.getChild("RFoot2");
		this.RLeg4 = this.hips.getChild("RLeg4");
		this.RLeg5 = this.RLeg4.getChild("RLeg5");
		this.RLeg6 = this.RLeg5.getChild("RLeg6");
		this.digit3 = this.RLeg6.getChild("digit3");
		this.digit4 = this.digit3.getChild("digit4");
		this.RFoot3 = this.RLeg6.getChild("RFoot3");
		this.RFoot4 = this.RFoot3.getChild("RFoot4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.7891F, -2.2147F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F))
				.texOffs(30, 50).addBox(0.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(30, 50).mirror().addBox(-1.5F, -0.2891F, -1.2147F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -16.1673F, 6.2135F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 27).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 2.7853F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 93).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7891F, 0.7853F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, -1.85F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8107F, -1.2112F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0477F, -0.8895F, 1.4434F, 0.0523F, -0.0027F, 0.0523F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 74).addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.2618F, -0.4988F, -0.4083F, 0.3054F, 0.0F, -0.1745F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 74).addBox(-0.5868F, 0.0009F, -0.9604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(-0.1705F, -0.481F, 0.6284F, -0.0557F, 0.0391F, -0.1701F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 56).addBox(-0.9F, -0.922F, 0.0767F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.475F, 1.3762F, -1.4615F, 0.288F, 0.0F, -0.1745F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 9).addBox(-0.9254F, 3.107F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.067F, 3.2688F, -3.4382F, -0.0639F, 0.0445F, 0.2446F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 83).addBox(-0.9254F, 1.4599F, -0.2591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.067F, 3.2688F, -3.4382F, -0.1861F, 0.0445F, 0.2446F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 83).addBox(-0.8116F, -0.2072F, 0.1105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.067F, 3.2688F, -3.4382F, -0.4071F, 0.0528F, 0.314F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 83).addBox(-0.8116F, -0.2041F, -0.1462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.067F, 3.2688F, -3.4382F, -0.25F, 0.0528F, 0.314F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(5, 90).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 89).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2335F, 2.3113F, -3.0159F, -0.439F, -0.0352F, 0.1531F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(55, 86).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.0811F, 0.5261F, -1.2966F, -0.3316F, 0.0F, -0.1745F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 54).addBox(-0.9F, -1.5602F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.475F, 1.3762F, -1.4615F, 0.3054F, 0.0F, -0.1745F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(85, 81).addBox(-0.4488F, -0.4992F, 1.5763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.7052F, 4.0299F, 0.8669F, 2.568F, -0.052F, 0.1921F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 0).addBox(-0.4488F, -1.5404F, 0.5746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.7052F, 4.0299F, 0.8669F, 1.6517F, -0.052F, 0.1921F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 49).addBox(-0.7743F, -0.7433F, 2.87F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(74, 4).addBox(-0.7743F, -0.7433F, 1.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(-0.0552F, 3.3299F, 0.2669F, -0.9096F, -0.2062F, 0.3531F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 25).addBox(-0.7743F, -0.5396F, -0.0835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0552F, 3.3299F, 0.2669F, -0.8049F, -0.2062F, 0.3531F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 52).addBox(-0.7743F, -0.6719F, -0.0894F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0552F, 3.3299F, 0.2669F, -0.7699F, -0.2062F, 0.3531F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 84).addBox(-0.4488F, -0.2896F, -1.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F))
				.texOffs(85, 78).addBox(-0.4488F, -0.2896F, -2.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.7052F, 4.0299F, 0.8669F, -1.2281F, -0.052F, 0.1921F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(68, 43).addBox(-0.5F, -0.675F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(-0.2846F, 2.6337F, -1.0187F, 2.9234F, 0.0F, 0.1571F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.4426F, 3.6318F, -0.6226F, -1.6144F, 0.0F, 0.1571F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 74).addBox(-1.1F, -0.3063F, -1.1595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.55F, 1.2F, -0.5F, 0.2182F, 0.0F, 0.1571F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(69, 66).addBox(-1.1F, 0.0687F, -1.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.55F, 1.2F, -0.5F, -0.7767F, 0.0F, 0.1571F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0477F, -0.8895F, 1.4434F, 0.0523F, 0.0027F, -0.0523F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-0.5F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.2618F, -0.4988F, -0.4083F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r25 = bone4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(50, 74).mirror().addBox(-0.4132F, 0.0009F, -0.9604F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(0.1705F, -0.481F, 0.6284F, -0.0557F, -0.0391F, 0.1701F));

		PartDefinition cube_r26 = bone4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.1F, -0.922F, 0.0767F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 1.3762F, -1.4615F, 0.288F, 0.0F, 0.1745F));

		PartDefinition cube_r27 = bone4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 9).mirror().addBox(-0.0746F, 3.107F, -0.6554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.067F, 3.2688F, -3.4382F, -0.0639F, -0.0445F, -0.2446F));

		PartDefinition cube_r28 = bone4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.0746F, 1.4599F, -0.2591F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.067F, 3.2688F, -3.4382F, -0.1861F, -0.0445F, -0.2446F));

		PartDefinition cube_r29 = bone4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.1885F, -0.2072F, 0.1105F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.067F, 3.2688F, -3.4382F, -0.4071F, -0.0528F, -0.314F));

		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.1885F, -0.2041F, -0.1462F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.067F, 3.2688F, -3.4382F, -0.25F, -0.0528F, -0.314F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(75, 89).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2335F, 2.3113F, -3.0159F, -0.439F, 0.0352F, -0.1531F));

		PartDefinition cube_r32 = bone4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 86).mirror().addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.0811F, 0.5261F, -1.2966F, -0.3316F, 0.0F, 0.1745F));

		PartDefinition cube_r33 = bone4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-0.1F, -1.5602F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 1.3762F, -1.4615F, 0.3054F, 0.0F, 0.1745F));

		PartDefinition cube_r34 = bone4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.5512F, -0.4992F, 1.5763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.7052F, 4.0299F, 0.8669F, 2.568F, 0.052F, -0.1921F));

		PartDefinition cube_r35 = bone4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5512F, -1.5404F, 0.5746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.7052F, 4.0299F, 0.8669F, 1.6517F, 0.052F, -0.1921F));

		PartDefinition cube_r36 = bone4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 49).mirror().addBox(-0.2257F, -0.7433F, 2.87F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(74, 4).mirror().addBox(-0.2257F, -0.7433F, 1.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(0.0552F, 3.3299F, 0.2669F, -0.9096F, 0.2062F, -0.3531F));

		PartDefinition cube_r37 = bone4.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 25).mirror().addBox(-0.2257F, -0.5396F, -0.0835F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0552F, 3.3299F, 0.2669F, -0.8049F, 0.2062F, -0.3531F));

		PartDefinition cube_r38 = bone4.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 52).mirror().addBox(-0.2257F, -0.6719F, -0.0894F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0552F, 3.3299F, 0.2669F, -0.7699F, 0.2062F, -0.3531F));

		PartDefinition cube_r39 = bone4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.5512F, -0.2896F, -1.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.019F)).mirror(false)
				.texOffs(85, 78).mirror().addBox(-0.5512F, -0.2896F, -2.3118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.7052F, 4.0299F, 0.8669F, -1.2281F, 0.052F, -0.1921F));

		PartDefinition cube_r40 = bone4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(-0.5F, -0.675F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.2846F, 2.6337F, -1.0187F, 2.9234F, 0.0F, -0.1571F));

		PartDefinition cube_r41 = bone4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.4426F, 3.6318F, -0.6226F, -1.6144F, 0.0F, -0.1571F));

		PartDefinition cube_r42 = bone4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 74).mirror().addBox(0.1F, -0.3063F, -1.1595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, 0.2182F, 0.0F, -0.1571F));

		PartDefinition cube_r43 = bone4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(0.1F, 0.0687F, -1.1095F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-0.55F, 1.2F, -0.5F, -0.7767F, 0.0F, -0.1571F));

		PartDefinition Body = hips.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1891F, -1.9147F, 0.1506F, -0.1726F, -0.0261F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(58, 95).addBox(0.0F, -1.8981F, -0.9786F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6845F, -0.1374F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(11, 93).addBox(0.0F, -1.8981F, 0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1577F, -3.0995F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(55, 95).addBox(0.0F, -1.6231F, 0.0214F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4794F, -5.0749F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.9495F, -0.2087F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, -0.5025F, -5.0134F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(6, 95).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1018F, -0.0605F, -1.2872F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 94).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2074F, -0.6101F, -0.1173F, -0.016F, -0.8879F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, -0.0334F, 0.0793F, -1.6113F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(94, 52).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0019F, 0.086F, -1.191F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(94, 10).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6074F, -2.5101F, 0.0354F, 0.0784F, -0.7883F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.1022F, 0.0819F, -0.6853F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0621F, 0.1153F, -1.0873F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-3.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9074F, -4.5101F, 0.0096F, 0.1305F, -1.5092F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(6, 95).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1018F, 0.0605F, 1.2872F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 94).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2074F, -0.6101F, -0.1173F, 0.016F, 0.8879F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(94, 54).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, -0.0334F, -0.0793F, 1.6113F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(94, 52).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0019F, -0.086F, 1.191F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(94, 10).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6074F, -2.5101F, 0.0354F, -0.0784F, 0.7883F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 95).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.1022F, -0.0819F, 0.6853F));

		PartDefinition cube_r62 = Body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 39).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0621F, -0.1153F, 1.0873F));

		PartDefinition cube_r63 = Body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 8).addBox(1.5955F, -1.1381F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9074F, -4.5101F, 0.0096F, -0.1305F, 1.5092F));

		PartDefinition cube_r64 = Body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 34).addBox(-1.5F, -5.4851F, 0.0522F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 9.7555F, -6.5678F, -0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.129F, -5.0401F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 93).addBox(0.0F, -1.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -1.5804F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.302F, -3.5804F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.3029F, 0.225F, -0.62F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.1916F, 0.3247F, -1.0245F));

		PartDefinition cube_r69 = body3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(72, 14).mirror().addBox(-4.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1951F, -1.4967F, 0.0377F, 0.3734F, -1.4677F));

		PartDefinition cube_r70 = body3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 67).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.0506F, 0.4247F, -1.4105F));

		PartDefinition cube_r71 = body3.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(93, 86).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.2265F, 0.3658F, -0.9605F));

		PartDefinition cube_r72 = body3.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(93, 74).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3951F, -3.4967F, 0.3506F, 0.2499F, -0.5567F));

		PartDefinition cube_r73 = body3.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(94, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.3029F, -0.225F, 0.62F));

		PartDefinition cube_r74 = body3.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(46, 12).addBox(-1.5F, -1.8987F, -4.0193F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 7.4298F, -0.0046F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body3.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(93, 88).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.1916F, -0.3247F, 1.0245F));

		PartDefinition cube_r76 = body3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(72, 14).addBox(1.5955F, -1.1381F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1951F, -1.4967F, 0.0377F, -0.3734F, 1.4677F));

		PartDefinition cube_r77 = body3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(27, 67).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.0506F, -0.4247F, 1.4105F));

		PartDefinition cube_r78 = body3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(93, 86).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.2265F, -0.3658F, 0.9605F));

		PartDefinition cube_r79 = body3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 74).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3951F, -3.4967F, 0.3506F, -0.2499F, 0.5567F));

		PartDefinition cube_r80 = body3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(46, 26).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.9F, -5.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3983F, -4.9751F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r81 = body4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 92).addBox(0.0F, -1.725F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1188F, -4.053F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 92).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1885F, -3.0555F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(18, 58).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3281F, -1.0603F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-7.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4332F, -4.4874F, 0.0853F, 0.5253F, -1.3433F));

		PartDefinition cube_r85 = body4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(95, 76).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4332F, -4.4874F, 0.4506F, 0.2923F, -0.4785F));

		PartDefinition cube_r86 = body4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(95, 71).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4332F, -4.4874F, 0.3049F, 0.4425F, -0.8783F));

		PartDefinition cube_r87 = body4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.0554F, 0.4061F, -1.3568F));

		PartDefinition cube_r88 = body4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(96, 2).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.2221F, 0.3472F, -0.9102F));

		PartDefinition cube_r89 = body4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1832F, -0.5374F, 0.3392F, 0.2344F, -0.5076F));

		PartDefinition cube_r90 = body4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3332F, -2.4874F, 0.4024F, 0.2679F, -0.4919F));

		PartDefinition cube_r91 = body4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(67, 95).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3332F, -2.4874F, 0.2686F, 0.4019F, -0.8932F));

		PartDefinition cube_r92 = body4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3332F, -2.4874F, 0.072F, 0.4743F, -1.3497F));

		PartDefinition cube_r93 = body4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 4).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.0554F, -0.4061F, 1.3568F));

		PartDefinition cube_r94 = body4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(96, 2).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.2221F, -0.3472F, 0.9102F));

		PartDefinition cube_r95 = body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(96, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1832F, -0.5374F, 0.3392F, -0.2344F, 0.5076F));

		PartDefinition cube_r96 = body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(95, 71).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4332F, -4.4874F, 0.3049F, -0.4425F, 0.8783F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(95, 76).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4332F, -4.4874F, 0.4506F, -0.2923F, 0.4785F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(48, 7).addBox(1.5955F, -1.1381F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4332F, -4.4874F, 0.0853F, -0.5253F, 1.3433F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(95, 69).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3332F, -2.4874F, 0.4024F, -0.2679F, 0.4919F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(67, 95).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3332F, -2.4874F, 0.2686F, -0.4019F, 0.8932F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 9).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3332F, -2.4874F, 0.072F, -0.4743F, 1.3497F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 44).addBox(-1.0F, -1.9746F, -5.0919F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 7.4051F, 0.511F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(46, 19).addBox(-0.5F, -0.9F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Body2 = body4.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3978F, -4.9534F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition cube_r104 = Body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(20, 93).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4033F, -1.5968F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 92).addBox(0.0F, -1.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1853F, -4.0347F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r106 = Body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(40, 42).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2877F, 5.6499F, -1.3416F, -0.2249F, -0.3378F, 0.4293F));

		PartDefinition cube_r107 = Body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 50).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2877F, 5.6499F, -1.3416F, -0.1889F, -0.5265F, 0.4682F));

		PartDefinition cube_r108 = Body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-0.4942F, -0.1449F, -0.3439F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2604F, 5.7843F, -1.4589F, -0.0617F, -0.9968F, 0.562F));

		PartDefinition cube_r109 = Body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(29, 93).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -3.5101F, 0.6908F, 0.3826F, -0.3458F));

		PartDefinition cube_r110 = Body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -3.5101F, 0.5082F, 0.6121F, -0.7226F));

		PartDefinition cube_r111 = Body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-5.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4926F, -3.5101F, 0.1799F, 0.7572F, -1.2335F));

		PartDefinition cube_r112 = Body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(96, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2426F, -1.5351F, 0.5659F, 0.3466F, -0.4423F));

		PartDefinition cube_r113 = Body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(61, 17).mirror().addBox(-6.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2426F, -1.5351F, 0.1197F, 0.6441F, -1.3243F));

		PartDefinition cube_r114 = Body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2426F, -1.5351F, 0.3955F, 0.5349F, -0.8357F));

		PartDefinition cube_r115 = Body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(40, 42).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2877F, 5.6499F, -1.3416F, -0.2249F, 0.3378F, -0.4293F));

		PartDefinition cube_r116 = Body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(43, 50).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2877F, 5.6499F, -1.3416F, -0.1889F, 0.5265F, -0.4682F));

		PartDefinition cube_r117 = Body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(57, 44).addBox(-0.5058F, -0.1449F, -0.3439F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2604F, 5.7843F, -1.4589F, -0.0617F, 0.9968F, -0.562F));

		PartDefinition cube_r118 = Body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(62, 38).addBox(-0.5959F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0959F, 5.6013F, -3.4552F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r119 = Body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(67, 49).addBox(-1.0959F, -1.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0959F, 5.0013F, -4.4944F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r120 = Body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(29, 93).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -3.5101F, 0.6908F, -0.3826F, 0.3458F));

		PartDefinition cube_r121 = Body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(93, 6).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -3.5101F, 0.5082F, -0.6121F, 0.7226F));

		PartDefinition cube_r122 = Body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(63, 6).addBox(1.5955F, -1.1381F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4926F, -3.5101F, 0.1799F, -0.7572F, 1.2335F));

		PartDefinition cube_r123 = Body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2426F, -1.5351F, 0.5659F, -0.3466F, 0.4423F));

		PartDefinition cube_r124 = Body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 17).addBox(1.5955F, -1.1381F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2426F, -1.5351F, 0.1197F, -0.6441F, 1.3243F));

		PartDefinition cube_r125 = Body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(96, 4).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2426F, -1.5351F, 0.3955F, -0.5349F, 0.8357F));

		PartDefinition cube_r126 = Body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(56, 50).addBox(-0.5F, -1.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 1.8975F, -7.8134F, 0.1571F, 0.0F, 0.0F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 3.8575F, -3.4008F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(62, 33).addBox(-0.4F, -0.7896F, 1.4512F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.6342F, -0.0072F, 0.9765F, -0.1264F, -0.264F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(88, 33).addBox(-1.0F, -1.3033F, -1.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)), PartPose.offsetAndRotation(0.0F, -1.1538F, 0.3003F, 2.1325F, 0.2916F, 0.5123F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 75).addBox(-0.9253F, -0.4243F, -1.0018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0255F)), PartPose.offsetAndRotation(-0.6F, -0.6342F, -0.0072F, 1.2707F, 0.1646F, 0.243F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(38, 67).addBox(-1.0F, -1.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-1.1394F, 0.2592F, -0.7011F, 1.153F, 0.4935F, 0.9109F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(40, 77).addBox(-1.0F, -1.4085F, -2.071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, -1.1538F, 0.3003F, 0.998F, 0.2916F, 0.5123F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 59).addBox(-0.9253F, -1.0313F, -1.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.6F, -0.6342F, -0.0072F, 0.6162F, 0.1646F, 0.243F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(64, 24).addBox(-0.4F, -0.6292F, 0.7459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(-0.6F, -0.6342F, -0.0072F, 1.1336F, -0.1264F, -0.264F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 43).addBox(-0.4F, 0.4416F, 2.2696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(-0.6F, -0.6342F, -0.0072F, 1.4783F, -0.1264F, -0.264F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 3.8575F, -3.4008F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r135 = bone3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-0.6F, -0.7896F, 1.4512F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.6342F, -0.0072F, 0.9765F, 0.1264F, 0.264F));

		PartDefinition cube_r136 = bone3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(0.0F, -1.3033F, -1.8884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0254F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1538F, 0.3003F, 2.1325F, -0.2916F, -0.5123F));

		PartDefinition cube_r137 = bone3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-0.0747F, -0.4243F, -1.0018F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0255F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.6342F, -0.0072F, 1.2707F, -0.1646F, -0.243F));

		PartDefinition cube_r138 = bone3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(0.0F, -1.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(1.1394F, 0.2592F, -0.7011F, 1.153F, -0.4935F, -0.9109F));

		PartDefinition cube_r139 = bone3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(0.0F, -1.4085F, -2.071F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1538F, 0.3003F, 0.998F, -0.2916F, -0.5123F));

		PartDefinition cube_r140 = bone3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(74, 59).mirror().addBox(-0.0747F, -1.0313F, -1.0548F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.6342F, -0.0072F, 0.6162F, -0.1646F, -0.243F));

		PartDefinition cube_r141 = bone3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.6F, -0.6292F, 0.7459F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.025F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.6342F, -0.0072F, 1.1336F, 0.1264F, 0.264F));

		PartDefinition cube_r142 = bone3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-0.6F, 0.4416F, 2.2696F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.02F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.6342F, -0.0072F, 1.4783F, 0.1264F, 0.264F));

		PartDefinition Neck = Body2.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4785F, -3.8313F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition cube_r143 = Neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(6, 93).mirror().addBox(-2.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.067F, 0.826F, -1.5582F));

		PartDefinition cube_r144 = Neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(90, 72).mirror().addBox(-1.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.4664F, 0.7118F, -0.9925F));

		PartDefinition cube_r145 = Neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(90, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0321F, -1.4354F, 0.6991F, 0.4873F, -0.5865F));

		PartDefinition cube_r146 = Neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(6, 93).addBox(1.5955F, -1.1381F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.067F, -0.826F, 1.5582F));

		PartDefinition cube_r147 = Neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(90, 72).addBox(0.9205F, -0.3907F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.4664F, -0.7118F, 0.9925F));

		PartDefinition cube_r148 = Neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(90, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0321F, -1.4354F, 0.6991F, -0.4873F, 0.5865F));

		PartDefinition cube_r149 = Neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(3, 93).addBox(0.0F, -2.6477F, 0.9598F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 56).addBox(-0.5F, -0.9727F, -0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.2728F, -2.9387F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3272F, -2.6387F, -0.0264F, 0.1309F, -0.0034F));

		PartDefinition cube_r150 = Neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(84, 93).addBox(0.0F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2537F, 0.1119F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(93, 48).addBox(0.0F, -1.75F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9795F, -2.799F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-2.8054F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0178F, -2.5495F, 0.2396F, 0.9262F, -1.1213F));

		PartDefinition cube_r153 = Neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(7, 72).mirror().addBox(-3.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.248F, -0.6768F, 0.3283F, 0.7541F, -1.0645F));

		PartDefinition cube_r154 = Neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(72, 8).addBox(-0.1946F, -0.126F, -0.3696F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0178F, -2.5495F, 0.2396F, -0.9262F, 1.1213F));

		PartDefinition cube_r155 = Neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(7, 72).addBox(0.0902F, 0.0115F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.248F, -0.6768F, 0.3283F, -0.7541F, 1.0645F));

		PartDefinition cube_r156 = Neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(45, 62).addBox(-0.5F, 0.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9472F, -6.6801F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = Neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.483F, -2.8502F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(64, 19).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(93, 31).addBox(0.0F, -1.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -3.7F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(71, 41).mirror().addBox(-2.9822F, -0.0264F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3512F, -1.605F, 0.3107F, 1.1449F, -1.0972F));

		PartDefinition cube_r159 = neck4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 41).addBox(-0.0178F, -0.0264F, -0.6676F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3512F, -1.605F, 0.3107F, -1.1449F, 1.0972F));

		PartDefinition Neck3 = neck4.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(66, 71).addBox(-0.5F, -0.5227F, -1.8813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.7698F, -2.902F, -0.332F, 0.3298F, 0.0338F));

		PartDefinition cube_r160 = Neck3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 77).addBox(0.0F, -1.45F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5221F, 0.1448F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Neck3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-2.6462F, -0.2114F, -0.4321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3939F, 0.3346F, -0.7128F, 0.8404F, 1.3518F, -0.6539F));

		PartDefinition cube_r162 = Neck3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(72, 0).addBox(-0.3538F, -0.2114F, -0.4321F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3939F, 0.3346F, -0.7128F, 0.8404F, -1.3518F, 0.6539F));

		PartDefinition Neck5 = Neck3.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(36, 62).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0061F, -1.8805F, 0.1718F, 0.1516F, 0.157F));

		PartDefinition cube_r163 = Neck5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(76, 47).addBox(0.0F, -1.175F, 0.1F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Neck5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(72, 2).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1806F, -1.4774F, 0.4519F, 1.3129F, -1.0557F));

		PartDefinition cube_r165 = Neck5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(72, 2).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1806F, -1.4774F, 0.4519F, -1.3129F, 1.0557F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.5227F, -1.8813F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(76, 66).addBox(0.0F, -1.7977F, -1.9813F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0243F, -2.8779F, 0.1136F, 0.0434F, 0.0049F));

		PartDefinition cube_r166 = Neck6.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 23).mirror().addBox(-2.9973F, 0.0248F, -0.4988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5359F, 0.1657F, -1.0902F, 0.3907F, 1.32F, -1.119F));

		PartDefinition cube_r167 = Neck6.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(73, 23).addBox(-0.0027F, 0.0248F, -0.4988F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5359F, 0.1657F, -1.0902F, 0.3907F, -1.32F, 1.119F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(65, 61).addBox(-0.5F, -0.5227F, -2.8813F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -1.9004F, 0.0792F, 0.1305F, 0.0103F));

		PartDefinition cube_r168 = Neck7.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(78, 29).addBox(0.0F, -0.95F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.3813F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Neck7.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4609F, 0.1033F, -1.5157F, 0.5097F, 1.3048F, -0.9959F));

		PartDefinition cube_r170 = Neck7.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(7, 70).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4609F, 0.1033F, -1.5157F, 0.5097F, -1.3048F, 0.9959F));

		PartDefinition Neck8 = Neck7.addOrReplaceChild("Neck8", CubeListBuilder.create().texOffs(71, 33).addBox(-0.5F, -0.5227F, -2.0313F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.015F, -2.76F, 0.2451F, 0.1719F, 0.2193F));

		PartDefinition cube_r171 = Neck8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(83, 29).addBox(0.0F, -0.1F, 0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -2.5313F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Neck8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5109F, 0.2183F, -1.0602F, 0.4519F, 1.3129F, -1.0557F));

		PartDefinition cube_r173 = Neck8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(67, 53).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5109F, 0.2183F, -1.0602F, 0.4519F, -1.3129F, 1.0557F));

		PartDefinition Head = Neck8.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8249F, -1.9587F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(76, 52).addBox(-1.5F, 0.0052F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3434F, -2.6513F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(74, 63).addBox(-1.5F, -0.0047F, -0.4683F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.2426F, -2.2039F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 89).addBox(-0.5F, -0.01F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.0236F, -6.6166F, 0.1963F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(57, 74).addBox(-0.5F, 0.015F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2816F, -3.6765F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(40, 92).addBox(-0.5F, -0.1814F, -0.1927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.4499F, -7.5951F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(55, 92).addBox(-0.5F, -0.1974F, -0.7994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0368F, -6.5845F, 0.432F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 92).addBox(-0.5F, -0.1936F, -0.7975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.7868F, -7.1345F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.2783F, -4.6459F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 16).addBox(-1.0F, -1.025F, 0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.2221F, -2.3886F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(90, 83).addBox(-0.55F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2947F, -0.1692F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(45, 67).addBox(-1.5F, -1.0F, -0.025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, 1.1892F, -2.4061F, -0.3447F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, 1.25F, -0.025F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, -2.1266F, -2.862F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(74, 55).addBox(-1.5F, -0.4F, 0.625F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6899F, -0.5455F, -1.6668F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5427F, -0.3278F, -5.1282F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0239F, -0.6898F, 2.8059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, 0.0266F, 0.15F, 0.0059F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(60, 66).addBox(-1.1072F, -0.4833F, -0.3868F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0974F, -0.6877F, 0.8636F, 0.036F, -0.0227F, -0.0209F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(71, 75).addBox(-0.1309F, -0.4606F, -1.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0974F, -0.6877F, 0.8636F, 0.0848F, 0.4387F, -0.0135F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.3828F, -0.7528F, -0.3864F, 0.2098F, 0.15F, 0.0059F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(86, 46).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2337F, -0.8742F, 0.595F, 0.1226F, 0.15F, 0.0059F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(45, 86).addBox(-0.6F, -0.775F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2176F, -0.0801F, 0.0636F, 0.0353F, 0.15F, 0.0059F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(27, 62).addBox(-0.625F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.0237F, 0.8451F, 1.3823F, -0.1043F, 0.15F, 0.0059F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(88, 27).addBox(-0.5F, -0.175F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 6).addBox(-0.5F, -0.175F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.4005F, -0.3435F, -1.9834F, 0.6374F, 0.15F, 0.0059F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(87, 42).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3288F, -0.2192F, -1.5044F, 0.3931F, 0.15F, 0.0059F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(81, 4).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2708F, 1.1111F, -1.0687F, 3.0547F, 0.15F, 0.0059F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.3506F, 0.8572F, -1.6065F, -2.0067F, 0.15F, 0.0059F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5F, -1.35F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.3317F, 0.2808F, -1.5042F, -0.8723F, 0.15F, 0.0059F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(50, 92).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.4214F, 0.2805F, -2.0975F, 0.3495F, 0.15F, 0.0059F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(85, 90).addBox(-0.575F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0942F, 1.2117F, 1.9721F, 0.0004F, 0.0191F, 0.0058F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(91, 3).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0566F, 1.212F, 0.9647F, -0.0432F, 0.15F, 0.0059F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(92, 42).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1765F, 1.2616F, 0.1737F, -0.0869F, 0.15F, 0.0059F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 89).addBox(-0.8919F, 0.2447F, 1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.0869F, 0.15F, 0.0059F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(91, 66).addBox(-0.9179F, -0.3402F, 0.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2503F, 0.3416F, -2.9732F, -0.0004F, 0.2022F, 0.0013F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(35, 89).addBox(-0.5F, -0.725F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4432F, 1.154F, -1.5951F, -0.3088F, 0.1429F, -0.0461F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(60, 89).addBox(-0.4975F, -0.5675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(50, 89).addBox(-0.4975F, -0.3675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2413F, -0.0745F, -1.7802F, 2.1031F, 0.1789F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 36).addBox(-0.4975F, -0.7078F, -0.2939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.2413F, -0.0745F, -1.7802F, 2.8449F, 0.1789F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(81, 47).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.134F, -0.021F, -0.6684F, -1.7704F, 0.151F, 0.0062F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(-0.0649F, -0.2363F, -0.2225F, -1.1246F, 0.151F, 0.0062F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(65, 86).addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.0104F, -0.2669F, 0.2708F, 0.0622F, 0.151F, 0.0062F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(86, 63).addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0793F, -0.0838F, 0.731F, 1.1967F, 0.151F, 0.0062F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(86, 60).addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.1128F, 0.305F, 0.9673F, 2.2875F, 0.151F, 0.0062F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 86).addBox(-0.5F, -0.55F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(0.0489F, 0.4622F, 0.5535F, 3.1252F, 0.151F, 0.0062F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(85, 18).addBox(-0.4625F, -0.8226F, -1.0806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(30, 84).addBox(-0.4625F, -0.027F, -0.6207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(25, 84).addBox(-0.4625F, -0.7403F, -0.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(20, 84).addBox(-0.4625F, -1.0165F, -0.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(84, 10).addBox(-0.4625F, -0.5811F, -0.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(80, 83).addBox(-0.4625F, -0.0291F, -0.3219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(83, 75).addBox(-0.4625F, -0.5148F, 0.0578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(85, 24).addBox(-0.4125F, -0.5857F, -0.5585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(70, 83).addBox(-0.5875F, -0.5857F, -0.5585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(85, 21).addBox(-0.4625F, -1.0427F, -0.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 83).addBox(-0.4625F, -1.0427F, -0.4787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.1198F, -0.0044F, 2.2898F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(65, 92).addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F))
				.texOffs(60, 92).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.2323F, 1.1046F, 3.4466F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(70, 92).addBox(0.25F, -0.775F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6427F, 1.9258F, 4.0312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(90, 77).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2323F, 1.4173F, 4.3561F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(86, 3).addBox(-0.75F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4823F, 1.4631F, 3.6082F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(83, 51).addBox(-0.75F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.4323F, -0.1179F, 3.73F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(91, 0).addBox(-0.75F, -0.775F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4323F, -0.3903F, 4.2646F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(65, 83).addBox(-0.75F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(85, 39).addBox(-0.75F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.4323F, 0.3559F, 3.7613F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(90, 69).addBox(0.15F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(90, 39).addBox(0.15F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5427F, 0.0331F, 4.959F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(91, 45).addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.1073F, -0.7181F, 4.9633F, -1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(91, 12).addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1073F, -0.7325F, 4.9429F, -2.2558F, 0.0F, 0.0F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(83, 33).addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.1823F, 0.6595F, 3.7025F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(10, 90).addBox(-0.75F, -0.525F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4323F, 1.1276F, 4.0182F, -1.5272F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5427F, -0.3278F, -5.1282F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.0239F, -0.6898F, 2.8059F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, 0.0266F, -0.15F, -0.0059F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-0.8928F, -0.4833F, -0.3868F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0974F, -0.6877F, 0.8636F, 0.036F, 0.0227F, 0.0209F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(71, 75).mirror().addBox(-0.8691F, -0.4606F, -1.5013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0974F, -0.6877F, 0.8636F, 0.0848F, -0.4387F, 0.0135F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(50, 86).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.3828F, -0.7528F, -0.3864F, 0.2098F, -0.15F, -0.0059F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(86, 46).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2337F, -0.8742F, 0.595F, 0.1226F, -0.15F, -0.0059F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.4F, -0.775F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.2176F, -0.0801F, 0.0636F, 0.0353F, -0.15F, -0.0059F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-0.375F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.0237F, 0.8451F, 1.3823F, -0.1043F, -0.15F, -0.0059F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(88, 27).mirror().addBox(-0.5F, -0.175F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(88, 6).mirror().addBox(-0.5F, -0.175F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.4005F, -0.3435F, -1.9834F, 0.6374F, -0.15F, -0.0059F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(87, 42).mirror().addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3288F, -0.2192F, -1.5044F, 0.3931F, -0.15F, -0.0059F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2708F, 1.1111F, -1.0687F, 3.0547F, -0.15F, -0.0059F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.3506F, 0.8572F, -1.6065F, -2.0067F, -0.15F, -0.0059F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5F, -1.35F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.3317F, 0.2808F, -1.5042F, -0.8723F, -0.15F, -0.0059F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(50, 92).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(0.4214F, 0.2805F, -2.0975F, 0.3495F, -0.15F, -0.0059F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(85, 90).mirror().addBox(-0.425F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0942F, 1.2117F, 1.9721F, 0.0004F, -0.0191F, -0.0058F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0566F, 1.212F, 0.9647F, -0.0432F, -0.15F, -0.0059F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(92, 42).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1765F, 1.2616F, 0.1737F, -0.0869F, -0.15F, -0.0059F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.1081F, 0.2447F, 1.8001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.0869F, -0.15F, -0.0059F));

		PartDefinition cube_r252 = rightFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(-0.0821F, -0.3402F, 0.1252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2503F, 0.3416F, -2.9732F, -0.0004F, -0.2022F, -0.0013F));

		PartDefinition cube_r253 = rightFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(-0.5F, -0.725F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4432F, 1.154F, -1.5951F, -0.3088F, -0.1429F, 0.0461F));

		PartDefinition cube_r254 = rightFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.5025F, -0.5675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 89).mirror().addBox(-0.5025F, -0.3675F, -0.4134F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2413F, -0.0745F, -1.7802F, 2.1031F, -0.1789F, 0.0F));

		PartDefinition cube_r255 = rightFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(85, 36).mirror().addBox(-0.5025F, -0.7078F, -0.2939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.2413F, -0.0745F, -1.7802F, 2.8449F, -0.1789F, 0.0F));

		PartDefinition cube_r256 = rightFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-0.5F, -1.75F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.134F, -0.021F, -0.6684F, -1.7704F, -0.151F, -0.0062F));

		PartDefinition cube_r257 = rightFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.5F, -0.25F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(0.0649F, -0.2363F, -0.2225F, -1.1246F, -0.151F, -0.0062F));

		PartDefinition cube_r258 = rightFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.5F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.0104F, -0.2669F, 0.2708F, 0.0622F, -0.151F, -0.0062F));

		PartDefinition cube_r259 = rightFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(86, 63).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0793F, -0.0838F, 0.731F, 1.1967F, -0.151F, -0.0062F));

		PartDefinition cube_r260 = rightFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.1128F, 0.305F, 0.9673F, 2.2875F, -0.151F, -0.0062F));

		PartDefinition cube_r261 = rightFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(60, 86).mirror().addBox(-0.5F, -0.55F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-0.0489F, 0.4622F, 0.5535F, 3.1252F, -0.151F, -0.0062F));

		PartDefinition cube_r262 = rightFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-0.5375F, -0.8226F, -1.0806F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.5375F, -0.027F, -0.6207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, 3.0456F, 0.0F, 0.0F));

		PartDefinition cube_r264 = rightFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.5375F, -0.7403F, -0.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r265 = rightFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.5375F, -1.0165F, -0.321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, 1.4573F, 0.0F, 0.0F));

		PartDefinition cube_r266 = rightFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-0.5375F, -0.5811F, -0.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r267 = rightFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.5375F, -0.0291F, -0.3219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r268 = rightFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(83, 75).mirror().addBox(-0.5375F, -0.5148F, 0.0578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r269 = rightFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-0.5875F, -0.5857F, -0.5585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(70, 83).mirror().addBox(-0.4125F, -0.5857F, -0.5585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, -1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(-0.5375F, -1.0427F, -0.7787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(75, 83).mirror().addBox(-0.5375F, -1.0427F, -0.4787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.1198F, -0.0044F, 2.2898F, -1.885F, 0.0F, 0.0F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(65, 92).mirror().addBox(-0.5F, -0.5F, -1.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false)
				.texOffs(60, 92).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.1046F, 3.4466F, 2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(70, 92).mirror().addBox(-1.25F, -0.775F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6427F, 1.9258F, 4.0312F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(90, 77).mirror().addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2323F, 1.4173F, 4.3561F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.25F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4823F, 1.4631F, 3.6082F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(83, 51).mirror().addBox(-0.25F, -0.775F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, -0.1179F, 3.73F, 2.9671F, 0.0F, 0.0F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(91, 0).mirror().addBox(-0.25F, -0.775F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, -0.3903F, 4.2646F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(65, 83).mirror().addBox(-0.25F, -0.775F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false)
				.texOffs(85, 39).mirror().addBox(-0.25F, -0.775F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, 0.3559F, 3.7613F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(90, 69).mirror().addBox(-1.15F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(90, 39).mirror().addBox(-1.15F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5427F, 0.0331F, 4.959F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-0.5F, -0.175F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, -0.7181F, 4.9633F, -1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(91, 12).mirror().addBox(-0.5F, -0.8F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1073F, -0.7325F, 4.9429F, -2.2558F, 0.0F, 0.0F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(83, 33).mirror().addBox(-0.5F, -0.475F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.1823F, 0.6595F, 3.7025F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.25F, -0.525F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4323F, 1.1276F, 4.0182F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 1.6999F, -0.5197F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r283 = Jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(65, 89).mirror().addBox(-0.5F, -1.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false)
				.texOffs(55, 89).mirror().addBox(-0.5F, -1.025F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(65, 89).addBox(0.85F, -1.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F))
				.texOffs(55, 89).addBox(0.85F, -1.025F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.775F, 0.7871F, -0.0421F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(86, 13).addBox(0.85F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.775F, 0.5347F, -0.3832F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r285 = Jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-0.1849F, -0.0695F, -1.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(70, 29).mirror().addBox(-0.1849F, -0.0695F, -1.617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1612F, -2.7932F, -0.2653F, -0.1605F, 0.0154F));

		PartDefinition cube_r286 = Jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(85, 71).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 71).addBox(0.9F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.2118F, -2.0462F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r287 = Jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 90).addBox(0.85F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.775F, 0.6707F, -2.1994F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r288 = Jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(22, 52).mirror().addBox(-0.5F, -0.8F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)).mirror(false)
				.texOffs(22, 52).addBox(0.85F, -0.8F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(-0.775F, 0.6159F, -0.6559F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r289 = Jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(28, 76).mirror().addBox(-0.1956F, -0.4962F, -1.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -0.1612F, -4.3682F, -0.2801F, -0.1551F, 0.0489F));

		PartDefinition cube_r290 = Jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(35, 92).mirror().addBox(-0.237F, 0.0409F, -1.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 91).mirror().addBox(-0.237F, 0.0409F, -1.3452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.7875F, -0.0772F, 0.0788F));

		PartDefinition cube_r291 = Jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(91, 63).mirror().addBox(-0.237F, -0.3126F, -0.8883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.3163F, -0.0772F, 0.0788F));

		PartDefinition cube_r292 = Jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(90, 36).mirror().addBox(-0.237F, -0.2983F, -1.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.3512F, -0.0772F, 0.0788F));

		PartDefinition cube_r293 = Jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(64, 75).mirror().addBox(-0.237F, -0.5758F, -1.8239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.3599F, -0.0772F, 0.0788F));

		PartDefinition cube_r294 = Jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(91, 60).mirror().addBox(-0.168F, -0.4262F, -0.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(90, 22).mirror().addBox(-0.168F, -0.5188F, -0.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.266F, -0.0961F, 0.0506F));

		PartDefinition cube_r295 = Jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-0.0841F, -0.6735F, -1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.327F, -0.0961F, 0.0506F));

		PartDefinition cube_r296 = Jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.1091F, -0.7335F, -0.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.6612F, -5.8682F, -0.3619F, -0.0961F, 0.0506F));

		PartDefinition cube_r297 = Jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(90, 19).mirror().addBox(-0.1517F, -0.5315F, -0.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 16).mirror().addBox(-0.1517F, -0.5065F, -1.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1612F, -2.7932F, -0.2196F, -0.1759F, 0.0259F));

		PartDefinition cube_r298 = Jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.0948F, -0.8244F, -1.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -0.1612F, -4.3682F, -0.2617F, -0.1121F, 0.0404F));

		PartDefinition cube_r299 = Jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(21, 76).mirror().addBox(-0.1956F, -0.6785F, -1.7925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -0.1612F, -4.3682F, -0.2102F, -0.1551F, 0.0489F));

		PartDefinition cube_r300 = Jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(-0.1849F, -0.5018F, -1.8532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1612F, -2.7932F, -0.1213F, -0.1605F, 0.0154F));

		PartDefinition cube_r301 = Jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(78, 34).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(78, 34).addBox(0.85F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.775F, -0.2637F, -1.2333F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r302 = Jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 83).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 83).addBox(0.85F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.775F, -0.1595F, -0.6424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r303 = Jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(91, 57).addBox(0.85F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-0.775F, -0.1595F, -0.6424F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r304 = Jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(25, 90).addBox(-0.8151F, -0.0695F, -1.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(70, 29).addBox(-0.8151F, -0.0695F, -1.617F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.9F, -0.1612F, -2.7932F, -0.2653F, 0.1605F, -0.0154F));

		PartDefinition cube_r305 = Jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(28, 76).addBox(-0.8044F, -0.4962F, -1.8264F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, -0.1612F, -4.3682F, -0.2801F, 0.1551F, -0.0489F));

		PartDefinition cube_r306 = Jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(35, 92).addBox(-0.763F, 0.0409F, -1.6452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 91).addBox(-0.763F, 0.0409F, -1.3452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.7875F, 0.0772F, -0.0788F));

		PartDefinition cube_r307 = Jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(91, 63).addBox(-0.763F, -0.3126F, -0.8883F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.3163F, 0.0772F, -0.0788F));

		PartDefinition cube_r308 = Jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(90, 36).addBox(-0.763F, -0.2983F, -1.1962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.3512F, 0.0772F, -0.0788F));

		PartDefinition cube_r309 = Jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(64, 75).addBox(-0.763F, -0.5758F, -1.8239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.3599F, 0.0772F, -0.0788F));

		PartDefinition cube_r310 = Jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(91, 60).addBox(-0.832F, -0.4262F, -0.416F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(90, 22).addBox(-0.832F, -0.5188F, -0.7059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.266F, 0.0961F, -0.0506F));

		PartDefinition cube_r311 = Jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(30, 90).addBox(-0.9159F, -0.6735F, -1.6394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.327F, 0.0961F, -0.0506F));

		PartDefinition cube_r312 = Jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(20, 90).addBox(-0.8909F, -0.7335F, -0.7474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, -0.6612F, -5.8682F, -0.3619F, 0.0961F, -0.0506F));

		PartDefinition cube_r313 = Jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(90, 19).addBox(-0.8483F, -0.5315F, -0.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 16).addBox(-0.8483F, -0.5065F, -1.984F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, -0.1612F, -2.7932F, -0.2196F, 0.1759F, -0.0259F));

		PartDefinition cube_r314 = Jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(15, 90).addBox(-0.9052F, -0.8244F, -1.4269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.65F, -0.1612F, -4.3682F, -0.2617F, 0.1121F, -0.0404F));

		PartDefinition cube_r315 = Jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(21, 76).addBox(-0.8044F, -0.6785F, -1.7925F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.65F, -0.1612F, -4.3682F, -0.2102F, 0.1551F, -0.0489F));

		PartDefinition cube_r316 = Jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(71, 37).addBox(-0.8151F, -0.5018F, -1.8532F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, -0.1612F, -2.7932F, -0.1213F, 0.1605F, -0.0154F));

		PartDefinition RArm = Body2.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9803F, 4.7674F, -2.7041F, -1.0474F, 0.0824F, 0.0397F));

		PartDefinition cube_r317 = RArm.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(22, 56).addBox(0.0F, -0.05F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.0771F, -0.0907F, 1.3221F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r318 = RArm.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(80, 86).addBox(0.0F, -1.05F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.0771F, 1.4356F, 0.7448F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r319 = RArm.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(73, 19).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r320 = RArm.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(72, 10).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm2 = RArm.addOrReplaceChild("RArm2", CubeListBuilder.create().texOffs(23, 69).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(54, 67).addBox(0.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2924F, -0.7224F, 5.3552F, 1.1529F, 0.6142F, 0.9702F));

		PartDefinition RHand = RArm2.addOrReplaceChild("RHand", CubeListBuilder.create().texOffs(30, 44).addBox(-0.9F, -0.01F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8934F, 4.9741F, 0.6F, 0.0F, 0.2618F, -0.2618F));

		PartDefinition RHand2 = RHand.addOrReplaceChild("RHand2", CubeListBuilder.create().texOffs(0, 58).addBox(-0.2F, -0.01F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7022F, 1.9165F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition RArm3 = Body2.addOrReplaceChild("RArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9803F, 4.7674F, -2.7041F, -1.1915F, -0.2368F, 0.0429F));

		PartDefinition cube_r321 = RArm3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(33, 56).addBox(-1.0F, -0.05F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0771F, -0.0907F, 1.3221F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r322 = RArm3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(15, 87).addBox(-1.0F, -1.05F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0771F, 1.4356F, 0.7448F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r323 = RArm3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(73, 71).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r324 = RArm3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(38, 73).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0771F, -0.5307F, -0.3199F, -0.2618F, 0.0F, 0.0F));

		PartDefinition RArm4 = RArm3.addOrReplaceChild("RArm4", CubeListBuilder.create().texOffs(28, 69).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(18, 68).addBox(-1.0F, 0.2F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2924F, -0.7224F, 5.3552F, 0.8245F, -1.0604F, -0.5418F));

		PartDefinition RHand3 = RArm4.addOrReplaceChild("RHand3", CubeListBuilder.create().texOffs(18, 62).addBox(-0.1F, -0.01F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8934F, 4.9741F, 0.6F, 0.0F, -0.2618F, 0.2618F));

		PartDefinition RHand4 = RHand3.addOrReplaceChild("RHand4", CubeListBuilder.create().texOffs(9, 58).addBox(-0.8F, -0.01F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7022F, 1.9165F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Tail = hips.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(25, 12).addBox(-0.5F, -0.6013F, -0.0611F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.1852F, 3.8355F, -0.0264F, 0.1309F, -0.0034F));

		PartDefinition cube_r325 = Tail.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(29, 95).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 6.9389F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r326 = Tail.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(95, 23).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 4.9389F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r327 = Tail.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(95, 19).addBox(0.0F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 2.9389F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r328 = Tail.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(91, 52).addBox(0.0F, -0.4409F, -0.1051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3987F, 7.6389F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r329 = Tail.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(17, 36).addBox(0.0F, -0.6118F, -0.0885F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 5.4389F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r330 = Tail.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(90, 86).addBox(0.0F, -0.376F, -0.1487F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6987F, 3.1389F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r331 = Tail.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(21, 26).addBox(0.0F, -0.0805F, 0.0822F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2987F, 0.2389F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r332 = Tail.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(95, 15).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6013F, 0.9389F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r333 = Tail.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1013F, 0.9389F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r334 = Tail.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1013F, 0.9389F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6584F, -0.0376F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0661F, 8.8942F, -0.0968F, -0.1303F, 0.0126F));

		PartDefinition cube_r335 = Tail2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(14, 93).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 7.9624F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Tail2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(38, 95).addBox(0.0F, -1.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 5.8624F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r337 = Tail2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(61, 95).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 3.9624F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r338 = Tail2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(95, 35).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, 1.9624F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r339 = Tail2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(35, 95).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6584F, -0.0376F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r340 = Tail2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.8F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.1584F, -0.0376F, 0.0F, 0.0349F, 0.0F));

		PartDefinition cube_r341 = Tail2.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(0, 26).addBox(-0.2F, 0.0F, 0.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1584F, -0.0376F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r342 = Tail2.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(95, 82).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0287F, 8.2777F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r343 = Tail2.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(96, 27).addBox(0.0F, -0.1104F, -0.0633F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2772F, 5.5834F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r344 = Tail2.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(95, 78).addBox(0.0F, -0.2408F, -0.1559F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, 3.4F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r345 = Tail2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(32, 95).addBox(0.0F, -0.3043F, -0.4997F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.2087F, 9.8515F, -0.1084F, -0.2603F, 0.028F));

		PartDefinition cube_r346 = Tail3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(3, 97).addBox(0.0F, -0.775F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3147F, 10.0474F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r347 = Tail3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -0.725F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 8.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r348 = Tail3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(90, 96).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 6.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r349 = Tail3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(81, 96).addBox(0.0F, -0.875F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 4.1474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Tail3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(78, 96).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 2.0474F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r351 = Tail3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(41, 95).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 0.0474F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r352 = Tail3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(64, 95).addBox(0.0F, -0.5F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4543F, 9.736F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r353 = Tail3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(72, 95).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5571F, 7.3973F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r354 = Tail3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(95, 94).addBox(0.0F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5768F, 5.7819F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r355 = Tail3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(17, 93).addBox(0.0F, 0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2041F, 2.913F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r356 = Tail3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(95, 90).addBox(0.0F, 0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0572F, 0.6352F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4147F, 0.0474F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.01F))
				.texOffs(17, 41).addBox(0.0F, -0.9897F, 7.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 71).addBox(0.0F, -0.9397F, 9.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0059F, 10.9741F, -0.0723F, -0.2611F, 0.0187F));

		PartDefinition cube_r357 = Tail4.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(21, 31).addBox(0.0F, -0.625F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 5.0474F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r358 = Tail4.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(96, 45).addBox(0.0F, -0.65F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4147F, 3.0474F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r359 = Tail4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(96, 31).addBox(0.0F, -0.775F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3147F, 1.0474F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r360 = Tail4.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(75, 96).addBox(0.0F, 16.8F, 28.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 97).addBox(0.0F, 15.7F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 97).addBox(0.0F, 14.6F, 24.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 95).addBox(0.0F, 12.6F, 22.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 95).addBox(0.0F, 11.6F, 20.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3584F, -23.3624F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F))
				.texOffs(96, 59).addBox(0.0F, -0.6648F, 4.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 62).addBox(0.0F, -0.5898F, 6.0474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0133F, 10.9385F, 0.0745F, 0.6096F, 0.0427F));

		PartDefinition cube_r361 = Tail5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(96, 56).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3148F, 2.0474F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Tail5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(96, 48).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5147F, 0.0474F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Tail5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(12, 97).addBox(0.0F, 19.3F, 32.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 65).addBox(0.0F, 18.0F, 30.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3451F, -34.3009F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(25, 23).addBox(-0.5F, -0.4148F, 0.0474F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, 0.0366F, 0.3052F, 0.011F));

		PartDefinition RLeg = hips.addOrReplaceChild("RLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8F, 0.8241F, 0.8792F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r364 = RLeg.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.6756F, -1.489F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r365 = RLeg.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(45, 82).addBox(-0.5F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, 8.3013F, -1.6495F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r366 = RLeg.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(10, 87).addBox(-0.5F, 0.375F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(85, 87).addBox(-0.5F, -0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 7.0944F, -2.4018F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r367 = RLeg.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(78, 75).addBox(-0.5F, -2.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.2291F, -0.9013F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r368 = RLeg.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(50, 78).addBox(1.0F, -0.1755F, -0.0418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 5.3481F, -1.8604F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r369 = RLeg.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(75, 79).addBox(1.0F, -1.975F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4174F, 0.49F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r370 = RLeg.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(86, 57).addBox(1.0F, -0.15F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -0.7145F, -0.4657F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r371 = RLeg.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(40, 89).addBox(1.0F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, -0.6725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r372 = RLeg.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(0, 87).addBox(1.0F, -0.675F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6629F, -0.6725F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r373 = RLeg.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(70, 79).addBox(1.0F, 0.15F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.5F, -0.3249F, -0.0025F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r374 = RLeg.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(79, 10).addBox(1.0F, 0.05F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, 3.5917F, -0.4142F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r375 = RLeg.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(35, 86).addBox(1.0F, 1.425F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0016F))
				.texOffs(60, 79).addBox(1.0F, -0.075F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, 1.4648F, 0.5379F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r376 = RLeg.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(80, 71).addBox(1.0F, 0.05F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 1.6067F, -0.6579F, -0.2094F, 0.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 9.0017F, -1.9932F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r377 = RLeg2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(33, 69).addBox(0.0F, -0.175F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.8357F, 0.4649F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r378 = RLeg2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(80, 19).addBox(0.0F, -1.875F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8221F, 1.278F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r379 = RLeg2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(30, 80).addBox(0.0F, -1.675F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8221F, 1.278F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r380 = RLeg2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(81, 59).addBox(0.0F, -0.25F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.2539F, 1.1509F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r381 = RLeg2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(55, 56).addBox(0.0F, -6.3F, -0.325F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(81, 14).addBox(-1.0F, -6.15F, -1.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r382 = RLeg2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(81, 67).addBox(-0.5F, -0.2F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 2.2982F, -0.3525F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r383 = RLeg2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(40, 82).addBox(-1.0F, -0.125F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.3583F, 0.3281F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r384 = RLeg2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(59, 19).addBox(-1.0F, -8.0F, -1.05F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 9.138F, 1.4161F, 0.0916F, 0.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(0, 65).addBox(-1.35F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 9.2657F, 1.2395F, -1.7541F, 0.0F, 0.0F));

		PartDefinition digit = RLeg3.addOrReplaceChild("digit", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3436F, 0.2593F, -0.0418F, -0.2149F, -0.1046F, 0.009F));

		PartDefinition cube_r385 = digit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(45, 77).addBox(-0.2826F, -0.4019F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2443F, 0.0F, 0.1745F));

		PartDefinition digit2 = digit.addOrReplaceChild("digit2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6042F, 2.346F, 0.3425F, -1.5282F, -0.1421F, 0.256F));

		PartDefinition cube_r386 = digit2.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(55, 82).addBox(-0.5F, -1.05F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(-0.0349F, 2.3195F, 1.4989F, 1.789F, 0.0F, 0.1745F));

		PartDefinition RFoot = RLeg3.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(59, 29).addBox(-0.9F, -0.3827F, -1.9239F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4782F, 2.9354F, -0.1082F, 1.571F, 0.0F, 0.0F));

		PartDefinition RFoot2 = RFoot.addOrReplaceChild("RFoot2", CubeListBuilder.create().texOffs(61, 0).addBox(-0.9F, -0.7827F, -1.9239F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4116F, -1.803F, 0.009F, 0.0F, 0.0F));

		PartDefinition RLeg4 = hips.addOrReplaceChild("RLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8F, 0.8241F, 0.8792F, 0.3739F, 0.0319F, -0.0812F));

		PartDefinition cube_r387 = RLeg4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(30, 87).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.6756F, -1.489F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r388 = RLeg4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5F, -1.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.0F, 8.3013F, -1.6495F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r389 = RLeg4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(25, 87).addBox(-0.5F, 0.375F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(88, 30).addBox(-0.5F, -0.025F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 7.0944F, -2.4018F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r390 = RLeg4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -2.2F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.2291F, -0.9013F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r391 = RLeg4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(55, 78).addBox(-2.0F, -0.1755F, -0.0418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 5.3481F, -1.8604F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r392 = RLeg4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(25, 80).addBox(-2.0F, -1.975F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4174F, 0.49F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r393 = RLeg4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(86, 66).addBox(-2.0F, -0.15F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.7145F, -0.4657F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r394 = RLeg4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(45, 89).addBox(-2.0F, -1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.6629F, -0.6725F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r395 = RLeg4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(20, 87).addBox(-2.0F, -0.675F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6629F, -0.6725F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r396 = RLeg4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(20, 80).addBox(-2.0F, 0.15F, -0.925F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -0.3249F, -0.0025F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r397 = RLeg4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(15, 79).addBox(-2.0F, 0.05F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, 3.5917F, -0.4142F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r398 = RLeg4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(40, 86).addBox(-2.0F, 1.425F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0016F))
				.texOffs(65, 79).addBox(-2.0F, -0.075F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5F, 1.4648F, 0.5379F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r399 = RLeg4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(80, 79).addBox(-2.0F, 0.05F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.6067F, -0.6579F, -0.2094F, 0.0F, 0.0F));

		PartDefinition RLeg5 = RLeg4.addOrReplaceChild("RLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 9.0017F, -1.9932F, 0.7902F, 0.1149F, 0.0722F));

		PartDefinition cube_r400 = RLeg5.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(45, 71).addBox(-1.0F, -0.175F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 1.8357F, 0.4649F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r401 = RLeg5.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(80, 25).addBox(-1.0F, -1.875F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8221F, 1.278F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r402 = RLeg5.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(80, 38).addBox(-1.0F, -1.675F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.8221F, 1.278F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r403 = RLeg5.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(81, 63).addBox(-1.0F, -0.25F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.2539F, 1.1509F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r404 = RLeg5.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(57, 33).addBox(-1.0F, -6.3F, -0.325F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(81, 55).addBox(0.0F, -6.15F, -1.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 6.3486F, 1.1721F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r405 = RLeg5.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, -0.2F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 2.2982F, -0.3525F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r406 = RLeg5.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(82, 42).addBox(0.0F, -0.125F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.3583F, 0.3281F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r407 = RLeg5.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(60, 56).addBox(0.0F, -8.0F, -1.05F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 9.138F, 1.4161F, 0.0916F, 0.0F, 0.0F));

		PartDefinition RLeg6 = RLeg5.addOrReplaceChild("RLeg6", CubeListBuilder.create().texOffs(9, 65).addBox(-1.65F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 9.2657F, 1.2395F, -2.0595F, 0.0F, 0.0F));

		PartDefinition digit3 = RLeg6.addOrReplaceChild("digit3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3436F, 0.2593F, -0.0418F, -0.2149F, 0.1046F, -0.009F));

		PartDefinition cube_r408 = digit3.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(0, 78).addBox(-0.7174F, -0.4019F, -0.5086F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2443F, 0.0F, -0.1745F));

		PartDefinition digit4 = digit3.addOrReplaceChild("digit4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6042F, 2.346F, 0.3425F, -1.5282F, 0.1421F, -0.256F));

		PartDefinition cube_r409 = digit4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.05F, 2.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.022F)), PartPose.offsetAndRotation(0.0349F, 2.3195F, 1.4989F, 1.789F, 0.0F, -0.1745F));

		PartDefinition RFoot3 = RLeg6.addOrReplaceChild("RFoot3", CubeListBuilder.create().texOffs(61, 9).addBox(-2.1F, -0.3827F, -1.9239F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4782F, 2.9354F, -0.1082F, 1.571F, 0.0F, 0.0F));

		PartDefinition RFoot4 = RFoot3.addOrReplaceChild("RFoot4", CubeListBuilder.create().texOffs(61, 13).addBox(-2.1F, -0.7827F, -1.9239F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4116F, -1.803F, -0.5146F, 0.0F, 0.0F));

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