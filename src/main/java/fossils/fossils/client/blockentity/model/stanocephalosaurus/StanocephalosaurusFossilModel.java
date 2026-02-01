package fossils.fossils.client.blockentity.model.stanocephalosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StanocephalosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone5;
	private final ModelPart bone2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftBrow;
	private final ModelPart rightBrow;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone7;

	public StanocephalosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone5 = this.forelegL4.getChild("bone5");
		this.bone2 = this.chest.getChild("bone2");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftBrow = this.Head.getChild("leftBrow");
		this.rightBrow = this.Head.getChild("rightBrow");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.tail = this.Tailend.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone7 = this.Hips.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -9.225F, -8.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(11, 68).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(34, 105).addBox(0.5F, -0.2028F, -1.4109F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(34, 105).mirror().addBox(-1.5F, -0.2028F, -1.4109F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -1.0701F, 28.6504F, -0.1255F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(12, 106).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7028F, -1.4109F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(105, 66).addBox(0.0F, -1.1F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6528F, -3.5109F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(32, 36).addBox(-0.5F, -0.8871F, -6.1624F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2076F, -3.2488F, 0.0804F, -0.174F, -0.014F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(97, 103).addBox(0.0F, -1.25F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8121F, -2.2624F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(94, 103).addBox(0.0F, -1.275F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.857F, -6.0647F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 96).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -1.8402F, 0.5438F, 0.0477F, -0.3626F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 96).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -1.8402F, 0.483F, 0.2647F, -0.7466F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(82, 95).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.5438F, 0.0477F, -0.3626F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 95).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.483F, 0.2647F, -0.7466F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 103).mirror().addBox(-3.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.2578F, 0.4865F, -1.3413F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.5948F, 0.0601F, -0.36F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(95, 61).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.5274F, 0.2951F, -0.7345F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(58, 98).mirror().addBox(-4.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.2787F, 0.5356F, -1.3312F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 96).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -1.8402F, 0.5438F, -0.0477F, 0.3626F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 96).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -1.8402F, 0.483F, -0.2647F, 0.7466F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(82, 95).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.5438F, -0.0477F, 0.3626F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 95).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.483F, -0.2647F, 0.7466F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 103).addBox(2.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -3.8402F, 0.2578F, -0.4865F, 1.3413F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(95, 63).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.5948F, -0.0601F, 0.36F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 61).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.5274F, -0.2951F, 0.7345F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 98).addBox(2.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4225F, -5.8402F, 0.2787F, -0.5356F, 1.3312F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(86, 103).addBox(0.0F, -1.2F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8871F, -4.0624F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, -0.8961F, -6.0626F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.016F, -6.1097F, 0.009F, -0.2618F, -0.0023F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(103, 103).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8961F, -2.0626F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(100, 103).addBox(0.0F, -1.25F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0007F, -6.0598F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-4.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.2193F, 0.3878F, -1.2876F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(31, 96).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.3966F, 0.2022F, -0.6966F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.4422F, 0.0221F, -0.2961F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 67).mirror().addBox(-4.4605F, -2.3725F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.2121F, 0.3625F, -1.2379F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(96, 28).mirror().addBox(-3.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.3766F, 0.1849F, -0.6481F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 26).mirror().addBox(-1.4883F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.4174F, 0.0139F, -0.2442F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 24).mirror().addBox(-1.4883F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.3496F, -0.003F, -0.2446F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 96).mirror().addBox(-3.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.3204F, 0.1425F, -0.6573F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(83, 65).mirror().addBox(-5.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.1883F, 0.2964F, -1.2456F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 69).addBox(2.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.2193F, -0.3878F, 1.2876F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(31, 96).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.3966F, -0.2022F, 0.6966F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(96, 30).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -1.7305F, 0.4422F, -0.0221F, 0.2961F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 67).addBox(2.4605F, -2.3725F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.2121F, -0.3625F, 1.2379F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(96, 28).addBox(1.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.3766F, -0.1849F, 0.6481F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 26).addBox(-0.5117F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5065F, -3.7305F, 0.4174F, -0.0139F, 0.2442F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(96, 24).addBox(-0.5117F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.3496F, 0.003F, 0.2446F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(24, 96).addBox(1.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.3204F, -0.1425F, 0.6573F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 65).addBox(2.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6065F, -5.7305F, 0.1883F, -0.2964F, 1.2456F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(23, 82).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8961F, -4.0626F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(0, 38).addBox(-0.4F, -0.9834F, -5.7671F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.088F, -6.2F, 0.0115F, -0.0873F, -0.001F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(104, 53).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.9834F, -1.7671F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(53, 104).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -1.0009F, -5.7635F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(50, 104).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.9834F, -3.7636F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(96, 51).mirror().addBox(-1.4883F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6445F, -1.3305F, 0.3162F, -0.0127F, -0.2967F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 49).mirror().addBox(-3.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6445F, -1.3305F, 0.2934F, 0.1201F, -0.7132F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 21).mirror().addBox(-5.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.6445F, -1.3305F, 0.1781F, 0.263F, -1.3008F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(96, 38).mirror().addBox(-1.4883F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4945F, -3.2305F, 0.3162F, -0.0127F, -0.2618F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 36).mirror().addBox(-3.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4945F, -3.2305F, 0.2935F, 0.1201F, -0.6783F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(21, 86).mirror().addBox(-5.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.4945F, -3.2305F, 0.1781F, 0.263F, -1.2659F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(96, 34).mirror().addBox(-3.3509F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5945F, -5.0305F, 0.279F, 0.1101F, -0.68F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 32).mirror().addBox(-1.494F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5945F, -5.0305F, 0.299F, -0.0161F, -0.2616F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(78, 50).mirror().addBox(-6.4214F, -2.4027F, -0.6243F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.5945F, -5.0305F, 0.1715F, 0.2467F, -1.2676F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(96, 51).addBox(-0.5117F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6445F, -1.3305F, 0.3162F, 0.0127F, 0.2967F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(96, 49).addBox(1.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6445F, -1.3305F, 0.2934F, -0.1201F, 0.7132F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(86, 21).addBox(2.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.6445F, -1.3305F, 0.1781F, -0.263F, 1.3008F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(96, 38).addBox(-0.5117F, 0.0419F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4945F, -3.2305F, 0.3162F, 0.0127F, 0.2618F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(96, 36).addBox(1.3666F, -0.591F, -0.4304F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4945F, -3.2305F, 0.2935F, -0.1201F, 0.6783F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(21, 86).addBox(2.4605F, -2.3725F, -0.4304F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.4945F, -3.2305F, 0.1781F, -0.263F, 1.2659F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(96, 34).addBox(1.3509F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.5945F, -5.0305F, 0.279F, -0.1101F, 0.68F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(96, 32).addBox(-0.506F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.5945F, -5.0305F, 0.299F, 0.0161F, 0.2616F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(78, 50).addBox(2.4214F, -2.4027F, -0.6243F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.5945F, -5.0305F, 0.1715F, -0.2467F, 1.2676F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, -1.0961F, -8.0376F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1076F, -5.7085F, 0.0528F, -0.1307F, -0.0069F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(104, 79).addBox(0.0F, -1.375F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.126F, -2.0213F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(75, 105).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0958F, -4.0236F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(97, 86).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.2396F, -0.0308F, -0.2252F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 97).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.2306F, 0.0724F, -0.6495F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 34).mirror().addBox(-7.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.1519F, 0.1885F, -1.2369F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(97, 79).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.2229F, -0.0365F, -0.1723F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(97, 77).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.2177F, 0.0603F, -0.598F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 55).mirror().addBox(-8.5937F, -2.8618F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.1478F, 0.1714F, -1.1853F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(65, 97).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.2574F, -0.0307F, -0.191F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(46, 97).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.2468F, 0.0798F, -0.6135F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(47, 42).mirror().addBox(-9.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.1613F, 0.2037F, -1.2003F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(47, 40).mirror().addBox(-9.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.1546F, 0.1875F, -1.1841F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(75, 96).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.2323F, 0.07F, -0.5971F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 96).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.2401F, -0.0337F, -0.173F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(97, 86).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.2396F, 0.0308F, 0.2252F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 97).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.2306F, -0.0724F, 0.6495F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(71, 34).addBox(2.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -1.422F, 0.1519F, -0.1885F, 1.2369F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(97, 79).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.2229F, 0.0365F, 0.1723F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(97, 77).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.2177F, -0.0603F, 0.598F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(65, 55).addBox(2.5937F, -2.8618F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6022F, -3.422F, 0.1478F, -0.1714F, 1.1853F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(65, 97).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.2574F, 0.0307F, 0.191F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(46, 97).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.2468F, -0.0798F, 0.6135F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(47, 42).addBox(2.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7772F, -5.522F, 0.1613F, -0.2037F, 1.2003F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(47, 40).addBox(2.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.1546F, -0.1875F, 1.1841F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 96).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.2323F, -0.07F, 0.5971F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(58, 96).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7022F, -7.422F, 0.2401F, 0.0337F, 0.173F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(104, 75).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0961F, -8.0376F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(104, 71).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0961F, -6.0376F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8961F, -9.0626F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1852F, -7.9788F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(105, 10).addBox(0.0F, -1.325F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8959F, -2.0521F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(66, 103).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.896F, -4.0539F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(31, 86).addBox(0.0F, -1.225F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8961F, -8.0626F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(105, 6).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.8961F, -6.0626F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(1.0F, 0.0F, -1.075F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 67).mirror().addBox(0.0F, 0.0F, -1.075F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4348F, 2.4876F, -2.6545F, 3.0016F, 0.4212F, 1.9124F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 105).mirror().addBox(-3.7506F, -0.9228F, -0.1845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 10).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1824F, 0.0349F, -0.6696F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(104, 100).mirror().addBox(-2.5219F, -0.9063F, 1.4183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 95).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1976F, -0.3939F, -0.7527F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(99, 2).mirror().addBox(-4.0079F, -2.8659F, -3.1024F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1585F, 1.0498F, -1.1195F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(98, 12).mirror().addBox(-3.2362F, -2.8722F, -4.2617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.3612F, 1.3466F, -0.9044F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(92, 54).mirror().addBox(0.4328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 2.8103F, 1.157F, 1.5617F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(96, 98).mirror().addBox(-4.5157F, -2.8716F, -3.8949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1475F, 1.0066F, -1.1324F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(99, 4).mirror().addBox(-4.5937F, -2.8429F, -0.1845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 15).mirror().addBox(-8.5937F, -2.8618F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1323F, 0.1306F, -1.2575F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(98, 8).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1802F, -0.045F, -0.2405F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(104, 93).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(98, 6).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2472F, 0.0497F, -0.6312F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(104, 91).mirror().addBox(-2.5219F, -0.9063F, 1.5183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 89).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2656F, -0.3728F, -0.7425F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(89, 98).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2705F, 1.0889F, -0.9856F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(7, 98).mirror().addBox(-3.4862F, -2.8722F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.6603F, 1.3674F, -0.5764F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(92, 3).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 2.7492F, 1.0959F, 1.542F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(24, 94).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2501F, 1.0467F, -1.0089F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(94, 0).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 2).mirror().addBox(-9.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.1786F, 0.1788F, -1.2148F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2454F, -0.0583F, -0.2083F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(105, 57).mirror().addBox(-3.7506F, -0.9228F, -0.2845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 94).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1579F, 0.0237F, -0.6006F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(99, 75).mirror().addBox(-0.7F, 0.0022F, -0.35F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 83).mirror().addBox(-0.7F, -0.0022F, -1.05F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7308F, 0.1061F, -0.6958F, 0.2165F, -0.7496F, -0.7531F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(104, 87).mirror().addBox(0.0F, 0.0F, -0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0899F, 1.6875F, -0.0324F, 0.1253F, 1.0289F, -1.0784F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(78, 103).mirror().addBox(-2.4361F, -2.8721F, -4.0367F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.2727F, 1.3292F, -0.9207F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(104, 85).mirror().addBox(-3.6657F, -2.8716F, -3.9699F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1169F, 0.9855F, -1.0883F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(97, 96).mirror().addBox(-4.5937F, -2.8429F, -0.2845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 0).mirror().addBox(-9.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1181F, 0.1078F, -1.1895F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(97, 88).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1533F, -0.045F, -0.1696F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(72, 98).mirror().addBox(-1.0F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1586F, 1.6936F, -2.046F, 0.0998F, 0.7143F, -1.0881F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 40).mirror().addBox(-4.2907F, -2.8716F, -3.1949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1438F, 1.0176F, -1.031F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(103, 98).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.2F, -0.383F, -0.6491F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(86, 23).mirror().addBox(-5.5937F, -2.8429F, 0.0155F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(58, 37).mirror().addBox(-9.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.129F, 0.1412F, -1.1535F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(86, 71).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 93).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1855F, 0.0455F, -0.5649F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1874F, -0.0367F, -0.1363F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(78, 105).addBox(2.7506F, -0.9228F, -0.1845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 10).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1824F, -0.0349F, 0.6696F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(104, 100).addBox(1.5219F, -0.9063F, 1.4183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 95).addBox(1.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1976F, 0.3939F, 0.7527F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(99, 2).addBox(2.0079F, -2.8659F, -3.1024F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1585F, -1.0498F, 1.1195F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(98, 12).addBox(1.2362F, -2.8722F, -4.2617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.3612F, -1.3466F, 0.9044F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(92, 54).addBox(-1.4328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 2.8103F, -1.157F, -1.5617F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(96, 98).addBox(2.5157F, -2.8716F, -3.8949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1475F, -1.0066F, 1.1324F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(99, 4).addBox(2.5937F, -2.8429F, -0.1845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 15).addBox(2.5937F, -2.8618F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1323F, -0.1306F, 1.2575F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(98, 8).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -7.4432F, 0.1802F, 0.045F, 0.2405F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(104, 93).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 6).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2472F, -0.0497F, 0.6312F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(104, 91).addBox(1.5219F, -0.9063F, 1.5183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 89).addBox(1.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2656F, 0.3728F, 0.7425F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(89, 98).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2705F, -1.0889F, 0.9856F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 98).addBox(1.4862F, -2.8722F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.6603F, -1.3674F, 0.5764F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(92, 3).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 2.7492F, -1.0959F, -1.542F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(24, 94).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2501F, -1.0467F, 1.0089F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(94, 0).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 2).addBox(2.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.1786F, -0.1788F, 1.2148F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 98).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.417F, -5.6432F, 0.2454F, 0.0583F, 0.2083F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(105, 57).addBox(2.7506F, -0.9228F, -0.2845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 94).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1579F, -0.0237F, 0.6006F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(99, 75).addBox(-0.3F, 0.0022F, -0.35F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 83).addBox(-0.3F, -0.0022F, -1.05F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7308F, 0.1061F, -0.6958F, 0.2165F, 0.7496F, 0.7531F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(104, 87).addBox(-1.0F, 0.0F, -0.9F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0899F, 1.6875F, -0.0324F, 0.1253F, -1.0289F, 1.0784F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 103).addBox(1.4361F, -2.8721F, -4.0367F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.2727F, -1.3292F, 0.9207F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(104, 85).addBox(2.6657F, -2.8716F, -3.9699F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1169F, -0.9855F, 1.0883F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(97, 96).addBox(2.5937F, -2.8429F, -0.2845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 0).addBox(2.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1181F, -0.1078F, 1.1895F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(97, 88).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.517F, -1.4432F, 0.1533F, 0.045F, 0.1696F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 15).addBox(-2.0F, 0.0F, -1.075F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 67).addBox(-1.0F, 0.0F, -1.075F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4348F, 2.4876F, -2.6545F, 3.0016F, -0.4212F, -1.9124F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(72, 98).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1586F, 1.6936F, -2.046F, 0.0998F, -0.7143F, 1.0881F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(91, 40).addBox(2.2907F, -2.8716F, -3.1949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1438F, -1.0176F, 1.031F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 0).addBox(1.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 98).addBox(1.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.2F, 0.383F, 0.6491F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(86, 23).addBox(2.5937F, -2.8429F, 0.0155F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 37).addBox(2.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.129F, -0.1412F, 1.1535F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(86, 71).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 93).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1855F, -0.0455F, 0.5649F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 65).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.317F, -3.5432F, 0.1874F, 0.0367F, 0.1363F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(65, 85).addBox(-0.5F, 1.7039F, -0.5626F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.7379F, 6.8026F, -9.9299F, 0.7118F, -0.0197F, -1.3552F));

		PartDefinition cube_r137 = forelegL.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(92, 94).addBox(-0.5F, -1.15F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.1923F, -0.6133F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r138 = forelegL.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(48, 92).addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1923F, -0.6133F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r139 = forelegL.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(31, 98).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.3703F, 0.6047F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r140 = forelegL.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(63, 91).addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.3703F, 0.6047F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r141 = forelegL.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 36).addBox(-0.5F, -1.25F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.6942F, -0.6852F, 0.0884F, -0.01F, -0.0011F));

		PartDefinition cube_r142 = forelegL.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(58, 85).addBox(-0.5F, -0.425F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, 0.2039F, -0.5626F, 0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(65, 99).addBox(-0.5765F, 0.2401F, -0.7116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3612F, 5.9904F, -1.2376F, -1.8442F, 0.4055F, -0.3225F));

		PartDefinition cube_r143 = forelegL2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(103, 38).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 35).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.6366F, 1.4728F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r144 = forelegL2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(14, 96).addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, -0.9094F, 1.3574F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r145 = forelegL2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(19, 94).addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, -0.9094F, 1.3574F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r146 = forelegL2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(48, 86).addBox(-0.5F, -2.2F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(99, 53).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, 0.5401F, -0.5115F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r147 = forelegL2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(103, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0765F, 2.2401F, -0.2116F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2274F, 2.8678F, 1.1763F, 0.0091F, -0.0466F, -0.6116F));

		PartDefinition cube_r148 = bone.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 30).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0039F, -0.0626F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, 1.7039F, -0.5626F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-4.738F, 6.8026F, -9.9299F, -0.692F, -0.0734F, 1.3499F));

		PartDefinition cube_r149 = forelegL3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(95, 20).addBox(-0.5F, -1.15F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.1923F, -0.6133F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r150 = forelegL3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(92, 86).addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1923F, -0.6133F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r151 = forelegL3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(36, 98).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.3703F, 0.6047F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r152 = forelegL3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(92, 77).addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.3703F, 0.6047F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r153 = forelegL3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(14, 90).addBox(-0.5F, -1.25F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.6942F, -0.6852F, 0.0884F, 0.01F, 0.0011F));

		PartDefinition cube_r154 = forelegL3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(86, 7).addBox(-0.5F, -0.425F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, 0.2039F, -0.5626F, 0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(79, 99).addBox(-0.4235F, 0.2401F, -0.7116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3612F, 5.9904F, -1.2376F, -1.2046F, -0.3448F, 0.0341F));

		PartDefinition cube_r155 = forelegL4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(45, 103).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(103, 44).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 1.6366F, 1.4728F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r156 = forelegL4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(98, 40).addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, -0.9094F, 1.3574F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r157 = forelegL4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(41, 95).addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0765F, -0.9094F, 1.3574F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r158 = forelegL4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(31, 90).addBox(-0.5F, -2.2F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(99, 71).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0765F, 0.5401F, -0.5115F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r159 = forelegL4.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(103, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0765F, 2.2401F, -0.2116F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2274F, 2.8678F, 1.1763F, 0.025F, -0.0357F, 0.3923F));

		PartDefinition cube_r160 = bone5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(13, 51).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0039F, -0.0626F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 2.1697F, -10.2017F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r161 = bone2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.8794F, -2.0024F, 2.7941F, 2.8292F, -0.1048F, 0.0038F));

		PartDefinition cube_r162 = bone2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.8582F, -2.9884F, 2.6283F, 1.7384F, -0.1048F, 0.0038F));

		PartDefinition cube_r163 = bone2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(102, 63).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.754F, -3.1254F, 1.6432F, 1.4329F, -0.1048F, 0.0038F));

		PartDefinition cube_r164 = bone2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(27, 80).mirror().addBox(-0.4872F, -1.0544F, -1.7362F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.5795F, -2.379F, -0.1645F, 1.8256F, -0.1048F, 0.0038F));

		PartDefinition cube_r165 = bone2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.4698F, -0.8403F, -1.9776F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.6267F, -0.3506F, -0.3731F, 1.0522F, -0.1019F, 0.0252F));

		PartDefinition cube_r166 = bone2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(103, 50).mirror().addBox(-0.5128F, -0.9691F, -0.6854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5795F, -2.379F, -0.1645F, 1.1362F, -0.1048F, 0.0038F));

		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(85, 73).mirror().addBox(-3.0F, 0.6947F, -0.8104F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(85, 73).addBox(6.0F, 0.6947F, -0.8104F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-4.0F, 5.5339F, 0.0644F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(70, 69).mirror().addBox(-1.9526F, -2.6516F, 0.2431F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.5339F, 3.6394F, 2.0762F, 0.7992F, 0.3972F));

		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 57).mirror().addBox(-2.0813F, -2.2708F, -0.6095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8036F, 7.2614F, -5.1644F, 1.814F, -0.6699F, -0.1624F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-2.1924F, -0.1924F, -0.5468F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.8036F, 7.2614F, -5.1644F, 1.8704F, -0.2432F, -0.0684F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-2.5586F, -1.4882F, -2.311F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.5339F, 0.0644F, 0.3027F, -0.1605F, -0.2028F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.5F, -2.025F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0471F, 6.6635F, -0.9015F, 0.2873F, -0.1383F, -0.1288F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(89, 50).mirror().addBox(-0.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(89, 50).addBox(8.5F, -0.625F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-6.5F, 4.6264F, 3.3802F, -2.8013F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(9, 74).mirror().addBox(-3.0F, -1.3256F, -0.9263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(9, 74).addBox(6.0F, -1.3256F, -0.9263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0F, 2.8884F, 1.6476F, 2.5831F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(41, 84).mirror().addBox(-1.1341F, -0.1523F, 0.0195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.0334F, 3.0208F, 0.0579F, 1.8857F, -0.0535F, 0.0529F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-0.4954F, -1.8159F, 0.1486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.6267F, -0.3506F, -0.3731F, 0.9824F, -0.1019F, 0.0252F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(40, 22).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.6314F, 6.0602F, -3.6415F, 0.324F, -0.1961F, -0.2656F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(0.071F, -0.2609F, -4.188F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0199F, 4.5977F, -1.7597F, 0.6295F, -0.1961F, -0.2656F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(7, 86).mirror().addBox(0.071F, -1.9173F, -1.8855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.0199F, 4.5977F, -1.7597F, 1.4585F, -0.1961F, -0.2656F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.5F, 3.5F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.4133F, 4.25F, -3.5489F, 1.8999F, -0.1049F, 0.0025F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(79, 9).mirror().addBox(-0.0694F, -3.0667F, -2.1139F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.2132F, 3.65F, -0.0489F, 1.8816F, -0.2073F, -0.1184F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 88).mirror().addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-6.4399F, 2.3842F, -2.829F, 1.4624F, -0.1019F, 0.0252F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(71, 76).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.4532F, 1.4513F, -2.4691F, 1.2006F, -0.1019F, 0.0252F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(46, 72).mirror().addBox(-0.4954F, -1.6214F, -2.2453F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.6267F, -0.3506F, -0.3731F, 1.3315F, -0.1019F, 0.0252F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.0453F, -3.1135F, -1.8301F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-7.2132F, 3.65F, -0.0489F, 1.1777F, -0.1373F, -0.0741F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(5, 103).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.8794F, -2.0024F, 2.7941F, 2.8292F, 0.1048F, -0.0038F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(0, 103).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.8582F, -2.9884F, 2.6283F, 1.7384F, 0.1048F, -0.0038F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(102, 63).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.754F, -3.1254F, 1.6432F, 1.4329F, 0.1048F, -0.0038F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(27, 80).addBox(-0.5128F, -1.0544F, -1.7362F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5795F, -2.379F, -0.1645F, 1.8256F, 0.1048F, -0.0038F));

		PartDefinition cube_r190 = bone2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(50, 58).addBox(-0.5302F, -0.8403F, -1.9776F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.6267F, -0.3506F, -0.3731F, 1.0522F, 0.1019F, -0.0252F));

		PartDefinition cube_r191 = bone2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(103, 50).addBox(-0.4872F, -0.9691F, -0.6854F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5795F, -2.379F, -0.1645F, 1.1362F, 0.1048F, -0.0038F));

		PartDefinition cube_r192 = bone2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(70, 69).addBox(-1.0474F, -2.6516F, 0.2431F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.5339F, 3.6394F, 2.0762F, -0.7992F, -0.3972F));

		PartDefinition cube_r193 = bone2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(83, 58).addBox(-1.3036F, -2.746F, -0.4708F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1964F, 7.2614F, -5.1644F, 1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r194 = bone2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(74, 57).addBox(-0.9187F, -2.2708F, -0.6095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.1964F, 7.2614F, -5.1644F, 1.814F, 0.6699F, 0.1624F));

		PartDefinition cube_r195 = bone2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(74, 62).addBox(-0.8076F, -0.1924F, -0.5468F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1964F, 7.2614F, -5.1644F, 1.8704F, 0.2432F, 0.0684F));

		PartDefinition cube_r196 = bone2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(66, 17).addBox(-4.5F, -0.9679F, 0.197F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5339F, 3.6394F, 1.9548F, 0.0F, 0.0F));

		PartDefinition cube_r197 = bone2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(23, 7).addBox(-6.5F, -1.7597F, -0.8468F, 9.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5339F, 0.0644F, 1.85F, 0.0F, 0.0F));

		PartDefinition cube_r198 = bone2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(23, 14).addBox(-5.5F, -3.6896F, -0.9602F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5339F, 0.0644F, 1.7802F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(0, 85).addBox(1.5586F, -1.4882F, -2.311F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5339F, 0.0644F, 0.3027F, 0.1605F, 0.2028F));

		PartDefinition cube_r200 = bone2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(86, 12).addBox(-0.5F, -2.025F, 0.05F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0471F, 6.6635F, -0.9015F, 0.2873F, 0.1383F, 0.1288F));

		PartDefinition cube_r201 = bone2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(41, 84).addBox(0.1341F, -0.1523F, 0.0195F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0334F, 3.0208F, 0.0579F, 1.8857F, 0.0535F, -0.0529F));

		PartDefinition cube_r202 = bone2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(93, 42).addBox(-0.5046F, -1.8159F, 0.1486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6267F, -0.3506F, -0.3731F, 0.9824F, 0.1019F, -0.0252F));

		PartDefinition cube_r203 = bone2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(40, 22).addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.6314F, 6.0602F, -3.6415F, 0.324F, 0.1961F, 0.2656F));

		PartDefinition cube_r204 = bone2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(77, 17).addBox(-1.071F, -0.2609F, -4.188F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0199F, 4.5977F, -1.7597F, 0.6295F, 0.1961F, 0.2656F));

		PartDefinition cube_r205 = bone2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(7, 86).addBox(-1.071F, -1.9173F, -1.8855F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0199F, 4.5977F, -1.7597F, 1.4585F, 0.1961F, 0.2656F));

		PartDefinition cube_r206 = bone2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(0, 79).addBox(-0.5F, 3.5F, -2.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4132F, 4.25F, -3.5489F, 1.8999F, 0.1049F, -0.0025F));

		PartDefinition cube_r207 = bone2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(79, 9).addBox(-0.9306F, -3.0667F, -2.1139F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2133F, 3.65F, -0.0489F, 1.8816F, 0.2073F, 0.1184F));

		PartDefinition cube_r208 = bone2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(70, 88).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4399F, 2.3842F, -2.829F, 1.4624F, 0.1019F, -0.0252F));

		PartDefinition cube_r209 = bone2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(55, 75).addBox(-0.9547F, -3.1135F, -1.8301F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2133F, 3.65F, -0.0489F, 1.1777F, 0.1373F, 0.0741F));

		PartDefinition cube_r210 = bone2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(71, 76).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4532F, 1.4513F, -2.4691F, 1.2006F, 0.1019F, -0.0252F));

		PartDefinition cube_r211 = bone2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(46, 72).addBox(-0.5046F, -1.6214F, -2.2453F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.6267F, -0.3506F, -0.3731F, 1.3315F, 0.1019F, -0.0252F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -1.2557F, -4.9853F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(40, 14).addBox(-0.5F, -1.2557F, -8.9853F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.3466F, -9.0026F, 0.0064F, -0.1258F, 0.044F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(42, 75).addBox(0.0F, -0.1743F, -3.9076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 74).addBox(0.0F, -0.4743F, -1.9076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2556F, -4.9809F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(55, 72).addBox(0.0F, -0.8743F, -0.0076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2556F, -4.9809F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Neck_r3 = Neck.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(25, 105).addBox(0.0F, -1.075F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2208F, -0.9839F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = Neck.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(105, 18).addBox(0.0F, -0.925F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2557F, -2.9836F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(19, 98).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5594F, -4.2423F, 0.5976F, 0.4183F, -0.4951F));

		PartDefinition cube_r213 = Neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(105, 16).mirror().addBox(0.1328F, -2.8589F, -5.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 2.8112F, 1.1134F, 1.4578F));

		PartDefinition cube_r214 = Neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(105, 14).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2316F, -0.3638F, -0.87F));

		PartDefinition cube_r215 = Neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-7.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.1459F, 0.1721F, -1.3602F));

		PartDefinition cube_r216 = Neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(98, 18).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2226F, -0.0346F, -0.3469F));

		PartDefinition cube_r217 = Neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(98, 16).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2166F, 0.0619F, -0.7726F));

		PartDefinition cube_r218 = Neck.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-5.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -2.4406F, 0.3312F, 0.1691F, -0.9346F));

		PartDefinition cube_r219 = Neck.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(98, 14).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7636F, -2.4406F, 0.37F, 0.017F, -0.5234F));

		PartDefinition cube_r220 = Neck.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 98).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5594F, -4.2423F, 0.5976F, -0.4183F, 0.4951F));

		PartDefinition cube_r221 = Neck.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(105, 16).addBox(-1.1328F, -2.8589F, -5.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 2.8112F, -1.1134F, -1.4578F));

		PartDefinition cube_r222 = Neck.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(105, 14).addBox(1.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2316F, 0.3638F, 0.87F));

		PartDefinition cube_r223 = Neck.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(73, 44).addBox(2.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.1459F, -0.1721F, 1.3602F));

		PartDefinition cube_r224 = Neck.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(98, 18).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2226F, 0.0346F, 0.3469F));

		PartDefinition cube_r225 = Neck.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(98, 16).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -0.4406F, 0.2166F, -0.0619F, 0.7726F));

		PartDefinition cube_r226 = Neck.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(78, 52).addBox(1.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -2.4406F, 0.3312F, -0.1691F, 0.9346F));

		PartDefinition cube_r227 = Neck.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(98, 14).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7636F, -2.4406F, 0.37F, -0.017F, 0.5234F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.5086F, -8.5985F, -0.1289F, -0.0425F, -0.0578F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(18, 77).addBox(-0.49F, -0.825F, -1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 0.8182F, -17.6087F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(87, 82).addBox(-0.14F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.5292F, -0.1605F, -16.1209F, 0.2799F, 0.2526F, 0.3255F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(14, 82).addBox(-0.99F, -0.125F, -1.825F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3233F, -16.1675F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(35, 58).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 7).addBox(-1.0F, -0.5F, 0.8F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.01F, 0.5588F, -14.21F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -0.9F, -1.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 1.2362F, -3.6241F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(35, 63).addBox(-0.49F, -0.1F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.5064F, -13.1731F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(60, 44).addBox(-0.49F, -0.175F, -0.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.5F, -0.4623F, -13.1341F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(75, 36).addBox(-2.49F, -1.1133F, 6.2479F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8067F, -7.1623F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(44, 0).addBox(-2.49F, -0.0689F, 3.7512F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -1.8067F, -7.1623F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(68, 92).addBox(-1.4228F, -0.5F, -0.8109F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4328F, 0.7321F, -14.9719F, 0.0488F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(87, 0).addBox(-0.8308F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1592F, 0.7278F, -17.6788F, -0.0385F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(100, 57).addBox(-0.99F, -0.4136F, 3.8659F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -1.8067F, -7.1623F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(15, 44).addBox(-1.99F, 0.058F, 0.0116F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.8067F, -7.1623F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(59, 4).addBox(-1.99F, 0.0668F, -1.0237F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.3067F, -9.0623F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftBrow = Head.addOrReplaceChild("leftBrow", CubeListBuilder.create(), PartPose.offset(1.9F, -1.3432F, -3.0961F));

		PartDefinition Head_r15 = leftBrow.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(78, 86).addBox(-0.14F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.05F, 1.0199F, -13.0714F, 0.2714F, -0.0667F, 0.2352F));

		PartDefinition Head_r16 = leftBrow.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(86, 67).addBox(-0.6003F, -0.7305F, -0.4229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1373F, 0.5663F, -5.249F, 0.2618F, -0.1061F, -0.0564F));

		PartDefinition Head_r17 = leftBrow.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(58, 100).addBox(-0.6749F, -0.7458F, -1.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1373F, 0.5663F, -5.249F, 0.3152F, -0.3538F, -0.1444F));

		PartDefinition Head_r18 = leftBrow.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(24, 66).addBox(-0.3719F, -0.6998F, -4.8828F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.1373F, 0.5663F, -5.249F, 0.2083F, -0.0038F, 0.0255F));

		PartDefinition Head_r19 = leftBrow.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(92, 71).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0444F, 2.1601F, -11.5603F, -0.1069F, -1.2464F, 0.129F));

		PartDefinition Head_r20 = leftBrow.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(40, 103).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.8755F, 2.0348F, -13.9791F, -0.1411F, 0.6867F, -0.1343F));

		PartDefinition Head_r21 = leftBrow.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(84, 99).addBox(-0.1F, -0.7F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4983F, 2.0526F, -12.7438F, 0.0151F, 0.0F, 0.0F));

		PartDefinition Head_r22 = leftBrow.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(53, 97).addBox(-1.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4983F, 2.0526F, -12.7438F, -0.1158F, 0.0F, 0.0F));

		PartDefinition Head_r23 = leftBrow.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(86, 42).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0541F, 2.1104F, -11.9435F, -0.0547F, 0.3532F, -0.0098F));

		PartDefinition Head_r24 = leftBrow.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(59, 69).addBox(-0.8391F, -0.3539F, -2.5668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0336F, 2.1439F, -8.6407F, -0.0517F, 0.1702F, 0.0002F));

		PartDefinition Head_r25 = leftBrow.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(0, 29).addBox(-0.7F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0119F, 2.2312F, -3.8791F, 0.0351F, 0.2574F, -0.0004F));

		PartDefinition Head_r26 = leftBrow.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(0, 73).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2569F, 0.1623F, -2.3869F, 0.161F, 0.1175F, 0.013F));

		PartDefinition Head_r27 = leftBrow.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(71, 29).addBox(-0.99F, -0.825F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.9F, 2.1614F, -14.5126F, -0.032F, 0.6106F, -0.0183F));

		PartDefinition Head_r28 = leftBrow.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(21, 28).addBox(-2.9F, -0.5F, -0.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.99F, 2.0879F, -4.0163F, -0.0021F, 0.7851F, -0.0262F));

		PartDefinition Head_r29 = leftBrow.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(73, 46).addBox(-2.9F, -0.5F, -2.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 1.9492F, -9.3145F, -0.1008F, -1.3077F, 0.0974F));

		PartDefinition Head_r30 = leftBrow.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(83, 54).addBox(-1.0F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.89F, 1.9492F, -9.3145F, -0.043F, -0.9159F, 0.0341F));

		PartDefinition Head_r31 = leftBrow.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(77, 39).addBox(-0.09F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.849F, -10.2766F, 0.0581F, -0.0189F, 0.3136F));

		PartDefinition Head_r32 = leftBrow.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(30, 44).addBox(-1.89F, -0.175F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.3891F, 0.2365F, -6.1876F, 0.1662F, 0.0689F, 0.0115F));

		PartDefinition Head_r33 = leftBrow.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(13, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7208F, 0.415F, -3.2573F, 0.1577F, 0.0674F, 0.0181F));

		PartDefinition rightBrow = Head.addOrReplaceChild("rightBrow", CubeListBuilder.create(), PartPose.offset(-1.88F, -1.3432F, -3.0961F));

		PartDefinition Head_r34 = rightBrow.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(78, 86).mirror().addBox(-0.86F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.05F, 1.0199F, -13.0714F, 0.2714F, 0.0667F, -0.2352F));

		PartDefinition Head_r35 = rightBrow.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(86, 67).mirror().addBox(-0.3997F, -0.7305F, -0.4229F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1373F, 0.5663F, -5.249F, 0.2618F, 0.1061F, 0.0564F));

		PartDefinition Head_r36 = rightBrow.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(58, 100).mirror().addBox(-0.3251F, -0.7458F, -1.1445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1373F, 0.5663F, -5.249F, 0.3152F, 0.3538F, 0.1444F));

		PartDefinition Head_r37 = rightBrow.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(24, 66).mirror().addBox(-0.6281F, -0.6998F, -4.8828F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.1373F, 0.5663F, -5.249F, 0.2083F, 0.0038F, -0.0255F));

		PartDefinition Head_r38 = rightBrow.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(92, 71).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0444F, 2.1601F, -11.5603F, -0.1069F, 1.2464F, -0.129F));

		PartDefinition Head_r39 = rightBrow.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(40, 103).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.8755F, 2.0348F, -13.9791F, -0.1411F, -0.6867F, 0.1343F));

		PartDefinition Head_r40 = rightBrow.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(84, 99).mirror().addBox(-0.9F, -0.7F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4983F, 2.0526F, -12.7438F, 0.0151F, 0.0F, 0.0F));

		PartDefinition Head_r41 = rightBrow.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(53, 97).mirror().addBox(0.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4983F, 2.0526F, -12.7438F, -0.1158F, 0.0F, 0.0F));

		PartDefinition Head_r42 = rightBrow.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(86, 42).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0541F, 2.1104F, -11.9435F, -0.0547F, -0.3532F, 0.0098F));

		PartDefinition Head_r43 = rightBrow.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(59, 69).mirror().addBox(-0.1609F, -0.3539F, -2.5668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0336F, 2.1439F, -8.6407F, -0.0517F, -0.1702F, -0.0002F));

		PartDefinition Head_r44 = rightBrow.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.3F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0119F, 2.2312F, -3.8791F, 0.0351F, -0.2574F, 0.0004F));

		PartDefinition Head_r45 = rightBrow.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2569F, 0.1623F, -2.3869F, 0.161F, -0.1175F, -0.013F));

		PartDefinition Head_r46 = rightBrow.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(71, 29).mirror().addBox(-1.01F, -0.825F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.9F, 2.1614F, -14.5126F, -0.032F, -0.6106F, 0.0183F));

		PartDefinition Head_r47 = rightBrow.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(21, 28).mirror().addBox(-0.1F, -0.5F, -0.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.99F, 2.0879F, -4.0163F, -0.0021F, -0.7851F, 0.0262F));

		PartDefinition Head_r48 = rightBrow.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-0.1F, -0.5F, -2.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.89F, 1.9492F, -9.3145F, -0.1008F, 1.3077F, -0.0974F));

		PartDefinition Head_r49 = rightBrow.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(83, 54).mirror().addBox(-1.0F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(1.89F, 1.9492F, -9.3145F, -0.043F, 0.9159F, -0.0341F));

		PartDefinition Head_r50 = rightBrow.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.91F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.849F, -10.2766F, 0.0581F, 0.0189F, -0.3136F));

		PartDefinition Head_r51 = rightBrow.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.11F, -0.175F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.3891F, 0.2365F, -6.1876F, 0.1662F, -0.0689F, -0.0115F));

		PartDefinition Head_r52 = rightBrow.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(13, 61).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7208F, 0.415F, -3.2573F, 0.1577F, -0.0674F, -0.0181F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.01F, -0.5145F, -6.3197F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(91, 46).addBox(-0.964F, -0.4983F, -0.2636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4297F, 0.9414F, -11.482F, 0.0996F, 0.7471F, 0.1917F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(92, 91).addBox(-0.9738F, -0.4963F, -0.7377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4297F, 0.9414F, -11.482F, 0.1096F, 1.0066F, 0.2342F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(99, 100).addBox(-0.6056F, -0.5107F, -0.7439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2221F, 0.7792F, -10.217F, 0.1524F, 0.0702F, 0.2815F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(94, 100).addBox(-0.5896F, -0.5107F, -0.2652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2221F, 0.7792F, -10.217F, 0.172F, 0.4838F, 0.3513F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(89, 100).addBox(-0.3508F, -0.5107F, -0.3514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.2221F, 0.7792F, -10.217F, 0.1529F, -0.1023F, 0.255F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(70, 100).addBox(-0.3415F, -0.5107F, -0.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2221F, 0.7792F, -10.217F, 0.1809F, 0.5697F, 0.369F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(10, 103).addBox(-1.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 89).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4132F, 0.9335F, -10.7512F, 0.1391F, 0.1492F, 0.242F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(62, 81).addBox(-1.7721F, -0.2651F, -1.8622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0281F, 0.6377F, -9.1208F, 0.1213F, 0.14F, 0.2512F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(92, 74).addBox(-2.025F, -0.1F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3044F, 0.5825F, -8.8849F, -0.0115F, 0.1718F, 0.2514F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(88, 62).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.4379F, 0.5218F, -8.0481F, -0.0115F, 0.1979F, 0.2335F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(45, 44).addBox(-0.0668F, -0.1F, -4.7259F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0012F, -0.6475F, -3.4808F, 0.0482F, -0.1885F, 0.6423F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(61, 58).addBox(-0.0918F, -0.15F, -3.9259F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9683F, -0.4896F, -3.7337F, 0.0866F, -0.1448F, 0.427F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(22, 72).addBox(-1.6918F, -0.25F, -2.351F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.319F, 0.6944F, -3.7181F, 0.0512F, -0.0032F, 0.4018F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(85, 86).addBox(-5.3266F, -0.2652F, 0.6146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.0152F, 0.3095F, 0.019F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(33, 75).addBox(-6.0562F, -0.4306F, -2.7537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.0697F, 0.7884F, -0.0211F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(0, 100).addBox(-6.0354F, -0.4306F, 0.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.0697F, 0.7884F, -0.0211F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(83, 3).addBox(-1.9F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3052F, 1.1343F, -6.7701F, -0.0112F, 0.0704F, 0.258F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(49, 82).addBox(0.9397F, 1.7235F, 2.3034F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.2246F, -0.0793F, 0.6431F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(5, 100).addBox(-3.5898F, 2.1651F, 0.9719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.1672F, 1.1392F, 0.7392F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(66, 10).addBox(-2.5399F, 2.4223F, -0.5908F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, 0.0779F, 0.5138F, 0.7643F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(78, 82).addBox(-0.0741F, 2.034F, 2.1756F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.1107F, 0.0682F, 0.8609F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(76, 0).addBox(-2.1517F, 2.0584F, 2.1006F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.1325F, 0.3011F, 0.5612F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(58, 30).addBox(-2.405F, 2.711F, -0.2463F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.024F, -0.1249F, 0.8892F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(61, 64).addBox(-2.1333F, 2.4726F, -1.4694F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, 0.0062F, 0.3897F, 0.8062F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(24, 51).addBox(-1.1922F, 2.3325F, -2.1665F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.7903F, 3.2387F, -0.0394F, 0.2627F, 0.5216F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(72, 4).addBox(1.0095F, -1.0713F, -1.6712F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.7922F, -2.7426F, 0.1069F, -0.2538F, 0.7587F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(103, 41).addBox(-2.5934F, 2.085F, -1.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.0713F, 0.9649F, 0.8224F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(103, 47).addBox(-2.2783F, 2.085F, 1.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.0406F, 0.0236F, 0.7648F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(56, 103).addBox(-0.2549F, 2.085F, 2.2689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.0614F, -0.8481F, 0.7177F));

		PartDefinition Head_r82 = leftFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(86, 17).addBox(-4.1775F, -0.2288F, 1.0614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.167F, -0.1081F, -0.0346F));

		PartDefinition Head_r83 = leftFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(14, 86).addBox(-2.4086F, 2.085F, 1.0614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.0414F, -0.1944F, 0.7558F));

		PartDefinition Head_r84 = leftFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(44, 8).addBox(-2.3917F, 2.1416F, -0.2912F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, 0.0297F, -0.1811F, 0.7753F));

		PartDefinition Head_r85 = leftFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(64, 39).addBox(-3.0F, 0.0F, -6.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, 0.5097F, 3.0387F, 0.0473F, 0.0468F, 0.4625F));

		PartDefinition Head_r86 = leftFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(65, 50).addBox(-2.4155F, 1.6962F, -0.2447F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, -1.1903F, -0.6613F, -0.0468F, 0.0933F, 0.4559F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.99F, -0.5145F, -6.3197F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(91, 46).mirror().addBox(-1.036F, -0.4983F, -0.2636F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4297F, 0.9414F, -11.482F, 0.0996F, -0.7471F, -0.1917F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(92, 91).mirror().addBox(-1.0262F, -0.4963F, -0.7377F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4297F, 0.9414F, -11.482F, 0.1096F, -1.0066F, -0.2342F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(99, 100).mirror().addBox(-0.3944F, -0.5107F, -0.7439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.2221F, 0.7792F, -10.217F, 0.1524F, -0.0702F, -0.2815F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(94, 100).mirror().addBox(-0.4104F, -0.5107F, -0.2652F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2221F, 0.7792F, -10.217F, 0.172F, -0.4838F, -0.3513F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(89, 100).mirror().addBox(-0.6492F, -0.5107F, -0.3514F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.2221F, 0.7792F, -10.217F, 0.1529F, 0.1023F, -0.255F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(70, 100).mirror().addBox(-0.6585F, -0.5107F, -0.6749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2221F, 0.7792F, -10.217F, 0.1809F, -0.5697F, -0.369F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(10, 103).mirror().addBox(0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(41, 89).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4132F, 0.9335F, -10.7512F, 0.1391F, -0.1492F, -0.242F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(62, 81).mirror().addBox(-0.2279F, -0.2651F, -1.8622F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0281F, 0.6377F, -9.1208F, 0.1213F, -0.14F, -0.2512F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(0.025F, -0.1F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3044F, 0.5825F, -8.8849F, -0.0115F, -0.1718F, -0.2514F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(88, 62).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, 0.5218F, -8.0481F, -0.0115F, -0.1979F, -0.2335F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(45, 44).mirror().addBox(-1.9332F, -0.1F, -4.7259F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0012F, -0.6475F, -3.4808F, 0.0482F, 0.1885F, -0.6423F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(61, 58).mirror().addBox(-1.9082F, -0.15F, -3.9259F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9683F, -0.4896F, -3.7337F, 0.0866F, 0.1448F, -0.427F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.3082F, -0.25F, -2.351F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.3191F, 0.6944F, -3.7181F, 0.0512F, 0.0032F, -0.4018F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(85, 86).mirror().addBox(4.3266F, -0.2652F, 0.6146F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.0152F, -0.3095F, -0.019F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(5.0562F, -0.4306F, -2.7537F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.0697F, -0.7884F, 0.0211F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(5.0354F, -0.4306F, 0.1209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.0697F, -0.7884F, 0.0211F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-0.1F, -0.6F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3052F, 1.1343F, -6.7701F, -0.0112F, -0.0704F, -0.258F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-2.9397F, 1.7235F, 2.3034F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.2246F, 0.0793F, -0.6431F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(5, 100).mirror().addBox(2.5898F, 2.1651F, 0.9719F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.1672F, -1.1392F, -0.7392F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(66, 10).mirror().addBox(-0.4601F, 2.4223F, -0.5908F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, 0.0779F, -0.5138F, -0.7643F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(78, 82).mirror().addBox(-1.9259F, 2.034F, 2.1756F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.1107F, -0.0682F, -0.8609F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-1.8483F, 2.0584F, 2.1006F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.1325F, -0.3011F, -0.5612F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(58, 30).mirror().addBox(-0.595F, 2.711F, -0.2463F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.024F, 0.1249F, -0.8892F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(61, 64).mirror().addBox(-0.8667F, 2.4726F, -1.4694F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, 0.0062F, -0.3897F, -0.8062F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(24, 51).mirror().addBox(-1.8078F, 2.3325F, -2.1665F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.7903F, 3.2387F, -0.0394F, -0.2627F, -0.5216F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(72, 4).mirror().addBox(-3.0095F, -1.0713F, -1.6712F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.7922F, -2.7426F, 0.1069F, 0.2538F, -0.7587F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(103, 41).mirror().addBox(1.5934F, 2.085F, -1.452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.0713F, -0.9649F, -0.8224F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(103, 47).mirror().addBox(1.2783F, 2.085F, 1.0203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.0406F, -0.0236F, -0.7648F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(56, 103).mirror().addBox(-0.7451F, 2.085F, 2.2689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.0614F, 0.8481F, -0.7177F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(86, 17).mirror().addBox(3.1775F, -0.2288F, 1.0614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.167F, 0.1081F, 0.0346F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(14, 86).mirror().addBox(1.4086F, 2.085F, 1.0614F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.0414F, 0.1944F, -0.7558F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(44, 8).mirror().addBox(-0.6083F, 2.1416F, -0.2912F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, 0.0297F, 0.1811F, -0.7753F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(64, 39).mirror().addBox(0.0F, 0.0F, -6.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, 0.5097F, 3.0387F, 0.0473F, -0.0468F, -0.4625F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(65, 50).mirror().addBox(-0.5845F, 1.6962F, -0.2447F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, -1.1903F, -0.6613F, -0.0468F, -0.0933F, -0.4559F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9606F, 0.1244F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(79, 73).addBox(-0.5724F, -0.627F, -0.8054F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0824F, 1.5668F, -17.8112F, -1.5652F, 0.0F, 0.0F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(86, 25).addBox(-0.5724F, -0.367F, -0.779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0824F, 1.5668F, -17.8112F, 1.2993F, 0.0F, 0.0F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(100, 20).mirror().addBox(-0.112F, -0.6325F, -2.057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(20, 100).mirror().addBox(-0.112F, -0.6325F, -1.557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.53F, 2.1039F, -16.4626F, -0.0096F, -0.5074F, 0.0238F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-0.725F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1689F, 1.1655F, -17.2245F, -1.5167F, -0.5054F, -0.0517F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(27, 77).mirror().addBox(-0.1722F, 0.4995F, -1.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(103, 26).mirror().addBox(-0.1049F, 1.0002F, -0.8387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 103).mirror().addBox(-0.1222F, 0.3994F, -0.8351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.53F, 2.1039F, -16.4626F, -1.5652F, -0.508F, 0.0481F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(91, 25).mirror().addBox(-0.6867F, -0.2623F, -1.4514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(93, 11).mirror().addBox(-0.6867F, -0.3623F, -0.8764F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 2.1039F, -14.1626F, -1.5563F, -0.3337F, 0.0445F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(0.0031F, 0.0249F, -1.4696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(99, 81).mirror().addBox(0.0031F, -0.0751F, -0.9446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.98F, 2.1039F, -12.1626F, -1.5547F, -0.1922F, -0.0007F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-1.0276F, 0.0998F, -1.7862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.38F, 2.1039F, -6.0626F, -1.4848F, -0.262F, -0.0007F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(-1.075F, 0.069F, -1.5205F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 90).mirror().addBox(-1.075F, 0.069F, -0.3955F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(93, 6).mirror().addBox(-1.075F, 0.069F, -0.9955F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.58F, 2.1039F, -8.8626F, -1.5547F, -0.2097F, -0.0007F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(103, 29).mirror().addBox(-0.1293F, -0.4133F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.53F, 2.1039F, -16.4626F, -1.4932F, -0.5074F, 0.0238F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(82, 90).mirror().addBox(-0.6858F, -0.4948F, -0.2857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.78F, 2.1039F, -14.1626F, -1.7754F, -0.3333F, 0.0477F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(99, 90).mirror().addBox(0.005F, -0.1152F, -0.0859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.98F, 2.1039F, -12.1626F, -1.6337F, -0.1919F, 0.0024F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(91, 30).mirror().addBox(-1.0538F, 0.0098F, 0.2744F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.58F, 2.1039F, -8.8626F, -1.6846F, -0.21F, -0.0069F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(79, 22).mirror().addBox(-1.0276F, 0.0296F, -1.4217F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.38F, 2.1039F, -6.0626F, -1.4325F, -0.262F, -0.0007F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-1.013F, -0.0177F, -0.5464F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.38F, 2.1039F, -6.0626F, -1.6308F, -0.2623F, -0.0117F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-1.5717F, 4.9909F, 1.3916F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.5599F, -0.3496F, -0.012F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(79, 67).mirror().addBox(-1.5717F, 5.1948F, -1.5456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.3068F, -0.3496F, -0.012F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(40, 30).mirror().addBox(-0.4188F, 1.8425F, -0.9131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.3177F, -0.1396F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(-0.4188F, 3.5774F, 1.053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.501F, -0.1396F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(42, 78).mirror().addBox(-0.4188F, 2.6256F, -0.1919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.5621F, -0.1396F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(34, 80).mirror().addBox(-0.4188F, 2.2873F, -0.0297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -1.2305F, -0.1396F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-0.3F, 1.8464F, -0.7856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -0.925F, -0.0524F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(85, 78).mirror().addBox(-0.3F, 1.0221F, -1.0433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -0.7941F, -0.0524F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-0.3F, 0.3054F, -1.3103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -0.5236F, -0.0524F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(93, 16).mirror().addBox(-0.3F, 0.8967F, -1.5468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.58F, 0.1039F, 1.5374F, -0.9512F, -0.0524F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(40, 30).addBox(-0.5812F, 1.8425F, -0.9131F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.3177F, 0.1396F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(71, 83).addBox(-0.5812F, 3.5774F, 1.053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.501F, 0.1396F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(91, 30).addBox(0.0538F, 0.0098F, 0.2744F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.1039F, -8.8626F, -1.6846F, 0.21F, 0.0069F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(78, 76).addBox(0.013F, -0.0177F, -0.5464F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 2.1039F, -6.0626F, -1.6308F, 0.2623F, 0.0117F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(7, 80).addBox(0.5717F, 4.9909F, 1.3916F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.5599F, 0.3496F, 0.012F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(87, 90).addBox(0.075F, 0.069F, -0.3955F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(5, 91).addBox(0.075F, 0.069F, -1.5205F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(93, 6).addBox(0.075F, 0.069F, -0.9955F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 2.1039F, -8.8626F, -1.5547F, 0.2097F, 0.0007F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(103, 26).addBox(-0.8951F, 1.0002F, -0.8387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 103).addBox(-0.8778F, 0.3994F, -0.8351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 77).addBox(-0.8278F, 0.4995F, -1.4101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.55F, 2.1039F, -16.4626F, -1.5652F, 0.508F, -0.0481F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(93, 11).addBox(-0.3133F, -0.3623F, -0.8764F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 25).addBox(-0.3133F, -0.2623F, -1.4514F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8F, 2.1039F, -14.1626F, -1.5563F, 0.3337F, -0.0445F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(100, 20).addBox(-0.888F, -0.6325F, -2.057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(20, 100).addBox(-0.888F, -0.6325F, -1.557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 2.1039F, -16.4626F, -0.0096F, 0.5074F, -0.0238F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(103, 29).addBox(-0.8707F, -0.4133F, -0.6738F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.55F, 2.1039F, -16.4626F, -1.4932F, 0.5074F, -0.0238F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(82, 90).addBox(-0.3142F, -0.4948F, -0.2857F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 2.1039F, -14.1626F, -1.7754F, 0.3333F, -0.0477F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(99, 90).addBox(-1.005F, -0.1152F, -0.0859F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 2.1039F, -12.1626F, -1.6337F, 0.1919F, -0.0024F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(99, 81).addBox(-1.0031F, -0.0751F, -0.9446F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 78).addBox(-1.0031F, 0.0249F, -1.4696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.0F, 2.1039F, -12.1626F, -1.5547F, 0.1922F, 0.0007F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(91, 35).addBox(0.0276F, 0.0998F, -1.7862F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.4F, 2.1039F, -6.0626F, -1.4848F, 0.262F, 0.0007F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(84, 46).addBox(-0.275F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1889F, 1.1655F, -17.2245F, -1.5167F, 0.5054F, 0.0517F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(79, 22).addBox(0.0276F, 0.0296F, -1.4217F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 2.1039F, -6.0626F, -1.4325F, 0.262F, 0.0007F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(79, 67).addBox(0.5717F, 5.1948F, -1.5456F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.3068F, 0.3496F, 0.012F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(42, 78).addBox(-0.5812F, 2.6256F, -0.1919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.5621F, 0.1396F, 0.0F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(34, 80).addBox(-0.5812F, 2.2873F, -0.0297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -1.2305F, 0.1396F, 0.0F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(84, 32).addBox(-0.7F, 1.8464F, -0.7856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -0.925F, 0.0524F, 0.0F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(85, 78).addBox(-0.7F, 1.0221F, -1.0433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -0.7941F, 0.0524F, 0.0F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(59, 10).addBox(-0.7F, 0.3054F, -1.3103F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -0.5236F, 0.0524F, 0.0F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(93, 16).addBox(-0.7F, 0.8967F, -1.5468F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.6F, 0.1039F, 1.5374F, -0.9512F, 0.0524F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.1018F, 0.1736F, -0.0176F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(9, 106).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(6, 106).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(72, 103).addBox(0.0F, 0.7473F, -0.2699F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 4.2753F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(31, 105).addBox(0.0F, -0.8F, -1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3891F, 0.8652F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(28, 105).addBox(0.0F, 0.4F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3891F, 0.8652F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(106, 3).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.0F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.0247F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(0, 61).addBox(0.0F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.0247F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(52, 51).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1347F, 4.7908F, -0.2413F, 0.1306F, -0.0087F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(3, 106).addBox(0.0F, -0.475F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(106, 0).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(82, 28).mirror().addBox(-0.6F, 0.0F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(82, 28).addBox(-0.4F, 0.0F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailbase_r9 = Tailmiddlebase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(17, 29).addBox(0.0F, 1.6437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2124F, -0.5236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.9007F, -0.0701F, 0.1309F, 0.0022F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(0, 106).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 2.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(89, 105).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tailmiddle.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(69, 103).addBox(0.0F, 6.8437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 100).addBox(0.0F, 4.1437F, 5.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 91).addBox(0.0F, 4.9437F, 7.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1124F, -7.4236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.0822F, 0.1305F, 0.0107F));

		PartDefinition Tailbase_r11 = Tailmiddleend.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(83, 103).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4235F, -10.4427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(48, 66).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9584F, 0.0368F, 0.0872F, 0.0032F));

		PartDefinition Tailbase_r12 = Tailend.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(58, 82).addBox(0.0F, 10.7437F, 15.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 54).addBox(0.0F, 9.8437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -16.402F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail = Tailend.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 23).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 3.998F, 0.1772F, 0.1719F, 0.0306F));

		PartDefinition Tailbase_r13 = tail.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(89, 95).addBox(0.0F, 11.5437F, 17.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -20.4F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(35, 69).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0088F, 3.9157F, 0.0903F, 0.2608F, 0.0233F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7513F, 5.2129F, -3.4656F, 0.2354F, 0.5446F, -0.7798F));

		PartDefinition cube_r276 = hindlegL.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(53, 86).addBox(-0.502F, -1.3905F, -0.4105F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.5022F, -0.061F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r277 = hindlegL.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(25, 102).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0538F, 5.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r278 = hindlegL.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(51, 101).addBox(-0.0538F, -1.7973F, 0.7382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 6.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r279 = hindlegL.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(26, 98).addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0538F, 5.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r280 = hindlegL.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(41, 99).addBox(-0.5F, -0.6F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0475F, 3.715F, 0.5691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r281 = hindlegL.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 82).addBox(4.9826F, 0.0363F, -1.9915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(21, 88).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(26, 88).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3038F, 5.1502F, 1.5609F, -0.1153F, 0.6777F, 1.3948F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(55, 14).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.3794F, 3.2087F, 0.0913F, 0.0314F, 0.0591F, -2.2431F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7513F, 5.2129F, -3.4656F, -0.7597F, 0.0693F, 1.1254F));

		PartDefinition cube_r282 = hindlegL3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(36, 90).addBox(-0.498F, -1.3905F, -0.4105F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.5022F, -0.061F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r283 = hindlegL3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(20, 103).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0538F, 5.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r284 = hindlegL3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(15, 103).addBox(-0.9462F, -1.7973F, 0.7382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 6.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r285 = hindlegL3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(98, 44).addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0538F, 5.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r286 = hindlegL3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(46, 99).addBox(-0.5F, -0.6F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0475F, 3.715F, 0.5691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r287 = hindlegL3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(95, 57).addBox(-5.9826F, 0.0363F, -1.9915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(58, 90).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(77, 90).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.3038F, 5.1502F, 1.5609F, 0.7821F, -0.8667F, -1.9335F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(24, 57).addBox(-0.5F, -0.1F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.3794F, 3.2087F, 0.0913F, -0.0341F, 0.0506F, 1.4994F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(102, 60).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(35, 102).addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 1.8908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(62, 76).addBox(-0.1F, -0.3134F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, -0.1F, 0.9746F, 0.4211F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(30, 102).addBox(2.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(53, 92).addBox(-0.3825F, -1.5554F, -0.2623F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.7757F, 6.0197F, -0.6325F, 1.5887F, -0.2395F, 0.9202F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(93, 67).addBox(-0.3825F, -0.343F, -1.7961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7757F, 6.0197F, -0.6325F, -0.5929F, -0.2395F, 0.9202F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(34, 85).addBox(-0.3825F, -0.0005F, 0.0434F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.7757F, 6.0197F, -0.6325F, 0.8906F, -0.2395F, 0.9202F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(0, 46).addBox(-0.3825F, -0.4676F, -3.7595F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7757F, 6.0197F, -0.6325F, 0.2361F, -0.2395F, 0.9202F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(88, 58).addBox(2.0F, -0.1006F, -0.4263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4F, 3.8127F, -0.9596F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(55, 23).addBox(-0.5F, -0.05F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.5333F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(10, 100).addBox(2.0F, 0.2994F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, 1.4357F, -0.478F, 1.1868F, 0.0F, 0.0F));

		PartDefinition bone7 = Hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r299 = bone7.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(102, 60).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r300 = bone7.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r301 = bone7.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(62, 76).mirror().addBox(-0.9F, -0.3134F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, -0.1F, -0.9746F, -0.4211F));

		PartDefinition cube_r302 = bone7.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(30, 102).mirror().addBox(-3.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r303 = bone7.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(53, 92).mirror().addBox(-0.6175F, -1.5554F, -0.2623F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7757F, 6.0197F, -0.6325F, 1.5887F, 0.2395F, -0.9202F));

		PartDefinition cube_r304 = bone7.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(-0.6175F, -0.343F, -1.7961F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7757F, 6.0197F, -0.6325F, -0.5929F, 0.2395F, -0.9202F));

		PartDefinition cube_r305 = bone7.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(34, 85).mirror().addBox(-0.6175F, -0.0005F, 0.0434F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.7757F, 6.0197F, -0.6325F, 0.8906F, 0.2395F, -0.9202F));

		PartDefinition cube_r306 = bone7.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.6175F, -0.4676F, -3.7595F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7757F, 6.0197F, -0.6325F, 0.2361F, 0.2395F, -0.9202F));

		PartDefinition cube_r307 = bone7.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-3.0F, -0.1006F, -0.4263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 3.8127F, -0.9596F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r308 = bone7.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(55, 23).mirror().addBox(-0.5F, -0.05F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5333F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r309 = bone7.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-3.0F, 0.2994F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, 1.4357F, -0.478F, 1.1868F, 0.0F, 0.0F));

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