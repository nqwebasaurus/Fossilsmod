package fossils.fossils.client.blockentity.model.mamenchisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MamenchisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftFoot;
	private final ModelPart leftToes;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightFoot;
	private final ModelPart rightToes;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart TailClub;
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

	public MamenchisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.leftLeg = this.root.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftFoot = this.leftLeg2.getChild("leftFoot");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg = this.root.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightFoot = this.rightLeg2.getChild("rightFoot");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.hips = this.root.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.TailClub = this.tail7.getChild("TailClub");
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -30.5F, 17.0F));

		PartDefinition leftLeg = root.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(103, 66).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 0.0F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 116).addBox(-2.0F, 0.4F, -2.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 126).addBox(-1.0F, -4.0F, -1.5F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(82, 76).addBox(-2.6F, 3.0505F, -0.274F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(116, 76).addBox(-2.6F, 0.0505F, -0.774F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.4F, -2.9F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 130).addBox(-1.0F, -1.4F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.5531F, 2.2459F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 4.3005F, 2.126F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg2.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(24, 56).addBox(-4.5F, 0.5183F, -4.6842F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 11.0505F, 1.626F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftFoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(121, 39).addBox(-3.2F, -2.7F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0183F, -1.6842F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(104, 18).addBox(-4.5F, -1.0F, -3.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition rightLeg = root.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(70, 21).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, -2.5F));

		PartDefinition cube_r6 = rightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 21).addBox(-1.0F, 0.4F, -2.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = rightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, -4.0F, -1.5F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 77).addBox(-0.4F, 3.0505F, -0.274F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 64).addBox(-0.4F, 0.0505F, -0.774F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.4F, -2.9F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r8 = rightLeg2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(130, 31).addBox(-1.0F, -1.4F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 1.5531F, 2.2459F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightLeg2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 0).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 4.3005F, 2.126F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg2.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(32, 16).addBox(-4.5F, 0.5183F, -4.6842F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 11.0505F, 1.626F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightFoot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 77).addBox(-3.8F, -2.7F, -1.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0183F, -1.6842F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(103, 55).addBox(-4.5F, -1.0F, -3.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, 1.5183F, -4.6842F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -4.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(-0.7389F, -0.4389F, -1.7467F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 10.4421F, -0.5832F, 0.1222F, 0.0F, -0.3054F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(129, 20).mirror().addBox(-1.4004F, 6.0604F, -1.2114F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 0).mirror().addBox(-1.4004F, -0.9396F, -0.8114F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 8.2421F, 5.0168F, 1.0721F, 0.1923F, -0.4091F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 69).mirror().addBox(-1.1599F, -5.077F, -8.1861F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 9.0421F, 5.7168F, 0.2094F, 0.0F, -0.3054F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(61, 103).mirror().addBox(-1.9044F, -6.0948F, -9.5677F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8956F, 9.0421F, 5.7168F, -0.3142F, 0.0F, -0.0873F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(138, 64).mirror().addBox(-0.5F, -0.1615F, -0.0101F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(138, 64).addBox(8.5F, -0.1615F, -0.0101F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, 0.4635F, 7.6413F, -1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(113, 101).mirror().addBox(-0.5F, -4.3F, 1.7F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 101).addBox(8.5F, -4.3F, 1.7F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.3548F, -0.0298F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-0.5F, -0.0371F, -0.799F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(84, 53).addBox(8.5F, -0.0371F, -0.799F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -0.23F, -6.6055F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(138, 35).mirror().addBox(-0.5F, 1.3986F, -5.8988F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(129, 3).mirror().addBox(-0.5F, -0.1014F, -2.9988F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(138, 35).addBox(8.5F, 1.3986F, -5.8988F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(129, 3).addBox(8.5F, -0.1014F, -2.9988F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -4.6983F, -2.6389F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-0.5F, -3.0F, -3.5F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(80, 103).addBox(8.5F, -3.0F, -3.5F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-5.0F, -1.0863F, 0.1205F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-3.5F, -0.6F, -3.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 95).addBox(0.5F, -0.6F, -3.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(68, 1).addBox(-1.5F, -1.5F, -7.5F, 3.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1245F, 0.4815F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 29).addBox(-2.2611F, -0.4389F, -1.7467F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.8956F, 10.4421F, -0.5832F, 0.1222F, 0.0F, 0.3054F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(129, 20).addBox(-0.5996F, 6.0604F, -1.2114F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-0.5996F, -0.9396F, -0.8114F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8956F, 8.2421F, 5.0168F, 1.0721F, -0.1923F, 0.4091F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 69).addBox(-0.8401F, -5.077F, -8.1861F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8956F, 9.0421F, 5.7168F, 0.2094F, 0.0F, 0.3054F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(61, 103).addBox(-0.0956F, -6.0948F, -9.5677F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8956F, 9.0421F, 5.7168F, -0.3142F, 0.0F, 0.0873F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 139).addBox(-0.5F, -4.0F, 12.9F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(144, 70).addBox(-0.5F, -3.9F, 10.1F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0199F, -7.171F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 109).addBox(-0.5F, -2.4F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.848F, -0.5737F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, 7.3F, -0.0437F, 0.0436F, -0.0019F));

		PartDefinition cube_r27 = tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 151).addBox(0.0F, -2.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.69F, 14.1603F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 131).addBox(0.0F, -2.9F, -1.2F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4993F, 13.0362F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r29 = tail.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(19, 142).addBox(0.0F, -3.0F, -1.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6842F, 10.9229F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(106, 152).addBox(0.0F, -2.0F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4211F, 7.9654F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 77).addBox(-1.5F, -1.3F, -6.5F, 3.0F, 3.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.352F, 6.6592F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r32 = tail.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(101, 152).addBox(-0.5F, -3.1F, 4.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 153).addBox(-0.5F, -3.1349F, 7.2985F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 23).addBox(-0.5F, -3.1F, 2.9F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 111).addBox(-0.5F, -3.1F, -0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0435F, 4.4883F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r33 = tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(138, 134).addBox(-0.5F, -3.5F, -1.3F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.9476F, 2.2904F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9382F, 13.1359F, -0.2233F, 0.2129F, -0.0479F));

		PartDefinition cube_r34 = tail2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2473F, -0.3617F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(105, 0).addBox(-0.5F, -3.9F, 5.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(-0.5F, -3.7F, 3.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 155).addBox(-0.5F, -3.3F, 1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 155).addBox(-0.5F, -3.0462F, -0.4113F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.169F, 5.1832F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(117, 158).addBox(0.0F, -1.2F, 1.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(120, 158).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1531F, 10.6278F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(123, 158).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4201F, 9.1654F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(138, 158).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7644F, 7.4532F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(144, 158).addBox(0.0F, -1.5F, -0.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1923F, 5.8542F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(46, 149).addBox(0.0F, -2.0F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6166F, 3.3086F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 155).addBox(-0.5F, -3.2531F, -0.1304F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9735F, 2.8377F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 155).addBox(-0.5F, -3.1902F, 9.5861F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.3883F, -8.9555F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9019F, 12.5549F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition cube_r43 = tail3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(63, 73).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6135F, -0.0637F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(24, 56).addBox(0.0F, -4.8641F, 10.969F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 33).addBox(0.0F, -4.4951F, 8.9331F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 156).addBox(0.0F, -4.0344F, 6.9576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 157).addBox(0.0F, -3.4672F, 5.1788F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 158).addBox(0.0F, -3.0246F, 3.2607F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 158).addBox(0.0F, -2.5F, 1.4F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(140, 144).addBox(0.0F, -2.0F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7736F, 1.6921F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(59, 20).addBox(0.005F, -1.25F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 155).addBox(-0.005F, -0.25F, 1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(155, 132).addBox(-0.005F, -0.25F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.9607F, 10.9366F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(155, 141).addBox(-0.01F, 0.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(84, 53).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1541F, 8.6312F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(16, 100).addBox(0.0F, -0.7F, 3.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 69).addBox(0.0F, -0.8F, 1.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 10).addBox(0.0F, -1.0F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2171F, 3.1185F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(111, 158).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.269F, 1.2218F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0959F, 13.7468F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r49 = tail4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 50).addBox(-1.0F, -0.2F, -0.2F, 2.0F, 1.0F, 14.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0834F, 0.0485F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(7, 0).addBox(0.0F, -8.3F, 22.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 29).addBox(0.0F, -7.7866F, 20.8768F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 29).addBox(0.0F, -7.2366F, 18.9634F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 29).addBox(0.0F, -6.7F, 17.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 29).addBox(0.0F, -6.25F, 15.1866F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 16).addBox(0.0F, -5.8F, 13.2732F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6935F, -11.9957F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(15, 111).addBox(-0.005F, -0.45F, 14.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 116).addBox(-0.005F, -0.45F, 12.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 122).addBox(-0.005F, -0.45F, 10.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(119, 124).addBox(-0.005F, -0.45F, 8.7F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(133, 81).addBox(-0.005F, -0.45F, 5.7F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(139, 73).addBox(-0.005F, -0.45F, 3.2F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 2.0408F, -2.7512F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2358F, 13.8701F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r52 = tail5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(88, 21).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0976F, -0.0216F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -11.7F, 33.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 13).addBox(0.0F, -11.2F, 32.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 29).addBox(0.0F, -10.6F, 30.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 29).addBox(0.0F, -9.9F, 28.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 66).addBox(0.0F, -9.3F, 26.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -8.8F, 24.6F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4578F, -25.8658F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail5.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -0.25F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 77).addBox(0.0F, -0.25F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 76).addBox(0.0F, -0.25F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 0).addBox(0.0F, -0.25F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 76).addBox(0.0F, -0.25F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 0).addBox(0.0F, -0.35F, -4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 55).addBox(0.0F, -0.35F, -6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.0491F, 6.4621F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8882F, 12.7096F, 0.0962F, -0.4346F, -0.0406F));

		PartDefinition cube_r55 = tail6.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0513F, 0.2081F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.694F, 12.0914F, -0.257F, -0.5522F, 0.137F));

		PartDefinition cube_r56 = tail7.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2883F, 0.0021F, 0.0698F, 0.0F, 0.0F));

		PartDefinition TailClub = tail7.addOrReplaceChild("TailClub", CubeListBuilder.create().texOffs(138, 7).addBox(-1.0F, -1.0302F, 1.171F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 114).addBox(-0.5F, -0.6302F, -0.129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5581F, 10.9311F, 0.0F, -0.4363F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 0).addBox(-7.5F, -4.9F, -0.1F, 15.0F, 5.0F, 10.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 17.6329F, -3.9955F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 29).addBox(-6.5F, -4.1F, -13.2F, 13.0F, 4.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 17.8329F, -3.8955F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(36, 47).addBox(-1.5F, -0.1545F, -0.0348F, 3.0F, 4.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -5.3401F, -17.4698F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(146, 64).mirror().addBox(-16.4589F, -9.7617F, -1.1799F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.032F, -14.0467F, -0.0761F, 0.1458F, -1.5311F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(128, 104).mirror().addBox(-18.4589F, -9.7617F, -1.1799F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.632F, -17.0467F, -0.074F, 0.1981F, -1.5308F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(105, 36).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.632F, -17.0467F, 0.0272F, 0.2096F, -1.0406F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.032F, -14.0467F, 0.0004F, 0.1644F, -1.0456F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(104, 31).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -3.132F, -10.3467F, -0.0652F, 0.0508F, -1.0526F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(116, 73).mirror().addBox(-14.4845F, -2.3986F, -1.1799F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.532F, -7.3467F, -0.0998F, -0.0098F, -1.0534F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(121, 113).mirror().addBox(-11.4845F, -2.3986F, -1.1799F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.032F, -4.8467F, -0.1257F, -0.0553F, -1.0525F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(128, 85).mirror().addBox(-10.4845F, -2.3986F, -1.1799F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.332F, -2.2467F, -0.1605F, -0.1159F, -1.0495F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(121, 89).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.332F, -2.2467F, -0.1958F, -0.0626F, -0.6588F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(121, 92).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.032F, -4.8467F, -0.1406F, -0.0198F, -0.6611F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(121, 116).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.532F, -7.3467F, -0.0993F, 0.0124F, -0.6613F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(125, 54).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -3.132F, -10.3467F, -0.0441F, 0.0552F, -0.6594F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(126, 17).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.032F, -14.0467F, 0.0602F, 0.135F, -0.6495F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(54, 127).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -4.632F, -17.0467F, 0.1025F, 0.1665F, -0.6431F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(121, 89).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.332F, -2.2467F, -0.1958F, 0.0626F, 0.6588F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(128, 85).addBox(5.4845F, -2.3986F, -1.1799F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.332F, -2.2467F, -0.1605F, 0.1159F, 1.0495F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(121, 92).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.032F, -4.8467F, -0.1406F, 0.0198F, 0.6611F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(121, 113).addBox(5.4845F, -2.3986F, -1.1799F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.032F, -4.8467F, -0.1257F, 0.0553F, 1.0525F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(121, 116).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.532F, -7.3467F, -0.0993F, -0.0124F, 0.6613F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(116, 73).addBox(5.4845F, -2.3986F, -1.1799F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.532F, -7.3467F, -0.0998F, 0.0098F, 1.0534F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(125, 54).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -3.132F, -10.3467F, -0.0441F, -0.0552F, 0.6594F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(104, 31).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -3.132F, -10.3467F, -0.0652F, -0.0508F, 1.0526F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(146, 64).addBox(13.4589F, -9.7617F, -1.1799F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.032F, -14.0467F, -0.0761F, -0.1458F, 1.5311F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(105, 14).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.032F, -14.0467F, 0.0004F, -0.1644F, 1.0456F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(142, 115).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9567F, -1.6165F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(117, 142).addBox(-0.5F, -3.0F, -1.3F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.27F, -3.9959F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(143, 13).addBox(-0.5F, -3.2F, 4.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(143, 83).addBox(-0.5F, -3.0F, 1.9F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(143, 99).addBox(-0.5F, -3.3F, -1.1F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.6105F, -12.8148F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(143, 142).addBox(-0.5F, -3.4F, 14.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.391F, -29.8661F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(126, 17).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.032F, -14.0467F, 0.0602F, -0.135F, 0.6495F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(128, 104).addBox(13.4589F, -9.7617F, -1.1799F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.632F, -17.0467F, -0.074F, -0.1981F, 1.5308F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(105, 36).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.632F, -17.0467F, 0.0272F, -0.2096F, 1.0406F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(54, 127).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -4.632F, -17.0467F, 0.1025F, -0.1665F, 0.6431F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.6019F, -17.504F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(56, 88).mirror().addBox(0.1966F, -0.0079F, -0.9844F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.8453F, 19.9091F, -3.2599F, 2.9389F, 0.085F, -0.5094F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(138, 115).mirror().addBox(-1.2481F, 2.1081F, -0.6067F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.5721F, 0.4166F, -1.1701F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(11, 128).mirror().addBox(-1.2481F, 2.1081F, -0.6067F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.4269F, 0.3573F, -1.2414F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(-1.2481F, 2.1081F, -0.6067F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.3201F, 0.2983F, -1.2838F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 141).mirror().addBox(-1.2481F, 2.1081F, -0.6067F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.1987F, 0.3751F, -1.3212F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.0988F, -0.0845F, -1.5609F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(61, 137).mirror().addBox(0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.2303F, -0.1284F, -1.5777F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.3085F, -0.0409F, -1.5764F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 141).mirror().addBox(0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8453F, 20.6091F, -2.9599F, 2.4132F, 0.062F, -1.5589F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(88, 141).mirror().addBox(0.3172F, -0.0177F, -0.5719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9453F, 20.9091F, -3.2599F, 3.0111F, -0.0748F, -1.2717F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.75F, -1.5F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 118).mirror().addBox(-0.5F, -3.75F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7211F, 20.1475F, -8.2145F, 1.5949F, -0.1059F, -1.5327F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(155, 31).mirror().addBox(1.0524F, -4.4709F, -0.5488F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4919F, 14.7854F, -14.1572F, -0.0301F, 0.3592F, -1.2907F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(16, 114).mirror().addBox(-0.8209F, -2.3885F, -5.5436F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.4915F, 15.5378F, -10.7208F, 1.547F, -0.4779F, -1.1388F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(0.1F, -4.2F, -10.8F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 88).mirror().addBox(0.1F, -2.2F, -4.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.6F, 5.9453F, -5.4007F, 1.117F, -0.1571F, 0.0698F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(123, 45).mirror().addBox(0.1F, -1.559F, -0.0137F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 89).mirror().addBox(0.1F, -3.559F, 4.9863F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.6F, 9.0453F, -5.4007F, 1.0939F, -0.0391F, 0.3048F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(110, 89).addBox(-2.1F, -3.559F, 4.9863F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(123, 45).addBox(-2.1F, -1.559F, -0.0137F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.6F, 9.0453F, -5.4007F, 1.0939F, 0.0391F, -0.3048F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(9, 118).addBox(-0.5F, -3.75F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.75F, -1.5F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7211F, 20.1475F, -8.2145F, 1.5949F, 0.1059F, 1.5327F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(64, 16).addBox(-0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.3085F, 0.0409F, 1.5764F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(11, 128).addBox(1.2481F, 2.1081F, -0.6067F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.4269F, -0.3573F, 1.2414F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 83).addBox(-0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.0988F, 0.0845F, 1.5609F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 141).addBox(1.2481F, 2.1081F, -0.6067F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.1987F, -0.3751F, 1.3212F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(61, 137).addBox(-0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.2303F, 0.1284F, 1.5777F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(99, 0).addBox(1.2481F, 2.1081F, -0.6067F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.3201F, -0.2983F, 1.2838F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 141).addBox(-0.0518F, -0.3942F, -0.4966F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.4132F, -0.062F, 1.5589F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(138, 115).addBox(1.2481F, 2.1081F, -0.6067F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8453F, 20.6091F, -2.9599F, 2.5721F, -0.4166F, 1.1701F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(56, 88).addBox(-0.1966F, -0.0079F, -0.9844F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8453F, 19.9091F, -3.2599F, 2.9389F, -0.085F, 0.5094F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(88, 141).addBox(-0.3172F, -0.0177F, -0.5719F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9453F, 20.9091F, -3.2599F, 3.0111F, 0.0748F, 1.2717F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(23, 152).addBox(-1.9919F, -0.9931F, -0.7089F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4919F, 14.7854F, -14.1572F, 0.3725F, 0.0F, 0.0F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(155, 31).addBox(-2.0524F, -4.4709F, -0.5488F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4919F, 14.7854F, -14.1572F, -0.0301F, -0.3592F, 1.2907F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(16, 114).addBox(-1.1791F, -2.3885F, -5.5436F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.4915F, 15.5378F, -10.7208F, 1.547F, 0.4779F, 1.1388F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 56).addBox(-2.1F, -4.2F, -10.8F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(38, 88).addBox(-2.1F, -2.2F, -4.8F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.6F, 5.9453F, -5.4007F, 1.117F, 0.1571F, -0.0698F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(26, 69).addBox(-1.5F, -0.1361F, -0.3668F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.2292F, -13.14F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-20.4589F, -9.7617F, -1.1799F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.2244F, -3.6412F, -0.0689F, 0.3202F, -1.5295F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(30, 47).mirror().addBox(-22.4589F, -9.7617F, -1.1799F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.6244F, -7.8412F, -0.0667F, 0.39F, -1.5811F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-21.4428F, -9.4881F, -1.0306F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.1509F, -10.9523F, -0.0669F, 0.4074F, -1.651F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(104, 28).mirror().addBox(-16.3439F, -2.1634F, -1.0306F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.1509F, -10.9523F, 0.1394F, 0.3896F, -1.1297F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(104, 25).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.6244F, -7.8412F, 0.1302F, 0.3744F, -1.0633F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(103, 86).mirror().addBox(-16.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.2244F, -3.6412F, 0.0921F, 0.3145F, -1.0238F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(32, 104).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -1.2244F, -3.6412F, 0.203F, 0.2388F, -0.6229F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(100, 116).mirror().addBox(-6.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2178F, -2.6244F, -7.8412F, 0.2614F, 0.2799F, -0.6603F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-5.7962F, -0.0145F, -0.9424F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -3.1509F, -10.9523F, 0.2758F, 0.2906F, -0.726F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(84, 66).addBox(13.4589F, -9.7617F, -1.1799F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.2244F, -3.6412F, -0.0689F, -0.3202F, 1.5295F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 86).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.2244F, -3.6412F, 0.0921F, -0.3145F, 1.0238F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(32, 104).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -1.2244F, -3.6412F, 0.203F, -0.2388F, 0.6229F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(100, 116).addBox(0.0185F, -0.1775F, -1.0885F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.6244F, -7.8412F, 0.2614F, -0.2799F, 0.6603F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(104, 25).addBox(5.4845F, -2.3986F, -1.1799F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.6244F, -7.8412F, 0.1302F, -0.3744F, 1.0633F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(30, 47).addBox(13.4589F, -9.7617F, -1.1799F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2178F, -2.6244F, -7.8412F, -0.0667F, -0.39F, 1.5811F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(82, 73).addBox(13.4428F, -9.4881F, -1.0306F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.1509F, -10.9523F, -0.0669F, -0.4074F, 1.651F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(97, 142).addBox(-0.5F, -2.8F, 10.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(17, 13).addBox(-0.5F, -2.5F, 7.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(48, 69).addBox(-0.5F, -2.1F, 4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(110, 139).addBox(0.0F, -2.1F, 0.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8833F, -12.1606F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(104, 28).addBox(5.3439F, -2.1634F, -1.0306F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.1509F, -10.9523F, 0.1394F, -0.3896F, 1.1297F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 0).addBox(-0.2038F, -0.0145F, -0.9424F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -3.1509F, -10.9523F, 0.2758F, -0.2906F, 0.726F));

		PartDefinition leftArm = chest.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(8.75F, 18.2208F, -6.24F, 0.48F, 0.0F, 0.0F));

		PartDefinition leftArm3 = leftArm.addOrReplaceChild("leftArm3", CubeListBuilder.create().texOffs(125, 59).addBox(-1.5F, -4.0253F, -11.3823F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 1.748F, -0.353F, 2.0809F, -0.0304F, 0.0123F));

		PartDefinition cube_r143 = leftArm3.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, 1.4F, -0.5F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -3.2253F, -1.7823F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r144 = leftArm3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 128).addBox(-0.5F, -3.2562F, 1.2019F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.036F, -3.3245F, -0.912F, 0.2224F, 0.2139F));

		PartDefinition cube_r145 = leftArm3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(120, 4).addBox(-0.5F, -2.1F, -3.5F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(2.1701F, -0.0341F, -2.5133F, -0.0219F, 0.2224F, 0.2139F));

		PartDefinition cube_r146 = leftArm3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(92, 94).addBox(-2.0F, -1.5F, -4.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0253F, -6.7823F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create().texOffs(65, 90).addBox(-1.0F, -1.9708F, -9.2808F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(99, 106).addBox(-0.5F, -3.9708F, -9.2808F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.12F))
				.texOffs(128, 76).addBox(-1.2F, -3.9708F, -2.5808F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(-0.5F, -0.5276F, -11.5544F, -0.9163F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create().texOffs(25, 122).addBox(-3.1F, 1.5077F, -6.0806F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(88, 36).addBox(-2.5F, -0.4923F, -6.0806F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(99, 119).addBox(2.1F, 1.5077F, -6.0806F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.5961F, -9.1411F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r147 = leftArm5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(137, 125).addBox(-0.017F, -0.4889F, -0.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, 2.0077F, -5.0806F, 0.0F, 0.3491F, 0.0F));

		PartDefinition rightArm3 = leftArm.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(119, 124).addBox(-2.5F, -4.0253F, -11.3823F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.75F, 1.748F, -0.353F, 1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r148 = rightArm3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(105, 0).addBox(-3.0F, 1.4F, -0.5F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -3.2253F, -1.7823F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r149 = rightArm3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 127).addBox(-0.5F, -3.2562F, 1.2019F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -1.036F, -3.3245F, -0.912F, -0.2224F, -0.2139F));

		PartDefinition cube_r150 = rightArm3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -2.1F, -3.5F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-2.1701F, -0.0341F, -2.5133F, -0.0219F, -0.2224F, -0.2139F));

		PartDefinition cube_r151 = rightArm3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -1.5F, -4.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0253F, -6.7823F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create().texOffs(38, 88).addBox(-3.0F, -1.9708F, -9.2808F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(18, 104).addBox(-2.5F, -3.9708F, -9.2808F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.12F))
				.texOffs(49, 115).addBox(-2.8F, -3.9708F, -2.5808F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.5F, -0.5276F, -11.5544F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create().texOffs(52, 101).addBox(2.1F, 1.5077F, -6.0806F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-2.5F, -0.4923F, -6.0806F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(56, 117).addBox(-3.1F, 1.5077F, -6.0806F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.5961F, -9.1411F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r152 = rightArm5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(137, 77).addBox(-0.983F, -0.4889F, -0.8877F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 2.0077F, -5.0806F, 0.0F, -0.3491F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.1292F, -13.24F, -0.394F, -0.0806F, 0.0335F));

		PartDefinition cube_r153 = neck.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(14, 8).mirror().addBox(-17.2964F, -8.4456F, -1.3665F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 1.0708F, -2.0693F, -0.2852F, 0.8018F, -1.7001F));

		PartDefinition cube_r154 = neck.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-16.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 1.0708F, -2.0693F, 0.1308F, 0.8324F, -1.1367F));

		PartDefinition cube_r155 = neck.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-5.969F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5079F, 1.0708F, -2.0693F, 0.4892F, 0.6927F, -0.6249F));

		PartDefinition cube_r156 = neck.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(83, 94).addBox(-0.031F, -0.2356F, -1.2762F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 1.0708F, -2.0693F, 0.4892F, -0.6927F, 0.6249F));

		PartDefinition cube_r157 = neck.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 8).addBox(14.2964F, -8.4456F, -1.3665F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 1.0708F, -2.0693F, -0.2852F, -0.8018F, 1.7001F));

		PartDefinition cube_r158 = neck.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(69, 50).addBox(5.4134F, -2.4328F, -1.3665F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5079F, 1.0708F, -2.0693F, 0.1308F, -0.8324F, 1.1367F));

		PartDefinition cube_r159 = neck.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 0.1F, 0.0F, 3.0F, 3.0F, 23.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.354F, -22.7351F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r160 = neck.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 77).mirror().addBox(-1.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 3.311F, 1.57F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r161 = neck.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(135, 107).mirror().addBox(-0.5104F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4884F, -1.1464F, -4.2749F, 1.0015F, 0.3938F, 0.2837F));

		PartDefinition cube_r162 = neck.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(18, 150).mirror().addBox(-0.5F, -3.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.5966F, 3.5638F, -5.7812F, 1.4634F, -0.0568F, -0.0691F));

		PartDefinition cube_r163 = neck.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(151, 94).mirror().addBox(-0.4596F, -3.7771F, 0.751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9461F, 3.5204F, -4.0932F, 1.7823F, 0.0158F, -1.2345F));

		PartDefinition cube_r164 = neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(153, 48).mirror().addBox(-1.5F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8096F, 0.6364F, -8.1032F, 1.7643F, 0.1986F, -0.7132F));

		PartDefinition cube_r165 = neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(113, 39).mirror().addBox(-1.9356F, -5.9979F, 3.1912F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 3.311F, -2.93F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r166 = neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(68, 141).mirror().addBox(-1.9356F, -5.9979F, 3.1912F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0233F, 3.411F, -9.13F, 1.5965F, -0.0208F, 0.6119F));

		PartDefinition cube_r167 = neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(145, 151).mirror().addBox(-0.7582F, -6.1139F, 1.1523F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1663F, 2.9695F, -8.9611F, 1.7386F, -0.347F, -0.8042F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(153, 0).mirror().addBox(-1.235F, -6.0522F, 0.5946F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.1663F, 2.9695F, -8.9611F, 1.7679F, -0.0254F, -1.2344F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(140, 151).mirror().addBox(-0.5098F, -0.4531F, -0.5906F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.7802F, 4.0784F, -7.8035F, 1.5157F, -0.0525F, -0.0725F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(108, 129).mirror().addBox(-0.5164F, -10.2075F, -0.5911F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.7802F, 4.0784F, -8.3035F, 1.568F, -0.0525F, -0.0725F));

		PartDefinition cube_r171 = neck.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(60, 148).mirror().addBox(-0.5164F, -8.0207F, -0.6392F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(133, 154).mirror().addBox(-0.5164F, -8.0207F, -1.0392F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.7802F, 4.0784F, -8.3035F, 1.4546F, -0.0525F, -0.0725F));

		PartDefinition cube_r172 = neck.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(136, 88).mirror().addBox(-0.7F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.901F, 2.9862F, -7.2264F, 1.7577F, 0.0679F, -1.7055F));

		PartDefinition cube_r173 = neck.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(136, 109).mirror().addBox(-0.3F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7087F, 3.9467F, -14.2705F, 1.7474F, 0.0916F, -1.8346F));

		PartDefinition cube_r174 = neck.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(137, 0).mirror().addBox(-0.3F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.124F, 4.0815F, -21.1028F, 1.7741F, -0.0183F, -1.7908F));

		PartDefinition cube_r175 = neck.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(150, 35).mirror().addBox(-0.4836F, 0.7962F, -0.5892F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8453F, 4.1743F, -13.69F, 1.5506F, -0.0538F, -0.0715F));

		PartDefinition cube_r176 = neck.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(19, 127).mirror().addBox(-0.5164F, -11.4575F, -0.5911F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.8453F, 4.1743F, -13.69F, 1.5506F, -0.0538F, -0.0715F));

		PartDefinition cube_r177 = neck.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(154, 150).mirror().addBox(-0.5164F, -9.2626F, -1.1807F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(109, 148).mirror().addBox(-0.5164F, -9.2626F, -0.7807F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.8453F, 4.1743F, -13.69F, 1.4371F, -0.0538F, -0.0715F));

		PartDefinition cube_r178 = neck.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(153, 19).mirror().addBox(-1.8736F, -7.8936F, 0.6454F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 3.3018F, -13.6692F, 1.7332F, -0.1242F, -1.2318F));

		PartDefinition cube_r179 = neck.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(153, 4).mirror().addBox(-1.7653F, -7.7634F, 0.8947F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 3.3018F, -13.6692F, 1.6591F, -0.4213F, -0.7744F));

		PartDefinition cube_r180 = neck.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(12, 142).mirror().addBox(-1.5223F, -5.8779F, 2.7734F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, 3.2314F, -15.6491F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r181 = neck.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(135, 107).addBox(-0.4896F, -1.5997F, -0.2872F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4884F, -1.1464F, -4.2749F, 1.0015F, -0.3938F, -0.2837F));

		PartDefinition cube_r182 = neck.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 77).addBox(0.9356F, -5.6979F, 3.1912F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.311F, 1.57F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r183 = neck.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(61, 139).addBox(-2.0233F, -8.5848F, -5.4601F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.311F, 1.57F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r184 = neck.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0233F, -7.5848F, -5.2601F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.311F, -2.93F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r185 = neck.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(113, 39).addBox(0.9356F, -5.9979F, 3.1912F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.311F, -2.93F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r186 = neck.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(18, 150).addBox(-0.5F, -3.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.5966F, 3.5638F, -5.7812F, 1.4634F, 0.0568F, 0.0691F));

		PartDefinition cube_r187 = neck.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(136, 88).addBox(-0.3F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.901F, 2.9862F, -7.2264F, 1.7577F, -0.0679F, 1.7055F));

		PartDefinition cube_r188 = neck.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(151, 94).addBox(-2.5404F, -3.7771F, 0.751F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9461F, 3.5204F, -4.0932F, 1.7823F, -0.0158F, 1.2345F));

		PartDefinition cube_r189 = neck.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(153, 48).addBox(-1.5F, -0.2F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8096F, 0.6364F, -8.1032F, 1.7643F, -0.1986F, 0.7132F));

		PartDefinition cube_r190 = neck.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(140, 151).addBox(-0.4902F, -0.4531F, -0.5906F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.7802F, 4.0784F, -7.8035F, 1.5157F, 0.0525F, 0.0725F));

		PartDefinition cube_r191 = neck.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0233F, -7.1848F, -4.4601F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.411F, -9.13F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(68, 141).addBox(0.9356F, -5.9979F, 3.1912F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0233F, 3.411F, -9.13F, 1.5965F, 0.0208F, -0.6119F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(145, 151).addBox(-2.2418F, -6.1139F, 1.1523F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1663F, 2.9695F, -8.9611F, 1.7386F, 0.347F, 0.8042F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(136, 109).addBox(-0.7F, -0.5F, -2.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7087F, 3.9467F, -14.2705F, 1.7474F, -0.0916F, 1.8346F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(153, 0).addBox(-1.765F, -6.0522F, 0.5946F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.1663F, 2.9695F, -8.9611F, 1.7679F, 0.0254F, 1.2344F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 148).addBox(-0.4836F, -8.0207F, -0.6392F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(133, 154).addBox(-0.4836F, -8.0207F, -1.0392F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.7802F, 4.0784F, -8.3035F, 1.4546F, 0.0525F, 0.0725F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(108, 129).addBox(-0.4836F, -10.2075F, -0.5911F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.7802F, 4.0784F, -8.3035F, 1.568F, 0.0525F, 0.0725F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(150, 35).addBox(-0.5164F, 0.7962F, -0.5892F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8453F, 4.1743F, -13.69F, 1.5506F, 0.0538F, 0.0715F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(154, 150).addBox(-0.4836F, -9.2626F, -1.1807F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(109, 148).addBox(-0.4836F, -9.2626F, -0.7807F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.8453F, 4.1743F, -13.69F, 1.4371F, 0.0538F, 0.0715F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(19, 127).addBox(-0.4836F, -11.4575F, -0.5911F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.8453F, 4.1743F, -13.69F, 1.5506F, 0.0538F, 0.0715F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(153, 4).addBox(-1.2347F, -7.7634F, 0.8947F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9642F, 3.3018F, -13.6692F, 1.6591F, 0.4213F, 0.7744F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(12, 142).addBox(0.5223F, -5.8779F, 2.7734F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 3.2314F, -15.6491F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(137, 0).addBox(-0.7F, -0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.124F, 4.0815F, -21.1028F, 1.7741F, 0.0183F, 1.7908F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(153, 19).addBox(-1.1264F, -7.8936F, 0.6454F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9642F, 3.3018F, -13.6692F, 1.7332F, 0.1242F, 1.2318F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(14, 29).addBox(-2.1212F, -6.6997F, -4.3715F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 3.2314F, -15.6491F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.654F, -22.4351F, 0.0312F, -0.1274F, -0.3069F));

		PartDefinition cube_r206 = neck2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.3F, 0.0F, 3.0F, 3.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7261F, -24.8296F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r207 = neck2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(136, 23).mirror().addBox(0.3F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.52F, 2.6163F, -23.83F, 1.8106F, -0.0902F, -1.9204F));

		PartDefinition cube_r208 = neck2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(133, 95).mirror().addBox(-0.1F, -0.5F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.322F, 2.5528F, -15.0095F, 1.8171F, -0.1338F, -1.8791F));

		PartDefinition cube_r209 = neck2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(158, 67).mirror().addBox(-0.0012F, -7.9243F, 3.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, 1.5513F, -0.7436F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r210 = neck2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(54, 137).mirror().addBox(-1.5223F, -6.8779F, 2.7734F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, 1.5513F, -0.7436F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r211 = neck2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(131, 119).mirror().addBox(-1.8211F, -5.3861F, -0.8344F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1212F, 1.5513F, -0.7436F, 1.8065F, -0.1005F, -1.8778F));

		PartDefinition cube_r212 = neck2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(150, 83).mirror().addBox(-1.7653F, -7.7634F, 0.8947F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 1.6218F, 1.2364F, 1.6591F, -0.4213F, -0.7744F));

		PartDefinition cube_r213 = neck2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(150, 122).mirror().addBox(-1.8736F, -7.8936F, 0.6454F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9642F, 1.6218F, 1.2364F, 1.7332F, -0.1242F, -1.2318F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(71, 127).mirror().addBox(-0.5128F, -0.5127F, -0.7042F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8929F, 2.3177F, 2.5171F, 1.6203F, -0.0486F, -0.0751F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 148).mirror().addBox(-0.5164F, -9.952F, -1.0048F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(150, 129).mirror().addBox(-0.5164F, -9.952F, -1.3048F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.8929F, 2.3177F, 1.9171F, 1.5069F, -0.0486F, -0.0751F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(93, 125).mirror().addBox(-0.5F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.5966F, 2.8129F, -3.7263F, 1.6203F, -0.0486F, -0.0751F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 125).mirror().addBox(-0.4836F, -0.0177F, -0.9756F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8929F, 2.6574F, -6.755F, 1.6204F, -0.0538F, -0.0715F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 126).mirror().addBox(-0.5164F, -12.1562F, -0.9334F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.8929F, 2.6574F, -6.755F, 1.5157F, -0.0538F, -0.0715F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(150, 143).mirror().addBox(-0.5164F, -9.952F, -1.3048F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(148, 0).mirror().addBox(-0.5164F, -9.952F, -1.0048F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.8929F, 2.6574F, -6.755F, 1.4371F, -0.0538F, -0.0715F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(151, 71).mirror().addBox(-1.7478F, -6.2695F, 1.3231F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.3116F, -8.9058F, 1.6853F, -0.2557F, -1.2227F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(151, 75).mirror().addBox(-1.5776F, -6.1415F, 1.5633F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.3116F, -8.9058F, 1.5444F, -0.5165F, -0.7224F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(106, 158).mirror().addBox(-0.5038F, -7.8982F, 4.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.3116F, -8.9058F, 1.5384F, 0.2373F, 0.6049F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(36, 138).mirror().addBox(-2.0073F, -6.7437F, 3.3685F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0659F, 2.3116F, -8.9058F, 1.5393F, 0.0193F, 0.6119F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(114, 124).mirror().addBox(-0.4836F, -0.5052F, -0.7796F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-4.0986F, 2.6722F, -15.2208F, 1.5581F, -0.037F, -0.0712F));

		PartDefinition cube_r225 = neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(158, 107).mirror().addBox(-0.6449F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.2F, -15.5581F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r226 = neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(138, 43).mirror().addBox(-2.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 2.2F, -15.5581F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r227 = neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(133, 45).mirror().addBox(1.0F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(114, 151).mirror().addBox(-1.6F, -1.1F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 0.8091F, -22.2379F, 1.6975F, -0.2229F, -1.2256F));

		PartDefinition cube_r228 = neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(92, 151).mirror().addBox(-0.4F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1919F, -1.034F, -22.5266F, 1.5741F, -0.4932F, -0.7368F));

		PartDefinition cube_r229 = neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(10, 151).mirror().addBox(-0.5164F, -10.4671F, -1.201F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(36, 148).mirror().addBox(-0.5164F, -10.4671F, -0.901F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-4.0986F, 2.6722F, -15.2208F, 1.4272F, -0.037F, -0.0712F));

		PartDefinition cube_r230 = neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(14, 127).mirror().addBox(-0.5164F, -12.6616F, -0.7895F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-4.0986F, 2.6722F, -15.2208F, 1.5057F, -0.037F, -0.0712F));

		PartDefinition cube_r231 = neck2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(131, 119).addBox(0.8211F, -5.3861F, -0.8344F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1212F, 1.5513F, -0.7436F, 1.8065F, 0.1005F, 1.8778F));

		PartDefinition cube_r232 = neck2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(71, 127).addBox(-0.4872F, -0.5127F, -0.7042F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8929F, 2.3177F, 2.5171F, 1.6203F, 0.0486F, 0.0751F));

		PartDefinition cube_r233 = neck2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(93, 125).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.5966F, 2.8129F, -3.7263F, 1.6203F, 0.0486F, 0.0751F));

		PartDefinition cube_r234 = neck2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 148).addBox(-0.4836F, -9.952F, -1.0048F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(150, 129).addBox(-0.4836F, -9.952F, -1.3048F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.8929F, 2.3177F, 1.9171F, 1.5069F, 0.0486F, 0.0751F));

		PartDefinition cube_r235 = neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(150, 83).addBox(-1.2347F, -7.7634F, 0.8947F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9642F, 1.6218F, 1.2364F, 1.6591F, 0.4213F, 0.7744F));

		PartDefinition cube_r236 = neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(150, 122).addBox(-1.1264F, -7.8936F, 0.6454F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9642F, 1.6218F, 1.2364F, 1.7332F, 0.1242F, 1.2318F));

		PartDefinition cube_r237 = neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(158, 67).addBox(-0.9988F, -7.9243F, 3.7734F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.5513F, -0.7436F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r238 = neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(54, 137).addBox(0.5223F, -6.8779F, 2.7734F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.5513F, -0.7436F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r239 = neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(57, 18).addBox(-2.1212F, -6.6997F, -4.3715F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1212F, 1.5513F, -0.7436F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r240 = neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(88, 125).addBox(-0.5164F, -0.0177F, -0.9756F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8929F, 2.6574F, -6.755F, 1.6204F, 0.0538F, 0.0715F));

		PartDefinition cube_r241 = neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(49, 126).addBox(-0.4836F, -12.1562F, -0.9334F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.8929F, 2.6574F, -6.755F, 1.5157F, 0.0538F, 0.0715F));

		PartDefinition cube_r242 = neck2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(148, 0).addBox(-0.4836F, -9.952F, -1.0048F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(150, 143).addBox(-0.4836F, -9.952F, -1.3048F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.8929F, 2.6574F, -6.755F, 1.4371F, 0.0538F, 0.0715F));

		PartDefinition cube_r243 = neck2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(133, 95).addBox(-0.9F, -0.5F, -2.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.322F, 2.5528F, -15.0095F, 1.8171F, 0.1338F, 1.8791F));

		PartDefinition cube_r244 = neck2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(151, 71).addBox(-1.2522F, -6.2695F, 1.3231F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0659F, 2.3116F, -8.9058F, 1.6853F, 0.2557F, 1.2227F));

		PartDefinition cube_r245 = neck2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(151, 75).addBox(-1.4224F, -6.1415F, 1.5633F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0659F, 2.3116F, -8.9058F, 1.5444F, 0.5165F, 0.7224F));

		PartDefinition cube_r246 = neck2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(60, 50).addBox(-2.0659F, -7.1571F, -5.2961F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0659F, 2.3116F, -8.9058F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r247 = neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(106, 158).addBox(-0.4962F, -7.8982F, 4.3685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0659F, 2.3116F, -8.9058F, 1.5384F, -0.2373F, -0.6049F));

		PartDefinition cube_r248 = neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(36, 138).addBox(1.0073F, -6.7437F, 3.3685F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0659F, 2.3116F, -8.9058F, 1.5393F, -0.0193F, -0.6119F));

		PartDefinition cube_r249 = neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(114, 124).addBox(-0.5164F, -0.5052F, -0.7796F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.0986F, 2.6722F, -15.2208F, 1.5581F, 0.037F, 0.0712F));

		PartDefinition cube_r250 = neck2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(10, 151).addBox(-0.4836F, -10.4671F, -1.201F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(36, 148).addBox(-0.4836F, -10.4671F, -0.901F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(4.0986F, 2.6722F, -15.2208F, 1.4272F, 0.037F, 0.0712F));

		PartDefinition cube_r251 = neck2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(14, 127).addBox(-0.4836F, -12.6616F, -0.7895F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(4.0986F, 2.6722F, -15.2208F, 1.5057F, 0.037F, 0.0712F));

		PartDefinition cube_r252 = neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(103, 41).addBox(-1.9383F, -7.8152F, -7.5111F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.2F, -15.5581F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r253 = neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(158, 107).addBox(-0.3551F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.2F, -15.5581F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r254 = neck2.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(138, 43).addBox(1.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 2.2F, -15.5581F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r255 = neck2.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(92, 151).addBox(-2.6F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1919F, -1.034F, -22.5266F, 1.5741F, 0.4932F, 0.7368F));

		PartDefinition cube_r256 = neck2.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(133, 45).addBox(-2.0F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(114, 151).addBox(-1.4F, -1.1F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6887F, 0.8091F, -22.2379F, 1.6975F, 0.2229F, 1.2256F));

		PartDefinition cube_r257 = neck2.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(136, 23).addBox(-1.3F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.52F, 2.6163F, -23.83F, 1.8106F, 0.0902F, 1.9204F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, -0.4F, -16.9F, 3.0F, 3.0F, 17.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.6261F, -24.8296F, -0.073F, -0.1809F, -0.073F));

		PartDefinition cube_r258 = neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(131, 10).mirror().addBox(-0.6168F, -7.9492F, -2.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 3.826F, -7.5285F, 1.6186F, -0.0371F, -1.8894F));

		PartDefinition cube_r259 = neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(131, 67).mirror().addBox(0.3F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.52F, 4.2423F, -7.5004F, 1.8106F, -0.0902F, -1.9204F));

		PartDefinition cube_r260 = neck3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(87, 146).mirror().addBox(0.0943F, -4.482F, -0.8736F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.9127F, 4.5931F, 2.6594F, 1.5026F, 0.0065F, -0.0711F));

		PartDefinition cube_r261 = neck3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(98, 129).mirror().addBox(0.0943F, 2.9072F, -0.9184F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.9127F, 4.5931F, 2.6594F, 1.5201F, 0.0065F, -0.0711F));

		PartDefinition cube_r262 = neck3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(150, 97).mirror().addBox(0.0615F, -11.6425F, -1.3921F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(50, 146).mirror().addBox(0.0615F, -11.6425F, -1.0921F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.9127F, 4.5931F, 2.6594F, 1.4241F, 0.0065F, -0.0711F));

		PartDefinition cube_r263 = neck3.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(83, 135).mirror().addBox(0.0615F, -13.8483F, -0.8878F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.9127F, 4.5931F, 2.6594F, 1.5026F, 0.0065F, -0.0711F));

		PartDefinition cube_r264 = neck3.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(83, 127).mirror().addBox(1.0F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(150, 15).mirror().addBox(-1.3F, -1.1F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 2.4352F, -6.6083F, 1.6975F, -0.2229F, -1.2256F));

		PartDefinition cube_r265 = neck3.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(149, 107).mirror().addBox(-0.4F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1919F, 0.5921F, -6.8969F, 1.5741F, -0.4932F, -0.7368F));

		PartDefinition cube_r266 = neck3.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(61, 158).mirror().addBox(-0.6449F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 3.826F, 0.7715F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r267 = neck3.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(76, 135).mirror().addBox(-2.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 3.826F, 0.7715F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r268 = neck3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(66, 158).mirror().addBox(-0.6449F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 3.826F, -7.5285F, 1.5678F, 0.2174F, 0.6115F));

		PartDefinition cube_r269 = neck3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(5, 136).mirror().addBox(-2.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9383F, 3.826F, -7.5285F, 1.5679F, -0.0008F, 0.6122F));

		PartDefinition cube_r270 = neck3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(103, 129).mirror().addBox(-0.4829F, 5.6224F, -0.6668F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 4.4952F, -8.1237F, 1.5319F, -0.0364F, -0.0715F));

		PartDefinition cube_r271 = neck3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(131, 27).mirror().addBox(-0.5171F, -11.854F, -2.9343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 4.4952F, -8.1237F, 1.2963F, -0.0364F, -0.0715F));

		PartDefinition cube_r272 = neck3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(55, 147).mirror().addBox(-0.4829F, -1.7716F, -0.5746F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 4.4952F, -8.1237F, 1.5144F, -0.0364F, -0.0715F));

		PartDefinition cube_r273 = neck3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(80, 147).mirror().addBox(-0.5157F, -8.9639F, -0.6814F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false)
				.texOffs(52, 101).mirror().addBox(-0.5157F, -8.9639F, -1.0814F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 4.4952F, -8.1237F, 1.4359F, -0.0364F, -0.0715F));

		PartDefinition cube_r274 = neck3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(0, 136).mirror().addBox(-0.5157F, -11.1379F, -0.5888F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.8355F, 4.4952F, -8.1237F, 1.5144F, -0.0364F, -0.0715F));

		PartDefinition cube_r275 = neck3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(143, 53).mirror().addBox(-2.0F, -1.1F, -0.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6887F, 2.4352F, -14.9083F, 1.6975F, -0.2229F, -1.2256F));

		PartDefinition cube_r276 = neck3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(150, 44).mirror().addBox(-0.4F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1919F, 0.5921F, -15.1969F, 1.5741F, -0.4932F, -0.7368F));

		PartDefinition cube_r277 = neck3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(131, 10).addBox(-0.3832F, -7.9492F, -2.0052F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.9383F, 3.826F, -7.5285F, 1.6186F, 0.0371F, 1.8894F));

		PartDefinition cube_r278 = neck3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(42, 101).addBox(-1.9383F, -7.5152F, -7.5111F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, 0.7715F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r279 = neck3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(61, 158).addBox(-0.3551F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, 0.7715F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r280 = neck3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(76, 135).addBox(1.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, 0.7715F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r281 = neck3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(149, 107).addBox(-2.6F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1919F, 0.5921F, -6.8969F, 1.5741F, 0.4932F, 0.7368F));

		PartDefinition cube_r282 = neck3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(131, 67).addBox(-1.3F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.52F, 4.2423F, -7.5004F, 1.8106F, 0.0902F, 1.9204F));

		PartDefinition cube_r283 = neck3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(83, 127).addBox(-2.0F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(150, 15).addBox(-1.7F, -1.1F, -0.2F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6887F, 2.4352F, -6.6083F, 1.6975F, 0.2229F, 1.2256F));

		PartDefinition cube_r284 = neck3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(83, 135).addBox(-0.4843F, -11.1379F, -0.5888F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.8355F, 4.3952F, 0.1763F, 1.5057F, 0.037F, 0.0712F));

		PartDefinition cube_r285 = neck3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(150, 97).addBox(-0.4843F, -8.9639F, -0.8814F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.31F))
				.texOffs(50, 146).addBox(-0.4843F, -8.9639F, -0.5814F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.8355F, 4.3952F, 0.1763F, 1.4272F, 0.037F, 0.0712F));

		PartDefinition cube_r286 = neck3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(87, 146).addBox(-0.5171F, -1.7716F, -0.5746F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8355F, 4.3952F, 0.1763F, 1.5057F, 0.037F, 0.0712F));

		PartDefinition cube_r287 = neck3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(98, 129).addBox(-0.5171F, 5.6224F, -0.6668F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8355F, 4.3952F, 0.1763F, 1.5232F, 0.037F, 0.0712F));

		PartDefinition cube_r288 = neck3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(103, 129).addBox(-0.5171F, 5.6224F, -0.6668F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8355F, 4.4952F, -8.1237F, 1.5319F, 0.0364F, 0.0715F));

		PartDefinition cube_r289 = neck3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(55, 147).addBox(-0.5171F, -1.7716F, -0.5746F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8355F, 4.4952F, -8.1237F, 1.5144F, 0.0364F, 0.0715F));

		PartDefinition cube_r290 = neck3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(131, 27).addBox(-0.4829F, -11.854F, -2.9343F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.8355F, 4.4952F, -8.1237F, 1.2963F, 0.0364F, 0.0715F));

		PartDefinition cube_r291 = neck3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(0, 136).addBox(-0.4843F, -11.1379F, -0.5888F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.8355F, 4.4952F, -8.1237F, 1.5144F, 0.0364F, 0.0715F));

		PartDefinition cube_r292 = neck3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(52, 101).addBox(-0.4843F, -8.9639F, -1.0814F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 147).addBox(-0.4843F, -8.9639F, -0.6814F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.8355F, 4.4952F, -8.1237F, 1.4359F, 0.0364F, 0.0715F));

		PartDefinition cube_r293 = neck3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(150, 44).addBox(-2.6F, -0.4F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1919F, 0.5921F, -15.1969F, 1.5741F, 0.4932F, 0.7368F));

		PartDefinition cube_r294 = neck3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(143, 53).addBox(-2.0F, -1.1F, -0.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.6887F, 2.4352F, -14.9083F, 1.6975F, 0.2229F, 1.2256F));

		PartDefinition cube_r295 = neck3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(66, 158).addBox(-0.3551F, -9.3108F, 4.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, -7.5285F, 1.5678F, -0.2174F, -0.6115F));

		PartDefinition cube_r296 = neck3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(5, 136).addBox(1.4509F, -8.0922F, 3.7728F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, -7.5285F, 1.5679F, 0.0008F, -0.6122F));

		PartDefinition cube_r297 = neck3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(73, 116).addBox(-1.9383F, -7.5152F, -7.2111F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9383F, 3.826F, -7.5285F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -17.0F, 0.2793F, -0.1675F, -0.1402F));

		PartDefinition cube_r298 = neck4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(61, 53).addBox(-1.5F, 0.0F, -0.1F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4656F, -15.473F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r299 = neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(65, 130).mirror().addBox(-0.4886F, 11.9621F, -1.1198F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6544F, 2.7076F, -5.5077F, 1.3976F, 0.0067F, -0.0683F));

		PartDefinition cube_r300 = neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(148, 10).mirror().addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.8572F, 0.7705F, -14.6646F, 1.6622F, -0.2364F, -1.8087F));

		PartDefinition cube_r301 = neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(130, 128).mirror().addBox(-0.5F, 0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.2416F, 2.3858F, -6.8211F, 1.66F, -0.1614F, -1.8935F));

		PartDefinition cube_r302 = neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(143, 22).mirror().addBox(-3.292F, -7.8714F, 1.5185F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0511F, 3.7179F, -0.0197F, 1.4469F, -0.7083F, -0.6584F));

		PartDefinition cube_r303 = neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(119, 132).mirror().addBox(-2.0307F, -7.3368F, 2.1193F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3303F, 2.1799F, 0.0623F, 1.4606F, 0.0743F, 0.6082F));

		PartDefinition cube_r304 = neck4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 158).mirror().addBox(-0.3982F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3303F, 2.1799F, 0.0623F, 1.456F, 0.2911F, 0.5834F));

		PartDefinition cube_r305 = neck4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(157, 79).mirror().addBox(2.3921F, -5.375F, 0.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(155, 157).mirror().addBox(2.3921F, -4.975F, 0.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 53).mirror().addBox(2.9921F, -5.975F, 0.588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0511F, 3.7179F, -0.0197F, 1.6785F, 0.3532F, -1.5068F));

		PartDefinition cube_r306 = neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(121, 155).mirror().addBox(4.1424F, -5.975F, 1.405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(104, 45).mirror().addBox(3.2424F, -5.975F, 1.405F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.0511F, 3.7179F, -0.0197F, 1.7545F, 0.3214F, -1.278F));

		PartDefinition cube_r307 = neck4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(11, 56).mirror().addBox(-0.5214F, -2.6099F, -0.9247F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 145).mirror().addBox(-0.5214F, -2.6099F, -0.5247F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.6544F, 2.7076F, -5.5077F, 1.3016F, 0.0067F, -0.0683F));

		PartDefinition cube_r308 = neck4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(124, 145).mirror().addBox(-0.5F, -0.3022F, -0.5266F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.2033F, 4.2498F, -1.3525F, 1.4F, -0.0281F, -0.0684F));

		PartDefinition cube_r309 = neck4.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(145, 41).mirror().addBox(-0.4886F, 4.575F, -0.917F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6544F, 2.7076F, -5.5077F, 1.3802F, 0.0067F, -0.0683F));

		PartDefinition cube_r310 = neck4.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(145, 131).mirror().addBox(-0.5F, -7.6977F, -0.5379F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.2033F, 4.2498F, -1.3525F, 1.3826F, -0.0281F, -0.0684F));

		PartDefinition cube_r311 = neck4.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(31, 131).mirror().addBox(-0.5214F, -4.7912F, -0.9312F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.6544F, 2.7076F, -5.5077F, 1.3802F, 0.0067F, -0.0683F));

		PartDefinition cube_r312 = neck4.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(69, 90).mirror().addBox(-0.5228F, -5.5837F, -1.8949F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-3.6544F, 2.7076F, -5.5077F, 1.162F, 0.0067F, -0.0683F));

		PartDefinition cube_r313 = neck4.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(118, 62).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9804F, 0.4145F, -17.9707F, 1.0947F, -0.0328F, -0.0662F));

		PartDefinition cube_r314 = neck4.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(126, 133).mirror().addBox(-0.5F, -4.9F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-3.0527F, 1.6718F, -13.2354F, 1.3129F, -0.0328F, -0.0662F));

		PartDefinition cube_r315 = neck4.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(88, 36).mirror().addBox(-0.5F, -2.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 146).mirror().addBox(-0.5F, -2.7F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)).mirror(false), PartPose.offsetAndRotation(-3.0813F, 1.2813F, -13.1538F, 1.2343F, -0.0328F, -0.0662F));

		PartDefinition cube_r316 = neck4.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(40, 158).mirror().addBox(-1.6251F, 0.1F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 119).mirror().addBox(-1.0251F, -0.9F, -0.3727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7329F, 0.1788F, -13.8849F, 1.6738F, 0.2836F, -1.5083F));

		PartDefinition cube_r317 = neck4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(155, 129).mirror().addBox(0.4284F, -0.9F, -0.4024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(32, 107).mirror().addBox(-0.4716F, -0.9F, -0.4024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.7329F, 0.1788F, -13.8849F, 1.7337F, 0.2545F, -1.284F));

		PartDefinition cube_r318 = neck4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(149, 67).mirror().addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1926F, -1.631F, -14.0184F, 1.3714F, -0.7497F, -0.6081F));

		PartDefinition cube_r319 = neck4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(14, 158).mirror().addBox(-0.3982F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3303F, 1.6799F, -7.5377F, 1.456F, 0.2911F, 0.5834F));

		PartDefinition cube_r320 = neck4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(131, 134).mirror().addBox(-2.0307F, -7.3368F, 2.1193F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3303F, 1.6799F, -7.5377F, 1.4606F, 0.0743F, 0.6082F));

		PartDefinition cube_r321 = neck4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(130, 128).addBox(-0.5F, 0.4F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.2416F, 2.3858F, -6.8211F, 1.66F, 0.1614F, 1.8935F));

		PartDefinition cube_r322 = neck4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(65, 130).addBox(-0.5171F, 5.8724F, -0.6668F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.9315F, 4.1972F, 0.4079F, 1.4024F, 0.0629F, 0.0685F));

		PartDefinition cube_r323 = neck4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(145, 41).addBox(-0.5171F, -1.5217F, -0.5702F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.9315F, 4.1972F, 0.4079F, 1.385F, 0.0629F, 0.0685F));

		PartDefinition cube_r324 = neck4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(69, 90).addBox(-0.4829F, -11.6109F, -2.8759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.9315F, 4.1972F, 0.4079F, 1.1668F, 0.0629F, 0.0685F));

		PartDefinition cube_r325 = neck4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(31, 131).addBox(-0.4843F, -10.8879F, -0.5844F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.9315F, 4.1972F, 0.4079F, 1.385F, 0.0629F, 0.0685F));

		PartDefinition cube_r326 = neck4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(11, 56).addBox(-0.4843F, -8.7151F, -1.0574F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 145).addBox(-0.4843F, -8.7151F, -0.6574F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.9315F, 4.1972F, 0.4079F, 1.3064F, 0.0629F, 0.0685F));

		PartDefinition cube_r327 = neck4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(157, 79).addBox(-3.3921F, -5.375F, 0.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(155, 157).addBox(-3.3921F, -4.975F, 0.588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 53).addBox(-3.9921F, -5.975F, 0.588F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0511F, 3.7179F, -0.0197F, 1.6785F, -0.3532F, 1.5068F));

		PartDefinition cube_r328 = neck4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(121, 155).addBox(-6.1424F, -5.975F, 1.405F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(104, 45).addBox(-5.2424F, -5.975F, 1.405F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0511F, 3.7179F, -0.0197F, 1.7545F, -0.3214F, 1.278F));

		PartDefinition cube_r329 = neck4.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(143, 22).addBox(-0.708F, -7.8714F, 1.5185F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0511F, 3.7179F, -0.0197F, 1.4469F, 0.7083F, 0.6584F));

		PartDefinition cube_r330 = neck4.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(41, 115).addBox(0.0F, -1.5F, -3.3F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4431F, -2.8286F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r331 = neck4.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(0, 158).addBox(-0.6018F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3303F, 2.1799F, 0.0623F, 1.456F, -0.2911F, -0.5834F));

		PartDefinition cube_r332 = neck4.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(119, 132).addBox(1.0307F, -7.3368F, 2.1193F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3303F, 2.1799F, 0.0623F, 1.4606F, -0.0743F, -0.6082F));

		PartDefinition cube_r333 = neck4.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(124, 145).addBox(-0.5F, -0.3022F, -0.5266F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.2033F, 4.2498F, -1.3525F, 1.4F, 0.0281F, 0.0684F));

		PartDefinition cube_r334 = neck4.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(145, 131).addBox(-0.5F, -7.6977F, -0.5379F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.2033F, 4.2498F, -1.3525F, 1.3826F, 0.0281F, 0.0684F));

		PartDefinition cube_r335 = neck4.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(88, 36).addBox(-0.5F, -2.7F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 146).addBox(-0.5F, -2.7F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(3.0813F, 1.2813F, -13.1538F, 1.2343F, 0.0328F, 0.0662F));

		PartDefinition cube_r336 = neck4.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(118, 62).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9804F, 0.4145F, -17.9707F, 1.0947F, 0.0328F, 0.0662F));

		PartDefinition cube_r337 = neck4.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(126, 133).addBox(-0.5F, -4.9F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(3.0527F, 1.6718F, -13.2354F, 1.3129F, 0.0328F, 0.0662F));

		PartDefinition cube_r338 = neck4.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(14, 158).addBox(-0.6018F, -8.4824F, 3.1193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3303F, 1.6799F, -7.5377F, 1.456F, -0.2911F, -0.5834F));

		PartDefinition cube_r339 = neck4.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(116, 62).addBox(0.0F, -1.5F, -3.3F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9431F, -10.4286F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r340 = neck4.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(131, 134).addBox(1.0307F, -7.3368F, 2.1193F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3303F, 1.6799F, -7.5377F, 1.4606F, -0.0743F, -0.6082F));

		PartDefinition cube_r341 = neck4.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(149, 67).addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1926F, -1.631F, -14.0184F, 1.3714F, 0.7497F, 0.6081F));

		PartDefinition cube_r342 = neck4.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(35, 158).addBox(0.6251F, -0.3F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(40, 158).addBox(0.6251F, 0.1F, -0.3727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 119).addBox(0.0251F, -0.9F, -0.3727F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7329F, 0.1788F, -13.8849F, 1.6738F, -0.2836F, 1.5083F));

		PartDefinition cube_r343 = neck4.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(155, 129).addBox(-2.4284F, -0.9F, -0.4024F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(32, 107).addBox(-1.5284F, -0.9F, -0.4024F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.7329F, 0.1788F, -13.8849F, 1.7337F, -0.2545F, 1.284F));

		PartDefinition cube_r344 = neck4.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(148, 10).addBox(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.8572F, 0.7705F, -14.6646F, 1.6622F, 0.2364F, 1.8087F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4656F, -15.373F, 0.1683F, -0.1721F, -0.0291F));

		PartDefinition cube_r345 = neck5.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(67, 31).addBox(-1.0F, 0.0F, -0.3F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1477F, -15.4585F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r346 = neck5.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(130, 144).mirror().addBox(-0.4713F, -0.1535F, -0.6171F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.636F, 4.4468F, 4.6427F, 1.2606F, -0.0373F, -0.0638F));

		PartDefinition cube_r347 = neck5.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(31, 143).mirror().addBox(-0.5F, -3.7438F, -0.3211F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5292F, 3.5024F, 0.9469F, 1.2432F, -0.0373F, -0.0638F));

		PartDefinition cube_r348 = neck5.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(147, 48).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.2572F, 0.341F, -7.2791F, 1.6708F, -0.2703F, -1.8108F));

		PartDefinition cube_r349 = neck5.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(23, 141).mirror().addBox(-0.5F, -4.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.4506F, 0.9201F, -6.2658F, 1.2955F, -0.0373F, -0.0638F));

		PartDefinition cube_r350 = neck5.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(56, 157).mirror().addBox(0.0512F, -7.7551F, 2.2429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, 1.3507F, -0.6503F, 1.4255F, 0.3102F, 0.5743F));

		PartDefinition cube_r351 = neck5.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(60, 47).mirror().addBox(-1.4346F, -6.7241F, 1.2429F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3132F, 1.3507F, -0.6503F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r352 = neck5.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(92, 97).mirror().addBox(-1.6242F, -0.9091F, -0.2881F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8391F, -0.7244F, -6.8856F, 1.4757F, -0.3177F, -1.1704F));

		PartDefinition cube_r353 = neck5.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(155, 41).mirror().addBox(-0.4939F, -0.4098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(155, 97).mirror().addBox(-0.4939F, -0.8098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8391F, -0.7244F, -6.8856F, 1.2456F, -0.4991F, -0.3971F));

		PartDefinition cube_r354 = neck5.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(70, 150).mirror().addBox(-0.5F, 3.8697F, -0.0479F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5268F, 1.3155F, -7.1875F, 1.2169F, -0.0345F, -0.0654F));

		PartDefinition cube_r355 = neck5.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(147, 89).mirror().addBox(-0.6696F, -7.1596F, -2.0511F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0149F, 0.8875F, -7.7408F, 1.6084F, -0.2854F, -1.5845F));

		PartDefinition cube_r356 = neck5.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(61, 103).mirror().addBox(-0.8143F, -7.1596F, 0.0731F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0149F, 0.8875F, -7.7408F, 1.4934F, -0.2774F, -1.1756F));

		PartDefinition cube_r357 = neck5.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(114, 155).mirror().addBox(-2.073F, -6.8861F, 0.301F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 100).mirror().addBox(-2.073F, -6.4861F, 0.301F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-2.0149F, 0.8875F, -7.7408F, 1.291F, -0.4818F, -0.4185F));

		PartDefinition cube_r358 = neck5.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(135, 144).mirror().addBox(-0.5F, -3.4944F, -0.3385F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5268F, 1.3155F, -7.1875F, 1.2867F, -0.0345F, -0.0654F));

		PartDefinition cube_r359 = neck5.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(149, 113).mirror().addBox(-0.5F, -9.8773F, -0.1725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5268F, 1.3155F, -7.1875F, 1.3391F, -0.0345F, -0.0654F));

		PartDefinition cube_r360 = neck5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(24, 131).mirror().addBox(-1.0401F, -3.9539F, 0.6097F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2658F, -0.7462F, -10.8572F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r361 = neck5.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(157, 64).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4854F, -3.4978F, -14.9068F, 1.4255F, 0.3102F, 0.5743F));

		PartDefinition cube_r362 = neck5.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(147, 48).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.2572F, 0.341F, -7.2791F, 1.6708F, 0.2703F, 1.8108F));

		PartDefinition cube_r363 = neck5.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(155, 41).addBox(-1.5061F, -0.4098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(155, 97).addBox(-1.5061F, -0.8098F, -0.3618F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8391F, -0.7244F, -6.8856F, 1.2456F, 0.4991F, 0.3971F));

		PartDefinition cube_r364 = neck5.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(113, 39).addBox(-1.3132F, -5.0701F, -5.9544F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3132F, 1.3507F, -0.6503F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r365 = neck5.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(60, 47).addBox(0.4346F, -6.7241F, 1.2429F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3132F, 1.3507F, -0.6503F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition cube_r366 = neck5.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(56, 157).addBox(-1.0512F, -7.7551F, 2.2429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3132F, 1.3507F, -0.6503F, 1.4255F, -0.3102F, -0.5743F));

		PartDefinition cube_r367 = neck5.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(92, 97).addBox(-0.3758F, -0.9091F, -0.2881F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8391F, -0.7244F, -6.8856F, 1.4757F, 0.3177F, 1.1704F));

		PartDefinition cube_r368 = neck5.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(23, 141).addBox(-0.5F, -4.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4506F, 0.9201F, -6.2658F, 1.2955F, 0.0373F, 0.0638F));

		PartDefinition cube_r369 = neck5.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(31, 143).addBox(-0.5F, -3.7438F, -0.3211F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5292F, 3.5024F, 0.9469F, 1.2432F, 0.0373F, 0.0638F));

		PartDefinition cube_r370 = neck5.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(130, 144).addBox(-0.5287F, -0.1535F, -0.6171F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.636F, 4.4468F, 4.6427F, 1.2606F, 0.0373F, 0.0638F));

		PartDefinition cube_r371 = neck5.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(70, 150).addBox(-0.5F, 3.8697F, -0.0479F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 1.3155F, -7.1875F, 1.2169F, 0.0345F, 0.0654F));

		PartDefinition cube_r372 = neck5.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(135, 144).addBox(-0.5F, -3.4944F, -0.3385F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 1.3155F, -7.1875F, 1.2867F, 0.0345F, 0.0654F));

		PartDefinition cube_r373 = neck5.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(149, 113).addBox(-0.5F, -9.8773F, -0.1725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 1.3155F, -7.1875F, 1.3391F, 0.0345F, 0.0654F));

		PartDefinition cube_r374 = neck5.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(147, 89).addBox(-0.3304F, -7.1596F, -2.0511F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0149F, 0.8875F, -7.7408F, 1.6084F, 0.2854F, 1.5845F));

		PartDefinition cube_r375 = neck5.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(61, 103).addBox(-1.1857F, -7.1596F, 0.0731F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0149F, 0.8875F, -7.7408F, 1.4934F, 0.2774F, 1.1756F));

		PartDefinition cube_r376 = neck5.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(155, 100).addBox(0.073F, -6.4861F, 0.301F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(114, 155).addBox(0.073F, -6.8861F, 0.301F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0149F, 0.8875F, -7.7408F, 1.291F, 0.4818F, 0.4185F));

		PartDefinition cube_r377 = neck5.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(157, 64).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4854F, -3.4978F, -14.9068F, 1.4255F, -0.3102F, -0.5743F));

		PartDefinition cube_r378 = neck5.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(24, 131).addBox(0.0401F, -3.9539F, 0.6097F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2658F, -0.7462F, -10.8572F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition cube_r379 = neck5.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(113, 113).addBox(0.0F, -1.2F, -3.5F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2231F, -10.5466F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1477F, -15.7585F, 0.1683F, -0.1721F, -0.0291F));

		PartDefinition cube_r380 = neck6.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(20, 88).addBox(-1.0F, -0.1F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7178F, -12.224F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r381 = neck6.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.7054F, 10.5237F, 0.3666F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2273F, 1.1131F, -4.661F, 1.1276F, -0.0052F, -0.0621F));

		PartDefinition cube_r382 = neck6.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(104, 142).mirror().addBox(-0.7054F, 3.1723F, -0.3892F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2273F, 1.1131F, -4.661F, 1.1974F, -0.0052F, -0.0621F));

		PartDefinition cube_r383 = neck6.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(157, 11).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4854F, -1.1679F, -5.2723F, 1.4255F, 0.3102F, 0.5743F));

		PartDefinition cube_r384 = neck6.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(154, 53).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4082F, -0.3085F, -4.3972F, 1.1806F, -0.5219F, -0.3654F));

		PartDefinition cube_r385 = neck6.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(128, 154).mirror().addBox(-1.0401F, -3.9539F, 1.6097F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2658F, 1.5837F, -1.2227F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r386 = neck6.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(155, 38).mirror().addBox(-0.5839F, -1.7394F, -0.8042F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.2748F, -9.7152F, 1.3136F, -0.0494F, -0.0547F));

		PartDefinition cube_r387 = neck6.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(156, 90).mirror().addBox(0.0333F, -4.5665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(150, 156).mirror().addBox(0.0333F, -3.9665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 156).mirror().addBox(-0.5667F, -3.9665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(156, 56).mirror().addBox(-0.5667F, -4.5665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1199F, 2.1055F, -1.3171F, 1.4502F, -0.3738F, -1.1617F));

		PartDefinition cube_r388 = neck6.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7326F, 1.2179F, -5.3377F, 1.61F, -0.3901F, -1.585F));

		PartDefinition cube_r389 = neck6.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(149, 26).mirror().addBox(-0.7054F, -3.2224F, -0.572F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2273F, 1.1131F, -4.661F, 1.2498F, -0.0052F, -0.0621F));

		PartDefinition cube_r390 = neck6.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(65, 150).mirror().addBox(-0.5F, -0.0503F, -0.4719F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.43F, 1.4842F, -6.0229F, 1.3664F, -0.0489F, -0.0691F));

		PartDefinition cube_r391 = neck6.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.6745F, -1.85F, 0.9576F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1855F, -0.3148F, -9.2182F, 1.4678F, 0.0693F, 0.6087F));

		PartDefinition cube_r392 = neck6.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(154, 104).mirror().addBox(0.195F, -1.7441F, 0.2847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.2748F, -9.7152F, 1.3439F, -0.1317F, -0.5173F));

		PartDefinition cube_r393 = neck6.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(41, 149).mirror().addBox(-0.5F, -6.4498F, -0.4766F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.43F, 1.4842F, -6.0229F, 1.3838F, -0.0489F, -0.0691F));

		PartDefinition cube_r394 = neck6.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(154, 119).mirror().addBox(-0.8552F, -1.9394F, -0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(154, 136).mirror().addBox(-0.8552F, -1.3394F, -0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7396F, 0.2748F, -9.7152F, 1.5038F, -0.2533F, -1.1783F));

		PartDefinition cube_r395 = neck6.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, 3.8697F, -0.0479F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 3.602F, 1.5201F, 1.1298F, 0.0401F, 0.0621F));

		PartDefinition cube_r396 = neck6.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(104, 142).addBox(-0.5F, -3.4944F, -0.3385F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 3.602F, 1.5201F, 1.1996F, 0.0401F, 0.0621F));

		PartDefinition cube_r397 = neck6.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(51, 156).addBox(-0.4333F, -3.9665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(156, 56).addBox(-0.4333F, -4.5665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(156, 90).addBox(-1.0333F, -4.5665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(150, 156).addBox(-1.0333F, -3.9665F, -0.1953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1199F, 2.1055F, -1.3171F, 1.4502F, 0.3738F, 1.1617F));

		PartDefinition cube_r398 = neck6.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(69, 53).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7326F, 1.2179F, -5.3377F, 1.61F, 0.3901F, 1.585F));

		PartDefinition cube_r399 = neck6.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(149, 26).addBox(-0.5F, -9.8773F, -0.1725F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5268F, 3.602F, 1.5201F, 1.252F, 0.0401F, 0.0621F));

		PartDefinition cube_r400 = neck6.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(154, 53).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4082F, -0.3085F, -4.3972F, 1.1806F, 0.5219F, 0.3654F));

		PartDefinition cube_r401 = neck6.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(14, 0).addBox(-1.2658F, -3.4963F, -3.5154F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2658F, 1.5837F, -1.2227F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r402 = neck6.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(157, 11).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4854F, -1.1679F, -5.2723F, 1.4255F, -0.3102F, -0.5743F));

		PartDefinition cube_r403 = neck6.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(128, 154).addBox(0.0401F, -3.9539F, 1.6097F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2658F, 1.5837F, -1.2227F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition cube_r404 = neck6.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(154, 104).addBox(-2.195F, -1.7441F, 0.2847F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7396F, 0.2748F, -9.7152F, 1.3439F, 0.1317F, 0.5173F));

		PartDefinition cube_r405 = neck6.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(0, 56).addBox(-0.3255F, -1.85F, 0.9576F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1855F, -0.3148F, -9.2182F, 1.4678F, -0.0693F, -0.6087F));

		PartDefinition cube_r406 = neck6.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(64, 78).addBox(-1.1855F, -2.6755F, -1.4405F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1855F, -0.3148F, -9.2182F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r407 = neck6.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(154, 119).addBox(-1.1448F, -1.9394F, -0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(154, 136).addBox(-1.1448F, -1.3394F, -0.1164F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7396F, 0.2748F, -9.7152F, 1.5038F, 0.2533F, 1.1783F));

		PartDefinition cube_r408 = neck6.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(65, 150).addBox(-0.5F, -0.0503F, -0.4719F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.43F, 1.4842F, -6.0229F, 1.3664F, 0.0489F, 0.0691F));

		PartDefinition cube_r409 = neck6.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(41, 149).addBox(-0.5F, -6.4498F, -0.4766F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.43F, 1.4842F, -6.0229F, 1.3838F, 0.0489F, 0.0691F));

		PartDefinition cube_r410 = neck6.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(155, 38).addBox(-1.4161F, -1.7394F, -0.8042F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.7396F, 0.2748F, -9.7152F, 1.3136F, 0.0494F, 0.0547F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1178F, -11.824F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition cube_r411 = neck7.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3092F, -9.0362F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r412 = neck7.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(81, 120).mirror().addBox(-0.5402F, -1.9745F, -0.8957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-1.7972F, 0.5638F, -2.3988F, 1.1827F, -0.0561F, -0.0478F));

		PartDefinition cube_r413 = neck7.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(92, 140).mirror().addBox(-0.5F, -2.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3086F, 0.6223F, -2.7543F, 1.2094F, -0.0602F, -0.0596F));

		PartDefinition cube_r414 = neck7.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(128, 119).mirror().addBox(-0.919F, -1.9745F, -0.1953F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7972F, 0.5638F, -2.3988F, 1.4502F, -0.3738F, -1.1617F));

		PartDefinition cube_r415 = neck7.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(24, 64).mirror().addBox(-0.7469F, -2.606F, 1.1579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2431F, 0.4226F, -1.3193F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r416 = neck7.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(0.1995F, -1.9771F, 0.1788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7972F, 0.5638F, -2.3988F, 1.228F, -0.1955F, -0.4984F));

		PartDefinition cube_r417 = neck7.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(153, 126).mirror().addBox(-0.6066F, -1.7413F, -0.293F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9957F, 0.0849F, -5.8694F, 1.5542F, -0.1321F, -1.188F));

		PartDefinition cube_r418 = neck7.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(154, 8).mirror().addBox(0.4996F, -1.7376F, 0.2973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9957F, 0.0849F, -5.8694F, 1.4578F, -0.0663F, -0.5286F));

		PartDefinition cube_r419 = neck7.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(116, 76).mirror().addBox(-0.772F, -1.6329F, 1.168F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2262F, -0.3175F, -6.5825F, 1.4318F, 0.0942F, 0.6058F));

		PartDefinition cube_r420 = neck7.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(95, 21).mirror().addBox(-0.5F, 0.1672F, -0.3477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.36F, 0.4723F, -5.1482F, 1.254F, -0.1179F, -0.0612F));

		PartDefinition cube_r421 = neck7.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(17, 41).mirror().addBox(-0.5F, -3.1759F, -0.4473F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.36F, 0.4723F, -5.1482F, 1.4285F, -0.1179F, -0.0612F));

		PartDefinition cube_r422 = neck7.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(153, 87).mirror().addBox(-0.3F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0003F, -0.513F, -7.0445F, 1.4444F, -0.0418F, -0.0607F));

		PartDefinition cube_r423 = neck7.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(81, 120).addBox(-1.4598F, -1.9745F, -0.8957F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(1.7972F, 0.5638F, -2.3988F, 1.1827F, 0.0561F, 0.0478F));

		PartDefinition cube_r424 = neck7.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(92, 140).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3086F, 0.6223F, -2.7543F, 1.2094F, 0.0602F, 0.0596F));

		PartDefinition cube_r425 = neck7.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(128, 119).addBox(-1.081F, -1.9745F, -0.1953F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7972F, 0.5638F, -2.3988F, 1.4502F, 0.3738F, 1.1617F));

		PartDefinition cube_r426 = neck7.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(113, 62).addBox(-1.2431F, -2.9087F, -2.1883F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2431F, 0.4226F, -1.3193F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r427 = neck7.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(24, 64).addBox(-0.2531F, -2.606F, 1.1579F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2431F, 0.4226F, -1.3193F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition cube_r428 = neck7.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(134, 125).addBox(-2.1995F, -1.9771F, 0.1788F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7972F, 0.5638F, -2.3988F, 1.228F, 0.1955F, 0.4984F));

		PartDefinition cube_r429 = neck7.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(95, 21).addBox(-0.5F, 0.1672F, -0.3477F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.36F, 0.4723F, -5.1482F, 1.254F, 0.1179F, 0.0612F));

		PartDefinition cube_r430 = neck7.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(17, 41).addBox(-0.5F, -3.1759F, -0.4473F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.36F, 0.4723F, -5.1482F, 1.4285F, 0.1179F, 0.0612F));

		PartDefinition cube_r431 = neck7.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(153, 87).addBox(-1.7F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0003F, -0.513F, -7.0445F, 1.4444F, 0.0418F, 0.0607F));

		PartDefinition cube_r432 = neck7.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(153, 126).addBox(-1.3934F, -1.7413F, -0.293F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9957F, 0.0849F, -5.8694F, 1.5542F, 0.1321F, 1.188F));

		PartDefinition cube_r433 = neck7.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(154, 8).addBox(-2.4996F, -1.7376F, 0.2973F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9957F, 0.0849F, -5.8694F, 1.4578F, 0.0663F, 0.5286F));

		PartDefinition cube_r434 = neck7.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(138, 53).addBox(0.0F, -1.3F, -2.3F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7577F, -5.2986F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r435 = neck7.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(116, 76).addBox(-0.228F, -1.6329F, 1.168F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2262F, -0.3175F, -6.5825F, 1.4318F, -0.0942F, -0.6058F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1592F, -8.7362F, 0.2212F, -0.2608F, -0.0233F));

		PartDefinition cube_r436 = neck8.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(14, 0).addBox(-1.2455F, -4.012F, -3.2812F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2455F, 1.758F, 1.38F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r437 = neck8.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(105, 39).mirror().addBox(-0.4F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-2.0003F, 0.5186F, -2.2489F, 1.6649F, -0.0164F, -0.19F));

		PartDefinition cube_r438 = neck8.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-0.5F, -0.0828F, -0.3477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.377F, 1.4865F, -0.1697F, 1.3398F, -0.0861F, -0.0688F));

		PartDefinition cube_r439 = neck8.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5F, -3.4221F, -0.4039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.377F, 1.4865F, -0.1697F, 1.5143F, -0.0861F, -0.0688F));

		PartDefinition cube_r440 = neck8.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(99, 110).mirror().addBox(0.3465F, -4.2046F, 0.1561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.015F, 1.6754F, 1.5759F, 1.6353F, 0.0705F, -1.1905F));

		PartDefinition cube_r441 = neck8.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(80, 21).mirror().addBox(1.0473F, -4.204F, 1.1891F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.015F, 1.6754F, 1.5759F, 1.646F, 0.0442F, -0.5307F));

		PartDefinition cube_r442 = neck8.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-1.5867F, -3.7861F, 2.3534F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2455F, 1.758F, 1.38F, 1.6824F, -0.0808F, 0.6075F));

		PartDefinition cube_r443 = neck8.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(20, 0).addBox(0.5867F, -3.7861F, 2.3534F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2455F, 1.758F, 1.38F, 1.6824F, 0.0808F, -0.6075F));

		PartDefinition cube_r444 = neck8.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(80, 21).addBox(-3.0473F, -4.204F, 1.1891F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.015F, 1.6754F, 1.5759F, 1.646F, -0.0442F, 0.5307F));

		PartDefinition cube_r445 = neck8.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(105, 39).addBox(-1.6F, -0.5F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(2.0003F, 0.5186F, -2.2489F, 1.6649F, 0.0164F, 0.19F));

		PartDefinition cube_r446 = neck8.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(99, 110).addBox(-2.3465F, -4.2046F, 0.1561F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.015F, 1.6754F, 1.5759F, 1.6353F, -0.0705F, 1.1905F));

		PartDefinition cube_r447 = neck8.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -3.4221F, -0.4039F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.377F, 1.4865F, -0.1697F, 1.5143F, 0.0861F, 0.0688F));

		PartDefinition cube_r448 = neck8.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(47, 56).addBox(-0.5F, -0.0828F, -0.3477F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.377F, 1.4865F, -0.1697F, 1.3398F, 0.0861F, 0.0688F));

		PartDefinition cube_r449 = neck8.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(123, 96).addBox(-1.0F, -0.9F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0128F, -2.0038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4084F, -3.8151F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r450 = head.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(73, 103).addBox(-2.0F, -0.5F, -0.6F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8678F, -2.5895F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r451 = head.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.1277F, -0.0973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.115F, -1.4472F, -1.6571F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r452 = head.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.115F, -1.2472F, -2.2821F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r453 = head.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.1168F, -0.1052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-2.115F, -1.4972F, -2.9321F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r454 = head.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.8982F, -0.0935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.115F, -0.7222F, -3.0321F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r455 = head.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(5, 156).mirror().addBox(-2.08F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-2.29F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(155, 145).addBox(1.29F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 156).addBox(1.08F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r456 = head.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.0801F, -0.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.115F, -0.3472F, -1.7071F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r457 = head.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.7869F, -0.8252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.215F, -0.0722F, -2.6321F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r458 = head.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, 0.1551F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, -0.2449F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, -0.4449F, 0.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, 0.1551F, 0.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 0.1528F, -2.3821F, -1.0777F, 0.0F, 0.0F));

		PartDefinition cube_r459 = head.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.7784F, -0.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 0.0778F, -3.4821F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r460 = head.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -1.425F, -0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, -0.825F, -0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 1.4778F, -2.1571F, 1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r461 = head.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.7801F, -0.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, -0.7801F, 0.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 1.5528F, -1.6071F, 1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r462 = head.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.1989F, -0.8079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 0.8278F, -1.2321F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r463 = head.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.2165F, -0.8049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 0.4528F, -1.1571F, -0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r464 = head.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.303F, -0.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.315F, 0.0278F, -1.2071F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r465 = head.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.8224F, -0.784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.215F, 0.7528F, -1.8071F, -0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r466 = head.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.94F, -1.0448F, -1.2771F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r467 = head.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.7156F, -0.6842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(155, 145).mirror().addBox(-0.5F, -1.1156F, -0.6842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.315F, 0.0528F, -1.2071F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r468 = head.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(155, 145).mirror().addBox(-0.5F, -0.672F, -0.3027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.315F, -0.0972F, -1.7071F, -1.0428F, 0.0F, 0.0F));

		PartDefinition cube_r469 = head.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.7869F, -0.8252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.215F, -0.0722F, -2.6321F, -0.4581F, 0.0F, 0.0F));

		PartDefinition cube_r470 = head.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.7784F, -0.1966F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.215F, 0.0778F, -3.4821F, -0.5803F, 0.0F, 0.0F));

		PartDefinition cube_r471 = head.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -1.1156F, -0.6842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(155, 145).addBox(-0.5F, -0.7156F, -0.6842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.315F, 0.0528F, -1.2071F, -0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r472 = head.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.303F, -0.6626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.315F, 0.0278F, -1.2071F, 0.048F, 0.0F, 0.0F));

		PartDefinition cube_r473 = head.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.672F, -0.3027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.315F, -0.0972F, -1.7071F, -1.0428F, 0.0F, 0.0F));

		PartDefinition cube_r474 = head.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -1.425F, -0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(155, 145).addBox(-0.5F, -0.825F, -0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.215F, 1.4778F, -2.1571F, 1.3046F, 0.0F, 0.0F));

		PartDefinition cube_r475 = head.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.7801F, 0.3652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 145).addBox(-0.5F, -0.7801F, -0.2348F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.215F, 1.5528F, -1.6071F, 1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r476 = head.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.1989F, -0.8079F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.215F, 0.8278F, -1.2321F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r477 = head.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.2165F, -0.8049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.215F, 0.4528F, -1.1571F, -0.2051F, 0.0F, 0.0F));

		PartDefinition cube_r478 = head.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.8224F, -0.784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.215F, 0.7528F, -1.8071F, -0.8247F, 0.0F, 0.0F));

		PartDefinition cube_r479 = head.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.4449F, 0.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(155, 145).addBox(-0.5F, 0.1551F, 0.0167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 145).addBox(-0.5F, 0.1551F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(155, 145).addBox(-0.5F, -0.2449F, -0.7833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.215F, 0.1528F, -2.3821F, -1.0777F, 0.0F, 0.0F));

		PartDefinition cube_r480 = head.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.1168F, -0.1052F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.115F, -1.4972F, -2.9321F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r481 = head.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.8982F, -0.0935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.115F, -0.7222F, -3.0321F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r482 = head.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.0801F, -0.9012F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.115F, -0.3472F, -1.7071F, -0.9119F, 0.0F, 0.0F));

		PartDefinition cube_r483 = head.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.94F, -1.0448F, -1.2771F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r484 = head.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.1277F, -0.0973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.115F, -1.4472F, -1.6571F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r485 = head.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(155, 145).addBox(-0.5F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.115F, -1.2472F, -2.2821F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r486 = head.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(63, 74).addBox(-1.5F, -0.525F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.2269F, -1.8795F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r487 = head.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(17, 94).addBox(-1.5F, -2.998F, 0.0065F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.6F, -3.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r488 = head.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(152, 61).addBox(-0.5F, -0.6F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.0216F, -0.7085F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r489 = head.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(67, 118).addBox(-1.5F, -0.032F, -0.9481F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.0F, 0.103F, -0.1561F, -0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r490 = head.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(67, 118).addBox(-1.5F, -0.0324F, -0.9743F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -0.897F, -0.1561F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r491 = head.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(70, 118).mirror().addBox(-2.5F, -0.0983F, -0.9885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(70, 118).addBox(0.5F, -0.0983F, -0.9885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.9434F, -0.8474F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r492 = head.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(67, 118).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, 1.1434F, -1.4474F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r493 = head.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(67, 118).addBox(-1.5F, -0.75F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -0.397F, -0.8561F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r494 = head.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(67, 118).addBox(-1.5F, -0.0445F, -0.0074F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.5921F, -1.3052F, -0.8465F, 0.0F, 0.0F));

		PartDefinition ForeHead = head.addOrReplaceChild("ForeHead", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r495 = ForeHead.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(92, 106).addBox(-2.5F, 0.075F, 0.3F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition ForeHead2 = ForeHead.addOrReplaceChild("ForeHead2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r496 = ForeHead2.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(145, 155).mirror().addBox(-0.3F, -0.1067F, -0.1873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.225F, -2.125F, 0.204F, -0.3424F, -0.0693F));

		PartDefinition cube_r497 = ForeHead2.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(43, 107).mirror().addBox(-0.2692F, -0.4968F, -0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.875F, 0.4978F, -1.6719F, -0.0138F, -0.3927F, 0.0025F));

		PartDefinition cube_r498 = ForeHead2.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(43, 107).mirror().addBox(-0.55F, -0.5157F, -0.1435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.775F, 0.4978F, -1.1719F, -0.1541F, -0.3476F, 0.0205F));

		PartDefinition cube_r499 = ForeHead2.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(150, 57).mirror().addBox(-0.6038F, 0.0384F, -2.4537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(149, 57).mirror().addBox(-0.6038F, 0.5384F, -2.4537F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(150, 57).mirror().addBox(-0.6038F, -0.4616F, -1.7537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5069F, 2.1232F, -1.7565F, 0.0103F, -0.1633F, 0.2651F));

		PartDefinition cube_r500 = ForeHead2.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(150, 57).mirror().addBox(-0.6323F, -0.4614F, -3.0934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(150, 57).mirror().addBox(-0.6323F, -0.9614F, -3.0934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5069F, 2.1232F, -1.7565F, 0.3501F, -0.1833F, 0.2282F));

		PartDefinition cube_r501 = ForeHead2.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(128, 107).mirror().addBox(-0.6351F, -0.407F, -1.5184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5069F, 2.1232F, -1.7565F, 0.5534F, -0.2575F, 0.3477F));

		PartDefinition cube_r502 = ForeHead2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(131, 110).mirror().addBox(-0.6351F, 0.5878F, 1.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(-1.5069F, 2.1232F, -1.7565F, 1.1642F, -0.2575F, 0.3477F));

		PartDefinition cube_r503 = ForeHead2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(43, 107).addBox(-0.45F, -0.5157F, -0.1435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.225F, 0.4978F, -1.1719F, -0.1541F, 0.3476F, -0.0205F));

		PartDefinition cube_r504 = ForeHead2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(43, 107).addBox(-0.7308F, -0.4968F, -0.165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.125F, 0.4978F, -1.6719F, -0.0138F, 0.3927F, -0.0025F));

		PartDefinition cube_r505 = ForeHead2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(43, 107).addBox(-1.0F, -0.2426F, -0.7498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.225F, -1.15F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r506 = ForeHead2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(43, 107).addBox(-1.0F, -0.2429F, -0.7554F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.3F, -0.65F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r507 = ForeHead2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(42, 107).addBox(-2.0F, -0.2769F, -0.2467F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r508 = ForeHead2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(42, 107).addBox(-1.5F, -0.2769F, -0.7467F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r509 = ForeHead2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(149, 57).addBox(-1.3962F, 0.5384F, -2.4537F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(150, 57).addBox(-0.3962F, 0.0384F, -2.4537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(150, 57).addBox(-0.3962F, -0.4616F, -1.7537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5069F, 2.1232F, -1.7565F, 0.0103F, 0.1633F, -0.2651F));

		PartDefinition cube_r510 = ForeHead2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(150, 57).addBox(-0.3677F, -0.4614F, -3.0934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(150, 57).addBox(-0.3677F, -0.9614F, -3.0934F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5069F, 2.1232F, -1.7565F, 0.3501F, 0.1833F, -0.2282F));

		PartDefinition cube_r511 = ForeHead2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(131, 110).addBox(-0.3649F, 0.5878F, 1.2199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.5069F, 2.1232F, -1.7565F, 1.1642F, 0.2575F, -0.3477F));

		PartDefinition cube_r512 = ForeHead2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(128, 107).addBox(-0.3649F, -0.407F, -1.5184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5069F, 2.1232F, -1.7565F, 0.5534F, 0.2575F, -0.3477F));

		PartDefinition cube_r513 = ForeHead2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(145, 155).addBox(-1.0F, -0.2549F, -1.2433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(145, 155).addBox(-1.0F, -0.2549F, -0.7433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.325F, -2.125F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r514 = ForeHead2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(145, 155).addBox(-0.7F, -0.1067F, -0.1873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3F, 0.225F, -2.125F, 0.204F, 0.3424F, 0.0693F));

		PartDefinition cube_r515 = ForeHead2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(145, 155).addBox(-1.0F, -0.2521F, -0.7532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.225F, -1.625F, 0.192F, 0.0F, 0.0F));

		PartDefinition Snout = head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(56, 90).addBox(-2.0F, 1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r516 = Snout.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(88, 30).addBox(-1.5F, -0.55F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.935F, -1.2152F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Snout2 = Snout.addOrReplaceChild("Snout2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r517 = Snout2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(141, 61).addBox(-1.0F, -1.0214F, -0.0231F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -0.8F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r518 = Snout2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(141, 61).addBox(-1.0F, -0.5F, -0.525F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -1.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r519 = Snout2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(85, 61).addBox(-2.0F, -0.9415F, 0.0033F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.8F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r520 = Snout2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(84, 60).addBox(-2.0F, -1.075F, -0.45F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.3F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r521 = Snout2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(141, 95).addBox(-1.0F, -0.225F, -0.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -1.7736F, -0.9277F, 1.597F, 0.0F, 0.0F));

		PartDefinition cube_r522 = Snout2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(141, 95).addBox(-1.5F, -0.05F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.75F, -1.6F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Snout3 = Snout2.addOrReplaceChild("Snout3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.15F, -1.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r523 = Snout3.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(138, 29).addBox(-1.5F, -0.3F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.5628F, 2.7392F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r524 = Snout3.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(138, 29).addBox(-1.5F, -0.45F, -1.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.2564F, 1.4514F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r525 = Snout3.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(148, 139).addBox(-1.0F, -0.475F, -0.85F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5F, -0.3834F, -0.1999F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Nose = Snout2.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Nose2 = Nose.addOrReplaceChild("Nose2", CubeListBuilder.create().texOffs(149, 80).addBox(-1.0F, 1.067F, 0.7799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r526 = Nose2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(149, 80).addBox(-1.0F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.567F, 0.2799F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r527 = Nose2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(145, 125).addBox(-0.5F, -0.4F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5F, 1.2323F, 1.7381F, 0.2094F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(144, 109).addBox(0.4F, 0.0795F, -0.8073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(144, 109).mirror().addBox(-2.4F, 0.0795F, -0.8073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7F, -1.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r528 = jaw.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-1.4F, -0.2065F, -0.8028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(145, 110).addBox(1.4F, -0.2065F, -0.8028F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, -0.0705F, -1.1423F, 0.0916F, 0.0F, 0.0F));

		PartDefinition cube_r529 = jaw.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-1.4F, -0.2F, -0.79F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(145, 110).addBox(1.4F, -0.2F, -0.79F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.2795F, -0.0173F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r530 = jaw.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-1.4F, -0.1848F, -0.786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(145, 110).addBox(1.4F, -0.1848F, -0.786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0F, 0.0295F, -0.5673F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r531 = jaw.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(55, 16).mirror().addBox(0.1F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(55, 16).addBox(2.9F, -0.4F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-2.5F, 0.4795F, -0.3073F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r532 = jaw.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-1.4F, -0.2014F, -0.8008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(145, 110).mirror().addBox(-1.4F, 0.2736F, -0.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(145, 110).addBox(1.4F, 0.2736F, -0.7758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(145, 110).addBox(1.4F, -0.2014F, -0.8008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.0F, -0.0205F, -1.7423F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r533 = jaw.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(145, 110).mirror().addBox(-1.4F, -0.2096F, -0.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(145, 110).addBox(1.4F, -0.2096F, -0.7879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 0.1045F, -2.3423F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r534 = jaw.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(34, 123).mirror().addBox(0.1F, -0.7932F, -2.6782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0453F, -1.5083F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r535 = jaw.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(138, 101).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7048F, -4.2103F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r536 = jaw.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(138, 101).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.4F, 1.7048F, -4.2103F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r537 = jaw.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(34, 123).addBox(-1.1F, -0.7932F, -2.6782F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 1.0453F, -1.5083F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Jaw2 = jaw.addOrReplaceChild("Jaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1205F, -1.8173F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r538 = Jaw2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(16, 107).addBox(-0.5F, -0.575F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.4015F, -4.0658F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r539 = Jaw2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(82, 116).addBox(-1.0F, -0.6911F, -0.981F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.9349F, -2.2472F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r540 = Jaw2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(82, 116).addBox(-1.0F, -0.575F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7349F, -1.2472F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r541 = Jaw2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(137, 20).mirror().addBox(-0.9F, 0.2995F, -3.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.122F, -0.0558F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r542 = Jaw2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(20, 85).mirror().addBox(-0.9F, -0.3233F, -3.2548F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.422F, -0.0558F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r543 = Jaw2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(137, 20).addBox(-0.1F, 0.2995F, -3.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.122F, -0.0558F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r544 = Jaw2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(20, 85).addBox(-0.1F, -0.3233F, -3.2548F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 0.422F, -0.0558F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Jaw3 = Jaw2.addOrReplaceChild("Jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -3.95F));

		PartDefinition cube_r545 = Jaw3.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(64, 21).addBox(-2.0F, -0.4324F, -0.3327F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.2113F, 0.4903F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r546 = Jaw3.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(120, 3).mirror().addBox(-0.4F, -0.4824F, 0.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2113F, 0.4903F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r547 = Jaw3.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(56, 120).mirror().addBox(-0.4F, -0.2171F, -0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.0146F, 0.8843F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r548 = Jaw3.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(120, 3).addBox(-0.6F, -0.4824F, 0.1173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1F, 1.2113F, 0.4903F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r549 = Jaw3.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(56, 120).addBox(-0.6F, -0.2171F, -0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, 0.0146F, 0.8843F, 0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r550 = Jaw3.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(65, 96).addBox(-2.0F, -0.2153F, -0.1213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.5F, 0.9896F, -0.2157F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r551 = Jaw3.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(65, 96).addBox(-2.0F, -0.1995F, -0.9309F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(65, 96).addBox(-2.0F, -0.1995F, -0.6809F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.5F, 0.1646F, 0.3093F, 0.3229F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 167, 167);
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