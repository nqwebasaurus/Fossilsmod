package fossils.fossils.client.blockentity.model.bicentenaria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BicentenariaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart Neckend;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Tailbase;
	private final ModelPart tail2;
	private final ModelPart Tailmiddlebase;
	private final ModelPart tail;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Tailend2;
	private final ModelPart Tailend3;
	private final ModelPart Tailend4;
	private final ModelPart Tailend5;
	private final ModelPart Tailend6;
	private final ModelPart Tailend7;
	private final ModelPart Tailend8;
	private final ModelPart Tailend9;
	private final ModelPart Tailend10;
	private final ModelPart Tailend11;
	private final ModelPart Tailend12;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Rightankle;
	private final ModelPart Rightfoot;
	private final ModelPart Rightfoot2;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Leftankle;
	private final ModelPart Leftfoot;
	private final ModelPart Leftfoot2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public BicentenariaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.Bodyfront = this.body2.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck3 = this.neck6.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.Neckend = this.neck4.getChild("Neckend");
		this.Head = this.Neckend.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.bone = this.Bodyfront.getChild("bone");
		this.bone3 = this.Bodyfront.getChild("bone3");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.tail2 = this.Tailbase.getChild("tail2");
		this.Tailmiddlebase = this.tail2.getChild("Tailmiddlebase");
		this.tail = this.Tailmiddlebase.getChild("tail");
		this.Tailmiddleend = this.tail.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Tailend4 = this.Tailend3.getChild("Tailend4");
		this.Tailend5 = this.Tailend4.getChild("Tailend5");
		this.Tailend6 = this.Tailend5.getChild("Tailend6");
		this.Tailend7 = this.Tailend6.getChild("Tailend7");
		this.Tailend8 = this.Tailend7.getChild("Tailend8");
		this.Tailend9 = this.Tailend8.getChild("Tailend9");
		this.Tailend10 = this.Tailend9.getChild("Tailend10");
		this.Tailend11 = this.Tailend10.getChild("Tailend11");
		this.Tailend12 = this.Tailend11.getChild("Tailend12");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Rightankle = this.Rightshin.getChild("Rightankle");
		this.Rightfoot = this.Rightankle.getChild("Rightfoot");
		this.Rightfoot2 = this.Rightfoot.getChild("Rightfoot2");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Leftankle = this.Leftshin.getChild("Leftankle");
		this.Leftfoot = this.Leftankle.getChild("Leftfoot");
		this.Leftfoot2 = this.Leftfoot.getChild("Leftfoot2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -30.0F, 4.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -4.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.0F, -14.6F, -14.4F, 0.1304F, 0.0114F, 1.4843F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.2F, -3.2F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.0F, -18.8F, -14.4F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-7.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -23.0F, 5.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -14.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.1954F, -6.8978F, 0.2505F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 7).addBox(-0.5F, -2.1F, -4.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0111F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 77).addBox(-0.49F, -1.8F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 79).addBox(-0.49F, -1.8F, 4.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0693F, 0.0526F, -0.1276F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-0.49F, -1.8F, -3.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.1309F, 0.049F, -0.0376F));

		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 32).addBox(-0.49F, -1.8F, -3.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.1243F, 0.0433F, 0.0054F));

		PartDefinition cube_r8 = Bodyfront.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 11).addBox(-0.49F, -0.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 8).addBox(-0.49F, -0.05F, -5.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3433F, -5.038F, 0.4517F, 0.1573F, 0.0759F));

		PartDefinition cube_r9 = Neckbase.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(50, 48).addBox(-0.49F, -0.3987F, -0.8382F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -5.2422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8863F, -5.5903F, -0.4422F, 0.158F, -0.0744F));

		PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 79).addBox(-0.565F, 0.018F, -1.0524F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 77).addBox(-0.565F, 0.018F, -3.7524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -2.6729F, -0.2759F, 0.0735F, 0.0679F));

		PartDefinition cube_r11 = Neckmiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 30).addBox(-0.49F, 0.0171F, -3.7025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.6053F, -0.4594F, -0.2766F));

		PartDefinition cube_r12 = neck2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 79).addBox(-0.49F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(18, 77).addBox(-0.49F, 0.1F, -3.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.1266F, -0.3276F, -0.1266F));

		PartDefinition cube_r13 = neck5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(80, 7).addBox(-0.49F, -0.725F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(78, 5).addBox(-0.49F, -0.725F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7753F, -2.792F, 0.4102F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.275F, -2.7F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(87, 91).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1974F, 0.7479F, -1.3174F, 0.3708F, -0.02F, -0.3499F));

		PartDefinition neck3 = neck6.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.415F, 0.5639F, -1.7429F, -0.2049F, -0.3431F, -0.6119F));

		PartDefinition cube_r15 = neck3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 74).addBox(-0.5F, -0.5F, 2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(36, 72).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0789F, 1.3965F, -2.5496F, 0.446F, -0.063F, -0.0301F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.727F, -2.7012F, 0.2078F, -0.339F, -0.1652F));

		PartDefinition cube_r16 = neck4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 77).addBox(-0.49F, 0.1F, -1.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.409F, -0.383F, -0.2566F));

		PartDefinition cube_r17 = Neckend.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(73, 26).addBox(-0.5F, 0.1013F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0807F, -2.5005F, -0.1754F, -0.092F, -0.333F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6275F, -0.077F, 0.829F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.4936F, -2.4747F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.4936F, -2.4747F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2443F, 6.7668F, -7.0129F, 0.1932F, 0.1506F, -0.5033F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8485F, 6.5367F, 2.9241F, -0.7452F, -0.0902F, -0.086F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9519F, 5.7281F, -0.1712F, 0.3378F, 0.0393F, 0.2329F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2243F, 6.7668F, -7.0129F, -0.4192F, 0.3912F, 0.6941F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8485F, 6.5367F, 2.9241F, -0.9254F, -0.1175F, -0.1384F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9519F, 5.7281F, -0.1712F, 0.3378F, -0.0393F, -0.2329F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3093F, 5.3514F, -8.6255F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2893F, 5.3514F, -8.6255F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(31, 62).addBox(-0.5F, 0.0198F, -0.5406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(34, 65).addBox(-0.5F, 0.0198F, 3.1594F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.1203F, 0.0F, 0.0F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, 0.5279F, -0.197F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 66).addBox(-0.5F, 0.5279F, 3.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4822F, 3.7698F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, 0.1407F, -0.0864F, -0.0122F));

		PartDefinition cube_r18 = Tailmiddlebase.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.1F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.2533F, -0.0422F, -0.0109F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 45).addBox(-0.5F, -0.85F, 5.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 40).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7272F, -0.281F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.0429F, -0.0436F, -0.0019F));

		PartDefinition cube_r20 = Tailmiddleend.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.0555F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Tailend.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 45).addBox(-0.5F, 0.1F, 4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(20, 40).addBox(-0.5F, 0.1F, -1.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, 0.1777F, 0.0086F, 0.0015F));

		PartDefinition cube_r22 = Tailend2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(35, 40).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, 0.1253F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Tailend3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(46, 5).addBox(-0.5F, 0.05F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 0).addBox(-0.5F, 0.05F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, 0.1342F, 0.0519F, 0.007F));

		PartDefinition cube_r24 = Tailend4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(46, 13).addBox(-0.5F, 0.1F, 5.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(41, 8).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, 0.1864F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Tailend5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(9, 60).addBox(-0.5F, 0.1F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(5, 56).addBox(-0.5F, 0.1F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, 0.0462F, 0.0784F, 0.015F));

		PartDefinition cube_r26 = Tailend6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, -0.0397F, 0.1132F, 0.0059F));

		PartDefinition cube_r27 = Tailend7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(41, 24).addBox(-0.5F, 0.1F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1307F, 0.0859F, -0.0265F));

		PartDefinition cube_r28 = Tailend8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 37).addBox(-0.5F, 0.15F, 5.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 32).addBox(-0.5F, 0.15F, -0.45F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend9 = Tailend8.addOrReplaceChild("Tailend9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 6.0F, -0.1588F, 0.1465F, -0.0234F));

		PartDefinition cube_r29 = Tailend9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, 0.125F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend10 = Tailend9.addOrReplaceChild("Tailend10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1764F, 0.1461F, -0.0259F));

		PartDefinition cube_r30 = Tailend10.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 48).addBox(-0.5F, 0.125F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend11 = Tailend10.addOrReplaceChild("Tailend11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r31 = Tailend11.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(40, 53).addBox(-0.15F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.35F, 0.9594F, 5.4694F, 0.0358F, 0.2268F, 0.0081F));

		PartDefinition cube_r32 = Tailend11.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 48).addBox(-0.5F, 0.15F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend12 = Tailend11.addOrReplaceChild("Tailend12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.2612F, 0.2033F, -0.1004F));

		PartDefinition cube_r33 = Tailend12.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -0.2805F, -0.0688F, -0.3321F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 13.1579F, 3.6721F, 1.4525F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 16.9746F, -2.1439F, -1.072F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.097F, 0.0929F, 0.3382F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.5868F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -0.2805F, -0.0688F, -1.2048F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 13.1579F, 3.6721F, 1.9761F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 16.9746F, -2.1439F, -1.5956F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.097F, 0.0929F, 0.6F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.0195F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9377F, -1.5085F, -0.4755F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9377F, -1.5085F, -0.4755F, -0.0524F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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