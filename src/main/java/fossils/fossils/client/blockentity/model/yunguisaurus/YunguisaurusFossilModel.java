package fossils.fossils.client.blockentity.model.yunguisaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class YunguisaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart Lowerjaw;

	public YunguisaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone6 = this.Hips.getChild("bone6");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.bone = this.chest.getChild("bone");
		this.bone5 = this.chest.getChild("bone5");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone7 = this.Head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.2128F, 11.1812F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 45).addBox(0.0F, -1.2411F, 3.9492F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 91).addBox(0.0F, -1.2411F, 1.9492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 75).mirror().addBox(-1.3564F, 0.2597F, -0.1843F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 1.8427F, 0.5189F, 0.4081F, -0.112F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-2.3367F, -0.3373F, -0.1739F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 1.8427F, 0.2983F, 0.5778F, -0.5703F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(87, 67).mirror().addBox(-1.6145F, 0.2974F, -0.0748F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, -0.4573F, 0.5124F, 0.4601F, -0.1148F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 28).mirror().addBox(-3.5857F, -0.412F, -0.0624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, -0.4573F, 0.2635F, 0.6216F, -0.5899F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 75).addBox(-0.6436F, 0.2597F, -0.1843F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 1.8427F, 0.5189F, -0.4081F, 0.112F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(91, 42).addBox(1.3367F, -0.3373F, -0.1739F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 1.8427F, 0.2983F, -0.5778F, 0.5703F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 67).addBox(0.6145F, 0.2974F, -0.0748F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, -0.4573F, 0.5124F, -0.4601F, 0.1148F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 28).addBox(1.5857F, -0.412F, -0.0624F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, -0.4573F, 0.2635F, -0.6216F, 0.5899F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 52).addBox(0.0F, -0.4F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7702F, 4.5824F, 0.4959F, 0.0876F, 0.0869F, 0.444F));

		PartDefinition cube_r11 = BackFlipperR2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(30, 91).addBox(3.15F, 0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r12 = BackFlipperR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 75).addBox(-0.95F, 0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r13 = BackFlipperR2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 39).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = BackFlipperR2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 61).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r15 = BackFlipperR2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 3).addBox(0.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.9234F, 0.0F));

		PartDefinition cube_r16 = BackFlipperR2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 88).addBox(-0.4F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.74F, 0.0189F, 0.9734F, 0.0F, 1.6144F, 0.0F));

		PartDefinition cube_r17 = BackFlipperR2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 90).addBox(-0.9F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7029F, 0.0189F, 0.4426F, 0.0F, 0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create().texOffs(7, 72).addBox(-0.1593F, -0.5F, 0.2489F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9524F, 0.0189F, 1.5096F, -0.3107F, -0.6358F, 0.4957F));

		PartDefinition cube_r18 = BackFlipperMiddleR2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 79).addBox(0.8F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.324F, 0.0F, 1.2648F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r19 = BackFlipperMiddleR2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 24).addBox(-0.225F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(3.2669F, 0.0F, -0.499F, 0.0F, 1.7453F, 0.0F));

		PartDefinition cube_r20 = BackFlipperMiddleR2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 21).addBox(-0.575F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.2669F, 0.0F, -0.499F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r21 = BackFlipperMiddleR2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(33, 56).addBox(0.2F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.1657F, 0.0F, 0.6739F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r22 = BackFlipperMiddleR2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(5, 80).addBox(0.35F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1657F, 0.0F, 0.7739F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r23 = BackFlipperMiddleR2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 61).addBox(-1.2F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9407F, 0.0F, -0.6261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r24 = BackFlipperMiddleR2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(86, 42).addBox(0.6F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 74).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9407F, 0.0F, -0.6261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r25 = BackFlipperMiddleR2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(44, 15).addBox(0.0766F, 0.1681F, -0.8333F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2657F, -0.3213F, -0.8793F, 0.0099F, 0.0432F, -0.0014F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.3407F, 0.0F, -0.9261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r26 = BackFlipperEndR2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(19, 20).addBox(3.4303F, 0.183F, -1.9265F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.075F, -0.3213F, 0.0468F, 0.0099F, -0.2535F, -0.0056F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7702F, 4.5824F, 0.4959F, 0.0613F, -0.3764F, -0.6755F));

		PartDefinition cube_r27 = BackFlipperR3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(91, 34).addBox(-4.15F, 0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r28 = BackFlipperR3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 7).addBox(-1.05F, 0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r29 = BackFlipperR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 31).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r30 = BackFlipperR3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(81, 76).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r31 = BackFlipperR3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(38, 63).addBox(-4.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.9234F, 0.0F));

		PartDefinition cube_r32 = BackFlipperR3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(91, 12).addBox(-0.6F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.74F, 0.0189F, 0.9734F, 0.0F, -1.6144F, 0.0F));

		PartDefinition cube_r33 = BackFlipperR3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 9).addBox(-0.1F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.7029F, 0.0189F, 0.4426F, 0.0F, -0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create().texOffs(72, 14).addBox(-1.8407F, -0.5F, 0.2489F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9524F, 0.0189F, 1.5096F, -0.3696F, 0.6067F, -0.5969F));

		PartDefinition cube_r34 = BackFlipperMiddleR3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 80).addBox(-1.8F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.324F, 0.0F, 1.2648F, 0.0F, -1.1345F, 0.0F));

		PartDefinition cube_r35 = BackFlipperMiddleR3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(81, 37).addBox(-0.775F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-3.2669F, 0.0F, -0.499F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r36 = BackFlipperMiddleR3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(29, 81).addBox(-0.425F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.2669F, 0.0F, -0.499F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r37 = BackFlipperMiddleR3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(77, 79).addBox(-1.2F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1657F, 0.0F, 0.6739F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r38 = BackFlipperMiddleR3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(80, 34).addBox(-1.35F, -0.5F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1657F, 0.0F, 0.7739F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r39 = BackFlipperMiddleR3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 90).addBox(0.2F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9407F, 0.0F, -0.6261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r40 = BackFlipperMiddleR3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 90).addBox(-1.6F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 74).addBox(-1.0F, -0.5F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9407F, 0.0F, -0.6261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r41 = BackFlipperMiddleR3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(39, 49).addBox(-4.0766F, 0.1681F, -0.8333F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2657F, -0.3213F, -0.8793F, 0.0099F, -0.0432F, 0.0014F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.3407F, 0.0F, -0.9261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r42 = BackFlipperEndR3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(19, 24).addBox(-11.4303F, 0.183F, -1.9265F, 8.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.075F, -0.3213F, 0.0468F, 0.0099F, 0.2535F, 0.0056F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.7616F, 5.6239F, -5.7982F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(68, 6).addBox(-0.4336F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1004F, -3.2577F, 6.9575F, -1.6389F, -0.226F, -0.2448F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(87, 3).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6809F, -1.1747F, 6.1524F, -1.9443F, -0.226F, -0.2448F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(87, 6).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4209F, -1.3082F, 7.1088F, -1.028F, -0.226F, -0.2448F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(82, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4529F, -1.7227F, 6.5368F, -1.3771F, -0.226F, -0.2448F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(75, 21).addBox(-0.494F, -2.0072F, -0.007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4842F, -2.4611F, 5.6F, -0.6179F, -0.226F, -0.2448F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5F, -0.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4389F, -4.5981F, 7.1248F, 0.1501F, -0.226F, -0.2448F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(71, 82).addBox(-0.494F, -1.1565F, -0.1655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.3416F, -4.1231F, 7.188F, 0.3683F, -0.226F, -0.2448F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(82, 66).addBox(-0.494F, -0.8954F, 0.1772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.3416F, -4.0231F, 7.438F, 0.8482F, -0.226F, -0.2448F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(39, 53).addBox(-0.494F, -0.6851F, -2.8509F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3416F, -4.0231F, 7.438F, 1.1973F, -0.226F, -0.2448F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(67, 61).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6513F, -1.2415F, 7.6358F, 0.2466F, -0.2967F, -0.0735F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(86, 69).addBox(-0.4F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8366F, -0.8628F, 6.0585F, 0.2436F, -0.2544F, -0.0625F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(61, 67).addBox(-2.5768F, -0.3573F, 0.5612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(86, 82).addBox(-0.225F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.7958F, -0.9062F, 6.2393F, 0.3037F, 0.6752F, 0.1934F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(82, 52).addBox(-1.275F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7958F, -0.9062F, 6.2393F, 0.2376F, -0.1273F, -0.0307F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(75, 4).addBox(-2.2979F, -0.3573F, 0.0604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2391F, 0.1697F, 0.0411F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(74, 43).addBox(-1.95F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1255F, -0.7477F, 5.4203F, 0.3827F, -1.0177F, -0.3086F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(56, 81).addBox(-0.25F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0148F, -0.5652F, 4.5234F, 0.2692F, -0.7235F, -0.1807F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(66, 18).addBox(-1.9586F, -0.99F, 0.0413F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.522F, 0.2757F, 2.848F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(66, 82).addBox(-0.4242F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2055F, 0.2137F, 0.0442F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(64, 25).addBox(-1.2F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.2444F, -0.565F, 4.5225F, 0.7545F, 1.2754F, 0.7324F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(11, 61).addBox(0.0329F, -0.99F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(1.0028F, 0.4437F, 2.022F, 0.3489F, -0.9482F, -0.2874F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(86, 75).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.0405F, -0.7081F, 5.2256F, 0.4638F, 1.1089F, 0.421F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(86, 72).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.663F, -0.552F, 4.4587F, 0.2543F, 0.6561F, 0.1573F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(58, 63).addBox(-2.8672F, -0.5035F, -3.4142F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2008F, 0.0257F, 0.0052F));

		PartDefinition basin_r25 = bone2.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(54, 67).addBox(-1.4F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.1119F, -0.1227F, 2.3485F, 0.2407F, 0.5799F, 0.1337F));

		PartDefinition basin_r26 = bone2.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(49, 63).addBox(-0.4053F, -0.99F, 0.0477F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-1.4657F, 0.4721F, 1.8826F, 0.2031F, 0.1539F, 0.0316F));

		PartDefinition basin_r27 = bone2.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(29, 63).addBox(0.0052F, -0.99F, -0.0097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0575F, 0.5139F, 1.6769F, 0.2168F, -0.3844F, -0.0824F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-2.7616F, 5.6239F, -5.7982F));

		PartDefinition basin_r28 = bone6.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-0.5664F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1004F, -3.2577F, 6.9575F, -1.6389F, 0.226F, 0.2448F));

		PartDefinition basin_r29 = bone6.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6809F, -1.1747F, 6.1524F, -1.9443F, 0.226F, 0.2448F));

		PartDefinition basin_r30 = bone6.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4209F, -1.3082F, 7.1088F, -1.028F, 0.226F, 0.2448F));

		PartDefinition basin_r31 = bone6.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(82, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4529F, -1.7227F, 6.5368F, -1.3771F, 0.226F, 0.2448F));

		PartDefinition basin_r32 = bone6.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(75, 21).mirror().addBox(-0.506F, -2.0072F, -0.007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4842F, -2.4611F, 5.6F, -0.6179F, 0.226F, 0.2448F));

		PartDefinition basin_r33 = bone6.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.5F, -0.6F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.4389F, -4.5981F, 7.1248F, 0.1501F, 0.226F, 0.2448F));

		PartDefinition basin_r34 = bone6.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(-0.506F, -1.1565F, -0.1655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.3416F, -4.1231F, 7.188F, 0.3683F, 0.226F, 0.2448F));

		PartDefinition basin_r35 = bone6.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(-0.506F, -0.8954F, 0.1772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.3416F, -4.0231F, 7.438F, 0.8482F, 0.226F, 0.2448F));

		PartDefinition basin_r36 = bone6.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(39, 53).mirror().addBox(-0.506F, -0.6851F, -2.8509F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.3416F, -4.0231F, 7.438F, 1.1973F, 0.226F, 0.2448F));

		PartDefinition basin_r37 = bone6.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6513F, -1.2415F, 7.6358F, 0.2466F, 0.2967F, 0.0735F));

		PartDefinition basin_r38 = bone6.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(86, 69).mirror().addBox(-0.6F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8366F, -0.8628F, 6.0585F, 0.2436F, 0.2544F, 0.0625F));

		PartDefinition basin_r39 = bone6.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(61, 67).mirror().addBox(1.5768F, -0.3573F, 0.5612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r40 = bone6.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(86, 82).mirror().addBox(-0.775F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.7958F, -0.9062F, 6.2393F, 0.3037F, -0.6752F, -0.1934F));

		PartDefinition basin_r41 = bone6.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(0.275F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7958F, -0.9062F, 6.2393F, 0.2376F, 0.1273F, 0.0307F));

		PartDefinition basin_r42 = bone6.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(0.2979F, -0.3573F, 0.0604F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2391F, -0.1697F, -0.0411F));

		PartDefinition basin_r43 = bone6.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-0.05F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1255F, -0.7477F, 5.4203F, 0.3827F, 1.0177F, 0.3086F));

		PartDefinition basin_r44 = bone6.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(56, 81).mirror().addBox(-0.75F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0148F, -0.5652F, 4.5234F, 0.2692F, 0.7235F, 0.1807F));

		PartDefinition basin_r45 = bone6.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(66, 18).mirror().addBox(-0.0414F, -0.99F, 0.0413F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.522F, 0.2757F, 2.848F, 0.2024F, -0.1283F, -0.0262F));

		PartDefinition basin_r46 = bone6.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(66, 82).mirror().addBox(-0.5758F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2055F, -0.2137F, -0.0442F));

		PartDefinition basin_r47 = bone6.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-0.8F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.2444F, -0.565F, 4.5225F, 0.7545F, -1.2754F, -0.7324F));

		PartDefinition basin_r48 = bone6.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-1.0329F, -0.99F, -0.0091F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-1.0028F, 0.4437F, 2.022F, 0.3489F, 0.9482F, 0.2874F));

		PartDefinition basin_r49 = bone6.addOrReplaceChild("basin_r49", CubeListBuilder.create().texOffs(86, 75).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.0405F, -0.7081F, 5.2256F, 0.4638F, -1.1089F, -0.421F));

		PartDefinition basin_r50 = bone6.addOrReplaceChild("basin_r50", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.663F, -0.552F, 4.4587F, 0.2543F, -0.6561F, -0.1573F));

		PartDefinition basin_r51 = bone6.addOrReplaceChild("basin_r51", CubeListBuilder.create().texOffs(58, 63).mirror().addBox(0.8672F, -0.5035F, -3.4142F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2008F, -0.0257F, -0.0052F));

		PartDefinition basin_r52 = bone6.addOrReplaceChild("basin_r52", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(0.4F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.1119F, -0.1227F, 2.3485F, 0.2407F, -0.5799F, -0.1337F));

		PartDefinition basin_r53 = bone6.addOrReplaceChild("basin_r53", CubeListBuilder.create().texOffs(49, 63).mirror().addBox(-1.5947F, -0.99F, 0.0477F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(1.4657F, 0.4721F, 1.8826F, 0.2031F, -0.1539F, -0.0316F));

		PartDefinition basin_r54 = bone6.addOrReplaceChild("basin_r54", CubeListBuilder.create().texOffs(29, 63).mirror().addBox(-1.0052F, -0.99F, -0.0097F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0575F, 0.5139F, 1.6769F, 0.2168F, 0.3844F, 0.0824F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(50, 53).addBox(-0.5F, -0.2606F, -0.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.625F, 3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail1.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(66, 91).addBox(0.0F, -1.7F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 91).addBox(0.0F, -1.3F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4668F, 3.3669F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail1.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(92, 63).addBox(0.0F, -1.0238F, 1.9739F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 80).addBox(0.0F, -1.0488F, -0.0261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2117F, 0.9777F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Tail1.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2394F, 0.9515F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r46 = Tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 58).addBox(-0.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2394F, 0.9515F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(29, 11).addBox(-0.5F, -0.9509F, 0.0452F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, -0.0523F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Tail2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(35, 93).addBox(0.0F, -0.9904F, 4.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 93).addBox(0.0F, -0.8904F, 2.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(23, 93).addBox(0.0F, 1.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 77).addBox(0.0F, 0.9F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(69, 91).addBox(0.0F, -0.4F, 3.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7785F, -2.5107F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 66).addBox(0.0F, -0.9654F, 0.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(-1.7F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r51 = Tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(36, 36).addBox(-0.3F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8606F, 0.9921F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(19, 28).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3649F, 5.992F, -0.0604F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Tail3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(32, 94).addBox(0.0F, -1.1154F, 10.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 94).addBox(0.0F, -1.1154F, 8.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 94).addBox(0.0F, -1.0154F, 6.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4956F, -4.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 80).addBox(0.0F, 2.2F, 13.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 72).addBox(0.0F, 1.8F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 69).addBox(0.0F, 1.5F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -8.5028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Tail3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(51, 26).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1014F, 1.0445F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r55 = Tail3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(51, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1014F, 1.0445F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(44, 8).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.3664F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Tail4.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(95, 19).addBox(0.0F, -1.1154F, 15.9531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 3).addBox(0.0F, -1.1154F, 13.9531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 94).addBox(0.0F, -1.1154F, 11.9531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4956F, -11.8999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Tail4.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 22).addBox(0.0F, 3.0F, 17.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 34).addBox(0.0F, 2.5F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -15.4028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1918F, 0.0F, 0.0F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(48, 0).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.2345F, 0.0F, 0.0F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(13, 48).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0015F, 4.9751F, -0.2785F, 0.0F, 0.0F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(26, 49).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 4.9503F, -0.3228F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(17, 41).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(91, 69).addBox(0.0F, -1.9F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Bodymiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 91).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Bodymiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(15, 30).addBox(0.5F, -1.475F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Bodymiddle.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(79, 14).mirror().addBox(-5.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8478F, -0.0118F, -3.3322F, -0.0355F, 0.6961F, -1.1516F));

		PartDefinition cube_r61 = Bodymiddle.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8478F, -0.0118F, -3.3322F, 0.3408F, 0.6203F, -0.5486F));

		PartDefinition cube_r62 = Bodymiddle.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 57).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8478F, -0.0118F, -3.3322F, 0.574F, 0.4308F, -0.0919F));

		PartDefinition cube_r63 = Bodymiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 40).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -1.4322F, -0.0355F, 0.6961F, -1.1516F));

		PartDefinition cube_r64 = Bodymiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(75, 19).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -1.4322F, 0.3408F, 0.6203F, -0.5486F));

		PartDefinition cube_r65 = Bodymiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(91, 61).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -1.4322F, 0.574F, 0.4308F, -0.0919F));

		PartDefinition cube_r66 = Bodymiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(56, 75).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, 0.574F, 0.4308F, -0.0919F));

		PartDefinition cube_r67 = Bodymiddle.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, 0.3408F, 0.6203F, -0.5486F));

		PartDefinition cube_r68 = Bodymiddle.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(42, 26).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, -0.0355F, 0.6961F, -1.1516F));

		PartDefinition cube_r69 = Bodymiddle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(79, 14).addBox(3.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8478F, -0.0118F, -3.3322F, -0.0355F, -0.6961F, 1.1516F));

		PartDefinition cube_r70 = Bodymiddle.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(67, 77).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8478F, -0.0118F, -3.3322F, 0.3408F, -0.6203F, 0.5486F));

		PartDefinition cube_r71 = Bodymiddle.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 57).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8478F, -0.0118F, -3.3322F, 0.574F, -0.4308F, 0.0919F));

		PartDefinition cube_r72 = Bodymiddle.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(91, 40).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -1.4322F, -0.0355F, -0.6961F, 1.1516F));

		PartDefinition cube_r73 = Bodymiddle.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 19).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -1.4322F, 0.3408F, -0.6203F, 0.5486F));

		PartDefinition cube_r74 = Bodymiddle.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(91, 61).addBox(1.91F, -0.0899F, -0.4375F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -1.4322F, 0.574F, -0.4308F, 0.0919F));

		PartDefinition cube_r75 = Bodymiddle.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 75).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, 0.574F, -0.4308F, 0.0919F));

		PartDefinition cube_r76 = Bodymiddle.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(49, 75).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, 0.3408F, -0.6203F, 0.5486F));

		PartDefinition cube_r77 = Bodymiddle.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(42, 26).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, -0.0355F, -0.6961F, 1.1516F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(42, 19).addBox(-0.5F, -0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.0873F, 0.0435F, 0.0038F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 91).addBox(0.5F, -1.55F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(91, 73).addBox(0.5F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(71, 35).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, -0.0535F, 0.6641F, -1.1612F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(79, 12).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.3046F, 0.6019F, -0.5675F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(67, 65).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.5358F, 0.4274F, -0.1059F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.574F, 0.4308F, -0.0919F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(75, 59).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.3408F, 0.6203F, -0.5486F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(64, 29).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.0355F, 0.6961F, -1.1516F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(71, 35).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, -0.0535F, -0.6641F, 1.1612F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(79, 12).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.3046F, -0.6019F, 0.5675F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(67, 65).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.5358F, -0.4274F, 0.1059F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 46).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.574F, -0.4308F, 0.0919F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(75, 59).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.3408F, -0.6203F, 0.5486F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(64, 29).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.0355F, -0.6961F, 1.1516F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 11).addBox(-3.5F, -2.1F, 0.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.4F, -5.1F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.05F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(91, 81).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4741F, -1.024F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(81, 91).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5043F, -3.0263F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(78, 91).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3345F, -5.0215F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, -0.0446F, 0.6801F, -1.1565F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, 0.3226F, 0.6112F, -0.5582F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(68, 67).mirror().addBox(-2.91F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -0.6822F, 0.5549F, 0.4291F, -0.0989F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, -0.0446F, 0.6801F, -1.1565F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, 0.3226F, 0.6112F, -0.5582F));

		PartDefinition cube_r101 = Bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(27, 68).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -2.6822F, 0.5549F, 0.4291F, -0.0989F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, 0.574F, 0.4308F, -0.0919F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(75, 17).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, 0.3408F, 0.6203F, -0.5486F));

		PartDefinition cube_r104 = Bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.0882F, -4.6822F, -0.0355F, 0.6961F, -1.1516F));

		PartDefinition cube_r105 = Bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(65, 49).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, -0.0446F, -0.6801F, 1.1565F));

		PartDefinition cube_r106 = Bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 76).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, 0.3226F, -0.6112F, 0.5582F));

		PartDefinition cube_r107 = Bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(68, 67).addBox(-0.09F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -0.6822F, 0.5549F, -0.4291F, 0.0989F));

		PartDefinition cube_r108 = Bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(57, 12).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, -0.0446F, -0.6801F, 1.1565F));

		PartDefinition cube_r109 = Bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(63, 75).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, 0.3226F, -0.6112F, 0.5582F));

		PartDefinition cube_r110 = Bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(27, 68).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -2.6822F, 0.5549F, -0.4291F, 0.0989F));

		PartDefinition cube_r111 = Bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(68, 10).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, 0.574F, -0.4308F, 0.0919F));

		PartDefinition cube_r112 = Bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(75, 17).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, 0.3408F, -0.6203F, 0.5486F));

		PartDefinition cube_r113 = Bodyfront.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 38).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0882F, -4.6822F, -0.0355F, -0.6961F, 1.1516F));

		PartDefinition cube_r114 = Bodyfront.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.9F, -8.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.797F, -0.0697F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Bodyfront.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -0.6F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.2939F, -5.9504F, 0.1223F, 0.0433F, 0.0053F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(90, 91).addBox(0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5647F, -1.0203F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(32, 37).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4949F, -3.0191F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(87, 91).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4251F, -5.0179F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, 0.5378F, 0.41F, -0.1051F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, 0.3159F, 0.5871F, -0.5612F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(74, 77).mirror().addBox(-5.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, 0.1943F, -6.7318F, -0.0333F, 0.6571F, -1.1488F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(76, 50).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, 0.3046F, 0.6019F, -0.5675F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, -0.0535F, 0.6641F, -1.1612F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -4.7318F, 0.5358F, 0.4274F, -0.1059F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(59, 16).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, -0.0622F, 0.6481F, -1.1656F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(76, 48).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, 0.2869F, 0.5924F, -0.5766F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -2.7318F, 0.5168F, 0.4255F, -0.1129F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(59, 14).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, -0.0708F, 0.6321F, -1.1697F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, 0.2694F, 0.5829F, -0.5854F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(68, 69).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.0057F, -0.7318F, 0.4978F, 0.4234F, -0.1198F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 12).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, 0.5378F, -0.41F, 0.1051F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(0, 78).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, 0.3159F, -0.5871F, 0.5612F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(74, 77).addBox(3.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1943F, -6.7318F, -0.0333F, -0.6571F, 1.1488F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(76, 50).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, 0.3046F, -0.6019F, 0.5675F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(65, 51).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, -0.0535F, -0.6641F, 1.1612F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(9, 70).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -4.7318F, 0.5358F, -0.4274F, 0.1059F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(59, 16).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, -0.0622F, -0.6481F, 1.1656F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(76, 48).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, 0.2869F, -0.5924F, 0.5766F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 70).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -2.7318F, 0.5168F, -0.4255F, 0.1129F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(59, 14).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, -0.0708F, -0.6321F, 1.1697F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(76, 46).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, 0.2694F, -0.5829F, 0.5854F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(68, 69).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, -0.0057F, -0.7318F, 0.4978F, -0.4234F, 0.1198F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(84, 91).addBox(0.5F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3553F, -7.0167F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.6F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.16F, 4.3506F, -7.9067F, 0.2272F, -0.5358F, -0.1986F));

		PartDefinition cube_r145 = FrontFlipperR3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.8091F, -0.0709F, -0.762F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r146 = FrontFlipperR3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(74, 40).addBox(-0.5F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.4751F, -0.0709F, -0.52F, 0.0F, 2.9671F, 0.0F));

		PartDefinition cube_r147 = FrontFlipperR3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 85).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.9004F, -0.0709F, -0.645F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r148 = FrontFlipperR3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(86, 36).addBox(0.5651F, -0.5F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.3336F, -0.0709F, -0.4351F, 0.0F, -1.309F, 0.0F));

		PartDefinition cube_r149 = FrontFlipperR3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(79, 85).addBox(-0.0849F, -0.5F, -0.0499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3336F, -0.0709F, -0.4351F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r150 = FrontFlipperR3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(74, 37).addBox(-2.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2689F, -0.0709F, -1.0598F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r151 = FrontFlipperR3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(73, 25).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3771F, -0.0709F, -0.5717F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r152 = FrontFlipperR3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(21, 74).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3771F, -0.0709F, -0.5717F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r153 = FrontFlipperR3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(33, 8).addBox(-1.575F, -1.0F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1522F, 0.429F, 0.1284F, 0.0F, 0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(81, 40).addBox(3.3332F, -0.5F, -1.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 86).addBox(2.8332F, -0.5F, -0.2343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 86).addBox(3.0332F, -0.5F, 0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.8761F, -0.0709F, -0.7543F, -0.2F, 0.2324F, -0.7216F));

		PartDefinition cube_r154 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(67, 79).addBox(-1.925F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7469F, 0.0F, -1.5308F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r155 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(41, 81).addBox(-2.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7469F, 0.0F, -1.5308F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r156 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(66, 22).addBox(-0.6213F, -0.5F, -1.0052F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.009F, 0.0F, -0.3376F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r157 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 86).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2784F, 0.0F, 1.2028F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r158 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(15, 86).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0962F, 0.0F, 0.7023F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r159 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(86, 13).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0447F, 0.0F, 0.9104F, 0.0F, -1.309F, 0.0F));

		PartDefinition cube_r160 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(0, 67).addBox(-1.4181F, -0.5F, -0.6855F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0155F, 0.0F, 1.1104F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r161 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(86, 10).addBox(0.9534F, -0.5F, -0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0155F, 0.0F, 1.1104F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r162 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(33, 59).addBox(-0.0648F, 1.0304F, -0.5106F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3244F, -0.9941F, -0.6578F, 0.0017F, -0.0869F, 0.0076F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3469F, 0.0F, -0.8308F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r163 = FrontFlipperEndR3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(15, 37).addBox(0.048F, 1.0484F, -0.0391F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1887F, -0.98F, 0.0481F, -0.0079F, -0.105F, -0.0005F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.16F, 4.3506F, -7.9067F, 0.2994F, 0.5017F, 0.3441F));

		PartDefinition cube_r164 = FrontFlipperR2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(15, 89).addBox(-0.5F, -0.5F, -1.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-4.8091F, -0.0709F, -0.762F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r165 = FrontFlipperR2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(74, 71).addBox(-1.5F, -0.5F, -0.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.4751F, -0.0709F, -0.52F, 0.0F, -2.9671F, 0.0F));

		PartDefinition cube_r166 = FrontFlipperR2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.9004F, -0.0709F, -0.645F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r167 = FrontFlipperR2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(5, 89).addBox(-1.5651F, -0.5F, -0.4499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.3336F, -0.0709F, -0.4351F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r168 = FrontFlipperR2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 0).addBox(-0.9151F, -0.5F, -0.0499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3336F, -0.0709F, -0.4351F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r169 = FrontFlipperR2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 61).addBox(0.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2689F, -0.0709F, -1.0598F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r170 = FrontFlipperR2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(14, 74).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3771F, -0.0709F, -0.5717F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r171 = FrontFlipperR2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(28, 74).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3771F, -0.0709F, -0.5717F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r172 = FrontFlipperR2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(61, 0).addBox(-2.425F, -1.0F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.1522F, 0.429F, 0.1284F, 0.0F, -0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(81, 43).addBox(-4.3332F, -0.5F, -1.0343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(20, 89).addBox(-3.8332F, -0.5F, -0.2343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 85).addBox(-4.0332F, -0.5F, 0.7657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.8761F, -0.0709F, -0.7543F, -0.1564F, -0.2635F, 0.5444F));

		PartDefinition cube_r173 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(72, 79).addBox(0.925F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7469F, 0.0F, -1.5308F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r174 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(46, 81).addBox(1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7469F, 0.0F, -1.5308F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r175 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(66, 58).addBox(-2.3787F, -0.5F, -1.0052F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.009F, 0.0F, -0.3376F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r176 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(90, 28).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2784F, 0.0F, 1.2028F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r177 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(25, 90).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0962F, 0.0F, 0.7023F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r178 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(90, 22).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0447F, 0.0F, 0.9104F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r179 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(18, 67).addBox(-1.5819F, -0.5F, -0.6855F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0155F, 0.0F, 1.1104F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r180 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(90, 19).addBox(-1.9534F, -0.5F, -0.1863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.0155F, 0.0F, 1.1104F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r181 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(44, 59).addBox(-1.9352F, 1.0304F, -0.5106F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3244F, -0.9941F, -0.6578F, 0.0017F, 0.0869F, -0.0076F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.3469F, 0.0F, -0.8308F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r182 = FrontFlipperEndR2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 41).addBox(-5.048F, 1.0484F, -0.0391F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1887F, -0.98F, 0.0481F, -0.0079F, 0.105F, 0.0005F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 8.299F, -7.5045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(47, 67).addBox(-1.025F, -0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-5.8986F, -3.7252F, -0.8899F, -0.4081F, 0.7426F, -0.2844F));

		PartDefinition cube_r184 = bone.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(50, 90).addBox(-0.01F, -0.9349F, -1.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-6.9886F, -3.0357F, -0.1222F, -0.2995F, -0.1335F, 0.0411F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(61, 81).addBox(-4.31F, -0.9349F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(54, 49).addBox(-4.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(56, 44).addBox(-4.31F, -0.9349F, 2.7642F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(55, 59).addBox(-1.9F, -0.5F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.9826F, -2.6986F, 2.4678F, -0.664F, 1.0765F, -0.6032F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(9, 66).addBox(-1.9F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0643F, -2.9426F, 1.6699F, -0.3903F, 0.6944F, -0.2574F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(51, 81).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0393F, -5.7415F, -0.1759F, -2.1712F, 0.2239F, 0.2467F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(19, 79).addBox(-0.2592F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0393F, -5.7415F, -0.1759F, -1.2178F, 0.1406F, 0.3013F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(45, 90).addBox(-0.2592F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0393F, -5.7415F, -0.1759F, -1.1415F, 0.2239F, 0.2467F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(14, 79).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0393F, -5.7415F, -0.1759F, -1.2986F, 0.2239F, 0.2467F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(24, 79).addBox(0.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4393F, -6.4414F, -0.7759F, 0.0594F, 0.5256F, 0.7416F));

		PartDefinition cube_r193 = bone.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(67, 37).addBox(0.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.4393F, -6.4414F, -0.7759F, 0.4957F, 0.5256F, 0.7416F));

		PartDefinition cube_r194 = bone.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 7).addBox(-1.0F, -0.575F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-4.1069F, -3.2906F, 0.4277F, -0.3473F, -0.2778F, 0.0244F));

		PartDefinition cube_r195 = bone.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 72).addBox(0.675F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(38, 66).addBox(-0.725F, -0.5F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.8297F, -4.0395F, -1.3289F, -0.8745F, -0.8491F, 0.6365F));

		PartDefinition cube_r196 = bone.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 42).addBox(-0.5F, -0.5F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.3712F, -4.3131F, -2.0411F, -1.9987F, -0.9799F, 1.9779F));

		PartDefinition cube_r197 = bone.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(91, 37).addBox(-0.55F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.5469F, -4.3551F, -2.1406F, -0.9576F, -0.9023F, 0.7446F));

		PartDefinition cube_r198 = bone.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(72, 0).addBox(0.05F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.0414F, -4.8582F, -2.9107F, -1.9376F, -0.9968F, 1.9047F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 8.299F, -7.5045F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(0.025F, -0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(5.8986F, -3.7252F, -0.8899F, -0.4081F, -0.7426F, 0.2844F));

		PartDefinition cube_r200 = bone5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-0.99F, -0.9349F, -1.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(6.9886F, -3.0357F, -0.1222F, -0.2995F, 0.1335F, -0.0411F));

		PartDefinition cube_r201 = bone5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(61, 81).mirror().addBox(3.31F, -0.9349F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(54, 49).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(56, 44).mirror().addBox(2.31F, -0.9349F, 2.7642F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r202 = bone5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(55, 59).mirror().addBox(-1.1F, -0.5F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(4.9826F, -2.6986F, 2.4678F, -0.664F, -1.0765F, 0.6032F));

		PartDefinition cube_r203 = bone5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(9, 66).mirror().addBox(-0.1F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0643F, -2.9426F, 1.6699F, -0.3903F, -0.6944F, 0.2574F));

		PartDefinition cube_r204 = bone5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(51, 81).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7415F, -0.1759F, -2.1712F, -0.2239F, -0.2467F));

		PartDefinition cube_r205 = bone5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(19, 79).mirror().addBox(-0.7408F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7415F, -0.1759F, -1.2178F, -0.1406F, -0.3013F));

		PartDefinition cube_r206 = bone5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(45, 90).mirror().addBox(-0.7408F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7415F, -0.1759F, -1.1415F, -0.2239F, -0.2467F));

		PartDefinition cube_r207 = bone5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7415F, -0.1759F, -1.2986F, -0.2239F, -0.2467F));

		PartDefinition cube_r208 = bone5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(-1.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4393F, -6.4414F, -0.7759F, 0.0594F, -0.5256F, -0.7416F));

		PartDefinition cube_r209 = bone5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(67, 37).mirror().addBox(-1.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.4393F, -6.4414F, -0.7759F, 0.4957F, -0.5256F, -0.7416F));

		PartDefinition cube_r210 = bone5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(57, 7).mirror().addBox(-1.0F, -0.575F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(4.1069F, -3.2906F, 0.4277F, -0.3473F, 0.2778F, -0.0244F));

		PartDefinition cube_r211 = bone5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.675F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(38, 66).mirror().addBox(-1.275F, -0.5F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(4.8297F, -4.0395F, -1.3289F, -0.8745F, 0.8491F, -0.6365F));

		PartDefinition cube_r212 = bone5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-0.5F, -0.5F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.3712F, -4.3131F, -2.0411F, -1.9987F, 0.9799F, -1.9779F));

		PartDefinition cube_r213 = bone5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(91, 37).mirror().addBox(-0.45F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(6.5469F, -4.3551F, -2.1406F, -0.9576F, 0.9023F, -0.7446F));

		PartDefinition cube_r214 = bone5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(72, 0).mirror().addBox(-1.05F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.0414F, -4.8582F, -2.9107F, -1.9376F, 0.9968F, -1.9047F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5292F, -7.9951F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(92, 3).addBox(0.5F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5101F, -3.0251F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-2.0715F, 0.1515F, -0.2169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0651F, -3.0367F, 0.7226F, 0.5445F, -0.0397F));

		PartDefinition cube_r217 = neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-3.9394F, -0.7376F, -0.2014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0651F, -3.0367F, 0.4281F, 0.7807F, -0.5098F));

		PartDefinition cube_r218 = neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(76, 64).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.73F, 0.3701F, -0.0364F));

		PartDefinition cube_r219 = neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.5328F, 0.6254F, -0.4419F));

		PartDefinition cube_r220 = neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(3, 92).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0478F, -0.2349F, -1.0367F, 0.1351F, 0.7887F, -1.0415F));

		PartDefinition cube_r221 = neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(29, 79).addBox(0.0715F, 0.1515F, -0.2169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0651F, -3.0367F, 0.7226F, -0.5445F, 0.0397F));

		PartDefinition cube_r222 = neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(77, 10).addBox(1.9394F, -0.7376F, -0.2014F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0651F, -3.0367F, 0.4281F, -0.7807F, 0.5098F));

		PartDefinition cube_r223 = neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(76, 64).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.73F, -0.3701F, 0.0364F));

		PartDefinition cube_r224 = neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(7, 78).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.5328F, -0.6254F, 0.4419F));

		PartDefinition cube_r225 = neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(3, 92).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.2349F, -1.0367F, 0.1351F, -0.7887F, 1.0415F));

		PartDefinition cube_r226 = neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 92).addBox(0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7538F, -1.04F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r227 = neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(51, 32).addBox(0.0F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.0126F, -4.0727F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r228 = Neck1.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(41, 93).addBox(0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2663F, -0.9102F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Neck1.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(38, 93).addBox(0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0226F, -2.8953F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Neck1.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-1.5975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.4777F, -2.464F, 0.4718F, 0.2617F, -0.6542F));

		PartDefinition cube_r231 = Neck1.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(14, 77).mirror().addBox(-1.4975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -0.264F, 0.5295F, 0.368F, -0.4223F));

		PartDefinition cube_r232 = Neck1.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(21, 77).addBox(-0.4025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.4777F, -2.464F, 0.4718F, -0.2617F, 0.6542F));

		PartDefinition cube_r233 = Neck1.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(14, 77).addBox(-0.5025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -0.264F, 0.5295F, -0.368F, 0.4223F));

		PartDefinition cube_r234 = Neck1.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(11, 55).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r235 = Neck2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(93, 44).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5919F, -0.6087F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Neck2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(44, 93).addBox(0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.557F, -2.6084F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Neck2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(78, 30).mirror().addBox(-1.2975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -2.0639F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r238 = Neck2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(28, 77).mirror().addBox(-1.3975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -0.0639F, 0.264F, 0.0979F, -0.6917F));

		PartDefinition cube_r239 = Neck2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(78, 30).addBox(-0.7025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -2.0639F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition cube_r240 = Neck2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(28, 77).addBox(-0.6025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -0.0639F, 0.264F, -0.0979F, 0.6917F));

		PartDefinition cube_r241 = Neck2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(55, 19).addBox(0.0F, -0.4F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(47, 93).addBox(0.0F, -1.25F, -5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 47).addBox(0.0F, -1.275F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 93).addBox(0.0F, -1.3F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, -0.0116F, 0.1738F, -0.1324F));

		PartDefinition cube_r242 = Neck3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 7).mirror().addBox(-0.8975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -4.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r243 = Neck3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-1.2975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r244 = Neck3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(78, 32).mirror().addBox(-1.1975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r245 = Neck3.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(92, 7).addBox(-0.1025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -4.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r246 = Neck3.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(35, 77).addBox(-0.7025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r247 = Neck3.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(78, 32).addBox(-0.8025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -6.175F, -0.1309F, 0.2182F, -0.1745F));

		PartDefinition cube_r248 = Neck4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(94, 83).addBox(0.0F, -1.325F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(56, 93).addBox(0.0F, -1.3F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(53, 93).addBox(0.0F, -1.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 28).addBox(-0.5F, -0.6F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.8F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Neck4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(8, 92).mirror().addBox(-0.5742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2962F, -4.2637F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r250 = Neck4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(92, 25).mirror().addBox(-0.6975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.3962F, -2.2637F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r251 = Neck4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(92, 57).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.3962F, -0.2637F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r252 = Neck4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(8, 92).addBox(-0.4258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2962F, -4.2637F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r253 = Neck4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(92, 25).addBox(-0.3025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.3962F, -2.2637F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r254 = Neck4.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(92, 57).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.3962F, -0.2637F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0724F, -5.7501F, -0.1834F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Neck5.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(3, 94).addBox(0.0F, -1.3F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(94, 0).addBox(0.0F, -1.3F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(93, 91).addBox(0.0F, -1.3F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(30, 42).addBox(-0.5F, -0.6F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Neck5.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.3742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0685F, -4.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r257 = Neck5.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(92, 15).mirror().addBox(-0.3742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1685F, -2.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r258 = Neck5.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(13, 92).mirror().addBox(-0.4742F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2685F, -0.5136F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r259 = Neck5.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(92, 17).addBox(-0.6258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0685F, -4.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r260 = Neck5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(92, 15).addBox(-0.6258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1685F, -2.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r261 = Neck5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(13, 92).addBox(-0.5258F, -0.1961F, -0.5303F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2685F, -0.5136F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2091F, -4.9458F, 0.1487F, 0.0871F, 0.0053F));

		PartDefinition cube_r262 = Neck6.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(9, 94).addBox(0.0F, -1.225F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(6, 94).addBox(0.0F, -1.125F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(22, 56).addBox(-0.5F, -0.6F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Neck6.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(92, 51).mirror().addBox(-0.2975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -3.5678F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r264 = Neck6.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(18, 92).mirror().addBox(-0.2975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -1.5678F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r265 = Neck6.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(92, 51).addBox(-0.7025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -3.5678F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r266 = Neck6.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(18, 92).addBox(-0.7025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -1.5678F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1861F, -3.9187F, 0.0636F, 0.3049F, 0.0191F));

		PartDefinition cube_r267 = Neck7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(15, 94).addBox(0.0F, -1.15F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(12, 94).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(43, 42).addBox(-0.5F, -0.6F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Neck7.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-0.0975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2638F, -3.4491F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r269 = Neck7.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(-0.2975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2638F, -1.4491F, -0.0048F, -0.1256F, -0.6879F));

		PartDefinition cube_r270 = Neck7.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(92, 55).addBox(-0.9025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2638F, -3.4491F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition cube_r271 = Neck7.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(92, 53).addBox(-0.7025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2638F, -1.4491F, -0.0048F, 0.1256F, 0.6879F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 70).addBox(-0.5F, -0.75F, -2.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F))
				.texOffs(56, 38).addBox(-0.5F, -0.1787F, -3.7283F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.157F)), PartPose.offset(0.0F, -0.5324F, -5.1854F));

		PartDefinition cube_r272 = Head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(54, 84).addBox(-0.5F, -0.5185F, -0.583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.151F, -0.2676F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r273 = Head.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(49, 84).addBox(-0.5F, -0.15F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.325F, -1.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r274 = Head.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(87, 16).addBox(-0.5F, -0.575F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0F, 0.7406F, -6.2036F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r275 = Head.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(62, 32).mirror().addBox(-0.25F, -0.25F, -1.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 0.0677F, -4.4296F, 0.1486F, -0.0561F, -0.0084F));

		PartDefinition cube_r276 = Head.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(-0.2F, -0.175F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3333F, -0.0288F, -4.0169F, 0.1369F, -0.1355F, 0.7761F));

		PartDefinition cube_r277 = Head.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(65, 88).mirror().addBox(-0.15F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.35F, -0.1631F, -3.5878F, 0.193F, -0.2383F, 0.7559F));

		PartDefinition cube_r278 = Head.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(62, 32).addBox(-0.75F, -0.25F, -1.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.35F, 0.0677F, -4.4296F, 0.1486F, 0.0561F, 0.0084F));

		PartDefinition cube_r279 = Head.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(61, 53).addBox(-0.5F, -0.45F, -2.775F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.1436F, -3.5841F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r280 = Head.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(50, 87).addBox(-0.5F, -0.1528F, -0.1615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.0731F, -4.4428F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r281 = Head.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(70, 88).addBox(-0.8F, -0.175F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3333F, -0.0288F, -4.0169F, 0.1369F, 0.1355F, -0.7761F));

		PartDefinition cube_r282 = Head.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(65, 88).addBox(-0.85F, -0.15F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.35F, -0.1631F, -3.5878F, 0.193F, 0.2383F, -0.7559F));

		PartDefinition cube_r283 = Head.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(45, 87).addBox(-0.5F, -0.0872F, 0.3848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0731F, -4.4428F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r284 = Head.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(40, 87).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.4831F, -2.6638F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r285 = Head.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(81, 82).addBox(-0.5F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5371F, -1.9641F, 0.1484F, 0.0F, 0.0F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4778F, 0.6821F, -2.5824F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(35, 87).addBox(-0.7F, -0.65F, -1.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(87, 25).addBox(-0.7F, -0.65F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 87).addBox(-0.7F, -0.65F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6336F, 0.1342F, -2.8871F, 0.0979F, 0.2176F, 0.012F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(70, 53).addBox(-0.7F, -0.65F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.096F, 0.096F, 0.0F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(44, 84).addBox(-0.5F, -0.5707F, -0.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6798F, -0.0545F, -1.5808F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 71).addBox(-0.75F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.4935F, -0.3421F, -1.5553F, 0.1423F, 0.0338F, 0.5771F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(60, 71).addBox(-0.75F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3911F, -0.3604F, -1.274F, 0.1608F, 0.3169F, 0.303F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(39, 84).addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(25, 84).addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(-0.544F, -0.1246F, -0.9631F, 0.0611F, 0.3491F, 0.0F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(82, 7).addBox(-0.725F, -0.4422F, -1.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(82, 4).addBox(-0.725F, -0.4422F, -1.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(15, 83).addBox(-0.825F, -0.5422F, -0.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0472F, 0.0F, 0.0035F, -0.0262F, 0.3491F, 0.0F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(60, 88).addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.2519F, -0.8808F, -0.3274F, 1.3837F, 0.2963F, -1.4269F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(88, 48).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9956F, -0.9349F, 0.0385F, 1.0034F, 0.2682F, -1.3847F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(87, 78).addBox(-0.7F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(87, 64).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5578F, -1.0247F, 0.0528F, 0.1041F, 0.135F, -1.2997F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(75, 88).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9848F, -0.4718F, -1.6455F, 0.1988F, 0.1278F, -0.6295F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(75, 88).addBox(-0.55F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 55).addBox(-0.675F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7582F, -0.7746F, -0.6307F, 0.1439F, 0.4737F, -0.5801F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(88, 45).addBox(-0.7F, -0.625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2539F, -0.7716F, 0.1129F, -0.1978F, 0.0785F, -0.8645F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(87, 58).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2539F, -0.7716F, 0.1129F, 0.1513F, 0.0785F, -0.8645F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(30, 88).addBox(-0.4F, -0.35F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3457F, -0.4405F, 0.2611F, -0.3203F, 0.0596F, -0.7435F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(84, 0).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3457F, -0.4405F, 0.2611F, 0.1596F, 0.0596F, -0.7435F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(55, 87).addBox(-0.5F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 49).addBox(-0.5F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.2028F, -0.0099F, 2.7311F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(51, 38).addBox(-0.8114F, -0.985F, -0.2121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6778F, -0.5341F, 1.8852F, 0.291F, 0.5749F, -0.9826F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(83, 46).addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2778F, -0.4931F, 1.7275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 55).addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2778F, -0.8204F, 2.0798F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(87, 52).addBox(-0.5F, -0.375F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2778F, -0.4931F, 1.7275F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(39, 70).addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2778F, -0.4931F, 1.7275F, -0.3465F, -0.0157F, -0.05F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(32, 70).addBox(-0.5F, -0.575F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2778F, -0.1071F, 0.7574F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(20, 83).addBox(-0.5F, -0.4423F, -0.4516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.6798F, -0.0545F, -1.5808F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition cube_r310 = bone3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -0.65F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 83).addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.279F, 0.467F, -0.7028F, -0.1551F, 0.3016F, -0.4049F));

		PartDefinition cube_r311 = bone3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 83).addBox(-0.525F, -0.575F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.4368F, 0.4041F, -1.1737F, -0.2424F, 0.3016F, -0.4049F));

		PartDefinition cube_r312 = bone3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(52, 77).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6712F, 0.2566F, -1.7998F, -0.0167F, -0.0007F, -0.4549F));

		PartDefinition cube_r313 = bone3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(47, 77).addBox(-0.55F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7957F, 0.0577F, -2.3506F, -0.0517F, 0.0809F, -0.5693F));

		PartDefinition cube_r314 = bone3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(79, 0).addBox(-0.825F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.93F, 0.0808F, -3.8446F, -0.9517F, 0.5239F, -1.2218F));

		PartDefinition cube_r315 = bone3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(62, 77).addBox(-0.6F, -0.95F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.825F, 0.1686F, -3.2519F, -0.3817F, 0.2766F, -0.7754F));

		PartDefinition cube_r316 = bone3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(42, 77).addBox(-0.55F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.815F, 0.0808F, -2.6501F, -0.3077F, 0.0843F, -0.4994F));

		PartDefinition cube_r317 = bone3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(25, 70).addBox(-0.7F, -0.5F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -1.5F, 0.0F, 0.096F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone7 = Head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4778F, 0.6821F, -2.5824F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r318 = bone7.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-0.3F, -0.65F, -1.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(87, 25).mirror().addBox(-0.3F, -0.65F, -1.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(25, 87).mirror().addBox(-0.3F, -0.65F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6336F, 0.1342F, -2.8871F, 0.0979F, -0.2176F, -0.012F));

		PartDefinition cube_r319 = bone7.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(70, 53).mirror().addBox(-0.3F, -0.65F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, -1.5F, 0.096F, -0.096F, 0.0F));

		PartDefinition cube_r320 = bone7.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(44, 84).mirror().addBox(-0.5F, -0.5707F, -0.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6798F, -0.0545F, -1.5808F, 0.1745F, -0.2182F, 0.0F));

		PartDefinition cube_r321 = bone7.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(67, 71).mirror().addBox(-0.25F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.4935F, -0.3421F, -1.5553F, 0.1423F, -0.0338F, -0.5771F));

		PartDefinition cube_r322 = bone7.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-0.25F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3911F, -0.3604F, -1.274F, 0.1608F, -0.3169F, -0.303F));

		PartDefinition cube_r323 = bone7.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(39, 84).mirror().addBox(-0.5F, -0.5F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(25, 84).mirror().addBox(-0.5F, -0.5F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(0.544F, -0.1246F, -0.9631F, 0.0611F, -0.3491F, 0.0F));

		PartDefinition cube_r324 = bone7.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(-0.275F, -0.4422F, -1.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(82, 4).mirror().addBox(-0.275F, -0.4422F, -1.3665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(15, 83).mirror().addBox(-0.175F, -0.5422F, -0.7665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0472F, 0.0F, 0.0035F, -0.0262F, -0.3491F, 0.0F));

		PartDefinition cube_r325 = bone7.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.5F, -0.6F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.2519F, -0.8808F, -0.3274F, 1.3837F, -0.2963F, 1.4269F));

		PartDefinition cube_r326 = bone7.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(88, 48).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9956F, -0.9349F, 0.0385F, 1.0034F, -0.2682F, 1.3847F));

		PartDefinition cube_r327 = bone7.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(87, 78).mirror().addBox(-0.3F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(87, 64).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5578F, -1.0247F, 0.0528F, 0.1041F, -0.135F, 1.2997F));

		PartDefinition cube_r328 = bone7.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9848F, -0.4718F, -1.6455F, 0.1988F, -0.1278F, 0.6295F));

		PartDefinition cube_r329 = bone7.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(75, 88).mirror().addBox(-0.45F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(82, 55).mirror().addBox(-0.325F, -0.325F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7582F, -0.7746F, -0.6307F, 0.1439F, -0.4737F, 0.5801F));

		PartDefinition cube_r330 = bone7.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(88, 45).mirror().addBox(-0.3F, -0.625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2539F, -0.7716F, 0.1129F, -0.1978F, -0.0785F, 0.8645F));

		PartDefinition cube_r331 = bone7.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2539F, -0.7716F, 0.1129F, 0.1513F, -0.0785F, 0.8645F));

		PartDefinition cube_r332 = bone7.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.6F, -0.35F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3457F, -0.4405F, 0.2611F, -0.3203F, -0.0596F, 0.7435F));

		PartDefinition cube_r333 = bone7.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.3457F, -0.4405F, 0.2611F, 0.1596F, -0.0596F, 0.7435F));

		PartDefinition cube_r334 = bone7.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-0.5F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(83, 49).mirror().addBox(-0.5F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.0099F, 2.7311F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r335 = bone7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(51, 38).mirror().addBox(-0.1886F, -0.985F, -0.2121F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6778F, -0.5341F, 1.8852F, 0.291F, -0.5749F, 0.9826F));

		PartDefinition cube_r336 = bone7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2778F, -0.4931F, 1.7275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r337 = bone7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-0.5F, -0.15F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2778F, -0.8204F, 2.0798F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r338 = bone7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(87, 52).mirror().addBox(-0.5F, -0.375F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2778F, -0.4931F, 1.7275F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r339 = bone7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(39, 70).mirror().addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2778F, -0.4931F, 1.7275F, -0.3465F, 0.0157F, 0.05F));

		PartDefinition cube_r340 = bone7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-0.5F, -0.575F, -0.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2778F, -0.1071F, 0.7574F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r341 = bone7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(20, 83).mirror().addBox(-0.5F, -0.4423F, -0.4516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.6798F, -0.0545F, -1.5808F, -0.1745F, -0.2182F, 0.0F));

		PartDefinition cube_r342 = bone7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5F, -0.65F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 83).mirror().addBox(-0.5F, -0.65F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.279F, 0.467F, -0.7028F, -0.1551F, -0.3016F, 0.4049F));

		PartDefinition cube_r343 = bone7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.475F, -0.575F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.4368F, 0.4041F, -1.1737F, -0.2424F, -0.3016F, 0.4049F));

		PartDefinition cube_r344 = bone7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(52, 77).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6712F, 0.2566F, -1.7998F, -0.0167F, 0.0007F, 0.4549F));

		PartDefinition cube_r345 = bone7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.45F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7957F, 0.0577F, -2.3506F, -0.0517F, -0.0809F, 0.5693F));

		PartDefinition cube_r346 = bone7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(79, 0).mirror().addBox(-0.175F, -0.9F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.93F, 0.0808F, -3.8446F, -0.9517F, -0.5239F, 1.2218F));

		PartDefinition cube_r347 = bone7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(62, 77).mirror().addBox(-0.4F, -0.95F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.825F, 0.1686F, -3.2519F, -0.3817F, -0.2766F, 0.7754F));

		PartDefinition cube_r348 = bone7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(42, 77).mirror().addBox(-0.45F, -1.0F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.815F, 0.0808F, -2.6501F, -0.3077F, -0.0843F, 0.4994F));

		PartDefinition cube_r349 = bone7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(-0.3F, -0.5F, -1.675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, -1.5F, 0.0F, -0.096F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.6778F, -0.5341F, 1.8852F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2581F, 0.0515F, 0.7505F, 0.0F, 0.0F));

		PartDefinition cube_r350 = Lowerjaw.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(-0.143F, -0.2527F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, -0.0262F, -0.0873F, 0.0F));

		PartDefinition cube_r351 = Lowerjaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-0.2279F, -0.6375F, -1.2769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.1396F, -0.5323F, 0.0F));

		PartDefinition cube_r352 = Lowerjaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(81, 70).mirror().addBox(-0.2279F, -0.5484F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.0524F, -0.5323F, 0.0F));

		PartDefinition cube_r353 = Lowerjaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(74, 85).mirror().addBox(-0.3148F, -0.4189F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.0733F, -0.2406F, -0.1035F));

		PartDefinition cube_r354 = Lowerjaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.3011F, -0.4582F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(69, 85).mirror().addBox(-0.3011F, -0.4582F, -0.6999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.1242F, -0.2499F, -0.0522F));

		PartDefinition cube_r355 = Lowerjaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(34, 82).mirror().addBox(-0.0819F, -1.1533F, -3.9064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, 0.1852F, -0.0483F, -0.3463F));

		PartDefinition cube_r356 = Lowerjaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(-0.1644F, -0.7177F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.2933F, -0.4616F, -0.4378F));

		PartDefinition cube_r357 = Lowerjaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(85, 33).mirror().addBox(-0.2139F, -0.701F, -1.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.2648F, -0.5181F, -0.4428F));

		PartDefinition cube_r358 = Lowerjaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(85, 30).mirror().addBox(-0.2832F, -0.6869F, -0.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.2648F, -0.5181F, -0.4428F));

		PartDefinition cube_r359 = Lowerjaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.3473F, -0.6688F, -1.0756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.1921F, -0.2173F, -0.5061F));

		PartDefinition cube_r360 = Lowerjaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(57, 77).mirror().addBox(-0.475F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.4033F, 0.3761F, -5.1629F, 0.1325F, -0.2018F, -0.639F));

		PartDefinition cube_r361 = Lowerjaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(77, 66).mirror().addBox(-0.4F, -0.925F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.164F, 0.3214F, -6.2309F, 0.8401F, -0.3789F, -0.923F));

		PartDefinition cube_r362 = Lowerjaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(77, 52).mirror().addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.342F, 0.2598F, -5.6612F, 0.2616F, -0.185F, -0.6356F));

		PartDefinition cube_r363 = Lowerjaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(85, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-0.1506F, 0.4598F, -6.0053F, -0.1623F, -0.2406F, -0.1035F));

		PartDefinition cube_r364 = Lowerjaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(53, 71).mirror().addBox(-0.3148F, -0.348F, -2.1033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.0122F, -0.2406F, -0.1035F));

		PartDefinition cube_r365 = Lowerjaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-0.3011F, -0.3575F, -0.5888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(82, 27).mirror().addBox(-0.3011F, -0.3575F, -0.7138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.8141F, 0.3763F, -4.1276F, 0.0195F, -0.2499F, -0.0522F));

		PartDefinition cube_r366 = Lowerjaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(85, 22).mirror().addBox(-0.225F, -0.3569F, -1.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.0046F, -0.5321F, -0.0122F));

		PartDefinition cube_r367 = Lowerjaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(-0.225F, -0.3144F, -1.2661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, -0.0303F, -0.5321F, -0.0122F));

		PartDefinition cube_r368 = Lowerjaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(80, 88).mirror().addBox(-0.125F, -0.4488F, -0.7788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.0133F, -0.5321F, -0.0122F));

		PartDefinition cube_r369 = Lowerjaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(59, 84).mirror().addBox(-0.125F, -0.5169F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.5641F, 0.3763F, -2.9776F, 0.1267F, -0.5321F, -0.0122F));

		PartDefinition cube_r370 = Lowerjaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(46, 71).mirror().addBox(-0.143F, -1.0369F, -3.8976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, 0.1745F, -0.0873F, 0.0F));

		PartDefinition cube_r371 = Lowerjaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(71, 31).mirror().addBox(-0.143F, -0.3246F, -4.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r372 = Lowerjaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(82, 16).mirror().addBox(-0.143F, -1.7973F, -2.9409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, 0.4363F, -0.0873F, 0.0F));

		PartDefinition cube_r373 = Lowerjaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.143F, -0.3249F, -2.8678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.857F, 0.2541F, 0.7402F, -0.1571F, -0.0873F, 0.0F));

		PartDefinition cube_r374 = Lowerjaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(20, 62).addBox(-0.857F, -0.2527F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, -0.0262F, 0.0873F, 0.0F));

		PartDefinition cube_r375 = Lowerjaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(81, 73).addBox(-0.7721F, -0.6375F, -1.2769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.1396F, 0.5323F, 0.0F));

		PartDefinition cube_r376 = Lowerjaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(81, 70).addBox(-0.7721F, -0.5484F, -1.6812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.0524F, 0.5323F, 0.0F));

		PartDefinition cube_r377 = Lowerjaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(74, 85).addBox(-0.6852F, -0.4189F, -1.0907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.0733F, 0.2406F, 0.1035F));

		PartDefinition cube_r378 = Lowerjaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(0, 89).addBox(-0.6989F, -0.4582F, -0.5749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(69, 85).addBox(-0.6989F, -0.4582F, -0.6999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.1242F, 0.2499F, 0.0522F));

		PartDefinition cube_r379 = Lowerjaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(34, 82).addBox(-0.9181F, -1.1533F, -3.9064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, 0.1852F, 0.0483F, 0.3463F));

		PartDefinition cube_r380 = Lowerjaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(64, 85).addBox(-0.8356F, -0.7177F, -0.8227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.2933F, 0.4616F, 0.4378F));

		PartDefinition cube_r381 = Lowerjaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(85, 33).addBox(-0.7861F, -0.701F, -1.3455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.2648F, 0.5181F, 0.4428F));

		PartDefinition cube_r382 = Lowerjaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(85, 30).addBox(-0.7168F, -0.6869F, -0.4733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.2648F, 0.5181F, 0.4428F));

		PartDefinition cube_r383 = Lowerjaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(30, 85).addBox(-0.6527F, -0.6688F, -1.0756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.1921F, 0.2173F, 0.5061F));

		PartDefinition cube_r384 = Lowerjaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(57, 77).addBox(-0.525F, -1.025F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.4033F, 0.3761F, -5.1629F, 0.1325F, 0.2018F, 0.639F));

		PartDefinition cube_r385 = Lowerjaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(77, 66).addBox(-0.6F, -0.925F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.164F, 0.3214F, -6.2309F, 0.8401F, 0.3789F, 0.923F));

		PartDefinition cube_r386 = Lowerjaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(77, 52).addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.342F, 0.2598F, -5.6612F, 0.2616F, 0.185F, 0.6356F));

		PartDefinition cube_r387 = Lowerjaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(85, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(0.1506F, 0.4598F, -6.0053F, -0.1623F, 0.2406F, 0.1035F));

		PartDefinition cube_r388 = Lowerjaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(53, 71).addBox(-0.6852F, -0.348F, -2.1033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.0122F, 0.2406F, 0.1035F));

		PartDefinition cube_r389 = Lowerjaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(82, 58).addBox(-0.6989F, -0.3575F, -0.5888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(82, 27).addBox(-0.6989F, -0.3575F, -0.7138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.8141F, 0.3763F, -4.1276F, 0.0195F, 0.2499F, 0.0522F));

		PartDefinition cube_r390 = Lowerjaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(85, 22).addBox(-0.775F, -0.3569F, -1.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.0046F, 0.5321F, 0.0122F));

		PartDefinition cube_r391 = Lowerjaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(85, 19).addBox(-0.775F, -0.3144F, -1.2661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, -0.0303F, 0.5321F, 0.0122F));

		PartDefinition cube_r392 = Lowerjaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(80, 88).addBox(-0.875F, -0.4488F, -0.7788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.0133F, 0.5321F, 0.0122F));

		PartDefinition cube_r393 = Lowerjaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(59, 84).addBox(-0.875F, -0.5169F, -0.8144F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.5641F, 0.3763F, -2.9776F, 0.1267F, 0.5321F, 0.0122F));

		PartDefinition cube_r394 = Lowerjaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(46, 71).addBox(-0.857F, -1.0369F, -3.8976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, 0.1745F, 0.0873F, 0.0F));

		PartDefinition cube_r395 = Lowerjaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(71, 31).addBox(-0.857F, -0.3246F, -4.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r396 = Lowerjaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(82, 16).addBox(-0.857F, -1.7973F, -2.9409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, 0.4363F, 0.0873F, 0.0F));

		PartDefinition cube_r397 = Lowerjaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 62).addBox(-0.857F, -0.3249F, -2.8678F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.857F, 0.2541F, 0.7402F, -0.1571F, 0.0873F, 0.0F));

		return LayerDefinition.create(meshdefinition, 98, 98);
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