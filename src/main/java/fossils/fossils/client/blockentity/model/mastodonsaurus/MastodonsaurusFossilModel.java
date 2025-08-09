package fossils.fossils.client.blockentity.model.mastodonsaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MastodonsaurusFossilModel extends SkullModelBase {
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
	private final ModelPart bone7;
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
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone8;

	public MastodonsaurusFossilModel(ModelPart root) {
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
		this.bone7 = this.chest.getChild("bone7");
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
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone8 = this.Hips.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-9.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(22, 71).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(113, 0).addBox(0.5F, -0.2028F, -1.4109F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(113, 0).mirror().addBox(-1.5F, -0.2028F, -1.4109F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.3162F, 28.5878F, -0.1255F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(5, 111).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7028F, -1.4109F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(36, 110).addBox(0.0F, -2.3F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6528F, -3.5109F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(42, 17).addBox(-0.5F, -0.391F, -6.0999F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0799F, -0.1305F, -0.0104F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(53, 108).addBox(0.0F, -2.5F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(64, 108).addBox(0.0F, -2.65F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3609F, -6.0021F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 22).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -1.7776F, 0.483F, 0.2647F, -0.7466F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 104).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -1.7776F, 0.5438F, 0.0477F, -0.3626F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 114).mirror().addBox(-3.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.2578F, 0.4865F, -1.3413F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(104, 20).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.483F, 0.2647F, -0.7466F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 104).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.5438F, 0.0477F, -0.3626F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 107).mirror().addBox(-4.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.2787F, 0.5356F, -1.3312F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(104, 18).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.5274F, 0.2951F, -0.7345F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 104).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.5948F, 0.0601F, -0.36F));

		PartDefinition cube_r9 = Bodymiddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 104).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -1.7776F, 0.5438F, -0.0477F, 0.3626F));

		PartDefinition cube_r10 = Bodymiddle.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(104, 22).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -1.7776F, 0.483F, -0.2647F, 0.7466F));

		PartDefinition cube_r11 = Bodymiddle.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 104).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.5438F, -0.0477F, 0.3626F));

		PartDefinition cube_r12 = Bodymiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 20).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.483F, -0.2647F, 0.7466F));

		PartDefinition cube_r13 = Bodymiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(18, 114).addBox(2.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -3.7776F, 0.2578F, -0.4865F, 1.3413F));

		PartDefinition cube_r14 = Bodymiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(64, 104).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.5948F, -0.0601F, 0.36F));

		PartDefinition cube_r15 = Bodymiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(104, 18).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.5274F, -0.2951F, 0.7345F));

		PartDefinition cube_r16 = Bodymiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 107).addBox(2.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0736F, -5.7776F, 0.2787F, -0.5356F, 1.3312F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(108, 52).addBox(0.0F, -2.45F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.1571F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(44, 7).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.016F, -6.1097F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(56, 108).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(73, 111).addBox(0.0F, -2.55F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5047F, -5.9973F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 104).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.4422F, 0.0221F, -0.2961F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 16).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.3966F, 0.2022F, -0.6966F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-5.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.2193F, 0.3878F, -1.2876F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(96, 44).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.4174F, 0.0139F, -0.2442F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(104, 107).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.3766F, 0.1849F, -0.6481F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-6.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.2121F, 0.3625F, -1.2379F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(50, 104).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.3157F, -0.0115F, -0.2443F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(104, 14).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.2925F, 0.1211F, -0.661F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(85, 44).mirror().addBox(-6.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.1767F, 0.2633F, -1.2488F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(74, 29).addBox(2.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.2193F, -0.3878F, 1.2876F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(104, 16).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.3966F, -0.2022F, 0.6966F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(57, 104).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -1.6679F, 0.4422F, -0.0221F, 0.2961F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(87, 68).addBox(2.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.2121F, -0.3625F, 1.2379F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(104, 107).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.3766F, -0.1849F, 0.6481F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 44).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -3.6679F, 0.4174F, -0.0139F, 0.2442F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(50, 104).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.3157F, 0.0115F, 0.2443F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(104, 14).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.2925F, -0.1211F, 0.661F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(85, 44).addBox(2.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0896F, -5.6679F, 0.1767F, -0.2633F, 1.2488F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(70, 111).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(17, 47).addBox(-0.4F, -0.4874F, -5.7045F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.088F, -6.2F, 0.0115F, -0.0873F, -0.001F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(11, 56).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.4874F, -1.7045F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(23, 108).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.5048F, -5.7009F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(108, 57).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.4873F, -3.701F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(82, 61).mirror().addBox(-6.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0485F, -1.268F, 0.1781F, 0.263F, -1.3008F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(104, 41).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0485F, -1.268F, 0.2934F, 0.1201F, -0.7132F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(104, 39).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0485F, -1.268F, 0.3162F, -0.0127F, -0.2967F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-7.4605F, -2.3725F, -0.4305F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -3.168F, 0.1781F, 0.263F, -1.2659F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(1.9383F, -2.3697F, -5.7523F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -3.168F, 2.9114F, 0.7233F, 1.6751F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 104).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -3.168F, 0.2935F, 0.1201F, -0.6783F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(104, 30).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -3.168F, 0.3162F, -0.0127F, -0.2618F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(105, 32).mirror().addBox(-2.2587F, -2.3775F, -3.3602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 1.1835F, 1.4059F, -0.1231F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-4.3407F, -2.4101F, -3.6522F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 102).mirror().addBox(-5.5407F, -2.4074F, -3.6522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.1724F, 0.94F, -1.141F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(0.4232F, -2.3998F, -6.6545F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 2.8088F, 1.0871F, 1.5428F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(103, 65).mirror().addBox(-4.502F, -2.3838F, -0.9465F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.1611F, 0.326F, -1.2498F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 44).mirror().addBox(-7.4214F, -2.4027F, -0.6243F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.1556F, 0.1967F, -1.2711F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(104, 28).mirror().addBox(-1.494F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.2484F, -0.0296F, -0.2605F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(104, 103).mirror().addBox(-3.351F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.2382F, 0.0771F, -0.6839F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(104, 39).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0485F, -1.268F, 0.3162F, 0.0127F, 0.2967F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(104, 41).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0485F, -1.268F, 0.2934F, -0.1201F, 0.7132F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(82, 61).addBox(2.4605F, -2.3725F, -0.4305F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.0485F, -1.268F, 0.1781F, -0.263F, 1.3008F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(104, 30).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -3.168F, 0.3162F, 0.0127F, 0.2618F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(31, 104).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -3.168F, 0.2935F, -0.1201F, 0.6783F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(95, 50).addBox(-2.9383F, -2.3697F, -5.7523F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -3.168F, 2.9114F, -0.7233F, -1.6751F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(71, 53).addBox(2.4605F, -2.3725F, -0.4305F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -3.168F, 0.1781F, -0.263F, 1.2659F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(104, 103).addBox(1.351F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.2382F, -0.0771F, 0.6839F));

		PartDefinition cube_r57 = Bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(104, 28).addBox(-0.506F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.2484F, 0.0296F, 0.2605F));

		PartDefinition cube_r58 = Bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 44).addBox(2.4214F, -2.4027F, -0.6243F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.1556F, -0.1967F, 1.2711F));

		PartDefinition cube_r59 = Bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(105, 32).addBox(0.2587F, -2.3775F, -3.3602F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 1.1835F, -1.4059F, 0.1231F));

		PartDefinition cube_r60 = Bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(103, 65).addBox(2.502F, -2.3838F, -0.9465F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.1611F, -0.326F, 1.2498F));

		PartDefinition cube_r61 = Bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(57, 83).addBox(3.3407F, -2.4101F, -3.6522F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 102).addBox(3.5407F, -2.4074F, -3.6522F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.1724F, -0.94F, 1.141F));

		PartDefinition cube_r62 = Bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(97, 30).addBox(-1.4232F, -2.3998F, -6.6545F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 2.8088F, -1.0871F, -1.5428F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(21, 29).addBox(-0.5F, -0.6F, -7.975F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1076F, -5.7085F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(108, 94).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6299F, -1.9588F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(23, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5998F, -3.961F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 98).mirror().addBox(0.1328F, -2.855F, -7.5571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(97, 27).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 2.813F, 1.2007F, 1.5816F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(71, 51).mirror().addBox(-8.5937F, -2.8617F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 107).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1175F, 0.0895F, -1.2417F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 102).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1126F, 0.9674F, -1.144F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 102).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.2515F, 1.3116F, -0.9934F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 50).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1203F, 1.0108F, -1.1348F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(113, 82).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(104, 26).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1473F, 0.0088F, -0.6529F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 80).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1616F, -0.4225F, -0.7209F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(104, 24).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1374F, -0.054F, -0.2209F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-9.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 80).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1149F, 0.0904F, -1.1896F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 102).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1082F, 0.9686F, -1.0953F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(19, 97).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 2.8206F, 1.2006F, 1.641F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(96, 101).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.2425F, 1.3132F, -0.9498F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(100, 46).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1157F, 1.0119F, -1.0864F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(113, 110).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 78).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1456F, 0.011F, -0.6006F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(108, 112).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 78).mirror().addBox(-2.5219F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1596F, -0.4204F, -0.6678F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(78, 106).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1368F, -0.0513F, -0.1685F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 29).mirror().addBox(-10.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 106).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1108F, 0.0733F, -1.2073F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(101, 88).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.0985F, 0.9519F, -1.1206F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(97, 18).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 2.8167F, 1.2181F, 1.62F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(101, 86).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.2129F, 1.2974F, -0.9958F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(100, 37).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.105F, 0.9953F, -1.1128F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(113, 108).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1601F, 0.0208F, -0.6178F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(64, 106).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1328F, -0.0009F, -0.618F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(103, 112).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 8).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1464F, -0.4331F, -0.6797F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 106).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1201F, -0.0568F, -0.185F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(113, 100).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 106).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1602F, 0.0208F, -0.6004F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(111, 106).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 113).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1747F, -0.4096F, -0.6739F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(99, 82).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1317F, 1.0273F, -1.0728F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(101, 84).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2852F, 1.3271F, -0.9084F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(97, 15).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 2.817F, 1.1832F, 1.6376F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(101, 72).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1229F, 0.984F, -1.0831F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 106).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 45).mirror().addBox(-10.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1215F, 0.1066F, -1.189F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(22, 106).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1541F, -0.0486F, -0.1695F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(104, 24).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1374F, 0.054F, 0.2209F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(113, 80).addBox(1.5218F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 113).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1616F, 0.4225F, 0.7209F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(104, 26).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 82).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1473F, -0.0088F, 0.6529F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(102, 50).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1203F, -1.0108F, 1.1348F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 102).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.2515F, -1.3116F, 0.9934F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(47, 98).addBox(-1.1328F, -2.855F, -7.5571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(97, 27).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 2.813F, -1.2007F, -1.5816F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(64, 102).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1126F, -0.9674F, 1.144F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(41, 107).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 51).addBox(2.5937F, -2.8617F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1175F, -0.0895F, 1.2417F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(78, 106).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1368F, 0.0513F, 0.1685F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(113, 78).addBox(1.5218F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 112).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1596F, 0.4204F, 0.6678F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(106, 78).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 110).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1456F, -0.011F, 0.6006F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(100, 46).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1157F, -1.0119F, 1.0864F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(96, 101).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.2425F, -1.3132F, 0.9498F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(19, 97).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 2.8206F, -1.2006F, -1.641F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(50, 102).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1082F, -0.9686F, 1.0953F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(106, 80).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 42).addBox(2.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1149F, -0.0904F, 1.1896F));

		PartDefinition cube_r112 = body2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 106).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1201F, 0.0568F, 0.185F));

		PartDefinition cube_r113 = body2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(113, 8).addBox(1.5218F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(103, 112).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1464F, 0.4331F, 0.6797F));

		PartDefinition cube_r114 = body2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 106).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1328F, 0.0009F, 0.618F));

		PartDefinition cube_r115 = body2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(113, 108).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1601F, -0.0208F, 0.6178F));

		PartDefinition cube_r116 = body2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(100, 37).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.105F, -0.9953F, 1.1128F));

		PartDefinition cube_r117 = body2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(101, 86).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.2129F, -1.2974F, 0.9958F));

		PartDefinition cube_r118 = body2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(97, 18).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 2.8167F, -1.2181F, -1.62F));

		PartDefinition cube_r119 = body2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(101, 88).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.0985F, -0.9519F, 1.1206F));

		PartDefinition cube_r120 = body2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(71, 106).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 29).addBox(2.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -5.3594F, 0.1108F, -0.0733F, 1.2073F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(113, 100).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 106).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1602F, -0.0208F, 0.6004F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(111, 106).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 113).addBox(1.5218F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1747F, 0.4096F, 0.6739F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(99, 82).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1317F, -1.0273F, 1.0728F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(101, 84).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2852F, -1.3271F, 0.9084F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(97, 15).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 2.817F, -1.1832F, -1.6376F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(101, 72).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1229F, -0.984F, 1.0831F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(50, 106).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 45).addBox(2.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1215F, -0.1066F, 1.189F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(22, 106).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1541F, 0.0486F, 0.1695F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(15, 108).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6F, -7.975F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(20, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6F, -5.975F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.4F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1852F, -7.9788F, 0.0352F, -0.1308F, -0.0046F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(101, 103).addBox(0.0F, -3.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3999F, -1.9895F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(38, 104).addBox(0.0F, -3.225F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3999F, -3.9913F, -0.2793F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(17, 100).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(37, 65).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(107, 48).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1802F, -0.045F, -0.2405F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(107, 46).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 112).mirror().addBox(-3.7506F, -0.9228F, -0.1845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1824F, 0.0349F, -0.6696F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 61).mirror().addBox(-8.5937F, -2.8617F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(107, 36).mirror().addBox(-4.5937F, -2.8429F, -0.1845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1323F, 0.1306F, -1.2575F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(113, 69).mirror().addBox(-2.5219F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 62).mirror().addBox(-2.5219F, -0.9063F, 1.4183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1976F, -0.3939F, -0.7527F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(101, 70).mirror().addBox(-4.5157F, -2.8716F, -3.8949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1475F, 1.0066F, -1.1324F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(91, 96).mirror().addBox(0.4328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 2.8103F, 1.157F, 1.5617F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(101, 59).mirror().addBox(-3.2362F, -2.8721F, -4.2617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.3612F, 1.3466F, -0.9044F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(103, 12).mirror().addBox(-4.0079F, -2.8659F, -3.1024F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1585F, 1.0498F, -1.1195F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(104, 92).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2454F, -0.0583F, -0.2083F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(104, 90).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 88).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2472F, 0.0497F, -0.6312F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(63, 15).mirror().addBox(-9.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 82).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.1786F, 0.1788F, -1.2148F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(51, 113).mirror().addBox(-2.5219F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 84).mirror().addBox(-2.5219F, -0.9063F, 1.5183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2656F, -0.3728F, -0.7425F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(101, 57).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2501F, 1.0467F, -1.0089F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(84, 96).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 2.7492F, 1.0959F, 1.542F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(101, 55).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.6603F, 1.3674F, -0.5764F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2705F, 1.0889F, -0.9856F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(15, 106).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1533F, -0.045F, -0.1696F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(106, 6).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 98).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1579F, 0.0237F, -0.6006F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(44, 15).mirror().addBox(-10.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(106, 4).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1181F, 0.1078F, -1.1895F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(13, 113).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(108, 72).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1721F, -0.4069F, -0.673F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(101, 2).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1169F, 0.9855F, -1.0883F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(96, 65).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 2.8266F, 1.1831F, 1.6464F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(101, 0).mirror().addBox(-3.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.2727F, 1.3292F, -0.9207F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(98, 68).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1253F, 1.0289F, -1.0784F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(113, 86).mirror().addBox(-3.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 67).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1855F, 0.0455F, -0.5649F));

		PartDefinition cube_r154 = chest.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(92, 9).mirror().addBox(-2.5219F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(113, 6).mirror().addBox(-2.5219F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.2F, -0.383F, -0.6491F));

		PartDefinition cube_r155 = chest.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(100, 76).mirror().addBox(-4.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1548F, 1.0607F, -1.0182F));

		PartDefinition cube_r156 = chest.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(100, 74).mirror().addBox(-3.4862F, -2.8722F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.3639F, 1.3577F, -0.7972F));

		PartDefinition cube_r157 = chest.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(96, 62).mirror().addBox(0.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 2.8261F, 1.148F, 1.6806F));

		PartDefinition cube_r158 = chest.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(100, 48).mirror().addBox(-4.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1438F, 1.0176F, -1.031F));

		PartDefinition cube_r159 = chest.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(104, 105).mirror().addBox(-4.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(59, 13).mirror().addBox(-9.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.129F, 0.1412F, -1.1535F));

		PartDefinition cube_r160 = chest.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(105, 34).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1874F, -0.0367F, -0.1363F));

		PartDefinition cube_r161 = chest.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(113, 112).addBox(2.7506F, -0.9228F, -0.1845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 46).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1824F, -0.0349F, 0.6696F));

		PartDefinition cube_r162 = chest.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(113, 62).addBox(1.5218F, -0.9063F, 1.4183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 69).addBox(1.5218F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1976F, 0.3939F, 0.7527F));

		PartDefinition cube_r163 = chest.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(103, 12).addBox(2.0079F, -2.8659F, -3.1024F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1585F, -1.0498F, 1.1195F));

		PartDefinition cube_r164 = chest.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(101, 59).addBox(1.2362F, -2.8721F, -4.2617F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.3612F, -1.3466F, 0.9044F));

		PartDefinition cube_r165 = chest.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(91, 96).addBox(-1.4328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 2.8103F, -1.157F, -1.5617F));

		PartDefinition cube_r166 = chest.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(101, 70).addBox(2.5157F, -2.8716F, -3.8949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1475F, -1.0066F, 1.1324F));

		PartDefinition cube_r167 = chest.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(107, 36).addBox(2.5937F, -2.8429F, -0.1845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 61).addBox(2.5937F, -2.8617F, -0.4845F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1323F, -0.1306F, 1.2575F));

		PartDefinition cube_r168 = chest.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(107, 48).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1802F, 0.045F, 0.2405F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(113, 88).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(104, 90).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2472F, -0.0497F, 0.6312F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(113, 84).addBox(1.5218F, -0.9063F, 1.5183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 113).addBox(1.5218F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2656F, 0.3728F, 0.7425F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(101, 53).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2705F, -1.0889F, 0.9856F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(101, 55).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.6603F, -1.3674F, 0.5764F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(84, 96).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 2.7492F, -1.0959F, -1.542F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(101, 57).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2501F, -1.0467F, 1.0089F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(106, 82).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 15).addBox(2.5937F, -2.8617F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.1786F, -0.1788F, 1.2148F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(104, 92).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2454F, 0.0583F, 0.2083F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(113, 98).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(106, 6).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1579F, -0.0237F, 0.6006F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(108, 72).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 113).addBox(1.5218F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1721F, 0.4069F, 0.673F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(98, 68).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1253F, -1.0289F, 1.0784F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(101, 0).addBox(1.4862F, -2.8721F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.2727F, -1.3292F, 0.9207F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(96, 65).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 2.8266F, -1.1831F, -1.6464F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(101, 2).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1169F, -0.9855F, 1.0883F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 4).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 15).addBox(2.5937F, -2.8617F, -0.4845F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1181F, -0.1078F, 1.1895F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(15, 106).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1533F, 0.045F, 0.1696F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(96, 62).addBox(-1.1328F, -2.8589F, -5.9571F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 2.8261F, -1.148F, -1.6806F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(100, 76).addBox(2.2079F, -2.8659F, -2.7524F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1548F, -1.0607F, 1.0182F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(100, 74).addBox(1.4862F, -2.8722F, -4.1367F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.3639F, -1.3577F, 0.7972F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(100, 48).addBox(2.6907F, -2.8716F, -3.6949F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1438F, -1.0176F, 1.031F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(92, 9).addBox(1.5218F, -0.9063F, 1.8183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 6).addBox(1.5218F, -0.9108F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.2F, 0.383F, 0.6491F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(104, 105).addBox(2.5937F, -2.8429F, 0.0155F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 13).addBox(2.5937F, -2.8618F, -0.4845F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.129F, -0.1412F, 1.1535F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(113, 86).addBox(2.7506F, -0.9228F, 0.0155F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 67).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1855F, -0.0455F, 0.5649F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(105, 34).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1874F, 0.0367F, 0.1363F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(9, 88).addBox(-0.5F, 1.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.4379F, 6.8026F, -9.9299F, 0.6684F, 0.0073F, -1.3894F));

		PartDefinition cube_r193 = forelegL.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 94).addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r194 = forelegL.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r195 = forelegL.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(95, 74).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r196 = forelegL.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(31, 100).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r197 = forelegL.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(44, 76).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create().texOffs(26, 102).addBox(-0.5765F, 0.7362F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3612F, 5.9904F, -1.2376F, 3.1005F, 0.9681F, -1.8385F));

		PartDefinition cube_r198 = forelegL2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(110, 11).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(108, 87).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.5354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r199 = forelegL2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(99, 91).addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, -0.4133F, 1.42F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r200 = forelegL2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(24, 61).addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, -0.4133F, 1.42F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r201 = forelegL2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(90, 34).addBox(-0.5F, -2.2F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(36, 100).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.449F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r202 = forelegL2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(110, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0765F, 2.7362F, -0.149F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2274F, 2.8678F, 1.1763F, -0.0309F, 0.0308F, -1.7894F));

		PartDefinition cube_r203 = bone.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(30, 55).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(27, 90).addBox(-0.5F, 1.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.438F, 6.8026F, -9.9299F, -0.6844F, 0.0197F, 1.3552F));

		PartDefinition cube_r204 = forelegL3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(94, 80).addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r205 = forelegL3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(12, 98).addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r206 = forelegL3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(98, 9).addBox(-0.5F, -1.5F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r207 = forelegL3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(100, 33).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r208 = forelegL3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(53, 76).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(103, 8).addBox(-0.4235F, 0.7362F, -0.649F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3612F, 5.9904F, -1.2376F, -0.755F, -0.644F, -0.3778F));

		PartDefinition cube_r209 = forelegL4.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(111, 20).addBox(-0.5F, -0.2F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(18, 111).addBox(-0.5F, -0.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.5354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r210 = forelegL4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(5, 100).addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, -0.4133F, 1.42F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r211 = forelegL4.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(91, 99).addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0765F, -0.4133F, 1.42F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r212 = forelegL4.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(90, 74).addBox(-0.5F, -2.2F, 0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(0, 103).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.449F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r213 = forelegL4.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(111, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0765F, 2.7362F, -0.149F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2274F, 2.8678F, 1.1763F, 0.0113F, -0.0421F, 0.7415F));

		PartDefinition cube_r214 = bone5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 2.1697F, -10.2017F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r215 = bone2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(67, 96).addBox(0.197F, -0.7305F, 5.6536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 1.2254F, 0.0845F, -0.0623F));

		PartDefinition cube_r216 = bone2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(65, 69).addBox(0.197F, -2.1227F, 2.796F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 0.6582F, 0.0845F, -0.0623F));

		PartDefinition cube_r217 = bone2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(18, 108).addBox(0.2226F, -5.6176F, 3.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 0.3615F, 0.0845F, -0.0623F));

		PartDefinition cube_r218 = bone2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 23).addBox(0.2226F, -0.7964F, 0.0092F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 0.9723F, 0.0845F, -0.0623F));

		PartDefinition cube_r219 = bone2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 63).addBox(-0.5F, -2.554F, -1.2469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5F, 5.7823F, 3.3572F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r220 = bone2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(80, 55).addBox(-0.5F, -0.5238F, -0.6562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 5.6173F, 0.2395F, 1.6566F, 0.1585F, 0.1029F));

		PartDefinition cube_r221 = bone2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(11, 74).addBox(-1.1015F, 2.0945F, 0.0043F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3912F, 6.5478F, 3.3493F, 1.9411F, -0.4518F, -0.1679F));

		PartDefinition cube_r222 = bone2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(0, 73).addBox(-1.1114F, -1.347F, 0.0793F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3912F, 6.5478F, 3.3493F, 1.8966F, -0.4525F, -0.1659F));

		PartDefinition cube_r223 = bone2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(89, 54).addBox(-4.0F, -4.9163F, -0.7967F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 6.4226F, -3.6135F, 1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(50, 89).addBox(-0.78F, -1.9587F, -0.155F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.9062F, 7.5945F, -6.3095F, 1.6807F, 0.6825F, 0.0789F));

		PartDefinition cube_r225 = bone2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 82).addBox(-2.9372F, -2.7709F, -0.155F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3182F, 7.083F, -3.6561F, 1.7626F, 0.249F, 0.0421F));

		PartDefinition cube_r226 = bone2.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 75).addBox(-3.6088F, 0.0075F, 0.0413F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3912F, 6.5478F, 3.3493F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r227 = bone2.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(31, 0).addBox(-6.1088F, 1.9728F, -0.5173F, 9.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3912F, 6.8478F, -3.5507F, 1.6755F, 0.0F, 0.0F));

		PartDefinition cube_r228 = bone2.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(42, 25).addBox(-5.1088F, 0.0109F, -0.3712F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3912F, 6.8478F, -3.5507F, 1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r229 = bone2.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, -0.7948F, -2.8654F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 4.5495F, -1.0737F, 0.1285F, 0.1931F, 0.1721F));

		PartDefinition cube_r230 = bone2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(90, 29).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.0818F, 6.1183F, -3.2576F, 0.0328F, 0.4068F, 0.2868F));

		PartDefinition cube_r231 = bone2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(43, 89).addBox(-1.0F, 0.7052F, -1.8654F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 4.4495F, -1.0737F, 0.1285F, 0.1931F, 0.1721F));

		PartDefinition cube_r232 = bone2.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(36, 89).addBox(-0.5F, 0.015F, 0.0828F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2712F, 5.0489F, -0.9268F, -0.0626F, 0.1585F, 0.1029F));

		PartDefinition cube_r233 = bone2.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(44, 72).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0402F, 5.5508F, -3.7884F, 0.5564F, 0.4068F, 0.2868F));

		PartDefinition cube_r234 = bone2.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(87, 82).addBox(-0.5F, -0.775F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.122F, 5.2198F, -3.8236F, 1.2545F, 0.4068F, 0.2868F));

		PartDefinition cube_r235 = bone2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 90).addBox(-0.5F, -1.7F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.0226F, 4.2074F, -2.0669F, 0.7569F, 0.1742F, 0.1913F));

		PartDefinition cube_r236 = bone2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(0, 79).addBox(-1.4939F, -0.6955F, -0.7099F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 3.7849F, -2.8053F, 1.0187F, 0.1742F, 0.1913F));

		PartDefinition cube_r237 = bone2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -1.0848F, -1.1756F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, 5.7823F, 3.3572F, -2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r238 = bone2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(92, 40).addBox(-0.5F, 0.9918F, -0.3424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5F, 5.7823F, 3.3572F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r239 = bone2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(77, 108).addBox(-0.5F, 0.4188F, -1.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5F, 5.7823F, 3.3572F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r240 = bone2.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(108, 99).addBox(-0.5F, -0.35F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5F, 3.9404F, 1.5747F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r241 = bone2.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(62, 80).addBox(2.0F, -0.5256F, -1.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.3845F, 1.7102F, 2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r242 = bone2.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(87, 87).addBox(0.1341F, -0.1523F, -0.2805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 1.8857F, 0.0535F, -0.0529F));

		PartDefinition cube_r243 = bone2.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(78, 89).addBox(0.2226F, -4.3687F, 3.5775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 0.5884F, 0.0845F, -0.0623F));

		PartDefinition cube_r244 = bone2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(47, 48).addBox(0.2226F, -2.8475F, -0.1501F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0334F, 3.5169F, 0.1205F, 0.9374F, 0.0845F, -0.0623F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 2.1697F, -10.2017F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r245 = bone7.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(67, 96).mirror().addBox(-1.197F, -0.7305F, 5.6536F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 1.2254F, -0.0845F, 0.0623F));

		PartDefinition cube_r246 = bone7.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(65, 69).mirror().addBox(-1.197F, -2.1227F, 2.796F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 0.6582F, -0.0845F, 0.0623F));

		PartDefinition cube_r247 = bone7.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(18, 108).mirror().addBox(-1.2226F, -5.6176F, 3.7107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 0.3615F, -0.0845F, 0.0623F));

		PartDefinition cube_r248 = bone7.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(74, 23).mirror().addBox(-1.2226F, -0.7964F, 0.0092F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 0.9723F, -0.0845F, 0.0623F));

		PartDefinition cube_r249 = bone7.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-0.5F, -2.554F, -1.2469F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.7823F, 3.3572F, 1.6668F, 0.0F, 0.0F));

		PartDefinition cube_r250 = bone7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(80, 55).mirror().addBox(-0.5F, -0.5238F, -0.6562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.6173F, 0.2395F, 1.6566F, -0.1585F, -0.1029F));

		PartDefinition cube_r251 = bone7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(94, 70).mirror().addBox(-4.6583F, 4.692F, -0.012F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3912F, 6.5478F, 3.3493F, 2.039F, 0.7515F, 0.3368F));

		PartDefinition cube_r252 = bone7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(11, 74).mirror().addBox(-2.8986F, 2.0945F, 0.0043F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.3912F, 6.5478F, 3.3493F, 1.9411F, 0.4518F, 0.1679F));

		PartDefinition cube_r253 = bone7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-2.8886F, -1.347F, 0.0793F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.3912F, 6.5478F, 3.3493F, 1.8966F, 0.4525F, 0.1659F));

		PartDefinition cube_r254 = bone7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(50, 89).mirror().addBox(-1.22F, -1.9587F, -0.155F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.9062F, 7.5945F, -6.3095F, 1.6807F, -0.6825F, -0.0789F));

		PartDefinition cube_r255 = bone7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(-0.0628F, -2.7709F, -0.155F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3182F, 7.083F, -3.6561F, 1.7626F, -0.249F, -0.0421F));

		PartDefinition cube_r256 = bone7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(0.0F, -0.7948F, -2.8654F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 4.5495F, -1.0737F, 0.1285F, -0.1931F, -0.1721F));

		PartDefinition cube_r257 = bone7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0818F, 6.1183F, -3.2576F, 0.0328F, -0.4068F, -0.2868F));

		PartDefinition cube_r258 = bone7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(0.0F, 0.7052F, -1.8654F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 4.4495F, -1.0737F, 0.1285F, -0.1931F, -0.1721F));

		PartDefinition cube_r259 = bone7.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(36, 89).mirror().addBox(-0.5F, 0.015F, 0.0828F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2712F, 5.0489F, -0.9268F, -0.0626F, -0.1585F, -0.1029F));

		PartDefinition cube_r260 = bone7.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(44, 72).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0402F, 5.5508F, -3.7884F, 0.5564F, -0.4068F, -0.2868F));

		PartDefinition cube_r261 = bone7.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(87, 82).mirror().addBox(-0.5F, -0.775F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.122F, 5.2198F, -3.8236F, 1.2545F, -0.4068F, -0.2868F));

		PartDefinition cube_r262 = bone7.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(-0.5F, -1.7F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0226F, 4.2074F, -2.0669F, 0.7569F, -0.1742F, -0.1913F));

		PartDefinition cube_r263 = bone7.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(0.4939F, -0.6955F, -0.7099F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7849F, -2.8053F, 1.0187F, -0.1742F, -0.1913F));

		PartDefinition cube_r264 = bone7.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -1.0848F, -1.1756F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.7823F, 3.3572F, -2.8449F, 0.0F, 0.0F));

		PartDefinition cube_r265 = bone7.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(92, 40).mirror().addBox(-0.5F, 0.9918F, -0.3424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.7823F, 3.3572F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r266 = bone7.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(77, 108).mirror().addBox(-0.5F, 0.4188F, -1.4912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 5.7823F, 3.3572F, 2.3911F, 0.0F, 0.0F));

		PartDefinition cube_r267 = bone7.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(108, 99).mirror().addBox(-0.5F, -0.35F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.9404F, 1.5747F, 2.1031F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone7.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(62, 80).mirror().addBox(-3.0F, -0.5256F, -1.0263F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3845F, 1.7102F, 2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone7.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-1.1341F, -0.1523F, -0.2805F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 1.8857F, -0.0535F, 0.0529F));

		PartDefinition cube_r270 = bone7.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(78, 89).mirror().addBox(-1.2226F, -4.3687F, 3.5775F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 0.5884F, -0.0845F, 0.0623F));

		PartDefinition cube_r271 = bone7.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(-1.2226F, -2.8475F, -0.1501F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0334F, 3.5169F, 0.1205F, 0.9374F, -0.0845F, 0.0623F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(41, 56).addBox(-0.5F, -0.7596F, -4.9227F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(-0.5F, -0.7596F, -8.9227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.3466F, -9.0026F, -0.1197F, -0.1744F, 0.0056F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(56, 113).addBox(0.0F, -0.8743F, -3.9076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 113).addBox(0.0F, -1.4743F, -1.9076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 111).addBox(0.0F, -2.4743F, -0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7595F, -4.9184F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(47, 101).addBox(0.0F, -3.275F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7247F, -0.9213F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Neck_r3 = Neck.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(85, 109).addBox(0.0F, -2.975F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7596F, -2.921F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Neck.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(85, 107).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2166F, 0.0619F, -0.7726F));

		PartDefinition cube_r273 = Neck.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(107, 76).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2226F, -0.0346F, -0.3469F));

		PartDefinition cube_r274 = Neck.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(107, 74).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.37F, 0.017F, -0.5234F));

		PartDefinition cube_r275 = Neck.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-5.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.3312F, 0.1691F, -0.9346F));

		PartDefinition cube_r276 = Neck.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(40, 37).mirror().addBox(-7.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.1459F, 0.1721F, -1.3602F));

		PartDefinition cube_r277 = Neck.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(113, 71).mirror().addBox(-2.5219F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2316F, -0.3638F, -0.87F));

		PartDefinition cube_r278 = Neck.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(111, 41).mirror().addBox(0.1328F, -2.8589F, -5.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 2.8112F, 1.1134F, 1.4578F));

		PartDefinition cube_r279 = Neck.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(103, 44).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -4.1797F, 0.5976F, 0.4183F, -0.4951F));

		PartDefinition cube_r280 = Neck.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(103, 44).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -4.1797F, 0.5976F, -0.4183F, 0.4951F));

		PartDefinition cube_r281 = Neck.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(111, 41).addBox(-1.1328F, -2.8589F, -5.3571F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 2.8112F, -1.1134F, -1.4578F));

		PartDefinition cube_r282 = Neck.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(113, 71).addBox(1.5218F, -0.9107F, 0.9183F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2316F, 0.3638F, 0.87F));

		PartDefinition cube_r283 = Neck.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(40, 37).addBox(2.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.1459F, -0.1721F, 1.3602F));

		PartDefinition cube_r284 = Neck.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(107, 76).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2226F, 0.0346F, 0.3469F));

		PartDefinition cube_r285 = Neck.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(85, 107).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.2166F, -0.0619F, 0.7726F));

		PartDefinition cube_r286 = Neck.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(83, 80).addBox(1.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.3312F, -0.1691F, 0.9346F));

		PartDefinition cube_r287 = Neck.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(107, 74).addBox(-0.0237F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.37F, -0.017F, 0.5234F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.6575F, -8.3117F, -0.3648F, -0.3489F, -0.0095F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(76, 69).addBox(-0.99F, -0.825F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.0F, 1.0563F, -17.8146F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(85, 92).addBox(-0.14F, -0.125F, -1.725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8962F, 0.2014F, -16.4267F, 0.3164F, 0.5364F, 0.4196F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(67, 92).addBox(-0.14F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(1.5292F, 0.0776F, -16.3268F, 0.2799F, 0.2526F, 0.3255F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(85, 25).addBox(-0.99F, -0.125F, -1.825F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0852F, -16.3734F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(59, 24).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F))
				.texOffs(0, 7).addBox(-1.0F, -0.5F, 0.8F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.01F, 0.797F, -14.4159F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -0.9F, -1.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, 1.4743F, -3.83F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(66, 36).addBox(-0.49F, -0.1F, -3.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.2683F, -13.379F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(65, 63).addBox(-0.49F, -0.175F, -0.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.5F, -0.2242F, -13.3401F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(70, 31).addBox(-2.49F, -1.4963F, 8.1748F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0686F, -9.2682F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(40, 29).addBox(-2.49F, -0.1458F, 5.7144F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5F, -1.0686F, -9.2682F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(79, 99).addBox(-1.4228F, -0.5F, -0.8109F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4328F, 0.9703F, -15.1778F, 0.0488F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(99, 5).addBox(-0.8308F, -0.45F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1592F, 0.9659F, -17.8847F, -0.0385F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(111, 38).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.01F, -2.2416F, -3.0536F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(23, 7).addBox(-1.99F, 0.0668F, -1.0237F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -1.0686F, -9.2682F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftBrow = Head.addOrReplaceChild("leftBrow", CubeListBuilder.create(), PartPose.offset(1.9F, -1.6012F, -3.3646F));

		PartDefinition Head_r15 = leftBrow.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(42, 94).addBox(-0.14F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.05F, 1.516F, -13.0088F, 0.2714F, -0.0667F, 0.2352F));

		PartDefinition Head_r16 = leftBrow.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(20, 82).addBox(-0.09F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.206F, 1.4424F, -10.2081F, 0.0566F, -0.0229F, 0.3833F));

		PartDefinition Head_r17 = leftBrow.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(93, 46).addBox(-0.5574F, -0.0615F, 0.028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4F, 0.5325F, -5.9036F, 0.2679F, -0.2106F, -0.0573F));

		PartDefinition Head_r18 = leftBrow.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(108, 62).addBox(-0.35F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.3539F, 1.5684F, -6.0817F, 0.3319F, -0.4574F, -0.151F));

		PartDefinition Head_r19 = leftBrow.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(52, 70).addBox(-0.5F, -1.175F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2636F, 2.1266F, -7.9075F, 0.2105F, 0.0834F, 0.0256F));

		PartDefinition Head_r20 = leftBrow.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(99, 79).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0444F, 2.6561F, -11.4977F, -0.1069F, -1.2464F, 0.129F));

		PartDefinition Head_r21 = leftBrow.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(76, 111).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7032F, 2.4966F, -14.1597F, -0.1867F, 0.9451F, -0.1965F));

		PartDefinition Head_r22 = leftBrow.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(91, 103).addBox(-0.1F, -0.7F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4983F, 2.5486F, -12.6812F, 0.0151F, 0.0F, 0.0F));

		PartDefinition Head_r23 = leftBrow.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(103, 99).addBox(-1.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4983F, 2.5486F, -12.6812F, -0.1158F, 0.0F, 0.0F));

		PartDefinition Head_r24 = leftBrow.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(111, 50).addBox(0.9603F, -0.1123F, -5.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0336F, 2.6399F, -8.5781F, -0.1246F, 0.505F, -0.105F));

		PartDefinition Head_r25 = leftBrow.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(94, 58).addBox(-0.0807F, -0.3539F, -4.4697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0336F, 2.6399F, -8.5781F, -0.0532F, 0.2661F, -0.0049F));

		PartDefinition Head_r26 = leftBrow.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(11, 68).addBox(-0.4391F, -0.3539F, -2.5668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0336F, 2.6399F, -8.5781F, -0.0518F, 0.1266F, 0.0026F));

		PartDefinition Head_r27 = leftBrow.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5544F, -0.2421F, 1.3547F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0336F, 2.6399F, -8.5781F, 0.0347F, 0.2138F, -0.002F));

		PartDefinition Head_r28 = leftBrow.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.4738F, 0.7214F, -2.7042F, 0.2603F, 0.3367F, 0.0939F));

		PartDefinition Head_r29 = leftBrow.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(33, 78).addBox(-0.99F, -0.825F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-1.9F, 2.6574F, -14.45F, -0.032F, 0.6106F, -0.0183F));

		PartDefinition Head_r30 = leftBrow.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(17, 39).addBox(-2.9F, -0.5F, -0.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.99F, 2.584F, -3.9538F, -0.0021F, 0.7851F, -0.0262F));

		PartDefinition Head_r31 = leftBrow.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(80, 12).addBox(-2.9F, -0.5F, -2.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.89F, 2.4452F, -9.252F, -0.1008F, -1.3077F, 0.0974F));

		PartDefinition Head_r32 = leftBrow.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(86, 50).addBox(-1.0F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)), PartPose.offsetAndRotation(-1.89F, 2.4452F, -9.252F, -0.043F, -0.9159F, 0.0341F));

		PartDefinition Head_r33 = leftBrow.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(81, 16).addBox(-0.09F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 1.345F, -10.2141F, 0.0606F, -0.0074F, 0.1219F));

		PartDefinition Head_r34 = leftBrow.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(32, 48).addBox(-1.89F, -0.175F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.107F)), PartPose.offsetAndRotation(-0.3891F, 0.7326F, -6.125F, 0.1662F, 0.0689F, 0.0115F));

		PartDefinition Head_r35 = leftBrow.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(0, 38).addBox(0.0019F, 0.0668F, -0.9402F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4F, 0.5325F, -5.9036F, 0.2624F, 0.0674F, 0.0181F));

		PartDefinition rightBrow = Head.addOrReplaceChild("rightBrow", CubeListBuilder.create(), PartPose.offset(-1.88F, -1.6012F, -3.3646F));

		PartDefinition Head_r36 = rightBrow.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-0.86F, -0.125F, -1.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.05F, 1.516F, -13.0088F, 0.2714F, 0.0667F, -0.2352F));

		PartDefinition Head_r37 = rightBrow.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.91F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.206F, 1.4424F, -10.2081F, 0.0566F, 0.0229F, -0.3833F));

		PartDefinition Head_r38 = rightBrow.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(93, 46).mirror().addBox(-0.4426F, -0.0615F, 0.028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.5325F, -5.9036F, 0.2679F, 0.2106F, 0.0573F));

		PartDefinition Head_r39 = rightBrow.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(108, 62).mirror().addBox(-0.65F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.3539F, 1.5684F, -6.0817F, 0.3319F, 0.4574F, 0.151F));

		PartDefinition Head_r40 = rightBrow.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(52, 70).mirror().addBox(-0.5F, -1.175F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2636F, 2.1266F, -7.9075F, 0.2105F, -0.0834F, -0.0256F));

		PartDefinition Head_r41 = rightBrow.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(99, 79).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0444F, 2.6561F, -11.4977F, -0.1069F, 1.2464F, -0.129F));

		PartDefinition Head_r42 = rightBrow.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(76, 111).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7032F, 2.4966F, -14.1597F, -0.1867F, -0.9451F, 0.1965F));

		PartDefinition Head_r43 = rightBrow.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(91, 103).mirror().addBox(-0.9F, -0.7F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4983F, 2.5486F, -12.6812F, 0.0151F, 0.0F, 0.0F));

		PartDefinition Head_r44 = rightBrow.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(103, 99).mirror().addBox(0.0F, -0.9F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4983F, 2.5486F, -12.6812F, -0.1158F, 0.0F, 0.0F));

		PartDefinition Head_r45 = rightBrow.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(111, 50).mirror().addBox(-1.9603F, -0.1123F, -5.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0336F, 2.6399F, -8.5781F, -0.1246F, -0.505F, 0.105F));

		PartDefinition Head_r46 = rightBrow.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-0.9193F, -0.3539F, -4.4697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0336F, 2.6399F, -8.5781F, -0.0532F, -0.2661F, 0.0049F));

		PartDefinition Head_r47 = rightBrow.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(-0.5609F, -0.3539F, -2.5668F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0336F, 2.6399F, -8.5781F, -0.0518F, -0.1266F, -0.0026F));

		PartDefinition Head_r48 = rightBrow.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(36, 39).mirror().addBox(-0.4456F, -0.2421F, 1.3547F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0336F, 2.6399F, -8.5781F, 0.0347F, -0.2138F, 0.002F));

		PartDefinition Head_r49 = rightBrow.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.4738F, 0.7214F, -2.7042F, 0.2603F, -0.3367F, -0.0939F));

		PartDefinition Head_r50 = rightBrow.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(33, 78).mirror().addBox(-1.01F, -0.825F, -0.2F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(1.9F, 2.6574F, -14.45F, -0.032F, -0.6106F, 0.0183F));

		PartDefinition Head_r51 = rightBrow.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(17, 39).mirror().addBox(-0.1F, -0.5F, -0.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.99F, 2.584F, -3.9538F, -0.0021F, -0.7851F, 0.0262F));

		PartDefinition Head_r52 = rightBrow.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(80, 12).mirror().addBox(-0.1F, -0.5F, -2.8F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.89F, 2.4452F, -9.252F, -0.1008F, 1.3077F, -0.0974F));

		PartDefinition Head_r53 = rightBrow.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(86, 50).mirror().addBox(-1.0F, -0.5F, -2.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.093F)).mirror(false), PartPose.offsetAndRotation(1.89F, 2.4452F, -9.252F, -0.043F, 0.9159F, -0.0341F));

		PartDefinition Head_r54 = rightBrow.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(81, 16).mirror().addBox(-0.91F, -0.1F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.345F, -10.2141F, 0.0606F, 0.0074F, -0.1219F));

		PartDefinition Head_r55 = rightBrow.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-0.11F, -0.175F, -4.9F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.107F)).mirror(false), PartPose.offsetAndRotation(0.3891F, 0.7326F, -6.125F, 0.1662F, -0.0689F, -0.0115F));

		PartDefinition Head_r56 = rightBrow.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(0, 38).mirror().addBox(-1.0019F, 0.0668F, -0.9402F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.5325F, -5.9036F, 0.2624F, -0.0674F, -0.0181F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(3.01F, -0.7725F, -6.5882F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(46, 111).addBox(-0.65F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5237F, 1.3318F, -11.6598F, 0.7039F, 1.3348F, 0.8036F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(0, 86).addBox(-1.8F, -0.1F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8983F, 1.1257F, -11.4165F, 0.232F, 0.8524F, 0.2896F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(59, 111).addBox(-0.6878F, -0.4922F, -0.6208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4969F, 1.2854F, -10.2768F, 0.1028F, 0.0873F, 0.3299F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(111, 56).addBox(-0.7234F, -0.4922F, -0.2455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4969F, 1.2854F, -10.2768F, 0.1315F, 0.6769F, 0.4036F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(31, 108).addBox(-0.3119F, -0.4922F, -0.2333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.4969F, 1.2854F, -10.2768F, 0.1028F, -0.0863F, 0.312F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(108, 69).addBox(-0.3857F, -0.4922F, -0.8586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 108).addBox(-0.3857F, -0.4922F, -0.5586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4969F, 1.2854F, -10.2768F, 0.1233F, 0.5904F, 0.3898F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(83, 40).addBox(-1.9037F, -0.2607F, -1.7226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.587F, 1.3185F, -9.7954F, 0.0713F, 0.2709F, 0.252F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(94, 88).addBox(-1.1971F, -0.2651F, -0.7622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0281F, 1.1338F, -9.0582F, 0.0694F, 0.1835F, 0.2543F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(18, 87).addBox(-1.8F, -0.2F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.7029F, 1.3122F, -7.4634F, -0.0024F, 0.0849F, 0.3048F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(24, 65).addBox(-0.0668F, -0.1F, -3.726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0012F, -0.1514F, -3.4182F, 0.0482F, -0.1885F, 0.6423F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(79, 35).addBox(-0.0918F, -0.15F, -2.9259F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.9683F, 0.0065F, -3.6711F, 0.0692F, -0.1448F, 0.427F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(78, 63).addBox(-1.6918F, -0.15F, -2.926F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(1.569F, 1.1904F, -3.6555F, 0.0685F, -0.0055F, 0.4366F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(92, 92).addBox(-2.9098F, -1.2364F, 7.6846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.0946F, 0.3057F, 0.0523F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(94, 54).addBox(-4.5365F, -1.6296F, 7.4027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.0627F, 0.4804F, 0.0574F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(111, 59).addBox(-7.1581F, -1.6296F, 7.478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.0786F, 0.7851F, 0.084F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(15, 55).addBox(-2.6918F, -0.75F, -4.1259F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.3044F, 1.9523F, -3.4839F, -0.0353F, -0.0111F, 0.3319F));

		PartDefinition Head_r73 = leftFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(9, 84).addBox(-0.3136F, -0.7258F, -0.2929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0958F, 1.0983F, 6.0224F, -0.1769F, -0.1909F, 0.6399F));

		PartDefinition Head_r74 = leftFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(85, 21).addBox(-8.406F, -2.6607F, 5.0164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, -0.0982F, 1.0224F, 0.8035F));

		PartDefinition Head_r75 = leftFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(55, 31).addBox(-4.1504F, -0.7146F, 6.1824F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.1614F, 0.4399F, 0.8026F));

		PartDefinition Head_r76 = leftFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(63, 75).addBox(2.2125F, -2.9647F, 7.6514F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, -0.089F, -0.0511F, 0.8643F));

		PartDefinition Head_r77 = leftFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(0, 95).addBox(0.8578F, -0.3675F, -0.453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0823F, -0.1374F, 7.6038F, -0.0524F, -0.2741F, 0.792F));

		PartDefinition Head_r78 = leftFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(71, 47).addBox(-2.3144F, -0.6721F, -1.5871F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0958F, 1.0983F, 6.0224F, -0.0756F, 0.1932F, 0.5784F));

		PartDefinition Head_r79 = leftFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(52, 63).addBox(0.355F, -1.4853F, 5.3452F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.0249F, -0.2089F, 0.9672F));

		PartDefinition Head_r80 = leftFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(67, 56).addBox(-2.0712F, -1.2551F, 5.078F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.0823F, 0.3132F, 0.8324F));

		PartDefinition Head_r81 = leftFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(9, 80).addBox(-1.1121F, -0.903F, -3.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0958F, 1.0983F, 6.0224F, 0.1409F, 0.3312F, 0.5803F));

		PartDefinition Head_r82 = leftFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(22, 77).addBox(1.0095F, -1.0713F, -1.6712F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F))
				.texOffs(72, 6).addBox(1.0095F, -1.1213F, -0.6712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F))
				.texOffs(52, 0).addBox(1.0095F, -1.0713F, 1.3288F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.1069F, -0.2538F, 0.7587F));

		PartDefinition Head_r83 = leftFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(49, 94).addBox(1.0009F, -1.1213F, 1.0212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.1036F, -0.0369F, 0.7818F));

		PartDefinition Head_r84 = leftFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(31, 111).addBox(2.6197F, -1.1213F, 0.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.1676F, -0.9029F, 0.6536F));

		PartDefinition Head_r85 = leftFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(111, 38).addBox(-0.7226F, -0.079F, 0.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.2605F, 0.2331F, 0.0622F));

		PartDefinition Head_r86 = leftFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(33, 72).addBox(0.5067F, -0.079F, -0.6712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.51F, -0.2961F, -2.68F, 0.2547F, -0.1047F, -0.0265F));

		PartDefinition Head_r87 = leftFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(0, 29).addBox(-2.8F, 0.0F, -6.9F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.965F, 1.0058F, 3.1013F, 0.0434F, 0.0391F, 0.4628F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.99F, -0.7725F, -6.5882F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(46, 111).mirror().addBox(-0.35F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5237F, 1.3318F, -11.6598F, 0.7039F, -1.3348F, -0.8036F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.2F, -0.1F, -1.575F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8983F, 1.1257F, -11.4165F, 0.232F, -0.8524F, -0.2896F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(59, 111).mirror().addBox(-0.3122F, -0.4922F, -0.6208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4969F, 1.2854F, -10.2768F, 0.1028F, -0.0873F, -0.3299F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-0.2766F, -0.4922F, -0.2455F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4969F, 1.2854F, -10.2768F, 0.1315F, -0.6769F, -0.4036F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(31, 108).mirror().addBox(-0.6881F, -0.4922F, -0.2333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-0.4969F, 1.2854F, -10.2768F, 0.1028F, 0.0863F, -0.312F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(108, 69).mirror().addBox(-0.6143F, -0.4922F, -0.8586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(67, 108).mirror().addBox(-0.6143F, -0.4922F, -0.5586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4969F, 1.2854F, -10.2768F, 0.1233F, -0.5904F, -0.3898F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(83, 40).mirror().addBox(-0.0963F, -0.2607F, -1.7226F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.587F, 1.3185F, -9.7954F, 0.0713F, -0.2709F, -0.252F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(94, 88).mirror().addBox(-0.8029F, -0.2651F, -0.7622F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.0281F, 1.1338F, -9.0582F, 0.0694F, -0.1835F, -0.2543F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(18, 87).mirror().addBox(-0.2F, -0.2F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.7029F, 1.3122F, -7.4634F, -0.0024F, -0.0849F, -0.3048F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(24, 65).mirror().addBox(-1.9332F, -0.1F, -3.726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0012F, -0.1514F, -3.4182F, 0.0482F, 0.1885F, -0.6423F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(79, 35).mirror().addBox(-1.9082F, -0.15F, -2.9259F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.9683F, 0.0065F, -3.6711F, 0.0692F, 0.1448F, -0.427F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(78, 63).mirror().addBox(-0.3082F, -0.15F, -2.926F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-1.5691F, 1.1904F, -3.6555F, 0.0685F, 0.0055F, -0.4366F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(1.9098F, -1.2364F, 7.6846F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.0946F, -0.3057F, -0.0523F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(3.5365F, -1.6296F, 7.4027F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.0627F, -0.4804F, -0.0574F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(111, 59).mirror().addBox(6.1581F, -1.6296F, 7.478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.0786F, -0.7851F, -0.084F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.3082F, -0.75F, -4.1259F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.3044F, 1.9523F, -3.4839F, -0.0353F, 0.0111F, -0.3319F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(9, 84).mirror().addBox(-1.6864F, -0.7258F, -0.2929F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0958F, 1.0983F, 6.0224F, -0.1769F, 0.1909F, -0.6399F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(85, 21).mirror().addBox(6.406F, -2.6607F, 5.0164F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, -0.0982F, -1.0224F, -0.8035F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(55, 31).mirror().addBox(0.1504F, -0.7146F, 6.1824F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.1614F, -0.4399F, -0.8026F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-4.2125F, -2.9647F, 7.6514F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, -0.089F, 0.0511F, -0.8643F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-2.8578F, -0.3675F, -0.453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.0823F, -0.1374F, 7.6038F, -0.0524F, 0.2741F, -0.792F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-1.6856F, -0.6721F, -1.5871F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0958F, 1.0983F, 6.0224F, -0.0756F, -0.1932F, -0.5784F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(-3.355F, -1.4853F, 5.3452F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.0249F, 0.2089F, -0.9672F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-0.9288F, -1.2551F, 5.078F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.0823F, -0.3132F, -0.8324F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(9, 80).mirror().addBox(-1.8879F, -0.903F, -3.2F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0958F, 1.0983F, 6.0224F, 0.1409F, -0.3312F, -0.5803F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(22, 77).mirror().addBox(-3.0095F, -1.0713F, -1.6712F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(72, 6).mirror().addBox(-2.0095F, -1.1213F, -0.6712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(52, 0).mirror().addBox(-4.0095F, -1.0713F, 1.3288F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.1069F, 0.2538F, -0.7587F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(49, 94).mirror().addBox(-2.0009F, -1.1213F, 1.0212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.1036F, 0.0369F, -0.7818F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(31, 111).mirror().addBox(-3.6197F, -1.1213F, 0.4003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.1676F, 0.9029F, -0.6536F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(111, 38).mirror().addBox(-0.2774F, -0.079F, 0.9434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.2605F, -0.2331F, -0.0622F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(33, 72).mirror().addBox(-1.5067F, -0.079F, -0.6712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.51F, -0.2961F, -2.68F, 0.2547F, 0.1047F, 0.0265F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.2F, 0.0F, -6.9F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.965F, 1.0058F, 3.1013F, 0.0434F, -0.0391F, -0.4628F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4421F, 0.8669F, 0.6589F, 0.0F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(29, 83).mirror().addBox(0.0028F, 0.7527F, -2.2659F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.8442F, 3.3002F, 0.7824F, -1.2915F, -0.0873F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(43, 83).mirror().addBox(0.0226F, -0.0584F, -0.9226F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.4442F, 3.3002F, -4.0176F, -1.4748F, -0.2618F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(0.0226F, 2.6665F, 0.5703F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4442F, 3.3002F, -4.0176F, -1.6581F, -0.2618F, 0.0F));

		PartDefinition cube_r291 = jaw.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(42, 98).mirror().addBox(0.1166F, 2.7772F, 0.1599F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0442F, 3.3002F, -9.5176F, -1.6887F, -0.1745F, -0.0149F));

		PartDefinition cube_r292 = jaw.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(61, 97).mirror().addBox(0.1166F, 2.8889F, -1.1396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(56, 97).mirror().addBox(0.1166F, 2.8889F, -1.4396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0442F, 3.3002F, -9.5176F, -1.4705F, -0.1745F, -0.0149F));

		PartDefinition cube_r293 = jaw.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 99).mirror().addBox(-0.0595F, -0.1688F, -0.4593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-2.9442F, 3.3002F, -15.3176F, -1.6426F, -0.3316F, -0.0155F));

		PartDefinition cube_r294 = jaw.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(26, 108).mirror().addBox(-0.1586F, -0.1391F, -0.7912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.9442F, 3.3002F, -17.9176F, -1.499F, -0.5497F, -0.0172F));

		PartDefinition cube_r295 = jaw.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(14, 91).mirror().addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.49F, 2.4492F, -18.6091F, -1.3768F, -0.0022F, -0.0145F));

		PartDefinition cube_r296 = jaw.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(94, 85).mirror().addBox(-0.3721F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(12, 95).mirror().addBox(-0.3721F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 85).addBox(-0.3721F, -1.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6179F, 3.0858F, -18.7404F, -1.4668F, 0.0F, 0.0F));

		PartDefinition cube_r297 = jaw.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.575F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(108, 8).mirror().addBox(-0.575F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0351F, 3.1418F, -17.9453F, -1.5877F, -1.1593F, -0.0495F));

		PartDefinition cube_r298 = jaw.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 107).mirror().addBox(-0.2F, -0.175F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(10, 107).mirror().addBox(-0.2F, 0.225F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5504F, 3.4478F, -18.4165F, -1.5816F, -0.8976F, -0.0565F));

		PartDefinition cube_r299 = jaw.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(85, 104).mirror().addBox(-0.2F, 0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(-0.2F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.5423F, 3.0486F, -18.441F, -1.4725F, -0.8976F, -0.0565F));

		PartDefinition cube_r300 = jaw.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(111, 53).mirror().addBox(-0.1586F, -0.1977F, -0.5882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9442F, 3.3002F, -17.9176F, -1.6299F, -0.5497F, -0.0172F));

		PartDefinition cube_r301 = jaw.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(48, 108).mirror().addBox(-0.8F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(48, 108).addBox(0.1419F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.161F, 2.9785F, -18.8856F, -1.4061F, 0.0F, 0.0F));

		PartDefinition cube_r302 = jaw.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(111, 14).mirror().addBox(-0.375F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4072F, 2.8833F, -18.1399F, -1.4061F, -0.9376F, -0.1151F));

		PartDefinition cube_r303 = jaw.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(111, 26).mirror().addBox(-0.325F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.4072F, 2.8833F, -18.1399F, -1.4569F, -0.5485F, -0.0415F));

		PartDefinition cube_r304 = jaw.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(0.0405F, -0.5861F, -1.2163F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(7, 95).mirror().addBox(-0.0595F, -0.0861F, -0.9663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.9442F, 3.3002F, -15.3176F, -1.468F, -0.3316F, -0.0155F));

		PartDefinition cube_r305 = jaw.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(98, 96).mirror().addBox(0.0938F, -0.1324F, -0.1042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-3.5486F, 1.7989F, -12.3284F, -1.4312F, -0.1745F, 0.0F));

		PartDefinition cube_r306 = jaw.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(74, 94).mirror().addBox(0.0938F, -3.7324F, -0.2042F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-4.0351F, 1.8011F, -9.5692F, -1.4456F, -0.2785F, -0.0132F));

		PartDefinition cube_r307 = jaw.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(95, 34).mirror().addBox(0.0938F, -0.0324F, -1.7042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(50, 83).mirror().addBox(0.0938F, -0.0324F, -1.3042F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.0442F, 3.3002F, -9.5176F, -1.5359F, -0.1745F, 0.0F));

		PartDefinition cube_r308 = jaw.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(83, 74).mirror().addBox(0.0938F, -0.1494F, -0.9098F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0442F, 3.3002F, -9.5176F, -1.6668F, -0.1745F, 0.0F));

		PartDefinition cube_r309 = jaw.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(57, 85).mirror().addBox(0.0226F, 2.5735F, -2.0005F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.4442F, 3.3002F, -4.0176F, -1.4486F, -0.2618F, 0.0F));

		PartDefinition cube_r310 = jaw.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(0.0226F, -0.506F, -2.6473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.4442F, 3.3002F, -4.0176F, -1.2043F, -0.2618F, 0.0F));

		PartDefinition cube_r311 = jaw.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(80, 82).mirror().addBox(0.0028F, 1.1164F, -2.9409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8442F, 3.3002F, 0.7824F, -1.5097F, -0.0873F, 0.0F));

		PartDefinition cube_r312 = jaw.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(36, 83).mirror().addBox(0.0028F, 0.3508F, -2.1033F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.8442F, 3.3002F, 0.7824F, -1.405F, -0.0873F, 0.0F));

		PartDefinition cube_r313 = jaw.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(91, 11).mirror().addBox(0.0F, 0.0786F, -0.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 11).addBox(10.78F, 0.0786F, -0.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.88F, 1.7075F, 0.9315F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r314 = jaw.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(71, 87).mirror().addBox(-5.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(71, 87).addBox(5.78F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.88F, 1.5057F, 2.758F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r315 = jaw.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(87, 70).mirror().addBox(-5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 70).addBox(5.78F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.88F, 0.6397F, 3.258F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r316 = jaw.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(108, 84).mirror().addBox(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(108, 84).addBox(5.78F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.88F, -0.5142F, 1.5496F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r317 = jaw.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(41, 109).mirror().addBox(-5.0F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(41, 109).addBox(5.78F, 0.3F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.88F, -0.3F, 3.6F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r318 = jaw.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(99, 39).mirror().addBox(-5.0F, 1.3F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(99, 39).addBox(5.78F, 1.3F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.88F, -1.3F, 2.6F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r319 = jaw.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(83, 29).mirror().addBox(0.0028F, -0.5644F, -3.0796F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.8442F, 3.3002F, 0.7824F, -1.3177F, -0.0873F, 0.0F));

		PartDefinition cube_r320 = jaw.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(83, 29).addBox(-1.0028F, -0.5644F, -3.0796F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(5.8642F, 3.3002F, 0.7824F, -1.3177F, 0.0873F, 0.0F));

		PartDefinition cube_r321 = jaw.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(29, 83).addBox(-1.0028F, 0.7527F, -2.2659F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.8642F, 3.3002F, 0.7824F, -1.2915F, 0.0873F, 0.0F));

		PartDefinition cube_r322 = jaw.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(43, 83).addBox(-1.0226F, -0.0584F, -0.9226F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(5.4642F, 3.3002F, -4.0176F, -1.4748F, 0.2618F, 0.0F));

		PartDefinition cube_r323 = jaw.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(26, 97).addBox(-1.0226F, 2.6665F, 0.5703F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4642F, 3.3002F, -4.0176F, -1.6581F, 0.2618F, 0.0F));

		PartDefinition cube_r324 = jaw.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(42, 98).addBox(-1.1166F, 2.7772F, 0.1599F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0642F, 3.3002F, -9.5176F, -1.6887F, 0.1745F, 0.0149F));

		PartDefinition cube_r325 = jaw.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(61, 97).addBox(-1.1166F, 2.8889F, -1.1396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F))
				.texOffs(56, 97).addBox(-1.1166F, 2.8889F, -1.4396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0642F, 3.3002F, -9.5176F, -1.4705F, 0.1745F, 0.0149F));

		PartDefinition cube_r326 = jaw.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(86, 99).addBox(-0.9405F, -0.1688F, -0.4593F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(2.9642F, 3.3002F, -15.3176F, -1.6426F, 0.3316F, 0.0155F));

		PartDefinition cube_r327 = jaw.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(26, 108).addBox(-0.8414F, -0.1391F, -0.7912F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.9642F, 3.3002F, -17.9176F, -1.499F, 0.5497F, 0.0172F));

		PartDefinition cube_r328 = jaw.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(14, 91).addBox(-0.5F, -0.5F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.51F, 2.4492F, -18.6091F, -1.3768F, 0.0022F, 0.0145F));

		PartDefinition cube_r329 = jaw.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(108, 0).addBox(-0.425F, -0.3F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(108, 8).addBox(-0.425F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0551F, 3.1418F, -17.9453F, -1.5877F, 1.1593F, 0.0495F));

		PartDefinition cube_r330 = jaw.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 107).addBox(-0.8F, -0.175F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(10, 107).addBox(-0.8F, 0.225F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5704F, 3.4478F, -18.4165F, -1.5816F, 0.8976F, 0.0565F));

		PartDefinition cube_r331 = jaw.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(85, 104).addBox(-0.8F, 0.225F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(5, 108).addBox(-0.8F, -0.175F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.5623F, 3.0486F, -18.441F, -1.4725F, 0.8976F, 0.0565F));

		PartDefinition cube_r332 = jaw.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(111, 53).addBox(-0.8414F, -0.1977F, -0.5882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9642F, 3.3002F, -17.9176F, -1.6299F, 0.5497F, 0.0172F));

		PartDefinition cube_r333 = jaw.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(111, 14).addBox(-0.625F, -0.15F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4272F, 2.8833F, -18.1399F, -1.4061F, 0.9376F, 0.1151F));

		PartDefinition cube_r334 = jaw.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(111, 26).addBox(-0.675F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4272F, 2.8833F, -18.1399F, -1.4569F, 0.5485F, 0.0415F));

		PartDefinition cube_r335 = jaw.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(0, 98).addBox(-1.0405F, -0.5861F, -1.2163F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 95).addBox(-0.9405F, -0.0861F, -0.9663F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.9642F, 3.3002F, -15.3176F, -1.468F, 0.3316F, 0.0155F));

		PartDefinition cube_r336 = jaw.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(98, 96).addBox(-1.0938F, -0.1324F, -0.1042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.5686F, 1.7989F, -12.3284F, -1.4312F, 0.1745F, 0.0F));

		PartDefinition cube_r337 = jaw.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(74, 94).addBox(-1.0938F, -3.7324F, -0.2042F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.0551F, 1.8011F, -9.5692F, -1.4456F, 0.2785F, 0.0132F));

		PartDefinition cube_r338 = jaw.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(95, 34).addBox(-1.0938F, -0.0324F, -1.7042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(50, 83).addBox(-1.0938F, -0.0324F, -1.3042F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.0642F, 3.3002F, -9.5176F, -1.5359F, 0.1745F, 0.0F));

		PartDefinition cube_r339 = jaw.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(83, 74).addBox(-1.0938F, -0.1494F, -0.9098F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0642F, 3.3002F, -9.5176F, -1.6668F, 0.1745F, 0.0F));

		PartDefinition cube_r340 = jaw.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(57, 85).addBox(-1.0226F, 2.5735F, -2.0005F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.4642F, 3.3002F, -4.0176F, -1.4486F, 0.2618F, 0.0F));

		PartDefinition cube_r341 = jaw.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(64, 85).addBox(-1.0226F, -0.506F, -2.6473F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4642F, 3.3002F, -4.0176F, -1.2043F, 0.2618F, 0.0F));

		PartDefinition cube_r342 = jaw.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(80, 82).addBox(-1.0028F, 1.1164F, -2.9409F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8642F, 3.3002F, 0.7824F, -1.5097F, 0.0873F, 0.0F));

		PartDefinition cube_r343 = jaw.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(36, 83).addBox(-1.0028F, 0.3508F, -2.1033F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(5.8642F, 3.3002F, 0.7824F, -1.405F, 0.0873F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(59, 6).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.1439F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(100, 109).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(97, 109).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(113, 2).addBox(0.0F, 0.0473F, -0.2698F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 4.2753F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(112, 65).addBox(0.0F, -0.3F, -1.2F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3891F, 0.8652F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(42, 112).addBox(0.0F, 0.4F, 0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3891F, 0.8652F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(94, 109).addBox(0.0F, -2.4F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-1.0F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.0247F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(67, 0).addBox(0.0F, 0.0F, -0.1F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.0247F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(57, 17).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1347F, 4.7908F, -0.0685F, -0.2612F, 0.0177F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(39, 112).addBox(0.0F, -1.475F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(112, 32).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(84, 46).mirror().addBox(-0.6F, 0.0F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(84, 46).addBox(-0.4F, 0.0F, 1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailbase_r9 = Tailmiddlebase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(82, 108).addBox(0.0F, 1.6437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2124F, -0.5236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(54, 56).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.9007F, 0.0173F, -0.1745F, -0.003F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(26, 114).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 4.0764F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(111, 90).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 2.0764F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(32, 90).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tailmiddle.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(111, 102).addBox(0.0F, 6.8437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 109).addBox(0.0F, 4.1437F, 5.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 109).addBox(0.0F, 4.9437F, 7.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1124F, -7.4236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(70, 17).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.1359F, -0.173F, -0.0235F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(81, 113).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 3.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(64, 113).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 1.0255F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tailmiddleend.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(111, 94).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4235F, -10.4427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9584F, -0.0073F, -0.3054F, 0.0022F));

		PartDefinition Tailbase_r12 = Tailend.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(14, 88).addBox(0.0F, 11.5437F, 17.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(76, 12).addBox(0.0F, 10.7437F, 15.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 114).addBox(0.0F, 9.8437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -16.402F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7513F, 5.2129F, -3.4656F, 0.6538F, -0.1582F, -1.2766F));

		PartDefinition cube_r344 = hindlegL.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(21, 91).addBox(-0.502F, -1.3905F, -0.4105F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.5022F, -0.061F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r345 = hindlegL.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(59, 108).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0538F, 5.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r346 = hindlegL.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(103, 109).addBox(-0.0538F, -1.7973F, 0.7382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 6.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r347 = hindlegL.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(103, 61).addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0538F, 5.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r348 = hindlegL.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(41, 103).addBox(-0.5F, -0.6F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0475F, 3.715F, 0.5691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r349 = hindlegL.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(72, 100).addBox(4.9826F, 0.0363F, -1.9915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(57, 91).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(62, 91).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1269F, 5.0962F, 1.4848F, -1.0576F, 1.086F, 0.1367F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(60, 47).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.368F, 3.2313F, 0.4905F, -0.0243F, 0.0466F, -1.1795F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7513F, 5.2129F, -3.4656F, -0.6289F, -0.0203F, 1.0278F));

		PartDefinition cube_r350 = hindlegL3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(94, 21).addBox(-0.498F, -1.3905F, -0.4105F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 1.5022F, -0.061F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r351 = hindlegL3.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(72, 108).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0538F, 5.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r352 = hindlegL3.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(111, 23).addBox(-0.9462F, -1.7973F, 0.7382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, 6.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r353 = hindlegL3.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(96, 103).addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0538F, 5.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r354 = hindlegL3.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(103, 95).addBox(-0.5F, -0.6F, -0.275F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0475F, 3.715F, 0.5691F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r355 = hindlegL3.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(10, 103).addBox(-5.9826F, 0.0363F, -1.9915F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(32, 94).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(37, 94).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1269F, 5.0962F, 1.4848F, -0.1829F, -0.5698F, -0.5083F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(41, 63).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.368F, 3.2313F, 0.4905F, -0.0047F, -0.1396F, 0.7868F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r356 = bone3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(26, 111).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r357 = bone3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(10, 110).addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 1.8908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r358 = bone3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(83, 6).addBox(-0.1F, -0.3134F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, -0.1F, 0.9746F, 0.4211F));

		PartDefinition cube_r359 = bone3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(0, 110).addBox(2.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r360 = bone3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(99, 21).addBox(-0.5169F, -1.4306F, -0.3571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6048F, 6.0608F, -1.0408F, 1.4056F, 0.0062F, 0.9417F));

		PartDefinition cube_r361 = bone3.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(5, 104).addBox(-0.5169F, -0.337F, -1.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.6048F, 6.0608F, -1.0408F, -0.7761F, 0.0062F, 0.9417F));

		PartDefinition cube_r362 = bone3.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(90, 16).addBox(-0.5169F, 0.1559F, 0.051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.6048F, 6.0608F, -1.0408F, 0.7074F, 0.0062F, 0.9417F));

		PartDefinition cube_r363 = bone3.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(53, 37).addBox(-0.5169F, -0.3481F, -3.6582F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6048F, 6.0608F, -1.0408F, 0.0529F, 0.0062F, 0.9417F));

		PartDefinition cube_r364 = bone3.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(92, 5).addBox(2.0F, -0.1006F, -0.4263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4F, 3.8127F, -0.9596F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone3.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, -0.05F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.5332F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r366 = bone3.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(108, 109).addBox(2.0F, 0.2994F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, 1.4357F, -0.478F, 1.1868F, 0.0F, 0.0F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r367 = bone8.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(26, 111).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r368 = bone8.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(10, 110).mirror().addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r369 = bone8.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-0.9F, -0.3134F, 0.0444F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, -0.1F, -0.9746F, -0.4211F));

		PartDefinition cube_r370 = bone8.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-3.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r371 = bone8.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(99, 21).mirror().addBox(-0.4831F, -1.4306F, -0.3571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6048F, 6.0608F, -1.0408F, 1.4056F, -0.0062F, -0.9417F));

		PartDefinition cube_r372 = bone8.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(5, 104).mirror().addBox(-0.4831F, -0.337F, -1.6396F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.6048F, 6.0608F, -1.0408F, -0.7761F, -0.0062F, -0.9417F));

		PartDefinition cube_r373 = bone8.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-0.4831F, 0.1559F, 0.051F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.6048F, 6.0608F, -1.0408F, 0.7074F, -0.0062F, -0.9417F));

		PartDefinition cube_r374 = bone8.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-0.4831F, -0.3481F, -3.6582F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6048F, 6.0608F, -1.0408F, 0.0529F, -0.0062F, -0.9417F));

		PartDefinition cube_r375 = bone8.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(92, 5).mirror().addBox(-3.0F, -0.1006F, -0.4263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 3.8127F, -0.9596F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r376 = bone8.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(11, 61).mirror().addBox(-0.5F, -0.05F, -4.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5332F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r377 = bone8.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(108, 109).mirror().addBox(-3.0F, 0.2994F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, 1.4357F, -0.478F, 1.1868F, 0.0F, 0.0F));

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