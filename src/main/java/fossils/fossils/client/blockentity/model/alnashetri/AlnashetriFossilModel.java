package fossils.fossils.client.blockentity.model.alnashetri;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AlnashetriFossilModel extends SkullModelBase {
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

	public AlnashetriFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -21.1954F, -6.8978F, -0.1422F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 113).addBox(0.0F, -1.915F, -0.051F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 1.0353F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 78).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8556F, -1.0156F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 104).addBox(0.0F, -4.9F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 0).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 0).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 25).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, 0.0587F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(105, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(47, 82).mirror().addBox(-4.8817F, -0.4515F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(112, 2).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 2).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(102, 0).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 82).addBox(0.8817F, -0.4515F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(105, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(79, 66).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 109).addBox(0.01F, -2.5092F, -0.1729F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2961F, -1.2479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 107).addBox(0.01F, -2.2814F, -0.0939F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(23, 110).addBox(0.01F, -2.6793F, -2.0269F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(43, 105).addBox(0.01F, -2.1913F, -0.0205F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(99, 44).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.3837F, -0.0015F, 0.2254F, -1.5001F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 54).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.3837F, 0.1163F, 0.1935F, -0.9476F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 23).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.3837F, 0.185F, 0.0967F, -0.4812F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(85, 0).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0083F, 0.356F, -1.4973F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(99, 56).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.1961F, 0.2991F, -0.9281F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(110, 75).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.3025F, 0.1565F, -0.4664F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(109, 0).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.318F, 0.1649F, -0.4465F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.2066F, 0.3135F, -0.9075F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 23).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.0091F, 0.3734F, -1.4796F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 23).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.0091F, -0.3734F, 1.4796F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.1F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 14.4028F, -3.3208F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 21).addBox(-2.49F, -2.7373F, 4.5651F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.6812F, -11.648F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 42).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.2066F, -0.3135F, 0.9075F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(109, 0).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.318F, -0.1649F, 0.4465F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(110, 75).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.3025F, -0.1565F, 0.4664F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(99, 56).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.1961F, -0.2991F, 0.9281F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(85, 0).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0083F, -0.356F, 1.4973F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 23).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.3837F, 0.185F, -0.0967F, 0.4812F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(99, 54).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.3837F, 0.1163F, -0.1935F, 0.9476F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(99, 44).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.3837F, -0.0015F, -0.2254F, 1.5001F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(52, 39).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(105, 17).addBox(0.01F, -2.2961F, -0.023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(110, 109).addBox(0.01F, -1.75F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2517F, -5.3275F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(67, 53).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, -0.0123F, 0.2702F, -1.4525F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(99, 58).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, 0.1314F, 0.2371F, -0.8941F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(110, 77).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, 0.218F, 0.1291F, -0.4272F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(110, 105).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, 0.2282F, 0.1493F, -0.3938F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(61, 68).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, -0.025F, 0.2893F, -1.4239F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(99, 60).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, 0.1312F, 0.2597F, -0.8621F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, -0.0322F, 0.238F, -1.443F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 107).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.1801F, 0.1288F, -0.4176F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.0971F, 0.22F, -0.8874F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(77, 99).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.0971F, -0.22F, 0.8874F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(110, 107).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.1801F, -0.1288F, 0.4176F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(73, 8).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, -0.0322F, -0.238F, 1.443F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(99, 60).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, 0.1312F, -0.2597F, 0.8621F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 68).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, -0.025F, -0.2893F, 1.4239F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(110, 105).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, 0.2282F, -0.1493F, 0.3938F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(110, 77).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, 0.218F, -0.1291F, 0.4272F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(99, 58).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, 0.1314F, -0.2371F, 0.8941F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 53).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, -0.0123F, -0.2702F, 1.4525F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(23, 0).addBox(-2.5F, -2.0F, -4.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 13.6033F, -3.2664F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(36, 25).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(46, 105).addBox(0.01F, -2.1513F, -0.0922F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(110, 101).addBox(0.01F, -2.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1535F, -3.5038F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.186F, 0.0858F, 0.0161F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(76, 66).addBox(0.01F, -1.5818F, -0.0391F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(110, 71).addBox(0.01F, -1.6018F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0872F, -3.9452F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 6).mirror().addBox(-4.6F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5488F, 9.0065F, -7.7952F, 0.4781F, 0.9014F, 0.7646F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.706F, 9.1821F, -8.4505F, 0.5294F, 0.8005F, 0.8702F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-5.8F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7913F, 9.2429F, -7.0583F, 0.5962F, 1.0595F, 0.6736F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 14).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.0663F, 0.1707F, -0.8728F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, -0.0321F, 0.1802F, -1.4224F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(87, 41).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.1306F, 0.0985F, -0.4027F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.018F, 0.3101F, -1.4727F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(101, 32).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.1785F, 0.2555F, -0.9115F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.2675F, 0.125F, -0.4498F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(79, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.2675F, -0.125F, 0.4498F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(101, 32).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.1785F, -0.2555F, 0.9115F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(70, 0).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.018F, -0.3101F, 1.4727F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(87, 41).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.1306F, -0.0985F, 0.4027F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 7).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, -0.0321F, -0.1802F, 1.4224F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(73, 14).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.0663F, -0.1707F, 0.8728F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(64, 16).addBox(-0.2F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8113F, 9.2429F, -7.0583F, 0.5962F, -1.0595F, -0.6736F));

		PartDefinition cube_r79 = Bodyfront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(82, 52).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 9.1821F, -8.4505F, 0.5294F, -0.8005F, -0.8702F));

		PartDefinition cube_r80 = Bodyfront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(73, 6).addBox(-0.4F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5688F, 9.0065F, -7.7952F, 0.4781F, -0.9014F, -0.7646F));

		PartDefinition cube_r81 = Bodyfront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 57).addBox(-0.49F, -0.75F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3433F, -5.038F, 0.2722F, 0.0841F, 0.0234F));

		PartDefinition cube_r82 = Neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(60, 111).addBox(0.01F, -1.45F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4338F, -0.093F, -0.2712F, 0.0F, 0.0F));

		PartDefinition cube_r83 = Neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(18, 101).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.2193F, 0.0754F, -0.9899F));

		PartDefinition cube_r84 = Neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.15F, 0.1773F, -1.5259F));

		PartDefinition cube_r85 = Neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(111, 44).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.2242F, -0.0543F, -0.5365F));

		PartDefinition cube_r86 = Neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(73, 12).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.6035F, -4.3481F, 0.1541F, 0.2644F, -1.525F));

		PartDefinition cube_r87 = Neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.6035F, -4.3481F, 0.2677F, 0.1483F, -0.9845F));

		PartDefinition cube_r88 = Neckbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.6035F, -4.3481F, 0.2992F, -0.0096F, -0.5389F));

		PartDefinition cube_r89 = Neckbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(46, 69).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.1496F, 0.1679F, -1.4736F));

		PartDefinition cube_r90 = Neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(101, 30).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.2141F, 0.0676F, -0.9379F));

		PartDefinition cube_r91 = Neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(74, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.2161F, -0.0592F, -0.4837F));

		PartDefinition cube_r92 = Neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(74, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.2161F, 0.0592F, 0.4837F));

		PartDefinition cube_r93 = Neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(101, 30).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.2141F, -0.0676F, 0.9379F));

		PartDefinition cube_r94 = Neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(46, 69).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.1496F, -0.1679F, 1.4736F));

		PartDefinition cube_r95 = Neckbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(111, 58).addBox(0.01F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7866F, -2.5173F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(57, 111).addBox(0.01F, -2.0082F, 0.0022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1314F, -4.6422F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(111, 56).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.6035F, -4.3481F, 0.2992F, 0.0096F, 0.5389F));

		PartDefinition cube_r98 = Neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(25, 101).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.6035F, -4.3481F, 0.2677F, -0.1483F, 0.9845F));

		PartDefinition cube_r99 = Neckbase.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(73, 12).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.6035F, -4.3481F, 0.1541F, -0.2644F, 1.525F));

		PartDefinition cube_r100 = Neckbase.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(111, 44).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.2242F, 0.0543F, 0.5365F));

		PartDefinition cube_r101 = Neckbase.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(73, 10).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.15F, -0.1773F, 1.5259F));

		PartDefinition cube_r102 = Neckbase.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(18, 101).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.2193F, -0.0754F, 0.9899F));

		PartDefinition cube_r103 = Neckbase.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(61, 62).addBox(-1.0F, -0.1069F, -0.6945F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 5.9743F, -6.4272F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r104 = Neckbase.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 29).addBox(-1.5F, 0.4264F, -1.6059F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 4.4622F, -6.6583F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r105 = Neckbase.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(48, 62).addBox(-0.49F, -1.0987F, 0.4368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -5.2422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7223F, -4.4844F, -0.9531F, 0.0566F, -0.0664F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(11, 113).addBox(0.01F, -1.382F, -0.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4598F, -3.8812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(5, 111).addBox(0.01F, -2.182F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r108 = neck.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -3.8816F, -0.3664F, -0.1739F, -0.0076F));

		PartDefinition cube_r109 = neck.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.315F, -1.8967F, -0.3221F, -0.1304F, -0.0115F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(35, 83).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.315F, -1.8967F, -0.3221F, 0.1304F, 0.0115F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(17, 86).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -3.8816F, -0.3664F, 0.1739F, 0.0076F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(31, 70).addBox(-0.49F, -0.682F, -3.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -3.6729F, -0.8112F, 0.0F, 0.0F));

		PartDefinition cube_r113 = Neckmiddle.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(111, 52).addBox(0.01F, -1.2328F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -4.0526F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = Neckmiddle.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(111, 40).addBox(0.01F, -1.8828F, -1.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(66, 23).addBox(-0.49F, -0.6829F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r115 = Neckmiddle.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(23, 103).mirror().addBox(0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.2072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition cube_r116 = Neckmiddle.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(18, 103).mirror().addBox(-0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.295F, 0.6432F, -3.6945F, -0.1563F, -0.1304F, -0.0115F));

		PartDefinition cube_r117 = Neckmiddle.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(18, 103).addBox(0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.315F, 0.6432F, -3.6945F, -0.1563F, 0.1304F, 0.0115F));

		PartDefinition cube_r118 = Neckmiddle.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(23, 103).addBox(-0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.2072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(113, 28).addBox(0.0F, -1.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 71).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(97, 18).mirror().addBox(0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r122 = neck2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(97, 18).addBox(-0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(45, 113).addBox(0.0F, -0.925F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 113).addBox(0.0F, -1.125F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 14).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 97).mirror().addBox(0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 46).mirror().addBox(-0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r126 = neck5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(97, 46).addBox(0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(45, 97).addBox(-0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck6.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(63, 113).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r128 = neck6.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 6).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r129 = neck6.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r130 = neck6.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(97, 82).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck3 = neck6.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8417F, -1.8531F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(69, 77).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0053F, -0.6267F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r132 = neck3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(113, 71).addBox(0.0F, -1.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1738F, -0.0083F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r133 = neck3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(39, 99).mirror().addBox(-0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.5937F, 1.2461F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r134 = neck3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(39, 99).addBox(0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5937F, 1.2461F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.727F, -2.3012F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r135 = neck4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(111, 113).addBox(0.0F, -0.8F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 113).addBox(0.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1487F, -1.4678F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(10, 78).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 102).mirror().addBox(0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 100).mirror().addBox(0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.695F, 0.8517F, -1.4114F, 0.1404F, -0.1304F, -0.0115F));

		PartDefinition cube_r138 = neck4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 100).addBox(-0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(95, 102).addBox(-0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.715F, 0.8517F, -1.4114F, 0.1404F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.9178F, 0.025F, -0.0305F));

		PartDefinition cube_r139 = Neckend.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(88, 84).addBox(0.0F, -1.4987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Neckend.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(5, 101).mirror().addBox(0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition cube_r141 = Neckend.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(5, 101).addBox(-0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition cube_r142 = Neckend.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(31, 88).addBox(-0.5F, -0.5987F, 0.8668F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8759F, -1.483F, 0.1166F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(42, 0).addBox(-1.5F, -2.0668F, 0.4896F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 18).addBox(-1.5F, -2.1968F, -2.1572F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(37, 33).addBox(-1.5F, -2.6932F, -2.4398F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(83, 43).addBox(-1.5F, -0.6F, -0.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.9172F, -1.3092F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 55).addBox(-1.5F, -4.21F, 0.6662F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(19, 82).addBox(-1.5F, -0.7227F, 0.4926F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(86, 11).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5809F, -3.0681F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 77).addBox(-1.5F, -1.7705F, -0.3979F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(70, 2).addBox(-1.5F, -1.1F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.6515F, -4.0493F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -0.9942F, -0.8895F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.2419F, -13.6989F, 3.0718F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(106, 59).addBox(-0.5F, -0.3569F, -0.2721F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.2419F, -13.6989F, -2.3387F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(90, 46).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2821F, -13.0242F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 56).addBox(-0.5F, -0.9444F, -0.6961F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2419F, -13.6989F, -1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(94, 31).addBox(-1.0F, -0.9477F, -0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(38, 78).addBox(-0.5F, -0.9477F, -3.9575F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.079F, -8.3825F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 72).addBox(-1.0F, -0.925F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3107F, -6.5533F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(81, 19).addBox(-0.5F, 0.075F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5188F, -7.1386F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(20, 65).addBox(-1.495F, 0.0131F, -1.9313F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.1401F, -3.4877F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(97, 90).addBox(-0.5F, -0.0125F, 0.0056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r161 = Head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(65, 82).addBox(-1.5F, -0.0026F, 0.0381F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.1401F, -3.4877F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r162 = Head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(54, 106).addBox(-0.5F, -1.5246F, -0.0289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(110, 62).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.2062F, 0.0113F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(110, 68).addBox(-0.5F, -0.2216F, 1.4648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5814F, -0.9765F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Lowerjawbase.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(56, 88).mirror().addBox(-0.5F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(56, 88).addBox(1.7F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 0.8546F, 0.1171F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Lowerjawbase.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(88, 64).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition cube_r167 = Lowerjawbase.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition cube_r168 = Lowerjawbase.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r169 = Lowerjawbase.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(105, 22).mirror().addBox(-0.5F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(105, 22).addBox(1.7F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -2.532F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Lowerjawbase.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(105, 50).mirror().addBox(-0.5F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(105, 50).addBox(1.7F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -2.532F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Lowerjawbase.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(100, 5).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(100, 5).addBox(1.7F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.5471F, -3.1056F, -1.5926F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Lowerjawbase.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(13, 100).mirror().addBox(-0.5F, -0.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(13, 100).addBox(1.7F, -0.2F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1F, 1.5471F, -3.1056F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Lowerjawbase.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(-0.2F, -0.4813F, 0.8966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(102, 86).mirror().addBox(-0.2F, -0.3063F, 0.3466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -1.693F, -0.1222F, 0.0F));

		PartDefinition cube_r174 = Lowerjawbase.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(100, 22).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.8307F, 0.9366F, -6.9319F, -1.693F, -0.1222F, 0.0F));

		PartDefinition cube_r175 = Lowerjawbase.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.5F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.6204F, 0.838F, -8.6446F, -1.6232F, -0.1222F, 0.0F));

		PartDefinition cube_r176 = Lowerjawbase.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-0.5F, -2.2F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 67).addBox(1.7F, -2.2F, -0.625F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.5493F, -3.7459F, -1.6973F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Lowerjawbase.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(59, 105).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(59, 105).addBox(1.7F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.086F, -1.6806F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r178 = Lowerjawbase.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(95, 72).mirror().addBox(-0.5F, 1.0446F, -0.2994F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(95, 72).addBox(1.7F, 1.0446F, -0.2994F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r179 = Lowerjawbase.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(99, 34).mirror().addBox(-0.5F, -1.7448F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(99, 34).addBox(1.7F, -1.7448F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.1615F, 0.9984F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r180 = Lowerjawbase.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(69, 95).mirror().addBox(-0.5F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(69, 95).addBox(1.7F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, -0.0446F, 1.0057F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r181 = Lowerjawbase.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-0.5F, 0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(88, 80).addBox(1.7F, 0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, -0.2525F, -2.5582F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r182 = Lowerjawbase.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(65, 104).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(5, 105).mirror().addBox(-0.5F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(5, 105).addBox(1.7F, -0.8F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(65, 104).addBox(1.7F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, -0.0046F, -4.8118F, -1.6799F, 0.0F, 0.0F));

		PartDefinition cube_r183 = Lowerjawbase.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(38, 89).mirror().addBox(-0.2F, -0.025F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.0611F, -0.1222F, 0.0F));

		PartDefinition cube_r184 = Lowerjawbase.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(78, 28).mirror().addBox(-0.2F, -0.0308F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.096F, -0.1222F, 0.0F));

		PartDefinition cube_r185 = Lowerjawbase.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(105, 62).mirror().addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1915F, -12.4744F, 0.0175F, -0.1222F, 0.0F));

		PartDefinition cube_r186 = Lowerjawbase.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(105, 65).mirror().addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 68).mirror().addBox(-0.5F, -0.425F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 71).mirror().addBox(-0.5F, -0.425F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1008F, 0.4049F, -12.2656F, -0.0705F, -0.1217F, 0.0107F));

		PartDefinition cube_r187 = Lowerjawbase.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3934F, 0.6456F, -9.8945F, 0.0168F, -0.1217F, 0.0107F));

		PartDefinition cube_r188 = Lowerjawbase.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(77, 105).mirror().addBox(-0.5F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 77).mirror().addBox(-0.5F, -0.55F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 105).mirror().addBox(-0.5F, -0.55F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4661F, 0.6347F, -9.299F, 0.0517F, -0.1217F, 0.0107F));

		PartDefinition cube_r189 = Lowerjawbase.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(-0.2F, 0.1882F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.0436F, -0.1222F, 0.0F));

		PartDefinition cube_r190 = Lowerjawbase.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3046F, 0.142F, -11.2167F, -0.096F, -0.1222F, 0.0F));

		PartDefinition cube_r191 = Lowerjawbase.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(-0.5F, 0.775F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.211F, -0.2333F, -11.9785F, -1.4923F, -0.1222F, 0.0F));

		PartDefinition cube_r192 = Lowerjawbase.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(105, 105).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1665F, 0.9504F, -12.341F, -0.2531F, -0.1222F, 0.0F));

		PartDefinition cube_r193 = Lowerjawbase.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(28, 106).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.0958F, 0.8002F, -12.9176F, 1.3177F, -0.1222F, 0.0F));

		PartDefinition cube_r194 = Lowerjawbase.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(99, 38).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1665F, 0.9504F, -12.341F, -1.6057F, -0.1222F, 0.0F));

		PartDefinition cube_r195 = Lowerjawbase.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(100, 50).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.363F, 1.1256F, -10.7406F, -1.6842F, -0.1222F, 0.0F));

		PartDefinition cube_r196 = Lowerjawbase.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(33, 106).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3967F, 0.8464F, -10.4669F, 3.0194F, -0.1222F, 0.0F));

		PartDefinition cube_r197 = Lowerjawbase.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(100, 62).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.4299F, 1.1708F, -10.1959F, 1.5926F, -0.1222F, 0.0F));

		PartDefinition cube_r198 = Lowerjawbase.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(78, 33).mirror().addBox(-0.5F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(78, 33).addBox(1.95F, -0.5F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-1.225F, 0.7988F, -3.7566F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Lowerjawbase.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(90, 14).addBox(1.95F, -0.7F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.225F, 1.1917F, -5.1152F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Lowerjawbase.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(38, 106).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(38, 106).addBox(1.95F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 1.3623F, -3.7256F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Lowerjawbase.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 40).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(106, 40).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)), PartPose.offsetAndRotation(-1.225F, 1.3763F, -3.3258F, -1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Lowerjawbase.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-0.5F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(90, 18).addBox(1.95F, -0.3F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.295F)), PartPose.offsetAndRotation(-1.225F, 1.3553F, -2.9264F, -2.9583F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Lowerjawbase.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(106, 43).mirror().addBox(-0.5F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(49, 106).mirror().addBox(-0.5F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F)).mirror(false)
				.texOffs(49, 106).addBox(1.95F, -0.7F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.302F))
				.texOffs(106, 43).addBox(1.95F, -0.7F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 0.7069F, -1.6227F, 2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Lowerjawbase.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(106, 53).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(100, 66).mirror().addBox(-0.5F, -1.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(100, 66).addBox(1.95F, -1.7F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.293F))
				.texOffs(106, 53).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 0.4399F, -2.3768F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Lowerjawbase.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(100, 62).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.4299F, 1.1708F, -10.1959F, 1.5926F, 0.1222F, 0.0F));

		PartDefinition cube_r206 = Lowerjawbase.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3967F, 0.8464F, -10.4669F, 3.0194F, 0.1222F, 0.0F));

		PartDefinition cube_r207 = Lowerjawbase.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(100, 50).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.363F, 1.1256F, -10.7406F, -1.6842F, 0.1222F, 0.0F));

		PartDefinition cube_r208 = Lowerjawbase.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(99, 38).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1665F, 0.9504F, -12.341F, -1.6057F, 0.1222F, 0.0F));

		PartDefinition cube_r209 = Lowerjawbase.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(28, 106).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0958F, 0.8002F, -12.9176F, 1.3177F, 0.1222F, 0.0F));

		PartDefinition cube_r210 = Lowerjawbase.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(105, 105).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1665F, 0.9504F, -12.341F, -0.2531F, 0.1222F, 0.0F));

		PartDefinition cube_r211 = Lowerjawbase.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(105, 102).addBox(-0.5F, 0.775F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.211F, -0.2333F, -11.9785F, -1.4923F, 0.1222F, 0.0F));

		PartDefinition cube_r212 = Lowerjawbase.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(90, 2).addBox(-0.5F, 0.025F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3046F, 0.142F, -11.2167F, -0.096F, 0.1222F, 0.0F));

		PartDefinition cube_r213 = Lowerjawbase.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(45, 89).addBox(-0.8F, 0.1882F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.0436F, 0.1222F, 0.0F));

		PartDefinition cube_r214 = Lowerjawbase.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(82, 105).addBox(-0.5F, -0.55F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 77).addBox(-0.5F, -0.55F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 105).addBox(-0.5F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4661F, 0.6347F, -9.299F, 0.0517F, 0.1217F, -0.0107F));

		PartDefinition cube_r215 = Lowerjawbase.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(105, 74).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3934F, 0.6456F, -9.8945F, 0.0168F, 0.1217F, -0.0107F));

		PartDefinition cube_r216 = Lowerjawbase.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(105, 71).addBox(-0.5F, -0.425F, 1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 68).addBox(-0.5F, -0.425F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 65).addBox(-0.5F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1008F, 0.4049F, -12.2656F, -0.0705F, 0.1217F, -0.0107F));

		PartDefinition cube_r217 = Lowerjawbase.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(105, 62).addBox(-0.5F, -0.1F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0752F, -0.1915F, -12.4744F, 0.0175F, 0.1222F, 0.0F));

		PartDefinition cube_r218 = Lowerjawbase.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(78, 28).addBox(-0.8F, -0.0308F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.096F, 0.1222F, 0.0F));

		PartDefinition cube_r219 = Lowerjawbase.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(38, 89).addBox(-0.8F, -0.025F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.0611F, 0.1222F, 0.0F));

		PartDefinition cube_r220 = Lowerjawbase.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(102, 86).addBox(-0.8F, -0.3063F, 0.3466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(34, 99).addBox(-0.8F, -0.4813F, 0.8966F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -1.693F, 0.1222F, 0.0F));

		PartDefinition cube_r221 = Lowerjawbase.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(102, 82).addBox(-0.5F, -1.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.6204F, 0.838F, -8.6446F, -1.6232F, 0.1222F, 0.0F));

		PartDefinition cube_r222 = Lowerjawbase.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(100, 22).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8307F, 0.9366F, -6.9319F, -1.693F, 0.1222F, 0.0F));

		PartDefinition cube_r223 = Lowerjawbase.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 72).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r224 = Lowerjawbase.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(88, 68).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r225 = Lowerjawbase.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(88, 64).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.0936F, -3.1747F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 38).addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.6871F, 1.3222F, -7.5152F, 0.2798F, 0.0679F, 0.0163F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(28, 92).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6955F, 1.9834F, -8.5474F, 0.2F, 0.1038F, -0.0137F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(87, 98).addBox(-1.666F, -1.9348F, -0.9286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 3.3472F, -9.1276F, -1.5453F, 0.1038F, -0.0137F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(75, 108).addBox(-1.7694F, -1.0021F, -0.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 3.3472F, -10.1276F, -0.0793F, 0.1036F, -0.0155F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(100, 78).addBox(-1.4573F, -2.0553F, -0.0849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8261F, 3.4472F, -7.1276F, 0.0433F, 0.1045F, -0.0064F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(100, 74).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7641F, 2.2128F, -9.5016F, 1.7618F, 0.103F, -0.0192F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(21, 92).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.6495F, 1.5574F, -10.3536F, 1.7877F, 0.1018F, -0.0245F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(59, 108).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.5951F, 1.8921F, -10.966F, 0.4962F, 0.1018F, -0.0245F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(108, 29).addBox(-1.7475F, -1.3119F, -0.6635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8261F, 3.0722F, -11.4776F, -0.7256F, 0.1018F, -0.0245F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 104).addBox(-1.7475F, -0.6368F, -0.7954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(64, 110).addBox(-1.8975F, -1.3618F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8261F, 3.0722F, -11.4776F, -1.7379F, 0.1018F, -0.0245F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(20, 76).addBox(-1.666F, -2.0532F, 0.531F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8261F, 3.3472F, -9.1276F, 0.2087F, 0.1038F, -0.0137F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(51, 71).addBox(-0.8F, -0.2F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8426F, -0.0859F, -4.3706F, 0.4804F, -0.0338F, 0.0963F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(65, 55).addBox(-0.35F, -1.275F, -2.775F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0805F, 1.1621F, -4.8905F, 0.3453F, 0.1625F, 0.169F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(11, 72).addBox(-1.666F, -2.4652F, 3.2342F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8261F, 3.3472F, -9.1276F, 0.0866F, 0.1038F, -0.0137F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(108, 17).addBox(-0.5F, -0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 92).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.9041F, 2.3037F, -8.8343F, -3.0729F, 0.1022F, -0.0227F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(5, 108).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8591F, 1.4972F, -9.0942F, 2.6692F, 0.1022F, -0.0227F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(107, 98).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.797F, 1.4508F, -9.6891F, 1.4911F, 0.1022F, -0.0227F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(107, 95).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7404F, 1.5864F, -10.2709F, 0.2257F, 0.1022F, -0.0227F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(107, 92).addBox(-1.6771F, -1.7313F, -1.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.8511F, 3.1472F, -11.3276F, -1.1269F, 0.1022F, -0.0227F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(10, 83).addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1374F, 1.0657F, -6.2844F, -1.3439F, 0.1119F, -0.0191F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(100, 70).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0787F, 1.277F, -6.8429F, -2.7838F, 0.1119F, -0.0191F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(70, 91).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.0287F, 1.6048F, -7.343F, 2.1468F, 0.1119F, -0.0191F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.0498F, 2.2711F, -7.2683F, -0.0349F, 0.1119F, -0.0191F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(107, 89).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.9787F, 1.9326F, -7.843F, 0.576F, 0.1119F, -0.0191F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(105, 14).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3606F, 1.1018F, -4.3047F, 0.8378F, 0.1119F, -0.0191F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(87, 76).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4651F, 2.5442F, -3.6202F, 2.0159F, 0.1119F, -0.0191F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(105, 11).addBox(-0.5F, -0.2F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(24, 88).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2609F, 3.0815F, -5.528F, 3.1067F, 0.1119F, -0.0191F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(7, 88).addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.0798F, 2.8899F, -7.1061F, 3.0194F, 0.1119F, -0.0191F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(107, 86).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0119F, 2.7664F, -7.6893F, -1.7802F, 0.1119F, -0.0191F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(107, 83).addBox(-1.6609F, -2.4382F, 0.5267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.9511F, 3.3472F, -9.8276F, -0.6021F, 0.1119F, -0.0191F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(110, 11).addBox(-0.5F, -0.525F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 110).addBox(-0.5F, -0.525F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1172F, 3.2068F, -5.0537F, 0.0076F, 0.1022F, -0.0227F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(85, 109).addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 109).addBox(-0.5F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9673F, 3.3262F, -6.5414F, 0.0774F, 0.1022F, -0.0227F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(110, 8).addBox(-0.5F, -0.525F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 8).addBox(-0.5F, -0.55F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 5).addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.733F, 3.3489F, -8.8294F, 0.0076F, 0.1022F, -0.0227F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(107, 80).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6398F, 3.2793F, -9.7218F, -0.0797F, 0.1022F, -0.0227F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(64, 107).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.557F, 3.2175F, -10.5151F, -0.0797F, 0.1022F, -0.0227F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(110, 5).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4943F, 3.0935F, -11.0988F, -0.2106F, 0.1022F, -0.0227F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(85, 59).addBox(-1.3547F, -2.2438F, 2.7275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 3.4472F, -7.1276F, -0.0524F, 0.0698F, -0.0031F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(12, 67).addBox(-0.5F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0618F, 2.3716F, -5.1714F, -0.0091F, 0.1045F, -0.0064F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(104, 26).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(1.48F, -1.3823F, 0.3133F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(70, 70).addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -1.1337F, -1.0613F, -2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(87, 31).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(1.48F, -1.3031F, -0.3822F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(14, 91).addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -0.9562F, 0.8687F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(107, 46).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(1.48F, -0.2886F, 1.0792F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(70, 87).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(1.48F, 0.4088F, 1.0182F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(85, 54).addBox(-0.5F, -0.175F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.9977F, 0.4133F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(61, 70).addBox(-0.5F, -2.45F, -0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1497F)), PartPose.offsetAndRotation(1.48F, 2.4966F, -3.485F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(0, 110).addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 3.1363F, -3.1996F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(58, 82).addBox(-0.5F, -0.175F, -1.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(1.48F, 3.3903F, -0.5618F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(49, 84).addBox(-0.5F, -0.55F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1493F)), PartPose.offsetAndRotation(1.48F, 2.8885F, -0.6683F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(42, 84).addBox(-0.3375F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(83, 46).addBox(-0.6625F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.4075F, 0.7251F, -1.1038F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(23, 107).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.545F, -0.3065F, 2.1985F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(18, 107).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, -0.1161F, 1.6295F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(67, 41).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 1.9851F, 0.694F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(10, 107).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 2.8243F, 0.8194F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(107, 2).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 1.9851F, 0.694F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 107).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 2.584F, 0.7306F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(100, 106).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 2.7167F, 1.5687F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(95, 106).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 3.4402F, 1.1253F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(87, 106).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.545F, 3.4768F, 0.5265F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(70, 106).addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 2.3183F, 0.0988F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(87, 102).addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 3.2175F, 1.7848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(67, 100).addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.5F, 3.2175F, 1.7848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(50, 98).addBox(-0.25F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, -0.7605F, 3.1862F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 43).addBox(-1.325F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 10).addBox(-1.325F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9763F, -1.0953F, 3.1641F, 2.8602F, -0.4846F, -0.827F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(102, 94).addBox(-0.45F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5594F, -1.1873F, 1.1806F, 0.0481F, -0.4359F, -0.0203F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(100, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.1694F, 0.749F, 0.0678F, -0.8715F, -0.0519F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(97, 94).addBox(-0.25F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.25F, -0.7605F, 3.1862F, 1.2479F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.0936F, -3.1747F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(78, 38).mirror().addBox(-0.5F, -0.45F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.6871F, 1.3222F, -7.5152F, 0.2798F, -0.0679F, -0.0163F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6955F, 1.9834F, -8.5474F, 0.2F, -0.1038F, 0.0137F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(87, 98).mirror().addBox(0.666F, -1.9348F, -0.9286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.3472F, -9.1276F, -1.5453F, -0.1038F, 0.0137F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(0.7694F, -1.0021F, -0.0672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.3472F, -10.1276F, -0.0793F, -0.1036F, 0.0155F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(100, 78).mirror().addBox(0.4573F, -2.0553F, -0.0849F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.4472F, -7.1276F, 0.0433F, -0.1045F, 0.0064F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.7641F, 2.2128F, -9.5016F, 1.7618F, -0.103F, 0.0192F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(21, 92).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.6495F, 1.5574F, -10.3536F, 1.7877F, -0.1018F, 0.0245F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(59, 108).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.5951F, 1.8921F, -10.966F, 0.4962F, -0.1018F, 0.0245F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(108, 29).mirror().addBox(0.7475F, -1.3119F, -0.6635F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.0722F, -11.4776F, -0.7256F, -0.1018F, 0.0245F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(10, 104).mirror().addBox(0.7475F, -0.6368F, -0.7954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(64, 110).mirror().addBox(0.8975F, -1.3618F, -0.9454F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.0722F, -11.4776F, -1.7379F, -0.1018F, 0.0245F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(0.666F, -2.0532F, 0.531F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.3472F, -9.1276F, 0.2087F, -0.1038F, 0.0137F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(51, 71).mirror().addBox(-0.2F, -0.2F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -0.0859F, -4.3706F, 0.4804F, 0.0338F, -0.0963F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-0.65F, -1.275F, -2.775F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0805F, 1.1621F, -4.8905F, 0.3453F, -0.1625F, -0.169F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(11, 72).mirror().addBox(0.666F, -2.4652F, 3.2342F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.3472F, -9.1276F, 0.0866F, -0.1038F, 0.0137F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(108, 17).mirror().addBox(-0.5F, -0.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 92).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.9041F, 2.3037F, -8.8343F, -3.0729F, -0.1022F, 0.0227F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.8591F, 1.4972F, -9.0942F, 2.6692F, -0.1022F, 0.0227F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.797F, 1.4508F, -9.6891F, 1.4911F, -0.1022F, 0.0227F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 95).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7404F, 1.5864F, -10.2709F, 0.2257F, -0.1022F, 0.0227F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(107, 92).mirror().addBox(0.6771F, -1.7313F, -1.2276F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.8511F, 3.1472F, -11.3276F, -1.1269F, -0.1022F, 0.0227F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(10, 83).mirror().addBox(-0.5F, -1.8F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1374F, 1.0657F, -6.2844F, -1.3439F, -0.1119F, 0.0191F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0787F, 1.277F, -6.8429F, -2.7838F, -0.1119F, 0.0191F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(70, 91).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.0287F, 1.6048F, -7.343F, 2.1468F, -0.1119F, 0.0191F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.0498F, 2.2711F, -7.2683F, -0.0349F, -0.1119F, 0.0191F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(107, 89).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.9787F, 1.9326F, -7.843F, 0.576F, -0.1119F, 0.0191F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3606F, 1.1018F, -4.3047F, 0.8378F, -0.1119F, 0.0191F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(87, 76).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.4651F, 2.5442F, -3.6202F, 2.0159F, -0.1119F, 0.0191F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(105, 11).mirror().addBox(-0.5F, -0.2F, -2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(24, 88).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2609F, 3.0815F, -5.528F, 3.1067F, -0.1119F, 0.0191F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(7, 88).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.0798F, 2.8899F, -7.1061F, 3.0194F, -0.1119F, 0.0191F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(107, 86).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0119F, 2.7664F, -7.6893F, -1.7802F, -0.1119F, 0.0191F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(107, 83).mirror().addBox(0.661F, -2.4382F, 0.5267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.9511F, 3.3472F, -9.8276F, -0.6021F, -0.1119F, 0.0191F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(110, 11).mirror().addBox(-0.5F, -0.525F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 110).mirror().addBox(-0.5F, -0.525F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1172F, 3.2068F, -5.0537F, 0.0076F, -0.1022F, 0.0227F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(85, 109).mirror().addBox(-0.5F, -0.525F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 109).mirror().addBox(-0.5F, -0.525F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9673F, 3.3262F, -6.5414F, 0.0774F, -0.1022F, 0.0227F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(110, 8).mirror().addBox(-0.5F, -0.525F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 8).mirror().addBox(-0.5F, -0.55F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 5).mirror().addBox(-0.5F, -0.55F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.733F, 3.3489F, -8.8294F, 0.0076F, -0.1022F, 0.0227F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(107, 80).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6398F, 3.2793F, -9.7218F, -0.0797F, -0.1022F, 0.0227F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(64, 107).mirror().addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.557F, 3.2175F, -10.5151F, -0.0797F, -0.1022F, 0.0227F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(110, 5).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4943F, 3.0935F, -11.0988F, -0.2106F, -0.1022F, 0.0227F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(85, 59).mirror().addBox(0.3547F, -2.2438F, 2.7275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.4472F, -7.1276F, -0.0524F, -0.0698F, 0.0031F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(12, 67).mirror().addBox(-0.5F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0618F, 2.3716F, -5.1714F, -0.0091F, -0.1045F, 0.0064F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(104, 26).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.3823F, 0.3133F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-0.5F, -2.85F, -0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.1337F, -1.0613F, -2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(87, 31).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.3031F, -0.3822F, -1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.9562F, 0.8687F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(107, 46).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.2886F, 1.0792F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(70, 87).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.4088F, 1.0182F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(85, 54).mirror().addBox(-0.5F, -0.175F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.9977F, 0.4133F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(61, 70).mirror().addBox(-0.5F, -2.45F, -0.15F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.1497F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 2.4966F, -3.485F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-0.5F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 3.1363F, -3.1996F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-0.5F, -0.175F, -1.85F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 3.3903F, -0.5618F, -1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(49, 84).mirror().addBox(-0.5F, -0.55F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1493F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 2.8885F, -0.6683F, -2.1817F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(42, 84).mirror().addBox(-0.6625F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(83, 46).mirror().addBox(-0.3375F, -0.8F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, 0.7251F, -1.1038F, -1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(23, 107).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.545F, -0.3065F, 2.1985F, 2.8972F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(18, 107).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, -0.1161F, 1.6295F, 1.8937F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(67, 41).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.9851F, 0.694F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(10, 107).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.8243F, 0.8194F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(107, 2).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.9851F, 0.694F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.584F, 0.7306F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(100, 106).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.7167F, 1.5687F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(95, 106).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 3.4402F, 1.1253F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(87, 106).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 3.4768F, 0.5265F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(70, 106).mirror().addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.3183F, 0.0988F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(87, 102).mirror().addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.2175F, 1.7848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(67, 100).mirror().addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.2175F, 1.7848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(50, 98).mirror().addBox(-0.75F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.7605F, 3.1862F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(92, 43).mirror().addBox(-0.675F, -0.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 10).mirror().addBox(-0.675F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9763F, -1.0953F, 3.1641F, 2.8602F, 0.4846F, 0.827F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(102, 94).mirror().addBox(-0.55F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -1.1873F, 1.1806F, 0.0481F, 0.4359F, 0.0203F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(100, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.1694F, 0.749F, 0.0678F, 0.8715F, 0.0519F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(97, 94).mirror().addBox(-0.75F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.7605F, 3.1862F, 1.2479F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(44, 101).addBox(-0.5F, 0.5647F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.9663F, 6.5663F, -9.7013F, 0.8467F, 0.342F, -0.3361F));

		PartDefinition cube_r360 = Rightupperarm.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(77, 101).addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5916F, 3.8747F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Rightupperarm.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(60, 101).addBox(-0.5F, 0.4F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0307F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r362 = Rightupperarm.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(19, 96).addBox(-0.5F, -1.45F, -1.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.2472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r363 = Rightupperarm.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(95, 77).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Rightupperarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(28, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Rightupperarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(109, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5647F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Rightupperarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(105, 108).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.5044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Rightupperarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(80, 108).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5647F, -0.4912F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4917F, 9.4572F, 2.3071F, -2.182F, 0.1175F, 0.1384F));

		PartDefinition cube_r368 = Rightlowerarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 76).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 76).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(55, 6).addBox(-1.9F, 0.1F, -1.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1605F, 7.837F, -0.4441F, 0.9923F, 0.0393F, 0.2329F));

		PartDefinition cube_r369 = Righthand.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(64, 6).addBox(-2.5F, -1.9F, -0.975F, 3.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.4F, 2.1F, -0.6F, -0.3802F, 0.3542F, -0.1733F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(44, 101).mirror().addBox(-0.5F, 0.5647F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.9463F, 6.5663F, -9.7013F, 0.8436F, -0.1991F, 0.3012F));

		PartDefinition cube_r370 = Leftupperarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(77, 101).mirror().addBox(-0.5F, 0.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5916F, 3.8747F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r371 = Leftupperarm.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(60, 101).mirror().addBox(-0.5F, 0.4F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0307F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r372 = Leftupperarm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(19, 96).mirror().addBox(-0.5F, -1.45F, -1.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Leftupperarm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(95, 77).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Leftupperarm.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(28, 109).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Leftupperarm.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(109, 25).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5647F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Leftupperarm.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Leftupperarm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(80, 108).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5647F, -0.4912F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4917F, 9.4572F, 2.3071F, -1.6584F, -0.1175F, -0.1384F));

		PartDefinition cube_r378 = Leftlowerarm.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.5F, -1.5F, 0.1F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 76).mirror().addBox(-0.5F, -1.5F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(55, 6).mirror().addBox(-0.1F, 0.1F, -1.1F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1605F, 7.837F, -0.4441F, 0.5123F, -0.0393F, -0.2329F));

		PartDefinition cube_r379 = Lefthand.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(64, 6).mirror().addBox(-0.5F, -1.9F, -0.975F, 3.0F, 8.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1F, -0.6F, -0.3802F, -0.3542F, 0.1733F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3281F, 6.3142F, -11.2394F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition cube_r380 = bone.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(110, 65).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1796F, -4.8722F, 7.2105F, -0.044F, 0.0094F, -0.0001F));

		PartDefinition cube_r381 = bone.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(93, 50).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1618F, -4.2714F, 5.303F, 0.3051F, 0.0094F, -0.0001F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(45, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1449F, -3.4268F, 3.4902F, 0.436F, 0.0094F, -0.0001F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(93, 22).addBox(-1.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -2.3676F, 1.9495F, 0.5233F, 0.0094F, -0.0001F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(92, 39).addBox(-1.0774F, 1.1587F, -1.2039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(0, 86).addBox(-1.0774F, 0.1587F, -0.6039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.6495F, 0.8048F, 0.9113F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(109, 32).addBox(-1.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(92, 35).addBox(-1.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.0387F, 0.8048F, 0.9113F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(38, 103).addBox(-1.0383F, -0.7431F, -0.6179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, 0.5448F, 0.5273F, 0.3609F));

		PartDefinition cube_r387 = bone.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(86, 23).addBox(-1.5871F, -0.2815F, -0.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.391F, 0.3392F, 0.2085F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(87, 27).addBox(-1.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.8273F, 0.3392F, 0.2085F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3081F, 6.3142F, -11.2394F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition cube_r389 = bone3.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(110, 65).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1796F, -4.8722F, 7.2105F, -0.044F, -0.0094F, 0.0001F));

		PartDefinition cube_r390 = bone3.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(93, 50).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1618F, -4.2714F, 5.303F, 0.3051F, -0.0094F, 0.0001F));

		PartDefinition cube_r391 = bone3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(45, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1449F, -3.4268F, 3.4902F, 0.436F, -0.0094F, 0.0001F));

		PartDefinition cube_r392 = bone3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(93, 22).mirror().addBox(0.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -2.3676F, 1.9495F, 0.5233F, -0.0094F, 0.0001F));

		PartDefinition cube_r393 = bone3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(0.0774F, 1.1587F, -1.2039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(0, 86).mirror().addBox(0.0774F, 0.1587F, -0.6039F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.6495F, -0.8048F, -0.9113F));

		PartDefinition cube_r394 = bone3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(109, 32).mirror().addBox(0.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(92, 35).mirror().addBox(0.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.0387F, -0.8048F, -0.9113F));

		PartDefinition cube_r395 = bone3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(38, 103).mirror().addBox(0.0383F, -0.7431F, -0.6179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, 0.5448F, -0.5273F, -0.3609F));

		PartDefinition cube_r396 = bone3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(86, 23).mirror().addBox(0.5871F, -0.2815F, -0.6124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.391F, -0.3392F, -0.2085F));

		PartDefinition cube_r397 = bone3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(87, 27).mirror().addBox(0.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.8273F, -0.3392F, -0.2085F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(67, 29).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.0068F, 0.0F, 0.0F));

		PartDefinition cube_r398 = Tailbase.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(74, 95).addBox(0.0F, 0.2918F, -0.5156F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r399 = Tailbase.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-2.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r400 = Tailbase.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(20, 72).addBox(0.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r401 = Tailbase.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(8, 113).addBox(0.0F, -1.8235F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r402 = Tailbase.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(26, 112).addBox(0.0F, -1.466F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(67, 47).addBox(-0.5F, -0.0721F, 0.003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4822F, 3.7698F, 0.1927F, 0.0857F, 0.0167F));

		PartDefinition cube_r403 = tail2.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-2.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r404 = tail2.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(74, 62).addBox(0.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r405 = tail2.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(10, 96).addBox(0.0F, -0.3697F, -0.3796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9279F, 3.6029F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r406 = tail2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(12, 59).addBox(0.0F, 0.2899F, -0.3899F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5672F, 1.0043F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r407 = tail2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(112, 35).addBox(0.0F, -2.0706F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1197F, 1.9979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r408 = tail2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(29, 112).addBox(0.0F, -1.5334F, 0.0055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, 0.1053F, 0.0434F, 0.0046F));

		PartDefinition cube_r409 = Tailmiddlebase.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(21, 10).mirror().addBox(-1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2508F, 0.0938F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r410 = Tailmiddlebase.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(21, 10).addBox(-0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2508F, 0.0938F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r411 = Tailmiddlebase.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(5, 34).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r412 = Tailmiddlebase.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(102, 112).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2783F, 4.0666F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r413 = Tailmiddlebase.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(99, 112).addBox(0.0F, -1.85F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Tailmiddlebase.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(96, 112).addBox(0.0F, -2.1456F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0372F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Tailmiddlebase.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(102, 9).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 6.4943F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Tailmiddlebase.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(92, 101).addBox(0.0F, -0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4276F, 4.6464F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Tailmiddlebase.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(84, 99).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6698F, 2.6511F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Tailmiddlebase.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(66, 113).addBox(0.0F, -2.3206F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.1752F, 0.0859F, 0.0152F));

		PartDefinition cube_r419 = tail.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(33, 64).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2449F, 1.07F, 0.0526F, 0.1046F, 0.0055F));

		PartDefinition cube_r420 = tail.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(33, 64).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2449F, 1.07F, 0.0526F, -0.1046F, -0.0055F));

		PartDefinition cube_r421 = tail.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r422 = tail.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(112, 79).addBox(0.0F, -1.375F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r423 = tail.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(69, 112).addBox(0.0F, -1.9F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3255F, 1.5986F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r424 = tail.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(52, 112).addBox(0.0F, -1.3923F, -0.0216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r425 = tail.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(33, 109).addBox(0.0F, 0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0058F, 3.9197F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(102, 15).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0337F, 1.7032F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(113, 109).addBox(0.0F, -1.6805F, 4.9585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.1039F, 0.0F, 0.0F));

		PartDefinition cube_r427 = Tailmiddleend.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(14, 88).addBox(0.0F, -1.0369F, -0.1278F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r428 = Tailmiddleend.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(108, 113).addBox(0.0F, -1.1268F, -0.0255F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5456F, 0.9856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r429 = Tailmiddleend.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(22, 34).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r430 = Tailmiddleend.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(36, 109).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9636F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Tailmiddleend.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(109, 35).addBox(0.0F, 0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1605F, 0.4067F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Tailmiddleend.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(48, 57).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2448F, 2.8299F, 0.672F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.0119F, -0.0436F, -0.0005F));

		PartDefinition cube_r433 = Tailend.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(113, 17).addBox(0.0F, -1.2F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 15).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Tailend.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(49, 109).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6027F, 3.6491F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Tailend.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(39, 109).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, 1.4171F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Tailend.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(112, 46).addBox(0.0F, -0.875F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0221F, 3.0118F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Tailend.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(52, 89).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 1.013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, 0.1516F, -0.0431F, -0.0066F));

		PartDefinition cube_r438 = Tailend2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(78, 113).addBox(0.0F, -0.9F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 113).addBox(0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 113).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 41).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Tailend2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(87, 112).addBox(0.0F, 7.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 112).addBox(0.0F, 8.1F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Tailend2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(112, 83).addBox(0.0F, 1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.286F, 0.2973F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, -0.0494F, -0.0872F, 0.0043F));

		PartDefinition cube_r441 = Tailend3.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(113, 102).addBox(0.0F, -0.9F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 99).addBox(0.0F, -0.9F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 113).addBox(0.0F, -0.9F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1722F, -5.8848F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Tailend3.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(22, 42).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Tailend3.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(90, 112).addBox(0.0F, 11.4F, 22.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 87).addBox(0.0F, 10.5F, 20.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, -0.0056F, -0.1309F, 0.0007F));

		PartDefinition cube_r444 = Tailend4.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(112, 95).addBox(0.0F, 14.2F, 28.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(93, 112).addBox(0.0F, 13.5F, 26.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 91).addBox(0.0F, 12.7F, 24.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5266F, -27.5757F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Tailend4.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(5, 43).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, -0.0318F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Tailend5.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(114, 25).addBox(0.0F, 17.9F, 34.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 114).addBox(0.0F, 16.9F, 32.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 113).addBox(0.0F, 16.1F, 30.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7102F, -33.4775F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Tailend5.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(52, 47).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, -0.0844F, -0.087F, 0.0074F));

		PartDefinition cube_r448 = Tailend6.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(37, 49).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, -0.0754F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Tailend7.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(20, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition cube_r450 = Tailend8.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend9 = Tailend8.addOrReplaceChild("Tailend9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Tailend9.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(51, 23).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend10 = Tailend9.addOrReplaceChild("Tailend10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1752F, -0.0859F, 0.0152F));

		PartDefinition cube_r452 = Tailend10.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(52, 31).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend11 = Tailend10.addOrReplaceChild("Tailend11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Tailend11.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.3416F, -0.8517F, -0.5067F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Rightthigh.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(81, 2).addBox(-1.3F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Rightthigh.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(102, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Rightthigh.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(99, 26).addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Rightthigh.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(82, 93).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.3835F, 0.7167F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Rightthigh.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(77, 93).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.9787F, 2.4702F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Rightthigh.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(97, 98).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 11.8669F, 6.6657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Rightthigh.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(104, 37).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(104, 34).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 11.4428F, 4.4702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Rightthigh.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(100, 109).addBox(-0.5F, 1.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(87, 87).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 8.8679F, 3.33F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Rightthigh.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(82, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 8.8679F, 3.33F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Rightthigh.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(87, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Rightthigh.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(77, 87).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 3.4507F, 0.804F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Rightthigh.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(52, 92).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(14, 95).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 11.9146F, 7.5067F, 1.5834F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Rightshin.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(24, 96).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Rightshin.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(28, 103).addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(102, 2).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Rightshin.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Rightshin.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(95, 62).addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Rightshin.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(62, 96).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Rightshin.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(15, 51).addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r472 = Rightshin.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(65, 86).addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r473 = Rightshin.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(28, 82).addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Rightshin.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(78, 43).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r475 = Rightshin.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r476 = Rightshin.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(40, 93).addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r477 = Rightshin.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(7, 59).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 19.8058F, -2.8029F, -0.9411F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(55, 18).addBox(-1.9F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 0.9055F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(21, 18).addBox(-1.9F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.7613F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.3416F, -0.8517F, -1.5975F, 0.0F, 0.0F));

		PartDefinition cube_r478 = Leftthigh.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(81, 2).mirror().addBox(-0.7F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r479 = Leftthigh.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(102, 98).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r480 = Leftthigh.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(99, 26).mirror().addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r481 = Leftthigh.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(82, 93).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3835F, 0.7167F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r482 = Leftthigh.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(77, 93).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9787F, 2.4702F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r483 = Leftthigh.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(97, 98).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.8669F, 6.6657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r484 = Leftthigh.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(104, 37).mirror().addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(104, 34).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.4428F, 4.4702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r485 = Leftthigh.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(100, 109).mirror().addBox(-0.5F, 1.8F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(87, 87).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.8679F, 3.33F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r486 = Leftthigh.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(82, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.8679F, 3.33F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r487 = Leftthigh.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(87, 35).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r488 = Leftthigh.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(77, 87).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.4507F, 0.804F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r489 = Leftthigh.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(52, 92).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(14, 95).mirror().addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 11.9146F, 7.5067F, 2.6306F, 0.0F, 0.0F));

		PartDefinition cube_r490 = Leftshin.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r491 = Leftshin.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(28, 103).mirror().addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(102, 2).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r492 = Leftshin.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r493 = Leftshin.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(95, 62).mirror().addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r494 = Leftshin.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(62, 96).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r495 = Leftshin.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r496 = Leftshin.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(65, 86).mirror().addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r497 = Leftshin.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(28, 82).mirror().addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r498 = Leftshin.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r499 = Leftshin.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.5F, -3.0F, -0.1F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r500 = Leftshin.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(40, 93).mirror().addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r501 = Leftshin.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(7, 59).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.01F, 19.8058F, -2.8029F, -2.1192F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-2.1F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 2.0399F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(21, 18).mirror().addBox(-2.1F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.4122F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9203F, -1.4102F, -0.4807F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r502 = bone2.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(78, 77).addBox(-0.5F, -0.7F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2515F, 0.5145F, -4.8704F, -2.9671F, -0.0349F, -0.4363F));

		PartDefinition cube_r503 = bone2.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(94, 26).addBox(-0.5F, -1.325F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4125F, 0.3037F, -3.2426F, -1.6581F, -0.0349F, -0.4363F));

		PartDefinition cube_r504 = bone2.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(95, 109).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7554F, -0.5075F, -4.1605F, -0.6545F, -0.0349F, -0.4363F));

		PartDefinition cube_r505 = bone2.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(81, 82).addBox(-0.9997F, -2.2517F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(54, 102).addBox(-0.9997F, -2.2517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1745F, -0.0349F, -0.4363F));

		PartDefinition cube_r506 = bone2.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(110, 49).addBox(-0.9997F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.0123F, -0.0349F, -0.4363F));

		PartDefinition cube_r507 = bone2.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(74, 82).addBox(-0.5F, -3.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7027F, 1.6772F, 3.2607F, 1.2915F, -0.0349F, 0.0F));

		PartDefinition cube_r508 = bone2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(49, 102).addBox(-0.5F, -2.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6179F, 1.0493F, 0.834F, -1.1083F, -0.0349F, 0.0F));

		PartDefinition cube_r509 = bone2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(102, 46).addBox(-0.5F, -1.0F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6179F, 1.0493F, 0.834F, -0.3229F, -0.0349F, 0.0F));

		PartDefinition cube_r510 = bone2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(110, 14).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.0264F, -0.0302F, -0.0175F));

		PartDefinition cube_r511 = bone2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(102, 90).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.9174F, 15.3903F, 2.3938F, -1.8919F, 0.0043F, -0.1475F));

		PartDefinition cube_r512 = bone2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(110, 20).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(1.071F, 16.436F, 1.9902F, -1.1502F, 0.0043F, -0.1475F));

		PartDefinition cube_r513 = bone2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(18, 110).addBox(-0.5F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F))
				.texOffs(42, 110).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.9678F, 15.7778F, 0.7712F, 0.0279F, 0.0043F, -0.1475F));

		PartDefinition cube_r514 = bone2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(92, 90).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.4603F, 12.4192F, -1.1864F, 0.4206F, 0.0043F, -0.1475F));

		PartDefinition cube_r515 = bone2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(72, 102).addBox(-0.8369F, 5.9608F, -1.0905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(-0.3699F, 4.5564F, -1.7981F, 0.2024F, 0.0043F, -0.1475F));

		PartDefinition cube_r516 = bone2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(29, 96).addBox(-0.8369F, 3.2214F, -0.4363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3699F, 4.5564F, -1.7981F, 0.0977F, 0.0043F, -0.1475F));

		PartDefinition cube_r517 = bone2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(97, 13).addBox(-0.5192F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4208F, 5.1647F, -1.9546F, -0.0691F, -0.0951F, -0.0968F));

		PartDefinition cube_r518 = bone2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5192F, 0.5085F, -0.3362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4949F, 4.5564F, -1.7981F, 0.0705F, -0.0951F, -0.0968F));

		PartDefinition cube_r519 = bone2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(92, 84).addBox(-0.5F, -3.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5021F, 5.1281F, -1.6127F, -0.4573F, -0.098F, -0.053F));

		PartDefinition cube_r520 = bone2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(5, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5928F, 5.2832F, 1.495F, -2.0243F, -0.0302F, -0.0175F));

		PartDefinition cube_r521 = bone2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(52, 109).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.619F, 5.3384F, 2.393F, 3.0808F, -0.0302F, -0.0175F));

		PartDefinition cube_r522 = bone2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(33, 103).addBox(-5.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.347F, 4.761F, 3.2824F, 1.2918F, -0.0302F, -0.0175F));

		PartDefinition cube_r523 = bone2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6579F, 5.399F, 3.7115F, 1.0911F, -0.0302F, -0.0175F));

		PartDefinition cube_r524 = bone2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(92, 96).addBox(-0.4302F, 0.0794F, -0.4495F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8579F, 5.399F, 3.7115F, 1.05F, 0.1288F, -0.0674F));

		PartDefinition cube_r525 = bone2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(62, 92).addBox(-0.3001F, -0.0381F, -4.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8579F, 5.399F, 3.7115F, 2.4771F, 0.057F, -0.0175F));

		PartDefinition cube_r526 = bone2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(52, 55).addBox(-0.1323F, -0.4371F, -4.8757F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.7579F, 7.999F, 7.6115F, 2.3537F, 0.1268F, -0.0874F));

		PartDefinition cube_r527 = bone2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(20, 58).addBox(-0.1323F, -0.2382F, -4.8923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.7579F, 7.999F, 7.6115F, 2.2839F, 0.1268F, -0.0874F));

		PartDefinition cube_r528 = bone2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(92, 58).addBox(-0.3001F, 0.5199F, -4.7846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8579F, 5.399F, 3.7115F, 2.3898F, 0.057F, -0.0175F));

		PartDefinition cube_r529 = bone2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(97, 86).addBox(-0.3001F, 1.2236F, -0.1382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8579F, 5.399F, 3.7115F, 1.0372F, 0.057F, -0.0175F));

		PartDefinition cube_r530 = bone2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(55, 98).addBox(-0.3001F, -0.504F, -0.2807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8579F, 5.399F, 3.7115F, 1.1419F, 0.057F, -0.0175F));

		PartDefinition cube_r531 = bone2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(87, 93).addBox(-0.5F, -3.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6499F, 4.8483F, 3.1313F, 0.9776F, -0.0302F, -0.0175F));

		PartDefinition cube_r532 = bone2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(29, 76).addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.1137F, -0.0302F, -0.0175F));

		PartDefinition cube_r533 = bone2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(42, 71).addBox(-0.5F, -2.85F, -1.25F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5639F, 2.8966F, -0.7132F, 0.0262F, -0.0349F, 0.0F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(86, 6).addBox(-0.9997F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0698F, -0.0349F, -0.4363F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(35, 93).addBox(-0.5F, -4.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.968F, -0.2215F, 4.8161F, 1.5708F, -0.0349F, -0.4363F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(57, 92).addBox(-0.5F, -3.375F, -1.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0706F, -0.3711F, 5.6706F, 1.3963F, -0.0349F, -0.4363F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(92, 54).addBox(-0.9997F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1309F, -0.0349F, -0.4363F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(77, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.3134F, -1.0998F, 3.1538F, -0.3752F, -0.0349F, -0.4363F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(60, 77).addBox(-0.9997F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.947F, -1.727F, 0.3707F, -0.1745F, -0.0349F, -0.4363F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9203F, -1.4102F, -0.4807F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r540 = bone4.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.5F, -0.7F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2515F, 0.5145F, -4.8704F, -2.9671F, 0.0349F, 0.4363F));

		PartDefinition cube_r541 = bone4.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(94, 26).mirror().addBox(-0.5F, -1.325F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4125F, 0.3037F, -3.2426F, -1.6581F, 0.0349F, 0.4363F));

		PartDefinition cube_r542 = bone4.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(95, 109).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7554F, -0.5075F, -4.1605F, -0.6545F, 0.0349F, 0.4363F));

		PartDefinition cube_r543 = bone4.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(81, 82).mirror().addBox(-0.0003F, -2.2517F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(54, 102).mirror().addBox(-0.0003F, -2.2517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1745F, 0.0349F, 0.4363F));

		PartDefinition cube_r544 = bone4.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(110, 49).mirror().addBox(-0.0003F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.0123F, 0.0349F, 0.4363F));

		PartDefinition cube_r545 = bone4.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(-0.5F, -3.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7027F, 1.6772F, 3.2607F, 1.2915F, 0.0349F, 0.0F));

		PartDefinition cube_r546 = bone4.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(49, 102).mirror().addBox(-0.5F, -2.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6179F, 1.0493F, 0.834F, -1.1083F, 0.0349F, 0.0F));

		PartDefinition cube_r547 = bone4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(102, 46).mirror().addBox(-0.5F, -1.0F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6179F, 1.0493F, 0.834F, -0.3229F, 0.0349F, 0.0F));

		PartDefinition cube_r548 = bone4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(110, 14).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.0264F, 0.0302F, 0.0175F));

		PartDefinition cube_r549 = bone4.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(102, 90).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.9174F, 15.3903F, 2.3938F, -1.8919F, -0.0043F, 0.1475F));

		PartDefinition cube_r550 = bone4.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(110, 20).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-1.071F, 16.436F, 1.9902F, -1.1502F, -0.0043F, 0.1475F));

		PartDefinition cube_r551 = bone4.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(18, 110).mirror().addBox(-0.5F, -0.2F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false)
				.texOffs(42, 110).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.9678F, 15.7778F, 0.7712F, 0.0279F, -0.0043F, 0.1475F));

		PartDefinition cube_r552 = bone4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(92, 90).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.4603F, 12.4192F, -1.1864F, 0.4206F, -0.0043F, 0.1475F));

		PartDefinition cube_r553 = bone4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(72, 102).mirror().addBox(-0.1631F, 5.9608F, -1.0905F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(0.3699F, 4.5564F, -1.7981F, 0.2024F, -0.0043F, 0.1475F));

		PartDefinition cube_r554 = bone4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(29, 96).mirror().addBox(-0.1631F, 3.2214F, -0.4363F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3699F, 4.5564F, -1.7981F, 0.0977F, -0.0043F, 0.1475F));

		PartDefinition cube_r555 = bone4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(97, 13).mirror().addBox(-0.4808F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4208F, 5.1647F, -1.9546F, -0.0691F, 0.0951F, 0.0968F));

		PartDefinition cube_r556 = bone4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.4808F, 0.5085F, -0.3362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 4.5564F, -1.7981F, 0.0705F, 0.0951F, 0.0968F));

		PartDefinition cube_r557 = bone4.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(92, 84).mirror().addBox(-0.5F, -3.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5021F, 5.1281F, -1.6127F, -0.4573F, 0.098F, 0.053F));

		PartDefinition cube_r558 = bone4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5928F, 5.2832F, 1.495F, -2.0243F, 0.0302F, 0.0175F));

		PartDefinition cube_r559 = bone4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(52, 109).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.619F, 5.3384F, 2.393F, 3.0808F, 0.0302F, 0.0175F));

		PartDefinition cube_r560 = bone4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(33, 103).mirror().addBox(4.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.347F, 4.761F, 3.2824F, 1.2918F, 0.0302F, 0.0175F));

		PartDefinition cube_r561 = bone4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6579F, 5.399F, 3.7115F, 1.0911F, 0.0302F, 0.0175F));

		PartDefinition cube_r562 = bone4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.5698F, 0.0794F, -0.4495F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.399F, 3.7115F, 1.05F, -0.1288F, 0.0674F));

		PartDefinition cube_r563 = bone4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(62, 92).mirror().addBox(-0.6999F, -0.0381F, -4.7917F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.399F, 3.7115F, 2.4771F, -0.057F, 0.0175F));

		PartDefinition cube_r564 = bone4.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(52, 55).mirror().addBox(-0.8677F, -0.4371F, -4.8757F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.7579F, 7.999F, 7.6115F, 2.3537F, -0.1268F, 0.0874F));

		PartDefinition cube_r565 = bone4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(-0.8677F, -0.2382F, -4.8923F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.7579F, 7.999F, 7.6115F, 2.2839F, -0.1268F, 0.0874F));

		PartDefinition cube_r566 = bone4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(92, 58).mirror().addBox(-0.6999F, 0.5199F, -4.7846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.399F, 3.7115F, 2.3898F, -0.057F, 0.0175F));

		PartDefinition cube_r567 = bone4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(97, 86).mirror().addBox(-0.6999F, 1.2236F, -0.1382F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.399F, 3.7115F, 1.0372F, -0.057F, 0.0175F));

		PartDefinition cube_r568 = bone4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(55, 98).mirror().addBox(-0.6999F, -0.504F, -0.2807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.399F, 3.7115F, 1.1419F, -0.057F, 0.0175F));

		PartDefinition cube_r569 = bone4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(87, 93).mirror().addBox(-0.5F, -3.3F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6499F, 4.8483F, 3.1313F, 0.9776F, 0.0302F, 0.0175F));

		PartDefinition cube_r570 = bone4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.1137F, 0.0302F, 0.0175F));

		PartDefinition cube_r571 = bone4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(42, 71).mirror().addBox(-0.5F, -2.85F, -1.25F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 2.8966F, -0.7132F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r572 = bone4.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(86, 6).mirror().addBox(-0.0003F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0698F, 0.0349F, 0.4363F));

		PartDefinition cube_r573 = bone4.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-0.5F, -4.5F, -0.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.968F, -0.2215F, 4.8161F, 1.5708F, 0.0349F, 0.4363F));

		PartDefinition cube_r574 = bone4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-0.5F, -3.375F, -1.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0706F, -0.3711F, 5.6706F, 1.3963F, 0.0349F, 0.4363F));

		PartDefinition cube_r575 = bone4.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(92, 54).mirror().addBox(-0.0003F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1309F, 0.0349F, 0.4363F));

		PartDefinition cube_r576 = bone4.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.3134F, -1.0998F, 3.1538F, -0.3752F, 0.0349F, 0.4363F));

		PartDefinition cube_r577 = bone4.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(60, 77).mirror().addBox(-0.0003F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.947F, -1.727F, 0.3707F, -0.1745F, 0.0349F, 0.4363F));

		return LayerDefinition.create(meshdefinition, 118, 118);
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