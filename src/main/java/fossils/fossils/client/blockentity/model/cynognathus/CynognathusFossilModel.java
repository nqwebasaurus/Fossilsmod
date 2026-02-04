package fossils.fossils.client.blockentity.model.cynognathus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CynognathusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Belly;
	private final ModelPart body;
	private final ModelPart body2;
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
	private final ModelPart Head;
	private final ModelPart Lowerjaw1;
	private final ModelPart bone2;
	private final ModelPart leftFace;
	private final ModelPart bone3;
	private final ModelPart rightFace;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone7;
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
	private final ModelPart bone4;
	private final ModelPart bone6;

	public CynognathusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Belly = this.Hips.getChild("Belly");
		this.body = this.Belly.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
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
		this.Head = this.Neck3.getChild("Head");
		this.Lowerjaw1 = this.Head.getChild("Lowerjaw1");
		this.bone2 = this.Lowerjaw1.getChild("bone2");
		this.leftFace = this.Head.getChild("leftFace");
		this.bone3 = this.leftFace.getChild("bone3");
		this.rightFace = this.Head.getChild("rightFace");
		this.bone5 = this.rightFace.getChild("bone5");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone7 = this.Bodyfront.getChild("bone7");
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
		this.bone4 = this.Hips.getChild("bone4");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.4F, 5.2F, -0.4929F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(42, 90).addBox(0.0F, -1.2617F, 0.0069F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -0.613F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(39, 90).addBox(0.0F, -1.457F, 0.0041F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -2.613F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(63, 90).mirror().addBox(-0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 62).mirror().addBox(-0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 59).mirror().addBox(-0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(63, 90).addBox(0.5F, -1.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 62).addBox(0.5F, -1.5F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 59).addBox(0.5F, -1.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5717F, -4.1151F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(25, 90).addBox(0.0F, -1.4F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 10).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6502F, -5.613F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly = Hips.addOrReplaceChild("Belly", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8722F, -5.5976F, 0.2638F, 0.0F, 0.0F));

		PartDefinition Belly_r1 = Belly.addOrReplaceChild("Belly_r1", CubeListBuilder.create().texOffs(36, 88).addBox(0.0F, -1.3809F, -0.0101F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1573F, -0.9404F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Belly.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 45).mirror().addBox(-0.6348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2933F, -0.5278F, 0.2135F, 0.1979F, -0.5464F));

		PartDefinition cube_r2 = Belly.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 43).mirror().addBox(-1.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, 0.2127F, 0.6821F, -1.1843F));

		PartDefinition cube_r3 = Belly.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1933F, -2.5278F, 0.5834F, 0.4558F, -0.591F));

		PartDefinition cube_r4 = Belly.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 29).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, 0.181F, 0.4062F, -1.114F));

		PartDefinition cube_r5 = Belly.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1433F, -4.5278F, 0.401F, 0.2376F, -0.5666F));

		PartDefinition cube_r6 = Belly.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 45).addBox(-0.3652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2933F, -0.5278F, 0.2135F, -0.1979F, 0.5464F));

		PartDefinition cube_r7 = Belly.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 43).addBox(0.7767F, -0.525F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, 0.2127F, -0.6821F, 1.1843F));

		PartDefinition cube_r8 = Belly.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 35).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1933F, -2.5278F, 0.5834F, -0.4558F, 0.591F));

		PartDefinition cube_r9 = Belly.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 29).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, 0.181F, -0.4062F, 1.114F));

		PartDefinition cube_r10 = Belly.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 33).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1433F, -4.5278F, 0.401F, -0.2376F, 0.5666F));

		PartDefinition Belly_r2 = Belly.addOrReplaceChild("Belly_r2", CubeListBuilder.create().texOffs(33, 88).addBox(0.0F, -1.2258F, -0.0079F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.2573F, -2.9404F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Belly_r3 = Belly.addOrReplaceChild("Belly_r3", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -1.0956F, -0.0056F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.3574F, -4.9404F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Belly_r4 = Belly.addOrReplaceChild("Belly_r4", CubeListBuilder.create().texOffs(15, 19).addBox(-0.5F, 0.0F, 7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6573F, -12.9404F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Belly.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0236F, -5.8422F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Belly_r5 = body.addOrReplaceChild("Belly_r5", CubeListBuilder.create().texOffs(88, 73).addBox(0.0F, -1.1405F, -0.0033F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, -0.024F, 0.1097F, -1.6419F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 45).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, 0.0343F, 0.1069F, -1.1152F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 67).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0198F, -0.6856F, 0.1216F, 0.055F, -0.5712F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 51).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, 0.1323F, 0.0365F, -0.5039F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 27).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, 0.0531F, 0.0966F, -1.0464F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0552F, -2.5856F, -0.0025F, 0.1102F, -1.5727F));

		PartDefinition Belly_r6 = body.addOrReplaceChild("Belly_r6", CubeListBuilder.create().texOffs(13, 1).mirror().addBox(-5.5F, 0.1F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 1).mirror().addBox(-4.5F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4774F, 6.111F, -4.8638F, 0.2058F, 1.1626F, 0.5479F));

		PartDefinition Belly_r7 = body.addOrReplaceChild("Belly_r7", CubeListBuilder.create().texOffs(10, 1).mirror().addBox(-4.1F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4774F, 6.111F, -4.8638F, 0.1899F, 0.8103F, 0.515F));

		PartDefinition Belly_r8 = body.addOrReplaceChild("Belly_r8", CubeListBuilder.create().texOffs(13, 1).addBox(4.5F, 0.1F, -0.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 1).addBox(0.5F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4774F, 6.111F, -4.8638F, 0.2058F, -1.1626F, -0.5479F));

		PartDefinition Belly_r9 = body.addOrReplaceChild("Belly_r9", CubeListBuilder.create().texOffs(10, 1).addBox(0.1F, 0.1F, -0.2F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4774F, 6.111F, -4.8638F, 0.1899F, -0.8103F, -0.515F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 53).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, -0.024F, -0.1097F, 1.6419F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 45).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, 0.0343F, -0.1069F, 1.1152F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 67).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0198F, -0.6856F, 0.1216F, -0.055F, 0.5712F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(88, 51).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, 0.1323F, -0.0365F, 0.5039F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(59, 27).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, 0.0531F, -0.0966F, 1.0464F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 61).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0552F, -2.5856F, -0.0025F, -0.1102F, 1.5727F));

		PartDefinition Belly_r10 = body.addOrReplaceChild("Belly_r10", CubeListBuilder.create().texOffs(88, 47).addBox(0.0F, -1.2353F, -0.001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Belly_r11 = body.addOrReplaceChild("Belly_r11", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.207F, -3.9505F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Belly_r12 = body2.addOrReplaceChild("Belly_r12", CubeListBuilder.create().texOffs(89, 39).addBox(0.0F, -1.3302F, 0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Belly_r13 = body2.addOrReplaceChild("Belly_r13", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-2.8F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4774F, 6.318F, -0.9133F, -0.0845F, 0.3343F, 0.1394F));

		PartDefinition cube_r23 = body2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.004F, 0.0751F, -1.5203F));

		PartDefinition cube_r24 = body2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.041F, 0.0631F, -0.9955F));

		PartDefinition cube_r25 = body2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 37).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1017F, -0.5851F, 0.1047F, 0.014F, -0.4527F));

		PartDefinition Belly_r14 = body2.addOrReplaceChild("Belly_r14", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-2.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6634F, 6.1179F, -2.8945F, -0.086F, 0.1068F, 0.1415F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 88).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0264F, -0.0247F, -0.4349F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(63, 62).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, -0.0059F, -0.0105F, -0.9793F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(63, 60).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0017F, -2.5851F, 0.0002F, -0.0121F, -1.503F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 33).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.004F, -0.0751F, 1.5203F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 31).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.041F, -0.0631F, 0.9955F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(89, 37).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1017F, -0.5851F, 0.1047F, -0.014F, 0.4527F));

		PartDefinition Belly_r15 = body2.addOrReplaceChild("Belly_r15", CubeListBuilder.create().texOffs(22, 39).addBox(-1.4607F, -1.0493F, -0.1203F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.9607F, 6.6711F, -4.3229F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Belly_r16 = body2.addOrReplaceChild("Belly_r16", CubeListBuilder.create().texOffs(65, 0).addBox(-0.2F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4774F, 6.318F, -0.9133F, -0.0845F, -0.3343F, -0.1394F));

		PartDefinition Belly_r17 = body2.addOrReplaceChild("Belly_r17", CubeListBuilder.create().texOffs(64, 29).addBox(-0.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6634F, 6.1179F, -2.8945F, -0.086F, -0.1068F, -0.1415F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 88).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0264F, 0.0247F, 0.4349F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 62).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, -0.0059F, 0.0105F, 0.9793F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(63, 60).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0017F, -2.5851F, 0.0002F, 0.0121F, 1.503F));

		PartDefinition Belly_r18 = body2.addOrReplaceChild("Belly_r18", CubeListBuilder.create().texOffs(88, 77).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Belly_r19 = body2.addOrReplaceChild("Belly_r19", CubeListBuilder.create().texOffs(37, 32).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.3029F, -6.9476F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2092F, -4.0323F, 0.081F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(88, 29).addBox(0.0F, -1.6F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -0.8476F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(54, 66).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -2.9476F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(88, 25).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -4.9476F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(33, 39).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3029F, -6.9476F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(52, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5893F, -4.6934F, -0.829F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(25, 81).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.8476F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = Bodyfront.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(49, 64).mirror().addBox(-2.4F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4558F, 6.2936F, -0.8667F, -0.2547F, 0.0172F, 0.0879F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-2.3959F, 0.3879F, -0.5724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2853F, 5.3573F, -2.7207F, -0.3236F, 0.1613F, 0.1869F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-2.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.1263F, 0.4153F, -1.2856F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 9).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -6.5483F, 0.3619F, 0.2717F, -0.7262F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.0365F, 0.095F, -1.1694F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-3.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, -0.0161F, 0.1005F, -1.6955F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(78, 89).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -4.5483F, 0.1173F, 0.0437F, -0.6259F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(30, 24).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, -0.0153F, -0.015F, -1.0663F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 16).mirror().addBox(-4.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, -0.0058F, -0.0207F, -1.5899F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -2.5483F, 0.016F, -0.0237F, -0.5217F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-3.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0317F, -0.0459F, -1.0484F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-5.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0045F, -0.0556F, -1.5726F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 89).mirror().addBox(-0.9348F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2109F, -0.5483F, -0.0139F, -0.0416F, -0.5033F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(49, 64).addBox(-0.6F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4558F, 6.2936F, -0.8667F, -0.2547F, -0.0172F, -0.0879F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(40, 64).addBox(-0.6041F, 0.3879F, -0.5724F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2853F, 5.3573F, -2.7207F, -0.3236F, -0.1613F, -0.1869F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -0.9906F, -0.0423F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8971F, -3.7476F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(73, 55).addBox(0.7767F, -0.525F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.1263F, -0.4153F, 1.2856F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 9).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -6.5483F, 0.3619F, -0.2717F, 0.7262F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(64, 39).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.0365F, -0.095F, 1.1694F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 0).addBox(2.9922F, -2.343F, -0.4258F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, -0.0161F, -0.1005F, 1.6955F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 89).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -4.5483F, 0.1173F, -0.0437F, 0.6259F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(30, 24).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, -0.0153F, 0.015F, 1.0663F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 16).addBox(2.9922F, -2.343F, -0.4258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, -0.0058F, 0.0207F, 1.5899F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(85, 65).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -2.5483F, 0.016F, 0.0237F, 0.5217F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(64, 37).addBox(0.7767F, -0.525F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0317F, 0.0459F, 1.0484F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(64, 35).addBox(2.9922F, -2.343F, -0.4258F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0045F, 0.0556F, 1.5726F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(73, 89).addBox(-0.0652F, -0.0436F, -0.4066F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2109F, -0.5483F, -0.0139F, 0.0416F, 0.5033F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(14, 63).addBox(-0.5F, 3.8836F, -0.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.4484F, 4.5452F, -4.0856F, 0.3241F, 0.0636F, -0.3689F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(83, 73).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(83, 67).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.3836F, 0.0762F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(10, 82).addBox(-0.5F, -1.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(73, 68).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(30, 79).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4945F, -0.1912F, -1.1445F, 0.669F, -0.4116F, 0.6694F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(78, 80).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1254F, -0.4366F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightupperarm.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(51, 78).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1104F, 0.0043F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r7 = Rightupperarm.addOrReplaceChild("Rightupperarm_r7", CubeListBuilder.create().texOffs(68, 73).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6223F, -0.1479F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r8 = Rightupperarm.addOrReplaceChild("Rightupperarm_r8", CubeListBuilder.create().texOffs(63, 73).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.346F, 0.4214F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r9 = Rightupperarm.addOrReplaceChild("Rightupperarm_r9", CubeListBuilder.create().texOffs(68, 52).addBox(0.0F, 0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -0.2962F, -0.1114F, 0.0854F, 0.0181F, -0.2087F));

		PartDefinition Rightupperarm_r10 = Rightupperarm.addOrReplaceChild("Rightupperarm_r10", CubeListBuilder.create().texOffs(68, 47).addBox(-0.5F, -1.3F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9836F, 0.1762F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(80, 0).addBox(0.2F, -0.2242F, 0.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.1F, 4.5888F, -0.0398F, -0.2679F, 0.0754F, 0.505F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(84, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(65, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(73, 32).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 1.0758F, 0.1291F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(5, 82).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(0, 82).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r6 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r6", CubeListBuilder.create().texOffs(80, 53).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r7 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r7", CubeListBuilder.create().texOffs(55, 87).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r8 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r8", CubeListBuilder.create().texOffs(68, 6).addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.7F, 0.7758F, 1.2291F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r9 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r9", CubeListBuilder.create().texOffs(80, 10).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7F, 0.6758F, 1.2791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(44, 44).addBox(-1.4F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 0.6979F, -0.0843F, -0.0225F));

		PartDefinition Rightfrontfoot2 = Rightfrontfoot.addOrReplaceChild("Rightfrontfoot2", CubeListBuilder.create().texOffs(30, 19).addBox(-1.4F, -0.4859F, -3.0182F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, -0.3765F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(40, 66).addBox(-0.5F, 3.8836F, -0.4238F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.4484F, 4.5452F, -4.0856F, 0.4764F, -0.2125F, 0.53F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(40, 84).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(84, 37).addBox(-0.5F, -0.7F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.3836F, 0.0762F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(83, 3).addBox(-0.5F, -1.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(58, 74).addBox(-0.5F, -0.5F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0259F, 0.1856F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(79, 41).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4945F, -0.1912F, -1.1445F, 0.669F, 0.4116F, -0.6694F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(60, 81).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1254F, -0.4366F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftupperarm.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(56, 78).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1104F, 0.0043F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r7 = Leftupperarm.addOrReplaceChild("Leftupperarm_r7", CubeListBuilder.create().texOffs(53, 74).addBox(-0.5F, -1.05F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 3.6223F, -0.1479F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r8 = Leftupperarm.addOrReplaceChild("Leftupperarm_r8", CubeListBuilder.create().texOffs(48, 74).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.346F, 0.4214F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r9 = Leftupperarm.addOrReplaceChild("Leftupperarm_r9", CubeListBuilder.create().texOffs(68, 68).addBox(-1.0F, 0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, -0.2962F, -0.1114F, 0.0854F, -0.0181F, 0.2087F));

		PartDefinition Leftupperarm_r10 = Leftupperarm.addOrReplaceChild("Leftupperarm_r10", CubeListBuilder.create().texOffs(63, 68).addBox(-0.5F, -1.3F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.9836F, 0.1762F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(80, 61).addBox(-1.2F, -0.2242F, 0.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.1F, 4.5888F, -0.0398F, -1.8418F, 0.1798F, -0.5635F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(60, 84).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 4.6888F, -0.6026F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 3.6926F, -0.5155F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(75, 10).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 1.9564F, 0.8937F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(73, 49).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 1.0758F, 0.1291F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(82, 56).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.109F))
				.texOffs(35, 82).addBox(-0.5F, -0.8F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 4.7852F, 0.2726F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r6 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r6", CubeListBuilder.create().texOffs(80, 70).addBox(-0.5F, -0.875F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.7F, 3.8132F, 1.0504F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r7 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r7", CubeListBuilder.create().texOffs(87, 56).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 4.2301F, -0.2487F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r8 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r8", CubeListBuilder.create().texOffs(28, 68).addBox(-0.5F, 0.3F, -0.925F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.7F, 0.7758F, 1.2291F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r9 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r9", CubeListBuilder.create().texOffs(80, 64).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 0.6758F, 1.2791F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(45, 12).addBox(-1.6F, -0.4383F, -1.743F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.561F, 0.527F, 1.4833F, 0.0843F, 0.0225F));

		PartDefinition Leftfrontfoot2 = Leftfrontfoot.addOrReplaceChild("Leftfrontfoot2", CubeListBuilder.create().texOffs(13, 32).addBox(-1.6F, -0.4859F, -3.0182F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0594F, -1.455F, 0.1471F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(68, 2).addBox(-0.5F, 0.081F, -2.013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(60, 87).addBox(0.0F, -2.319F, -2.013F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2914F, -6.5663F, -0.2438F, 0.2327F, 0.0321F));

		PartDefinition cube_r57 = Neck.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 26).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6023F, -1.582F, 0.2878F, 0.6299F, -0.9705F));

		PartDefinition cube_r58 = Neck.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(68, 26).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6023F, -1.582F, 0.2878F, -0.6299F, 0.9705F));

		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(42, 60).addBox(-0.5F, -0.5503F, -1.9759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.6666F, -1.875F, -0.297F, 0.3022F, 0.0848F));

		PartDefinition Neck_r1 = Neck2.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(88, 21).addBox(0.0F, -1.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5503F, -1.4759F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Neck2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(73, 72).mirror().addBox(-1.9348F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0043F, -1.57F, 0.1962F, 0.9638F, -1.1637F));

		PartDefinition cube_r60 = Neck2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(73, 72).addBox(-0.0652F, -0.0436F, -0.4066F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0043F, -1.57F, 0.1962F, -0.9638F, 1.1637F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(49, 60).addBox(-0.5F, -0.5167F, -1.9615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.0477F, -1.9295F, 0.1428F, 0.0965F, 0.2761F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0217F, -1.4733F, 0.5583F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(85, 82).addBox(-0.5F, 0.232F, -0.0857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(20, 79).addBox(-0.5F, -0.118F, -0.0857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.0F, -5.7759F, -11.1673F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(78, 67).addBox(-0.5F, -0.1099F, -0.9094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -6.1762F, -10.4461F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -2.0F, -0.975F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -1.3222F, -3.8599F, -0.432F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(78, 26).addBox(-0.5F, -0.9631F, -0.4515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(28, 58).addBox(-0.5F, -0.9631F, 0.0485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.1487F, -10.2078F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(32, 53).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5019F, -7.0233F, -0.192F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(26, 73).addBox(0.5F, -1.025F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -1.663F, 0.5828F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(72, 57).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -3.0047F, 0.7533F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(73, 36).addBox(0.5F, 0.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.2348F, -0.4637F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(10, 71).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.0F, -3.5521F, -1.412F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(48, 70).addBox(0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0F, -3.6132F, -2.4101F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(39, 24).addBox(-1.5F, 0.1153F, 3.0923F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F))
				.texOffs(9, 49).addBox(-1.0F, 0.1153F, 1.0923F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -5.4536F, -7.1212F, -0.3229F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(43, 18).addBox(-0.5F, -1.061F, -0.0695F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -4.4892F, -7.3474F, -0.3752F, 0.0F, 0.0F));

		PartDefinition Lowerjaw1 = Head.addOrReplaceChild("Lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -1.1444F, -1.399F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Lowerjaw20_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw20_r1", CubeListBuilder.create().texOffs(55, 44).mirror().addBox(-0.0594F, 3.3232F, -0.5485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.0014F, -0.2916F, 0.1357F));

		PartDefinition Lowerjaw19_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw19_r1", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-0.0594F, 3.9415F, -0.9581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -1.9142F, -0.2916F, 0.1357F));

		PartDefinition Lowerjaw18_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw18_r1", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-0.0538F, 4.5268F, -0.7119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -1.9135F, -0.2917F, 0.1006F));

		PartDefinition Lowerjaw17_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw17_r1", CubeListBuilder.create().texOffs(57, 33).mirror().addBox(-0.0538F, 5.0892F, -0.2871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -1.9833F, -0.2917F, 0.1006F));

		PartDefinition Lowerjaw16_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw16_r1", CubeListBuilder.create().texOffs(47, 66).mirror().addBox(0.7999F, 5.5834F, -0.3808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -1.9316F, -0.1544F, -0.0452F));

		PartDefinition Lowerjaw15_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r1", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(0.7999F, 6.2208F, -0.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -1.8443F, -0.1544F, -0.0452F));

		PartDefinition Head_r13 = Lowerjaw1.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(-0.5779F, 1.4137F, -1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, 0.6978F, 0.0259F, 3.0237F));

		PartDefinition Head_r14 = Lowerjaw1.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(57, 41).mirror().addBox(-0.5779F, 1.065F, -1.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, 0.4884F, 0.0259F, 3.0237F));

		PartDefinition Head_r15 = Lowerjaw1.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(43, 70).mirror().addBox(-0.5779F, -0.2471F, -0.2932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, -0.0178F, 0.0259F, 3.0237F));

		PartDefinition Head_r16 = Lowerjaw1.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-0.5779F, -0.3161F, -0.7507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, 0.2266F, 0.0259F, 3.0237F));

		PartDefinition Lowerjaw14_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r1", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-0.4223F, 0.4966F, -1.6577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, -1.849F, -0.0498F, -0.0797F));

		PartDefinition Lowerjaw11_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r1", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(0.7798F, -6.5761F, -3.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F)).mirror(false)
				.texOffs(83, 79).mirror().addBox(0.7798F, -6.3761F, -4.3386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 0.8797F, -0.1608F, -0.0549F));

		PartDefinition Lowerjaw14_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r2", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-0.4133F, -0.6815F, -1.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, -0.8888F, -0.0563F, -0.0892F));

		PartDefinition Lowerjaw13_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r1", CubeListBuilder.create().texOffs(78, 4).mirror().addBox(-0.4133F, 0.0663F, -1.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, -1.5171F, -0.0563F, -0.0892F));

		PartDefinition Lowerjaw12_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r1", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-0.4133F, -0.2605F, -0.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3445F, -2.1676F, -8.2865F, -2.8436F, -0.0563F, -0.0892F));

		PartDefinition Lowerjaw11_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r2", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(0.7798F, -6.151F, 4.4543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 2.1189F, -0.1608F, -0.0549F));

		PartDefinition Lowerjaw10_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r1", CubeListBuilder.create().texOffs(21, 62).mirror().addBox(0.7929F, 2.5639F, -7.3352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -0.7095F, -0.1567F, -0.0481F));

		PartDefinition Lowerjaw13_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r2", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-0.0939F, 5.2357F, 1.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false)
				.texOffs(69, 41).mirror().addBox(-0.0939F, 4.2356F, 2.1623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.1001F, -0.2931F, 0.0496F));

		PartDefinition Lowerjaw9_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r1", CubeListBuilder.create().texOffs(73, 22).mirror().addBox(0.7798F, 0.21F, -6.6956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -0.342F, -0.1608F, -0.0549F));

		PartDefinition Lowerjaw8_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r1", CubeListBuilder.create().texOffs(25, 77).mirror().addBox(0.2366F, -0.7169F, -5.9542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(18, 51).mirror().addBox(0.2366F, -0.7169F, -5.1542F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -0.2121F, -0.229F, 0.0546F));

		PartDefinition Lowerjaw11_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r3", CubeListBuilder.create().texOffs(52, 16).mirror().addBox(-0.097F, 2.4595F, 1.1198F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.1008F, -0.2931F, 0.0846F));

		PartDefinition Lowerjaw10_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r2", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-0.097F, 0.6595F, 0.4833F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.2578F, -0.2931F, 0.0846F));

		PartDefinition Lowerjaw9_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r2", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.097F, -1.1348F, 2.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.7814F, -0.2931F, 0.0846F));

		PartDefinition Lowerjaw8_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r2", CubeListBuilder.create().texOffs(43, 74).mirror().addBox(-0.097F, -1.5679F, 1.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -2.9385F, -0.2931F, 0.0846F));

		PartDefinition Lowerjaw7_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r1", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.097F, -2.3474F, -0.6371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 2.2277F, -0.2931F, 0.0846F));

		PartDefinition Lowerjaw6_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r1", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.0721F, 0.4289F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(83, 13).mirror().addBox(-0.0721F, 0.4289F, 0.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 0.3878F, -0.3024F, 0.1108F));

		PartDefinition Lowerjaw6_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r2", CubeListBuilder.create().texOffs(9, 43).mirror().addBox(-0.0721F, -2.1049F, -3.1934F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 0.222F, -0.3024F, 0.1108F));

		PartDefinition Lowerjaw6_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r3", CubeListBuilder.create().texOffs(38, 70).mirror().addBox(-0.0721F, -1.2495F, -1.4931F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.092F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, 1.435F, -0.3024F, 0.1108F));

		PartDefinition Lowerjaw5_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r1", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.0721F, -0.9459F, -1.9413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -0.7728F, -0.3024F, 0.1108F));

		PartDefinition Lowerjaw4_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r1", CubeListBuilder.create().texOffs(45, 6).mirror().addBox(-0.0721F, -0.724F, -2.3216F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(-2.5725F, -0.2223F, -1.3661F, -0.2929F, -0.3024F, 0.1108F));

		PartDefinition Lowerjaw12_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r2", CubeListBuilder.create().texOffs(27, 45).addBox(-0.9061F, 5.2357F, 1.3623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.092F))
				.texOffs(69, 41).addBox(-0.9061F, 4.2356F, 2.1623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.1001F, 0.2931F, -0.0496F));

		PartDefinition Lowerjaw10_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r3", CubeListBuilder.create().texOffs(52, 16).addBox(-0.903F, 2.4595F, 1.1198F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.1008F, 0.2931F, -0.0846F));

		PartDefinition Lowerjaw9_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r3", CubeListBuilder.create().texOffs(0, 40).addBox(-0.903F, 0.6595F, 0.4833F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.2578F, 0.2931F, -0.0846F));

		PartDefinition Lowerjaw8_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r3", CubeListBuilder.create().texOffs(83, 76).addBox(-0.903F, -1.1348F, 2.3935F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.7814F, 0.2931F, -0.0846F));

		PartDefinition Lowerjaw7_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r2", CubeListBuilder.create().texOffs(43, 74).addBox(-0.903F, -1.5679F, 1.6845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.9385F, 0.2931F, -0.0846F));

		PartDefinition Lowerjaw6_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw6_r4", CubeListBuilder.create().texOffs(66, 22).addBox(-0.903F, -2.3474F, -0.6371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.085F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 2.2277F, 0.2931F, -0.0846F));

		PartDefinition Lowerjaw5_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r2", CubeListBuilder.create().texOffs(38, 70).addBox(-0.9279F, -1.2495F, -1.4931F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.092F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 1.435F, 0.3024F, -0.1108F));

		PartDefinition Lowerjaw5_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r3", CubeListBuilder.create().texOffs(75, 83).addBox(-0.9279F, 0.4289F, -0.4575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(83, 13).addBox(-0.9279F, 0.4289F, 0.2425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 0.3878F, 0.3024F, -0.1108F));

		PartDefinition Head_r17 = Lowerjaw1.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(58, 70).addBox(-0.4221F, -0.3161F, -0.7507F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, 0.2266F, -0.0259F, -3.0237F));

		PartDefinition Head_r18 = Lowerjaw1.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(43, 70).addBox(-0.4221F, -0.2471F, -0.2932F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, -0.0178F, -0.0259F, -3.0237F));

		PartDefinition Head_r19 = Lowerjaw1.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(57, 41).addBox(-0.4221F, 1.065F, -1.1126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, 0.4884F, -0.0259F, -3.0237F));

		PartDefinition Head_r20 = Lowerjaw1.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(78, 14).addBox(-0.4221F, 1.4137F, -1.4782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, 0.6978F, -0.0259F, -3.0237F));

		PartDefinition Lowerjaw9_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw9_r4", CubeListBuilder.create().texOffs(21, 62).addBox(-1.7929F, 2.5639F, -7.3352F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -0.7095F, 0.1567F, 0.0481F));

		PartDefinition Lowerjaw13_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r3", CubeListBuilder.create().texOffs(78, 7).addBox(-0.5867F, -0.6815F, -1.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, -0.8888F, 0.0563F, 0.0892F));

		PartDefinition Lowerjaw19_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw19_r2", CubeListBuilder.create().texOffs(55, 44).addBox(-0.9406F, 3.3232F, -0.5485F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -2.0014F, 0.2916F, -0.1357F));

		PartDefinition Lowerjaw18_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw18_r2", CubeListBuilder.create().texOffs(57, 29).addBox(-0.9406F, 3.9415F, -0.9581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -1.9142F, 0.2916F, -0.1357F));

		PartDefinition Lowerjaw17_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw17_r2", CubeListBuilder.create().texOffs(35, 58).addBox(-0.9462F, 4.5268F, -0.7119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -1.9135F, 0.2917F, -0.1006F));

		PartDefinition Lowerjaw16_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw16_r2", CubeListBuilder.create().texOffs(57, 33).addBox(-0.9462F, 5.0892F, -0.2871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -1.9833F, 0.2917F, -0.1006F));

		PartDefinition Lowerjaw15_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw15_r2", CubeListBuilder.create().texOffs(47, 66).addBox(-1.7999F, 5.5834F, -0.3808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -1.9316F, 0.1544F, 0.0452F));

		PartDefinition Lowerjaw14_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw14_r3", CubeListBuilder.create().texOffs(25, 84).addBox(-1.7999F, 6.2208F, -0.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -1.8443F, 0.1544F, 0.0452F));

		PartDefinition Lowerjaw13_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw13_r4", CubeListBuilder.create().texOffs(59, 19).addBox(-0.5777F, 0.4966F, -1.6577F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, -1.849F, 0.0498F, 0.0797F));

		PartDefinition Lowerjaw12_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw12_r3", CubeListBuilder.create().texOffs(78, 4).addBox(-0.5867F, 0.0663F, -1.3182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, -1.5171F, 0.0563F, 0.0892F));

		PartDefinition Lowerjaw11_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw11_r4", CubeListBuilder.create().texOffs(50, 87).addBox(-0.5867F, -0.2605F, -0.0636F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1445F, -2.1676F, -8.2865F, -2.8436F, 0.0563F, 0.0892F));

		PartDefinition Lowerjaw10_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r4", CubeListBuilder.create().texOffs(80, 83).addBox(-1.7798F, -6.151F, 4.4543F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 2.1189F, 0.1608F, 0.0549F));

		PartDefinition Lowerjaw10_r5 = Lowerjaw1.addOrReplaceChild("Lowerjaw10_r5", CubeListBuilder.create().texOffs(79, 38).addBox(-1.7798F, -6.5761F, -3.8386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.093F))
				.texOffs(83, 79).addBox(-1.7798F, -6.3761F, -4.3386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 0.8797F, 0.1608F, 0.0549F));

		PartDefinition Lowerjaw8_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw8_r4", CubeListBuilder.create().texOffs(73, 22).addBox(-1.7798F, 0.21F, -6.6956F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -0.342F, 0.1608F, 0.0549F));

		PartDefinition Lowerjaw7_r3 = Lowerjaw1.addOrReplaceChild("Lowerjaw7_r3", CubeListBuilder.create().texOffs(25, 77).addBox(-1.2366F, -0.7169F, -5.9542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(18, 51).addBox(-1.2366F, -0.7169F, -5.1542F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -0.2121F, 0.229F, -0.0546F));

		PartDefinition Lowerjaw5_r4 = Lowerjaw1.addOrReplaceChild("Lowerjaw5_r4", CubeListBuilder.create().texOffs(9, 43).addBox(-0.9279F, -2.1049F, -3.1934F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, 0.222F, 0.3024F, -0.1108F));

		PartDefinition Lowerjaw4_r2 = Lowerjaw1.addOrReplaceChild("Lowerjaw4_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-0.9279F, -0.9459F, -1.9413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -0.7728F, 0.3024F, -0.1108F));

		PartDefinition Lowerjaw3_r1 = Lowerjaw1.addOrReplaceChild("Lowerjaw3_r1", CubeListBuilder.create().texOffs(45, 6).addBox(-0.9279F, -0.724F, -2.3216F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(2.3725F, -0.2223F, -1.3661F, -0.2929F, 0.3024F, -0.1108F));

		PartDefinition bone2 = Lowerjaw1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.3725F, -0.2223F, -1.3661F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(2.3667F, -1.2203F, -0.1702F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(5, 85).addBox(-0.4177F, -0.881F, -2.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.779F, -2.6568F, -9.4053F, -0.1555F, 0.319F, -0.2006F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5252F, -0.2512F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.0643F, 0.2911F, 0.0283F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(75, 63).addBox(-0.5252F, -1.297F, 0.9787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.1341F, 0.2911F, 0.0283F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(73, 14).addBox(-0.5252F, -1.4247F, 0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.2214F, 0.2911F, 0.0283F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(68, 77).addBox(-0.527F, -1.5966F, -0.3018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6358F, -1.0762F, -7.6531F, -0.3089F, 0.2935F, 0.0271F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(63, 77).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6458F, -1.8272F, -7.8262F, -0.4211F, 0.0143F, 0.026F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(77, 57).addBox(-1.2F, -0.95F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9446F, -2.1083F, -8.2705F, -0.5084F, 0.0143F, 0.026F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(73, 45).addBox(-0.5F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.8482F, -2.9433F, -10.3195F, -0.1564F, 0.3363F, -0.2035F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(25, 87).addBox(-0.4999F, 0.2075F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.697F, -1.6014F, -9.7523F, -0.0795F, -0.0281F, -0.0755F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(78, 44).addBox(-0.4999F, -0.2714F, -0.6266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.697F, -1.6014F, -9.7523F, -0.289F, -0.0281F, -0.0755F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(5, 71).addBox(-0.4999F, -1.6515F, -0.516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.697F, -1.6014F, -9.7523F, -0.7951F, -0.0281F, -0.0755F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(70, 64).addBox(-0.4999F, -1.7327F, -0.6272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.697F, -1.6014F, -9.7523F, -0.5508F, -0.0281F, -0.0755F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(20, 75).addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.6928F, -1.2632F, -7.2278F, -0.4754F, 0.2482F, -0.0895F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(18, 45).addBox(-1.0259F, -1.2975F, -2.8798F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.266F, 0.2482F, -0.0895F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(0, 61).addBox(-0.6722F, 0.1685F, -0.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7152F, -1.5922F, -3.591F, -0.233F, 0.0736F, -0.047F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(50, 24).addBox(-1.0265F, -1.6587F, -3.5173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.3619F, 0.2484F, -0.089F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0265F, -1.2388F, -3.3538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4271F, -1.2538F, -4.3978F, -0.231F, 0.2484F, -0.089F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(40, 87).addBox(-0.9F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-1.4388F, -3.7847F, -10.1994F, -0.1974F, 0.6588F, -0.242F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(80, 86).addBox(-0.9F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4388F, -3.7847F, -10.1994F, -0.372F, 0.6588F, -0.242F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(25, 53).addBox(0.2365F, -1.8152F, -2.6214F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5271F, -1.2538F, -7.0978F, -0.532F, 0.0012F, -0.0896F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(78, 74).addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.7614F, -3.5634F, -9.7857F, -0.112F, 0.0958F, -0.1106F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(78, 77).addBox(-0.4048F, -0.2187F, -0.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.8748F, -3.7369F, -9.763F, -0.2865F, 0.0958F, -0.1106F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(59, 15).addBox(-1.0634F, -0.5472F, 0.1055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2639F, -3.6001F, -9.6728F, -0.4639F, -0.0532F, 0.0816F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(46, 78).addBox(-1.0634F, -0.5722F, 0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.2639F, -3.6001F, -9.6728F, -0.9875F, -0.0532F, 0.0816F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(78, 32).addBox(-1.0F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(78, 29).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4524F, -3.9537F, -8.8239F, -0.2483F, 0.1958F, -0.0611F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(78, 23).addBox(-0.6539F, -0.0865F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8069F, -4.1651F, -7.9764F, -0.2435F, -0.0074F, -0.01F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(83, 19).addBox(-0.5F, -0.325F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-2.0929F, -4.3492F, -10.1729F, -1.0443F, 0.1897F, -0.0397F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, -0.5646F, -0.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0929F, -4.3492F, -10.1729F, -0.1717F, 0.1897F, -0.0397F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(56, 60).addBox(0.2585F, -2.662F, -1.4997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5271F, -1.2538F, -7.0978F, -0.2795F, 0.1474F, -0.0387F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5F, -0.2F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9473F, -3.1174F, -4.0226F, -0.2957F, 0.3422F, -0.1254F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(10, 88).addBox(-0.4369F, -1.4474F, -1.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6989F, -1.6458F, -3.4582F, -0.2894F, 0.2974F, -0.0864F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(15, 88).addBox(-0.4369F, -1.3783F, -0.4482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6989F, -1.6458F, -3.4582F, -0.5512F, 0.2974F, -0.0864F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(75, 86).addBox(-0.2849F, -1.3624F, 0.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6989F, -1.6458F, -3.4582F, -0.5165F, -0.0121F, 0.0762F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(53, 70).addBox(-0.45F, -0.975F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1427F, -1.1685F, -1.211F, -0.6944F, -0.7492F, 0.4804F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(48, 29).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0365F, -0.4523F, 2.2727F, -0.6945F, -0.9583F, 2.2319F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(33, 70).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.9089F, -0.9279F, 2.1601F, -1.7679F, -0.9583F, 2.2319F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(21, 70).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.8005F, -1.2661F, 1.859F, -2.1035F, -0.9361F, 2.3766F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.7634F, -0.6921F, 0.7777F, -2.5417F, -0.6464F, 2.7413F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(15, 71).addBox(-1.122F, -2.2573F, -0.6011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.4249F, 0.1108F, -1.5339F, -0.4752F, -0.7559F, 0.4726F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(59, 23).addBox(-2.2433F, -2.2781F, -1.1162F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.4249F, 0.1108F, -1.5339F, -0.6047F, -1.0239F, 0.7097F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(83, 16).addBox(-1.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1982F, -1.1868F, -2.4674F, -0.1876F, 0.0873F, 0.0F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(57, 37).addBox(-0.5128F, 0.3928F, -0.9704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6989F, -1.6458F, -3.4582F, -0.4497F, 0.286F, -0.1687F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(73, 28).addBox(-0.8F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2823F, 0.0437F, -0.8489F, -2.186F, 0.0312F, -0.1757F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(0, 56).addBox(-0.3548F, -2.4728F, -0.1392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -1.9623F, 0.2114F, -0.1322F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(0, 78).addBox(-0.3548F, -0.9637F, 0.5688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -1.1333F, 0.2114F, -0.1322F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(73, 6).addBox(-0.3548F, -0.8482F, -0.3449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -0.9151F, 0.2114F, -0.1322F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(58, 0).addBox(-0.3017F, 0.0551F, -2.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -0.6119F, 0.3078F, -0.1745F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(45, 48).addBox(-0.9267F, -0.0699F, -2.9296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.454F, -0.8891F, -3.2042F, -0.63F, 0.3788F, -0.2284F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(48, 34).addBox(-0.9267F, 0.1301F, -2.8296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(1.287F, -0.2229F, -1.8654F, -0.648F, 0.4348F, -0.2738F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(27, 48).addBox(-0.9267F, -0.3949F, -2.7796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.109F)), PartPose.offsetAndRotation(1.287F, -0.2229F, -1.8654F, -0.4385F, 0.4348F, -0.2738F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(74, 40).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6243F, -2.1471F, -1.7366F, -2.2292F, 0.7137F, -0.5231F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(73, 18).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1998F, -1.4259F, -0.4294F, -2.1094F, 0.312F, -0.1989F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(9, 54).addBox(-1.0468F, -0.0027F, 0.0253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4495F, -1.8505F, -1.1389F, -2.1015F, 0.267F, -0.1711F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(73, 78).addBox(-0.3468F, -0.2077F, -0.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -2.2407F, 0.228F, -0.1684F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(35, 79).addBox(-0.3468F, -0.4527F, -1.7247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -2.1011F, 0.228F, -0.1684F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(21, 66).addBox(0.3952F, -1.3457F, -1.5889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0146F, 0.1669F, -1.2807F, -1.5696F, 0.2114F, -0.1322F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(66, 14).addBox(-0.3548F, -1.2457F, -1.2889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0146F, 0.0419F, -1.3807F, -1.5696F, 0.2114F, -0.1322F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(33, 66).addBox(-0.5F, -0.625F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0256F, 0.8068F, -1.5799F, -1.1772F, 0.1962F, -0.0904F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(50, 84).addBox(0.6452F, 0.2018F, -0.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2146F, 0.0419F, -1.3807F, -0.9151F, 0.2114F, -0.1322F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(45, 84).addBox(0.6202F, 0.0363F, 0.7438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.2146F, 0.0419F, -1.3807F, -1.1333F, 0.2114F, -0.1322F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(54, 48).addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5666F, 2.8413F, 0.6519F, -2.5675F, 1.0708F, -0.8733F));

		PartDefinition Head_r82 = leftFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(66, 18).addBox(0.05F, -1.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.328F, 1.6457F, 0.2603F, -2.074F, 0.6862F, -0.3814F));

		PartDefinition Head_r83 = leftFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(73, 74).addBox(-0.9F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.5997F, 2.0087F, 0.0643F, -1.9708F, 0.0335F, -0.0593F));

		PartDefinition Head_r84 = leftFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(39, 53).addBox(-0.275F, -1.0F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.4352F, -3.314F, -7.6322F, -0.2565F, 0.1752F, -0.0169F));

		PartDefinition Head_r85 = leftFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(54, 5).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-2.0667F, -2.3319F, -1.2418F, -0.0834F, -0.7488F, 0.0569F));

		PartDefinition bone3 = leftFace.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7793F, -1.1299F, -5.1142F, 0.0F, -0.0218F, 0.0F));

		PartDefinition Head_r86 = bone3.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(68, 87).addBox(-0.3458F, -0.277F, -0.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 87).addBox(-0.3458F, -0.277F, -0.9747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -1.1341F, 0.3001F, -0.0696F));

		PartDefinition Head_r87 = bone3.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(88, 3).addBox(-0.3458F, -0.9382F, -1.1732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -0.4796F, 0.3001F, -0.0696F));

		PartDefinition Head_r88 = bone3.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(20, 88).addBox(-0.4336F, -0.6054F, -0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -0.0821F, 0.3036F, -0.0474F));

		PartDefinition Head_r89 = bone3.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(88, 6).addBox(-0.4336F, -0.9584F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -0.5184F, 0.3036F, -0.0474F));

		PartDefinition Head_r90 = bone3.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(88, 12).addBox(-0.4336F, -1.1559F, -0.3599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -0.6493F, 0.3036F, -0.0474F));

		PartDefinition Head_r91 = bone3.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(5, 88).addBox(-0.4336F, -1.1916F, -0.7137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1165F, -0.5159F, 1.6539F, -0.1257F, 0.3036F, -0.0474F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-2.3667F, -1.2203F, -0.1702F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(5, 85).mirror().addBox(-0.5823F, -0.881F, -2.1011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.779F, -2.6568F, -9.4053F, -0.1555F, -0.319F, 0.2006F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.4748F, -0.2512F, 1.5944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.0643F, -0.2911F, -0.0283F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(75, 63).mirror().addBox(-0.4748F, -1.297F, 0.9787F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.1341F, -0.2911F, -0.0283F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-0.4748F, -1.4247F, 0.3472F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.2214F, -0.2911F, -0.0283F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(68, 77).mirror().addBox(-0.473F, -1.5966F, -0.3018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6358F, -1.0762F, -7.6531F, -0.3089F, -0.2935F, -0.0271F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(63, 77).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6458F, -1.8272F, -7.8262F, -0.4211F, -0.0143F, -0.026F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(77, 57).mirror().addBox(0.2F, -0.95F, -0.575F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9446F, -2.1083F, -8.2705F, -0.5084F, -0.0143F, -0.026F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(73, 45).mirror().addBox(-0.5F, -1.35F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.8482F, -2.9433F, -10.3195F, -0.1564F, -0.3363F, 0.2035F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(-0.5001F, 0.2075F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.697F, -1.6014F, -9.7523F, -0.0795F, 0.0281F, 0.0755F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-0.5001F, -0.2714F, -0.6266F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.697F, -1.6014F, -9.7523F, -0.289F, 0.0281F, 0.0755F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(5, 71).mirror().addBox(-0.5001F, -1.6515F, -0.516F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.697F, -1.6014F, -9.7523F, -0.7951F, 0.0281F, 0.0755F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.5001F, -1.7327F, -0.6272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(1.697F, -1.6014F, -9.7523F, -0.5508F, 0.0281F, 0.0755F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.5F, -2.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(1.6928F, -1.2632F, -7.2278F, -0.4754F, -0.2482F, 0.0895F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(18, 45).mirror().addBox(0.0259F, -1.2975F, -2.8798F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.266F, -0.2482F, 0.0895F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.3278F, 0.1685F, -0.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7152F, -1.5922F, -3.591F, -0.233F, -0.0736F, 0.047F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(50, 24).mirror().addBox(0.0265F, -1.6587F, -3.5173F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.3619F, -0.2484F, 0.089F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0265F, -1.2388F, -3.3538F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4271F, -1.2538F, -4.3978F, -0.231F, -0.2484F, 0.089F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.1F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(1.4388F, -3.7847F, -10.1994F, -0.1974F, -0.6588F, 0.242F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(80, 86).mirror().addBox(-0.1F, -0.325F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4388F, -3.7847F, -10.1994F, -0.372F, -0.6588F, 0.242F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(25, 53).mirror().addBox(-1.2365F, -1.8152F, -2.6214F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5271F, -1.2538F, -7.0978F, -0.532F, -0.0012F, 0.0896F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.5F, -0.6F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.7614F, -3.5634F, -9.7857F, -0.112F, -0.0958F, 0.1106F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.5952F, -0.2187F, -0.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.8748F, -3.7369F, -9.763F, -0.2865F, -0.0958F, 0.1106F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(0.0634F, -0.5472F, 0.1055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2639F, -3.6001F, -9.6728F, -0.4639F, 0.0532F, -0.0816F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(0.0634F, -0.5722F, 0.0555F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.2639F, -3.6001F, -9.6728F, -0.9875F, 0.0532F, -0.0816F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(78, 32).mirror().addBox(0.0F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(78, 29).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4524F, -3.9537F, -8.8239F, -0.2483F, -0.1958F, 0.0611F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(78, 23).mirror().addBox(-0.3461F, -0.0865F, -0.7732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8069F, -4.1651F, -7.9764F, -0.2435F, 0.0074F, 0.01F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(83, 19).mirror().addBox(-0.5F, -0.325F, -0.5625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(2.0929F, -4.3492F, -10.1729F, -1.0443F, -0.1897F, 0.0397F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.5F, -0.5646F, -0.3258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.0929F, -4.3492F, -10.1729F, -0.1717F, -0.1897F, 0.0397F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(56, 60).mirror().addBox(-1.2585F, -2.662F, -1.4997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5271F, -1.2538F, -7.0978F, -0.2795F, -0.1474F, 0.0387F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(26, 32).mirror().addBox(-0.5F, -0.2F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -3.1174F, -4.0226F, -0.2957F, -0.3422F, 0.1254F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(10, 88).mirror().addBox(-0.5631F, -1.4474F, -1.0762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, -1.6458F, -3.4582F, -0.2894F, -0.2974F, 0.0864F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.5631F, -1.3783F, -0.4482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, -1.6458F, -3.4582F, -0.5512F, -0.2974F, 0.0864F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(75, 86).mirror().addBox(-0.7151F, -1.3624F, 0.3389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, -1.6458F, -3.4582F, -0.5165F, 0.0121F, -0.0762F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-0.55F, -0.975F, -0.425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.1427F, -1.1685F, -1.211F, -0.6944F, 0.7492F, -0.4804F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(48, 29).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0365F, -0.4523F, 2.2727F, -0.6945F, 0.9583F, -2.2319F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(33, 70).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.9089F, -0.9279F, 2.1601F, -1.7679F, 0.9583F, -2.2319F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(21, 70).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.8005F, -1.2661F, 1.859F, -2.1035F, 0.9361F, -2.3766F));

		PartDefinition Head_r129 = rightFace.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.7634F, -0.6921F, 0.7777F, -2.5417F, 0.6464F, -2.7413F));

		PartDefinition Head_r130 = rightFace.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(15, 71).mirror().addBox(0.122F, -2.2573F, -0.6011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.4249F, 0.1108F, -1.5339F, -0.4752F, 0.7559F, -0.4726F));

		PartDefinition Head_r131 = rightFace.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(59, 23).mirror().addBox(0.2433F, -2.2781F, -1.1162F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.4249F, 0.1108F, -1.5339F, -0.6047F, 1.0239F, -0.7097F));

		PartDefinition Head_r132 = rightFace.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(0.3523F, -0.0142F, -1.1121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1982F, -1.1868F, -2.4674F, -0.1876F, -0.0873F, 0.0F));

		PartDefinition Head_r133 = rightFace.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-0.4873F, 0.3928F, -0.9704F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6989F, -1.6458F, -3.4582F, -0.4497F, -0.286F, 0.1687F));

		PartDefinition Head_r134 = rightFace.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(73, 28).mirror().addBox(-0.2F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2823F, 0.0437F, -0.8489F, -2.186F, -0.0312F, 0.1757F));

		PartDefinition Head_r135 = rightFace.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.6452F, -2.4728F, -0.1392F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -1.9623F, -0.2114F, 0.1322F));

		PartDefinition Head_r136 = rightFace.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.6452F, -0.9637F, 0.5688F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -1.1333F, -0.2114F, 0.1322F));

		PartDefinition Head_r137 = rightFace.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-0.6452F, -0.8482F, -0.3449F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -0.9151F, -0.2114F, 0.1322F));

		PartDefinition Head_r138 = rightFace.addOrReplaceChild("Head_r138", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.6983F, 0.0551F, -2.3046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -0.6119F, -0.3078F, 0.1745F));

		PartDefinition Head_r139 = rightFace.addOrReplaceChild("Head_r139", CubeListBuilder.create().texOffs(45, 48).mirror().addBox(-0.0733F, -0.0699F, -2.9296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.454F, -0.8891F, -3.2042F, -0.63F, -0.3788F, 0.2284F));

		PartDefinition Head_r140 = rightFace.addOrReplaceChild("Head_r140", CubeListBuilder.create().texOffs(48, 34).mirror().addBox(-0.0733F, 0.1301F, -2.8296F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(-1.287F, -0.2229F, -1.8654F, -0.648F, -0.4348F, 0.2738F));

		PartDefinition Head_r141 = rightFace.addOrReplaceChild("Head_r141", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.0733F, -0.3949F, -2.7796F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.109F)).mirror(false), PartPose.offsetAndRotation(-1.287F, -0.2229F, -1.8654F, -0.4385F, -0.4348F, 0.2738F));

		PartDefinition Head_r142 = rightFace.addOrReplaceChild("Head_r142", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6243F, -2.1471F, -1.7366F, -2.2292F, -0.7137F, 0.5231F));

		PartDefinition Head_r143 = rightFace.addOrReplaceChild("Head_r143", CubeListBuilder.create().texOffs(73, 18).mirror().addBox(-0.2F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1998F, -1.4259F, -0.4294F, -2.1094F, -0.312F, 0.1989F));

		PartDefinition Head_r144 = rightFace.addOrReplaceChild("Head_r144", CubeListBuilder.create().texOffs(9, 54).mirror().addBox(0.0468F, -0.0027F, 0.0253F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4495F, -1.8505F, -1.1389F, -2.1015F, -0.267F, 0.1711F));

		PartDefinition Head_r145 = rightFace.addOrReplaceChild("Head_r145", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.6532F, -0.2077F, -0.7728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -2.2407F, -0.228F, 0.1684F));

		PartDefinition Head_r146 = rightFace.addOrReplaceChild("Head_r146", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.6532F, -0.4527F, -1.7247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -2.1011F, -0.228F, 0.1684F));

		PartDefinition Head_r147 = rightFace.addOrReplaceChild("Head_r147", CubeListBuilder.create().texOffs(21, 66).mirror().addBox(-1.3952F, -1.3457F, -1.5889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.1669F, -1.2807F, -1.5696F, -0.2114F, 0.1322F));

		PartDefinition Head_r148 = rightFace.addOrReplaceChild("Head_r148", CubeListBuilder.create().texOffs(66, 14).mirror().addBox(-0.6452F, -1.2457F, -1.2889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0146F, 0.0419F, -1.3807F, -1.5696F, -0.2114F, 0.1322F));

		PartDefinition Head_r149 = rightFace.addOrReplaceChild("Head_r149", CubeListBuilder.create().texOffs(33, 66).mirror().addBox(-0.5F, -0.625F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0256F, 0.8068F, -1.5799F, -1.1772F, -0.1962F, 0.0904F));

		PartDefinition Head_r150 = rightFace.addOrReplaceChild("Head_r150", CubeListBuilder.create().texOffs(50, 84).mirror().addBox(-1.6452F, 0.2018F, -0.1198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2146F, 0.0419F, -1.3807F, -0.9151F, -0.2114F, 0.1322F));

		PartDefinition Head_r151 = rightFace.addOrReplaceChild("Head_r151", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-1.6202F, 0.0363F, 0.7438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.2146F, 0.0419F, -1.3807F, -1.1333F, -0.2114F, 0.1322F));

		PartDefinition Head_r152 = rightFace.addOrReplaceChild("Head_r152", CubeListBuilder.create().texOffs(54, 48).mirror().addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5666F, 2.8413F, 0.6519F, -2.5675F, -1.0708F, 0.8733F));

		PartDefinition Head_r153 = rightFace.addOrReplaceChild("Head_r153", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-1.05F, -1.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.328F, 1.6457F, 0.2603F, -2.074F, -0.6862F, 0.3814F));

		PartDefinition Head_r154 = rightFace.addOrReplaceChild("Head_r154", CubeListBuilder.create().texOffs(73, 74).mirror().addBox(-0.1F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.5997F, 2.0087F, 0.0643F, -1.9708F, -0.0335F, 0.0593F));

		PartDefinition Head_r155 = rightFace.addOrReplaceChild("Head_r155", CubeListBuilder.create().texOffs(39, 53).mirror().addBox(-0.725F, -1.0F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.4352F, -3.314F, -7.6322F, -0.2565F, -0.1752F, 0.0169F));

		PartDefinition Head_r156 = rightFace.addOrReplaceChild("Head_r156", CubeListBuilder.create().texOffs(54, 5).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(2.0667F, -2.3319F, -1.2418F, -0.0834F, 0.7488F, -0.0569F));

		PartDefinition bone5 = rightFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7793F, -1.1299F, -5.1142F, 0.0F, 0.0218F, 0.0F));

		PartDefinition Head_r157 = bone5.addOrReplaceChild("Head_r157", CubeListBuilder.create().texOffs(68, 87).mirror().addBox(-0.6542F, -0.277F, -0.6747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(63, 87).mirror().addBox(-0.6542F, -0.277F, -0.9747F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -1.1341F, -0.3001F, 0.0696F));

		PartDefinition Head_r158 = bone5.addOrReplaceChild("Head_r158", CubeListBuilder.create().texOffs(88, 3).mirror().addBox(-0.6542F, -0.9382F, -1.1732F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -0.4796F, -0.3001F, 0.0696F));

		PartDefinition Head_r159 = bone5.addOrReplaceChild("Head_r159", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(-0.5664F, -0.6054F, -0.3332F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -0.0821F, -0.3036F, 0.0474F));

		PartDefinition Head_r160 = bone5.addOrReplaceChild("Head_r160", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.5664F, -0.9584F, -0.2165F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -0.5184F, -0.3036F, 0.0474F));

		PartDefinition Head_r161 = bone5.addOrReplaceChild("Head_r161", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.5664F, -1.1559F, -0.3599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -0.6493F, -0.3036F, 0.0474F));

		PartDefinition Head_r162 = bone5.addOrReplaceChild("Head_r162", CubeListBuilder.create().texOffs(5, 88).mirror().addBox(-0.5664F, -1.1916F, -0.7137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1165F, -0.5159F, 1.6539F, -0.1257F, -0.3036F, 0.0474F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7721F, 2.1121F, -4.0421F, 0.3491F, 0.0F, 0.0873F));

		PartDefinition bodyfront_r12 = bone.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(70, 84).addBox(-0.4962F, -0.7773F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, -2.5616F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r13 = bone.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(83, 34).addBox(-0.4962F, -1.0564F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, -1.9071F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r14 = bone.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(78, 20).addBox(-0.5043F, 0.017F, -0.384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, -1.5924F, 0.457F, -0.219F));

		PartDefinition bodyfront_r15 = bone.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(83, 31).addBox(-0.575F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4105F, 0.6599F, -1.0714F, -0.9717F, 0.3303F, -0.5057F));

		PartDefinition bodyfront_r16 = bone.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(83, 28).addBox(-0.4962F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, -1.7326F, 0.4573F, -0.1412F));

		PartDefinition bodyfront_r17 = bone.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(83, 25).addBox(-0.676F, -4.8581F, 0.4355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, 0.5609F, 0.3795F, -0.2414F));

		PartDefinition bodyfront_r18 = bone.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(63, 64).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.3686F, -2.9448F, -0.7667F, -0.0587F, 0.3795F, -0.2414F));

		PartDefinition bodyfront_r19 = bone.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(58, 64).addBox(-0.676F, -4.0728F, -1.3929F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, 0.0809F, 0.3795F, -0.2414F));

		PartDefinition bodyfront_r20 = bone.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(7, 59).addBox(-0.5F, -0.55F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0027F, -2.1293F, -0.3646F, 0.9274F, 0.3795F, -0.2414F));

		PartDefinition bodyfront_r21 = bone.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(61, 4).addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1358F, -0.5717F, -0.961F, 1.4074F, 0.3795F, -0.2414F));

		PartDefinition bodyfront_r22 = bone.addOrReplaceChild("bodyfront_r22", CubeListBuilder.create().texOffs(83, 44).addBox(-0.676F, -0.5734F, 0.1327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0925F, 1.1513F, -0.1397F, 2.5419F, 0.3795F, -0.2414F));

		PartDefinition Front_r1 = bone.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(83, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1928F, 1.2859F, -2.3813F, -0.2529F, 0.151F, -1.4575F));

		PartDefinition Front_r2 = bone.addOrReplaceChild("Front_r2", CubeListBuilder.create().texOffs(68, 11).addBox(-1.1333F, -0.6631F, -0.2454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5011F, 2.1018F, -2.2874F, -0.127F, 0.5691F, -0.9601F));

		PartDefinition bodyfront_r23 = bone.addOrReplaceChild("bodyfront_r23", CubeListBuilder.create().texOffs(0, 74).addBox(-0.4819F, -1.6173F, -0.3871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5032F, 1.666F, -1.2771F, 0.9011F, 0.4954F, -0.1956F));

		PartDefinition bone7 = Bodyfront.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7721F, 2.1121F, -4.0421F, 0.3491F, 0.0F, -0.0873F));

		PartDefinition bodyfront_r24 = bone7.addOrReplaceChild("bodyfront_r24", CubeListBuilder.create().texOffs(70, 84).mirror().addBox(-0.5038F, -0.7773F, 0.1236F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, -2.5616F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r25 = bone7.addOrReplaceChild("bodyfront_r25", CubeListBuilder.create().texOffs(83, 34).mirror().addBox(-0.5038F, -1.0564F, 0.2293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, -1.9071F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r26 = bone7.addOrReplaceChild("bodyfront_r26", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(-0.4957F, 0.017F, -0.384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, -1.5924F, -0.457F, 0.219F));

		PartDefinition bodyfront_r27 = bone7.addOrReplaceChild("bodyfront_r27", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-0.425F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, 0.6599F, -1.0714F, -0.9717F, -0.3303F, 0.5057F));

		PartDefinition bodyfront_r28 = bone7.addOrReplaceChild("bodyfront_r28", CubeListBuilder.create().texOffs(83, 28).mirror().addBox(-0.5038F, -0.9802F, -0.5778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, -1.7326F, -0.4573F, 0.1412F));

		PartDefinition bodyfront_r29 = bone7.addOrReplaceChild("bodyfront_r29", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-0.324F, -4.8581F, 0.4355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, 0.5609F, -0.3795F, 0.2414F));

		PartDefinition bodyfront_r30 = bone7.addOrReplaceChild("bodyfront_r30", CubeListBuilder.create().texOffs(63, 64).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(0.3686F, -2.9448F, -0.7667F, -0.0587F, -0.3795F, 0.2414F));

		PartDefinition bodyfront_r31 = bone7.addOrReplaceChild("bodyfront_r31", CubeListBuilder.create().texOffs(58, 64).mirror().addBox(-0.324F, -4.0728F, -1.3929F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, 0.0809F, -0.3795F, 0.2414F));

		PartDefinition bodyfront_r32 = bone7.addOrReplaceChild("bodyfront_r32", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-0.5F, -0.55F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0027F, -2.1293F, -0.3646F, 0.9274F, -0.3795F, 0.2414F));

		PartDefinition bodyfront_r33 = bone7.addOrReplaceChild("bodyfront_r33", CubeListBuilder.create().texOffs(61, 4).mirror().addBox(-0.5F, -0.45F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1358F, -0.5717F, -0.961F, 1.4074F, -0.3795F, 0.2414F));

		PartDefinition bodyfront_r34 = bone7.addOrReplaceChild("bodyfront_r34", CubeListBuilder.create().texOffs(83, 44).mirror().addBox(-0.324F, -0.5734F, 0.1327F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0925F, 1.1513F, -0.1397F, 2.5419F, -0.3795F, 0.2414F));

		PartDefinition Front_r3 = bone7.addOrReplaceChild("Front_r3", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1928F, 1.2859F, -2.3813F, -0.2529F, -0.151F, 1.4575F));

		PartDefinition Front_r4 = bone7.addOrReplaceChild("Front_r4", CubeListBuilder.create().texOffs(68, 11).mirror().addBox(-0.8667F, -0.6631F, -0.2454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.5011F, 2.1018F, -2.2874F, -0.127F, -0.5691F, 0.9601F));

		PartDefinition bodyfront_r35 = bone7.addOrReplaceChild("bodyfront_r35", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.5181F, -1.6173F, -0.3871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5032F, 1.666F, -1.2771F, 0.9011F, -0.4954F, 0.1956F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0746F, 2.6279F, -2.1439F, 0.4123F, -0.0982F, -0.2383F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(45, 81).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 5.6556F, -0.4486F, 0.288F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(78, 47).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 5.4522F, -0.5089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(5, 75).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, 5.5267F, 0.6369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 4.2901F, 0.3576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(28, 62).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.2F, 0.6076F, 0.2743F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(5, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.2F, -0.9152F, -0.2874F, -1.9548F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Rightthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, -0.6487F, -0.1099F, -2.1817F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Rightthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Rightthigh.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(85, 59).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2F, 0.4795F, 0.782F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Rightthigh.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(85, 53).addBox(-0.5F, -0.7F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, -0.1487F, 0.6151F, -2.4871F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Rightthigh.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(15, 82).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2F, 0.0269F, -0.8472F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1676F, 5.9336F, 0.2194F, 0.5046F, -0.1266F, 0.1772F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(46, 53).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(16, 56).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(23, 6).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0742F, 4.3358F, 0.1718F, 0.1804F, 0.0156F, -0.0186F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create().texOffs(13, 27).addBox(-1.5F, -0.7F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.5356F, -0.0107F, -0.0071F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0746F, 2.6279F, -2.1439F, 0.7178F, 0.0982F, 0.2383F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(70, 81).addBox(-0.5F, -1.2F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.2F, 5.6556F, -0.4486F, 0.288F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(78, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 5.4522F, -0.5089F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(15, 75).addBox(-0.5F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, 5.5267F, 0.6369F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(35, 85).addBox(-0.5F, -0.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 4.2901F, 0.3576F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(63, 8).addBox(-0.5F, 0.0F, -0.4F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.2F, 0.6076F, 0.2743F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(10, 79).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2F, -0.9152F, -0.2874F, -1.9548F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Leftthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(65, 81).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, -0.6487F, -0.1099F, -2.1817F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Leftthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.6F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.3042F, 0.9823F, -2.2078F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Leftthigh.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(85, 70).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2F, 0.4795F, 0.782F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Leftthigh.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(85, 62).addBox(-0.5F, -0.7F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, -0.1487F, 0.6151F, -2.4871F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Leftthigh.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(83, 6).addBox(-0.5F, -1.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.2F, 0.0269F, -0.8472F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1676F, 5.9336F, 0.2194F, 1.1155F, 0.1266F, -0.1772F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(51, 53).addBox(-0.5F, -2.5F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0F, 2.2192F, 0.7327F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(56, 53).addBox(-0.5F, -5.0F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7573F, -1.0697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(33, 44).addBox(-1.5F, -0.4F, -1.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0742F, 4.3358F, 0.1718F, 0.3113F, -0.0156F, 0.0186F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create().texOffs(26, 27).addBox(-1.5F, -0.7F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.2892F, -1.7934F, -0.3611F, 0.0107F, 0.0071F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(37, 38).addBox(-0.5F, -0.4588F, -0.0143F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 90).addBox(0.0F, -1.1588F, -0.0143F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7491F, 1.3948F, -0.2011F, -0.1283F, 0.0261F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(51, 90).addBox(0.0F, -0.55F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4588F, 1.9857F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail3_r2 = Tail1.addOrReplaceChild("Tail3_r2", CubeListBuilder.create().texOffs(57, 90).addBox(0.0F, 1.0F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0412F, 0.4857F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(38, 0).addBox(-0.5F, -0.5532F, -0.0142F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0983F, 3.9264F, 0.0061F, -0.1309F, -0.0008F));

		PartDefinition Tail4_r1 = Tail2.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(68, 57).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, 1.9858F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail3_r3 = Tail2.addOrReplaceChild("Tail3_r3", CubeListBuilder.create().texOffs(45, 90).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.5532F, -0.0142F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail5_r1 = Tail2.addOrReplaceChild("Tail5_r1", CubeListBuilder.create().texOffs(54, 90).addBox(0.0F, 3.6F, 5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 53).addBox(0.0F, 2.3F, 3.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9429F, -3.4407F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(36, 48).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.045F, 3.8928F, 0.1633F, -0.1157F, -0.1067F));

		PartDefinition Tail6_r1 = Tail3.addOrReplaceChild("Tail6_r1", CubeListBuilder.create().texOffs(66, 90).addBox(0.0F, 4.9F, 7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9879F, -7.3335F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0225F, 2.9078F, 0.1371F, -0.2162F, -0.0296F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(34, 6).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.1183F, 0.1733F, 0.0205F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(34, 12).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.136F, 0.173F, 0.0235F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5176F, 0.0216F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.9F, 0.1053F, 0.3473F, 0.036F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6613F, 3.8627F, -1.1271F, 0.1298F, 0.017F, 0.0011F));

		PartDefinition hips_r6 = bone4.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(21, 58).addBox(-0.5F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.7316F, -2.9823F, -0.6102F, 0.8575F, 0.0217F, 0.1353F));

		PartDefinition hips_r7 = bone4.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(7, 63).addBox(-0.4755F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, 0.203F, 0.0217F, 0.1353F));

		PartDefinition hips_r8 = bone4.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(56, 10).addBox(-0.6F, -2.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.871F, -3.1329F, -0.3029F, 1.4323F, 0.0182F, 0.1296F));

		PartDefinition hips_r9 = bone4.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.9372F, -4.3919F, 0.0176F, -0.3717F, 0.0422F, 0.1276F));

		PartDefinition hips_r10 = bone4.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(14, 67).addBox(-0.4755F, -0.8478F, -2.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7964F, -3.5105F, 0.2005F, -0.1461F, 0.0217F, 0.1353F));

		PartDefinition hips_r11 = bone4.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(62, 41).addBox(-0.5F, -0.525F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7239F, -2.8748F, -2.7384F, 1.213F, 0.0F, 0.1047F));

		PartDefinition hips_r12 = bone4.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(61, 56).addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7754F, -3.3641F, -3.1848F, 0.6458F, 0.0F, 0.1047F));

		PartDefinition hips_r13 = bone4.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7642F, -3.2578F, -3.892F, 0.8988F, 0.0F, 0.1047F));

		PartDefinition hips_r14 = bone4.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(61, 52).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9144F, -4.6873F, -1.9774F, 0.0701F, 0.0054F, 0.1037F));

		PartDefinition hips_r15 = bone4.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(45, 87).addBox(-0.5F, -1.875F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5274F, -1.3555F, -2.1145F, -0.925F, 0.0F, 0.1309F));

		PartDefinition hips_r16 = bone4.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5773F, -1.7347F, -1.2315F, -0.096F, 0.0F, 0.1309F));

		PartDefinition hips_r17 = bone4.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(85, 9).addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5941F, -1.8619F, -1.7147F, 0.384F, 0.0F, 0.1309F));

		PartDefinition hips_r18 = bone4.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(7, 67).addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0897F, -0.0395F, 1.7198F, 0.4517F, -0.1172F, 0.3295F));

		PartDefinition hips_r19 = bone4.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(36, 75).addBox(-0.5F, 0.0F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2863F, -0.9412F, 1.1761F, 1.6735F, -0.1172F, 0.3295F));

		PartDefinition hips_r20 = bone4.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(48, 39).addBox(-0.7599F, -1.0094F, -1.5713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6134F, -0.6642F, 0.0233F, 0.3412F, -0.105F, 0.2249F));

		PartDefinition hips_r21 = bone4.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(83, 50).addBox(-0.7092F, 0.147F, -3.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 82).addBox(-0.7092F, 0.147F, -2.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 82).addBox(-0.7092F, 0.147F, -2.2304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4492F, 0.6268F, -0.9943F, 0.0953F, 0.1687F, 0.4538F));

		PartDefinition hips_r22 = bone4.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(61, 48).addBox(-0.7092F, -0.4577F, -2.0323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.4492F, 0.6268F, -0.9943F, 0.4618F, 0.1687F, 0.4538F));

		PartDefinition hips_r23 = bone4.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(33, 62).addBox(-0.7092F, -0.2189F, -1.9817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4492F, 0.6268F, -0.9943F, 0.3222F, 0.1687F, 0.4538F));

		PartDefinition hips_r24 = bone4.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(83, 47).addBox(-0.8092F, -0.4672F, -0.6473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4492F, 0.6268F, -0.9943F, 0.7236F, 0.1687F, 0.4538F));

		PartDefinition hips_r25 = bone4.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(55, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0808F, 0.6883F, -0.3518F, 1.2895F, -0.1172F, 0.3295F));

		PartDefinition hips_r26 = bone4.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1781F, 0.6211F, 0.6145F, 1.6036F, -0.1172F, 0.3295F));

		PartDefinition hips_r27 = bone4.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(55, 84).addBox(-0.5F, 0.325F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1742F, 0.029F, 2.2103F, 2.2494F, -0.1172F, 0.3295F));

		PartDefinition hips_r28 = bone4.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(78, 17).addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4369F, -1.462F, 3.1937F, 1.2895F, -0.1172F, 0.3295F));

		PartDefinition hips_r29 = bone4.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(41, 78).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4118F, -1.4259F, 3.2966F, 3.0784F, -0.1172F, 0.3295F));

		PartDefinition hips_r30 = bone4.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(78, 35).addBox(0.0F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.1954F, -1.1947F, 3.2644F, 2.2058F, -0.1172F, 0.3295F));

		PartDefinition hips_r31 = bone4.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(85, 85).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.4427F, -1.3869F, 1.0552F, 0.9003F, -0.092F, 0.3031F));

		PartDefinition hips_r32 = bone4.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5F, 0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3625F, -0.4629F, -0.5063F, 1.902F, -0.1193F, 0.2417F));

		PartDefinition hips_r33 = bone4.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.3625F, -0.4629F, -0.5063F, 2.3383F, -0.1193F, 0.2417F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6613F, 3.8627F, -1.1271F, 0.1298F, -0.017F, -0.0011F));

		PartDefinition hips_r34 = bone6.addOrReplaceChild("hips_r34", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-0.5F, -0.175F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7316F, -2.9823F, -0.6102F, 0.8575F, -0.0217F, -0.1353F));

		PartDefinition hips_r35 = bone6.addOrReplaceChild("hips_r35", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-0.5245F, -0.1421F, -0.801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, 0.203F, -0.0217F, -0.1353F));

		PartDefinition hips_r36 = bone6.addOrReplaceChild("hips_r36", CubeListBuilder.create().texOffs(56, 10).mirror().addBox(-0.4F, -2.1F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.1329F, -0.3029F, 1.4323F, -0.0182F, -0.1296F));

		PartDefinition hips_r37 = bone6.addOrReplaceChild("hips_r37", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9372F, -4.3919F, 0.0176F, -0.3717F, -0.0422F, -0.1276F));

		PartDefinition hips_r38 = bone6.addOrReplaceChild("hips_r38", CubeListBuilder.create().texOffs(14, 67).mirror().addBox(-0.5245F, -0.8478F, -2.3106F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7964F, -3.5105F, 0.2005F, -0.1461F, -0.0217F, -0.1353F));

		PartDefinition hips_r39 = bone6.addOrReplaceChild("hips_r39", CubeListBuilder.create().texOffs(62, 41).mirror().addBox(-0.5F, -0.525F, -0.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7239F, -2.8748F, -2.7384F, 1.213F, 0.0F, -0.1047F));

		PartDefinition hips_r40 = bone6.addOrReplaceChild("hips_r40", CubeListBuilder.create().texOffs(61, 56).mirror().addBox(-0.5F, -0.5F, -0.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7754F, -3.3641F, -3.1848F, 0.6458F, 0.0F, -0.1047F));

		PartDefinition hips_r41 = bone6.addOrReplaceChild("hips_r41", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7642F, -3.2578F, -3.892F, 0.8988F, 0.0F, -0.1047F));

		PartDefinition hips_r42 = bone6.addOrReplaceChild("hips_r42", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9144F, -4.6873F, -1.9774F, 0.0701F, -0.0054F, -0.1037F));

		PartDefinition hips_r43 = bone6.addOrReplaceChild("hips_r43", CubeListBuilder.create().texOffs(45, 87).mirror().addBox(-0.5F, -1.875F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5274F, -1.3555F, -2.1145F, -0.925F, 0.0F, -0.1309F));

		PartDefinition hips_r44 = bone6.addOrReplaceChild("hips_r44", CubeListBuilder.create().texOffs(10, 85).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5773F, -1.7347F, -1.2315F, -0.096F, 0.0F, -0.1309F));

		PartDefinition hips_r45 = bone6.addOrReplaceChild("hips_r45", CubeListBuilder.create().texOffs(85, 9).mirror().addBox(-0.5F, -0.4F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5941F, -1.8619F, -1.7147F, 0.384F, 0.0F, -0.1309F));

		PartDefinition hips_r46 = bone6.addOrReplaceChild("hips_r46", CubeListBuilder.create().texOffs(7, 67).mirror().addBox(-0.5F, -0.9F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0897F, -0.0395F, 1.7198F, 0.4517F, 0.1172F, -0.3295F));

		PartDefinition hips_r47 = bone6.addOrReplaceChild("hips_r47", CubeListBuilder.create().texOffs(36, 75).mirror().addBox(-0.5F, 0.0F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2863F, -0.9412F, 1.1761F, 1.6735F, 0.1172F, -0.3295F));

		PartDefinition hips_r48 = bone6.addOrReplaceChild("hips_r48", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-0.2401F, -1.0094F, -1.5713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -0.6642F, 0.0233F, 0.3412F, 0.105F, -0.2249F));

		PartDefinition hips_r49 = bone6.addOrReplaceChild("hips_r49", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-0.2908F, 0.147F, -3.0304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 82).mirror().addBox(-0.2908F, 0.147F, -2.6304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 82).mirror().addBox(-0.2908F, 0.147F, -2.2304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4492F, 0.6268F, -0.9943F, 0.0953F, -0.1687F, -0.4538F));

		PartDefinition hips_r50 = bone6.addOrReplaceChild("hips_r50", CubeListBuilder.create().texOffs(61, 48).mirror().addBox(-0.2908F, -0.4577F, -2.0323F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.4492F, 0.6268F, -0.9943F, 0.4618F, -0.1687F, -0.4538F));

		PartDefinition hips_r51 = bone6.addOrReplaceChild("hips_r51", CubeListBuilder.create().texOffs(33, 62).mirror().addBox(-0.2908F, -0.2189F, -1.9817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4492F, 0.6268F, -0.9943F, 0.3222F, -0.1687F, -0.4538F));

		PartDefinition hips_r52 = bone6.addOrReplaceChild("hips_r52", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-0.1908F, -0.4672F, -0.6473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4492F, 0.6268F, -0.9943F, 0.7236F, -0.1687F, -0.4538F));

		PartDefinition hips_r53 = bone6.addOrReplaceChild("hips_r53", CubeListBuilder.create().texOffs(55, 81).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0808F, 0.6883F, -0.3518F, 1.2895F, 0.1172F, -0.3295F));

		PartDefinition hips_r54 = bone6.addOrReplaceChild("hips_r54", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1781F, 0.6211F, 0.6145F, 1.6036F, 0.1172F, -0.3295F));

		PartDefinition hips_r55 = bone6.addOrReplaceChild("hips_r55", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.5F, 0.325F, 0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1742F, 0.029F, 2.2103F, 2.2494F, 0.1172F, -0.3295F));

		PartDefinition hips_r56 = bone6.addOrReplaceChild("hips_r56", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-0.5F, -0.425F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4369F, -1.462F, 3.1937F, 1.2895F, 0.1172F, -0.3295F));

		PartDefinition hips_r57 = bone6.addOrReplaceChild("hips_r57", CubeListBuilder.create().texOffs(41, 78).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4118F, -1.4259F, 3.2966F, 3.0784F, 0.1172F, -0.3295F));

		PartDefinition hips_r58 = bone6.addOrReplaceChild("hips_r58", CubeListBuilder.create().texOffs(78, 35).mirror().addBox(-1.0F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.1954F, -1.1947F, 3.2644F, 2.2058F, 0.1172F, -0.3295F));

		PartDefinition hips_r59 = bone6.addOrReplaceChild("hips_r59", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.4427F, -1.3869F, 1.0552F, 0.9003F, 0.092F, -0.3031F));

		PartDefinition hips_r60 = bone6.addOrReplaceChild("hips_r60", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5F, 0.125F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, -0.4629F, -0.5063F, 1.902F, 0.1193F, -0.2417F));

		PartDefinition hips_r61 = bone6.addOrReplaceChild("hips_r61", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-0.5F, -0.875F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3625F, -0.4629F, -0.5063F, 2.3383F, 0.1193F, -0.2417F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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