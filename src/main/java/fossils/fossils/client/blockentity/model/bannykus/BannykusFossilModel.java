package fossils.fossils.client.blockentity.model.bannykus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BannykusFossilModel extends SkullModelBase {
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

	public BannykusFossilModel(ModelPart root) {
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -21.1F, 12.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.4454F, -6.8978F, 0.1196F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 96).addBox(0.0F, -1.915F, -0.051F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 0.0353F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 96).addBox(0.0F, -4.6F, -3.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9702F, -0.5647F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 22).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 22).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 25).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0286F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(110, 38).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.4329F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.4329F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(101, 23).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.4329F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 38).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.4329F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 57).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 95).addBox(0.01F, -1.7814F, -0.0939F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(47, 89).addBox(0.01F, -2.3793F, -3.0269F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0701F, -0.0871F, -0.0061F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(95, 7).addBox(0.01F, -1.9913F, -0.0205F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(100, 15).mirror().addBox(-4.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.8837F, -0.0015F, 0.2254F, -1.5001F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 100).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.8837F, 0.1163F, 0.1935F, -0.9476F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(110, 45).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.8837F, 0.185F, 0.0967F, -0.4812F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -4.9837F, 0.318F, 0.1649F, -0.4465F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 49).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -4.9837F, 0.2066F, 0.3135F, -0.9075F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(79, 32).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -4.9837F, 0.0091F, 0.3734F, -1.4796F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(79, 32).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -4.9837F, 0.0091F, -0.3734F, 1.4796F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(21, 17).addBox(-2.5F, -3.0F, 0.1F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 14.3506F, -1.7843F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 9).addBox(-2.49F, -2.7373F, 4.5651F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.5291F, -11.2246F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(100, 49).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -4.9837F, 0.2066F, -0.3135F, 0.9075F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(84, 30).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -4.9837F, 0.318F, -0.1649F, 0.4465F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(110, 45).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.8837F, 0.185F, -0.0967F, 0.4812F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 100).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.8837F, 0.1163F, -0.1935F, 0.9476F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(100, 15).addBox(2.2375F, -1.8712F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.8837F, -0.0015F, -0.2254F, 1.5001F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(55, 2).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0613F, -0.0871F, -0.0053F));

		PartDefinition cube_r26 = body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 95).addBox(0.01F, -1.75F, -0.7F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2517F, -5.3275F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(108, 23).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, 0.2282F, 0.1493F, -0.3938F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 20).mirror().addBox(-10.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, -0.025F, 0.2893F, -1.4239F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(100, 51).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, 0.1312F, 0.2597F, -0.8621F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 28).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.8837F, -0.0322F, 0.238F, -1.443F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(108, 43).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.8837F, 0.1801F, 0.1288F, -0.4176F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(100, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.8837F, 0.0971F, 0.22F, -0.8874F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(100, 53).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.8837F, 0.0971F, -0.22F, 0.8874F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(108, 43).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.8837F, 0.1801F, -0.1288F, 0.4176F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 28).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.8837F, -0.0322F, -0.238F, 1.443F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(100, 51).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, 0.1312F, -0.2597F, 0.8621F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 20).addBox(2.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, -0.025F, -0.2893F, 1.4239F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(108, 23).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, 0.2282F, -0.1493F, 0.3938F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 13.1369F, -7.501F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(40, 8).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(95, 12).addBox(0.01F, -1.7513F, -1.0922F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -6.0F, 0.044F, 0.1308F, 0.0057F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(25, 96).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.3796F, -5.9553F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(43, 32).mirror().addBox(-11.2375F, -1.8712F, -0.5599F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.9837F, -0.0123F, 0.2702F, -1.4525F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(101, 21).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.9837F, 0.1314F, 0.2371F, -0.8941F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(110, 80).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -1.9837F, 0.218F, 0.1291F, -0.4272F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, 0.2282F, 0.1493F, -0.3938F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(55, 18).mirror().addBox(-10.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, -0.025F, 0.2893F, -1.4239F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -4.8837F, 0.1312F, 0.2597F, -0.8621F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(98, 47).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, 0.1312F, -0.2597F, 0.8621F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(55, 18).addBox(2.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, -0.025F, -0.2893F, 1.4239F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(76, 0).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -4.8837F, 0.2282F, -0.1493F, 0.3938F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(110, 80).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.9837F, 0.218F, -0.1291F, 0.4272F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(101, 21).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.9837F, 0.1314F, -0.2371F, 0.8941F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(43, 32).addBox(2.2375F, -1.8712F, -0.5599F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -1.9837F, -0.0123F, -0.2702F, 1.4525F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -3.0F, -4.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 13.6033F, -3.2664F, -0.2313F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(26, 34).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 17).addBox(0.01F, -1.5513F, -1.0921F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(95, 38).addBox(0.01F, -1.7997F, -6.0438F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1304F, -5.8428F, 0.0989F, 0.1303F, 0.0129F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2676F, -4.9187F, 0.1629F, 0.2988F, -1.4705F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 84).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2676F, -4.9187F, 0.293F, 0.1734F, -0.9284F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(110, 10).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2676F, -4.9187F, 0.3325F, 0.0023F, -0.487F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.706F, 9.1821F, -8.4505F, 0.5695F, 0.5988F, 0.9734F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(-5.3F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7913F, 9.2429F, -7.0583F, 0.5286F, 1.0828F, 0.5965F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.8838F, 0.0892F, 0.1974F, -0.8686F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-9.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.8838F, -0.0268F, 0.2147F, -1.4214F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(110, 25).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.8838F, 0.1629F, 0.1122F, -0.3993F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-8.3F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7913F, 9.2429F, -7.0583F, 0.1663F, 1.2321F, 0.2209F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(100, 84).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2676F, -4.9187F, 0.293F, -0.1734F, 0.9284F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(110, 10).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2676F, -4.9187F, 0.3325F, -0.0023F, 0.487F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 32).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2676F, -4.9187F, 0.1629F, -0.2988F, 1.4705F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(46, 95).addBox(0.01F, -1.4818F, -1.0391F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(110, 25).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.8838F, 0.1629F, -0.1122F, 0.3993F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(58, 30).addBox(2.2375F, -1.8712F, -0.5598F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.8838F, -0.0268F, -0.2147F, 1.4214F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 101).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.8838F, 0.0892F, -0.1974F, 0.8686F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(55, 0).addBox(-0.7F, 0.0F, -0.5F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8113F, 9.2429F, -7.0583F, 0.1663F, -1.2321F, -0.2209F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 55).addBox(-0.7F, 0.0F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8113F, 9.2429F, -7.0583F, 0.5286F, -1.0828F, -0.5965F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(81, 16).addBox(0.0F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.726F, 9.1821F, -8.4505F, 0.5695F, -0.5988F, -0.9734F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(40, 16).addBox(-0.49F, -0.75F, -5.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3433F, -5.038F, 0.2712F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 110).addBox(0.01F, -1.6F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7866F, -2.5173F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(100, 59).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.0996F, -0.107F, -0.988F));

		PartDefinition cube_r80 = Neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(81, 4).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.1403F, -0.0407F, -1.5265F));

		PartDefinition cube_r81 = Neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(109, 104).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4035F, -2.3481F, 0.0345F, -0.1642F, -0.5157F));

		PartDefinition cube_r82 = Neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(109, 104).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.0345F, 0.1642F, 0.5157F));

		PartDefinition cube_r83 = Neckbase.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(81, 4).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.1403F, 0.0407F, 1.5265F));

		PartDefinition cube_r84 = Neckbase.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(100, 59).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4035F, -2.3481F, 0.0996F, 0.107F, 0.988F));

		PartDefinition cube_r85 = Neckbase.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(22, 58).addBox(-1.0F, -0.1069F, -0.6945F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 5.9743F, -6.4272F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r86 = Neckbase.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(53, 58).addBox(-1.5F, 0.4264F, -1.6059F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 4.4622F, -6.6583F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Neckbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(53, 63).addBox(-0.49F, -1.0987F, 0.4368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2314F, -5.2422F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7223F, -4.4844F, -0.4694F, 0.0975F, -0.0007F));

		PartDefinition cube_r88 = neck.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(53, 110).addBox(0.01F, -1.382F, -0.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4598F, -3.8812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r89 = neck.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(110, 34).addBox(0.01F, -2.182F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r90 = neck.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -3.8816F, -0.3664F, -0.1739F, -0.0076F));

		PartDefinition cube_r91 = neck.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(62, 84).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.315F, -1.8967F, -0.3221F, -0.1304F, -0.0115F));

		PartDefinition cube_r92 = neck.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(62, 84).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.315F, -1.8967F, -0.3221F, 0.1304F, 0.0115F));

		PartDefinition cube_r93 = neck.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(48, 84).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -3.8816F, -0.3664F, 0.1739F, 0.0076F));

		PartDefinition cube_r94 = neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(61, 43).addBox(-0.49F, -0.682F, -3.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, -0.6879F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -3.6728F, -0.3287F, 0.0967F, 0.013F));

		PartDefinition cube_r95 = Neckmiddle.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(56, 110).addBox(0.01F, -1.2328F, -0.0025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -4.0526F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r96 = Neckmiddle.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(110, 54).addBox(0.01F, -1.8828F, -1.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(7, 63).addBox(-0.49F, -0.6829F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.585F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r97 = Neckmiddle.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.2072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition cube_r98 = Neckmiddle.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(98, 95).mirror().addBox(-0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.295F, 0.6432F, -3.6945F, -0.1563F, -0.1304F, -0.0115F));

		PartDefinition cube_r99 = Neckmiddle.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(98, 95).addBox(0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.315F, 0.6432F, -3.6945F, -0.1563F, 0.1304F, 0.0115F));

		PartDefinition cube_r100 = Neckmiddle.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(98, 91).addBox(-0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.2072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9861F, -4.0023F, -0.6321F, 0.1219F, 0.0186F));

		PartDefinition cube_r101 = neck2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 110).addBox(0.0F, -1.025F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r102 = neck2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(71, 22).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r103 = neck2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r104 = neck2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(97, 0).addBox(-0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck5 = neck2.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.7F, -0.3037F, 0.0547F, 0.0285F));

		PartDefinition cube_r105 = neck5.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(110, 76).addBox(0.0F, -0.925F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 110).addBox(0.0F, -1.125F, 1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.091F, -2.1311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r106 = neck5.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(52, 75).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.2772F, -0.1148F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r107 = neck5.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 100).mirror().addBox(-0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.9951F, -1.802F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r108 = neck5.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(56, 100).addBox(0.1897F, -0.7279F, -0.4706F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(100, 55).addBox(-0.0233F, -0.9767F, 1.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.9951F, -1.802F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.475F, -3.0F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r109 = neck6.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(77, 110).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r110 = neck6.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 52).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r111 = neck6.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 100).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r112 = neck6.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(74, 100).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3148F, -2.7081F, 0.3949F, 0.0068F, 0.0973F));

		PartDefinition cube_r113 = neck7.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(111, 106).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r114 = neck7.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(61, 79).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r115 = neck7.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r116 = neck7.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(25, 101).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.29F, -2.7078F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r117 = neck8.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(111, 110).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.709F, -1.8311F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r118 = neck8.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(70, 79).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5228F, 0.1852F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r119 = neck8.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(38, 101).mirror().addBox(0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.7951F, -1.502F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r120 = neck8.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(38, 101).addBox(-0.0233F, -0.8767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.7951F, -1.502F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck3 = neck8.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2019F, -2.6325F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r121 = neck3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(75, 63).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.0053F, -0.7767F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r122 = neck3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(80, 110).addBox(0.0F, -1.1F, -1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1738F, -0.1583F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r123 = neck3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.5937F, 1.0961F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition cube_r124 = neck3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(100, 76).addBox(0.337F, -0.5244F, -2.6197F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.5937F, 1.0961F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.727F, -2.4512F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(36, 70).addBox(0.0F, -0.8F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 75).addBox(0.0F, -1.0F, 0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1487F, -1.4678F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r126 = neck4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(72, 42).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(39, 97).mirror().addBox(0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 26).mirror().addBox(0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.695F, 0.8517F, -1.4114F, 0.1404F, -0.1304F, -0.0115F));

		PartDefinition cube_r128 = neck4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(100, 26).addBox(-0.0804F, -0.2049F, -0.9829F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(39, 97).addBox(-0.2968F, -0.7894F, 0.6939F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.715F, 0.8517F, -1.4114F, 0.1404F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.5737F, 0.0F, 0.0F));

		PartDefinition cube_r129 = Neckend.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, -1.4987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r130 = Neckend.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(84, 100).mirror().addBox(0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition cube_r131 = Neckend.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(84, 100).addBox(-0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition cube_r132 = Neckend.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(79, 79).addBox(-0.5F, -0.5987F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Neckend2 = Neckend.addOrReplaceChild("Neckend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -2.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Neckend2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(112, 58).addBox(0.0F, -1.4987F, 0.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Neckend2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(51, 101).mirror().addBox(0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition cube_r135 = Neckend2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(51, 101).addBox(-0.025F, -0.6811F, 0.1808F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition cube_r136 = Neckend2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(64, 63).addBox(-0.5F, -0.5987F, -1.1332F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3225F, -3.1352F, 0.3839F, 0.0153F, -0.1384F));

		PartDefinition cube_r137 = Head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(60, 50).addBox(-1.5F, -2.0668F, 0.4896F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r138 = Head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(70, 2).addBox(-1.5F, -2.1968F, -2.1572F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, 2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r139 = Head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 33).addBox(-1.5F, -3.2932F, -3.0397F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r140 = Head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(84, 50).addBox(-1.5F, -0.6F, -0.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.7172F, -1.0092F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r141 = Head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(75, 68).addBox(-1.5F, -4.21F, 0.6662F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 0).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 2.3547F, -1.7685F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(52, 80).addBox(-1.5F, -0.7227F, 0.4926F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1414F, -2.4025F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(84, 27).addBox(-1.5F, -1.0F, 1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5809F, -3.0681F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r145 = Head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(81, 42).addBox(-1.5F, -1.9705F, -0.3979F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.3414F, -2.7025F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r146 = Head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(15, 46).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 2.3626F, -3.8796F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r147 = Head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(39, 94).addBox(-1.0F, -0.9477F, -0.9575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(89, 22).addBox(-0.5F, -0.9477F, -2.9575F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.004F, -8.3825F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r148 = Head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(106, 73).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 2.1623F, -14.0381F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(76, 107).addBox(-0.5F, -0.8F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 107).addBox(-0.5F, -0.8F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(91, 45).addBox(-0.5F, -0.8F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.485F, -11.3213F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r150 = Head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(64, 69).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5304F, -4.7372F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r151 = Head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(82, 46).addBox(-0.5F, 0.075F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5938F, -7.1386F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r152 = Head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(70, 34).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.005F, -1.7788F, -4.3402F, -1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r153 = Head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(16, 81).addBox(-1.495F, 0.0131F, -0.9313F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -2.0481F, -3.4486F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r154 = Head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(43, 102).addBox(-0.5F, 0.0875F, 0.0056F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 23).addBox(-1.5F, 0.0974F, 0.0381F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.1401F, -3.4877F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r156 = Head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(106, 109).addBox(-0.5F, -1.5246F, 0.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r157 = Head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(56, 104).addBox(-0.5F, 0.0F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.2063F, 0.0113F, 1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r158 = Head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(5, 105).addBox(-0.5F, -0.1216F, 1.4648F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.2651F, -2.4627F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5854F, -0.9054F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r159 = Lowerjawbase.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 34).mirror().addBox(-0.5F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(93, 34).addBox(1.7F, -1.1013F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 0.8546F, 0.6171F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r160 = Lowerjawbase.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(52, 89).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition cube_r161 = Lowerjawbase.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 49).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition cube_r162 = Lowerjawbase.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(23, 87).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r163 = Lowerjawbase.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(48, 105).mirror().addBox(-0.5F, 0.2087F, -0.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(48, 105).addBox(1.7F, 0.2087F, -0.6279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, -1.2348F, 0.0F, 0.0F));

		PartDefinition cube_r164 = Lowerjawbase.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(105, 55).mirror().addBox(-0.5F, 0.7805F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(105, 55).addBox(1.7F, 0.7805F, -0.5031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, -1.357F, 0.0F, 0.0F));

		PartDefinition cube_r165 = Lowerjawbase.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(79, 100).mirror().addBox(-0.5F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(79, 100).addBox(1.7F, -0.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.5456F, -2.5643F, -1.4006F, 0.0F, 0.0F));

		PartDefinition cube_r166 = Lowerjawbase.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.5F, 1.2948F, -0.6069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(30, 99).addBox(1.7F, 1.2948F, -0.6069F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, -1.549F, 0.0F, 0.0F));

		PartDefinition cube_r167 = Lowerjawbase.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(106, 98).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0113F, 2.3715F, -4.8096F, -1.4123F, -0.1199F, -0.0234F));

		PartDefinition cube_r168 = Lowerjawbase.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(89, 102).mirror().addBox(0.5175F, -7.0979F, -0.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -1.5523F, -0.121F, -0.0171F));

		PartDefinition cube_r169 = Lowerjawbase.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(96, 22).mirror().addBox(0.5175F, -6.1688F, -0.2861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -1.4825F, -0.121F, -0.0171F));

		PartDefinition cube_r170 = Lowerjawbase.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(99, 103).mirror().addBox(-0.8908F, 3.0058F, -0.3628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, -1.4996F, -0.1199F, -0.0234F));

		PartDefinition cube_r171 = Lowerjawbase.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(101, 73).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(101, 73).addBox(1.7F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.3709F, -2.7713F, -1.4355F, 0.0F, 0.0F));

		PartDefinition cube_r172 = Lowerjawbase.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(105, 76).mirror().addBox(-0.5F, -0.3552F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(105, 76).addBox(1.7F, -0.3552F, -0.6568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r173 = Lowerjawbase.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(15, 41).mirror().addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(15, 41).addBox(1.7F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, 0.5145F, -1.4442F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r174 = Lowerjawbase.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-0.5F, -1.7447F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(98, 43).addBox(1.7F, -1.7447F, -0.2567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.1615F, 1.4984F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r175 = Lowerjawbase.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(7, 92).mirror().addBox(-0.5F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(7, 92).addBox(1.7F, -2.7948F, -0.4567F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, -0.0446F, 1.5057F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Lowerjawbase.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(84, 69).mirror().addBox(-0.5F, -0.8218F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(84, 69).addBox(1.7F, -0.8218F, -2.0341F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-1.1F, 1.2157F, -1.032F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r177 = Lowerjawbase.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(86, 58).mirror().addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0107F, 1.394F, -5.005F, 0.5163F, -0.1199F, -0.0234F));

		PartDefinition cube_r178 = Lowerjawbase.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(0.5175F, -0.1925F, -0.2758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-1.6903F, 1.9259F, -7.5625F, 0.2367F, -0.121F, -0.0171F));

		PartDefinition cube_r179 = Lowerjawbase.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(96, 106).mirror().addBox(0.592F, -0.6787F, -0.6059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 0.1581F, -0.121F, -0.0171F));

		PartDefinition cube_r180 = Lowerjawbase.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(30, 109).mirror().addBox(0.5917F, -0.4754F, 0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(40, 109).mirror().addBox(0.5917F, -0.4754F, 0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(66, 109).mirror().addBox(0.5917F, -0.4754F, 1.793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 0.0702F, -0.122F, -0.0064F));

		PartDefinition cube_r181 = Lowerjawbase.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(61, 108).mirror().addBox(0.5917F, -0.2559F, 2.5791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 0.1575F, -0.122F, -0.0064F));

		PartDefinition cube_r182 = Lowerjawbase.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(108, 85).mirror().addBox(0.5917F, -0.1277F, 3.3666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 88).mirror().addBox(0.5917F, -0.1277F, 4.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 94).mirror().addBox(0.5917F, -0.1277F, 4.9666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 109).mirror().addBox(0.5917F, -0.1277F, 5.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 0.1924F, -0.122F, -0.0064F));

		PartDefinition cube_r183 = Lowerjawbase.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(0.5175F, -0.3963F, -0.3722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.4298F, 2.3263F, -9.6494F, 0.1319F, -0.121F, -0.0171F));

		PartDefinition cube_r184 = Lowerjawbase.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(108, 91).mirror().addBox(0.5175F, -0.4201F, -0.0536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -0.1124F, -0.121F, -0.0171F));

		PartDefinition cube_r185 = Lowerjawbase.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(101, 106).mirror().addBox(0.5175F, -0.6536F, -0.5799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 1.4584F, -0.121F, -0.0171F));

		PartDefinition cube_r186 = Lowerjawbase.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(0.5175F, -2.4465F, -0.2675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -1.465F, -0.121F, -0.0171F));

		PartDefinition cube_r187 = Lowerjawbase.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 34).mirror().addBox(0.5175F, -2.5081F, -0.3284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -1.5436F, -0.121F, -0.0171F));

		PartDefinition cube_r188 = Lowerjawbase.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(106, 106).mirror().addBox(0.5175F, -0.6407F, -3.0518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, -3.1231F, -0.121F, -0.0171F));

		PartDefinition cube_r189 = Lowerjawbase.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(100, 80).mirror().addBox(0.5175F, 2.5711F, -1.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.175F, 2.4158F, -11.732F, 1.7333F, -0.121F, -0.0171F));

		PartDefinition cube_r190 = Lowerjawbase.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(52, 93).mirror().addBox(-0.5F, -0.45F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(52, 93).addBox(1.95F, -0.45F, -0.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(-1.225F, 0.9348F, -2.1281F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r191 = Lowerjawbase.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(105, 7).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false)
				.texOffs(30, 103).mirror().addBox(-0.5F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false)
				.texOffs(94, 103).mirror().addBox(-0.5F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(10, 105).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(94, 103).addBox(1.95F, -0.3F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F))
				.texOffs(30, 103).addBox(1.95F, -0.3F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F))
				.texOffs(10, 105).addBox(1.95F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(105, 7).addBox(1.95F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(-1.225F, 0.62F, -1.4311F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r192 = Lowerjawbase.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(105, 10).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(25, 105).mirror().addBox(-0.5F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F)).mirror(false)
				.texOffs(25, 105).addBox(1.95F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.295F))
				.texOffs(105, 10).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.225F, 1.2575F, -0.9376F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r193 = Lowerjawbase.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(91, 98).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false)
				.texOffs(91, 98).addBox(1.95F, -1.7F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(-1.225F, 1.3131F, -1.3337F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r194 = Lowerjawbase.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(103, 95).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(103, 95).addBox(1.7F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-1.1F, -0.1262F, -0.2444F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r195 = Lowerjawbase.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(102, 4).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(102, 4).addBox(1.7F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.4518F, -3.3658F, -2.8754F, 0.0F, 0.0F));

		PartDefinition cube_r196 = Lowerjawbase.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 103).addBox(1.7F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.6097F, -3.9447F, 2.1424F, 0.0F, 0.0F));

		PartDefinition cube_r197 = Lowerjawbase.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(5, 108).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(5, 108).addBox(1.7F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.4193F, -3.6006F, -1.1388F, 0.0F, 0.0F));

		PartDefinition cube_r198 = Lowerjawbase.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 108).addBox(1.7F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 2.2154F, -3.8943F, 0.1702F, 0.0F, 0.0F));

		PartDefinition cube_r199 = Lowerjawbase.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(108, 20).mirror().addBox(-0.5F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(108, 20).addBox(1.7F, -1.2F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 2.2154F, -3.8943F, 0.2574F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Lowerjawbase.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(100, 80).addBox(-1.5175F, 2.5711F, -1.0357F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 1.7333F, 0.121F, 0.0171F));

		PartDefinition cube_r201 = Lowerjawbase.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 106).addBox(-1.5175F, -0.6407F, -3.0518F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -3.1231F, 0.121F, 0.0171F));

		PartDefinition cube_r202 = Lowerjawbase.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(100, 34).addBox(-1.5175F, -2.5081F, -0.3284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -1.5436F, 0.121F, 0.0171F));

		PartDefinition cube_r203 = Lowerjawbase.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 18).addBox(-1.5175F, -2.4465F, -0.2675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -1.465F, 0.121F, 0.0171F));

		PartDefinition cube_r204 = Lowerjawbase.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(101, 106).addBox(-1.5175F, -0.6536F, -0.5799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 1.4584F, 0.121F, 0.0171F));

		PartDefinition cube_r205 = Lowerjawbase.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(108, 91).addBox(-1.5175F, -0.4201F, -0.0536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -0.1124F, 0.121F, 0.0171F));

		PartDefinition cube_r206 = Lowerjawbase.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(7, 69).addBox(-1.5175F, -0.3963F, -0.3722F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.4298F, 2.3263F, -9.6494F, 0.1319F, 0.121F, 0.0171F));

		PartDefinition cube_r207 = Lowerjawbase.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(0, 109).addBox(-1.5917F, -0.1277F, 5.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 94).addBox(-1.5917F, -0.1277F, 4.9666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 88).addBox(-1.5917F, -0.1277F, 4.1666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 85).addBox(-1.5917F, -0.1277F, 3.3666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 0.1924F, 0.122F, 0.0064F));

		PartDefinition cube_r208 = Lowerjawbase.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(61, 108).addBox(-1.5917F, -0.2559F, 2.5791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 0.1575F, 0.122F, 0.0064F));

		PartDefinition cube_r209 = Lowerjawbase.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(66, 109).addBox(-1.5917F, -0.4754F, 1.793F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(40, 109).addBox(-1.5917F, -0.4754F, 0.993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 109).addBox(-1.5917F, -0.4754F, 0.193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 0.0702F, 0.122F, 0.0064F));

		PartDefinition cube_r210 = Lowerjawbase.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(96, 106).addBox(-1.5919F, -0.6787F, -0.6059F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, 0.1581F, 0.121F, 0.0171F));

		PartDefinition cube_r211 = Lowerjawbase.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(80, 18).addBox(-1.5175F, -0.1925F, -0.2758F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(1.6903F, 1.9259F, -7.5625F, 0.2367F, 0.121F, 0.0171F));

		PartDefinition cube_r212 = Lowerjawbase.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(86, 58).addBox(-0.5F, -0.325F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0107F, 1.394F, -5.005F, 0.5163F, 0.1199F, 0.0234F));

		PartDefinition cube_r213 = Lowerjawbase.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(99, 103).addBox(-0.1092F, 3.0058F, -0.3628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.1F, 1.2157F, -1.032F, -1.4996F, 0.1199F, 0.0234F));

		PartDefinition cube_r214 = Lowerjawbase.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(96, 22).addBox(-1.5175F, -6.1688F, -0.2861F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -1.4825F, 0.121F, 0.0171F));

		PartDefinition cube_r215 = Lowerjawbase.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(89, 102).addBox(-1.5175F, -7.0979F, -0.7038F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.175F, 2.4158F, -11.732F, -1.5523F, 0.121F, 0.0171F));

		PartDefinition cube_r216 = Lowerjawbase.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(106, 98).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0113F, 2.3715F, -4.8096F, -1.4123F, 0.1199F, 0.0234F));

		PartDefinition cube_r217 = Lowerjawbase.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(23, 87).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r218 = Lowerjawbase.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(93, 49).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r219 = Lowerjawbase.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(52, 89).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -1.7478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.0936F, -3.1747F));

		PartDefinition cube_r220 = leftFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(64, 74).addBox(-0.332F, -1.7714F, -1.9688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.2807F, 0.1202F, 0.0339F));

		PartDefinition cube_r221 = leftFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(93, 53).addBox(-0.1596F, -1.7045F, -2.7069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.1993F, 0.1562F, 0.0036F));

		PartDefinition cube_r222 = leftFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(51, 97).addBox(-0.1596F, 0.4F, -1.2311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -1.5461F, 0.1562F, 0.0036F));

		PartDefinition cube_r223 = leftFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(107, 0).addBox(-1.0917F, -1.2581F, -0.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.5261F, 2.5472F, -6.4276F, 0.0426F, 0.2092F, -0.0065F));

		PartDefinition cube_r224 = leftFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(61, 101).addBox(-0.0092F, 1.4505F, -1.1018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -1.5123F, 0.1542F, -0.0072F));

		PartDefinition cube_r225 = leftFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(106, 64).addBox(-0.0092F, -0.6749F, -4.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -0.0724F, 0.1542F, -0.0072F));

		PartDefinition cube_r226 = leftFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(101, 61).addBox(-0.0092F, -3.4967F, 0.9769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 1.8039F, 0.1542F, -0.0072F));

		PartDefinition cube_r227 = leftFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(106, 61).addBox(-0.0092F, -2.7696F, -3.5245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.4949F, 0.1542F, -0.0072F));

		PartDefinition cube_r228 = leftFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(23, 76).addBox(-0.1596F, -1.7191F, -1.9055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.208F, 0.1562F, 0.0036F));

		PartDefinition cube_r229 = leftFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(18, 70).addBox(-0.8F, -0.25F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8426F, -0.0859F, -4.3705F, 0.4517F, -0.063F, 0.1501F));

		PartDefinition cube_r230 = leftFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(53, 69).addBox(-0.35F, -1.325F, -2.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0805F, 1.1621F, -4.8905F, 0.345F, 0.0909F, 0.1618F));

		PartDefinition cube_r231 = leftFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 80).addBox(-0.525F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.1798F, 0.9887F, -4.4925F, 0.2228F, 0.1078F, 0.0395F));

		PartDefinition cube_r232 = leftFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 75).addBox(0.1714F, -1.9347F, -3.4316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.2245F, 0.1546F, -0.0054F));

		PartDefinition cube_r233 = leftFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(89, 18).addBox(0.1714F, 1.0319F, 1.2514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -2.8473F, 0.1546F, -0.0054F));

		PartDefinition cube_r234 = leftFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 67).addBox(0.1714F, 2.8234F, -1.5538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -1.4335F, 0.1546F, -0.0054F));

		PartDefinition cube_r235 = leftFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(40, 106).addBox(0.1714F, 2.4036F, -2.5738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, -1.1281F, 0.1546F, -0.0054F));

		PartDefinition cube_r236 = leftFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(66, 106).addBox(-0.5011F, -0.8849F, -2.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F))
				.texOffs(73, 74).addBox(-0.5011F, -0.4849F, -1.4386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F))
				.texOffs(73, 47).addBox(-0.5011F, -0.8849F, -1.4386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.3802F, 1.4366F, -4.2866F, 0.1402F, 0.1132F, 0.0126F));

		PartDefinition cube_r237 = leftFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5011F, 0.6985F, -0.8121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(105, 79).addBox(-0.5011F, 0.6985F, -1.3121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3802F, 1.4366F, -4.2866F, 2.1909F, 0.1132F, 0.0126F));

		PartDefinition cube_r238 = leftFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(61, 105).addBox(-0.5011F, -0.9328F, -2.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(30, 88).addBox(-0.5011F, -0.9328F, -1.7614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3802F, 1.4366F, -4.2866F, -3.0887F, 0.1132F, 0.0126F));

		PartDefinition cube_r239 = leftFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(88, 6).addBox(-0.5011F, -0.9445F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.3802F, 1.4366F, -4.2866F, 3.02F, 0.1132F, 0.0126F));

		PartDefinition cube_r240 = leftFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 106).addBox(-0.7897F, 0.1707F, -0.9312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5261F, 2.5472F, -6.4276F, -2.3892F, 0.2179F, 0.0128F));

		PartDefinition cube_r241 = leftFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(30, 106).addBox(-0.5011F, 0.4039F, 0.6831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3802F, 1.4366F, -4.2866F, -2.3906F, 0.1132F, 0.0126F));

		PartDefinition cube_r242 = leftFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(105, 45).addBox(-0.5F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(104, 103).addBox(-0.5F, -0.1F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 104).addBox(-0.5F, -0.1F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 37).addBox(-0.5F, -0.2F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 105).addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5564F, 2.5328F, -10.3696F, 0.0965F, 0.1043F, 0.0092F));

		PartDefinition cube_r243 = leftFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(76, 104).addBox(-0.1147F, -0.6544F, -1.6628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 34).addBox(-0.1147F, -0.7544F, -2.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(105, 25).addBox(-0.1147F, -0.7544F, -3.2628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 104).addBox(-0.1147F, -0.8544F, -4.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5064F, 2.5328F, -6.6696F, 0.097F, 0.1567F, 0.0267F));

		PartDefinition cube_r244 = leftFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(82, 73).addBox(-1.3547F, -3.2688F, 2.7275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8261F, 3.4472F, -7.1276F, -0.0524F, 0.0698F, -0.0031F));

		PartDefinition cube_r245 = leftFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(93, 57).addBox(-0.5F, -1.075F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0618F, 2.3716F, -5.1714F, -0.0091F, 0.1045F, -0.0064F));

		PartDefinition cube_r246 = leftFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(107, 82).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -0.8514F, 1.1612F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r247 = leftFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(27, 92).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -1.1249F, 0.5168F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r248 = leftFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(101, 65).addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -1.2824F, -0.1652F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r249 = leftFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.48F, -1.258F, -0.8648F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(16, 85).addBox(-0.5F, -2.25F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F))
				.texOffs(103, 86).addBox(-0.5F, -1.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(103, 42).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.4893F, -2.3319F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r251 = leftFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(103, 92).addBox(-0.4275F, 1.8883F, 0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.4075F, -0.3609F, -0.2014F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r252 = leftFace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(41, 82).addBox(-0.4275F, -1.0561F, 0.6282F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)), PartPose.offsetAndRotation(1.4075F, -0.3609F, -0.2014F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r253 = leftFace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(5, 87).addBox(-0.3375F, -0.4266F, -0.3805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 53).addBox(-0.6625F, -0.4266F, -0.3805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.4075F, -0.3609F, -0.2014F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r254 = leftFace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(81, 107).addBox(-0.5F, -0.2F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F))
				.texOffs(14, 76).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 0.6851F, 1.219F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftFace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(32, 83).addBox(-0.525F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 0.5224F, 0.8536F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftFace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(17, 104).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 1.5243F, 1.3444F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftFace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(101, 109).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 0.6851F, 1.219F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftFace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(96, 109).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 1.284F, 1.2556F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r259 = leftFace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(109, 101).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.545F, 1.4167F, 2.0937F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r260 = leftFace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(106, 70).addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.545F, 2.1402F, 1.6503F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r261 = leftFace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(103, 89).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.545F, 2.1768F, 1.0515F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r262 = leftFace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(106, 17).addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.545F, 1.0183F, 0.6239F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r263 = leftFace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(98, 87).addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 1.9175F, 1.8848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftFace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(69, 98).addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.5F, 1.9175F, 1.8848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(97, 30).addBox(-0.5F, -0.9492F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -0.5115F, 3.4601F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(95, 4).addBox(-1.325F, -0.2F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(64, 93).addBox(-1.325F, -0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9763F, -1.0953F, 3.1642F, 2.8602F, -0.4846F, -0.827F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(102, 30).addBox(-0.45F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5594F, -1.0873F, 1.1806F, 0.0481F, -0.4359F, -0.0203F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(66, 102).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -2.0694F, 0.749F, 0.0678F, -0.8715F, -0.0519F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -1.0122F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.5F, -0.5115F, 3.4601F, 1.1606F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.0936F, -3.1747F));

		PartDefinition cube_r270 = rightFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(-0.668F, -1.7714F, -1.9688F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.2807F, -0.1202F, -0.0339F));

		PartDefinition cube_r271 = rightFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(93, 53).mirror().addBox(-0.8404F, -1.7045F, -2.7069F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.1993F, -0.1562F, -0.0036F));

		PartDefinition cube_r272 = rightFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(51, 97).mirror().addBox(-0.8404F, 0.4F, -1.2311F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -1.5461F, -0.1562F, -0.0036F));

		PartDefinition cube_r273 = rightFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(107, 0).mirror().addBox(0.0917F, -1.2581F, -0.7888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.5261F, 2.5472F, -6.4276F, 0.0426F, -0.2092F, 0.0065F));

		PartDefinition cube_r274 = rightFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(61, 101).mirror().addBox(-0.9908F, 1.4505F, -1.1018F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -1.5123F, -0.1542F, 0.0072F));

		PartDefinition cube_r275 = rightFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(106, 64).mirror().addBox(-0.9908F, -0.6749F, -4.0621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -0.0724F, -0.1542F, 0.0072F));

		PartDefinition cube_r276 = rightFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(101, 61).mirror().addBox(-0.9908F, -3.4967F, 0.9769F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 1.8039F, -0.1542F, 0.0072F));

		PartDefinition cube_r277 = rightFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(106, 61).mirror().addBox(-0.9908F, -2.7696F, -3.5245F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.4949F, -0.1542F, 0.0072F));

		PartDefinition cube_r278 = rightFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(23, 76).mirror().addBox(-0.8404F, -1.7191F, -1.9055F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.208F, -0.1562F, -0.0036F));

		PartDefinition cube_r279 = rightFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(18, 70).mirror().addBox(-0.2F, -0.25F, -0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8426F, -0.0859F, -4.3705F, 0.4517F, 0.063F, -0.1501F));

		PartDefinition cube_r280 = rightFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(53, 69).mirror().addBox(-0.65F, -1.325F, -2.775F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0805F, 1.1621F, -4.8905F, 0.345F, -0.0909F, -0.1618F));

		PartDefinition cube_r281 = rightFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.475F, -0.775F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.1798F, 0.9887F, -4.4925F, 0.2228F, -0.1078F, -0.0395F));

		PartDefinition cube_r282 = rightFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-1.1714F, -1.9347F, -3.4316F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.2245F, -0.1546F, 0.0054F));

		PartDefinition cube_r283 = rightFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-1.1714F, 1.0319F, 1.2514F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -2.8473F, -0.1546F, 0.0054F));

		PartDefinition cube_r284 = rightFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(106, 67).mirror().addBox(-1.1714F, 2.8234F, -1.5538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -1.4335F, -0.1546F, 0.0054F));

		PartDefinition cube_r285 = rightFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-1.1714F, 2.4036F, -2.5738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, -1.1281F, -0.1546F, 0.0054F));

		PartDefinition cube_r286 = rightFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(66, 106).mirror().addBox(-0.4989F, -0.8849F, -2.0386F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(73, 74).mirror().addBox(-0.4989F, -0.4849F, -1.4386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(73, 47).mirror().addBox(-0.4989F, -0.8849F, -1.4386F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.3802F, 1.4366F, -4.2866F, 0.1402F, -0.1132F, -0.0126F));

		PartDefinition cube_r287 = rightFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(-0.4989F, 0.6985F, -0.8121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(105, 79).mirror().addBox(-0.4989F, 0.6985F, -1.3121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3802F, 1.4366F, -4.2866F, 2.1909F, -0.1132F, -0.0126F));

		PartDefinition cube_r288 = rightFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(61, 105).mirror().addBox(-0.4989F, -0.9328F, -2.0614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(30, 88).mirror().addBox(-0.4989F, -0.9328F, -1.7614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3802F, 1.4366F, -4.2866F, -3.0887F, -0.1132F, -0.0126F));

		PartDefinition cube_r289 = rightFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(-0.4989F, -0.9445F, -0.3742F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.3802F, 1.4366F, -4.2866F, 3.02F, -0.1132F, -0.0126F));

		PartDefinition cube_r290 = rightFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(91, 106).mirror().addBox(-0.2103F, 0.1707F, -0.9312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5261F, 2.5472F, -6.4276F, -2.3892F, -0.2179F, -0.0128F));

		PartDefinition cube_r291 = rightFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(30, 106).mirror().addBox(-0.4989F, 0.4039F, 0.6831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3802F, 1.4366F, -4.2866F, -2.3906F, -0.1132F, -0.0126F));

		PartDefinition cube_r292 = rightFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(105, 45).mirror().addBox(-0.5F, 0.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(104, 103).mirror().addBox(-0.5F, -0.1F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 104).mirror().addBox(-0.5F, -0.1F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 37).mirror().addBox(-0.5F, -0.2F, 3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 105).mirror().addBox(-0.5F, -0.2F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5564F, 2.5328F, -10.3696F, 0.0965F, -0.1043F, -0.0092F));

		PartDefinition cube_r293 = rightFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(76, 104).mirror().addBox(-0.8853F, -0.6544F, -1.6628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 34).mirror().addBox(-0.8853F, -0.7544F, -2.4628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 25).mirror().addBox(-0.8853F, -0.7544F, -3.2628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 104).mirror().addBox(-0.8853F, -0.8544F, -4.0628F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 2.5328F, -6.6696F, 0.097F, -0.1567F, -0.0267F));

		PartDefinition cube_r294 = rightFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(0.3547F, -3.2688F, 2.7275F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8261F, 3.4472F, -7.1276F, -0.0524F, -0.0698F, 0.0031F));

		PartDefinition cube_r295 = rightFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(93, 57).mirror().addBox(-0.5F, -1.075F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0618F, 2.3716F, -5.1714F, -0.0091F, -0.1045F, 0.0064F));

		PartDefinition cube_r296 = rightFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(107, 82).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.8514F, 1.1612F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r297 = rightFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(27, 92).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.1249F, 0.5168F, -1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r298 = rightFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(101, 65).mirror().addBox(-0.5F, -1.85F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.2824F, -0.1652F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r299 = rightFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.5F, -0.15F, -1.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.258F, -0.8648F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r300 = rightFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(16, 85).mirror().addBox(-0.5F, -2.25F, 0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(103, 86).mirror().addBox(-0.5F, -1.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(103, 42).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.4893F, -2.3319F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(103, 92).mirror().addBox(-0.5725F, 1.8883F, 0.5314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, -0.3609F, -0.2014F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(41, 82).mirror().addBox(-0.5725F, -1.0561F, 0.6282F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1503F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, -0.3609F, -0.2014F, -1.5795F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.6625F, -0.4266F, -0.3805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(86, 53).mirror().addBox(-0.3375F, -0.4266F, -0.3805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4075F, -0.3609F, -0.2014F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 107).mirror().addBox(-0.5F, -0.2F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false)
				.texOffs(14, 76).mirror().addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 0.6851F, 1.219F, 1.1519F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(32, 83).mirror().addBox(-0.475F, -1.4F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 0.5224F, 0.8536F, 1.3701F, 0.0F, 0.0F));

		PartDefinition cube_r306 = rightFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(17, 104).mirror().addBox(-0.5F, -0.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.5243F, 1.3444F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r307 = rightFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(101, 109).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 0.6851F, 1.219F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(96, 109).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.284F, 1.2556F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(109, 101).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.4167F, 2.0937F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(106, 70).mirror().addBox(-0.5F, -0.8F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.1402F, 1.6503F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(103, 89).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 2.1768F, 1.0515F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(106, 17).mirror().addBox(-0.5F, -1.25F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.545F, 1.0183F, 0.6239F, 2.9409F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(98, 87).mirror().addBox(-0.5F, -1.1791F, -0.7251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.9175F, 1.8848F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(69, 98).mirror().addBox(-0.5F, -1.0597F, -0.2186F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.9175F, 1.8848F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(-0.5F, -0.9492F, -0.7619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5115F, 3.4601F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(95, 4).mirror().addBox(-0.675F, -0.2F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(64, 93).mirror().addBox(-0.675F, -0.8F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9763F, -1.0953F, 3.1642F, 2.8602F, 0.4846F, 0.827F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(102, 30).mirror().addBox(-0.55F, -1.0F, -0.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5594F, -1.0873F, 1.1806F, 0.0481F, 0.4359F, 0.0203F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(66, 102).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -2.0694F, 0.749F, 0.0678F, 0.8715F, 0.0519F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.5F, -1.0122F, -0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5115F, 3.4601F, 1.1606F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(101, 69).addBox(-0.5F, 0.5647F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.4188F, 4.5863F, -9.5287F, -0.1653F, 0.0167F, -0.2711F));

		PartDefinition cube_r320 = Rightupperarm.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(102, 0).addBox(-0.5F, -0.1F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.1948F, 2.268F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r321 = Rightupperarm.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(101, 99).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3607F, 1.4705F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Rightupperarm.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(71, 93).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.8654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Rightupperarm.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(108, 40).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r324 = Rightupperarm.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(35, 108).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5647F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r325 = Rightupperarm.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(86, 106).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.5044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r326 = Rightupperarm.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(25, 108).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5647F, -0.4912F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2602F, 7.5006F, 1.963F, -0.6549F, 0.1175F, 0.1384F));

		PartDefinition cube_r327 = Rightlowerarm.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(59, 89).addBox(-0.5F, -0.9F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 3.0107F, 0.0F, 3.1416F));

		PartDefinition cube_r328 = Rightlowerarm.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(84, 62).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(61, 34).addBox(-1.9F, 0.1F, -1.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2198F, 4.6418F, 0.0821F, 0.1633F, 0.0393F, 0.2329F));

		PartDefinition cube_r329 = Righthand.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(40, 64).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9F, 0.1F, -0.6F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(101, 69).mirror().addBox(-0.5F, 0.5647F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3988F, 4.5863F, -9.5287F, 0.7946F, -0.0167F, 0.2711F));

		PartDefinition cube_r330 = Leftupperarm.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.5F, -0.1F, -1.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.1948F, 2.268F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r331 = Leftupperarm.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(101, 99).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3607F, 1.4705F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r332 = Leftupperarm.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(71, 93).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8654F, 0.3741F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r333 = Leftupperarm.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(108, 40).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r334 = Leftupperarm.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(35, 108).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5647F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r335 = Leftupperarm.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(86, 106).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5044F, -0.1492F, -2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r336 = Leftupperarm.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(25, 108).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5647F, -0.4912F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2602F, 7.5006F, 1.963F, -0.9167F, -0.1175F, -0.1384F));

		PartDefinition cube_r337 = Leftlowerarm.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(59, 89).mirror().addBox(-0.5F, -0.9F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 3.0107F, 0.0F, -3.1416F));

		PartDefinition cube_r338 = Leftlowerarm.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(84, 62).mirror().addBox(-0.5F, -1.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(61, 34).mirror().addBox(-0.1F, 0.1F, -1.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2198F, 4.6418F, 0.0821F, 0.1633F, -0.0393F, -0.2329F));

		PartDefinition cube_r339 = Lefthand.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(40, 64).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9F, 0.1F, -0.6F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2592F, 5.3167F, -11.2248F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition cube_r340 = bone.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(90, 30).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.144F, -4.1978F, 10.1776F, 0.3927F, 0.0001F, -0.0032F));

		PartDefinition cube_r341 = bone.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(89, 73).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.144F, -4.1978F, 10.1776F, -0.0873F, 0.0001F, -0.0032F));

		PartDefinition cube_r342 = bone.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(0, 41).addBox(-0.4991F, -0.2911F, 1.6875F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1449F, -3.4268F, 3.5902F, 0.1745F, 0.0001F, -0.0032F));

		PartDefinition cube_r343 = bone.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(71, 89).addBox(-0.4991F, -0.0422F, -0.0906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1449F, -3.4268F, 3.5902F, 0.3054F, 0.0001F, -0.0032F));

		PartDefinition cube_r344 = bone.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(20, 91).addBox(-1.0078F, -0.95F, -0.5403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -2.3676F, 1.9495F, 0.0433F, 0.0094F, -0.0001F));

		PartDefinition cube_r345 = bone.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(64, 89).addBox(-1.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6385F, -2.3676F, 1.9495F, 0.5233F, 0.0094F, -0.0001F));

		PartDefinition cube_r346 = bone.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(76, 84).addBox(-0.3306F, 0.1566F, -1.272F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(25, 81).addBox(-0.3306F, -0.8434F, -0.672F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.3356F, -0.8768F, 0.7051F, -0.9404F, 0.5939F, 0.5914F));

		PartDefinition cube_r347 = bone.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(107, 3).addBox(-0.3997F, -0.9923F, 0.6191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(88, 78).addBox(-0.3306F, -1.2177F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.3356F, -0.8768F, 0.7051F, -0.3295F, 0.5939F, 0.5914F));

		PartDefinition cube_r348 = bone.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(69, 84).addBox(-1.5871F, -1.1815F, -0.6124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.391F, 0.3392F, 0.2085F));

		PartDefinition cube_r349 = bone.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 62).addBox(-1.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6385F, -1.6676F, 0.5495F, 0.8273F, 0.3392F, 0.2085F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2392F, 5.3167F, -11.2248F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition cube_r350 = bone3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.144F, -4.1978F, 10.1776F, 0.3927F, -0.0001F, 0.0032F));

		PartDefinition cube_r351 = bone3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(89, 73).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.144F, -4.1978F, 10.1776F, -0.0873F, -0.0001F, 0.0032F));

		PartDefinition cube_r352 = bone3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5009F, -0.2911F, 1.6875F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1449F, -3.4268F, 3.5902F, 0.1745F, -0.0001F, 0.0032F));

		PartDefinition cube_r353 = bone3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(71, 89).mirror().addBox(-0.5009F, -0.0422F, -0.0906F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1449F, -3.4268F, 3.5902F, 0.3054F, -0.0001F, 0.0032F));

		PartDefinition cube_r354 = bone3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(20, 91).mirror().addBox(0.0078F, -0.95F, -0.5403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -2.3676F, 1.9495F, 0.0433F, -0.0094F, 0.0001F));

		PartDefinition cube_r355 = bone3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(64, 89).mirror().addBox(0.0078F, -0.15F, -0.1403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -2.3676F, 1.9495F, 0.5233F, -0.0094F, 0.0001F));

		PartDefinition cube_r356 = bone3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(76, 84).mirror().addBox(-0.6694F, 0.1566F, -1.272F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(25, 81).mirror().addBox(-0.6694F, -0.8434F, -0.672F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.3356F, -0.8768F, 0.7051F, -0.9404F, -0.5939F, -0.5914F));

		PartDefinition cube_r357 = bone3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(107, 3).mirror().addBox(-0.6003F, -0.9923F, 0.6191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(88, 78).mirror().addBox(-0.6694F, -1.2177F, -1.2951F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3356F, -0.8768F, 0.7051F, -0.3295F, -0.5939F, -0.5914F));

		PartDefinition cube_r358 = bone3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(69, 84).mirror().addBox(0.5871F, -1.1815F, -0.6124F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.391F, -0.3392F, -0.2085F));

		PartDefinition cube_r359 = bone3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(89, 62).mirror().addBox(0.5871F, 0.3102F, -0.7673F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.6676F, 0.5495F, 0.8273F, -0.3392F, -0.2085F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.0944F, 0.0869F, 0.0082F));

		PartDefinition cube_r360 = Tailbase.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(12, 87).addBox(0.0F, 2.1918F, -0.5156F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r361 = Tailbase.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-2.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r362 = Tailbase.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(70, 38).addBox(0.35F, 0.0F, -6.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r363 = Tailbase.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(112, 0).addBox(0.0F, -1.5235F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r364 = Tailbase.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(5, 111).addBox(0.0F, -1.266F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0611F, 0.0F, 0.0F));

		PartDefinition tail2 = Tailbase.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(18, 64).addBox(-0.5F, -0.0721F, 0.003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5776F, 3.9473F, 0.0613F, 0.0417F, 0.0127F));

		PartDefinition cube_r365 = tail2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-2.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r366 = tail2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(70, 14).addBox(0.35F, 0.0F, -2.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4279F, 2.503F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r367 = tail2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(17, 33).addBox(0.0F, 0.8303F, -0.7796F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9279F, 3.6029F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r368 = tail2.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(11, 111).addBox(0.0F, -1.7706F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1197F, 1.9979F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r369 = tail2.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(8, 111).addBox(0.0F, -1.5334F, 0.0055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = tail2.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3012F, 3.8798F, -0.0347F, 0.1308F, -0.0045F));

		PartDefinition cube_r370 = Tailmiddlebase.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(21, 9).mirror().addBox(-1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2508F, 0.0938F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r371 = Tailmiddlebase.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(21, 9).addBox(-0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2508F, 0.0938F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r372 = Tailmiddlebase.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r373 = Tailmiddlebase.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(111, 97).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2783F, 4.0666F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r374 = Tailmiddlebase.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(111, 69).addBox(0.0F, -1.75F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r375 = Tailmiddlebase.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(111, 65).addBox(0.0F, -1.8456F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0372F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r376 = Tailmiddlebase.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(35, 99).addBox(0.0F, 0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7056F, 6.9532F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r377 = Tailmiddlebase.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(32, 76).addBox(0.0F, 0.0F, -0.5F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3445F, 3.0809F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r378 = Tailmiddlebase.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(17, 96).addBox(0.0F, -2.0206F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.0532F, 0.1743F, 0.0092F));

		PartDefinition cube_r379 = tail.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2449F, 1.07F, 0.0526F, 0.1046F, 0.0055F));

		PartDefinition cube_r380 = tail.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(35, 58).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2449F, 1.07F, 0.0526F, -0.1046F, -0.0055F));

		PartDefinition cube_r381 = tail.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(41, 34).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r382 = tail.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(24, 111).addBox(0.0F, -1.575F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r383 = tail.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(21, 111).addBox(0.0F, -1.8F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3255F, 1.5986F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r384 = tail.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(111, 16).addBox(0.0F, -1.3923F, -0.0216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r385 = tail.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(22, 100).addBox(0.0F, 0.4F, -0.4F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6029F, 3.1264F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(62, 111).addBox(0.0F, -1.9805F, 4.9585F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.2173F, 0.0F, 0.0F));

		PartDefinition cube_r386 = Tailmiddleend.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(112, 12).addBox(0.0F, -1.2369F, -0.1278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r387 = Tailmiddleend.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(111, 61).addBox(0.0F, -1.4269F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5456F, 0.9856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r388 = Tailmiddleend.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(55, 10).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r389 = Tailmiddleend.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(22, 106).addBox(0.0F, -0.2F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9636F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r390 = Tailmiddleend.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(53, 105).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9153F, 0.8969F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1108F, 5.9635F, 0.2126F, 0.0F, 0.0F));

		PartDefinition cube_r391 = Tailend.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(56, 97).addBox(0.0F, -1.2F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 42).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.5526F, 1.027F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r392 = Tailend.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(27, 111).addBox(0.0F, 1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6027F, 3.6491F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r393 = Tailend.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(45, 106).addBox(0.0F, 0.0F, -1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, 1.4171F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r394 = Tailend.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(30, 96).addBox(0.0F, -1.075F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0221F, 3.0118F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r395 = Tailend.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(86, 39).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9523F, 1.013F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7149F, 5.9495F, 0.1602F, 0.0F, 0.0F));

		PartDefinition cube_r396 = Tailend2.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(112, 27).addBox(0.0F, -0.9F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 73).addBox(0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 102).addBox(0.0F, -1.1F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 42).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r397 = Tailend2.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(0, 112).addBox(0.0F, 7.2F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 111).addBox(0.0F, 8.1F, 15.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r398 = Tailend2.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(35, 111).addBox(0.0F, 1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.286F, 0.2973F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1722F, 5.8848F, 0.0031F, 0.0F, 0.0F));

		PartDefinition cube_r399 = Tailend3.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(38, 112).addBox(0.0F, -0.9F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 30).addBox(0.0F, -0.9F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 112).addBox(0.0F, -0.9F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1722F, -5.8848F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r400 = Tailend3.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(43, 24).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r401 = Tailend3.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(48, 111).addBox(0.0F, 11.4F, 22.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 6).addBox(0.0F, 10.5F, 20.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2217F, 5.874F, 0.169F, 0.0F, 0.0F));

		PartDefinition cube_r402 = Tailend4.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(18, 110).addBox(0.0F, 14.2F, 28.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 111).addBox(0.0F, 13.5F, 26.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 110).addBox(0.0F, 12.7F, 24.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5266F, -27.5757F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r403 = Tailend4.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1836F, 5.9018F, 0.1166F, 0.0F, 0.0F));

		PartDefinition cube_r404 = Tailend5.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(112, 50).addBox(0.0F, 17.9F, 34.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 47).addBox(0.0F, 16.9F, 32.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 112).addBox(0.0F, 16.1F, 30.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7102F, -33.4775F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r405 = Tailend5.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1957F, 5.8092F, 0.2039F, 0.0F, 0.0F));

		PartDefinition cube_r406 = Tailend6.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(15, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2371F, 5.8315F, 0.1346F, -0.0865F, -0.0117F));

		PartDefinition cube_r407 = Tailend7.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(30, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend8 = Tailend7.addOrReplaceChild("Tailend8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, 6.0F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition cube_r408 = Tailend8.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(45, 50).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend9 = Tailend8.addOrReplaceChild("Tailend9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 6.0F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r409 = Tailend9.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(29, 64).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.3416F, -0.8517F, -1.0303F, 0.0F, 0.0F));

		PartDefinition cube_r410 = Rightthigh.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(81, 12).addBox(-1.3F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r411 = Rightthigh.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(12, 101).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r412 = Rightthigh.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(100, 11).addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r413 = Rightthigh.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(15, 90).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 4.3835F, 0.7167F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r414 = Rightthigh.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(90, 10).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 7.9787F, 2.4702F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r415 = Rightthigh.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(7, 101).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, 15.8669F, 10.1657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r416 = Rightthigh.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(91, 109).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(86, 109).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 15.4428F, 7.9702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r417 = Rightthigh.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(36, 73).addBox(-0.5F, -0.8F, 0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(47, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 10.5767F, 3.9702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r418 = Rightthigh.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(96, 71).addBox(-0.5F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 8.8679F, 3.33F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r419 = Rightthigh.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(96, 66).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 14.673F, 10.537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r420 = Rightthigh.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(42, 88).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r421 = Rightthigh.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(88, 89).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 3.4507F, 0.804F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r422 = Rightthigh.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(83, 89).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(93, 93).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 15.6816F, 11.9575F, 1.7579F, 0.0F, 0.0F));

		PartDefinition cube_r423 = Rightshin.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(95, 77).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r424 = Rightshin.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(15, 107).addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(107, 13).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r425 = Rightshin.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(34, 94).addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r426 = Rightshin.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(93, 88).addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r427 = Rightshin.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(76, 95).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r428 = Rightshin.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(56, 34).addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r429 = Rightshin.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(37, 88).addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r430 = Rightshin.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(9, 81).addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r431 = Rightshin.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(41, 73).addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r432 = Rightshin.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(21, 25).addBox(-0.5F, -3.0F, -0.1F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r433 = Rightshin.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(78, 89).addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r434 = Rightshin.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(48, 58).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 19.8058F, -2.8029F, -1.2465F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(7, 58).addBox(-1.9F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 0.4255F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(0, 26).addBox(-1.9F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.0195F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.3416F, -0.8517F, -0.7248F, 0.0F, 0.0F));

		PartDefinition cube_r435 = Leftthigh.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.7F, -1.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r436 = Leftthigh.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(12, 101).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8612F, 0.946F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r437 = Leftthigh.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(100, 11).mirror().addBox(-0.5F, -5.35F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r438 = Leftthigh.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.3835F, 0.7167F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r439 = Leftthigh.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.9787F, 2.4702F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r440 = Leftthigh.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(7, 101).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 15.8669F, 10.1657F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r441 = Leftthigh.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(91, 109).mirror().addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(86, 109).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 15.4428F, 7.9702F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r442 = Leftthigh.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-0.5F, -0.8F, 0.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(47, 71).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 10.5767F, 3.9702F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r443 = Leftthigh.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(96, 71).mirror().addBox(-0.5F, -1.2F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 8.8679F, 3.33F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r444 = Leftthigh.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(96, 66).mirror().addBox(-0.5F, -3.0F, -0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 14.673F, 10.537F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r445 = Leftthigh.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(42, 88).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.2698F, 1.83F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r446 = Leftthigh.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.4507F, 0.804F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r447 = Leftthigh.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3459F, 1.4038F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(93, 93).mirror().addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 15.6816F, 11.9575F, 1.6706F, 0.0F, 0.0F));

		PartDefinition cube_r448 = Leftshin.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(95, 77).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.1708F, 0.8517F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r449 = Leftshin.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(15, 107).mirror().addBox(-0.5F, 0.375F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(107, 13).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.7F, -0.3201F, 1.1418F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r450 = Leftshin.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(34, 94).mirror().addBox(-0.5F, -4.1897F, -1.2195F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 3.9818F, 0.4248F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r451 = Leftshin.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(93, 88).mirror().addBox(-0.5F, -3.8677F, -0.4215F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r452 = Leftshin.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 0.8504F, 1.7615F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r453 = Leftshin.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(56, 34).mirror().addBox(-0.5F, -3.2287F, -0.2682F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 8.3818F, -0.9752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r454 = Leftshin.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(37, 88).mirror().addBox(-0.5F, -3.75F, -0.3021F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7F, 5.3818F, -0.5752F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r455 = Leftshin.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(9, 81).mirror().addBox(-0.5F, -1.1F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r456 = Leftshin.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(41, 73).mirror().addBox(-0.5F, -0.6F, -1.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r457 = Leftshin.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(21, 25).mirror().addBox(-0.5F, -3.0F, -0.1F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r458 = Leftshin.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(78, 89).mirror().addBox(-0.5F, -1.05F, -0.15F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r459 = Leftshin.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.3288F, 0.183F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.0F, -0.3F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.01F, 19.8058F, -2.8029F, -1.8137F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(7, 58).mirror().addBox(-2.1F, -0.4F, -2.7F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.7751F, 0.2668F, 1.6472F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-2.1F, -0.8F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3916F, -2.7038F, -0.325F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7816F, -0.6234F, -0.5226F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r460 = bone2.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(75, 27).addBox(-0.5F, 0.0F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2515F, 0.5145F, -4.8704F, -2.9671F, -0.0349F, -0.4363F));

		PartDefinition cube_r461 = bone2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(48, 108).addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7896F, -0.5952F, -4.3362F, -1.2654F, -0.0349F, -0.4363F));

		PartDefinition cube_r462 = bone2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(107, 31).addBox(-0.5F, -0.85F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7554F, -0.5075F, -4.1605F, -0.6545F, -0.0349F, -0.4363F));

		PartDefinition cube_r463 = bone2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(86, 34).addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7866F, -0.4385F, -2.5181F, 0.0436F, -0.0349F, -0.4363F));

		PartDefinition cube_r464 = bone2.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(100, 38).addBox(-0.9997F, -2.6517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1745F, -0.0349F, -0.4363F));

		PartDefinition cube_r465 = bone2.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(83, 84).addBox(-0.5F, -3.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7027F, 1.6772F, 3.2607F, 1.2915F, -0.0349F, 0.0F));

		PartDefinition cube_r466 = bone2.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(101, 17).addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6179F, 1.0493F, 0.834F, -0.3229F, -0.0349F, 0.0F));

		PartDefinition cube_r467 = bone2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(107, 28).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.0264F, -0.0302F, -0.0175F));

		PartDefinition cube_r468 = bone2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(17, 100).addBox(-0.5F, -0.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.4603F, 12.4192F, -1.7864F, 1.0751F, 0.0043F, -0.1475F));

		PartDefinition cube_r469 = bone2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(100, 7).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(0.4603F, 12.4192F, -1.7864F, 0.4206F, 0.0043F, -0.1475F));

		PartDefinition cube_r470 = bone2.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(0, 70).addBox(-0.5F, -7.0F, -0.9F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.4855F, 12.583F, -1.5992F, 0.0279F, 0.0043F, -0.1475F));

		PartDefinition cube_r471 = bone2.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(96, 99).addBox(-0.8369F, 7.0608F, -1.3405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.3699F, 4.5564F, -2.3981F, 0.2024F, 0.0043F, -0.1475F));

		PartDefinition cube_r472 = bone2.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(81, 34).addBox(-0.8369F, -0.0786F, -0.4363F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1141F, 7.8048F, -2.0761F, 0.0541F, 0.0043F, -0.1475F));

		PartDefinition cube_r473 = bone2.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(96, 61).addBox(-0.5192F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.4208F, 5.1647F, -2.5546F, -0.2872F, -0.0951F, -0.0968F));

		PartDefinition cube_r474 = bone2.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5192F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4208F, 5.1647F, -2.5546F, -0.0691F, -0.0951F, -0.0968F));

		PartDefinition cube_r475 = bone2.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(86, 95).addBox(-0.5192F, 0.5085F, -0.3362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4949F, 4.5564F, -2.3981F, 0.0705F, -0.0951F, -0.0968F));

		PartDefinition cube_r476 = bone2.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(90, 82).addBox(-0.5F, -3.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5021F, 5.1281F, -2.2127F, -0.4573F, -0.098F, -0.053F));

		PartDefinition cube_r477 = bone2.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(56, 107).addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(107, 51).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.5472F, 7.0297F, 5.1463F, 1.8401F, 0.057F, -0.0175F));

		PartDefinition cube_r478 = bone2.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(107, 58).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(107, 48).addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.5959F, 6.2646F, 4.528F, 1.0983F, 0.057F, -0.0175F));

		PartDefinition cube_r479 = bone2.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(0, 85).addBox(-0.3001F, -1.6041F, -1.3807F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8579F, 5.3991F, 3.7115F, 0.662F, 0.057F, -0.0175F));

		PartDefinition cube_r480 = bone2.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(91, 66).addBox(-0.5F, -2.525F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7191F, 3.7985F, 1.466F, 0.4154F, 0.0325F, -0.0143F));

		PartDefinition cube_r481 = bone2.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(95, 82).addBox(-0.5F, -3.3F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6499F, 4.8483F, 3.1313F, 0.5899F, 0.0325F, -0.0143F));

		PartDefinition cube_r482 = bone2.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.1137F, -0.0302F, -0.0175F));

		PartDefinition cube_r483 = bone2.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(70, 7).addBox(-0.5F, -2.9F, -1.775F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5639F, 2.8966F, -0.7132F, -0.0175F, -0.0349F, 0.0F));

		PartDefinition cube_r484 = bone2.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(55, 84).addBox(-0.9997F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -0.0175F, -0.0349F, -0.4363F));

		PartDefinition cube_r485 = bone2.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(90, 39).addBox(-0.5F, -4.1F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.968F, -0.2215F, 4.8161F, 1.5708F, -0.0349F, -0.4363F));

		PartDefinition cube_r486 = bone2.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(81, 95).addBox(-0.5F, -3.675F, -1.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0706F, -0.3711F, 5.6706F, 1.3963F, -0.0349F, -0.4363F));

		PartDefinition cube_r487 = bone2.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(90, 0).addBox(-0.9997F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1309F, -0.0349F, -0.4363F));

		PartDefinition cube_r488 = bone2.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(93, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.3134F, -1.0998F, 3.1538F, -0.3752F, -0.0349F, -0.4363F));

		PartDefinition cube_r489 = bone2.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(79, 7).addBox(-0.9997F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.947F, -1.727F, 0.3707F, -0.1745F, -0.0349F, -0.4363F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7816F, -0.6234F, -0.5226F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r490 = bone4.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(75, 27).mirror().addBox(-0.5F, 0.0F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2515F, 0.5145F, -4.8704F, -2.9671F, 0.0349F, 0.4363F));

		PartDefinition cube_r491 = bone4.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(48, 108).mirror().addBox(-0.5F, -0.6F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7896F, -0.5952F, -4.3362F, -1.2654F, 0.0349F, 0.4363F));

		PartDefinition cube_r492 = bone4.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(107, 31).mirror().addBox(-0.5F, -0.85F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7554F, -0.5075F, -4.1605F, -0.6545F, 0.0349F, 0.4363F));

		PartDefinition cube_r493 = bone4.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-0.5F, -1.3F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7866F, -0.4385F, -2.5181F, 0.0436F, 0.0349F, 0.4363F));

		PartDefinition cube_r494 = bone4.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(100, 38).mirror().addBox(-0.0003F, -2.6517F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1745F, 0.0349F, 0.4363F));

		PartDefinition cube_r495 = bone4.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(83, 84).mirror().addBox(-0.5F, -3.7F, -2.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7027F, 1.6772F, 3.2607F, 1.2915F, 0.0349F, 0.0F));

		PartDefinition cube_r496 = bone4.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(101, 17).mirror().addBox(-0.5F, -1.0F, -0.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6179F, 1.0493F, 0.834F, -0.3229F, 0.0349F, 0.0F));

		PartDefinition cube_r497 = bone4.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(107, 28).mirror().addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.0264F, 0.0302F, 0.0175F));

		PartDefinition cube_r498 = bone4.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(17, 100).mirror().addBox(-0.5F, -0.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(-0.4603F, 12.4192F, -1.7864F, 1.0751F, -0.0043F, 0.1475F));

		PartDefinition cube_r499 = bone4.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(100, 7).mirror().addBox(-0.5F, -0.1F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(-0.4603F, 12.4192F, -1.7864F, 0.4206F, -0.0043F, 0.1475F));

		PartDefinition cube_r500 = bone4.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.5F, -7.0F, -0.9F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offsetAndRotation(-0.4855F, 12.583F, -1.5992F, 0.0279F, -0.0043F, 0.1475F));

		PartDefinition cube_r501 = bone4.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(96, 99).mirror().addBox(-0.1631F, 7.0608F, -1.3405F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.3699F, 4.5564F, -2.3981F, 0.2024F, -0.0043F, 0.1475F));

		PartDefinition cube_r502 = bone4.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(81, 34).mirror().addBox(-0.1631F, -0.0786F, -0.4363F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1141F, 7.8048F, -2.0761F, 0.0541F, -0.0043F, 0.1475F));

		PartDefinition cube_r503 = bone4.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-0.4808F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.4208F, 5.1647F, -2.5546F, -0.2872F, 0.0951F, 0.0968F));

		PartDefinition cube_r504 = bone4.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.4808F, -2.8915F, -0.1362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4208F, 5.1647F, -2.5546F, -0.0691F, 0.0951F, 0.0968F));

		PartDefinition cube_r505 = bone4.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.4808F, 0.5085F, -0.3362F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 4.5564F, -2.3981F, 0.0705F, 0.0951F, 0.0968F));

		PartDefinition cube_r506 = bone4.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-0.5F, -3.2F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5021F, 5.1281F, -2.2127F, -0.4573F, 0.098F, 0.053F));

		PartDefinition cube_r507 = bone4.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(56, 107).mirror().addBox(-0.5F, -0.9F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(107, 51).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.5472F, 7.0297F, 5.1463F, 1.8401F, -0.057F, 0.0175F));

		PartDefinition cube_r508 = bone4.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(107, 58).mirror().addBox(-0.5F, -0.8F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(107, 48).mirror().addBox(-0.5F, 0.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.5959F, 6.2646F, 4.528F, 1.0983F, -0.057F, 0.0175F));

		PartDefinition cube_r509 = bone4.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.6999F, -1.6041F, -1.3807F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8579F, 5.3991F, 3.7115F, 0.662F, -0.057F, 0.0175F));

		PartDefinition cube_r510 = bone4.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(91, 66).mirror().addBox(-0.5F, -2.525F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7191F, 3.7985F, 1.466F, 0.4154F, -0.0325F, 0.0143F));

		PartDefinition cube_r511 = bone4.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-0.5F, -3.3F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.6499F, 4.8483F, 3.1313F, 0.5899F, -0.0325F, 0.0143F));

		PartDefinition cube_r512 = bone4.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(-0.5F, -1.5F, 0.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.1137F, 0.0302F, 0.0175F));

		PartDefinition cube_r513 = bone4.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(70, 7).mirror().addBox(-0.5F, -2.9F, -1.775F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 2.8966F, -0.7132F, -0.0175F, 0.0349F, 0.0F));

		PartDefinition cube_r514 = bone4.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(55, 84).mirror().addBox(-0.0003F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -0.0175F, 0.0349F, 0.4363F));

		PartDefinition cube_r515 = bone4.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-0.5F, -4.1F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.968F, -0.2215F, 4.8161F, 1.5708F, 0.0349F, 0.4363F));

		PartDefinition cube_r516 = bone4.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(81, 95).mirror().addBox(-0.5F, -3.675F, -1.075F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0706F, -0.3711F, 5.6706F, 1.3963F, 0.0349F, 0.4363F));

		PartDefinition cube_r517 = bone4.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(-0.0003F, -1.0662F, 0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1309F, 0.0349F, 0.4363F));

		PartDefinition cube_r518 = bone4.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.3134F, -1.0998F, 3.1538F, -0.3752F, 0.0349F, 0.4363F));

		PartDefinition cube_r519 = bone4.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(79, 7).mirror().addBox(-0.0003F, -0.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.947F, -1.727F, 0.3707F, -0.1745F, 0.0349F, 0.4363F));

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