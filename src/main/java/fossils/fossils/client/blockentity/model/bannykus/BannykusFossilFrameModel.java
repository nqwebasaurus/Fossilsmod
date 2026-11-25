package fossils.fossils.client.blockentity.model.bannykus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BannykusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neckbase;
	private final ModelPart neck;
	private final ModelPart Neckmiddle;
	private final ModelPart neck2;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart Neckend;
	private final ModelPart Neckend2;
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

	public BannykusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neckbase = this.Bodyfront.getChild("Neckbase");
		this.neck = this.Neckbase.getChild("neck");
		this.Neckmiddle = this.neck.getChild("Neckmiddle");
		this.neck2 = this.Neckmiddle.getChild("neck2");
		this.neck5 = this.neck2.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck3 = this.neck8.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.Neckend = this.neck4.getChild("Neckend");
		this.Neckend2 = this.Neckend.getChild("Neckend2");
		this.Head = this.Neckend2.getChild("Head");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.4F, -45.0F, 3.5F, 1.0F, 45.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.7494F, -3.0784F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4104F, -32.2371F, -25.8983F, 0.1731F, -0.0227F, 1.6997F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.8103F, -4.7629F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.4104F, -32.2371F, -25.8983F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-13.1F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, -32.0F, 4.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.4454F, -6.8978F, 0.1196F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 31).addBox(-0.15F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.325F, 0.7351F, 2.7322F, 0.0174F, 0.0436F, -0.0008F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 25).addBox(-0.475F, -2.125F, -4.6F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0286F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(77, 57).addBox(-0.465F, -1.8F, 2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 7).addBox(-0.175F, -0.175F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.29F, 0.4078F, -0.324F, 0.0F, 0.0436F, 0.0019F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 2).addBox(-0.465F, -1.825F, -3.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r9 = body2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 8).addBox(-0.465F, -1.85F, -3.425F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -6.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition cube_r10 = body3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 34).addBox(-0.49F, -1.775F, -3.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1304F, -5.8428F, 0.0989F, 0.1303F, 0.0129F));

		PartDefinition cube_r11 = Bodyfront.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 21).addBox(-0.515F, 0.025F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 16).addBox(-0.515F, 0.025F, -5.975F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3433F, -5.038F, 0.2712F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Neckbase.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(53, 63).addBox(-0.515F, -0.3737F, 0.4118F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -5.2422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7223F, -4.4844F, -0.4694F, 0.0975F, -0.0007F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 46).addBox(-0.49F, 0.018F, 0.0976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 43).addBox(-0.49F, 0.018F, -3.6024F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -3.6728F, -0.3287F, 0.0967F, 0.013F));

		PartDefinition cube_r14 = Neckmiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 63).addBox(-0.465F, 0.0171F, -3.5025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.585F, 0.1571F, 0.0F, 0.0F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.6321F, 0.1219F, 0.0186F));

		PartDefinition cube_r15 = neck2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(73, 24).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.01F, 0.7094F, 0.0234F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(71, 22).addBox(-0.49F, 0.1F, -3.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.3037F, 0.0547F, 0.0285F));

		PartDefinition cube_r17 = neck5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 77).addBox(-0.49F, 0.075F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 75).addBox(-0.49F, 0.075F, -3.35F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -3.0F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(77, 54).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0013F, 1.6234F, 0.4329F, 0.7071F, 0.0315F, 0.015F));

		PartDefinition cube_r19 = neck6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 52).addBox(-0.49F, 0.25F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4453F, 0.0315F, 0.015F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3148F, -2.7081F, 0.3949F, 0.0068F, 0.0973F));

		PartDefinition cube_r20 = neck7.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(61, 79).addBox(-0.49F, 0.175F, -3.125F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.29F, -2.7078F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r21 = neck8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 79).addBox(-0.49F, 0.125F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck3 = neck8.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2019F, -2.6325F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r22 = neck3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 63).addBox(-0.49F, 0.1F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.0053F, -0.7767F, 0.4451F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.727F, -2.4512F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r23 = neck4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 42).addBox(-0.49F, 0.075F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.5737F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Neckend.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, 0.0513F, -0.1832F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend2 = Neckend.addOrReplaceChild("Neckend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -2.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Neckend2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 63).addBox(-0.5F, 0.1013F, -1.1332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3225F, -3.1352F, 0.3839F, 0.0153F, -0.1384F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5854F, -0.9054F, 0.1309F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.0936F, -3.1747F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.0936F, -3.1747F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4188F, 4.5863F, -9.5287F, -0.1653F, 0.0167F, -0.2711F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2602F, 7.5006F, 1.963F, -0.6549F, 0.1175F, 0.1384F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2198F, 4.6418F, 0.0821F, 0.1633F, 0.0393F, 0.2329F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3988F, 4.5863F, -9.5287F, 0.7946F, -0.0167F, 0.2711F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2602F, 7.5006F, 1.963F, -0.9167F, -0.1175F, -0.1384F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2198F, 4.6418F, 0.0821F, 0.1633F, -0.0393F, -0.2329F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2592F, 5.3167F, -11.2248F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2392F, 5.3167F, -11.2248F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5F, 0.0698F, 0.1594F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.0944F, 0.0869F, 0.0082F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(18, 64).addBox(-0.5F, 0.6279F, -0.197F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5776F, 3.9473F, 0.0613F, 0.0417F, 0.0127F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, -0.0347F, 0.1308F, -0.0045F));

		PartDefinition cube_r26 = Tailmiddlebase.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(29, 6).addBox(-0.475F, 0.175F, 5.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(23, 0).addBox(-0.475F, 0.175F, -1.425F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r27 = tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 39).addBox(-0.5F, -0.825F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.025F, 0.5104F, 5.766F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(41, 34).addBox(-0.475F, 0.175F, 5.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.2173F, 0.0F, 0.0F));

		PartDefinition cube_r29 = Tailmiddleend.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5F, 0.1F, -0.425F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.2126F, 0.0F, 0.0F));

		PartDefinition cube_r30 = Tailend.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 47).addBox(-0.5F, 0.15F, 4.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 42).addBox(-0.5F, 0.15F, -1.35F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, 0.1602F, 0.0F, 0.0F));

		PartDefinition cube_r31 = Tailend2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(41, 42).addBox(-0.5F, 0.175F, -0.05F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, 0.0031F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Tailend3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, 0.125F, 5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 24).addBox(-0.5F, 0.125F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, 0.169F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Tailend4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, 0.1166F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Tailend5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, 0.15F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, 0.2039F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Tailend6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 55).addBox(-0.5F, 0.1F, 5.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 50).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, 0.1346F, -0.0865F, -0.0117F));

		PartDefinition cube_r36 = Tailend7.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(30, 50).addBox(-0.5F, 0.125F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition cube_r37 = Tailend8.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 55).addBox(-0.5F, 0.1F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 50).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend9 = Tailend8.addOrReplaceChild("Tailend9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 6.0F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r38 = Tailend9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 64).addBox(-0.5F, 0.1F, -0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.3416F, -0.8517F, -1.0303F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 15.6816F, 11.9575F, 1.7579F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 19.8058F, -2.8029F, -1.2465F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 0.4255F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.0195F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.3416F, -0.8517F, -0.7248F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 15.6816F, 11.9575F, 1.6706F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 19.8058F, -2.8029F, -1.8137F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 1.6472F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.325F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7816F, -0.6234F, -0.5226F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7816F, -0.6234F, -0.5226F, -0.0524F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 117, 117);
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