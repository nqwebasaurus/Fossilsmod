package fossils.fossils.client.blockentity.model.zupaysaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ZupaysaurusFossilModel extends SkullModelBase {
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
	private final ModelPart bone4;
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
	private final ModelPart bone3;

	public ZupaysaurusFossilModel(ModelPart root) {
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
		this.bone4 = this.Bodyfront.getChild("bone4");
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
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -20.6F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.501F, 0.2682F, -0.0986F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(111, 45).addBox(0.0F, -1.69F, -0.051F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8298F, 1.0353F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(70, 110).addBox(0.0F, -4.5F, -1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 110).addBox(0.0F, -4.4F, -3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 59).mirror().addBox(-1.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 59).addBox(0.5F, -2.6F, -3.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(42, 19).addBox(-0.5F, -2.8F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.9702F, 0.4353F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.3678F, -3.6167F, -0.0111F, 0.0873F, -0.001F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 78).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.075F, 0.1081F, -0.7638F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(111, 70).mirror().addBox(-1.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -0.8079F, 0.012F, 0.1541F, -1.237F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -2.8079F, 0.2247F, 0.1598F, -0.6216F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 63).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0568F, -2.8079F, 0.1231F, 0.2676F, -1.0915F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 78).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.075F, -0.1081F, 0.7638F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(111, 70).addBox(0.8817F, -0.4515F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -0.8079F, 0.012F, -0.1541F, 1.237F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(110, 0).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -2.8079F, 0.2247F, -0.1598F, 0.6216F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 63).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0568F, -2.8079F, 0.1231F, -0.2676F, 1.0915F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(43, 72).addBox(-0.49F, -2.5F, 2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1892F, -5.8242F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodymiddle.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(89, 111).addBox(0.01F, -1.8092F, -0.1729F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2961F, -1.2479F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodymiddle.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(77, 109).addBox(0.01F, -1.6814F, -0.0939F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3386F, -3.357F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0392F, -3.4242F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(86, 111).addBox(0.01F, -1.9912F, -0.0205F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(110, 66).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.35F, 0.1799F, -0.441F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(96, 65).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.2294F, 0.3409F, -0.9002F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(61, 33).mirror().addBox(-5.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -5.4838F, 0.0125F, 0.4082F, -1.4783F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.2142F, 0.3536F, -0.9589F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(109, 72).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, 0.3427F, 0.1977F, -0.4959F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(109, 60).mirror().addBox(-3.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3838F, -0.0081F, 0.411F, -1.54F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(109, 100).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.3341F, 0.1722F, -0.4612F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.2182F, 0.327F, -0.9213F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 42).mirror().addBox(-4.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0111F, 0.3908F, -1.4963F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(94, 70).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.2142F, -0.3536F, 0.9589F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(109, 72).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, 0.3427F, -0.1977F, 0.4959F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(109, 60).addBox(2.2375F, -1.8712F, -0.5598F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3838F, -0.0081F, -0.411F, 1.54F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 33).addBox(2.2375F, -1.8712F, -0.5598F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.0125F, -0.4082F, 1.4783F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(0, 44).addBox(-2.49F, 1.4489F, -2.0172F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.4283F, -4.7485F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 65).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.2294F, -0.3409F, 0.9002F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(110, 66).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -5.4838F, 0.35F, -0.1799F, 0.441F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(109, 100).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.3341F, -0.1722F, 0.4612F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(96, 53).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.2182F, -0.327F, 0.9213F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(96, 42).addBox(2.2375F, -1.8712F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0111F, -0.3908F, 1.4963F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(0, 51).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(109, 52).addBox(0.01F, -1.7513F, -0.0922F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(61, 109).addBox(0.01F, -1.8711F, -0.023F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2641F, -5.9944F, 0.0175F, -0.0436F, -0.0008F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(107, 111).addBox(0.01F, -2.35F, 0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 112).addBox(0.01F, -2.45F, 2.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -6.3F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 112).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.5281F, 0.2617F, -0.332F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(61, 17).mirror().addBox(-8.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.0298F, 0.5996F, -1.4001F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 67).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.204F, -5.3838F, 0.3612F, 0.4904F, -0.7769F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(91, 68).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.2142F, 0.3536F, -0.8542F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 31).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, 0.3427F, 0.1977F, -0.3911F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 31).mirror().addBox(-6.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.004F, -1.3837F, -0.0081F, 0.411F, -1.4353F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(112, 14).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.4625F, 0.2328F, -0.383F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-2.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.3112F, 0.4368F, -0.8342F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 39).mirror().addBox(-7.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.104F, -3.3838F, 0.0231F, 0.53F, -1.4386F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(91, 68).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.2142F, -0.3536F, 0.8542F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 31).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, 0.3427F, -0.1977F, 0.3911F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 31).addBox(2.2375F, -1.8712F, -0.5599F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.004F, -1.3837F, -0.0081F, -0.411F, 1.4353F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(98, 67).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.3612F, -0.4904F, 0.7769F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(61, 17).addBox(2.2375F, -1.8712F, -0.5598F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.0298F, -0.5996F, 1.4001F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 112).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.204F, -5.3838F, 0.5281F, -0.2617F, 0.332F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(112, 14).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.4625F, -0.2328F, 0.383F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(98, 94).addBox(0.8817F, -0.4515F, -0.5598F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.3112F, -0.4368F, 0.8342F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 39).addBox(2.2375F, -1.8712F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.104F, -3.3838F, 0.0231F, -0.53F, 1.4386F));

		PartDefinition Bodymiddle_r4 = body2.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(42, 28).addBox(-2.49F, -2.0305F, -3.9978F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.35F, -1.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body2.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(34, 52).addBox(-0.49F, -2.5F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.15F, -2.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(92, 108).addBox(0.01F, -2.0513F, -0.0922F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.328F, -1.9347F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body2.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1501F, -5.955F, 0.0806F, -0.0435F, -0.0035F));

		PartDefinition Bodyfront_r8 = Bodyfront.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(0, 110).addBox(0.01F, -1.8318F, -0.0391F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2872F, -1.9452F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = Bodyfront.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(52, 72).addBox(0.01F, -1.8518F, -0.0314F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0872F, -3.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = Bodyfront.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(73, 110).addBox(0.01F, -1.6172F, -0.0264F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -7.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = Bodyfront.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(83, 109).addBox(0.01F, -2.45F, -5.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-0.49F, -0.75F, -8.8F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.4128F, -0.1452F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 97).mirror().addBox(-0.0041F, -2.0948F, -0.0036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.205F, 7.1818F, -8.8663F, 0.8359F, 0.0106F, 0.0361F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(110, 74).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.554F, -7.4838F, 0.7924F, 0.2135F, -0.54F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(94, 96).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.554F, -7.4838F, 0.6553F, 0.5475F, -0.9008F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-8.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.554F, -7.4838F, 0.2569F, 0.7955F, -1.5237F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(109, 98).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.7145F, 0.2284F, -0.4926F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.5664F, 0.5335F, -0.882F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(59, 21).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.354F, -5.4838F, 0.1825F, 0.7394F, -1.5109F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.5968F, 0.2695F, -0.3846F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.4262F, 0.5257F, -0.8159F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(15, 56).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.329F, -3.5087F, 0.0609F, 0.6615F, -1.4523F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(109, 96).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.5272F, 0.2511F, -0.3326F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-9.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.0406F, 0.5937F, -1.3944F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(95, 16).mirror().addBox(-2.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.154F, -1.4838F, 0.3655F, 0.4805F, -0.7753F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(88, 90).mirror().addBox(-0.0041F, -3.1948F, -1.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2218F, 7.7044F, -5.6512F, 1.0975F, 0.0009F, 0.0376F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(-7.2314F, 0.1271F, -0.3411F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0474F, 7.6875F, -6.534F, 0.2339F, 1.3522F, 0.2374F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-4.8195F, -0.0999F, -0.3763F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1694F, 7.8176F, -6.1354F, 0.6068F, 1.1846F, 0.6861F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(61, 15).addBox(2.2375F, -1.8712F, -0.5599F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.554F, -7.4838F, 0.2569F, -0.7955F, 1.5237F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 96).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.554F, -7.4838F, 0.6553F, -0.5475F, 0.9008F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(110, 74).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.554F, -7.4838F, 0.7924F, -0.2135F, 0.54F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(109, 98).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.7145F, -0.2284F, 0.4926F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(95, 84).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.5664F, -0.5335F, 0.882F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(59, 21).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.354F, -5.4838F, 0.1825F, -0.7394F, 1.5109F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(70, 41).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.5968F, -0.2695F, 0.3846F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(89, 53).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.4262F, -0.5257F, 0.8159F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(15, 56).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.329F, -3.5087F, 0.0609F, -0.6615F, 1.4523F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(109, 96).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.5272F, -0.2511F, 0.3326F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(59, 19).addBox(2.2375F, -1.8712F, -0.5599F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.0406F, -0.5937F, 1.3944F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(95, 16).addBox(0.8817F, -0.4515F, -0.5599F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.154F, -1.4838F, 0.3655F, -0.4805F, 0.7753F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(25, 97).addBox(-0.9959F, -2.0948F, -0.0036F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.225F, 7.1818F, -8.8663F, 0.8359F, -0.0106F, -0.0361F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(88, 90).addBox(-0.9959F, -3.1948F, -1.0036F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2418F, 7.7044F, -5.6512F, 1.0975F, -0.0009F, -0.0376F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(15, 58).addBox(0.2314F, 0.1271F, -0.3411F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0674F, 7.6875F, -6.534F, 0.2339F, -1.3522F, -0.2374F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(63, 6).addBox(-0.1805F, -0.0999F, -0.3763F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1894F, 7.8176F, -6.1354F, 0.6068F, -1.1846F, -0.6861F));

		PartDefinition Bodyfront_r12 = Bodyfront.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(42, 0).addBox(-1.99F, -2.0406F, -6.028F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.6926F, -0.3739F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neckbase = Bodyfront.addOrReplaceChild("Neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5816F, -8.8779F, -0.0694F, -0.0871F, 0.006F));

		PartDefinition Neckbase_r1 = Neckbase.addOrReplaceChild("Neckbase_r1", CubeListBuilder.create().texOffs(80, 109).addBox(0.01F, -1.2F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7347F, -0.2432F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neckbase_r2 = Neckbase.addOrReplaceChild("Neckbase_r2", CubeListBuilder.create().texOffs(20, 112).addBox(0.01F, -2.1987F, 0.4368F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 60).addBox(-0.49F, -1.0987F, -0.5632F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0343F, -3.3609F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Neckbase.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-5.8817F, -0.4515F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0276F, -0.4059F, 0.1879F, 0.794F, -1.308F));

		PartDefinition cube_r78 = Neckbase.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(110, 76).mirror().addBox(-0.9917F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.0276F, -0.4059F, 0.5542F, 0.594F, -0.7469F));

		PartDefinition Neckend_r1 = Neckbase.addOrReplaceChild("Neckend_r1", CubeListBuilder.create().texOffs(72, 8).mirror().addBox(-0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, -0.1791F, -2.7463F, -0.5869F, -0.1793F, 0.0076F));

		PartDefinition cube_r79 = Neckbase.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(110, 76).addBox(-0.0083F, -0.0024F, -0.5363F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0276F, -0.4059F, 0.5542F, -0.594F, 0.7469F));

		PartDefinition cube_r80 = Neckbase.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 49).addBox(0.8817F, -0.4515F, -0.5598F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.0276F, -0.4059F, 0.1879F, -0.794F, 1.308F));

		PartDefinition Neckend_r2 = Neckbase.addOrReplaceChild("Neckend_r2", CubeListBuilder.create().texOffs(72, 8).addBox(0.0026F, -0.4313F, -0.0253F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, -0.1791F, -2.7463F, -0.5869F, 0.1793F, -0.0076F));

		PartDefinition neck = Neckbase.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6581F, -3.774F, -0.4454F, -0.0394F, 0.0188F));

		PartDefinition Neckmiddle_r1 = neck.addOrReplaceChild("Neckmiddle_r1", CubeListBuilder.create().texOffs(12, 112).addBox(0.01F, -1.882F, -1.2524F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, 0.1134F, 0.0F, 0.0F));

		PartDefinition Neckmiddle_r2 = neck.addOrReplaceChild("Neckmiddle_r2", CubeListBuilder.create().texOffs(96, 49).addBox(0.01F, -1.682F, -4.2524F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.001F))
				.texOffs(13, 60).addBox(-0.49F, -0.682F, -4.2524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1828F, 0.3121F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Neckend_r3 = neck.addOrReplaceChild("Neckend_r3", CubeListBuilder.create().texOffs(46, 66).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.3149F, -0.8967F, -0.1912F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r4 = neck.addOrReplaceChild("Neckend_r4", CubeListBuilder.create().texOffs(25, 66).mirror().addBox(-0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.2964F, -2.8816F, -0.1918F, -0.1739F, -0.0076F));

		PartDefinition Neckend_r5 = neck.addOrReplaceChild("Neckend_r5", CubeListBuilder.create().texOffs(46, 66).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.3149F, -0.8967F, -0.1912F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r6 = neck.addOrReplaceChild("Neckend_r6", CubeListBuilder.create().texOffs(25, 66).addBox(0.0056F, -0.5394F, -0.0594F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.2964F, -2.8816F, -0.1918F, 0.1739F, 0.0076F));

		PartDefinition Neckmiddle = neck.addOrReplaceChild("Neckmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0499F, -3.9271F, -0.1831F, 0.0429F, -0.0079F));

		PartDefinition Neckmiddle_r3 = Neckmiddle.addOrReplaceChild("Neckmiddle_r3", CubeListBuilder.create().texOffs(90, 76).addBox(0.01F, -1.7828F, -2.4025F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 65).addBox(-0.49F, -0.6829F, -3.4025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.2422F, -0.4849F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neckend_r7 = Neckmiddle.addOrReplaceChild("Neckend_r7", CubeListBuilder.create().texOffs(70, 33).mirror().addBox(-0.0839F, -0.4048F, 0.0648F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 0.6443F, -2.1072F, 0.0007F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r8 = Neckmiddle.addOrReplaceChild("Neckend_r8", CubeListBuilder.create().texOffs(70, 33).addBox(0.0839F, -0.4048F, 0.0648F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 0.6443F, -2.1072F, 0.0007F, 0.1304F, 0.0115F));

		PartDefinition neck2 = Neckmiddle.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6184F, -3.7389F, -0.262F, 0.0421F, -0.0113F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 81).addBox(0.0F, -1.025F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1862F, -2.0163F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(25, 72).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r9 = neck2.addOrReplaceChild("Neckend_r9", CubeListBuilder.create().texOffs(34, 70).mirror().addBox(-0.1048F, -0.7999F, 0.0403F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.2722F, -1.6872F, 0.3149F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r10 = neck2.addOrReplaceChild("Neckend_r10", CubeListBuilder.create().texOffs(34, 70).addBox(0.1048F, -0.7999F, 0.0403F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.2722F, -1.6872F, 0.3149F, 0.1304F, 0.0115F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1646F, -2.6112F, 0.0299F, 0.0412F, 0.0885F));

		PartDefinition cube_r83 = neck3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 91).addBox(0.01F, -1.1334F, -1.8169F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -2.1489F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(61, 9).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r11 = neck3.addOrReplaceChild("Neckend_r11", CubeListBuilder.create().texOffs(55, 70).mirror().addBox(-0.0952F, -0.4838F, -0.0579F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.4915F, -2.7361F, 0.2451F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r12 = neck3.addOrReplaceChild("Neckend_r12", CubeListBuilder.create().texOffs(55, 70).addBox(0.0952F, -0.4838F, -0.0579F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.4915F, -2.7361F, 0.2451F, 0.1304F, 0.0115F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7017F, -3.5525F, 0.1922F, 0.0428F, 0.0083F));

		PartDefinition cube_r85 = neck4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(22, 91).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.7402F, -3.5025F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r86 = neck4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(61, 27).addBox(-0.49F, -0.6F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.5193F, -0.9489F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Neckend_r13 = neck4.addOrReplaceChild("Neckend_r13", CubeListBuilder.create().texOffs(64, 70).mirror().addBox(-0.0715F, -0.2322F, 0.0689F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 1.2915F, -2.9361F, 0.28F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r14 = neck4.addOrReplaceChild("Neckend_r14", CubeListBuilder.create().texOffs(64, 70).addBox(0.0715F, -0.2322F, 0.0689F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.51F, 1.2915F, -2.9361F, 0.28F, 0.1304F, 0.0115F));

		PartDefinition Neckend = neck4.addOrReplaceChild("Neckend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.5943F, -3.5607F, 0.53F, 0.0F, 0.0F));

		PartDefinition Neckend_r15 = Neckend.addOrReplaceChild("Neckend_r15", CubeListBuilder.create().texOffs(38, 112).addBox(0.0F, -1.2987F, -2.1332F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(55, 96).addBox(0.0F, -1.2987F, -0.1332F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Neckend_r16 = Neckend.addOrReplaceChild("Neckend_r16", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(0.0016F, -0.4089F, 0.0481F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.4724F, -3.9839F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r17 = Neckend.addOrReplaceChild("Neckend_r17", CubeListBuilder.create().texOffs(71, 80).mirror().addBox(0.0F, -0.6097F, 0.0006F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8724F, -1.6839F, -0.0865F, -0.1304F, -0.0115F));

		PartDefinition Neckend_r18 = Neckend.addOrReplaceChild("Neckend_r18", CubeListBuilder.create().texOffs(0, 97).addBox(-0.0016F, -0.4089F, 0.0481F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.4724F, -3.9839F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r19 = Neckend.addOrReplaceChild("Neckend_r19", CubeListBuilder.create().texOffs(71, 80).addBox(0.0F, -0.6097F, 0.0006F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8724F, -1.6839F, -0.0865F, 0.1304F, 0.0115F));

		PartDefinition Neckend_r20 = Neckend.addOrReplaceChild("Neckend_r20", CubeListBuilder.create().texOffs(49, 52).addBox(-0.5F, -0.5987F, -2.1332F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.0345F, -2.542F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neckend.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(73, 71).addBox(-1.5F, -1.6636F, -3.6817F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4044F, -4.2904F, 0.2039F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(81, 10).addBox(-1.5F, 2.2089F, -1.053F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7936F, -0.4747F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(52, 76).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.9759F, -4.4641F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 77).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.1581F, -3.4809F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(75, 41).addBox(-1.5F, -3.0F, -0.7F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 2.1337F, -2.7813F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(63, 0).addBox(-1.5F, -1.9961F, -2.0246F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.4064F, -1.3747F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(74, 0).addBox(-1.5F, -1.1127F, 0.0068F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.5245F, -1.3137F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(70, 76).addBox(-1.5F, -0.3377F, -0.6932F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2064F, -0.2747F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(82, 67).addBox(-1.5F, -0.125F, -0.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.8487F, -0.7293F, 0.096F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(35, 106).addBox(-1.5F, -0.2F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 4.198F, -13.2954F, 1.4923F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(30, 106).addBox(-1.5F, -0.1F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 3.4701F, -12.9637F, 1.1432F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(20, 106).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6984F, -12.3276F, 0.8814F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(15, 106).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9913F, -11.6205F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(24, 87).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6402F, -10.1459F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(5, 87).addBox(-1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4344F, -8.4592F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(10, 106).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.865F, -7.5566F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(5, 106).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.174F, -6.6055F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(105, 105).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3562F, -5.6223F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(105, 102).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5051F, -4.4928F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(9, 75).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.6636F, -3.6817F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(78, 56).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3098F, -1.7462F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(77, 46).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.66F, -2.6828F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(20, 109).addBox(-0.5F, -0.05F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6505F, -1.7522F, -1.117F, 0.0F, 0.0F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(35, 109).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8434F, -0.7822F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(30, 109).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.8729F, -0.7722F, 0.4974F, 0.0F, 0.0F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(15, 109).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.2401F, -1.0877F, 0.3229F, 0.0F, 0.0F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(82, 64).addBox(-1.0F, -0.55F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.5F, -0.4251F, -1.3291F, -0.288F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create().texOffs(108, 90).addBox(0.6F, 0.703F, -4.1888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F))
				.texOffs(95, 80).addBox(0.6F, -0.5102F, -5.4362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(108, 90).mirror().addBox(-1.6F, 0.703F, -4.1888F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(95, 80).mirror().addBox(-1.6F, -0.5102F, -5.4362F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8519F, -0.1313F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r87 = Lowerjawbase.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(88, 4).mirror().addBox(-0.6319F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, 0.2037F, -0.1604F, 0.0161F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(108, 42).mirror().addBox(-0.625F, -3.4413F, 0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(108, 42).addBox(1.825F, -3.4413F, 0.6616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 2.0159F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(108, 39).mirror().addBox(-0.625F, -2.9124F, 1.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(108, 39).addBox(1.825F, -2.9124F, 1.379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 2.33F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r3 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r3", CubeListBuilder.create().texOffs(108, 30).mirror().addBox(-0.625F, -1.7764F, 2.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(108, 30).addBox(1.825F, -1.7764F, 2.2603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 2.8536F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r4 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r4", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-0.525F, 0.2921F, 2.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(105, 6).addBox(1.725F, 0.2921F, 2.7119F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -2.7402F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r5 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r5", CubeListBuilder.create().texOffs(5, 109).mirror().addBox(-0.525F, 3.3194F, -0.6542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(5, 109).addBox(1.725F, 3.3194F, -0.6542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -1.3439F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r6 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r6", CubeListBuilder.create().texOffs(108, 27).mirror().addBox(-0.625F, 0.1326F, 3.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(108, 27).addBox(1.825F, 0.1326F, 3.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -2.7751F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r7 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r7", CubeListBuilder.create().texOffs(100, 79).mirror().addBox(-0.625F, 2.677F, 2.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(100, 79).addBox(1.825F, 2.677F, 2.3333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -2.1206F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r8 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r8", CubeListBuilder.create().texOffs(105, 3).mirror().addBox(-0.525F, 3.2354F, -1.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(105, 3).addBox(1.725F, 3.2354F, -1.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -1.117F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r9 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r9", CubeListBuilder.create().texOffs(105, 0).mirror().addBox(-0.525F, -1.3284F, -3.7473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(105, 0).addBox(1.725F, -1.3284F, -3.7473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r10 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r10", CubeListBuilder.create().texOffs(15, 99).mirror().addBox(0.0471F, -1.158F, -4.4166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(55, 103).mirror().addBox(-0.1779F, -0.758F, -3.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 0.096F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r11 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r11", CubeListBuilder.create().texOffs(95, 34).mirror().addBox(-0.1779F, -0.6585F, -3.3046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, -0.0349F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r12 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r12", CubeListBuilder.create().texOffs(103, 51).mirror().addBox(-0.1779F, -0.505F, -2.2925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 0.0175F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r13 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r13", CubeListBuilder.create().texOffs(50, 103).mirror().addBox(-0.1779F, -0.6737F, -1.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 0.0698F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r14 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r14", CubeListBuilder.create().texOffs(45, 103).mirror().addBox(-0.125F, -0.6977F, -3.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(103, 40).mirror().addBox(-0.125F, -0.8345F, -1.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 0.1222F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r15 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r15", CubeListBuilder.create().texOffs(103, 43).mirror().addBox(-0.125F, -0.9195F, -2.5999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 0.2094F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r16 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r16", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.125F, -0.759F, -0.6642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(87, 59).mirror().addBox(-0.2F, 0.041F, -2.3142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(81, 95).mirror().addBox(-0.2F, -0.559F, -0.7642F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 0.0349F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r17 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r17", CubeListBuilder.create().texOffs(96, 38).mirror().addBox(-0.2F, -0.1785F, 0.5385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, -1.6362F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r18 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r18", CubeListBuilder.create().texOffs(99, 72).mirror().addBox(-0.2F, 1.4718F, 0.4163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, -1.5621F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r19 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r19", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(-0.2529F, -0.2337F, 0.0492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, -1.4748F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r20 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r20", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.2529F, 1.2863F, 0.1825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, -1.5621F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r21 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r21", CubeListBuilder.create().texOffs(100, 104).mirror().addBox(-0.2529F, 0.4477F, -3.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, -0.0785F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r22 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r22", CubeListBuilder.create().texOffs(104, 99).mirror().addBox(-0.2529F, -3.8476F, -2.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 1.1868F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r23 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r23", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.2529F, -4.4649F, -0.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(104, 96).mirror().addBox(-0.2529F, -3.9649F, -0.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 1.6232F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r24 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r24", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.2529F, -3.365F, -0.8808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 1.5708F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r25 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r25", CubeListBuilder.create().texOffs(86, 95).mirror().addBox(-0.2529F, -1.8183F, -0.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.449F, -8.5345F, 1.6581F, -0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r26 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r26", CubeListBuilder.create().texOffs(95, 104).mirror().addBox(-0.2F, -3.6163F, -0.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 1.7715F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r27 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r27", CubeListBuilder.create().texOffs(104, 72).mirror().addBox(-0.2F, -0.342F, 2.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, -2.8972F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r28 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r28", CubeListBuilder.create().texOffs(108, 93).mirror().addBox(-0.2F, 1.4255F, -0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, -1.2392F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r29 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r29", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.2F, -0.681F, -1.885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 0.2269F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r30 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r30", CubeListBuilder.create().texOffs(104, 57).mirror().addBox(-0.2F, -0.6428F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.049F, -5.2345F, 0.192F, -0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r31 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r31", CubeListBuilder.create().texOffs(95, 76).mirror().addBox(-0.5F, -5.9161F, -2.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(95, 76).addBox(1.7F, -5.9161F, -2.0167F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 1.4835F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r32 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r32", CubeListBuilder.create().texOffs(50, 109).mirror().addBox(-0.5F, 3.0158F, 0.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(50, 109).addBox(1.7F, 3.0158F, 0.1688F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -1.4399F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r33 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r33", CubeListBuilder.create().texOffs(46, 81).mirror().addBox(-0.5F, -1.2379F, -5.404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(46, 81).addBox(1.7F, -1.2379F, -5.404F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r34 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r34", CubeListBuilder.create().texOffs(50, 95).mirror().addBox(-0.5F, -1.1115F, -3.8381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(50, 95).addBox(1.7F, -1.1115F, -3.8381F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r35 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r35", CubeListBuilder.create().texOffs(104, 54).mirror().addBox(-0.5F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(104, 54).addBox(1.7F, -0.2402F, -0.3439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r36 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r36", CubeListBuilder.create().texOffs(25, 104).mirror().addBox(-0.5F, -0.2246F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(25, 104).addBox(1.7F, -0.2246F, -0.8546F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.3578F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r37 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r37", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-0.5F, 0.0857F, -2.1773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(86, 45).addBox(1.7F, 0.0857F, -2.1773F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -0.3796F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r38 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r38", CubeListBuilder.create().texOffs(45, 95).mirror().addBox(-0.5F, -0.3258F, -2.7958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(45, 95).addBox(1.7F, -0.3258F, -2.7958F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r39 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r39", CubeListBuilder.create().texOffs(40, 95).mirror().addBox(-0.5F, -0.7344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(40, 95).addBox(1.7F, -0.7344F, -3.3265F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r40 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r40", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.5F, -1.6447F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(35, 95).addBox(1.7F, -1.6447F, -0.7567F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 1.5621F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r41 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r41", CubeListBuilder.create().texOffs(60, 103).mirror().addBox(-0.5F, -1.5887F, -1.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(60, 103).addBox(1.7F, -1.5887F, -1.0515F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 1.2217F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r42 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r42", CubeListBuilder.create().texOffs(55, 66).mirror().addBox(-0.5F, 1.0446F, -0.3744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 66).addBox(1.7F, 1.0446F, -0.3744F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -1.4661F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r43 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r43", CubeListBuilder.create().texOffs(100, 34).mirror().addBox(-0.5F, 1.9342F, -0.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(20, 100).mirror().addBox(-0.5F, 2.5092F, -0.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false)
				.texOffs(100, 34).addBox(1.7F, 1.9342F, -0.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(20, 100).addBox(1.7F, 2.5092F, -0.2334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, -1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Lowerjawbase.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(45, 86).mirror().addBox(-0.3146F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, -0.094F, -0.4164F, -0.0412F));

		PartDefinition cube_r89 = Lowerjawbase.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(38, 86).mirror().addBox(-0.6319F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, 0.4219F, -0.1604F, 0.0161F));

		PartDefinition Lowerjawbase_r44 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r44", CubeListBuilder.create().texOffs(31, 86).mirror().addBox(-0.5F, -0.1263F, -2.3463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(31, 86).addBox(1.7F, -0.1263F, -2.3463F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-1.1F, 0.049F, 0.2655F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r45 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r45", CubeListBuilder.create().texOffs(96, 38).addBox(-0.8F, -0.1785F, 0.5385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, -1.6362F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r46 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r46", CubeListBuilder.create().texOffs(99, 72).addBox(-0.8F, 1.4718F, 0.4163F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, -1.5621F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r47 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r47", CubeListBuilder.create().texOffs(20, 96).addBox(-0.7471F, -0.2337F, 0.0492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, -1.4748F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r48 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r48", CubeListBuilder.create().texOffs(99, 59).addBox(-0.7471F, 1.2863F, 0.1825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, -1.5621F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r49 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r49", CubeListBuilder.create().texOffs(100, 104).addBox(-0.7471F, 0.4477F, -3.7889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, -0.0785F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r50 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r50", CubeListBuilder.create().texOffs(104, 99).addBox(-0.7471F, -3.8476F, -2.4692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 1.1868F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r51 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r51", CubeListBuilder.create().texOffs(105, 108).addBox(-0.7471F, -4.4649F, -0.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(104, 96).addBox(-0.7471F, -3.9649F, -0.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 1.6232F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r52 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r52", CubeListBuilder.create().texOffs(5, 96).addBox(-0.7471F, -3.365F, -0.8808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 1.5708F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r53 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r53", CubeListBuilder.create().texOffs(86, 95).addBox(-0.7471F, -1.8183F, -0.7418F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 1.6581F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r54 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r54", CubeListBuilder.create().texOffs(95, 104).addBox(-0.8F, -3.6163F, -0.4656F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 1.7715F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r55 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r55", CubeListBuilder.create().texOffs(104, 72).addBox(-0.8F, -0.342F, 2.024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, -2.8972F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r56 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r56", CubeListBuilder.create().texOffs(108, 93).addBox(-0.8F, 1.4255F, -0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, -1.2392F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r57 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r57", CubeListBuilder.create().texOffs(104, 60).addBox(-0.8F, -0.681F, -1.885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 0.2269F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r58 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r58", CubeListBuilder.create().texOffs(104, 57).addBox(-0.8F, -0.6428F, -1.3011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 0.192F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r59 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r59", CubeListBuilder.create().texOffs(87, 59).addBox(-0.8F, 0.041F, -2.3142F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.209F))
				.texOffs(40, 103).addBox(-0.875F, -0.759F, -0.6642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(81, 95).addBox(-0.8F, -0.559F, -0.7642F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 0.0349F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r60 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r60", CubeListBuilder.create().texOffs(15, 99).addBox(-1.0471F, -1.158F, -4.4166F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(55, 103).addBox(-0.8221F, -0.758F, -3.9166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 0.096F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r61 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r61", CubeListBuilder.create().texOffs(95, 34).addBox(-0.8221F, -0.6585F, -3.3046F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, -0.0349F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r62 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r62", CubeListBuilder.create().texOffs(103, 51).addBox(-0.8221F, -0.505F, -2.2925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 0.0175F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r63 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r63", CubeListBuilder.create().texOffs(50, 103).addBox(-0.8221F, -0.6737F, -1.2858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.0F, 0.449F, -8.5345F, 0.0698F, 0.1222F, 0.0F));

		PartDefinition Lowerjawbase_r64 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r64", CubeListBuilder.create().texOffs(45, 103).addBox(-0.875F, -0.6977F, -3.6247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(103, 40).addBox(-0.875F, -0.8345F, -1.6372F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 0.1222F, 0.1047F, 0.0F));

		PartDefinition Lowerjawbase_r65 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r65", CubeListBuilder.create().texOffs(103, 43).addBox(-0.875F, -0.9195F, -2.5999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)), PartPose.offsetAndRotation(1.4F, 0.049F, -5.2345F, 0.2094F, 0.1047F, 0.0F));

		PartDefinition cube_r90 = Lowerjawbase.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(45, 86).addBox(-0.6854F, -0.7301F, -0.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, -0.094F, 0.4164F, 0.0412F));

		PartDefinition cube_r91 = Lowerjawbase.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(88, 4).addBox(-0.3681F, -0.3327F, 0.9481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, 0.2037F, 0.1604F, -0.0161F));

		PartDefinition cube_r92 = Lowerjawbase.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(38, 86).addBox(-0.3681F, 0.2218F, 2.2107F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.7788F, -2.5478F, 0.4219F, 0.1604F, -0.0161F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.3F, 0.3064F, -2.4747F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(76, 5).addBox(-0.7034F, 1.7238F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(99, 98).addBox(-0.7034F, 1.5238F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -1.0559F, 0.1745F, 0.0218F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(100, 0).addBox(-0.8034F, 0.8813F, 0.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -2.1468F, 0.1745F, 0.0218F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(5, 100).addBox(-0.9034F, -0.7162F, 0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 2.8274F, 0.1745F, 0.0218F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(100, 3).addBox(-0.9034F, -1.0577F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 1.7802F, 0.1745F, 0.0218F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(100, 9).addBox(-1.0F, -1.5547F, -6.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.3403F, 0.0873F, 0.0F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(35, 64).addBox(-1.0F, -3.7325F, -5.917F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.637F, 0.0873F, 0.0F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(39, 81).addBox(-1.0F, -1.7517F, -5.8225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.2007F, 0.0873F, 0.0F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(76, 19).addBox(-0.8249F, -3.8483F, -1.6846F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.0536F, -0.2422F, -0.1672F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(60, 65).addBox(-0.3451F, -3.9574F, -2.8043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.1937F, 0.4002F, -0.0825F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(100, 76).addBox(-1.0F, 2.6876F, -0.1273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -3.0718F, 0.0873F, 0.0F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(95, 107).addBox(-1.0F, -2.1659F, 2.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 1.5533F, 0.0873F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(108, 84).addBox(-0.8034F, 0.9821F, -2.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(108, 63).addBox(-0.8034F, 0.5821F, -2.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -0.6021F, 0.1745F, 0.0218F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(108, 49).addBox(-0.9034F, -0.0287F, -1.8379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(108, 24).addBox(-0.9034F, -1.0287F, -1.8379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -0.7418F, 0.1745F, 0.0218F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(59, 87).addBox(-1.0F, -5.1909F, -4.8909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.7418F, 0.0873F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(108, 21).addBox(-1.0F, -3.2024F, 4.0048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 2.2515F, 0.0873F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(108, 18).addBox(-1.0F, 3.5463F, 2.038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -2.6354F, 0.0873F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(100, 107).addBox(-1.0F, 1.4265F, -4.3514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -1.1519F, 0.0873F, 0.0F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(107, 81).addBox(-1.0F, -4.0376F, -2.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.2443F, 0.0873F, 0.0F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(76, 14).addBox(-1.0F, -3.521F, -2.6689F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.1134F, 0.0873F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(76, 87).addBox(-1.0F, -4.848F, -4.1193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.7243F, 0.0873F, 0.0F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(106, 36).addBox(-0.9034F, -1.6785F, -0.2076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 0.7243F, 0.1745F, 0.0218F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(106, 46).addBox(-0.975F, 1.9905F, 1.748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 98).addBox(-0.975F, 1.0905F, 0.748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -2.714F, 0.0873F, 0.0F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(98, 90).addBox(-0.975F, 1.9108F, -1.7704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -1.3177F, 0.0873F, 0.0F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(50, 106).addBox(-0.5784F, -2.323F, -0.7852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 1.3788F, 0.1745F, 0.0218F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(0, 104).addBox(-0.6784F, -0.9277F, 0.7773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 2.2689F, 0.1745F, 0.0218F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(103, 91).addBox(-0.6784F, -1.3854F, 0.8324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 2.3562F, 0.1745F, 0.0218F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(60, 106).addBox(-0.6784F, -0.8358F, 0.792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(55, 106).addBox(-0.6784F, -0.2358F, 0.792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 2.4522F, 0.1745F, 0.0218F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(103, 88).addBox(-0.6784F, -1.7047F, 0.5549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 2.1468F, 0.1745F, 0.0218F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(103, 85).addBox(-0.975F, -1.3921F, -4.9667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.1571F, 0.0873F, 0.0F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(34, 76).addBox(-0.975F, -4.1279F, -3.0929F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.8116F, 0.0873F, 0.0F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(45, 106).addBox(-0.975F, -1.8287F, 2.7019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 1.946F, 0.0873F, 0.0F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(40, 106).addBox(-0.975F, 2.0048F, 1.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 3.0805F, 0.0873F, 0.0F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(55, 100).addBox(-0.975F, 2.216F, -0.6459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -2.5918F, 0.0873F, 0.0F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(85, 103).addBox(-0.975F, 1.7354F, -1.5219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -2.1555F, 0.0873F, 0.0F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(80, 103).addBox(-0.975F, -1.4783F, -2.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, -0.1484F, 0.0873F, 0.0F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(100, 12).addBox(-0.479F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.279F, 4.5987F, -10.2004F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(45, 109).addBox(-0.8284F, 1.3496F, -0.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -0.8465F, 0.1745F, 0.0218F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(60, 100).addBox(-0.9034F, 0.171F, -1.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, -0.192F, 0.1745F, 0.0218F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(85, 99).addBox(-0.9034F, -0.9956F, -0.9199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.121F, 3.3773F, -8.1885F, 0.1134F, 0.1745F, 0.0218F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(10, 99).addBox(-1.0F, -1.3358F, -6.5296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(25, 107).addBox(-1.0F, -0.5608F, -5.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(107, 15).addBox(-1.0F, -0.4858F, -4.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 107).addBox(-1.0F, -0.6358F, -3.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(82, 106).addBox(-1.0F, -0.5108F, -2.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 106).addBox(-1.0F, -0.6108F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(106, 69).addBox(-1.025F, -0.6608F, -0.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 35).addBox(-1.0F, -3.0858F, -3.8296F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.7797F, 1.9002F, -1.7686F, 0.288F, 0.0873F, 0.0F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(46, 90).addBox(-0.5F, -2.85F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 30).addBox(-0.475F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.455F, 1.413F, -0.9619F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(30, 103).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.455F, 1.063F, -0.3556F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(103, 27).addBox(-0.5F, -0.15F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F))
				.texOffs(103, 24).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.455F, -0.0019F, 0.39F, -2.1817F, 0.0F, 0.0F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(24, 83).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.455F, -0.6853F, 0.5415F, 2.9234F, 0.0F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(103, 21).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.455F, -1.3827F, 0.4805F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(20, 103).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(1.455F, -1.8088F, -0.0748F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(103, 18).addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.455F, -1.8001F, -0.2747F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(15, 103).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.455F, -1.7696F, -0.974F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(10, 103).addBox(-0.5F, -0.85F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.455F, -1.4487F, -1.3242F, -2.3998F, 0.0F, 0.0F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.455F, -0.9987F, -1.8604F, 2.2689F, 0.0F, 0.0F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(95, 12).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.455F, -0.3093F, -1.982F, 1.3963F, 0.0F, 0.0F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.455F, 0.388F, -1.921F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(101, 48).addBox(-0.5F, -0.675F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.455F, 0.2959F, -1.7365F, -1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(101, 37).addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(103, 63).addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.3325F, -0.6599F, -0.5895F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(65, 102).addBox(-0.5F, -1.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(99, 101).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.47F, 0.1001F, 0.7143F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r82 = leftFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(102, 15).addBox(-0.5F, -0.625F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, -0.5283F, 1.3852F, -1.4312F, 0.0F, 0.0F));

		PartDefinition Head_r83 = leftFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(101, 69).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, 0.7557F, 0.4691F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r84 = leftFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(90, 102).addBox(-0.5F, -0.675F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, 0.8488F, 1.4378F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r85 = leftFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(102, 82).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.47F, 1.2798F, 1.9894F, 2.4784F, 0.0F, 0.0F));

		PartDefinition Head_r86 = leftFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(75, 102).addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(1.47F, 1.7292F, 1.1074F, 2.8274F, 0.0F, 0.0F));

		PartDefinition Head_r87 = leftFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(70, 102).addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.47F, 1.4557F, 0.463F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Head_r88 = leftFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(25, 101).addBox(-0.4F, -0.525F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.37F, 0.7586F, 0.7941F, -1.5795F, 0.0F, 0.0F));

		PartDefinition Head_r89 = leftFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(30, 95).addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.5F, 2.5901F, 2.3577F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r90 = leftFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(95, 8).addBox(0.5F, -0.975F, -2.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.5F, 0.8086F, 3.2219F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r91 = leftFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(52, 86).addBox(0.5F, -0.1911F, -0.178F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(85, 86).addBox(0.5F, -0.1911F, 0.122F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.5F, -1.3011F, 2.0343F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Head_r92 = leftFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(35, 103).addBox(-0.5F, -0.55F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(1.5F, -0.5199F, 2.8195F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Head_r93 = leftFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -0.5199F, 2.8195F, 1.117F, 0.0F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.3064F, -2.4747F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(76, 5).mirror().addBox(-0.2966F, 1.7238F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(99, 98).mirror().addBox(-0.2966F, 1.5238F, -1.022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -1.0559F, -0.1745F, -0.0218F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-0.1966F, 0.8813F, 0.5294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -2.1468F, -0.1745F, -0.0218F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.0966F, -0.7162F, 0.8078F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 2.8274F, -0.1745F, -0.0218F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-0.0966F, -1.0577F, -0.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 1.7802F, -0.1745F, -0.0218F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(100, 9).mirror().addBox(0.0F, -1.5547F, -6.6612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.3403F, -0.0873F, 0.0F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(0.0F, -3.7325F, -5.917F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.637F, -0.0873F, 0.0F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(39, 81).mirror().addBox(0.0F, -1.7517F, -5.8225F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.2007F, -0.0873F, 0.0F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(76, 19).mirror().addBox(-1.1751F, -3.8483F, -1.6846F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.0536F, 0.2422F, 0.1672F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(60, 65).mirror().addBox(-1.6549F, -3.9574F, -2.8043F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.1937F, -0.4002F, 0.0825F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(0.0F, 2.6876F, -0.1273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -3.0718F, -0.0873F, 0.0F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(95, 107).mirror().addBox(0.0F, -2.1659F, 2.5996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 1.5533F, -0.0873F, 0.0F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(108, 84).mirror().addBox(-0.1966F, 0.9821F, -2.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(108, 63).mirror().addBox(-0.1966F, 0.5821F, -2.0412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -0.6021F, -0.1745F, -0.0218F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(108, 49).mirror().addBox(-0.0966F, -0.0287F, -1.8379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(108, 24).mirror().addBox(-0.0966F, -1.0287F, -1.8379F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -0.7418F, -0.1745F, -0.0218F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(59, 87).mirror().addBox(0.0F, -5.1909F, -4.8909F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.7418F, -0.0873F, 0.0F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(108, 21).mirror().addBox(0.0F, -3.2024F, 4.0048F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 2.2515F, -0.0873F, 0.0F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(108, 18).mirror().addBox(0.0F, 3.5463F, 2.038F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -2.6354F, -0.0873F, 0.0F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(100, 107).mirror().addBox(0.0F, 1.4265F, -4.3514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -1.1519F, -0.0873F, 0.0F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(107, 81).mirror().addBox(0.0F, -4.0376F, -2.1604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.2443F, -0.0873F, 0.0F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(0.0F, -3.521F, -2.6689F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.1134F, -0.0873F, 0.0F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(76, 87).mirror().addBox(0.0F, -4.848F, -4.1193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.7243F, -0.0873F, 0.0F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(106, 36).mirror().addBox(-0.0966F, -1.6785F, -0.2076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 0.7243F, -0.1745F, -0.0218F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(106, 46).mirror().addBox(-0.025F, 1.9905F, 1.748F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 98).mirror().addBox(-0.025F, 1.0905F, 0.748F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -2.714F, -0.0873F, 0.0F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(98, 90).mirror().addBox(-0.025F, 1.9108F, -1.7704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -1.3177F, -0.0873F, 0.0F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-0.4216F, -2.323F, -0.7852F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 1.3788F, -0.1745F, -0.0218F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-0.3216F, -0.9277F, 0.7773F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 2.2689F, -0.1745F, -0.0218F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(103, 91).mirror().addBox(-0.3216F, -1.3854F, 0.8324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 2.3562F, -0.1745F, -0.0218F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-0.3216F, -0.8358F, 0.792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(55, 106).mirror().addBox(-0.3216F, -0.2358F, 0.792F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 2.4522F, -0.1745F, -0.0218F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(103, 88).mirror().addBox(-0.3216F, -1.7047F, 0.5549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 2.1468F, -0.1745F, -0.0218F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(103, 85).mirror().addBox(-0.025F, -1.3921F, -4.9667F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.1571F, -0.0873F, 0.0F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-0.025F, -4.1279F, -3.0929F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.8116F, -0.0873F, 0.0F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(45, 106).mirror().addBox(-0.025F, -1.8287F, 2.7019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 1.946F, -0.0873F, 0.0F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(40, 106).mirror().addBox(-0.025F, 2.0048F, 1.3155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 3.0805F, -0.0873F, 0.0F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(55, 100).mirror().addBox(-0.025F, 2.216F, -0.6459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -2.5918F, -0.0873F, 0.0F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(85, 103).mirror().addBox(-0.025F, 1.7354F, -1.5219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -2.1555F, -0.0873F, 0.0F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(80, 103).mirror().addBox(-0.025F, -1.4783F, -2.2255F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, -0.1484F, -0.0873F, 0.0F));

		PartDefinition Head_r129 = rightFace.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(100, 12).mirror().addBox(-0.521F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.279F, 4.5987F, -10.2004F, -1.1956F, 0.0F, 0.0F));

		PartDefinition Head_r130 = rightFace.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(45, 109).mirror().addBox(-0.1716F, 1.3496F, -0.8618F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -0.8465F, -0.1745F, -0.0218F));

		PartDefinition Head_r131 = rightFace.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(60, 100).mirror().addBox(-0.0966F, 0.171F, -1.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, -0.192F, -0.1745F, -0.0218F));

		PartDefinition Head_r132 = rightFace.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(85, 99).mirror().addBox(-0.0966F, -0.9956F, -0.9199F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.121F, 3.3773F, -8.1885F, 0.1134F, -0.1745F, -0.0218F));

		PartDefinition Head_r133 = rightFace.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(0.0F, -1.3358F, -6.5296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(25, 107).mirror().addBox(0.0F, -0.5608F, -5.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(107, 15).mirror().addBox(0.0F, -0.4858F, -4.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 107).mirror().addBox(0.0F, -0.6358F, -3.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(82, 106).mirror().addBox(0.0F, -0.5108F, -2.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 106).mirror().addBox(0.0F, -0.6108F, -1.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(106, 69).mirror().addBox(0.025F, -0.6608F, -0.5296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 35).mirror().addBox(0.0F, -3.0858F, -3.8296F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.7797F, 1.9002F, -1.7686F, 0.288F, -0.0873F, 0.0F));

		PartDefinition Head_r134 = rightFace.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(46, 90).mirror().addBox(-0.5F, -2.85F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 30).mirror().addBox(-0.525F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.455F, 1.413F, -0.9619F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r135 = rightFace.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(30, 103).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.455F, 1.063F, -0.3556F, -1.0472F, 0.0F, 0.0F));

		PartDefinition Head_r136 = rightFace.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(103, 27).mirror().addBox(-0.5F, -0.15F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(103, 24).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -0.0019F, 0.39F, -2.1817F, 0.0F, 0.0F));

		PartDefinition Head_r137 = rightFace.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(24, 83).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -0.6853F, 0.5415F, 2.9234F, 0.0F, 0.0F));

		PartDefinition Head_r138 = rightFace.addOrReplaceChild("Head_r138", CubeListBuilder.create().texOffs(103, 21).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.3827F, 0.4805F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Head_r139 = rightFace.addOrReplaceChild("Head_r139", CubeListBuilder.create().texOffs(20, 103).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.145F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.8088F, -0.0748F, 0.9163F, 0.0F, 0.0F));

		PartDefinition Head_r140 = rightFace.addOrReplaceChild("Head_r140", CubeListBuilder.create().texOffs(103, 18).mirror().addBox(-0.5F, -0.15F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.8001F, -0.2747F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r141 = rightFace.addOrReplaceChild("Head_r141", CubeListBuilder.create().texOffs(15, 103).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.7696F, -0.974F, -1.5272F, 0.0F, 0.0F));

		PartDefinition Head_r142 = rightFace.addOrReplaceChild("Head_r142", CubeListBuilder.create().texOffs(10, 103).mirror().addBox(-0.5F, -0.85F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -1.4487F, -1.3242F, -2.3998F, 0.0F, 0.0F));

		PartDefinition Head_r143 = rightFace.addOrReplaceChild("Head_r143", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -0.9987F, -1.8604F, 2.2689F, 0.0F, 0.0F));

		PartDefinition Head_r144 = rightFace.addOrReplaceChild("Head_r144", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.455F, -0.3093F, -1.982F, 1.3963F, 0.0F, 0.0F));

		PartDefinition Head_r145 = rightFace.addOrReplaceChild("Head_r145", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.455F, 0.388F, -1.921F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r146 = rightFace.addOrReplaceChild("Head_r146", CubeListBuilder.create().texOffs(101, 48).mirror().addBox(-0.5F, -0.675F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.455F, 0.2959F, -1.7365F, -1.3526F, 0.0F, 0.0F));

		PartDefinition Head_r147 = rightFace.addOrReplaceChild("Head_r147", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(-0.6125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(103, 63).mirror().addBox(-0.3875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3325F, -0.6599F, -0.5895F, -1.405F, 0.0F, 0.0F));

		PartDefinition Head_r148 = rightFace.addOrReplaceChild("Head_r148", CubeListBuilder.create().texOffs(65, 102).mirror().addBox(-0.5F, -1.35F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(99, 101).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.1001F, 0.7143F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Head_r149 = rightFace.addOrReplaceChild("Head_r149", CubeListBuilder.create().texOffs(102, 15).mirror().addBox(-0.5F, -0.625F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, -0.5283F, 1.3852F, -1.4312F, 0.0F, 0.0F));

		PartDefinition Head_r150 = rightFace.addOrReplaceChild("Head_r150", CubeListBuilder.create().texOffs(101, 69).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.7557F, 0.4691F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head_r151 = rightFace.addOrReplaceChild("Head_r151", CubeListBuilder.create().texOffs(90, 102).mirror().addBox(-0.5F, -0.675F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 0.8488F, 1.4378F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r152 = rightFace.addOrReplaceChild("Head_r152", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.2798F, 1.9894F, 2.4784F, 0.0F, 0.0F));

		PartDefinition Head_r153 = rightFace.addOrReplaceChild("Head_r153", CubeListBuilder.create().texOffs(75, 102).mirror().addBox(-0.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.7292F, 1.1074F, 2.8274F, 0.0F, 0.0F));

		PartDefinition Head_r154 = rightFace.addOrReplaceChild("Head_r154", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(-0.5F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.47F, 1.4557F, 0.463F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Head_r155 = rightFace.addOrReplaceChild("Head_r155", CubeListBuilder.create().texOffs(25, 101).mirror().addBox(-0.6F, -0.525F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(-1.37F, 0.7586F, 0.7941F, -1.5795F, 0.0F, 0.0F));

		PartDefinition Head_r156 = rightFace.addOrReplaceChild("Head_r156", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(-0.5F, -1.8F, -0.225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.5901F, 2.3577F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r157 = rightFace.addOrReplaceChild("Head_r157", CubeListBuilder.create().texOffs(95, 8).mirror().addBox(-1.5F, -0.975F, -2.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.209F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8086F, 3.2219F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r158 = rightFace.addOrReplaceChild("Head_r158", CubeListBuilder.create().texOffs(52, 86).mirror().addBox(-2.5F, -0.1911F, -0.178F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(85, 86).mirror().addBox(-2.5F, -0.1911F, 0.122F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.3011F, 2.0343F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Head_r159 = rightFace.addOrReplaceChild("Head_r159", CubeListBuilder.create().texOffs(35, 103).mirror().addBox(-0.5F, -0.55F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5199F, 2.8195F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Head_r160 = rightFace.addOrReplaceChild("Head_r160", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(-0.5F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.5199F, 2.8195F, 1.117F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(60, 96).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9201F, 6.2368F, -7.1315F, 0.229F, 0.0861F, -0.2025F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, 0.1164F, -0.2745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9178F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(83, 90).addBox(-0.5F, -2.6276F, -0.34F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9178F, 0.8465F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4434F, 4.5651F, 3.667F, -0.5146F, 0.2285F, 0.1819F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(9, 80).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 76).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.3F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(71, 58).addBox(-0.9F, 0.1F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8254F, 4.828F, -0.1049F, 0.0344F, 0.0103F, 0.3153F));

		PartDefinition Righthand_r1 = Righthand.addOrReplaceChild("Righthand_r1", CubeListBuilder.create().texOffs(18, 75).addBox(-1.5F, -1.9F, -1.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(30, 99).addBox(-0.5F, -0.3353F, -0.4912F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9001F, 6.2368F, -7.1315F, 0.4036F, -0.0861F, 0.2025F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, 0.1164F, -0.2745F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9178F, 0.5061F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(93, 19).addBox(-0.5F, -2.6276F, -0.34F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 2.6769F, 1.9178F, 0.8465F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4434F, 4.5651F, 3.667F, -0.2528F, -0.2285F, -0.1819F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(66, 80).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(61, 80).addBox(-0.5F, -1.5F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.3F, 0.0F, 0.0F, -3.1416F, 0.0F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(72, 23).addBox(-0.1F, 0.1F, -1.1F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8254F, 4.828F, -0.1049F, 0.0344F, -0.0103F, -0.3153F));

		PartDefinition Lefthand_r1 = Lefthand.addOrReplaceChild("Lefthand_r1", CubeListBuilder.create().texOffs(25, 77).addBox(-0.5F, -1.9F, -1.3F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 2.1F, -0.6F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone = Bodyfront.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7812F, 4.8888F, -8.4776F, -0.0147F, 0.1056F, -0.0705F));

		PartDefinition cube_r93 = bone.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(100, 6).addBox(-0.5F, 0.677F, -0.6677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1288F, -5.0073F, 1.577F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 83).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1288F, -5.737F, 3.1518F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(83, 37).addBox(-0.5F, -0.4535F, -1.319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1288F, -5.0044F, 3.4664F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(80, 99).addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1288F, -4.3565F, 4.3F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(105, 9).addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1288F, -3.7261F, 2.6065F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 44).addBox(0.3903F, 0.4976F, 1.7233F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F))
				.texOffs(60, 59).addBox(0.3903F, 0.1976F, 1.6233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.7615F, 0.3324F, -0.8505F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r99 = bone.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 19).addBox(-1.0097F, -0.6684F, -0.1378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6385F, -0.7545F, 0.4052F, -1.3873F, 0.2211F, 0.448F));

		PartDefinition cube_r100 = bone.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(49, 59).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1401F, 0.6511F, 0.0359F, -0.2225F, 0.3391F, 0.8667F));

		PartDefinition cube_r101 = bone.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0097F, 0.6393F, -1.9238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6385F, -0.7545F, 0.4052F, -0.3401F, 0.2211F, 0.448F));

		PartDefinition cube_r102 = bone.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(84, 41).addBox(-1.0097F, -0.2489F, -2.0784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6385F, -0.7545F, 0.4052F, 0.0963F, 0.2211F, 0.448F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7612F, 4.8888F, -8.4776F, -0.0147F, -0.1056F, 0.0705F));

		PartDefinition cube_r103 = bone4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(100, 6).mirror().addBox(-0.5F, 0.677F, -0.6677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.0073F, 1.577F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.737F, 3.1518F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r105 = bone4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-0.5F, -0.4535F, -1.319F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -5.0044F, 3.4664F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r106 = bone4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(80, 99).mirror().addBox(-0.5F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -4.3565F, 4.3F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(105, 9).mirror().addBox(-0.5F, -0.55F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1288F, -3.7261F, 2.6065F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(49, 44).mirror().addBox(-1.3903F, 0.4976F, 1.7233F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(60, 59).mirror().addBox(-1.3903F, 0.1976F, 1.6233F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.7615F, 0.3324F, -0.8505F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(85, 19).mirror().addBox(0.0097F, -0.6684F, -0.1378F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -0.7545F, 0.4052F, -1.3873F, -0.2211F, -0.448F));

		PartDefinition cube_r110 = bone4.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(49, 59).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1401F, 0.6511F, 0.0359F, -0.2225F, -0.3391F, -0.8667F));

		PartDefinition cube_r111 = bone4.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(73, 51).mirror().addBox(0.0097F, 0.6393F, -1.9238F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -0.7545F, 0.4052F, -0.3401F, -0.2211F, -0.448F));

		PartDefinition cube_r112 = bone4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(0.0097F, -0.2489F, -2.0784F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6385F, -0.7545F, 0.4052F, 0.0963F, -0.2211F, -0.448F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, -0.6302F, -0.0406F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(73, 56).addBox(0.4F, -0.1302F, -0.0406F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 110).addBox(0.3F, -0.1302F, 1.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 68).addBox(0.2F, -0.1302F, 3.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 33).addBox(0.1F, -0.1302F, 5.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 56).mirror().addBox(-1.4F, -0.1302F, -0.0406F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 110).mirror().addBox(-1.3F, -0.1302F, 1.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 68).mirror().addBox(-1.2F, -0.1302F, 3.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 33).mirror().addBox(-1.1F, -0.1302F, 5.9594F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1562F, 2.932F, -0.0396F, -0.1104F, 0.091F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(91, 96).addBox(0.0F, 0.0303F, -0.3796F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3698F, 7.5594F, 0.7941F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(74, 105).addBox(0.0F, 1.9899F, 2.1101F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8698F, 1.4594F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(64, 110).addBox(0.0F, -0.2082F, -0.5156F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2698F, 2.7594F, 0.8116F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = Tailbase.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(104, 111).addBox(0.0F, -1.9456F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4384F, 5.9544F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r14 = Tailbase.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(9, 112).addBox(0.0F, -1.8834F, 0.0055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5581F, 3.9565F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = Tailbase.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(55, 109).addBox(0.0F, -1.7235F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, -0.0435F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r16 = Tailbase.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(109, 56).addBox(0.0F, -1.766F, 0.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6581F, 1.9565F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2569F, 7.8363F, 0.0436F, -0.0892F, 0.0388F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(42, 35).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1038F, 0.9873F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r17 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(6, 112).addBox(0.0F, -0.6F, 17.675F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0241F, -13.6156F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r18 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(29, 112).addBox(0.0F, -1.4F, -0.55F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4178F, 8.5905F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(110, 6).addBox(0.0F, -1.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4004F, 6.5906F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r20 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(110, 2).addBox(0.0F, -1.6456F, 0.0044F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.265F, 2.0373F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailmiddlebase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(77, 96).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 6.4943F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailmiddlebase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(74, 96).addBox(0.0F, -0.4F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4276F, 4.6464F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailmiddlebase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(71, 96).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6698F, 2.6511F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r21 = Tailmiddlebase.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(58, 109).addBox(0.0F, -2.1206F, 0.0087F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.052F, 0.0856F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = Tailmiddlebase.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0229F, 7.0076F, 0.0099F, -0.0442F, 0.0425F));

		PartDefinition Tailmiddlebase_r2 = tail.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(34, 44).addBox(-0.5F, -0.5F, 6.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.1267F, -6.0203F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = tail.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(32, 112).addBox(0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7389F, 5.5694F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = tail.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(23, 112).addBox(0.0F, -0.9923F, -0.0216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7949F, 3.0829F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = tail.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(65, 105).addBox(0.0F, 14.2986F, 14.0028F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 91).addBox(0.0F, 12.1912F, 12.4762F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0267F, -16.4203F, 0.829F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = tail.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(26, 112).addBox(0.0F, -1.4724F, 0.9601F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 6.0F, 0.0864F, -0.0437F, 0.0F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(113, 22).addBox(0.0F, -1.125F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 112).addBox(0.0F, -1.2F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0456F, 0.4856F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(113, 16).addBox(0.0F, -0.8369F, -0.1278F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6456F, 3.0856F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailmiddleend.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(95, 110).addBox(0.0F, 0.8F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 10).addBox(0.0F, -0.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1463F, 4.9637F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tailmiddleend.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(71, 105).addBox(0.0F, -0.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1605F, 0.4067F, 0.7069F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tailmiddleend.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(68, 105).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2448F, 2.8299F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5519F, 8.8376F, 0.0633F, 0.1048F, -0.0085F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(112, 52).addBox(0.0F, -0.925F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 112).addBox(0.0F, -0.975F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 112).addBox(0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 112).addBox(0.0F, -1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 112).addBox(0.0F, -1.05F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tailend.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(110, 106).addBox(0.0F, 4.5F, 9.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 102).addBox(0.0F, 3.6F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 110).addBox(0.0F, 2.6F, 5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 110).addBox(0.0F, 1.6F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6982F, -3.874F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3392F, 8.921F, 0.1073F, 0.2181F, -0.0051F));

		PartDefinition Tailend_r2 = Tailend2.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(92, 112).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 80).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 55).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r12 = Tailend2.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(111, 35).addBox(0.0F, 6.4F, 13.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 5).addBox(0.0F, 9.4F, 17.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 2).addBox(0.0F, 8.4F, 15.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 110).addBox(0.0F, 5.4F, 11.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0374F, -12.795F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend3 = Tailend2.addOrReplaceChild("Tailend3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2674F, 8.9066F, -0.1622F, 0.1749F, -0.0056F));

		PartDefinition Tailend_r3 = Tailend3.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(21, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tailend3.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(113, 19).addBox(0.0F, 13.5F, 25.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 25).addBox(0.0F, 12.5F, 23.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 11).addBox(0.0F, 11.5F, 21.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 8).addBox(0.0F, 10.5F, 19.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3049F, -21.7017F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend4 = Tailend3.addOrReplaceChild("Tailend4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2539F, 8.9195F, -0.1801F, 0.0874F, -0.0043F));

		PartDefinition Tailend_r4 = Tailend4.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tailend4.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(113, 39).addBox(0.0F, 16.4F, 31.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 28).addBox(0.0F, 15.5F, 29.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 42).addBox(0.0F, 14.5F, 27.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5588F, -30.6211F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tailend5 = Tailend4.addOrReplaceChild("Tailend5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2974F, 8.9411F, -0.1627F, 0.131F, -0.0061F));

		PartDefinition Tailend_r5 = Tailend5.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Tailend6 = Tailend5.addOrReplaceChild("Tailend6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3094F, 8.8484F, -0.1569F, 0.1767F, 0.0095F));

		PartDefinition Tailend_r6 = Tailend6.addOrReplaceChild("Tailend_r6", CubeListBuilder.create().texOffs(21, 33).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(85, 13).addBox(0.0F, 0.4322F, -0.5506F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.3F, 1.063F, -1.3982F, -0.9517F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Rightthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(61, 76).addBox(-1.3F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6637F, 0.6192F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Rightthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(71, 91).addBox(-0.5F, 0.039F, 0.2112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(31, 90).addBox(-0.5F, 0.039F, -0.0888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 4.4003F, -0.4531F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Rightthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(71, 85).addBox(-0.5F, -4.05F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Rightthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(79, 27).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 10.5191F, 2.5548F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Rightthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(78, 60).addBox(-1.0F, 2.9507F, -0.6533F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.3003F, -0.0531F, 0.3752F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Rightthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(91, 63).addBox(-0.5F, 0.0367F, -0.0961F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 7.3003F, -0.0531F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r7 = Rightthigh.addOrReplaceChild("Leftthigh_r7", CubeListBuilder.create().texOffs(90, 14).addBox(-0.5F, 0.0938F, 0.2148F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.3003F, -0.0531F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(41, 90).addBox(-1.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 11.1303F, 2.2813F, 1.6008F, 0.0F, 0.0F));

		PartDefinition Leftshin_r1 = Rightshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(89, 70).addBox(3.2F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, 7.6822F, 0.2851F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Rightshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(85, 80).addBox(3.2F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-3.0F, 4.1265F, -0.2781F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Rightshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(32, 81).addBox(3.2F, -4.4F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(0, 86).addBox(3.2F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-3.0F, 4.137F, 0.3218F, -0.192F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Rightshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(84, 74).addBox(3.2F, -0.3F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, 0.6288F, -0.117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Rightshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(94, 55).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = Rightshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(35, 99).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 0.2951F, -0.0932F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = Rightshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(90, 105).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 10.4445F, 1.4046F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = Rightshin.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(14, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 6.3031F, -0.4254F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Leftshin_r9 = Rightshin.addOrReplaceChild("Leftshin_r9", CubeListBuilder.create().texOffs(76, 91).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 3.3288F, -0.817F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Leftshin_r10 = Rightshin.addOrReplaceChild("Leftshin_r10", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5F, 1.15F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Leftshin_r11 = Rightshin.addOrReplaceChild("Leftshin_r11", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, -1.05F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5F, 1.8288F, 0.583F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightankle = Rightshin.addOrReplaceChild("Rightankle", CubeListBuilder.create().texOffs(11, 66).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 12.1474F, 0.8934F, -1.072F, 0.0F, 0.0F));

		PartDefinition Rightfoot = Rightankle.addOrReplaceChild("Rightfoot", CubeListBuilder.create().texOffs(59, 23).addBox(-1.9F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 1.1498F, 0.0F, 0.0F));

		PartDefinition Rightfoot2 = Rightfoot.addOrReplaceChild("Rightfoot2", CubeListBuilder.create().texOffs(17, 44).addBox(-1.9F, -0.8F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.2377F, 0.0F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(88, 23).addBox(-1.0F, 0.4322F, -0.5506F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.3F, 1.063F, -1.3982F, 0.0518F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r1 = Leftthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(43, 77).addBox(-0.7F, -1.1F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6637F, 0.6192F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Leftthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(93, 86).addBox(-0.5F, 0.039F, 0.2112F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(36, 90).addBox(-0.5F, 0.039F, -0.0888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 4.4003F, -0.4531F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Leftthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(88, 29).addBox(-0.5F, -4.05F, -0.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.4322F, -0.0506F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Leftthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(79, 33).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 10.5191F, 2.5548F, 0.7679F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Leftthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(79, 23).addBox(-1.0F, 2.9507F, -0.6533F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.3003F, -0.0531F, 0.3752F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Leftthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(66, 93).addBox(-0.5F, 0.0367F, -0.0961F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 7.3003F, -0.0531F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r7 = Leftthigh.addOrReplaceChild("Rightthigh_r7", CubeListBuilder.create().texOffs(90, 35).addBox(-0.5F, 0.0938F, 0.2148F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 7.3003F, -0.0531F, 0.3142F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(51, 90).addBox(0.0F, 0.3288F, -0.817F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 11.1303F, 2.2813F, 0.8154F, 0.0F, 0.0F));

		PartDefinition Rightshin_r1 = Leftshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(90, 8).addBox(-4.2F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, 7.6822F, 0.2851F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Leftshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(17, 88).addBox(-4.2F, -0.2F, -0.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(3.0F, 4.1265F, -0.2781F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Leftshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(53, 81).addBox(-4.2F, -4.4F, -1.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(12, 88).addBox(-4.2F, -3.8F, -0.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(3.0F, 4.137F, 0.3218F, -0.192F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Leftshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(66, 87).addBox(-4.2F, -0.3F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, 0.6288F, -0.117F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Leftshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(94, 59).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = Leftshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(99, 55).addBox(-0.5F, -0.6F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.5F, 0.2951F, -0.0932F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = Leftshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(87, 108).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 10.4445F, 1.4046F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = Leftshin.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(19, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 6.3031F, -0.4254F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Rightshin_r9 = Leftshin.addOrReplaceChild("Rightshin_r9", CubeListBuilder.create().texOffs(93, 29).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 3.3288F, -0.817F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Rightshin_r10 = Leftshin.addOrReplaceChild("Rightshin_r10", CubeListBuilder.create().texOffs(95, 4).addBox(-0.5F, 1.15F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Rightshin_r11 = Leftshin.addOrReplaceChild("Rightshin_r11", CubeListBuilder.create().texOffs(93, 24).addBox(-0.5F, -1.05F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.5F, 1.8288F, 0.583F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Leftankle = Leftshin.addOrReplaceChild("Leftankle", CubeListBuilder.create().texOffs(18, 66).addBox(-1.0F, -0.3F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 12.1474F, 0.8934F, -0.8102F, 0.0F, 0.0F));

		PartDefinition Leftfoot = Leftankle.addOrReplaceChild("Leftfoot", CubeListBuilder.create().texOffs(35, 60).addBox(-2.1F, -0.4F, -1.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8279F, 0.0386F, 0.9317F, 0.0F, 0.0F));

		PartDefinition Leftfoot2 = Leftfoot.addOrReplaceChild("Leftfoot2", CubeListBuilder.create().texOffs(17, 50).addBox(-2.1F, -0.8F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4112F, -1.704F, -0.8046F, 0.0063F, -0.0046F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7668F, -0.5392F, -1.2751F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(98, 18).addBox(-0.9997F, 1.8049F, -1.4595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.3963F, -0.0349F, -0.4363F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(105, 33).addBox(-0.9997F, 2.428F, -2.7412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.0472F, -0.0349F, -0.4363F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(105, 12).addBox(-0.9997F, -0.12F, -4.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -0.3491F, -0.0349F, -0.4363F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(82, 70).addBox(-0.9997F, -2.2518F, -3.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1745F, -0.0349F, -0.4363F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(108, 87).addBox(-0.9997F, 0.9723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(94, 72).addBox(-0.9997F, -2.4277F, -0.1474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, -1.0123F, -0.0349F, -0.4363F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 50).addBox(-0.5F, -1.3F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5887F, 1.2056F, -0.0029F, 0.1134F, -0.0349F, 0.0F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(40, 99).addBox(-0.5F, -1.1F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6019F, 2.4713F, 1.4039F, 0.2882F, -0.0302F, -0.0175F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(62, 52).addBox(-0.5F, 1.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.514F, 1.365F, -2.1428F, 0.1137F, -0.0302F, -0.0175F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(98, 26).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4862F, 2.9304F, -3.3873F, -1.4575F, -0.0337F, 0.009F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(10, 109).addBox(-0.2002F, -6.7179F, 2.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, 3.124F, -0.0337F, -0.0957F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 78).addBox(-0.2002F, -0.83F, 6.8258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -2.0422F, -0.0337F, -0.0957F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(105, 75).addBox(-0.2002F, 4.2008F, 4.9299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -1.3266F, -0.0337F, -0.0957F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(105, 66).addBox(-0.2002F, 6.2576F, 0.7434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -0.6634F, -0.0337F, -0.0957F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(65, 98).addBox(-0.2002F, 5.12F, -1.2804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -0.3492F, -0.0337F, -0.0957F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(56, 91).addBox(-0.2002F, 2.5261F, -0.536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -0.4888F, -0.0337F, -0.0957F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(93, 91).addBox(-0.2026F, -2.9786F, -0.5126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.9486F, 5.7827F, 4.739F, -2.4997F, 0.0885F, -0.0609F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(10, 94).addBox(-0.1047F, -2.7689F, -0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.1065F, 4.3328F, 2.768F, -2.3383F, 0.0361F, 0.009F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(50, 99).addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7065F, 4.3328F, 2.768F, -2.1818F, -0.0337F, 0.009F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.7258F, 4.1095F, 3.4003F, -2.3389F, -0.0337F, 0.009F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(98, 86).addBox(-0.5F, -1.75F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.4438F, 5.9023F, -5.4389F, -0.8554F, -0.0337F, 0.009F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(61, 91).addBox(-0.2002F, -0.201F, 0.0271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -0.6983F, -0.0337F, -0.0957F));

		PartDefinition cube_r134 = bone2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 40).addBox(-0.2002F, -0.1462F, -0.1598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.715F, 5.375F, -6.1532F, -0.6285F, -0.0337F, -0.0957F));

		PartDefinition cube_r135 = bone2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 44).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4451F, 4.1892F, -4.9409F, -0.803F, -0.0337F, 0.009F));

		PartDefinition cube_r136 = bone2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(98, 30).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4862F, 2.9304F, -3.3873F, -0.8903F, -0.0337F, 0.009F));

		PartDefinition cube_r137 = bone2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.514F, 1.365F, -2.1428F, -0.6721F, -0.0337F, 0.009F));

		PartDefinition cube_r138 = bone2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(81, 5).addBox(-0.5F, -1.0F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5639F, 0.8966F, -0.7132F, -0.4102F, -0.0349F, 0.0F));

		PartDefinition cube_r139 = bone2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(0, 81).addBox(-0.9997F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0698F, -0.0349F, -0.4363F));

		PartDefinition cube_r140 = bone2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 94).addBox(-0.9997F, 1.4367F, 0.0667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 1.7104F, -0.0349F, -0.4363F));

		PartDefinition cube_r141 = bone2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(40, 109).addBox(-0.9997F, 2.6741F, 2.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 1.1345F, -0.0349F, -0.4363F));

		PartDefinition cube_r142 = bone2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(89, 49).addBox(-0.9997F, -1.1162F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.1309F, -0.0349F, -0.4363F));

		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 43).addBox(-0.9997F, -2.0682F, -0.0642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1018F, 0.0856F, 0.3707F, 0.0F, -0.0349F, -0.4363F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7668F, -0.5392F, -1.2751F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r144 = bone3.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-0.0003F, 1.8049F, -1.4595F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.3963F, 0.0349F, 0.4363F));

		PartDefinition cube_r145 = bone3.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(105, 33).mirror().addBox(-0.0003F, 2.428F, -2.7412F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.0472F, 0.0349F, 0.4363F));

		PartDefinition cube_r146 = bone3.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(105, 12).mirror().addBox(-0.0003F, -0.12F, -4.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -0.3491F, 0.0349F, 0.4363F));

		PartDefinition cube_r147 = bone3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-0.0003F, -2.2518F, -3.6967F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1745F, 0.0349F, 0.4363F));

		PartDefinition cube_r148 = bone3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(108, 87).mirror().addBox(-0.0003F, 0.9723F, -1.5474F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(94, 72).mirror().addBox(-0.0003F, -2.4277F, -0.1474F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, -1.0123F, 0.0349F, 0.4363F));

		PartDefinition cube_r149 = bone3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-0.5F, -1.3F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.5887F, 1.2056F, -0.0029F, 0.1134F, 0.0349F, 0.0F));

		PartDefinition cube_r150 = bone3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(40, 99).mirror().addBox(-0.5F, -1.1F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6019F, 2.4713F, 1.4039F, 0.2882F, 0.0302F, 0.0175F));

		PartDefinition cube_r151 = bone3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(62, 52).mirror().addBox(-0.5F, 1.5F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 71).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.514F, 1.365F, -2.1428F, 0.1137F, 0.0302F, 0.0175F));

		PartDefinition cube_r152 = bone3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 26).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4862F, 2.9304F, -3.3873F, -1.4575F, 0.0337F, -0.009F));

		PartDefinition cube_r153 = bone3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(10, 109).mirror().addBox(-0.7998F, -6.7179F, 2.2968F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, 3.124F, 0.0337F, 0.0957F));

		PartDefinition cube_r154 = bone3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(105, 78).mirror().addBox(-0.7998F, -0.83F, 6.8258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -2.0422F, 0.0337F, 0.0957F));

		PartDefinition cube_r155 = bone3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(105, 75).mirror().addBox(-0.7998F, 4.2008F, 4.9299F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -1.3266F, 0.0337F, 0.0957F));

		PartDefinition cube_r156 = bone3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(105, 66).mirror().addBox(-0.7998F, 6.2576F, 0.7434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -0.6634F, 0.0337F, 0.0957F));

		PartDefinition cube_r157 = bone3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(65, 98).mirror().addBox(-0.7998F, 5.12F, -1.2804F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -0.3492F, 0.0337F, 0.0957F));

		PartDefinition cube_r158 = bone3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-0.7998F, 2.5261F, -0.536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -0.4888F, 0.0337F, 0.0957F));

		PartDefinition cube_r159 = bone3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.7974F, -2.9786F, -0.5126F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.9486F, 5.7827F, 4.739F, -2.4997F, -0.0885F, 0.0609F));

		PartDefinition cube_r160 = bone3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.8953F, -2.7689F, -0.809F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.1065F, 4.3328F, 2.768F, -2.3383F, -0.0361F, -0.009F));

		PartDefinition cube_r161 = bone3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(-0.5F, -0.1F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.7065F, 4.3328F, 2.768F, -2.1818F, 0.0337F, -0.009F));

		PartDefinition cube_r162 = bone3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-0.5F, 0.2F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.7258F, 4.1095F, 3.4003F, -2.3389F, 0.0337F, -0.009F));

		PartDefinition cube_r163 = bone3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(98, 86).mirror().addBox(-0.5F, -1.75F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.4438F, 5.9023F, -5.4389F, -0.8554F, 0.0337F, -0.009F));

		PartDefinition cube_r164 = bone3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(61, 91).mirror().addBox(-0.7998F, -0.201F, 0.0271F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -0.6983F, 0.0337F, 0.0957F));

		PartDefinition cube_r165 = bone3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(91, 40).mirror().addBox(-0.7998F, -0.1462F, -0.1598F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.715F, 5.375F, -6.1532F, -0.6285F, 0.0337F, 0.0957F));

		PartDefinition cube_r166 = bone3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(98, 44).mirror().addBox(-0.5F, -0.15F, -0.15F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4451F, 4.1892F, -4.9409F, -0.803F, 0.0337F, -0.009F));

		PartDefinition cube_r167 = bone3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(98, 30).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4862F, 2.9304F, -3.3873F, -0.8903F, 0.0337F, -0.009F));

		PartDefinition cube_r168 = bone3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.514F, 1.365F, -2.1428F, -0.6721F, 0.0337F, -0.009F));

		PartDefinition cube_r169 = bone3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(81, 5).mirror().addBox(-0.5F, -1.0F, -1.125F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5639F, 0.8966F, -0.7132F, -0.4102F, 0.0349F, 0.0F));

		PartDefinition cube_r170 = bone3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.0003F, -2.0655F, -1.9211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0698F, 0.0349F, 0.4363F));

		PartDefinition cube_r171 = bone3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.0003F, 1.4367F, 0.0667F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 1.7104F, 0.0349F, 0.4363F));

		PartDefinition cube_r172 = bone3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(40, 109).mirror().addBox(-0.0003F, 2.6741F, 2.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 1.1345F, 0.0349F, 0.4363F));

		PartDefinition cube_r173 = bone3.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(89, 49).mirror().addBox(-0.0003F, -1.1162F, 0.002F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.1309F, 0.0349F, 0.4363F));

		PartDefinition cube_r174 = bone3.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(64, 43).mirror().addBox(-0.0003F, -2.0682F, -0.0642F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1018F, 0.0856F, 0.3707F, 0.0F, 0.0349F, 0.4363F));

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