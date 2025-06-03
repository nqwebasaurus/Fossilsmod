package fossils.fossils.client.blockentity.model.euhelopus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuhelopusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart head;
	private final ModelPart ForeHead;
	private final ModelPart ForeHead2;
	private final ModelPart Snout;
	private final ModelPart Snout2;
	private final ModelPart Snout3;
	private final ModelPart Nose;
	private final ModelPart Nose2;
	private final ModelPart jaw;
	private final ModelPart Jaw2;
	private final ModelPart Jaw3;

	public EuhelopusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm = this.chest.getChild("leftArm");
		this.leftArm3 = this.leftArm.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightArm3 = this.leftArm.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.head = this.neck8.getChild("head");
		this.ForeHead = this.head.getChild("ForeHead");
		this.ForeHead2 = this.ForeHead.getChild("ForeHead2");
		this.Snout = this.head.getChild("Snout");
		this.Snout2 = this.Snout.getChild("Snout2");
		this.Snout3 = this.Snout2.getChild("Snout3");
		this.Nose = this.Snout2.getChild("Nose");
		this.Nose2 = this.Nose.getChild("Nose2");
		this.jaw = this.head.getChild("jaw");
		this.Jaw2 = this.jaw.getChild("Jaw2");
		this.Jaw3 = this.Jaw2.getChild("Jaw3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -35.4408F, 13.9016F, -0.2182F, 0.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 127).mirror().addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1492F, 1.0905F, -0.2199F, 0.1222F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 161).mirror().addBox(-0.5F, -0.0371F, -0.799F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(0, 161).addBox(8.5F, -0.0371F, -0.799F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -4.23F, -10.1055F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 162).mirror().addBox(-0.5F, 1.3986F, -5.8988F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(120, 161).mirror().addBox(-0.5F, -0.1014F, -2.9988F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 162).addBox(8.5F, 1.3986F, -5.8988F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(120, 161).addBox(8.5F, -0.1014F, -2.9988F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -8.6983F, -6.1389F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(150, 0).mirror().addBox(-0.7389F, -1.4389F, 0.8533F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 6.4421F, -4.0832F, -0.2705F, 0.0F, -0.3054F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 135).mirror().addBox(-1.0F, -1.6F, -0.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5385F, 7.4745F, 8.1146F, 1.0546F, 0.1923F, -0.4091F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 103).mirror().addBox(-1.4004F, -0.9396F, 0.4886F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 4.2421F, 1.5168F, 0.8452F, 0.1923F, -0.4091F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(77, 130).mirror().addBox(-1.0F, -2.1F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6068F, 3.3179F, -1.4355F, 0.5411F, 0.0F, -0.3054F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(124, 126).mirror().addBox(-1.9044F, -6.0948F, -8.5677F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 5.0421F, 2.2168F, -0.3142F, 0.0F, -0.0873F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(79, 117).mirror().addBox(-0.5F, -3.0F, -3.5F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(79, 117).addBox(8.5F, -3.0F, -3.5F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -5.0863F, -3.3795F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 164).mirror().addBox(-0.5F, -0.1615F, -0.0101F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(13, 164).addBox(8.5F, -0.1615F, -0.0101F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -3.5365F, 4.1413F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 139).mirror().addBox(-0.5F, -4.3F, 1.7F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 139).addBox(8.5F, -4.3F, 1.7F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -5.3548F, -3.5298F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(115, 32).mirror().addBox(-1.5F, -0.7F, -4.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(115, 32).addBox(2.5F, -0.7F, -4.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.6372F, -1.9096F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(150, 0).addBox(-2.2611F, -1.4389F, 0.8533F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8956F, 6.4421F, -4.0832F, -0.2705F, 0.0F, 0.3054F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 135).addBox(-1.0F, -1.6F, -0.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5385F, 7.4745F, 8.1146F, 1.0546F, -0.1923F, 0.4091F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 103).addBox(-0.5996F, -0.9396F, 0.4886F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8956F, 4.2421F, 1.5168F, 0.8452F, -0.1923F, 0.4091F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 130).addBox(-1.0F, -2.1F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6068F, 3.3179F, -1.4355F, 0.5411F, 0.0F, 0.3054F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 127).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1492F, 1.0905F, -0.2199F, 0.1222F, 0.0F, 0.0873F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(124, 126).addBox(-0.0956F, -6.0948F, -8.5677F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.8956F, 5.0421F, 2.2168F, -0.3142F, 0.0F, 0.0873F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 53).addBox(-1.5F, -1.5F, -7.5F, 3.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.8755F, -0.5185F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(46, 125).addBox(-0.5F, -3.7655F, -0.2989F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6126F, 4.7803F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(169, 155).addBox(-0.5F, -3.717F, -0.1234F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0199F, 1.829F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(134, 64).addBox(-0.5F, -2.9F, -3.3F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2617F, -1.7825F, -0.3229F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -0.1879F, 0.4316F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(143, 156).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3025F, -0.6853F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 143).addBox(-1.0F, -4.0F, -0.9F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(160, 114).addBox(-1.5F, -6.2432F, -0.2488F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.0F, -1.6F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 156).addBox(-1.5F, -1.3F, -2.4F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.5393F, -0.2986F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r27 = leftLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(149, 64).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(94, 140).addBox(-2.6F, 0.0505F, -0.774F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.2608F, -2.167F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r28 = leftLeg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 202).addBox(-1.0F, -1.4F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.5531F, 2.2459F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r29 = leftLeg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 199).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 4.3005F, 2.126F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftLeg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 143).addBox(-3.1F, -11.0F, -1.8F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 13.8505F, 2.326F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftLeg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(78, 142).addBox(-3.1F, -11.0F, -1.8F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 13.8505F, 2.326F, 0.0698F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(117, 24).addBox(-4.5F, 0.5183F, -4.6842F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 13.8954F, 0.674F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r32 = leftFoot.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(142, 58).addBox(-3.2F, -2.7F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0183F, -1.6842F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(54, 117).addBox(-4.5F, -1.0F, -3.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -0.1879F, 0.4316F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(157, 12).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3025F, -0.6853F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(35, 165).addBox(0.0F, -4.0F, -0.9F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(160, 145).addBox(-1.5F, -6.2432F, -0.2488F, 3.0F, 7.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 6.0F, -1.6F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(71, 156).addBox(-1.5F, -1.3F, -2.4F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 16.5393F, -0.2986F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(89, 149).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(141, 128).addBox(-0.4F, 0.0505F, -0.774F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 19.2608F, -2.167F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 202).mirror().addBox(-1.0F, -1.4F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.5531F, 2.2459F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(31, 199).mirror().addBox(-1.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 4.3005F, 2.126F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(144, 44).addBox(0.1F, -11.0F, -1.8F, 3.0F, 11.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 13.8505F, 2.326F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 143).addBox(0.1F, -11.0F, -1.8F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 13.8505F, 2.326F, 0.0698F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(27, 117).addBox(-4.5F, 0.5183F, -4.6842F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 13.8954F, 0.674F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightFoot.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(147, 139).addBox(-3.8F, -2.7F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0183F, -1.6842F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(0, 121).addBox(-4.5F, -1.0F, -3.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9F, 6.8F, -0.3303F, 0.1514F, -0.0975F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(15, 139).addBox(0.0F, -2.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7513F, 13.7172F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(54, 157).addBox(0.0F, -2.9F, -1.1F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1215F, 12.5192F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(163, 184).addBox(0.0F, -2.6F, -1.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3064F, 10.406F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(20, 187).addBox(0.0F, -2.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7967F, 1.5172F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 108).addBox(0.0F, -4.3F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4359F, 6.4733F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(122, 177).addBox(0.0F, -3.0F, -0.5F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7976F, 7.6205F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(82, 32).addBox(-1.5F, -1.3F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7298F, 6.1422F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(19, 128).addBox(-0.5F, -1.8F, 4.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(184, 35).addBox(-0.5F, -1.8349F, 7.2985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 184).addBox(-0.5F, -1.4F, 2.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 184).addBox(-0.5F, -1.1F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4213F, 3.9714F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(172, 0).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3254F, 1.7735F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9803F, 12.3651F, 0.0031F, 0.1312F, -0.0429F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(37, 86).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.63F, -0.1866F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(15, 187).addBox(-0.5F, -2.9F, 5.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(187, 6).addBox(-0.5F, -2.5F, 3.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(186, 176).addBox(-0.5F, -1.9F, 1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(186, 171).addBox(-0.5F, -1.3462F, -0.4113F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5517F, 5.3583F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(166, 189).addBox(0.0F, -1.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3661F, 12.3798F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(159, 189).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7704F, 10.8029F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(175, 189).addBox(0.0F, -1.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, 9.3405F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(97, 162).addBox(0.0F, -1.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3817F, 7.6283F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(86, 156).addBox(0.0F, -1.7F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8097F, 6.0293F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 178).addBox(0.0F, -1.2F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2339F, 3.4837F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r60 = tail2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(186, 166).addBox(-0.5F, -1.4531F, -0.1304F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3562F, 3.0127F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r61 = tail2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(38, 187).addBox(-0.5F, -1.2902F, 9.5861F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.771F, -8.7804F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.93F, 12.6134F, 0.1967F, 0.1369F, -0.0169F));

		PartDefinition cube_r62 = tail3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(74, 85).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9728F, 0.0373F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r63 = tail3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(192, 188).addBox(0.0F, -4.0641F, 10.969F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 192).addBox(0.0F, -3.4951F, 8.9331F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 192).addBox(0.0F, -3.0344F, 6.9576F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(131, 191).addBox(0.0F, -2.4672F, 5.1788F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(183, 189).addBox(0.0F, -2.0246F, 3.2607F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(157, 20).addBox(0.0F, -1.5F, 1.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(143, 151).addBox(0.0F, -1.0F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.133F, 1.7931F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(192, 151).addBox(0.0F, -0.2F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3527F, 11.0115F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r65 = tail3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(189, 52).addBox(0.0F, -1.4F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.6305F, 13.1523F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(116, 192).addBox(0.0F, -0.4F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7948F, 8.7322F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(63, 192).addBox(0.0F, -0.7F, -0.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2159F, 6.7745F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 192).addBox(0.0F, -0.8F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6369F, 4.8167F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(172, 189).addBox(0.0F, -2.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3926F, 3.1557F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail3.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(169, 189).addBox(0.0F, -1.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9096F, 1.3228F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1228F, 13.6373F, 0.0358F, -0.218F, -0.0077F));

		PartDefinition cube_r71 = tail4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(88, 49).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.3962F, 0.2872F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(193, 12).addBox(0.0F, -7.6F, 22.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 193).addBox(0.0F, -6.9866F, 20.8768F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(193, 9).addBox(0.0F, -6.4366F, 18.9634F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 175).addBox(0.0F, -5.9F, 17.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 186).addBox(0.0F, -5.25F, 15.1866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(192, 191).addBox(0.0F, -4.8F, 13.2732F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0063F, -11.757F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(59, 193).addBox(0.0F, -0.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.6025F, 13.4573F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(56, 193).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.1099F, 11.4997F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r75 = tail4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(192, 159).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.0624F, 9.0814F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r76 = tail4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(192, 155).addBox(0.0F, -1.0F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.3133F, 6.6946F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r77 = tail4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(189, 48).addBox(0.0F, -1.0F, -0.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.0774F, 4.156F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r78 = tail4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(53, 189).addBox(0.0F, -1.0F, -0.6F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.3387F, 1.6697F, -1.2043F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6462F, 14.0872F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r79 = tail5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(70, 102).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r80 = tail5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(53, 193).addBox(0.0F, -11.7F, 33.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(178, 192).addBox(0.0F, -11.2F, 32.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(162, 192).addBox(0.0F, -10.6F, 30.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(193, 30).addBox(0.0F, -9.8F, 28.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 193).addBox(0.0F, -9.1F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(193, 15).addBox(0.0F, -8.3F, 24.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3601F, -25.8442F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r81 = tail5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 193).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.1382F, 11.4865F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r82 = tail5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(87, 193).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.0361F, 9.4941F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r83 = tail5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(84, 193).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.2105F, 7.5017F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r84 = tail5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 193).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.6836F, 5.5354F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r85 = tail5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(69, 193).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.9576F, 3.5518F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r86 = tail5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(66, 193).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 1.3311F, 1.5768F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.65F, 12.9F, 0.2494F, -0.4244F, -0.1045F));

		PartDefinition cube_r87 = tail6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(107, 85).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.206F, 0.0522F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.594F, 11.9522F, -0.2916F, -0.3777F, 0.1102F));

		PartDefinition cube_r88 = tail7.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3381F, -0.0261F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6F, -8.0F, -0.22F, -0.1278F, 0.0285F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 0).addBox(-7.5F, -5.8826F, -7.4485F, 15.0F, 5.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 21.2858F, 7.187F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(41, 52).addBox(-6.5F, -4.0845F, -9.9354F, 13.0F, 4.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 23.8858F, 0.087F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.1545F, -0.0348F, 3.0F, 4.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.1873F, -15.3874F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(166, 126).mirror().addBox(-5.9303F, -0.0627F, -0.4469F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3933F, -2.4592F, -8.3867F, 0.1763F, 0.2155F, -0.6812F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(169, 164).mirror().addBox(-10.4577F, -2.261F, -0.5373F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3933F, -2.4592F, -8.3867F, 0.0764F, 0.2829F, -1.0807F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(165, 42).mirror().addBox(-14.1987F, -6.8271F, -0.5373F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3933F, -2.4592F, -8.3867F, -0.0666F, 0.2853F, -1.5811F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(162, 90).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.1791F, -0.1643F, -0.1682F, -0.0412F, -0.7999F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(177, 90).mirror().addBox(-9.4845F, -2.3986F, -1.1799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.1791F, -0.1643F, -0.143F, -0.0856F, -1.1909F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(161, 10).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.8791F, -2.7643F, -0.0178F, 0.0782F, -0.7798F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(155, 54).mirror().addBox(-12.4845F, -2.3986F, -1.1799F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.8791F, -2.7643F, -0.0498F, 0.0821F, -1.1738F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(161, 8).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.3791F, -5.2643F, 0.0946F, 0.1622F, -0.7142F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(88, 65).mirror().addBox(-14.4845F, -2.3986F, -1.1799F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.3791F, -5.2643F, 0.0216F, 0.2027F, -1.1115F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(105, 164).mirror().addBox(-19.4589F, -9.7617F, -1.1799F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -3.4791F, -10.9643F, -0.0673F, 0.3551F, -1.5813F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(134, 77).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -3.4791F, -10.9643F, 0.1113F, 0.3443F, -1.0699F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(71, 164).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -3.4791F, -10.9643F, 0.2324F, 0.2591F, -0.668F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(61, 28).mirror().addBox(-22.4589F, -9.7617F, -1.1799F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.0791F, -13.8643F, -0.0649F, 0.4074F, -1.5281F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(128, 113).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.0791F, -13.8643F, 0.1411F, 0.3887F, -1.0069F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(160, 124).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.0791F, -13.8643F, 0.2769F, 0.2891F, -0.6036F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(162, 90).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.1791F, -0.1643F, -0.1682F, 0.0412F, 0.7999F));

		PartDefinition cube_r108 = body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(177, 90).addBox(5.4845F, -2.3986F, -1.1799F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.1791F, -0.1643F, -0.143F, 0.0856F, 1.1909F));

		PartDefinition cube_r109 = body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(161, 10).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.8791F, -2.7643F, -0.0178F, -0.0782F, 0.7798F));

		PartDefinition cube_r110 = body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(155, 54).addBox(5.4845F, -2.3986F, -1.1799F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.8791F, -2.7643F, -0.0498F, -0.0821F, 1.1738F));

		PartDefinition cube_r111 = body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(161, 8).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.3791F, -5.2643F, 0.0946F, -0.1622F, 0.7142F));

		PartDefinition cube_r112 = body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(88, 65).addBox(5.4845F, -2.3986F, -1.1799F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.3791F, -5.2643F, 0.0216F, -0.2027F, 1.1115F));

		PartDefinition cube_r113 = body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(165, 42).addBox(8.1987F, -6.8271F, -0.5373F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3933F, -2.4592F, -8.3867F, -0.0666F, -0.2853F, 1.5811F));

		PartDefinition cube_r114 = body.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(169, 164).addBox(5.4577F, -2.261F, -0.5373F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3933F, -2.4592F, -8.3867F, 0.0764F, -0.2829F, 1.0807F));

		PartDefinition cube_r115 = body.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(166, 126).addBox(-0.0697F, -0.0627F, -0.4469F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3933F, -2.4592F, -8.3867F, 0.1763F, -0.2155F, 0.6812F));

		PartDefinition cube_r116 = body.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(105, 164).addBox(13.4589F, -9.7617F, -1.1799F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -3.4791F, -10.9643F, -0.0673F, -0.3551F, 1.5813F));

		PartDefinition cube_r117 = body.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(134, 77).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -3.4791F, -10.9643F, 0.1113F, -0.3443F, 1.0699F));

		PartDefinition cube_r118 = body.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(65, 170).addBox(-0.5F, -2.6F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8038F, 0.466F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r119 = body.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(11, 170).addBox(-0.5F, -5.3127F, 0.1452F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5171F, -3.7135F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r120 = body.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(170, 172).addBox(-0.5F, -4.9045F, -0.4028F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1576F, -6.0324F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r121 = body.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(118, 168).addBox(-0.5F, -5.2681F, -0.1441F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7576F, -9.0324F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(163, 172).addBox(-0.5F, -2.3F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4576F, -10.7324F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(173, 63).addBox(-0.5F, -4.7195F, -0.6785F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0381F, -14.7836F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 164).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -3.4791F, -10.9643F, 0.2324F, -0.2591F, 0.668F));

		PartDefinition cube_r125 = body.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(61, 28).addBox(13.4589F, -9.7617F, -1.1799F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.0791F, -13.8643F, -0.0649F, -0.4074F, 1.5281F));

		PartDefinition cube_r126 = body.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(128, 113).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.0791F, -13.8643F, 0.1411F, -0.3887F, 1.0069F));

		PartDefinition cube_r127 = body.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(160, 124).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.0791F, -13.8643F, 0.2769F, -0.2891F, 0.6036F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.284F, -15.063F, 0.394F, 0.0806F, 0.0335F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(33, 185).mirror().addBox(-0.2872F, -3.9625F, -0.1206F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2919F, 8.8275F, -22.2579F, -0.9868F, 0.1402F, -1.0168F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(135, 0).mirror().addBox(-1.1643F, -0.0609F, 5.0572F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-9.1916F, 8.143F, -21.156F, -0.3319F, -0.1545F, 0.0753F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(153, 106).mirror().addBox(-3.1443F, -0.0123F, -4.5741F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1916F, 16.143F, -12.156F, -1.5886F, -0.1545F, 0.0753F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(61, 14).mirror().addBox(-2.0667F, -5.3889F, -0.2232F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.1916F, 16.143F, -19.156F, -0.8905F, -0.1545F, 0.0753F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(134, 81).mirror().addBox(0.0549F, -3.3965F, -4.8261F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-10.6916F, 12.743F, -17.856F, -0.3735F, -0.6861F, 0.2656F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(160, 64).mirror().addBox(0.0549F, -5.3458F, -2.5967F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-10.6916F, 12.743F, -17.856F, 0.1326F, -0.6861F, 0.2656F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(19, 135).mirror().addBox(0.0549F, -3.4962F, -2.8979F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.6916F, 12.743F, -17.856F, 0.534F, -0.6861F, 0.2656F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(158, 128).mirror().addBox(-1.0F, -1.2244F, -0.8045F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-10.2608F, 10.3397F, -13.2402F, 1.4189F, -0.1239F, 0.2091F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(145, 106).mirror().addBox(-1.0F, -1.1F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5724F, -2.6569F, -9.848F, 1.5841F, -0.0286F, 0.3059F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(109, 65).mirror().addBox(-0.6276F, 0.0045F, -0.1379F, 2.0F, 3.0F, 10.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-9.4221F, 5.5015F, -13.7688F, 1.3049F, -0.0286F, 0.3059F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(173, 84).mirror().addBox(-1.1637F, 0.0623F, -0.4089F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-9.4221F, 7.3015F, -13.9688F, 1.4794F, -0.0286F, 0.3059F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(162, 103).mirror().addBox(-5.7962F, -0.0145F, 0.0576F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -2.9001F, -9.3177F, 0.1052F, 0.1365F, -0.7275F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(134, 96).mirror().addBox(-24.4428F, -9.4881F, -0.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -2.9001F, -9.3177F, -0.0486F, 0.1812F, -1.6107F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(128, 111).mirror().addBox(-16.3439F, -2.1634F, -0.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -2.9001F, -9.3177F, 0.0415F, 0.1829F, -1.1225F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(128, 99).mirror().addBox(-1.0F, -2.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.3801F, -0.2291F, -8.4796F, 0.8511F, -0.0286F, 0.3059F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(104, 179).mirror().addBox(-1.4455F, -8.4342F, -4.2957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 157).mirror().addBox(-1.4455F, -5.4342F, -4.2957F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6096F, 23.8295F, -11.8227F, 1.588F, -0.2803F, -1.5314F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(150, 189).mirror().addBox(-0.9927F, -0.2637F, -0.9644F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1096F, 23.8295F, -11.6227F, 2.1364F, -0.0213F, -1.5458F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(94, 130).mirror().addBox(-2.2355F, 1.6764F, -1.0135F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.1096F, 23.8295F, -11.6227F, 2.2553F, 0.4269F, -1.2819F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(153, 189).mirror().addBox(-0.9233F, 0.2807F, -0.6291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6096F, 23.8295F, -11.8227F, 2.0414F, -0.3105F, -1.5445F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(37, 53).mirror().addBox(-2.4328F, 2.2076F, -0.7095F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6096F, 23.8295F, -11.8227F, 2.0908F, 0.1667F, -1.3452F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(156, 189).mirror().addBox(-0.8907F, 0.2397F, -0.8074F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7096F, 23.8295F, -11.8227F, 2.1042F, -0.284F, -1.5401F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-2.3899F, 2.1751F, -0.8873F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7096F, 23.8295F, -11.8227F, 2.156F, 0.1798F, -1.3111F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(73, 189).mirror().addBox(-0.0111F, -0.1841F, -0.8295F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9096F, 24.8295F, -11.8227F, 2.1596F, 0.3563F, -1.617F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(111, 140).mirror().addBox(-1.4168F, 2.2358F, -0.9446F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9096F, 24.8295F, -11.8227F, 2.4209F, 0.7805F, -1.2615F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(15, 179).mirror().addBox(-1.7452F, 1.6727F, -0.5816F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3096F, 24.7295F, -11.8227F, 2.9587F, 0.3451F, -0.2624F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 97).mirror().addBox(0.0151F, -0.4737F, -0.7647F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3096F, 24.7295F, -11.8227F, 2.8449F, 0.1265F, -1.0332F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(43, 187).mirror().addBox(-0.5426F, -3.0455F, -0.8414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4919F, 10.3275F, -22.2579F, -0.2159F, 0.1693F, -0.9973F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(65, 142).mirror().addBox(0.1F, -3.5F, -2.5F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.76F, 20.0424F, -19.3979F, 1.3998F, -0.644F, -0.8632F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(18, 171).mirror().addBox(-1.0F, -2.0341F, -1.7473F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.2608F, 10.3397F, -13.2402F, 1.094F, -0.1316F, 0.1569F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 128).mirror().addBox(-0.0349F, -2.6003F, -6.9405F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4221F, 3.0015F, -8.1688F, 1.0256F, -0.0286F, 0.3059F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(140, 42).mirror().addBox(-24.4589F, -9.7617F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -0.9736F, -2.7066F, -0.0782F, 0.0935F, -1.5663F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(136, 79).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -0.9736F, -2.7066F, -0.0261F, 0.119F, -1.0842F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(164, 136).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -0.9736F, -2.7066F, 0.0183F, 0.1032F, -0.6894F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(162, 97).mirror().addBox(-6.0185F, -0.1775F, -0.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.0736F, -6.4066F, 0.0676F, 0.1258F, -0.6995F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(134, 94).mirror().addBox(-16.4845F, -2.3986F, -0.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.0736F, -6.4066F, 0.0108F, 0.1587F, -1.0949F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(109, 79).mirror().addBox(-25.4589F, -9.7617F, -0.1799F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.0736F, -6.4066F, -0.0642F, 0.1456F, -1.5804F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(141, 137).mirror().addBox(-23.4428F, -9.4881F, -1.0306F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.3001F, -11.0177F, -0.0486F, 0.1812F, -1.6456F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(109, 83).mirror().addBox(-16.3439F, -2.1634F, -1.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.3001F, -11.0177F, 0.0415F, 0.1829F, -1.1575F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(162, 101).mirror().addBox(-5.7962F, -0.0145F, -0.9424F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.3001F, -11.0177F, 0.1052F, 0.1365F, -0.7624F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(128, 99).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.3801F, -0.2291F, -8.4796F, 0.8511F, 0.0286F, -0.3059F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(104, 179).addBox(0.4455F, -8.4342F, -4.2957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(43, 157).addBox(0.4455F, -5.4342F, -4.2957F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6096F, 23.8295F, -11.8227F, 1.588F, 0.2803F, 1.5314F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(150, 189).addBox(0.9927F, -0.2637F, -0.9644F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1096F, 23.8295F, -11.6227F, 2.1364F, 0.0213F, 1.5458F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(94, 130).addBox(2.2355F, 1.6764F, -1.0135F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1096F, 23.8295F, -11.6227F, 2.2553F, -0.4269F, 1.2819F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(153, 189).addBox(0.9233F, 0.2807F, -0.6291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6096F, 23.8295F, -11.8227F, 2.0414F, 0.3105F, 1.5445F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(37, 53).addBox(2.4328F, 2.2076F, -0.7095F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6096F, 23.8295F, -11.8227F, 2.0908F, -0.1667F, 1.3452F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(156, 189).addBox(0.8907F, 0.2397F, -0.8074F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7096F, 23.8295F, -11.8227F, 2.1042F, 0.284F, 1.5401F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(70, 86).addBox(2.3899F, 2.1751F, -0.8873F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7096F, 23.8295F, -11.8227F, 2.156F, -0.1798F, 1.3111F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 189).addBox(0.0111F, -0.1841F, -0.8295F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9096F, 24.8295F, -11.8227F, 2.1596F, -0.3563F, 1.617F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(111, 140).addBox(1.4168F, 2.2358F, -0.9446F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9096F, 24.8295F, -11.8227F, 2.4209F, -0.7805F, 1.2615F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(15, 179).addBox(1.7452F, 1.6727F, -0.5816F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3096F, 24.7295F, -11.8227F, 2.9587F, -0.3451F, 0.2624F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(70, 97).addBox(-0.0151F, -0.4737F, -0.7647F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3096F, 24.7295F, -11.8227F, 2.8449F, -0.1265F, 1.0332F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(111, 180).addBox(-1.9919F, -0.9931F, -0.7089F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4919F, 11.7275F, -22.2579F, 0.1543F, 0.0F, 0.0F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(33, 185).addBox(-0.7128F, -3.9625F, -0.1206F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2919F, 8.8275F, -22.2579F, -0.9868F, -0.1402F, 1.0168F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(43, 187).addBox(-0.4574F, -3.0455F, -0.8414F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4919F, 10.3275F, -22.2579F, -0.2159F, -0.1693F, 0.9973F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 142).addBox(-1.1F, -3.5F, -2.5F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.76F, 20.0424F, -19.3979F, 1.3998F, 0.644F, 0.8632F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(153, 106).addBox(1.1443F, -0.0123F, -4.5741F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1916F, 16.143F, -12.156F, -1.5886F, 0.1545F, -0.0753F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(61, 14).addBox(0.0667F, -5.3889F, -0.2232F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1916F, 16.143F, -19.156F, -0.8905F, 0.1545F, -0.0753F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(135, 0).addBox(-0.8357F, -0.0609F, 5.0572F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(9.1916F, 8.143F, -21.156F, -0.3319F, 0.1545F, -0.0753F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(134, 81).addBox(-2.0549F, -3.3965F, -4.8261F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(10.6916F, 12.743F, -17.856F, -0.3735F, 0.6861F, -0.2656F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(160, 64).addBox(-2.0549F, -5.3458F, -2.5967F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(10.6916F, 12.743F, -17.856F, 0.1326F, 0.6861F, -0.2656F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(19, 135).addBox(-2.0549F, -3.4962F, -2.8979F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.6916F, 12.743F, -17.856F, 0.534F, 0.6861F, -0.2656F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(158, 128).addBox(-1.0F, -1.2244F, -0.8045F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(10.2608F, 10.3397F, -13.2402F, 1.4189F, 0.1239F, -0.2091F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(18, 171).addBox(-1.0F, -2.0341F, -1.7473F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2608F, 10.3397F, -13.2402F, 1.094F, 0.1316F, -0.1569F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(145, 106).addBox(-1.0F, -1.1F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5724F, -2.6569F, -9.848F, 1.5841F, 0.0286F, -0.3059F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(109, 65).addBox(-1.3724F, 0.0045F, -0.1379F, 2.0F, 3.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(9.4221F, 5.5015F, -13.7688F, 1.3049F, 0.0286F, -0.3059F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(173, 84).addBox(-0.8363F, 0.0623F, -0.4089F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(9.4221F, 7.3015F, -13.9688F, 1.4794F, 0.0286F, -0.3059F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(0, 128).addBox(-1.9651F, -2.6003F, -6.9405F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4221F, 3.0015F, -8.1688F, 1.0256F, 0.0286F, -0.3059F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(37, 67).addBox(-1.5F, -0.1361F, -0.3668F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3784F, -13.5053F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(140, 42).addBox(13.4589F, -9.7617F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -0.9736F, -2.7066F, -0.0782F, -0.0935F, 1.5663F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(136, 79).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -0.9736F, -2.7066F, -0.0261F, -0.119F, 1.0842F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(164, 136).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -0.9736F, -2.7066F, 0.0183F, -0.1032F, 0.6894F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(162, 97).addBox(0.0185F, -0.1775F, -0.0885F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.0736F, -6.4066F, 0.0676F, -0.1258F, 0.6995F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(134, 94).addBox(5.4845F, -2.3986F, -0.1799F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.0736F, -6.4066F, 0.0108F, -0.1587F, 1.0949F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(109, 79).addBox(13.4589F, -9.7617F, -0.1799F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.0736F, -6.4066F, -0.0642F, -0.1456F, 1.5804F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(128, 111).addBox(5.3439F, -2.1634F, -0.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -2.9001F, -9.3177F, 0.0415F, -0.1829F, 1.1225F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(134, 96).addBox(13.4428F, -9.4881F, -0.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -2.9001F, -9.3177F, -0.0486F, -0.1812F, 1.6107F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(162, 103).addBox(-0.2038F, -0.0145F, 0.0576F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -2.9001F, -9.3177F, 0.1052F, -0.1365F, 0.7275F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(141, 137).addBox(13.4428F, -9.4881F, -1.0306F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.3001F, -11.0177F, -0.0486F, -0.1812F, 1.6456F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(105, 170).addBox(-0.5F, -5.6746F, -0.059F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2326F, -3.8259F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(92, 168).addBox(-0.5F, -5.9328F, -0.0577F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3326F, -6.7259F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(142, 170).addBox(-0.5F, -5.4226F, -0.1443F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4326F, -9.4259F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(125, 179).addBox(0.0F, -4.2446F, 0.1518F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9326F, -12.3259F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(109, 83).addBox(5.3439F, -2.1634F, -1.0306F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.3001F, -11.0177F, 0.0415F, -0.1829F, 1.1575F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(162, 101).addBox(-0.2038F, -0.0145F, -0.9424F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.3001F, -11.0177F, 0.1052F, -0.1365F, 0.7624F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.75F, 18.0716F, -6.6053F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.25F, -1.4402F, -7.4691F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r212 = leftArm3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(99, 116).addBox(-1.0F, 2.4F, -0.5F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -6.0976F, -3.9618F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r213 = leftArm3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(115, 139).addBox(-0.5F, -1.4469F, -1.2264F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2591F, -2.6948F, -4.1094F, -0.5922F, 0.3408F, 0.4482F));

		PartDefinition cube_r214 = leftArm3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(161, 20).addBox(-0.5F, -1.9748F, -4.102F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.2591F, -2.6948F, -4.1094F, 0.0362F, 0.3408F, 0.4482F));

		PartDefinition cube_r215 = leftArm3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(144, 24).addBox(-2.0F, -2.3069F, -12.0971F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(99, 102).addBox(-1.5F, -1.8069F, -10.0971F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.1976F, -6.0618F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -1.9708F, -9.2808F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(124, 116).addBox(-0.5F, -3.9708F, -9.2808F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.12F))
				.texOffs(161, 27).addBox(-1.2F, -3.9708F, -2.5808F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.5F, -4.8751F, -17.584F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(100, 149).addBox(-3.1F, 1.5077F, -6.0806F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(121, 44).addBox(-2.5F, -0.4923F, -6.0806F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(145, 115).addBox(2.1F, 1.5077F, -6.0806F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5961F, -9.1411F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftArm5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(166, 166).addBox(-0.017F, -0.4889F, -0.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 2.0077F, -5.0806F, 0.0F, 0.3491F, 0.0F));

		PartDefinition rightArm3 = leftArm.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.75F, -1.4402F, -7.4691F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r217 = rightArm3.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(117, 13).addBox(-3.0F, 2.4F, -0.5F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -6.0976F, -3.9618F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r218 = rightArm3.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(140, 32).addBox(-0.5F, -1.4469F, -1.2264F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2591F, -2.6948F, -4.1094F, -0.5922F, -0.3408F, -0.4482F));

		PartDefinition cube_r219 = rightArm3.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(161, 56).addBox(-0.5F, -1.9748F, -4.102F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.2591F, -2.6948F, -4.1094F, 0.0362F, -0.3408F, -0.4482F));

		PartDefinition cube_r220 = rightArm3.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(145, 98).addBox(-2.0F, -2.3069F, -12.0971F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 103).addBox(-1.5F, -1.8069F, -10.0971F, 3.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1976F, -6.0618F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(108, 0).addBox(-3.0F, -1.9708F, -9.2808F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(25, 125).addBox(-2.5F, -3.9708F, -9.2808F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.12F))
				.texOffs(162, 79).addBox(-2.8F, -3.9708F, -2.5808F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.5F, -4.8751F, -17.584F, -0.5236F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(115, 149).addBox(2.1F, 1.5077F, -6.0806F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(54, 124).addBox(-2.5F, -0.4923F, -6.0806F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(15, 146).addBox(-3.1F, 1.5077F, -6.0806F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.5961F, -9.1411F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightArm5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(131, 167).addBox(-0.983F, -0.4889F, -0.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 2.0077F, -5.0806F, 0.0F, -0.3491F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.2956F, -13.6225F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(142, 183).mirror().addBox(-1.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 2.7495F, 1.9793F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(145, 189).mirror().addBox(-0.5104F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4884F, -1.7079F, -3.8656F, 1.0015F, 0.3938F, 0.2837F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(135, 183).mirror().addBox(-1.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 2.7495F, -1.2207F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(179, 0).mirror().addBox(-1.9356F, -5.9979F, 3.1912F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 3.1495F, -5.3207F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(140, 189).mirror().addBox(-0.5104F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4884F, -1.7079F, -7.0656F, 1.0015F, 0.3938F, 0.2837F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(65, 179).mirror().addBox(-1.94F, -3.667F, 3.0805F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.953F, 2.3054F, -11.6536F, 1.5107F, 0.0393F, 0.6111F));

		PartDefinition cube_r228 = neck.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(107, 99).mirror().addBox(-22.8452F, -8.4325F, -1.2211F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -1.06F, -0.2633F, 0.9792F, -1.6805F));

		PartDefinition cube_r229 = neck.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(141, 126).mirror().addBox(-15.9902F, -2.5896F, -1.2211F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -1.06F, 0.3165F, 0.9684F, -0.9881F));

		PartDefinition cube_r230 = neck.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(166, 142).mirror().addBox(-5.6355F, -0.5429F, -1.1374F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -1.06F, 0.7122F, 0.7544F, -0.4744F));

		PartDefinition cube_r231 = neck.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(176, 8).mirror().addBox(-1.5F, -0.6F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.8096F, 1.5749F, -8.9939F, 1.6749F, 0.4499F, -0.9902F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(162, 99).mirror().addBox(-5.897F, -0.2008F, -1.6681F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -5.06F, 0.626F, 0.7597F, -0.5339F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(142, 164).mirror().addBox(-20.2639F, -8.3666F, -1.7572F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -5.06F, -0.3113F, 0.9228F, -1.7199F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(109, 81).mirror().addBox(-16.3537F, -2.3717F, -1.7572F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 0.5093F, -5.06F, 0.218F, 0.9416F, -1.0689F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(5, 184).mirror().addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.5966F, 4.6023F, -7.3719F, 1.3761F, -0.0568F, -0.0691F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(168, 105).mirror().addBox(0.1F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.901F, 4.0246F, -8.8172F, 1.6993F, 0.1521F, -2.2257F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(184, 17).mirror().addBox(-0.4596F, -3.7771F, 0.751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9461F, 4.4589F, -4.9839F, 1.7823F, 0.0158F, -1.2345F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(174, 92).mirror().addBox(-1.5F, -0.2F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8096F, 1.5749F, -8.9939F, 1.6704F, 0.3458F, -1.0017F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(157, 38).mirror().addBox(-0.7245F, -1.4556F, -1.0366F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7861F, 0.6411F, -12.9965F, 1.5259F, 0.3257F, -1.1165F));

		PartDefinition cube_r240 = neck.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 168).mirror().addBox(0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6753F, 3.4023F, -13.5854F, 1.8606F, -0.0984F, -2.1265F));

		PartDefinition cube_r241 = neck.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(181, 109).mirror().addBox(-1.2222F, -4.3293F, 1.5521F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.953F, 3.7054F, -10.0536F, 1.7332F, -0.1242F, -1.2318F));

		PartDefinition cube_r242 = neck.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(179, 32).mirror().addBox(-1.4821F, -5.9207F, -0.4573F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(116, 186).mirror().addBox(-1.4821F, -5.9207F, -0.8573F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.7387F, 5.3177F, -9.4234F, 1.1754F, -0.0704F, -0.0552F));

		PartDefinition cube_r243 = neck.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(34, 175).mirror().addBox(-1.4821F, -6.6966F, -0.5802F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-2.7387F, 5.3177F, -9.4234F, 1.2888F, -0.0704F, -0.0552F));

		PartDefinition cube_r244 = neck.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(166, 142).addBox(-0.3645F, -0.5429F, -1.1374F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -1.06F, 0.7122F, -0.7544F, 0.4744F));

		PartDefinition cube_r245 = neck.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(141, 126).addBox(4.9902F, -2.5896F, -1.2211F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -1.06F, 0.3165F, -0.9684F, 0.9881F));

		PartDefinition cube_r246 = neck.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 99).addBox(13.8452F, -8.4325F, -1.2211F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -1.06F, -0.2633F, -0.9792F, 1.6805F));

		PartDefinition cube_r247 = neck.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(162, 99).addBox(-0.103F, -0.2008F, -1.6681F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -5.06F, 0.626F, -0.7597F, 0.5339F));

		PartDefinition cube_r248 = neck.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(142, 164).addBox(14.2639F, -8.3666F, -1.7572F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -5.06F, -0.3113F, -0.9228F, 1.7199F));

		PartDefinition cube_r249 = neck.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(109, 81).addBox(5.3537F, -2.3717F, -1.7572F, 11.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 0.5093F, -5.06F, 0.218F, -0.9416F, 1.0689F));

		PartDefinition cube_r250 = neck.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 73).addBox(-1.5F, 0.1F, 8.0F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.4076F, -22.7259F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r251 = neck.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(145, 189).addBox(-0.4896F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4884F, -1.7079F, -3.8656F, 1.0015F, -0.3938F, -0.2837F));

		PartDefinition cube_r252 = neck.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(142, 183).addBox(0.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 2.7495F, 1.9793F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r253 = neck.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 142).addBox(-2.0233F, -7.7848F, -4.9601F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 2.7495F, 1.9793F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r254 = neck.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(140, 189).addBox(-0.4896F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4884F, -1.7079F, -7.0656F, 1.0015F, -0.3938F, -0.2837F));

		PartDefinition cube_r255 = neck.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(135, 183).addBox(0.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 2.7495F, -1.2207F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r256 = neck.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(23, 184).addBox(-2.0233F, -7.7848F, -4.9601F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 2.7495F, -1.2207F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r257 = neck.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(92, 177).addBox(-2.0233F, -6.8848F, -4.4601F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.1495F, -5.3207F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r258 = neck.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(179, 0).addBox(0.9356F, -5.9979F, 3.1912F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.1495F, -5.3207F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r259 = neck.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 184).addBox(-0.5F, -3.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.5966F, 4.6023F, -7.3719F, 1.3761F, 0.0568F, 0.0691F));

		PartDefinition cube_r260 = neck.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(168, 105).addBox(-1.1F, 0.2F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.901F, 4.0246F, -8.8172F, 1.6993F, -0.1521F, 2.2257F));

		PartDefinition cube_r261 = neck.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(184, 17).addBox(-2.5404F, -3.7771F, 0.751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9461F, 4.4589F, -4.9839F, 1.7823F, -0.0158F, 1.2345F));

		PartDefinition cube_r262 = neck.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(176, 8).addBox(-2.5F, -0.6F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.8096F, 1.5749F, -8.9939F, 1.6749F, -0.4499F, 0.9902F));

		PartDefinition cube_r263 = neck.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(174, 92).addBox(-2.5F, -0.2F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8096F, 1.5749F, -8.9939F, 1.6704F, -0.3458F, 1.0017F));

		PartDefinition cube_r264 = neck.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(174, 25).addBox(-1.953F, -6.1247F, -2.4361F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.953F, 2.3054F, -11.6536F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r265 = neck.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(65, 179).addBox(0.94F, -3.667F, 3.0805F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.953F, 2.3054F, -11.6536F, 1.5107F, -0.0393F, -0.6111F));

		PartDefinition cube_r266 = neck.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(157, 38).addBox(-4.2755F, -1.4556F, -1.0366F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7861F, 0.6411F, -12.9965F, 1.5259F, -0.3257F, 1.1165F));

		PartDefinition cube_r267 = neck.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 168).addBox(-1.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6753F, 3.4023F, -13.5854F, 1.8606F, 0.0984F, 2.1265F));

		PartDefinition cube_r268 = neck.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(181, 109).addBox(-1.7778F, -4.3293F, 1.5521F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.953F, 3.7054F, -10.0536F, 1.7332F, 0.1242F, 1.2318F));

		PartDefinition cube_r269 = neck.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(179, 32).addBox(0.4821F, -5.9207F, -0.4573F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(116, 186).addBox(0.4821F, -5.9207F, -0.8573F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.7387F, 5.3177F, -9.4234F, 1.1754F, 0.0704F, 0.0552F));

		PartDefinition cube_r270 = neck.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(34, 175).addBox(0.4821F, -6.6966F, -0.5802F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(2.7387F, 5.3177F, -9.4234F, 1.2888F, 0.0704F, 0.0552F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4117F, -13.9703F, -0.2931F, -0.1627F, -0.2235F));

		PartDefinition cube_r271 = neck2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.3F, 6.0F, 3.0F, 3.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6563F, -32.8293F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r272 = neck2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(156, 172).mirror().addBox(-0.0833F, -2.6731F, 0.7366F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, -0.6528F, -4.6137F, 1.6537F, -0.0609F, 0.6095F));

		PartDefinition cube_r273 = neck2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(78, 166).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7818F, -2.4763F, -23.1805F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r274 = neck2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(191, 169).mirror().addBox(-0.5038F, -7.8982F, 4.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.0814F, -20.1055F, 1.5384F, 0.2373F, 0.6049F));

		PartDefinition cube_r275 = neck2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(160, 72).mirror().addBox(-0.4F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2033F, 3.1672F, -11.4554F, 1.6118F, -0.1278F, -2.2554F));

		PartDefinition cube_r276 = neck2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(182, 117).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0146F, -0.3598F, -10.9745F, 1.6061F, 0.1808F, -1.0265F));

		PartDefinition cube_r277 = neck2.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(182, 113).mirror().addBox(3.4021F, -3.0082F, -0.1788F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-3.2443F, 2.0915F, -7.4784F, 1.6124F, 0.5819F, -1.01F));

		PartDefinition cube_r278 = neck2.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(85, 168).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7818F, -2.061F, -10.8111F, 1.5679F, 0.0865F, 0.6119F));

		PartDefinition cube_r279 = neck2.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(173, 75).mirror().addBox(-2.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9691F, 1.539F, -10.8745F, 1.7201F, -0.0881F, -1.2196F));

		PartDefinition cube_r280 = neck2.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(186, 92).mirror().addBox(-0.9568F, -1.3771F, -0.7913F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(183, 143).mirror().addBox(-0.9568F, -1.3771F, -0.4913F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.2443F, 3.6915F, -10.6784F, 1.3563F, -0.146F, -0.0794F));

		PartDefinition cube_r281 = neck2.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 174).mirror().addBox(-0.9568F, -2.5771F, -0.9698F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.2443F, 3.6915F, -10.6784F, 1.4697F, -0.146F, -0.0794F));

		PartDefinition cube_r282 = neck2.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(130, 183).mirror().addBox(-0.924F, 4.5667F, -1.5649F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.2443F, 3.6915F, -10.6784F, 1.5919F, -0.146F, -0.0794F));

		PartDefinition cube_r283 = neck2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(182, 84).mirror().addBox(-1.3219F, -1.4751F, -0.8402F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.9734F, -1.2968F, -17.8527F, 1.5594F, 0.5074F, -1.0375F));

		PartDefinition cube_r284 = neck2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(181, 181).mirror().addBox(0.0617F, -1.5097F, -0.6651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, -0.8186F, -23.8055F, 1.6409F, 0.7575F, -0.9435F));

		PartDefinition cube_r285 = neck2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(24, 165).mirror().addBox(-0.1F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.869F, 2.3482F, -18.4567F, 1.7855F, -0.1323F, -2.1146F));

		PartDefinition cube_r286 = neck2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(179, 11).mirror().addBox(-0.8921F, 5.6813F, 0.3775F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 4.4916F, -18.6633F, 1.451F, -0.1556F, -0.0582F));

		PartDefinition cube_r287 = neck2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(30, 146).mirror().addBox(-0.9249F, -2.7076F, 1.0939F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 4.4916F, -18.6633F, 1.3288F, -0.1556F, -0.0582F));

		PartDefinition cube_r288 = neck2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(10, 179).mirror().addBox(-0.9249F, -1.7468F, 1.6576F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(184, 69).mirror().addBox(-0.9249F, -1.7468F, 1.3576F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 4.4916F, -18.6633F, 1.2154F, -0.1556F, -0.0582F));

		PartDefinition cube_r289 = neck2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(149, 181).mirror().addBox(-1.8296F, -0.2368F, -0.8402F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9734F, -1.2968F, -17.8527F, 1.5594F, -0.5049F, -1.0265F));

		PartDefinition cube_r290 = neck2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(49, 181).mirror().addBox(-1.031F, -1.2348F, -0.4453F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 1.6916F, -18.0633F, 1.6914F, -0.2393F, -1.2242F));

		PartDefinition cube_r291 = neck2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(168, 44).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7818F, -2.061F, -16.5111F, 1.5679F, 0.0865F, 0.6119F));

		PartDefinition cube_r292 = neck2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(100, 158).mirror().addBox(-0.5025F, -3.9978F, -1.1237F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.5659F, 2.1814F, -23.7055F, 1.4016F, -0.184F, -0.0654F));

		PartDefinition cube_r293 = neck2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(178, 144).mirror().addBox(-0.5025F, -1.8008F, -0.6328F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(58, 181).mirror().addBox(-0.5025F, -2.8008F, -0.9328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.5659F, 2.1814F, -23.7055F, 1.323F, -0.184F, -0.0654F));

		PartDefinition cube_r294 = neck2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(162, 84).mirror().addBox(-0.4498F, -1.4342F, -2.1555F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.1814F, -23.7055F, 1.9013F, -0.1838F, -2.0993F));

		PartDefinition cube_r295 = neck2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(183, 20).mirror().addBox(-3.5554F, -1.8134F, -0.2537F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, -0.8186F, -23.7055F, 1.7968F, 0.0569F, -1.234F));

		PartDefinition cube_r296 = neck2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(181, 139).mirror().addBox(-1.3568F, -1.4978F, -0.6651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, -0.8186F, -23.8055F, 1.622F, -0.1138F, -0.9975F));

		PartDefinition cube_r297 = neck2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(72, 181).mirror().addBox(-0.4996F, 2.1373F, -1.4282F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.4301F, 3.5899F, -4.5169F, 1.664F, -0.163F, -0.0793F));

		PartDefinition cube_r298 = neck2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(186, 0).mirror().addBox(-0.5324F, -1.0774F, -0.721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.4301F, 3.5899F, -4.5169F, 1.4982F, -0.163F, -0.0793F));

		PartDefinition cube_r299 = neck2.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(184, 53).mirror().addBox(-0.5324F, -1.9739F, -1.0729F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.4301F, 3.5899F, -4.5169F, 1.5244F, -0.163F, -0.0793F));

		PartDefinition cube_r300 = neck2.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(187, 188).mirror().addBox(-0.5324F, -1.0812F, -0.416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.4301F, 3.5899F, -4.5169F, 1.4459F, -0.163F, -0.0793F));

		PartDefinition cube_r301 = neck2.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(171, 119).mirror().addBox(-0.6369F, -2.6871F, -0.8518F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, -0.1528F, -2.9137F, 1.6126F, 0.5299F, -0.989F));

		PartDefinition cube_r302 = neck2.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(155, 166).mirror().addBox(-0.2F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, 3.159F, -4.5196F, 1.7017F, 0.1631F, -2.0885F));

		PartDefinition cube_r303 = neck2.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(23, 180).mirror().addBox(-3.9154F, -2.5001F, -0.2986F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, -0.1528F, -2.9137F, 1.7795F, 0.0075F, -1.2345F));

		PartDefinition cube_r304 = neck2.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(160, 72).addBox(-0.6F, -0.5F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2033F, 3.1672F, -11.4554F, 1.6118F, 0.1278F, 2.2554F));

		PartDefinition cube_r305 = neck2.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(24, 165).addBox(-0.9F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.869F, 2.3482F, -18.4567F, 1.7855F, 0.1323F, 2.1146F));

		PartDefinition cube_r306 = neck2.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(130, 183).addBox(-0.076F, 4.5667F, -1.5649F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.2443F, 3.6915F, -10.6784F, 1.5919F, 0.146F, 0.0794F));

		PartDefinition cube_r307 = neck2.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(5, 174).addBox(-0.0432F, -2.5771F, -0.9698F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.2443F, 3.6915F, -10.6784F, 1.4697F, 0.146F, 0.0794F));

		PartDefinition cube_r308 = neck2.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(183, 143).addBox(-0.0432F, -1.3771F, -0.4913F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(186, 92).addBox(-0.0432F, -1.3771F, -0.7913F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.2443F, 3.6915F, -10.6784F, 1.3563F, 0.146F, 0.0794F));

		PartDefinition cube_r309 = neck2.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(173, 75).addBox(-1.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9691F, 1.539F, -10.8745F, 1.7201F, 0.0881F, 1.2196F));

		PartDefinition cube_r310 = neck2.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(158, 156).addBox(-2.1212F, -7.3997F, -4.1715F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.6211F, -7.4433F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck2.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(85, 168).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7818F, -2.061F, -10.8111F, 1.5679F, -0.0865F, -0.6119F));

		PartDefinition cube_r312 = neck2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(182, 113).addBox(-6.4021F, -3.0082F, -0.1788F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(3.2443F, 2.0915F, -7.4784F, 1.6124F, -0.5819F, 1.01F));

		PartDefinition cube_r313 = neck2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(182, 117).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0146F, -0.3598F, -10.9745F, 1.6061F, -0.1808F, 1.0265F));

		PartDefinition cube_r314 = neck2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(179, 11).addBox(-0.1079F, 5.6813F, 0.3775F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9642F, 4.4916F, -18.6633F, 1.451F, 0.1556F, 0.0582F));

		PartDefinition cube_r315 = neck2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(30, 146).addBox(-0.0751F, -2.7076F, 1.0939F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(2.9642F, 4.4916F, -18.6633F, 1.3288F, 0.1556F, 0.0582F));

		PartDefinition cube_r316 = neck2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(10, 179).addBox(-0.0751F, -1.7468F, 1.6576F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(184, 69).addBox(-0.0751F, -1.7468F, 1.3576F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.9642F, 4.4916F, -18.6633F, 1.2154F, 0.1556F, 0.0582F));

		PartDefinition cube_r317 = neck2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(182, 84).addBox(-1.6781F, -1.4751F, -0.8402F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.9734F, -1.2968F, -17.8527F, 1.5594F, -0.5074F, 1.0375F));

		PartDefinition cube_r318 = neck2.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(149, 181).addBox(-1.1704F, -0.2368F, -0.8402F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9734F, -1.2968F, -17.8527F, 1.5594F, 0.5049F, 1.0265F));

		PartDefinition cube_r319 = neck2.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(49, 181).addBox(-1.969F, -1.2348F, -0.4453F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9642F, 1.6916F, -18.0633F, 1.6914F, 0.2393F, 1.2242F));

		PartDefinition cube_r320 = neck2.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(191, 172).addBox(-0.9988F, -7.9243F, 3.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.6211F, -13.1433F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r321 = neck2.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(168, 44).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7818F, -2.061F, -16.5111F, 1.5679F, -0.0865F, -0.6119F));

		PartDefinition cube_r322 = neck2.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(147, 145).addBox(-2.1212F, -7.3997F, -5.4715F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.6211F, -13.1433F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r323 = neck2.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(100, 158).addBox(-0.4975F, -3.9978F, -1.1237F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.5659F, 2.1814F, -23.7055F, 1.4016F, 0.184F, 0.0654F));

		PartDefinition cube_r324 = neck2.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(178, 144).addBox(-0.4975F, -1.8008F, -0.6328F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(58, 181).addBox(-0.4975F, -2.8008F, -0.9328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.5659F, 2.1814F, -23.7055F, 1.323F, 0.184F, 0.0654F));

		PartDefinition cube_r325 = neck2.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(162, 84).addBox(-0.5502F, -1.4342F, -2.1555F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0659F, 2.1814F, -23.7055F, 1.9013F, 0.1838F, 2.0993F));

		PartDefinition cube_r326 = neck2.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(183, 20).addBox(0.5554F, -1.8134F, -0.2537F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0659F, -0.8186F, -23.7055F, 1.7968F, -0.0569F, 1.234F));

		PartDefinition cube_r327 = neck2.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(181, 181).addBox(-3.0617F, -1.5097F, -0.6651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.0659F, -0.8186F, -23.8055F, 1.6409F, -0.7575F, 0.9435F));

		PartDefinition cube_r328 = neck2.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(181, 139).addBox(-1.6432F, -1.4978F, -0.6651F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0659F, -0.8186F, -23.8055F, 1.622F, 0.1138F, 0.9975F));

		PartDefinition cube_r329 = neck2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(132, 139).addBox(-2.0659F, -7.9571F, -5.2961F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0659F, 2.0814F, -20.1055F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r330 = neck2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(191, 169).addBox(-0.4962F, -7.8982F, 4.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0659F, 2.0814F, -20.1055F, 1.5384F, -0.2373F, -0.6049F));

		PartDefinition cube_r331 = neck2.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(78, 166).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7818F, -2.4763F, -23.1805F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r332 = neck2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(115, 127).addBox(-2.1212F, -4.0357F, -0.4067F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, -0.6528F, -4.6137F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r333 = neck2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(23, 180).addBox(0.9154F, -2.5001F, -0.2986F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1212F, -0.1528F, -2.9137F, 1.7795F, -0.0075F, 1.2345F));

		PartDefinition cube_r334 = neck2.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(156, 172).addBox(-0.9167F, -2.6731F, 0.7366F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, -0.6528F, -4.6137F, 1.6537F, 0.0609F, -0.6095F));

		PartDefinition cube_r335 = neck2.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(171, 119).addBox(-3.3631F, -2.6871F, -0.8518F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1212F, -0.1528F, -2.9137F, 1.6126F, -0.5299F, 0.989F));

		PartDefinition cube_r336 = neck2.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(187, 188).addBox(-0.4676F, -1.0812F, -0.416F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.4301F, 3.5899F, -4.5169F, 1.4459F, 0.163F, 0.0793F));

		PartDefinition cube_r337 = neck2.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(184, 53).addBox(-0.4676F, -1.9739F, -1.0729F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.4301F, 3.5899F, -4.5169F, 1.5244F, 0.163F, 0.0793F));

		PartDefinition cube_r338 = neck2.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(186, 0).addBox(-0.4676F, -1.0774F, -0.721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.4301F, 3.5899F, -4.5169F, 1.4982F, 0.163F, 0.0793F));

		PartDefinition cube_r339 = neck2.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(72, 181).addBox(-0.5004F, 2.1373F, -1.4282F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.4301F, 3.5899F, -4.5169F, 1.664F, 0.163F, 0.0793F));

		PartDefinition cube_r340 = neck2.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(155, 166).addBox(-0.8F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7087F, 3.159F, -4.5196F, 1.7017F, -0.1631F, 2.0885F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(74, 67).addBox(-1.5F, -1.7696F, -13.9233F, 3.0F, 3.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0817F, -26.8308F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r341 = neck3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(27, 171).mirror().addBox(-2.4509F, -8.0922F, 3.7728F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.6564F, 1.2482F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r342 = neck3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(191, 178).mirror().addBox(-0.6449F, -9.3108F, 4.1728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.6564F, 1.2482F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r343 = neck3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(42, 168).mirror().addBox(-2.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.5564F, -6.2518F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r344 = neck3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(191, 175).mirror().addBox(-0.6449F, -9.3108F, 4.0728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.5564F, -6.2518F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r345 = neck3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(179, 54).mirror().addBox(-0.4965F, 5.3922F, -0.9714F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6355F, 2.2256F, -4.647F, 1.4971F, -0.1576F, -0.0726F));

		PartDefinition cube_r346 = neck3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(54, 165).mirror().addBox(-0.1F, -0.5F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5979F, 2.1217F, -12.3889F, 1.6243F, -0.0283F, -2.0638F));

		PartDefinition cube_r347 = neck3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(172, 181).mirror().addBox(-0.3899F, -1.1692F, -0.8359F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7355F, -0.3744F, -4.147F, 1.4743F, 0.5304F, -0.9951F));

		PartDefinition cube_r348 = neck3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(131, 161).mirror().addBox(-1.0587F, -1.1853F, -3.7822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 2.2256F, -4.647F, 1.8124F, -0.0409F, -2.0559F));

		PartDefinition cube_r349 = neck3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(180, 45).mirror().addBox(-3.4006F, -1.9715F, -2.0091F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, -1.1744F, -3.547F, 1.7155F, -0.1736F, -1.2292F));

		PartDefinition cube_r350 = neck3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(72, 170).mirror().addBox(-0.5293F, -3.0029F, -1.1766F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.6355F, 2.2256F, -4.647F, 1.532F, -0.1576F, -0.0726F));

		PartDefinition cube_r351 = neck3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(0, 184).mirror().addBox(-0.5293F, -1.8048F, -0.9076F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(99, 175).mirror().addBox(-0.5293F, -1.8048F, -0.6076F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.6355F, 2.2256F, -4.647F, 1.4535F, -0.1576F, -0.0726F));

		PartDefinition cube_r352 = neck3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(175, 44).mirror().addBox(-0.1677F, 5.1482F, -0.2215F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.9012F, 3.1837F, -12.2713F, 1.5382F, -0.1221F, -0.0726F));

		PartDefinition cube_r353 = neck3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(135, 189).mirror().addBox(-1.5749F, -4.6932F, -3.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 0.9656F, -12.2316F, 1.3485F, -0.0326F, -0.0733F));

		PartDefinition cube_r354 = neck3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(125, 168).mirror().addBox(-0.2005F, -3.218F, -0.2357F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.9012F, 3.1837F, -12.2713F, 1.5382F, -0.1221F, -0.0726F));

		PartDefinition cube_r355 = neck3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(63, 186).mirror().addBox(-0.2005F, -2.0931F, -0.1864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 174).mirror().addBox(-0.2005F, -2.0931F, 0.2136F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.9012F, 3.1837F, -12.2713F, 1.4596F, -0.1221F, -0.0726F));

		PartDefinition cube_r356 = neck3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(172, 21).mirror().addBox(-0.7711F, -0.9598F, -0.6321F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 0.2656F, -12.2316F, 1.4771F, 0.4599F, -1.0273F));

		PartDefinition cube_r357 = neck3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(180, 41).mirror().addBox(-2.1835F, -1.0673F, -0.2724F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 0.9656F, -12.2316F, 1.7155F, -0.1736F, -1.2292F));

		PartDefinition cube_r358 = neck3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(54, 165).addBox(-0.9F, -0.5F, -1.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.5979F, 2.1217F, -12.3889F, 1.6243F, 0.0283F, 2.0638F));

		PartDefinition cube_r359 = neck3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(149, 81).addBox(-1.9383F, -8.2152F, -6.5111F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.6564F, 1.2482F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r360 = neck3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(191, 178).addBox(-0.3551F, -9.3108F, 4.1728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.6564F, 1.2482F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r361 = neck3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(27, 171).addBox(1.4509F, -8.0922F, 3.7728F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.6564F, 1.2482F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r362 = neck3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(172, 181).addBox(-2.6101F, -1.1692F, -0.8359F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7355F, -0.3744F, -4.147F, 1.4743F, -0.5304F, 0.9951F));

		PartDefinition cube_r363 = neck3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(131, 161).addBox(0.0587F, -1.1853F, -3.7822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8355F, 2.2256F, -4.647F, 1.8124F, 0.0409F, 2.0559F));

		PartDefinition cube_r364 = neck3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(180, 45).addBox(0.4006F, -1.9715F, -2.0091F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.8355F, -1.1744F, -3.547F, 1.7155F, 0.1736F, 1.2292F));

		PartDefinition cube_r365 = neck3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(72, 170).addBox(-0.4707F, -3.0029F, -1.1766F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.6355F, 2.2256F, -4.647F, 1.532F, 0.1576F, 0.0726F));

		PartDefinition cube_r366 = neck3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 184).addBox(-0.4707F, -1.8048F, -0.9076F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(99, 175).addBox(-0.4707F, -1.8048F, -0.6076F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.6355F, 2.2256F, -4.647F, 1.4535F, 0.1576F, 0.0726F));

		PartDefinition cube_r367 = neck3.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(179, 54).addBox(-0.5035F, 5.3922F, -0.9714F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.6355F, 2.2256F, -4.647F, 1.4971F, 0.1576F, 0.0726F));

		PartDefinition cube_r368 = neck3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(175, 44).addBox(-0.8323F, 5.1482F, -0.2215F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.9012F, 3.1837F, -12.2713F, 1.5382F, 0.1221F, 0.0726F));

		PartDefinition cube_r369 = neck3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(135, 189).addBox(0.5749F, -4.6932F, -3.1744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6887F, 0.9656F, -12.2316F, 1.3485F, 0.0326F, 0.0733F));

		PartDefinition cube_r370 = neck3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(125, 168).addBox(-0.7995F, -3.218F, -0.2357F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.9012F, 3.1837F, -12.2713F, 1.5382F, 0.1221F, 0.0726F));

		PartDefinition cube_r371 = neck3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(63, 186).addBox(-0.7995F, -2.0931F, -0.1864F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 174).addBox(-0.7995F, -2.0931F, 0.2136F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.9012F, 3.1837F, -12.2713F, 1.4596F, 0.1221F, 0.0726F));

		PartDefinition cube_r372 = neck3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(172, 21).addBox(-3.2289F, -0.9598F, -0.6321F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6887F, 0.2656F, -12.2316F, 1.4771F, -0.4599F, 1.0273F));

		PartDefinition cube_r373 = neck3.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(180, 41).addBox(-0.8165F, -1.0673F, -0.2724F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6887F, 0.9656F, -12.2316F, 1.7155F, 0.1736F, 1.2292F));

		PartDefinition cube_r374 = neck3.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(191, 175).addBox(-0.3551F, -9.3108F, 4.0728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.5564F, -6.2518F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r375 = neck3.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(42, 168).addBox(1.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.5564F, -6.2518F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r376 = neck3.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(142, 13).addBox(-1.9383F, -7.5152F, -7.2111F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.5564F, -6.2518F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2696F, -13.8233F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r377 = neck4.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(82, 14).addBox(-1.5F, 0.0F, 0.9F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3612F, -14.6799F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r378 = neck4.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(149, 172).mirror().addBox(-1.3554F, -4.7328F, 1.3013F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.2085F, -1.8751F, 1.5191F, 0.0362F, 0.6462F));

		PartDefinition cube_r379 = neck4.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(192, 20).mirror().addBox(-0.126F, -5.7548F, 2.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.2085F, -1.8751F, 1.5162F, 0.2522F, 0.5995F));

		PartDefinition cube_r380 = neck4.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(171, 144).mirror().addBox(-0.6F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7807F, -1.7921F, -10.3874F, 1.4632F, 0.0781F, 0.643F));

		PartDefinition cube_r381 = neck4.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 192).mirror().addBox(-0.3982F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3303F, 2.1843F, -6.5445F, 1.456F, 0.2911F, 0.5834F));

		PartDefinition cube_r382 = neck4.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(189, 77).mirror().addBox(0.051F, -4.2759F, 1.2621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.8085F, -2.1751F, 1.7388F, 0.2712F, -1.2826F));

		PartDefinition cube_r383 = neck4.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(140, 179).mirror().addBox(0.4867F, -3.8375F, 0.6365F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.8085F, -2.1751F, 1.4282F, 0.3745F, -0.7957F));

		PartDefinition cube_r384 = neck4.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(163, 180).mirror().addBox(-3.8458F, -3.2485F, 1.2621F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.8085F, -2.1751F, 1.8372F, -0.9121F, -1.5405F));

		PartDefinition cube_r385 = neck4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(189, 73).mirror().addBox(-0.1546F, -4.2759F, 1.1391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(191, 116).mirror().addBox(-0.7546F, -3.2759F, 1.1391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(191, 113).mirror().addBox(-0.7546F, -3.6759F, 1.1391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.5693F, 1.8085F, -2.1751F, 1.675F, 0.301F, -1.508F));

		PartDefinition cube_r386 = neck4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(84, 178).mirror().addBox(-0.7314F, -0.4177F, 1.8152F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(188, 146).mirror().addBox(-0.7314F, -0.9177F, 1.4152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 4.8085F, -6.9751F, 1.26F, -0.1535F, -0.0676F));

		PartDefinition cube_r387 = neck4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(177, 171).mirror().addBox(-0.7F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8876F, 2.2685F, -6.1927F, 1.8101F, -0.5471F, -2.1F));

		PartDefinition cube_r388 = neck4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(31, 92).mirror().addBox(-0.7488F, -2.3564F, 1.2669F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 4.8085F, -6.9751F, 1.3386F, -0.1512F, -0.0686F));

		PartDefinition cube_r389 = neck4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(44, 178).mirror().addBox(-0.7319F, 6.1122F, 0.8288F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6693F, 4.8085F, -6.9751F, 1.4085F, -0.1488F, -0.0696F));

		PartDefinition cube_r390 = neck4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(180, 128).mirror().addBox(-1.2F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6629F, 0.1481F, -12.6698F, 1.8363F, -0.9295F, -1.5398F));

		PartDefinition cube_r391 = neck4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(18, 178).mirror().addBox(-0.4771F, 4.5735F, -1.0391F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.0813F, 1.8857F, -11.9606F, 1.3548F, -0.135F, -0.0679F));

		PartDefinition cube_r392 = neck4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(10, 188).mirror().addBox(-0.4967F, -1.6057F, -0.867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(117, 177).mirror().addBox(-0.4967F, -1.6057F, -0.467F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.0813F, 1.8857F, -11.9606F, 1.2413F, -0.1373F, -0.0668F));

		PartDefinition cube_r393 = neck4.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(112, 170).mirror().addBox(-0.4967F, -2.7824F, -0.874F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.0813F, 1.8857F, -11.9606F, 1.3199F, -0.1373F, -0.0668F));

		PartDefinition cube_r394 = neck4.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(179, 135).mirror().addBox(-1.6F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1926F, -1.0266F, -12.7252F, 1.4151F, 0.362F, -0.8004F));

		PartDefinition cube_r395 = neck4.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(191, 97).mirror().addBox(-1.6251F, -0.3F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(191, 94).mirror().addBox(-1.6251F, 0.1F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 189).mirror().addBox(-1.0251F, -0.9F, -0.3727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7329F, 0.7832F, -12.5918F, 1.6738F, 0.2836F, -1.5083F));

		PartDefinition cube_r396 = neck4.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(189, 56).mirror().addBox(-0.4716F, -0.9F, -0.4024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-2.7329F, 0.7832F, -12.5918F, 1.7337F, 0.2545F, -1.284F));

		PartDefinition cube_r397 = neck4.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(175, 79).mirror().addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8572F, 0.875F, -13.8715F, 1.7023F, -0.2169F, -1.9867F));

		PartDefinition cube_r398 = neck4.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(44, 178).addBox(-0.2681F, 6.1122F, 0.8288F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.6693F, 4.8085F, -6.9751F, 1.4085F, 0.1488F, 0.0696F));

		PartDefinition cube_r399 = neck4.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(31, 92).addBox(-0.2512F, -2.3564F, 1.2669F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(2.6693F, 4.8085F, -6.9751F, 1.3386F, 0.1512F, 0.0686F));

		PartDefinition cube_r400 = neck4.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(188, 146).addBox(-0.2686F, -0.9177F, 1.4152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(84, 178).addBox(-0.2686F, -0.4177F, 1.8152F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.6693F, 4.8085F, -6.9751F, 1.26F, 0.1535F, 0.0676F));

		PartDefinition cube_r401 = neck4.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(191, 113).addBox(-0.2454F, -3.6759F, 1.1391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(191, 116).addBox(-0.2454F, -3.2759F, 1.1391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(189, 73).addBox(-0.8454F, -4.2759F, 1.1391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5693F, 1.8085F, -2.1751F, 1.675F, -0.301F, 1.508F));

		PartDefinition cube_r402 = neck4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(177, 171).addBox(-0.3F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8876F, 2.2685F, -6.1927F, 1.8101F, 0.5471F, 2.1F));

		PartDefinition cube_r403 = neck4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(163, 180).addBox(0.8458F, -3.2485F, 1.2621F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5693F, 1.8085F, -2.1751F, 1.8372F, 0.9121F, 1.5405F));

		PartDefinition cube_r404 = neck4.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(140, 179).addBox(-3.4867F, -3.8375F, 0.6365F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5693F, 1.8085F, -2.1751F, 1.4282F, -0.3745F, 0.7957F));

		PartDefinition cube_r405 = neck4.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(192, 20).addBox(-0.874F, -5.7548F, 2.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5693F, 1.2085F, -1.8751F, 1.5162F, -0.2522F, -0.5995F));

		PartDefinition cube_r406 = neck4.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(149, 172).addBox(0.3554F, -4.7328F, 1.3013F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5693F, 1.2085F, -1.8751F, 1.5191F, -0.0362F, -0.6462F));

		PartDefinition cube_r407 = neck4.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(58, 155).addBox(-1.5693F, -4.6014F, -4.0059F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5693F, 1.2085F, -1.8751F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r408 = neck4.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(189, 77).addBox(-1.051F, -4.2759F, 1.2621F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.5693F, 1.8085F, -2.1751F, 1.7388F, -0.2712F, 1.2826F));

		PartDefinition cube_r409 = neck4.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(18, 178).addBox(-0.5229F, 4.5735F, -1.0391F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.0813F, 1.8857F, -11.9606F, 1.3548F, 0.135F, 0.0679F));

		PartDefinition cube_r410 = neck4.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(10, 188).addBox(-0.5033F, -1.6057F, -0.867F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(117, 177).addBox(-0.5033F, -1.6057F, -0.467F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.0813F, 1.8857F, -11.9606F, 1.2413F, 0.1373F, 0.0668F));

		PartDefinition cube_r411 = neck4.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(112, 170).addBox(-0.5033F, -2.7824F, -0.874F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.0813F, 1.8857F, -11.9606F, 1.3199F, 0.1373F, 0.0668F));

		PartDefinition cube_r412 = neck4.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(0, 192).addBox(-0.6018F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3303F, 2.1843F, -6.5445F, 1.456F, -0.2911F, -0.5834F));

		PartDefinition cube_r413 = neck4.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 151).addBox(0.0F, -1.5F, -3.3F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4387F, -9.4355F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r414 = neck4.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(171, 144).addBox(-0.4F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7807F, -1.7921F, -10.3874F, 1.4632F, -0.0781F, -0.643F));

		PartDefinition cube_r415 = neck4.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(179, 135).addBox(-1.4F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1926F, -1.0266F, -12.7252F, 1.4151F, -0.362F, 0.8004F));

		PartDefinition cube_r416 = neck4.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(191, 97).addBox(0.6251F, -0.3F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(191, 94).addBox(0.6251F, 0.1F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 189).addBox(0.0251F, -0.9F, -0.3727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7329F, 0.7832F, -12.5918F, 1.6738F, -0.2836F, 1.5083F));

		PartDefinition cube_r417 = neck4.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(180, 128).addBox(-1.8F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6629F, 0.1481F, -12.6698F, 1.8363F, 0.9295F, 1.5398F));

		PartDefinition cube_r418 = neck4.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(189, 56).addBox(-0.5284F, -0.9F, -0.4024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(2.7329F, 0.7832F, -12.5918F, 1.7337F, -0.2545F, 1.284F));

		PartDefinition cube_r419 = neck4.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(175, 79).addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8572F, 0.875F, -13.8715F, 1.7023F, 0.2169F, 1.9867F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6612F, -13.7799F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r420 = neck5.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(41, 31).addBox(-1.0F, 0.0F, -1.3F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8971F, -16.2753F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r421 = neck5.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(172, 54).mirror().addBox(-0.9288F, -4.5743F, 0.8839F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2549F, 0.5377F, -1.8422F, 1.4553F, 0.1141F, 0.6028F));

		PartDefinition cube_r422 = neck5.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(15, 192).mirror().addBox(0.1054F, -5.6631F, 1.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2549F, 0.5377F, -1.8422F, 1.3945F, 0.329F, 0.5646F));

		PartDefinition cube_r423 = neck5.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(172, 12).mirror().addBox(-1.0401F, -3.9539F, 0.6097F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2658F, -1.4956F, -14.874F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r424 = neck5.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(172, 32).mirror().addBox(-0.434F, -1.6829F, -1.4671F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3909F, -2.9357F, -10.4282F, 1.4117F, 0.1436F, 0.5972F));

		PartDefinition cube_r425 = neck5.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(192, 6).mirror().addBox(-0.0631F, -2.6169F, -0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3909F, -2.9357F, -10.4282F, 1.3473F, 0.3567F, 0.5487F));

		PartDefinition cube_r426 = neck5.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(5, 192).mirror().addBox(-0.6F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4854F, -4.2472F, -18.9236F, 1.4255F, 0.3102F, 0.5743F));

		PartDefinition cube_r427 = neck5.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(182, 163).mirror().addBox(-0.2706F, -0.444F, -0.7402F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(181, 29).mirror().addBox(-0.2706F, -0.044F, -0.7402F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-2.1549F, 0.2377F, -5.6422F, 1.5624F, -0.5443F, -0.9493F));

		PartDefinition cube_r428 = neck5.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(166, 185).mirror().addBox(-2.2115F, -4.424F, 0.2348F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2549F, 1.3377F, -1.8422F, 1.4969F, -0.2694F, -1.1765F));

		PartDefinition cube_r429 = neck5.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(189, 69).mirror().addBox(-1.8706F, -4.424F, 1.1663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.2549F, 1.3377F, -1.8422F, 1.6593F, -0.2651F, -1.7743F));

		PartDefinition cube_r430 = neck5.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(135, 173).mirror().addBox(-0.5586F, -1.7174F, -0.5621F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3549F, 2.3377F, -5.6422F, 1.2499F, -0.1407F, -0.065F));

		PartDefinition cube_r431 = neck5.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(39, 178).mirror().addBox(-0.5322F, 5.6899F, -0.7276F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3549F, 2.3377F, -5.6422F, 1.2849F, -0.1407F, -0.065F));

		PartDefinition cube_r432 = neck5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(177, 166).mirror().addBox(-0.6604F, -0.5236F, -2.181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9572F, 1.7929F, -5.6773F, 1.7511F, -0.1529F, -2.3007F));

		PartDefinition cube_r433 = neck5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(68, 189).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-2.6033F, 0.3126F, -11.8734F, 1.6704F, -0.3163F, -1.7775F));

		PartDefinition cube_r434 = neck5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(176, 153).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2572F, 0.0916F, -11.8959F, 1.6708F, -0.2703F, -1.8108F));

		PartDefinition cube_r435 = neck5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(187, 63).mirror().addBox(-0.4939F, -0.4098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(184, 60).mirror().addBox(-0.4939F, -0.8098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8391F, -0.9738F, -11.5024F, 1.2456F, -0.4991F, -0.3971F));

		PartDefinition cube_r436 = neck5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(99, 185).mirror().addBox(-1.6242F, -0.9091F, -0.2881F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8391F, -0.9738F, -11.5024F, 1.4757F, -0.3177F, -1.1704F));

		PartDefinition cube_r437 = neck5.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(130, 173).mirror().addBox(-0.462F, -1.96F, -0.5089F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4506F, 0.7707F, -11.7827F, 1.2302F, -0.107F, -0.0641F));

		PartDefinition cube_r438 = neck5.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(158, 181).mirror().addBox(-0.4357F, 5.4494F, -0.666F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4506F, 0.7707F, -11.7827F, 1.2651F, -0.107F, -0.0641F));

		PartDefinition cube_r439 = neck5.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(60, 171).mirror().addBox(-0.884F, 2.4201F, 1.3881F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8316F, 1.7778F, -17.3894F, 1.2913F, -0.1042F, -0.0657F));

		PartDefinition cube_r440 = neck5.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(28, 184).mirror().addBox(-0.8756F, -1.7816F, 1.0754F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.8316F, 1.7778F, -17.3894F, 1.3961F, -0.1007F, -0.0674F));

		PartDefinition cube_r441 = neck5.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(49, 176).mirror().addBox(-0.2F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2369F, -0.0198F, -17.2695F, 1.7357F, -0.1694F, -2.2049F));

		PartDefinition cube_r442 = neck5.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(49, 185).mirror().addBox(-0.6358F, -1.1128F, -0.0861F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9316F, 0.0778F, -16.6894F, 1.5933F, -0.0348F, -1.453F));

		PartDefinition cube_r443 = neck5.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(120, 158).mirror().addBox(0.1036F, -0.5308F, 0.4794F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-1.7316F, 0.0778F, -16.6894F, 1.7186F, -0.2616F, -1.0132F));

		PartDefinition cube_r444 = neck5.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(115, 136).mirror().addBox(0.102F, -0.9303F, 0.4765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7316F, 0.0778F, -16.6894F, 1.7337F, -0.252F, -1.017F));

		PartDefinition cube_r445 = neck5.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(177, 166).addBox(-0.3396F, -0.5236F, -2.181F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9572F, 1.7929F, -5.6773F, 1.7511F, 0.1529F, 2.3007F));

		PartDefinition cube_r446 = neck5.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(39, 178).addBox(-0.4678F, 5.6899F, -0.7276F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3549F, 2.3377F, -5.6422F, 1.2849F, 0.1407F, 0.065F));

		PartDefinition cube_r447 = neck5.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(135, 173).addBox(-0.4414F, -1.7174F, -0.5621F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3549F, 2.3377F, -5.6422F, 1.2499F, 0.1407F, 0.065F));

		PartDefinition cube_r448 = neck5.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(189, 69).addBox(0.8706F, -4.424F, 1.1663F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.2549F, 1.3377F, -1.8422F, 1.6593F, 0.2651F, 1.7743F));

		PartDefinition cube_r449 = neck5.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(166, 185).addBox(0.2115F, -4.424F, 0.2348F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2549F, 1.3377F, -1.8422F, 1.4969F, 0.2694F, 1.1765F));

		PartDefinition cube_r450 = neck5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(181, 29).addBox(-2.7294F, -0.044F, -0.7402F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(182, 163).addBox(-2.7294F, -0.444F, -0.7402F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1549F, 0.2377F, -5.6422F, 1.5624F, 0.5443F, 0.9493F));

		PartDefinition cube_r451 = neck5.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(65, 133).addBox(0.0F, -1.3F, -2.1F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1675F, -2.1888F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r452 = neck5.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(172, 54).addBox(-0.0712F, -4.5743F, 0.8839F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2549F, 0.5377F, -1.8422F, 1.4553F, -0.1141F, -0.6028F));

		PartDefinition cube_r453 = neck5.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(15, 192).addBox(-1.1054F, -5.6631F, 1.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2549F, 0.5377F, -1.8422F, 1.3945F, -0.329F, -0.5646F));

		PartDefinition cube_r454 = neck5.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(176, 153).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2572F, 0.0916F, -11.8959F, 1.6708F, 0.2703F, 1.8108F));

		PartDefinition cube_r455 = neck5.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(187, 63).addBox(-1.5061F, -0.4098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(184, 60).addBox(-1.5061F, -0.8098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8391F, -0.9738F, -11.5024F, 1.2456F, 0.4991F, 0.3971F));

		PartDefinition cube_r456 = neck5.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(155, 44).addBox(-0.3909F, -1.8313F, -1.3301F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3909F, -2.9357F, -10.4282F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r457 = neck5.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(172, 32).addBox(-0.566F, -1.6829F, -1.4671F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3909F, -2.9357F, -10.4282F, 1.4117F, -0.1436F, -0.5972F));

		PartDefinition cube_r458 = neck5.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(192, 6).addBox(-0.9369F, -2.6169F, -0.7671F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3909F, -2.9357F, -10.4282F, 1.3473F, -0.3567F, -0.5487F));

		PartDefinition cube_r459 = neck5.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(68, 189).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(2.6033F, 0.3126F, -11.8734F, 1.6704F, 0.3163F, 1.7775F));

		PartDefinition cube_r460 = neck5.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(99, 185).addBox(-0.3758F, -0.9091F, -0.2881F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8391F, -0.9738F, -11.5024F, 1.4757F, 0.3177F, 1.1704F));

		PartDefinition cube_r461 = neck5.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(130, 173).addBox(-0.538F, -1.96F, -0.5089F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4506F, 0.7707F, -11.7827F, 1.2302F, 0.107F, 0.0641F));

		PartDefinition cube_r462 = neck5.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(158, 181).addBox(-0.5643F, 5.4494F, -0.666F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4506F, 0.7707F, -11.7827F, 1.2651F, 0.107F, 0.0641F));

		PartDefinition cube_r463 = neck5.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(60, 171).addBox(-0.116F, 2.4201F, 1.3881F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8316F, 1.7778F, -17.3894F, 1.2913F, 0.1042F, 0.0657F));

		PartDefinition cube_r464 = neck5.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(28, 184).addBox(-0.1244F, -1.7816F, 1.0754F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.8316F, 1.7778F, -17.3894F, 1.3961F, 0.1007F, 0.0674F));

		PartDefinition cube_r465 = neck5.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(49, 176).addBox(-0.8F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2369F, -0.0198F, -17.2695F, 1.7357F, 0.1694F, 2.2049F));

		PartDefinition cube_r466 = neck5.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(49, 185).addBox(-1.3642F, -1.1128F, -0.0861F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9316F, 0.0778F, -16.6894F, 1.5933F, 0.0348F, 1.453F));

		PartDefinition cube_r467 = neck5.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(120, 158).addBox(-3.1036F, -0.5308F, 0.4794F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(1.7316F, 0.0778F, -16.6894F, 1.7186F, 0.2616F, 1.0132F));

		PartDefinition cube_r468 = neck5.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(115, 136).addBox(-3.102F, -0.9303F, 0.4765F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7316F, 0.0778F, -16.6894F, 1.7337F, 0.252F, 1.017F));

		PartDefinition cube_r469 = neck5.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(5, 192).addBox(-0.4F, -0.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4854F, -4.2472F, -18.9236F, 1.4255F, -0.3102F, -0.5743F));

		PartDefinition cube_r470 = neck5.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(172, 12).addBox(0.0401F, -3.9539F, 0.6097F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2658F, -1.4956F, -14.874F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition cube_r471 = neck5.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(130, 151).addBox(0.0F, -1.0F, -3.2F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9725F, -14.5634F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9493F, -17.6787F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r472 = neck6.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(46, 133).addBox(-1.0F, -0.1F, 4.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.5134F, -10.6063F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r473 = neck6.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(191, 166).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4854F, -2.4636F, -6.0546F, 1.4255F, 0.3102F, 0.5743F));

		PartDefinition cube_r474 = neck6.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(77, 176).mirror().addBox(-1.0401F, -3.9539F, 0.6097F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2658F, 0.2881F, -2.0051F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r475 = neck6.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(106, 185).mirror().addBox(-0.8673F, 3.8284F, 0.7034F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9771F, 2.1322F, -5.559F, 1.2913F, -0.1042F, -0.0657F));

		PartDefinition cube_r476 = neck6.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(178, 189).mirror().addBox(-0.3999F, -0.2F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(189, 81).mirror().addBox(-0.3999F, -0.8F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(49, 168).mirror().addBox(0.2001F, -0.8F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 49).mirror().addBox(0.2001F, -0.2F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9771F, 1.0322F, -4.859F, 1.6127F, 0.0138F, -1.5841F));

		PartDefinition cube_r477 = neck6.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(176, 158).mirror().addBox(-0.2F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7366F, 1.1588F, -5.2046F, 1.7469F, -0.2504F, -2.081F));

		PartDefinition cube_r478 = neck6.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(77, 183).mirror().addBox(-0.8673F, -1.51F, 0.4847F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9771F, 2.1322F, -5.559F, 1.3437F, -0.1042F, -0.0657F));

		PartDefinition cube_r479 = neck6.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(184, 32).mirror().addBox(0.0526F, -0.8894F, 0.2844F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9771F, 1.0322F, -4.859F, 1.5947F, -0.3357F, -0.933F));

		PartDefinition cube_r480 = neck6.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(106, 185).addBox(-0.1327F, 3.8284F, 0.7034F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9771F, 2.1322F, -5.559F, 1.2913F, 0.1042F, 0.0657F));

		PartDefinition cube_r481 = neck6.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(178, 189).addBox(-0.6001F, -0.2F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(189, 81).addBox(-0.6001F, -0.8F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 168).addBox(-1.2001F, -0.8F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 49).addBox(-1.2001F, -0.2F, -0.1119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9771F, 1.0322F, -4.859F, 1.6127F, -0.0138F, 1.5841F));

		PartDefinition cube_r482 = neck6.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(176, 158).addBox(-0.8F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7366F, 1.1588F, -5.2046F, 1.7469F, 0.2504F, 2.081F));

		PartDefinition cube_r483 = neck6.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(77, 183).addBox(-0.1327F, -1.51F, 0.4847F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9771F, 2.1322F, -5.559F, 1.3437F, 0.1042F, 0.0657F));

		PartDefinition cube_r484 = neck6.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(184, 32).addBox(-3.0526F, -0.8894F, 0.2844F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9771F, 1.0322F, -4.859F, 1.5947F, 0.3357F, 0.933F));

		PartDefinition cube_r485 = neck6.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(161, 0).addBox(0.0F, -1.0F, -2.5F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3194F, -2.6859F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r486 = neck6.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(191, 166).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4854F, -2.4636F, -6.0546F, 1.4255F, -0.3102F, -0.5743F));

		PartDefinition cube_r487 = neck6.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(77, 176).addBox(0.0401F, -3.9539F, 0.6097F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2658F, 0.2881F, -2.0051F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.33F, -6.5485F, 0.2127F, -0.0932F, -0.1971F));

		PartDefinition cube_r488 = neck7.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(121, 53).addBox(-2.2262F, -0.4067F, -10.1634F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, 0.0078F, 2.1942F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r489 = neck7.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(186, 98).mirror().addBox(-0.2248F, -4.7019F, 0.3805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -0.3922F, -0.6058F, 1.4606F, 0.0743F, 0.6082F));

		PartDefinition cube_r490 = neck7.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(189, 43).mirror().addBox(-0.5936F, -1.5226F, -0.7932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.245F, -1.6255F, -6.1847F, 1.4606F, 0.0743F, 0.6082F));

		PartDefinition cube_r491 = neck7.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(188, 143).mirror().addBox(-0.5858F, -1.8467F, -0.7773F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.9335F, -2.648F, 1.2874F, -0.0508F, -0.0534F));

		PartDefinition cube_r492 = neck7.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(184, 76).mirror().addBox(-1.0037F, -1.3102F, -0.5701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.9335F, -4.048F, 1.2268F, -0.0536F, -0.0656F));

		PartDefinition cube_r493 = neck7.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(188, 104).mirror().addBox(-0.8318F, -1.8467F, -0.1031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.9335F, -2.648F, 1.4934F, -0.2774F, -1.1756F));

		PartDefinition cube_r494 = neck7.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(187, 185).mirror().addBox(0.2085F, -1.8514F, 0.3074F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.9335F, -2.648F, 1.3209F, -0.1447F, -0.5141F));

		PartDefinition cube_r495 = neck7.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(189, 38).mirror().addBox(-1.5932F, -2.7187F, -0.9285F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2643F, 0.3738F, -5.215F, 1.411F, -0.119F, -0.0591F));

		PartDefinition cube_r496 = neck7.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(188, 135).mirror().addBox(-1.0799F, -2.1521F, -0.8866F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2643F, 0.3738F, -5.215F, 1.427F, -0.0429F, -0.0599F));

		PartDefinition cube_r497 = neck7.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(188, 88).mirror().addBox(-1.1431F, -2.1521F, 0.2958F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2643F, 0.3738F, -5.215F, 1.5476F, -0.1482F, -1.187F));

		PartDefinition cube_r498 = neck7.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(189, 35).mirror().addBox(-0.2732F, -2.1728F, 0.4263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2643F, 0.3738F, -5.215F, 1.4427F, -0.0751F, -0.5275F));

		PartDefinition cube_r499 = neck7.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(188, 143).addBox(-1.4142F, -1.8467F, -0.7773F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.7396F, 0.9335F, -2.648F, 1.2874F, 0.0508F, 0.0534F));

		PartDefinition cube_r500 = neck7.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(184, 76).addBox(0.0037F, -1.3102F, -0.5701F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7396F, 0.9335F, -4.048F, 1.2268F, 0.0536F, 0.0656F));

		PartDefinition cube_r501 = neck7.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(188, 104).addBox(-1.1682F, -1.8467F, -0.1031F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7396F, 0.9335F, -2.648F, 1.4934F, 0.2774F, 1.1756F));

		PartDefinition cube_r502 = neck7.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(171, 128).addBox(-1.2262F, -2.0135F, -3.3179F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, -0.3922F, -0.6058F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r503 = neck7.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(186, 98).addBox(-0.7752F, -4.7019F, 0.3805F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, -0.3922F, -0.6058F, 1.4606F, -0.0743F, -0.6082F));

		PartDefinition cube_r504 = neck7.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(187, 185).addBox(-2.2085F, -1.8514F, 0.3074F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7396F, 0.9335F, -2.648F, 1.3209F, 0.1447F, 0.5141F));

		PartDefinition cube_r505 = neck7.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(189, 38).addBox(0.5932F, -2.7187F, -0.9285F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2643F, 0.3738F, -5.215F, 1.411F, 0.119F, 0.0591F));

		PartDefinition cube_r506 = neck7.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(188, 135).addBox(-0.9201F, -2.1521F, -0.8866F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2643F, 0.3738F, -5.215F, 1.427F, 0.0429F, 0.0599F));

		PartDefinition cube_r507 = neck7.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(188, 88).addBox(-0.8569F, -2.1521F, 0.2958F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2643F, 0.3738F, -5.215F, 1.5476F, 0.1482F, 1.187F));

		PartDefinition cube_r508 = neck7.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(189, 35).addBox(-1.7268F, -2.1728F, 0.4263F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2643F, 0.3738F, -5.215F, 1.4427F, 0.0751F, 0.5275F));

		PartDefinition cube_r509 = neck7.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(180, 63).addBox(-0.245F, -1.1852F, -1.47F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.245F, -1.6255F, -6.1847F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r510 = neck7.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(189, 43).addBox(-0.4064F, -1.5226F, -0.7932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.245F, -1.6255F, -6.1847F, 1.4606F, -0.0743F, -0.6082F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0784F, -7.5944F, -0.235F, -0.0862F, -0.0137F));

		PartDefinition cube_r511 = neck8.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(115, 44).addBox(0.0F, -0.8F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9321F, -3.6813F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r512 = neck8.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(186, 121).addBox(-1.2455F, -4.212F, -3.2812F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2455F, 1.8771F, 1.0628F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r513 = neck8.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(48, 189).mirror().addBox(-1.5867F, -3.7861F, 2.3534F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2455F, 1.8771F, 1.0628F, 1.6824F, -0.0808F, 0.6075F));

		PartDefinition cube_r514 = neck8.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(190, 110).mirror().addBox(-1.8439F, -0.5455F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(190, 24).mirror().addBox(-1.2439F, -0.5455F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.015F, -0.6056F, -1.8413F, 1.5836F, -0.0592F, -1.1908F));

		PartDefinition cube_r515 = neck8.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(82, 187).mirror().addBox(-0.3892F, -0.5367F, -1.2497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.015F, -0.6056F, -1.8413F, 1.5257F, -0.0266F, -0.5317F));

		PartDefinition cube_r516 = neck8.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(187, 66).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2433F, 1.0075F, -1.967F, 1.5187F, -0.0308F, 0.0583F));

		PartDefinition cube_r517 = neck8.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(111, 188).mirror().addBox(-0.8327F, -0.6058F, -2.6573F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.015F, -1.1056F, -1.8413F, 1.3744F, -0.0948F, -0.0561F));

		PartDefinition cube_r518 = neck8.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(48, 189).addBox(0.5867F, -3.7861F, 2.3534F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2455F, 1.8771F, 1.0628F, 1.6824F, 0.0808F, -0.6075F));

		PartDefinition cube_r519 = neck8.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(82, 187).addBox(-1.6108F, -0.5367F, -1.2497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.015F, -0.6056F, -1.8413F, 1.5257F, 0.0266F, 0.5317F));

		PartDefinition cube_r520 = neck8.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(187, 66).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2433F, 1.0075F, -1.967F, 1.5187F, 0.0308F, -0.0583F));

		PartDefinition cube_r521 = neck8.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(190, 110).addBox(0.8439F, -0.5455F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(190, 24).addBox(0.2439F, -0.5455F, -1.0104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.015F, -0.6056F, -1.8413F, 1.5836F, 0.0592F, 1.1908F));

		PartDefinition cube_r522 = neck8.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(111, 188).addBox(-0.1673F, -0.6058F, -2.6573F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.015F, -1.1056F, -1.8413F, 1.3744F, 0.0948F, 0.0561F));

		PartDefinition cube_r523 = neck8.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(28, 157).addBox(-1.0F, -0.9F, -4.4F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2062F, -0.621F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6502F, -4.8819F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r524 = head.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(157, 32).addBox(-2.0F, -0.3F, -1.4F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.4085F, -1.5514F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r525 = head.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(76, 191).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(191, 3).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-2.63F, 0.1662F, -2.0461F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r526 = head.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(191, 60).mirror().addBox(-0.5F, -0.9487F, -0.1107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.63F, 0.7662F, -1.9461F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r527 = head.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(99, 189).mirror().addBox(-0.5F, -1.8763F, -0.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -0.5338F, -2.3461F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r528 = head.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(189, 126).mirror().addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -0.4869F, -0.9526F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r529 = head.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(189, 130).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-2.63F, 0.5629F, -0.9709F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r530 = head.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(191, 0).mirror().addBox(-0.5F, -0.0906F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -1.5702F, -2.7844F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r531 = head.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(33, 191).mirror().addBox(-0.5F, -0.8622F, -0.1227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -0.7702F, -1.9844F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r532 = head.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(23, 191).mirror().addBox(-0.5F, -0.8595F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -1.0702F, -1.2844F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r533 = head.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(28, 191).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.63F, -1.8273F, -1.4953F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r534 = head.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(126, 191).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(126, 191).addBox(3.76F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-2.63F, -2.1702F, -1.6844F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r535 = head.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(191, 163).mirror().addBox(-0.5F, -0.1049F, -0.1341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(191, 163).addBox(3.76F, -0.1049F, -0.1341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.63F, -2.6702F, -1.8844F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r536 = head.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(190, 181).mirror().addBox(-0.5F, -0.0661F, -0.1102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(190, 181).addBox(3.76F, -0.0661F, -0.1102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.63F, -2.3702F, -2.5844F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r537 = head.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(191, 119).mirror().addBox(-2.54F, -0.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(191, 122).mirror().addBox(-2.75F, -0.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(191, 122).addBox(1.75F, -0.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(191, 119).addBox(1.54F, -0.9F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0408F, -0.4619F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r538 = head.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(28, 191).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.63F, -1.8273F, -1.4953F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r539 = head.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(23, 191).addBox(-0.5F, -0.8595F, -0.0843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.63F, -1.0702F, -1.2844F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r540 = head.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(33, 191).addBox(-0.5F, -0.8622F, -0.1227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.63F, -0.7702F, -1.9844F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r541 = head.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(189, 126).addBox(-0.5F, -1.2F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.63F, -0.4869F, -0.9526F, -0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r542 = head.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(189, 130).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(1.63F, 0.5629F, -0.9709F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r543 = head.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(191, 60).addBox(-0.5F, -0.9487F, -0.1107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.63F, 0.7662F, -1.9461F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r544 = head.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(99, 189).addBox(-0.5F, -1.8763F, -0.1672F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(1.63F, -0.5338F, -2.3461F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r545 = head.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(76, 191).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(191, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(1.63F, 0.1662F, -2.0461F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r546 = head.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(191, 0).addBox(-0.5F, -0.0906F, -0.0952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.63F, -1.5702F, -2.7844F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r547 = head.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(142, 166).addBox(-2.5F, 1.2995F, -1.863F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(142, 166).addBox(-2.5F, -0.0005F, -1.063F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -2.8408F, -0.7619F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r548 = head.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(142, 166).addBox(-2.5F, -1.0F, -0.4F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.7533F, -2.4048F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r549 = head.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(168, 111).addBox(-2.5F, -0.0171F, -1.0478F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -2.4408F, 0.1381F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r550 = head.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(159, 92).addBox(-2.5F, -1.9635F, -1.9168F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3592F, -0.4619F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r551 = head.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(173, 71).mirror().addBox(-2.5F, -0.8F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.4847F, 0.0398F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r552 = head.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(173, 71).addBox(-0.5F, -0.8F, -1.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4847F, 0.0398F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r553 = head.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(105, 166).addBox(-2.5F, -1.408F, -1.0418F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.1329F, 0.2329F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r554 = head.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(65, 166).addBox(-2.5F, -1.974F, -0.8235F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 1.3671F, -0.2671F, -0.1833F, 0.0F, 0.0F));

		PartDefinition ForeHead = head.addOrReplaceChild("ForeHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5408F, -1.9619F, -0.3054F, 0.0F, 0.0F));

		PartDefinition ForeHead2 = ForeHead.addOrReplaceChild("ForeHead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r555 = ForeHead2.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(171, 114).addBox(-2.0F, -0.0091F, -1.2296F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r556 = ForeHead2.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(180, 185).addBox(-0.0045F, -0.1306F, -0.0592F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.0667F, 2.3226F, -3.0871F, -0.2181F, -0.0074F, -0.0047F));

		PartDefinition cube_r557 = ForeHead2.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(49, 171).addBox(-1.0F, -0.9F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-1.0667F, 3.1226F, -3.1871F, -0.4276F, -0.0074F, -0.0047F));

		PartDefinition cube_r558 = ForeHead2.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(60, 113).mirror().addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5738F, 3.0023F, -3.3617F, 0.7941F, -0.0074F, -0.0047F));

		PartDefinition cube_r559 = ForeHead2.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(177, 176).mirror().addBox(-0.5164F, -0.239F, -2.7783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7F, -1.1F, 0.7278F, 0.0991F, 0.0716F));

		PartDefinition cube_r560 = ForeHead2.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(60, 113).addBox(-1.0F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5738F, 3.0023F, -3.3617F, 0.7941F, 0.0074F, 0.0047F));

		PartDefinition cube_r561 = ForeHead2.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(177, 176).addBox(-0.4836F, -0.239F, -2.7783F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 0.7F, -1.1F, 0.7278F, -0.0991F, -0.0716F));

		PartDefinition cube_r562 = ForeHead2.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(190, 138).addBox(-1.0F, -0.2088F, -0.7408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.6F, -2.4F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r563 = ForeHead2.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(121, 190).addBox(-1.0F, -0.1671F, -0.8104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.3F, -1.8F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r564 = ForeHead2.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(190, 27).addBox(-1.0F, -0.2095F, -2.0209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Snout = head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(105, 158).addBox(-2.0F, 1.1F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.5408F, -1.9619F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r565 = Snout.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(175, 123).mirror().addBox(-2.5F, -1.015F, -0.8893F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(175, 123).addBox(-1.5F, -1.015F, -0.8893F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 2.435F, -0.4152F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r566 = Snout.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(166, 138).addBox(-2.0F, -0.9972F, -0.0022F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 2.258F, -2.4411F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r567 = Snout.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(184, 11).addBox(-1.5F, -0.6F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 1.758F, -2.8411F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Snout2 = Snout.addOrReplaceChild("Snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r568 = Snout2.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(173, 185).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -1.0625F, -1.5242F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r569 = Snout2.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(181, 25).addBox(-1.5F, -1.2F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(180, 49).addBox(-1.5F, -0.8F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, -0.9F, -0.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Snout3 = Snout2.addOrReplaceChild("Snout3", CubeListBuilder.create().texOffs(149, 185).addBox(-1.0F, -1.2216F, -0.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.15F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r570 = Snout3.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(184, 14).addBox(-1.5F, -0.5F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(180, 132).addBox(-1.5F, -0.4F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.7805F, 2.0205F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Nose = Snout2.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Nose2 = Nose.addOrReplaceChild("Nose2", CubeListBuilder.create().texOffs(185, 155).addBox(-1.5F, 0.967F, 0.0549F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r571 = Nose2.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(121, 187).addBox(-1.0F, 0.0F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.967F, 0.2549F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r572 = Nose2.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(185, 151).addBox(-1.0F, -0.7715F, -1.7351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 1.4F, 2.6F, 0.0698F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3917F, -0.4476F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r573 = jaw.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(87, 190).mirror().addBox(-4.5F, -1.0386F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(87, 190).addBox(-1.3F, -1.0386F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.9F, 1.505F, -1.5416F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r574 = jaw.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(177, 100).mirror().addBox(-0.1F, -0.9195F, -2.9414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.4208F, -2.0926F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r575 = jaw.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(82, 190).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(82, 190).addBox(2.7F, -0.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.1F, 0.405F, -0.9416F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r576 = jaw.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(191, 84).mirror().addBox(-2.0F, 0.1F, -3.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(177, 95).mirror().addBox(-2.0F, 0.1F, -2.99F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(191, 84).addBox(1.2F, 0.1F, -3.39F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(177, 95).addBox(1.2F, 0.1F, -2.99F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.6F, -0.195F, 0.5484F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r577 = jaw.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(177, 100).addBox(-0.9F, -0.9195F, -2.9414F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4208F, -2.0926F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Jaw2 = jaw.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.195F, -2.4516F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r578 = Jaw2.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(191, 91).addBox(-0.5F, -0.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 0.9423F, -3.7201F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r579 = Jaw2.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(190, 107).addBox(-0.5F, -0.6F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, 1.4423F, -3.9201F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r580 = Jaw2.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(179, 105).addBox(-1.0F, -0.6F, -0.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, 1.1696F, -2.3602F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r581 = Jaw2.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(191, 100).mirror().addBox(-1.1F, 0.5995F, -3.1414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.122F, -0.0558F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r582 = Jaw2.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(185, 159).mirror().addBox(-1.1F, 0.0827F, -1.9501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.122F, -0.4558F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r583 = Jaw2.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(191, 100).addBox(0.1F, 0.5995F, -3.1414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0014F)), PartPose.offsetAndRotation(0.0F, 0.122F, -0.0558F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r584 = Jaw2.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(185, 159).addBox(0.1F, 0.0827F, -1.9501F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.122F, -0.4558F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Jaw3 = Jaw2.addOrReplaceChild("Jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.95F));

		PartDefinition cube_r585 = Jaw3.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(104, 191).mirror().addBox(0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.6579F, 0.8059F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r586 = Jaw3.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(104, 191).addBox(-1.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6579F, 0.8059F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r587 = Jaw3.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(92, 190).addBox(-1.0F, -0.8869F, 0.0047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.2396F, 0.0843F, 1.4399F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
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