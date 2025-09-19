package fossils.fossils.client.blockentity.model.nothosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NothosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart Neckbase;
	private final ModelPart Neckmiddlebase;
	private final ModelPart Neckmiddlefront;
	private final ModelPart Neckfront;
	private final ModelPart Head;
	private final ModelPart Lowerjawback;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart Bellyflab;
	private final ModelPart FrontFlipperR3;
	private final ModelPart leftArm2;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart rightArm2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public NothosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.chest = this.Bodyfront.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.chest.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.Neckbase = this.chest.getChild("Neckbase");
		this.Neckmiddlebase = this.Neckbase.getChild("Neckmiddlebase");
		this.Neckmiddlefront = this.Neckmiddlebase.getChild("Neckmiddlefront");
		this.Neckfront = this.Neckmiddlefront.getChild("Neckfront");
		this.Head = this.Neckfront.getChild("Head");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.Bellyflab = this.Hips.getChild("Bellyflab");
		this.FrontFlipperR3 = this.Hips.getChild("FrontFlipperR3");
		this.leftArm2 = this.FrontFlipperR3.getChild("leftArm2");
		this.FrontFlipperMiddleR3 = this.leftArm2.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperR2 = this.Hips.getChild("FrontFlipperR2");
		this.rightArm2 = this.FrontFlipperR2.getChild("rightArm2");
		this.FrontFlipperMiddleR2 = this.rightArm2.getChild("FrontFlipperMiddleR2");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone4 = this.Hips.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(67, 104).addBox(0.0F, -3.6286F, 13.9468F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6F, 1.0F, -0.1736F, 0.0804F, 0.4293F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(70, 104).addBox(0.0F, -2.0009F, -0.0765F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6323F, 16.0205F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(64, 104).addBox(0.0F, -2.1009F, -0.1765F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4282F, 12.1259F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(61, 104).addBox(0.0F, -2.2009F, -0.4765F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3392F, 10.4282F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(58, 104).addBox(0.0F, -2.3009F, -0.0765F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2136F, 8.0315F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(104, 55).addBox(0.0F, -2.2009F, 0.5235F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0775F, 5.4351F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 78).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3569F, -1.6238F, 16.5476F, 0.022F, -0.0826F, -0.2049F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 29).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3569F, -1.5238F, 14.5476F, 0.0748F, 0.1471F, -0.2211F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-4.2299F, -0.238F, -0.3278F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1544F, -1.3832F, 12.2983F, 0.2197F, 0.3512F, -0.1867F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 10.6239F, 0.2955F, 0.3939F, 0.049F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 10.6239F, 0.0934F, 0.4723F, -0.4249F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 72).mirror().addBox(-5.2479F, -3.2346F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 10.6239F, -0.1527F, 0.4577F, -0.9629F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(78, 17).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 8.6239F, 0.2955F, 0.3939F, 0.049F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 90).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 8.6239F, 0.0934F, 0.4723F, -0.4249F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-6.2479F, -3.2346F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -1.2786F, 8.6239F, -0.1527F, 0.4577F, -0.9629F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-7.2479F, -3.2346F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, -1.1786F, 6.6239F, -0.1527F, 0.4577F, -0.928F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 70).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, -1.1786F, 6.6239F, 0.0934F, 0.4723F, -0.39F));

		PartDefinition cube_r12 = Hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, -1.1786F, 6.6239F, 0.2955F, 0.3939F, 0.0839F));

		PartDefinition cube_r13 = Hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 78).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3569F, -1.6238F, 16.5476F, 0.022F, 0.0826F, 0.2049F));

		PartDefinition cube_r14 = Hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 29).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3569F, -1.5238F, 14.5476F, 0.0748F, -0.1471F, 0.2211F));

		PartDefinition cube_r15 = Hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(70, 32).addBox(0.2299F, -0.238F, -0.3278F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1544F, -1.3832F, 12.2983F, 0.2197F, -0.3512F, 0.1867F));

		PartDefinition cube_r16 = Hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 72).addBox(3.2479F, -3.2346F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 10.6239F, -0.1527F, -0.4577F, 0.9629F));

		PartDefinition cube_r17 = Hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 22).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 10.6239F, 0.0934F, -0.4723F, 0.4249F));

		PartDefinition cube_r18 = Hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 78).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 10.6239F, 0.2955F, -0.3939F, -0.049F));

		PartDefinition cube_r19 = Hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 15).addBox(3.2479F, -3.2346F, -0.6081F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 8.6239F, -0.1527F, -0.4577F, 0.9629F));

		PartDefinition cube_r20 = Hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 90).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 8.6239F, 0.0934F, -0.4723F, 0.4249F));

		PartDefinition cube_r21 = Hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 17).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -1.2786F, 8.6239F, 0.2955F, -0.3939F, -0.049F));

		PartDefinition cube_r22 = Hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(25, 76).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, -1.1786F, 6.6239F, 0.2955F, -0.3939F, -0.0839F));

		PartDefinition cube_r23 = Hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(90, 70).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, -1.1786F, 6.6239F, 0.0934F, -0.4723F, 0.39F));

		PartDefinition cube_r24 = Hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(71, 0).addBox(3.2479F, -3.2346F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, -1.1786F, 6.6239F, -0.1527F, -0.4577F, 0.928F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.7009F, -0.4765F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0775F, 5.4351F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(29, 7).addBox(-2.5F, -2.0009F, 0.0235F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.298F, 6.0696F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3768F, 5.0552F, -0.0042F, -0.1716F, -0.0275F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(55, 104).addBox(-1.024F, -2.2869F, -0.1241F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.4161F, -0.9542F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(104, 17).addBox(-1.024F, -2.1869F, -0.0241F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.3428F, -3.053F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(10, 104).addBox(-1.024F, -2.1869F, -0.1241F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, 0.2765F, -4.9518F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Bodymiddle.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 21).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2983F, -0.2313F, -0.037F, 0.3803F, -0.9158F));

		PartDefinition cube_r26 = Bodymiddle.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2983F, -0.2313F, 0.1507F, 0.3524F, -0.4018F));

		PartDefinition cube_r27 = Bodymiddle.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(78, 11).mirror().addBox(-2.7299F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2983F, -0.2313F, 0.2889F, 0.2632F, 0.0469F));

		PartDefinition cube_r28 = Bodymiddle.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 67).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -2.2313F, -0.0603F, 0.3568F, -0.9328F));

		PartDefinition cube_r29 = Bodymiddle.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(87, 89).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -2.2313F, 0.1184F, 0.3426F, -0.4215F));

		PartDefinition cube_r30 = Bodymiddle.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(78, 9).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -2.2313F, 0.2561F, 0.2675F, 0.0296F));

		PartDefinition cube_r31 = Bodymiddle.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -4.2313F, -0.0453F, 0.3464F, -0.9277F));

		PartDefinition cube_r32 = Bodymiddle.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(80, 89).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -4.2313F, 0.1259F, 0.3266F, -0.419F));

		PartDefinition cube_r33 = Bodymiddle.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 78).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.0983F, -4.2313F, 0.2556F, 0.2501F, 0.0295F));

		PartDefinition cube_r34 = Bodymiddle.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(78, 11).addBox(-0.2701F, -0.238F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2983F, -0.2313F, 0.2889F, -0.2632F, -0.0469F));

		PartDefinition cube_r35 = Bodymiddle.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 90).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2983F, -0.2313F, 0.1507F, -0.3524F, 0.4018F));

		PartDefinition cube_r36 = Bodymiddle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(67, 21).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2983F, -0.2313F, -0.037F, -0.3803F, 0.9158F));

		PartDefinition cube_r37 = Bodymiddle.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 9).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -2.2313F, 0.2561F, -0.2675F, -0.0296F));

		PartDefinition cube_r38 = Bodymiddle.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(87, 89).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -2.2313F, 0.1184F, -0.3426F, 0.4215F));

		PartDefinition cube_r39 = Bodymiddle.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(13, 67).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -2.2313F, -0.0603F, -0.3568F, 0.9328F));

		PartDefinition cube_r40 = Bodymiddle.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(9, 78).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -4.2313F, 0.2556F, -0.2501F, -0.0295F));

		PartDefinition cube_r41 = Bodymiddle.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(80, 89).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -4.2313F, 0.1259F, -0.3266F, 0.419F));

		PartDefinition cube_r42 = Bodymiddle.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 67).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.0983F, -4.2313F, -0.0453F, -0.3464F, 0.9277F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(27, 15).addBox(-3.5F, -1.9F, 0.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 6.7783F, -6.1035F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = Bodymiddle.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(34, 55).addBox(-1.524F, -0.8619F, 5.4759F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(1.024F, 0.0461F, -11.5478F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(1.024F, 0.0461F, -6.0478F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(60, 66).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -0.1835F, -0.0453F, 0.3464F, -0.9277F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(73, 89).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -0.1835F, 0.1259F, 0.3266F, -0.419F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 7).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -0.1835F, 0.2556F, 0.2501F, 0.0295F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(26, 65).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -2.1835F, -0.0453F, 0.3464F, -0.9277F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -2.1835F, 0.1259F, 0.3266F, -0.419F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(78, 5).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -2.1835F, 0.2556F, 0.2501F, 0.0295F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -4.1835F, 0.2556F, 0.2501F, 0.0295F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -4.1835F, 0.1259F, 0.3266F, -0.419F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(26, 63).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4763F, -0.1479F, -4.1835F, -0.0453F, 0.3464F, -0.9277F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(60, 66).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -0.1835F, -0.0453F, -0.3464F, 0.9277F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(73, 89).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -0.1835F, 0.1259F, -0.3266F, 0.419F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(78, 7).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -0.1835F, 0.2556F, -0.2501F, -0.0295F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 65).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -2.1835F, -0.0453F, -0.3464F, 0.9277F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 68).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -2.1835F, 0.1259F, -0.3266F, 0.419F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(78, 5).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -2.1835F, 0.2556F, -0.2501F, -0.0295F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 78).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -4.1835F, 0.2556F, -0.2501F, -0.0295F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(89, 66).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -4.1835F, 0.1259F, -0.3266F, 0.419F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(26, 63).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5718F, -0.1479F, -4.1835F, -0.0453F, -0.3464F, 0.9277F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(104, 13).addBox(-1.024F, -2.1619F, 4.4759F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 9).addBox(-1.024F, -2.0869F, 2.4759F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 84).addBox(-1.024F, -1.9869F, 0.4759F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 36).addBox(-3.524F, 4.6381F, 0.4759F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.002F))
				.texOffs(54, 13).addBox(-1.524F, -0.8619F, -0.5241F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(55, 46).addBox(-0.51F, -0.5686F, -5.9474F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(25, 105).addBox(-0.01F, -1.5686F, -4.9474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 105).addBox(-0.01F, -1.5686F, -2.9474F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 68).addBox(-0.01F, -1.6686F, -0.9474F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.014F, -0.3038F, -6.0503F, 0.0277F, -0.1742F, -0.0112F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 19).mirror().addBox(-7.2479F, -3.2346F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -4.1331F, -0.1057F, 0.3877F, -0.9493F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 89).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -4.1331F, 0.0952F, 0.3903F, -0.4298F));

		PartDefinition cube_r63 = Bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -4.1331F, 0.2577F, 0.3198F, 0.0301F));

		PartDefinition cube_r64 = Bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(54, 21).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -2.1331F, -0.0603F, 0.3568F, -0.9328F));

		PartDefinition cube_r65 = Bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 64).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -2.1331F, 0.1184F, 0.3426F, -0.4215F));

		PartDefinition cube_r66 = Bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -2.1331F, 0.2561F, 0.2675F, 0.0296F));

		PartDefinition cube_r67 = Bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(67, 23).mirror().addBox(-8.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -0.1331F, -0.098F, 0.3826F, -0.9465F));

		PartDefinition cube_r68 = Bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(89, 54).mirror().addBox(-4.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -0.1331F, 0.0992F, 0.3823F, -0.4283F));

		PartDefinition cube_r69 = Bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(67, 77).mirror().addBox(-2.7299F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4622F, 0.1559F, -0.1331F, 0.2575F, 0.3111F, 0.03F));

		PartDefinition cube_r70 = Bodyfront.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(76, 77).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -4.1331F, 0.2577F, -0.3198F, -0.0301F));

		PartDefinition cube_r71 = Bodyfront.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 89).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -4.1331F, 0.0952F, -0.3903F, 0.4298F));

		PartDefinition cube_r72 = Bodyfront.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(69, 19).addBox(3.2479F, -3.2346F, -0.6081F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -4.1331F, -0.1057F, -0.3877F, 0.9493F));

		PartDefinition cube_r73 = Bodyfront.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(75, 71).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -2.1331F, 0.2561F, -0.2675F, -0.0296F));

		PartDefinition cube_r74 = Bodyfront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(89, 64).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -2.1331F, 0.1184F, -0.3426F, 0.4215F));

		PartDefinition cube_r75 = Bodyfront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(54, 21).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -2.1331F, -0.0603F, -0.3568F, 0.9328F));

		PartDefinition cube_r76 = Bodyfront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(67, 77).addBox(-0.2701F, -0.2379F, -0.6278F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -0.1331F, 0.2535F, -0.1803F, -0.0291F));

		PartDefinition cube_r77 = Bodyfront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(89, 54).addBox(2.3745F, -1.3694F, -0.6081F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -0.1331F, 0.1553F, -0.2627F, 0.4105F));

		PartDefinition cube_r78 = Bodyfront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(67, 23).addBox(3.2479F, -3.2346F, -0.6081F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4422F, 0.1559F, -0.1331F, 0.0132F, -0.304F, 0.909F));

		PartDefinition chest = Bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0617F, -5.8807F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(46, 89).mirror().addBox(-1.6538F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.5942F, -4.5525F, 0.2609F, 0.4158F, 0.0312F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(104, 27).mirror().addBox(-2.4105F, -0.8862F, -0.3684F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.5942F, -4.5525F, 0.0503F, 0.4772F, -0.4487F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(46, 91).mirror().addBox(-2.2322F, -0.2403F, -0.5793F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0622F, 0.1942F, -2.5525F, 0.26F, 0.3896F, 0.0309F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(88, 31).mirror().addBox(-3.9221F, -1.1612F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0622F, 0.1942F, -2.5525F, 0.0629F, 0.4535F, -0.443F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(7, 76).mirror().addBox(-5.9428F, -2.841F, -0.5632F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0622F, 0.1942F, -2.5525F, -0.168F, 0.4276F, -0.9741F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(78, 13).mirror().addBox(-2.6303F, -0.2384F, -0.6181F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, 0.0942F, -0.4525F, 0.2606F, 0.4071F, 0.0311F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(89, 56).mirror().addBox(-4.284F, -1.3277F, -0.5991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, 0.0942F, -0.4525F, 0.0545F, 0.4693F, -0.4468F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(67, 30).mirror().addBox(-7.1869F, -3.1559F, -0.5991F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2622F, 0.0942F, -0.4525F, -0.184F, 0.4374F, -0.9808F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(89, 56).addBox(2.284F, -1.3277F, -0.5991F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, 0.0942F, -0.4525F, 0.0545F, -0.4693F, 0.4468F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(67, 30).addBox(3.1869F, -3.1559F, -0.5991F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, 0.0942F, -0.4525F, -0.184F, -0.4374F, 0.9808F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(46, 89).addBox(-0.3462F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.5942F, -4.5525F, 0.2609F, -0.4158F, -0.0312F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(104, 27).addBox(1.4105F, -0.8862F, -0.3684F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.5942F, -4.5525F, 0.0503F, -0.4772F, 0.4487F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(46, 91).addBox(0.2322F, -0.2403F, -0.5793F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0422F, 0.1942F, -2.5525F, 0.26F, -0.3896F, -0.0309F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(88, 31).addBox(1.9221F, -1.1612F, -0.5632F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0422F, 0.1942F, -2.5525F, 0.0629F, -0.4535F, 0.443F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(7, 76).addBox(2.9428F, -2.841F, -0.5632F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0422F, 0.1942F, -2.5525F, -0.168F, -0.4276F, 0.9741F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(78, 13).addBox(-0.3697F, -0.2384F, -0.6181F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2422F, 0.0942F, -0.4525F, 0.2606F, -0.4071F, -0.0311F));

		PartDefinition Bodyfront_r1 = chest.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(105, 24).addBox(-0.01F, -1.1949F, -0.0657F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3486F, -1.0152F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = chest.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(16, 105).addBox(-0.01F, -1.0699F, 0.0343F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, -3.1159F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(13, 105).addBox(-0.01F, -0.8449F, -0.0657F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1992F, -5.0174F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(60, 54).addBox(-0.51F, -0.1949F, -0.0658F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = chest.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(83, 26).addBox(-3.2824F, -0.05F, 0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(53, 73).addBox(-3.7824F, -0.05F, 0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.2724F, 3.8774F, -4.7194F, -0.2087F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6679F, 5.2345F, 0.4368F, 0.0F, 0.0F, -0.1222F));

		PartDefinition Bodyfront_r6 = bone.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(9, 69).addBox(-1.6607F, -0.7866F, -1.9558F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6877F, -0.1707F, 1.2161F, -0.5191F, 0.9331F, -0.5299F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(97, 70).addBox(-2.2F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.1881F, -1.0189F, 0.0596F, -0.2084F, -0.0585F, -0.3879F));

		PartDefinition Bodyfront_r8 = bone.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(69, 11).addBox(-2.2F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(2.1881F, -1.0189F, 0.0596F, -0.2189F, -0.3144F, -0.3315F));

		PartDefinition Bodyfront_r9 = bone.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(69, 15).addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1881F, -1.0189F, 0.0596F, -0.2106F, 0.1549F, -0.4332F));

		PartDefinition Bodyfront_r10 = bone.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(39, 63).addBox(0.0683F, -1.2015F, -4.5163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.4F, 0.0F, 1.5F, -0.2089F, -0.0927F, -0.3806F));

		PartDefinition Bodyfront_r11 = bone.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(81, 31).addBox(0.061F, -0.5748F, -0.9291F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.7827F, -1.3862F, -3.0199F, -0.2281F, -1.161F, -0.1409F));

		PartDefinition Bodyfront_r12 = bone.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(71, 2).addBox(-0.139F, 0.0752F, -0.7291F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7821F, -1.7012F, -1.8318F, 1.6017F, -0.8663F, -1.4613F));

		PartDefinition Bodyfront_r13 = bone.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(50, 33).addBox(-0.314F, -0.8498F, -0.7291F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7821F, -1.7012F, -1.8318F, 1.6222F, -1.1715F, -1.4852F));

		PartDefinition Bodyfront_r14 = bone.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(60, 61).addBox(-1.4F, -0.5F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5696F, 0.0268F, 4.1646F, 0.0057F, 0.3134F, 0.133F));

		PartDefinition Bodyfront_r15 = bone.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(44, 72).addBox(-4.0789F, -0.2501F, -1.267F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.8877F, -0.1707F, 2.8161F, -0.0326F, 0.1296F, 0.0156F));

		PartDefinition Bodyfront_r16 = bone.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(0, 63).addBox(-2.7789F, -0.2501F, -2.067F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8877F, -0.1707F, 2.8161F, -0.0645F, 1.045F, -0.036F));

		PartDefinition Bodyfront_r17 = bone.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(18, 69).addBox(-0.239F, -0.5748F, -0.9291F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7827F, -1.3862F, -3.0199F, -0.1263F, -0.7738F, -0.2621F));

		PartDefinition Bodyfront_r18 = bone.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(71, 61).addBox(-3.1929F, -1.0181F, -1.0856F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.2529F, -0.5378F, -2.9967F, -0.15F, -0.1708F, -0.0244F));

		PartDefinition Bodyfront_r19 = bone.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(82, 64).addBox(-0.9F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.8529F, -1.2378F, -2.9967F, -0.1472F, -0.2843F, -0.2171F));

		PartDefinition Bodyfront_r20 = bone.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(18, 72).addBox(-3.192F, -1.0181F, -1.6168F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.2529F, -0.5378F, -2.9967F, -0.151F, -0.2054F, -0.0191F));

		PartDefinition Bodyfront_r21 = bone.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(82, 67).addBox(-0.02F, -0.6243F, -0.1848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3467F, -1.1799F, -4.3966F, -0.1516F, -0.3706F, -0.2034F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6879F, 5.2345F, 0.4368F, 0.0F, 0.0F, 0.1222F));

		PartDefinition Bodyfront_r22 = bone3.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(9, 69).mirror().addBox(-0.3393F, -0.7866F, -1.9558F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.6877F, -0.1707F, 1.2161F, -0.5191F, -0.9331F, 0.5299F));

		PartDefinition Bodyfront_r23 = bone3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(97, 70).mirror().addBox(1.2F, -0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, -1.0189F, 0.0596F, -0.2084F, 0.0585F, 0.3879F));

		PartDefinition Bodyfront_r24 = bone3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(69, 11).mirror().addBox(0.2F, -0.5F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, -1.0189F, 0.0596F, -0.2189F, 0.3144F, 0.3315F));

		PartDefinition Bodyfront_r25 = bone3.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(69, 15).mirror().addBox(-1.0F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1881F, -1.0189F, 0.0596F, -0.2106F, -0.1549F, 0.4332F));

		PartDefinition Bodyfront_r26 = bone3.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-1.0683F, -1.2015F, -4.5163F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 0.0F, 1.5F, -0.2089F, 0.0927F, 0.3806F));

		PartDefinition Bodyfront_r27 = bone3.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-2.061F, -0.5748F, -0.9291F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-1.7827F, -1.3862F, -3.0199F, -0.2281F, 1.161F, 0.1409F));

		PartDefinition Bodyfront_r28 = bone3.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(71, 2).mirror().addBox(-2.861F, 0.0752F, -0.7291F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7821F, -1.7012F, -1.8318F, 1.6017F, 0.8663F, 1.4613F));

		PartDefinition Bodyfront_r29 = bone3.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(50, 33).mirror().addBox(-2.686F, -0.8498F, -0.7291F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7821F, -1.7012F, -1.8318F, 1.6222F, 1.1715F, 1.4852F));

		PartDefinition Bodyfront_r30 = bone3.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(60, 61).mirror().addBox(-0.6F, -0.5F, -1.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.5696F, 0.0268F, 4.1646F, 0.0057F, -0.3134F, -0.133F));

		PartDefinition Bodyfront_r31 = bone3.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(1.0789F, -0.2501F, -1.267F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8877F, -0.1707F, 2.8161F, -0.0326F, -0.1296F, -0.0156F));

		PartDefinition Bodyfront_r32 = bone3.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.2211F, -0.2501F, -2.067F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8877F, -0.1707F, 2.8161F, -0.0645F, -1.045F, 0.036F));

		PartDefinition Bodyfront_r33 = bone3.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(18, 69).mirror().addBox(-1.761F, -0.5748F, -0.9291F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7827F, -1.3862F, -3.0199F, -0.1263F, 0.7738F, 0.2621F));

		PartDefinition Bodyfront_r34 = bone3.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(0.1929F, -1.0181F, -1.0856F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2529F, -0.5378F, -2.9967F, -0.15F, 0.1708F, 0.0244F));

		PartDefinition Bodyfront_r35 = bone3.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-1.1F, -0.5F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.8529F, -1.2378F, -2.9967F, -0.1472F, 0.2843F, 0.2171F));

		PartDefinition Bodyfront_r36 = bone3.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(0.192F, -1.0181F, -1.6168F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.2529F, -0.5378F, -2.9967F, -0.151F, 0.2054F, 0.0191F));

		PartDefinition Bodyfront_r37 = bone3.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-1.98F, -0.6243F, -0.1848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3467F, -1.1799F, -4.3966F, -0.1516F, 0.3706F, 0.2034F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4366F, 2.9831F, 0.9822F, -0.075F, -0.0228F, -1.1773F));

		PartDefinition cube_r95 = armL.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(93, 41).addBox(-0.5F, 0.6F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(94, 6).addBox(-0.5F, 2.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(71, 73).addBox(-0.5F, 2.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(92, 86).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1261F, 3.4269F, 3.2234F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r96 = armL.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(88, 82).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1261F, 6.276F, 5.1581F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r97 = armL.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(92, 74).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1261F, 3.6858F, 4.1893F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r98 = armL.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(93, 78).addBox(-0.5F, -0.175F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1261F, 4.6189F, 3.4217F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r99 = armL.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(36, 88).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1261F, 3.7278F, 1.48F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r100 = armL.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1261F, 3.7278F, 1.48F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r101 = armL.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(93, 33).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1261F, 1.9152F, 0.6348F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r102 = armL.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(93, 45).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1261F, 1.9152F, 0.6348F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r103 = armL.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(34, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0069F)), PartPose.offsetAndRotation(-0.1261F, 2.0895F, 0.3328F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r104 = armL.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(29, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1261F, 3.7278F, 1.48F, 0.6109F, 0.0F, 0.0F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3911F, 5.382F, 6.8533F, 1.4958F, -0.0655F, 0.1708F));

		PartDefinition cube_r105 = armL2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(103, 45).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(103, 42).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0472F, 0.3697F, -0.8013F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r106 = armL2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(103, 36).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(5, 103).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0472F, 3.8319F, 0.149F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r107 = armL2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(37, 96).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0472F, 4.6617F, 0.8134F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r108 = armL2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(25, 102).addBox(-0.5F, 1.4F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0472F, 1.7684F, -1.2624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r109 = armL2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(50, 76).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0472F, 1.7684F, -0.8624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r110 = armL2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(39, 83).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0472F, 1.3684F, 1.3376F, 0.0436F, 0.0F, 0.0F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2924F, 5.2147F, 0.3892F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r111 = armL3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(49, 55).addBox(0.0F, -3.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition armL4 = chest.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4566F, 2.9831F, 0.9822F, 0.0961F, -0.0008F, 0.8728F));

		PartDefinition cube_r112 = armL4.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(44, 93).addBox(-0.5F, 0.6F, -1.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(94, 9).addBox(-0.5F, 2.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(0, 74).addBox(-0.5F, 2.5F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F))
				.texOffs(58, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1261F, 3.4269F, 3.2234F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r113 = armL4.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -2.1F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1261F, 6.276F, 5.1581F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r114 = armL4.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -0.2F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1261F, 3.6858F, 4.1893F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r115 = armL4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(93, 81).addBox(-0.5F, -0.175F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1261F, 4.6189F, 3.4217F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r116 = armL4.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(41, 88).addBox(-0.5F, 0.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1261F, 3.7278F, 1.48F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r117 = armL4.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(17, 92).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1261F, 3.7278F, 1.48F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r118 = armL4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(93, 37).addBox(-0.5F, -2.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1261F, 1.9152F, 0.6348F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r119 = armL4.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(93, 49).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1261F, 1.9152F, 0.6348F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r120 = armL4.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(53, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0069F)), PartPose.offsetAndRotation(0.1261F, 2.0895F, 0.3328F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r121 = armL4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(39, 92).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1261F, 3.7278F, 1.48F, 0.6109F, 0.0F, 0.0F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3911F, 5.382F, 6.8533F, 1.4958F, 0.0655F, -0.1708F));

		PartDefinition cube_r122 = armL5.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(103, 77).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(103, 74).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0472F, 0.3697F, -0.8013F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r123 = armL5.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(103, 39).addBox(-0.5F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(20, 103).addBox(-0.5F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0472F, 3.8319F, 0.149F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r124 = armL5.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0472F, 4.6617F, 0.8134F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r125 = armL5.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 102).addBox(-0.5F, 1.4F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0472F, 1.7684F, -1.2624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r126 = armL5.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(55, 76).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0472F, 1.7684F, -0.8624F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r127 = armL5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(44, 83).addBox(-0.5F, -1.4F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0472F, 1.3684F, 1.3376F, 0.0436F, 0.0F, 0.0F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(59, 33).addBox(0.25F, 0.0F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2924F, 5.2147F, 0.3892F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neckbase = chest.addOrReplaceChild("Neckbase", CubeListBuilder.create().texOffs(38, 46).addBox(-0.51F, -0.7833F, -6.9797F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(101, 104).addBox(-0.01F, -1.4833F, -5.9797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 104).addBox(-0.01F, -1.4833F, -3.9797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 105).addBox(-0.01F, -1.6333F, -1.9797F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5829F, -5.0208F, -0.1508F, -0.1726F, 0.0261F));

		PartDefinition cube_r128 = Neckbase.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(87, 29).mirror().addBox(-1.1538F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.0113F, -5.5317F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r129 = Neckbase.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(86, 52).mirror().addBox(-1.3538F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.0113F, -3.5317F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r130 = Neckbase.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(26, 61).mirror().addBox(-1.6538F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.0113F, -1.5317F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r131 = Neckbase.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(87, 29).addBox(-0.8462F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.0113F, -5.5317F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r132 = Neckbase.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(86, 52).addBox(-0.6462F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.0113F, -3.5317F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r133 = Neckbase.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(26, 61).addBox(-0.3462F, -0.2069F, -0.3802F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.0113F, -1.5317F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition Neckmiddlebase = Neckbase.addOrReplaceChild("Neckmiddlebase", CubeListBuilder.create().texOffs(0, 36).addBox(-0.51F, -0.6006F, -7.8968F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.004F))
				.texOffs(92, 104).addBox(-0.01F, -1.2005F, -6.8968F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 104).addBox(-0.01F, -1.2256F, -4.8968F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 104).addBox(-0.01F, -1.2256F, -2.8968F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 98).addBox(-0.01F, -1.3005F, -0.8968F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1701F, -6.9827F, -0.1826F, -0.2732F, -0.0643F));

		PartDefinition cube_r134 = Neckmiddlebase.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 96).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.1814F, -6.349F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r135 = Neckmiddlebase.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(103, 80).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.1814F, -4.349F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r136 = Neckmiddlebase.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(102, 85).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.1814F, -0.349F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r137 = Neckmiddlebase.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 58).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5622F, 0.1814F, -2.349F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r138 = Neckmiddlebase.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(102, 85).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.1814F, -0.349F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r139 = Neckmiddlebase.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(103, 96).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.1814F, -6.349F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r140 = Neckmiddlebase.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(103, 80).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.1814F, -4.349F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r141 = Neckmiddlebase.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(82, 58).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5422F, 0.1814F, -2.349F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition Neckmiddlefront = Neckmiddlebase.addOrReplaceChild("Neckmiddlefront", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, -0.6078F, -6.9924F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(53, 89).addBox(0.0F, -1.1327F, -6.9924F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 93).addBox(0.0F, -1.1578F, -4.9924F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 104).addBox(0.0F, -1.1578F, -2.9924F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 52).addBox(0.0F, -1.1828F, -0.9924F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -0.0041F, -7.8156F, -0.3359F, -0.3393F, -0.0486F));

		PartDefinition cube_r142 = Neckmiddlefront.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(81, 104).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, 0.1855F, -6.5334F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r143 = Neckmiddlefront.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(76, 104).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, 0.1855F, -4.5334F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r144 = Neckmiddlefront.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(104, 59).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, 0.1855F, -2.5334F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r145 = Neckmiddlefront.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(104, 3).mirror().addBox(-0.6538F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5522F, 0.1855F, -0.5334F, 0.2657F, 0.5466F, 0.0335F));

		PartDefinition cube_r146 = Neckmiddlefront.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(81, 104).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, 0.1855F, -6.5334F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r147 = Neckmiddlefront.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(76, 104).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, 0.1855F, -4.5334F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r148 = Neckmiddlefront.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(104, 59).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, 0.1855F, -2.5334F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition cube_r149 = Neckmiddlefront.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(104, 3).addBox(-0.3462F, -0.2069F, -0.3802F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5522F, 0.1855F, -0.5334F, 0.2657F, -0.5466F, -0.0335F));

		PartDefinition Neckfront = Neckmiddlefront.addOrReplaceChild("Neckfront", CubeListBuilder.create().texOffs(15, 61).addBox(-0.5F, -0.7165F, -3.6284F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F))
				.texOffs(39, 80).addBox(0.0F, -1.315F, -1.6766F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1601F, -7.2464F, -0.1525F, -0.4101F, -0.1428F));

		PartDefinition Neckfront_r1 = Neckfront.addOrReplaceChild("Neckfront_r1", CubeListBuilder.create().texOffs(104, 5).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 7).mirror().addBox(0.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.1849F, -3.1569F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Neckfront_r2 = Neckfront.addOrReplaceChild("Neckfront_r2", CubeListBuilder.create().texOffs(104, 7).addBox(-1.0F, 0.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 5).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.1849F, -3.1569F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Neckfront_r3 = Neckfront.addOrReplaceChild("Neckfront_r3", CubeListBuilder.create().texOffs(14, 80).addBox(0.0F, -0.8155F, -1.0215F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4996F, -2.6551F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neckfront_r4 = Neckfront.addOrReplaceChild("Neckfront_r4", CubeListBuilder.create().texOffs(106, 90).addBox(0.0F, -1.0169F, -1.8733F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 80).addBox(-0.5F, -0.6169F, -1.8733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.0996F, -3.6551F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Head = Neckfront.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4837F, -3.6394F, -0.1158F, -0.2945F, -0.0823F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(99, 12).addBox(-2.0F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(1.5F, -0.3973F, -14.8531F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 99).addBox(-2.0F, -0.175F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5F, -0.2148F, -16.2392F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(99, 9).addBox(-2.0F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.5F, -0.3424F, -15.551F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(35, 68).addBox(-2.0F, -0.925F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.5F, 0.2831F, -12.0958F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(99, 6).addBox(-1.5F, -0.1F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, -0.9215F, -9.8712F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(79, 34).addBox(-0.5F, -1.0845F, -8.7903F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -1.6485F, -2.9146F, 0.2313F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(87, 16).addBox(-1.0F, -0.7225F, -7.0324F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.6485F, -2.9146F, 0.1789F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(87, 13).addBox(-1.0F, 0.2444F, -6.2543F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(70, 42).addBox(-1.0F, 0.2444F, -5.4543F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.6485F, -2.9146F, 0.0218F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(70, 38).addBox(-1.0F, -0.0063F, -3.7255F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.6485F, -2.9146F, 0.0916F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(86, 91).addBox(-0.5F, -1.075F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.14F)), PartPose.offsetAndRotation(0.0F, -0.2469F, -2.5118F, 0.8552F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(80, 60).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.6477F, -2.8274F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(40, 36).addBox(-0.5F, -0.9F, -7.9F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(0.0F, 0.9042F, -4.6119F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(32, 80).addBox(-0.5F, 0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, -0.3485F, -2.9146F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(70, 34).addBox(-1.0F, -0.103F, -1.9697F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(89, 98).addBox(-0.5F, -0.2616F, -1.1766F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -1.6485F, -2.9146F, 0.144F, 0.0F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8093F, 0.2268F, 1.021F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r1 = Lowerjawback.addOrReplaceChild("Lowerjawback_r1", CubeListBuilder.create().texOffs(82, 54).mirror().addBox(0.0284F, -0.5481F, 2.8053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-3.4027F, 0.1443F, -2.0492F, -0.0698F, -0.0698F, 0.0F));

		PartDefinition Lowerjawback_r2 = Lowerjawback.addOrReplaceChild("Lowerjawback_r2", CubeListBuilder.create().texOffs(64, 98).mirror().addBox(-0.1048F, 1.8685F, -1.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2443F, -1.8492F, -1.1999F, -0.2269F, 0.0F));

		PartDefinition Lowerjawback_r3 = Lowerjawback.addOrReplaceChild("Lowerjawback_r3", CubeListBuilder.create().texOffs(75, 67).mirror().addBox(-0.1048F, -0.3445F, -2.5897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2443F, -1.8492F, -0.1963F, -0.2269F, 0.0F));

		PartDefinition Lowerjawback_r4 = Lowerjawback.addOrReplaceChild("Lowerjawback_r4", CubeListBuilder.create().texOffs(97, 21).mirror().addBox(-0.5F, -0.4947F, 0.3451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 98).mirror().addBox(-0.5F, -0.5197F, -0.2549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3645F, -0.2083F, -6.0387F, 0.0087F, -0.0873F, -0.5061F));

		PartDefinition Lowerjawback_r5 = Lowerjawback.addOrReplaceChild("Lowerjawback_r5", CubeListBuilder.create().texOffs(96, 89).mirror().addBox(-0.4696F, -1.2169F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(103, 48).mirror().addBox(-0.4696F, -1.5919F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(104, 0).mirror().addBox(-0.4696F, -1.9669F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.3527F, -1.4807F, -15.2242F, 0.8431F, -0.4557F, -0.8596F));

		PartDefinition Lowerjawback_r6 = Lowerjawback.addOrReplaceChild("Lowerjawback_r6", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.3334F, -0.8668F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3527F, -1.4807F, -15.2242F, 0.9028F, -0.268F, -1.0273F));

		PartDefinition Lowerjawback_r7 = Lowerjawback.addOrReplaceChild("Lowerjawback_r7", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-0.3354F, -0.8407F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(94, 61).mirror().addBox(-0.3354F, -1.2157F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(102, 101).mirror().addBox(-0.3354F, -1.5907F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.367F, -1.4139F, -15.0188F, 0.6399F, -0.4651F, -0.7978F));

		PartDefinition Lowerjawback_r8 = Lowerjawback.addOrReplaceChild("Lowerjawback_r8", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(-0.2943F, -0.4693F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.367F, -1.4139F, -15.0188F, 0.718F, -0.311F, -1.003F));

		PartDefinition Lowerjawback_r9 = Lowerjawback.addOrReplaceChild("Lowerjawback_r9", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.4367F, -1.7978F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(96, 67).mirror().addBox(-0.4367F, -1.4228F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(98, 31).mirror().addBox(-0.4367F, -1.0478F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.6156F, -1.1299F, -14.0359F, 0.6335F, -0.7249F, -0.7033F));

		PartDefinition Lowerjawback_r10 = Lowerjawback.addOrReplaceChild("Lowerjawback_r10", CubeListBuilder.create().texOffs(101, 87).mirror().addBox(-0.3424F, -0.6947F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.6156F, -1.1299F, -14.0359F, 0.7746F, -0.5659F, -0.9364F));

		PartDefinition Lowerjawback_r11 = Lowerjawback.addOrReplaceChild("Lowerjawback_r11", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-0.2838F, -0.637F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -1.048F, -13.666F, 0.4268F, -0.247F, -0.8666F));

		PartDefinition Lowerjawback_r12 = Lowerjawback.addOrReplaceChild("Lowerjawback_r12", CubeListBuilder.create().texOffs(40, 100).mirror().addBox(-0.3658F, -1.3809F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(100, 24).mirror().addBox(-0.3658F, -1.0059F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.775F, -1.048F, -13.666F, 0.3581F, -0.3409F, -0.6308F));

		PartDefinition Lowerjawback_r13 = Lowerjawback.addOrReplaceChild("Lowerjawback_r13", CubeListBuilder.create().texOffs(20, 100).mirror().addBox(-0.1189F, -1.6822F, -1.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-1.4527F, -0.3307F, -11.9742F, 0.2232F, -0.3638F, -0.4507F));

		PartDefinition Lowerjawback_r14 = Lowerjawback.addOrReplaceChild("Lowerjawback_r14", CubeListBuilder.create().texOffs(82, 101).mirror().addBox(0.1194F, -1.2335F, -1.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4527F, -0.3307F, -11.9742F, 0.3049F, -0.2997F, -0.7002F));

		PartDefinition Lowerjawback_r15 = Lowerjawback.addOrReplaceChild("Lowerjawback_r15", CubeListBuilder.create().texOffs(12, 91).mirror().addBox(-0.4388F, -1.1487F, -1.4039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4068F, -0.5274F, -11.4849F, -0.0235F, -0.4516F, -0.4269F));

		PartDefinition Lowerjawback_r16 = Lowerjawback.addOrReplaceChild("Lowerjawback_r16", CubeListBuilder.create().texOffs(98, 76).mirror().addBox(-0.5009F, -0.9997F, -0.7826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4068F, -0.5274F, -11.4849F, -0.0225F, -0.5389F, -0.4289F));

		PartDefinition Lowerjawback_r17 = Lowerjawback.addOrReplaceChild("Lowerjawback_r17", CubeListBuilder.create().texOffs(74, 98).mirror().addBox(-0.45F, -1.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 98).mirror().addBox(-0.45F, -1.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6062F, -0.2557F, -10.9457F, -0.0216F, -0.4691F, -0.4307F));

		PartDefinition Lowerjawback_r18 = Lowerjawback.addOrReplaceChild("Lowerjawback_r18", CubeListBuilder.create().texOffs(102, 82).mirror().addBox(-0.575F, -0.525F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(102, 71).mirror().addBox(-0.575F, -0.475F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1734F, -0.6975F, -9.8452F, 0.0533F, -0.3127F, -0.312F));

		PartDefinition Lowerjawback_r19 = Lowerjawback.addOrReplaceChild("Lowerjawback_r19", CubeListBuilder.create().texOffs(102, 68).mirror().addBox(-0.55F, -0.625F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(54, 96).mirror().addBox(-0.55F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(96, 53).mirror().addBox(-0.55F, -0.525F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.2751F, -0.4757F, -8.3412F, -0.1067F, -0.0387F, -0.347F));

		PartDefinition Lowerjawback_r20 = Lowerjawback.addOrReplaceChild("Lowerjawback_r20", CubeListBuilder.create().texOffs(50, 102).mirror().addBox(-0.5F, -0.5019F, -1.4455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(45, 102).mirror().addBox(-0.5F, -0.5019F, -0.8455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3645F, -0.2083F, -6.0387F, -0.1134F, -0.0873F, -0.5061F));

		PartDefinition Lowerjawback_r21 = Lowerjawback.addOrReplaceChild("Lowerjawback_r21", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(0.169F, -0.818F, -4.4157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2443F, -1.8492F, 0.0524F, -0.0873F, 0.0F));

		PartDefinition Lowerjawback_r22 = Lowerjawback.addOrReplaceChild("Lowerjawback_r22", CubeListBuilder.create().texOffs(102, 21).mirror().addBox(-0.6869F, -1.9033F, -0.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0527F, -0.7307F, -14.1742F, 0.9687F, -0.1222F, 0.0F));

		PartDefinition Lowerjawback_r23 = Lowerjawback.addOrReplaceChild("Lowerjawback_r23", CubeListBuilder.create().texOffs(103, 33).mirror().addBox(-0.6869F, -0.7543F, -1.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(103, 30).mirror().addBox(-0.6869F, -0.7543F, -0.8146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0527F, -0.7307F, -14.1742F, -0.2967F, -0.1222F, 0.0F));

		PartDefinition Lowerjawback_r24 = Lowerjawback.addOrReplaceChild("Lowerjawback_r24", CubeListBuilder.create().texOffs(26, 67).mirror().addBox(-0.2129F, -0.7018F, -2.8119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4527F, -0.3307F, -11.9742F, -0.1745F, -0.384F, 0.0F));

		PartDefinition Lowerjawback_r25 = Lowerjawback.addOrReplaceChild("Lowerjawback_r25", CubeListBuilder.create().texOffs(18, 75).mirror().addBox(-0.3698F, -0.7623F, -1.7574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0027F, -0.0557F, -10.5492F, -0.1396F, -0.4712F, 0.0F));

		PartDefinition Lowerjawback_r26 = Lowerjawback.addOrReplaceChild("Lowerjawback_r26", CubeListBuilder.create().texOffs(94, 15).mirror().addBox(-0.1724F, -0.9187F, -1.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 12).mirror().addBox(-0.1724F, -0.9187F, -0.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-2.5027F, 0.2443F, -9.6492F, -0.1396F, -0.3142F, 0.0F));

		PartDefinition Lowerjawback_r27 = Lowerjawback.addOrReplaceChild("Lowerjawback_r27", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-0.7724F, -0.6906F, -2.7824F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(67, 25).addBox(3.5778F, -0.6906F, -2.7824F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.9027F, 0.2443F, -7.0492F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Lowerjawback_r28 = Lowerjawback.addOrReplaceChild("Lowerjawback_r28", CubeListBuilder.create().texOffs(48, 67).mirror().addBox(0.169F, -0.2285F, -5.4644F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2443F, -1.8492F, -0.0873F, -0.0873F, 0.0F));

		PartDefinition Lowerjawback_r29 = Lowerjawback.addOrReplaceChild("Lowerjawback_r29", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-0.1048F, -0.4423F, -2.9262F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-3.3027F, 0.2443F, -1.8492F, -0.0524F, -0.2269F, 0.0F));

		PartDefinition Lowerjawback_r30 = Lowerjawback.addOrReplaceChild("Lowerjawback_r30", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(0.0284F, -0.3443F, 0.0295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4027F, 0.1443F, -2.0492F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Lowerjawback_r31 = Lowerjawback.addOrReplaceChild("Lowerjawback_r31", CubeListBuilder.create().texOffs(82, 54).addBox(-1.0284F, -0.5481F, 2.8053F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.4027F, 0.1443F, -2.0492F, -0.0698F, 0.0698F, 0.0F));

		PartDefinition Lowerjawback_r32 = Lowerjawback.addOrReplaceChild("Lowerjawback_r32", CubeListBuilder.create().texOffs(64, 98).addBox(-0.8952F, 1.8685F, -1.644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(3.3027F, 0.2443F, -1.8492F, -1.1999F, 0.2269F, 0.0F));

		PartDefinition Lowerjawback_r33 = Lowerjawback.addOrReplaceChild("Lowerjawback_r33", CubeListBuilder.create().texOffs(75, 67).addBox(-0.8952F, -0.3445F, -2.5897F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.3027F, 0.2443F, -1.8492F, -0.1963F, 0.2269F, 0.0F));

		PartDefinition Lowerjawback_r34 = Lowerjawback.addOrReplaceChild("Lowerjawback_r34", CubeListBuilder.create().texOffs(97, 21).addBox(-0.5F, -0.4947F, 0.3451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 98).addBox(-0.5F, -0.5197F, -0.2549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3645F, -0.2083F, -6.0387F, 0.0087F, 0.0873F, 0.5061F));

		PartDefinition Lowerjawback_r35 = Lowerjawback.addOrReplaceChild("Lowerjawback_r35", CubeListBuilder.create().texOffs(96, 89).addBox(-0.5304F, -1.2169F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(103, 48).addBox(-0.5304F, -1.5919F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(104, 0).addBox(-0.5304F, -1.9669F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.3527F, -1.4807F, -15.2242F, 0.8431F, 0.4557F, 0.8596F));

		PartDefinition Lowerjawback_r36 = Lowerjawback.addOrReplaceChild("Lowerjawback_r36", CubeListBuilder.create().texOffs(88, 95).addBox(-0.6666F, -0.8668F, -0.6948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3527F, -1.4807F, -15.2242F, 0.9028F, 0.268F, 1.0273F));

		PartDefinition Lowerjawback_r37 = Lowerjawback.addOrReplaceChild("Lowerjawback_r37", CubeListBuilder.create().texOffs(68, 95).addBox(-0.6646F, -0.8407F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(94, 61).addBox(-0.6646F, -1.2157F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(102, 101).addBox(-0.6646F, -1.5907F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.367F, -1.4139F, -15.0188F, 0.6399F, 0.4651F, 0.7978F));

		PartDefinition Lowerjawback_r38 = Lowerjawback.addOrReplaceChild("Lowerjawback_r38", CubeListBuilder.create().texOffs(103, 93).addBox(-0.7057F, -0.4693F, -0.3815F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.367F, -1.4139F, -15.0188F, 0.718F, 0.311F, 1.003F));

		PartDefinition Lowerjawback_r39 = Lowerjawback.addOrReplaceChild("Lowerjawback_r39", CubeListBuilder.create().texOffs(40, 103).addBox(-0.5633F, -1.7978F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(96, 67).addBox(-0.5633F, -1.4228F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(98, 31).addBox(-0.5633F, -1.0478F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.6156F, -1.1299F, -14.0359F, 0.6335F, 0.7249F, 0.7033F));

		PartDefinition Lowerjawback_r40 = Lowerjawback.addOrReplaceChild("Lowerjawback_r40", CubeListBuilder.create().texOffs(101, 87).addBox(-0.6576F, -0.6947F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.6156F, -1.1299F, -14.0359F, 0.7746F, 0.5659F, 0.9364F));

		PartDefinition Lowerjawback_r41 = Lowerjawback.addOrReplaceChild("Lowerjawback_r41", CubeListBuilder.create().texOffs(87, 101).addBox(-0.7162F, -0.637F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.775F, -1.048F, -13.666F, 0.4268F, 0.247F, 0.8666F));

		PartDefinition Lowerjawback_r42 = Lowerjawback.addOrReplaceChild("Lowerjawback_r42", CubeListBuilder.create().texOffs(40, 100).addBox(-0.6342F, -1.3809F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(100, 24).addBox(-0.6342F, -1.0059F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.775F, -1.048F, -13.666F, 0.3581F, 0.3409F, 0.6308F));

		PartDefinition Lowerjawback_r43 = Lowerjawback.addOrReplaceChild("Lowerjawback_r43", CubeListBuilder.create().texOffs(20, 100).addBox(-0.8811F, -1.6822F, -1.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.4527F, -0.3307F, -11.9742F, 0.2232F, 0.3638F, 0.4507F));

		PartDefinition Lowerjawback_r44 = Lowerjawback.addOrReplaceChild("Lowerjawback_r44", CubeListBuilder.create().texOffs(82, 101).addBox(-1.1194F, -1.2335F, -1.5096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4527F, -0.3307F, -11.9742F, 0.3049F, 0.2997F, 0.7002F));

		PartDefinition Lowerjawback_r45 = Lowerjawback.addOrReplaceChild("Lowerjawback_r45", CubeListBuilder.create().texOffs(12, 91).addBox(-0.5612F, -1.1487F, -1.4039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4068F, -0.5274F, -11.4849F, -0.0235F, 0.4516F, 0.4269F));

		PartDefinition Lowerjawback_r46 = Lowerjawback.addOrReplaceChild("Lowerjawback_r46", CubeListBuilder.create().texOffs(98, 76).addBox(-0.4991F, -0.9997F, -0.7826F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4068F, -0.5274F, -11.4849F, -0.0225F, 0.5389F, 0.4289F));

		PartDefinition Lowerjawback_r47 = Lowerjawback.addOrReplaceChild("Lowerjawback_r47", CubeListBuilder.create().texOffs(74, 98).addBox(-0.55F, -1.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 98).addBox(-0.55F, -1.15F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6062F, -0.2557F, -10.9457F, -0.0216F, 0.4691F, 0.4307F));

		PartDefinition Lowerjawback_r48 = Lowerjawback.addOrReplaceChild("Lowerjawback_r48", CubeListBuilder.create().texOffs(102, 82).addBox(-0.425F, -0.525F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(102, 71).addBox(-0.425F, -0.475F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.1734F, -0.6975F, -9.8452F, 0.0533F, 0.3127F, 0.312F));

		PartDefinition Lowerjawback_r49 = Lowerjawback.addOrReplaceChild("Lowerjawback_r49", CubeListBuilder.create().texOffs(102, 68).addBox(-0.45F, -0.625F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(54, 96).addBox(-0.45F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(96, 53).addBox(-0.45F, -0.525F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.2751F, -0.4757F, -8.3412F, -0.1067F, 0.0387F, 0.347F));

		PartDefinition Lowerjawback_r50 = Lowerjawback.addOrReplaceChild("Lowerjawback_r50", CubeListBuilder.create().texOffs(50, 102).addBox(-0.5F, -0.5019F, -1.4455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 102).addBox(-0.5F, -0.5019F, -0.8455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.3645F, -0.2083F, -6.0387F, -0.1134F, 0.0873F, 0.5061F));

		PartDefinition Lowerjawback_r51 = Lowerjawback.addOrReplaceChild("Lowerjawback_r51", CubeListBuilder.create().texOffs(43, 75).addBox(-1.169F, -0.818F, -4.4157F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3027F, 0.2443F, -1.8492F, 0.0524F, 0.0873F, 0.0F));

		PartDefinition Lowerjawback_r52 = Lowerjawback.addOrReplaceChild("Lowerjawback_r52", CubeListBuilder.create().texOffs(102, 21).addBox(-0.3131F, -1.9033F, -0.6025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0527F, -0.7307F, -14.1742F, 0.9687F, 0.1222F, 0.0F));

		PartDefinition Lowerjawback_r53 = Lowerjawback.addOrReplaceChild("Lowerjawback_r53", CubeListBuilder.create().texOffs(103, 33).addBox(-0.3131F, -0.7543F, -1.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(103, 30).addBox(-0.3131F, -0.7543F, -0.8146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0527F, -0.7307F, -14.1742F, -0.2967F, 0.1222F, 0.0F));

		PartDefinition Lowerjawback_r54 = Lowerjawback.addOrReplaceChild("Lowerjawback_r54", CubeListBuilder.create().texOffs(26, 67).addBox(-0.787F, -0.7018F, -2.8119F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4527F, -0.3307F, -11.9742F, -0.1745F, 0.384F, 0.0F));

		PartDefinition Lowerjawback_r55 = Lowerjawback.addOrReplaceChild("Lowerjawback_r55", CubeListBuilder.create().texOffs(18, 75).addBox(-0.6302F, -0.7623F, -1.7574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0027F, -0.0557F, -10.5492F, -0.1396F, 0.4712F, 0.0F));

		PartDefinition Lowerjawback_r56 = Lowerjawback.addOrReplaceChild("Lowerjawback_r56", CubeListBuilder.create().texOffs(94, 15).addBox(-0.8276F, -0.9187F, -1.2248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 12).addBox(-0.8276F, -0.9187F, -0.7998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(2.5027F, 0.2443F, -9.6492F, -0.1396F, 0.3142F, 0.0F));

		PartDefinition Lowerjawback_r57 = Lowerjawback.addOrReplaceChild("Lowerjawback_r57", CubeListBuilder.create().texOffs(48, 67).addBox(-1.169F, -0.2285F, -5.4644F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(3.3027F, 0.2443F, -1.8492F, -0.0873F, 0.0873F, 0.0F));

		PartDefinition Lowerjawback_r58 = Lowerjawback.addOrReplaceChild("Lowerjawback_r58", CubeListBuilder.create().texOffs(69, 6).addBox(-0.8952F, -0.4423F, -2.9262F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(3.3027F, 0.2443F, -1.8492F, -0.0524F, 0.2269F, 0.0F));

		PartDefinition Lowerjawback_r59 = Lowerjawback.addOrReplaceChild("Lowerjawback_r59", CubeListBuilder.create().texOffs(0, 69).addBox(-1.0284F, -0.3443F, 0.0295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4027F, 0.1443F, -2.0492F, 0.0F, 0.0698F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(79, 46).addBox(0.9102F, 0.5887F, -2.9941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.8826F, -0.4866F, -3.423F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(81, 79).addBox(0.0682F, -1.2303F, 0.6801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, -1.2449F, 0.7244F, -0.5224F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(79, 38).addBox(0.865F, -1.2303F, 0.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, -1.0281F, 0.5943F, -0.1714F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(7, 80).addBox(-1.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1174F, -0.4349F, -6.4482F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(30, 99).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5826F, 0.7071F, -12.8947F, 0.583F, 0.2709F, 0.1452F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(25, 99).addBox(-1.8F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(0.6424F, 0.0893F, -11.4302F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(99, 27).addBox(-1.8F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6424F, 0.1442F, -12.128F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7089F, 0.4321F, -10.5148F, 0.048F, -0.0523F, -0.0031F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(5, 100).addBox(-0.65F, -0.35F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1275F, -0.2951F, -5.983F, -0.136F, -0.1847F, 1.3511F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(99, 98).addBox(-0.1F, -0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3059F, -0.8347F, -6.3672F, 0.3971F, -0.5623F, 1.2844F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(35, 99).addBox(-0.3389F, -0.4905F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(0.3382F, 0.0601F, -5.7996F, 0.107F, 0.315F, 0.7074F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(97, 73).addBox(-0.575F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.0383F, 0.2338F, -7.7638F, 0.2364F, -0.8116F, 0.5771F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(98, 40).addBox(-0.7F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1416F, 0.322F, -7.5626F, 0.162F, -0.0398F, 0.7436F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(89, 98).addBox(-0.5F, -0.5875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(84, 98).addBox(-0.5F, -0.4625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.339F, -0.1457F, -5.6025F, 0.1186F, -0.1854F, 0.7948F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(98, 37).addBox(-0.7078F, -0.4462F, -0.5428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3382F, 0.0601F, -5.7996F, 0.0296F, -0.2478F, 0.9553F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(0, 102).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.2792F, -0.0374F, -5.2079F, 0.2592F, 1.4252F, 0.958F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(92, 101).addBox(-0.6495F, -0.5035F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4786F, 0.1899F, -5.5323F, 0.1461F, 0.9025F, 0.7575F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(98, 34).addBox(-0.6333F, -0.4914F, -0.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2343F, -0.0032F, -5.595F, -0.0083F, -0.0396F, 0.9424F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(77, 101).addBox(-0.1F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1812F, -0.9165F, -4.8531F, -0.213F, 0.3064F, 1.2941F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(72, 101).addBox(-0.65F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1064F, -0.3505F, -5.2732F, -0.0111F, 0.0331F, 1.3524F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(25, 80).addBox(-0.75F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0091F, -0.4986F, -3.9543F, -0.0142F, 0.0243F, -0.9082F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(66, 68).addBox(-0.8F, -0.1F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1326F, -0.0458F, -8.9087F, 0.0486F, 0.1656F, 0.0074F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(99, 18).addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3826F, 0.341F, -8.5454F, 0.1749F, 0.1304F, 0.0142F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(81, 91).addBox(-0.8053F, -1.7053F, -0.3734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1367F, 0.6303F, -10.5665F, 1.5869F, 0.1746F, -0.0046F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(80, 19).addBox(-0.65F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0436F, -0.1361F, -2.3952F, -0.0563F, -0.2584F, 0.6338F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(99, 59).addBox(-0.8691F, -0.5569F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4336F, 1.164F, -13.3002F, 0.5617F, 0.9324F, 0.955F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(101, 90).addBox(-0.5273F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(97, 84).addBox(-0.2273F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4336F, 1.164F, -13.3002F, 0.7645F, 0.7971F, 1.2202F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(99, 56).addBox(-0.4754F, 0.0028F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0772F, 0.5561F, -11.8817F, 0.1439F, 0.8919F, 0.7717F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(67, 101).addBox(-0.0217F, -0.0632F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(59, 98).addBox(0.3783F, -0.0632F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0772F, 0.5561F, -11.8817F, 0.3913F, 0.8335F, 1.096F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(96, 92).addBox(0.4557F, -0.2023F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(42, 97).addBox(0.0557F, -0.2023F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2522F, 0.6311F, -11.4067F, 0.5202F, 0.4625F, 0.9293F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(15, 102).addBox(-0.3696F, -0.1162F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2522F, 0.6311F, -11.4067F, 0.4102F, 0.5609F, 0.7056F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(30, 102).addBox(-0.5571F, -0.0714F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0228F, 0.5561F, -10.6317F, 0.1926F, 0.6751F, 0.9365F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(52, 99).addBox(-0.1176F, -0.118F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(49, 96).addBox(0.2824F, -0.118F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0228F, 0.5561F, -10.6317F, 0.3517F, 0.616F, 1.1998F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(47, 99).addBox(-0.3304F, -0.003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3478F, 0.5561F, -9.3817F, 0.1926F, 0.6751F, 0.9365F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(101, 65).addBox(0.1185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.3478F, 0.5561F, -9.3817F, 0.3517F, 0.616F, 1.1998F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(76, 91).addBox(-0.8053F, -0.3053F, -0.3734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0945F, 0.6337F, -10.4759F, 1.5386F, 0.1921F, 0.0086F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(90, 24).addBox(-1.1F, -0.625F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5687F, 0.4633F, -8.3836F, 1.7416F, 0.0092F, 0.6383F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(24, 90).addBox(-0.8F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5687F, 0.4633F, -8.3836F, 1.6692F, 0.5568F, 0.6896F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(71, 91).addBox(0.0879F, -4.9767F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7092F, 1.0708F, -4.4947F, 1.309F, 0.5061F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(49, 86).addBox(-1.8F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1111F, 0.5913F, -7.405F, 0.3532F, 0.374F, 0.6823F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(98, 79).addBox(0.5185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(98, 46).addBox(0.1185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3978F, 0.981F, -7.2567F, 0.4839F, 0.4406F, 1.1588F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(96, 64).addBox(-0.525F, -0.2F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.7951F, 1.3285F, -2.2986F, 0.0298F, -0.04F, 0.7981F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(20, 97).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4667F, 1.4482F, -1.8366F, 0.056F, -0.04F, 0.7981F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(32, 96).addBox(-0.65F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.9062F, 1.4174F, -3.1429F, -0.0036F, 0.1315F, 0.8307F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(27, 96).addBox(-0.425F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5136F, 1.4158F, -3.9623F, 0.0662F, 0.1315F, 0.8307F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(79, 98).addBox(-0.575F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6783F, 1.4785F, -4.3715F, 0.0123F, -0.0229F, 0.8014F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(98, 49).addBox(-0.375F, -0.55F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4789F, 1.4042F, -4.7256F, 0.1048F, 0.2343F, 0.8508F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(85, 75).addBox(-1.2F, -0.175F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.6579F, 1.1046F, -5.637F, 0.2035F, 0.4055F, 0.8869F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(78, 86).addBox(-1.3F, -0.3F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 86).addBox(-1.3F, -0.225F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.4808F, 1.2075F, -6.4725F, 0.378F, 0.4055F, 0.8869F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(98, 43).addBox(-0.3304F, -0.003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3978F, 0.981F, -7.2567F, 0.3786F, 0.5322F, 0.9346F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(97, 101).addBox(-0.0746F, -0.556F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7786F, 1.423F, -7.9821F, 0.5117F, 0.5861F, 1.1083F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(71, 86).addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0174F, 0.8846F, -8.7563F, 0.3072F, 0.6979F, 1.1759F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(87, 19).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2523F, 0.9834F, -8.2973F, 0.2107F, 0.6067F, 0.9896F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(86, 49).addBox(-1.4287F, -0.5188F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.7786F, 1.423F, -7.9821F, 0.3984F, 0.6631F, 0.915F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(99, 15).addBox(0.0879F, -0.8273F, -3.6063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7092F, 1.0708F, -4.4947F, 0.0524F, 0.5061F, 0.0F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(70, 46).addBox(-1.8F, -0.2F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.6194F, 0.6507F, -5.9157F, 0.1923F, 0.274F, 0.7306F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(74, 79).addBox(-0.4223F, -0.572F, -3.1866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7092F, 1.0708F, -4.4947F, -0.0349F, 0.3316F, 0.0F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(36, 73).addBox(-0.799F, -1.7949F, -1.6661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7097F, 0.6709F, -4.4878F, -0.0641F, 0.0326F, -0.8556F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(67, 79).addBox(-0.799F, -0.5949F, -1.6661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7092F, 1.0708F, -4.4947F, -0.0175F, 0.0698F, 0.0F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(70, 50).addBox(-1.8F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7102F, 0.7343F, -3.552F, -0.0519F, 0.0467F, 0.7318F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(79, 50).addBox(-0.5F, -0.775F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4102F, 1.3637F, -2.7941F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(43, 79).addBox(-0.1834F, -0.468F, -3.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4284F, 0.1677F, 0.1633F, 0.2684F, 0.112F, -0.0972F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(79, 42).addBox(-0.2338F, -0.468F, -1.6409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4284F, 0.1677F, 0.1633F, 0.2676F, 0.0784F, -0.1065F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(57, 68).addBox(-0.663F, -0.0793F, -2.7895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1971F, -1.0043F, 2.5984F, 0.2665F, 0.1804F, -0.0884F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(82, 0).addBox(0.6448F, -0.0996F, -3.0573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.1346F, 0.4731F, -0.0795F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(50, 82).addBox(0.6448F, -0.1823F, -1.3103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0648F, 0.4731F, -0.0795F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(60, 76).addBox(1.2855F, -0.3503F, -1.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0066F, 0.6845F, 0.0409F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(18, 79).addBox(1.2855F, -0.2879F, -2.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0765F, 0.6845F, 0.0409F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-1.9102F, 0.5887F, -2.9941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-0.8826F, -0.4866F, -3.423F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(81, 79).mirror().addBox(-1.0682F, -1.2303F, 0.6801F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, -1.2449F, -0.7244F, 0.5224F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(79, 38).mirror().addBox(-1.865F, -1.2303F, 0.5117F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.8F, -1.0281F, -0.5943F, 0.1714F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(0.0F, -0.1F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1174F, -0.4349F, -6.4482F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(30, 99).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5826F, 0.7071F, -12.8947F, 0.583F, -0.2709F, -0.1452F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(25, 99).mirror().addBox(0.8F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(-0.6424F, 0.0893F, -11.4302F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(99, 27).mirror().addBox(0.8F, -0.125F, -0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.6424F, 0.1442F, -12.128F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.7089F, 0.4321F, -10.5148F, 0.048F, 0.0523F, 0.0031F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(-0.35F, -0.35F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1275F, -0.2951F, -5.983F, -0.136F, 0.1847F, -1.3511F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(99, 98).mirror().addBox(-0.9F, -0.1F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3059F, -0.8347F, -6.3672F, 0.3971F, 0.5623F, -1.2844F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.6611F, -0.4905F, -0.4271F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(-0.3382F, 0.0601F, -5.7996F, 0.107F, -0.315F, -0.7074F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(97, 73).mirror().addBox(-0.425F, -0.6F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.0383F, 0.2338F, -7.7638F, 0.2364F, 0.8116F, -0.5771F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(98, 40).mirror().addBox(-0.3F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1416F, 0.322F, -7.5626F, 0.162F, 0.0398F, -0.7436F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(89, 98).mirror().addBox(-0.5F, -0.5875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 98).mirror().addBox(-0.5F, -0.4625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.339F, -0.1457F, -5.6025F, 0.1186F, 0.1854F, -0.7948F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(98, 37).mirror().addBox(-0.2922F, -0.4462F, -0.5428F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.3382F, 0.0601F, -5.7996F, 0.0296F, 0.2478F, -0.9553F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-0.2792F, -0.0374F, -5.2079F, 0.2592F, -1.4252F, -0.958F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(92, 101).mirror().addBox(-0.3505F, -0.5035F, -0.4244F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4786F, 0.1899F, -5.5323F, 0.1461F, -0.9025F, -0.7575F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(98, 34).mirror().addBox(-0.3667F, -0.4914F, -0.1832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2343F, -0.0032F, -5.595F, -0.0083F, 0.0396F, -0.9424F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(77, 101).mirror().addBox(-0.9F, -0.1F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1812F, -0.9165F, -4.8531F, -0.213F, -0.3064F, -1.2941F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(72, 101).mirror().addBox(-0.35F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1064F, -0.3505F, -5.2732F, -0.0111F, -0.0331F, -1.3524F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(-0.25F, -0.15F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0091F, -0.4986F, -3.9543F, -0.0142F, -0.0243F, 0.9082F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(66, 68).mirror().addBox(-0.2F, -0.1F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1326F, -0.0458F, -8.9087F, 0.0486F, -0.1656F, -0.0074F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(99, 18).mirror().addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3826F, 0.341F, -8.5454F, 0.1749F, -0.1304F, -0.0142F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(81, 91).mirror().addBox(-0.1947F, -1.7053F, -0.3734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1367F, 0.6303F, -10.5665F, 1.5869F, -0.1746F, 0.0046F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-0.35F, -0.525F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0436F, -0.1361F, -2.3952F, -0.0563F, 0.2584F, -0.6338F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-0.1309F, -0.5569F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4336F, 1.164F, -13.3002F, 0.5617F, -0.9324F, -0.955F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(101, 90).mirror().addBox(-0.4727F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(97, 84).mirror().addBox(-0.7727F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4336F, 1.164F, -13.3002F, 0.7645F, -0.7971F, -1.2202F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(99, 56).mirror().addBox(-0.5246F, 0.0028F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0772F, 0.5561F, -11.8817F, 0.1439F, -0.8919F, -0.7717F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(67, 101).mirror().addBox(-0.9783F, -0.0632F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 98).mirror().addBox(-1.3783F, -0.0632F, -0.5592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0772F, 0.5561F, -11.8817F, 0.3913F, -0.8335F, -1.096F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(96, 92).mirror().addBox(-1.4557F, -0.2023F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(42, 97).mirror().addBox(-1.0557F, -0.2023F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2522F, 0.6311F, -11.4067F, 0.5202F, -0.4625F, -0.9293F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(15, 102).mirror().addBox(-0.6304F, -0.1162F, -0.4329F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2522F, 0.6311F, -11.4067F, 0.4102F, -0.5609F, -0.7056F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-0.4429F, -0.0714F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.5561F, -10.6317F, 0.1926F, -0.6751F, -0.9365F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(52, 99).mirror().addBox(-0.8824F, -0.118F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 96).mirror().addBox(-1.2824F, -0.118F, -0.203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0228F, 0.5561F, -10.6317F, 0.3517F, -0.616F, -1.1998F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(47, 99).mirror().addBox(-0.6696F, -0.003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3478F, 0.5561F, -9.3817F, 0.1926F, -0.6751F, -0.9365F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(101, 65).mirror().addBox(-1.1185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.3478F, 0.5561F, -9.3817F, 0.3517F, -0.616F, -1.1998F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(76, 91).mirror().addBox(-0.1947F, -0.3053F, -0.3734F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0945F, 0.6337F, -10.4759F, 1.5386F, -0.1921F, -0.0086F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(0.1F, -0.625F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5687F, 0.4633F, -8.3836F, 1.7416F, -0.0092F, -0.6383F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(-0.2F, -1.0F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5687F, 0.4633F, -8.3836F, 1.6692F, -0.5568F, -0.6896F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(71, 91).mirror().addBox(-1.0879F, -4.9767F, -1.2366F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 1.0708F, -4.4947F, 1.309F, -0.5061F, 0.0F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(49, 86).mirror().addBox(-0.2F, -0.2F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1111F, 0.5913F, -7.405F, 0.3532F, -0.374F, -0.6823F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(98, 79).mirror().addBox(-1.5185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(98, 46).mirror().addBox(-1.1185F, -0.1003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3978F, 0.981F, -7.2567F, 0.4839F, -0.4406F, -1.1588F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(96, 64).mirror().addBox(-0.475F, -0.2F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.7951F, 1.3285F, -2.2986F, 0.0298F, 0.04F, -0.7981F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(20, 97).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4667F, 1.4482F, -1.8366F, 0.056F, 0.04F, -0.7981F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(32, 96).mirror().addBox(-0.35F, -0.2F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.9062F, 1.4174F, -3.1429F, -0.0036F, -0.1315F, -0.8307F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(27, 96).mirror().addBox(-0.575F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5136F, 1.4158F, -3.9623F, 0.0662F, -0.1315F, -0.8307F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(79, 98).mirror().addBox(-0.425F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6783F, 1.4785F, -4.3715F, 0.0123F, 0.0229F, -0.8014F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-0.625F, -0.55F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4789F, 1.4042F, -4.7256F, 0.1048F, -0.2343F, -0.8508F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(85, 75).mirror().addBox(-0.8F, -0.175F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.6579F, 1.1046F, -5.637F, 0.2035F, -0.4055F, -0.8869F));

		PartDefinition Head_r129 = rightFace.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.7F, -0.3F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(64, 86).mirror().addBox(-0.7F, -0.225F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.4808F, 1.2075F, -6.4725F, 0.378F, -0.4055F, -0.8869F));

		PartDefinition Head_r130 = rightFace.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(98, 43).mirror().addBox(-0.6696F, -0.003F, -0.6969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.3978F, 0.981F, -7.2567F, 0.3786F, -0.5322F, -0.9346F));

		PartDefinition Head_r131 = rightFace.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(97, 101).mirror().addBox(-0.9254F, -0.556F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7786F, 1.423F, -7.9821F, 0.5117F, -0.5861F, -1.1083F));

		PartDefinition Head_r132 = rightFace.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(71, 86).mirror().addBox(-1.0F, -0.55F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0174F, 0.8846F, -8.7563F, 0.3072F, -0.6979F, -1.1759F));

		PartDefinition Head_r133 = rightFace.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(87, 19).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2523F, 0.9834F, -8.2973F, 0.2107F, -0.6067F, -0.9896F));

		PartDefinition Head_r134 = rightFace.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(86, 49).mirror().addBox(-0.5713F, -0.5188F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.7786F, 1.423F, -7.9821F, 0.3984F, -0.6631F, -0.915F));

		PartDefinition Head_r135 = rightFace.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(99, 15).mirror().addBox(-1.0879F, -0.8273F, -3.6063F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 1.0708F, -4.4947F, 0.0524F, -0.5061F, 0.0F));

		PartDefinition Head_r136 = rightFace.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(70, 46).mirror().addBox(-0.2F, -0.2F, -1.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.6194F, 0.6507F, -5.9157F, 0.1923F, -0.274F, -0.7306F));

		PartDefinition Head_r137 = rightFace.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.5777F, -0.572F, -3.1866F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 1.0708F, -4.4947F, -0.0349F, -0.3316F, 0.0F));

		PartDefinition Head_r138 = rightFace.addOrReplaceChild("Head_r138", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(-0.201F, -1.7949F, -1.6661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7097F, 0.6709F, -4.4878F, -0.0641F, -0.0326F, 0.8556F));

		PartDefinition Head_r139 = rightFace.addOrReplaceChild("Head_r139", CubeListBuilder.create().texOffs(67, 79).mirror().addBox(-0.201F, -0.5949F, -1.6661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7092F, 1.0708F, -4.4947F, -0.0175F, -0.0698F, 0.0F));

		PartDefinition Head_r140 = rightFace.addOrReplaceChild("Head_r140", CubeListBuilder.create().texOffs(70, 50).mirror().addBox(-0.2F, -0.2F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7102F, 0.7343F, -3.552F, -0.0519F, -0.0467F, -0.7318F));

		PartDefinition Head_r141 = rightFace.addOrReplaceChild("Head_r141", CubeListBuilder.create().texOffs(79, 50).mirror().addBox(-0.5F, -0.775F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4102F, 1.3637F, -2.7941F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r142 = rightFace.addOrReplaceChild("Head_r142", CubeListBuilder.create().texOffs(43, 79).mirror().addBox(-0.8166F, -0.468F, -3.2229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4284F, 0.1677F, 0.1633F, 0.2684F, -0.112F, 0.0972F));

		PartDefinition Head_r143 = rightFace.addOrReplaceChild("Head_r143", CubeListBuilder.create().texOffs(79, 42).mirror().addBox(-0.7662F, -0.468F, -1.6409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4284F, 0.1677F, 0.1633F, 0.2676F, -0.0784F, 0.1065F));

		PartDefinition Head_r144 = rightFace.addOrReplaceChild("Head_r144", CubeListBuilder.create().texOffs(57, 68).mirror().addBox(-0.337F, -0.0793F, -2.7895F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.1971F, -1.0043F, 2.5984F, 0.2665F, -0.1804F, 0.0884F));

		PartDefinition Head_r145 = rightFace.addOrReplaceChild("Head_r145", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-1.6448F, -0.0996F, -3.0573F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.1346F, -0.4731F, 0.0795F));

		PartDefinition Head_r146 = rightFace.addOrReplaceChild("Head_r146", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-1.6448F, -0.1823F, -1.3103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0648F, -0.4731F, 0.0795F));

		PartDefinition Head_r147 = rightFace.addOrReplaceChild("Head_r147", CubeListBuilder.create().texOffs(60, 76).mirror().addBox(-2.2855F, -0.3503F, -1.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0066F, -0.6845F, -0.0409F));

		PartDefinition Head_r148 = rightFace.addOrReplaceChild("Head_r148", CubeListBuilder.create().texOffs(18, 79).mirror().addBox(-2.2855F, -0.2879F, -2.7733F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7F, 3.4F, -0.0765F, -0.6845F, -0.0409F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(50, 24).addBox(-0.5F, -0.6029F, 0.0477F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -1.7775F, 16.8351F, 0.2981F, 0.2162F, 0.0136F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(34, 105).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6029F, 5.0477F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(31, 105).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6029F, 3.0477F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(76, 106).addBox(0.0F, 2.1F, 3.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 63).addBox(0.0F, 0.5F, 1.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(86, 104).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1971F, 1.0477F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(73, 104).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1971F, 1.0477F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(50, 7).mirror().addBox(-4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1029F, 1.0477F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(50, 7).addBox(0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.1029F, 1.0477F, 0.0F, -0.1309F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0501F, 7.0901F, 0.192F, 0.1302F, 0.0136F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(48, 105).addBox(0.0F, -1.2009F, 4.5231F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 55).addBox(-0.5F, -0.6009F, 0.5231F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0717F, -0.5737F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(45, 105).addBox(0.0F, -0.7009F, 0.0231F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5621F, 1.9501F, -0.096F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(37, 105).addBox(0.0F, -0.8009F, 0.0231F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6493F, -0.048F, -0.1134F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1497F, -0.0466F, -0.0441F, 0.1395F, -0.0061F));

		PartDefinition Tailmiddlebase_r5 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(54, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1497F, -0.0466F, -0.0441F, -0.1395F, 0.0061F));

		PartDefinition Tailbase_r7 = Tailmiddlebase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(106, 87).addBox(0.0F, 3.9F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 106).addBox(0.0F, 3.2F, 7.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 106).addBox(0.0F, 2.6F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.147F, -6.0423F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2032F, 5.8289F, 0.1328F, 0.2163F, 0.0287F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(19, 106).addBox(0.0F, -1.0001F, 6.0095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 106).addBox(0.0F, -1.0001F, 4.0095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 106).addBox(0.0F, -1.0001F, 2.0095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 105).addBox(0.0F, -1.0001F, 0.0095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1566F, -0.0156F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(19, 44).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0563F, -0.0148F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(19, 44).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5F, -0.0563F, -0.0148F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition Tailmiddle_r4 = Tailmiddle.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(17, 52).addBox(-0.5F, -0.7001F, 1.0095F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0551F, -1.0379F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(27, 24).addBox(-0.5F, -0.4742F, 0.109F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5258F, 6.783F, -0.0292F, -0.1745F, 0.0051F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(106, 64).addBox(0.0F, -0.525F, 7.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 61).addBox(0.0F, -0.525F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 51).addBox(0.0F, -0.525F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 106).addBox(0.0F, -0.525F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 106).addBox(0.0F, -0.525F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2742F, 1.209F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5003F, 0.007F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0364F, 10.0089F, -0.0787F, -0.4787F, 0.0363F));

		PartDefinition Bellyflab = Hips.addOrReplaceChild("Bellyflab", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 3.8225F, 17.9351F, 0.1274F, 0.0F, 0.0F));

		PartDefinition FrontFlipperR3 = Hips.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7463F, 1.2248F, 16.6202F, -0.1848F, -1.1061F, 1.2483F));

		PartDefinition cube_r150 = FrontFlipperR3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 87).addBox(-0.375F, -0.5F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.847F, -0.1811F, -1.0947F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r151 = FrontFlipperR3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(9, 73).addBox(-1.5F, -0.5F, 0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3593F, -0.1811F, -1.2566F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r152 = FrontFlipperR3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(86, 43).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1055F, -0.1811F, 0.1033F, 0.0F, -2.7489F, 0.0F));

		PartDefinition cube_r153 = FrontFlipperR3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(28, 84).addBox(10.4777F, 3.1028F, 13.2399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.9266F, -3.7839F, -17.5565F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r154 = FrontFlipperR3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(99, 3).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4346F, -0.1811F, -0.4081F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r155 = FrontFlipperR3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(99, 0).addBox(1.3F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(86, 46).addBox(0.05F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.4133F, -0.1811F, -1.5056F, 0.0F, -0.4974F, 0.0F));

		PartDefinition cube_r156 = FrontFlipperR3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(94, 98).addBox(0.05F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(6.4133F, -0.1811F, -1.5056F, 0.0F, -0.1484F, 0.0F));

		PartDefinition cube_r157 = FrontFlipperR3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(73, 54).addBox(-1.5F, -0.5F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4102F, -0.1811F, -0.3331F, 0.0F, 0.0087F, 0.0F));

		PartDefinition cube_r158 = FrontFlipperR3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(86, 40).addBox(-1.975F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(6.4265F, -0.1811F, -1.4984F, 0.0F, 0.0524F, 0.0F));

		PartDefinition cube_r159 = FrontFlipperR3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(86, 37).addBox(-0.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.9337F, -0.1811F, -0.0585F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r160 = FrontFlipperR3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 34).addBox(-2.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9337F, -0.1811F, -0.0585F, 0.0F, 0.0436F, 0.0F));

		PartDefinition leftArm2 = FrontFlipperR3.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1419F, -0.1811F, -0.7551F, 3.1416F, 0.1745F, 0.0F));

		PartDefinition cube_r161 = leftArm2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(74, 83).addBox(-2.1003F, -0.5F, -0.7647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3553F, 0.0F, -2.7468F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r162 = leftArm2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(94, 0).addBox(1.2179F, -0.5F, -0.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(67, 83).addBox(-0.3821F, -0.5F, -0.6765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3553F, 0.0F, -2.7468F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r163 = leftArm2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(14, 83).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1587F, 0.0F, -0.8471F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r164 = leftArm2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(87, 58).addBox(-1.1F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.2287F, 0.0F, -0.7193F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r165 = leftArm2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(22, 94).addBox(0.125F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(95, 24).addBox(-0.375F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.5F, 0.7F, 0.0F, 1.0036F, 0.0F));

		PartDefinition cube_r166 = leftArm2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(0, 99).addBox(0.6F, -1.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.7F, 0.0F, 0.2618F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = leftArm2.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create().texOffs(94, 18).addBox(-1.2116F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(98, 95).addBox(-0.5116F, -0.3972F, -0.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 95).addBox(-1.5116F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(63, 95).addBox(-1.5116F, -0.3972F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(4.5168F, -0.1024F, -4.6567F, -0.0418F, 0.7409F, -0.0591F));

		PartDefinition cube_r167 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 29).addBox(-0.4F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7539F, 0.1028F, -0.0552F, 3.1416F, -0.0087F, 0.0F));

		PartDefinition FrontFlipperR2 = Hips.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7463F, 1.2248F, 16.6202F, 0.12F, 0.7945F, -0.2052F));

		PartDefinition cube_r168 = FrontFlipperR2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(24, 87).addBox(-1.625F, -0.5F, -0.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.847F, -0.1811F, -1.0947F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r169 = FrontFlipperR2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(27, 73).addBox(-1.5F, -0.5F, 0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.3593F, -0.1811F, -1.2566F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r170 = FrontFlipperR2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(87, 10).addBox(-1.0F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.1055F, -0.1811F, 0.1033F, 0.0F, 2.7489F, 0.0F));

		PartDefinition cube_r171 = FrontFlipperR2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 84).addBox(-12.4777F, 3.1028F, 13.2399F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-3.9266F, -3.7839F, -17.5565F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r172 = FrontFlipperR2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 101).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.4346F, -0.1811F, -0.4081F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r173 = FrontFlipperR2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(101, 52).addBox(-2.3F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F))
				.texOffs(87, 7).addBox(-2.05F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.4133F, -0.1811F, -1.5056F, 0.0F, 0.4974F, 0.0F));

		PartDefinition cube_r174 = FrontFlipperR2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(10, 101).addBox(-1.05F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-6.4133F, -0.1811F, -1.5056F, 0.0F, 0.1484F, 0.0F));

		PartDefinition cube_r175 = FrontFlipperR2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 57).addBox(-1.5F, -0.5F, -0.775F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.4102F, -0.1811F, -0.3331F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r176 = FrontFlipperR2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(87, 4).addBox(-0.025F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-6.4265F, -0.1811F, -1.4984F, 0.0F, -0.0524F, 0.0F));

		PartDefinition cube_r177 = FrontFlipperR2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.9337F, -0.1811F, -0.0585F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r178 = FrontFlipperR2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(85, 86).addBox(0.5F, -0.5F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9337F, -0.1811F, -0.0585F, 0.0F, -0.0436F, 0.0F));

		PartDefinition rightArm2 = FrontFlipperR2.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.1419F, -0.1811F, -0.7551F, 3.1416F, -0.1745F, 0.0F));

		PartDefinition cube_r179 = rightArm2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 84).addBox(0.1003F, -0.5F, -0.7647F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.3553F, 0.0F, -2.7468F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r180 = rightArm2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(94, 3).addBox(-2.2179F, -0.5F, -0.6765F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(81, 83).addBox(-1.6179F, -0.5F, -0.6765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3553F, 0.0F, -2.7468F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r181 = rightArm2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(83, 23).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1587F, 0.0F, -0.8471F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r182 = rightArm2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(87, 61).addBox(-0.9F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.2287F, 0.0F, -0.7193F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r183 = rightArm2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(94, 58).addBox(-1.125F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F))
				.texOffs(83, 95).addBox(-0.625F, -1.0F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 0.5F, 0.7F, 0.0F, -1.0036F, 0.0F));

		PartDefinition cube_r184 = rightArm2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(101, 62).addBox(-1.6F, -1.0F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.7F, 0.0F, -0.2618F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = rightArm2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create().texOffs(94, 28).addBox(0.2116F, -0.3972F, -1.3294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 101).addBox(-0.4884F, -0.3972F, -0.7294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(73, 95).addBox(0.5116F, -0.3972F, 0.3706F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 95).addBox(0.5116F, -0.3972F, -0.2294F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-4.5168F, -0.1024F, -4.6567F, -0.0418F, -0.7409F, 0.0591F));

		PartDefinition cube_r185 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(29, 0).addBox(-5.6F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7539F, 0.1028F, -0.0552F, 3.1416F, 0.0087F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0775F, 5.4351F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(76, 25).addBox(-0.5F, -2.0463F, 0.0523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, 0.0524F, 0.0F, -0.3142F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(7, 84).addBox(-0.5F, -1.8859F, 0.0382F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -0.5149F, 0.0F, -0.3142F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(66, 91).addBox(-0.5F, -0.713F, 0.7478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -1.4312F, 0.0F, -0.3142F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(88, 78).addBox(-1.256F, -1.4051F, -1.1279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4761F, 4.8902F, 10.8968F, -1.4433F, -0.3941F, -0.1245F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(61, 89).addBox(-2.2444F, -0.3544F, -1.1279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.4761F, 4.8902F, 10.8968F, -1.4521F, -0.1342F, -0.0913F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(93, 95).addBox(-1.8378F, 0.3531F, -1.1279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4761F, 4.8902F, 10.8968F, -1.4234F, 0.645F, 0.0137F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(15, 96).addBox(-2.3081F, 0.1507F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.9761F, 3.7902F, 10.8968F, -1.4514F, -0.1689F, -0.3573F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(0, 96).addBox(-0.9885F, 0.6568F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9761F, 3.7902F, 10.8968F, -1.4502F, 0.221F, -0.3106F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(12, 86).addBox(-0.9876F, -0.6048F, -1.1279F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.4761F, 4.8902F, 10.8968F, -1.4459F, 0.3423F, -0.0332F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(21, 84).addBox(-1.7909F, 0.1966F, -0.6403F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.9761F, 3.7902F, 10.8968F, -1.4438F, 0.3856F, -0.2892F));

		PartDefinition Hips_r18 = bone2.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(91, 91).addBox(-0.3509F, -1.4976F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1541F, 5.1032F, 6.5694F, -1.4785F, -0.9667F, -0.076F));

		PartDefinition Hips_r19 = bone2.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(85, 70).addBox(-0.2737F, -1.0324F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.1541F, 5.1032F, 6.5694F, -1.5171F, -0.2266F, -0.0121F));

		PartDefinition Hips_r20 = bone2.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(62, 73).addBox(-2.8832F, -1.1526F, -0.8961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.4F, 4.6258F, 7.1201F, -1.4288F, -0.1815F, -0.3574F));

		PartDefinition Hips_r21 = bone2.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(73, 64).addBox(-2.8568F, -0.6891F, -0.8961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4F, 4.6258F, 7.1201F, -1.4223F, -0.3455F, -0.3822F));

		PartDefinition Hips_r22 = bone2.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(78, 73).addBox(-0.5F, -0.638F, 0.6119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -1.9984F, 0.0F, -0.3142F));

		PartDefinition Hips_r23 = bone2.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(7, 89).addBox(-0.5F, 0.5545F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -0.733F, 0.0F, -0.3142F));

		PartDefinition Hips_r24 = bone2.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(56, 87).addBox(-0.5F, -1.3467F, -0.7484F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -0.1658F, 0.0F, -0.3142F));

		PartDefinition Hips_r25 = bone2.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(31, 87).addBox(-0.5F, -1.353F, -0.309F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(4.0F, 1.6677F, 9.1711F, -0.2531F, 0.0F, -0.3142F));

		PartDefinition bone4 = Hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0775F, 5.4351F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(76, 25).mirror().addBox(-0.5F, -2.0463F, 0.0523F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, 0.0524F, 0.0F, 0.3142F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-0.5F, -1.8859F, 0.0382F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -0.5149F, 0.0F, 0.3142F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(66, 91).mirror().addBox(-0.5F, -0.713F, 0.7478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -1.4312F, 0.0F, 0.3142F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(88, 78).mirror().addBox(0.256F, -1.4051F, -1.1279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4761F, 4.8902F, 10.8968F, -1.4433F, 0.3941F, 0.1245F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(61, 89).mirror().addBox(1.2444F, -0.3544F, -1.1279F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4761F, 4.8902F, 10.8968F, -1.4521F, 0.1342F, 0.0913F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(93, 95).mirror().addBox(0.8378F, 0.3531F, -1.1279F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4761F, 4.8902F, 10.8968F, -1.4234F, -0.645F, -0.0137F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(15, 96).mirror().addBox(1.3081F, 0.1507F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.9761F, 3.7902F, 10.8968F, -1.4514F, 0.1689F, 0.3573F));

		PartDefinition Hips_r33 = bone4.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-0.0115F, 0.6568F, -0.6403F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9761F, 3.7902F, 10.8968F, -1.4502F, -0.221F, 0.3106F));

		PartDefinition Hips_r34 = bone4.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-0.0124F, -0.6048F, -1.1279F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.4761F, 4.8902F, 10.8968F, -1.4459F, -0.3423F, 0.0332F));

		PartDefinition Hips_r35 = bone4.addOrReplaceChild("Hips_r35", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-0.2091F, 0.1966F, -0.6403F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.9761F, 3.7902F, 10.8968F, -1.4438F, -0.3856F, 0.2892F));

		PartDefinition Hips_r36 = bone4.addOrReplaceChild("Hips_r36", CubeListBuilder.create().texOffs(91, 91).mirror().addBox(-0.6491F, -1.4976F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1541F, 5.1032F, 6.5694F, -1.4785F, 0.9667F, 0.076F));

		PartDefinition Hips_r37 = bone4.addOrReplaceChild("Hips_r37", CubeListBuilder.create().texOffs(85, 70).mirror().addBox(-0.7263F, -1.0324F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1541F, 5.1032F, 6.5694F, -1.5171F, 0.2266F, 0.0121F));

		PartDefinition Hips_r38 = bone4.addOrReplaceChild("Hips_r38", CubeListBuilder.create().texOffs(62, 73).mirror().addBox(-0.1168F, -1.1526F, -0.8961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.6258F, 7.1201F, -1.4288F, 0.1815F, 0.3574F));

		PartDefinition Hips_r39 = bone4.addOrReplaceChild("Hips_r39", CubeListBuilder.create().texOffs(73, 64).mirror().addBox(-0.1432F, -0.6891F, -0.8961F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4F, 4.6258F, 7.1201F, -1.4223F, 0.3455F, 0.3822F));

		PartDefinition Hips_r40 = bone4.addOrReplaceChild("Hips_r40", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.5F, -0.638F, 0.6119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -1.9984F, 0.0F, 0.3142F));

		PartDefinition Hips_r41 = bone4.addOrReplaceChild("Hips_r41", CubeListBuilder.create().texOffs(7, 89).mirror().addBox(-0.5F, 0.5545F, -0.5129F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -0.733F, 0.0F, 0.3142F));

		PartDefinition Hips_r42 = bone4.addOrReplaceChild("Hips_r42", CubeListBuilder.create().texOffs(56, 87).mirror().addBox(-0.5F, -1.3467F, -0.7484F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -0.1658F, 0.0F, 0.3142F));

		PartDefinition Hips_r43 = bone4.addOrReplaceChild("Hips_r43", CubeListBuilder.create().texOffs(31, 87).mirror().addBox(-0.5F, -1.353F, -0.309F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.6677F, 9.1711F, -0.2531F, 0.0F, 0.3142F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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