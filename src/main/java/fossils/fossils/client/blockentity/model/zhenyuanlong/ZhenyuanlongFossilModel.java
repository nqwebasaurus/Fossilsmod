package fossils.fossils.client.blockentity.model.zhenyuanlong;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZhenyuanlongFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftLeg1;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftFoot;
	private final ModelPart leftSickleClaw;
	private final ModelPart leftToes;
	private final ModelPart rightLeg1;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightFoot;
	private final ModelPart rightSickleClaw;
	private final ModelPart rightToes;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftHand;
	private final ModelPart leftFinger;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightHand;
	private final ModelPart rightFinger;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public ZhenyuanlongFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftLeg1 = this.hips.getChild("leftLeg1");
		this.leftLeg2 = this.leftLeg1.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftFoot = this.leftLeg3.getChild("leftFoot");
		this.leftSickleClaw = this.leftFoot.getChild("leftSickleClaw");
		this.leftToes = this.leftFoot.getChild("leftToes");
		this.rightLeg1 = this.hips.getChild("rightLeg1");
		this.rightLeg2 = this.rightLeg1.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightFoot = this.rightLeg3.getChild("rightFoot");
		this.rightSickleClaw = this.rightFoot.getChild("rightSickleClaw");
		this.rightToes = this.rightFoot.getChild("rightToes");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftArm1 = this.chest.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftHand = this.leftArm2.getChild("leftHand");
		this.leftFinger = this.leftHand.getChild("leftFinger");
		this.rightArm1 = this.chest.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightHand = this.rightArm2.getChild("rightHand");
		this.rightFinger = this.rightHand.getChild("rightFinger");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 4.4F, -1.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.029F, -2.1101F, -0.1375F, 0.0242F, 0.1729F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.9927F, -3.4171F, -0.6619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(25, 64).mirror().addBox(-0.9927F, -3.4171F, -0.3619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.2094F, 0.0F, 0.1745F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(25, 67).mirror().addBox(-1.0882F, -3.4598F, -1.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 32).mirror().addBox(-1.0882F, -3.4598F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.384F, 0.2094F, 0.1745F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 21).mirror().addBox(-0.0975F, -0.5077F, -1.0698F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.4621F, 0.0473F, 0.0099F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 55).mirror().addBox(-0.0975F, 0.6675F, 1.632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.8643F, 0.0473F, 0.0099F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 52).mirror().addBox(-0.0975F, 2.0293F, 0.2996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.0179F, 0.0473F, 0.0099F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-1.0882F, -1.2029F, -2.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.7854F, 0.2094F, 0.1745F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(-1.0882F, -3.4338F, -0.6652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.0873F, 0.2094F, 0.1745F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 64).mirror().addBox(-0.9927F, -3.2951F, -1.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.6981F, 0.0F, 0.1745F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 42).mirror().addBox(-0.0975F, 2.4503F, -2.5239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.9944F, 0.0473F, 0.0099F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 56).mirror().addBox(-0.0975F, -0.4565F, -1.1043F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.3748F, 0.0473F, 0.0099F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 43).mirror().addBox(-0.3029F, -0.2006F, -0.3809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.0597F, 1.4798F, 1.5406F, 0.1044F, -0.129F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 24).mirror().addBox(-0.5838F, -1.7581F, 0.9128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.7694F, 0.4533F, -0.1405F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 59).mirror().addBox(-0.2297F, -2.4935F, -1.18F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.1728F, -0.0437F, -0.4057F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(-0.5295F, -2.2632F, -0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, 0.384F, 0.0F, -0.0873F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 52).mirror().addBox(-0.9927F, -2.9899F, -0.5884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6073F, 1.9597F, 0.5798F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(64, 35).addBox(0.0882F, -1.2029F, -2.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.7854F, -0.2094F, -0.1745F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 67).addBox(0.0882F, -3.4598F, -1.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 32).addBox(0.0882F, -3.4598F, -0.6404F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.384F, -0.2094F, -0.1745F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 64).addBox(0.0882F, -3.4338F, -0.6652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.0873F, -0.2094F, -0.1745F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 67).addBox(-0.0073F, -3.4171F, -0.6619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(25, 64).addBox(-0.0073F, -3.4171F, -0.3619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.2094F, 0.0F, -0.1745F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 64).addBox(-0.0073F, -3.2951F, -1.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.6981F, 0.0F, -0.1745F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(47, 55).addBox(-0.9025F, 0.6675F, 1.632F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.8643F, -0.0473F, -0.0099F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(7, 52).addBox(-0.9025F, 2.0293F, 0.2996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.0179F, -0.0473F, -0.0099F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 42).addBox(-0.9025F, 2.4503F, -2.5239F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.9944F, -0.0473F, -0.0099F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(56, 21).addBox(-0.9025F, -0.5077F, -1.0698F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.4621F, -0.0473F, -0.0099F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 56).addBox(-0.9025F, -0.4565F, -1.1043F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.3748F, -0.0473F, -0.0099F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 43).addBox(-0.6971F, -0.2006F, -0.3809F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6073F, 1.0597F, 1.4798F, 1.5406F, -0.1044F, 0.129F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(61, 24).addBox(-0.4162F, -1.7581F, 0.9128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.7694F, -0.4533F, 0.1405F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 59).addBox(-0.7703F, -2.4935F, -1.18F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.1728F, 0.0437F, 0.4057F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(49, 15).addBox(-0.4705F, -2.2632F, -0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, 0.384F, 0.0F, 0.0873F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(40, 48).addBox(0.0F, -0.457F, 0.0041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 1.65F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(11, 36).addBox(0.0F, -0.4F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.35F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(40, 52).addBox(-0.0073F, -2.9899F, -0.5884F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6073F, 1.9597F, 0.5798F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.2764F, -3.3378F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftLeg1 = hips.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(10, 64).addBox(-0.5F, -0.9948F, -0.6093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7106F, 0.5574F, 0.3799F, -1.2352F, 0.0F, 0.0F));

		PartDefinition cube_r34 = leftLeg1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(69, 13).addBox(-0.5F, 0.489F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 69).addBox(-0.5F, -0.011F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.6052F, -0.2638F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r35 = leftLeg1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(61, 54).addBox(-0.5F, -0.0186F, -0.0391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7052F, -0.8638F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r36 = leftLeg1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(59, 32).addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg1.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(15, 64).addBox(-0.9F, -0.0054F, -0.522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(15, 27).addBox(-0.9F, -0.0054F, -0.022F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.7732F, 0.8274F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r37 = leftLeg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.2633F, -0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 1.6045F, -0.0571F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r38 = leftLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 28).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 0.7829F, 0.2039F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(36, 41).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.4858F, 0.1648F, -0.9861F, 0.0F, 0.0F));

		PartDefinition leftFoot = leftLeg3.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2632F, -0.1378F, 0.8988F, 0.0F, 0.0F));

		PartDefinition leftSickleClaw = leftFoot.addOrReplaceChild("leftSickleClaw", CubeListBuilder.create().texOffs(38, 23).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7261F, -0.2841F, 0.1996F, -1.0048F, 0.2466F, 0.0F));

		PartDefinition cube_r39 = leftSickleClaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(43, 46).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leftToes = leftFoot.addOrReplaceChild("leftToes", CubeListBuilder.create().texOffs(36, 36).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 0.0174F, -2.4015F, -0.5149F, 0.0F, 0.0F));

		PartDefinition rightLeg1 = hips.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(64, 13).addBox(-0.5F, -0.9948F, -0.6093F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7027F, 0.3841F, 0.3557F, -0.2695F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(69, 35).addBox(-0.5F, 0.489F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 32).addBox(-0.5F, -0.011F, -0.0226F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.6052F, -0.2638F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5F, -0.0186F, -0.0391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7052F, -0.8638F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg1.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 37).addBox(-0.5F, 0.1552F, -0.8404F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6052F, 0.2362F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg1.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(40, 67).addBox(-0.1F, -0.0054F, -0.522F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(20, 31).addBox(-0.1F, -0.0054F, -0.022F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.7732F, 0.8274F, 1.9711F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(5, 38).addBox(-0.5F, -0.2633F, -0.2F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 1.6045F, -0.0571F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(38, 61).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 0.7829F, 0.2039F, -0.1222F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(44, 5).addBox(-1.0F, -0.2066F, -0.6088F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.4858F, 0.1648F, -0.9861F, 0.0F, 0.0F));

		PartDefinition rightFoot = rightLeg3.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(36, 31).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2632F, -0.1378F, 0.5934F, 0.0F, 0.0F));

		PartDefinition rightSickleClaw = rightFoot.addOrReplaceChild("rightSickleClaw", CubeListBuilder.create().texOffs(10, 39).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7261F, -0.2841F, 0.1996F, -0.743F, -0.2466F, 0.0F));

		PartDefinition cube_r45 = rightSickleClaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(47, 18).addBox(0.0F, -2.0F, -2.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition rightToes = rightFoot.addOrReplaceChild("rightToes", CubeListBuilder.create().texOffs(25, 37).addBox(-1.0F, -0.5F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 0.0174F, -2.4015F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 3.55F, 0.0536F, 0.2179F, 0.0116F));

		PartDefinition cube_r46 = tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(47, 52).addBox(0.0F, -0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 52).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 7).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2089F, -0.1695F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(11, 33).addBox(0.0F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 70).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9843F, 1.2442F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(21, 16).addBox(-0.5F, -0.1084F, -0.1257F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2204F, 4.7363F, 0.0289F, -0.4362F, -0.0122F));

		PartDefinition cube_r48 = tail2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(10, 56).addBox(0.0F, -0.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2047F, -3.4921F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -0.4395F, -0.0878F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3614F, 6.8539F, -0.009F, -0.2618F, 0.0023F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2209F, -0.0996F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2407F, 8.9832F, -0.064F, -0.3048F, 0.0192F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.75F, -1.25F, 0.1162F, 0.2167F, 0.0251F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 27).addBox(-1.5F, -1.5558F, 3.5327F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8296F, -4.9518F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(22, 25).addBox(-1.5F, -0.9268F, -0.1997F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.8296F, -4.9518F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(69, 61).addBox(0.0F, -0.3714F, 2.9735F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 31).addBox(-0.5F, -0.0714F, -0.0265F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -4.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(69, 58).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.37F, -2.5284F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.1653F, -0.0406F, -0.753F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 11).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -0.6422F, 0.1801F, -0.0259F, -1.1893F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-3.9063F, -0.4185F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.2759F, 0.1388F, -1.1635F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -2.6422F, 0.3215F, 0.0686F, -0.7304F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(60, 9).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.307F, 0.181F, -1.0526F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(44, 12).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.3671F, 0.094F, -0.6207F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(31, 14).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.074F, -4.6422F, 0.1902F, 0.3014F, -1.5317F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(27, 62).mirror().addBox(-4.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.1992F, 0.3706F, -1.5108F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.3474F, 0.2384F, -1.0262F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.326F, -6.4422F, 0.4274F, 0.1296F, -0.5961F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(69, 50).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.1653F, 0.0406F, 0.753F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 11).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -0.6422F, 0.1801F, 0.0259F, 1.1893F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(51, 10).addBox(0.9063F, -0.4185F, -0.4412F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.2759F, -0.1388F, 1.1635F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 6).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -2.6422F, 0.3215F, -0.0686F, 0.7304F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(60, 9).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.307F, -0.181F, 1.0526F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 12).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.3671F, -0.094F, 0.6207F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(31, 14).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.074F, -4.6422F, 0.1902F, -0.3014F, 1.5317F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 62).addBox(2.3847F, -1.7132F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.1992F, -0.3706F, 1.5108F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 62).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.3474F, -0.2384F, 1.0262F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(54, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.326F, -6.4422F, 0.4274F, -0.1296F, 0.5961F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(35, 62).addBox(0.0F, -0.25F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 56).addBox(0.0F, -0.35F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 18).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.05F, -7.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, -6.9F, 0.248F, 0.1693F, 0.0426F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(-3.0F, -0.2224F, -0.2207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(52, 34).addBox(2.0F, -0.2224F, -0.2207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0036F, 0.7039F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(25, 42).mirror().addBox(-3.0F, -0.2966F, -0.3234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)).mirror(false)
				.texOffs(25, 42).addBox(2.0F, -0.2966F, -0.3234F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F)), PartPose.offsetAndRotation(0.0F, 0.6036F, -1.7961F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(0.0064F, -0.0438F, -0.0038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 2.8115F, -1.9471F, 0.7834F, 0.0015F, 0.0376F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(0.0064F, 0.9506F, -0.241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 2.8115F, -1.9471F, 1.0277F, 0.0015F, 0.0376F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(54, 55).mirror().addBox(-0.5F, -0.2998F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.4473F, -1.7533F, 1.2954F, -0.4454F, -0.285F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(10, 44).mirror().addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.4473F, -1.7533F, 1.3221F, -0.6787F, -0.8905F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(62, 48).mirror().addBox(-1.3345F, 0.322F, -0.2904F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 3.8115F, 0.0529F, 0.1879F, 0.2729F, -0.2057F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(66, 56).mirror().addBox(-0.8485F, 0.4214F, -0.8429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2098F, 3.0115F, -0.4471F, 0.1506F, -0.0456F, 0.1955F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-3.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.1859F, 0.2843F, -1.5849F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(62, 46).mirror().addBox(-2.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.2952F, 0.1676F, -1.1066F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.024F, -1.5422F, 0.3509F, 0.0868F, -0.6742F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(64, 38).addBox(-1.0064F, -0.0438F, -0.0038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 2.8115F, -1.9471F, 0.7834F, -0.0015F, -0.0376F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(61, 20).addBox(-1.0064F, 0.9506F, -0.241F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 2.8115F, -1.9471F, 1.0277F, -0.0015F, -0.0376F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(54, 55).addBox(-0.5F, -0.2998F, -1.9997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.4473F, -1.7533F, 1.2954F, 0.4454F, 0.285F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 44).addBox(-0.5F, -0.8998F, -2.9997F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5F, 0.4473F, -1.7533F, 1.3221F, 0.6787F, 0.8905F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(32, 55).addBox(-0.5F, -0.5558F, -0.401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.682F, -2.6376F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(62, 48).addBox(-0.6655F, 0.322F, -0.2904F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 3.8115F, 0.0529F, 0.1879F, -0.2729F, 0.2057F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(66, 56).addBox(-0.1515F, 0.4214F, -0.8429F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2098F, 3.0115F, -0.4471F, 0.1506F, 0.0456F, -0.1955F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(64, 44).addBox(2.3847F, -1.7132F, -0.4412F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.1859F, -0.2843F, 1.5849F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(62, 46).addBox(0.9063F, -0.4185F, -0.4412F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.2952F, -0.1676F, 1.1066F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(56, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.024F, -1.5422F, 0.3509F, -0.0868F, 0.6742F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(70, 0).addBox(0.0F, -1.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(-0.5F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4339F, -3.9914F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftArm1 = chest.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(47, 34).addBox(-0.5059F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.9459F, 1.4123F, -1.218F, 0.2577F, -0.1029F, -0.2496F));

		PartDefinition cube_r96 = leftArm1.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 42).addBox(0.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0949F, 4.2889F, -0.4475F, -2.1799F, -0.2138F, 0.1529F));

		PartDefinition cube_r97 = leftArm2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(10, 59).addBox(-1.75F, 2.3964F, -0.7639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r98 = leftArm2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 59).addBox(-1.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2F, -1.05F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r99 = leftArm2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(21, 57).addBox(-0.5F, -4.6812F, -0.7872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.05F, 3.75F, -0.5F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r100 = leftArm2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 46).addBox(-0.5F, -2.6984F, -0.568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.05F, 3.75F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition leftHand = leftArm2.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(50, 46).addBox(-0.9629F, -0.1904F, -1.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 56).addBox(-0.9629F, 1.7596F, -1.1965F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(54, 59).addBox(-0.9629F, 1.7596F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2015F, 3.4724F, -0.2705F, 0.9406F, -0.0692F, 0.0532F));

		PartDefinition leftFinger = leftHand.addOrReplaceChild("leftFinger", CubeListBuilder.create().texOffs(28, 47).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightArm1 = chest.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(35, 48).addBox(-0.4941F, -0.5647F, -0.6475F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.9459F, 1.4123F, -1.218F, 0.4884F, -0.3187F, 0.1359F));

		PartDefinition cube_r101 = rightArm1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -1.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.5059F, 1.4353F, 0.3525F, -0.4712F, 0.0F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0949F, 4.2889F, -0.4475F, -1.6941F, 0.3947F, -0.0319F));

		PartDefinition cube_r102 = rightArm2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(59, 12).addBox(0.75F, 2.3964F, -0.7639F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r103 = rightArm2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(49, 59).addBox(0.75F, 0.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2F, -1.05F, 0.9F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r104 = rightArm2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 57).addBox(-0.5F, -4.6812F, -0.7872F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.05F, 3.75F, -0.5F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightArm2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(58, 4).addBox(-0.5F, -2.6984F, -0.568F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.05F, 3.75F, -0.5F, -0.096F, 0.0F, 0.0F));

		PartDefinition rightHand = rightArm2.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(51, 5).addBox(-0.0371F, -0.1904F, -1.1965F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(5, 56).addBox(-0.0371F, 1.7596F, -1.1965F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(59, 59).addBox(-0.0371F, 1.7596F, -0.1965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.2015F, 3.4724F, -0.2705F, 0.9406F, 0.0692F, -0.0532F));

		PartDefinition rightFinger = rightHand.addOrReplaceChild("rightFinger", CubeListBuilder.create().texOffs(47, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-0.0371F, 0.5313F, -0.6988F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2661F, -1.9914F, -0.3668F, 0.5839F, -0.185F));

		PartDefinition cube_r106 = neck1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(15, 70).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.345F, -1.3272F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(25, 53).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.4208F, -2.9F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0527F, -1.6216F, -0.5376F, 0.4678F, 0.1602F));

		PartDefinition cube_r108 = neck2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(43, 70).addBox(0.0F, -0.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 41).addBox(-0.5F, -0.1F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.805F, -4.8573F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2621F, -2.6962F, 0.2711F, 0.3038F, 0.1747F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 70).addBox(0.0F, -0.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 70).addBox(0.0F, -0.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 0).addBox(-0.5F, -0.1F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1899F, -2.4109F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-0.5F, -0.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(0, 66).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(67, 8).addBox(1.5F, -0.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 66).addBox(1.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 0.1657F, 0.6601F, -1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r111 = head.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(35, 65).addBox(1.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.0F, 0.6686F, -0.2548F, -1.6493F, 0.0F, 0.0F));

		PartDefinition cube_r112 = head.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(69, 38).mirror().addBox(-0.5F, -2.0F, 3.3326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false)
				.texOffs(69, 38).addBox(1.34F, -2.0F, 3.3326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.92F, -4.979F, -0.1125F, -1.9897F, 0.0F, 0.0F));

		PartDefinition cube_r113 = head.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5978F, 1.1689F, -4.5803F, -0.0243F, -0.1338F, -0.0189F));

		PartDefinition cube_r114 = head.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(0.2602F, -0.9372F, -0.0338F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.01F, 1.617F, -4.0048F, 0.2514F, -0.0266F, 0.0194F));

		PartDefinition cube_r115 = head.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(24, 70).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4721F, 0.9116F, -5.6471F, 0.0632F, -0.0291F, -0.0214F));

		PartDefinition cube_r116 = head.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(66, 29).mirror().addBox(-1.2F, -0.9367F, -0.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1505F, -2.0216F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-0.2487F, -1.169F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9013F, 1.3406F, -2.6786F, 0.1277F, -0.1406F, 0.0161F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-0.3265F, -0.8853F, -2.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9013F, 1.3406F, -2.6786F, -0.1278F, -0.2588F, 0.0309F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(66, 20).mirror().addBox(-0.335F, -1.0251F, -1.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9013F, 1.3406F, -2.6786F, -0.0436F, -0.2618F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.2674F, -2.1371F, -0.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6361F, -0.3476F, -3.5967F, -1.1797F, -0.321F, -0.0556F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 59).mirror().addBox(-0.6F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3031F, -0.8835F, -1.6071F, -1.397F, -0.8242F, -0.0436F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-0.5F, -0.8424F, -0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(53, 64).addBox(1.94F, -0.8424F, -0.186F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.22F, 0.1123F, -0.6192F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(-1.32F, -0.1F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 64).addBox(1.12F, -0.1F, -0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 0.0052F, -0.5927F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-1.42F, -0.2005F, -0.7807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.5133F, -1.17F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-1.42F, -0.1925F, -0.8494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 64).addBox(1.02F, -0.1925F, -0.8494F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, 0.2133F, -0.67F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-1.42F, -0.1654F, -0.8017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)).mirror(false)
				.texOffs(65, 0).addBox(1.02F, -0.1654F, -0.8017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.201F)), PartPose.offsetAndRotation(-0.3F, -0.4867F, -0.57F, -0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-1.22F, 0.0015F, -1.0275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 41).addBox(0.82F, 0.0015F, -1.0275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3F, -0.9867F, -0.97F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(43, 64).mirror().addBox(-1.34F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(48, 64).mirror().addBox(-1.52F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(48, 64).addBox(1.12F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(43, 64).addBox(0.94F, -0.8F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 0.0133F, -1.57F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(64, 58).mirror().addBox(-1.43F, -1.0162F, 0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(64, 58).addBox(0.83F, -1.0162F, 0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.2F, 0.9133F, -2.07F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-1.43F, -0.1435F, -0.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(64, 50).addBox(0.83F, -0.1435F, -0.1233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2F, -0.7867F, -1.97F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(69, 41).mirror().addBox(-0.1056F, -0.14F, -0.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)).mirror(false), PartPose.offsetAndRotation(-1.1998F, 0.1267F, -2.2909F, -1.1595F, -0.1386F, 0.0527F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-0.1056F, -0.1155F, -0.1686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-1.1998F, 0.1267F, -2.2909F, -1.5783F, -0.1386F, 0.0527F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(69, 44).mirror().addBox(-0.1056F, 0.0025F, -1.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)).mirror(false), PartPose.offsetAndRotation(-1.1998F, 0.1267F, -2.2909F, -0.5137F, -0.1386F, 0.0527F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 67).mirror().addBox(-0.3F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(50, 67).mirror().addBox(-0.3F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5532F, 0.3805F, -5.6196F, 0.4245F, -0.0817F, 0.0305F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-0.4437F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5263F, 0.4497F, -4.7494F, 1.3599F, -0.2671F, -0.0006F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(55, 67).mirror().addBox(-0.3449F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4651F, 0.1709F, -4.1676F, 1.3503F, 0.0034F, 0.0114F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.4575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9225F, 0.8743F, -3.748F, 1.3836F, -0.2478F, -0.0035F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 23).addBox(-0.6735F, -0.8853F, -2.7488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9013F, 1.3406F, -2.6786F, -0.1278F, 0.2588F, -0.0309F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(66, 20).addBox(-0.665F, -1.0251F, -1.7394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9013F, 1.3406F, -2.6786F, -0.0436F, 0.2618F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(66, 17).addBox(-0.7513F, -1.169F, -0.8643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9013F, 1.3406F, -2.6786F, 0.1277F, 0.1406F, -0.0161F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(31, 59).addBox(-1.4F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3031F, -0.8835F, -1.6071F, -1.397F, 0.8242F, 0.0436F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(0, 62).addBox(-0.7326F, -2.1371F, -0.348F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6361F, -0.3476F, -3.5967F, -1.1797F, 0.321F, 0.0556F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(63, 4).addBox(-0.5F, -1.9787F, 0.0101F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1668F, -5.4623F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(38, 14).addBox(-1.5F, -0.9777F, 0.0327F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.0668F, -1.9623F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(47, 24).addBox(-1.0F, -0.1117F, -0.0333F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9668F, -2.0623F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(59, 17).addBox(-1.0F, -0.0356F, -0.0565F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7668F, -2.7623F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(66, 53).addBox(-0.5F, -0.8865F, -0.1036F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.264F, -6.0578F, -1.1083F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(54, 15).addBox(-0.5F, -5.0723F, -0.0174F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.064F, -6.6578F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 66).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.6632F, -5.7088F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(27, 70).addBox(-0.2602F, -0.9372F, -0.0338F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 1.617F, -4.0048F, 0.2514F, 0.0266F, -0.0194F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(24, 70).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4721F, 0.9116F, -5.6471F, 0.0632F, 0.0291F, 0.0214F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(21, 70).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5978F, 1.1689F, -4.5803F, -0.0243F, 0.1338F, 0.0189F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(19, 47).addBox(-1.0F, 0.0815F, -0.2295F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -1.4F, -0.35F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(49, 12).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.8059F, -0.8246F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(9, 49).addBox(-1.0F, -1.9912F, 0.0353F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1F, -1.05F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(64, 61).addBox(0.42F, -0.2005F, -0.7807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.3F, 0.5133F, -1.17F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 67).addBox(-0.5425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9225F, 0.8743F, -3.748F, 1.3836F, 0.2478F, 0.0035F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5563F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5263F, 0.4497F, -4.7494F, 1.3599F, 0.2671F, 0.0006F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(55, 67).addBox(-0.6551F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4651F, 0.1709F, -4.1676F, 1.3503F, -0.0034F, -0.0114F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 67).addBox(-0.7F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 67).addBox(-0.7F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5532F, 0.3805F, -5.6196F, 0.4245F, 0.0817F, -0.0305F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(69, 47).addBox(-0.8944F, -0.1155F, -0.1686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(1.1998F, 0.1267F, -2.2909F, -1.5783F, 0.1386F, -0.0527F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(69, 44).addBox(-0.8944F, 0.0025F, -1.2234F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.07F)), PartPose.offsetAndRotation(1.1998F, 0.1267F, -2.2909F, -0.5137F, 0.1386F, -0.0527F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(69, 41).addBox(-0.8944F, -0.14F, -0.9432F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.08F)), PartPose.offsetAndRotation(1.1998F, 0.1267F, -2.2909F, -1.1595F, 0.1386F, -0.0527F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(66, 29).addBox(0.2F, -0.9367F, -0.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.1505F, -2.0216F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -1.0239F, -1.021F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.1505F, -1.0216F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(38, 28).addBox(-1.0F, -1.3912F, -0.4647F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 1.3F, -1.05F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.107F, -0.0321F, 0.1701F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 67).mirror().addBox(-1.5F, -0.7837F, -0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(20, 67).addBox(0.5F, -0.7837F, -0.83F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.0F, 1.1507F, -0.31F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(66, 26).mirror().addBox(-1.5F, -0.2236F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 26).addBox(0.5F, -0.2236F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4507F, -0.81F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(14, 55).mirror().addBox(-1.5F, -0.7514F, -1.7565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(14, 55).addBox(0.5F, -0.7514F, -1.7565F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1507F, 0.79F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(-1.5F, -2.9834F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(54, 28).addBox(0.5F, -2.9834F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 3.4507F, -0.51F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-0.5F, -0.5678F, -0.9979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5555F, -1.6831F, 0.7069F, -0.1222F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(18, 51).mirror().addBox(-0.5F, -0.4329F, -0.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.5555F, -1.6831F, 0.5323F, -0.1222F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.2376F, -0.3004F, -1.7563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0804F, 1.8842F, -2.4648F, 0.6746F, -0.2608F, -0.1953F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(68, 3).mirror().addBox(-0.2292F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(68, 3).addBox(2.0108F, -0.6F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3908F, 1.2403F, -1.1463F, 0.5745F, 0.0F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(65, 67).mirror().addBox(-0.2292F, -0.6543F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3908F, 1.2403F, -1.0463F, 0.5815F, -0.1463F, -0.0955F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(35, 68).mirror().addBox(0.0986F, -0.4298F, -1.6924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 68).mirror().addBox(0.0986F, -0.4298F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0804F, 1.8842F, -2.4648F, 0.6255F, -0.1708F, -0.1301F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(52, 38).mirror().addBox(-0.5F, -0.5358F, -0.1013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4609F, -4.8752F, 0.3828F, -0.1947F, -0.0777F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(50, 51).addBox(-0.5F, -0.5678F, -0.9979F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.9F, 1.5555F, -1.6831F, 0.7069F, 0.1222F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(18, 51).addBox(-0.5F, -0.4329F, -0.9903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 1.5555F, -1.6831F, 0.5323F, 0.1222F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 52).addBox(-0.7624F, -0.3004F, -1.7563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0804F, 1.8842F, -2.4648F, 0.6746F, 0.2608F, 0.1953F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 69).addBox(-0.4034F, -0.45F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(68, 64).addBox(-0.4034F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0966F, 3.0405F, -4.3787F, 0.4028F, 0.0F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 67).addBox(-0.7708F, -0.6543F, -0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3908F, 1.2403F, -1.0463F, 0.5815F, 0.1463F, 0.0955F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(35, 68).addBox(-1.0986F, -0.4298F, -1.6924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 68).addBox(-1.0986F, -0.4298F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0804F, 1.8842F, -2.4648F, 0.6255F, 0.1708F, 0.1301F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(52, 38).addBox(-0.5F, -0.5358F, -0.1013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 3.4609F, -4.8752F, 0.3828F, 0.1947F, 0.0777F));

		return LayerDefinition.create(meshdefinition, 75, 75);
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