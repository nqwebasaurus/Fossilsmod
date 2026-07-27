package fossils.fossils.client.blockentity.model.trucidocynodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TrucidocynodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart Bodyfront;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Rightfrontfoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Leftfrontfoot2;
	private final ModelPart Neck;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart body5;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Tail9;
	private final ModelPart bone4;
	private final ModelPart bone7;

	public TrucidocynodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.Bodyfront = this.body4.getChild("Bodyfront");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Rightfrontfoot2 = this.Rightfrontfoot.getChild("Rightfrontfoot2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Leftfrontfoot2 = this.Leftfrontfoot.getChild("Leftfrontfoot2");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck2 = this.Neck.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone6 = this.Bodyfront.getChild("bone6");
		this.body5 = this.body4.getChild("body5");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.bone4 = this.Hips.getChild("bone4");
		this.bone7 = this.Hips.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1F, 17.2F, -0.5801F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 40).addBox(0.0F, -1.4617F, 0.0069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -0.613F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 36).addBox(0.0F, -1.757F, 0.0041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -2.613F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(41, 95).mirror().addBox(-0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 95).mirror().addBox(-0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 95).mirror().addBox(-0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 95).addBox(0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 95).addBox(0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 95).addBox(0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(29, 94).addBox(0.0F, -1.6F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8722F, -5.5976F, 0.3978F, -0.1208F, -0.0506F));

		PartDefinition cube_r6 = Belly.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, -1.4309F, -0.0101F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1573F, -0.9404F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Belly.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 12).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, 0.1079F, 0.0428F, -0.608F));

		PartDefinition cube_r8 = Belly.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(91, 32).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, 0.0289F, 0.0894F, -1.1518F));

		PartDefinition cube_r9 = Belly.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(91, 84).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, -0.0122F, -0.0134F, -0.7292F));

		PartDefinition cube_r10 = Belly.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 62).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, -0.0448F, -0.0209F, -1.2738F));

		PartDefinition cube_r11 = Belly.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(-0.6348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2933F, -0.5278F, 0.2135F, 0.1979F, -0.5464F));

		PartDefinition cube_r12 = Belly.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 92).addBox(-0.3652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2933F, -0.5278F, 0.2135F, -0.1979F, 0.5464F));

		PartDefinition cube_r13 = Belly.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(92, 62).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, -0.0448F, 0.0209F, 1.2738F));

		PartDefinition cube_r14 = Belly.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(91, 84).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, -0.0122F, 0.0134F, 0.7292F));

		PartDefinition cube_r15 = Belly.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(91, 32).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, 0.0289F, -0.0894F, 1.1518F));

		PartDefinition cube_r16 = Belly.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 12).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, 0.1079F, -0.0428F, 0.608F));

		PartDefinition cube_r17 = Belly.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(89, 92).addBox(0.0F, -1.3258F, -0.0079F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2573F, -2.9404F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Belly.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 34).addBox(0.0F, -1.1956F, -0.0056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.3574F, -4.9404F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Belly.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, 7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6573F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0236F, -5.8422F, 0.3319F, -0.0413F, -0.0142F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(11, 93).addBox(0.0F, -1.1405F, -0.0033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(74, 55).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5855F, -0.0341F, -0.0546F, -1.0483F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5855F, -0.0205F, -0.0478F, -0.503F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 93).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6855F, -0.0619F, -0.0632F, -0.5705F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(75, 16).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6855F, -0.0615F, -0.0892F, -1.116F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 16).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6855F, -0.0615F, 0.0892F, 1.116F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 93).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6855F, -0.0619F, 0.0632F, 0.5705F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(93, 3).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5855F, -0.0205F, 0.0478F, 0.503F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(74, 55).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5855F, -0.0341F, 0.0546F, 1.0483F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(3, 93).addBox(0.0F, -1.2853F, -0.001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(32, 13).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, 0.1839F, -0.0858F, -0.0159F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(93, 52).addBox(0.0F, -1.3302F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(21, 93).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0002F, -0.0121F, -1.503F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(61, 19).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0059F, -0.0105F, -0.9793F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 34).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0264F, -0.0247F, -0.4349F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(49, 93).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0524F, -0.0622F, -0.4489F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0539F, -0.0834F, -0.9946F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(62, 33).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0539F, 0.0834F, 0.9946F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 93).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0524F, 0.0622F, 0.4489F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(93, 34).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0264F, 0.0247F, 0.4349F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 19).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0059F, 0.0105F, 0.9793F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(21, 93).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0002F, 0.0121F, 1.503F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(14, 93).addBox(0.0F, -1.425F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(30, 20).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.104F, -3.9589F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(94, 48).addBox(0.0F, -1.3552F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 64).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0002F, -0.0121F, -1.503F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(59, 64).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0059F, -0.0105F, -0.9793F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(93, 89).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0264F, -0.0247F, -0.4349F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.4F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2228F, 5.7534F, -2.6174F, -0.0606F, 1.1816F, 0.1256F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0131F, -0.0432F, -0.451F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(64, 59).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0301F, -0.0468F, -0.9961F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0026F, -0.0556F, -1.5203F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(75, 63).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0026F, 0.0556F, 1.5203F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(64, 59).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0301F, 0.0468F, 0.9961F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 14).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0131F, 0.0432F, 0.451F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 26).addBox(-7.6F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2228F, 5.7534F, -2.6174F, -0.0606F, -1.1816F, -0.1256F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(93, 89).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0264F, 0.0247F, 0.4349F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(59, 64).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0059F, 0.0105F, 0.9793F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(50, 64).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0002F, 0.0121F, 1.503F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(94, 44).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(35, 38).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -4.0F, -0.0443F, -0.1744F, 0.0077F));

		PartDefinition cube_r61 = body4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(95, 5).addBox(0.0F, -1.6302F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body4.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5983F, -2.5851F, -0.0028F, -0.0556F, -1.5029F));

		PartDefinition cube_r63 = body4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 61).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5983F, -2.5851F, -0.0302F, -0.0467F, -0.9786F));

		PartDefinition cube_r64 = body4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5983F, -2.5851F, -0.0132F, -0.0431F, -0.4336F));

		PartDefinition cube_r65 = body4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(0.3F, 0.0F, -0.9F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2553F, 6.1725F, -2.5154F, -0.1764F, 0.5232F, -0.0514F));

		PartDefinition cube_r66 = body4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.0F, 0.0F, -0.2F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2839F, 5.273F, -0.5593F, -0.0124F, 0.992F, 0.2046F));

		PartDefinition cube_r67 = body4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(95, 9).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, 0.0262F, -0.0242F, -0.4523F));

		PartDefinition cube_r68 = body4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(65, 8).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, -0.0064F, -0.0102F, -0.9968F));

		PartDefinition cube_r69 = body4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, -0.0004F, -0.012F, -1.5204F));

		PartDefinition cube_r70 = body4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(35, 65).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, -0.0004F, 0.012F, 1.5204F));

		PartDefinition cube_r71 = body4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 8).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, -0.0064F, 0.0102F, 0.9968F));

		PartDefinition cube_r72 = body4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 9).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, 0.0262F, 0.0242F, 0.4523F));

		PartDefinition cube_r73 = body4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, 0.0F, -0.2F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 5.273F, -0.5593F, -0.0124F, -0.992F, -0.2046F));

		PartDefinition cube_r74 = body4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(54, 9).addBox(-4.3F, 0.0F, -0.9F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2553F, 6.1725F, -2.5154F, -0.1764F, -0.5232F, 0.0514F));

		PartDefinition cube_r75 = body4.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(94, 64).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5983F, -2.5851F, -0.0132F, 0.0431F, 0.4336F));

		PartDefinition cube_r76 = body4.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(64, 61).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5983F, -2.5851F, -0.0302F, 0.0467F, 0.9786F));

		PartDefinition cube_r77 = body4.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(52, 28).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5983F, -2.5851F, -0.0028F, 0.0556F, 1.5029F));

		PartDefinition cube_r78 = body4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(92, 94).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(11, 39).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body4.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.3029F, -6.9476F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0145F, -5.9138F, -0.2691F, -0.0841F, 0.0232F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 84).addBox(0.0F, -2.2F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -0.8476F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(18, 84).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -2.9476F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r82 = Bodyfront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(26, 89).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -4.9476F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Bodyfront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(18, 89).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -6.9476F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Bodyfront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(93, 74).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, 0.0243F, -0.0205F, -0.5045F));

		PartDefinition cube_r85 = Bodyfront.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(62, 35).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0046F, -0.0119F, -1.5726F));

		PartDefinition cube_r86 = Bodyfront.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 37).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0099F, -0.0081F, -1.0489F));

		PartDefinition cube_r87 = Bodyfront.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(35, 63).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, 0.016F, -0.0237F, -0.5217F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(73, 61).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, -0.0058F, -0.0207F, -1.5899F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(59, 26).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, -0.0153F, -0.015F, -1.0663F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.1173F, 0.0437F, -0.6259F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, -0.0161F, 0.1005F, -1.6955F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.0365F, 0.095F, -1.1694F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.3619F, 0.2717F, -0.7262F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(77, 18).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.1263F, 0.4153F, -1.2856F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-2.3959F, 0.3879F, -0.5724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, 5.3574F, -2.7207F, -0.3236F, 0.1613F, 0.1869F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(49, 66).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4558F, 6.2936F, -0.8667F, -0.2592F, 0.186F, 0.0433F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 18).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5893F, -4.6934F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(90, 17).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.8476F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(49, 66).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4558F, 6.2936F, -0.8667F, -0.2592F, -0.186F, -0.0433F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(60, 57).addBox(-0.6041F, 0.3879F, -0.5724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2853F, 5.3574F, -2.7207F, -0.3236F, -0.1613F, -0.1869F));

		PartDefinition cube_r101 = Bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(46, 39).addBox(-0.5F, -0.9906F, -0.0423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.7476F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(77, 18).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.1263F, -0.4153F, 1.2856F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 95).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.3619F, -0.2717F, 0.7262F));

		PartDefinition cube_r104 = Bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(58, 66).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.0365F, -0.095F, 1.1694F));

		PartDefinition cube_r105 = Bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(95, 18).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, -0.0161F, -0.1005F, 1.6955F));

		PartDefinition cube_r106 = Bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(95, 16).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.1173F, -0.0437F, 0.6259F));

		PartDefinition cube_r107 = Bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(59, 26).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, -0.0153F, 0.015F, 1.0663F));

		PartDefinition cube_r108 = Bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(73, 61).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, -0.0058F, 0.0207F, 1.5899F));

		PartDefinition cube_r109 = Bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 63).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, 0.016F, 0.0237F, 0.5217F));

		PartDefinition cube_r110 = Bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 37).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0099F, 0.0081F, 1.0489F));

		PartDefinition cube_r111 = Bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(62, 35).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0046F, 0.0119F, 1.5726F));

		PartDefinition cube_r112 = Bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(93, 74).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, 0.0243F, 0.0205F, 0.5045F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2841F, 4.8039F, -3.7671F, 1.4128F, -0.0688F, -0.2543F));

		PartDefinition cube_r113 = Rightupperarm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(44, 89).addBox(-0.4405F, -0.2748F, -1.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(59, 22).addBox(-0.4405F, 0.0252F, -1.3982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8116F, 7.5004F, -2.0097F, 0.2192F, -0.0136F, -0.1565F));

		PartDefinition cube_r114 = Rightupperarm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(39, 92).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7666F, 0.1634F, -1.5796F, 0.8727F, 0.0F, -0.2007F));

		PartDefinition cube_r115 = Rightupperarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(71, 70).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8739F, -0.3641F, -0.6283F, 2.8362F, 0.0F, -0.2007F));

		PartDefinition cube_r116 = Rightupperarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(91, 81).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7818F, 0.0884F, -1.5153F, 2.0508F, 0.0F, -0.2007F));

		PartDefinition cube_r117 = Rightupperarm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(25, 73).addBox(-0.4474F, -1.2748F, -0.6545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8116F, 7.5004F, -2.0097F, -0.7816F, -0.0752F, -0.2184F));

		PartDefinition cube_r118 = Rightupperarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(16, 45).addBox(-0.4443F, -2.1279F, 0.1403F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8116F, 7.5004F, -2.0097F, -0.2151F, -0.0324F, -0.2417F));

		PartDefinition cube_r119 = Rightupperarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(73, 4).addBox(-0.453F, -1.7817F, -0.4781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8116F, 7.5004F, -2.0097F, -0.4772F, -0.0578F, -0.2219F));

		PartDefinition cube_r120 = Rightupperarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(75, 12).addBox(-0.5F, -2.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4747F, 6.1551F, -0.8138F, -0.0892F, 0.0181F, -0.2087F));

		PartDefinition cube_r121 = Rightupperarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 78).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.2804F, 2.7138F, -2.238F, 0.5217F, 0.0181F, -0.2087F));

		PartDefinition cube_r122 = Rightupperarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.2F, 0.7038F, -1.3114F, -0.0892F, 0.0181F, -0.2087F));

		PartDefinition cube_r123 = Rightupperarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(55, 53).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0237F, 3.8164F, -0.983F, -0.0455F, 0.0181F, -0.2087F));

		PartDefinition cube_r124 = Rightupperarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(62, 39).addBox(-0.5F, -3.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1779F, 3.0568F, -0.6598F, -0.3491F, 0.0F, -0.2007F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(69, 48).addBox(0.2F, -2.5242F, 0.4792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 70).addBox(0.2F, -2.5242F, 0.1791F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.0333F, 8.8737F, -2.956F, -1.8813F, 0.0574F, -0.1162F));

		PartDefinition cube_r125 = Rightlowerarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 79).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4F, 4.4347F, -1.0253F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r126 = Rightlowerarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 4.4347F, -1.0253F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r127 = Rightlowerarm.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(90, 20).addBox(-0.5023F, -0.111F, -0.9431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3977F, 3.723F, 0.0578F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r128 = Rightlowerarm.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(79, 39).addBox(-0.5023F, -0.0469F, -0.1774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3977F, 1.723F, -0.5422F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Rightlowerarm.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(79, 47).addBox(-0.5023F, -2.9183F, -0.0655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3977F, 2.923F, -0.5422F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Rightlowerarm.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(80, 59).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F))
				.texOffs(45, 80).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 6.0852F, 0.0726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r131 = Rightlowerarm.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -0.175F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(13, 28).addBox(-0.5F, -0.875F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.7F, 3.8132F, 0.8504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r132 = Rightlowerarm.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(85, 8).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 5.5301F, -0.4487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Rightlowerarm.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(40, 59).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 2.5049F, 0.3728F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Rightlowerarm.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(21, 67).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.6758F, 1.0792F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Rightlowerarm.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(61, 68).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.7F, -1.0242F, 0.1791F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r136 = Rightlowerarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, 0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(83, 35).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0979F))
				.texOffs(88, 78).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, -2.4242F, 1.3792F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(43, 8).addBox(-1.4F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2374F, -0.7926F, 1.4147F, -0.3995F, 0.1089F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.4F, -0.4859F, -4.0181F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.4201F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2841F, 4.8039F, -3.7671F, 0.1474F, 0.0688F, 0.2543F));

		PartDefinition cube_r137 = Leftupperarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(63, 89).addBox(-0.5595F, -0.2748F, -1.3982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(23, 59).addBox(-0.5595F, 0.0252F, -1.3982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.8116F, 7.5004F, -2.0097F, 0.2192F, 0.0136F, 0.1565F));

		PartDefinition cube_r138 = Leftupperarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(44, 92).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7666F, 0.1634F, -1.5796F, 0.8727F, 0.0F, 0.2007F));

		PartDefinition cube_r139 = Leftupperarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8739F, -0.3641F, -0.6283F, 2.8362F, 0.0F, 0.2007F));

		PartDefinition cube_r140 = Leftupperarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(34, 92).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7818F, 0.0884F, -1.5153F, 2.0508F, 0.0F, 0.2007F));

		PartDefinition cube_r141 = Leftupperarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 8).addBox(-0.5526F, -1.2748F, -0.6545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8116F, 7.5004F, -2.0097F, -0.7816F, 0.0752F, 0.2184F));

		PartDefinition cube_r142 = Leftupperarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(56, 68).addBox(-0.5557F, -2.1279F, 0.1403F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8116F, 7.5004F, -2.0097F, -0.2151F, 0.0324F, 0.2417F));

		PartDefinition cube_r143 = Leftupperarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(20, 73).addBox(-0.547F, -1.7817F, -0.4781F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8116F, 7.5004F, -2.0097F, -0.4772F, 0.0578F, 0.2219F));

		PartDefinition cube_r144 = Leftupperarm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(75, 21).addBox(-0.5F, -2.1F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4747F, 6.1551F, -0.8138F, -0.0892F, -0.0181F, 0.2087F));

		PartDefinition cube_r145 = Leftupperarm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2804F, 2.7138F, -2.238F, 0.5217F, -0.0181F, 0.2087F));

		PartDefinition cube_r146 = Leftupperarm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(78, 4).addBox(-1.0F, 0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2F, 0.7038F, -1.3114F, -0.0892F, -0.0181F, 0.2087F));

		PartDefinition cube_r147 = Leftupperarm.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(30, 56).addBox(-0.5F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0237F, 3.8164F, -0.983F, -0.0455F, -0.0181F, 0.2087F));

		PartDefinition cube_r148 = Leftupperarm.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 65).addBox(-0.5F, -3.3F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1779F, 3.0568F, -0.6598F, -0.3491F, 0.0F, 0.2007F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(70, 25).addBox(-1.2F, -2.5242F, 0.4792F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(66, 70).addBox(-1.2F, -2.5242F, 0.1791F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.0333F, 8.8737F, -2.956F, -1.19F, -0.2302F, -0.1386F));

		PartDefinition cube_r149 = Leftlowerarm.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(68, 79).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4F, 4.4347F, -1.0253F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Leftlowerarm.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 4.4347F, -1.0253F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Leftlowerarm.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(90, 23).addBox(-0.4977F, -0.111F, -0.9431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3977F, 3.723F, 0.0578F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Leftlowerarm.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(79, 43).addBox(-0.4977F, -0.0469F, -0.1774F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3977F, 1.723F, -0.5422F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Leftlowerarm.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(51, 79).addBox(-0.4977F, -2.9183F, -0.0655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3977F, 2.923F, -0.5422F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Leftlowerarm.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.114F))
				.texOffs(80, 74).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 6.0852F, 0.0726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Leftlowerarm.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.175F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(38, 67).addBox(-0.5F, -0.875F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.7F, 3.8132F, 0.8504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Leftlowerarm.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(34, 89).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 5.5301F, -0.4487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Leftlowerarm.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(45, 59).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 2.5049F, 0.3728F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Leftlowerarm.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(26, 67).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.6758F, 1.0792F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Leftlowerarm.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(69, 43).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.7F, -1.0242F, 0.1791F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Leftlowerarm.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(50, 83).addBox(-0.5F, 0.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(45, 83).addBox(-0.5F, -0.1F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0979F))
				.texOffs(89, 14).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, -2.4242F, 1.3792F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(43, 30).addBox(-1.6F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2374F, -0.7926F, 1.1342F, 0.0843F, 0.0225F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create().texOffs(15, 20).addBox(-1.6F, -0.4859F, -4.0181F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.1147F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(62, 45).addBox(-0.5F, 0.0811F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2914F, -6.5663F, -0.202F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Neck.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(0, 83).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0811F, -2.013F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Neck.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(53, 73).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6023F, -1.582F, 0.2878F, 0.6299F, -0.9705F));

		PartDefinition cube_r163 = Neck.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(53, 73).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6023F, -1.582F, 0.2878F, -0.6299F, 0.9705F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(7, 60).addBox(-0.5F, -0.5503F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6667F, -1.875F, -0.2893F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Neck2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(83, 0).addBox(0.0F, -2.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5503F, -1.476F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Neck2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0043F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r166 = Neck2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 59).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0043F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(14, 60).addBox(-0.5F, -0.9503F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 83).addBox(0.0F, -3.2503F, -1.976F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.0F, -0.1773F, -0.2188F, -0.1138F));

		PartDefinition cube_r167 = Neck3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3957F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r168 = Neck3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(36, 72).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3957F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(14, 64).addBox(-0.5F, -0.9503F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r169 = Neck4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(6, 95).addBox(0.0F, -1.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.9503F, -1.476F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Neck4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3957F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r171 = Neck4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(76, 37).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3957F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, 0.0497F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.0947F, -0.2555F, -0.0579F));

		PartDefinition cube_r172 = Neck5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(71, 30).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0497F, -1.476F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Neck5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(69, 57).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6043F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r174 = Neck5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(69, 57).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6043F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, 0.0497F, -1.976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1445F, -0.1446F, -0.3851F));

		PartDefinition cube_r175 = Neck6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(76, 57).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6043F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r176 = Neck6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(76, 57).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6043F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5574F, -1.1795F, 0.9759F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 92).addBox(-0.5F, -0.16F, -0.5789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.6615F, -10.8415F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -4.7709F, -10.7572F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -1.175F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.8369F, -4.504F, 0.1762F, 0.0309F, -0.1718F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(22, 44).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.3468F, -3.0793F, 1.0079F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(32, 7).addBox(-1.0F, -0.625F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.2151F, -1.239F, -0.3011F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(92, 59).addBox(-0.5F, -0.9631F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -5.0987F, -9.7078F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(33, 85).addBox(-0.5F, 0.0369F, -0.9515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.7299F, -8.0485F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(55, 33).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5019F, -7.0233F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(68, 63).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.536F, 0.979F, -1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(54, 30).addBox(-0.5F, -0.225F, -0.65F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.6629F, 0.5828F, -0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(87, 61).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(85, 25).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.0047F, 0.7533F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(74, 39).addBox(0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.2348F, -0.4637F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(36, 74).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -3.5521F, -1.412F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(48, 54).addBox(0.5F, 0.0F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.5521F, -1.412F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(41, 19).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -4.6792F, -4.1459F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(46, 44).addBox(-1.0F, -0.2097F, 1.0673F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4536F, -7.1212F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(58, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.5019F, -7.0233F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -1.8361F, -2.4097F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Lowerjaw1.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.0721F, -1.524F, -2.3216F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, 0.6671F, -0.3024F, 0.1108F));

		PartDefinition cube_r195 = Lowerjaw1.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 75).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.914F, 0.5295F, -1.7281F, -0.6419F, -0.3024F, 0.1108F));

		PartDefinition cube_r196 = Lowerjaw1.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(43, 12).mirror().addBox(-0.0721F, -1.6049F, -3.1935F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, 0.222F, -0.3024F, 0.1108F));

		PartDefinition cube_r197 = Lowerjaw1.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(46, 34).mirror().addBox(0.2366F, -0.1669F, -5.1543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(20, 81).mirror().addBox(0.2366F, -0.1669F, -5.9543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, -0.2121F, -0.229F, 0.0546F));

		PartDefinition cube_r198 = Lowerjaw1.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-0.4816F, -0.4989F, -0.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.4728F, 0.798F, -7.273F, -0.4303F, -0.165F, -0.0406F));

		PartDefinition cube_r199 = Lowerjaw1.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(84, 92).mirror().addBox(-0.5011F, -0.8931F, -0.5004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4728F, 0.798F, -7.273F, 1.1438F, -0.1411F, -0.0949F));

		PartDefinition cube_r200 = Lowerjaw1.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(1.8338F, -1.8048F, 0.1092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.2027F, -7.4661F, 1.2315F, -0.1323F, -0.1068F));

		PartDefinition cube_r201 = Lowerjaw1.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(59, 92).mirror().addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.3976F, 0.339F, -8.2106F, -3.0271F, -0.1323F, -0.1068F));

		PartDefinition cube_r202 = Lowerjaw1.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(29, 91).mirror().addBox(-0.4997F, -0.8214F, -0.4067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -0.2465F, -8.7783F, -2.8436F, -0.0563F, -0.0892F));

		PartDefinition cube_r203 = Lowerjaw1.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(91, 29).mirror().addBox(-0.4997F, -0.4024F, -0.857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -0.2465F, -8.7783F, -1.5171F, -0.0563F, -0.0892F));

		PartDefinition cube_r204 = Lowerjaw1.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(49, 68).mirror().addBox(-0.475F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7705F, -1.4356F, -8.6514F, -1.5436F, -0.0498F, -0.0797F));

		PartDefinition cube_r205 = Lowerjaw1.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(85, 11).mirror().addBox(0.7999F, 6.2208F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -1.8443F, -0.1544F, -0.0452F));

		PartDefinition cube_r206 = Lowerjaw1.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(31, 67).mirror().addBox(0.7999F, 5.5834F, 0.1192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -1.9316F, -0.1544F, -0.0452F));

		PartDefinition cube_r207 = Lowerjaw1.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-0.0538F, 5.0892F, 0.2129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -1.9833F, -0.2917F, 0.1006F));

		PartDefinition cube_r208 = Lowerjaw1.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.0538F, 4.5268F, -0.2119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -1.9135F, -0.2917F, 0.1006F));

		PartDefinition cube_r209 = Lowerjaw1.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-0.0594F, 3.9415F, -0.2582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -1.9142F, -0.2916F, 0.1357F));

		PartDefinition cube_r210 = Lowerjaw1.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.0594F, 3.3233F, 0.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9475F, 1.4777F, -0.7661F, -2.0014F, -0.2916F, 0.1357F));

		PartDefinition cube_r211 = Lowerjaw1.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-0.4997F, -0.7895F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, -0.2465F, -8.7783F, -0.8888F, -0.0563F, -0.0892F));

		PartDefinition cube_r212 = Lowerjaw1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(68, 14).mirror().addBox(1.8222F, -1.4086F, -2.0844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.2027F, -7.4661F, -0.3577F, -0.1308F, -0.099F));

		PartDefinition cube_r213 = Lowerjaw1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-0.5015F, 0.2158F, -0.736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, -1.8226F, -7.5535F, 0.8279F, 0.041F, 3.1153F));

		PartDefinition cube_r214 = Lowerjaw1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(79, 92).mirror().addBox(-0.5015F, -0.261F, -0.6357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, -1.8226F, -7.5535F, 0.6185F, 0.041F, 3.1153F));

		PartDefinition cube_r215 = Lowerjaw1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.5015F, -1.6141F, -0.5341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, -1.8226F, -7.5535F, 0.1996F, 0.041F, 3.1153F));

		PartDefinition cube_r216 = Lowerjaw1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.5015F, -1.7203F, -0.6332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.6378F, -1.8226F, -7.5535F, 0.3567F, 0.041F, 3.1153F));

		PartDefinition cube_r217 = Lowerjaw1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-0.5F, -1.075F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false)
				.texOffs(40, 80).mirror().addBox(-0.5F, -1.075F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.8894F, 2.553F, -2.5883F, 2.7774F, -0.2931F, 0.0846F));

		PartDefinition cube_r218 = Lowerjaw1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(49, 90).mirror().addBox(-0.097F, -1.1348F, 2.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, -2.7814F, -0.2931F, 0.0846F));

		PartDefinition cube_r219 = Lowerjaw1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(24, 33).mirror().addBox(-0.097F, 0.6595F, 1.4833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, -2.2578F, -0.2931F, 0.0846F));

		PartDefinition cube_r220 = Lowerjaw1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.4953F, -1.904F, -0.4905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false)
				.texOffs(0, 75).mirror().addBox(-0.4953F, -1.904F, -1.2905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-0.9328F, 1.7555F, -5.5186F, -2.0553F, -0.2965F, 0.0714F));

		PartDefinition cube_r221 = Lowerjaw1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(80, 8).mirror().addBox(-0.4893F, -0.096F, -0.5008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false)
				.texOffs(8, 90).mirror().addBox(-0.4893F, -0.096F, -1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-0.9328F, 1.7555F, -5.5186F, -2.0546F, -0.295F, 0.0364F));

		PartDefinition cube_r222 = Lowerjaw1.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-0.0939F, 5.2357F, 1.5873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.7725F, 1.4777F, -0.7661F, -2.1001F, -0.2931F, 0.0496F));

		PartDefinition cube_r223 = Lowerjaw1.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 34).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.7272F, 0.7974F, 0.7672F, 1.0598F, -0.3024F, 0.1108F));

		PartDefinition cube_r224 = Lowerjaw1.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-2.6885F, 1.5038F, 0.3937F, 2.2815F, -0.3024F, 0.1108F));

		PartDefinition cube_r225 = Lowerjaw1.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(50, 60).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.5668F, 2.0425F, -0.1851F, -2.8236F, -0.3024F, 0.1108F));

		PartDefinition cube_r226 = Lowerjaw1.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.3638F, 3.2488F, -1.2167F, 2.0357F, -0.2931F, 0.0846F));

		PartDefinition cube_r227 = Lowerjaw1.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(88, 75).mirror().addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2951F, 0.8735F, -8.5479F, -2.1981F, -0.1323F, -0.1068F));

		PartDefinition cube_r228 = Lowerjaw1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.646F, -0.3052F, -6.8801F, -0.5758F, -0.1308F, -0.099F));

		PartDefinition cube_r229 = Lowerjaw1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(-0.225F, -0.55F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6977F, -0.8261F, -9.1343F, -1.4563F, -0.0498F, -0.0797F));

		PartDefinition cube_r230 = Lowerjaw1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(85, 22).addBox(-0.9061F, 5.2357F, 1.5873F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, -2.1001F, 0.2931F, -0.0496F));

		PartDefinition cube_r231 = Lowerjaw1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(8, 90).addBox(-0.5107F, -0.096F, -1.1008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F))
				.texOffs(80, 8).addBox(-0.5107F, -0.096F, -0.5008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(0.7328F, 1.7555F, -5.5186F, -2.0546F, 0.295F, -0.0364F));

		PartDefinition cube_r232 = Lowerjaw1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5047F, -1.904F, -1.2905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F))
				.texOffs(60, 73).addBox(-0.5047F, -1.904F, -0.4905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(0.7328F, 1.7555F, -5.5186F, -2.0553F, 0.2965F, -0.0714F));

		PartDefinition cube_r233 = Lowerjaw1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(24, 33).addBox(-0.903F, 0.6595F, 1.4833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, -2.2578F, 0.2931F, -0.0846F));

		PartDefinition cube_r234 = Lowerjaw1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 90).addBox(-0.903F, -1.1348F, 2.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, -2.7814F, 0.2931F, -0.0846F));

		PartDefinition cube_r235 = Lowerjaw1.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(84, 16).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.1638F, 3.2488F, -1.2167F, 2.0357F, 0.2931F, -0.0846F));

		PartDefinition cube_r236 = Lowerjaw1.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -1.075F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F))
				.texOffs(10, 72).addBox(-0.5F, -1.075F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(1.6894F, 2.553F, -2.5883F, 2.7774F, 0.2931F, -0.0846F));

		PartDefinition cube_r237 = Lowerjaw1.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(80, 12).addBox(-0.4985F, -1.7203F, -0.6332F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4378F, -1.8226F, -7.5535F, 0.3567F, -0.041F, -3.1153F));

		PartDefinition cube_r238 = Lowerjaw1.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(15, 80).addBox(-0.4985F, -1.6141F, -0.5341F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4378F, -1.8226F, -7.5535F, 0.1996F, -0.041F, -3.1153F));

		PartDefinition cube_r239 = Lowerjaw1.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(79, 92).addBox(-0.4985F, -0.261F, -0.6357F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4378F, -1.8226F, -7.5535F, 0.6185F, -0.041F, -3.1153F));

		PartDefinition cube_r240 = Lowerjaw1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(90, 86).addBox(-0.4985F, 0.2158F, -0.736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.4378F, -1.8226F, -7.5535F, 0.8279F, -0.041F, -3.1153F));

		PartDefinition cube_r241 = Lowerjaw1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(30, 80).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.446F, -0.3052F, -6.8801F, -0.5758F, 0.1308F, 0.099F));

		PartDefinition cube_r242 = Lowerjaw1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(68, 14).addBox(-2.8222F, -1.4086F, -2.0844F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5725F, 1.2027F, -7.4661F, -0.3577F, 0.1308F, 0.099F));

		PartDefinition cube_r243 = Lowerjaw1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(90, 71).addBox(-0.5003F, -0.7895F, -0.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2697F, -0.2465F, -8.7783F, -0.8888F, 0.0563F, 0.0892F));

		PartDefinition cube_r244 = Lowerjaw1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(25, 81).addBox(-0.9406F, 3.3233F, 0.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -2.0014F, 0.2916F, -0.1357F));

		PartDefinition cube_r245 = Lowerjaw1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(85, 19).addBox(-0.9406F, 3.9415F, -0.2582F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -1.9142F, 0.2916F, -0.1357F));

		PartDefinition cube_r246 = Lowerjaw1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(7, 68).addBox(-0.9462F, 4.5268F, -0.2119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -1.9135F, 0.2917F, -0.1006F));

		PartDefinition cube_r247 = Lowerjaw1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(67, 53).addBox(-0.9462F, 5.0892F, 0.2129F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -1.9833F, 0.2917F, -0.1006F));

		PartDefinition cube_r248 = Lowerjaw1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(31, 67).addBox(-1.7999F, 5.5834F, 0.1192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -1.9316F, 0.1544F, 0.0452F));

		PartDefinition cube_r249 = Lowerjaw1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(85, 11).addBox(-1.7999F, 6.2208F, -0.5386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7475F, 1.4777F, -0.7661F, -1.8443F, 0.1544F, 0.0452F));

		PartDefinition cube_r250 = Lowerjaw1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(14, 68).addBox(-0.775F, -0.55F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4977F, -0.8261F, -9.1343F, -1.4563F, 0.0498F, 0.0797F));

		PartDefinition cube_r251 = Lowerjaw1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(49, 68).addBox(-0.525F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5705F, -1.4356F, -8.6514F, -1.5436F, 0.0498F, 0.0797F));

		PartDefinition cube_r252 = Lowerjaw1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(91, 29).addBox(-0.5003F, -0.4024F, -0.857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.2697F, -0.2465F, -8.7783F, -1.5171F, 0.0563F, 0.0892F));

		PartDefinition cube_r253 = Lowerjaw1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(29, 91).addBox(-0.5003F, -0.8214F, -0.4067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2697F, -0.2465F, -8.7783F, -2.8436F, 0.0563F, 0.0892F));

		PartDefinition cube_r254 = Lowerjaw1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(88, 75).addBox(-0.5F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0951F, 0.8735F, -8.5479F, -2.1981F, 0.1323F, 0.1068F));

		PartDefinition cube_r255 = Lowerjaw1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(59, 92).addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1976F, 0.339F, -8.2106F, -3.0271F, 0.1323F, 0.1068F));

		PartDefinition cube_r256 = Lowerjaw1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(71, 35).addBox(-2.8338F, -1.8048F, 0.1092F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(2.5725F, 1.2027F, -7.4661F, 1.2315F, 0.1323F, 0.1068F));

		PartDefinition cube_r257 = Lowerjaw1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(84, 92).addBox(-0.4989F, -0.8931F, -0.5004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2728F, 0.798F, -7.273F, 1.1438F, 0.1411F, 0.0949F));

		PartDefinition cube_r258 = Lowerjaw1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(80, 20).addBox(-0.5184F, -0.4989F, -0.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.2728F, 0.798F, -7.273F, -0.4303F, 0.165F, 0.0406F));

		PartDefinition cube_r259 = Lowerjaw1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(20, 81).addBox(-1.2366F, -0.1669F, -5.9543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(46, 34).addBox(-1.2366F, -0.1669F, -5.1543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, -0.2121F, 0.229F, -0.0546F));

		PartDefinition cube_r260 = Lowerjaw1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(43, 12).addBox(-0.9279F, -1.6049F, -3.1935F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, 0.222F, 0.3024F, -0.1108F));

		PartDefinition cube_r261 = Lowerjaw1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(65, 75).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.714F, 0.5295F, -1.7281F, -0.6419F, 0.3024F, -0.1108F));

		PartDefinition cube_r262 = Lowerjaw1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(50, 60).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.3668F, 2.0425F, -0.1851F, -2.8236F, 0.3024F, -0.1108F));

		PartDefinition cube_r263 = Lowerjaw1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(88, 53).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(2.4885F, 1.5038F, 0.3937F, 2.2815F, 0.3024F, -0.1108F));

		PartDefinition cube_r264 = Lowerjaw1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 34).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.5272F, 0.7974F, 0.7672F, 1.0598F, 0.3024F, -0.1108F));

		PartDefinition cube_r265 = Lowerjaw1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(32, 0).addBox(-0.9279F, -1.524F, -2.3216F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.5725F, 1.4777F, -0.7661F, 0.6671F, 0.3024F, -0.1108F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, 1.4777F, -0.7661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.3667F, -1.2203F, -0.5702F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(38, 86).addBox(-0.4177F, -0.881F, -2.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.779F, -2.2568F, -9.4053F, -0.1555F, 0.319F, -0.2006F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(76, 29).addBox(-0.5252F, -1.1512F, 1.5944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.0643F, 0.2911F, 0.0283F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(74, 66).addBox(-0.5252F, -1.297F, 0.9787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.1341F, 0.2911F, 0.0283F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(74, 51).addBox(-0.5252F, -1.4247F, 0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.2214F, 0.2911F, 0.0283F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(74, 47).addBox(-0.527F, -1.5966F, -0.3018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.3089F, 0.2935F, 0.0271F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(15, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6458F, -1.8272F, -7.8262F, -0.4211F, 0.0143F, 0.026F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8482F, -2.5433F, -10.3196F, -0.1564F, 0.3363F, -0.2035F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(54, 92).addBox(-0.5F, 0.209F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.6969F, -1.5031F, -9.155F, 0.0075F, -0.0214F, -0.0776F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 92).addBox(-0.5F, -0.2705F, -0.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.6969F, -1.5031F, -9.155F, -0.2019F, -0.0214F, -0.0776F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(73, 79).addBox(-0.5F, -1.6522F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.6969F, -1.5031F, -9.155F, -0.7081F, -0.0214F, -0.0776F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5F, -1.7326F, -0.6239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.6969F, -1.5031F, -9.155F, -0.4637F, -0.0214F, -0.0776F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(75, 75).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.6928F, -1.2632F, -7.2278F, -0.4754F, 0.2482F, -0.0895F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(43, 24).addBox(-1.0259F, -1.2975F, -2.8798F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.266F, 0.2482F, -0.0895F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(61, 11).addBox(-0.6722F, 0.1685F, -0.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7152F, -1.5922F, -3.591F, -0.233F, 0.0736F, -0.047F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(16, 50).addBox(-1.0265F, -1.6587F, -3.5173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.3619F, 0.2484F, -0.089F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(46, 49).addBox(-1.0265F, -1.2388F, -3.3538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.231F, 0.2484F, -0.089F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(80, 26).addBox(-0.4072F, -0.5288F, -0.7653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.8862F, -3.218F, -10.0756F, -0.2009F, 0.676F, -0.1568F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(80, 23).addBox(-0.4072F, -0.4173F, -0.7802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8862F, -3.218F, -10.0756F, -0.3754F, 0.676F, -0.1568F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 57).addBox(0.2365F, -1.8152F, -2.6215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5271F, -1.2538F, -7.0978F, -0.532F, 0.0012F, -0.0896F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(64, 92).addBox(-0.4255F, -0.5572F, -0.246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.8862F, -3.218F, -10.0756F, -0.1124F, 0.1133F, -0.0233F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(86, 31).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8391F, -2.7872F, -10.4092F, -0.1997F, 0.1133F, -0.0233F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(21, 63).addBox(-1.0634F, -0.5472F, 0.1055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2639F, -3.6001F, -9.6728F, -0.4639F, -0.0532F, 0.0816F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(86, 28).addBox(-0.5F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.9276F, -2.5341F, -9.4789F, -0.5948F, -0.0532F, 0.0816F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(91, 26).addBox(-1.0F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(91, 0).addBox(-1.0F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4524F, -3.9537F, -8.8239F, -0.2483F, 0.1958F, -0.0611F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 0).addBox(-0.6539F, -0.0865F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8069F, -4.1652F, -7.9764F, -0.2435F, -0.0074F, -0.01F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(62, 49).addBox(0.2585F, -2.662F, -1.4997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5271F, -1.2538F, -7.0978F, -0.2795F, 0.1474F, -0.0387F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(55, 48).addBox(-0.5F, -0.375F, -3.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9473F, -3.1174F, -4.0226F, -0.2957F, 0.3422F, -0.1254F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 89).addBox(-0.8661F, 0.1396F, -1.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7706F, -2.8027F, -4.6786F, -1.4123F, 0.2098F, -0.168F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(88, 89).addBox(-0.8661F, -1.0383F, -0.6381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7706F, -2.8027F, -4.6786F, -0.2778F, 0.2098F, -0.168F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 89).addBox(-0.8661F, -0.041F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7706F, -2.8027F, -4.6786F, 0.0276F, 0.2098F, -0.168F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(89, 46).addBox(-0.8661F, -1.0965F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7706F, -2.8027F, -4.6786F, -0.5396F, 0.2098F, -0.168F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(15, 72).addBox(-0.3111F, -1.1562F, 0.3277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6554F, -1.8007F, -2.214F, -0.7474F, -0.73F, 0.4726F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1468F, 0.3484F, 0.1959F, -0.5226F, -0.7642F, 1.7335F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(70, 75).addBox(-0.2151F, -1.3041F, -0.1011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.559F, 0.1289F, -0.2672F, -1.4747F, -0.6215F, 2.02F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(55, 43).addBox(0.1512F, -1.534F, 0.2528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.559F, 0.1289F, -0.2672F, -2.1389F, -0.4527F, 2.5279F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(74, 43).addBox(-0.313F, -1.0603F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6554F, -1.8007F, -2.214F, -0.5288F, -0.737F, 0.4654F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(57, 60).addBox(-1.4349F, -1.0722F, -1.2422F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.6554F, -1.8007F, -2.214F, -0.6678F, -0.996F, 0.7196F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(71, 83).addBox(-1.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1982F, -1.1868F, -2.4674F, -0.1876F, 0.0873F, 0.0F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(60, 53).addBox(-0.5128F, 0.3928F, -1.6704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6989F, -1.6458F, -3.4582F, -0.4497F, 0.286F, -0.1687F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(61, 15).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.5189F, -0.9858F, -4.8555F, 2.7976F, 0.3277F, -0.2793F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(81, 83).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.4333F, -1.8106F, -4.0859F, 1.5206F, 0.4097F, -0.3113F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(13, 84).addBox(-0.834F, -0.1729F, 0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(0.1008F, -1.8029F, -3.759F, 1.7388F, 0.4097F, -0.4684F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(8, 84).addBox(-0.834F, -0.6556F, 0.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.1008F, -1.8029F, -3.759F, 1.1716F, 0.4097F, -0.4684F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(3, 84).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(-0.0992F, -1.8029F, -3.359F, 2.2624F, 0.4097F, -0.3113F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(83, 80).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0992F, -1.8029F, -3.359F, 3.0042F, 0.4097F, -0.3113F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.2798F, -1.5648F, -2.6959F, -2.0137F, 0.4097F, -0.3113F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(76, 83).addBox(-0.2225F, -0.9394F, -0.7263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(66, 83).addBox(-0.2225F, -0.9394F, 0.0737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.4003F, -0.5102F, -2.4791F, -0.5301F, 0.4097F, -0.3113F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(56, 81).addBox(-1.7603F, -1.6064F, -1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.5483F, -0.529F, -0.948F, 2.1702F, 1.1026F, -0.2397F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(81, 32).addBox(-1.9941F, -0.695F, -1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5483F, -0.529F, -0.948F, 1.8399F, 0.2923F, -0.708F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(35, 82).addBox(-0.8592F, -0.695F, -1.6213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5483F, -0.529F, -0.948F, 1.9654F, 0.007F, 0.0826F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(81, 29).addBox(-0.8592F, -0.1502F, -0.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(1.5483F, -0.529F, -0.948F, 0.6564F, 0.007F, 0.0826F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(29, 88).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0007F, -1.216F, 1.7441F, -0.1122F, 0.2301F, 0.7216F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(88, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8667F, -1.7844F, 1.3235F, -0.1287F, 0.074F, 0.5188F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(81, 69).addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0397F, -0.9499F, -1.4477F, -0.6548F, 0.1876F, -0.1073F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(41, 54).addBox(-0.7968F, -1.4937F, -0.2225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.559F, 0.1289F, -0.2672F, -2.9051F, 0.7345F, -1.143F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(55, 38).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0606F, -4.2553F, -6.7174F, -0.2122F, 0.1758F, -0.0092F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(9, 55).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0667F, -2.3319F, -1.2418F, -0.0834F, -0.7488F, 0.0569F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7793F, -1.1299F, -5.1142F, 0.0F, -0.0218F, 0.0F));

		PartDefinition cube_r323 = bone3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(85, 72).addBox(-0.4997F, -0.0072F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.2358F, -1.4881F, 0.2325F, -1.5695F, 0.2772F, -0.1449F));

		PartDefinition cube_r324 = bone3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(85, 58).addBox(-0.4997F, -0.4833F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2358F, -1.4881F, 0.2325F, -0.6532F, 0.2772F, -0.1449F));

		PartDefinition cube_r325 = bone3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(61, 83).addBox(-0.5947F, -0.2992F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(82, 62).addBox(-0.5947F, -0.7717F, -0.4579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2358F, -1.4881F, 0.2325F, -0.0802F, 0.2811F, -0.1573F));

		PartDefinition cube_r326 = bone3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(83, 55).addBox(-0.5947F, -0.6765F, -0.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2358F, -1.4881F, 0.2325F, -0.5166F, 0.2811F, -0.1573F));

		PartDefinition cube_r327 = bone3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(83, 5).addBox(-0.4947F, -1.0587F, -0.2259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2358F, -1.4881F, 0.2325F, -0.822F, 0.2811F, -0.1573F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.3667F, -1.2203F, -0.5702F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(38, 86).mirror().addBox(-0.5823F, -0.881F, -2.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.779F, -2.2568F, -9.4053F, -0.1555F, -0.319F, 0.2006F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-0.4748F, -1.1512F, 1.5944F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.0643F, -0.2911F, -0.0283F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-0.4748F, -1.297F, 0.9787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.1341F, -0.2911F, -0.0283F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(74, 51).mirror().addBox(-0.4748F, -1.4247F, 0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.2214F, -0.2911F, -0.0283F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.473F, -1.5966F, -0.3018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.3089F, -0.2935F, -0.0271F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6458F, -1.8272F, -7.8262F, -0.4211F, -0.0143F, -0.026F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(10, 76).mirror().addBox(-0.5F, -1.15F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8482F, -2.5433F, -10.3196F, -0.1564F, -0.3363F, 0.2035F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(54, 92).mirror().addBox(-0.5F, 0.209F, -0.7222F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.6969F, -1.5031F, -9.155F, 0.0075F, 0.0214F, 0.0776F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(69, 92).mirror().addBox(-0.5F, -0.2705F, -0.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.6969F, -1.5031F, -9.155F, -0.2019F, 0.0214F, 0.0776F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(73, 79).mirror().addBox(-0.5F, -1.6522F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.6969F, -1.5031F, -9.155F, -0.7081F, 0.0214F, 0.0776F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.5F, -1.7326F, -0.6239F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.6969F, -1.5031F, -9.155F, -0.4637F, 0.0214F, 0.0776F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(75, 75).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.6928F, -1.2632F, -7.2278F, -0.4754F, -0.2482F, 0.0895F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(43, 24).mirror().addBox(0.0259F, -1.2975F, -2.8798F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.266F, -0.2482F, 0.0895F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(61, 11).mirror().addBox(-0.3278F, 0.1685F, -0.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7152F, -1.5922F, -3.591F, -0.233F, -0.0736F, 0.047F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(16, 50).mirror().addBox(0.0265F, -1.6587F, -3.5173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.3619F, -0.2484F, 0.089F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(46, 49).mirror().addBox(0.0265F, -1.2388F, -3.3538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.231F, -0.2484F, 0.089F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(80, 26).mirror().addBox(-0.5929F, -0.5288F, -0.7653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.8862F, -3.218F, -10.0756F, -0.2009F, -0.676F, 0.1568F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(80, 23).mirror().addBox(-0.5929F, -0.4173F, -0.7802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8862F, -3.218F, -10.0756F, -0.3754F, -0.676F, 0.1568F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.2365F, -1.8152F, -2.6215F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5271F, -1.2538F, -7.0978F, -0.532F, -0.0012F, 0.0896F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(64, 92).mirror().addBox(-0.5745F, -0.5572F, -0.246F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.8862F, -3.218F, -10.0756F, -0.1124F, -0.1133F, 0.0233F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8391F, -2.7872F, -10.4092F, -0.1997F, -0.1133F, 0.0233F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(0.0634F, -0.5472F, 0.1055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2639F, -3.6001F, -9.6728F, -0.4639F, 0.0532F, -0.0816F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(86, 28).mirror().addBox(-0.5F, -1.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9276F, -2.5341F, -9.4789F, -0.5948F, 0.0532F, -0.0816F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(91, 26).mirror().addBox(0.0F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(91, 0).mirror().addBox(0.0F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4524F, -3.9537F, -8.8239F, -0.2483F, -0.1958F, 0.0611F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.3461F, -0.0865F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8069F, -4.1652F, -7.9764F, -0.2435F, 0.0074F, 0.01F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(62, 49).mirror().addBox(-1.2585F, -2.662F, -1.4997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5271F, -1.2538F, -7.0978F, -0.2795F, -0.1474F, 0.0387F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-0.5F, -0.375F, -3.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -3.1174F, -4.0226F, -0.2957F, -0.3422F, 0.1254F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-0.1339F, 0.1396F, -1.2107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7706F, -2.8027F, -4.6786F, -1.4123F, -0.2098F, 0.168F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.1339F, -1.0383F, -0.6381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7706F, -2.8027F, -4.6786F, -0.2778F, -0.2098F, 0.168F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(58, 89).mirror().addBox(-0.1339F, -0.041F, 0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7706F, -2.8027F, -4.6786F, 0.0276F, -0.2098F, 0.168F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(89, 46).mirror().addBox(-0.1339F, -1.0965F, 0.0808F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7706F, -2.8027F, -4.6786F, -0.5396F, -0.2098F, 0.168F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.689F, -1.1562F, 0.3277F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6554F, -1.8007F, -2.214F, -0.7474F, 0.73F, -0.4726F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1468F, 0.3484F, 0.1959F, -0.5226F, 0.7642F, -1.7335F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(70, 75).mirror().addBox(-0.7849F, -1.3041F, -0.1011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.559F, 0.1289F, -0.2672F, -1.4747F, 0.6215F, -2.02F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-1.1512F, -1.534F, 0.2528F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.559F, 0.1289F, -0.2672F, -2.1389F, 0.4527F, -2.5279F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-0.687F, -1.0603F, -0.4099F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6554F, -1.8007F, -2.214F, -0.5288F, 0.737F, -0.4654F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(57, 60).mirror().addBox(-0.5651F, -1.0722F, -1.2422F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.6554F, -1.8007F, -2.214F, -0.6678F, 0.996F, -0.7196F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(0.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1982F, -1.1868F, -2.4674F, -0.1876F, -0.0873F, 0.0F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(60, 53).mirror().addBox(-0.4873F, 0.3928F, -1.6704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, -1.6458F, -3.4582F, -0.4497F, -0.286F, 0.1687F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.5189F, -0.9858F, -4.8555F, 2.7976F, -0.3277F, 0.2793F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.4333F, -1.8106F, -4.0859F, 1.5206F, -0.4097F, 0.3113F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(13, 84).mirror().addBox(-0.166F, -0.1729F, 0.5864F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-0.1008F, -1.8029F, -3.759F, 1.7388F, -0.4097F, 0.4684F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(8, 84).mirror().addBox(-0.166F, -0.6556F, 0.0696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-0.1008F, -1.8029F, -3.759F, 1.1716F, -0.4097F, 0.4684F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(3, 84).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(0.0992F, -1.8029F, -3.359F, 2.2624F, -0.4097F, 0.3113F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0992F, -1.8029F, -3.359F, 3.0042F, -0.4097F, 0.3113F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.2798F, -1.5648F, -2.6959F, -2.0137F, -0.4097F, 0.3113F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-0.7775F, -0.9394F, -0.7263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(66, 83).mirror().addBox(-0.7775F, -0.9394F, 0.0737F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.4003F, -0.5102F, -2.4791F, -0.5301F, -0.4097F, 0.3113F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(0.7603F, -1.6064F, -1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.5483F, -0.529F, -0.948F, 2.1702F, -1.1026F, 0.2397F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(81, 32).mirror().addBox(0.9941F, -0.695F, -1.1578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5483F, -0.529F, -0.948F, 1.8399F, -0.2923F, 0.708F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.1408F, -0.695F, -1.6213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5483F, -0.529F, -0.948F, 1.9654F, -0.007F, -0.0826F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-0.1408F, -0.1502F, -0.8887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-1.5483F, -0.529F, -0.948F, 0.6564F, -0.007F, -0.0826F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(29, 88).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.0007F, -1.216F, 1.7441F, -0.1122F, -0.2301F, -0.7216F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(88, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8667F, -1.7844F, 1.3235F, -0.1287F, -0.074F, -0.5188F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-0.5F, -0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0397F, -0.9499F, -1.4477F, -0.6548F, -0.1876F, 0.1073F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(41, 54).mirror().addBox(-0.2032F, -1.4937F, -0.2225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.559F, 0.1289F, -0.2672F, -2.9051F, -0.7345F, 1.143F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0606F, -4.2553F, -6.7174F, -0.2122F, -0.1758F, 0.0092F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(9, 55).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0667F, -2.3319F, -1.2418F, -0.0834F, 0.7488F, -0.0569F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7793F, -1.1299F, -5.1142F, 0.0F, 0.0218F, 0.0F));

		PartDefinition cube_r385 = bone5.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(85, 72).mirror().addBox(-0.5003F, -0.0072F, -0.2102F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(0.2358F, -1.4881F, 0.2325F, -1.5695F, -0.2772F, 0.1449F));

		PartDefinition cube_r386 = bone5.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(85, 58).mirror().addBox(-0.5003F, -0.4833F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2358F, -1.4881F, 0.2325F, -0.6532F, -0.2772F, 0.1449F));

		PartDefinition cube_r387 = bone5.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(61, 83).mirror().addBox(-0.4053F, -0.2992F, -0.329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(82, 62).mirror().addBox(-0.4053F, -0.7717F, -0.4579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.2358F, -1.4881F, 0.2325F, -0.0802F, -0.2811F, 0.1573F));

		PartDefinition cube_r388 = bone5.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(83, 55).mirror().addBox(-0.4053F, -0.6765F, -0.0598F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.2358F, -1.4881F, 0.2325F, -0.5166F, -0.2811F, 0.1573F));

		PartDefinition cube_r389 = bone5.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(83, 5).mirror().addBox(-0.5053F, -1.0587F, -0.2259F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2358F, -1.4881F, 0.2325F, -0.822F, -0.2811F, 0.1573F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8367F, 1.3744F, -3.1373F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r390 = bone.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(90, 56).addBox(-0.2373F, -1.1138F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1779F, 3.638F, -1.3388F, -1.9275F, 0.4558F, 0.1461F));

		PartDefinition cube_r391 = bone.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(90, 6).addBox(-0.2373F, -1.5348F, 0.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.1779F, 3.638F, -1.3388F, -1.273F, 0.4558F, 0.1461F));

		PartDefinition cube_r392 = bone.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(91, 67).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5542F, 3.7089F, -1.1552F, -1.6948F, 0.4971F, 0.0827F));

		PartDefinition cube_r393 = bone.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(21, 90).addBox(-0.2373F, -1.4636F, -0.5644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1779F, 3.638F, -1.3388F, -1.0985F, 0.4558F, 0.1461F));

		PartDefinition cube_r394 = bone.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(67, 39).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4712F, 2.5754F, -1.7705F, -3.1206F, 0.4645F, -0.0268F));

		PartDefinition cube_r395 = bone.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(3, 87).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0679F, 1.7556F, -1.4362F, -2.6857F, 0.29F, -0.0306F));

		PartDefinition cube_r396 = bone.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(31, 71).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5756F, -0.5075F, -2.7312F, -2.7552F, 0.3795F, -0.2414F));

		PartDefinition cube_r397 = bone.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(85, 86).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-0.91F, -1.4093F, -3.0049F, -1.2717F, 0.3795F, -0.2414F));

		PartDefinition cube_r398 = bone.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(86, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.1468F, -2.3809F, -2.999F, -0.0063F, 0.3795F, -0.2414F));

		PartDefinition cube_r399 = bone.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(52, 22).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7246F, -3.4243F, -1.3458F, 0.4736F, 0.3795F, -0.2414F));

		PartDefinition cube_r400 = bone.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(53, 75).addBox(-0.7963F, -2.015F, -0.9771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.1714F, -3.7782F, 0.2477F, 2.5593F, 0.3795F, -0.2414F));

		PartDefinition cube_r401 = bone.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(55, 84).addBox(-0.7963F, -0.015F, -0.9771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)), PartPose.offsetAndRotation(-0.2193F, -3.8318F, -0.6712F, 1.4248F, 0.3795F, -0.2414F));

		PartDefinition cube_r402 = bone.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(75, 25).addBox(-0.7963F, -0.04F, -0.0521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.4526F, -3.4378F, -1.4753F, 0.334F, 0.3795F, -0.2414F));

		PartDefinition cube_r403 = bone.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(35, 56).addBox(-0.676F, -4.0728F, -1.3929F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, 0.0809F, 0.3795F, -0.2414F));

		PartDefinition cube_r404 = bone.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(67, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0984F, -1.7731F, -0.3321F, 1.3638F, 0.3795F, -0.2414F));

		PartDefinition cube_r405 = bone.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(68, 10).addBox(-0.5F, -0.25F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1358F, -0.5717F, -0.961F, 1.0147F, 0.3795F, -0.2414F));

		PartDefinition cube_r406 = bone.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(68, 89).addBox(-0.1672F, 0.6067F, -1.2712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1779F, 3.638F, -1.3388F, -3.1245F, 0.4465F, 0.0131F));

		PartDefinition cube_r407 = bone.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(90, 9).addBox(-0.2463F, -0.1683F, -0.1782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1779F, 3.638F, -1.3388F, 1.5518F, 0.5153F, 0.1281F));

		PartDefinition bone6 = Bodyfront.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8367F, 1.3744F, -3.1373F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r408 = bone6.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(90, 56).mirror().addBox(-0.7627F, -1.1138F, -0.4237F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1779F, 3.638F, -1.3388F, -1.9275F, -0.4558F, -0.1461F));

		PartDefinition cube_r409 = bone6.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-0.7627F, -1.5348F, 0.1585F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.1779F, 3.638F, -1.3388F, -1.273F, -0.4558F, -0.1461F));

		PartDefinition cube_r410 = bone6.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(91, 67).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5542F, 3.7089F, -1.1552F, -1.6948F, -0.4971F, -0.0827F));

		PartDefinition cube_r411 = bone6.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(21, 90).mirror().addBox(-0.7627F, -1.4636F, -0.5644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1779F, 3.638F, -1.3388F, -1.0985F, -0.4558F, -0.1461F));

		PartDefinition cube_r412 = bone6.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(67, 39).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4712F, 2.5754F, -1.7705F, -3.1206F, -0.4645F, 0.0268F));

		PartDefinition cube_r413 = bone6.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(3, 87).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0679F, 1.7556F, -1.4362F, -2.6857F, -0.29F, 0.0306F));

		PartDefinition cube_r414 = bone6.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(31, 71).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5756F, -0.5075F, -2.7312F, -2.7552F, -0.3795F, 0.2414F));

		PartDefinition cube_r415 = bone6.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(0.91F, -1.4093F, -3.0049F, -1.2717F, -0.3795F, 0.2414F));

		PartDefinition cube_r416 = bone6.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(86, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.1468F, -2.3809F, -2.999F, -0.0063F, -0.3795F, 0.2414F));

		PartDefinition cube_r417 = bone6.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(52, 22).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7246F, -3.4243F, -1.3458F, 0.4736F, -0.3795F, 0.2414F));

		PartDefinition cube_r418 = bone6.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(53, 75).mirror().addBox(-0.2037F, -2.015F, -0.9771F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1714F, -3.7782F, 0.2477F, 2.5593F, -0.3795F, 0.2414F));

		PartDefinition cube_r419 = bone6.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.2037F, -0.015F, -0.9771F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0153F)).mirror(false), PartPose.offsetAndRotation(0.2193F, -3.8318F, -0.6712F, 1.4248F, -0.3795F, 0.2414F));

		PartDefinition cube_r420 = bone6.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(75, 25).mirror().addBox(-0.2037F, -0.04F, -0.0521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.4526F, -3.4378F, -1.4753F, 0.334F, -0.3795F, 0.2414F));

		PartDefinition cube_r421 = bone6.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(35, 56).mirror().addBox(-0.324F, -4.0728F, -1.3929F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, 0.0809F, -0.3795F, 0.2414F));

		PartDefinition cube_r422 = bone6.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(67, 66).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0984F, -1.7731F, -0.3321F, 1.3638F, -0.3795F, 0.2414F));

		PartDefinition cube_r423 = bone6.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-0.5F, -0.25F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.5717F, -0.961F, 1.0147F, -0.3795F, 0.2414F));

		PartDefinition cube_r424 = bone6.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(68, 89).mirror().addBox(-0.8328F, 0.6067F, -1.2712F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1779F, 3.638F, -1.3388F, -3.1245F, -0.4465F, -0.0131F));

		PartDefinition cube_r425 = bone6.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.7537F, -0.1683F, -0.1782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1779F, 3.638F, -1.3388F, 1.5518F, -0.5153F, -0.1281F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.125F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r426 = body5.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 88).addBox(0.0F, -1.9802F, 0.0012F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r427 = body5.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(66, 21).mirror().addBox(-2.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4153F, 5.6415F, -1.9858F, -0.1963F, 0.2849F, -0.2236F));

		PartDefinition cube_r428 = body5.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(95, 11).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, -0.0524F, -0.0622F, -0.4489F));

		PartDefinition cube_r429 = body5.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, -0.0539F, -0.0834F, -0.9946F));

		PartDefinition cube_r430 = body5.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.4983F, -0.5851F, -0.0049F, -0.0992F, -1.5202F));

		PartDefinition cube_r431 = body5.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(30, 54).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, -0.0049F, 0.0992F, 1.5202F));

		PartDefinition cube_r432 = body5.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(66, 23).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, -0.0539F, 0.0834F, 0.9946F));

		PartDefinition cube_r433 = body5.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(95, 11).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4983F, -0.5851F, -0.0524F, 0.0622F, 0.4489F));

		PartDefinition cube_r434 = body5.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(0, 41).addBox(-1.4607F, -1.0493F, -0.1203F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.9607F, 6.0711F, -4.3229F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r435 = body5.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(66, 21).addBox(-0.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4153F, 5.6415F, -1.9858F, -0.1963F, -0.2849F, 0.2236F));

		PartDefinition cube_r436 = body5.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3403F, 4.3212F, -0.7079F, 0.4996F, 0.0763F, -0.2349F));

		PartDefinition cube_r437 = Rightthigh.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(65, 86).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 8.3556F, -0.6486F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Rightthigh.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(60, 86).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 8.1522F, -0.7089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Rightthigh.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 8.2267F, 0.4369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Rightthigh.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(48, 86).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 6.9901F, 0.1576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Rightthigh.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(25, 50).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.2F, 0.6076F, 0.2743F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Rightthigh.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(43, 86).addBox(-0.4842F, 0.092F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1842F, 0.1842F, 0.4462F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Rightthigh.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(84, 41).addBox(-0.4842F, 0.2333F, -0.4633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1842F, 0.1842F, 0.4462F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Rightthigh.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(73, 89).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Rightthigh.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(89, 49).addBox(-0.4842F, -1.2166F, -0.3374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1842F, 0.1842F, 0.4462F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Rightthigh.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(84, 38).addBox(-0.4842F, -0.5387F, -0.5867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1842F, 0.1842F, 0.4462F, -2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Rightthigh.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(21, 84).addBox(-0.4842F, -0.2586F, -0.7829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1842F, 0.1842F, 0.4462F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3138F, 8.8023F, 0.4881F, 1.2493F, -0.0925F, 0.1499F));

		PartDefinition cube_r448 = Rightshin.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(36, 44).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Rightshin.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(31, 44).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(43, 0).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0005F, 8.3351F, 0.1951F, 0.7912F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(17, 8).mirror().addBox(-1.5092F, -0.7F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, 0.2934F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3403F, 4.3212F, -0.7079F, 0.0633F, 0.0982F, 0.2383F));

		PartDefinition cube_r450 = Leftthigh.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(89, 43).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 8.3556F, -0.6486F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Leftthigh.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(89, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 8.1522F, -0.7089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Leftthigh.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(20, 77).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, 8.2267F, 0.4369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Leftthigh.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(39, 89).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 6.9901F, 0.1576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Leftthigh.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2F, 0.6076F, 0.2743F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Leftthigh.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(89, 37).addBox(-0.5158F, 0.092F, -0.7446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1842F, 0.1842F, 0.4462F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Leftthigh.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(84, 50).addBox(-0.5158F, 0.2333F, -0.4633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1842F, 0.1842F, 0.4462F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Leftthigh.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(78, 89).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Leftthigh.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(89, 64).addBox(-0.5158F, -1.2166F, -0.3374F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1842F, 0.1842F, 0.4462F, -2.138F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Leftthigh.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(84, 47).addBox(-0.5158F, -0.5387F, -0.5867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1842F, 0.1842F, 0.4462F, -2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Leftthigh.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(84, 44).addBox(-0.5158F, -0.2586F, -0.7829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1842F, 0.1842F, 0.4462F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3138F, 8.8023F, 0.4881F, 1.1621F, 0.0925F, -0.1499F));

		PartDefinition cube_r461 = Leftshin.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(11, 45).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Leftshin.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(41, 44).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(43, 4).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0005F, 8.3351F, 0.1951F, -0.0378F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(17, 14).addBox(-1.5F, -0.7F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.3611F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(24, 38).addBox(-0.5F, -0.4588F, -0.0143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 94).addBox(0.0F, -1.5588F, -0.0143F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, 0.0446F, -0.0869F, 0.0075F));

		PartDefinition cube_r463 = Tail1.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(38, 95).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4588F, 1.9857F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Tail1.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(95, 20).addBox(0.0F, 1.0F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0412F, 0.4857F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.5532F, -0.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.172F, -0.0872F, -0.0036F));

		PartDefinition cube_r465 = Tail2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(35, 95).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, 1.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Tail2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(32, 95).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, -0.0142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Tail2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(17, 94).addBox(0.0F, 3.6F, 5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 76).addBox(0.0F, 2.3F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9429F, -3.4407F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(52, 12).addBox(-0.5F, -1.0119F, 0.097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.455F, 3.8928F, 0.1527F, -0.1294F, -0.0199F));

		PartDefinition cube_r468 = Tail3.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(53, 95).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(50, 95).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.0082F, -1.907F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Tail3.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(95, 23).addBox(0.0F, 5.5F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4937F, -7.2581F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(32, 26).addBox(-0.5F, -0.815F, 0.0617F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1718F, 2.9832F, 0.0911F, -0.1304F, -0.0119F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(32, 32).addBox(-0.5F, -0.1204F, -0.0249F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6973F, 3.9901F, 0.1193F, -0.2167F, -0.0258F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3973F, 3.8535F, 0.3516F, -0.2325F, -0.1374F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.187F, -0.0858F, -0.0162F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.8313F, -0.0819F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2894F, 4.8784F, 0.132F, -0.1298F, -0.0172F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5F, -0.1176F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7136F, 4.8965F, -0.134F, -0.2163F, 0.0289F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6794F, 4.7249F, -0.0063F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition cube_r470 = bone4.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(7, 64).addBox(-0.5F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7316F, -2.9823F, -0.6102F, 0.8575F, 0.0217F, 0.1353F));

		PartDefinition cube_r471 = bone4.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(63, 28).addBox(-0.4755F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, 0.203F, 0.0217F, 0.1353F));

		PartDefinition cube_r472 = bone4.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(46, 76).addBox(-0.6F, -2.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.871F, -3.1329F, -0.3029F, 1.4323F, 0.0182F, 0.1296F));

		PartDefinition cube_r473 = bone4.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(28, 63).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.863F, -3.5655F, 0.7671F, 0.4137F, 0.0422F, 0.1276F));

		PartDefinition cube_r474 = bone4.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(76, 70).addBox(-0.5F, -0.725F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7144F, -2.7842F, -2.2468F, 0.9948F, 0.0F, 0.1047F));

		PartDefinition cube_r475 = bone4.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5F, -0.525F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.7239F, -2.8748F, -2.7384F, 1.3875F, 0.0F, 0.1047F));

		PartDefinition cube_r476 = bone4.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(76, 33).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8288F, -3.8729F, -2.5059F, 1.0821F, 0.0F, 0.1047F));

		PartDefinition cube_r477 = bone4.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(8, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9059F, -4.606F, -3.6917F, 1.5097F, 0.0F, 0.1047F));

		PartDefinition cube_r478 = bone4.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(13, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.7657F, -3.2722F, -4.1404F, -0.2793F, 0.0F, 0.1047F));

		PartDefinition cube_r479 = bone4.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(80, 86).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.8311F, -3.8946F, -3.8938F, 0.4625F, 0.0F, 0.1047F));

		PartDefinition cube_r480 = bone4.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -1.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5274F, -1.3556F, -1.5145F, -0.925F, 0.0F, 0.1309F));

		PartDefinition cube_r481 = bone4.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(70, 86).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5773F, -1.7347F, -0.6315F, -0.096F, 0.0F, 0.1309F));

		PartDefinition cube_r482 = bone4.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(86, 68).addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5941F, -1.8619F, -1.7147F, 0.384F, 0.0F, 0.1309F));

		PartDefinition cube_r483 = bone4.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(66, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0449F, -1.3425F, 4.3349F, -2.7771F, -0.1172F, 0.3295F));

		PartDefinition cube_r484 = bone4.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(53, 87).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3396F, -0.4081F, 4.1349F, -1.7736F, -0.1172F, 0.3295F));

		PartDefinition cube_r485 = bone4.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5572F, 0.4175F, 3.6142F, -0.5518F, -0.1172F, 0.3295F));

		PartDefinition cube_r486 = bone4.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(21, 87).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2906F, -0.2084F, 3.1925F, -0.1155F, -0.1172F, 0.3295F));

		PartDefinition cube_r487 = bone4.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(16, 55).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3278F, 0.6251F, 1.2016F, 0.1463F, -0.1172F, 0.3295F));

		PartDefinition cube_r488 = bone4.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.363F, -0.2208F, -1.4043F, -0.2261F, -0.105F, 0.2249F));

		PartDefinition cube_r489 = bone4.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(13, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1808F, 0.6883F, 0.2482F, 1.2895F, -0.1172F, 0.3295F));

		PartDefinition cube_r490 = bone4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(3, 90).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2781F, 0.6211F, 1.2146F, 1.6036F, -0.1172F, 0.3295F));

		PartDefinition cube_r491 = bone4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2272F, -0.8484F, 1.15F, 1.0293F, -0.1193F, 0.2417F));

		PartDefinition cube_r492 = bone4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(43, 71).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(78, 79).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.2272F, -0.8484F, 1.15F, 1.6402F, -0.1193F, 0.2417F));

		PartDefinition cube_r493 = bone4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(25, 77).addBox(-0.5F, -1.25F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2625F, -0.4629F, 0.0937F, 2.3383F, -0.1193F, 0.2417F));

		PartDefinition bone7 = Hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6794F, 4.7249F, -0.0063F, 0.1298F, -0.017F, -0.0011F));

		PartDefinition cube_r494 = bone7.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(7, 64).mirror().addBox(-0.5F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7316F, -2.9823F, -0.6102F, 0.8575F, -0.0217F, -0.1353F));

		PartDefinition cube_r495 = bone7.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(63, 28).mirror().addBox(-0.5245F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, 0.203F, -0.0217F, -0.1353F));

		PartDefinition cube_r496 = bone7.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(46, 76).mirror().addBox(-0.4F, -2.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.1329F, -0.3029F, 1.4323F, -0.0182F, -0.1296F));

		PartDefinition cube_r497 = bone7.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(28, 63).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.863F, -3.5655F, 0.7671F, 0.4137F, -0.0422F, -0.1276F));

		PartDefinition cube_r498 = bone7.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(76, 70).mirror().addBox(-0.5F, -0.725F, 0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7144F, -2.7842F, -2.2468F, 0.9948F, 0.0F, -0.1047F));

		PartDefinition cube_r499 = bone7.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(41, 76).mirror().addBox(-0.5F, -0.525F, 0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-0.7239F, -2.8748F, -2.7384F, 1.3875F, 0.0F, -0.1047F));

		PartDefinition cube_r500 = bone7.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(76, 33).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8288F, -3.8729F, -2.5059F, 1.0821F, 0.0F, -0.1047F));

		PartDefinition cube_r501 = bone7.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(8, 87).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9059F, -4.606F, -3.6917F, 1.5097F, 0.0F, -0.1047F));

		PartDefinition cube_r502 = bone7.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(13, 87).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7657F, -3.2722F, -4.1404F, -0.2793F, 0.0F, -0.1047F));

		PartDefinition cube_r503 = bone7.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(80, 86).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.8311F, -3.8946F, -3.8938F, 0.4625F, 0.0F, -0.1047F));

		PartDefinition cube_r504 = bone7.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-0.5F, -1.975F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5274F, -1.3556F, -1.5145F, -0.925F, 0.0F, -0.1309F));

		PartDefinition cube_r505 = bone7.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(70, 86).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -1.7347F, -0.6315F, -0.096F, 0.0F, -0.1309F));

		PartDefinition cube_r506 = bone7.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5941F, -1.8619F, -1.7147F, 0.384F, 0.0F, -0.1309F));

		PartDefinition cube_r507 = bone7.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0449F, -1.3425F, 4.3349F, -2.7771F, 0.1172F, -0.3295F));

		PartDefinition cube_r508 = bone7.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(53, 87).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3396F, -0.4081F, 4.1349F, -1.7736F, 0.1172F, -0.3295F));

		PartDefinition cube_r509 = bone7.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5572F, 0.4175F, 3.6142F, -0.5518F, 0.1172F, -0.3295F));

		PartDefinition cube_r510 = bone7.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(21, 87).mirror().addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2906F, -0.2084F, 3.1925F, -0.1155F, 0.1172F, -0.3295F));

		PartDefinition cube_r511 = bone7.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(16, 55).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3278F, 0.6251F, 1.2016F, 0.1463F, 0.1172F, -0.3295F));

		PartDefinition cube_r512 = bone7.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.363F, -0.2208F, -1.4043F, -0.2261F, 0.105F, -0.2249F));

		PartDefinition cube_r513 = bone7.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(13, 90).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1808F, 0.6883F, 0.2482F, 1.2895F, 0.1172F, -0.3295F));

		PartDefinition cube_r514 = bone7.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(3, 90).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.2781F, 0.6211F, 1.2146F, 1.6036F, 0.1172F, -0.3295F));

		PartDefinition cube_r515 = bone7.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2272F, -0.8484F, 1.15F, 1.0293F, 0.1193F, -0.2417F));

		PartDefinition cube_r516 = bone7.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(78, 79).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2272F, -0.8484F, 1.15F, 1.6402F, 0.1193F, -0.2417F));

		PartDefinition cube_r517 = bone7.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(-0.5F, -1.25F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2625F, -0.4629F, 0.0937F, 2.3383F, 0.1193F, -0.2417F));

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