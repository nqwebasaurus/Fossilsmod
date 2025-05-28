package fossils.fossils.client.blockentity.model.kayentatherium;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KayentatheriumFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailend;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Eyeportion;
	private final ModelPart Snout;
	private final ModelPart Nose;
	private final ModelPart Noseunderslope;
	private final ModelPart Rightupperfang;
	private final ModelPart Rightupperbackteeth;
	private final ModelPart leftZygomaticarch;
	private final ModelPart rightZygomaticarch;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Rightlowerfang;
	private final ModelPart Mouthinterior;
	private final ModelPart Jawparting;
	private final ModelPart Lowerjawfluff;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Rightfrontfoot;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Leftfrontfoot;
	private final ModelPart Chestslope;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;

	public KayentatheriumFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddle = this.Tailbase.getChild("Tailmiddle");
		this.Tailend = this.Tailmiddle.getChild("Tailend");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eyeportion = this.Head.getChild("Eyeportion");
		this.Snout = this.Eyeportion.getChild("Snout");
		this.Nose = this.Snout.getChild("Nose");
		this.Noseunderslope = this.Nose.getChild("Noseunderslope");
		this.Rightupperfang = this.Snout.getChild("Rightupperfang");
		this.Rightupperbackteeth = this.Snout.getChild("Rightupperbackteeth");
		this.leftZygomaticarch = this.Eyeportion.getChild("leftZygomaticarch");
		this.rightZygomaticarch = this.Eyeportion.getChild("rightZygomaticarch");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Rightlowerfang = this.Lowerjawfront.getChild("Rightlowerfang");
		this.Mouthinterior = this.Lowerjawfront.getChild("Mouthinterior");
		this.Jawparting = this.Lowerjawmiddle.getChild("Jawparting");
		this.Lowerjawfluff = this.Lowerjawmiddle.getChild("Lowerjawfluff");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Rightfrontfoot = this.Rightlowerarm.getChild("Rightfrontfoot");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Leftfrontfoot = this.Leftlowerarm.getChild("Leftfrontfoot");
		this.Chestslope = this.Bodyfront.getChild("Chestslope");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.9F, 6.0F, -0.4245F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(25, 24).addBox(0.0F, -1.0F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -1.0F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 21).addBox(0.5F, 0.0F, 0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 12).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(28, 21).mirror().addBox(-1.5F, 0.0F, 0.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1F, -3.5F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(27, 2).mirror().addBox(-0.5F, -0.5961F, -0.8498F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1651F, -2.1229F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-0.5F, -0.4841F, -3.8782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1651F, -2.1229F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(11, 27).mirror().addBox(-0.5F, -0.7369F, -0.7196F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1651F, -2.1229F, 0.0F, 0.0F, 0.0F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-0.5F, -0.1F, -2.207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1651F, -2.1229F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(7, 20).mirror().addBox(-0.5F, 1.552F, -0.1759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.1651F, -2.1229F, 1.1519F, 0.0F, 0.0F));

		PartDefinition Hips_r8 = Hips.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(34, 14).addBox(-0.5F, -0.1F, -2.207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, 1.1651F, -2.1229F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Hips_r9 = Hips.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, -0.7369F, -0.7196F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 1.1651F, -2.1229F, 0.0F, 0.0F, 0.0F));

		PartDefinition Hips_r10 = Hips.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(7, 20).addBox(-0.5F, 1.552F, -0.1759F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, 1.1651F, -2.1229F, 1.1519F, 0.0F, 0.0F));

		PartDefinition Hips_r11 = Hips.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(27, 2).addBox(-0.5F, -0.5961F, -0.8498F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1651F, -2.1229F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Hips_r12 = Hips.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4841F, -3.8782F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.1651F, -2.1229F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(17, 30).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 1).addBox(0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.1F, -0.1017F, -0.042F, 0.0119F));

		PartDefinition Tailmiddle = Tailbase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(18, 24).addBox(-0.5F, -0.474F, -0.0945F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.2393F, -0.1697F, -0.0412F));

		PartDefinition Tailend = Tailmiddle.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(8, 8).addBox(-0.49F, -0.6184F, 0.0088F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.126F, 3.8055F, 0.3253F, -0.1258F, -0.0363F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(20, 18).addBox(-0.5F, -0.1F, -7.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(28, 43).addBox(0.0F, -1.1F, -7.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 43).addBox(0.0F, -1.1F, -5.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.0F, 0.4458F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(10, 37).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -3.8F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(19, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -3.3F, -0.0785F, -0.0382F, -0.5046F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -5.3F, 0.0F, 0.0F, -0.4538F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(33, 42).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -7.3F, 0.0785F, 0.0382F, -0.4348F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(42, 3).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0F, -1.5F, -0.173F, -0.0837F, -0.5861F));

		PartDefinition Bodymiddle_r6 = Bodymiddle.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(16, 8).mirror().addBox(-3.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0F, -1.5F, -0.0304F, -0.1896F, -1.5505F));

		PartDefinition Bodymiddle_r7 = Bodymiddle.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.0F, -1.5F, -0.1217F, -0.1488F, -1.0207F));

		PartDefinition Bodymiddle_r8 = Bodymiddle.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(32, 28).mirror().addBox(-4.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -5.3F, 0.0F, 0.0F, -1.4137F));

		PartDefinition Bodymiddle_r9 = Bodymiddle.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(32, 26).mirror().addBox(-4.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -3.3F, -0.0137F, -0.0862F, -1.4655F));

		PartDefinition Bodymiddle_r10 = Bodymiddle.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(5, 42).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -3.3F, -0.055F, -0.0678F, -0.9406F));

		PartDefinition Bodymiddle_r11 = Bodymiddle.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(42, 42).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -5.3F, 0.0F, 0.0F, -0.8901F));

		PartDefinition Bodymiddle_r12 = Bodymiddle.addOrReplaceChild("Bodymiddle_r12", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-5.4396F, -1.3192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -7.3F, 0.0137F, 0.0862F, -1.3957F));

		PartDefinition Bodymiddle_r13 = Bodymiddle.addOrReplaceChild("Bodymiddle_r13", CubeListBuilder.create().texOffs(24, 42).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -7.3F, 0.055F, 0.0678F, -0.8708F));

		PartDefinition Bodymiddle_r14 = Bodymiddle.addOrReplaceChild("Bodymiddle_r14", CubeListBuilder.create().texOffs(33, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -7.3F, 0.0785F, -0.0382F, 0.4348F));

		PartDefinition Bodymiddle_r15 = Bodymiddle.addOrReplaceChild("Bodymiddle_r15", CubeListBuilder.create().texOffs(24, 42).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -7.3F, 0.055F, -0.0678F, 0.8708F));

		PartDefinition Bodymiddle_r16 = Bodymiddle.addOrReplaceChild("Bodymiddle_r16", CubeListBuilder.create().texOffs(11, 0).addBox(1.4396F, -1.3192F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -7.3F, 0.0137F, -0.0862F, 1.3957F));

		PartDefinition Bodymiddle_r17 = Bodymiddle.addOrReplaceChild("Bodymiddle_r17", CubeListBuilder.create().texOffs(42, 3).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -1.5F, -0.173F, 0.0837F, 0.5861F));

		PartDefinition Bodymiddle_r18 = Bodymiddle.addOrReplaceChild("Bodymiddle_r18", CubeListBuilder.create().texOffs(38, 41).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -1.5F, -0.1217F, 0.1488F, 1.0207F));

		PartDefinition Bodymiddle_r19 = Bodymiddle.addOrReplaceChild("Bodymiddle_r19", CubeListBuilder.create().texOffs(16, 8).addBox(1.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -1.5F, -0.0304F, 0.1896F, 1.5505F));

		PartDefinition Bodymiddle_r20 = Bodymiddle.addOrReplaceChild("Bodymiddle_r20", CubeListBuilder.create().texOffs(19, 42).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.3F, -0.0785F, 0.0382F, 0.5046F));

		PartDefinition Bodymiddle_r21 = Bodymiddle.addOrReplaceChild("Bodymiddle_r21", CubeListBuilder.create().texOffs(5, 42).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.3F, -0.055F, 0.0678F, 0.9406F));

		PartDefinition Bodymiddle_r22 = Bodymiddle.addOrReplaceChild("Bodymiddle_r22", CubeListBuilder.create().texOffs(32, 26).addBox(1.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -3.3F, -0.0137F, 0.0862F, 1.4655F));

		PartDefinition Bodymiddle_r23 = Bodymiddle.addOrReplaceChild("Bodymiddle_r23", CubeListBuilder.create().texOffs(32, 28).addBox(1.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -5.3F, 0.0F, 0.0F, 1.4137F));

		PartDefinition Bodymiddle_r24 = Bodymiddle.addOrReplaceChild("Bodymiddle_r24", CubeListBuilder.create().texOffs(42, 42).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -5.3F, 0.0F, 0.0F, 0.8901F));

		PartDefinition Bodymiddle_r25 = Bodymiddle.addOrReplaceChild("Bodymiddle_r25", CubeListBuilder.create().texOffs(43, 5).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -5.3F, 0.0F, 0.0F, 0.4538F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.6F, -7.5F, -0.0215F, -0.1309F, 0.0028F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(21, 12).addBox(0.01F, -2.3314F, 3.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.01F, -1.8314F, 1.0016F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-0.49F, -0.4314F, 0.0016F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -5.2F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r26 = Bodyfront.addOrReplaceChild("Bodymiddle_r26", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-3.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 13).mirror().addBox(-3.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2F, -3.8F, 0.0631F, 0.379F, -1.6634F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(-0.5F, -1.0334F, 1.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(40, 23).addBox(3.48F, -1.0334F, 1.4225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.98F, 1.0925F, -2.8397F, 2.4347F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(28, 15).mirror().addBox(-0.5F, -1.7825F, -1.3497F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 15).addBox(3.48F, -1.7825F, -1.3497F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.98F, 1.0925F, -2.8397F, 1.6144F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(20, 0).mirror().addBox(-0.5F, -1.3941F, -2.2927F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(20, 0).addBox(3.48F, -1.3941F, -2.2927F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.98F, 1.0925F, -2.8397F, 1.6668F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(27, 8).mirror().addBox(-0.5F, -1.3386F, -2.7287F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(27, 8).addBox(3.48F, -1.3386F, -2.7287F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.98F, 1.0925F, -2.8397F, 1.1257F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r27 = Bodyfront.addOrReplaceChild("Bodymiddle_r27", CubeListBuilder.create().texOffs(41, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0F, -1.8F, 0.1888F, 0.0913F, -0.4451F));

		PartDefinition Bodymiddle_r28 = Bodyfront.addOrReplaceChild("Bodymiddle_r28", CubeListBuilder.create().texOffs(41, 36).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0F, -1.8F, 0.133F, 0.1623F, -0.8793F));

		PartDefinition Bodymiddle_r29 = Bodyfront.addOrReplaceChild("Bodymiddle_r29", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-4.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.0F, -1.8F, 0.0332F, 0.2068F, -1.4103F));

		PartDefinition Bodymiddle_r30 = Bodyfront.addOrReplaceChild("Bodymiddle_r30", CubeListBuilder.create().texOffs(16, 11).mirror().addBox(-1.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2F, -3.8F, 0.249F, 0.2954F, -1.1147F));

		PartDefinition Bodymiddle_r31 = Bodyfront.addOrReplaceChild("Bodymiddle_r31", CubeListBuilder.create().texOffs(12, 33).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2F, -3.8F, 0.3483F, 0.165F, -0.6865F));

		PartDefinition Bodymiddle_r32 = Bodyfront.addOrReplaceChild("Bodymiddle_r32", CubeListBuilder.create().texOffs(12, 33).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2F, -3.8F, 0.3483F, -0.165F, 0.6865F));

		PartDefinition Bodymiddle_r33 = Bodyfront.addOrReplaceChild("Bodymiddle_r33", CubeListBuilder.create().texOffs(16, 11).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2F, -3.8F, 0.249F, -0.2954F, 1.1147F));

		PartDefinition Bodymiddle_r34 = Bodyfront.addOrReplaceChild("Bodymiddle_r34", CubeListBuilder.create().texOffs(0, 13).addBox(1.4396F, -1.3192F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2F, -3.8F, 0.0631F, -0.379F, 1.6634F));

		PartDefinition Bodymiddle_r35 = Bodyfront.addOrReplaceChild("Bodymiddle_r35", CubeListBuilder.create().texOffs(41, 36).addBox(0.9063F, -0.4226F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0F, -1.8F, 0.133F, -0.1623F, 0.8793F));

		PartDefinition Bodymiddle_r36 = Bodyfront.addOrReplaceChild("Bodymiddle_r36", CubeListBuilder.create().texOffs(27, 0).addBox(1.4396F, -1.3192F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0F, -1.8F, 0.0332F, -0.2068F, 1.4103F));

		PartDefinition Bodymiddle_r37 = Bodyfront.addOrReplaceChild("Bodymiddle_r37", CubeListBuilder.create().texOffs(41, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.0F, -1.8F, 0.1888F, -0.0913F, 0.4451F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(11, 21).addBox(-0.49F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.008F))
				.texOffs(37, 43).addBox(0.01F, -1.5F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 43).addBox(0.01F, -1.5F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -5.0F, -0.2903F, -0.3424F, 0.069F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -0.3F, -3.0F, 0.0725F, 0.0975F, 0.0003F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-1.5F, -0.3F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(14, 41).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7632F, -1.5328F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Eyeportion = Head.addOrReplaceChild("Eyeportion", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.5F, -2.0F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Snout = Eyeportion.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.1F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Snout_r1 = Snout.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(13, 15).addBox(-0.2F, -0.5F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(11, 2).addBox(-0.99F, 0.1F, -0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(41, 15).addBox(-0.2F, 0.4F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F))
				.texOffs(41, 15).mirror().addBox(-0.78F, 0.4F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.5095F, 0.0F, 0.0F));

		PartDefinition Nose_r1 = Nose.addOrReplaceChild("Nose_r1", CubeListBuilder.create().texOffs(41, 0).mirror().addBox(-0.9F, -0.9903F, -0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(41, 0).addBox(-0.12F, -0.9903F, -0.1104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.02F, 1.6F, -0.6F, -0.7505F, 0.0F, 0.0F));

		PartDefinition Nose_r2 = Nose.addOrReplaceChild("Nose_r2", CubeListBuilder.create().texOffs(7, 33).mirror().addBox(-0.91F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false)
				.texOffs(7, 33).addBox(-0.31F, -0.1F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.12F, 0.5F, -0.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Nose_r3 = Nose.addOrReplaceChild("Nose_r3", CubeListBuilder.create().texOffs(41, 8).addBox(-0.2F, -0.7995F, -0.2344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 1.3F, -1.1F, -0.384F, 0.0F, 0.0F));

		PartDefinition Nose_r4 = Nose.addOrReplaceChild("Nose_r4", CubeListBuilder.create().texOffs(34, 38).addBox(0.01F, 0.0108F, 0.0303F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.7F, -0.7505F, 0.0F, 0.0F));

		PartDefinition Nose_r5 = Nose.addOrReplaceChild("Nose_r5", CubeListBuilder.create().texOffs(36, 34).addBox(0.01F, -0.135F, -0.1072F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 1.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Nose_r6 = Nose.addOrReplaceChild("Nose_r6", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-0.51F, -0.2196F, -2.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.02F, 2.5F, 3.5F, -0.5509F, 0.1792F, -0.109F));

		PartDefinition Nose_r7 = Nose.addOrReplaceChild("Nose_r7", CubeListBuilder.create().texOffs(34, 20).addBox(-0.49F, -0.2196F, -2.008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.5F, 3.5F, -0.5509F, -0.1792F, 0.109F));

		PartDefinition Nose_r8 = Nose.addOrReplaceChild("Nose_r8", CubeListBuilder.create().texOffs(10, 15).addBox(-0.89F, -0.0824F, -0.1027F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 1.1F, 1.3F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Noseunderslope = Nose.addOrReplaceChild("Noseunderslope", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 1.0F, -1.0F, 0.3821F, 0.0F, 0.0F));

		PartDefinition Rightupperfang = Snout.addOrReplaceChild("Rightupperfang", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 1.5F, -2.1F, -0.4882F, 0.0F, -0.0213F));

		PartDefinition Leftupperfang_r1 = Rightupperfang.addOrReplaceChild("Leftupperfang_r1", CubeListBuilder.create().texOffs(5, 37).mirror().addBox(-0.6F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.08F, 0.9F, -1.0F, 0.0865F, -0.0114F, 0.1304F));

		PartDefinition Rightupperfang_r1 = Rightupperfang.addOrReplaceChild("Rightupperfang_r1", CubeListBuilder.create().texOffs(5, 37).addBox(-0.4F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1F, 0.9F, -1.0F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition Rightupperbackteeth = Snout.addOrReplaceChild("Rightupperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.78F, 2.3F, -2.3F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Leftupperbackteeth_r1 = Rightupperbackteeth.addOrReplaceChild("Leftupperbackteeth_r1", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 20).addBox(1.54F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.54F, 1.0F, 0.3F, -0.2269F, 0.0F, 0.0F));

		PartDefinition leftZygomaticarch = Eyeportion.addOrReplaceChild("leftZygomaticarch", CubeListBuilder.create().texOffs(19, 35).addBox(-0.5F, 0.4F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)), PartPose.offset(1.9F, 0.4F, 0.9F));

		PartDefinition Eyeportion_r1 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r1", CubeListBuilder.create().texOffs(7, 26).addBox(-0.5F, -1.6843F, -0.1323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3388F, -0.4816F, 0.4206F));

		PartDefinition Eyeportion_r2 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r2", CubeListBuilder.create().texOffs(9, 40).addBox(-0.5F, -0.0757F, -0.164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7104F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r3 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r3", CubeListBuilder.create().texOffs(39, 18).addBox(-0.5F, -0.9016F, -0.9071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.4F, -0.7F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r4 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r4", CubeListBuilder.create().texOffs(19, 39).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.0F, 1.3F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r5 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r5", CubeListBuilder.create().texOffs(39, 38).addBox(-0.5F, -0.0957F, -0.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.8F, -1.5184F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r6 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r6", CubeListBuilder.create().texOffs(24, 39).addBox(-0.5F, 0.4001F, -0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(39, 12).addBox(-0.5F, -0.0999F, -0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.6F, -1.0297F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r7 = leftZygomaticarch.addOrReplaceChild("Eyeportion_r7", CubeListBuilder.create().texOffs(31, 32).addBox(-0.8F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.4F, 0.9F, -2.8F, 0.0F, 0.925F, 0.0F));

		PartDefinition rightZygomaticarch = Eyeportion.addOrReplaceChild("rightZygomaticarch", CubeListBuilder.create().texOffs(19, 35).mirror().addBox(-0.5F, 0.4F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offset(-1.88F, 0.4F, 0.9F));

		PartDefinition Eyeportion_r8 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r8", CubeListBuilder.create().texOffs(7, 26).mirror().addBox(-0.5F, -1.6843F, -0.1323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3388F, 0.4816F, -0.4206F));

		PartDefinition Eyeportion_r9 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r9", CubeListBuilder.create().texOffs(9, 40).mirror().addBox(-0.5F, -0.0757F, -0.164F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7104F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r10 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r10", CubeListBuilder.create().texOffs(39, 18).mirror().addBox(-0.5F, -0.9016F, -0.9071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4F, -0.7F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r11 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r11", CubeListBuilder.create().texOffs(19, 39).mirror().addBox(-0.5F, -0.9F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r12 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r12", CubeListBuilder.create().texOffs(39, 38).mirror().addBox(-0.5F, -0.0957F, -0.0773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.8F, -1.5184F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r13 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r13", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(-0.5F, 0.4001F, -0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(39, 12).mirror().addBox(-0.5F, -0.0999F, -0.1353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -1.6F, -1.0297F, 0.0F, 0.0F));

		PartDefinition Eyeportion_r14 = rightZygomaticarch.addOrReplaceChild("Eyeportion_r14", CubeListBuilder.create().texOffs(31, 32).mirror().addBox(-0.2F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.9F, -2.8F, 0.0F, -0.925F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.01F, -2.3F, 0.7442F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(41, 26).mirror().addBox(-2.0F, -0.0412F, -1.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.1978F, 0.131F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(38, 4).mirror().addBox(-2.0F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.48F, 0.6978F, -0.069F, -0.925F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-2.0F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(0, 6).addBox(0.02F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.48F, 0.836F, -0.8377F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(41, 26).addBox(1.0F, -0.0412F, -1.0197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 1.1978F, 0.131F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(38, 4).addBox(1.0F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6978F, -0.069F, -0.925F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.866F, -2.5877F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 0).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.7021F, 1.5408F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.45F, 0.39F, -0.1911F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r1 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r1", CubeListBuilder.create().texOffs(40, 33).mirror().addBox(-0.9F, -0.891F, -0.0892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(40, 33).addBox(-0.1F, -0.891F, -0.0892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.1F, -1.3F, 0.7767F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront_r2 = Lowerjawfront.addOrReplaceChild("Lowerjawfront_r2", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-1.0F, -1.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(0, 41).addBox(0.0F, -1.1F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, 0.2356F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -1.9F, -0.8067F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth_r1 = Lowerfrontteeth.addOrReplaceChild("Lowerfrontteeth_r1", CubeListBuilder.create().texOffs(34, 8).mirror().addBox(-0.1F, -0.7F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(34, 8).addBox(0.5F, -0.7F, -1.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, -0.3F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightlowerfang = Lowerjawfront.addOrReplaceChild("Rightlowerfang", CubeListBuilder.create(), PartPose.offsetAndRotation(0.51F, -0.7F, -0.4F, 0.0F, 0.0F, 0.1485F));

		PartDefinition Leftlowerfang_r1 = Rightlowerfang.addOrReplaceChild("Leftlowerfang_r1", CubeListBuilder.create().texOffs(8, 6).mirror().addBox(0.0F, -0.4F, -1.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 6).addBox(1.02F, -0.4F, -1.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.02F, -0.1F, 0.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Mouthinterior = Lowerjawfront.addOrReplaceChild("Mouthinterior", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.0F, -2.0F, 0.2335F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawmiddle.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.02F, 0.0F, 0.3F, -0.4671F, 0.0F, 0.0F));

		PartDefinition Lowerjawfluff = Lowerjawmiddle.addOrReplaceChild("Lowerjawfluff", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.02F, 1.45F, -0.03F, -0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfluff_r1 = Lowerjawfluff.addOrReplaceChild("Lowerjawfluff_r1", CubeListBuilder.create().texOffs(41, 29).mirror().addBox(-1.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(41, 29).addBox(0.46F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.04F, -0.0682F, 2.5291F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(31, 36).addBox(0.0F, -1.0195F, -0.2583F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 40).addBox(0.0F, -0.5195F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 30).addBox(0.0F, -1.0195F, 1.7417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, 3.5F, -3.5F, -2.1739F, 0.4451F, -0.4333F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.3838F, 2.642F, 1.244F, -0.1077F, -0.554F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(14, 35).addBox(-1.0F, -1.3F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(26, 32).addBox(0.0F, -2.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0592F, 0.1044F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightfrontfoot = Rightlowerarm.addOrReplaceChild("Rightfrontfoot", CubeListBuilder.create().texOffs(0, 15).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.8467F, -0.0637F, -0.0213F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(31, 36).mirror().addBox(-1.0F, -1.0195F, -0.2583F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 40).mirror().addBox(-1.0F, -0.5195F, 0.7417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 30).mirror().addBox(-1.0F, -1.0195F, 1.7417F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.18F, 3.5F, -3.5F, -0.5594F, -0.4451F, 0.4333F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.3838F, 2.642F, 0.8805F, 0.5763F, -0.0784F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(14, 35).mirror().addBox(0.0F, -1.3F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 32).mirror().addBox(-1.0F, -2.9F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0592F, 0.1044F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftfrontfoot = Leftlowerarm.addOrReplaceChild("Leftfrontfoot", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8559F, 0.1488F, 0.0555F, 0.0688F, -0.066F));

		PartDefinition Chestslope = Bodyfront.addOrReplaceChild("Chestslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5F, -4.5F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, 1.5F, -1.1F, 0.5212F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(0, 26).addBox(-0.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 26).addBox(-1.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 3.2F, -0.1F, -0.3318F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0729F, 3.3327F, 0.7663F, 0.1006F, -0.0081F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 1.5F, -1.1F, -0.2642F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.7F, -0.8008F, -0.3916F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 26).mirror().addBox(0.3F, -0.8008F, -0.3916F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 3.2F, -0.1F, -0.6372F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0729F, 3.3327F, 1.3298F, 0.0637F, 0.2122F));

		return LayerDefinition.create(meshdefinition, 48, 48);
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