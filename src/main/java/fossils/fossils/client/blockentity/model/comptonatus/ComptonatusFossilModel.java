package fossils.fossils.client.blockentity.model.comptonatus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ComptonatusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart leftLeg5;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart rightLeg5;
	private final ModelPart tail;
	private final ModelPart tail6;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart opposablePinkie;
	private final ModelPart rightArm;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;
	private final ModelPart opposablePinkie2;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head2;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public ComptonatusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone2 = this.hips.getChild("bone2");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.leftLeg5 = this.leftLeg4.getChild("leftLeg5");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.rightLeg5 = this.rightLeg4.getChild("rightLeg5");
		this.tail = this.hips.getChild("tail");
		this.tail6 = this.tail.getChild("tail6");
		this.tail2 = this.tail6.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm2 = this.leftArm.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.opposablePinkie = this.leftArm3.getChild("opposablePinkie");
		this.rightArm = this.chest.getChild("rightArm");
		this.rightArm2 = this.rightArm.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
		this.opposablePinkie2 = this.rightArm3.getChild("opposablePinkie2");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head2 = this.neck6.getChild("head2");
		this.leftFace = this.head2.getChild("leftFace");
		this.rightFace = this.head2.getChild("rightFace");
		this.jaw = this.head2.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.3861F, 7.6037F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 30).mirror().addBox(0.002F, -5.909F, -0.3565F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1F, 3.3F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(0.0F, -1.4536F, -3.2686F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.4F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.4073F, -3.5763F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 10).addBox(0.5F, 0.5927F, -3.5763F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 10).mirror().addBox(-2.5F, 0.5927F, -3.5763F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7F, 0.4F, -0.192F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-1.7802F, 2.5183F, 1.5635F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 61).mirror().addBox(-0.5F, -0.35F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3549F, -5.0628F, 3.92F, 0.5429F, -0.1553F, -0.0234F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.5F, -0.7F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3268F, -5.8056F, 3.7297F, 0.3318F, -0.1571F, -0.0028F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(99, 93).mirror().addBox(-0.5F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5886F, -6.0223F, 5.4099F, -0.4771F, -0.1527F, -0.037F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 99).mirror().addBox(-0.6564F, -0.0422F, -2.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5495F, -6.4221F, 6.1254F, -0.086F, -0.1562F, -0.0166F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 28).mirror().addBox(-0.5F, -0.45F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7324F, -4.9274F, -6.0557F, 0.2869F, 0.1741F, -0.0123F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2198F, -5.8951F, -2.8313F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-1.3359F, -5.9821F, -2.7128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6161F, -0.2721F, -1.0063F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-1.0182F, -6.3279F, -1.271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6161F, -0.2721F, -1.7063F, 0.3829F, 0.1741F, -0.0123F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 48).mirror().addBox(-1.3359F, -0.0874F, -0.0224F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6161F, -6.2721F, -2.3063F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.5F, -2.3F, -0.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2198F, -0.5326F, -1.9476F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.5F, -1.6F, -1.8F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2198F, -3.166F, -0.7166F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(51, 67).mirror().addBox(-0.8245F, -0.9359F, -2.3499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3319F, -0.5034F, 0.4971F, -1.6418F, 0.1379F, -0.1309F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 57).mirror().addBox(-0.5F, -1.5F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2198F, -0.6907F, -1.5835F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(27, 92).mirror().addBox(-0.893F, 3.7401F, -1.3251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4584F, 3.2923F, 3.4856F, 0.8189F, -0.0309F, -0.1365F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(91, 67).mirror().addBox(-0.893F, 2.5606F, 3.2785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(1.4584F, 3.2923F, 3.4856F, -0.2632F, -0.0309F, -0.1365F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 63).mirror().addBox(-0.893F, -1.0442F, 5.2626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(1.4584F, 3.2923F, 3.4856F, -1.005F, -0.0309F, -0.1365F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 85).mirror().addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.2489F, 1.2136F, -7.3015F, 1.235F, 0.2048F, 0.0442F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 67).mirror().addBox(-0.5F, -0.8F, -1.175F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.3855F, -0.1958F, -8.2584F, 0.7114F, 0.2048F, 0.0442F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-0.5F, -1.15F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1423F, -1.5272F, -7.3714F, 0.1093F, 0.2048F, 0.0442F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(-0.538F, -3.4885F, -2.2852F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, -0.2191F, -5.7117F, 0.5456F, 0.2048F, 0.0442F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 5).mirror().addBox(-0.5F, -0.875F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.1066F, -1.4516F, -7.1838F, -0.4405F, 0.2048F, 0.0442F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(66, 38).mirror().addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9664F, -0.3533F, -6.2759F, -0.2311F, 0.2048F, 0.0442F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(58, 47).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4798F, -1.0893F, -4.1163F, 0.3369F, 0.2068F, -0.0332F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(83, 53).mirror().addBox(-0.538F, 0.3841F, -0.599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, -0.2191F, -5.7117F, 0.6678F, 0.2048F, 0.0442F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(80, 78).mirror().addBox(-0.5F, -2.175F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0076F)).mirror(false), PartPose.offsetAndRotation(-1.4474F, 1.9823F, -7.1048F, -0.0351F, 0.1896F, 0.0896F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-0.5F, -0.55F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1949F, 0.5169F, -6.4773F, 0.8812F, 0.1896F, 0.0896F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.538F, -1.3134F, -3.9836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, -0.2191F, -5.7117F, -0.1176F, 0.2048F, 0.0442F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 74).mirror().addBox(0.5514F, -0.0701F, -0.0683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3496F, 2.3719F, 1.569F, -0.7778F, 0.1036F, -0.16F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.1346F, -0.7037F, -0.0847F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3496F, 1.3719F, -0.931F, -0.6207F, 0.1036F, -0.16F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-0.3001F, -0.8052F, 0.6067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3496F, -0.3281F, -2.531F, -0.8651F, 0.1036F, -0.16F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(64, 80).mirror().addBox(-0.3001F, -1.7232F, -0.2387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.3496F, -0.3281F, -2.531F, -0.7604F, 0.1036F, -0.16F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-0.4703F, -0.1352F, 0.9328F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, -0.2191F, -5.7117F, 0.2322F, 0.2068F, -0.0332F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(55, 5).mirror().addBox(-0.893F, -0.2653F, -0.2311F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(1.4584F, 3.2923F, 3.4856F, -0.9003F, -0.0309F, -0.1365F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(99, 96).mirror().addBox(-0.914F, 0.4327F, -1.4315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3319F, -0.5034F, 0.4971F, 0.8822F, 0.1132F, -0.2078F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 85).mirror().addBox(-0.914F, 1.1931F, -0.9783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.3319F, -0.5034F, 0.4971F, 0.0095F, 0.1132F, -0.2078F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 73).mirror().addBox(-0.914F, -0.7429F, -0.0072F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3319F, -0.5034F, 0.4971F, -1.0813F, 0.1132F, -0.2078F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.914F, -0.389F, 0.026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.3319F, -0.5034F, 0.4971F, -0.9504F, 0.1132F, -0.2078F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.7802F, 2.5183F, 1.5635F));

		PartDefinition cube_r41 = bone2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 61).addBox(-0.5F, -0.35F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3549F, -5.0628F, 3.92F, 0.5429F, 0.1553F, 0.0234F));

		PartDefinition cube_r42 = bone2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 33).addBox(-0.5F, -0.7F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3268F, -5.8056F, 3.7297F, 0.3318F, 0.1571F, 0.0028F));

		PartDefinition cube_r43 = bone2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(99, 93).addBox(-0.5F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5886F, -6.0223F, 5.4099F, -0.4771F, 0.1527F, 0.037F));

		PartDefinition cube_r44 = bone2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(26, 99).addBox(-0.3436F, -0.0422F, -2.1628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5495F, -6.4221F, 6.1254F, -0.086F, 0.1562F, 0.0166F));

		PartDefinition cube_r45 = bone2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 28).addBox(-0.5F, -0.45F, -1.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7324F, -4.9274F, -6.0557F, 0.2869F, -0.1741F, 0.0123F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(85, 43).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2198F, -5.8951F, -2.8313F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(99, 59).addBox(0.3359F, -5.9821F, -2.7128F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6161F, -0.2721F, -1.0063F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 15).addBox(0.0182F, -6.3279F, -1.271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6161F, -0.2721F, -1.7063F, 0.3829F, -0.1741F, 0.0123F));

		PartDefinition cube_r49 = bone2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(15, 48).addBox(0.3359F, -0.0874F, -0.0224F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6161F, -6.2721F, -2.3063F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -2.3F, -0.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2198F, -0.5326F, -1.9476F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(28, 55).addBox(-0.5F, -1.6F, -1.8F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2198F, -3.166F, -0.7166F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(51, 67).addBox(-0.1755F, -0.9359F, -2.3499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3319F, -0.5034F, 0.4971F, -1.6418F, -0.1379F, 0.1309F));

		PartDefinition cube_r53 = bone2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(11, 57).addBox(-0.5F, -1.5F, -1.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2198F, -0.6907F, -1.5835F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bone2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(27, 92).addBox(-0.107F, 3.7401F, -1.3251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4584F, 3.2923F, 3.4856F, 0.8189F, 0.0309F, 0.1365F));

		PartDefinition cube_r55 = bone2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(91, 67).addBox(-0.107F, 2.5606F, 3.2785F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.4584F, 3.2923F, 3.4856F, -0.2632F, 0.0309F, 0.1365F));

		PartDefinition cube_r56 = bone2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(33, 63).addBox(-0.107F, -1.0442F, 5.2626F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-1.4584F, 3.2923F, 3.4856F, -1.005F, 0.0309F, 0.1365F));

		PartDefinition cube_r57 = bone2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 85).addBox(-0.5F, -1.025F, -0.625F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.2489F, 1.2136F, -7.3015F, 1.235F, -0.2048F, -0.0442F));

		PartDefinition cube_r58 = bone2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 67).addBox(-0.5F, -0.8F, -1.175F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.3855F, -0.1958F, -8.2584F, 0.7114F, -0.2048F, -0.0442F));

		PartDefinition cube_r59 = bone2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(96, 99).addBox(-0.5F, -1.15F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.1423F, -1.5272F, -7.3714F, 0.1093F, -0.2048F, -0.0442F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(91, 26).addBox(-0.462F, -3.4885F, -2.2852F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8161F, -0.2191F, -5.7117F, 0.5456F, -0.2048F, -0.0442F));

		PartDefinition cube_r61 = bone2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 5).addBox(-0.5F, -0.875F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.1066F, -1.4516F, -7.1838F, -0.4405F, -0.2048F, -0.0442F));

		PartDefinition cube_r62 = bone2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 38).addBox(-0.5F, -1.6F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9664F, -0.3533F, -6.2759F, -0.2311F, -0.2048F, -0.0442F));

		PartDefinition cube_r63 = bone2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(58, 47).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4798F, -1.0893F, -4.1163F, 0.3369F, -0.2068F, 0.0332F));

		PartDefinition cube_r64 = bone2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(83, 53).addBox(-0.462F, 0.3841F, -0.599F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8161F, -0.2191F, -5.7117F, 0.6678F, -0.2048F, -0.0442F));

		PartDefinition cube_r65 = bone2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(80, 78).addBox(-0.5F, -2.175F, -0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0076F)), PartPose.offsetAndRotation(1.4474F, 1.9823F, -7.1048F, -0.0351F, -0.1896F, -0.0896F));

		PartDefinition cube_r66 = bone2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(78, 44).addBox(-0.5F, -0.55F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.1949F, 0.5169F, -6.4773F, 0.8812F, -0.1896F, -0.0896F));

		PartDefinition cube_r67 = bone2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 79).addBox(-0.462F, -1.3134F, -3.9836F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.8161F, -0.2191F, -5.7117F, -0.1176F, -0.2048F, -0.0442F));

		PartDefinition cube_r68 = bone2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(9, 74).addBox(-1.5514F, -0.0701F, -0.0683F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3496F, 2.3719F, 1.569F, -0.7778F, -0.1036F, 0.16F));

		PartDefinition cube_r69 = bone2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 74).addBox(-1.1346F, -0.7037F, -0.0847F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.3496F, 1.3719F, -0.931F, -0.6207F, -0.1036F, 0.16F));

		PartDefinition cube_r70 = bone2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(84, 25).addBox(-0.6999F, -0.8052F, 0.6067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3496F, -0.3281F, -2.531F, -0.8651F, -0.1036F, 0.16F));

		PartDefinition cube_r71 = bone2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(64, 80).addBox(-0.6999F, -1.7232F, -0.2387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.3496F, -0.3281F, -2.531F, -0.7604F, -0.1036F, 0.16F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(69, 44).addBox(-0.5297F, -0.1352F, 0.9328F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8161F, -0.2191F, -5.7117F, 0.2322F, -0.2068F, 0.0332F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(55, 5).addBox(-0.107F, -0.2653F, -0.2311F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-1.4584F, 3.2923F, 3.4856F, -0.9003F, 0.0309F, 0.1365F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(99, 96).addBox(-0.086F, 0.4327F, -1.4315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3319F, -0.5034F, 0.4971F, 0.8822F, -0.1132F, 0.2078F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(61, 85).addBox(-0.086F, 1.1931F, -0.9783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3319F, -0.5034F, 0.4971F, 0.0095F, -0.1132F, 0.2078F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(52, 73).addBox(-0.086F, -0.7429F, -0.0072F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3319F, -0.5034F, 0.4971F, -1.0813F, -0.1132F, 0.2078F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 22).addBox(-0.086F, -0.389F, 0.026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.3319F, -0.5034F, 0.4971F, -0.9504F, -0.1132F, 0.2078F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 0.3635F, 0.9677F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftLeg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(-0.5F, -1.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4457F, -0.1198F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = leftLeg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-1.0F, -1.5F, -1.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4028F, 0.2206F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r80 = leftLeg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(18, 74).mirror().addBox(-1.0F, 0.0257F, -0.9508F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5686F, -0.2016F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r81 = leftLeg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-1.0F, 2.5068F, 0.3499F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9314F, -0.6016F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r82 = leftLeg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-1.0F, 0.0503F, -0.0303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.729F, -1.067F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r83 = leftLeg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-1.0F, -0.775F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.4649F, -0.5292F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r84 = leftLeg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-1.0F, -0.999F, -0.0402F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6686F, -1.6016F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r85 = leftLeg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(77, 15).mirror().addBox(-1.0F, -2.9951F, 0.2121F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.6686F, -1.8016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.1F, 0.1354F, -1.6811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 47).mirror().addBox(-0.1F, 0.1354F, 0.3189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.2999F, 0.4729F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r86 = leftLeg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(14, 80).mirror().addBox(-0.5F, -4.7179F, -0.7772F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 10.8354F, -0.8811F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r87 = leftLeg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-0.5F, -4.3005F, -1.5471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(86, 0).mirror().addBox(-0.5F, -4.3005F, -0.8471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.3354F, -0.7811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r88 = leftLeg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-0.5F, -3.9005F, -0.1471F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.3354F, -0.7811F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r89 = leftLeg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(87, 75).mirror().addBox(-0.5F, -3.9005F, -0.1721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 4.3354F, -0.7811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r90 = leftLeg2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 59).mirror().addBox(-0.5F, -4.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r91 = leftLeg2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-1.0F, 0.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r92 = leftLeg2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-0.1F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1354F, 1.3189F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r93 = leftLeg2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(61, 61).mirror().addBox(-1.0F, -3.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9F, 5.5785F, -0.4842F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r94 = leftLeg2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-1.0F, -0.1776F, -0.1156F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.9F, 2.1811F, -1.3222F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.3577F, -1.5953F, -0.6981F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-2.0F, -0.2524F, -2.0194F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8007F, 0.3756F, 0.672F, 0.0F, 0.0F));

		PartDefinition leftLeg5 = leftLeg4.addOrReplaceChild("leftLeg5", CubeListBuilder.create().texOffs(53, 29).mirror().addBox(-2.0F, -0.3F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0476F, -2.0194F, -0.6981F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 0.3635F, 0.9677F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r95 = rightLeg.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.5F, -1.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4457F, -0.1198F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r96 = rightLeg.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-1.0F, -1.5F, -1.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4028F, 0.2206F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r97 = rightLeg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(68, 74).mirror().addBox(-1.0F, 0.0257F, -0.9508F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5686F, -0.2016F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r98 = rightLeg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 38).mirror().addBox(-1.0F, 2.5068F, 0.3499F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9314F, -0.6016F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r99 = rightLeg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-1.0F, 0.0503F, -0.0303F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.729F, -1.067F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r100 = rightLeg.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-1.0F, -0.775F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.4649F, -0.5292F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r101 = rightLeg.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(89, 57).mirror().addBox(-1.0F, -0.999F, -0.0402F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6686F, -1.6016F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r102 = rightLeg.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 28).mirror().addBox(-1.0F, -2.9951F, 0.2121F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.6686F, -1.8016F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-1.9F, 0.1354F, -1.6811F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 50).mirror().addBox(-1.9F, 0.1354F, 0.3189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.2999F, 0.4729F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightLeg2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(19, 80).mirror().addBox(-0.5F, -4.7179F, -0.7772F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2F, 10.8354F, -0.8811F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightLeg2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.5F, -4.3005F, -1.5471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(14, 87).mirror().addBox(-0.5F, -4.3005F, -0.8471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(1.2F, 4.3354F, -0.7811F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightLeg2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.5F, -3.9005F, -0.1471F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2F, 4.3354F, -0.7811F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r106 = rightLeg2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -3.9005F, -0.1721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2F, 4.3354F, -0.7811F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r107 = rightLeg2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.5F, -4.7F, -0.2F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(1.2F, 5.1354F, -0.7811F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r108 = rightLeg2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.0F, 0.0F, -0.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 9.1354F, -1.3811F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightLeg2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-1.9F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1354F, 1.3189F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r110 = rightLeg2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-1.0F, -3.5F, -0.6F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 5.5785F, -0.4842F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r111 = rightLeg2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(37, 78).mirror().addBox(-1.0F, -0.1776F, -0.1156F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 2.1811F, -1.3222F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(-1.5F, 0.0F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 11.3577F, -1.5953F, -0.48F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(55, 12).mirror().addBox(-2.0F, -0.2524F, -2.0194F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8007F, 0.3756F, 0.5411F, 0.0F, 0.0F));

		PartDefinition rightLeg5 = rightLeg4.addOrReplaceChild("rightLeg5", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-2.0F, -0.3F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0476F, -2.0194F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 29).mirror().addBox(-0.5F, -0.9208F, -0.0659F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3569F, 4.5923F, -0.3546F, -0.1228F, 0.0453F));

		PartDefinition cube_r112 = tail.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(71, 90).mirror().addBox(0.0F, -1.0F, 1.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.578F, 0.7437F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(81, 89).mirror().addBox(0.0F, -1.5F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.333F, 4.8302F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(13, 96).mirror().addBox(0.0F, -0.9F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0757F, 6.8253F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(0.0F, -5.6F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8208F, 5.9341F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(0.0F, -6.2F, 0.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8208F, 3.9341F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(21, 10).addBox(-0.1F, 3.8F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -3.7208F, 0.0341F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r118 = tail.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(21, 10).mirror().addBox(-1.9F, 3.8F, -0.1F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -3.7208F, 0.0341F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r119 = tail.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(90, 99).mirror().addBox(0.002F, -3.0086F, -0.9624F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.8046F, 2.4931F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r120 = tail.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(0.0F, -4.0901F, -0.2686F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5046F, -0.0069F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r121 = tail.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 78).mirror().addBox(0.0F, -6.387F, 0.0262F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9046F, 1.9931F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail6 = tail.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6208F, 6.9341F, -0.0528F, -0.1307F, 0.0069F));

		PartDefinition cube_r122 = tail6.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(0.0F, -4.1317F, -0.0134F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, 2.9F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r123 = tail6.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(0.0F, -3.6016F, -0.0192F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, 4.9F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r124 = tail6.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(0.0F, 0.271F, 0.411F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5454F, 4.6816F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r125 = tail6.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(50, 93).mirror().addBox(0.0F, 0.3206F, -0.4501F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5555F, 1.01F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r126 = tail6.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(0.0F, -4.8F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r127 = tail6.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(0.0F, 0.181F, -0.1946F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2925F, 2.6992F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r128 = tail6.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(53, 16).addBox(-0.5F, 0.6384F, -0.0007F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.9F, 0.035F, -0.0698F, -0.0024F));

		PartDefinition cube_r129 = tail6.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 16).mirror().addBox(-1.5F, 0.6384F, -0.0007F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.9F, 0.035F, 0.0698F, 0.0024F));

		PartDefinition cube_r130 = tail6.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, -0.4F, -2.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail2 = tail6.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.8F, 0.1057F, -0.0868F, -0.0092F));

		PartDefinition cube_r131 = tail2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(47, 93).mirror().addBox(0.0F, -3.4679F, 0.082F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4888F, -0.0008F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(31, 99).mirror().addBox(0.0F, -2.9377F, 0.0832F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4888F, 1.9992F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(18, 64).mirror().addBox(0.0F, -2.811F, -0.0155F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4888F, 4.0992F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 101).mirror().addBox(0.0F, -2.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4579F, 6.352F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 101).mirror().addBox(0.0F, 0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8005F, 3.1943F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(43, 101).mirror().addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6251F, 1.3671F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(39, 55).addBox(-0.1F, 0.4745F, -0.103F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4888F, 0.0992F, 0.035F, -0.0523F, -0.0018F));

		PartDefinition cube_r138 = tail2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(39, 55).mirror().addBox(-0.9F, 0.4745F, -0.103F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4888F, 0.0992F, 0.035F, 0.0523F, 0.0018F));

		PartDefinition cube_r139 = tail2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 8).mirror().addBox(-0.5F, -0.2F, -5.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4888F, 5.0992F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-0.5F, -0.5288F, -0.0953F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2269F, 6.0418F, 0.0883F, 0.1304F, 0.0115F));

		PartDefinition cube_r140 = tail3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(102, 49).mirror().addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5288F, 3.9047F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r141 = tail3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(101, 62).mirror().addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5288F, 1.9047F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r142 = tail3.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(101, 86).mirror().addBox(0.0F, -0.8F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 66).mirror().addBox(0.0F, -1.5F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6849F, 0.3102F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r143 = tail3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(93, 99).mirror().addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5288F, -0.0953F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0712F, 5.7047F, 0.0354F, 0.1744F, 0.0062F));

		PartDefinition cube_r144 = tail4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 102).mirror().addBox(0.0F, 1.4F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(102, 52).mirror().addBox(0.0F, 0.8F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6136F, -5.3945F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(36, 29).mirror().addBox(-0.5F, -0.4008F, -0.0314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1812F, 5.9297F, 0.0604F, 0.2178F, 0.0131F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(19, 19).mirror().addBox(-0.5F, -0.4008F, -0.0314F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0294F, 6.9127F, -0.1692F, 0.3445F, -0.0576F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3997F, -3.0869F, -0.0088F, 0.0873F, -0.0008F));

		PartDefinition cube_r145 = body.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(44, 92).mirror().addBox(0.0F, -3.9915F, -0.0823F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5308F, -2.0029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r146 = body.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(80, 73).mirror().addBox(-0.5F, -0.0499F, 0.0121F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5308F, -2.0029F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r147 = body.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(95, 77).addBox(0.0052F, 0.0245F, -0.5961F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6308F, -1.4029F, 0.0116F, 0.0615F, 0.3715F));

		PartDefinition cube_r148 = body.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(95, 77).mirror().addBox(-2.0052F, 0.0245F, -0.5961F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6308F, -1.4029F, 0.0116F, -0.0615F, -0.3715F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1308F, -2.0029F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r149 = body2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(0.0F, -3.974F, 0.0631F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r150 = body2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 94).mirror().addBox(0.0F, -3.8851F, 0.0156F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -4.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r151 = body2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(78, 91).mirror().addBox(0.0F, -3.7698F, 0.0834F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -6.1F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r152 = body2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(36, 38).mirror().addBox(-0.5F, -0.4502F, -5.9101F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r153 = body2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(32, 92).addBox(0.4302F, -0.2438F, -0.3948F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.2072F, -0.0194F, 0.54F));

		PartDefinition cube_r154 = body2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(20, 94).addBox(2.094F, -1.2358F, -0.2466F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.1935F, -0.0424F, 0.976F));

		PartDefinition cube_r155 = body2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(13, 94).addBox(3.1882F, -2.8502F, -0.2466F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.158F, -0.1199F, 1.4069F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(92, 45).addBox(0.3991F, -0.3093F, -0.5256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.4F, 0.1027F, 0.0596F, 0.625F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(92, 43).addBox(2.0466F, -1.284F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6F, -3.4F, 0.1322F, 0.0733F, 1.0621F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 57).addBox(2.0665F, -1.3421F, -0.4093F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, 0.0327F, 0.1627F, 1.1087F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(94, 81).addBox(0.4395F, -0.3541F, -0.5569F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, -0.0251F, 0.0988F, 0.6732F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-2.4302F, -0.2438F, -0.3948F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.2072F, 0.0194F, -0.54F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-4.094F, -1.2358F, -0.2466F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.1935F, 0.0424F, -0.976F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(13, 94).mirror().addBox(-5.1882F, -2.8502F, -0.2466F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -5.6F, 0.158F, 0.1199F, -1.4069F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(92, 45).mirror().addBox(-2.3991F, -0.3093F, -0.5256F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -3.4F, 0.1027F, -0.0596F, -0.625F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-4.0466F, -1.284F, -0.3799F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.6F, -3.4F, 0.1322F, -0.0733F, -1.0621F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(83, 57).mirror().addBox(-3.0665F, -1.3421F, -0.4093F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, 0.0327F, -0.1627F, -1.1087F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-2.4395F, -0.3541F, -0.5569F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, -0.0251F, -0.0988F, -0.6732F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4841F, -5.9811F, -0.2102F, 0.0854F, -0.0182F));

		PartDefinition cube_r167 = body3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(0.0F, -3.7019F, -0.0959F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -1.7F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r168 = body3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(56, 93).mirror().addBox(0.0F, -3.4341F, -0.0468F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -3.6F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r169 = body3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(72, 100).mirror().addBox(0.0F, -2.9752F, -0.0268F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8F, -5.4F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r170 = body3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 35).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.6557F, 0.6013F, -0.2307F, 0.4758F));

		PartDefinition cube_r171 = body3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(93, 33).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.6557F, 0.4677F, -0.3977F, 0.9006F));

		PartDefinition cube_r172 = body3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(51, 45).addBox(3.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.457F, -4.6557F, 0.2533F, -0.5547F, 1.3604F));

		PartDefinition cube_r173 = body3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(93, 2).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -2.8557F, 0.5354F, -0.1858F, 0.4888F));

		PartDefinition cube_r174 = body3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(93, 0).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -2.8557F, 0.4247F, -0.3301F, 0.9153F));

		PartDefinition cube_r175 = body3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(38, 27).addBox(3.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.457F, -2.8557F, 0.2459F, -0.4763F, 1.3634F));

		PartDefinition cube_r176 = body3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(91, 31).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.0557F, 0.4548F, -0.1497F, 0.5191F));

		PartDefinition cube_r177 = body3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(77, 13).addBox(3.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.0557F, 0.2201F, -0.3923F, 1.3911F));

		PartDefinition cube_r178 = body3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(32, 94).addBox(1.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.657F, -1.0557F, 0.3648F, -0.2643F, 0.9497F));

		PartDefinition cube_r179 = body3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.6557F, 0.6013F, 0.2307F, -0.4758F));

		PartDefinition cube_r180 = body3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.6557F, 0.4677F, 0.3977F, -0.9006F));

		PartDefinition cube_r181 = body3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(51, 45).mirror().addBox(-10.1021F, -2.3689F, -0.3751F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.457F, -4.6557F, 0.2533F, 0.5547F, -1.3604F));

		PartDefinition cube_r182 = body3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(93, 2).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -2.8557F, 0.5354F, 0.1858F, -0.4888F));

		PartDefinition cube_r183 = body3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -2.8557F, 0.4247F, 0.3301F, -0.9153F));

		PartDefinition cube_r184 = body3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(38, 27).mirror().addBox(-9.1021F, -2.3689F, -0.3751F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.457F, -2.8557F, 0.2459F, 0.4763F, -1.3634F));

		PartDefinition cube_r185 = body3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.0557F, 0.4548F, 0.1497F, -0.5191F));

		PartDefinition cube_r186 = body3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(77, 13).mirror().addBox(-7.1021F, -2.3689F, -0.3751F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.0557F, 0.2201F, 0.3923F, -1.3911F));

		PartDefinition cube_r187 = body3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 94).mirror().addBox(-3.8126F, -0.836F, -0.3751F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.657F, -1.0557F, 0.3648F, 0.2643F, -0.9497F));

		PartDefinition cube_r188 = body3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-0.5F, 0.389F, 0.18F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, -5.8F, 0.4451F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 2.057F, -5.3557F, 0.2715F, 0.0841F, 0.0234F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8779F, 0.2384F, -0.6312F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3186F, 11.3278F, -3.8917F, 0.0454F, 0.5199F, -0.3602F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(67, 100).addBox(0.4F, -3.762F, 3.7338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, -0.0065F, 0.1213F, -0.1285F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(74, 54).addBox(0.4F, -2.0598F, 2.1076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.3862F, 0.1213F, -0.1285F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(87, 71).addBox(0.3119F, -3.8229F, 3.4157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.186F, 0.1462F, -0.0992F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(82, 38).addBox(0.3119F, -2.9488F, -3.7119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.9452F, 0.1462F, -0.0992F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8779F, 0.2384F, -0.1312F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3186F, 11.3278F, -3.8917F, -0.0157F, 0.5897F, -0.3602F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(82, 20).addBox(0.3119F, -2.8893F, -2.4577F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 1.5561F, 0.1462F, -0.0992F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(39, 61).addBox(0.3119F, -1.3911F, -2.8181F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.8318F, 0.1462F, -0.0992F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(93, 83).addBox(-0.0313F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2367F, -1.1496F, 0.3319F, -0.1484F, 0.5172F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(3, 94).addBox(1.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2367F, -1.1496F, 0.252F, -0.2119F, 0.9562F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(53, 34).addBox(3.0581F, -2.3565F, -0.2702F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2367F, -1.1496F, 0.1386F, -0.298F, 1.3986F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(87, 81).addBox(-0.0313F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9101F, -4.7091F, 0.4797F, -0.2371F, 0.6194F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(89, 65).addBox(1.7675F, -0.8433F, -0.2701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9101F, -4.7091F, 0.3493F, -0.3539F, 1.0595F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(40, 16).addBox(3.0581F, -2.3565F, -0.2701F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.9101F, -4.7091F, 0.1626F, -0.4665F, 1.5203F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(95, 79).addBox(-0.0313F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1367F, -2.9496F, 0.3763F, -0.1907F, 0.5474F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(53, 36).addBox(3.0581F, -2.3565F, -0.2702F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1367F, -2.9496F, 0.1332F, -0.3586F, 1.438F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 85).addBox(1.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1367F, -2.9496F, 0.2742F, -0.2688F, 0.9885F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(51, 38).addBox(-0.8779F, 0.2384F, -0.5312F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3186F, 11.3278F, -3.8917F, 0.0548F, 0.6986F, -0.3172F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(52, 55).addBox(-0.6323F, -0.0015F, -0.6811F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2186F, 11.6278F, -3.7917F, 0.1499F, 0.7844F, -0.3825F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(7, 64).addBox(-0.2503F, 0.3564F, -0.5161F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1186F, 11.3278F, -4.1917F, 0.5019F, 0.9723F, -0.2438F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(68, 15).addBox(-1.6186F, 0.0462F, -2.9013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(68, 15).mirror().addBox(-2.6186F, 0.0462F, -2.9013F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1186F, 11.3278F, -3.7917F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(44, 78).addBox(4.6001F, -1.173F, -2.5933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 1.6639F, 0.6535F, 1.4412F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(30, 78).addBox(1.5507F, -1.5896F, -5.1525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 1.0343F, 0.4331F, 0.244F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(21, 87).addBox(0.3119F, -2.8327F, 2.3211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.4478F, 0.1462F, -0.0992F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(43, 47).addBox(0.3119F, -1.8835F, -2.8624F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.7969F, 0.1462F, -0.0992F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(74, 49).addBox(0.3119F, -1.4988F, 0.2142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8181F, 6.5083F, -5.0282F, 0.6049F, 0.1462F, -0.0992F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(53, 34).mirror().addBox(-10.0581F, -2.3565F, -0.2702F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2367F, -1.1496F, 0.1386F, 0.298F, -1.3986F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(3, 94).mirror().addBox(-3.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2367F, -1.1496F, 0.252F, 0.2119F, -0.9562F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-1.9687F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.2367F, -1.1496F, 0.3319F, 0.1484F, -0.5172F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(93, 85).mirror().addBox(-3.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1367F, -2.9496F, 0.2742F, 0.2688F, -0.9885F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(53, 36).mirror().addBox(-9.0581F, -2.3565F, -0.2702F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1367F, -2.9496F, 0.1332F, 0.3586F, -1.438F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-1.9687F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1367F, -2.9496F, 0.3763F, 0.1907F, -0.5474F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-8.0581F, -2.3565F, -0.2701F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9101F, -4.7091F, 0.1626F, 0.4665F, -1.5203F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(89, 65).mirror().addBox(-3.7675F, -0.8433F, -0.2701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9101F, -4.7091F, 0.3493F, 0.3539F, -1.0595F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(87, 81).mirror().addBox(-1.9687F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.9101F, -4.7091F, 0.4797F, 0.2371F, -0.6194F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 99).mirror().addBox(0.5F, -2.885F, -0.011F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5367F, -1.8496F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(99, 70).mirror().addBox(0.5F, -2.8823F, -0.0899F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4367F, -3.5496F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(37, 99).mirror().addBox(0.5F, -2.895F, 0.0124F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3367F, -5.4496F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-1.3119F, -1.4988F, 0.2142F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.6049F, -0.1462F, 0.0992F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-1.4F, -2.0598F, 2.1076F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.3862F, -0.1213F, 0.1285F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(67, 100).mirror().addBox(-1.4F, -3.762F, 3.7338F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, -0.0065F, -0.1213F, 0.1285F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-1.3119F, -1.3911F, -2.8181F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.8318F, -0.1462F, 0.0992F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-1.3119F, -2.8893F, -2.4577F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 1.5561F, -0.1462F, 0.0992F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(82, 38).mirror().addBox(-1.3119F, -2.9488F, -3.7119F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.9452F, -0.1462F, 0.0992F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(43, 47).mirror().addBox(-1.3119F, -1.8835F, -2.8624F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.7969F, -0.1462F, 0.0992F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-1.3119F, -2.8327F, 2.3211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.4478F, -0.1462F, 0.0992F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.7497F, 0.3564F, -0.5161F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1186F, 11.3278F, -4.1917F, 0.5019F, -0.9723F, 0.2438F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-0.3676F, -0.0015F, -0.6811F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2186F, 11.6278F, -3.7917F, 0.1499F, -0.7844F, 0.3825F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(-0.1221F, 0.2384F, -0.5312F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3186F, 11.3278F, -3.8917F, 0.0548F, -0.6986F, 0.3172F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.1221F, 0.2384F, -0.6312F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3186F, 11.3278F, -3.8917F, 0.0454F, -0.5199F, 0.3602F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.1221F, 0.2384F, -0.1312F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3186F, 11.3278F, -3.8917F, -0.0157F, -0.5897F, 0.3602F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(87, 71).mirror().addBox(-1.3119F, -3.8229F, 3.4157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 0.186F, -0.1462F, 0.0992F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(30, 78).mirror().addBox(-2.5508F, -1.5896F, -5.1525F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 1.0343F, -0.4331F, -0.244F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-5.6001F, -1.173F, -2.5933F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.8181F, 6.5083F, -5.0282F, 1.6639F, -0.6535F, -1.4412F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(13, 39).mirror().addBox(0.0F, -0.1729F, -2.0477F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5367F, -3.5496F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.072F, 9.1659F, -6.7304F, 0.3517F, 0.0869F, 0.0867F));

		PartDefinition cube_r244 = leftArm.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-0.5F, -1.8F, -0.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.0354F, 4.5557F, 0.1904F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r245 = leftArm.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.5F, -1.6499F, -0.7676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0736F, 1.9715F, -0.5194F, -0.4463F, 0.4784F, -0.0408F));

		PartDefinition cube_r246 = leftArm.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(3, 96).mirror().addBox(-0.5F, -0.3585F, -0.7872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0736F, 1.9715F, -0.5194F, 0.3653F, 0.4784F, -0.0408F));

		PartDefinition cube_r247 = leftArm.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(62, 94).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0354F, 0.7654F, 0.0275F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftArm.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(91, 87).mirror().addBox(0.0F, -1.8196F, -1.0747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5354F, 3.0929F, 0.3332F, 0.0175F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-1.0F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(54, 78).mirror().addBox(-1.0F, 0.5F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0354F, 7.1929F, 1.4332F, -0.5424F, -0.4728F, 0.1272F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(28, 39).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3297F, 5.4831F, -1.423F, 0.0985F, -0.3165F, -0.1985F));

		PartDefinition cube_r249 = leftArm3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftArm3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(84, 29).mirror().addBox(-0.7F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, 0.3054F));

		PartDefinition opposablePinkie = leftArm3.addOrReplaceChild("opposablePinkie", CubeListBuilder.create().texOffs(89, 95).mirror().addBox(-0.4206F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0294F, 0.4414F, 1.8551F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightArm = chest.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.072F, 9.1659F, -6.7304F, -0.1282F, -0.0869F, -0.0867F));

		PartDefinition cube_r251 = rightArm.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-0.5F, -1.8F, -0.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0354F, 4.5557F, 0.1904F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r252 = rightArm.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(95, 11).mirror().addBox(-0.5F, -1.6499F, -0.7676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0736F, 1.9715F, -0.5194F, -0.4463F, -0.4784F, 0.0408F));

		PartDefinition cube_r253 = rightArm.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(96, 4).mirror().addBox(-0.5F, -0.3585F, -0.7872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0736F, 1.9715F, -0.5194F, 0.3653F, -0.4784F, 0.0408F));

		PartDefinition cube_r254 = rightArm.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0354F, 0.7654F, 0.0275F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r255 = rightArm.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-1.0F, -1.8196F, -1.0747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5354F, 3.0929F, 0.3332F, 0.0175F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm.addOrReplaceChild("rightArm2", CubeListBuilder.create().texOffs(77, 5).mirror().addBox(0.0F, -0.5F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(59, 78).mirror().addBox(0.0F, 0.5F, -1.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0354F, 7.1929F, 1.4332F, -0.8042F, 0.4728F, -0.1272F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(61, 71).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3297F, 5.4831F, -1.423F, 0.2494F, 0.1921F, 0.3526F));

		PartDefinition cube_r256 = rightArm3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r257 = rightArm3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(86, 83).mirror().addBox(-0.3F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition opposablePinkie2 = rightArm3.addOrReplaceChild("opposablePinkie2", CubeListBuilder.create().texOffs(94, 95).mirror().addBox(-0.5794F, -0.3392F, -0.6694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0294F, 0.4414F, 1.8551F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 2.7281F, -5.4034F, 0.499F, 0.0767F, 0.0417F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(0.0F, -2.3622F, 0.0185F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8974F, -1.6605F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(58, 53).addBox(-0.0313F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -1.6557F, 0.1835F, -0.0171F, 0.7622F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(89, 41).addBox(1.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.157F, -1.6557F, 0.173F, -0.0303F, 1.1985F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(68, 20).addBox(-0.0136F, -0.1462F, -0.6809F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5617F, 3.3322F, -1.2598F, 0.1561F, -0.0807F, 1.5002F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(-3.9864F, -0.1462F, -0.6809F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5617F, 3.3322F, -1.2598F, 0.1561F, 0.0807F, -1.5002F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(89, 41).mirror().addBox(-3.7675F, -0.8433F, -0.2702F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -1.6557F, 0.173F, 0.0303F, -1.1985F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(58, 53).mirror().addBox(-1.9687F, -0.0241F, -0.3926F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.157F, -1.6557F, 0.1835F, 0.0171F, -0.7622F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(42, 67).mirror().addBox(-0.5F, -0.5497F, -2.7205F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0707F, 0.1123F, -0.2793F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8914F, -2.5951F, 0.1056F, 0.1302F, 0.0138F));

		PartDefinition cube_r266 = neck2.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(21, 102).mirror().addBox(0.5F, -1.0927F, -3.0235F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 63).mirror().addBox(0.0F, -0.1927F, -4.0235F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0647F, 0.288F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r267 = neck2.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(61, 101).mirror().addBox(0.5F, -1.6927F, -1.0235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0647F, 0.288F, -0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r268 = neck2.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(95, 75).addBox(0.0734F, 0.0426F, -0.4909F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3147F, -2.437F, 0.3638F, -0.3487F, 1.1257F));

		PartDefinition cube_r269 = neck2.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(82, 10).addBox(-0.0275F, -0.0775F, -0.6534F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0647F, -0.412F, 0.3328F, -0.1022F, 1.2141F));

		PartDefinition cube_r270 = neck2.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(95, 75).mirror().addBox(-2.0734F, 0.0426F, -0.4909F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.3147F, -2.437F, 0.3638F, 0.3487F, -1.1257F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-2.9725F, -0.0775F, -0.6534F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0647F, -0.412F, 0.3328F, 0.1022F, -1.2141F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.78F, -3.2911F, -0.5742F, 0.147F, -0.0945F));

		PartDefinition cube_r272 = neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(101, 41).addBox(0.7177F, 0.2648F, -0.1951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 27).addBox(2.4708F, 0.956F, 0.9446F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.9774F, -3.5105F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r273 = neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(101, 41).mirror().addBox(-1.7177F, 0.2648F, -0.1951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 27).mirror().addBox(-3.4708F, 0.956F, 0.9446F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.9774F, -3.5105F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition cube_r274 = neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(0.0F, -1.15F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 102).mirror().addBox(0.0F, -0.85F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7554F, -3.2072F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r275 = neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(34, 73).mirror().addBox(-0.5F, -0.284F, 3.7966F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.0833F, -6.523F, -0.2443F, 0.0F, 0.0F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9833F, -2.823F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r276 = neck4.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(0.0F, -1.45F, -1.85F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 73).mirror().addBox(-0.5F, -0.45F, -2.85F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r277 = neck4.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(101, 56).addBox(-1.0349F, -0.3506F, -0.4778F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0059F, -0.6875F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r278 = neck4.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(101, 56).mirror().addBox(0.0349F, -0.3506F, -0.4778F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0059F, -0.6875F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6F, -2.3F, -0.0886F, 0.1739F, -0.0154F));

		PartDefinition cube_r279 = neck5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 102).mirror().addBox(0.0F, -1.375F, -1.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 84).mirror().addBox(-0.5F, -0.375F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r280 = neck5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 47).addBox(-2.8095F, -0.9856F, -0.8988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6059F, 1.6125F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r281 = neck5.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(85, 47).mirror().addBox(1.8095F, -0.9856F, -0.8988F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.6059F, 1.6125F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, -1.775F, 0.1232F, 0.1299F, 0.016F));

		PartDefinition cube_r282 = neck6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(27, 102).mirror().addBox(0.0F, -1.375F, -1.025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 67).mirror().addBox(-0.5F, -0.375F, -4.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 67).mirror().addBox(-0.5F, -0.375F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r283 = neck6.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(101, 6).addBox(-4.2539F, -1.5532F, -1.8161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3059F, 3.3875F, 0.3961F, -0.7348F, 1.1276F));

		PartDefinition cube_r284 = neck6.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(101, 6).mirror().addBox(3.2539F, -1.5532F, -1.8161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.3059F, 3.3875F, 0.3961F, 0.7348F, -1.1276F));

		PartDefinition head2 = neck6.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.273F, -2.6509F, 0.4215F, 0.1237F, 0.0428F));

		PartDefinition cube_r285 = head2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-0.5F, -0.0065F, -0.9759F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8326F, -4.6153F, 0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r286 = head2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(-1.0F, 0.5363F, -0.5674F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9076F, -7.4154F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r287 = head2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(13, 91).mirror().addBox(-1.0F, -0.8082F, -0.2076F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4424F, -7.6654F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r288 = head2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(91, 15).mirror().addBox(-1.0F, -0.6077F, 0.259F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3174F, -7.0904F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r289 = head2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(91, 8).mirror().addBox(-1.0F, -0.8025F, -0.2922F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3174F, -7.0904F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r290 = head2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(90, 53).mirror().addBox(-1.0F, 0.4149F, -0.6255F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9076F, -7.4154F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r291 = head2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(-0.5F, -0.1224F, -0.8307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9076F, -7.4154F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r292 = head2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(99, 43).mirror().addBox(-0.5F, 0.0008F, -0.987F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3826F, -6.5404F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r293 = head2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(21, 96).mirror().addBox(-0.5F, -0.0113F, -0.9991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6326F, -5.5654F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r294 = head2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(49, 89).mirror().addBox(-0.5F, -0.0032F, -1.9507F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.9326F, -2.6403F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r295 = head2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(37, 84).mirror().addBox(-1.0F, -0.0245F, -0.0701F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4326F, 0.2597F, -0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r296 = head2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(91, 23).mirror().addBox(-1.0F, 1.3699F, 0.7407F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(86, 33).mirror().addBox(-1.0F, 0.3699F, -0.0593F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(30, 84).mirror().addBox(-1.0F, -0.0301F, -0.0593F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8326F, -1.6404F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r297 = head2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(28, 88).mirror().addBox(-1.0F, -2.0177F, -1.0071F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5174F, -2.0653F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r298 = head2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(-1.0F, -0.005F, -0.0171F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.7076F, -0.6903F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r299 = head2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(82, 63).mirror().addBox(-1.0F, -0.032F, -0.9931F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.8326F, -1.6404F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = head2.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.58F, -1.2945F, -0.2347F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(-0.5F, -0.6457F, -0.1674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false)
				.texOffs(26, 96).mirror().addBox(-0.5F, -0.6457F, -0.3424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F)).mirror(false)
				.texOffs(31, 96).mirror().addBox(-0.5F, -0.397F, -0.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.31F, 0.3281F, -5.6707F, 0.131F, -0.0565F, -0.0049F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(96, 37).mirror().addBox(-0.5F, -0.4581F, -0.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(36, 96).mirror().addBox(-0.5F, -0.4581F, -0.4565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.31F, 0.3281F, -5.6707F, 0.4365F, -0.0565F, -0.0049F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(96, 56).mirror().addBox(-0.5F, -0.6629F, -0.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.31F, 0.3281F, -5.6707F, 0.5499F, -0.0565F, -0.0049F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(13, 102).mirror().addBox(0.0F, -0.5985F, -1.5296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.0869F, -3.578F, -0.0611F, -0.0698F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-0.175F, 0.7744F, -4.6375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.3381F, -2.4306F, -0.0218F, -0.1222F, 0.0F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(52, 102).mirror().addBox(0.0F, -0.5624F, -0.517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.0869F, -3.578F, -0.1484F, -0.0698F, 0.0F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(58, 102).mirror().addBox(0.0F, -0.6356F, 0.5254F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.02F, 1.0869F, -3.578F, -0.288F, -0.0698F, 0.0F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(0.2194F, 0.0131F, -1.9909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.3381F, -4.2306F, 0.1222F, -0.1222F, 0.0F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(0.0F, -0.0211F, -1.7768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.3381F, -2.4306F, 0.0175F, -0.1222F, 0.0F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.1F, 0.9016F, -0.6485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.3381F, -2.4306F, -0.2531F, -0.1222F, 0.0F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(51, 99).mirror().addBox(-0.1F, 0.7728F, -1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.32F, -0.3381F, -2.4306F, -0.0785F, -0.1222F, 0.0F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(98, 29).mirror().addBox(-0.33F, -0.2952F, 0.0468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -1.0036F, -0.0698F, 0.0F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(96, 40).mirror().addBox(-0.33F, 0.2014F, -0.7605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.2705F, -0.0698F, 0.0F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(82, 97).mirror().addBox(-0.54F, -1.6135F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 97).mirror().addBox(-0.54F, -1.3135F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, 1.1432F, -0.0698F, 0.0F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.54F, -0.9686F, -0.4066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, 1.7541F, -0.0698F, 0.0F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(97, 53).mirror().addBox(-0.54F, -0.4485F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, 2.4522F, -0.0698F, 0.0F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-0.54F, -0.0707F, -0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -2.7838F, -0.0698F, 0.0F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(97, 47).mirror().addBox(-0.54F, 0.0514F, -0.9723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -1.9548F, -0.0698F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(96, 90).mirror().addBox(-0.54F, -0.0268F, -1.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -1.2566F, -0.0698F, 0.0F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(96, 87).mirror().addBox(-0.54F, -0.3932F, -1.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.5149F, -0.0698F, 0.0F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-0.56F, -0.8815F, -1.0664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 67).mirror().addBox(-0.67F, -0.8815F, -1.0664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, 0.0524F, -0.0698F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(69, 49).mirror().addBox(-0.33F, -0.788F, -0.8518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -1.6144F, -0.0698F, 0.0F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-0.55F, -1.1758F, -0.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.8334F, -0.0698F, 0.0F));

		PartDefinition cube_r323 = leftFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(101, 38).mirror().addBox(-0.55F, -0.7833F, 0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, 0.0349F, -0.0698F, 0.0F));

		PartDefinition cube_r324 = leftFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(100, 83).mirror().addBox(-0.55F, -0.3924F, 0.0489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.7505F, -0.0698F, 0.0F));

		PartDefinition cube_r325 = leftFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(80, 100).mirror().addBox(-0.55F, -1.1254F, -0.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.9687F, -0.0698F, 0.0F));

		PartDefinition cube_r326 = leftFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(75, 100).mirror().addBox(-0.55F, -1.7433F, -0.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -1.0996F, -0.0698F, 0.0F));

		PartDefinition cube_r327 = leftFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(101, 18).mirror().addBox(-0.55F, -0.5376F, 0.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.19F, 0.5318F, -1.2525F, -0.4887F, -0.0698F, 0.0F));

		PartDefinition cube_r328 = leftFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(39, 92).mirror().addBox(-0.3823F, -1.992F, -1.0375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.19F, -0.2932F, -0.5025F, 2.8013F, -0.0698F, 0.0F));

		PartDefinition cube_r329 = leftFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(16, 96).mirror().addBox(-0.65F, -0.625F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.12F, 1.7403F, -0.151F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(56, 99).mirror().addBox(-1.2F, -0.226F, 0.3947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(98, 15).mirror().addBox(-1.2F, -0.226F, -0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.58F, 0.5619F, 1.1944F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r331 = leftFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(101, 24).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightFace = head2.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.58F, -1.2945F, -0.2347F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(96, 26).addBox(-0.5F, -0.6457F, -0.1674F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F))
				.texOffs(26, 96).addBox(-0.5F, -0.6457F, -0.3424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.213F))
				.texOffs(31, 96).addBox(-0.5F, -0.397F, -0.9201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.31F, 0.3281F, -5.6707F, 0.131F, 0.0565F, 0.0049F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(96, 37).addBox(-0.5F, -0.4581F, -0.0815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 96).addBox(-0.5F, -0.4581F, -0.4565F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.31F, 0.3281F, -5.6707F, 0.4365F, 0.0565F, 0.0049F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(96, 56).addBox(-0.5F, -0.6629F, -0.7505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.31F, 0.3281F, -5.6707F, 0.5499F, 0.0565F, 0.0049F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(13, 102).addBox(0.0F, -0.5985F, -1.5296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 1.0869F, -3.578F, -0.0611F, 0.0698F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(68, 10).addBox(-0.825F, 0.7744F, -4.6375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.32F, -0.3381F, -2.4306F, -0.0218F, 0.1222F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(52, 102).addBox(0.0F, -0.5624F, -0.517F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 1.0869F, -3.578F, -0.1484F, 0.0698F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(58, 102).addBox(0.0F, -0.6356F, 0.5254F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.02F, 1.0869F, -3.578F, -0.288F, 0.0698F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(89, 19).addBox(-1.2194F, 0.0131F, -1.9909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.32F, -0.3381F, -4.2306F, 0.1222F, 0.1222F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(89, 4).addBox(-1.0F, -0.0211F, -1.7768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.32F, -0.3381F, -2.4306F, 0.0175F, 0.1222F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(100, 0).addBox(-0.9F, 0.9016F, -0.6485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.32F, -0.3381F, -2.4306F, -0.2531F, 0.1222F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(51, 99).addBox(-0.9F, 0.7728F, -1.7972F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.32F, -0.3381F, -2.4306F, -0.0785F, 0.1222F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(98, 29).addBox(-0.67F, -0.2952F, 0.0468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -1.0036F, 0.0698F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(96, 40).addBox(-0.67F, 0.2014F, -0.7605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.2705F, 0.0698F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(82, 97).addBox(-0.46F, -1.6135F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 97).addBox(-0.46F, -1.3135F, -0.8058F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, 1.1432F, 0.0698F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(67, 97).addBox(-0.46F, -0.9686F, -0.4066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, 1.7541F, 0.0698F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(97, 53).addBox(-0.46F, -0.4485F, -0.2521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, 2.4522F, 0.0698F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(97, 50).addBox(-0.46F, -0.0707F, -0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -2.7838F, 0.0698F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(97, 47).addBox(-0.46F, 0.0514F, -0.9723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -1.9548F, 0.0698F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(96, 90).addBox(-0.46F, -0.0268F, -1.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -1.2566F, 0.0698F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(96, 87).addBox(-0.46F, -0.3932F, -1.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.5149F, 0.0698F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(96, 64).addBox(-0.44F, -0.8815F, -1.0664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 67).addBox(-0.33F, -0.8815F, -1.0664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, 0.0524F, 0.0698F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(69, 49).addBox(-0.67F, -0.788F, -0.8518F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -1.6144F, 0.0698F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(98, 21).addBox(-0.45F, -1.1758F, -0.1237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.8334F, 0.0698F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(101, 38).addBox(-0.45F, -0.7833F, 0.6036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, 0.0349F, 0.0698F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(100, 83).addBox(-0.45F, -0.3924F, 0.0489F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.7505F, 0.0698F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(80, 100).addBox(-0.45F, -1.1254F, -0.006F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.9687F, 0.0698F, 0.0F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(75, 100).addBox(-0.45F, -1.7433F, -0.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -1.0996F, 0.0698F, 0.0F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(101, 18).addBox(-0.45F, -0.5376F, 0.0024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.19F, 0.5318F, -1.2525F, -0.4887F, 0.0698F, 0.0F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(39, 92).addBox(-0.6177F, -1.992F, -1.0375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.19F, -0.2932F, -0.5025F, 2.8013F, 0.0698F, 0.0F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(16, 96).addBox(-0.35F, -0.625F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.12F, 1.7403F, -0.151F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(56, 99).addBox(0.2F, -0.226F, 0.3947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 15).addBox(0.2F, -0.226F, -0.2052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.58F, 0.5619F, 1.1944F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(101, 24).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0977F, 1.3929F, -0.7995F, -0.0784F, 0.0016F, -0.0113F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(21, 99).addBox(-0.2505F, 0.4226F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 98).addBox(-0.1505F, -0.0774F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0968F, 0.5594F, -5.8708F, -1.6406F, -0.0175F, 0.0F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(41, 98).addBox(-0.1505F, -0.3738F, -1.2202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0968F, 0.5594F, -5.8708F, -0.6807F, -0.0175F, 0.0F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(101, 99).addBox(0.0666F, -1.4579F, -2.887F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, 0.1833F, 0.1571F, 0.0F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(84, 93).addBox(-0.0038F, -0.9312F, -2.304F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, -0.0785F, 0.1134F, 0.0F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(16, 100).addBox(-0.1051F, -0.8648F, -0.4681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0968F, 0.5594F, -5.4708F, 0.2966F, 0.1096F, -0.0009F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(100, 32).addBox(-0.1047F, -0.7494F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0968F, 0.5594F, -5.4708F, -0.0524F, 0.1134F, 0.0F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(100, 11).addBox(-0.15F, -0.7629F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(-0.0968F, 0.5594F, -5.8708F, 0.0349F, 0.0698F, 0.0F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(89, 37).addBox(-0.8138F, -0.7282F, -1.9547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, -0.0262F, 0.1134F, 0.0F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(82, 59).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8218F, 0.322F, -1.3219F, 0.0088F, 0.0873F, 0.0004F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(71, 82).addBox(-0.7334F, -1.1051F, -3.4714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, 0.0524F, 0.1571F, 0.0F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(56, 89).addBox(-0.8138F, -0.97F, -1.8752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, -0.0436F, 0.1134F, 0.0F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(96, 18).addBox(-0.6551F, -0.4607F, 0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9105F, 0.1481F, -2.3238F, 0.3403F, 0.0398F, -0.0009F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(83, 49).addBox(-0.7334F, -0.7946F, -3.4298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0782F, 0.5594F, -2.0708F, 0.0175F, 0.1571F, 0.0F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(101, 90).addBox(0.8F, 0.0782F, -1.5674F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 90).mirror().addBox(-1.0109F, 0.0782F, -1.5674F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2032F, 0.4342F, -0.5182F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(101, 3).addBox(-0.5009F, -0.1669F, 0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(101, 35).addBox(-0.5009F, -0.1669F, -0.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.9041F, 0.3169F, -0.1479F, 0.3665F, 0.0436F, 0.0F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(25, 69).addBox(-0.5009F, -0.6365F, -1.733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F))
				.texOffs(68, 5).addBox(-0.5009F, -0.3365F, -2.3329F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9041F, 0.3169F, -0.1479F, -0.1745F, 0.0436F, 0.0F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(21, 99).mirror().addBox(-0.7495F, 0.4226F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 98).mirror().addBox(-0.8495F, -0.0774F, -0.9235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2923F, 0.5594F, -5.8708F, -1.6406F, 0.0175F, 0.0F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(41, 98).mirror().addBox(-0.8495F, -0.3738F, -1.2202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.2923F, 0.5594F, -5.8708F, -0.6807F, 0.0175F, 0.0F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-0.0666F, -1.4579F, -2.887F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, 0.1833F, -0.1571F, 0.0F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(84, 93).mirror().addBox(0.0038F, -0.9312F, -2.304F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, -0.0785F, -0.1134F, 0.0F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(16, 100).mirror().addBox(-0.8949F, -0.8648F, -0.4681F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.2923F, 0.5594F, -5.4708F, 0.2966F, -0.1096F, 0.0009F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(100, 32).mirror().addBox(-0.8953F, -0.7494F, -0.4616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.2923F, 0.5594F, -5.4708F, -0.0524F, -0.1134F, 0.0F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(100, 11).mirror().addBox(-0.85F, -0.7629F, -0.6903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(0.2923F, 0.5594F, -5.8708F, 0.0349F, -0.0698F, 0.0F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-0.1862F, -0.7282F, -1.9547F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.14F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, -0.0262F, -0.1134F, 0.0F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6264F, 0.322F, -1.3219F, 0.0088F, -0.0873F, -0.0004F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(-0.2666F, -1.1051F, -3.4714F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, 0.0524F, -0.1571F, 0.0F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(56, 89).mirror().addBox(-0.1862F, -0.97F, -1.8752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, -0.0436F, -0.1134F, 0.0F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(96, 18).mirror().addBox(-0.3449F, -0.4607F, 0.1195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7151F, 0.1481F, -2.3238F, 0.3403F, -0.0398F, 0.0009F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-0.2666F, -0.7946F, -3.4298F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8828F, 0.5594F, -2.0708F, 0.0175F, -0.1571F, 0.0F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(101, 3).mirror().addBox(-0.4991F, -0.1669F, 0.2726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 35).mirror().addBox(-0.4991F, -0.1669F, -0.0274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.7086F, 0.3169F, -0.1479F, 0.3665F, -0.0436F, 0.0F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.4991F, -0.6365F, -1.733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(68, 5).mirror().addBox(-0.4991F, -0.3365F, -2.3329F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7086F, 0.3169F, -0.1479F, -0.1745F, -0.0436F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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