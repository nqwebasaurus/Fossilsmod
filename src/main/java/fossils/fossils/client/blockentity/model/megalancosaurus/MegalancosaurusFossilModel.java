package fossils.fossils.client.blockentity.model.megalancosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalancosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Megalancosaurus;
	private final ModelPart Body;
	private final ModelPart frontleftarm;
	private final ModelPart frontleftarm2;
	private final ModelPart frontleftarm3;
	private final ModelPart frontleftarm4;
	private final ModelPart frontrightarm;
	private final ModelPart frontrightarm2;
	private final ModelPart frontrightarm3;
	private final ModelPart frontrightarm4;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart Body2;
	private final ModelPart Tail;
	private final ModelPart LLeg;
	private final ModelPart LLeg3;
	private final ModelPart LFoot;
	private final ModelPart finger;
	private final ModelPart finger2;
	private final ModelPart LFoot2;
	private final ModelPart LLeg2;
	private final ModelPart LLeg4;
	private final ModelPart LFoot3;
	private final ModelPart finger3;
	private final ModelPart finger4;
	private final ModelPart LFoot4;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart tail6;
	private final ModelPart TailClaw;

	public MegalancosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Megalancosaurus = this.fossil.getChild("Megalancosaurus");
		this.Body = this.Megalancosaurus.getChild("Body");
		this.frontleftarm = this.Body.getChild("frontleftarm");
		this.frontleftarm2 = this.frontleftarm.getChild("frontleftarm2");
		this.frontleftarm3 = this.frontleftarm2.getChild("frontleftarm3");
		this.frontleftarm4 = this.frontleftarm2.getChild("frontleftarm4");
		this.frontrightarm = this.Body.getChild("frontrightarm");
		this.frontrightarm2 = this.frontrightarm.getChild("frontrightarm2");
		this.frontrightarm3 = this.frontrightarm2.getChild("frontrightarm3");
		this.frontrightarm4 = this.frontrightarm2.getChild("frontrightarm4");
		this.Neck = this.Body.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.head = this.Neck4.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.Body2 = this.Megalancosaurus.getChild("Body2");
		this.Tail = this.Body2.getChild("Tail");
		this.LLeg = this.Tail.getChild("LLeg");
		this.LLeg3 = this.LLeg.getChild("LLeg3");
		this.LFoot = this.LLeg3.getChild("LFoot");
		this.finger = this.LFoot.getChild("finger");
		this.finger2 = this.finger.getChild("finger2");
		this.LFoot2 = this.LFoot.getChild("LFoot2");
		this.LLeg2 = this.Tail.getChild("LLeg2");
		this.LLeg4 = this.LLeg2.getChild("LLeg4");
		this.LFoot3 = this.LLeg4.getChild("LFoot3");
		this.finger3 = this.LFoot3.getChild("finger3");
		this.finger4 = this.finger3.getChild("finger4");
		this.LFoot4 = this.LFoot3.getChild("LFoot4");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.tail6 = this.Tail5.getChild("tail6");
		this.TailClaw = this.tail6.getChild("TailClaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Megalancosaurus = fossil.addOrReplaceChild("Megalancosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0961F, 0.693F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Megalancosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 70).addBox(0.5F, -2.5571F, 0.0062F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.9201F, 3.2001F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Megalancosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 70).addBox(0.5F, -2.3571F, 0.0062F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1639F, 1.215F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Megalancosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 45).addBox(0.5F, -2.8128F, -0.0981F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.2652F, -0.705F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Megalancosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 62).addBox(0.5F, -3.2128F, 0.0019F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1919F, -2.8037F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Megalancosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -0.0128F, 2.0019F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, -5.8019F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Megalancosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 55).mirror().addBox(-1.9395F, -0.3427F, -0.4613F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.3872F, 3.5981F, -0.2301F, -0.0828F, -0.3395F));

		PartDefinition cube_r7 = Megalancosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 47).mirror().addBox(-3.6129F, -1.1302F, -0.4613F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.3872F, 3.5981F, -0.1745F, -0.1719F, -0.7703F));

		PartDefinition cube_r8 = Megalancosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-5.4399F, -2.8944F, -0.4613F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.3872F, 3.5981F, -0.0539F, -0.2384F, -1.3462F));

		PartDefinition cube_r9 = Megalancosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.0227F, 0.1022F, -1.3515F));

		PartDefinition cube_r10 = Megalancosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(52, 62).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.0742F, 0.074F, -0.7827F));

		PartDefinition cube_r11 = Megalancosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -2.3033F, 0.0984F, 0.0358F, -0.3473F));

		PartDefinition cube_r12 = Megalancosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 59).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, -0.0076F, -0.0341F, -1.3525F));

		PartDefinition cube_r13 = Megalancosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, -0.0247F, -0.0247F, -0.7851F));

		PartDefinition cube_r14 = Megalancosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8095F, -0.3033F, -0.0328F, -0.0119F, -0.3489F));

		PartDefinition cube_r15 = Megalancosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 60).mirror().addBox(-5.3912F, -2.9052F, -0.248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.5872F, 1.3981F, -0.0343F, -0.1533F, -1.35F));

		PartDefinition cube_r16 = Megalancosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 65).mirror().addBox(-3.5777F, -1.1655F, -0.248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.5872F, 1.3981F, -0.1115F, -0.1108F, -0.7792F));

		PartDefinition cube_r17 = Megalancosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(75, 15).mirror().addBox(-1.9224F, -0.3895F, -0.248F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.5872F, 1.3981F, -0.1477F, -0.0535F, -0.3451F));

		PartDefinition cube_r18 = Megalancosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 55).addBox(0.9395F, -0.3427F, -0.4613F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3872F, 3.5981F, -0.2301F, 0.0828F, 0.3395F));

		PartDefinition cube_r19 = Megalancosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 47).addBox(1.6129F, -1.1302F, -0.4613F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3872F, 3.5981F, -0.1745F, 0.1719F, 0.7703F));

		PartDefinition cube_r20 = Megalancosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 15).addBox(2.4399F, -2.8944F, -0.4613F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3872F, 3.5981F, -0.0539F, 0.2384F, 1.3462F));

		PartDefinition cube_r21 = Megalancosaurus.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(57, 4).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.0227F, -0.1022F, 1.3515F));

		PartDefinition cube_r22 = Megalancosaurus.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(52, 62).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.0742F, -0.074F, 0.7827F));

		PartDefinition cube_r23 = Megalancosaurus.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 2).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -2.3033F, 0.0984F, -0.0358F, 0.3473F));

		PartDefinition cube_r24 = Megalancosaurus.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(47, 59).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, -0.0076F, 0.0341F, 1.3525F));

		PartDefinition cube_r25 = Megalancosaurus.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 62).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, -0.0247F, 0.0247F, 0.7851F));

		PartDefinition cube_r26 = Megalancosaurus.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8095F, -0.3033F, -0.0328F, 0.0119F, 0.3489F));

		PartDefinition cube_r27 = Megalancosaurus.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(38, 60).addBox(2.3912F, -2.9052F, -0.248F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5872F, 1.3981F, -0.0343F, 0.1533F, 1.35F));

		PartDefinition cube_r28 = Megalancosaurus.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 65).addBox(1.5777F, -1.1655F, -0.248F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5872F, 1.3981F, -0.1115F, 0.1108F, 0.7792F));

		PartDefinition cube_r29 = Megalancosaurus.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(75, 15).addBox(0.9224F, -0.3895F, -0.248F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5872F, 1.3981F, -0.1477F, 0.0535F, 0.3451F));

		PartDefinition cube_r30 = Megalancosaurus.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 45).addBox(0.0F, -0.2223F, -0.0014F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -2.0872F, 0.1981F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Body = Megalancosaurus.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.676F, -3.5819F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(77, 24).addBox(0.48F, -0.0403F, -0.8844F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6975F, -5.6927F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(41, 62).addBox(0.49F, -3.7403F, -0.4844F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8421F, -4.4593F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 30).addBox(-0.01F, -0.9F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -2.4403F, -0.8226F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(17, 63).addBox(0.0F, -0.6F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -2.6022F, -2.3172F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(67, 64).addBox(0.5F, -3.1278F, -0.116F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6421F, -2.8593F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 64).addBox(0.5F, -3.5029F, -1.3025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 70).addBox(0.5F, -2.8029F, 0.2975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.8421F, -4.4593F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.5F, 1.3066F, 5.2936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(31, 57).mirror().addBox(-0.5F, 1.3066F, 3.4936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 70).addBox(5.1F, 1.3066F, 5.2936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(31, 57).addBox(5.1F, 1.3066F, 3.4936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8F, 4.1815F, -3.4958F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(76, 53).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1198F, -4.1607F, 0.0558F, 0.3602F, -1.5902F));

		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1198F, -4.1607F, 0.2448F, 0.2725F, -0.9994F));

		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1198F, -4.1607F, 0.335F, 0.1458F, -0.5721F));

		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7198F, -2.3607F, 0.0465F, 0.2396F, -1.4874F));

		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(63, 58).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7198F, -2.3607F, 0.169F, 0.1768F, -0.9107F));

		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.7198F, -2.3607F, 0.2272F, 0.0895F, -0.4792F));

		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.5F, -0.312F, -0.4518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 57).mirror().addBox(-0.5F, -0.612F, -0.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(57, 0).addBox(5.1F, -0.312F, -0.4518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(10, 57).addBox(5.1F, -0.612F, -0.0518F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-2.8F, 4.1815F, -3.4958F, 1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-0.2F, -1.7585F, -2.1207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3F, 4.0815F, -3.2958F, 1.2859F, -0.274F, -0.7459F));

		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(51, 29).mirror().addBox(-0.5F, 0.2788F, 0.9948F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(51, 29).addBox(5.1F, 0.2788F, 0.9948F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.8F, 4.1815F, -3.4958F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 41).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1435F, -0.5845F, 0.0214F, 0.0669F, -1.4037F));

		PartDefinition cube_r48 = Body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(34, 62).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1435F, -0.5845F, 0.054F, 0.0449F, -0.8359F));

		PartDefinition cube_r49 = Body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1435F, -0.5845F, 0.0679F, 0.0179F, -0.4002F));

		PartDefinition cube_r50 = Body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 53).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1198F, -4.1607F, 0.0558F, -0.3602F, 1.5902F));

		PartDefinition cube_r51 = Body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(65, 41).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1198F, -4.1607F, 0.2448F, -0.2725F, 0.9994F));

		PartDefinition cube_r52 = Body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(76, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.1198F, -4.1607F, 0.335F, -0.1458F, 0.5721F));

		PartDefinition cube_r53 = Body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 60).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7198F, -2.3607F, 0.0465F, -0.2396F, 1.4874F));

		PartDefinition cube_r54 = Body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(63, 58).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7198F, -2.3607F, 0.169F, -0.1768F, 0.9107F));

		PartDefinition cube_r55 = Body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(9, 72).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7198F, -2.3607F, 0.2272F, -0.0895F, 0.4792F));

		PartDefinition cube_r56 = Body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(31, 50).addBox(-0.8F, -1.7585F, -2.1207F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3F, 4.0815F, -3.2958F, 1.2859F, 0.274F, 0.7459F));

		PartDefinition cube_r57 = Body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(71, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1435F, -0.5845F, 0.0679F, -0.0179F, 0.4002F));

		PartDefinition cube_r58 = Body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(34, 62).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1435F, -0.5845F, 0.054F, -0.0449F, 0.8359F));

		PartDefinition cube_r59 = Body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(49, 41).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1435F, -0.5845F, 0.0214F, -0.0669F, 1.4037F));

		PartDefinition cube_r60 = Body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(30, 37).addBox(0.5F, -3.4128F, 0.0019F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1564F, -1.0697F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -0.0128F, -0.9981F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.0421F, -4.9593F, 0.2967F, 0.0F, 0.0F));

		PartDefinition frontleftarm = Body.addOrReplaceChild("frontleftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2924F, 5.1664F, -3.4116F, 0.5722F, 0.298F, -0.092F));

		PartDefinition cube_r62 = frontleftarm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(15, 37).addBox(0.0F, -0.8F, 0.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4762F, -0.1613F, -0.8453F, -0.0873F, 0.0F, 0.0F));

		PartDefinition frontleftarm2 = frontleftarm.addOrReplaceChild("frontleftarm2", CubeListBuilder.create().texOffs(17, 57).addBox(-1.0911F, -0.1026F, 0.0129F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 59).addBox(0.2089F, -0.1026F, 0.0129F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2489F, 0.1383F, 4.8845F, -1.5975F, -0.9345F, 1.0627F));

		PartDefinition frontleftarm3 = frontleftarm2.addOrReplaceChild("frontleftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1639F, 4.1419F, -0.0185F, -0.9955F, 0.3425F, 0.343F));

		PartDefinition cube_r63 = frontleftarm3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(34, 28).addBox(-2.0F, -1.1372F, -3.7481F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5625F, 0.5128F, 0.741F, 1.444F, -0.0649F, 0.0083F));

		PartDefinition frontleftarm4 = frontleftarm2.addOrReplaceChild("frontleftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3572F, 4.5492F, -0.3312F, -0.9264F, -0.5018F, -0.0865F));

		PartDefinition cube_r64 = frontleftarm4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(30, 43).addBox(0.0F, -1.1372F, -3.7481F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5625F, 0.5128F, 0.741F, 1.444F, -0.0649F, 0.0083F));

		PartDefinition frontrightarm = Body.addOrReplaceChild("frontrightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2924F, 5.1664F, -3.4116F, 0.1258F, -0.3785F, 0.3233F));

		PartDefinition cube_r65 = frontrightarm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(15, 37).mirror().addBox(-1.0F, -0.8F, 0.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4762F, -0.1613F, -0.8453F, -0.0873F, 0.0F, 0.0F));

		PartDefinition frontrightarm2 = frontrightarm.addOrReplaceChild("frontrightarm2", CubeListBuilder.create().texOffs(17, 57).mirror().addBox(0.0911F, -0.1026F, 0.0129F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(22, 59).mirror().addBox(-1.2089F, -0.1026F, 0.0129F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2489F, 0.1383F, 4.8845F, -1.4275F, 0.0412F, -0.1734F));

		PartDefinition frontrightarm3 = frontrightarm2.addOrReplaceChild("frontrightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3488F, 4.2445F, -0.358F, -0.2989F, -0.0503F, -0.1064F));

		PartDefinition cube_r66 = frontrightarm3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(34, 28).mirror().addBox(-1.0F, -1.1372F, -3.7481F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 0.5128F, 0.741F, 1.444F, 0.0649F, -0.0083F));

		PartDefinition frontrightarm4 = frontrightarm2.addOrReplaceChild("frontrightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4097F, 4.2598F, -0.39F, -0.0747F, 0.4408F, 0.6429F));

		PartDefinition cube_r67 = frontrightarm4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-2.0F, -1.1372F, -3.7481F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 0.5128F, 0.741F, 1.444F, 0.0649F, -0.0083F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2323F, -4.5659F, 0.6007F, -0.2175F, -0.1468F));

		PartDefinition cube_r68 = Neck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(55, 77).addBox(-0.01F, -0.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 57).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -4.6365F, -0.6554F, 1.9984F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Neck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(34, 66).addBox(0.0F, -2.5022F, -2.3475F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5562F, 0.134F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 67).addBox(0.0F, -1.9128F, 0.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 50).addBox(-0.5F, -1.0128F, 0.0019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0438F, -4.166F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3185F, -1.6444F, 0.1117F, 0.0851F, -1.2484F));

		PartDefinition cube_r72 = Neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(72, 9).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3185F, -1.6444F, 0.137F, 0.0301F, -0.8148F));

		PartDefinition cube_r73 = Neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 64).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3185F, -1.6444F, 0.1117F, -0.0851F, 1.2484F));

		PartDefinition cube_r74 = Neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(72, 9).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3185F, -1.6444F, 0.137F, -0.0301F, 0.8148F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4689F, -3.9641F, -0.9588F, -0.4492F, 0.554F));

		PartDefinition cube_r75 = Neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(45, 43).addBox(-0.5F, -0.9128F, 0.0019F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.7069F, -4.7823F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2196F, -4.4804F, -0.5589F, -0.2305F, 0.0435F));

		PartDefinition cube_r76 = Neck3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(38, 55).addBox(-0.5F, -0.0128F, 2.7019F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -2.6633F, -4.7532F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9633F, -2.4532F, 0.4813F, -0.3973F, -0.4578F));

		PartDefinition cube_r77 = Neck4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 35).addBox(-0.5F, -0.0128F, -1.2981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -1.6F, -2.2F, -0.4363F, 0.0F, 0.0F));

		PartDefinition head = Neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0866F, -3.1854F, 0.3796F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.2636F, -0.852F, -0.2893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(60, 29).mirror().addBox(-0.2636F, -0.052F, -0.9893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2535F, -3.8893F, 0.124F, -0.2438F, -0.0088F));

		PartDefinition cube_r79 = head.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.4865F, -0.5022F, -0.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6715F, -7.0126F, 0.3077F, -0.0962F, -0.042F));

		PartDefinition cube_r80 = head.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(67, 34).mirror().addBox(-0.3F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 31).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.0594F, -0.0941F, 0.8523F, 0.4308F, 0.3813F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-0.2317F, -0.2061F, -0.7677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.0193F, 0.3039F, 0.1542F, 0.4308F, 0.3813F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 43).addBox(1.14F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.82F, 0.5339F, -0.5934F, 2.5133F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-0.5F, -0.3815F, -0.6386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.149F)).mirror(false)
				.texOffs(69, 22).mirror().addBox(-0.5F, -0.3815F, 0.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1505F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2664F, -1.8495F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-0.5F, -0.8833F, -0.9269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2664F, -1.8495F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-0.5F, -1.2799F, -0.1776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.152F)).mirror(false)
				.texOffs(62, 64).addBox(0.3F, -1.2799F, -0.1776F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.152F)), PartPose.offsetAndRotation(-0.4F, -0.2664F, -1.8495F, 2.0246F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.3523F, 0.5402F, -1.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(67, 9).mirror().addBox(-0.3523F, 0.4402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(62, 68).mirror().addBox(-0.3523F, 1.2402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 69).mirror().addBox(-0.3523F, 0.8402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1349F, -5.8346F, 2.8034F, -0.1352F, -0.0406F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-0.3523F, -0.2327F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1349F, -5.8346F, 1.9481F, -0.1352F, -0.0406F));

		PartDefinition cube_r88 = head.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(47, 61).mirror().addBox(-0.3523F, -0.2912F, -0.5752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.1349F, -5.8346F, 2.2798F, -0.1352F, -0.0406F));

		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.62F, 0.4411F, -3.7386F, 1.8671F, -0.2341F, -0.0707F));

		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(15, 67).addBox(-0.7364F, -0.852F, -0.2893F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(60, 29).addBox(-0.7364F, -0.052F, -0.9893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.2535F, -3.8893F, 0.124F, 0.2438F, 0.0088F));

		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5135F, -0.5022F, -0.1622F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6715F, -7.0126F, 0.3077F, 0.0962F, 0.042F));

		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(47, 50).addBox(-0.5F, -1.0419F, -3.7633F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1754F, -3.7525F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(10, 61).addBox(-1.0F, -1.01F, -2.0423F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.3458F, 0.4708F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.62F, 0.4411F, -3.7386F, 1.8671F, 0.2341F, 0.0707F));

		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(65, 49).addBox(-0.6477F, -0.2327F, -0.5535F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4F, 1.1349F, -5.8346F, 1.9481F, 0.1352F, 0.0406F));

		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(67, 12).addBox(-0.6477F, 0.5402F, -1.3983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(67, 9).addBox(-0.6477F, 0.4402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 69).addBox(-0.6477F, 0.8402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(62, 68).addBox(-0.6477F, 1.2402F, -1.6983F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 1.1349F, -5.8346F, 2.8034F, 0.1352F, 0.0406F));

		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(47, 61).addBox(-0.6477F, -0.2912F, -0.5752F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(0.4F, 1.1349F, -5.8346F, 2.2798F, 0.1352F, 0.0406F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(69, 22).addBox(-0.5F, -0.3815F, 0.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1505F))
				.texOffs(20, 69).addBox(-0.5F, -0.3815F, -0.6386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.149F)), PartPose.offsetAndRotation(0.4F, -0.2664F, -1.8495F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(67, 25).addBox(-0.5F, -0.8833F, -0.9269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.4F, -0.2664F, -1.8495F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(53, 11).addBox(-1.5F, 0.0183F, -1.9556F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6572F, -2.5938F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(22, 65).addBox(-1.0F, -1.9512F, -0.8783F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.6135F, -4.2065F, 2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(47, 55).addBox(-1.5F, -1.0404F, -2.0172F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.2399F, -3.4399F, 2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(46, 6).addBox(-1.5F, -0.0404F, -1.0172F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.2399F, -3.4399F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(56, 54).addBox(-1.5F, 0.3028F, -2.0114F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(56, 50).addBox(-1.5F, 0.0028F, -2.0114F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -2.0652F, -1.6532F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(67, 34).addBox(-0.7F, -1.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(67, 31).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, -1.0594F, -0.0941F, 0.8523F, -0.4308F, -0.3813F));

		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(67, 37).addBox(-0.7683F, -0.2061F, -0.7677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.5F, -1.0193F, 0.3039F, 0.1542F, -0.4308F, -0.3813F));

		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(10, 65).addBox(-1.5F, -1.9883F, 0.0148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -0.34F, 0.34F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(60, 37).addBox(-1.5F, -1.9883F, -0.9852F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.34F, 0.34F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(9, 52).addBox(-1.0F, -1.9952F, -1.7517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 1.2394F, -1.569F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(27, 61).addBox(-1.0F, -0.2F, -0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.0465F, -0.3893F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6149F, -0.8573F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r111 = lowerjaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(48, 66).mirror().addBox(-0.9072F, -0.1817F, 0.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(43, 66).mirror().addBox(-0.9072F, -0.1817F, -0.0725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4504F, -2.1125F, -0.0742F, -0.1862F, 0.047F));

		PartDefinition cube_r112 = lowerjaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.6294F, -0.133F, -0.1857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4017F, -3.625F, 0.0654F, -0.1862F, 0.047F));

		PartDefinition cube_r113 = lowerjaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-1.1015F, -0.3F, -2.5786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1512F, -1.1376F, -0.0393F, -0.1862F, 0.047F));

		PartDefinition cube_r114 = lowerjaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(-0.5F, -0.1727F, -0.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3332F, -4.0539F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r115 = lowerjaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(60, 33).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.432F, -5.4376F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r116 = lowerjaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(58, 45).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(58, 45).addBox(0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, 0.0291F, -0.7343F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r117 = lowerjaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-1.5F, -0.7437F, -1.9197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(59, 19).addBox(-0.3F, -0.7437F, -1.9197F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4F, 0.5786F, 0.3159F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r118 = lowerjaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 66).addBox(-0.0928F, -0.1817F, 0.5275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(43, 66).addBox(-0.0928F, -0.1817F, -0.0725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4504F, -2.1125F, -0.0742F, 0.1862F, -0.047F));

		PartDefinition cube_r119 = lowerjaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(56, 58).addBox(-0.3706F, -0.133F, -0.1857F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4017F, -3.625F, 0.0654F, 0.1862F, -0.047F));

		PartDefinition cube_r120 = lowerjaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 24).addBox(0.1015F, -0.3F, -2.5786F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -0.1512F, -1.1376F, -0.0393F, 0.1862F, -0.047F));

		PartDefinition cube_r121 = lowerjaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(67, 28).addBox(-0.5F, -0.7231F, -1.1149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(27, 67).addBox(-0.5F, -0.7231F, -0.8149F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.0F, 0.641F, -5.3581F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Body2 = Megalancosaurus.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.317F, 4.8706F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(56, 66).addBox(-0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2924F, 4.073F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 49).addBox(-0.5F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.397F, 2.0758F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r124 = Body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(53, 66).addBox(-0.5F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 45).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5017F, 0.0785F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r125 = Body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(72, 13).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.1293F, -0.0521F, -0.4856F));

		PartDefinition cube_r126 = Body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(34, 64).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.0954F, -0.1018F, -0.9204F));

		PartDefinition cube_r127 = Body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(64, 2).mirror().addBox(-4.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1888F, 4.5752F, -0.0255F, -0.137F, -1.4908F));

		PartDefinition cube_r128 = Body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(76, 61).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.0963F, -0.0408F, -0.452F));

		PartDefinition cube_r129 = Body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.0701F, -0.0777F, -0.8875F));

		PartDefinition cube_r130 = Body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(61, 17).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0888F, 2.5752F, -0.0173F, -0.1031F, -1.4566F));

		PartDefinition cube_r131 = Body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, -0.0465F, -0.0247F, -0.4181F));

		PartDefinition cube_r132 = Body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, -0.0317F, -0.042F, -0.8544F));

		PartDefinition cube_r133 = Body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(60, 23).mirror().addBox(-5.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0112F, 0.5752F, -0.0042F, -0.0524F, -1.4221F));

		PartDefinition cube_r134 = Body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(72, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.1293F, 0.0521F, 0.4856F));

		PartDefinition cube_r135 = Body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(34, 64).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.0954F, 0.1018F, 0.9204F));

		PartDefinition cube_r136 = Body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 2).addBox(2.2241F, -1.918F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1888F, 4.5752F, -0.0255F, 0.137F, 1.4908F));

		PartDefinition cube_r137 = Body2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(76, 61).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.0963F, 0.0408F, 0.452F));

		PartDefinition cube_r138 = Body2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 66).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.0701F, 0.0777F, 0.8875F));

		PartDefinition cube_r139 = Body2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(61, 17).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0888F, 2.5752F, -0.0173F, 0.1031F, 1.4566F));

		PartDefinition cube_r140 = Body2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(72, 11).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, -0.0465F, 0.0247F, 0.4181F));

		PartDefinition cube_r141 = Body2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(64, 0).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, -0.0317F, 0.042F, 0.8544F));

		PartDefinition cube_r142 = Body2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(60, 23).addBox(2.2241F, -1.918F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0112F, 0.5752F, -0.0042F, 0.0524F, 1.4221F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0983F, 5.0785F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 18).addBox(0.0F, -1.9F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(34, 71).addBox(0.0F, -1.9F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(58, 41).mirror().addBox(-1.5F, 0.0F, 3.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(58, 41).addBox(0.5F, 0.0F, 3.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(0, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.3409F, 0.0894F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(72, 25).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.4574F, -0.1736F, -0.5734F));

		PartDefinition cube_r145 = Tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(-2.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.3487F, -0.3473F, -0.9884F));

		PartDefinition cube_r146 = Tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-3.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5496F, 1.1861F, -0.0993F, -0.4777F, -1.5933F));

		PartDefinition cube_r147 = Tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(50, 19).mirror().addBox(-0.5F, -0.0572F, 0.086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(50, 19).addBox(3.5F, -0.0572F, 0.086F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 0.8077F, 3.205F, -0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(62, 11).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0819F, 5.3657F, 3.8674F, -0.7854F, 0.0F, -0.4363F));

		PartDefinition cube_r149 = Tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 9).mirror().addBox(0.0F, 2.1273F, -2.5651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.5077F, 5.005F, 0.2356F, 0.0F, -0.4363F));

		PartDefinition cube_r150 = Tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(66, 19).mirror().addBox(0.0F, 1.9473F, -0.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.5077F, 5.005F, 0.48F, 0.0F, -0.4363F));

		PartDefinition cube_r151 = Tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(18, 52).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2026F, 5.1069F, 4.8141F, -0.672F, 0.0F, -0.4363F));

		PartDefinition cube_r152 = Tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(65, 53).mirror().addBox(-0.5F, 0.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 53).addBox(3.5F, 0.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 3.1077F, 4.705F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(72, 25).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.4574F, 0.1736F, 0.5734F));

		PartDefinition cube_r154 = Tail.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(52, 64).addBox(0.9063F, -0.4226F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.3487F, 0.3473F, 0.9884F));

		PartDefinition cube_r155 = Tail.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(20, 72).addBox(2.2241F, -1.918F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5496F, 1.1861F, -0.0993F, 0.4777F, 1.5933F));

		PartDefinition cube_r156 = Tail.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(67, 4).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0011F, 1.0291F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Tail.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(62, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0819F, 5.3657F, 3.8674F, -0.7854F, 0.0F, 0.4363F));

		PartDefinition cube_r158 = Tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(42, 9).addBox(-1.0F, 2.1273F, -2.5651F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.5F, 3.5077F, 5.005F, 0.2356F, 0.0F, 0.4363F));

		PartDefinition cube_r159 = Tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(66, 19).addBox(-1.0F, 1.9473F, -0.2011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.5F, 3.5077F, 5.005F, 0.48F, 0.0F, 0.4363F));

		PartDefinition cube_r160 = Tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(18, 52).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2026F, 5.1069F, 4.8141F, -0.672F, 0.0F, 0.4363F));

		PartDefinition LLeg = Tail.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(26, 50).addBox(-0.4829F, -0.0028F, -0.3623F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.6466F, 4.2754F, -1.826F, -0.7256F, 0.2885F));

		PartDefinition LLeg3 = LLeg.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.7F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 57).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6784F, 6.9798F, 0.7737F, 1.1873F, -0.2723F, 0.7176F));

		PartDefinition LFoot = LLeg3.addOrReplaceChild("LFoot", CubeListBuilder.create().texOffs(29, 9).addBox(-1.3053F, -0.5F, -2.5706F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5487F, 4.5822F, -0.4903F, 1.288F, -0.7235F, -1.3104F));

		PartDefinition finger = LFoot.addOrReplaceChild("finger", CubeListBuilder.create().texOffs(53, 6).addBox(-0.394F, -0.4F, -2.7068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.2053F, -0.1F, 0.0294F, -0.075F, 0.5081F, -0.0539F));

		PartDefinition finger2 = finger.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(60, 25).addBox(-0.4F, -0.4F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.006F, 0.0F, -2.6068F));

		PartDefinition LFoot2 = LFoot.addOrReplaceChild("LFoot2", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, -1.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2566F, 0.591F, -2.4836F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LLeg2 = Tail.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5171F, -0.0028F, -0.3623F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.6466F, 4.2754F, -1.8486F, 0.5399F, -0.1238F));

		PartDefinition LLeg4 = LLeg2.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -0.7F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 57).mirror().addBox(-0.5F, -0.4F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6784F, 6.9798F, 0.7737F, 1.8802F, 0.3579F, -0.8563F));

		PartDefinition LFoot3 = LLeg4.addOrReplaceChild("LFoot3", CubeListBuilder.create().texOffs(29, 9).mirror().addBox(-1.6947F, -0.5F, -2.5706F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5487F, 4.5822F, -0.4903F, 2.6312F, 1.4109F, 2.6974F));

		PartDefinition finger3 = LFoot3.addOrReplaceChild("finger3", CubeListBuilder.create().texOffs(53, 6).mirror().addBox(-0.606F, -0.4F, -2.7068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.2053F, -0.1F, 0.0294F, 0.0F, -0.5672F, 0.0F));

		PartDefinition finger4 = finger3.addOrReplaceChild("finger4", CubeListBuilder.create().texOffs(60, 25).mirror().addBox(-0.6F, -0.4F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.006F, 0.0F, -2.6068F, 0.0873F, 0.0F, 0.0F));

		PartDefinition LFoot4 = LFoot3.addOrReplaceChild("LFoot4", CubeListBuilder.create().texOffs(50, 15).mirror().addBox(-2.0F, -1.1F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2557F, 0.5644F, -2.3217F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.8972F, -0.1265F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 2.8591F, 6.3894F, 0.2371F, 0.5383F, -0.2147F));

		PartDefinition cube_r161 = Tail2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(14, 73).addBox(0.0F, -1.7024F, 0.03F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8764F, 11.7943F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Tail2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 69).addBox(0.0F, -2.1024F, 0.03F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9113F, 9.7947F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Tail2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(59, 68).addBox(0.0F, -2.3024F, 0.03F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8067F, 7.7974F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(3, 68).addBox(0.0F, -2.3024F, 0.03F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8729F, 5.875F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Tail2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 68).addBox(0.0F, -2.5326F, -0.1712F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8972F, 4.0735F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Tail2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(72, 35).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8785F, 1.7708F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Tail2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(20, 74).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 11.769F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r168 = Tail2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(70, 43).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 11.769F, -1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Tail2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(46, 74).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 11.769F, -2.2515F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Tail2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(65, 74).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 11.769F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Tail2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(67, 69).addBox(0.0F, -0.1833F, -0.1923F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 11.769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Tail2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 63).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4055F, 8.569F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Tail2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(73, 67).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4055F, 8.569F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Tail2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(73, 71).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4055F, 8.569F, -2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Tail2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(9, 74).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4055F, 8.569F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Tail2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(74, 18).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4055F, 8.569F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Tail2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(73, 47).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5055F, 5.569F, -1.1694F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Tail2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(73, 51).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5055F, 5.569F, -2.2166F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Tail2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(73, 55).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5055F, 5.569F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Tail2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(57, 73).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5055F, 5.569F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Tail2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 59).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5055F, 5.569F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Tail2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(73, 43).addBox(-0.001F, 0.0436F, -0.9605F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1239F, 5.5211F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Tail2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(17, 73).addBox(0.001F, 0.0436F, -0.9605F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0239F, 5.6211F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Tail2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 31).addBox(0.0F, 0.7436F, -0.2605F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3055F, 3.169F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Tail2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(40, 66).addBox(0.0F, 0.4436F, 1.7395F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 66).addBox(0.0F, 0.0436F, -0.2605F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0972F, -0.1265F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Tail2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(72, 27).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8972F, -0.1265F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 15).addBox(-0.5F, -0.3021F, 0.096F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.004F))
				.texOffs(37, 71).addBox(0.0F, -2.1021F, 1.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(76, 63).addBox(0.0F, -2.1021F, 3.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(40, 71).addBox(0.0F, -1.9021F, 5.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(51, 71).addBox(0.0F, -1.7021F, 7.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(62, 71).addBox(0.0F, -1.7021F, 9.096F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.5663F, 12.675F, 0.3647F, 0.5718F, 0.2221F));

		PartDefinition cube_r187 = Tail3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(70, 62).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0608F, 8.794F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Tail3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(35, 75).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0608F, 8.794F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Tail3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 35).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0608F, 8.794F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Tail3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(38, 75).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0608F, 8.794F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Tail3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(75, 39).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0608F, 8.794F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Tail3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(70, 58).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 5.694F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Tail3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(29, 75).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 5.694F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Tail3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(75, 31).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 5.694F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Tail3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(32, 75).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 5.694F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Tail3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(6, 70).addBox(0.0F, -0.1833F, -0.1923F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 5.694F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Tail3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(70, 54).addBox(-0.002F, -2.0269F, 3.2553F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 2.494F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Tail3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(23, 75).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 2.494F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Tail3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(26, 75).addBox(0.0F, -3.8183F, 0.8651F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 2.494F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Tail3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(70, 4).addBox(0.0F, -0.1833F, -0.1923F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 2.494F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Tail3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(75, 27).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2608F, 2.494F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.3833F, -0.0547F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.02F))
				.texOffs(72, 39).addBox(0.0F, -1.6833F, -0.0547F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 71).addBox(0.0F, -1.6833F, 1.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 72).addBox(0.0F, -1.6833F, 3.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 74).addBox(0.0F, -1.6833F, 5.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 75).addBox(0.0F, -1.4833F, 7.9453F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 73).addBox(0.0F, -1.1833F, 9.9453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1203F, 11.0582F, -0.8481F, -0.1876F, 0.2501F));

		PartDefinition cube_r202 = Tail4.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(76, 4).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 7.2358F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Tail4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(41, 76).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 7.2358F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Tail4.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(76, 43).addBox(-0.001F, -0.2349F, -0.3817F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2825F, 9.2255F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Tail4.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(71, 75).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 4.2358F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r206 = Tail4.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(74, 75).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 4.2358F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r207 = Tail4.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 0).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 4.2358F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r208 = Tail4.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(70, 70).addBox(-0.001F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, 2.5959F, 6.6735F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r209 = Tail4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(49, 75).addBox(-0.001F, -0.5349F, 1.8183F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 1.2358F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r210 = Tail4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(77, 76).addBox(0.0F, -2.8183F, 0.8651F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 1.2358F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r211 = Tail4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(70, 66).addBox(-0.001F, -0.6F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, 2.5959F, 3.6735F, -1.3614F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Tail4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(52, 75).addBox(0.001F, 2.025F, 1.1263F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 1.2358F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Tail4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, 0.8167F, -0.1923F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0596F, 1.2358F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(17, 28).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F))
				.texOffs(77, 8).addBox(0.0F, -1.2F, 0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 11).addBox(0.0F, -1.2F, 2.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 70).addBox(0.0F, -1.2F, 4.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.023F, 10.9718F, -1.3545F, -0.0617F, 0.0618F));

		PartDefinition cube_r214 = Tail5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 4).addBox(0.0F, 4.7436F, 27.7395F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4021F, -22.996F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r215 = Tail5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(3, 73).addBox(0.0F, -0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7025F, 3.1936F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r216 = Tail5.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 73).addBox(0.0F, 0.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5778F, 0.888F, 0.4189F, 0.0F, 0.0F));

		PartDefinition tail6 = Tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(34, 35).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(9, 78).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 78).addBox(0.0F, -0.9F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 27).addBox(0.0F, -0.7F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0342F, 6.906F, -1.1185F, -0.1432F, 0.3F));

		PartDefinition cube_r217 = tail6.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(3, 77).addBox(0.0F, 5.5436F, 33.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 77).addBox(0.0F, 5.5436F, 31.7395F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 47).addBox(0.0F, 4.7436F, 29.7395F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4363F, -29.902F, 0.1745F, 0.0F, 0.0F));

		PartDefinition TailClaw = tail6.addOrReplaceChild("TailClaw", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -0.7F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.005F))
				.texOffs(12, 77).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 77).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0421F, -0.1349F, 5.3122F, -1.5966F, 0.0045F, 0.1745F));

		PartDefinition cube_r218 = TailClaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(77, 17).addBox(0.0F, -1.3355F, 1.4358F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, -2.2427F, 0.0F, 0.0F));

		PartDefinition cube_r219 = TailClaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(62, 6).addBox(0.0F, -0.9895F, -0.2997F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.0F, -2.0159F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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