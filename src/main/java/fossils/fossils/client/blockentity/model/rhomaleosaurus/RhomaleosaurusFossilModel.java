package fossils.fossils.client.blockentity.model.rhomaleosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RhomaleosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tailfluke1;
	private final ModelPart Tail4;
	private final ModelPart Tailfluke2;
	private final ModelPart Tailfluke3;

	public RhomaleosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.BackFlipperL = this.Hips.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Hips.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.FrontFlipperL = this.chest.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.chest.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.Neck1 = this.chest.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Head = this.Neck6.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tailfluke1 = this.Tail3.getChild("Tailfluke1");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tailfluke2 = this.Tail4.getChild("Tailfluke2");
		this.Tailfluke3 = this.Tailfluke2.getChild("Tailfluke3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(36, 49).addBox(-0.5F, -2.0592F, 13.9437F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(49, 108).addBox(0.0F, -5.3592F, 13.9437F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 108).addBox(0.0F, -5.3592F, 15.9438F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 108).addBox(0.0F, -5.3092F, 17.9438F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 108).addBox(0.0F, -5.2592F, 19.9438F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.9F, 1.5F, 0.7267F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(107, 73).mirror().addBox(-1.8129F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -1.5786F, 20.3239F, 0.4687F, 0.1483F, -0.1347F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 117).mirror().addBox(-2.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -1.5786F, 20.3239F, 0.371F, 0.3217F, -0.5471F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(107, 71).mirror().addBox(-1.8129F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -1.5786F, 18.3239F, 0.4554F, 0.2434F, -0.1372F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 117).mirror().addBox(-2.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -1.5786F, 18.3239F, 0.3167F, 0.4032F, -0.5664F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(107, 40).mirror().addBox(-1.8129F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -1.5786F, 16.3239F, 0.4402F, 0.3471F, -0.1417F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 117).mirror().addBox(-2.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -1.5786F, 16.3239F, 0.2531F, 0.4908F, -0.5939F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 117).mirror().addBox(-2.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.5786F, 14.3239F, 0.2531F, 0.4908F, -0.5939F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 102).mirror().addBox(-1.8129F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.5786F, 14.3239F, 0.4402F, 0.3471F, -0.1417F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(62, 117).addBox(1.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -1.5786F, 20.3239F, 0.371F, -0.3217F, 0.5471F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(107, 73).addBox(-0.1871F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -1.5786F, 20.3239F, 0.4687F, -0.1483F, 0.1347F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 117).addBox(1.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -1.5786F, 18.3239F, 0.3167F, -0.4032F, 0.5664F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(107, 71).addBox(-0.1871F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -1.5786F, 18.3239F, 0.4554F, -0.2434F, 0.1372F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 117).addBox(1.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -1.5786F, 16.3239F, 0.2531F, -0.4908F, 0.5939F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(107, 40).addBox(-0.1871F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -1.5786F, 16.3239F, 0.4402F, -0.3471F, 0.1417F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 117).addBox(1.5889F, -0.8822F, -0.4923F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.5786F, 14.3239F, 0.2531F, -0.4908F, 0.5939F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 102).addBox(-0.1871F, -0.1281F, -0.5054F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.5786F, 14.3239F, 0.4402F, -0.3471F, 0.1417F));

		PartDefinition BackFlipperL = Hips.addOrReplaceChild("BackFlipperL", CubeListBuilder.create().texOffs(82, 33).addBox(2.5671F, -0.5F, -1.6427F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.9432F, 2.0491F, 15.8635F, -0.2097F, -0.3879F, -0.5308F));

		PartDefinition cube_r17 = BackFlipperL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(66, 16).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.6032F, 0.0F, -1.0555F, 0.0F, 1.7017F, 0.0F));

		PartDefinition cube_r18 = BackFlipperL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 65).addBox(0.0F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(13.567F, 1.0F, 3.8823F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r19 = BackFlipperL.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(93, 92).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.3064F, 0.0F, 1.953F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r20 = BackFlipperL.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 4).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(10.2299F, 0.0F, 0.179F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r21 = BackFlipperL.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 78).addBox(-0.6F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5671F, 0.0F, -0.6177F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r22 = BackFlipperL.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(93, 71).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4486F, 0.0F, -0.5665F, 0.0F, 0.4538F, 0.0F));

		PartDefinition cube_r23 = BackFlipperL.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(95, 86).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(95, 83).addBox(0.0F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4486F, 0.0F, -0.5665F, 0.0F, -0.1134F, 0.0F));

		PartDefinition cube_r24 = BackFlipperL.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 33).addBox(-1.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.0671F, 0.0F, -0.6427F, 0.0F, -0.1309F, 0.0F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create().texOffs(100, 112).addBox(1.5209F, -1.0F, 0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(94, 0).addBox(-0.9625F, -1.0F, 0.7615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1585F, 0.5F, -0.1872F, -0.0285F, -0.1278F, 0.22F));

		PartDefinition cube_r25 = BackFlipperMiddleL.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(105, 112).addBox(-1.7923F, -1.5F, -1.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(3.0307F, 0.5F, 3.5963F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r26 = BackFlipperMiddleL.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(9, 92).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5378F, 0.5F, -0.5388F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r27 = BackFlipperMiddleL.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(108, 52).addBox(-0.2493F, -1.5F, -0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.6307F, 0.5F, -1.4037F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r28 = BackFlipperMiddleL.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(46, 43).addBox(-0.2824F, 0.0F, -2.1334F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0363F, -0.6F, -0.0328F, 0.0F, -0.0175F, 0.0F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8307F, 0.5F, -1.0037F, 0.0F, 0.1658F, 0.0F));

		PartDefinition cube_r29 = BackFlipperEndL.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(39, 19).addBox(-0.4825F, 0.0F, -0.4852F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.258F, -1.0F, 0.2552F, 0.0F, -0.384F, 0.0F));

		PartDefinition BackFlipperL2 = Hips.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create().texOffs(82, 37).addBox(-5.5671F, -0.5F, -1.6427F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.9432F, 2.0491F, 15.8635F, -0.177F, 0.4454F, 0.2951F));

		PartDefinition cube_r30 = BackFlipperL2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 66).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.6032F, 0.0F, -1.0555F, 0.0F, -1.7017F, 0.0F));

		PartDefinition cube_r31 = BackFlipperL2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(30, 66).addBox(-2.0F, -1.5F, -10.2F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-13.567F, 1.0F, 3.8823F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r32 = BackFlipperL2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(65, 94).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.3064F, 0.0F, 1.953F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r33 = BackFlipperL2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(92, 8).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-10.2299F, 0.0F, 0.179F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r34 = BackFlipperL2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 78).addBox(-1.4F, -0.5F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5671F, 0.0F, -0.6177F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r35 = BackFlipperL2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(56, 94).addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4486F, 0.0F, -0.5665F, 0.0F, -0.4538F, 0.0F));

		PartDefinition cube_r36 = BackFlipperL2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 96).addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0134F))
				.texOffs(95, 89).addBox(-3.0F, -0.5F, -1.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4486F, 0.0F, -0.5665F, 0.0F, 0.1134F, 0.0F));

		PartDefinition cube_r37 = BackFlipperL2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(70, 54).addBox(-2.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.0671F, 0.0F, -0.6427F, 0.0F, 0.1309F, 0.0F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create().texOffs(39, 115).addBox(-2.5209F, -1.0F, 0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F))
				.texOffs(74, 94).addBox(-1.0375F, -1.0F, 0.7615F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.1585F, 0.5F, -0.1872F, -0.0341F, 0.1264F, -0.264F));

		PartDefinition cube_r38 = BackFlipperMiddleL2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 115).addBox(0.7923F, -1.5F, -1.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.0307F, 0.5F, 3.5963F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r39 = BackFlipperMiddleL2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(92, 12).addBox(-0.5F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5378F, 0.5F, -0.5388F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r40 = BackFlipperMiddleL2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(3, 109).addBox(-0.7507F, -1.5F, -0.3137F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.6307F, 0.5F, -1.4037F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r41 = BackFlipperMiddleL2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(47, 0).addBox(-5.7176F, 0.0F, -2.1334F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0363F, -0.6F, -0.0328F, 0.0F, 0.0175F, 0.0F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8307F, 0.5F, -1.0037F, 0.0F, -0.1658F, 0.0F));

		PartDefinition cube_r42 = BackFlipperEndL2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(41, 11).addBox(-8.5175F, 0.0F, -0.4852F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.258F, -1.0F, 0.2552F, 0.0F, 0.384F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.7616F, 3.611F, 9.383F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(101, 8).addBox(-0.5F, -0.7F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.4529F, -1.973F, 7.4097F, -1.554F, -0.1807F, -0.2796F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(115, 108).addBox(-0.5F, 0.2F, 0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 115).addBox(-0.5F, 0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.1326F, -3.203F, 7.2365F, -0.8559F, -0.1807F, -0.2796F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(29, 106).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7992F, -3.8986F, 7.9401F, -0.4632F, -0.1807F, -0.2796F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(100, 115).addBox(-0.5F, 1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0897F, -6.5121F, 7.7248F, 0.1913F, -0.1807F, -0.2796F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(95, 115).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.3398F, -5.2465F, 8.3212F, 0.5404F, -0.1807F, -0.2796F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(111, 105).addBox(-0.5F, -0.75F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.5002F, -4.7106F, 8.2869F, 1.0203F, -0.1807F, -0.2796F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(39, 73).addBox(-1.0F, -0.5F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.6265F, -3.1281F, 7.5338F, 1.1949F, -0.1807F, -0.2796F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(26, 73).addBox(-4.4063F, -0.3573F, 1.1643F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.3575F, 0.8404F, 0.2713F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(11, 83).addBox(-1.3081F, -0.3573F, 1.544F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2643F, -0.4656F, -0.1209F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(91, 99).addBox(-2.9018F, -0.3573F, 0.7862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(60, 66).addBox(-2.9018F, -0.3573F, 1.9862F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(94, 75).addBox(0.4982F, -0.3573F, 1.4862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(66, 83).addBox(1.1021F, -0.3573F, -0.7396F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.9405F, 5.7712F, 0.2939F, -0.6335F, -0.1772F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(0, 81).addBox(0.7982F, -0.5035F, -1.7407F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(109, 82).addBox(-0.4242F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2055F, 0.2137F, 0.0442F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(92, 16).addBox(-0.0941F, -0.5035F, -2.9179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.415F, 1.0536F, 0.3658F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(47, 6).addBox(-1.7225F, -0.5035F, -4.1473F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2307F, -0.512F, -0.1146F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(50, 78).addBox(-2.5145F, -0.5035F, -4.8563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.4487F, -1.0932F, -0.404F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(0, 65).addBox(-2.8672F, -0.5035F, -4.7142F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2008F, 0.0257F, 0.0052F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(13, 72).addBox(-0.7518F, -0.5035F, -5.1285F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2235F, 0.4525F, 0.0991F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(81, 6).addBox(-0.6447F, -0.5035F, -5.518F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2011F, -0.0599F, -0.0122F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(81, 11).addBox(-1.5168F, -0.5035F, -5.4374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2402F, -0.8155F, 5.7712F, 0.2367F, -0.5545F, -0.1263F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.7616F, 3.611F, 9.383F));

		PartDefinition basin_r21 = bone4.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(101, 8).mirror().addBox(-0.5F, -0.7F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.4529F, -1.973F, 7.4097F, -1.554F, 0.1807F, 0.2796F));

		PartDefinition basin_r22 = bone4.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(115, 108).mirror().addBox(-0.5F, 0.2F, 0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(105, 115).mirror().addBox(-0.5F, 0.3F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1326F, -3.203F, 7.2365F, -0.8559F, 0.1807F, 0.2796F));

		PartDefinition basin_r23 = bone4.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7992F, -3.8986F, 7.9401F, -0.4632F, 0.1807F, 0.2796F));

		PartDefinition basin_r24 = bone4.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(100, 115).mirror().addBox(-0.5F, 1.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0897F, -6.5121F, 7.7248F, 0.1913F, 0.1807F, 0.2796F));

		PartDefinition basin_r25 = bone4.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(95, 115).mirror().addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3398F, -5.2465F, 8.3212F, 0.5404F, 0.1807F, 0.2796F));

		PartDefinition basin_r26 = bone4.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(111, 105).mirror().addBox(-0.5F, -0.75F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.5002F, -4.7106F, 8.2869F, 1.0203F, 0.1807F, 0.2796F));

		PartDefinition basin_r27 = bone4.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(39, 73).mirror().addBox(0.0F, -0.5F, -1.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.6265F, -3.1281F, 7.5338F, 1.1949F, 0.1807F, 0.2796F));

		PartDefinition basin_r28 = bone4.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(0.4063F, -0.3573F, 1.1643F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.3575F, -0.8404F, -0.2713F));

		PartDefinition basin_r29 = bone4.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(11, 83).mirror().addBox(-1.6919F, -0.3573F, 1.544F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2643F, 0.4656F, 0.1209F));

		PartDefinition basin_r30 = bone4.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(91, 99).mirror().addBox(1.9018F, -0.3573F, 0.7862F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(60, 66).mirror().addBox(-0.0982F, -0.3573F, 1.9862F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(94, 75).mirror().addBox(-2.4982F, -0.3573F, 1.4862F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2356F, 0.0F, 0.0F));

		PartDefinition basin_r31 = bone4.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(66, 83).mirror().addBox(-4.1021F, -0.3573F, -0.7396F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.9405F, 5.7712F, 0.2939F, 0.6335F, 0.1772F));

		PartDefinition basin_r32 = bone4.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-2.7982F, -0.5035F, -1.7407F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r33 = bone4.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(109, 82).mirror().addBox(-0.5758F, -0.5035F, -2.1425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2055F, -0.2137F, -0.0442F));

		PartDefinition basin_r34 = bone4.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(92, 16).mirror().addBox(-1.9059F, -0.5035F, -2.9179F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.415F, -1.0536F, -0.3658F));

		PartDefinition basin_r35 = bone4.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(47, 6).mirror().addBox(-2.2775F, -0.5035F, -4.1473F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2307F, 0.512F, 0.1146F));

		PartDefinition basin_r36 = bone4.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(50, 78).mirror().addBox(0.5145F, -0.5035F, -4.8563F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.4487F, 1.0932F, 0.404F));

		PartDefinition basin_r37 = bone4.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.8672F, -0.5035F, -4.7142F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2008F, -0.0257F, -0.0052F));

		PartDefinition basin_r38 = bone4.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(13, 72).mirror().addBox(-2.2482F, -0.5035F, -5.1285F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2235F, -0.4525F, -0.0991F));

		PartDefinition basin_r39 = bone4.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-1.3553F, -0.5035F, -5.518F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2011F, 0.0599F, 0.0122F));

		PartDefinition basin_r40 = bone4.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(81, 11).mirror().addBox(-0.4832F, -0.5035F, -5.4374F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2402F, -0.8155F, 5.7712F, 0.2367F, 0.5545F, 0.1263F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4342F, 13.9437F, -0.0024F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(86, 108).addBox(0.0F, -3.341F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6055F, -2.0543F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(98, 103).addBox(0.0F, -3.391F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5706F, -4.054F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Bodymiddle.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(51, 87).mirror().addBox(-4.6252F, -1.6902F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9478F, -0.4444F, -2.0198F, 0.2531F, 0.4908F, -0.5939F));

		PartDefinition cube_r44 = Bodymiddle.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(99, 57).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9478F, -0.4444F, -2.0198F, 0.4402F, 0.3471F, -0.1417F));

		PartDefinition cube_r45 = Bodymiddle.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-4.6252F, -1.6902F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.4444F, -4.0198F, 0.1832F, 0.5766F, -0.6295F));

		PartDefinition cube_r46 = Bodymiddle.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(18, 99).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.4444F, -4.0198F, 0.4238F, 0.4507F, -0.148F));

		PartDefinition cube_r47 = Bodymiddle.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 24).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.4444F, -6.0198F, 0.1709F, 0.5907F, -0.6363F));

		PartDefinition cube_r48 = Bodymiddle.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 99).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.4444F, -6.0198F, 0.4209F, 0.468F, -0.1493F));

		PartDefinition cube_r49 = Bodymiddle.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(99, 57).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9478F, -0.4444F, -2.0198F, 0.4402F, -0.3471F, 0.1417F));

		PartDefinition cube_r50 = Bodymiddle.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(51, 87).addBox(3.6252F, -1.6902F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9478F, -0.4444F, -2.0198F, 0.2531F, -0.4908F, 0.5939F));

		PartDefinition cube_r51 = Bodymiddle.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 99).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.4444F, -4.0198F, 0.4238F, -0.4507F, 0.148F));

		PartDefinition cube_r52 = Bodymiddle.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(27, 87).addBox(3.6252F, -1.6902F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.4444F, -4.0198F, 0.1832F, -0.5766F, 0.6295F));

		PartDefinition cube_r53 = Bodymiddle.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(104, 24).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.4444F, -6.0198F, 0.1709F, -0.5907F, 0.6363F));

		PartDefinition cube_r54 = Bodymiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(9, 99).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.4444F, -6.0198F, 0.4209F, -0.468F, 0.1493F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(69, 102).addBox(0.0F, -3.491F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5357F, -6.0537F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(0, 19).addBox(-7.5F, -3.0F, 0.1F, 15.0F, 3.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 6.8908F, -6.9894F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(19, 48).addBox(-0.5F, -1.0F, 12.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.7012F, -19.0993F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(55, 107).addBox(0.0F, -4.0481F, -5.0187F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 102).addBox(0.0F, -4.058F, -3.019F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 109).addBox(0.0F, -4.068F, -1.0193F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0988F, -6.9993F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(108, 46).addBox(0.0F, -3.691F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2973F, -7.0532F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.3456F, -1.0206F, 0.4209F, 0.468F, -0.1493F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(104, 22).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.3456F, -1.0206F, 0.1709F, 0.5907F, -0.6363F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 46).mirror().addBox(-5.2092F, -4.0967F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.3456F, -1.0206F, -0.1598F, 0.5934F, -1.2173F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(116, 25).mirror().addBox(-5.2092F, -4.0967F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.1456F, -2.8206F, -0.1012F, 0.5745F, -1.185F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(103, 0).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.1456F, -2.8206F, 0.2073F, 0.5482F, -0.6167F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(88, 69).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0478F, -0.1456F, -2.8206F, 0.4294F, 0.4162F, -0.1457F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(108, 8).mirror().addBox(-6.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -4.6206F, -0.1012F, 0.5745F, -1.185F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(108, 6).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -4.6206F, 0.2073F, 0.5482F, -0.6167F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(18, 93).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -4.6206F, 0.4294F, 0.4162F, -0.1457F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(107, 38).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -6.6206F, 0.2306F, 0.5196F, -0.6048F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(99, 69).mirror().addBox(-7.2092F, -4.0967F, -0.4705F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -6.6206F, -0.063F, 0.561F, -1.1645F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -6.6206F, 0.4349F, 0.3817F, -0.1436F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(19, 46).addBox(4.2092F, -4.0967F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.3456F, -1.0206F, -0.1598F, -0.5934F, 1.2173F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(104, 22).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.3456F, -1.0206F, 0.1709F, -0.5907F, 0.6363F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 99).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.3456F, -1.0206F, 0.4209F, -0.468F, 0.1493F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 69).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.1456F, -2.8206F, 0.4294F, -0.4162F, 0.1457F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(103, 0).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.1456F, -2.8206F, 0.2073F, -0.5482F, 0.6167F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(116, 25).addBox(4.2092F, -4.0967F, -0.4705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0478F, -0.1456F, -2.8206F, -0.1012F, -0.5745F, 1.185F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(18, 93).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -4.6206F, 0.4294F, -0.4162F, 0.1457F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(108, 6).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -4.6206F, 0.2073F, -0.5482F, 0.6167F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(108, 8).addBox(4.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -4.6206F, -0.1012F, -0.5745F, 1.185F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(93, 33).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -6.6206F, 0.4349F, -0.3817F, 0.1436F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(99, 69).addBox(4.2092F, -4.0967F, -0.4705F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -6.6206F, -0.063F, -0.561F, 1.1645F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(107, 38).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -6.6206F, 0.2306F, -0.5196F, 0.6048F));

		PartDefinition Bodymiddle_r7 = body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -2.7F, 0.0F, 16.0F, 3.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 8.2099F, -6.8699F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r8 = body.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(53, 49).addBox(-0.5F, -1.0F, 5.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.8F, -12.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(95, 103).addBox(0.0F, -4.1702F, -4.0177F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -7.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r9 = body2.addOrReplaceChild("Bodymiddle_r9", CubeListBuilder.create().texOffs(66, 108).addBox(0.0F, -3.791F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3624F, -2.0529F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -5.6206F, 0.4603F, 0.2088F, -0.1187F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(107, 34).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -5.6206F, 0.3368F, 0.3737F, -0.5413F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(39, 24).mirror().addBox(-10.2092F, -4.0967F, -0.4705F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -5.6206F, 0.1182F, 0.4846F, -1.0563F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 24).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -1.6206F, 0.4504F, 0.278F, -0.1385F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(106, 67).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -1.6206F, 0.2961F, 0.4326F, -0.5748F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(-8.2092F, -4.0967F, -0.4705F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.2456F, -1.6206F, 0.0476F, 0.5169F, -1.1076F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 13).mirror().addBox(-9.2092F, -4.0967F, -0.4705F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -3.6206F, 0.1008F, 0.4929F, -1.0819F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(106, 65).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -3.6206F, 0.3268F, 0.3885F, -0.5625F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(93, 20).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.1456F, -3.6206F, 0.4579F, 0.2261F, -0.1367F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(93, 22).addBox(4.2092F, -4.0967F, -0.4705F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -1.6206F, 0.0476F, -0.5169F, 1.1076F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(106, 67).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -1.6206F, 0.2961F, -0.4326F, 0.5748F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(93, 24).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -1.6206F, 0.4504F, -0.278F, 0.1385F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(39, 24).addBox(4.2092F, -4.0967F, -0.4705F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -5.6206F, 0.1182F, -0.4846F, 1.0563F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(107, 34).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -5.6206F, 0.3368F, -0.3737F, 0.5413F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(93, 26).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.2456F, -5.6206F, 0.4603F, -0.2088F, 0.1187F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(93, 20).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -3.6206F, 0.4579F, -0.2261F, 0.1367F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(106, 65).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -3.6206F, 0.3268F, -0.3885F, 0.5625F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(68, 13).addBox(4.2092F, -4.0967F, -0.4705F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.1456F, -3.6206F, 0.1008F, -0.4929F, 1.0819F));

		PartDefinition Bodymiddle_r10 = body2.addOrReplaceChild("Bodymiddle_r10", CubeListBuilder.create().texOffs(63, 102).addBox(0.0F, -3.8594F, -0.0176F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r11 = body2.addOrReplaceChild("Bodymiddle_r11", CubeListBuilder.create().texOffs(0, 11).addBox(-8.0F, 4.85F, 0.8F, 16.0F, 3.0F, 4.0F, new CubeDeformation(0.002F))
				.texOffs(32, 58).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.7F, -5.1F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1804F, -5.9874F, -0.0908F, -0.0873F, 0.0003F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(60, 103).addBox(0.0F, -3.8834F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4675F, -1.9117F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(46, 108).addBox(0.0F, -3.9584F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5024F, -3.9114F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(25, 108).addBox(0.0F, -3.9834F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5373F, -5.9111F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(47, 58).addBox(-0.5F, -1.0F, 7.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3261F, -13.2623F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(-8.2092F, -4.0967F, -0.4705F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -5.6332F, 0.0836F, 0.5016F, -1.0727F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -5.6332F, 0.3173F, 0.4035F, -0.5487F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -5.6332F, 0.456F, 0.2435F, -0.1196F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(-9.2092F, -4.0967F, -0.4705F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -3.6332F, 0.1182F, 0.4846F, -1.0563F));

		PartDefinition cube_r101 = Bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(103, 55).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -3.6332F, 0.3368F, 0.3737F, -0.5413F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(60, 92).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -3.6332F, 0.4603F, 0.2088F, -0.1187F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 16).mirror().addBox(-10.2092F, -4.0967F, -0.4705F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -1.6332F, 0.1256F, 0.4608F, -1.0528F));

		PartDefinition cube_r104 = Bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(108, 4).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -1.6332F, 0.3305F, 0.3497F, -0.5434F));

		PartDefinition cube_r105 = Bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(36, 92).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.426F, -1.6332F, 0.4448F, 0.1894F, -0.1216F));

		PartDefinition cube_r106 = Bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 92).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -5.6332F, 0.456F, -0.2435F, 0.1196F));

		PartDefinition cube_r107 = Bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(104, 20).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -5.6332F, 0.3173F, -0.4035F, 0.5487F));

		PartDefinition cube_r108 = Bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(93, 28).addBox(4.2092F, -4.0967F, -0.4705F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -5.6332F, 0.0836F, -0.5016F, 1.0727F));

		PartDefinition cube_r109 = Bodyfront.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(60, 92).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -3.6332F, 0.4603F, -0.2088F, 0.1187F));

		PartDefinition cube_r110 = Bodyfront.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(103, 55).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -3.6332F, 0.3368F, -0.3737F, 0.5413F));

		PartDefinition cube_r111 = Bodyfront.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(75, 70).addBox(4.2092F, -4.0967F, -0.4705F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -3.6332F, 0.1182F, -0.4846F, 1.0563F));

		PartDefinition cube_r112 = Bodyfront.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(36, 92).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -1.6332F, 0.4448F, -0.1894F, 0.1216F));

		PartDefinition cube_r113 = Bodyfront.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(108, 4).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -1.6332F, 0.3305F, -0.3497F, 0.5434F));

		PartDefinition cube_r114 = Bodyfront.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 16).addBox(4.2092F, -4.0967F, -0.4705F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.426F, -1.6332F, 0.1256F, -0.4608F, 1.0528F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0739F, -5.9623F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(87, 102).addBox(0.0F, -3.9334F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4983F, -1.9485F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(38, 103).addBox(0.0F, -3.9084F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5332F, -3.9482F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(35, 103).addBox(0.0F, -3.8084F, -0.035F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5681F, -5.9479F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(62, 58).addBox(-0.5F, -1.0F, 1.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -7.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-6.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.5521F, -5.7709F, 0.0304F, 0.526F, -1.0988F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(107, 36).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.5521F, -5.7709F, 0.287F, 0.448F, -0.5612F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(94, 55).mirror().addBox(-4.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5478F, -0.5521F, -5.7709F, 0.4495F, 0.2955F, -0.1214F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(84, 31).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.4521F, -3.5709F, 0.456F, 0.2435F, -0.1196F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(101, 96).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.4521F, -3.5709F, 0.3173F, 0.4035F, -0.5487F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(103, 2).mirror().addBox(-6.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.4521F, -3.5709F, 0.0836F, 0.5016F, -1.0727F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(82, 92).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3521F, -1.5709F, 0.4539F, 0.2608F, -0.1202F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(21, 104).mirror().addBox(-5.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3521F, -1.5709F, 0.3073F, 0.4184F, -0.5527F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-7.2092F, -4.0967F, -0.4705F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.3521F, -1.5709F, 0.066F, 0.5098F, -1.0812F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(94, 55).addBox(1.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.5521F, -5.7709F, 0.4495F, -0.2955F, 0.1214F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(107, 36).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.5521F, -5.7709F, 0.287F, -0.448F, 0.5612F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(102, 92).addBox(4.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5478F, -0.5521F, -5.7709F, 0.0304F, -0.526F, 1.0988F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(103, 2).addBox(4.2092F, -4.0967F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.4521F, -3.5709F, 0.0836F, -0.5016F, 1.0727F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(101, 96).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.4521F, -3.5709F, 0.3173F, -0.4035F, 0.5487F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(84, 31).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.4521F, -3.5709F, 0.456F, -0.2435F, 0.1196F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(83, 4).addBox(4.2092F, -4.0967F, -0.4705F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3521F, -1.5709F, 0.066F, -0.5098F, 1.0812F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(21, 104).addBox(3.6252F, -1.6902F, -0.4705F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3521F, -1.5709F, 0.3073F, -0.4184F, 0.5527F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(82, 92).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.3521F, -1.5709F, 0.4539F, -0.2608F, 0.1202F));

		PartDefinition FrontFlipperL = chest.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4997F, 5.1053F, -2.7735F, 0.0909F, -0.1574F, 0.6858F));

		PartDefinition cube_r133 = FrontFlipperL.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(83, 79).addBox(-3.9F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(9.7514F, -0.8021F, -1.0526F, -0.1764F, 0.155F, -0.0371F));

		PartDefinition cube_r134 = FrontFlipperL.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(56, 16).addBox(-1.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(8.3533F, -0.5066F, 0.5499F, -0.187F, 0.3696F, -0.0778F));

		PartDefinition cube_r135 = FrontFlipperL.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4819F, -0.5187F, 0.3256F, -0.1746F, -0.0599F, 0.001F));

		PartDefinition cube_r136 = FrontFlipperL.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 96).addBox(-1.5F, -0.5F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(5.4764F, -0.5702F, 0.0325F, -0.1807F, -0.266F, 0.0384F));

		PartDefinition cube_r137 = FrontFlipperL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(47, 93).addBox(-0.2F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.6061F, -0.065F, 2.8928F, -0.2129F, -0.6085F, 0.1134F));

		PartDefinition cube_r138 = FrontFlipperL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(93, 39).addBox(-1.7F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.6061F, -0.065F, 2.8928F, -0.439F, -1.1506F, 0.3955F));

		PartDefinition cube_r139 = FrontFlipperL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(83, 45).addBox(0.5078F, -0.9671F, -2.2407F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.8234F, 0.0905F, 1.0564F, -0.2572F, -0.8208F, 0.1806F));

		PartDefinition cube_r140 = FrontFlipperL.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(22, 83).addBox(-3.0F, -0.5F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(10.4277F, -0.3408F, 1.6045F, -0.1758F, 0.1292F, -0.0324F));

		PartDefinition cube_r141 = FrontFlipperL.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(93, 35).addBox(-0.5F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(8.4415F, -0.2276F, 2.1395F, -0.1918F, -0.429F, 0.0711F));

		PartDefinition cube_r142 = FrontFlipperL.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(39, 112).addBox(-0.7F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0926F, -0.3269F, 1.1151F, -0.1918F, -0.429F, 0.0711F));

		PartDefinition cube_r143 = FrontFlipperL.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(109, 85).addBox(0.075F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0778F, -0.6131F, -0.5196F, -0.3945F, -1.1028F, 0.3462F));

		PartDefinition cube_r144 = FrontFlipperL.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(83, 94).addBox(-0.3F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-0.0778F, -0.6131F, -0.5196F, -0.2439F, -0.7701F, 0.162F));

		PartDefinition cube_r145 = FrontFlipperL.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(75, 66).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1387F, -0.4963F, 0.2636F, -0.1744F, -0.0427F, -0.002F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5524F, -0.3954F, 1.8217F, 0.0744F, -0.158F, -0.4422F));

		PartDefinition cube_r146 = FrontFlipperMiddleL.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(0, 40).addBox(-0.9056F, -0.2171F, -0.2559F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7924F, -0.2403F, -2.0101F, -0.1742F, -0.0407F, 0.0207F));

		PartDefinition cube_r147 = FrontFlipperMiddleL.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(112, 97).addBox(-0.2433F, -0.5313F, -2.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 112).addBox(-0.5433F, -0.5313F, -0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8759F, -0.0881F, -0.1177F, -0.174F, 0.0195F, 0.0101F));

		PartDefinition cube_r148 = FrontFlipperMiddleL.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(58, 112).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1712F, 0.2645F, 2.0464F, -0.1834F, 0.3201F, -0.0448F));

		PartDefinition cube_r149 = FrontFlipperMiddleL.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(18, 95).addBox(-0.575F, -0.5F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8282F, 0.2028F, 1.6947F, -0.1851F, 0.3459F, -0.0499F));

		PartDefinition cube_r150 = FrontFlipperMiddleL.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(90, 57).addBox(-1.2F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8282F, 0.2028F, 1.6947F, -0.1781F, -0.2125F, 0.0514F));

		PartDefinition cube_r151 = FrontFlipperMiddleL.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(75, 88).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9566F, -0.3362F, -1.3815F, -0.1755F, 0.1312F, -0.0097F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2443F, -1.5F, -0.0469F, 0.0285F, -0.1278F, -0.22F));

		PartDefinition cube_r152 = FrontFlipperEndL.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(25, 27).addBox(0.249F, -0.311F, -0.2975F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0452F, 1.4198F, -1.982F, -0.1765F, -0.2537F, 0.081F));

		PartDefinition FrontFlipperL2 = chest.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4997F, 5.1053F, -2.7735F, -0.0885F, 0.1503F, -0.5403F));

		PartDefinition cube_r153 = FrontFlipperL2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(88, 66).addBox(-0.1F, -0.5F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-9.7514F, -0.8021F, -1.0526F, -0.1764F, -0.155F, 0.0371F));

		PartDefinition cube_r154 = FrontFlipperL2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(95, 30).addBox(-2.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(-8.3533F, -0.5066F, 0.5499F, -0.187F, -0.3696F, 0.0778F));

		PartDefinition cube_r155 = FrontFlipperL2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(77, 62).addBox(-2.5F, -0.5F, -0.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.4819F, -0.5187F, 0.3256F, -0.1746F, 0.0599F, -0.001F));

		PartDefinition cube_r156 = FrontFlipperL2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(27, 98).addBox(-1.5F, -0.5F, 0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.4764F, -0.5702F, 0.0325F, -0.1807F, 0.266F, -0.0384F));

		PartDefinition cube_r157 = FrontFlipperL2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(94, 51).addBox(-1.8F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-7.6061F, -0.065F, 2.8928F, -0.2129F, 0.6085F, -0.1134F));

		PartDefinition cube_r158 = FrontFlipperL2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(94, 47).addBox(-0.3F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.6061F, -0.065F, 2.8928F, -0.439F, 1.1506F, -0.3955F));

		PartDefinition cube_r159 = FrontFlipperL2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 53).addBox(-3.5078F, -0.9671F, -2.2407F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-4.8234F, 0.0905F, 1.0564F, -0.2572F, 0.8208F, -0.1806F));

		PartDefinition cube_r160 = FrontFlipperL2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(83, 49).addBox(0.0F, -0.5F, -2.1F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-10.4277F, -0.3408F, 1.6045F, -0.1758F, -0.1292F, 0.0324F));

		PartDefinition cube_r161 = FrontFlipperL2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(94, 43).addBox(-1.5F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-8.4415F, -0.2276F, 2.1395F, -0.1918F, 0.429F, -0.0711F));

		PartDefinition cube_r162 = FrontFlipperL2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(114, 100).addBox(-0.3F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0926F, -0.3269F, 1.1151F, -0.1918F, 0.429F, -0.0711F));

		PartDefinition cube_r163 = FrontFlipperL2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(72, 110).addBox(-1.075F, -0.5F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0778F, -0.6131F, -0.5196F, -0.3945F, 1.1028F, -0.3462F));

		PartDefinition cube_r164 = FrontFlipperL2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 95).addBox(-1.7F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0778F, -0.6131F, -0.5196F, -0.2439F, 0.7701F, -0.162F));

		PartDefinition cube_r165 = FrontFlipperL2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(77, 58).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.1387F, -0.4963F, 0.2636F, -0.1744F, 0.0427F, 0.002F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.5524F, -0.3954F, 1.8217F, 0.023F, 0.173F, 0.1329F));

		PartDefinition cube_r166 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(46, 37).addBox(-5.0944F, -0.2171F, -0.2559F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7924F, -0.2403F, -2.0101F, -0.1742F, 0.0407F, -0.0207F));

		PartDefinition cube_r167 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(115, 6).addBox(-0.7567F, -0.5313F, -2.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 3).addBox(-0.4567F, -0.5313F, -0.2027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.8759F, -0.0881F, -0.1177F, -0.174F, -0.0195F, -0.0101F));

		PartDefinition cube_r168 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(115, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1712F, 0.2645F, 2.0464F, -0.1834F, -0.3201F, 0.0448F));

		PartDefinition cube_r169 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 79).addBox(-1.425F, -0.5F, -0.65F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.8282F, 0.2028F, 1.6947F, -0.1851F, -0.3459F, 0.0499F));

		PartDefinition cube_r170 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(90, 61).addBox(-0.8F, -0.5F, -0.875F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8282F, 0.2028F, 1.6947F, -0.1781F, 0.2125F, -0.0514F));

		PartDefinition cube_r171 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(27, 89).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9566F, -0.3362F, -1.3815F, -0.1755F, -0.1312F, 0.0097F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.2443F, -1.5F, -0.0469F, 0.0341F, 0.1264F, 0.264F));

		PartDefinition cube_r172 = FrontFlipperEndL2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(25, 32).addBox(-10.249F, -0.311F, -0.2975F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0452F, 1.4198F, -1.982F, -0.1765F, 0.2537F, -0.081F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(7.0986F, 8.1726F, -4.0227F));

		PartDefinition cube_r173 = bone.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(101, 16).addBox(-3.71F, -0.9349F, -0.7358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(14, 101).addBox(-4.31F, -0.9349F, -0.7358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 72).addBox(-4.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(82, 41).addBox(-4.31F, -0.9349F, 3.7642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(21, 101).addBox(-0.5F, -0.5F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-5.4986F, -2.9942F, 1.5009F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(82, 72).addBox(-0.8824F, -0.1431F, 2.0249F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.3009F, -0.3767F, 0.1137F));

		PartDefinition cube_r176 = bone.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(70, 0).addBox(-2.3515F, -0.1343F, 0.0724F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r177 = bone.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(99, 65).addBox(-0.7761F, -0.1343F, 2.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.3114F, 0.4516F, -0.1395F));

		PartDefinition cube_r178 = bone.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(84, 98).addBox(-0.2627F, -0.1343F, 2.5253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6471F, -2.578F, 3.9902F, -0.2819F, 0.1342F, -0.0387F));

		PartDefinition cube_r179 = bone.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(71, 28).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2685F, -1.7184F, 5.6738F, -0.298F, 0.0918F, -0.0281F));

		PartDefinition cube_r180 = bone.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(83, 0).addBox(-3.4845F, 0.1469F, -0.6703F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8886F, -3.3866F, 2.4303F, -0.3094F, 0.2834F, -0.0892F));

		PartDefinition cube_r181 = bone.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(71, 23).addBox(-2.9845F, 0.1469F, -3.8703F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8886F, -3.3866F, 2.4303F, -0.4609F, 0.8535F, -0.3581F));

		PartDefinition cube_r182 = bone.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 116).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1393F, -5.6415F, 0.2241F, -2.0763F, 0.1995F, 0.2667F));

		PartDefinition cube_r183 = bone.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(72, 102).addBox(-0.2592F, -2.2035F, -0.6742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1393F, -5.6415F, 0.2241F, -1.4218F, 0.1995F, 0.2667F));

		PartDefinition cube_r184 = bone.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(102, 35).addBox(-0.2592F, -0.9377F, -0.3728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1393F, -5.6415F, 0.2241F, -1.0291F, 0.1995F, 0.2667F));

		PartDefinition cube_r185 = bone.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 89).addBox(-0.2592F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1393F, -5.6415F, 0.2241F, -1.0465F, 0.1995F, 0.2667F));

		PartDefinition cube_r186 = bone.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(102, 71).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.1393F, -5.6415F, 0.2241F, -1.2036F, 0.1995F, 0.2667F));

		PartDefinition cube_r187 = bone.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(108, 75).addBox(0.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5393F, -6.3415F, -0.6759F, 0.0594F, 0.5256F, 0.7416F));

		PartDefinition cube_r188 = bone.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(56, 98).addBox(0.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5393F, -6.3415F, -0.6759F, 0.4957F, 0.5256F, 0.7416F));

		PartDefinition cube_r189 = bone.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 79).addBox(-0.6566F, -0.7028F, -0.1057F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1966F, -3.6194F, -0.7538F, -0.3754F, -0.0348F, -0.0744F));

		PartDefinition cube_r190 = bone.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 91).addBox(-0.8247F, -0.7028F, -0.7031F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-3.1966F, -3.6194F, -0.7538F, -0.4254F, -0.4782F, 0.1174F));

		PartDefinition cube_r191 = bone.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(83, 76).addBox(-6.9359F, -3.5167F, -0.5114F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, -0.7215F, -0.696F, 0.4184F));

		PartDefinition cube_r192 = bone.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 86).addBox(-0.8F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(33, 84).addBox(-1.2F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9745F, -4.5193F, -2.1646F, -0.6985F, -0.6629F, 0.3819F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-7.0986F, 8.1726F, -4.0227F));

		PartDefinition cube_r193 = bone3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(101, 16).mirror().addBox(2.71F, -0.9349F, -0.7358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(14, 101).mirror().addBox(3.31F, -0.9349F, -0.7358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 72).mirror().addBox(1.31F, -0.9349F, 1.2642F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(82, 41).mirror().addBox(1.31F, -0.9349F, 3.7642F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.6886F, -3.3866F, -1.2697F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r194 = bone3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(21, 101).mirror().addBox(-1.5F, -0.5F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(5.4986F, -2.9942F, 1.5009F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r195 = bone3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(82, 72).mirror().addBox(-2.1176F, -0.1431F, 2.0249F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.3009F, 0.3767F, -0.1137F));

		PartDefinition cube_r196 = bone3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(0.3515F, -0.1343F, 0.0724F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r197 = bone3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 65).mirror().addBox(-0.2239F, -0.1343F, 2.5188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.3114F, -0.4516F, 0.1395F));

		PartDefinition cube_r198 = bone3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(84, 98).mirror().addBox(-0.7373F, -0.1343F, 2.5253F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6471F, -2.578F, 3.9902F, -0.2819F, -0.1342F, 0.0387F));

		PartDefinition cube_r199 = bone3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(71, 28).mirror().addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2685F, -1.7184F, 5.6738F, -0.298F, -0.0918F, 0.0281F));

		PartDefinition cube_r200 = bone3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(0.4845F, 0.1469F, -0.6703F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8886F, -3.3866F, 2.4303F, -0.3094F, -0.2834F, 0.0892F));

		PartDefinition cube_r201 = bone3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(-0.0155F, 0.1469F, -3.8703F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8886F, -3.3866F, 2.4303F, -0.4609F, -0.8535F, 0.3581F));

		PartDefinition cube_r202 = bone3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(87, 116).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1393F, -5.6415F, 0.2241F, -2.0763F, -0.1995F, -0.2667F));

		PartDefinition cube_r203 = bone3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(-0.7408F, -2.2035F, -0.6742F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1393F, -5.6415F, 0.2241F, -1.4218F, -0.1995F, -0.2667F));

		PartDefinition cube_r204 = bone3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(102, 35).mirror().addBox(-0.7408F, -0.9377F, -0.3728F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1393F, -5.6415F, 0.2241F, -1.0291F, -0.1995F, -0.2667F));

		PartDefinition cube_r205 = bone3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(60, 89).mirror().addBox(-0.7408F, 0.0549F, -0.6615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1393F, -5.6415F, 0.2241F, -1.0465F, -0.1995F, -0.2667F));

		PartDefinition cube_r206 = bone3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(102, 71).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.1393F, -5.6415F, 0.2241F, -1.2036F, -0.1995F, -0.2667F));

		PartDefinition cube_r207 = bone3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(108, 75).mirror().addBox(-1.312F, 0.2111F, 0.3223F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5393F, -6.3415F, -0.6759F, 0.0594F, -0.5256F, -0.7416F));

		PartDefinition cube_r208 = bone3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(56, 98).mirror().addBox(-1.312F, 0.2818F, -1.8194F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.5393F, -6.3415F, -0.6759F, 0.4957F, -0.5256F, -0.7416F));

		PartDefinition cube_r209 = bone3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-1.3434F, -0.7028F, -0.1057F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.1966F, -3.6194F, -0.7538F, -0.3754F, 0.0348F, 0.0744F));

		PartDefinition cube_r210 = bone3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-1.1753F, -0.7028F, -0.7031F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(3.1966F, -3.6194F, -0.7538F, -0.4254F, 0.4782F, -0.1174F));

		PartDefinition cube_r211 = bone3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(2.9359F, -3.5167F, -0.5114F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.0F, -0.7215F, 0.696F, -0.4184F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 84).mirror().addBox(0.2F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9745F, -4.5193F, -2.1646F, -0.6985F, 0.6629F, -0.3819F));

		PartDefinition Neck1 = chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(71, 72).addBox(-0.5F, -0.4844F, -3.9918F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, -0.0466F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neck1.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(63, 108).addBox(0.0F, -3.7782F, 0.0005F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4844F, -1.9918F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Neck1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(105, 100).mirror().addBox(-3.8783F, -0.9634F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.2521F, -3.7709F, 0.2972F, 0.4332F, -0.5571F));

		PartDefinition cube_r214 = Neck1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(108, 69).mirror().addBox(-3.9952F, -2.6454F, -0.4603F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.2521F, -3.7709F, 0.0483F, 0.518F, -1.0901F));

		PartDefinition cube_r215 = Neck1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(105, 98).mirror().addBox(-2.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2478F, -0.2521F, -3.7709F, 0.4517F, 0.2781F, -0.121F));

		PartDefinition cube_r216 = Neck1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(104, 26).mirror().addBox(-2.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.2521F, -1.5709F, 0.4539F, 0.2608F, -0.1202F));

		PartDefinition cube_r217 = Neck1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(102, 94).mirror().addBox(-4.9953F, -2.6454F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.2521F, -1.5709F, 0.066F, 0.5098F, -1.0812F));

		PartDefinition cube_r218 = Neck1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-3.8783F, -0.9634F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.2521F, -1.5709F, 0.3073F, 0.4184F, -0.5527F));

		PartDefinition cube_r219 = Neck1.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(105, 98).addBox(0.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.2521F, -3.7709F, 0.4517F, -0.2781F, 0.121F));

		PartDefinition cube_r220 = Neck1.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(108, 69).addBox(2.9952F, -2.6454F, -0.4603F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.2521F, -3.7709F, 0.0483F, -0.518F, 1.0901F));

		PartDefinition cube_r221 = Neck1.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(105, 100).addBox(1.8783F, -0.9634F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2478F, -0.2521F, -3.7709F, 0.2972F, -0.4332F, 0.5571F));

		PartDefinition cube_r222 = Neck1.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(104, 107).addBox(1.8783F, -0.9634F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.2521F, -1.5709F, 0.3073F, -0.4184F, 0.5527F));

		PartDefinition cube_r223 = Neck1.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(102, 94).addBox(2.9952F, -2.6454F, -0.4603F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.2521F, -1.5709F, 0.066F, -0.5098F, 1.0812F));

		PartDefinition cube_r224 = Neck1.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(104, 26).addBox(0.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.2521F, -1.5709F, 0.4539F, -0.2608F, 0.1202F));

		PartDefinition Neckbase_r2 = Neck1.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(84, 102).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4844F, -3.9918F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0529F, -3.9893F, -0.1388F, -0.2121F, 0.0534F));

		PartDefinition cube_r225 = Neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-3.0097F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.3049F, -3.5816F, 0.1076F, 0.2439F, -0.6864F));

		PartDefinition cube_r226 = Neck2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(28, 104).mirror().addBox(-2.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.3049F, -1.5816F, 0.2038F, 0.282F, -0.5781F));

		PartDefinition cube_r227 = Neck2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(18, 117).mirror().addBox(-2.8783F, -0.9634F, -0.4603F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2522F, -0.3049F, -1.5816F, 0.0637F, 0.3336F, -1.0332F));

		PartDefinition cube_r228 = Neck2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(99, 59).addBox(0.0097F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.3049F, -3.5816F, 0.1076F, -0.2439F, 0.6864F));

		PartDefinition cube_r229 = Neck2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 117).addBox(1.8783F, -0.9634F, -0.4603F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.3049F, -1.5816F, 0.0637F, -0.3336F, 1.0332F));

		PartDefinition cube_r230 = Neck2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(28, 104).addBox(0.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2522F, -0.3049F, -1.5816F, 0.2038F, -0.282F, 0.5781F));

		PartDefinition Neckmiddlebase_r1 = Neck2.addOrReplaceChild("Neckmiddlebase_r1", CubeListBuilder.create().texOffs(69, 108).addBox(0.0F, -3.391F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4973F, -1.9897F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r2 = Neck2.addOrReplaceChild("Neckmiddlebase_r2", CubeListBuilder.create().texOffs(83, 108).addBox(0.0F, -3.291F, 0.0348F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4624F, -3.9894F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Neckmiddlebase_r3 = Neck2.addOrReplaceChild("Neckmiddlebase_r3", CubeListBuilder.create().texOffs(60, 72).addBox(-0.5F, -1.0F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6332F, -8.9362F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(68, 6).addBox(-0.51F, -0.4672F, -4.9545F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.01F, 0.019F, -3.9421F, 0.0008F, -0.0874F, 0.0432F));

		PartDefinition cube_r231 = Neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(99, 63).mirror().addBox(-2.4097F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.1239F, -3.5395F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r232 = Neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(-2.6097F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.1239F, -1.5395F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r233 = Neck3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(99, 63).addBox(-0.5903F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.1239F, -3.5395F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition cube_r234 = Neck3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(99, 61).addBox(-0.3903F, -0.0794F, -0.4757F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.1239F, -1.5395F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition Neckmiddlefront_r1 = Neck3.addOrReplaceChild("Neckmiddlefront_r1", CubeListBuilder.create().texOffs(9, 112).addBox(-0.01F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4672F, -1.9545F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neckmiddlefront_r2 = Neck3.addOrReplaceChild("Neckmiddlefront_r2", CubeListBuilder.create().texOffs(6, 112).addBox(-0.01F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4672F, -3.9545F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(70, 47).addBox(-0.51F, -0.5799F, -4.9833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1115F, -4.9613F, -0.1045F, -0.214F, 0.1313F));

		PartDefinition cube_r235 = Neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(104, 32).mirror().addBox(-1.8097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2354F, -4.5782F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r236 = Neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(104, 30).mirror().addBox(-2.0097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2354F, -2.5782F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r237 = Neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(104, 28).mirror().addBox(-2.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2354F, -0.5782F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r238 = Neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(104, 32).addBox(-0.1903F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2354F, -4.5782F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition cube_r239 = Neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(104, 30).addBox(0.0097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2354F, -2.5782F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition cube_r240 = Neck4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(104, 28).addBox(0.1097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2354F, -0.5782F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition Neckfront_r1 = Neck4.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(92, 111).addBox(-0.01F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -4.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r2 = Neck4.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(3, 112).addBox(-0.01F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -0.9833F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neckfront_r3 = Neck4.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(89, 111).addBox(-0.01F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -2.9833F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(69, 40).addBox(-0.51F, -0.5799F, -4.9833F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0071F, -5.0003F, -0.2318F, -0.2551F, 0.0595F));

		PartDefinition cube_r241 = Neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(48, 104).mirror().addBox(-1.8097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -3.5779F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r242 = Neck5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(41, 104).mirror().addBox(-1.8097F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -1.5779F, 0.1287F, 0.2336F, -0.5973F));

		PartDefinition cube_r243 = Neck5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(48, 104).addBox(-0.1903F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -3.5779F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition cube_r244 = Neck5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(41, 104).addBox(-0.1903F, -0.0794F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -1.5779F, 0.1287F, -0.2336F, 0.5973F));

		PartDefinition Neckfront_r4 = Neck5.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(111, 46).addBox(-0.01F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -1.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r5 = Neck5.addOrReplaceChild("Neckfront_r5", CubeListBuilder.create().texOffs(111, 27).addBox(-0.01F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -3.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r245 = Neck5.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(48, 106).mirror().addBox(-1.6097F, 0.1206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -11.5779F, 0.0967F, 0.2484F, -0.7312F));

		PartDefinition cube_r246 = Neck5.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(41, 106).mirror().addBox(-1.7097F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -9.5779F, 0.1183F, 0.239F, -0.6418F));

		PartDefinition cube_r247 = Neck5.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-1.7097F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -7.5779F, 0.1076F, 0.2439F, -0.6864F));

		PartDefinition cube_r248 = Neck5.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-1.7097F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, -0.2425F, -5.5779F, 0.1076F, 0.2439F, -0.6864F));

		PartDefinition cube_r249 = Neck5.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(48, 106).addBox(-0.3903F, 0.1206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -11.5779F, 0.0967F, -0.2484F, 0.7312F));

		PartDefinition cube_r250 = Neck5.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(41, 106).addBox(-0.2903F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -9.5779F, 0.1183F, -0.239F, 0.6418F));

		PartDefinition cube_r251 = Neck5.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(22, 106).addBox(-0.2903F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -7.5779F, 0.1076F, -0.2439F, 0.6864F));

		PartDefinition cube_r252 = Neck5.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(15, 106).addBox(-0.2903F, 0.0206F, -0.4757F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, -0.2425F, -5.5779F, 0.1076F, -0.2439F, 0.6864F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(54, 24).addBox(-0.51F, -0.5799F, -6.9833F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0063F, -4.9773F, -0.1194F, -0.1309F, -0.0015F));

		PartDefinition Neckfront_r6 = Neck6.addOrReplaceChild("Neckfront_r6", CubeListBuilder.create().texOffs(92, 116).addBox(-0.01F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -2.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r7 = Neck6.addOrReplaceChild("Neckfront_r7", CubeListBuilder.create().texOffs(73, 116).addBox(-0.01F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -0.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r8 = Neck6.addOrReplaceChild("Neckfront_r8", CubeListBuilder.create().texOffs(29, 116).addBox(-0.01F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -4.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neckfront_r9 = Neck6.addOrReplaceChild("Neckfront_r9", CubeListBuilder.create().texOffs(59, 115).addBox(-0.01F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5799F, -6.9833F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Neck6.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(77, 104).addBox(-1.0F, -2.6393F, -4.4014F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(29, 94).addBox(-2.0F, -2.5048F, 0.847F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.49F, 0.6511F, -8.3842F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(114, 48).addBox(-0.5F, -0.1F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(114, 45).addBox(-0.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -1.5496F, -11.0947F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r254 = Head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(44, 114).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2F, -9.7465F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r255 = Head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 16).addBox(-3.1921F, -0.5299F, -0.2099F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6921F, -1.2486F, -9.0976F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r256 = Head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(38, 94).addBox(-3.1921F, 0.1996F, -1.3645F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6921F, -2.4296F, -6.7335F, 0.2487F, 0.0F, 0.0F));

		PartDefinition cube_r257 = Head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(46, 83).addBox(-1.5F, -0.675F, -1.225F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.8512F, -5.4594F, 0.2225F, 0.0F, 0.0F));

		PartDefinition cube_r258 = Head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(1, 47).mirror().addBox(-0.5F, -0.375F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.2522F, -0.5F, 0.5871F, -0.0873F, -0.48F, 0.0F));

		PartDefinition cube_r259 = Head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(1, 47).addBox(-0.5F, -0.375F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.2522F, -0.5F, 0.5871F, -0.0873F, 0.48F, 0.0F));

		PartDefinition cube_r260 = Head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -1.0869F, -4.8016F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.1034F, -4.3777F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(113, 51).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -3.7249F, -0.5015F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(113, 42).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7249F, -0.5015F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(28, 101).addBox(-1.0F, 1.025F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 69).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.7823F, 0.4832F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(28, 113).addBox(-0.5F, -0.1F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 6).addBox(-0.5F, -1.3F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, -2.064F, -1.4954F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(72, 106).addBox(-1.0F, 1.9F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -5.0053F, -1.1504F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(113, 13).addBox(-0.5F, -0.175F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -3.1226F, -1.6138F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(113, 10).addBox(0.0F, 0.0039F, -1.0371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0F, -3.1746F, -2.1228F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(114, 93).addBox(-0.625F, -0.325F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4064F, -3.3951F, 0.1226F, 0.2915F, 0.2773F));

		PartDefinition cube_r269 = Head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(110, 112).addBox(0.0F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.3564F, -3.3925F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r270 = Head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(47, 97).addBox(-2.0F, -0.025F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -2.8546F, -3.8804F, 0.192F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0736F, -0.7817F, -17.1414F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(101, 4).addBox(-0.7005F, -0.5786F, -0.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0365F, -1.3335F, 18.9148F, -0.9339F, 0.5474F, -0.3132F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(9, 87).addBox(-0.6867F, -0.5742F, -2.874F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0365F, -1.3335F, 18.9148F, -1.1421F, 0.8825F, -1.043F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(51, 89).addBox(-1.2601F, -0.4308F, -1.6155F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5668F, 0.9528F, 20.8625F, -0.8938F, 0.0562F, -0.0359F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(110, 109).addBox(-0.1723F, -1.2676F, 0.9631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.0666F, 1.7729F, 18.9993F, 0.8468F, 0.1871F, 0.0944F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(82, 114).addBox(-0.875F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8832F, 0.0301F, 6.3174F, -0.2791F, -1.4438F, 0.2769F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(114, 78).addBox(-0.1F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0736F, 0.0246F, 6.1606F, -0.0385F, -0.436F, 0.0163F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(114, 81).addBox(-0.9F, -0.9F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.7557F, 0.4019F, 5.5023F, -0.0429F, 0.6192F, -0.0249F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(49, 114).addBox(-0.9F, -0.9F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3108F, 0.3812F, 4.9091F, -0.0781F, 1.1071F, -0.0699F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(36, 89).addBox(-0.243F, 0.1165F, -0.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5668F, 0.9528F, 20.8625F, 0.8084F, 0.0457F, -0.0535F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(50, 100).addBox(-0.2139F, -0.5593F, -0.4769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(3.3138F, 0.3473F, 19.0844F, 1.4054F, 0.0894F, 0.0758F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(114, 33).addBox(-0.5407F, -0.4515F, -0.7309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.8802F, 0.3396F, -0.5883F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(114, 30).addBox(-0.5407F, 0.0708F, -0.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, -0.1234F, 0.3396F, -0.5883F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(114, 27).addBox(-0.5407F, 0.0952F, -1.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, -0.2106F, 0.3396F, -0.5883F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(113, 75).addBox(-0.5407F, 0.1888F, -0.473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, -1.6505F, 0.3396F, -0.5883F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(114, 84).addBox(-0.5407F, -0.2059F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F))
				.texOffs(72, 113).addBox(-0.5407F, 0.1691F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.029F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, -0.2979F, 0.3396F, -0.5883F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(72, 113).addBox(-0.25F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5337F, -0.6113F, 10.2133F, 0.2421F, 0.1524F, -0.6413F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(42, 87).addBox(-0.8604F, -0.7064F, -1.5533F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F))
				.texOffs(86, 82).addBox(-1.0354F, -0.7064F, -1.5533F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, -0.1059F, 0.3396F, -0.5883F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 105).addBox(-0.65F, -1.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.352F, -1.2855F, 13.6342F, 0.7824F, 0.3287F, -0.5998F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(113, 66).addBox(-0.3521F, -0.2794F, 0.1823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.7126F, 0.3287F, -0.5998F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(113, 63).addBox(-0.3521F, -1.5634F, 0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 1.8558F, 0.3287F, -0.5998F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(113, 60).addBox(-0.3521F, -1.2453F, 0.1697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 1.594F, 0.3287F, -0.5998F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(113, 57).addBox(-0.3521F, -0.8579F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 1.3758F, 0.3287F, -0.5998F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(104, 87).addBox(-0.3521F, -0.0039F, 0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.4508F, 0.3287F, -0.5998F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(104, 83).addBox(-0.3521F, -0.4037F, 0.1749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.0669F, 0.3287F, -0.5998F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(114, 87).addBox(-0.3521F, -0.4479F, -0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.9395F, 0.3287F, -0.5998F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(113, 54).addBox(-0.3521F, -0.3299F, 0.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 1.2886F, 0.3287F, -0.5998F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(104, 103).addBox(-0.675F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1624F, -0.8323F, 14.2377F, 0.5956F, 0.4581F, -0.7902F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(104, 79).addBox(-0.3521F, 0.2567F, 0.1958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.4923F, -1.0076F, 12.9706F, 0.669F, 0.3287F, -0.5998F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(84, 21).addBox(-0.675F, -0.525F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6182F, -0.4804F, 9.9171F, 0.1726F, -0.1594F, 0.852F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(66, 87).addBox(-0.775F, -0.6226F, -3.2361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8486F, 0.0623F, 11.3263F, 0.1381F, 0.2933F, 0.5029F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(108, 42).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1452F, 0.2779F, 5.2038F, -0.7265F, 0.632F, -0.753F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(108, 61).addBox(-0.2415F, -0.9046F, -0.3814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2928F, 0.4905F, 5.8713F, -0.3742F, 0.2844F, -0.4562F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(41, 108).addBox(-0.475F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7558F, 1.0731F, 6.4156F, -0.1926F, -0.101F, -0.3798F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(68, 116).addBox(-0.5862F, -0.4367F, -0.535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.8161F, 0.6095F, 7.2996F, -0.2433F, 0.2844F, -0.4562F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(108, 57).addBox(-0.4215F, -1.1099F, -1.2079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(90, 107).addBox(-0.4F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2137F, 0.7668F, 8.6402F, -0.1561F, 0.2844F, -0.4562F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(24, 116).addBox(-0.5F, -0.45F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(116, 22).addBox(-0.5F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8446F, 0.5119F, 13.6772F, -0.0601F, 0.2844F, -0.4562F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(116, 19).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5607F, 0.6014F, 12.6703F, -0.0426F, 0.2844F, -0.4562F));

		PartDefinition cube_r308 = leftFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(116, 16).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 108).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.0103F, 0.3847F, 11.3064F, 0.0447F, 0.2844F, -0.4562F));

		PartDefinition cube_r309 = leftFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(15, 108).addBox(-0.5F, -1.0F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(108, 14).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(108, 10).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4824F, 0.6461F, 9.2908F, 0.001F, 0.2844F, -0.4562F));

		PartDefinition cube_r310 = leftFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(18, 87).addBox(-0.5F, -0.4476F, -3.2361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8486F, 0.0623F, 11.3263F, -0.0176F, 0.3229F, -0.0003F));

		PartDefinition cube_r311 = leftFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(101, 12).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.8837F, -0.7916F, 11.2581F, 0.2479F, -0.2887F, 1.0065F));

		PartDefinition cube_r312 = leftFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(63, 114).addBox(-0.3F, 0.025F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4264F, -2.9432F, 16.6399F, 0.0517F, 0.5666F, 0.0278F));

		PartDefinition cube_r313 = leftFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(77, 114).addBox(-0.275F, 0.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4264F, -2.9432F, 16.6399F, 0.4101F, 0.2006F, 0.0864F));

		PartDefinition cube_r314 = leftFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(103, 43).addBox(-0.275F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3737F, -1.9937F, 18.16F, 1.0101F, 0.4563F, 0.0575F));

		PartDefinition cube_r315 = leftFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(114, 72).addBox(-0.5F, 0.175F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.4264F, -3.0006F, 17.6246F, 0.9259F, 0.211F, -0.1562F));

		PartDefinition cube_r316 = leftFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(115, 111).addBox(0.225F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7736F, -1.1905F, 11.4239F, 0.2396F, 0.1351F, 1.1114F));

		PartDefinition cube_r317 = leftFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(111, 24).addBox(-0.5F, -0.4929F, -0.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4987F, 0.0012F, 7.4241F, -0.0436F, 0.3491F, 0.0F));

		PartDefinition cube_r318 = leftFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(109, 88).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3461F, -0.0254F, 7.005F, -0.1101F, 0.6095F, -0.0303F));

		PartDefinition cube_r319 = leftFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(114, 90).addBox(-0.425F, -0.325F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5736F, -1.6247F, 13.7463F, 0.1226F, 0.2915F, 0.2773F));

		PartDefinition cube_r320 = leftFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(24, 77).addBox(-0.5F, -0.4615F, -0.2636F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8486F, 0.0623F, 11.3263F, 0.0349F, 0.3054F, 0.0F));

		PartDefinition cube_r321 = leftFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(70, 98).addBox(-0.9541F, -0.5818F, -1.9699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0388F, 0.3473F, 18.6094F, -0.079F, 0.1524F, -0.0144F));

		PartDefinition cube_r322 = leftFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(63, 98).addBox(-1.0041F, -0.5277F, -2.0193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.7985F, 0.1513F, 16.7342F, -0.0711F, 0.1958F, -0.019F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9264F, -0.7817F, -17.1414F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(101, 4).mirror().addBox(-0.2995F, -0.5786F, -0.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0365F, -1.3335F, 18.9148F, -0.9339F, -0.5474F, 0.3132F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(9, 87).mirror().addBox(-0.3133F, -0.5742F, -2.874F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0365F, -1.3335F, 18.9148F, -1.1421F, -0.8825F, 1.043F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(51, 89).mirror().addBox(-0.7399F, -0.4308F, -1.6155F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5668F, 0.9528F, 20.8625F, -0.8938F, -0.0562F, 0.0359F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(110, 109).mirror().addBox(-0.8277F, -1.2676F, 0.9631F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0666F, 1.7729F, 18.9993F, 0.8468F, -0.1871F, -0.0944F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(82, 114).mirror().addBox(-0.125F, -0.5F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8832F, 0.0301F, 6.3174F, -0.2791F, 1.4438F, -0.2769F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(114, 78).mirror().addBox(-0.9F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0736F, 0.0246F, 6.1606F, -0.0385F, 0.436F, -0.0163F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(114, 81).mirror().addBox(-0.1F, -0.9F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.7557F, 0.4019F, 5.5023F, -0.0429F, -0.6192F, 0.0249F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(49, 114).mirror().addBox(-0.1F, -0.9F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3108F, 0.3812F, 4.9091F, -0.0781F, -1.1071F, 0.0699F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(-0.757F, 0.1165F, -0.5718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5668F, 0.9528F, 20.8625F, 0.8084F, -0.0457F, 0.0535F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(50, 100).mirror().addBox(-0.7861F, -0.5593F, -0.4769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.3138F, 0.3473F, 19.0844F, 1.4054F, -0.0894F, -0.0758F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(114, 33).mirror().addBox(-0.4593F, -0.4515F, -0.7309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.8802F, -0.3396F, 0.5883F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(114, 30).mirror().addBox(-0.4593F, 0.0708F, -0.407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, -0.1234F, -0.3396F, 0.5883F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(114, 27).mirror().addBox(-0.4593F, 0.0952F, -1.0915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.018F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, -0.2106F, -0.3396F, 0.5883F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(113, 75).mirror().addBox(-0.4593F, 0.1888F, -0.473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, -1.6505F, -0.3396F, 0.5883F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(114, 84).mirror().addBox(-0.4593F, -0.2059F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.024F)).mirror(false)
				.texOffs(72, 113).mirror().addBox(-0.4593F, 0.1691F, -1.3687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.029F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, -0.2979F, -0.3396F, 0.5883F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(72, 113).mirror().addBox(-0.75F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5337F, -0.6113F, 10.2133F, 0.2421F, -0.1524F, 0.6413F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(-1.1396F, -0.7064F, -1.5533F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false)
				.texOffs(86, 82).mirror().addBox(-0.9646F, -0.7064F, -1.5533F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, -0.1059F, -0.3396F, 0.5883F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.35F, -1.275F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.352F, -1.2855F, 13.6342F, 0.7824F, -0.3287F, 0.5998F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-0.6479F, -0.2794F, 0.1823F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.7126F, -0.3287F, 0.5998F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(113, 63).mirror().addBox(-0.6479F, -1.5634F, 0.4118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 1.8558F, -0.3287F, 0.5998F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(113, 60).mirror().addBox(-0.6479F, -1.2453F, 0.1697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 1.594F, -0.3287F, 0.5998F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(113, 57).mirror().addBox(-0.6479F, -0.8579F, 0.0597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 1.3758F, -0.3287F, 0.5998F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(-0.6479F, -0.0039F, 0.207F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.4508F, -0.3287F, 0.5998F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(104, 83).mirror().addBox(-0.6479F, -0.4037F, 0.1749F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.0669F, -0.3287F, 0.5998F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(114, 87).mirror().addBox(-0.6479F, -0.4479F, -0.0039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.9395F, -0.3287F, 0.5998F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(113, 54).mirror().addBox(-0.6479F, -0.3299F, 0.0583F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 1.2886F, -0.3287F, 0.5998F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(104, 103).mirror().addBox(-0.325F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1624F, -0.8323F, 14.2377F, 0.5956F, -0.4581F, 0.7902F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(104, 79).mirror().addBox(-0.6479F, 0.2567F, 0.1958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.4923F, -1.0076F, 12.9706F, 0.669F, -0.3287F, 0.5998F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-0.325F, -0.525F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6182F, -0.4804F, 9.9171F, 0.1726F, 0.1594F, -0.852F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(66, 87).mirror().addBox(-0.225F, -0.6226F, -3.2361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8486F, 0.0623F, 11.3263F, 0.1381F, -0.2933F, -0.5029F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(108, 42).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1452F, 0.2779F, 5.2038F, -0.7265F, -0.632F, 0.753F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(108, 61).mirror().addBox(-0.7585F, -0.9046F, -0.3814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2928F, 0.4905F, 5.8713F, -0.3742F, -0.2844F, 0.4562F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(41, 108).mirror().addBox(-0.525F, -1.6F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7558F, 1.0731F, 6.4156F, -0.1926F, 0.101F, 0.3798F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(68, 116).mirror().addBox(-0.4138F, -0.4367F, -0.535F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.8161F, 0.6095F, 7.2996F, -0.2433F, -0.2844F, 0.4562F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(108, 57).mirror().addBox(-0.5785F, -1.1099F, -1.2079F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(90, 107).mirror().addBox(-0.6F, -1.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2137F, 0.7668F, 8.6402F, -0.1561F, -0.2844F, 0.4562F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(24, 116).mirror().addBox(-0.5F, -0.45F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(116, 22).mirror().addBox(-0.5F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.8446F, 0.5119F, 13.6772F, -0.0601F, -0.2844F, 0.4562F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(116, 19).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.5607F, 0.6014F, 12.6703F, -0.0426F, -0.2844F, 0.4562F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(116, 16).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 108).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.0103F, 0.3847F, 11.3064F, 0.0447F, -0.2844F, 0.4562F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(-0.5F, -1.0F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(108, 14).mirror().addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(108, 10).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4824F, 0.6461F, 9.2908F, 0.001F, -0.2844F, 0.4562F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(18, 87).mirror().addBox(-0.5F, -0.4476F, -3.2361F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8486F, 0.0623F, 11.3263F, -0.0176F, -0.3229F, 0.0003F));

		PartDefinition cube_r363 = rightFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(101, 12).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8837F, -0.7916F, 11.2581F, 0.2479F, 0.2887F, -1.0065F));

		PartDefinition cube_r364 = rightFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(63, 114).mirror().addBox(-0.7F, 0.025F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4264F, -2.9432F, 16.6399F, 0.0517F, -0.5666F, -0.0278F));

		PartDefinition cube_r365 = rightFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(77, 114).mirror().addBox(-0.725F, 0.0F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4264F, -2.9432F, 16.6399F, 0.4101F, -0.2006F, -0.0864F));

		PartDefinition cube_r366 = rightFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(103, 43).mirror().addBox(-0.725F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3737F, -1.9937F, 18.16F, 1.0101F, -0.4563F, -0.0575F));

		PartDefinition cube_r367 = rightFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(114, 72).mirror().addBox(-0.5F, 0.175F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.4264F, -3.0006F, 17.6246F, 0.9259F, -0.211F, 0.1562F));

		PartDefinition cube_r368 = rightFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(115, 111).mirror().addBox(-1.225F, -0.45F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7736F, -1.1905F, 11.4239F, 0.2396F, -0.1351F, -1.1114F));

		PartDefinition cube_r369 = rightFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(111, 24).mirror().addBox(-0.5F, -0.4929F, -0.0532F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4987F, 0.0012F, 7.4241F, -0.0436F, -0.3491F, 0.0F));

		PartDefinition cube_r370 = rightFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(109, 88).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3461F, -0.0254F, 7.005F, -0.1101F, -0.6095F, 0.0303F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(114, 90).mirror().addBox(-0.575F, -0.325F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5736F, -1.6247F, 13.7463F, 0.1226F, -0.2915F, -0.2773F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(24, 77).mirror().addBox(-0.5F, -0.4615F, -0.2636F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8486F, 0.0623F, 11.3263F, 0.0349F, -0.3054F, 0.0F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(70, 98).mirror().addBox(-0.0459F, -0.5818F, -1.9699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.0388F, 0.3473F, 18.6094F, -0.079F, -0.1524F, 0.0144F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(63, 98).mirror().addBox(0.0041F, -0.5277F, -2.0193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.7985F, 0.1513F, 16.7342F, -0.0711F, -0.1958F, 0.019F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.6214F, 3.3363F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(28, 110).mirror().addBox(-0.6F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1267F, -3.5803F, -14.8164F, -0.4646F, -0.4445F, 0.1838F));

		PartDefinition cube_r376 = Jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(109, 79).mirror().addBox(0.7894F, 1.8162F, -16.8233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.4201F, -0.1283F, 0.0286F));

		PartDefinition cube_r377 = Jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-0.275F, -0.45F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(105, 109).mirror().addBox(-0.275F, -0.45F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 102).mirror().addBox(-0.275F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 109).mirror().addBox(-0.275F, -0.65F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.6008F, -2.1812F, -7.594F, -0.0522F, -0.3059F, -0.2238F));

		PartDefinition cube_r378 = Jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(90, 103).mirror().addBox(-1.7358F, -1.0109F, 0.2024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5311F, -2.6111F, -9.3544F, -0.1416F, -0.4104F, -0.2179F));

		PartDefinition cube_r379 = Jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(103, 75).mirror().addBox(-0.5995F, -0.94F, 0.889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(95, 109).mirror().addBox(-0.5745F, -0.7413F, 0.2083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 94).mirror().addBox(-0.4745F, -0.6413F, -0.4917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 103).mirror().addBox(-0.4745F, -0.7413F, -1.1917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(103, 51).mirror().addBox(-0.5995F, -0.8413F, -1.9917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.2096F, -2.9734F, -11.0279F, -0.2247F, -0.4275F, -0.2195F));

		PartDefinition cube_r380 = Jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6121F, -3.6163F, -12.957F, -0.1994F, -0.5142F, -0.2923F));

		PartDefinition cube_r381 = Jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(10, 105).mirror().addBox(-0.6139F, -1.5404F, -0.6902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3054F, -3.5334F, -13.7602F, -0.2937F, -0.1153F, -0.362F));

		PartDefinition cube_r382 = Jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(5, 105).mirror().addBox(-0.7F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2507F, -4.0136F, -14.2458F, -0.0648F, -0.5493F, -0.3759F));

		PartDefinition cube_r383 = Jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(8, 109).mirror().addBox(0.7894F, -0.107F, -16.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.6106F, 0.8205F, 0.832F, -0.298F, -0.1283F, 0.0286F));

		PartDefinition cube_r384 = Jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(58, 109).mirror().addBox(-0.4625F, -0.5F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2512F, -3.1463F, -13.3687F, -0.225F, -0.386F, 0.0756F));

		PartDefinition cube_r385 = Jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(34, 109).mirror().addBox(-0.4018F, -0.1851F, -0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3054F, -3.5334F, -13.5602F, -0.2015F, 0.3496F, -0.1388F));

		PartDefinition cube_r386 = Jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(86, 87).mirror().addBox(-0.0324F, -0.0082F, -2.9822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.1106F, -2.1795F, -9.543F, -0.339F, -0.3752F, -0.0044F));

		PartDefinition cube_r387 = Jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(13, 77).mirror().addBox(-0.0324F, -0.3012F, -4.0497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1106F, -2.1795F, -9.543F, -0.2518F, -0.3752F, -0.0044F));

		PartDefinition cube_r388 = Jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-1.3242F, 0.0157F, -10.7995F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.2873F, -0.2443F, -0.0042F));

		PartDefinition cube_r389 = Jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-1.3242F, -1.4741F, -10.8331F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.1738F, -0.2443F, -0.0042F));

		PartDefinition cube_r390 = Jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(111, 21).mirror().addBox(0.7636F, 4.6836F, -15.3548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.6106F, 0.8205F, 0.832F, -0.6038F, -0.127F, 0.036F));

		PartDefinition cube_r391 = Jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(115, 114).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2565F, -2.8329F, -13.222F, -0.2373F, -0.127F, 0.036F));

		PartDefinition cube_r392 = Jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(110, 115).mirror().addBox(-0.4093F, 0.034F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.3054F, -3.5334F, -13.5602F, -0.3068F, 0.3527F, -0.119F));

		PartDefinition cube_r393 = Jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-0.987F, -0.3297F, -4.0029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.5061F, -0.192F, 0.0F));

		PartDefinition cube_r394 = Jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(102, 39).mirror().addBox(-0.9201F, -0.499F, -0.9289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -1.5795F, -0.1571F, 0.0F));

		PartDefinition cube_r395 = Jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(111, 18).mirror().addBox(-0.9201F, -0.55F, -1.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, 0.0436F, -0.1571F, 0.0F));

		PartDefinition cube_r396 = Jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(114, 39).mirror().addBox(-0.9201F, -0.5612F, -0.2927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, 0.096F, -0.1571F, 0.0F));

		PartDefinition cube_r397 = Jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.9201F, -0.7381F, -0.5444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.2269F, -0.1571F, 0.0F));

		PartDefinition cube_r398 = Jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(7, 101).mirror().addBox(-0.8399F, 0.3707F, -6.6642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.3229F, -0.1571F, 0.0F));

		PartDefinition cube_r399 = Jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(43, 100).mirror().addBox(-1.6107F, 0.4344F, -8.391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.3403F, -0.2793F, 0.0F));

		PartDefinition cube_r400 = Jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(98, 99).mirror().addBox(-1.6107F, -2.5504F, -8.2456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.0349F, -0.2793F, 0.0F));

		PartDefinition cube_r401 = Jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-0.8399F, -1.5807F, -6.719F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.1833F, -0.1571F, 0.0F));

		PartDefinition cube_r402 = Jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(36, 98).mirror().addBox(-0.8399F, -0.9494F, -4.9754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.2531F, -0.1571F, 0.0F));

		PartDefinition cube_r403 = Jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(109, 91).mirror().addBox(-0.9949F, -0.7826F, -3.0799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(77, 98).mirror().addBox(-0.9949F, -0.3826F, -3.0799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3106F, 0.8205F, 0.757F, -0.1133F, -0.192F, -0.0006F));

		PartDefinition cube_r404 = Jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(28, 110).addBox(-0.4F, -0.55F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8733F, -3.5803F, -14.8164F, -0.4646F, 0.4445F, -0.1838F));

		PartDefinition cube_r405 = Jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(109, 79).addBox(-1.7894F, 1.8162F, -16.8233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.4201F, 0.1283F, -0.0286F));

		PartDefinition cube_r406 = Jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(110, 0).addBox(-0.725F, -0.45F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(105, 109).addBox(-0.725F, -0.45F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 102).addBox(-0.725F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(100, 109).addBox(-0.725F, -0.65F, -1.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.6008F, -2.1812F, -7.594F, -0.0522F, 0.3059F, 0.2238F));

		PartDefinition cube_r407 = Jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(90, 103).addBox(0.7358F, -1.0109F, 0.2024F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5311F, -2.6111F, -9.3544F, -0.1416F, 0.4104F, 0.2179F));

		PartDefinition cube_r408 = Jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(103, 75).addBox(-0.4005F, -0.94F, 0.889F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(95, 109).addBox(-0.4255F, -0.7413F, 0.2083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 94).addBox(-0.5255F, -0.6413F, -0.4917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(55, 103).addBox(-0.5255F, -0.7413F, -1.1917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(103, 51).addBox(-0.4005F, -0.8413F, -1.9917F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2096F, -2.9734F, -11.0279F, -0.2247F, 0.4275F, 0.2195F));

		PartDefinition cube_r409 = Jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(103, 47).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6121F, -3.6163F, -12.957F, -0.1994F, 0.5142F, 0.2923F));

		PartDefinition cube_r410 = Jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(10, 105).addBox(-0.3861F, -1.5404F, -0.6902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3054F, -3.5334F, -13.7602F, -0.2937F, 0.1153F, 0.362F));

		PartDefinition cube_r411 = Jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(5, 105).addBox(-0.3F, -1.0F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.2507F, -4.0136F, -14.2458F, -0.0648F, 0.5493F, 0.3759F));

		PartDefinition cube_r412 = Jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(8, 109).addBox(-1.7894F, -0.107F, -16.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.6106F, 0.8205F, 0.832F, -0.298F, 0.1283F, -0.0286F));

		PartDefinition cube_r413 = Jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(58, 109).addBox(-0.5375F, -0.5F, -0.4625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2512F, -3.1463F, -13.3687F, -0.225F, 0.386F, -0.0756F));

		PartDefinition cube_r414 = Jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(34, 109).addBox(-0.5982F, -0.1851F, -0.5308F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3054F, -3.5334F, -13.5602F, -0.2015F, -0.3496F, 0.1388F));

		PartDefinition cube_r415 = Jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 87).addBox(-0.9675F, -0.0082F, -2.9822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(3.1106F, -2.1795F, -9.543F, -0.339F, 0.3752F, 0.0044F));

		PartDefinition cube_r416 = Jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(13, 77).addBox(-0.9675F, -0.3012F, -4.0497F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1106F, -2.1795F, -9.543F, -0.2518F, 0.3752F, 0.0044F));

		PartDefinition cube_r417 = Jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(84, 26).addBox(0.3242F, 0.0157F, -10.7995F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.2873F, 0.2443F, 0.0042F));

		PartDefinition cube_r418 = Jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(77, 83).addBox(0.3242F, -1.4741F, -10.8331F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.1738F, 0.2443F, 0.0042F));

		PartDefinition cube_r419 = Jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(111, 21).addBox(-1.7636F, 4.6836F, -15.3548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.6106F, 0.8205F, 0.832F, -0.6038F, 0.127F, -0.036F));

		PartDefinition cube_r420 = Jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(115, 114).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2565F, -2.8329F, -13.222F, -0.2373F, 0.127F, -0.036F));

		PartDefinition cube_r421 = Jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(110, 115).addBox(-0.5907F, 0.034F, -0.4728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3054F, -3.5334F, -13.5602F, -0.3068F, -0.3527F, 0.119F));

		PartDefinition cube_r422 = Jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(50, 73).addBox(-0.013F, -0.3297F, -4.0029F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.5061F, 0.192F, 0.0F));

		PartDefinition cube_r423 = Jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(102, 39).addBox(-0.0799F, -0.499F, -0.9289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -1.5795F, 0.1571F, 0.0F));

		PartDefinition cube_r424 = Jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(111, 18).addBox(-0.0799F, -0.55F, -1.2138F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, 0.0436F, 0.1571F, 0.0F));

		PartDefinition cube_r425 = Jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(114, 39).addBox(-0.0799F, -0.5612F, -0.2927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, 0.096F, 0.1571F, 0.0F));

		PartDefinition cube_r426 = Jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(0, 101).addBox(-0.0799F, -0.7381F, -0.5444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.2269F, 0.1571F, 0.0F));

		PartDefinition cube_r427 = Jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(7, 101).addBox(-0.1601F, 0.3707F, -6.6642F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.3229F, 0.1571F, 0.0F));

		PartDefinition cube_r428 = Jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(43, 100).addBox(0.6107F, 0.4344F, -8.391F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.3403F, 0.2793F, 0.0F));

		PartDefinition cube_r429 = Jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(98, 99).addBox(0.6107F, -2.5504F, -8.2456F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.0349F, 0.2793F, 0.0F));

		PartDefinition cube_r430 = Jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(57, 83).addBox(-0.1601F, -1.5807F, -6.719F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.1833F, 0.1571F, 0.0F));

		PartDefinition cube_r431 = Jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(36, 98).addBox(-0.1601F, -0.9494F, -4.9754F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.2531F, 0.1571F, 0.0F));

		PartDefinition cube_r432 = Jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(109, 91).addBox(-0.0051F, -0.7826F, -3.0799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(77, 98).addBox(-0.0051F, -0.3826F, -3.0799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3106F, 0.8205F, 0.757F, -0.1133F, 0.192F, 0.0006F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(69, 33).addBox(-0.5F, -0.9999F, -0.0107F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.0592F, 20.9438F, 0.067F, 0.1741F, 0.0116F));

		PartDefinition Tailbase_r1 = Tail1.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(9, 117).addBox(0.0F, -0.0371F, -0.0592F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0001F, 3.9893F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tail1.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(12, 112).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9999F, 2.9893F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tail1.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(-0.5F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 103).mirror().addBox(-0.5F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9999F, 0.9893F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Tailbase_r4 = Tail1.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(101, 103).addBox(0.5F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 103).addBox(0.5F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9999F, 0.9893F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Tailbase_r5 = Tail1.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(101, 103).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9999F, 0.9893F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.6004F, 0.0123F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3991F, 4.9766F, 0.0222F, 0.1309F, -0.0028F));

		PartDefinition Tailmiddlebase_r1 = Tail2.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(33, 112).addBox(0.0F, -2.325F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6004F, 6.0123F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tail2.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(21, 112).addBox(0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6004F, 4.0123F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tail2.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(18, 112).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6004F, 2.0123F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tail2.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(15, 112).mirror().addBox(-0.5F, -1.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 112).mirror().addBox(-0.5F, -1.9F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 112).mirror().addBox(-0.5F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 112).mirror().addBox(-0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6004F, 0.0123F, -0.0698F, 0.0F, -1.5708F));

		PartDefinition Tailmiddlebase_r5 = Tail2.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(15, 112).addBox(0.5F, -1.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 112).addBox(0.5F, -1.9F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 112).addBox(0.5F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 112).addBox(0.5F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6004F, 0.0123F, -0.0698F, 0.0F, 1.5708F));

		PartDefinition Tailmiddlebase_r6 = Tail2.addOrReplaceChild("Tailmiddlebase_r6", CubeListBuilder.create().texOffs(15, 112).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6004F, 0.0123F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tail2.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(0, 115).addBox(0.0F, 2.0629F, 5.6408F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 117).addBox(0.0F, 1.2629F, 3.6408F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 117).addBox(0.0F, 0.6629F, 1.8408F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3992F, -0.9873F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 57).addBox(-0.5F, -0.4994F, -0.069F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.1004F, 6.9873F, 0.1094F, 0.1309F, -0.0028F));

		PartDefinition Tailmiddleend_r1 = Tail3.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(3, 117).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4994F, 4.931F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tail3.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(82, 117).addBox(0.0F, 4.9629F, 11.1408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 117).addBox(0.0F, 4.2629F, 9.4408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 79).addBox(0.0F, 2.6629F, 7.5408F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4996F, -7.9746F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tail3.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(116, 103).addBox(0.0F, -1.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4994F, 2.931F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tail3.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(36, 112).mirror().addBox(-0.5F, -1.35F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 112).mirror().addBox(-0.5F, -1.35F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 112).mirror().addBox(-0.5F, -1.35F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4994F, 1.031F, -0.0873F, 0.0F, -1.5708F));

		PartDefinition Tailmiddleend_r4 = Tail3.addOrReplaceChild("Tailmiddleend_r4", CubeListBuilder.create().texOffs(36, 112).addBox(0.5F, -1.35F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 112).addBox(0.5F, -1.35F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 112).addBox(0.5F, -1.35F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4994F, 1.031F, -0.0873F, 0.0F, 1.5708F));

		PartDefinition Tailmiddleend_r5 = Tail3.addOrReplaceChild("Tailmiddleend_r5", CubeListBuilder.create().texOffs(36, 112).addBox(0.0F, -2.15F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4994F, 1.031F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailfluke1 = Tail3.addOrReplaceChild("Tailfluke1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -2.4009F, -0.0521F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(25, 37).addBox(-0.5F, -0.4504F, -0.0534F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0509F, 5.8479F, 0.219F, 0.1308F, -0.0056F));

		PartDefinition Tailend_r1 = Tail4.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(76, 117).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4504F, 4.9466F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tail4.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(42, 84).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4504F, 2.9466F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tail4.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(6, 117).mirror().addBox(-0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4504F, 0.9466F, -0.0698F, 0.0F, -1.5708F));

		PartDefinition Tailend_r4 = Tail4.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(6, 117).addBox(0.5F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4504F, 0.9466F, -0.0698F, 0.0F, 1.5708F));

		PartDefinition Tailend_r5 = Tail4.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(6, 117).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4504F, 0.9466F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tail4.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(118, 9).addBox(0.0F, 6.9629F, 16.5408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 117).addBox(0.0F, 6.3629F, 14.7408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(117, 96).addBox(0.0F, 5.6629F, 12.8408F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5505F, -13.8225F, 0.4189F, 0.0F, 0.0F));

		PartDefinition Tailfluke2 = Tail4.addOrReplaceChild("Tailfluke2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.9728F, -0.6426F, 0.2759F, 0.0F, 0.0F));

		PartDefinition Tailfluke3 = Tailfluke2.addOrReplaceChild("Tailfluke3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.0F, 6.0F, -1.0826F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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