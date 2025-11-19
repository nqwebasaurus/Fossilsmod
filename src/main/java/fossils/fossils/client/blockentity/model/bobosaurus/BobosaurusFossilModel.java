package fossils.fossils.client.blockentity.model.bobosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BobosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart bone;
	private final ModelPart bone11;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart Lowerjaw;

	public BobosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone12 = this.Hips.getChild("bone12");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.bone = this.chest.getChild("bone");
		this.bone11 = this.chest.getChild("bone11");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Head = this.Neck3.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone7 = this.Head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone7.getChild("bone9");
		this.bone10 = this.bone7.getChild("bone10");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.5681F, 11.0989F, -0.3144F, 0.1017F, 0.0699F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(41, 73).addBox(0.0F, -4.1411F, 0.0492F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7247F, 1.8709F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-1.1977F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.1855F, 0.353F, -0.2369F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-2.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.0133F, 0.3895F, -0.7041F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(-1.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, 0.1359F, 0.3922F, -0.272F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(75, 47).mirror().addBox(-2.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, -0.0506F, 0.4034F, -0.7459F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 75).addBox(-0.8023F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.1855F, -0.353F, 0.2369F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(91, 28).addBox(1.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.0133F, -0.3895F, 0.7041F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 33).addBox(0.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, 0.1359F, -0.3922F, 0.272F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 47).addBox(0.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, -0.0506F, -0.4034F, 0.7459F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(64, 72).addBox(0.0F, -4.1411F, 1.9492F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, -2.0F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 43).addBox(0.0F, -0.4F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9921F, 2.2323F, 0.4982F, 0.4128F, -0.3705F, 0.2592F));

		PartDefinition cube_r12 = BackFlipperR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 41).addBox(3.15F, 0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = BackFlipperR2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 72).addBox(-0.95F, 0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r14 = BackFlipperR2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 70).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r15 = BackFlipperR2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 76).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1703F, 0.0189F, 0.4009F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r16 = BackFlipperR2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 58).addBox(0.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.9234F, 0.0F));

		PartDefinition cube_r17 = BackFlipperR2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 89).addBox(-0.4F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.74F, 0.0189F, 0.9734F, 0.0F, 1.6144F, 0.0F));

		PartDefinition cube_r18 = BackFlipperR2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 89).addBox(-0.9F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.7029F, 0.0189F, 0.4426F, 0.0F, 0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1244F, 0.0189F, 1.2638F, 0.1793F, -0.5872F, -0.3161F));

		PartDefinition cube_r19 = BackFlipperMiddleR2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(79, 21).addBox(-0.7652F, -0.2264F, 0.4792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.1133F, -0.2736F, -0.759F, -0.0362F, 1.0082F, -0.3194F));

		PartDefinition cube_r20 = BackFlipperMiddleR2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 73).addBox(0.2091F, -0.2264F, 0.256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(4.1133F, -0.2736F, -0.759F, -2.763F, 1.5185F, -3.0523F));

		PartDefinition cube_r21 = BackFlipperMiddleR2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(72, 80).addBox(0.1882F, -0.2264F, -0.2846F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.1133F, -0.2736F, -0.759F, -0.0302F, 0.8774F, -0.312F));

		PartDefinition cube_r22 = BackFlipperMiddleR2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0914F, 0.0F, 0.4035F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r23 = BackFlipperMiddleR2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 70).addBox(1.65F, -0.5F, -1.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1657F, 0.0F, 0.5739F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r24 = BackFlipperMiddleR2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(51, 16).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8407F, 0.0F, 0.5489F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r25 = BackFlipperMiddleR2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 73).addBox(-1.2F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9407F, 0.0F, -0.6261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r26 = BackFlipperMiddleR2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 54).addBox(-0.7F, -0.5F, -0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.9407F, 0.0F, -0.6261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r27 = BackFlipperMiddleR2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 31).addBox(1.2985F, 0.1155F, -1.5098F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1133F, -0.2736F, -0.759F, -0.0093F, -0.0828F, -0.2886F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.3407F, 0.0F, -0.9261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r28 = BackFlipperEndR2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 5).addBox(4.8846F, 0.1306F, -1.827F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2275F, -0.2736F, 0.1671F, -0.0469F, -0.1404F, -0.2793F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.9921F, 2.2323F, 0.4982F, 0.4279F, 0.3527F, -0.2166F));

		PartDefinition cube_r29 = BackFlipperR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(92, 44).addBox(-4.15F, 0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r30 = BackFlipperR3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 73).addBox(-1.05F, 0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r31 = BackFlipperR3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(45, 87).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r32 = BackFlipperR3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(5, 89).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.1703F, 0.0189F, 0.4009F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r33 = BackFlipperR3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 59).addBox(-4.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.9234F, 0.0F));

		PartDefinition cube_r34 = BackFlipperR3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(90, 15).addBox(-0.6F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.74F, 0.0189F, 0.9734F, 0.0F, -1.6144F, 0.0F));

		PartDefinition cube_r35 = BackFlipperR3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(15, 90).addBox(-0.1F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-4.7029F, 0.0189F, 0.4426F, 0.0F, -0.829F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1244F, 0.0189F, 1.2638F, 0.0911F, 0.6049F, 0.1594F));

		PartDefinition cube_r36 = BackFlipperMiddleR3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(25, 79).addBox(-0.1571F, -0.1991F, 0.4117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.2073F, -0.3009F, -0.8008F, 0.0777F, -1.0781F, 0.114F));

		PartDefinition cube_r37 = BackFlipperMiddleR3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(5, 80).addBox(-1.1842F, -0.1991F, 0.1561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-4.2073F, -0.3009F, -0.8008F, 2.8424F, -1.4459F, -2.6621F));

		PartDefinition cube_r38 = BackFlipperMiddleR3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(77, 80).addBox(-1.1024F, -0.1991F, -0.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.2073F, -0.3009F, -0.8008F, 0.0629F, -0.9475F, 0.1314F));

		PartDefinition cube_r39 = BackFlipperMiddleR3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(47, 60).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0914F, 0.0F, 0.4035F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r40 = BackFlipperMiddleR3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 80).addBox(-2.65F, -0.5F, -1.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1657F, 0.0F, 0.5739F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r41 = BackFlipperMiddleR3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(51, 19).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8407F, 0.0F, 0.5489F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r42 = BackFlipperMiddleR3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 47).addBox(0.2F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9407F, 0.0F, -0.6261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r43 = BackFlipperMiddleR3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 57).addBox(-3.3F, -0.5F, -0.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9407F, 0.0F, -0.6261F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r44 = BackFlipperMiddleR3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(34, 0).addBox(-5.2027F, 0.143F, -1.4724F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2073F, -0.3009F, -0.8008F, 0.0467F, 0.0119F, 0.1844F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.3407F, 0.0F, -0.9261F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r45 = BackFlipperEndR3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(15, 36).addBox(-9.7909F, 0.158F, -1.7845F, 5.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1335F, -0.3009F, 0.1253F, 0.0225F, 0.0664F, 0.1898F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7616F, 3.7406F, -5.0529F, 0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5854F, -1.3927F, 5.6694F, -2.0866F, -0.1035F, -0.3156F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(70, 89).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4381F, -1.6841F, 6.1466F, -1.1267F, -0.1035F, -0.3156F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(62, 54).addBox(-0.495F, -0.3099F, -1.8245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0151F, -3.0683F, 5.8328F, 1.6222F, -0.1035F, -0.3156F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(87, 50).addBox(-0.55F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6513F, -1.2415F, 7.2358F, 0.2773F, -0.5497F, -0.1476F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(82, 47).addBox(-0.4F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.8366F, -0.8628F, 5.6585F, 0.2436F, -0.2544F, -0.0625F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(64, 24).addBox(-0.45F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8366F, -1.1663F, 6.9226F, 0.2376F, 0.1273F, 0.0307F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(82, 44).addBox(-0.225F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7958F, -0.9062F, 5.8392F, 0.3037F, 0.6752F, 0.1934F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(82, 7).addBox(-1.275F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7958F, -0.9062F, 5.8392F, 0.2376F, -0.1273F, -0.0307F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(7, 73).addBox(-2.1729F, -0.3573F, 0.1854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.3712F, 0.2391F, 0.1697F, 0.0411F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(88, 22).addBox(-0.875F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(50, 87).addBox(-0.875F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0148F, -0.5652F, 4.5234F, 0.2925F, -0.8074F, -0.2142F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(57, 72).addBox(-2.1086F, -0.99F, 0.4413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.522F, 0.2757F, 2.848F, 0.2024F, 0.1283F, 0.0262F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(83, 10).addBox(-0.475F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0669F, -0.5933F, 4.6614F, 0.2015F, 0.0855F, 0.0174F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(84, 83).addBox(-0.5F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0957F, -0.5301F, 4.3507F, 1.0962F, 1.3447F, 1.0856F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.9146F, -0.5382F, 4.3905F, 0.256F, 0.6645F, 0.1601F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(59, 44).addBox(-1.3F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.5327F, -0.3026F, 3.2326F, 0.403F, 1.0376F, 0.3519F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(59, 40).addBox(-2.1803F, -0.99F, 0.0727F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.1282F, 0.4999F, 1.7459F, 0.2076F, 0.2564F, 0.0534F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(89, 38).addBox(-0.275F, -0.5F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1153F, -0.3807F, 3.6164F, 0.2693F, -0.7235F, -0.1807F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(9, 52).addBox(-0.7F, -0.5F, -1.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1153F, -0.3807F, 3.6164F, 0.3225F, -0.8906F, -0.2542F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(0, 52).addBox(-1.35F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1153F, -0.3807F, 3.6164F, 0.2596F, -0.6814F, -0.1658F));

		PartDefinition bone12 = Hips.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7616F, 3.7406F, -5.0529F, 0.1309F, 0.0F, 0.0F));

		PartDefinition basin_r20 = bone12.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5854F, -1.3927F, 5.6694F, -2.0866F, 0.1035F, 0.3156F));

		PartDefinition basin_r21 = bone12.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4381F, -1.6841F, 6.1466F, -1.1267F, 0.1035F, 0.3156F));

		PartDefinition basin_r22 = bone12.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(62, 54).mirror().addBox(-0.505F, -0.3099F, -1.8245F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0151F, -3.0683F, 5.8328F, 1.6222F, 0.1035F, 0.3156F));

		PartDefinition basin_r23 = bone12.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(87, 50).mirror().addBox(-0.45F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6513F, -1.2415F, 7.2358F, 0.2773F, 0.5497F, 0.1476F));

		PartDefinition basin_r24 = bone12.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(82, 47).mirror().addBox(-0.6F, -0.5F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.8366F, -0.8628F, 5.6585F, 0.2436F, 0.2544F, 0.0625F));

		PartDefinition basin_r25 = bone12.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(64, 24).mirror().addBox(-0.55F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.8366F, -1.1663F, 6.9226F, 0.2376F, -0.1273F, -0.0307F));

		PartDefinition basin_r26 = bone12.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(82, 44).mirror().addBox(-0.775F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7958F, -0.9062F, 5.8392F, 0.3037F, -0.6752F, -0.1934F));

		PartDefinition basin_r27 = bone12.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(82, 7).mirror().addBox(0.275F, -0.5F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7958F, -0.9062F, 5.8392F, 0.2376F, 0.1273F, 0.0307F));

		PartDefinition basin_r28 = bone12.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(0.1729F, -0.3573F, 0.1854F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.3712F, 0.2391F, -0.1697F, -0.0411F));

		PartDefinition basin_r29 = bone12.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(88, 22).mirror().addBox(-0.125F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(50, 87).mirror().addBox(-0.125F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0148F, -0.5652F, 4.5234F, 0.2925F, 0.8074F, 0.2142F));

		PartDefinition basin_r30 = bone12.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(0.1086F, -0.99F, 0.4413F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.522F, 0.2757F, 2.848F, 0.2024F, -0.1283F, -0.0262F));

		PartDefinition basin_r31 = bone12.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-0.525F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0669F, -0.5933F, 4.6614F, 0.2015F, -0.0855F, -0.0174F));

		PartDefinition basin_r32 = bone12.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(84, 83).mirror().addBox(-0.5F, -0.5F, -1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0957F, -0.5301F, 4.3507F, 1.0962F, -1.3447F, -1.0856F));

		PartDefinition basin_r33 = bone12.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-1.5F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.9146F, -0.5382F, 4.3905F, 0.256F, -0.6645F, -0.1601F));

		PartDefinition basin_r34 = bone12.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(59, 44).mirror().addBox(-0.7F, -0.5F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.5327F, -0.3026F, 3.2326F, 0.403F, -1.0376F, -0.3519F));

		PartDefinition basin_r35 = bone12.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(59, 40).mirror().addBox(0.1803F, -0.99F, 0.0727F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.1282F, 0.4999F, 1.7459F, 0.2076F, -0.2564F, -0.0534F));

		PartDefinition basin_r36 = bone12.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(89, 38).mirror().addBox(-0.725F, -0.5F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1153F, -0.3807F, 3.6164F, 0.2693F, 0.7235F, 0.1807F));

		PartDefinition basin_r37 = bone12.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(9, 52).mirror().addBox(-0.3F, -0.5F, -1.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1153F, -0.3807F, 3.6164F, 0.3225F, 0.8906F, 0.2542F));

		PartDefinition basin_r38 = bone12.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(0.35F, -0.5F, -1.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1153F, -0.3807F, 3.6164F, 0.2596F, 0.6814F, 0.1658F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(48, 48).addBox(-0.5F, -0.2606F, -0.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.625F, 3.0F, 0.0349F, -0.0436F, -0.0015F));

		PartDefinition cube_r46 = Tail1.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 92).addBox(0.0F, -2.1F, -2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 62).addBox(0.0F, -1.3F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4668F, 3.3669F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 75).addBox(0.0F, -3.5238F, -0.0262F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.107F, 2.9749F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(22, 79).addBox(0.0F, -3.7488F, -0.0261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2117F, 0.9777F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(51, 12).mirror().addBox(-1.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2394F, 0.9515F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r50 = Tail1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 12).addBox(-0.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2394F, 0.9515F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.9509F, 0.0452F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, -0.0213F, -0.13F, 0.0462F));

		PartDefinition cube_r51 = Tail2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 22).addBox(0.0F, -3.1404F, 0.0531F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.721F, 4.9897F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 75).addBox(0.0F, -3.2904F, -0.2469F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7803F, 3.2907F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(93, 12).addBox(0.0F, 1.2F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 9).addBox(0.0F, 0.9F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 92).addBox(0.0F, -0.4F, 3.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7785F, -2.5107F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(75, 58).addBox(0.0F, -3.3654F, 0.0531F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 9).mirror().addBox(-1.7F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r56 = Tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(36, 9).addBox(-0.3F, 0.4096F, 0.0531F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3649F, 5.992F, 0.0406F, 0.3434F, 0.1446F));

		PartDefinition cube_r57 = Tail3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(68, 92).addBox(0.0F, -2.0154F, -0.0469F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5429F, 5.1079F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r58 = Tail3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(15, 83).addBox(0.0F, -2.5154F, -0.0469F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4128F, 3.1021F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Tail3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(44, 49).addBox(0.0F, -2.9154F, -0.0469F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2828F, 1.0964F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Tail3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 80).addBox(0.0F, 2.2F, 13.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 63).addBox(0.0F, 1.8F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 46).addBox(0.0F, 1.5F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -8.5028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Tail3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 40).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1014F, 1.0445F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r62 = Tail3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(13, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1014F, 1.0445F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.9F, -0.0037F, 0.3939F, 0.0829F));

		PartDefinition cube_r63 = Tail4.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 93).addBox(0.0F, -1.0154F, -0.0469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5369F, 4.1113F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Tail4.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 92).addBox(0.0F, -1.6154F, -0.0469F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3069F, 2.102F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Tail4.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 22).addBox(0.0F, 3.0F, 17.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 18).addBox(0.0F, 2.5F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -15.4028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Tail4.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(87, 92).addBox(0.0F, -1.8404F, 0.0531F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3802F, 0.0033F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.6014F, -0.0555F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.1347F, 0.6229F, 0.0404F));

		PartDefinition cube_r67 = Tail5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(21, 93).addBox(0.0F, -1.0154F, 2.0031F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 93).addBox(0.0F, -1.1154F, 0.0031F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2243F, 0.8839F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(32, 36).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, -0.0044F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Bodymiddle.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 71).addBox(0.0F, -4.25F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Bodymiddle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 58).addBox(0.5F, -4.575F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Bodymiddle.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-4.192F, -1.5014F, -0.953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8478F, -0.0118F, -2.6322F, 0.1371F, 0.5011F, -0.6574F));

		PartDefinition cube_r71 = Bodymiddle.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-2.6177F, -0.4352F, -0.9716F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8478F, -0.0118F, -2.6322F, 0.3471F, 0.4019F, -0.184F));

		PartDefinition cube_r72 = Bodymiddle.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(71, 33).mirror().addBox(-4.0176F, -1.5829F, -1.183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.0906F, 0.4686F, -0.6791F));

		PartDefinition cube_r73 = Bodymiddle.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(89, 74).mirror().addBox(-2.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.2914F, 0.3917F, -0.2055F));

		PartDefinition cube_r74 = Bodymiddle.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, 0.3471F, 0.4019F, -0.184F));

		PartDefinition cube_r75 = Bodymiddle.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, 0.1371F, 0.5011F, -0.6574F));

		PartDefinition cube_r76 = Bodymiddle.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 66).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6478F, -0.0118F, -5.0322F, -0.1322F, 0.5023F, -1.2065F));

		PartDefinition cube_r77 = Bodymiddle.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(77, 39).addBox(2.192F, -1.5014F, -0.953F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8478F, -0.0118F, -2.6322F, 0.1371F, -0.5011F, 0.6574F));

		PartDefinition cube_r78 = Bodymiddle.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 68).addBox(0.6177F, -0.4352F, -0.9716F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8478F, -0.0118F, -2.6322F, 0.3471F, -0.4019F, 0.184F));

		PartDefinition cube_r79 = Bodymiddle.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 33).addBox(2.0176F, -1.5829F, -1.183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.0906F, -0.4686F, 0.6791F));

		PartDefinition cube_r80 = Bodymiddle.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(89, 74).addBox(1.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.2914F, -0.3917F, 0.2055F));

		PartDefinition cube_r81 = Bodymiddle.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(75, 66).addBox(0.91F, -0.0899F, -0.4375F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, 0.3471F, -0.4019F, 0.184F));

		PartDefinition cube_r82 = Bodymiddle.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 31).addBox(-2.5F, -2.0F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.4394F, -3.2117F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Bodymiddle.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(75, 64).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, 0.1371F, -0.5011F, 0.6574F));

		PartDefinition cube_r84 = Bodymiddle.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(92, 66).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6478F, -0.0118F, -5.0322F, -0.1322F, -0.5023F, 1.2065F));

		PartDefinition cube_r85 = Bodymiddle.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 70).addBox(0.5F, -4.7F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -4.9F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(38, 15).addBox(-0.5F, -0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(71, 19).addBox(0.5F, -4.85F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 70).addBox(0.5F, -4.925F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.1F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(92, 79).mirror().addBox(-4.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, -0.1534F, 0.4535F, -1.2144F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.0904F, 0.469F, -0.6774F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.5882F, -1.7322F, 0.2913F, 0.3922F, -0.2038F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-2.91F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.3657F, 0.405F, -0.1767F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, 0.1529F, 0.5117F, -0.6497F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-5.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.125F, 0.5186F, -1.203F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(92, 79).addBox(3.474F, -3.2864F, -0.4161F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, -0.1534F, -0.4535F, 1.2144F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(78, 17).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.0904F, -0.469F, 0.6774F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(62, 33).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.5882F, -1.7322F, 0.2913F, -0.3922F, 0.2038F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(9, 57).addBox(-0.09F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.3657F, -0.405F, 0.1767F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(75, 43).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, 0.1529F, -0.5117F, 0.6497F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(75, 41).addBox(3.474F, -3.2864F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.125F, -0.5186F, 1.203F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 21).addBox(-2.5F, -2.0F, 0.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.2249F, -1.1326F, 0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(17, 9).addBox(-2.5F, -1.8F, 0.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.7824F, -4.0871F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.05F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(47, 71).addBox(0.5F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4741F, -1.024F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(35, 73).addBox(0.5F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5043F, -3.0263F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, -0.1324F, 0.5024F, -1.2056F));

		PartDefinition cube_r105 = Bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, 0.137F, 0.5012F, -0.6566F));

		PartDefinition cube_r106 = Bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-2.91F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, 0.347F, 0.4021F, -0.1831F));

		PartDefinition cube_r107 = Bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(59, 52).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, -0.1252F, 0.5187F, -1.2021F));

		PartDefinition cube_r108 = Bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, 0.1528F, 0.5118F, -0.6489F));

		PartDefinition cube_r109 = Bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(69, 3).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, 0.3657F, 0.4052F, -0.1758F));

		PartDefinition cube_r110 = Bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(65, 35).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, -0.1324F, -0.5024F, 1.2056F));

		PartDefinition cube_r111 = Bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 76).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, 0.137F, -0.5012F, 0.6566F));

		PartDefinition cube_r112 = Bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 65).addBox(-0.09F, -0.0899F, -0.4374F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, 0.347F, -0.4021F, 0.1831F));

		PartDefinition cube_r113 = Bodyfront.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(59, 52).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, -0.1252F, -0.5187F, 1.2021F));

		PartDefinition cube_r114 = Bodyfront.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(78, 33).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, 0.1528F, -0.5118F, 0.6489F));

		PartDefinition cube_r115 = Bodyfront.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(69, 3).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, 0.3657F, -0.4052F, 0.1758F));

		PartDefinition cube_r116 = Bodyfront.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(17, 15).addBox(-3.0F, -1.975F, -3.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 7.5488F, 0.871F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r117 = Bodyfront.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(53, 54).addBox(0.0F, -0.6F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(72, 58).addBox(-0.3522F, -4.5227F, -2.0394F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.0821F, -2.9325F, 0.1221F, -0.0053F, 0.0433F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7045F, 0.05F, -1.7F, 0.2914F, 0.3917F, -0.2055F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 19).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7045F, 0.05F, -1.7F, 0.0906F, 0.4686F, -0.6791F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7045F, 0.05F, -1.7F, -0.1529F, 0.4533F, -1.216F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 18).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, -1.7F, -0.1529F, -0.4533F, 1.216F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 57).addBox(0.0F, -0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8522F, 0.2118F, -3.0178F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(19, 21).addBox(-3.0F, -1.975F, -2.9F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.3522F, 7.9857F, -0.2626F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 49).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, -1.7F, 0.2914F, -0.3917F, 0.2055F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(74, 19).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, -1.7F, 0.0906F, -0.4686F, 0.6791F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8522F, 0.1057F, -2.9682F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(60, 28).mirror().addBox(-7.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, -0.1925F, 0.3552F, -1.229F));

		PartDefinition cube_r127 = body3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, 0.0016F, 0.4021F, -0.714F));

		PartDefinition cube_r128 = body3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 17).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, 0.1813F, 0.3692F, -0.2438F));

		PartDefinition cube_r129 = body3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-8.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.2052F, 0.3224F, -1.2323F));

		PartDefinition cube_r130 = body3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.027F, 0.3793F, -0.7241F));

		PartDefinition cube_r131 = body3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, 0.145F, 0.3608F, -0.2559F));

		PartDefinition cube_r132 = body3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(7, 76).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.027F, -0.3793F, 0.7241F));

		PartDefinition cube_r133 = body3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(49, 33).addBox(3.474F, -3.2864F, -0.4161F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.2052F, -0.3224F, 1.2323F));

		PartDefinition cube_r134 = body3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 28).addBox(3.474F, -3.2864F, -0.4161F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, -0.1925F, -0.3552F, 1.229F));

		PartDefinition cube_r135 = body3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(69, 17).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, 0.1813F, -0.3692F, 0.2438F));

		PartDefinition cube_r136 = body3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(78, 62).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, 0.0016F, -0.4021F, 0.714F));

		PartDefinition cube_r137 = body3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 70).addBox(0.5F, -3.8F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4647F, -1.0203F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(19, 79).addBox(0.5F, -3.4F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3949F, -3.0191F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(65, 37).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, 0.145F, -0.3608F, 0.2559F));

		PartDefinition cube_r140 = body3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(48, 42).addBox(0.0F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1256F, -3.901F, 0.0523F, -0.0023F, 0.0436F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(79, 4).addBox(0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4251F, -1.0179F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(-2.454F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, 0.1943F, -2.7318F, 0.3923F, 0.3723F, -0.3003F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-4.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, 0.1943F, -2.7318F, 0.1948F, 0.4937F, -0.7633F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-5.3118F, -2.8347F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, 0.1943F, -2.7318F, -0.0781F, 0.5225F, -1.3133F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-4.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, -0.0266F, 0.3788F, -0.7256F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-6.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, -0.2046F, 0.3221F, -1.2338F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 66).mirror().addBox(-2.91F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, 0.1452F, 0.3602F, -0.2576F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(37, 67).addBox(-0.546F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9522F, 0.1943F, -2.7318F, 0.3923F, -0.3723F, 0.3003F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 0).addBox(2.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9522F, 0.1943F, -2.7318F, 0.1948F, -0.4937F, 0.7633F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(0, 78).addBox(3.3118F, -2.8347F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9522F, 0.1943F, -2.7318F, -0.0781F, -0.5225F, 1.3133F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(76, 11).addBox(2.599F, -1.311F, -0.4161F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, -0.0266F, -0.3788F, 0.7256F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 67).addBox(3.474F, -3.2864F, -0.4161F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, -0.2046F, -0.3221F, 1.2338F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(59, 66).addBox(-0.09F, -0.0899F, -0.4375F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, 0.1452F, -0.3602F, 0.2576F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(76, 5).addBox(0.5F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3553F, -3.0167F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(11, 46).addBox(0.0F, -0.6F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0218F, 3.9987F, -2.8244F, 0.2581F, -0.4269F, 0.8693F));

		PartDefinition cube_r156 = FrontFlipperR3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -0.5F, -1.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.8091F, -0.071F, -0.762F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r157 = FrontFlipperR3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(20, 61).addBox(-1.8F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.0144F, -0.071F, -1.1879F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r158 = FrontFlipperR3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(68, 41).addBox(-1.0F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(8.2388F, -0.071F, -1.0428F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r159 = FrontFlipperR3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(59, 81).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.6424F, -0.071F, -0.8098F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r160 = FrontFlipperR3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 24).addBox(-0.475F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0698F, -0.071F, 0.5738F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r161 = FrontFlipperR3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(83, 76).addBox(-0.2349F, -0.5F, 0.7001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3337F, -0.071F, -0.4351F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r162 = FrontFlipperR3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(83, 13).addBox(-0.0849F, -0.5F, -0.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.3337F, -0.071F, -0.4351F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r163 = FrontFlipperR3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(71, 26).addBox(-2.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2689F, -0.071F, -1.0598F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r164 = FrontFlipperR3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(7, 70).addBox(-1.3F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3771F, -0.071F, -0.5717F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r165 = FrontFlipperR3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 30).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.3771F, -0.071F, -0.5717F, 0.0F, 0.384F, 0.0F));

		PartDefinition cube_r166 = FrontFlipperR3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(53, 22).addBox(-1.575F, -1.0F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1522F, 0.429F, 0.1284F, 0.0F, 0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(8.5601F, -0.071F, -1.2358F, 0.045F, 0.123F, 0.3518F));

		PartDefinition cube_r167 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(30, 79).addBox(-1.925F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7469F, 0.0F, -1.5308F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r168 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(81, 29).addBox(-2.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7469F, 0.0F, -1.5308F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r169 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(42, 28).addBox(-0.6213F, -0.5F, -1.0052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.009F, 0.0F, -0.3376F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r170 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(81, 53).addBox(-0.7F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2784F, 0.0F, 1.2028F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r171 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(30, 82).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0962F, 0.0F, 0.7023F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r172 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(25, 82).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0447F, 0.0F, 0.9104F, 0.0F, -1.309F, 0.0F));

		PartDefinition cube_r173 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(14, 72).addBox(-1.4181F, -0.5F, -0.6855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0155F, 0.0F, 1.1104F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r174 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(83, 56).addBox(0.4034F, -0.5F, -0.4863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.0155F, 0.0F, 1.1104F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r175 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(89, 35).addBox(0.1344F, 0.4941F, 0.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 47).addBox(-0.0656F, 0.4941F, -0.3624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 88).addBox(0.4344F, 0.4941F, -1.1624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2351F, -0.9941F, 0.0311F, 0.0F, -0.0698F, 0.0F));

		PartDefinition cube_r176 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 4).addBox(1.2871F, 1.018F, -1.4174F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2351F, -0.9941F, 0.0311F, 0.0012F, -0.1567F, 0.0077F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3469F, 0.0F, -0.8308F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r177 = FrontFlipperEndR3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 27).addBox(3.1962F, 1.0734F, -1.1985F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1118F, -0.9941F, 0.8619F, -0.0078F, -0.1748F, -0.0005F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0218F, 3.9987F, -2.8244F, 0.3595F, 0.3024F, -0.8061F));

		PartDefinition cube_r178 = FrontFlipperR2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(62, 0).addBox(-2.5F, -0.5F, -1.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-4.8091F, -0.071F, -0.762F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r179 = FrontFlipperR2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(29, 61).addBox(-1.2F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.0144F, -0.071F, -1.1879F, 0.0F, -3.1416F, 0.0F));

		PartDefinition cube_r180 = FrontFlipperR2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 69).addBox(0.0F, -0.5F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-8.2388F, -0.071F, -1.0428F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r181 = FrontFlipperR2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(64, 81).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-7.6424F, -0.071F, -0.8098F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r182 = FrontFlipperR2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(55, 84).addBox(-0.525F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0698F, -0.071F, 0.5738F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r183 = FrontFlipperR2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(50, 84).addBox(-0.7651F, -0.5F, 0.7001F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3337F, -0.071F, -0.4351F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r184 = FrontFlipperR2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(45, 84).addBox(-0.9151F, -0.5F, -0.1499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3337F, -0.071F, -0.4351F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r185 = FrontFlipperR2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(21, 72).addBox(0.0F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2689F, -0.071F, -1.0598F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r186 = FrontFlipperR2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 51).addBox(-0.7F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3771F, -0.071F, -0.5717F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r187 = FrontFlipperR2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(38, 60).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.3771F, -0.071F, -0.5717F, 0.0F, -0.384F, 0.0F));

		PartDefinition cube_r188 = FrontFlipperR2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(53, 25).addBox(-2.425F, -1.0F, -1.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.1522F, 0.429F, 0.1284F, 0.0F, -0.3054F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.5601F, -0.071F, -1.2358F, 0.0396F, -0.1248F, -0.3079F));

		PartDefinition cube_r189 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(79, 35).addBox(0.925F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.7469F, 0.0F, -1.5308F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r190 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(49, 81).addBox(1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7469F, 0.0F, -1.5308F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r191 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(69, 30).addBox(-1.3787F, -0.5F, -1.0052F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.009F, 0.0F, -0.3376F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r192 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(54, 81).addBox(-0.3F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2784F, 0.0F, 1.2028F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r193 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(82, 41).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.0962F, 0.0F, 0.7023F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r194 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 82).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0447F, 0.0F, 0.9104F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r195 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(28, 72).addBox(-0.5819F, -0.5F, -0.6855F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.0155F, 0.0F, 1.1104F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r196 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 84).addBox(-1.4034F, -0.5F, -0.4863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-1.0155F, 0.0F, 1.1104F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r197 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(65, 89).addBox(-1.1344F, 0.4941F, 0.6376F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(92, 50).addBox(-0.9344F, 0.4941F, -0.3624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(88, 59).addBox(-1.4344F, 0.4941F, -1.1624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2351F, -0.9941F, 0.0311F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r198 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(51, 8).addBox(-3.2871F, 1.018F, -1.4174F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2351F, -0.9941F, 0.0311F, 0.0012F, 0.1567F, -0.0077F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.3469F, 0.0F, -0.8308F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r199 = FrontFlipperEndR2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(21, 27).addBox(-10.1962F, 1.0734F, -1.1985F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1118F, -0.9941F, 0.8619F, -0.0078F, 0.1748F, 0.0005F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 8.1037F, -3.4612F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r200 = bone.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(30, 64).addBox(-1.025F, -0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-5.8986F, -3.7252F, -0.8899F, -0.4081F, 0.7426F, -0.2844F));

		PartDefinition cube_r201 = bone.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(88, 56).addBox(-0.01F, -0.9349F, -1.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-6.9886F, -3.0357F, -0.1221F, -0.2995F, -0.1335F, 0.0411F));

		PartDefinition cube_r202 = bone.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(85, 16).addBox(-4.31F, -0.9349F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(33, 49).addBox(-4.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(22, 49).addBox(-4.31F, -0.9349F, 2.7642F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(51, 0).addBox(-1.9F, -0.5F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.9826F, -2.6986F, 2.4678F, -0.664F, 1.0765F, -0.6032F));

		PartDefinition cube_r204 = bone.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(53, 59).addBox(-1.9F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0643F, -2.9426F, 1.6699F, -0.3903F, 0.6944F, -0.2574F));

		PartDefinition cube_r205 = bone.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(89, 68).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0393F, -5.7414F, -0.1759F, -2.1712F, 0.2239F, 0.2467F));

		PartDefinition cube_r206 = bone.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(78, 58).addBox(-0.2592F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0393F, -5.7414F, -0.1759F, -1.2178F, 0.1406F, 0.3013F));

		PartDefinition cube_r207 = bone.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(88, 86).addBox(-0.2592F, 0.0549F, -0.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0393F, -5.7414F, -0.1759F, -1.1415F, 0.2239F, 0.2467F));

		PartDefinition cube_r208 = bone.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(44, 78).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-3.0393F, -5.7414F, -0.1759F, -1.2986F, 0.2239F, 0.2467F));

		PartDefinition cube_r209 = bone.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(78, 76).addBox(0.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4393F, -6.4415F, -0.7759F, 0.0594F, 0.5256F, 0.7416F));

		PartDefinition cube_r210 = bone.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(62, 3).addBox(0.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.4393F, -6.4415F, -0.7759F, 0.4957F, 0.5256F, 0.7416F));

		PartDefinition cube_r211 = bone.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(49, 28).addBox(-1.0F, -0.575F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-4.1069F, -3.2906F, 0.4277F, -0.3473F, -0.2778F, 0.0244F));

		PartDefinition cube_r212 = bone.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(9, 62).addBox(0.675F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(59, 48).addBox(-0.725F, -0.5F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.8297F, -4.0395F, -1.3289F, -0.8745F, -0.8491F, 0.6365F));

		PartDefinition cube_r213 = bone.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(62, 8).addBox(-0.5F, -0.5F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.3712F, -4.3131F, -2.0411F, -1.9987F, -0.9799F, 1.9779F));

		PartDefinition cube_r214 = bone.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(38, 79).addBox(-0.55F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.5469F, -4.3551F, -2.1406F, -0.9576F, -0.9023F, 0.7446F));

		PartDefinition cube_r215 = bone.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 54).addBox(0.05F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.0414F, -4.8582F, -2.9107F, -1.9376F, -0.9968F, 1.9047F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 8.1037F, -3.4612F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r216 = bone11.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(30, 64).mirror().addBox(0.025F, -0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(5.8986F, -3.7252F, -0.8899F, -0.4081F, -0.7426F, 0.2844F));

		PartDefinition cube_r217 = bone11.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-0.99F, -0.9349F, -1.1358F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(6.9886F, -3.0357F, -0.1221F, -0.2995F, 0.1335F, -0.0411F));

		PartDefinition cube_r218 = bone11.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(85, 16).mirror().addBox(3.31F, -0.9349F, 1.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(33, 49).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(22, 49).mirror().addBox(2.31F, -0.9349F, 2.7642F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r219 = bone11.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(51, 0).mirror().addBox(-1.1F, -0.5F, -1.3F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(4.9826F, -2.6986F, 2.4678F, -0.664F, -1.0765F, 0.6032F));

		PartDefinition cube_r220 = bone11.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(53, 59).mirror().addBox(-0.1F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0643F, -2.9426F, 1.6699F, -0.3903F, -0.6944F, 0.2574F));

		PartDefinition cube_r221 = bone11.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7414F, -0.1759F, -2.1712F, -0.2239F, -0.2467F));

		PartDefinition cube_r222 = bone11.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(78, 58).mirror().addBox(-0.7408F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7414F, -0.1759F, -1.2178F, -0.1406F, -0.3013F));

		PartDefinition cube_r223 = bone11.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 86).mirror().addBox(-0.7408F, 0.0549F, -0.6614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7414F, -0.1759F, -1.1415F, -0.2239F, -0.2467F));

		PartDefinition cube_r224 = bone11.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(3.0393F, -5.7414F, -0.1759F, -1.2986F, -0.2239F, -0.2467F));

		PartDefinition cube_r225 = bone11.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-1.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4393F, -6.4415F, -0.7759F, 0.0594F, -0.5256F, -0.7416F));

		PartDefinition cube_r226 = bone11.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(62, 3).mirror().addBox(-1.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.4393F, -6.4415F, -0.7759F, 0.4957F, -0.5256F, -0.7416F));

		PartDefinition cube_r227 = bone11.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 28).mirror().addBox(-1.0F, -0.575F, -1.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(4.1069F, -3.2906F, 0.4277F, -0.3473F, 0.2778F, -0.0244F));

		PartDefinition cube_r228 = bone11.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-1.675F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(59, 48).mirror().addBox(-1.275F, -0.5F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(4.8297F, -4.0395F, -1.3289F, -0.8745F, 0.8491F, -0.6365F));

		PartDefinition cube_r229 = bone11.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(62, 8).mirror().addBox(-0.5F, -0.5F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.3712F, -4.3131F, -2.0411F, -1.9987F, 0.9799F, -1.9779F));

		PartDefinition cube_r230 = bone11.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(38, 79).mirror().addBox(-0.45F, -0.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(6.5469F, -4.3551F, -2.1406F, -0.9576F, 0.9023F, -0.7446F));

		PartDefinition cube_r231 = bone11.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-1.05F, -0.5F, -2.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.0414F, -4.8582F, -2.9107F, -1.9376F, 0.9968F, -1.9047F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(76, 70).addBox(0.5F, -3.9538F, -1.04F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4296F, -3.9864F, -0.3258F, 0.0597F, 0.2098F));

		PartDefinition cube_r232 = neck.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 73).addBox(0.5F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4101F, -3.0251F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r233 = neck.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(75, 45).mirror().addBox(-4.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.2537F, 0.5412F, -0.7341F));

		PartDefinition cube_r234 = neck.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(68, 39).mirror().addBox(-2.454F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.4645F, 0.3921F, -0.2734F));

		PartDefinition cube_r235 = neck.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-1.9393F, -0.0748F, -0.4735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0661F, 0.1985F, -2.5895F, 0.1894F, 0.4937F, -0.6432F));

		PartDefinition cube_r236 = neck.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(20, 59).addBox(-0.0607F, -0.0748F, -0.4735F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9339F, 0.1985F, -2.5895F, 0.1894F, -0.4937F, 0.6432F));

		PartDefinition cube_r237 = neck.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(68, 39).addBox(-0.546F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.4645F, -0.3921F, 0.2734F));

		PartDefinition cube_r238 = neck.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(75, 45).addBox(2.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.2537F, -0.5412F, 0.7341F));

		PartDefinition cube_r239 = neck.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(42, 22).addBox(0.0F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0874F, -4.0727F, -0.1844F, 0.0956F, 0.078F));

		PartDefinition cube_r240 = Neck1.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(18, 85).addBox(0.5F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2663F, -0.9102F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r241 = Neck1.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(65, 84).addBox(0.5F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0226F, -2.8953F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Neck1.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(76, 15).mirror().addBox(-1.6975F, -0.0326F, -0.4397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.4777F, -2.464F, 0.467F, 0.2228F, -0.6746F));

		PartDefinition cube_r243 = Neck1.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(76, 13).mirror().addBox(-1.6975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -0.2639F, 0.4263F, 0.3913F, -0.6739F));

		PartDefinition cube_r244 = Neck1.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(76, 15).addBox(-0.3025F, -0.0326F, -0.4397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.4777F, -2.464F, 0.467F, -0.2228F, 0.6746F));

		PartDefinition cube_r245 = Neck1.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(76, 13).addBox(-0.3025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -0.2639F, 0.4263F, -0.3913F, 0.6739F));

		PartDefinition cube_r246 = Neck1.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(37, 43).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, -0.052F, 0.1714F, 0.0933F));

		PartDefinition cube_r247 = Neck2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(24, 85).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5919F, -0.6087F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r248 = Neck2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(21, 85).addBox(0.0F, -2.65F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.557F, -2.6084F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r249 = Neck2.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 78).mirror().addBox(-1.1975F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1027F, -2.0639F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r250 = Neck2.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(78, 2).mirror().addBox(-1.2975F, -0.0576F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -0.0639F, 0.264F, 0.0979F, -0.6917F));

		PartDefinition cube_r251 = Neck2.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(7, 78).addBox(-0.8025F, -0.1326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1027F, -2.0639F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition cube_r252 = Neck2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(78, 2).addBox(-0.7025F, -0.0576F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -0.0639F, 0.264F, -0.0979F, 0.6917F));

		PartDefinition cube_r253 = Neck2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(45, 36).addBox(0.0F, -0.4F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, 0.1221F, 0.1684F, 0.1805F));

		PartDefinition cube_r254 = Neck3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(27, 85).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Neck3.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 92).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Neck3.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(76, 92).mirror().addBox(-0.7975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r257 = Neck3.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-0.9975F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.042F, -0.6964F));

		PartDefinition cube_r258 = Neck3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(76, 92).addBox(-0.2025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r259 = Neck3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(71, 92).addBox(-0.0025F, -0.1326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.042F, 0.6964F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(18, 54).addBox(-0.5F, -0.85F, -4.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(17, 0).addBox(-0.5F, -0.2787F, -6.6283F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.0F, -0.275F, -3.975F, 0.2096F, 0.1417F, 0.2013F));

		PartDefinition cube_r260 = Head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(86, 27).addBox(-0.5F, -0.5185F, -0.583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.0F, -0.251F, -0.1676F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(30, 68).addBox(-0.5F, -0.15F, -0.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6847F, -1.9284F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 32).addBox(-0.5374F, -0.696F, -1.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(0.0374F, 0.3209F, -8.4195F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(68, 45).addBox(-0.5374F, -0.5371F, -0.8051F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0374F, 0.3209F, -8.4195F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(9, 66).addBox(-0.5374F, -0.231F, -0.2439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0374F, -0.0041F, -7.9945F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.1778F, -0.1615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.1378F, -6.5583F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, -0.1872F, -0.8151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3332F, -5.2783F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(50, 90).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.5831F, -4.6638F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(89, 82).addBox(-0.5F, -0.2F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6371F, -3.9641F, 0.1484F, 0.0F, 0.0F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6272F, 0.6821F, -2.5955F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r269 = bone3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(88, 12).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.899F, -0.2577F, -6.4662F, -0.3668F, 0.1469F, -0.0225F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(23, 68).addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6767F, 0.2315F, -5.039F, -0.1836F, 0.1469F, -0.0225F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(88, 9).addBox(-0.773F, -0.6196F, -3.7426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, -0.0614F, 0.1469F, -0.0225F));

		PartDefinition cube_r272 = bone3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(69, 9).addBox(-1.1443F, -0.8749F, -3.3065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, 0.0263F, 0.0259F, -0.0067F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(89, 19).addBox(-0.8975F, -1.1356F, -2.2638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, 0.1745F, 0.1484F, 0.0F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(84, 38).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9852F, -0.5815F, -4.209F, 0.0412F, -0.1596F, 0.9054F));

		PartDefinition cube_r275 = bone3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(53, 68).addBox(-0.85F, -0.25F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.62F, -0.3936F, -4.0547F, 0.0482F, -0.1577F, 0.8612F));

		PartDefinition cube_r276 = bone3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(68, 66).addBox(-0.375F, -0.25F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.8894F, -0.6722F, -4.5958F, 0.0479F, -0.1054F, 0.8638F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(60, 68).addBox(-0.725F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)), PartPose.offsetAndRotation(-0.4504F, -0.1434F, -4.7287F, 0.0485F, 0.191F, 0.878F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(16, 68).addBox(-0.725F, -0.25F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.4262F, -0.1646F, -4.0544F, 0.0476F, -0.0008F, 0.8688F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(10, 86).addBox(-0.732F, -0.8968F, -1.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(5, 86).addBox(-0.732F, -0.8968F, -1.4485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, 0.0249F, 0.279F, -0.0124F));

		PartDefinition cube_r280 = bone3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(0, 86).addBox(-0.732F, -0.6353F, -1.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(40, 85).addBox(-0.732F, -0.6353F, -1.5066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(55, 90).addBox(-0.832F, -0.7353F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, -0.0624F, 0.279F, -0.0124F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(14, 79).addBox(-0.4954F, -1.6423F, -0.4744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0942F, -1.0275F, -2.0703F, 1.563F, 0.2808F, -1.492F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(90, 30).addBox(-0.4987F, -0.3586F, -0.4693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0942F, -1.0275F, -2.0703F, 1.1779F, 0.1762F, -1.4557F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(91, 53).addBox(-0.7F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(25, 90).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5577F, -1.1747F, -1.6472F, 0.1041F, 0.135F, -1.2997F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(60, 90).addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 90).addBox(-0.525F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7582F, -0.7746F, -2.4307F, 0.3449F, 0.4115F, -0.1086F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(20, 90).addBox(-0.7F, -0.625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2539F, -0.9216F, -1.5871F, -0.1978F, 0.0785F, -0.8645F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(40, 91).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.2539F, -0.9216F, -1.5871F, 0.1513F, 0.0785F, -0.8645F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(35, 91).addBox(-0.6881F, -0.2623F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2457F, -0.8905F, -1.6389F, -0.3203F, 0.0596F, -0.5689F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(10, 92).addBox(-0.488F, -0.7033F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.3156F, -0.2076F, -2.1041F, -0.8935F, 0.3444F, -0.11F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 3).addBox(-0.7131F, -0.2947F, -0.7185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0083F, -0.5473F, -1.592F, -0.2233F, 0.131F, -0.2484F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(92, 6).addBox(-0.7131F, -0.2947F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.0719F, -0.3064F, -1.0628F, 1.0407F, -0.0769F, -0.2404F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(5, 92).addBox(-0.7131F, -0.0947F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-0.0222F, -0.594F, -1.5809F, 1.0424F, 0.0135F, -0.2933F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(0, 92).addBox(-0.7131F, -0.2947F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.0222F, -0.594F, -1.5809F, 0.1698F, 0.0135F, -0.2933F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(30, 91).addBox(-0.6881F, -0.3197F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2457F, -0.8905F, -1.6389F, 0.1596F, 0.0596F, -0.5689F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(87, 79).addBox(-0.5F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 65).addBox(-0.5F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1278F, -0.0099F, 2.7311F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(74, 35).addBox(-0.55F, -1.15F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.8118F, -0.8743F, 2.3477F, 0.2875F, 0.068F, -1.053F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(10, 89).addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2028F, -0.4931F, 1.7275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 88).addBox(-0.5F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(87, 62).addBox(-0.5F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2028F, -0.8204F, 2.0798F, -0.175F, -0.0007F, 0.0114F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(60, 87).addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2028F, -0.4931F, 1.7275F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(69, 5).addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.2028F, -0.4931F, 1.7275F, -0.3465F, -0.0157F, -0.05F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(56, 35).addBox(-0.5F, -0.55F, -2.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2028F, -0.175F, 1.3536F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(55, 87).addBox(-0.8975F, -0.3787F, -2.278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, -0.1745F, 0.1484F, 0.0F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(91, 25).addBox(-0.875F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1843F, 0.1227F, -1.0315F, 0.1231F, -0.0337F, -0.0113F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(90, 89).addBox(-0.875F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1231F, 0.1113F, -1.7288F, -0.0161F, 0.0875F, 0.0037F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(89, 71).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0019F, 0.4584F, -0.5765F, 0.2488F, 0.0768F, -0.3178F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(90, 0).addBox(-0.6875F, -0.4086F, -0.3519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1F, 0.4F, -1.375F, 0.102F, 0.2237F, -0.4073F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(85, 89).addBox(-0.6875F, -0.4086F, -0.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(82, 50).addBox(-0.6875F, -0.3836F, -1.4769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1F, 0.4F, -1.375F, -0.1598F, 0.2237F, -0.4073F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(35, 85).addBox(-0.6875F, -0.2309F, -1.9774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1F, 0.4F, -1.375F, -0.247F, 0.2237F, -0.4073F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(35, 88).addBox(-0.3F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8058F, 0.3107F, -3.4091F, -0.0515F, 0.0511F, -0.5083F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(78, 25).addBox(-0.45F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.7785F, 0.2016F, -3.9985F, -0.119F, -0.1464F, -0.6394F));

		PartDefinition cube_r310 = bone3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6615F, 0.2054F, -4.62F, -0.2062F, -0.1464F, -0.6394F));

		PartDefinition cube_r311 = bone3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(87, 44).addBox(-0.9313F, -0.1406F, -0.4487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 0.2296F, 0.2F, -0.7479F));

		PartDefinition cube_r312 = bone3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(68, 86).addBox(-0.5325F, 0.4106F, -0.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 86).addBox(-0.4325F, 0.3106F, -0.7487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 0.2898F, 0.0909F, -0.3389F));

		PartDefinition cube_r313 = bone3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(83, 86).addBox(-0.647F, 0.4803F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 1.1375F, 0.3829F, -0.3331F));

		PartDefinition cube_r314 = bone3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(87, 41).addBox(-1.1233F, -0.1471F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 0.8387F, 0.9488F, -0.7928F));

		PartDefinition cube_r315 = bone3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 6).addBox(-0.4503F, 0.8199F, -1.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 1.3579F, 0.2625F, -0.2284F));

		PartDefinition cube_r316 = bone3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(87, 3).addBox(-0.4642F, 0.7689F, -1.4837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.9473F, -0.9299F, -3.465F, 1.6361F, 0.3117F, -0.189F));

		PartDefinition cube_r317 = bone3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(76, 54).addBox(-0.5412F, -0.9504F, -0.3745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6699F, 0.1245F, -5.2178F, -0.258F, -0.0758F, -0.7616F));

		PartDefinition cube_r318 = bone3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(76, 29).addBox(1.2631F, 2.4514F, -4.1086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, -0.9387F, 0.3525F, -1.2218F));

		PartDefinition cube_r319 = bone3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(74, 21).addBox(-0.5233F, -0.5575F, -1.1866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6778F, 0.0945F, -5.4154F, -0.493F, 0.0435F, -0.9891F));

		PartDefinition cube_r320 = bone3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(27, 54).addBox(-0.5886F, -0.8919F, -0.6723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.6778F, 0.0945F, -5.4154F, -0.4898F, -0.0662F, -0.6922F));

		PartDefinition cube_r321 = bone3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(46, 67).addBox(-1.1443F, -0.5675F, -3.3205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(0.1F, 0.35F, -1.675F, -0.0697F, 0.0259F, -0.0067F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.62F, -0.3936F, -4.0547F));

		PartDefinition bone7 = Head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6272F, 0.6821F, -2.5955F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r322 = bone7.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(88, 12).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.899F, -0.2577F, -6.4662F, -0.3668F, -0.1469F, 0.0225F));

		PartDefinition cube_r323 = bone7.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(-0.5F, -0.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6767F, 0.2315F, -5.039F, -0.1836F, -0.1469F, 0.0225F));

		PartDefinition cube_r324 = bone7.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(-0.227F, -0.6196F, -3.7426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, -0.0614F, -0.1469F, 0.0225F));

		PartDefinition cube_r325 = bone7.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(0.1443F, -0.8749F, -3.3065F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, 0.0263F, -0.0259F, 0.0067F));

		PartDefinition cube_r326 = bone7.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-0.1025F, -1.1356F, -2.2638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, 0.1745F, -0.1484F, 0.0F));

		PartDefinition cube_r327 = bone7.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(84, 38).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9852F, -0.5815F, -4.209F, 0.0412F, 0.1596F, -0.9054F));

		PartDefinition cube_r328 = bone7.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(53, 68).mirror().addBox(-0.15F, -0.25F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.62F, -0.3936F, -4.0547F, 0.0482F, 0.1577F, -0.8612F));

		PartDefinition cube_r329 = bone7.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(68, 66).mirror().addBox(-0.625F, -0.25F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.8894F, -0.6722F, -4.5958F, 0.0479F, 0.1054F, -0.8638F));

		PartDefinition cube_r330 = bone7.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-0.275F, -0.25F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.257F)).mirror(false), PartPose.offsetAndRotation(0.4504F, -0.1434F, -4.7287F, 0.0485F, -0.191F, -0.878F));

		PartDefinition cube_r331 = bone7.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(16, 68).mirror().addBox(-0.275F, -0.25F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.4262F, -0.1646F, -4.0544F, 0.0476F, 0.0008F, -0.8688F));

		PartDefinition cube_r332 = bone7.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(-0.268F, -0.8968F, -1.9485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 86).mirror().addBox(-0.268F, -0.8968F, -1.4485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, 0.0249F, -0.279F, 0.0124F));

		PartDefinition cube_r333 = bone7.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.268F, -0.6353F, -1.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(40, 85).mirror().addBox(-0.268F, -0.6353F, -1.5066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 90).mirror().addBox(-0.168F, -0.7353F, -0.9066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, -0.0624F, -0.279F, 0.0124F));

		PartDefinition cube_r334 = bone7.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(14, 79).mirror().addBox(-0.5046F, -1.6423F, -0.4744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0942F, -1.0275F, -2.0703F, 1.563F, -0.2808F, 1.492F));

		PartDefinition cube_r335 = bone7.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(-0.5013F, -0.3586F, -0.4693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0942F, -1.0275F, -2.0703F, 1.1779F, -0.1762F, 1.4557F));

		PartDefinition cube_r336 = bone7.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(-0.3F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(25, 90).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5577F, -1.1747F, -1.6472F, 0.1041F, -0.135F, 1.2997F));

		PartDefinition cube_r337 = bone7.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 90).mirror().addBox(-0.475F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7582F, -0.7746F, -2.4307F, 0.3449F, -0.4115F, 0.1086F));

		PartDefinition cube_r338 = bone7.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.3F, -0.625F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2539F, -0.9216F, -1.5871F, -0.1978F, -0.0785F, 0.8645F));

		PartDefinition cube_r339 = bone7.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(40, 91).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.2539F, -0.9216F, -1.5871F, 0.1513F, -0.0785F, 0.8645F));

		PartDefinition cube_r340 = bone7.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-0.3119F, -0.2623F, -0.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2457F, -0.8905F, -1.6389F, -0.3203F, -0.0596F, 0.5689F));

		PartDefinition cube_r341 = bone7.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(10, 92).mirror().addBox(-0.512F, -0.7033F, -0.4584F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.3156F, -0.2076F, -2.1041F, -0.8935F, -0.3444F, 0.11F));

		PartDefinition cube_r342 = bone7.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(-0.2869F, -0.2947F, -0.7185F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0083F, -0.5473F, -1.592F, -0.2233F, -0.131F, 0.2484F));

		PartDefinition cube_r343 = bone7.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(92, 6).mirror().addBox(-0.2869F, -0.2947F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.0719F, -0.3064F, -1.0628F, 1.0407F, 0.0769F, 0.2404F));

		PartDefinition cube_r344 = bone7.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.2869F, -0.0947F, -0.5435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(0.0222F, -0.594F, -1.5809F, 1.0424F, -0.0135F, 0.2933F));

		PartDefinition cube_r345 = bone7.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.2869F, -0.2947F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.0222F, -0.594F, -1.5809F, 0.1698F, -0.0135F, 0.2933F));

		PartDefinition cube_r346 = bone7.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.3119F, -0.3197F, -0.4435F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2457F, -0.8905F, -1.6389F, 0.1596F, -0.0596F, 0.5689F));

		PartDefinition cube_r347 = bone7.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(87, 79).mirror().addBox(-0.5F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 65).mirror().addBox(-0.5F, -0.475F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1278F, -0.0099F, 2.7311F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone7.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(74, 35).mirror().addBox(-0.45F, -1.15F, -0.65F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.8118F, -0.8743F, 2.3477F, 0.2875F, -0.068F, 1.053F));

		PartDefinition cube_r349 = bone7.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(-0.5F, -0.2F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.4931F, 1.7275F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone7.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.5F, -0.2F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false)
				.texOffs(87, 62).mirror().addBox(-0.5F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.8204F, 2.0798F, -0.175F, 0.0007F, -0.0114F));

		PartDefinition cube_r351 = bone7.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(60, 87).mirror().addBox(-0.5F, -0.475F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.4931F, 1.7275F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r352 = bone7.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(69, 5).mirror().addBox(-0.5F, -0.1F, -0.575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.4931F, 1.7275F, -0.3465F, 0.0157F, 0.05F));

		PartDefinition cube_r353 = bone7.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(56, 35).mirror().addBox(-0.5F, -0.55F, -2.275F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2028F, -0.175F, 1.3536F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r354 = bone7.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-0.1025F, -0.3787F, -2.278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, -0.1745F, -0.1484F, 0.0F));

		PartDefinition cube_r355 = bone7.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(91, 25).mirror().addBox(-0.125F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1843F, 0.1227F, -1.0315F, 0.1231F, 0.0337F, 0.0113F));

		PartDefinition cube_r356 = bone7.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(90, 89).mirror().addBox(-0.125F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1231F, 0.1113F, -1.7288F, -0.0161F, -0.0875F, -0.0037F));

		PartDefinition cube_r357 = bone7.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(89, 71).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.0019F, 0.4584F, -0.5765F, 0.2488F, -0.0768F, 0.3178F));

		PartDefinition cube_r358 = bone7.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.3125F, -0.4086F, -0.3519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, -1.375F, 0.102F, -0.2237F, 0.4073F));

		PartDefinition cube_r359 = bone7.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(85, 89).mirror().addBox(-0.3125F, -0.4086F, -0.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(82, 50).mirror().addBox(-0.3125F, -0.3836F, -1.4769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, -1.375F, -0.1598F, -0.2237F, 0.4073F));

		PartDefinition cube_r360 = bone7.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(35, 85).mirror().addBox(-0.3125F, -0.2309F, -1.9774F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4F, -1.375F, -0.247F, -0.2237F, 0.4073F));

		PartDefinition cube_r361 = bone7.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.7F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8058F, 0.3107F, -3.4091F, -0.0515F, -0.0511F, 0.5083F));

		PartDefinition cube_r362 = bone7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(78, 25).mirror().addBox(-0.55F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.7785F, 0.2016F, -3.9985F, -0.119F, 0.1464F, 0.6394F));

		PartDefinition cube_r363 = bone7.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(73, 76).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6615F, 0.2054F, -4.62F, -0.2062F, 0.1464F, 0.6394F));

		PartDefinition cube_r364 = bone7.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(87, 44).mirror().addBox(-0.0687F, -0.1406F, -0.4487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 0.2296F, -0.2F, 0.7479F));

		PartDefinition cube_r365 = bone7.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(68, 86).mirror().addBox(-0.4675F, 0.4106F, -0.3487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(73, 86).mirror().addBox(-0.5675F, 0.3106F, -0.7487F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 0.2898F, -0.0909F, 0.3389F));

		PartDefinition cube_r366 = bone7.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(83, 86).mirror().addBox(-0.353F, 0.4803F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2497F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 1.1375F, -0.3829F, 0.3331F));

		PartDefinition cube_r367 = bone7.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(87, 41).mirror().addBox(0.1233F, -0.1471F, -0.9529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 0.8387F, -0.9488F, 0.7928F));

		PartDefinition cube_r368 = bone7.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(87, 6).mirror().addBox(-0.5497F, 0.8199F, -1.1719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 1.3579F, -0.2625F, 0.2284F));

		PartDefinition cube_r369 = bone7.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(87, 3).mirror().addBox(-0.5358F, 0.7689F, -1.4837F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.9473F, -0.9299F, -3.465F, 1.6361F, -0.3117F, 0.189F));

		PartDefinition cube_r370 = bone7.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(76, 54).mirror().addBox(-0.4588F, -0.9504F, -0.3745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6699F, 0.1245F, -5.2178F, -0.258F, 0.0758F, 0.7616F));

		PartDefinition cube_r371 = bone7.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(76, 29).mirror().addBox(-2.2631F, 2.4514F, -4.1086F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, -0.9387F, -0.3525F, 1.2218F));

		PartDefinition cube_r372 = bone7.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-0.4767F, -0.5575F, -1.1866F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6778F, 0.0945F, -5.4154F, -0.493F, -0.0435F, 0.9891F));

		PartDefinition cube_r373 = bone7.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(-0.4114F, -0.8919F, -0.6723F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.6778F, 0.0945F, -5.4154F, -0.4898F, 0.0662F, 0.6922F));

		PartDefinition cube_r374 = bone7.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(0.1443F, -0.5675F, -3.3205F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.305F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.35F, -1.675F, -0.0697F, -0.0259F, 0.0067F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.62F, -0.3936F, -4.0547F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2873F, -0.0473F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Lowerjaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(33, 53).mirror().addBox(-0.143F, -0.2527F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.082F, 0.2541F, 0.6402F, -0.0262F, -0.0873F, 0.0F));

		PartDefinition cube_r376 = Lowerjaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(5, 83).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.4164F, 0.2527F, -3.828F, 0.0611F, -0.1134F, 0.0F));

		PartDefinition cube_r377 = Lowerjaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.314F, -0.6707F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6891F, 0.3763F, -3.0776F, 0.0524F, -0.1134F, 0.0F));

		PartDefinition cube_r378 = Lowerjaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.2562F, -0.4681F, -0.6834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.5891F, 0.3763F, -4.2776F, 0.1325F, -0.3981F, -0.0549F));

		PartDefinition cube_r379 = Lowerjaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-0.2562F, -0.5976F, -0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6391F, 0.3763F, -4.2776F, 0.0453F, -0.3981F, -0.0549F));

		PartDefinition cube_r380 = Lowerjaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.45F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(84, 19).mirror().addBox(-0.45F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4984F, 0.0316F, -3.7751F, 0.0609F, -0.0649F, -0.4682F));

		PartDefinition cube_r381 = Lowerjaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.45F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.4084F, 0.0357F, -4.2904F, 0.1219F, -0.1585F, -0.5945F));

		PartDefinition cube_r382 = Lowerjaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.1948F, -0.7926F, -1.3519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(79, 83).mirror().addBox(-0.1948F, -0.9926F, -1.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.6391F, 0.3763F, -4.2776F, 0.4F, -0.3199F, -0.6631F));

		PartDefinition cube_r383 = Lowerjaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-0.525F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5905F, 0.2239F, -6.146F, 0.2197F, -0.1332F, -0.6379F));

		PartDefinition cube_r384 = Lowerjaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(50, 77).mirror().addBox(-0.5427F, -1.4259F, -1.2398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(77, 49).mirror().addBox(-0.5427F, -1.6759F, -1.8398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.3763F, -5.9276F, 0.3057F, -0.0821F, -0.6265F));

		PartDefinition cube_r385 = Lowerjaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(29, 75).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5062F, 0.1795F, -7.9287F, 0.3109F, -0.1985F, -0.6639F));

		PartDefinition cube_r386 = Lowerjaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.475F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2972F, 0.249F, -8.3792F, 0.3609F, -0.1976F, -0.7991F));

		PartDefinition cube_r387 = Lowerjaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(19, 75).mirror().addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2064F, 0.0197F, -9.4068F, 1.5664F, -0.5483F, -1.6202F));

		PartDefinition cube_r388 = Lowerjaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-0.425F, -1.025F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.3142F, 0.1141F, -8.999F, 0.5472F, -0.152F, -0.8004F));

		PartDefinition cube_r389 = Lowerjaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(-0.68F, -0.4052F, -1.6346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F)).mirror(false)
				.texOffs(52, 63).mirror().addBox(-0.68F, -0.4052F, -2.2346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.292F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.3763F, -5.9276F, -0.0206F, -0.093F, -0.1009F));

		PartDefinition cube_r390 = Lowerjaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-0.68F, -0.6035F, -1.6231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(16, 64).mirror().addBox(-0.68F, -0.6035F, -2.2231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-0.5141F, 0.3763F, -5.9276F, 0.0143F, -0.093F, -0.1009F));

		PartDefinition cube_r391 = Lowerjaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(38, 63).mirror().addBox(-0.2466F, -0.5501F, -1.6554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F)).mirror(false), PartPose.offsetAndRotation(-0.7641F, 0.3763F, -7.9276F, 0.0363F, -0.3013F, -0.1053F));

		PartDefinition cube_r392 = Lowerjaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(62, 62).mirror().addBox(-0.2466F, -0.4205F, -1.6662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.7641F, 0.3763F, -7.9276F, 0.0014F, -0.3013F, -0.1053F));

		PartDefinition cube_r393 = Lowerjaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(45, 63).mirror().addBox(-0.2692F, -0.5421F, -2.2118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(62, 58).mirror().addBox(-0.2692F, -0.3421F, -2.2118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6391F, 0.3763F, -4.2776F, 0.0287F, -0.3881F, -0.1086F));

		PartDefinition cube_r394 = Lowerjaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(-0.2562F, -0.3559F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false), PartPose.offsetAndRotation(-1.5891F, 0.3763F, -4.2776F, 0.0278F, -0.3981F, -0.0549F));

		PartDefinition cube_r395 = Lowerjaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-0.2562F, -0.3559F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-1.6391F, 0.3763F, -4.2776F, 0.0278F, -0.3981F, -0.0549F));

		PartDefinition cube_r396 = Lowerjaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-0.3112F, -0.3579F, -1.6106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-1.6891F, 0.3763F, -3.0776F, -0.0004F, -0.1133F, -0.0106F));

		PartDefinition cube_r397 = Lowerjaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(86, 53).mirror().addBox(-0.3112F, -0.3172F, -1.2154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-1.6891F, 0.3763F, -3.0776F, -0.0353F, -0.1133F, -0.0106F));

		PartDefinition cube_r398 = Lowerjaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(69, 83).mirror().addBox(-0.2112F, -0.4493F, -0.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.6891F, 0.3763F, -3.0776F, 0.0083F, -0.1133F, -0.0106F));

		PartDefinition cube_r399 = Lowerjaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(83, 59).mirror().addBox(-0.2112F, -0.5885F, -0.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.6891F, 0.3763F, -3.0776F, 0.0868F, -0.1133F, -0.0106F));

		PartDefinition cube_r400 = Lowerjaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(82, 4).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.4259F, 0.2661F, -2.7634F, 0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r401 = Lowerjaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(69, 13).mirror().addBox(-0.143F, -1.0869F, -3.6976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.082F, 0.2541F, 0.6402F, 0.1745F, -0.0873F, 0.0F));

		PartDefinition cube_r402 = Lowerjaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(37, 69).mirror().addBox(-0.143F, -0.3246F, -4.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-2.082F, 0.2541F, 0.6402F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r403 = Lowerjaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-0.143F, -0.3249F, -2.3178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(62, 12).mirror().addBox(-0.143F, -0.3249F, -1.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-2.082F, 0.2541F, 0.6402F, -0.2007F, -0.0873F, 0.0F));

		PartDefinition cube_r404 = Lowerjaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(33, 53).addBox(-0.857F, -0.2527F, -2.8154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.082F, 0.2541F, 0.6402F, -0.0262F, 0.0873F, 0.0F));

		PartDefinition cube_r405 = Lowerjaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(5, 83).addBox(-0.5F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.4164F, 0.2527F, -3.828F, 0.0611F, 0.1134F, 0.0F));

		PartDefinition cube_r406 = Lowerjaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(0, 83).addBox(-0.686F, -0.6707F, -1.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6891F, 0.3763F, -3.0776F, 0.0524F, 0.1134F, 0.0F));

		PartDefinition cube_r407 = Lowerjaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(35, 82).addBox(-0.7438F, -0.4681F, -0.6834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.5891F, 0.3763F, -4.2776F, 0.1325F, 0.3981F, 0.0549F));

		PartDefinition cube_r408 = Lowerjaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(82, 67).addBox(-0.7438F, -0.5976F, -0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6391F, 0.3763F, -4.2776F, 0.0453F, 0.3981F, 0.0549F));

		PartDefinition cube_r409 = Lowerjaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(84, 35).addBox(-0.55F, -0.475F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(84, 19).addBox(-0.55F, -0.475F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4984F, 0.0316F, -3.7751F, 0.0609F, 0.0649F, 0.4682F));

		PartDefinition cube_r410 = Lowerjaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(10, 83).addBox(-0.55F, -0.425F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.4084F, 0.0357F, -4.2904F, 0.1219F, 0.1585F, 0.5945F));

		PartDefinition cube_r411 = Lowerjaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(78, 86).addBox(-0.8052F, -0.7926F, -1.3519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(79, 83).addBox(-0.8052F, -0.9926F, -1.9519F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.6391F, 0.3763F, -4.2776F, 0.4F, 0.3199F, 0.6631F));

		PartDefinition cube_r412 = Lowerjaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(67, 77).addBox(-0.475F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5905F, 0.2239F, -6.146F, 0.2197F, 0.1332F, 0.6379F));

		PartDefinition cube_r413 = Lowerjaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(50, 77).addBox(-0.4573F, -1.4259F, -1.2398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(77, 49).addBox(-0.4573F, -1.6759F, -1.8398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5141F, 0.3763F, -5.9276F, 0.3057F, 0.0821F, 0.6265F));

		PartDefinition cube_r414 = Lowerjaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(29, 75).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.5062F, 0.1795F, -7.9287F, 0.3109F, 0.1985F, 0.6639F));

		PartDefinition cube_r415 = Lowerjaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(24, 75).addBox(-0.525F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2972F, 0.249F, -8.3792F, 0.3609F, 0.1976F, 0.7991F));

		PartDefinition cube_r416 = Lowerjaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(19, 75).addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2064F, 0.0197F, -9.4068F, 1.5664F, 0.5483F, 1.6202F));

		PartDefinition cube_r417 = Lowerjaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(14, 75).addBox(-0.575F, -1.025F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.3142F, 0.1141F, -8.999F, 0.5472F, 0.152F, 0.8004F));

		PartDefinition cube_r418 = Lowerjaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(64, 20).addBox(-0.32F, -0.4052F, -1.6346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F))
				.texOffs(52, 63).addBox(-0.32F, -0.4052F, -2.2346F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.292F)), PartPose.offsetAndRotation(0.5141F, 0.3763F, -5.9276F, -0.0206F, 0.093F, 0.1009F));

		PartDefinition cube_r419 = Lowerjaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(23, 64).addBox(-0.32F, -0.6035F, -1.6231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F))
				.texOffs(16, 64).addBox(-0.32F, -0.6035F, -2.2231F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(0.5141F, 0.3763F, -5.9276F, 0.0143F, 0.093F, 0.1009F));

		PartDefinition cube_r420 = Lowerjaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(38, 63).addBox(-0.7534F, -0.5501F, -1.6554F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.294F)), PartPose.offsetAndRotation(0.7641F, 0.3763F, -7.9276F, 0.0363F, 0.3013F, 0.1053F));

		PartDefinition cube_r421 = Lowerjaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(62, 62).addBox(-0.7534F, -0.4205F, -1.6662F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.7641F, 0.3763F, -7.9276F, 0.0014F, 0.3013F, 0.1053F));

		PartDefinition cube_r422 = Lowerjaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(45, 63).addBox(-0.7308F, -0.5421F, -2.2118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.297F))
				.texOffs(62, 58).addBox(-0.7308F, -0.3421F, -2.2118F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6391F, 0.3763F, -4.2776F, 0.0287F, 0.3881F, 0.1086F));

		PartDefinition cube_r423 = Lowerjaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(82, 80).addBox(-0.7438F, -0.3559F, -0.6978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(1.5891F, 0.3763F, -4.2776F, 0.0278F, 0.3981F, 0.0549F));

		PartDefinition cube_r424 = Lowerjaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(74, 83).addBox(-0.7438F, -0.3559F, -0.8228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.6391F, 0.3763F, -4.2776F, 0.0278F, 0.3981F, 0.0549F));

		PartDefinition cube_r425 = Lowerjaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(82, 64).addBox(-0.6888F, -0.3579F, -1.6106F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.6891F, 0.3763F, -3.0776F, -0.0004F, 0.1133F, 0.0106F));

		PartDefinition cube_r426 = Lowerjaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(86, 53).addBox(-0.6888F, -0.3172F, -1.2154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(1.6891F, 0.3763F, -3.0776F, -0.0353F, 0.1133F, 0.0106F));

		PartDefinition cube_r427 = Lowerjaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(69, 83).addBox(-0.7888F, -0.4493F, -0.728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.6891F, 0.3763F, -3.0776F, 0.0083F, 0.1133F, 0.0106F));

		PartDefinition cube_r428 = Lowerjaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(83, 59).addBox(-0.7888F, -0.5885F, -0.7638F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.6891F, 0.3763F, -3.0776F, 0.0868F, 0.1133F, 0.0106F));

		PartDefinition cube_r429 = Lowerjaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(82, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.4259F, 0.2661F, -2.7634F, 0.0436F, 0.0873F, 0.0F));

		PartDefinition cube_r430 = Lowerjaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(69, 13).addBox(-0.857F, -1.0869F, -3.6976F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.082F, 0.2541F, 0.6402F, 0.1745F, 0.0873F, 0.0F));

		PartDefinition cube_r431 = Lowerjaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(37, 69).addBox(-0.857F, -0.3246F, -4.0508F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(2.082F, 0.2541F, 0.6402F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r432 = Lowerjaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(62, 16).addBox(-0.857F, -0.3249F, -2.3178F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F))
				.texOffs(62, 12).addBox(-0.857F, -0.3249F, -1.7678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(2.082F, 0.2541F, 0.6402F, -0.2007F, 0.0873F, 0.0F));

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