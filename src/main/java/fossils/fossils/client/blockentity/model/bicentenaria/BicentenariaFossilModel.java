package fossils.fossils.client.blockentity.model.bicentenaria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BicentenariaFossilModel extends SkullModelBase {
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

	public BicentenariaFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -14.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.1954F, -6.8978F, 0.2505F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(107, 25).addBox(0.0F, -2.315F, -0.051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 1.0353F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(102, 33).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8556F, -1.0156F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 104).addBox(0.0F, -5.2F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 20).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 20).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 7).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0111F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(77, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(99, 54).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(112, 30).mirror().addBox(-1.8817F, -0.4515F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(112, 30).addBox(0.8817F, -0.4515F, -0.5599F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(99, 54).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 77).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 106).addBox(0.01F, -2.3092F, -0.1729F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2961F, -1.2479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 106).addBox(0.01F, -2.1814F, -0.0939F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(20, 109).addBox(0.01F, -2.6793F, -2.0269F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0693F, 0.0526F, -0.1276F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 104).addBox(0.01F, -2.2912F, -0.0205F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0083F, 0.356F, -1.4973F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(94, 71).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.1961F, 0.2991F, -0.9281F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(109, 39).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.3025F, 0.1565F, -0.4664F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.318F, 0.1649F, -0.4465F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(91, 80).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.2066F, 0.3135F, -0.9075F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 55).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4837F, 0.0091F, 0.3734F, -1.4796F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(112, 57).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(99, 94).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(99, 94).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(112, 57).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 55).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.0091F, -0.3734F, 1.4796F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 32).addBox(-2.5F, -0.2188F, -1.5476F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 9.5025F, -1.2973F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-2.49F, -3.3631F, 0.358F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7724F, -7.2564F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 80).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.2066F, -0.3135F, 0.9075F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(54, 73).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4837F, 0.318F, -0.1649F, 0.4465F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(109, 39).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.3025F, -0.1565F, 0.4664F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(94, 71).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.1961F, -0.2991F, 0.9281F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(77, 36).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0083F, -0.356F, 1.4973F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(56, 0).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(21, 104).addBox(0.01F, -2.3961F, -0.023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.1309F, 0.049F, -0.0376F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 111).addBox(0.01F, -1.85F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2517F, -5.3275F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, 0.0153F, 0.4781F, -1.4423F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, 0.2731F, 0.3978F, -0.8497F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(109, 71).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3837F, 0.4128F, 0.2129F, -0.394F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(109, 83).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, 0.4601F, 0.2384F, -0.3488F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 55).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, 0.0161F, 0.5307F, -1.4074F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(95, 59).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3837F, 0.3062F, 0.4409F, -0.8016F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(33, 87).mirror().addBox(-5.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, -0.0107F, 0.3937F, -1.4363F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(109, 91).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.3263F, 0.191F, -0.3943F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(70, 95).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.202F, 0.3404F, -0.8583F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(70, 95).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.202F, -0.3404F, 0.8583F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(109, 91).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.3263F, -0.191F, 0.3943F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(33, 87).addBox(2.2375F, -1.8712F, -0.5599F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, -0.0107F, -0.3937F, 1.4363F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(95, 59).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, 0.3062F, -0.4409F, 0.8016F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 55).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, 0.0161F, -0.5307F, 1.4074F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(109, 83).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3837F, 0.4601F, -0.2384F, 0.3488F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(109, 71).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, 0.4128F, -0.2129F, 0.394F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(95, 57).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, 0.2731F, -0.3978F, 0.8497F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(74, 53).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3837F, 0.0153F, -0.4781F, 1.4423F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(19, 0).addBox(-2.49F, -1.2539F, -0.2982F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.955F, -5.3187F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(32, 32).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(104, 85).addBox(0.01F, -2.2513F, -0.0922F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(67, 104).addBox(0.01F, -2.6F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1535F, -3.5038F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.1243F, 0.0433F, 0.0054F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(42, 82).addBox(0.01F, -1.7818F, -0.0391F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(36, 111).addBox(0.01F, -1.7018F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0872F, -3.9452F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(-1.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7167F, 7.1723F, -3.9699F, 0.5188F, 0.9536F, 0.5972F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-3.3F, 0.0F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5577F, 8.1538F, -3.412F, 0.1482F, 1.2235F, 0.1484F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(9, 70).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.2973F, 0.4185F, -0.8049F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 28).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.023F, 0.5078F, -1.4036F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 30).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.4427F, 0.2218F, -0.3524F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(62, 36).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.0436F, 0.5358F, -1.4621F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.3308F, 0.4315F, -0.8599F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(69, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5088F, 0.4766F, 0.2203F, -0.4138F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.4766F, -0.2203F, 0.4138F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(98, 79).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.3308F, -0.4315F, 0.8599F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 36).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5088F, 0.0436F, -0.5358F, 1.4621F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(56, 30).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.4427F, -0.2218F, 0.3524F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 28).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.023F, -0.5078F, 1.4036F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(9, 70).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.2973F, -0.4185F, 0.8049F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(20, 56).addBox(-3.7F, 0.0F, -0.3F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5777F, 8.1538F, -3.412F, 0.1482F, -1.2235F, -0.1484F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(69, 24).addBox(-3.5F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7367F, 7.1723F, -3.9699F, 0.5188F, -0.9536F, -0.5972F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(17, 25).addBox(-2.0F, -1.4772F, -4.2583F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.01F, 9.9945F, -0.2263F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 8).addBox(-0.49F, -0.75F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3433F, -5.038F, 0.4517F, 0.1573F, 0.0759F));

		PartDefinition cube_r79 = Neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(74, 111).addBox(0.01F, -1.45F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4338F, -0.093F, -0.2712F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 77).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.2193F, 0.0754F, -0.9899F));

		PartDefinition cube_r81 = Neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-7.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.15F, 0.1773F, -1.5259F));

		PartDefinition cube_r82 = Neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(110, 28).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.2242F, -0.0543F, -0.5365F));

		PartDefinition cube_r83 = Neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(51, 111).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.7035F, -4.2481F, 0.1963F, 0.1494F, -0.8637F));

		PartDefinition cube_r84 = Neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(-5.8817F, -0.4515F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.7035F, -4.2481F, 0.1021F, 0.2456F, -1.3346F));

		PartDefinition cube_r85 = Neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(56, 26).mirror().addBox(-9.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.1496F, 0.1679F, -1.5259F));

		PartDefinition cube_r86 = Neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(99, 17).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.2141F, 0.0676F, -0.9902F));

		PartDefinition cube_r87 = Neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(111, 73).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.2017F, -0.4429F, 0.2161F, -0.0592F, -0.536F));

		PartDefinition cube_r88 = Neckbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(111, 73).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.2161F, 0.0592F, 0.536F));

		PartDefinition cube_r89 = Neckbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(99, 17).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.2141F, -0.0676F, 0.9902F));

		PartDefinition cube_r90 = Neckbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 26).addBox(2.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.2017F, -0.4429F, 0.1496F, -0.1679F, 1.5259F));

		PartDefinition cube_r91 = Neckbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(59, 111).addBox(0.01F, -1.7F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7866F, -2.5173F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r92 = Neckbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(56, 111).addBox(0.01F, -1.8082F, 0.0022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1314F, -4.6422F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r93 = Neckbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(69, 22).addBox(0.8817F, -0.4515F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.7035F, -4.2481F, 0.1021F, -0.2456F, 1.3346F));

		PartDefinition cube_r94 = Neckbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 111).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.7035F, -4.2481F, 0.1963F, -0.1494F, 0.8637F));

		PartDefinition cube_r95 = Neckbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(110, 28).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.2242F, 0.0543F, 0.5365F));

		PartDefinition cube_r96 = Neckbase.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 20).addBox(2.2375F, -1.8712F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.15F, -0.1773F, 1.5259F));

		PartDefinition cube_r97 = Neckbase.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(96, 77).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.2193F, -0.0754F, 0.9899F));

		PartDefinition cube_r98 = Neckbase.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 5.9743F, -6.4272F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r99 = Neckbase.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(65, 38).addBox(-1.0F, -0.7F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 4.4622F, -6.6583F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r100 = Neckbase.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(50, 48).addBox(-0.49F, -1.0987F, -0.5632F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -5.2422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8863F, -5.5903F, -0.4422F, 0.158F, -0.0744F));

		PartDefinition cube_r101 = neck.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(51, 113).addBox(0.01F, -1.382F, -0.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4598F, -2.8812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(42, 111).addBox(0.01F, -2.482F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -2.8816F, -0.3664F, -0.1739F, -0.0076F));

		PartDefinition cube_r104 = neck.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3149F, -0.8967F, -0.3221F, -0.1304F, -0.0115F));

		PartDefinition cube_r105 = neck.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(82, 20).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.3149F, -0.8967F, -0.3221F, 0.1304F, 0.0115F));

		PartDefinition cube_r106 = neck.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(87, 4).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -2.8816F, -0.3664F, 0.1739F, 0.0076F));

		PartDefinition cube_r107 = neck.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(9, 77).addBox(-0.49F, -0.682F, -3.2524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -2.6729F, -0.2759F, 0.0735F, 0.0679F));

		PartDefinition cube_r108 = Neckmiddle.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(45, 111).addBox(0.01F, -1.3329F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -4.0526F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r109 = Neckmiddle.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(59, 80).addBox(0.01F, -1.6828F, -1.4025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(62, 30).addBox(-0.49F, -0.6829F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r110 = Neckmiddle.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 81).mirror().addBox(0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.2072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition cube_r111 = Neckmiddle.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(80, 101).mirror().addBox(-0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.295F, 0.6432F, -3.6945F, -0.1563F, -0.1304F, -0.0115F));

		PartDefinition cube_r112 = Neckmiddle.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(80, 101).addBox(0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.315F, 0.6432F, -3.6945F, -0.1563F, 0.1304F, 0.0115F));

		PartDefinition cube_r113 = Neckmiddle.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(101, 81).addBox(-0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.2072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.6053F, -0.4594F, -0.2766F));

		PartDefinition cube_r114 = neck2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(113, 59).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neck2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(18, 77).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r116 = neck2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r117 = neck2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(31, 58).addBox(-0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.1266F, -0.3276F, -0.1266F));

		PartDefinition cube_r118 = neck5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(77, 113).addBox(0.0F, -1.225F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 113).addBox(0.0F, -1.425F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck5.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(78, 5).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck5.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 95).mirror().addBox(-0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r121 = neck5.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(30, 95).addBox(0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 68).addBox(-0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.275F, -2.7F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck6.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(71, 113).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck6.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(87, 91).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r124 = neck6.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r125 = neck6.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(25, 95).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck3 = neck6.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.415F, 0.5639F, -1.7429F, -0.2049F, -0.3431F, -0.6119F));

		PartDefinition cube_r126 = neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(36, 72).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0053F, -1.0267F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(80, 113).addBox(0.0F, -1.2F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.8262F, -0.4083F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r128 = neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4063F, 0.8461F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r129 = neck3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(87, 95).addBox(0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4063F, 0.8461F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.727F, -2.7012F, 0.2078F, -0.339F, -0.1652F));

		PartDefinition cube_r130 = neck4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(0, 114).addBox(0.0F, -0.8F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 111).addBox(0.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1487F, -1.4678F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r131 = neck4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(27, 77).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r132 = neck4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 101).mirror().addBox(0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.695F, 0.8517F, -1.4114F, 0.1404F, -0.1304F, -0.0115F));

		PartDefinition cube_r133 = neck4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(70, 101).addBox(-0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 0).addBox(-0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.715F, 0.8517F, -1.4114F, 0.1404F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.409F, -0.383F, -0.2566F));

		PartDefinition cube_r134 = Neckend.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(87, 74).addBox(0.0F, -1.4987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Neckend.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 61).mirror().addBox(0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition cube_r136 = Neckend.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(98, 61).addBox(-0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition cube_r137 = Neckend.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 26).addBox(-0.5F, -0.5987F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0807F, -2.5005F, -0.1754F, -0.092F, -0.333F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(69, 69).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.7004F, -1.3203F, -1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(68, 65).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.8912F, -2.3019F, 2.6878F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 40).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1579F, -2.0548F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(50, 84).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.9415F, 0.3957F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(79, 57).addBox(-1.5F, -0.3377F, -0.7932F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.5936F, -0.2747F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2992F, -1.0964F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(68, 61).addBox(-1.5F, -0.55F, -0.35F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6377F, -2.6735F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(68, 57).addBox(-1.5F, -0.65F, -0.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6534F, -4.4735F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(90, 42).addBox(-0.5F, -0.85F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9952F, -13.972F, -2.906F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(107, 30).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.1003F, -13.5258F, -2.0333F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(107, 7).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5125F, -12.7168F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(5, 64).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.921F, -8.9825F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5434F, -7.1204F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(75, 78).addBox(-0.5F, -0.05F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8736F, -8.9666F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(20, 58).addBox(-1.5F, -0.35F, -2.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -2.3397F, -3.7297F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(101, 73).addBox(-0.5F, -0.05F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(50, 80).addBox(-1.5F, -0.05F, -1.55F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.562F, -2.699F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(54, 105).addBox(-0.5F, -0.9582F, -0.0839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5401F, -2.6877F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(107, 44).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.0902F, 0.1019F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(107, 41).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.5596F, -0.7811F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(49, 105).addBox(-0.5F, -0.2021F, 0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.5401F, -2.6877F, -0.096F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6275F, -0.077F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Lowerjawbase.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(-0.5F, -1.0013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(49, 87).addBox(1.7F, -1.0013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 0.8546F, -0.3829F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Lowerjawbase.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition cube_r160 = Lowerjawbase.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition cube_r161 = Lowerjawbase.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(73, 87).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r162 = Lowerjawbase.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(104, 65).mirror().addBox(-0.5F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(104, 65).addBox(1.7F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -3.032F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r163 = Lowerjawbase.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(90, 104).mirror().addBox(-0.5F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(90, 104).addBox(1.7F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -3.032F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Lowerjawbase.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(96, 24).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(97, 9).mirror().addBox(-0.5F, -0.2F, -1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(97, 9).addBox(1.7F, -0.2F, -1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 24).addBox(1.7F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.5471F, -3.6056F, -1.741F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Lowerjawbase.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-0.2F, -0.4813F, 0.7216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(3, 97).mirror().addBox(-0.2F, -0.3063F, 0.1465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -5.2569F, -1.693F, -0.1222F, 0.0F));

		PartDefinition cube_r166 = Lowerjawbase.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-0.2F, 1.1874F, 0.6034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -5.2569F, -1.6057F, -0.1222F, 0.0F));

		PartDefinition cube_r167 = Lowerjawbase.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-0.6935F, 0.8275F, -8.5492F, -1.5533F, -0.1222F, 0.0F));

		PartDefinition cube_r168 = Lowerjawbase.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(104, 90).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(104, 90).addBox(1.7F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.086F, -2.1806F, -1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Lowerjawbase.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(97, 34).mirror().addBox(-0.5F, 1.0446F, -0.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(97, 34).addBox(1.7F, 1.0446F, -0.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.0655F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r170 = Lowerjawbase.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(97, 42).mirror().addBox(-0.5F, -1.6447F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(97, 42).addBox(1.7F, -1.6447F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.0655F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r171 = Lowerjawbase.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(95, 104).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(80, 108).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(80, 108).addBox(1.7F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(95, 104).addBox(1.7F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.1F, 0.0328F, -0.5326F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Lowerjawbase.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(100, 104).mirror().addBox(-0.5F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(110, 76).mirror().addBox(-0.5F, -0.2402F, 0.1561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 76).addBox(1.7F, -0.2402F, 0.1561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 104).addBox(1.7F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.0655F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Lowerjawbase.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(97, 46).mirror().addBox(-0.5F, -0.9344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(97, 46).addBox(1.7F, -0.9344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.324F, 0.0155F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Lowerjawbase.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(21, 82).mirror().addBox(-0.5F, -0.4F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(21, 82).addBox(1.7F, -0.4F, -0.825F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, -0.2525F, -3.0582F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Lowerjawbase.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(50, 97).mirror().addBox(-0.5F, -0.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(50, 97).addBox(1.7F, -0.525F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, -0.2158F, -3.957F, -0.048F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Lowerjawbase.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(80, 87).mirror().addBox(-0.2F, -0.425F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -5.2569F, 0.0611F, -0.1222F, 0.0F));

		PartDefinition cube_r177 = Lowerjawbase.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(73, 31).mirror().addBox(-0.2F, -0.4808F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 38).mirror().addBox(-0.2F, 0.0192F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -5.2569F, 0.096F, -0.1222F, 0.0F));

		PartDefinition cube_r178 = Lowerjawbase.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0752F, -0.1915F, -12.9744F, 0.0175F, -0.1222F, 0.0F));

		PartDefinition cube_r179 = Lowerjawbase.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-0.2F, -0.2618F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -5.2569F, 0.0436F, -0.1222F, 0.0F));

		PartDefinition cube_r180 = Lowerjawbase.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.3046F, 0.142F, -11.7167F, -0.096F, -0.1222F, 0.0F));

		PartDefinition cube_r181 = Lowerjawbase.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-0.1448F, 0.2432F, -13.0178F, 0.0524F, -0.1222F, 0.0F));

		PartDefinition cube_r182 = Lowerjawbase.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(24, 105).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.1592F, 0.5122F, -12.9005F, -0.6894F, -0.1222F, 0.0F));

		PartDefinition cube_r183 = Lowerjawbase.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(55, 97).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.363F, 1.1256F, -11.2406F, -1.6842F, -0.1222F, 0.0F));

		PartDefinition cube_r184 = Lowerjawbase.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(29, 105).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(109, 10).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.3967F, 0.8464F, -10.9669F, 3.0194F, -0.1222F, 0.0F));

		PartDefinition cube_r185 = Lowerjawbase.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(70, 97).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.4299F, 1.1708F, -10.696F, 1.5926F, -0.1222F, 0.0F));

		PartDefinition cube_r186 = Lowerjawbase.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(105, 33).mirror().addBox(-0.5F, -0.3F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false)
				.texOffs(105, 33).addBox(1.95F, -0.3F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-1.225F, 0.2006F, -4.1626F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r187 = Lowerjawbase.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(75, 97).mirror().addBox(-0.5F, -0.55F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(75, 97).addBox(1.7F, -0.55F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, -0.1535F, -2.23F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r188 = Lowerjawbase.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(26, 91).mirror().addBox(-0.5F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(26, 91).addBox(1.7F, -0.2F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, -0.5266F, -2.0774F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r189 = Lowerjawbase.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 108).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(103, 108).mirror().addBox(-0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(103, 108).addBox(1.7F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(75, 108).addBox(1.7F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, -0.3967F, -1.4916F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r190 = Lowerjawbase.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(38, 91).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(38, 91).addBox(1.7F, -0.2F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, -0.5548F, -4.241F, -1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Lowerjawbase.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(45, 91).mirror().addBox(-0.5F, -0.125F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(45, 91).addBox(1.7F, -0.125F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 1.1237F, -4.5614F, -1.5053F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Lowerjawbase.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(108, 108).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(109, 3).mirror().addBox(-0.5F, 0.075F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-0.2111F, -0.2333F, -12.4785F, -1.4923F, -0.1222F, 0.0F));

		PartDefinition cube_r193 = Lowerjawbase.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(8, 100).mirror().addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.1665F, 0.9504F, -12.841F, -1.6057F, -0.1222F, 0.0F));

		PartDefinition cube_r194 = Lowerjawbase.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(109, 13).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(109, 13).addBox(1.7F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.0313F, -4.836F, -1.5228F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Lowerjawbase.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(109, 16).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(109, 16).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.5816F, -4.2869F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Lowerjawbase.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(109, 19).mirror().addBox(-0.5F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false)
				.texOffs(109, 19).addBox(1.95F, -0.45F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-1.225F, 0.1958F, -3.8732F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Lowerjawbase.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(109, 36).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(109, 36).addBox(1.95F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.201F, -3.7233F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Lowerjawbase.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(64, 109).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false)
				.texOffs(64, 109).addBox(1.95F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)), PartPose.offsetAndRotation(-1.225F, 0.3826F, -3.3669F, 0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Lowerjawbase.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(109, 65).mirror().addBox(-0.5F, -0.325F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(109, 65).addBox(1.95F, -0.325F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.6799F, -3.6346F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Lowerjawbase.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(109, 68).mirror().addBox(-0.5F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(109, 68).addBox(1.95F, -0.7F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 1.2448F, -3.605F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r201 = Lowerjawbase.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(109, 80).mirror().addBox(-0.5F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(109, 80).addBox(1.95F, -0.675F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 1.2657F, -4.0044F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r202 = Lowerjawbase.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(109, 88).mirror().addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(70, 91).mirror().addBox(-0.5F, 0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(70, 91).addBox(1.95F, 0.1F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(109, 88).addBox(1.95F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 1.2344F, -4.4032F, 2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r203 = Lowerjawbase.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(110, 25).mirror().addBox(-0.5F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(110, 25).addBox(1.95F, -0.3F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.1005F, -4.5498F, -0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r204 = Lowerjawbase.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(110, 33).mirror().addBox(-0.5F, -0.7F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(110, 33).addBox(1.95F, -0.7F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 0.6658F, -4.5696F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r205 = Lowerjawbase.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(13, 100).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 100).mirror().addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(65, 100).mirror().addBox(-0.5F, -0.9F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1726F, -0.2054F, -12.1805F, -0.1134F, -0.1222F, 0.0F));

		PartDefinition cube_r206 = Lowerjawbase.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(90, 100).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 100).mirror().addBox(-0.5F, -1.1F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(100, 100).mirror().addBox(-0.5F, -1.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 101).mirror().addBox(-0.5F, -1.2F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 0).mirror().addBox(-0.5F, -1.2F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4619F, 0.1656F, -9.825F, -0.0262F, -0.1222F, 0.0F));

		PartDefinition cube_r207 = Lowerjawbase.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(70, 97).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.4299F, 1.1708F, -10.696F, 1.5926F, 0.1222F, 0.0F));

		PartDefinition cube_r208 = Lowerjawbase.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(109, 10).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(29, 105).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3967F, 0.8464F, -10.9669F, 3.0194F, 0.1222F, 0.0F));

		PartDefinition cube_r209 = Lowerjawbase.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(55, 97).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.363F, 1.1256F, -11.2406F, -1.6842F, 0.1222F, 0.0F));

		PartDefinition cube_r210 = Lowerjawbase.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(8, 100).addBox(-0.5F, -1.8F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.1665F, 0.9504F, -12.841F, -1.6057F, 0.1222F, 0.0F));

		PartDefinition cube_r211 = Lowerjawbase.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(24, 105).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1592F, 0.5122F, -12.9005F, -0.6894F, 0.1222F, 0.0F));

		PartDefinition cube_r212 = Lowerjawbase.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 105).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.1448F, 0.2432F, -13.0178F, 0.0524F, 0.1222F, 0.0F));

		PartDefinition cube_r213 = Lowerjawbase.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(109, 3).addBox(-0.5F, 0.075F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(108, 108).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.2111F, -0.2333F, -12.4785F, -1.4923F, 0.1222F, 0.0F));

		PartDefinition cube_r214 = Lowerjawbase.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.3046F, 0.142F, -11.7167F, -0.096F, 0.1222F, 0.0F));

		PartDefinition cube_r215 = Lowerjawbase.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(87, 87).addBox(-0.8F, -0.2618F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -5.2569F, 0.0436F, 0.1222F, 0.0F));

		PartDefinition cube_r216 = Lowerjawbase.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(101, 0).addBox(-0.5F, -1.2F, 2.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 101).addBox(-0.5F, -1.2F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 100).addBox(-0.5F, -1.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 100).addBox(-0.5F, -1.1F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 100).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4619F, 0.1656F, -9.825F, -0.0262F, 0.1222F, 0.0F));

		PartDefinition cube_r217 = Lowerjawbase.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(65, 100).addBox(-0.5F, -0.9F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(18, 100).addBox(-0.5F, -0.9F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(13, 100).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1726F, -0.2054F, -12.1805F, -0.1134F, 0.1222F, 0.0F));

		PartDefinition cube_r218 = Lowerjawbase.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(97, 50).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0752F, -0.1915F, -12.9744F, 0.0175F, 0.1222F, 0.0F));

		PartDefinition cube_r219 = Lowerjawbase.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 38).addBox(-0.8F, 0.0192F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F))
				.texOffs(73, 31).addBox(-0.8F, -0.4808F, -4.399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -5.2569F, 0.096F, 0.1222F, 0.0F));

		PartDefinition cube_r220 = Lowerjawbase.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(80, 87).addBox(-0.8F, -0.425F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -5.2569F, 0.0611F, 0.1222F, 0.0F));

		PartDefinition cube_r221 = Lowerjawbase.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(3, 97).addBox(-0.8F, -0.3063F, 0.1465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(96, 73).addBox(-0.8F, -0.4813F, 0.7216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -5.2569F, -1.693F, 0.1222F, 0.0F));

		PartDefinition cube_r222 = Lowerjawbase.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(92, 96).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(0.6935F, 0.8275F, -8.5492F, -1.5533F, 0.1222F, 0.0F));

		PartDefinition cube_r223 = Lowerjawbase.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(96, 82).addBox(-0.8F, 1.1874F, 0.6034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -5.2569F, -1.6057F, 0.1222F, 0.0F));

		PartDefinition cube_r224 = Lowerjawbase.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(73, 87).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r225 = Lowerjawbase.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(87, 70).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r226 = Lowerjawbase.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(87, 66).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.7478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.4936F, -2.4747F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(54, 75).addBox(-0.9F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9954F, 1.0532F, -8.9484F, 0.3673F, 0.0652F, 0.0251F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(56, 88).addBox(-1.8752F, -1.602F, 1.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(99, 19).addBox(-1.8752F, -3.8592F, -0.3545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -1.4137F, 0.1047F, 0.0F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(105, 99).addBox(-1.8752F, -0.519F, 0.9084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.0698F, 0.1047F, 0.0F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(28, 82).addBox(-1.8752F, -1.4862F, 2.9579F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.1047F, 0.1047F, 0.0F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(84, 77).addBox(-1.7134F, 0.5531F, -0.7349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 1.9987F, 0.1046F, 0.0055F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(107, 47).addBox(-1.7134F, -0.8538F, 0.2647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.873F, 0.1046F, 0.0055F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(80, 105).addBox(-1.7134F, -0.7327F, -0.7225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -0.436F, 0.1046F, 0.0055F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(102, 8).addBox(-1.7134F, -0.2799F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(28, 111).addBox(-1.8634F, -0.9049F, -0.4855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -1.4483F, 0.1046F, 0.0055F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.6501F, 0.5787F, -9.0357F, 0.3403F, 0.1047F, 0.0F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(87, 30).addBox(-0.5123F, -0.1774F, -0.5847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2985F, -0.3662F, -4.2182F, 1.1213F, 0.1392F, 0.1886F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5123F, -0.9158F, -0.8244F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.2985F, -0.3662F, -4.2182F, 0.4668F, 0.1392F, 0.1886F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(60, 69).addBox(-0.4877F, -0.9391F, -2.5224F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2985F, -0.3662F, -4.2182F, 0.3447F, 0.1392F, 0.1886F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(65, 43).addBox(-1.8752F, -1.9746F, 5.12F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.2182F, 0.1047F, 0.0F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(105, 77).addBox(-1.6002F, -3.1986F, 0.8055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -0.8203F, 0.1047F, 0.0F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(107, 53).addBox(-1.6458F, 1.4408F, -0.3093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 2.2777F, 0.1047F, 0.0F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(107, 50).addBox(-1.6458F, -0.1397F, -2.1429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -2.522F, 0.1047F, 0.0F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(88, 107).addBox(-1.6458F, -0.1794F, -1.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -2.5045F, 0.1047F, 0.0F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(107, 85).addBox(-1.6458F, -1.0592F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -1.1083F, 0.1047F, 0.0F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 56).addBox(-1.6458F, -1.0883F, -0.9173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -0.9076F, 0.1047F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(75, 105).addBox(-1.6458F, -1.512F, -1.0925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, -1.1257F, 0.1047F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(92, 50).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2215F, 2.0398F, -4.0199F, -1.5089F, 0.1135F, -0.0042F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(104, 19).addBox(-0.5045F, -1.7226F, -0.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(16, 104).addBox(-0.5045F, -1.7226F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0521F, 0.936F, -5.5051F, -1.823F, 0.1135F, -0.0042F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(104, 14).addBox(-0.5045F, -0.1812F, -1.8162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(104, 38).addBox(-0.5045F, -0.6812F, -0.5412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(104, 38).addBox(-0.5045F, -0.6812F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(104, 11).addBox(-0.5045F, -0.1812F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0521F, 0.936F, -5.5051F, -2.9575F, 0.1135F, -0.0042F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(11, 104).addBox(-0.5045F, -0.3813F, -0.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0521F, 0.936F, -5.5051F, 1.8858F, 0.1135F, -0.0042F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(104, 4).addBox(-0.5045F, -0.7993F, -1.2463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0521F, 0.936F, -5.5051F, 0.4895F, 0.1135F, -0.0042F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(85, 103).addBox(-0.5045F, 0.5625F, -1.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0521F, 0.936F, -5.5051F, -0.4704F, 0.1135F, -0.0042F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(98, 107).addBox(-1.0181F, -0.9907F, -2.3199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 96).addBox(-1.0181F, -0.9907F, -3.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 107).addBox(-1.0181F, -0.9907F, -3.9199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 99).addBox(-1.0181F, -1.8907F, -4.7199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 65).addBox(-1.0181F, -1.7907F, -5.5199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(44, 99).addBox(-1.0181F, -1.7907F, -6.3199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(39, 99).addBox(-1.0181F, -1.8407F, -7.1199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 38).addBox(-1.0181F, -1.7407F, -7.9199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(70, 105).addBox(-1.0181F, -1.3407F, -8.7199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.6472F, -2.8026F, 0.1833F, 0.1047F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(66, 84).addBox(-0.525F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2592F, 1.499F, -3.2397F, 0.0088F, 0.0698F, 0.0012F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(82, 25).addBox(-1.8752F, -1.5306F, 4.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 2.6472F, -11.0026F, 0.096F, 0.1047F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(29, 108).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -0.8327F, -3.3677F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(85, 37).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.48F, 0.862F, -3.5011F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(39, 103).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.5514F, -3.3795F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(26, 87).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, 1.9275F, -2.7891F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(34, 103).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.9581F, -2.0898F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(19, 87).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.48F, 1.9275F, -1.3905F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(102, 96).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.6881F, -0.7327F, -2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(59, 102).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.48F, 1.2152F, -0.2166F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(24, 108).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 0.5574F, 0.0228F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(90, 46).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -0.1187F, 0.204F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(102, 56).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -0.8161F, 0.143F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(85, 53).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.48F, -1.3111F, -0.352F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(102, 48).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -1.5789F, -0.9987F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(102, 45).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.48F, -1.6095F, -1.698F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -1.4283F, -2.3742F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(59, 105).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -1.4283F, -2.3742F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(86, 61).addBox(-0.2875F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(42, 86).addBox(-0.6125F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.3575F, -0.3099F, -2.1895F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(19, 91).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.47F, 1.3055F, 2.3938F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(70, 108).addBox(-0.5F, -1.35F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F))
				.texOffs(59, 108).addBox(-0.5F, -1.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(54, 108).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.47F, 2.6392F, 2.0049F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(99, 90).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, 2.1706F, 0.3707F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(108, 59).addBox(-0.5F, 1.075F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(99, 86).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, 1.6043F, -0.0407F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(49, 108).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.47F, 0.9183F, 0.0988F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(12, 91).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, -0.6891F, 0.6523F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(110, 105).addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(1.47F, 0.2656F, 2.0963F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(108, 62).addBox(-0.5F, -0.85F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, -0.3857F, 2.3528F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(103, 59).addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.47F, -0.9857F, 1.9923F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(44, 103).addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, -0.9735F, 1.2924F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(27, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1448F)), PartPose.offsetAndRotation(1.47F, -0.2583F, 1.2518F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(102, 51).addBox(-0.5F, -1.866F, -2.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.47F, 1.4681F, 0.574F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(60, 98).addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 2.5175F, 2.4848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(97, 96).addBox(-0.5F, -1.0598F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.5F, 2.5175F, 2.4848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(34, 99).addBox(-0.25F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, -0.6605F, 2.5862F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(92, 39).addBox(-1.525F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 5).addBox(-1.525F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1344F, -1.1337F, 2.2467F, -3.057F, -0.6619F, -1.0441F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(44, 117).addBox(-0.45F, -0.725F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5594F, -1.1123F, -0.3444F, 0.3972F, -0.4359F, -0.0203F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(54, 101).addBox(-0.45F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5594F, -1.1123F, -0.3444F, 0.0481F, -0.4359F, -0.0203F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(31, 117).addBox(-0.5F, -0.825F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.0956F, -0.8928F, -0.7852F, 0.3296F, -0.8715F, -0.0519F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(49, 101).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.0944F, -0.776F, 0.0678F, -0.8715F, -0.0519F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(80, 97).addBox(-0.25F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.25F, -0.6605F, 2.5862F, 1.2479F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.4936F, -2.4747F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-0.1F, -0.5F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9954F, 1.0532F, -8.9484F, 0.3673F, -0.0652F, -0.0251F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(56, 88).mirror().addBox(0.8752F, -1.602F, 1.2971F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(99, 19).mirror().addBox(0.8752F, -3.8592F, -0.3545F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -1.4137F, -0.1047F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(105, 99).mirror().addBox(0.8752F, -0.519F, 0.9084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.0698F, -0.1047F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(28, 82).mirror().addBox(0.8752F, -1.4862F, 2.9579F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.1047F, -0.1047F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(84, 77).mirror().addBox(0.7134F, 0.5531F, -0.7349F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 1.9987F, -0.1046F, -0.0055F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(107, 47).mirror().addBox(0.7134F, -0.8538F, 0.2647F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.873F, -0.1046F, -0.0055F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(80, 105).mirror().addBox(0.7134F, -0.7327F, -0.7225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -0.436F, -0.1046F, -0.0055F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(102, 8).mirror().addBox(0.7134F, -0.2799F, -0.3355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(28, 111).mirror().addBox(0.8634F, -0.9049F, -0.4855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -1.4483F, -0.1046F, -0.0055F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6501F, 0.5787F, -9.0357F, 0.3403F, -0.1047F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(87, 30).mirror().addBox(-0.4877F, -0.1774F, -0.5847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, -0.3662F, -4.2182F, 1.1213F, -0.1392F, -0.1886F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.4877F, -0.9158F, -0.8244F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, -0.3662F, -4.2182F, 0.4668F, -0.1392F, -0.1886F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(60, 69).mirror().addBox(-0.5123F, -0.9391F, -2.5224F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2985F, -0.3662F, -4.2182F, 0.3447F, -0.1392F, -0.1886F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(65, 43).mirror().addBox(0.8752F, -1.9746F, 5.12F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.2182F, -0.1047F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(105, 77).mirror().addBox(0.6002F, -3.1986F, 0.8055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -0.8203F, -0.1047F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(107, 53).mirror().addBox(0.6458F, 1.4408F, -0.3093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 2.2777F, -0.1047F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(107, 50).mirror().addBox(0.6458F, -0.1397F, -2.1429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -2.522F, -0.1047F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(88, 107).mirror().addBox(0.6458F, -0.1794F, -1.676F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -2.5045F, -0.1047F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(107, 85).mirror().addBox(0.6458F, -1.0592F, -0.9724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -1.1083F, -0.1047F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(107, 56).mirror().addBox(0.6458F, -1.0883F, -0.9173F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.208F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -0.9076F, -0.1047F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(75, 105).mirror().addBox(0.6458F, -1.512F, -1.0925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, -1.1257F, -0.1047F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(92, 50).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2215F, 2.0398F, -4.0199F, -1.5089F, -0.1135F, 0.0042F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(104, 19).mirror().addBox(-0.4955F, -1.7226F, -0.3033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(16, 104).mirror().addBox(-0.4955F, -1.7226F, -0.6033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, 0.936F, -5.5051F, -1.823F, -0.1135F, 0.0042F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(104, 14).mirror().addBox(-0.4955F, -0.1812F, -1.8162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(104, 38).mirror().addBox(-0.4955F, -0.6812F, -0.5412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(104, 38).mirror().addBox(-0.4955F, -0.6812F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(104, 11).mirror().addBox(-0.4955F, -0.1812F, -1.5162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, 0.936F, -5.5051F, -2.9575F, -0.1135F, 0.0042F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(11, 104).mirror().addBox(-0.4955F, -0.3813F, -0.2556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, 0.936F, -5.5051F, 1.8858F, -0.1135F, 0.0042F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-0.4955F, -0.7993F, -1.2463F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, 0.936F, -5.5051F, 0.4895F, -0.1135F, 0.0042F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(85, 103).mirror().addBox(-0.4955F, 0.5625F, -1.3696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, 0.936F, -5.5051F, -0.4704F, -0.1135F, 0.0042F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(98, 107).mirror().addBox(0.0181F, -0.9907F, -2.3199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 96).mirror().addBox(0.0181F, -0.9907F, -3.1199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 107).mirror().addBox(0.0181F, -0.9907F, -3.9199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(85, 99).mirror().addBox(0.0181F, -1.8907F, -4.7199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 65).mirror().addBox(0.0181F, -1.7907F, -5.5199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(44, 99).mirror().addBox(0.0181F, -1.7907F, -6.3199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(39, 99).mirror().addBox(0.0181F, -1.8407F, -7.1199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 38).mirror().addBox(0.0181F, -1.7407F, -7.9199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(70, 105).mirror().addBox(0.0181F, -1.3407F, -8.7199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.6472F, -2.8026F, 0.1833F, -0.1047F, 0.0F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(66, 84).mirror().addBox(-0.475F, -1.025F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2592F, 1.499F, -3.2397F, 0.0088F, -0.0698F, -0.0012F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(82, 25).mirror().addBox(0.8752F, -1.5306F, 4.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 2.6472F, -11.0026F, 0.096F, -0.1047F, 0.0F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(29, 108).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.8327F, -3.3677F, -2.4784F, 0.0F, 0.0F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(85, 37).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.862F, -3.5011F, 3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(39, 103).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.5514F, -3.3795F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(26, 87).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.9275F, -2.7891F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(34, 103).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.9581F, -2.0898F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(19, 87).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.9275F, -1.3905F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(102, 96).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.6881F, -0.7327F, -2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(59, 102).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.2152F, -0.2166F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(24, 108).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.5574F, 0.0228F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(90, 46).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.1187F, 0.204F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(102, 56).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.8161F, 0.143F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.3111F, -0.352F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(102, 48).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.5789F, -0.9987F, 2.7489F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(102, 45).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.6095F, -1.698F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(0, 108).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.4283F, -2.3742F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(59, 105).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.4283F, -2.3742F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(86, 61).mirror().addBox(-0.7125F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(42, 86).mirror().addBox(-0.3875F, -1.4F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3575F, -0.3099F, -2.1895F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(19, 91).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.3055F, 2.3938F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(70, 108).mirror().addBox(-0.5F, -1.35F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(59, 108).mirror().addBox(-0.5F, -1.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(54, 108).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 2.6392F, 2.0049F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 2.1706F, 0.3707F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(108, 59).mirror().addBox(-0.5F, 1.075F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(99, 86).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.6043F, -0.0407F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(49, 108).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.9183F, 0.0988F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.6891F, 0.6523F, -1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(110, 105).mirror().addBox(-0.5F, -0.85F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.2656F, 2.0963F, 2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-0.5F, -0.85F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.3857F, 2.3528F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(103, 59).mirror().addBox(-0.5F, -0.15F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.9857F, 1.9923F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r351 = rightFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(44, 103).mirror().addBox(-0.5F, -0.15F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.9735F, 1.2924F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r352 = rightFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(27, 72).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1448F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.2583F, 1.2518F, -1.597F, 0.0F, 0.0F));

		PartDefinition cube_r353 = rightFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(102, 51).mirror().addBox(-0.5F, -1.866F, -2.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.4681F, 0.574F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r354 = rightFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(60, 98).mirror().addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.5175F, 2.4848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r355 = rightFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-0.5F, -1.0598F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.5175F, 2.4848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r356 = rightFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(34, 99).mirror().addBox(-0.75F, -0.8F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.6605F, 2.5862F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r357 = rightFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(92, 39).mirror().addBox(-0.475F, -0.15F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 5).mirror().addBox(-0.475F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1344F, -1.1337F, 2.2467F, -3.057F, 0.6619F, 1.0441F));

		PartDefinition cube_r358 = rightFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(44, 117).mirror().addBox(-0.55F, -0.725F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -1.1123F, -0.3444F, 0.3972F, 0.4359F, 0.0203F));

		PartDefinition cube_r359 = rightFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(54, 101).mirror().addBox(-0.55F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -1.1123F, -0.3444F, 0.0481F, 0.4359F, 0.0203F));

		PartDefinition cube_r360 = rightFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(31, 117).mirror().addBox(-0.5F, -0.825F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.0956F, -0.8928F, -0.7852F, 0.3296F, 0.8715F, 0.0519F));

		PartDefinition cube_r361 = rightFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(49, 101).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.0944F, -0.776F, 0.0678F, 0.8715F, 0.0519F));

		PartDefinition cube_r362 = rightFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-0.75F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.25F, -0.6605F, 2.5862F, 1.2479F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(99, 4).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.2443F, 6.7668F, -7.0129F, 0.1932F, 0.1506F, -0.5033F));

		PartDefinition cube_r363 = Rightupperarm.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(99, 13).addBox(-0.5F, 0.4F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1308F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Rightupperarm.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(57, 92).addBox(-0.5F, -1.45F, -1.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r365 = Rightupperarm.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(52, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.9654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r366 = Rightupperarm.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(105, 105).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.2416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r367 = Rightupperarm.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(105, 102).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3353F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r368 = Rightupperarm.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(106, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.6044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r369 = Rightupperarm.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(106, 73).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6647F, -0.4912F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8485F, 6.5367F, 2.9241F, -0.7452F, -0.0902F, -0.086F));

		PartDefinition cube_r370 = Rightlowerarm.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(45, 78).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 75).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(42, 62).addBox(-0.9F, 0.1F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9519F, 5.7281F, -0.1712F, 0.3378F, 0.0393F, 0.2329F));

		PartDefinition cube_r371 = Righthand.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(34, 25).addBox(-1.5F, -1.9F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(99, 4).mirror().addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.2243F, 6.7668F, -7.0129F, -0.4192F, 0.3912F, 0.6941F));

		PartDefinition cube_r372 = Leftupperarm.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(99, 13).mirror().addBox(-0.5F, 0.4F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1308F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Leftupperarm.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-0.5F, -1.45F, -1.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Leftupperarm.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(52, 92).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.9654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Leftupperarm.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(105, 105).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Leftupperarm.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3353F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Leftupperarm.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(106, 93).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Leftupperarm.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(106, 73).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6647F, -0.4912F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8485F, 6.5367F, 2.9241F, -0.9254F, -0.1175F, -0.1384F));

		PartDefinition cube_r379 = Leftlowerarm.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.5F, -1.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 75).mirror().addBox(-0.5F, -1.5F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(42, 62).mirror().addBox(-0.1F, 0.1F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9519F, 5.7281F, -0.1712F, 0.3378F, -0.0393F, -0.2329F));

		PartDefinition cube_r380 = Lefthand.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(34, 25).mirror().addBox(-0.5F, -1.9F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3093F, 5.3514F, -8.6255F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition cube_r381 = bone.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(111, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1825F, -6.6706F, 6.0595F, 2.6177F, 0.0088F, 0.0031F));

		PartDefinition cube_r382 = bone.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 111).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1751F, -6.9717F, 5.1059F, 1.265F, 0.0088F, 0.0031F));

		PartDefinition cube_r383 = bone.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(18, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.153F, -4.4421F, 3.4933F, 1.0032F, 0.0088F, 0.0031F));

		PartDefinition cube_r384 = bone.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(9, 72).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.153F, -4.4421F, 3.4933F, 0.6978F, 0.0088F, 0.0031F));

		PartDefinition cube_r385 = bone.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -2.1446F, 1.5643F, 0.8723F, 0.0088F, 0.0031F));

		PartDefinition cube_r386 = bone.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(65, 49).addBox(-1.0774F, 1.1587F, -1.2039F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(89, 0).addBox(-1.0774F, 0.1587F, -0.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.7496F, 0.4746F, 0.2902F));

		PartDefinition cube_r387 = bone.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(106, 22).addBox(-1.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(88, 57).addBox(-1.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.1388F, 0.4746F, 0.2902F));

		PartDefinition cube_r388 = bone.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(106, 0).addBox(-1.0383F, -0.7431F, -0.6178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, 0.5448F, 0.5273F, 0.3609F));

		PartDefinition cube_r389 = bone.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(87, 15).addBox(-1.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -1.9676F, 1.8495F, 0.6136F, 0.2865F, 0.2773F));

		PartDefinition cube_r390 = bone.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(12, 87).addBox(-1.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6385F, -1.9676F, 1.8495F, 1.0499F, 0.2865F, 0.2773F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2893F, 5.3514F, -8.6255F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition cube_r391 = bone3.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(111, 0).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1825F, -6.6706F, 6.0595F, 2.6177F, -0.0088F, -0.0031F));

		PartDefinition cube_r392 = bone3.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1751F, -6.9717F, 5.1059F, 1.265F, -0.0088F, -0.0031F));

		PartDefinition cube_r393 = bone3.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.153F, -4.4421F, 3.4933F, 1.0032F, -0.0088F, -0.0031F));

		PartDefinition cube_r394 = bone3.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(9, 72).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.153F, -4.4421F, 3.4933F, 0.6978F, -0.0088F, -0.0031F));

		PartDefinition cube_r395 = bone3.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -2.1446F, 1.5643F, 0.8723F, -0.0088F, -0.0031F));

		PartDefinition cube_r396 = bone3.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(65, 49).mirror().addBox(0.0774F, 1.1587F, -1.2039F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(89, 0).mirror().addBox(0.0774F, 0.1587F, -0.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.7496F, -0.4746F, -0.2902F));

		PartDefinition cube_r397 = bone3.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(106, 22).mirror().addBox(0.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(88, 57).mirror().addBox(0.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.1388F, -0.4746F, -0.2902F));

		PartDefinition cube_r398 = bone3.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(0.0383F, -0.7431F, -0.6178F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, 0.5448F, -0.5273F, -0.3609F));

		PartDefinition cube_r399 = bone3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(87, 15).mirror().addBox(0.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.9676F, 1.8495F, 0.6136F, -0.2865F, -0.2773F));

		PartDefinition cube_r400 = bone3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(12, 87).mirror().addBox(0.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.9676F, 1.8495F, 1.0499F, -0.2865F, -0.2773F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(31, 62).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.1203F, 0.0F, 0.0F));

		PartDefinition cube_r401 = Tailbase.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, 0.2918F, -0.5156F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r402 = Tailbase.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(25, 68).mirror().addBox(-2.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r403 = Tailbase.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(25, 68).addBox(0.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r404 = Tailbase.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(8, 109).addBox(0.0F, -2.4235F, 0.0045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r405 = Tailbase.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(37, 106).addBox(0.0F, -2.266F, 0.0045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(57, 63).addBox(-0.5F, -0.0721F, 0.003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4822F, 3.7698F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r406 = tail2.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(49, 69).mirror().addBox(-2.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r407 = tail2.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(49, 69).addBox(0.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r408 = tail2.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(67, 93).addBox(0.0F, -0.3697F, -0.3796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9279F, 3.6029F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r409 = tail2.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, 0.2899F, -0.3899F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5672F, 1.0043F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r410 = tail2.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(43, 106).addBox(0.0F, -2.4706F, 0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1197F, 1.9979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r411 = tail2.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(40, 106).addBox(0.0F, -2.4334F, 0.0055F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, 0.1407F, -0.0864F, -0.0122F));

		PartDefinition cube_r412 = Tailmiddlebase.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2508F, 0.0938F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r413 = Tailmiddlebase.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(0, 8).addBox(-0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2508F, 0.0938F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r414 = Tailmiddlebase.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Tailmiddlebase.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(17, 107).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2783F, 4.0666F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Tailmiddlebase.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(62, 112).addBox(0.0F, -2.3F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4178F, 8.5905F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Tailmiddlebase.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(112, 53).addBox(0.0F, -2.25F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Tailmiddlebase.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(14, 107).addBox(0.0F, -2.4456F, 0.0044F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0372F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Tailmiddlebase.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(99, 28).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 6.4943F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Tailmiddlebase.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(28, 99).addBox(0.0F, -0.1F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4276F, 4.6464F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Tailmiddlebase.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(25, 99).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6698F, 2.6511F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r422 = Tailmiddlebase.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(5, 111).addBox(0.0F, -2.7206F, 0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.2533F, -0.0422F, -0.0109F));

		PartDefinition cube_r423 = tail.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(37, 56).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2449F, 1.07F, 0.0526F, 0.1046F, 0.0055F));

		PartDefinition cube_r424 = tail.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(37, 56).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2449F, 1.07F, 0.0526F, -0.1046F, -0.0055F));

		PartDefinition cube_r425 = tail.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(5, 40).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r426 = tail.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(106, 111).addBox(0.0F, -1.975F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r427 = tail.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(103, 111).addBox(0.0F, -1.7923F, -0.0216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r428 = tail.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(46, 106).addBox(0.0F, 0.4F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0058F, 3.9197F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r429 = tail.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(31, 99).addBox(0.0F, -0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0337F, 1.7032F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(112, 49).addBox(0.0F, -2.0805F, 4.9585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.0429F, -0.0436F, -0.0019F));

		PartDefinition cube_r430 = Tailmiddleend.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(33, 111).addBox(0.0F, -1.4369F, -0.1278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Tailmiddleend.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(112, 45).addBox(0.0F, -1.6269F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5456F, 0.9856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Tailmiddleend.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(17, 32).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r433 = Tailmiddleend.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(106, 80).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9636F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Tailmiddleend.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(106, 68).addBox(0.0F, 0.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1605F, 0.4067F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Tailmiddleend.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(5, 101).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2448F, 2.8299F, 0.672F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.0555F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Tailend.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(83, 113).addBox(0.0F, -1.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 40).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Tailend.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(11, 107).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6027F, 3.6491F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Tailend.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(85, 106).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, 1.4171F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Tailend.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(112, 85).addBox(0.0F, -1.075F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0221F, 3.0118F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Tailend.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(109, 111).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 1.013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, 0.1777F, 0.0086F, 0.0015F));

		PartDefinition cube_r441 = Tailend2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(92, 113).addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 113).addBox(0.0F, -1.2F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 113).addBox(0.0F, -1.3F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 40).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Tailend2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(14, 112).addBox(0.0F, 7.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 112).addBox(0.0F, 8.1F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Tailend2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(112, 6).addBox(0.0F, 1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.286F, 0.2973F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, 0.1253F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Tailend3.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(113, 108).addBox(0.0F, -1.0F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 113).addBox(0.0F, -1.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1722F, -5.8848F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Tailend3.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Tailend3.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(112, 41).addBox(0.0F, 11.4F, 22.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 112).addBox(0.0F, 10.5F, 20.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, 0.1342F, 0.0519F, 0.007F));

		PartDefinition cube_r447 = Tailend4.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(112, 111).addBox(0.0F, 14.2F, 28.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 93).addBox(0.0F, 13.5F, 26.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 112).addBox(0.0F, 12.7F, 24.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5266F, -27.5757F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Tailend4.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(41, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, 0.1864F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Tailend5.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(8, 114).addBox(0.0F, 17.9F, 34.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 3).addBox(0.0F, 16.9F, 32.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 113).addBox(0.0F, 16.1F, 30.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7102F, -33.4775F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Tailend5.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(5, 56).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, 0.0462F, 0.0784F, 0.015F));

		PartDefinition cube_r451 = Tailend6.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(41, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, -0.0397F, 0.1132F, 0.0059F));

		PartDefinition cube_r452 = Tailend7.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(41, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1307F, 0.0859F, -0.0265F));

		PartDefinition cube_r453 = Tailend8.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(47, 32).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend9 = Tailend8.addOrReplaceChild("Tailend9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 6.0F, -0.1588F, 0.1465F, -0.0234F));

		PartDefinition cube_r454 = Tailend9.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(5, 48).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend10 = Tailend9.addOrReplaceChild("Tailend10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.1764F, 0.1461F, -0.0259F));

		PartDefinition cube_r455 = Tailend10.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(20, 48).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend11 = Tailend10.addOrReplaceChild("Tailend11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.132F, 0.1298F, -0.0172F));

		PartDefinition cube_r456 = Tailend11.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(35, 48).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend12 = Tailend11.addOrReplaceChild("Tailend12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, -0.2612F, 0.2033F, -0.1004F));

		PartDefinition cube_r457 = Tailend12.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(19, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -0.2805F, -0.0688F, -0.3321F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Rightthigh.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(78, 10).addBox(-1.3F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Rightthigh.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, -3.036F, 0.0112F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.4725F, -0.2881F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r460 = Rightthigh.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(75, 82).addBox(-0.5F, 0.039F, -0.0138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 6.3947F, -0.2738F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r461 = Rightthigh.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(75, 101).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.8612F, 0.9461F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r462 = Rightthigh.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(40, 95).addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r463 = Rightthigh.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.4322F, -0.5506F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r464 = Rightthigh.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(71, 0).addBox(-1.0F, -0.3F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 10.5191F, 2.5548F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r465 = Rightthigh.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(59, 83).addBox(-0.5F, -3.1F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 10.2811F, 0.6194F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r466 = Rightthigh.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(83, 48).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 10.2811F, 0.6194F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r467 = Rightthigh.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(35, 82).addBox(-0.5F, -1.5F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 9.6488F, 1.0102F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r468 = Rightthigh.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.8612F, 2.0278F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(94, 29).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 13.1579F, 3.6721F, 1.4525F, 0.0F, 0.0F));

		PartDefinition cube_r469 = Rightshin.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(92, 34).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r470 = Rightshin.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(87, 34).addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(25, 65).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r471 = Rightshin.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(92, 9).addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r472 = Rightshin.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r473 = Rightshin.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(20, 95).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r474 = Rightshin.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(45, 95).addBox(-0.5F, 6.0098F, 1.4145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 8.3818F, -0.9752F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r475 = Rightshin.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r476 = Rightshin.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(87, 9).addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r477 = Rightshin.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(79, 61).addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r478 = Rightshin.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(89, 19).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r479 = Rightshin.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r480 = Rightshin.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(36, 7).addBox(-0.5F, -3.0F, -0.8F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r481 = Rightshin.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(77, 91).addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r482 = Rightshin.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(82, 30).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, 0.183F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(50, 56).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 16.9746F, -2.1439F, -1.072F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(56, 15).addBox(-1.9F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.097F, 0.0929F, 0.3382F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.9F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.5868F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -0.2805F, -0.0688F, -1.2048F, 0.0F, 0.0F));

		PartDefinition cube_r483 = Leftthigh.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(78, 10).mirror().addBox(-0.7F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r484 = Leftthigh.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.5F, -3.036F, 0.0112F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.4725F, -0.2881F, 0.0567F, 0.0F, 0.0F));

		PartDefinition cube_r485 = Leftthigh.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.5F, 0.039F, -0.0138F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.3947F, -0.2738F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r486 = Leftthigh.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(75, 101).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8612F, 0.9461F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r487 = Leftthigh.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r488 = Leftthigh.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4322F, -0.5506F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r489 = Leftthigh.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-1.0F, -0.3F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5191F, 2.5548F, 1.117F, 0.0F, 0.0F));

		PartDefinition cube_r490 = Leftthigh.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(59, 83).mirror().addBox(-0.5F, -3.1F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.2811F, 0.6194F, -1.6842F, 0.0F, 0.0F));

		PartDefinition cube_r491 = Leftthigh.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(83, 48).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.2811F, 0.6194F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r492 = Leftthigh.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(35, 82).mirror().addBox(-0.5F, -1.5F, -0.55F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 9.6488F, 1.0102F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r493 = Leftthigh.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.8612F, 2.0278F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(94, 29).mirror().addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 13.1579F, 3.6721F, 1.9761F, 0.0F, 0.0F));

		PartDefinition cube_r494 = Leftshin.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(92, 34).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r495 = Leftshin.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(87, 34).mirror().addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(25, 65).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r496 = Leftshin.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r497 = Leftshin.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r498 = Leftshin.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(20, 95).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r499 = Leftshin.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(-0.5F, 6.0098F, 1.4145F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.3818F, -0.9752F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r500 = Leftshin.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r501 = Leftshin.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r502 = Leftshin.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(79, 61).mirror().addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r503 = Leftshin.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(89, 19).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r504 = Leftshin.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(-0.5F, -3.0F, -0.1F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r505 = Leftshin.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(36, 7).mirror().addBox(-0.5F, -3.0F, -0.8F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r506 = Leftshin.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(77, 91).mirror().addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r507 = Leftshin.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.3288F, 0.183F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(50, 56).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.01F, 16.9746F, -2.1439F, -1.5956F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(56, 15).mirror().addBox(-2.1F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.097F, 0.0929F, 0.6F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.1F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.0195F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9377F, -1.5085F, -0.4755F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r508 = bone2.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(74, 43).addBox(-0.5F, -1.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(89, 82).addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2515F, 0.5145F, -4.8704F, -2.8798F, -0.0349F, -0.4363F));

		PartDefinition cube_r509 = bone2.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(5, 92).addBox(-0.5F, -1.325F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4125F, 0.3037F, -3.2426F, -1.6581F, -0.0349F, -0.4363F));

		PartDefinition cube_r510 = bone2.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(110, 102).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7554F, -0.5075F, -4.1605F, -0.6545F, -0.0349F, -0.4363F));

		PartDefinition cube_r511 = bone2.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(14, 82).addBox(-0.9997F, -2.2517F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(101, 23).addBox(-0.9997F, -2.2517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1745F, -0.0349F, -0.4363F));

		PartDefinition cube_r512 = bone2.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(111, 22).addBox(-0.9997F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.0123F, -0.0349F, -0.4363F));

		PartDefinition cube_r513 = bone2.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(93, 110).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6098F, 0.3675F, 2.6504F, -0.7069F, -0.0349F, -0.4363F));

		PartDefinition cube_r514 = bone2.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(7, 82).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7027F, 1.6772F, 3.2607F, 1.2915F, -0.0349F, 0.0F));

		PartDefinition cube_r515 = bone2.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(80, 67).addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6593F, 0.8615F, 2.0185F, 0.1571F, -0.0349F, 0.0F));

		PartDefinition cube_r516 = bone2.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(68, 78).addBox(-0.5F, -3.1F, 0.675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5887F, 3.2056F, -0.0029F, 0.1134F, -0.0349F, 0.0F));

		PartDefinition cube_r517 = bone2.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(101, 69).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.0264F, -0.0302F, -0.0175F));

		PartDefinition cube_r518 = bone2.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(63, 89).addBox(-0.3227F, 0.8952F, -8.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8135F, 5.6875F, -4.2479F, 1.2796F, -0.0454F, -0.1788F));

		PartDefinition cube_r519 = bone2.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(83, 43).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.6824F, 13.0201F, -4.04F, 0.9306F, -0.0454F, -0.1788F));

		PartDefinition cube_r520 = bone2.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(94, 86).addBox(-0.5F, -1.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.6219F, 12.9282F, -3.0883F, 2.2832F, -0.0454F, -0.1788F));

		PartDefinition cube_r521 = bone2.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(10, 95).addBox(-0.3227F, -1.4085F, -7.7074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8135F, 5.6875F, -4.2479F, 1.62F, -0.0454F, -0.1788F));

		PartDefinition cube_r522 = bone2.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(110, 99).addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.5098F, 12.1612F, -3.6626F, 0.5291F, -0.0454F, -0.1788F));

		PartDefinition cube_r523 = bone2.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(94, 91).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0001F, 9.7513F, -3.5386F, -0.1028F, 0.0172F, -0.1483F));

		PartDefinition cube_r524 = bone2.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(94, 14).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.0513F, 9.5098F, -4.4041F, -0.2774F, 0.0172F, -0.1483F));

		PartDefinition cube_r525 = bone2.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(94, 19).addBox(-0.1003F, -0.0899F, 0.0904F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(94, 4).addBox(-0.1003F, -0.0899F, -0.1096F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, -0.3821F, 0.0172F, -0.1483F));

		PartDefinition cube_r526 = bone2.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(62, 93).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.4099F, -0.0302F, -0.0175F));

		PartDefinition cube_r527 = bone2.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(91, 74).addBox(-0.5F, -1.5F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.4972F, -0.0302F, -0.0175F));

		PartDefinition cube_r528 = bone2.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(93, 61).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.9335F, -0.0302F, -0.0175F));

		PartDefinition cube_r529 = bone2.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(103, 62).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5129F, 3.0703F, -2.3505F, 0.8991F, -0.0302F, -0.0175F));

		PartDefinition cube_r530 = bone2.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(74, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.619F, 5.4884F, 2.268F, 2.2517F, -0.0302F, -0.0175F));

		PartDefinition cube_r531 = bone2.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(102, 30).addBox(-5.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.347F, 4.911F, 3.1574F, 1.2918F, -0.0302F, -0.0175F));

		PartDefinition cube_r532 = bone2.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(102, 42).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6579F, 5.549F, 3.5865F, 1.0911F, -0.0302F, -0.0175F));

		PartDefinition cube_r533 = bone2.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(94, 66).addBox(-0.1F, -0.2F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.095F, 6.0211F, 5.0792F, 0.9686F, 0.0417F, -0.0669F));

		PartDefinition cube_r534 = bone2.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6579F, 5.549F, 3.5865F, 0.9689F, -0.0302F, -0.0175F));

		PartDefinition cube_r535 = bone2.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(102, 27).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6499F, 4.9983F, 3.0063F, 0.8118F, -0.0302F, -0.0175F));

		PartDefinition cube_r536 = bone2.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(98, 110).addBox(-0.5F, -1.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6345F, 4.3842F, 2.1416F, 0.201F, -0.0302F, -0.0175F));

		PartDefinition cube_r537 = bone2.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(88, 110).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.6345F, 4.3842F, 2.1416F, 0.4191F, -0.0302F, -0.0175F));

		PartDefinition cube_r538 = bone2.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(57, 56).addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.1137F, -0.0302F, -0.0175F));

		PartDefinition cube_r539 = bone2.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(16, 65).addBox(-0.5F, -2.85F, -1.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5639F, 2.8966F, -0.7132F, 0.0262F, -0.0349F, 0.0F));

		PartDefinition cube_r540 = bone2.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(82, 82).addBox(-0.9997F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0698F, -0.0349F, -0.4363F));

		PartDefinition cube_r541 = bone2.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(23, 111).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.0015F, -0.1673F, 6.3445F, 0.8727F, -0.0349F, -0.4363F));

		PartDefinition cube_r542 = bone2.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(82, 91).addBox(-0.5F, -2.5F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.968F, -0.2215F, 4.8161F, 1.7453F, -0.0349F, -0.4363F));

		PartDefinition cube_r543 = bone2.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(33, 89).addBox(-0.5F, -3.375F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0706F, -0.3711F, 5.6706F, 1.6581F, -0.0349F, -0.4363F));

		PartDefinition cube_r544 = bone2.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(89, 25).addBox(-0.9997F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1309F, -0.0349F, -0.4363F));

		PartDefinition cube_r545 = bone2.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(71, 14).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.5213F, -1.5344F, 3.2873F, -0.0524F, -0.0349F, -0.4363F));

		PartDefinition cube_r546 = bone2.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(69, 73).addBox(-0.9997F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.947F, -1.727F, 0.3707F, 0.0436F, -0.0349F, -0.4363F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9377F, -1.5085F, -0.4755F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r547 = bone4.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(74, 43).mirror().addBox(-0.5F, -1.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 82).mirror().addBox(-0.5F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2515F, 0.5145F, -4.8704F, -2.8798F, 0.0349F, 0.4363F));

		PartDefinition cube_r548 = bone4.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(5, 92).mirror().addBox(-0.5F, -1.325F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4125F, 0.3037F, -3.2426F, -1.6581F, 0.0349F, 0.4363F));

		PartDefinition cube_r549 = bone4.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7554F, -0.5075F, -4.1605F, -0.6545F, 0.0349F, 0.4363F));

		PartDefinition cube_r550 = bone4.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(14, 82).mirror().addBox(-0.0003F, -2.2517F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(101, 23).mirror().addBox(-0.0003F, -2.2517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1745F, 0.0349F, 0.4363F));

		PartDefinition cube_r551 = bone4.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(111, 22).mirror().addBox(-0.0003F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.0123F, 0.0349F, 0.4363F));

		PartDefinition cube_r552 = bone4.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(93, 110).mirror().addBox(-0.5F, -1.0F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6098F, 0.3675F, 2.6504F, -0.7069F, 0.0349F, 0.4363F));

		PartDefinition cube_r553 = bone4.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(7, 82).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7027F, 1.6772F, 3.2607F, 1.2915F, 0.0349F, 0.0F));

		PartDefinition cube_r554 = bone4.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(80, 67).mirror().addBox(-0.5F, -1.0F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6593F, 0.8615F, 2.0185F, 0.1571F, 0.0349F, 0.0F));

		PartDefinition cube_r555 = bone4.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(-0.5F, -3.1F, 0.675F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 3.2056F, -0.0029F, 0.1134F, 0.0349F, 0.0F));

		PartDefinition cube_r556 = bone4.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(101, 69).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.0264F, 0.0302F, 0.0175F));

		PartDefinition cube_r557 = bone4.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(-0.6773F, 0.8952F, -8.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 5.6875F, -4.2479F, 1.2796F, 0.0454F, 0.1788F));

		PartDefinition cube_r558 = bone4.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-0.5F, -1.0F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.6824F, 13.0201F, -4.04F, 0.9306F, 0.0454F, 0.1788F));

		PartDefinition cube_r559 = bone4.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(94, 86).mirror().addBox(-0.5F, -1.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.6219F, 12.9282F, -3.0883F, 2.2832F, 0.0454F, 0.1788F));

		PartDefinition cube_r560 = bone4.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(10, 95).mirror().addBox(-0.6773F, -1.4085F, -7.7074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 5.6875F, -4.2479F, 1.62F, 0.0454F, 0.1788F));

		PartDefinition cube_r561 = bone4.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(110, 99).mirror().addBox(-0.5F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5098F, 12.1612F, -3.6626F, 0.5291F, 0.0454F, 0.1788F));

		PartDefinition cube_r562 = bone4.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0001F, 9.7513F, -3.5386F, -0.1028F, -0.0172F, 0.1483F));

		PartDefinition cube_r563 = bone4.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-0.5F, -0.1F, -0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.0513F, 9.5098F, -4.4041F, -0.2774F, -0.0172F, 0.1483F));

		PartDefinition cube_r564 = bone4.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(94, 19).mirror().addBox(-0.8998F, -0.0899F, 0.0904F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(94, 4).mirror().addBox(-0.8998F, -0.0899F, -0.1096F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, -0.3821F, -0.0172F, 0.1483F));

		PartDefinition cube_r565 = bone4.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(62, 93).mirror().addBox(-0.5F, -0.5F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.4099F, 0.0302F, 0.0175F));

		PartDefinition cube_r566 = bone4.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-0.5F, -1.5F, -0.425F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.4972F, 0.0302F, 0.0175F));

		PartDefinition cube_r567 = bone4.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.9335F, 0.0302F, 0.0175F));

		PartDefinition cube_r568 = bone4.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(103, 62).mirror().addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5129F, 3.0703F, -2.3505F, 0.8991F, 0.0302F, 0.0175F));

		PartDefinition cube_r569 = bone4.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.619F, 5.4884F, 2.268F, 2.2517F, 0.0302F, 0.0175F));

		PartDefinition cube_r570 = bone4.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(4.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.347F, 4.911F, 3.1574F, 1.2918F, 0.0302F, 0.0175F));

		PartDefinition cube_r571 = bone4.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(102, 42).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6579F, 5.549F, 3.5865F, 1.0911F, 0.0302F, 0.0175F));

		PartDefinition cube_r572 = bone4.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(-0.9F, -0.2F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.095F, 6.0211F, 5.0792F, 0.9686F, -0.0417F, 0.0669F));

		PartDefinition cube_r573 = bone4.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.6579F, 5.549F, 3.5865F, 0.9689F, 0.0302F, 0.0175F));

		PartDefinition cube_r574 = bone4.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(102, 27).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6499F, 4.9983F, 3.0063F, 0.8118F, 0.0302F, 0.0175F));

		PartDefinition cube_r575 = bone4.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(98, 110).mirror().addBox(-0.5F, -1.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6345F, 4.3842F, 2.1416F, 0.201F, 0.0302F, 0.0175F));

		PartDefinition cube_r576 = bone4.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(88, 110).mirror().addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.6345F, 4.3842F, 2.1416F, 0.4191F, 0.0302F, 0.0175F));

		PartDefinition cube_r577 = bone4.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(57, 56).mirror().addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.1137F, 0.0302F, 0.0175F));

		PartDefinition cube_r578 = bone4.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(16, 65).mirror().addBox(-0.5F, -2.85F, -1.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 2.8966F, -0.7132F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r579 = bone4.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-0.0003F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0698F, 0.0349F, 0.4363F));

		PartDefinition cube_r580 = bone4.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(23, 111).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(1.0015F, -0.1673F, 6.3445F, 0.8727F, 0.0349F, 0.4363F));

		PartDefinition cube_r581 = bone4.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(82, 91).mirror().addBox(-0.5F, -2.5F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.968F, -0.2215F, 4.8161F, 1.7453F, 0.0349F, 0.4363F));

		PartDefinition cube_r582 = bone4.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(-0.5F, -3.375F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0706F, -0.3711F, 5.6706F, 1.6581F, 0.0349F, 0.4363F));

		PartDefinition cube_r583 = bone4.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(-0.0003F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1309F, 0.0349F, 0.4363F));

		PartDefinition cube_r584 = bone4.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(71, 14).mirror().addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.5213F, -1.5344F, 3.2873F, -0.0524F, 0.0349F, 0.4363F));

		PartDefinition cube_r585 = bone4.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(69, 73).mirror().addBox(-0.0003F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.947F, -1.727F, 0.3707F, 0.0436F, 0.0349F, 0.4363F));

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