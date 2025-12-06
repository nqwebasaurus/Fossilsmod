package fossils.fossils.client.blockentity.model.tanycolagreus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TanycolagreusFossilModel extends SkullModelBase {
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

	public TanycolagreusFossilModel(ModelPart root) {
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
		this.neck3 = this.neck2.getChild("neck3");
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
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.tail = this.Tailmiddlebase.getChild("tail");
		this.Tailmiddleend = this.tail.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Tailend2 = this.Tailend.getChild("Tailend2");
		this.Tailend3 = this.Tailend2.getChild("Tailend3");
		this.Tailend4 = this.Tailend3.getChild("Tailend4");
		this.Tailend5 = this.Tailend4.getChild("Tailend5");
		this.Tailend6 = this.Tailend5.getChild("Tailend6");
		this.Tailend7 = this.Tailend6.getChild("Tailend7");
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

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.9154F, -7.835F, -0.404F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(103, 53).addBox(0.0F, -2.615F, -0.051F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 1.0353F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(39, 107).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8556F, -1.0156F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(36, 107).addBox(0.0F, -5.5F, -3.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 37).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 37).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(36, 52).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, 0.0325F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(112, 80).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, -0.0109F, 0.3238F, -1.5411F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(113, 24).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(98, 84).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0068F, -2.9329F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(112, 43).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(98, 72).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(112, 43).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 72).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 84).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(113, 24).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(112, 80).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0068F, -2.9329F, -0.0109F, -0.3238F, 1.5411F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(16, 78).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(27, 107).addBox(0.01F, -2.8092F, -0.1729F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2961F, -1.2479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(24, 107).addBox(0.01F, -2.6814F, -0.0939F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 106).addBox(0.01F, -2.9793F, -2.0269F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(21, 106).addBox(0.01F, -2.6912F, -0.0205F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.1621F, 0.2818F, -0.9752F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(113, 16).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.2651F, 0.1556F, -0.5095F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, -0.0109F, 0.3238F, -1.5411F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 41).mirror().addBox(-6.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.0091F, 0.3734F, -1.4796F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(84, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.2066F, 0.3135F, -0.9075F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.318F, 0.1649F, -0.4465F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.3025F, 0.1565F, -0.4664F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.1961F, 0.2991F, -0.9281F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0083F, 0.356F, -1.4973F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(96, 19).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.1621F, -0.2818F, 0.9752F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(113, 16).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.2651F, -0.1556F, 0.5095F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 82).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, -0.0109F, -0.3238F, 1.5411F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(74, 41).addBox(2.2375F, -1.8712F, -0.5598F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.0091F, -0.3734F, 1.4796F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 45).addBox(-2.49F, 0.0989F, -0.0172F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0222F, -3.0807F, -0.2007F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(42, 37).addBox(-2.49F, -2.9011F, -0.0172F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.7724F, -7.2564F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 53).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.2066F, -0.3135F, 0.9075F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 41).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.318F, -0.1649F, 0.4465F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(78, 43).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.3025F, -0.1565F, 0.4664F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(29, 76).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.1961F, -0.2991F, 0.9281F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(82, 60).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0083F, -0.356F, 1.4973F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(53, 60).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(15, 106).addBox(0.01F, -2.6961F, -0.023F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(65, 106).addBox(0.01F, -2.35F, -0.7F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2517F, -5.3275F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 23).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.202F, 0.3404F, -0.8583F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.3263F, 0.191F, -0.3943F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, -0.0107F, 0.3937F, -1.4363F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 21).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.2928F, 0.4283F, -0.8073F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(61, 16).mirror().addBox(-10.2375F, -1.8712F, -0.5598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.0128F, 0.5135F, -1.4091F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(111, 14).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.4433F, 0.2324F, -0.3528F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(110, 22).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.4128F, 0.2129F, -0.394F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(97, 4).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.2731F, 0.3978F, -0.8497F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(65, 7).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0153F, 0.4781F, -1.4423F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 23).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.202F, -0.3404F, 0.8583F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.3263F, -0.191F, 0.3943F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(74, 0).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, -0.0107F, -0.3937F, 1.4363F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(98, 21).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.2928F, -0.4283F, 0.8073F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(61, 16).addBox(2.2375F, -1.8712F, -0.5598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.0128F, -0.5135F, 1.4091F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(111, 14).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.4433F, -0.2324F, 0.3528F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(110, 22).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.4128F, -0.2129F, 0.394F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(97, 4).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.2731F, -0.3978F, 0.8497F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(65, 7).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0153F, -0.4781F, 1.4423F));

		PartDefinition Bodymiddle_r5 = body2.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(36, 45).addBox(-2.49F, -1.7805F, -3.9479F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.35F, -1.5F, -0.1004F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = body2.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(17, 54).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(106, 53).addBox(0.01F, -2.6513F, -0.0922F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(50, 106).addBox(0.01F, -3.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1535F, -3.5038F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.1155F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(106, 102).addBox(0.01F, -2.2818F, -0.0391F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(101, 106).addBox(0.01F, -2.3018F, -0.0314F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0872F, -3.9452F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(47, 113).addBox(0.01F, -2.15F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0753F, -5.1698F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(112, 41).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.5326F, 0.1282F, -0.525F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.427F, 0.371F, -0.9432F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(61, 20).mirror().addBox(-10.2375F, -1.8712F, -0.5598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.1683F, 0.5347F, -1.5194F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(112, 39).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.4277F, 0.199F, -0.4239F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(56, 98).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.2939F, 0.3916F, -0.8747F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-10.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.0372F, 0.4837F, -1.4653F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(37, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.3758F, 0.1972F, -0.3663F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-11.2375F, -1.8712F, -0.5598F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.0102F, 0.4389F, -1.4094F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(98, 29).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.2455F, 0.3677F, -0.8248F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-0.0041F, -2.0948F, -0.0036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.205F, 7.1818F, -8.8663F, 0.8359F, 0.0106F, 0.0361F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(93, 26).mirror().addBox(-0.0041F, -3.1948F, -1.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2218F, 7.7044F, -5.6512F, 1.0975F, 0.0009F, 0.0376F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(61, 43).mirror().addBox(-7.2314F, 0.1271F, -0.3411F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0474F, 7.6875F, -6.534F, 0.2339F, 1.3522F, 0.2374F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(74, 2).mirror().addBox(-4.8195F, -0.0999F, -0.3763F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1694F, 7.8176F, -6.1354F, 0.6068F, 1.1846F, 0.6861F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(112, 41).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.5326F, -0.1282F, 0.525F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 70).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.427F, -0.371F, 0.9432F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(61, 20).addBox(2.2375F, -1.8712F, -0.5598F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.1683F, -0.5347F, 1.5194F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(112, 39).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.4277F, -0.199F, 0.4239F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(56, 98).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.2939F, -0.3916F, 0.8747F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(61, 18).addBox(2.2375F, -1.8712F, -0.5599F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.0372F, -0.4837F, 1.4653F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(37, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.3758F, -0.1972F, 0.3663F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(44, 8).addBox(2.2375F, -1.8712F, -0.5598F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.0102F, -0.4389F, 1.4094F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(98, 29).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.2455F, -0.3677F, 0.8248F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(98, 55).addBox(-0.9959F, -2.0948F, -0.0036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.225F, 7.1818F, -8.8663F, 0.8359F, -0.0106F, -0.0361F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(93, 26).addBox(-0.9959F, -3.1948F, -1.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2418F, 7.7044F, -5.6512F, 1.0975F, -0.0009F, -0.0376F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(61, 43).addBox(0.2314F, 0.1271F, -0.3411F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0674F, 7.6875F, -6.534F, 0.2339F, -1.3522F, -0.2374F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(74, 2).addBox(-0.1805F, -0.0999F, -0.3763F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1894F, 7.8176F, -6.1354F, 0.6068F, -1.1846F, -0.6861F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(42, 21).addBox(-1.99F, -2.0156F, -5.053F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 11.0112F, -0.6877F, -0.384F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(0, 53).addBox(-0.49F, -0.75F, -6.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4918F, -6.917F, 0.0531F, 0.0F, 0.0F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(20, 111).addBox(0.01F, -1.9F, -0.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5209F, -0.636F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neckbase.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(10, 112).addBox(0.01F, -2.5987F, 0.4368F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 68).addBox(-0.49F, -1.0987F, -0.5632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0343F, -3.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r73 = Neckbase.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(93, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4378F, -2.3667F, 0.314F, 0.2808F, -0.8385F));

		PartDefinition cube_r74 = Neckbase.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-5.8817F, -0.4515F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.4378F, -2.3667F, 0.1465F, 0.415F, -1.3201F));

		PartDefinition cube_r75 = Neckbase.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1378F, -0.4667F, 0.3476F, 0.264F, -0.9681F));

		PartDefinition cube_r76 = Neckbase.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1378F, -0.4667F, 0.161F, 0.4039F, -1.5227F));

		PartDefinition cube_r77 = Neckbase.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(112, 91).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1378F, -0.4667F, 0.4191F, 0.0619F, -0.5358F));

		PartDefinition cube_r78 = Neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(74, 4).addBox(0.8817F, -0.4515F, -0.5599F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4378F, -2.3667F, 0.1465F, -0.415F, 1.3201F));

		PartDefinition cube_r79 = Neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.4378F, -2.3667F, 0.314F, -0.2808F, 0.8385F));

		PartDefinition cube_r80 = Neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(112, 91).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1378F, -0.4667F, 0.4191F, -0.0619F, 0.5358F));

		PartDefinition cube_r81 = Neckbase.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 62).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1378F, -0.4667F, 0.161F, -0.4039F, 1.5227F));

		PartDefinition cube_r82 = Neckbase.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(98, 86).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1378F, -0.4667F, 0.3476F, -0.264F, 0.9681F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6206F, -3.709F, -0.2623F, -0.0865F, 0.0114F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(18, 74).addBox(0.01F, -0.982F, -0.1524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4598F, -2.8812F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r2 = neck.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(31, 112).addBox(0.01F, -1.882F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Neckend_r1 = neck.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(83, 43).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.315F, -0.8967F, -0.3221F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r2 = neck.addOrReplaceChild("Neckend_r2", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -2.8816F, -0.3664F, -0.1739F, -0.0076F));

		PartDefinition Neckend_r3 = neck.addOrReplaceChild("Neckend_r3", CubeListBuilder.create().texOffs(83, 43).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.315F, -0.8967F, -0.3221F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r4 = neck.addOrReplaceChild("Neckend_r4", CubeListBuilder.create().texOffs(35, 83).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -2.8816F, -0.3664F, 0.1739F, 0.0076F));

		PartDefinition Neckmiddle_r3 = neck.addOrReplaceChild("Neckmiddle_r3", CubeListBuilder.create().texOffs(58, 74).addBox(-0.49F, -0.682F, -3.2524F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0618F, -2.6729F, -0.2269F, -0.0402F, 0.017F));

		PartDefinition Neckmiddle_r4 = Neckmiddle.addOrReplaceChild("Neckmiddle_r4", CubeListBuilder.create().texOffs(114, 3).addBox(0.01F, -0.8329F, -0.0025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0827F, -4.0526F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r5 = Neckmiddle.addOrReplaceChild("Neckmiddle_r5", CubeListBuilder.create().texOffs(29, 73).addBox(0.01F, -1.3828F, -1.4025F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(60, 68).addBox(-0.49F, -0.6829F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.5849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neckend_r5 = Neckmiddle.addOrReplaceChild("Neckend_r5", CubeListBuilder.create().texOffs(103, 25).mirror().addBox(-0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.295F, 0.6432F, -3.6945F, -0.1563F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r6 = Neckmiddle.addOrReplaceChild("Neckend_r6", CubeListBuilder.create().texOffs(102, 74).mirror().addBox(0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.2072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r7 = Neckmiddle.addOrReplaceChild("Neckend_r7", CubeListBuilder.create().texOffs(103, 25).addBox(0.1973F, -0.2718F, -0.0566F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.315F, 0.6432F, -3.6945F, -0.1563F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r8 = Neckmiddle.addOrReplaceChild("Neckend_r8", CubeListBuilder.create().texOffs(102, 74).addBox(-0.0152F, -0.4037F, 0.0518F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.2072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6861F, -4.0023F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 113).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1862F, -2.0163F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(43, 80).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r9 = neck2.addOrReplaceChild("Neckend_r9", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.2722F, -1.6872F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r10 = neck2.addOrReplaceChild("Neckend_r10", CubeListBuilder.create().texOffs(50, 99).addBox(-0.0233F, -0.7767F, 0.2477F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.2722F, -1.6872F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1646F, -2.6112F, 0.1395F, -0.0061F, 0.0432F));

		PartDefinition cube_r85 = neck3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 77).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(59, 113).addBox(0.0F, -1.15F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.4853F, -2.1645F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r87 = neck3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(56, 113).addBox(0.0F, -1.2F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -0.3122F, -0.3304F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Neckend_r11 = neck3.addOrReplaceChild("Neckend_r11", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.4298F, -0.1602F, -3.4271F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 98).mirror().addBox(-0.2091F, -0.4998F, -1.6283F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.1076F, 0.9239F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r12 = neck3.addOrReplaceChild("Neckend_r12", CubeListBuilder.create().texOffs(99, 59).addBox(0.4298F, -0.1602F, -3.4271F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 98).addBox(0.2091F, -0.4998F, -1.6283F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.1076F, 0.9239F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2409F, -2.6234F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r88 = neck4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 112).addBox(0.0F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1487F, -1.4678F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r89 = neck4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(76, 77).addBox(-0.49F, -0.6F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r13 = neck4.addOrReplaceChild("Neckend_r13", CubeListBuilder.create().texOffs(98, 25).mirror().addBox(0.2082F, -0.3573F, -0.0029F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.695F, 0.8517F, -1.4114F, 0.1404F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r14 = neck4.addOrReplaceChild("Neckend_r14", CubeListBuilder.create().texOffs(98, 25).addBox(-0.2082F, -0.3573F, -0.0029F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.715F, 0.8517F, -1.4114F, 0.1404F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.1319F, -2.6727F, 0.53F, 0.0F, 0.0F));

		PartDefinition Neckend_r15 = Neckend.addOrReplaceChild("Neckend_r15", CubeListBuilder.create().texOffs(114, 6).addBox(0.0F, -1.4987F, -0.1332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(67, 74).addBox(0.0F, -1.3987F, 1.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Neckend_r16 = Neckend.addOrReplaceChild("Neckend_r16", CubeListBuilder.create().texOffs(99, 63).mirror().addBox(-0.099F, -0.2093F, -0.6921F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r17 = Neckend.addOrReplaceChild("Neckend_r17", CubeListBuilder.create().texOffs(98, 47).mirror().addBox(0.1273F, -0.4948F, -0.0854F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6399F, 0.4622F, -0.6532F, -0.2785F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r18 = Neckend.addOrReplaceChild("Neckend_r18", CubeListBuilder.create().texOffs(99, 63).addBox(0.099F, -0.2093F, -0.6921F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r19 = Neckend.addOrReplaceChild("Neckend_r19", CubeListBuilder.create().texOffs(98, 47).addBox(-0.1273F, -0.4948F, -0.0854F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6399F, 0.4622F, -0.6532F, -0.2785F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r20 = Neckend.addOrReplaceChild("Neckend_r20", CubeListBuilder.create().texOffs(7, 78).addBox(-0.5F, -0.5987F, -0.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0807F, -2.5005F, 0.4899F, 0.3207F, -0.362F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(78, 9).addBox(-1.5F, -0.0211F, -0.0246F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.5379F, -2.7F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(7, 74).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.0004F, -1.3203F, -1.9373F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(80, 6).addBox(-1.5F, -0.0127F, -0.4932F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.6368F, -0.9868F, -0.8029F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(37, 61).addBox(-1.5F, -1.4127F, -2.1932F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.2755F, -1.3137F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(82, 72).addBox(-1.5F, -0.3377F, -0.6932F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.5936F, -0.2747F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(74, 37).addBox(-1.5F, -1.0F, -0.05F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6377F, -2.6735F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(70, 86).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7162F, -3.676F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(80, 19).addBox(-1.5F, -1.0F, -0.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.6534F, -4.4735F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(107, 73).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7217F, -12.4923F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(68, 107).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0444F, -11.8495F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(58, 107).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3726F, -10.9036F, 0.384F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(90, 36).addBox(-0.5F, -0.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9573F, -8.991F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(90, 32).addBox(-0.5F, -0.05F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.475F, -7.0592F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(73, 50).addBox(-1.0F, -0.05F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9249F, -5.1104F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(49, 68).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3884F, -3.6838F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(70, 82).addBox(-1.5F, -0.1F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4636F, -2.6817F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(110, 82).addBox(-0.5F, -0.9582F, -0.0339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5401F, -2.6877F, -1.5359F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(93, 106).addBox(-0.5F, 0.1779F, 0.8762F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -2.3401F, -1.7877F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(110, 85).addBox(-0.5F, -0.0022F, -0.004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.5097F, -0.807F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(110, 69).addBox(-0.5F, -0.1521F, 0.896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -2.5401F, -2.6877F, -0.096F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create().texOffs(45, 97).addBox(0.6F, -0.4525F, -3.3832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(45, 97).mirror().addBox(-1.6F, -0.4525F, -3.3832F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6302F, -0.0445F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(109, 63).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(109, 63).addBox(1.95F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.225F, 1.1312F, -2.8657F, -3.0892F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(109, 60).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(109, 60).addBox(1.95F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-1.225F, 0.9814F, -3.2366F, -1.9548F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(109, 57).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(109, 57).addBox(1.95F, -0.3F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.225F, 0.4866F, -2.9623F, -1.2915F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(109, 54).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(109, 54).addBox(1.95F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.5006F, -2.5626F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(106, 13).mirror().addBox(-0.2F, 0.4762F, -7.3491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.325F, -0.1897F, -4.7569F, -0.1134F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(106, 10).mirror().addBox(-0.2F, -0.0951F, -6.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 112).mirror().addBox(-0.2F, -0.2451F, -5.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 106).mirror().addBox(-0.2F, -0.1951F, -4.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.325F, -0.1897F, -4.7569F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(5, 106).mirror().addBox(-0.2F, -0.5308F, -3.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 106).mirror().addBox(-0.2F, -0.5308F, -2.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.325F, -0.1897F, -4.7569F, 0.096F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(15, 98).mirror().addBox(-0.2F, -5.7773F, -1.2229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 1.645F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(105, 85).mirror().addBox(-0.2F, -1.5855F, 5.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -3.1329F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(105, 82).mirror().addBox(-0.2F, 5.5653F, 1.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -1.7366F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(73, 105).mirror().addBox(-0.2F, 2.4336F, -6.7945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -0.2967F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(105, 70).mirror().addBox(-0.2F, 4.0302F, -6.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -0.5585F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-0.2F, 0.2638F, -7.5419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -0.0087F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(39, 92).mirror().addBox(-0.2F, -0.0368F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.0436F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(10, 98).mirror().addBox(-0.2F, 2.4297F, 0.1711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -1.4835F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-0.2F, 1.1874F, 0.5284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -1.6057F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(78, 62).mirror().addBox(-0.2F, -0.2558F, -4.424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.096F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.2F, -0.5063F, 0.1465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(97, 95).mirror().addBox(-0.2F, -0.4813F, 0.6465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, -1.693F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(57, 91).mirror().addBox(-0.2F, -0.2F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, -0.1897F, -4.7569F, 0.0611F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(-0.5F, -0.2F, -1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 97).mirror().addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(97, 74).addBox(1.7F, -0.2F, -1.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 97).addBox(1.7F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.5471F, -3.1056F, -1.741F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(91, 56).mirror().addBox(-0.5F, -0.2F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(91, 56).addBox(1.7F, -0.2F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, -0.2525F, -3.1582F, 0.0393F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(35, 88).mirror().addBox(-0.5F, -0.3143F, -1.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(35, 88).addBox(1.7F, -0.3143F, -1.2773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.087F, -0.4186F, -0.1353F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(40, 104).mirror().addBox(-0.5F, -0.0508F, -2.7958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(40, 104).addBox(1.7F, -0.0508F, -2.7958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(88, 106).mirror().addBox(-0.5F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false)
				.texOffs(88, 106).addBox(1.95F, -0.45F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(-1.225F, 0.7076F, -2.4612F, 1.3177F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(83, 106).mirror().addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(83, 106).addBox(1.95F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.225F, 0.7916F, -2.3401F, -2.8187F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(78, 106).mirror().addBox(-0.5F, -0.425F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(78, 106).addBox(1.95F, -0.425F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.225F, 0.8741F, -2.1559F, -2.9496F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(102, 78).mirror().addBox(-0.5F, -0.7344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(102, 78).addBox(1.7F, -0.7344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.324F, 0.5155F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(35, 104).mirror().addBox(-0.5F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(35, 104).addBox(1.7F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(30, 104).mirror().addBox(-0.5F, -0.2246F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(30, 104).addBox(1.7F, -0.2246F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(97, 43).mirror().addBox(-0.5F, -1.6448F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(97, 43).addBox(1.7F, -1.6448F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, 1.5621F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r31 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r31", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-0.5F, 1.0446F, -0.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 15).addBox(1.7F, 1.0446F, -0.2244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.5655F, -1.4661F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r32 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r32", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(103, 50).addBox(1.7F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 1.086F, -1.6806F, -1.3701F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r33 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r33", CubeListBuilder.create().texOffs(15, 111).mirror().addBox(-0.5F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(15, 111).addBox(1.7F, -0.2193F, -0.4812F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 1.2158F, -2.532F, -1.549F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r34 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r34", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(-0.5F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(103, 47).addBox(1.7F, -0.7809F, -0.4844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 1.2158F, -2.532F, -1.4268F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Lowerjawbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(86, 86).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r91 = Lowerjawbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition cube_r92 = Lowerjawbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition Lowerjawbase_r35 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r35", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(-0.5F, -0.8263F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(87, 9).addBox(1.7F, -0.8263F, -1.7463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.1F, 0.8546F, 0.1171F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r36 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r36", CubeListBuilder.create().texOffs(15, 98).addBox(-0.8F, -5.7773F, -1.2229F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 1.645F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r37 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r37", CubeListBuilder.create().texOffs(105, 85).addBox(-0.8F, -1.5855F, 5.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -3.1329F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r38 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r38", CubeListBuilder.create().texOffs(105, 82).addBox(-0.8F, 5.5653F, 1.6235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -1.7366F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r39 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r39", CubeListBuilder.create().texOffs(73, 105).addBox(-0.8F, 2.4336F, -6.7945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -0.2967F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r40 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r40", CubeListBuilder.create().texOffs(105, 70).addBox(-0.8F, 4.0302F, -6.3329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -0.5585F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r41 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r41", CubeListBuilder.create().texOffs(32, 92).addBox(-0.8F, 0.2638F, -7.5419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r42 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r42", CubeListBuilder.create().texOffs(39, 92).addBox(-0.8F, -0.0368F, -5.9898F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.0436F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r43 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r43", CubeListBuilder.create().texOffs(106, 13).addBox(-0.8F, 0.4762F, -7.3491F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.325F, -0.1897F, -4.7569F, -0.1134F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r44 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r44", CubeListBuilder.create().texOffs(106, 10).addBox(-0.8F, -0.0951F, -6.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 112).addBox(-0.8F, -0.2451F, -5.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 106).addBox(-0.8F, -0.1951F, -4.4136F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.325F, -0.1897F, -4.7569F, -0.0087F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r45 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r45", CubeListBuilder.create().texOffs(5, 106).addBox(-0.8F, -0.5308F, -3.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 106).addBox(-0.8F, -0.5308F, -2.424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.325F, -0.1897F, -4.7569F, 0.096F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r46 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r46", CubeListBuilder.create().texOffs(78, 62).addBox(-0.8F, -0.2558F, -4.424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.096F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r47 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r47", CubeListBuilder.create().texOffs(57, 91).addBox(-0.8F, -0.2F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, 0.0611F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r48 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r48", CubeListBuilder.create().texOffs(0, 98).addBox(-0.8F, -0.5063F, 0.1465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(97, 95).addBox(-0.8F, -0.4813F, 0.6465F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -1.693F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r49 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r49", CubeListBuilder.create().texOffs(10, 98).addBox(-0.8F, 2.4297F, 0.1711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -1.4835F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r50 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r50", CubeListBuilder.create().texOffs(5, 98).addBox(-0.8F, 1.1874F, 0.5284F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(1.4F, -0.1897F, -4.7569F, -1.6057F, 0.1222F, 0.0F));

		PartDefinition cube_r93 = Lowerjawbase.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(86, 86).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r94 = Lowerjawbase.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(87, 66).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r95 = Lowerjawbase.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(87, 62).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7789F, -2.2478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, -0.4936F, -2.4747F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(86, 90).addBox(-1.0181F, -1.8155F, -6.8552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F))
				.texOffs(90, 44).addBox(-1.0181F, -1.0155F, -7.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(85, 76).addBox(-1.0181F, -2.1989F, -5.2515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.0611F, 0.1047F, 0.0F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(79, 99).addBox(-0.8681F, 2.7953F, -6.8316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -0.6632F, 0.1047F, 0.0F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(109, 6).addBox(-0.8681F, 7.2462F, -1.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(107, 91).addBox(-1.0181F, 6.6212F, -1.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -1.501F, 0.1047F, 0.0F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(107, 79).addBox(-1.0181F, 1.0423F, -7.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -0.3665F, 0.1047F, 0.0F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(107, 76).addBox(-1.0181F, -5.0421F, -5.5915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.5061F, 0.1047F, 0.0F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(49, 74).addBox(-1.0181F, -3.9288F, -5.574F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.288F, 0.1047F, 0.0F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(57, 86).addBox(-1.395F, -0.9511F, 2.0277F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 1.5912F, 0.0163F, 0.173F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(91, 52).addBox(-1.1373F, -2.3795F, 1.7152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 1.2937F, 0.1046F, 0.1224F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(86, 27).addBox(-1.1373F, -4.0629F, -0.3403F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.6392F, 0.1046F, 0.1224F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(86, 22).addBox(-1.1373F, -4.1204F, -1.4292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.517F, 0.1046F, 0.1224F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(0, 64).addBox(-1.0181F, -3.7397F, -2.8418F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.2182F, 0.1047F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(108, 48).addBox(-0.7431F, 1.7656F, -4.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(108, 45).addBox(-0.9681F, -0.3094F, -3.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(42, 108).addBox(-0.9681F, -0.0094F, -3.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -0.8203F, 0.1047F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(108, 24).addBox(-0.9681F, -3.4421F, -1.0754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.4451F, 0.1047F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(91, 48).addBox(-0.9681F, -2.0361F, 0.7764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 1.405F, 0.1047F, 0.0F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(25, 91).addBox(-0.9681F, -0.2563F, 0.8686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 2.0159F, 0.1047F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(108, 16).addBox(-0.9681F, 0.6789F, 0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -3.1329F, 0.1047F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(0, 109).addBox(-0.7937F, -3.966F, -5.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(108, 88).addBox(-0.7937F, -3.966F, -5.7098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.2705F, 0.1047F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(5, 109).addBox(-0.7937F, -4.3367F, 4.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(109, 3).addBox(-0.7937F, -4.7367F, 4.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 2.2427F, 0.1047F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(45, 105).addBox(-0.7937F, 1.9459F, 6.1765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -2.9758F, 0.1047F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(105, 21).addBox(-0.7937F, 5.1469F, 3.7658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -2.4347F, 0.1047F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(73, 108).addBox(-0.7937F, 4.9606F, -4.4318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -1.213F, 0.1047F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(104, 107).addBox(-0.9681F, 1.6743F, -1.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -1.693F, 0.1047F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(107, 94).addBox(-0.9681F, -0.5216F, -3.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, -0.4712F, 0.1047F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(109, 51).addBox(-1.0181F, -1.5407F, -7.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 100).addBox(-1.0181F, -1.9407F, -6.8199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.1833F, 0.1047F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(99, 99).addBox(-1.0181F, -2.0509F, -5.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 11).addBox(-1.0181F, -1.8509F, -4.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 109).addBox(-1.0181F, -0.9508F, -3.8026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 99).addBox(-1.0181F, -1.5509F, -2.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 99).addBox(-1.0181F, -1.4508F, -1.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.2007F, 0.1047F, 0.0F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(84, 99).addBox(-1.0181F, -1.7122F, -0.8425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(63, 0).addBox(-1.0181F, -2.3122F, -3.2425F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7511F, 2.4472F, -2.3026F, 0.096F, 0.1047F, 0.0F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(104, 99).addBox(-0.5F, -0.975F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(104, 67).addBox(-0.5F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -0.4778F, -0.1183F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(104, 64).addBox(-0.5F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.48F, 0.1194F, -0.0608F, 1.6668F, 0.0F, 0.0F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(104, 61).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 0.8077F, 0.0668F, -2.9583F, 0.0F, 0.0F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(60, 104).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, 1.4936F, -0.0728F, -1.7715F, 0.0F, 0.0F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(104, 58).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.48F, 1.7157F, -0.7366F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(55, 104).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.48F, 1.6365F, -1.4321F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(90, 40).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, 1.0528F, -1.8185F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(102, 92).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.48F, 0.4236F, -2.1253F, 2.0246F, 0.0F, 0.0F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(112, 0).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.48F, -0.2635F, -2.2589F, -2.9496F, 0.0F, 0.0F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.48F, -0.2635F, -2.2589F, -1.5533F, 0.0F, 0.0F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(73, 111).addBox(-0.5F, 0.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(63, 111).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.48F, -1.4283F, -1.2742F, -1.1345F, 0.0F, 0.0F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(42, 111).addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.48F, -1.4501F, -0.7747F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(89, 6).addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 67).addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.3575F, -0.3099F, -1.0895F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(93, 103).addBox(-0.5F, -0.8599F, -0.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, -0.3286F, 0.4828F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(25, 104).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(1.47F, 1.0693F, 1.5987F, -3.0281F, 0.0F, 0.0F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(104, 7).addBox(-0.5F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, 0.5965F, 1.4359F, 1.9024F, 0.0F, 0.0F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(104, 4).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.47F, -0.0906F, 1.5695F, -0.192F, 0.0F, 0.0F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(101, 103).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, -0.7668F, 1.3883F, -1.309F, 0.0F, 0.0F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(103, 88).addBox(-0.5F, -1.866F, -2.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.47F, 1.0681F, 0.374F, -1.117F, 0.0F, 0.0F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(88, 103).addBox(-0.5F, -1.5599F, -0.2002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.47F, 1.0681F, 0.374F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(83, 103).addBox(-0.5F, -0.8617F, -0.1505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, 1.0681F, 0.374F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(79, 34).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, 1.7163F, 0.6073F, -1.8675F, 0.0F, 0.0F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(78, 103).addBox(-0.5F, 0.0773F, 0.1457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.47F, 0.4681F, 1.149F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(97, 31).addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 2.2401F, 2.4077F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(97, 0).addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(1.5F, 1.4479F, 2.1111F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(79, 82).addBox(-1.5F, -0.975F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 22).addBox(-0.5F, -0.575F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -0.42F, 2.7195F, 0.5061F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, -0.4936F, -2.4747F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(0.0181F, -1.8155F, -6.8552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(90, 44).mirror().addBox(0.0181F, -1.0155F, -7.2552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(85, 76).mirror().addBox(0.0181F, -2.1989F, -5.2515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.0611F, -0.1047F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(79, 99).mirror().addBox(-0.1319F, 2.7953F, -6.8316F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -0.6632F, -0.1047F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(109, 6).mirror().addBox(-0.1319F, 7.2462F, -1.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(107, 91).mirror().addBox(0.0181F, 6.6212F, -1.3003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -1.501F, -0.1047F, 0.0F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(107, 79).mirror().addBox(0.0181F, 1.0423F, -7.4567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -0.3665F, -0.1047F, 0.0F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(107, 76).mirror().addBox(0.0181F, -5.0421F, -5.5915F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.5061F, -0.1047F, 0.0F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(0.0181F, -3.9288F, -5.574F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.288F, -0.1047F, 0.0F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(57, 86).mirror().addBox(0.395F, -0.9511F, 2.0277F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 1.5912F, -0.0163F, -0.173F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(91, 52).mirror().addBox(0.1373F, -2.3795F, 1.7152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 1.2937F, -0.1046F, -0.1224F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(86, 27).mirror().addBox(0.1373F, -4.0629F, -0.3403F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.6392F, -0.1046F, -0.1224F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(86, 22).mirror().addBox(0.1373F, -4.1204F, -1.4292F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.517F, -0.1046F, -0.1224F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(0.0181F, -3.7397F, -2.8418F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.2182F, -0.1047F, 0.0F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(108, 48).mirror().addBox(-0.2569F, 1.7656F, -4.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(108, 45).mirror().addBox(-0.0319F, -0.3094F, -3.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(42, 108).mirror().addBox(-0.0319F, -0.0094F, -3.6062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -0.8203F, -0.1047F, 0.0F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(108, 24).mirror().addBox(-0.0319F, -3.4421F, -1.0754F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.4451F, -0.1047F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(91, 48).mirror().addBox(-0.0319F, -2.0361F, 0.7764F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 1.405F, -0.1047F, 0.0F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(-0.0319F, -0.2563F, 0.8686F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 2.0159F, -0.1047F, 0.0F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(108, 16).mirror().addBox(-0.0319F, 0.6789F, 0.5994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -3.1329F, -0.1047F, 0.0F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-0.2063F, -3.966F, -5.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(108, 88).mirror().addBox(-0.2063F, -3.966F, -5.7098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.2705F, -0.1047F, 0.0F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.2063F, -4.3367F, 4.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(109, 3).mirror().addBox(-0.2063F, -4.7367F, 4.7683F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 2.2427F, -0.1047F, 0.0F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(45, 105).mirror().addBox(-0.2063F, 1.9459F, 6.1765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -2.9758F, -0.1047F, 0.0F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(105, 21).mirror().addBox(-0.2063F, 5.1469F, 3.7658F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -2.4347F, -0.1047F, 0.0F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(73, 108).mirror().addBox(-0.2063F, 4.9606F, -4.4318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -1.213F, -0.1047F, 0.0F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-0.0319F, 1.6743F, -1.4643F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -1.693F, -0.1047F, 0.0F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(107, 94).mirror().addBox(-0.0319F, -0.5216F, -3.6718F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, -0.4712F, -0.1047F, 0.0F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(109, 51).mirror().addBox(0.0181F, -1.5407F, -7.8199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 100).mirror().addBox(0.0181F, -1.9407F, -6.8199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.1833F, -0.1047F, 0.0F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(99, 99).mirror().addBox(0.0181F, -2.0509F, -5.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 11).mirror().addBox(0.0181F, -1.8509F, -4.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 109).mirror().addBox(0.0181F, -0.9508F, -3.8026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 99).mirror().addBox(0.0181F, -1.5509F, -2.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 99).mirror().addBox(0.0181F, -1.4508F, -1.8026F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.2007F, -0.1047F, 0.0F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(84, 99).mirror().addBox(0.0181F, -1.7122F, -0.8425F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(63, 0).mirror().addBox(0.0181F, -2.3122F, -3.2425F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7511F, 2.4472F, -2.3026F, 0.096F, -0.1047F, 0.0F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-0.5F, -0.975F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(104, 67).mirror().addBox(-0.5F, -0.65F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.4778F, -0.1183F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-0.5F, -0.85F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.1194F, -0.0608F, 1.6668F, 0.0F, 0.0F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(104, 61).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.8077F, 0.0668F, -2.9583F, 0.0F, 0.0F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(60, 104).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.4936F, -0.0728F, -1.7715F, 0.0F, 0.0F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(104, 58).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.7157F, -0.7366F, -1.2479F, 0.0F, 0.0F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(55, 104).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.6365F, -1.4321F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 1.0528F, -1.8185F, 0.5847F, 0.0F, 0.0F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(102, 92).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.48F, 0.4236F, -2.1253F, 2.0246F, 0.0F, 0.0F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.2635F, -2.2589F, -2.9496F, 0.0F, 0.0F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -0.2635F, -2.2589F, -1.5533F, 0.0F, 0.0F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(73, 111).mirror().addBox(-0.5F, 0.25F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(63, 111).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.4283F, -1.2742F, -1.1345F, 0.0F, 0.0F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(42, 111).mirror().addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.48F, -1.4501F, -0.7747F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(99, 67).mirror().addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3575F, -0.3099F, -1.0895F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(93, 103).mirror().addBox(-0.5F, -0.8599F, -0.1502F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.3286F, 0.4828F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(25, 104).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.0693F, 1.5987F, -3.0281F, 0.0F, 0.0F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(104, 7).mirror().addBox(-0.5F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.5965F, 1.4359F, 1.9024F, 0.0F, 0.0F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(104, 4).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.0906F, 1.5695F, -0.192F, 0.0F, 0.0F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(101, 103).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.7668F, 1.3883F, -1.309F, 0.0F, 0.0F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(103, 88).mirror().addBox(-0.5F, -1.866F, -2.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.0681F, 0.374F, -1.117F, 0.0F, 0.0F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(88, 103).mirror().addBox(-0.5F, -1.5599F, -0.2002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.0681F, 0.374F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(83, 103).mirror().addBox(-0.5F, -0.8617F, -0.1505F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.0681F, 0.374F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.7163F, 0.6073F, -1.8675F, 0.0F, 0.0F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(78, 103).mirror().addBox(-0.5F, 0.0773F, 0.1457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.4681F, 1.149F, -1.2305F, 0.0F, 0.0F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(97, 31).mirror().addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.2401F, 2.4077F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-0.5F, -1.0F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.4479F, 2.1111F, 0.4712F, 0.0F, 0.0F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(79, 82).mirror().addBox(-0.5F, -0.975F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(77, 22).mirror().addBox(-0.5F, -0.575F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.42F, 2.7195F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(98, 51).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8275F, 7.5812F, -7.8271F, 0.1996F, 0.1421F, -0.46F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(53, 107).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1308F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(46, 92).addBox(-0.5F, -1.65F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(11, 64).addBox(-0.5F, -2.6276F, -0.19F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9177F, 0.8465F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(107, 42).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.2416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r5 = Rightupperarm.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(107, 39).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3353F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r6 = Rightupperarm.addOrReplaceChild("Rightupperarm_r6", CubeListBuilder.create().texOffs(99, 6).addBox(-0.5F, -0.6F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.6647F, 0.0088F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.602F, 5.3535F, 3.609F, -0.9631F, -0.5176F, -0.2606F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(52, 80).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 83).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(22, 68).addBox(-0.9F, 0.1F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9519F, 5.7281F, -0.1712F, 0.0324F, 0.0393F, 0.2329F));

		PartDefinition Righthand_r1 = Righthand.addOrReplaceChild("Righthand_r1", CubeListBuilder.create().texOffs(79, 27).addBox(-1.5F, -1.9F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(30, 100).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.8075F, 7.5812F, -7.8271F, 0.2209F, -0.1056F, 0.288F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(83, 109).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1308F, 3.7654F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, -1.65F, -0.475F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.3472F, 2.5472F, 0.6283F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(92, 95).addBox(-0.5F, -2.6276F, -0.19F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9177F, 0.8465F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(78, 109).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -1.2416F, -0.0686F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r5 = Leftupperarm.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(109, 66).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3353F, -0.4912F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r6 = Leftupperarm.addOrReplaceChild("Leftupperarm_r6", CubeListBuilder.create().texOffs(35, 100).addBox(-0.5F, -0.6F, 0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.6647F, 0.0088F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.602F, 5.3535F, 3.609F, -0.897F, 0.6784F, 0.4418F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(65, 82).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(30, 83).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(37, 68).addBox(-0.1F, 0.1F, -1.1F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9519F, 5.7281F, -0.1712F, 0.076F, -0.0393F, -0.2329F));

		PartDefinition Lefthand_r1 = Lefthand.addOrReplaceChild("Lefthand_r1", CubeListBuilder.create().texOffs(58, 79).addBox(-0.5F, -1.9F, -1.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1712F, 4.8569F, -8.8163F, -0.0147F, 0.0183F, -0.0692F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(109, 106).addBox(-0.5F, -0.55F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -5.6763F, 6.1949F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(109, 103).addBox(-0.5F, -1.1F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -5.3593F, 6.7068F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(109, 100).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -5.3593F, 6.7068F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(25, 78).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -4.1714F, 3.7761F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(82, 55).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1288F, -2.1446F, 1.5643F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(34, 78).addBox(-1.0774F, 1.1587F, -1.2039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F))
				.texOffs(89, 17).addBox(-1.0774F, 0.1587F, -0.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.7496F, 0.4746F, 0.2902F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(110, 19).addBox(-1.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(89, 13).addBox(-1.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, -0.1388F, 0.4746F, 0.2902F));

		PartDefinition cube_r103 = bone.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(109, 109).addBox(-1.0383F, -0.7431F, -0.6179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1115F, -0.3676F, 0.9495F, 0.5448F, 0.5273F, 0.3609F));

		PartDefinition cube_r104 = bone.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(88, 81).addBox(-1.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.6385F, -1.9676F, 1.8495F, 1.0499F, 0.2865F, 0.2773F));

		PartDefinition bone3 = Bodyfront.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1512F, 4.8569F, -8.8163F, -0.0147F, -0.0183F, 0.0692F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(109, 106).mirror().addBox(-0.5F, -0.55F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.6763F, 6.1949F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(109, 103).mirror().addBox(-0.5F, -1.1F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.3593F, 6.7068F, 1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.3593F, 6.7068F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -4.1714F, 3.7761F, 0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -2.1446F, 1.5643F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(0.0774F, 1.1587F, -1.2039F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(89, 17).mirror().addBox(0.0774F, 0.1587F, -0.6039F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.7496F, -0.4746F, -0.2902F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(110, 19).mirror().addBox(0.0774F, -0.3578F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(89, 13).mirror().addBox(0.0774F, -0.3578F, -1.8141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, -0.1388F, -0.4746F, -0.2902F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(109, 109).mirror().addBox(0.0383F, -0.7431F, -0.6179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1115F, -0.3676F, 0.9495F, 0.5448F, -0.5273F, -0.3609F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(88, 81).mirror().addBox(0.0097F, -0.3348F, -2.0244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -1.9676F, 1.8495F, 1.0499F, -0.2865F, -0.2773F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(42, 11).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, 0.253F, 0.1281F, 0.0214F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(32, 54).addBox(0.0F, -0.3697F, -0.3796F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3698F, 7.5594F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(50, 61).addBox(0.0F, 0.2899F, -0.3899F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0091F, 4.9607F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(47, 108).addBox(0.0F, 0.2918F, -0.5156F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.9861F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.35F, 0.0F, -6.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, 0.0436F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(44, 0).addBox(0.35F, 0.0F, -6.5F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1302F, 6.4594F, 0.0F, -0.0436F, 0.0F));

		PartDefinition Bodyfront_r13 = Tailbase.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(98, 108).addBox(0.0F, -2.6706F, 0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4384F, 5.9544F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r14 = Tailbase.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(104, 110).addBox(0.0F, -2.6334F, 0.0055F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5581F, 3.9565F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = Tailbase.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(70, 102).addBox(0.0F, -2.5235F, 0.0045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r16 = Tailbase.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(98, 103).addBox(0.0F, -2.566F, 0.0045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.0888F, 0.1742F, 0.0078F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(42, 29).mirror().addBox(-1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2508F, 0.0938F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(42, 29).addBox(-0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2508F, 0.0938F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(19, 45).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r17 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(111, 9).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2783F, 4.0666F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r18 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(113, 45).addBox(0.0F, -2.1F, -0.55F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4178F, 8.5905F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(112, 93).addBox(0.0F, -2.15F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r20 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(107, 34).addBox(0.0F, -2.4456F, 0.0043F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0373F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailmiddlebase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(29, 68).addBox(0.0F, 0.0F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 6.4943F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailmiddlebase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(30, 107).addBox(0.0F, -0.1F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4276F, 4.6464F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailmiddlebase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(68, 63).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6698F, 2.6511F, 0.48F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r21 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(107, 29).addBox(0.0F, -2.8206F, 0.0087F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.1659F, 0.0435F, 0.0034F));

		PartDefinition Tailmiddlebase_r4 = tail.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(17, 62).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2449F, 1.07F, 0.0526F, 0.1046F, 0.0055F));

		PartDefinition Tailmiddlebase_r5 = tail.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(17, 62).addBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2449F, 1.07F, 0.0526F, -0.1046F, -0.0055F));

		PartDefinition Tailmiddlebase_r6 = tail.addOrReplaceChild("Tailmiddlebase_r6", CubeListBuilder.create().texOffs(53, 52).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = tail.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(74, 93).addBox(0.0F, -1.675F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = tail.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(112, 76).addBox(0.0F, -1.5923F, -0.0216F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = tail.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(112, 72).addBox(0.0F, 0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0058F, 3.9197F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = tail.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(33, 107).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0337F, 1.7032F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(113, 112).addBox(0.0F, -1.8805F, 4.9585F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 52).addBox(0.0F, -1.8101F, 6.9505F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.1475F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(90, 112).addBox(0.0F, -1.2369F, -0.1278F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(87, 112).addBox(0.0F, -1.4268F, -0.0255F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5456F, 0.9856F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tailmiddleend.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(50, 111).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0743F, 7.1457F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r12 = Tailmiddleend.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(23, 112).addBox(0.0F, -0.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9636F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tailmiddleend.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(81, 112).addBox(0.0F, 0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1605F, 0.4067F, 0.576F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tailmiddleend.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(78, 112).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2448F, 2.8299F, 0.5411F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5519F, 8.8376F, 0.1777F, 0.0F, 0.0F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(26, 114).addBox(0.0F, -0.925F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 55).addBox(0.0F, -0.975F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 114).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 12).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r15 = Tailend.addOrReplaceChild("Tailbase_r15", CubeListBuilder.create().texOffs(101, 111).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4047F, 7.0363F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r16 = Tailend.addOrReplaceChild("Tailbase_r16", CubeListBuilder.create().texOffs(84, 112).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1841F, 4.8542F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Tailbase_r17 = Tailend.addOrReplaceChild("Tailbase_r17", CubeListBuilder.create().texOffs(110, 112).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0501F, 2.6222F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailbase_r18 = Tailend.addOrReplaceChild("Tailbase_r18", CubeListBuilder.create().texOffs(107, 112).addBox(0.0F, 0.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0838F, 0.3901F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(13, 114).addBox(0.0F, -0.675F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4696F, 1.9848F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tailend.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(114, 9).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3998F, -0.014F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, 0.0817F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tailend2.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(43, 114).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 114).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 114).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 23).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r19 = Tailend2.addOrReplaceChild("Tailbase_r19", CubeListBuilder.create().texOffs(68, 113).addBox(0.0F, 7.2F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 92).addBox(0.0F, 9.1F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 91).addBox(0.0F, 8.1F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailbase_r20 = Tailend2.addOrReplaceChild("Tailbase_r20", CubeListBuilder.create().texOffs(7, 71).addBox(0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.286F, 0.2973F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2923F, 8.909F, -0.0928F, 0.0F, 0.0F));

		PartDefinition Tailend_r5 = Tailend3.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r21 = Tailend3.addOrReplaceChild("Tailbase_r21", CubeListBuilder.create().texOffs(114, 49).addBox(0.0F, 12.0F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 113).addBox(0.0F, 11.0F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 88).addBox(0.0F, 10.1F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3279F, 8.9316F, -0.1616F, 0.0642F, 0.1222F));

		PartDefinition Tailend_r6 = Tailend4.addOrReplaceChild("Tailend_r6", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2974F, 8.9411F, -0.0842F, 0.0433F, -0.0056F));

		PartDefinition Tailend_r7 = Tailend5.addOrReplaceChild("Tailend_r7", CubeListBuilder.create().texOffs(21, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3094F, 8.8484F, -0.1279F, 0.0433F, -0.0056F));

		PartDefinition Tailend_r8 = Tailend6.addOrReplaceChild("Tailend_r8", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend7 = Tailend6.addOrReplaceChild("Tailend7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3167F, 8.8899F, -0.1715F, -0.043F, 0.0074F));

		PartDefinition Tailend_r9 = Tailend7.addOrReplaceChild("Tailend_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 0.5247F, -0.4708F, 0.1028F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Rightthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(72, 45).addBox(-1.3F, -1.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Rightthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(0, 93).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 5.8392F, 0.3663F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Rightthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -2.036F, 0.0112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.4725F, -0.2881F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Rightthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(30, 96).addBox(-0.5F, 0.039F, -0.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 6.3947F, -0.2738F, 0.192F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Rightthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(102, 96).addBox(-0.5F, -5.05F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Rightthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.05F, -0.975F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4977F, 1.0265F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Rightthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(15, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.4322F, -0.5506F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r8 = Rightthigh.addOrReplaceChild("Leftthigh_r8", CubeListBuilder.create().texOffs(7, 83).addBox(-1.0F, -0.6F, -2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 10.5191F, 2.5548F, 1.117F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r9 = Rightthigh.addOrReplaceChild("Leftthigh_r9", CubeListBuilder.create().texOffs(56, 95).addBox(-1.0F, -0.325F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 11.3678F, 1.4918F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r10 = Rightthigh.addOrReplaceChild("Leftthigh_r10", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5F, -1.5F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 9.6488F, 1.0102F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r11 = Rightthigh.addOrReplaceChild("Leftthigh_r11", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.5F, -0.525F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.6493F, 0.9528F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(69, 93).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 12.1545F, 2.566F, 1.4699F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Rightshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(93, 85).addBox(-0.5F, -1.5F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 1.2632F, -0.4096F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Rightshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(107, 0).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.7F, 0.7422F, 0.6761F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Rightshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(102, 31).addBox(-0.5F, -1.0F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(20, 102).addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.7F, 0.7422F, 0.6761F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Rightshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(102, 35).addBox(-0.5F, -0.3F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 1.4971F, 0.0435F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Rightshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(98, 88).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.7F, 13.6689F, -0.6482F, -0.384F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = Rightshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(44, 68).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.7F, 4.1405F, 0.5218F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = Rightshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(52, 88).addBox(3.2F, -0.3F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, 0.6288F, -0.117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = Rightshin.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(97, 35).addBox(-0.5F, -0.6F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Leftshin_r9 = Rightshin.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(68, 98).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r10 = Rightshin.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(61, 22).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.8984F, -0.0612F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r11 = Rightshin.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(20, 93).addBox(-0.5F, -1.05F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftshin_r12 = Rightshin.addOrReplaceChild("Leftshin_r12", CubeListBuilder.create().texOffs(42, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, 0.183F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 16.1915F, -1.8499F, -1.3774F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(66, 29).addBox(-1.9F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 1.4294F, 0.0189F, 0.0393F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(55, 45).addBox(-1.9F, -0.8F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.2377F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, 0.5247F, -0.4708F, -0.3321F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Leftthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(71, 72).addBox(-0.7F, -1.3F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.9599F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Leftthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 5.8392F, 0.3663F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Leftthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(63, 96).addBox(-0.5F, -2.036F, 0.0112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 6.4725F, -0.2881F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Leftthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(40, 96).addBox(-0.5F, 0.039F, -0.0138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 6.3947F, -0.2738F, 0.192F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Leftthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(103, 18).addBox(-0.5F, -5.05F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Leftthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(10, 87).addBox(-0.5F, -0.05F, -0.975F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4977F, 1.0265F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Leftthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(20, 87).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 1.4322F, -0.5506F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r8 = Leftthigh.addOrReplaceChild("Rightthigh_r8", CubeListBuilder.create().texOffs(16, 83).addBox(-1.0F, -0.6F, -2.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 10.5191F, 2.5548F, 1.117F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r9 = Leftthigh.addOrReplaceChild("Rightthigh_r9", CubeListBuilder.create().texOffs(95, 79).addBox(-1.0F, -0.325F, -0.575F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 11.3678F, 1.4918F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r10 = Leftthigh.addOrReplaceChild("Rightthigh_r10", CubeListBuilder.create().texOffs(15, 93).addBox(-0.5F, -1.5F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 9.6488F, 1.0102F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r11 = Leftthigh.addOrReplaceChild("Rightthigh_r11", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, -1.5F, -0.525F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 8.6493F, 0.9528F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(93, 90).addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 12.1545F, 2.566F, 1.2081F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Leftshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5F, -1.5F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.7F, 1.2632F, -0.4096F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Leftshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(88, 109).addBox(-0.5F, -1.2F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.7F, 0.7422F, 0.6761F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Leftshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(65, 102).addBox(-0.5F, -1.0F, -1.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(102, 39).addBox(-0.5F, -1.0F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.7F, 0.7422F, 0.6761F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Leftshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(102, 43).addBox(-0.5F, -0.3F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 1.4971F, 0.0435F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Leftshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(55, 100).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7F, 13.6689F, -0.6482F, -0.384F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = Leftshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(68, 51).addBox(-0.5F, -0.2F, -0.8F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.7F, 4.1405F, 0.5218F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = Leftshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(64, 90).addBox(-4.2F, -0.3F, -0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, 0.6288F, -0.117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = Leftshin.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(97, 39).addBox(-0.5F, -0.6F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 1.3526F, 0.0F, 0.0F));

		PartDefinition Rightshin_r9 = Leftshin.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(40, 100).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r10 = Leftshin.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(32, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.8984F, -0.0612F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r11 = Leftshin.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(93, 21).addBox(-0.5F, -1.05F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightshin_r12 = Leftshin.addOrReplaceChild("Rightshin_r12", CubeListBuilder.create().texOffs(47, 85).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 3.3288F, 0.183F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(71, 63).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 16.1915F, -1.8499F, -0.9411F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(66, 33).addBox(-2.1F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 0.5128F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(61, 10).addBox(-2.1F, -0.8F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.0195F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9404F, -1.524F, -0.7751F, -0.0524F, 0.0F, 0.1745F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(51, 94).addBox(-0.9997F, 1.8549F, -1.0595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.3963F, -0.0349F, -0.4363F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(109, 97).addBox(-0.5F, -0.475F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4255F, 0.2068F, -4.0798F, -1.2217F, -0.0349F, -0.4363F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(93, 109).addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7554F, -0.5075F, -4.1605F, -0.6545F, -0.0349F, -0.4363F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(84, 48).addBox(-0.9997F, -2.2518F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(60, 100).addBox(-0.9997F, -2.2518F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1745F, -0.0349F, -0.4363F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(50, 103).addBox(-0.9997F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(15, 102).addBox(-0.9997F, -2.9277F, 0.7526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.0123F, -0.0349F, -0.4363F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -3.3F, 0.675F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5887F, 3.2056F, -0.0029F, 0.1134F, -0.0349F, 0.0F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(101, 14).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.0264F, -0.0302F, -0.0175F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 89).addBox(-0.3227F, 0.8952F, -8.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 1.2796F, -0.0454F, -0.1788F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(25, 95).addBox(-0.3227F, -2.8469F, -7.7529F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 1.8469F, -0.0454F, -0.1788F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 102).addBox(-0.3227F, -1.3766F, -7.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 2.0214F, -0.0454F, -0.1788F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(102, 0).addBox(-0.3227F, -0.3315F, -7.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 1.8818F, -0.0454F, -0.1788F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(87, 94).addBox(-0.3227F, -1.2085F, -7.3074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 1.62F, -0.0454F, -0.1788F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(110, 30).addBox(-0.3227F, 2.269F, -6.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 1.2273F, -0.0454F, -0.1788F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 102).addBox(-0.3227F, 4.347F, -3.447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 0.4855F, -0.0454F, -0.1788F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(73, 101).addBox(-0.1002F, 5.3305F, -1.2655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, 0.0543F, 0.0172F, -0.1483F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(82, 94).addBox(-0.1002F, 2.5986F, -0.8838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, -0.0156F, 0.0172F, -0.1483F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(94, 65).addBox(-0.1002F, -0.0899F, -0.1096F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.8135F, 6.9875F, -3.3229F, -0.2948F, 0.0172F, -0.1483F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(94, 60).addBox(-0.5F, -0.5F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.4099F, -0.0302F, -0.0175F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(45, 101).addBox(-0.5F, -0.2F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.5844F, -0.0302F, -0.0175F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 10).addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4949F, 5.0564F, -1.7981F, -0.9335F, -0.0302F, -0.0175F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(110, 27).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5128F, 3.0704F, -2.3505F, 0.8991F, -0.0302F, -0.0175F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(110, 36).addBox(-0.5F, 0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6345F, 3.8842F, 2.1416F, 0.1573F, -0.0302F, -0.0175F));

		PartDefinition cube_r136 = bone2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(58, 110).addBox(-0.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.6499F, 4.4983F, 3.0063F, 1.2918F, -0.0302F, -0.0175F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(68, 110).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6578F, 5.0491F, 3.5865F, 1.0911F, -0.0302F, -0.0175F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(85, 34).addBox(-0.1F, -0.2F, -0.875F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.095F, 5.5211F, 5.0792F, 0.9686F, 0.0417F, -0.0669F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(10, 102).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.6578F, 5.0491F, 3.5865F, 0.9689F, -0.0302F, -0.0175F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 110).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6499F, 4.4983F, 3.0063F, 0.8118F, -0.0302F, -0.0175F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(110, 33).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6345F, 3.8842F, 2.1416F, 0.6373F, -0.0302F, -0.0175F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(66, 22).addBox(-0.5F, -0.7F, 0.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.514F, 3.365F, -2.1428F, 0.1137F, -0.0302F, -0.0175F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 55).addBox(-0.5F, -2.85F, -1.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5639F, 2.8966F, -0.7132F, 0.0262F, -0.0349F, 0.0F));

		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(79, 86).addBox(-0.9997F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0698F, -0.0349F, -0.4363F));

		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.968F, -0.2215F, 4.8161F, 1.7453F, -0.0349F, -0.4363F));

		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(77, 91).addBox(-0.5F, -3.375F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0706F, -0.3711F, 5.6706F, 1.6581F, -0.0349F, -0.4363F));

		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(91, 70).addBox(-0.9997F, -1.1162F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1309F, -0.0349F, -0.4363F));

		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.5213F, -1.5344F, 3.2873F, -0.1396F, -0.0349F, -0.4363F));

		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(78, 67).addBox(-0.9997F, -2.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0F, -0.0349F, -0.4363F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9404F, -1.524F, -0.7751F, -0.0524F, 0.0F, -0.1745F));

		PartDefinition cube_r150 = bone4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(51, 94).mirror().addBox(-0.0003F, 1.8549F, -1.0595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.3963F, 0.0349F, 0.4363F));

		PartDefinition cube_r151 = bone4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(109, 97).mirror().addBox(-0.5F, -0.475F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4255F, 0.2068F, -4.0798F, -1.2217F, 0.0349F, 0.4363F));

		PartDefinition cube_r152 = bone4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(93, 109).mirror().addBox(-0.5F, -0.45F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.7554F, -0.5075F, -4.1605F, -0.6545F, 0.0349F, 0.4363F));

		PartDefinition cube_r153 = bone4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(84, 48).mirror().addBox(-0.0003F, -2.2518F, -3.6967F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(60, 100).mirror().addBox(-0.0003F, -2.2518F, -4.2967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1745F, 0.0349F, 0.4363F));

		PartDefinition cube_r154 = bone4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-0.0003F, 1.4723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(15, 102).mirror().addBox(-0.0003F, -2.9277F, 0.7526F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.0123F, 0.0349F, 0.4363F));

		PartDefinition cube_r155 = bone4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -3.3F, 0.675F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 3.2056F, -0.0029F, 0.1134F, 0.0349F, 0.0F));

		PartDefinition cube_r156 = bone4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(101, 14).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.0264F, 0.0302F, 0.0175F));

		PartDefinition cube_r157 = bone4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.6773F, 0.8952F, -8.0303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 1.2796F, 0.0454F, 0.1788F));

		PartDefinition cube_r158 = bone4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-0.6773F, -2.8469F, -7.7529F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 1.8469F, 0.0454F, 0.1788F));

		PartDefinition cube_r159 = bone4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(5, 102).mirror().addBox(-0.6773F, -1.3766F, -7.6459F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 2.0214F, 0.0454F, 0.1788F));

		PartDefinition cube_r160 = bone4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(102, 0).mirror().addBox(-0.6773F, -0.3315F, -7.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 1.8818F, 0.0454F, 0.1788F));

		PartDefinition cube_r161 = bone4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(87, 94).mirror().addBox(-0.6773F, -1.2085F, -7.3074F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 1.62F, 0.0454F, 0.1788F));

		PartDefinition cube_r162 = bone4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(110, 30).mirror().addBox(-0.6773F, 2.269F, -6.5253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 1.2273F, 0.0454F, 0.1788F));

		PartDefinition cube_r163 = bone4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.6773F, 4.347F, -3.447F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 0.4855F, 0.0454F, 0.1788F));

		PartDefinition cube_r164 = bone4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(73, 101).mirror().addBox(-0.8997F, 5.3305F, -1.2655F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, 0.0543F, -0.0172F, 0.1483F));

		PartDefinition cube_r165 = bone4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(82, 94).mirror().addBox(-0.8997F, 2.5986F, -0.8838F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, -0.0156F, -0.0172F, 0.1483F));

		PartDefinition cube_r166 = bone4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(94, 65).mirror().addBox(-0.8997F, -0.0899F, -0.1096F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.8135F, 6.9875F, -3.3229F, -0.2948F, -0.0172F, 0.1483F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.5F, -0.5F, -0.775F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.4099F, 0.0302F, 0.0175F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(45, 101).mirror().addBox(-0.5F, -0.2F, -0.475F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.5844F, 0.0302F, 0.0175F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(101, 10).mirror().addBox(-0.5F, -2.0F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4949F, 5.0564F, -1.7981F, -0.9335F, 0.0302F, 0.0175F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(110, 27).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5128F, 3.0704F, -2.3505F, 0.8991F, 0.0302F, 0.0175F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(110, 36).mirror().addBox(-0.5F, 0.15F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6345F, 3.8842F, 2.1416F, 0.1573F, 0.0302F, 0.0175F));

		PartDefinition cube_r172 = bone4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(58, 110).mirror().addBox(-0.5F, -0.575F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.6499F, 4.4983F, 3.0063F, 1.2918F, 0.0302F, 0.0175F));

		PartDefinition cube_r173 = bone4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(68, 110).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.6578F, 5.0491F, 3.5865F, 1.0911F, 0.0302F, 0.0175F));

		PartDefinition cube_r174 = bone4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(85, 34).mirror().addBox(-0.9F, -0.2F, -0.875F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.095F, 5.5211F, 5.0792F, 0.9686F, -0.0417F, 0.0669F));

		PartDefinition cube_r175 = bone4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(10, 102).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.6578F, 5.0491F, 3.5865F, 0.9689F, 0.0302F, 0.0175F));

		PartDefinition cube_r176 = bone4.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(53, 110).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6499F, 4.4983F, 3.0063F, 0.8118F, 0.0302F, 0.0175F));

		PartDefinition cube_r177 = bone4.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(110, 33).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6345F, 3.8842F, 2.1416F, 0.6373F, 0.0302F, 0.0175F));

		PartDefinition cube_r178 = bone4.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.5F, -0.7F, 0.7F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.514F, 3.365F, -2.1428F, 0.1137F, 0.0302F, 0.0175F));

		PartDefinition cube_r179 = bone4.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-0.5F, -2.85F, -1.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 2.8966F, -0.7132F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition cube_r180 = bone4.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(-0.0003F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0698F, 0.0349F, 0.4363F));

		PartDefinition cube_r181 = bone4.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.968F, -0.2215F, 4.8161F, 1.7453F, 0.0349F, 0.4363F));

		PartDefinition cube_r182 = bone4.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(77, 91).mirror().addBox(-0.5F, -3.375F, -0.275F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0706F, -0.3711F, 5.6706F, 1.6581F, 0.0349F, 0.4363F));

		PartDefinition cube_r183 = bone4.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(91, 70).mirror().addBox(-0.0003F, -1.1162F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1309F, 0.0349F, 0.4363F));

		PartDefinition cube_r184 = bone4.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.5213F, -1.5344F, 3.2873F, -0.1396F, 0.0349F, 0.4363F));

		PartDefinition cube_r185 = bone4.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 67).mirror().addBox(-0.0003F, -2.0682F, -0.0642F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0F, 0.0349F, 0.4363F));

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