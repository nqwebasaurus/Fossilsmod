package fossils.fossils.client.blockentity.model.alopecognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AlopecognathusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
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
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone4;
	private final ModelPart bone;
	private final ModelPart bone5;
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
	private final ModelPart bone2;
	private final ModelPart bone6;

	public AlopecognathusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
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
		this.Head = this.Neck4.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone4 = this.rightFace.getChild("bone4");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone5 = this.Bodyfront.getChild("bone5");
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
		this.bone2 = this.Hips.getChild("bone2");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9F, 17.1F, -0.4929F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(31, 86).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 86).addBox(0.0F, -0.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 86).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(21, 86).mirror().addBox(-0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 86).mirror().addBox(-0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 86).mirror().addBox(-0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(21, 86).addBox(0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 86).addBox(0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 86).addBox(0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8722F, -5.5976F, 0.2235F, -0.1703F, -0.0385F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(18, 86).addBox(0.0F, -0.4809F, -0.0101F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1573F, -0.9404F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Belly.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2933F, -0.5278F, -0.1791F, -0.1221F, -0.8736F));

		PartDefinition cube_r2 = Belly.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 58).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2933F, -0.5278F, -0.1314F, -0.2002F, -1.4199F));

		PartDefinition cube_r3 = Belly.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 85).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, -0.084F, -0.0773F, -0.726F));

		PartDefinition cube_r4 = Belly.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 19).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, -0.073F, -0.1127F, -1.2719F));

		PartDefinition cube_r5 = Belly.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, -0.021F, -0.047F, -0.6077F));

		PartDefinition cube_r6 = Belly.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 8).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, -0.0349F, -0.0542F, -1.1529F));

		PartDefinition cube_r7 = Belly.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 85).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, -0.0031F, -0.0643F, -1.6774F));

		PartDefinition cube_r8 = Belly.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 58).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2933F, -0.5278F, -0.1314F, 0.2002F, 1.4199F));

		PartDefinition cube_r9 = Belly.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 85).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2933F, -0.5278F, -0.1791F, 0.1221F, 0.8736F));

		PartDefinition cube_r10 = Belly.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(57, 19).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, -0.073F, 0.1127F, 1.2719F));

		PartDefinition cube_r11 = Belly.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 85).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, -0.084F, 0.0773F, 0.726F));

		PartDefinition cube_r12 = Belly.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 85).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, -0.0031F, 0.0643F, 1.6774F));

		PartDefinition cube_r13 = Belly.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 8).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, -0.0349F, 0.0542F, 1.1529F));

		PartDefinition cube_r14 = Belly.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(85, 59).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, -0.021F, 0.047F, 0.6077F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(86, 15).addBox(0.0F, -0.5258F, -0.0079F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2573F, -2.9404F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r3 = Belly.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(15, 86).addBox(0.0F, -0.7206F, -0.0056F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.3574F, -4.9404F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r4 = Belly.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, 0.0F, 7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6573F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0236F, -5.8422F, 0.192F, 0.0F, 0.0F));

		PartDefinition Belly_r5 = body.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(12, 86).addBox(0.0F, -0.8405F, -0.0033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 57).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, -0.084F, -0.0773F, -0.5689F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, -0.073F, -0.1127F, -1.1149F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, -0.0066F, -0.134F, -1.6421F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(53, 85).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5855F, -0.0052F, -0.0394F, -0.5037F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5855F, -0.0254F, -0.0395F, -1.0487F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(68, 12).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5855F, -0.0022F, -0.0469F, -1.5727F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(85, 55).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, -0.0066F, 0.134F, 1.6421F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(57, 6).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, -0.073F, 0.1127F, 1.1149F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(85, 57).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, -0.084F, 0.0773F, 0.5689F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(53, 85).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5855F, -0.0052F, 0.0394F, 0.5037F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(57, 4).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5855F, -0.0254F, 0.0395F, 1.0487F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 12).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5855F, -0.0022F, 0.0469F, 1.5727F));

		PartDefinition Belly_r6 = body.addOrReplaceChild("Belly_r6", CubeListBuilder.create().texOffs(63, 73).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(32, 0).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, 0.1608F, -0.2154F, -0.0347F));

		PartDefinition Belly_r7 = body2.addOrReplaceChild("Belly_r7", CubeListBuilder.create().texOffs(60, 68).addBox(0.0F, -0.9302F, 0.0012F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r8 = body2.addOrReplaceChild("Belly_r8", CubeListBuilder.create().texOffs(60, 29).mirror().addBox(-2.552F, 0.074F, -0.2785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9607F, 6.7961F, -3.1229F, 0.1079F, 0.0498F, 0.4711F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0682F, -0.0698F, -0.4479F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 56).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0635F, -0.0981F, -0.9937F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, -0.0057F, -0.1166F, -1.5201F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0052F, -0.0394F, -0.4339F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(55, 54).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0254F, -0.0395F, -0.9789F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(55, 52).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0022F, -0.0469F, -1.5029F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 46).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0057F, 0.1166F, 1.5201F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(55, 56).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0635F, 0.0981F, 0.9937F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(85, 33).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, -0.0682F, 0.0698F, 0.4479F));

		PartDefinition Belly_r9 = body2.addOrReplaceChild("Belly_r9", CubeListBuilder.create().texOffs(21, 59).addBox(-1.4607F, -0.0784F, -1.2461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.9607F, 6.7961F, -3.1229F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Belly_r10 = body2.addOrReplaceChild("Belly_r10", CubeListBuilder.create().texOffs(60, 29).addBox(-0.448F, 0.074F, -0.2785F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9607F, 6.7961F, -3.1229F, 0.1079F, -0.0498F, -0.4711F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(85, 9).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0052F, 0.0394F, 0.4339F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 54).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0254F, 0.0395F, 0.9789F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(55, 52).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0022F, 0.0469F, 1.5029F));

		PartDefinition Belly_r11 = body2.addOrReplaceChild("Belly_r11", CubeListBuilder.create().texOffs(27, 70).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(32, 6).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -4.0F, 0.0873F, -0.0435F, -0.0038F));

		PartDefinition Belly_r12 = body3.addOrReplaceChild("Belly_r12", CubeListBuilder.create().texOffs(85, 29).addBox(0.0F, -1.2698F, -0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r13 = body3.addOrReplaceChild("Belly_r13", CubeListBuilder.create().texOffs(25, 85).addBox(0.0F, -1.4396F, -0.0024F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Belly_r14 = body3.addOrReplaceChild("Belly_r14", CubeListBuilder.create().texOffs(6, 85).addBox(0.0F, -1.2F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F))
				.texOffs(17, 8).addBox(-0.5F, 0.0F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Belly_r15 = body3.addOrReplaceChild("Belly_r15", CubeListBuilder.create().texOffs(28, 60).mirror().addBox(-3.2F, 0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3175F, 7.2689F, -1.525F, -0.0277F, 0.0784F, 0.2344F));

		PartDefinition Belly_r16 = body3.addOrReplaceChild("Belly_r16", CubeListBuilder.create().texOffs(60, 27).mirror().addBox(-2.9F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4697F, 7.2224F, -3.5584F, -0.2036F, 0.0779F, 0.2169F));

		PartDefinition Belly_r17 = body3.addOrReplaceChild("Belly_r17", CubeListBuilder.create().texOffs(37, 59).mirror().addBox(-2.7F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4611F, 6.8166F, -5.4172F, -0.2149F, 0.0659F, 0.0764F));

		PartDefinition Belly_r18 = body3.addOrReplaceChild("Belly_r18", CubeListBuilder.create().texOffs(59, 25).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 6.3964F, -7.3702F, -0.1873F, 0.1727F, 0.2517F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -0.5851F, -0.069F, -0.0681F, -0.413F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 50).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -0.5851F, -0.065F, -0.097F, -0.9587F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(43, 13).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -0.5851F, -0.0076F, -0.1165F, -1.485F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 66).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -2.5851F, -0.0606F, -0.0654F, -0.431F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -2.5851F, -0.0592F, -0.0904F, -0.9767F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 11).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0983F, -2.5851F, -0.0059F, -0.1079F, -1.5026F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(41, 27).mirror().addBox(-6.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1983F, -4.5851F, -0.0053F, -0.1079F, -1.5376F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 42).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1983F, -4.5851F, -0.0587F, -0.0908F, -1.0116F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1983F, -4.5851F, -0.0603F, -0.066F, -0.4659F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 13).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -0.5851F, -0.0076F, 0.1165F, 1.485F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(55, 50).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -0.5851F, -0.065F, 0.097F, 0.9587F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 53).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -0.5851F, -0.069F, 0.0681F, 0.413F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(43, 11).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -2.5851F, -0.0059F, 0.1079F, 1.5026F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(55, 48).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -2.5851F, -0.0592F, 0.0904F, 0.9767F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(83, 66).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0983F, -2.5851F, -0.0606F, 0.0654F, 0.431F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(83, 38).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1983F, -4.5851F, -0.0603F, 0.066F, 0.4659F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 42).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1983F, -4.5851F, -0.0587F, 0.0908F, 1.0116F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 27).addBox(2.9922F, -2.343F, -0.4258F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1983F, -4.5851F, -0.0053F, 0.1079F, 1.5376F));

		PartDefinition Belly_r19 = body3.addOrReplaceChild("Belly_r19", CubeListBuilder.create().texOffs(30, 23).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 7.3642F, -5.0116F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Belly_r20 = body3.addOrReplaceChild("Belly_r20", CubeListBuilder.create().texOffs(28, 60).addBox(0.2F, 0.1F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3175F, 7.2689F, -1.525F, -0.0277F, -0.0784F, -0.2344F));

		PartDefinition Belly_r21 = body3.addOrReplaceChild("Belly_r21", CubeListBuilder.create().texOffs(60, 27).addBox(-0.1F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4697F, 7.2224F, -3.5584F, -0.2036F, -0.0779F, -0.2169F));

		PartDefinition Belly_r22 = body3.addOrReplaceChild("Belly_r22", CubeListBuilder.create().texOffs(37, 59).addBox(-0.3F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4611F, 6.8166F, -5.4172F, -0.2149F, -0.0659F, -0.0764F));

		PartDefinition Belly_r23 = body3.addOrReplaceChild("Belly_r23", CubeListBuilder.create().texOffs(59, 25).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 6.3964F, -7.3702F, -0.1873F, -0.1727F, -0.2517F));

		PartDefinition Belly_r24 = body3.addOrReplaceChild("Belly_r24", CubeListBuilder.create().texOffs(22, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 6.7918F, -7.9564F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0971F, -6.9521F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(84, 25).addBox(0.0F, -1.3029F, -4.9521F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7092F, -6.0323F, 0.0112F, -0.0436F, -0.0005F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(3, 85).addBox(0.0F, -1.2F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0971F, -0.8521F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(70, 84).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0971F, -2.9521F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(84, 21).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0971F, -6.9521F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(64, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.2893F, -7.4978F, -0.829F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(80, 56).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5971F, -6.6521F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8556F, -3.8754F, -0.3316F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(53, 32).mirror().addBox(-2.5F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.502F, 6.5786F, -3.2933F, -0.3876F, 0.0897F, 0.4568F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(-2.1F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.7685F, -5.0236F, -0.3995F, 0.3031F, 0.4241F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(86, 4).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -6.5528F, 0.1031F, 0.0334F, -0.7661F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 62).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -6.5528F, 0.0297F, 0.0789F, -1.3096F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -4.5528F, 0.0325F, -0.0178F, -0.627F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(83, 85).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -4.5528F, -0.003F, -0.0034F, -1.6949F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -4.5528F, -0.0043F, -0.0014F, -1.1713F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(85, 81).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -2.5528F, -0.0446F, -0.0584F, -0.5192F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(68, 60).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -2.5528F, -0.0044F, -0.0905F, -1.59F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(57, 46).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -2.5528F, -0.0491F, -0.0761F, -1.0647F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(78, 85).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -0.5528F, -0.0446F, -0.0584F, -0.5018F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -0.5528F, -0.0044F, -0.0905F, -1.5726F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(57, 21).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6109F, -0.5528F, -0.0491F, -0.0761F, -1.0473F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(53, 32).addBox(-0.5F, 0.0F, -0.4F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.502F, 6.5786F, -3.2933F, -0.3876F, -0.0897F, -0.4568F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(59, 23).addBox(-0.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.7685F, -5.0236F, -0.3995F, -0.3031F, -0.4241F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(38, 39).addBox(-0.5F, -0.9F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4971F, -6.5521F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(68, 62).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -6.5528F, 0.0297F, -0.0789F, 1.3096F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(86, 4).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -6.5528F, 0.1031F, -0.0334F, 0.7661F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(28, 58).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -4.5528F, -0.0043F, 0.0014F, 1.1713F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 85).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -4.5528F, -0.003F, 0.0034F, 1.6949F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(85, 83).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -4.5528F, 0.0325F, 0.0178F, 0.627F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 46).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -2.5528F, -0.0491F, 0.0761F, 1.0647F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(68, 60).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -2.5528F, -0.0044F, 0.0905F, 1.59F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(85, 81).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -2.5528F, -0.0446F, 0.0584F, 0.5192F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 21).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -0.5528F, -0.0491F, 0.0761F, 1.0473F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(57, 44).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -0.5528F, -0.0044F, 0.0905F, 1.5726F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 85).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6109F, -0.5528F, -0.0446F, 0.0584F, 0.5018F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(7, 63).addBox(-0.5F, -0.5164F, -0.2238F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(0, 63).addBox(-0.5F, 4.0836F, -0.7238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2684F, 4.2055F, -7.3413F, -0.2731F, 0.1346F, -0.323F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(15, 74).addBox(-0.5F, -1.0F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(10, 74).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(20, 74).addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 67).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0164F, 0.2762F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.4836F, -0.2238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(35, 65).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4836F, -0.2238F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(83, 6).addBox(0.2F, -0.2242F, 0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1F, 4.5888F, -0.0398F, -0.4907F, -0.0273F, 0.3124F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(83, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(15, 83).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(5, 72).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(67, 72).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0758F, 0.1292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(82, 78).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(82, 69).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r6 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r6", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r7 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r7", CubeListBuilder.create().texOffs(80, 82).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r8 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r8", CubeListBuilder.create().texOffs(12, 65).addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 0.7758F, 1.2292F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r9 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r9", CubeListBuilder.create().texOffs(82, 72).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.6758F, 1.2791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(0, 37).addBox(-1.4F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.2641F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.4F, -0.4859F, -4.0181F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2581F, -1.4779F, -0.7255F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.5F, -0.5164F, -0.2238F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 63).mirror().addBox(-0.5F, 4.0836F, -0.7238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2684F, 4.2055F, -7.3413F, 0.6432F, -0.1346F, 0.323F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(15, 74).mirror().addBox(-0.5F, -1.0F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(10, 74).mirror().addBox(-0.5F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(20, 74).mirror().addBox(-0.5F, -0.9F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(73, 67).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0164F, 0.2762F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4836F, -0.2238F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(35, 65).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4836F, -0.2238F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-1.2F, -0.2242F, 0.3792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 4.5888F, -0.0398F, -0.8404F, 0.0067F, -0.3509F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(15, 83).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(67, 72).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 1.0758F, 0.1292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(82, 78).mirror().addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false)
				.texOffs(82, 69).mirror().addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r6 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r6", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r7 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r7", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r8 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r8", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.7758F, 1.2292F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r9 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r9", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.6758F, 1.2791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-1.6F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.0896F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.6F, -0.4859F, -4.0181F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2581F, -1.4779F, -0.9001F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, 0.081F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.1086F, -6.5708F, -0.2641F, -0.0843F, 0.0228F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 84).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.081F, -2.013F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 52).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6023F, -1.582F, 0.2878F, 0.6299F, -0.9705F));

		PartDefinition cube_r80 = Neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(71, 52).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6023F, -1.582F, 0.2878F, -0.6299F, 0.9705F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(7, 55).addBox(-0.5F, 0.081F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0666F, -1.675F, -0.2485F, 0.2513F, 0.2468F));

		PartDefinition Neck_r2 = Neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(83, 62).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.081F, -1.513F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6357F, -1.607F, 0.1524F, 0.7489F, -1.2213F));

		PartDefinition cube_r82 = Neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(60, 71).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6357F, -1.607F, 0.1524F, -0.7489F, 1.2213F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(21, 55).addBox(-0.5F, -0.5167F, -1.9615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.5836F, -1.9666F, 0.1704F, -0.0629F, -0.1771F));

		PartDefinition Neck_r3 = Neck3.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(50, 83).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5167F, -1.9615F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Neck3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.052F, -1.5404F, 0.1178F, 0.7272F, -1.247F));

		PartDefinition cube_r84 = Neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(15, 72).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.052F, -1.5404F, 0.1178F, -0.7272F, 1.247F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(40, 55).addBox(-0.5F, -0.5167F, -1.9615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(83, 49).addBox(0.0F, -2.0167F, -1.9615F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.008F, -1.9493F, 0.0433F, 0.218F, 0.0094F));

		PartDefinition cube_r85 = Neck4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(51, 72).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.044F, -1.5911F, 0.1323F, 0.8535F, -1.2896F));

		PartDefinition cube_r86 = Neck4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(51, 72).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.044F, -1.5911F, 0.1323F, -0.8535F, 1.2896F));

		PartDefinition Head = Neck4.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5196F, -3.3698F, 0.0578F, 0.3065F, 0.0009F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(64, 48).addBox(-1.5F, 0.45F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(62, 31).addBox(-1.5F, -0.1F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.5F, -1.0711F, -14.0002F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(79, 23).addBox(-1.0F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.6116F, -13.4104F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(17, 16).addBox(0.0F, -1.0F, -0.975F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.3222F, -3.6599F, -0.1265F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(65, 79).addBox(-1.0232F, -1.221F, -0.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.2667F, -1.2203F, 0.0298F, -1.5664F, -0.0175F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(5, 79).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(14, 61).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.1527F, -10.9696F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(34, 49).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, -9.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(33, 35).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -3.4741F, -4.4163F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(18, 44).addBox(-0.5F, -0.025F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, -1.5177F, 2.1261F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(43, 15).addBox(-0.5F, -0.025F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -2.3881F, 1.6337F, -1.0559F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(41, 70).addBox(-0.2F, -0.9F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.686F, 0.7925F, -0.6639F, 0.3727F, -0.2506F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(10, 70).addBox(0.5F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.663F, 0.7828F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(69, 54).addBox(0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(31, 69).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.4848F, -0.5137F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(69, 30).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -3.8021F, -1.462F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(69, 26).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.8632F, -2.4601F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(68, 68).addBox(0.5F, 0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -3.7561F, -3.4556F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, 0.05F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -3.7561F, -3.4556F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(13, 29).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.5436F, -8.0009F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(14, 48).mirror().addBox(0.1F, -0.025F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4458F, -2.4822F, -8.1543F, 0.2305F, -0.3372F, -0.0701F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(14, 48).addBox(-1.1F, -0.025F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4458F, -2.4822F, -8.1543F, 0.2305F, 0.3372F, 0.0701F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(14, 48).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -2.5F, -9.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0268F, 0.964F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Lowerjaw11_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r1", CubeListBuilder.create().texOffs(57, 76).mirror().addBox(-0.2F, -2.4399F, -2.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(52, 24).mirror().addBox(-0.2F, -2.7399F, -2.6858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 1.1126F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw14_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r1", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(-0.0744F, -2.02F, -0.8136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(62, 76).mirror().addBox(-0.0744F, -1.22F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, 0.5803F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw12_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r1", CubeListBuilder.create().texOffs(53, 28).mirror().addBox(-0.0744F, -0.4886F, -0.8887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, 0.4058F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw11_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r2", CubeListBuilder.create().texOffs(14, 53).mirror().addBox(-0.2F, -3.1546F, -3.0245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 0.973F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw9_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r1", CubeListBuilder.create().texOffs(76, 47).mirror().addBox(-0.2F, -2.9155F, -1.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 1.7802F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw8_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r1", CubeListBuilder.create().texOffs(76, 44).mirror().addBox(-0.2F, -2.6252F, -0.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 1.9548F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw7_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r1", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.2F, -2.3421F, -1.2754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 1.3875F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw6_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r1", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.2F, -1.1302F, -1.3675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 0.6021F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw5_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r1", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-0.2F, -0.0837F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, 0.4276F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw5_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r2", CubeListBuilder.create().texOffs(76, 41).mirror().addBox(-0.2F, -0.4676F, -0.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, -0.733F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw10_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r1", CubeListBuilder.create().texOffs(27, 46).mirror().addBox(-0.0744F, -3.507F, -3.4984F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.0175F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw18_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw18_r1", CubeListBuilder.create().texOffs(26, 51).mirror().addBox(-0.053F, -3.6954F, -0.7843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(7, 51).mirror().addBox(-0.053F, -2.8954F, -0.7843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, 1.3003F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw16_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw16_r1", CubeListBuilder.create().texOffs(77, 76).mirror().addBox(-0.053F, -3.3358F, -2.8316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, 0.6458F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw15_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r1", CubeListBuilder.create().texOffs(65, 34).mirror().addBox(-0.053F, -4.4971F, -3.4447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, 0.4363F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw14_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r2", CubeListBuilder.create().texOffs(52, 74).mirror().addBox(-0.053F, -3.9284F, -4.7207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, 0.096F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw13_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r1", CubeListBuilder.create().texOffs(28, 55).mirror().addBox(-0.053F, -1.6384F, -5.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.384F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw15_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r2", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.053F, -3.6031F, -4.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.0785F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw18_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw18_r2", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.053F, -1.2076F, -2.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.4538F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw17_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw17_r1", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.053F, -0.827F, -3.2887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.6283F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw16_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw16_r2", CubeListBuilder.create().texOffs(76, 17).mirror().addBox(-0.053F, -0.8827F, -4.3065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.7156F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw15_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r3", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.053F, -1.1696F, -4.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.4974F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw15_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r4", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.053F, -1.407F, -5.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.6458F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw14_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r3", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-0.053F, -1.8663F, -4.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.4276F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw13_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r2", CubeListBuilder.create().texOffs(10, 77).mirror().addBox(-0.053F, -0.552F, -5.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(67, 76).mirror().addBox(-0.053F, -0.052F, -5.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.6021F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw11_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r3", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.053F, -0.334F, -4.2714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.6545F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw15_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r5", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-0.0744F, -2.471F, -2.4337F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.096F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw14_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r4", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-0.0744F, -2.0152F, -3.2998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.288F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw13_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r3", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(-0.0744F, -1.6801F, -4.0943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.3927F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw12_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r2", CubeListBuilder.create().texOffs(26, 66).mirror().addBox(-0.0744F, -1.3328F, -4.8599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.48F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw11_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r4", CubeListBuilder.create().texOffs(64, 54).mirror().addBox(-0.053F, -0.9245F, -0.7379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(44, 34).mirror().addBox(-0.053F, -0.9245F, -2.5378F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.4102F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw9_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r2", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-0.053F, -1.0887F, -1.0098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7F, -2.9087F, -8.1847F, -0.1484F, -0.1789F, 0.0349F));

		PartDefinition Lowerjaw9_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r3", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.3852F, -0.0014F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9249F, -3.6528F, -4.185F, 0.2244F, 0.0499F, -0.0219F));

		PartDefinition Lowerjaw8_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r2", CubeListBuilder.create().texOffs(7, 46).mirror().addBox(-0.0744F, -3.3213F, -2.0457F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.1222F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw7_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r2", CubeListBuilder.create().texOffs(63, 62).mirror().addBox(-0.0744F, -3.0771F, -1.3387F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.4712F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw6_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r2", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-0.0744F, -3.0276F, -0.7965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.225F, -0.3087F, -4.0847F, -0.5585F, -0.1265F, 0.0F));

		PartDefinition Lowerjaw5_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r3", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-0.2F, -0.7542F, -3.1501F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, -0.6807F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw4_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r1", CubeListBuilder.create().texOffs(52, 15).mirror().addBox(-0.2F, -0.275F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.3087F, -0.4847F, -1.0385F, -0.0349F, 0.0F));

		PartDefinition Lowerjaw10_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r2", CubeListBuilder.create().texOffs(57, 76).addBox(-0.8F, -2.4399F, -2.6858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(52, 24).addBox(-0.8F, -2.7399F, -2.6858F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 1.1126F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw13_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r4", CubeListBuilder.create().texOffs(0, 51).addBox(-0.9256F, -2.02F, -0.8136F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F))
				.texOffs(62, 76).addBox(-0.9256F, -1.22F, -0.8136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, 0.5803F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw11_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r5", CubeListBuilder.create().texOffs(53, 28).addBox(-0.9256F, -0.4886F, -0.8887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, 0.4058F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw10_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r3", CubeListBuilder.create().texOffs(14, 53).addBox(-0.8F, -3.1546F, -3.0245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 0.973F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw8_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r3", CubeListBuilder.create().texOffs(76, 47).addBox(-0.8F, -2.9155F, -1.1928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 1.7802F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw7_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r3", CubeListBuilder.create().texOffs(76, 44).addBox(-0.8F, -2.6252F, -0.4105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 1.9548F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw6_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r3", CubeListBuilder.create().texOffs(0, 46).addBox(-0.8F, -2.3421F, -1.2754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 1.3875F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw5_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r4", CubeListBuilder.create().texOffs(66, 18).addBox(-0.8F, -1.1302F, -1.3675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 0.6021F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw4_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r2", CubeListBuilder.create().texOffs(25, 76).addBox(-0.8F, -0.0837F, -0.5074F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, 0.4276F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw4_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r3", CubeListBuilder.create().texOffs(76, 41).addBox(-0.8F, -0.4676F, -0.7145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, -0.733F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw9_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r4", CubeListBuilder.create().texOffs(27, 46).addBox(-0.9256F, -3.507F, -3.4984F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.0175F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw17_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw17_r2", CubeListBuilder.create().texOffs(26, 51).addBox(-0.947F, -3.6954F, -0.7843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F))
				.texOffs(7, 51).addBox(-0.947F, -2.8954F, -0.7843F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, 1.3003F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw15_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r6", CubeListBuilder.create().texOffs(77, 76).addBox(-0.947F, -3.3358F, -2.8316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, 0.6458F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw14_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r5", CubeListBuilder.create().texOffs(65, 34).addBox(-0.947F, -4.4971F, -3.4447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, 0.4363F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw13_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r5", CubeListBuilder.create().texOffs(52, 74).addBox(-0.947F, -3.9284F, -4.7207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, 0.096F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw12_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r3", CubeListBuilder.create().texOffs(28, 55).addBox(-0.947F, -1.6384F, -5.6382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.384F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw14_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r6", CubeListBuilder.create().texOffs(76, 3).addBox(-0.947F, -3.6031F, -4.9188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.0785F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw17_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw17_r3", CubeListBuilder.create().texOffs(78, 6).addBox(-0.947F, -1.2076F, -2.2047F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.4538F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw16_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw16_r3", CubeListBuilder.create().texOffs(5, 76).addBox(-0.947F, -0.827F, -3.2887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.6283F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw15_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r7", CubeListBuilder.create().texOffs(76, 17).addBox(-0.947F, -0.8827F, -4.3065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.7156F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw14_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r7", CubeListBuilder.create().texOffs(20, 83).addBox(-0.947F, -1.1696F, -4.1913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.4974F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw14_r8 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r8", CubeListBuilder.create().texOffs(0, 78).addBox(-0.947F, -1.407F, -5.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.6458F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw13_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r6", CubeListBuilder.create().texOffs(73, 8).addBox(-0.947F, -1.8663F, -4.9118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.4276F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw12_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r4", CubeListBuilder.create().texOffs(10, 77).addBox(-0.947F, -0.552F, -5.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(67, 76).addBox(-0.947F, -0.052F, -5.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.6021F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw10_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r4", CubeListBuilder.create().texOffs(46, 29).addBox(-0.947F, -0.334F, -4.2714F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.6545F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw14_r9 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r9", CubeListBuilder.create().texOffs(47, 39).addBox(-0.9256F, -2.471F, -2.4337F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.096F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw13_r7 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r7", CubeListBuilder.create().texOffs(66, 42).addBox(-0.9256F, -2.0152F, -3.2998F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.288F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw12_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r5", CubeListBuilder.create().texOffs(40, 66).addBox(-0.9256F, -1.6801F, -4.0943F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.3927F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw11_r6 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r6", CubeListBuilder.create().texOffs(26, 66).addBox(-0.9256F, -1.3328F, -4.8599F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.48F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw10_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r5", CubeListBuilder.create().texOffs(64, 54).addBox(-0.947F, -0.9245F, -0.7379F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(44, 34).addBox(-0.947F, -0.9245F, -2.5378F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.4102F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw8_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r4", CubeListBuilder.create().texOffs(50, 44).addBox(-0.947F, -1.0887F, -1.0098F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7F, -2.9087F, -8.1847F, -0.1484F, 0.1789F, -0.0349F));

		PartDefinition Lowerjaw8_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r5", CubeListBuilder.create().texOffs(52, 0).addBox(-0.6148F, -0.0014F, 0.0322F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9249F, -3.6528F, -4.185F, 0.2244F, -0.0499F, 0.0219F));

		PartDefinition Lowerjaw7_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r4", CubeListBuilder.create().texOffs(7, 46).addBox(-0.9256F, -3.3213F, -2.0457F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.1222F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw6_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r4", CubeListBuilder.create().texOffs(63, 62).addBox(-0.9256F, -3.0771F, -1.3387F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.4712F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw5_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r5", CubeListBuilder.create().texOffs(21, 63).addBox(-0.9256F, -3.0276F, -0.7965F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.225F, -0.3087F, -4.0847F, -0.5585F, 0.1265F, 0.0F));

		PartDefinition Lowerjaw4_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r4", CubeListBuilder.create().texOffs(43, 5).addBox(-0.8F, -0.7542F, -3.1501F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, -0.6807F, 0.0349F, 0.0F));

		PartDefinition Lowerjaw3_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r1", CubeListBuilder.create().texOffs(52, 15).addBox(-0.8F, -0.275F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.3F, -0.3087F, -0.4847F, -1.0385F, 0.0349F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.5667F, -1.2203F, 0.0298F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, -0.675F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0492F, 1.7626F, -13.2976F, 0.3428F, 0.374F, -0.0282F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.875F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0492F, 1.7626F, -13.2976F, 0.3346F, 0.3082F, -0.0528F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(77, 73).addBox(-0.6901F, 0.8446F, -0.9492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3338F, 1.6572F, -11.2402F, 0.4062F, 0.0264F, -0.1109F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(77, 70).addBox(-0.6901F, 0.3983F, -0.7135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3338F, 1.6572F, -11.2402F, 0.1967F, 0.0264F, -0.1109F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(68, 22).addBox(-0.6901F, -1.0236F, -0.2673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.3338F, 1.6572F, -11.2402F, -0.3094F, 0.0264F, -0.1109F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(71, 4).addBox(-0.6901F, -1.0633F, -0.5377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.3338F, 1.6572F, -11.2402F, -0.0651F, 0.0264F, -0.1109F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(68, 38).addBox(-0.9947F, -2.0822F, -5.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 68).addBox(-0.9947F, -1.9822F, -4.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.3138F, 0.1617F, -0.1224F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(17, 68).addBox(-1.0671F, -1.962F, -3.8879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.1789F, 0.1396F, 0.0F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0671F, -1.6678F, -2.8106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.4232F, 0.1396F, 0.0F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(37, 61).addBox(-1.3523F, -2.1142F, -1.2121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0833F, 1.0037F, -3.4946F, 0.336F, 0.0873F, 0.0F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(41, 22).addBox(-1.0685F, -2.6792F, -3.5797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.3273F, 0.1394F, 0.0005F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(9, 41).addBox(-1.0685F, -2.6057F, -3.2367F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.4582F, 0.1394F, 0.0005F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(50, 5).addBox(-1.0685F, -2.0943F, -4.5011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.0655F, 0.1394F, 0.0005F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(68, 8).addBox(-1.0671F, -1.8084F, -4.8834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.1396F, 0.1396F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(5, 68).addBox(-1.0671F, -1.0429F, -5.793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, -0.0175F, 0.1396F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(79, 26).addBox(-0.525F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.0181F, 0.6387F, -13.1377F, 0.1381F, 0.3694F, 0.009F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(25, 79).addBox(-0.5251F, 0.0452F, -3.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8667F, 0.8826F, -10.2915F, -0.0935F, 0.374F, -0.0282F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(63, 67).addBox(-0.6302F, -1.9145F, -0.0772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5338F, 1.6572F, -11.2402F, -0.1309F, 0.0262F, -0.0873F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(40, 77).addBox(-1.0002F, -0.8898F, -2.6136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(20, 77).addBox(-1.0002F, -0.8898F, -2.9136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8667F, 0.8826F, -10.2915F, 0.2182F, 0.2443F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(45, 77).addBox(-1.0285F, -1.6069F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(35, 77).addBox(-1.0285F, -0.9069F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1338F, 1.6572F, -11.2402F, -0.5297F, 0.0957F, -0.0876F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(30, 77).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7585F, 0.9954F, -11.9039F, -0.1865F, 0.16F, -0.0748F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(47, 74).addBox(-0.7742F, -1.9555F, -0.3122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5338F, 1.6572F, -11.2402F, 0.3143F, 0.025F, 0.0118F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(75, 34).addBox(-0.4824F, -0.5296F, 0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7574F, 0.3642F, -13.0618F, -0.5363F, 0.2421F, 0.0322F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(74, 54).addBox(-0.5F, -0.325F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.9429F, 0.2737F, -13.3917F, -0.5831F, -0.0077F, 0.0877F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(75, 60).addBox(-0.5F, -0.5646F, -0.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9429F, 0.2737F, -13.3917F, 0.2895F, -0.0077F, 0.0877F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(42, 74).addBox(-1.0921F, -1.5156F, -2.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8667F, 0.8826F, -10.2915F, 0.3364F, 0.2421F, 0.102F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(44, 62).addBox(-1.1398F, -2.644F, -6.1401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3167F, 1.0037F, -4.7946F, 0.1966F, 0.1332F, 0.0249F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(50, 80).addBox(-0.825F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8954F, -0.1497F, -13.6099F, 1.0893F, 0.1571F, 0.0171F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(43, 0).addBox(-1.0F, 0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4608F, -0.9395F, -10.9514F, 0.2148F, 0.0889F, 0.002F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(50, 19).addBox(-1.0F, 0.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.1673F, -1.2779F, -9.0401F, 0.1762F, 0.1375F, 0.0244F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(0, 24).addBox(-1.075F, 0.0F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5857F, -1.5653F, -6.9248F, 0.2228F, 0.2338F, 0.0346F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(0, 67).addBox(-1.0F, 0.0F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4594F, -1.9592F, -6.1561F, 0.4626F, 0.2274F, 0.0757F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(70, 34).addBox(-1.0F, -0.5555F, -1.817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1667F, -1.9335F, -4.302F, 0.2967F, 0.1571F, 0.0524F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(22, 70).addBox(-1.0F, -0.3251F, -0.9329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1667F, -1.9335F, -4.302F, 0.0349F, 0.1571F, 0.0524F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(36, 70).addBox(-1.0F, -0.3251F, 0.0671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1667F, -1.9335F, -4.302F, 0.0467F, -0.1899F, 0.0203F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(71, 14).addBox(-1.0F, 0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7667F, -2.6429F, -2.4899F, -0.0067F, -0.8493F, -0.1213F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(46, 70).addBox(-1.0F, 0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7686F, -2.6186F, -2.4843F, 0.2916F, -0.8486F, -0.1874F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, 0.0F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0102F, -2.4389F, -3.1113F, 0.5513F, -1.1254F, -0.4279F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(15, 80).addBox(-1.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1982F, -1.1868F, -2.4674F, -0.1876F, 0.0873F, 0.0F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(61, 38).addBox(-1.3523F, -0.0142F, -0.0121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0726F, -1.0778F, -3.9022F, -0.0305F, 0.0873F, 0.0F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(28, 62).addBox(-1.3523F, -0.0142F, -0.0121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1859F, -1.0381F, -2.6077F, -0.2051F, 0.0873F, 0.0F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(61, 58).addBox(-1.3523F, -0.0142F, -2.1121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3651F, -0.6105F, -0.5595F, -0.2923F, 0.0873F, 0.0F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(79, 29).addBox(-1.1092F, -0.6745F, -0.187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 0.0F, -0.8F, -0.5192F, -0.0175F, 0.0F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(55, 79).addBox(-1.0232F, -0.2656F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7374F, -0.0175F, 0.0F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(77, 79).addBox(0.0114F, -1.6845F, -0.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5626F, -1.0123F, -0.0069F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(60, 79).addBox(-1.0232F, -1.221F, 0.2206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5664F, -0.0175F, 0.0F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(80, 9).addBox(0.0114F, -1.9129F, -0.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0425F, -1.0123F, -0.0069F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(10, 80).addBox(0.0114F, -1.7458F, 0.1576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3008F, -1.0123F, -0.0069F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(79, 53).addBox(-1.0232F, -0.2497F, 0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2574F, -0.0175F, 0.0F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7793F, -1.1299F, -5.1142F, 0.0F, -0.0218F, 0.0F));

		PartDefinition Head_r70 = bone3.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(45, 80).addBox(-0.425F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1107F, 0.0281F, -0.5922F, -0.403F, 0.1626F, 0.0312F));

		PartDefinition Head_r71 = bone3.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -0.775F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0859F, 0.3595F, -0.3261F, -0.1833F, 0.1571F, 0.0524F));

		PartDefinition Head_r72 = bone3.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(35, 80).addBox(-0.5F, -0.225F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0594F, -0.1524F, 0.421F, 0.2967F, 0.1571F, 0.0524F));

		PartDefinition Head_r73 = bone3.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(80, 32).addBox(-1.0F, 0.0445F, -0.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5317F, -0.7678F, -0.0011F, -0.2269F, 0.1571F, 0.0524F));

		PartDefinition Head_r74 = bone3.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(30, 80).addBox(-0.375F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 88).addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1147F, -0.0224F, 0.0131F, 0.1222F, 0.1571F, 0.0524F));

		PartDefinition Head_r75 = bone3.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(30, 80).addBox(-1.0F, -0.1555F, -1.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6625F, -0.8036F, 0.8122F, 0.2967F, 0.1571F, 0.0524F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.5667F, -1.2203F, 0.0298F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(20, 80).mirror().addBox(-0.5F, -0.675F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0492F, 1.7626F, -13.2976F, 0.3428F, -0.374F, 0.0282F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-0.5F, -0.875F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0492F, 1.7626F, -13.2976F, 0.3346F, -0.3082F, 0.0528F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(77, 73).mirror().addBox(-0.3099F, 0.8446F, -0.9492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3338F, 1.6572F, -11.2402F, 0.4062F, -0.0264F, 0.1109F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(77, 70).mirror().addBox(-0.3099F, 0.3983F, -0.7135F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3338F, 1.6572F, -11.2402F, 0.1967F, -0.0264F, 0.1109F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(68, 22).mirror().addBox(-0.3099F, -1.0236F, -0.2673F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.3338F, 1.6572F, -11.2402F, -0.3094F, -0.0264F, 0.1109F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(-0.3099F, -1.0633F, -0.5377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.3338F, 1.6572F, -11.2402F, -0.0651F, -0.0264F, 0.1109F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(68, 38).mirror().addBox(-0.0053F, -2.0822F, -5.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 68).mirror().addBox(-0.0053F, -1.9822F, -4.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.3138F, -0.1617F, 0.1224F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(17, 68).mirror().addBox(0.0671F, -1.962F, -3.8879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.1789F, -0.1396F, 0.0F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0671F, -1.6678F, -2.8106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.4232F, -0.1396F, 0.0F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(37, 61).mirror().addBox(0.3523F, -2.1142F, -1.2121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0833F, 1.0037F, -3.4946F, 0.336F, -0.0873F, 0.0F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(41, 22).mirror().addBox(0.0685F, -2.6792F, -3.5797F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.3273F, -0.1394F, -0.0005F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(9, 41).mirror().addBox(0.0685F, -2.6057F, -3.2367F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.4582F, -0.1394F, -0.0005F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(50, 5).mirror().addBox(0.0685F, -2.0943F, -4.5011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.0655F, -0.1394F, -0.0005F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(0.0671F, -1.8084F, -4.8834F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.1396F, -0.1396F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(5, 68).mirror().addBox(0.0671F, -1.0429F, -5.793F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, -0.0175F, -0.1396F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(79, 26).mirror().addBox(-0.475F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.0181F, 0.6387F, -13.1377F, 0.1381F, -0.3694F, -0.009F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(25, 79).mirror().addBox(-0.4749F, 0.0452F, -3.646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8667F, 0.8826F, -10.2915F, -0.0935F, -0.374F, 0.0282F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(63, 67).mirror().addBox(-0.3698F, -1.9145F, -0.0772F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5338F, 1.6572F, -11.2402F, -0.1309F, -0.0262F, 0.0873F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(0.0001F, -0.8898F, -2.6136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(20, 77).mirror().addBox(0.0001F, -0.8898F, -2.9136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8667F, 0.8826F, -10.2915F, 0.2182F, -0.2443F, 0.0F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(45, 77).mirror().addBox(0.0285F, -1.6069F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(35, 77).mirror().addBox(0.0285F, -0.9069F, -1.0632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1338F, 1.6572F, -11.2402F, -0.5297F, -0.0957F, 0.0876F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7585F, 0.9954F, -11.9039F, -0.1865F, -0.16F, 0.0748F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(47, 74).mirror().addBox(-0.2258F, -1.9555F, -0.3122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.5338F, 1.6572F, -11.2402F, 0.3143F, -0.025F, -0.0118F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(75, 34).mirror().addBox(-0.5176F, -0.5296F, 0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7574F, 0.3642F, -13.0618F, -0.5363F, -0.2421F, -0.0322F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-0.5F, -0.325F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.9429F, 0.2737F, -13.3917F, -0.5831F, 0.0077F, -0.0877F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(75, 60).mirror().addBox(-0.5F, -0.5646F, -0.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.9429F, 0.2737F, -13.3917F, 0.2895F, 0.0077F, -0.0877F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(0.0921F, -1.5156F, -2.5213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.8667F, 0.8826F, -10.2915F, 0.3364F, -0.2421F, -0.102F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(44, 62).mirror().addBox(0.1398F, -2.644F, -6.1401F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3167F, 1.0037F, -4.7946F, 0.1966F, -0.1332F, -0.0249F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(50, 80).mirror().addBox(-0.175F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8954F, -0.1497F, -13.6099F, 1.0893F, -0.1571F, -0.0171F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(43, 0).mirror().addBox(0.0F, 0.2F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4608F, -0.9395F, -10.9514F, 0.2148F, -0.0889F, -0.002F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(50, 19).mirror().addBox(0.0F, 0.2F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.1673F, -1.2779F, -9.0401F, 0.1762F, -0.1375F, -0.0244F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(0.075F, 0.0F, -4.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5857F, -1.5653F, -6.9248F, 0.2228F, -0.2338F, -0.0346F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(0.0F, 0.0F, -1.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4594F, -1.9592F, -6.1561F, 0.4626F, -0.2274F, -0.0757F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(70, 34).mirror().addBox(0.0F, -0.5555F, -1.817F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1667F, -1.9335F, -4.302F, 0.2967F, -0.1571F, -0.0524F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(22, 70).mirror().addBox(0.0F, -0.3251F, -0.9329F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1667F, -1.9335F, -4.302F, 0.0349F, -0.1571F, -0.0524F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(36, 70).mirror().addBox(0.0F, -0.3251F, 0.0671F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1667F, -1.9335F, -4.302F, 0.0467F, 0.1899F, -0.0203F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(0.0F, 0.05F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7667F, -2.6429F, -2.4899F, -0.0067F, 0.8493F, 0.1213F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(0.0F, 0.025F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7686F, -2.6186F, -2.4843F, 0.2916F, 0.8486F, 0.1874F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(0.0F, 0.0F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0102F, -2.4389F, -3.1113F, 0.5513F, 1.1254F, 0.4279F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(0.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1982F, -1.1868F, -2.4674F, -0.1876F, -0.0873F, 0.0F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(0.3523F, -0.0142F, -0.0121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0726F, -1.0778F, -3.9022F, -0.0305F, -0.0873F, 0.0F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(28, 62).mirror().addBox(0.3523F, -0.0142F, -0.0121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1859F, -1.0381F, -2.6077F, -0.2051F, -0.0873F, 0.0F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(0.3523F, -0.0142F, -2.1121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3651F, -0.6105F, -0.5595F, -0.2923F, -0.0873F, 0.0F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(79, 29).mirror().addBox(0.1092F, -0.6745F, -0.187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0F, -0.8F, -0.5192F, 0.0175F, 0.0F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(55, 79).mirror().addBox(0.0232F, -0.2656F, -0.0493F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7374F, 0.0175F, 0.0F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(77, 79).mirror().addBox(-1.0114F, -1.6845F, -0.0544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5626F, 1.0123F, 0.0069F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(60, 79).mirror().addBox(0.0232F, -1.221F, 0.2206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5664F, 0.0175F, 0.0F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-1.0114F, -1.9129F, -0.3208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0425F, 1.0123F, 0.0069F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-1.0114F, -1.7458F, 0.1576F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3008F, 1.0123F, 0.0069F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(79, 53).mirror().addBox(0.0232F, -0.2497F, 0.1632F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2574F, 0.0175F, 0.0F));

		PartDefinition bone4 = rightFace.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7793F, -1.1299F, -5.1142F, 0.0F, 0.0218F, 0.0F));

		PartDefinition Head_r125 = bone4.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(-0.575F, -0.425F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.1107F, 0.0281F, -0.5922F, -0.403F, -0.1626F, -0.0312F));

		PartDefinition Head_r126 = bone4.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.5F, -0.775F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0859F, 0.3595F, -0.3261F, -0.1833F, -0.1571F, -0.0524F));

		PartDefinition Head_r127 = bone4.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(35, 80).mirror().addBox(-0.5F, -0.225F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0594F, -0.1524F, 0.421F, 0.2967F, -0.1571F, -0.0524F));

		PartDefinition Head_r128 = bone4.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(80, 32).mirror().addBox(0.0F, 0.0445F, -0.017F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5317F, -0.7678F, -0.0011F, -0.2269F, -0.1571F, -0.0524F));

		PartDefinition Head_r129 = bone4.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(-0.625F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 88).mirror().addBox(-0.5F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1147F, -0.0224F, 0.0131F, 0.1222F, -0.1571F, -0.0524F));

		PartDefinition Head_r130 = bone4.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(30, 80).mirror().addBox(0.0F, -0.1555F, -1.817F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, -0.8036F, 0.8122F, 0.2967F, -0.1571F, -0.0524F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7427F, 2.9535F, -5.3863F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bodyfront_r12 = bone.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(73, 22).addBox(-0.4962F, -0.7773F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5893F, 0.3147F, -1.9373F, -2.5616F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r13 = bone.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(65, 82).addBox(-0.4962F, -1.0564F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5893F, 0.3147F, -1.9373F, -1.9071F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r14 = bone.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5043F, 0.017F, -0.384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5893F, 0.3147F, -1.9373F, -1.5924F, 0.457F, -0.219F));

		PartDefinition bodyfront_r15 = bone.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(81, 46).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6821F, -0.6914F, -1.7317F, -0.9717F, 0.3303F, -0.5057F));

		PartDefinition bodyfront_r16 = bone.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(75, 82).addBox(-0.4962F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5893F, 0.3147F, -1.9373F, -1.7326F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r17 = bone.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(78, 50).addBox(-0.5F, -0.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(78, 37).addBox(-0.5F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-1.5434F, -4.1779F, 2.0379F, -0.3971F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r18 = bone.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(78, 20).addBox(-0.8966F, -0.118F, 0.0261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.7985F, -4.7043F, 0.5247F, -0.1353F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r19 = bone.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(58, 34).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-1.7985F, -4.0043F, 0.8247F, -0.6152F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r20 = bone.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(50, 48).addBox(-0.6515F, -4.0168F, -1.6721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.6152F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r21 = bone.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(47, 58).addBox(-0.5F, -0.375F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3506F, -3.8836F, 2.1547F, 0.493F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r22 = bone.addOrReplaceChild("bodyfront_r22", CubeListBuilder.create().texOffs(32, 12).addBox(-0.5F, -0.075F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.2488F, -2.2715F, -0.5251F, 0.6239F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r23 = bone.addOrReplaceChild("bodyfront_r23", CubeListBuilder.create().texOffs(14, 57).addBox(-0.6515F, -1.2634F, -0.3032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1912F, 0.2478F, -0.4962F));

		PartDefinition Front_r1 = bone.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(73, 64).addBox(-0.1715F, -0.3013F, -0.7092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5936F, 0.7505F, -2.9477F, -0.2545F, -0.1871F, -1.3703F));

		PartDefinition Front_r2 = bone.addOrReplaceChild("Front_r2", CubeListBuilder.create().texOffs(43, 19).addBox(-1.4333F, -0.4631F, -0.5453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.5936F, 0.7505F, -2.9477F, -0.3452F, 0.5691F, -0.9601F));

		PartDefinition bodyfront_r24 = bone.addOrReplaceChild("bodyfront_r24", CubeListBuilder.create().texOffs(45, 83).addBox(-0.4819F, -1.0173F, -0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5893F, 0.3147F, -1.9373F, 0.9011F, 0.4954F, -0.1956F));

		PartDefinition bone5 = Bodyfront.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7427F, 2.9535F, -5.3863F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bodyfront_r25 = bone5.addOrReplaceChild("bodyfront_r25", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(-0.5038F, -0.7773F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 0.3147F, -1.9373F, -2.5616F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r26 = bone5.addOrReplaceChild("bodyfront_r26", CubeListBuilder.create().texOffs(65, 82).mirror().addBox(-0.5038F, -1.0564F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 0.3147F, -1.9373F, -1.9071F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r27 = bone5.addOrReplaceChild("bodyfront_r27", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.4957F, 0.017F, -0.384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 0.3147F, -1.9373F, -1.5924F, -0.457F, 0.219F));

		PartDefinition bodyfront_r28 = bone5.addOrReplaceChild("bodyfront_r28", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6821F, -0.6914F, -1.7317F, -0.9717F, -0.3303F, 0.5057F));

		PartDefinition bodyfront_r29 = bone5.addOrReplaceChild("bodyfront_r29", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.5038F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 0.3147F, -1.9373F, -1.7326F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r30 = bone5.addOrReplaceChild("bodyfront_r30", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-0.5F, -0.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(78, 37).mirror().addBox(-0.5F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(1.5434F, -4.1779F, 2.0379F, -0.3971F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r31 = bone5.addOrReplaceChild("bodyfront_r31", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.1034F, -0.118F, 0.0261F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.7985F, -4.7043F, 0.5247F, -0.1353F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r32 = bone5.addOrReplaceChild("bodyfront_r32", CubeListBuilder.create().texOffs(58, 34).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(1.7985F, -4.0043F, 0.8247F, -0.6152F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r33 = bone5.addOrReplaceChild("bodyfront_r33", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(-0.3485F, -4.0168F, -1.6721F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.6152F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r34 = bone5.addOrReplaceChild("bodyfront_r34", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(-0.5F, -0.375F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3506F, -3.8836F, 2.1547F, 0.493F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r35 = bone5.addOrReplaceChild("bodyfront_r35", CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-0.5F, -0.075F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.2488F, -2.2715F, -0.5251F, 0.6239F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r36 = bone5.addOrReplaceChild("bodyfront_r36", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-0.3485F, -1.2634F, -0.3032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1912F, -0.2478F, 0.4962F));

		PartDefinition Front_r3 = bone5.addOrReplaceChild("Front_r3", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.8285F, -0.3013F, -0.7092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5936F, 0.7505F, -2.9477F, -0.2545F, 0.1871F, 1.3703F));

		PartDefinition Front_r4 = bone5.addOrReplaceChild("Front_r4", CubeListBuilder.create().texOffs(43, 19).mirror().addBox(-0.5667F, -0.4631F, -0.5453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.5936F, 0.7505F, -2.9477F, -0.3452F, -0.5691F, 0.9601F));

		PartDefinition bodyfront_r37 = bone5.addOrReplaceChild("bodyfront_r37", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(-0.5181F, -1.0173F, -0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5893F, 0.3147F, -1.9373F, 0.9011F, -0.4954F, 0.1956F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 2.447F, -1.8411F, -0.4167F, -0.0982F, -0.2383F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(83, 35).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 6.6556F, -0.4986F, 0.288F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(40, 83).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 7.1327F, 0.3802F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(71, 18).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 6.5267F, 0.587F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(70, 81).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.6595F, -0.402F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, 0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 4.5763F, -0.4868F, 0.48F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(71, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 4.5763F, -0.4868F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(58, 62).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 2.6F, 0.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(55, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, -0.6487F, -0.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightthigh.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(50, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 2.0927F, 0.7786F, -1.7715F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightthigh.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(61, 10).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3042F, 0.9823F, -1.6842F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Rightthigh.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(76, 14).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.1487F, 0.6151F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r12 = Rightthigh.addOrReplaceChild("Rightthigh_r12", CubeListBuilder.create().texOffs(25, 82).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 0.0269F, -0.8472F, -0.829F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r13 = Rightthigh.addOrReplaceChild("Rightthigh_r13", CubeListBuilder.create().texOffs(71, 42).addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 1.1014F, 0.1654F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 6.9644F, 0.9175F, 1.2464F, -0.1266F, 0.1772F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(50, 66).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 4.5247F, 0.8524F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(45, 66).addBox(-0.5F, -0.4F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.5247F, 0.8524F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(45, 44).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(35, 83).addBox(-0.5F, 0.6174F, 0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 83).addBox(-0.5F, 0.0174F, 0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(21, 48).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(32, 18).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.2616F, 0.3189F, 0.09F, 0.0091F, -0.0397F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(15, 23).addBox(-1.5F, -0.7F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -0.4047F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 2.447F, -1.8411F, 0.2814F, 0.0982F, 0.2383F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 6.6556F, -0.4986F, 0.288F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 7.1327F, 0.3802F, 1.0734F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(71, 18).mirror().addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 6.5267F, 0.587F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(70, 81).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 5.6595F, -0.402F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(5, 82).mirror().addBox(-0.5F, 0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 4.5763F, -0.4868F, 0.48F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(71, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 4.5763F, -0.4868F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(58, 62).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.6F, 0.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(55, 82).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.6487F, -0.1099F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftthigh.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.0927F, 0.7786F, -1.7715F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftthigh.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.3042F, 0.9823F, -1.6842F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Leftthigh.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.1487F, 0.6151F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r12 = Leftthigh.addOrReplaceChild("Leftthigh_r12", CubeListBuilder.create().texOffs(25, 82).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 0.0269F, -0.8472F, -0.829F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r13 = Leftthigh.addOrReplaceChild("Leftthigh_r13", CubeListBuilder.create().texOffs(71, 42).mirror().addBox(-0.5F, -1.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 1.1014F, 0.1654F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 6.9644F, 0.9175F, 1.2464F, 0.1266F, -0.1772F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(50, 66).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5247F, 0.8524F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(-0.5F, -0.4F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5247F, 0.8524F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.5F, 0.6174F, 0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 83).mirror().addBox(-0.5F, 0.0174F, 0.0985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(21, 48).mirror().addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(32, 18).mirror().addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.2616F, 0.3189F, -0.2154F, -0.0091F, 0.0397F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(15, 23).mirror().addBox(-1.5F, -0.7F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2891F, -1.7934F, -0.7538F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.4588F, -0.0143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(34, 86).addBox(0.0F, -1.4588F, -0.0143F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3947F, 0.0013F, -0.1745F, 0.0F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(37, 86).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4588F, 1.9857F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(9, 86).addBox(0.0F, -0.9F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 0).addBox(0.0F, 0.8F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0412F, 0.4857F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.5532F, -0.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, -0.0653F, -0.2177F, 0.0141F));

		PartDefinition Tail4_r2 = Tail2.addOrReplaceChild("Tail4_r2", CubeListBuilder.create().texOffs(34, 46).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, 1.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail2.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(18, 41).addBox(0.0F, -0.95F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, -0.0142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5_r1 = Tail2.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(40, 86).addBox(0.0F, 3.7F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 11).addBox(0.0F, 1.8F, 3.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9429F, -3.4407F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(37, 29).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 66).addBox(0.0F, -0.7926F, 2.0216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.045F, 3.8928F, 0.0682F, -0.3483F, -0.0233F));

		PartDefinition Tail4_r3 = Tail3.addOrReplaceChild("Tail4_r3", CubeListBuilder.create().texOffs(17, 65).addBox(0.0F, -0.525F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5176F, 0.0216F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail6_r1 = Tail3.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(86, 40).addBox(0.0F, 4.9F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9879F, -7.3335F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(11, 35).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0225F, 2.9078F, 0.1537F, -0.1725F, -0.0266F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6637F, 3.7441F, -0.9914F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition hips_r4 = bone2.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(72, 72).addBox(-0.4755F, 0.2579F, -0.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, 0.5084F, 0.0217F, 0.1353F));

		PartDefinition hips_r5 = bone2.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(58, 73).addBox(-0.4755F, 0.101F, 0.1715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, -0.1024F, 0.0217F, 0.1353F));

		PartDefinition hips_r6 = bone2.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(73, 38).addBox(-0.4755F, 0.5313F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(27, 73).addBox(-0.4755F, 0.0313F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, 0.4648F, 0.0217F, 0.1353F));

		PartDefinition hips_r7 = bone2.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(31, 39).addBox(-0.6F, -3.2F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.871F, -3.1329F, -0.3029F, 1.4323F, 0.0182F, 0.1296F));

		PartDefinition hips_r8 = bone2.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(82, 75).addBox(-0.4743F, -0.9125F, -0.7193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, -0.0159F, 0.0104F, 0.1363F));

		PartDefinition hips_r9 = bone2.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(60, 82).addBox(-0.4755F, -0.9367F, 0.061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, -0.2333F, 0.0217F, 0.1353F));

		PartDefinition hips_r10 = bone2.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(41, 51).addBox(-0.4755F, -0.8478F, -2.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, -0.1461F, 0.0217F, 0.1353F));

		PartDefinition hips_r11 = bone2.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(81, 40).addBox(-0.3701F, 1.3852F, 0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 15).addBox(-0.3701F, 0.7852F, 0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, -0.8378F, 0.0F, 0.1047F));

		PartDefinition hips_r12 = bone2.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(81, 43).addBox(-0.3701F, 0.4403F, 0.2051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, -0.6196F, 0.0F, 0.1047F));

		PartDefinition hips_r13 = bone2.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(81, 12).addBox(-0.3701F, 0.7315F, -0.4359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, -0.1396F, 0.0F, 0.1047F));

		PartDefinition hips_r14 = bone2.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(81, 3).addBox(-0.5451F, -0.0457F, -0.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, -0.0087F, 0.0F, 0.1047F));

		PartDefinition hips_r15 = bone2.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5451F, -0.8899F, -0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, 0.1658F, 0.0F, 0.1047F));

		PartDefinition hips_r16 = bone2.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5451F, -1.4532F, -0.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, 0.9076F, 0.0F, 0.1047F));

		PartDefinition hips_r17 = bone2.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(80, 59).addBox(-0.5451F, -1.9501F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, 0.0785F, 0.0F, 0.1047F));

		PartDefinition hips_r18 = bone2.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(72, 78).addBox(-0.5451F, -1.9408F, 0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, 0.3403F, 0.0F, 0.1047F));

		PartDefinition hips_r19 = bone2.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(78, 66).addBox(-0.5451F, -2.1374F, 0.6835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.716F, -2.3688F, -3.3879F, 0.1222F, 0.0F, 0.1047F));

		PartDefinition hips_r20 = bone2.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(68, 64).addBox(-0.5F, -2.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5274F, -1.3555F, -2.1145F, -0.925F, 0.0F, 0.1309F));

		PartDefinition hips_r21 = bone2.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(59, 0).addBox(-0.5F, -1.075F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5346F, -1.4097F, -2.4095F, -0.1833F, 0.0F, 0.1309F));

		PartDefinition hips_r22 = bone2.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.6389F, -2.2022F, -1.9499F, 0.3403F, 0.0F, 0.1309F));

		PartDefinition hips_r23 = bone2.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(7, 59).addBox(-0.5F, -0.95F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0897F, -0.0395F, 1.7198F, 0.4517F, -0.1172F, 0.3295F));

		PartDefinition hips_r24 = bone2.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(54, 58).addBox(-0.7819F, 0.4311F, -0.5661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6134F, -0.5642F, -0.0767F, 0.9753F, -0.1172F, 0.3295F));

		PartDefinition hips_r25 = bone2.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(38, 44).addBox(-0.7599F, -1.0094F, -1.5713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6134F, -0.6642F, 0.0233F, 0.3412F, -0.105F, 0.2249F));

		PartDefinition hips_r26 = bone2.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(15, 77).addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3315F, 1.8335F, -1.4841F, 1.4291F, -0.1172F, 0.3295F));

		PartDefinition hips_r27 = bone2.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(54, 38).addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2633F, 0.1037F, -1.5094F, 0.9928F, -0.1172F, 0.3295F));

		PartDefinition hips_r28 = bone2.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(51, 62).addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4596F, 1.8471F, -0.4924F, 1.5164F, -0.1172F, 0.3295F));

		PartDefinition hips_r29 = bone2.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(59, 14).addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5452F, 1.7371F, 0.4978F, 1.6473F, -0.1172F, 0.3295F));

		PartDefinition hips_r30 = bone2.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(33, 54).addBox(-0.5F, -0.925F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5801F, 1.5212F, 1.3709F, 1.7869F, -0.1172F, 0.3295F));

		PartDefinition hips_r31 = bone2.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(54, 10).addBox(-0.5F, -0.925F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5592F, 1.1259F, 2.2892F, 1.9614F, -0.1172F, 0.3295F));

		PartDefinition hips_r32 = bone2.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(74, 28).addBox(-0.5F, -0.575F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1742F, 0.029F, 2.2103F, 2.2494F, -0.1172F, 0.3295F));

		PartDefinition hips_r33 = bone2.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(37, 74).addBox(-0.5F, -0.475F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1954F, 0.3053F, 3.1644F, 1.9003F, -0.1172F, 0.3295F));

		PartDefinition hips_r34 = bone2.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(75, 57).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2801F, 1.3458F, -3.4692F, 1.1324F, -0.1172F, 0.3295F));

		PartDefinition hips_r35 = bone2.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(66, 14).addBox(-0.5F, -0.3F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(66, 4).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.4802F, 0.5023F, -2.7588F, 2.1447F, -0.1172F, 0.3295F));

		PartDefinition hips_r36 = bone2.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(76, 0).addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4608F, 0.7222F, -3.2074F, 2.0138F, -0.1172F, 0.3295F));

		PartDefinition hips_r37 = bone2.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(72, 75).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.1455F, 1.5385F, -2.9172F, 1.1848F, -0.1172F, 0.3295F));

		PartDefinition hips_r38 = bone2.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(75, 11).addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.022F, 1.6934F, -2.3508F, 1.2546F, -0.1172F, 0.3295F));

		PartDefinition hips_r39 = bone2.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(32, 74).addBox(-0.5F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(74, 31).addBox(-0.5F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1954F, 0.3053F, 3.1644F, 2.2058F, -0.1172F, 0.3295F));

		PartDefinition hips_r40 = bone2.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(74, 25).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.2302F, 0.2129F, 2.1552F, 1.2895F, -0.1172F, 0.3295F));

		PartDefinition hips_r41 = bone2.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(78, 63).addBox(-0.5F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3027F, -1.0449F, 1.3295F, 1.8135F, -0.0594F, 0.3442F));

		PartDefinition hips_r42 = bone2.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(51, 34).addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2884F, -0.7035F, 0.5749F, 1.3348F, -0.1193F, 0.2417F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6637F, 3.7441F, -0.9914F, 0.1298F, -0.017F, -0.0011F));

		PartDefinition hips_r43 = bone6.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.5245F, 0.2579F, -0.801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, 0.5084F, -0.0217F, -0.1353F));

		PartDefinition hips_r44 = bone6.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(-0.5245F, 0.101F, 0.1715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, -0.1024F, -0.0217F, -0.1353F));

		PartDefinition hips_r45 = bone6.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(73, 38).mirror().addBox(-0.5245F, 0.5313F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(27, 73).mirror().addBox(-0.5245F, 0.0313F, 0.3777F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, 0.4648F, -0.0217F, -0.1353F));

		PartDefinition hips_r46 = bone6.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(31, 39).mirror().addBox(-0.4F, -3.2F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.1329F, -0.3029F, 1.4323F, -0.0182F, -0.1296F));

		PartDefinition hips_r47 = bone6.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-0.5257F, -0.9125F, -0.7193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, -0.0159F, -0.0104F, -0.1363F));

		PartDefinition hips_r48 = bone6.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(60, 82).mirror().addBox(-0.5245F, -0.9367F, 0.061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, -0.2333F, -0.0217F, -0.1353F));

		PartDefinition hips_r49 = bone6.addOrReplaceChild("hips_r49", CubeListBuilder.create().texOffs(41, 51).mirror().addBox(-0.5245F, -0.8478F, -2.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, -0.1461F, -0.0217F, -0.1353F));

		PartDefinition hips_r50 = bone6.addOrReplaceChild("hips_r50", CubeListBuilder.create().texOffs(81, 40).mirror().addBox(-0.6299F, 1.3852F, 0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 15).mirror().addBox(-0.6299F, 0.7852F, 0.4371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, -0.8378F, 0.0F, -0.1047F));

		PartDefinition hips_r51 = bone6.addOrReplaceChild("hips_r51", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.6299F, 0.4403F, 0.2051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, -0.6196F, 0.0F, -0.1047F));

		PartDefinition hips_r52 = bone6.addOrReplaceChild("hips_r52", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.6299F, 0.7315F, -0.4359F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, -0.1396F, 0.0F, -0.1047F));

		PartDefinition hips_r53 = bone6.addOrReplaceChild("hips_r53", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.4549F, -0.0457F, -0.3472F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, -0.0087F, 0.0F, -0.1047F));

		PartDefinition hips_r54 = bone6.addOrReplaceChild("hips_r54", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.4549F, -0.8899F, -0.3763F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, 0.1658F, 0.0F, -0.1047F));

		PartDefinition hips_r55 = bone6.addOrReplaceChild("hips_r55", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.4549F, -1.4532F, -0.09F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, 0.9076F, 0.0F, -0.1047F));

		PartDefinition hips_r56 = bone6.addOrReplaceChild("hips_r56", CubeListBuilder.create().texOffs(80, 59).mirror().addBox(-0.4549F, -1.9501F, -1.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, 0.0785F, 0.0F, -0.1047F));

		PartDefinition hips_r57 = bone6.addOrReplaceChild("hips_r57", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.4549F, -1.9408F, 0.1389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, 0.3403F, 0.0F, -0.1047F));

		PartDefinition hips_r58 = bone6.addOrReplaceChild("hips_r58", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-0.4549F, -2.1374F, 0.6835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.716F, -2.3688F, -3.3879F, 0.1222F, 0.0F, -0.1047F));

		PartDefinition hips_r59 = bone6.addOrReplaceChild("hips_r59", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-0.5F, -2.075F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5274F, -1.3555F, -2.1145F, -0.925F, 0.0F, -0.1309F));

		PartDefinition hips_r60 = bone6.addOrReplaceChild("hips_r60", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5F, -1.075F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5346F, -1.4097F, -2.4095F, -0.1833F, 0.0F, -0.1309F));

		PartDefinition hips_r61 = bone6.addOrReplaceChild("hips_r61", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5F, -0.475F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6389F, -2.2022F, -1.9499F, 0.3403F, 0.0F, -0.1309F));

		PartDefinition hips_r62 = bone6.addOrReplaceChild("hips_r62", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-0.5F, -0.95F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0897F, -0.0395F, 1.7198F, 0.4517F, 0.1172F, -0.3295F));

		PartDefinition hips_r63 = bone6.addOrReplaceChild("hips_r63", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-0.2181F, 0.4311F, -0.5661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -0.5642F, -0.0767F, 0.9753F, 0.1172F, -0.3295F));

		PartDefinition hips_r64 = bone6.addOrReplaceChild("hips_r64", CubeListBuilder.create().texOffs(38, 44).mirror().addBox(-0.2401F, -1.0094F, -1.5713F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -0.6642F, 0.0233F, 0.3412F, 0.105F, -0.2249F));

		PartDefinition hips_r65 = bone6.addOrReplaceChild("hips_r65", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3315F, 1.8335F, -1.4841F, 1.4291F, 0.1172F, -0.3295F));

		PartDefinition hips_r66 = bone6.addOrReplaceChild("hips_r66", CubeListBuilder.create().texOffs(54, 38).mirror().addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2633F, 0.1037F, -1.5094F, 0.9928F, 0.1172F, -0.3295F));

		PartDefinition hips_r67 = bone6.addOrReplaceChild("hips_r67", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4596F, 1.8471F, -0.4924F, 1.5164F, 0.1172F, -0.3295F));

		PartDefinition hips_r68 = bone6.addOrReplaceChild("hips_r68", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-0.5F, -1.025F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5452F, 1.7371F, 0.4978F, 1.6473F, 0.1172F, -0.3295F));

		PartDefinition hips_r69 = bone6.addOrReplaceChild("hips_r69", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-0.5F, -0.925F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5801F, 1.5212F, 1.3709F, 1.7869F, 0.1172F, -0.3295F));

		PartDefinition hips_r70 = bone6.addOrReplaceChild("hips_r70", CubeListBuilder.create().texOffs(54, 10).mirror().addBox(-0.5F, -0.925F, 0.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5592F, 1.1259F, 2.2892F, 1.9614F, 0.1172F, -0.3295F));

		PartDefinition hips_r71 = bone6.addOrReplaceChild("hips_r71", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-0.5F, -0.575F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1742F, 0.029F, 2.2103F, 2.2494F, 0.1172F, -0.3295F));

		PartDefinition hips_r72 = bone6.addOrReplaceChild("hips_r72", CubeListBuilder.create().texOffs(37, 74).mirror().addBox(-0.5F, -0.475F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1954F, 0.3053F, 3.1644F, 1.9003F, 0.1172F, -0.3295F));

		PartDefinition hips_r73 = bone6.addOrReplaceChild("hips_r73", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2801F, 1.3458F, -3.4692F, 1.1324F, 0.1172F, -0.3295F));

		PartDefinition hips_r74 = bone6.addOrReplaceChild("hips_r74", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-0.5F, -0.3F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 4).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.4802F, 0.5023F, -2.7588F, 2.1447F, 0.1172F, -0.3295F));

		PartDefinition hips_r75 = bone6.addOrReplaceChild("hips_r75", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.5F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4608F, 0.7222F, -3.2074F, 2.0138F, 0.1172F, -0.3295F));

		PartDefinition hips_r76 = bone6.addOrReplaceChild("hips_r76", CubeListBuilder.create().texOffs(72, 75).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-0.1455F, 1.5385F, -2.9172F, 1.1848F, 0.1172F, -0.3295F));

		PartDefinition hips_r77 = bone6.addOrReplaceChild("hips_r77", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(-0.5F, -0.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.022F, 1.6934F, -2.3508F, 1.2546F, 0.1172F, -0.3295F));

		PartDefinition hips_r78 = bone6.addOrReplaceChild("hips_r78", CubeListBuilder.create().texOffs(32, 74).mirror().addBox(-0.5F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(74, 31).mirror().addBox(-0.5F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1954F, 0.3053F, 3.1644F, 2.2058F, 0.1172F, -0.3295F));

		PartDefinition hips_r79 = bone6.addOrReplaceChild("hips_r79", CubeListBuilder.create().texOffs(74, 25).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.2302F, 0.2129F, 2.1552F, 1.2895F, 0.1172F, -0.3295F));

		PartDefinition hips_r80 = bone6.addOrReplaceChild("hips_r80", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-0.5F, -0.625F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, -1.0449F, 1.3295F, 1.8135F, 0.0594F, -0.3442F));

		PartDefinition hips_r81 = bone6.addOrReplaceChild("hips_r81", CubeListBuilder.create().texOffs(51, 34).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2884F, -0.7035F, 0.5749F, 1.3348F, 0.1193F, -0.2417F));

		return LayerDefinition.create(meshdefinition, 90, 90);
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