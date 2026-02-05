package fossils.fossils.client.blockentity.model.proterogyrinus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ProterogyrinusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone7;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Lowerjawback;
	private final ModelPart bone3;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone5;
	private final ModelPart bone8;

	public ProterogyrinusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.body = this.Hips.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone11 = this.forelegL4.getChild("bone11");
		this.bone2 = this.chest.getChild("bone2");
		this.bone7 = this.chest.getChild("bone7");
		this.Neck = this.chest.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.Head = this.neck3.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Lowerjawback = this.Head.getChild("Lowerjawback");
		this.bone3 = this.Lowerjawback.getChild("bone3");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.tail = this.Tailend.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.bone6 = this.bone4.getChild("bone6");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone9 = this.hindlegL4.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone5 = this.Hips.getChild("bone5");
		this.bone8 = this.Hips.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -9.225F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(47, 22).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(84, 57).addBox(0.5F, -0.2028F, -1.4109F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(84, 59).addBox(0.5F, -0.2028F, -3.4109F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(84, 57).mirror().addBox(-2.5F, -0.2028F, -1.4109F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(84, 59).mirror().addBox(-2.5F, -0.2028F, -3.4109F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.7013F, 19.5282F, -0.2389F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(68, 91).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7028F, -1.4109F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(65, 91).addBox(0.0F, -2.4F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6528F, -3.5109F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body = Hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3568F, -3.4213F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = body.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(20, 91).addBox(0.0F, -2.425F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = body.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(46, 90).addBox(0.0F, -2.45F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5047F, -5.9973F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 75).mirror().addBox(-3.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.1509F, 0.1525F, -1.306F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 73).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.2098F, 0.0428F, -0.7196F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 71).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.2084F, -0.0491F, -0.2929F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 64).mirror().addBox(-4.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.1654F, 0.2302F, -1.2516F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.2648F, 0.0997F, -0.664F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.2819F, -0.0199F, -0.2438F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.3157F, -0.0115F, -0.2443F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 2).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.2925F, 0.1211F, -0.661F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-5.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.1767F, 0.2633F, -1.2488F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(31, 75).addBox(2.4605F, -2.3725F, -0.4305F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.1509F, -0.1525F, 1.306F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(83, 73).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.2098F, -0.0428F, 0.7196F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(83, 71).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -1.6679F, 0.2084F, 0.0491F, 0.2929F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(84, 64).addBox(2.4605F, -2.3725F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.1654F, -0.2302F, 1.2516F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(83, 49).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.2648F, -0.0997F, 0.664F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(83, 47).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0104F, -3.6679F, 0.2819F, 0.0199F, 0.2438F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 86).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.3157F, 0.0115F, 0.2443F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 2).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.2925F, -0.1211F, 0.661F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 51).addBox(2.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1104F, -5.6679F, 0.1767F, -0.2633F, 1.2488F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(72, 87).addBox(0.0F, -2.475F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(34, 8).addBox(-0.4F, -0.4874F, -5.7045F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.088F, -6.2F, 0.1511F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(38, 91).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.4874F, -1.7045F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(32, 89).addBox(0.0F, -2.55F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.5048F, -5.7009F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(91, 37).addBox(0.0F, -2.75F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.4873F, -3.701F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r19 = Bodyfront.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(7, 84).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1485F, -1.268F, 0.2494F, -0.0331F, -0.2952F));

		PartDefinition cube_r20 = Bodyfront.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1485F, -1.268F, 0.2405F, 0.0743F, -0.7184F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(75, 65).mirror().addBox(-5.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.1485F, -1.268F, 0.1591F, 0.1956F, -1.3051F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-1.4883F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0015F, -3.168F, 0.2993F, -0.0173F, -0.2615F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-3.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0015F, -3.168F, 0.2798F, 0.1092F, -0.6799F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(49, 75).mirror().addBox(-5.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0015F, -3.168F, 0.1727F, 0.2463F, -1.2673F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-3.351F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.2654F, 0.0992F, -0.6815F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(82, 67).mirror().addBox(-1.494F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.2822F, -0.0206F, -0.2613F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 56).mirror().addBox(-6.4214F, -2.4027F, -0.6243F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0985F, -4.968F, 0.1661F, 0.23F, -1.2689F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 84).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1485F, -1.268F, 0.2494F, 0.0331F, 0.2952F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 84).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1485F, -1.268F, 0.2405F, -0.0743F, 0.7184F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 65).addBox(2.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.1485F, -1.268F, 0.1591F, -0.1956F, 1.3051F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5117F, 0.0419F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0015F, -3.168F, 0.2993F, 0.0173F, 0.2615F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(75, 83).addBox(1.3666F, -0.591F, -0.4305F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0015F, -3.168F, 0.2798F, -0.1092F, 0.6799F));

		PartDefinition cube_r33 = Bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(49, 75).addBox(2.4605F, -2.3725F, -0.4305F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.0015F, -3.168F, 0.1727F, -0.2463F, 1.2673F));

		PartDefinition cube_r34 = Bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 69).addBox(1.351F, -0.6379F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.2654F, -0.0992F, 0.6815F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(82, 67).addBox(-0.506F, -0.0072F, -0.6243F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.2822F, 0.0206F, 0.2613F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(62, 56).addBox(2.4214F, -2.4027F, -0.6243F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0985F, -4.968F, 0.1661F, -0.23F, 1.2689F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.6F, -7.975F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F))
				.texOffs(94, 81).addBox(0.0F, -3.425F, -5.975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1076F, -5.7085F, 0.0979F, -0.0392F, -0.0476F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(94, 91).addBox(0.0F, -2.675F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6299F, -1.9588F, -0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(89, 94).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5998F, -3.961F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1203F, -0.0578F, -0.2199F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1334F, -0.0018F, -0.6529F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(68, 41).mirror().addBox(-6.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1118F, 0.073F, -1.2421F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1368F, -0.0513F, -0.1685F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 81).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1456F, 0.011F, -0.6006F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(59, 64).mirror().addBox(-6.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1149F, 0.0904F, -1.1896F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.2059F, -0.0406F, -0.1892F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 85).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.204F, 0.0496F, -0.6163F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-7.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.1422F, 0.1548F, -1.2037F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(21, 8).mirror().addBox(-7.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1546F, 0.1875F, -1.1841F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(85, 55).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2323F, 0.07F, -0.5971F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(84, 79).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2401F, -0.0337F, -0.173F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 0).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1203F, 0.0578F, 0.2199F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 86).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1334F, 0.0018F, 0.6529F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 41).addBox(2.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -1.3594F, 0.1118F, -0.073F, 1.2421F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(83, 4).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1368F, 0.0513F, 0.1685F));

		PartDefinition cube_r53 = body2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 81).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1456F, -0.011F, 0.6006F));

		PartDefinition cube_r54 = body2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(59, 64).addBox(2.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1061F, -3.3594F, 0.1149F, -0.0904F, 1.1896F));

		PartDefinition cube_r55 = body2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(79, 85).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.2059F, 0.0406F, 0.1892F));

		PartDefinition cube_r56 = body2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 85).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.204F, -0.0496F, 0.6163F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(55, 45).addBox(2.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2811F, -5.4594F, 0.1422F, -0.1548F, 1.2037F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(21, 8).addBox(2.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.1546F, -0.1875F, 1.1841F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(85, 55).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2323F, -0.07F, 0.5971F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 79).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2061F, -7.3594F, 0.2401F, 0.0337F, 0.173F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(94, 86).addBox(0.0F, -2.65F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6F, -7.975F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, -9.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1852F, -7.9788F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(54, 91).addBox(0.0F, -2.825F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3999F, -1.9895F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(75, 87).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3999F, -3.9913F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = chest.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(86, 34).addBox(0.0F, -2.625F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -8.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(91, 42).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, -6.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(58, 26).mirror().addBox(-6.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1542F, 0.197F, -1.2539F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.2373F, 0.0781F, -0.6665F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(75, 81).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.248F, -0.0283F, -0.243F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(57, 39).mirror().addBox(-7.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.1786F, 0.1788F, -1.2148F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(54, 84).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2472F, 0.0497F, -0.6312F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(84, 45).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2454F, -0.0583F, -0.2083F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-7.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1181F, 0.1078F, -1.1895F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1579F, 0.0237F, -0.6006F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(34, 84).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1533F, -0.045F, -0.1696F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(55, 47).mirror().addBox(-7.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.129F, 0.1412F, -1.1535F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1855F, 0.0455F, -0.5649F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(14, 84).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1874F, -0.0367F, -0.1363F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(58, 26).addBox(2.5937F, -2.8617F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.1542F, -0.197F, 1.2539F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 82).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.2373F, -0.0781F, 0.6665F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(75, 81).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -7.3806F, 0.248F, 0.0283F, 0.243F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 39).addBox(2.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.1786F, -0.1788F, 1.2148F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(54, 84).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2472F, -0.0497F, 0.6312F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(84, 45).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -5.5806F, 0.2454F, 0.0583F, 0.2083F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(55, 49).addBox(2.5937F, -2.8617F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1181F, -0.1078F, 1.1895F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(84, 43).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1579F, -0.0237F, 0.6006F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(34, 84).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0209F, -1.3806F, 0.1533F, 0.045F, 0.1696F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(55, 47).addBox(2.5937F, -2.8618F, -0.4845F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.129F, -0.1412F, 1.1535F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(21, 84).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1855F, -0.0455F, 0.5649F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(14, 84).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1791F, -3.4806F, 0.1874F, 0.0367F, 0.1363F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(14, 74).addBox(-0.5F, 2.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.7566F, 4.1856F, -8.4027F, -0.2065F, -0.292F, -0.7996F));

		PartDefinition cube_r85 = forelegL.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(49, 81).addBox(-0.5F, -1.15F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r86 = forelegL.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(24, 79).addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = forelegL.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(29, 81).addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r88 = forelegL.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(7, 79).addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r89 = forelegL.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(19, 74).addBox(-0.5F, -1.25F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.1903F, -0.6226F, 0.0884F, -0.01F, -0.0011F));

		PartDefinition cube_r90 = forelegL.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(9, 65).addBox(-0.5F, -0.425F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3612F, 5.9904F, -1.2376F, -2.7969F, 1.0666F, -1.5207F));

		PartDefinition cube_r91 = forelegL2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(86, 85).addBox(-0.5F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 61).addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.5354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r92 = forelegL2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(81, 26).addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, -0.4133F, 1.42F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r93 = forelegL2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 0).addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, -0.4133F, 1.42F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r94 = forelegL2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(13, 21).addBox(-0.5F, -2.2F, 0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(41, 78).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.449F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r95 = forelegL2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(86, 39).addBox(-0.5F, 0.35F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(-0.0765F, 2.7362F, -0.149F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r96 = forelegL2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(78, 71).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.449F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.554F, 3.8934F, 0.9285F, -0.0117F, 0.2603F, -1.2681F));

		PartDefinition cube_r97 = bone.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.2995F, -0.1208F, 0.4552F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-0.5F, 2.2F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.7566F, 4.1856F, -8.4027F, 0.4044F, 0.292F, 0.7996F));

		PartDefinition cube_r98 = forelegL3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(49, 81).mirror().addBox(-0.5F, -1.15F, -1.325F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r99 = forelegL3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(24, 79).mirror().addBox(-0.5F, -2.575F, -0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.6884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r100 = forelegL3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 81).mirror().addBox(-0.5F, -0.85F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r101 = forelegL3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-0.5F, -1.825F, -0.575F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8663F, 0.6673F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r102 = forelegL3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(19, 74).mirror().addBox(-0.5F, -1.25F, -0.725F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1903F, -0.6226F, 0.0884F, 0.01F, 0.0011F));

		PartDefinition cube_r103 = forelegL3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(9, 65).mirror().addBox(-0.5F, -0.425F, -0.975F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3612F, 5.9904F, -1.2376F, -2.5442F, -1.0855F, 1.5154F));

		PartDefinition cube_r104 = forelegL4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.5F, 0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(86, 61).mirror().addBox(-0.5F, 0.8F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.5354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r105 = forelegL4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-0.5F, -1.825F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, -0.4133F, 1.42F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r106 = forelegL4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.5F, -0.075F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.0765F, -0.4133F, 1.42F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r107 = forelegL4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(13, 21).mirror().addBox(-0.5F, -2.2F, 0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(41, 78).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.449F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r108 = forelegL4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.5F, 0.35F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 2.7362F, -0.149F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r109 = forelegL4.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.449F, 0.0524F, 0.0F, 0.0F));

		PartDefinition bone11 = forelegL4.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.554F, 3.8934F, 0.9285F, -0.0117F, -0.2603F, 1.2681F));

		PartDefinition cube_r110 = bone11.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3428F, 2.2678F, -8.3202F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(88, 9).addBox(-1.1843F, 3.2026F, 1.2388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -0.7438F, -0.1374F, 0.6764F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(90, 18).addBox(-1.1843F, 2.7968F, -0.3349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -0.3075F, -0.1374F, 0.6764F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(19, 20).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-1.3508F, 4.2423F, 1.5622F, -0.0513F, -0.1532F, 1.5588F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(19, 11).addBox(-1.1843F, 2.3009F, -1.3732F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, 0.0852F, -0.1374F, 0.6764F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(22, 46).addBox(-1.1843F, 0.926F, 0.6779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -0.2639F, -0.1374F, 0.6764F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(24, 75).addBox(-1.1843F, 0.0301F, 1.3174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -0.5693F, -0.1374F, 0.6764F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(33, 86).addBox(-1.1843F, -0.6824F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(86, 31).addBox(-1.1843F, -0.6824F, 0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -1.1365F, -0.1374F, 0.6764F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(54, 33).addBox(-1.1843F, -0.6002F, 0.0064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(1.5996F, 1.293F, -0.3807F, -1.4856F, -0.1374F, 0.6764F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(35, 39).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.8338F, -2.555F, -2.3481F, -1.4261F, 0.1019F, -0.0252F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(90, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.9056F, -3.0985F, -1.5117F, -0.9985F, 0.1019F, -0.0252F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(42, 74).addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0521F, -2.5239F, -0.2201F, 0.2668F, 0.1019F, -0.0252F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(60, 15).addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0495F, -1.0845F, -0.0284F, 1.4144F, 0.0535F, -0.0529F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3428F, 2.2678F, -8.3202F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(88, 9).mirror().addBox(0.1843F, 3.2026F, 1.2388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -0.7438F, 0.1374F, -0.6764F));

		PartDefinition cube_r124 = bone7.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(0.1843F, 2.7968F, -0.3349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -0.3075F, 0.1374F, -0.6764F));

		PartDefinition cube_r125 = bone7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(19, 20).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(1.3508F, 4.2423F, 1.5622F, -0.0513F, 0.1532F, -1.5588F));

		PartDefinition cube_r126 = bone7.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(19, 11).mirror().addBox(0.1843F, 2.3009F, -1.3732F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, 0.0852F, 0.1374F, -0.6764F));

		PartDefinition cube_r127 = bone7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(22, 46).mirror().addBox(0.1843F, 0.926F, 0.6779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -0.2639F, 0.1374F, -0.6764F));

		PartDefinition cube_r128 = bone7.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(0.1843F, 0.0301F, 1.3174F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -0.5693F, 0.1374F, -0.6764F));

		PartDefinition cube_r129 = bone7.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(0.1843F, -0.6824F, 0.0273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(86, 31).mirror().addBox(0.1843F, -0.6824F, 0.5273F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -1.1365F, 0.1374F, -0.6764F));

		PartDefinition cube_r130 = bone7.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 33).mirror().addBox(0.1843F, -0.6002F, 0.0064F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-1.5996F, 1.293F, -0.3807F, -1.4856F, 0.1374F, -0.6764F));

		PartDefinition cube_r131 = bone7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(35, 39).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.8338F, -2.555F, -2.3481F, -1.4261F, -0.1019F, 0.0252F));

		PartDefinition cube_r132 = bone7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(90, 15).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.9056F, -3.0985F, -1.5117F, -0.9985F, -0.1019F, 0.0252F));

		PartDefinition cube_r133 = bone7.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(42, 74).mirror().addBox(-0.5F, -0.9F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0521F, -2.5239F, -0.2201F, 0.2668F, -0.1019F, 0.0252F));

		PartDefinition cube_r134 = bone7.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-0.5F, -0.8F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0495F, -1.0845F, -0.0284F, 1.4144F, -0.0535F, 0.0529F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(61, 59).addBox(-0.5F, -0.7596F, -2.9227F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3466F, -9.0026F, -0.1541F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(57, 91).addBox(0.0F, -2.5743F, -0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7595F, -2.9184F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(78, 87).addBox(0.0F, -2.525F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7596F, -0.921F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r135 = Neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(61, 82).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.4913F, 0.0865F, -0.5171F));

		PartDefinition cube_r136 = Neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 4).mirror().addBox(-4.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.4173F, 0.2806F, -0.9153F));

		PartDefinition cube_r137 = Neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(60, 20).mirror().addBox(-5.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.3312F, 0.1691F, -0.9346F));

		PartDefinition cube_r138 = Neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(54, 82).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.37F, 0.017F, -0.5234F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(74, 4).addBox(1.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.4173F, -0.2806F, 0.9153F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(61, 82).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -2.378F, 0.4913F, -0.0865F, 0.5171F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(60, 20).addBox(1.7506F, -0.9221F, -0.4845F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.3312F, -0.1691F, 0.9346F));

		PartDefinition cube_r142 = Neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(54, 82).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2675F, -0.378F, 0.37F, -0.017F, 0.5234F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(52, 59).addBox(-0.5F, -0.6F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.157F, -2.8728F, -0.1138F, 0.1688F, -0.0624F));

		PartDefinition Neck_r3 = neck2.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(38, 86).addBox(0.0F, -2.6743F, -0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4644F, -2.0307F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r143 = neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(79, 62).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1105F, -1.5052F, 0.5678F, 0.1294F, -0.5088F));

		PartDefinition cube_r144 = neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(70, 38).mirror().addBox(-4.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1105F, -1.5052F, 0.4739F, 0.3494F, -0.8978F));

		PartDefinition cube_r145 = neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(70, 38).addBox(1.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1105F, -1.5052F, 0.4739F, -0.3494F, 0.8978F));

		PartDefinition cube_r146 = neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(79, 62).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1105F, -1.5052F, 0.5678F, -0.1294F, 0.5088F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(49, 0).addBox(-0.5F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -0.0033F, -2.9288F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Neck_r4 = neck3.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(54, 96).addBox(0.0F, -2.2743F, -2.9326F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 84).addBox(0.0F, -2.4743F, -1.0326F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4644F, 0.0395F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(22, 37).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4072F, -2.5764F, 0.8034F, 0.2523F, -0.4638F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(-3.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -0.4072F, -2.5764F, 0.664F, 0.5478F, -0.8147F));

		PartDefinition cube_r149 = neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(56, 80).mirror().addBox(-1.9763F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.5764F, 0.8034F, 0.2523F, -0.4638F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(70, 63).mirror().addBox(-4.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.5764F, 0.664F, 0.5478F, -0.8147F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(63, 80).addBox(1.7506F, -0.9221F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4072F, -2.5764F, 0.664F, -0.5478F, 0.8147F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(22, 37).addBox(0.9763F, -0.0959F, -0.4845F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4072F, -2.5764F, 0.8034F, -0.2523F, 0.4638F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(70, 63).addBox(1.7506F, -0.9221F, -0.4845F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.5764F, 0.664F, -0.5478F, 0.8147F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(56, 80).addBox(-0.0238F, -0.0959F, -0.4845F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2072F, -0.5764F, 0.8034F, -0.2523F, 0.4638F));

		PartDefinition Head = neck3.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7676F, -4.4749F, -0.1916F, -0.0167F, -0.0857F));

		PartDefinition Snoutbase_r1 = Head.addOrReplaceChild("Snoutbase_r1", CubeListBuilder.create().texOffs(41, 87).addBox(-0.3995F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.103F, 3.5812F, -13.2584F, 0.1397F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r2 = Head.addOrReplaceChild("Snoutbase_r2", CubeListBuilder.create().texOffs(86, 88).addBox(-0.8F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5805F, 3.0925F, -12.8554F, -0.8447F, 0.7075F, -0.0789F));

		PartDefinition Snoutbase_r3 = Head.addOrReplaceChild("Snoutbase_r3", CubeListBuilder.create().texOffs(67, 88).mirror().addBox(-0.8005F, -0.525F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(88, 22).mirror().addBox(-0.8005F, -0.425F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.1019F, 3.1149F, -12.8808F, -0.6375F, -0.3018F, -0.3363F));

		PartDefinition Snoutbase_r4 = Head.addOrReplaceChild("Snoutbase_r4", CubeListBuilder.create().texOffs(93, 3).mirror().addBox(0.0009F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7916F, 2.4409F, -12.1144F, 0.7299F, -0.1857F, -0.1068F));

		PartDefinition Snoutbase_r5 = Head.addOrReplaceChild("Snoutbase_r5", CubeListBuilder.create().texOffs(28, 85).mirror().addBox(0.0009F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0009F, 1.8193F, -11.3595F, 0.695F, -0.1857F, -0.1068F));

		PartDefinition Snoutbase_r6 = Head.addOrReplaceChild("Snoutbase_r6", CubeListBuilder.create().texOffs(67, 88).addBox(-0.1995F, -0.525F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F))
				.texOffs(88, 22).addBox(-0.1995F, -0.425F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1019F, 3.1149F, -12.8808F, -0.6375F, 0.3018F, 0.3363F));

		PartDefinition Snoutbase_r7 = Head.addOrReplaceChild("Snoutbase_r7", CubeListBuilder.create().texOffs(17, 88).addBox(-0.3995F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1019F, 3.1149F, -12.8808F, -0.6806F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r8 = Head.addOrReplaceChild("Snoutbase_r8", CubeListBuilder.create().texOffs(91, 78).addBox(0.0005F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5005F, 2.451F, -12.1322F, 0.7244F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r9 = Head.addOrReplaceChild("Snoutbase_r9", CubeListBuilder.create().texOffs(93, 3).addBox(-1.0009F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7916F, 2.4409F, -12.1144F, 0.7299F, 0.1857F, 0.1068F));

		PartDefinition Snoutbase_r10 = Head.addOrReplaceChild("Snoutbase_r10", CubeListBuilder.create().texOffs(93, 0).addBox(-1.0009F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7916F, 2.4409F, -12.1144F, 0.6206F, 0.4502F, -0.2366F));

		PartDefinition Snoutbase_r11 = Head.addOrReplaceChild("Snoutbase_r11", CubeListBuilder.create().texOffs(28, 85).addBox(-1.0009F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0009F, 1.8193F, -11.3595F, 0.695F, 0.1857F, 0.1068F));

		PartDefinition Snoutbase_r12 = Head.addOrReplaceChild("Snoutbase_r12", CubeListBuilder.create().texOffs(84, 75).addBox(-0.0009F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4991F, 1.8149F, -11.3606F, 0.6895F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r13 = Head.addOrReplaceChild("Snoutbase_r13", CubeListBuilder.create().texOffs(79, 40).addBox(-2.0019F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0019F, 1.2586F, -10.5309F, 0.5176F, 0.3046F, -0.4829F));

		PartDefinition Snoutbase_r14 = Head.addOrReplaceChild("Snoutbase_r14", CubeListBuilder.create().texOffs(76, 47).addBox(-1.0019F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0019F, 1.2557F, -10.5316F, 0.5935F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r15 = Head.addOrReplaceChild("Snoutbase_r15", CubeListBuilder.create().texOffs(43, 64).addBox(-1.0036F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0036F, 0.2859F, -8.7824F, 0.5062F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r16 = Head.addOrReplaceChild("Snoutbase_r16", CubeListBuilder.create().texOffs(76, 22).addBox(-1.0041F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0041F, -0.1049F, -7.8619F, 0.4015F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r17 = Head.addOrReplaceChild("Snoutbase_r17", CubeListBuilder.create().texOffs(65, 28).addBox(-1.0045F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4955F, -0.4469F, -6.9223F, 0.3491F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r18 = Head.addOrReplaceChild("Snoutbase_r18", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0046F, 0.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4954F, -0.7058F, -5.9563F, 0.2619F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r19 = Head.addOrReplaceChild("Snoutbase_r19", CubeListBuilder.create().texOffs(57, 41).addBox(-2.0043F, 0.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0043F, -0.8623F, -4.9687F, 0.1571F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r20 = Head.addOrReplaceChild("Snoutbase_r20", CubeListBuilder.create().texOffs(41, 34).addBox(-1.9975F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, 0.9556F, -2.8018F, 0.0873F, -0.0007F, 0.0029F));

		PartDefinition Snoutbase_r21 = Head.addOrReplaceChild("Snoutbase_r21", CubeListBuilder.create().texOffs(34, 66).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0015F, -0.8645F, -0.9377F, 0.2919F, 0.7631F, 0.2078F));

		PartDefinition Snoutbase_r22 = Head.addOrReplaceChild("Snoutbase_r22", CubeListBuilder.create().texOffs(58, 22).addBox(-2.0F, -0.4F, 0.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0013F, 0.7209F, -1.3203F, 1.0734F, -0.0007F, 0.0029F));

		PartDefinition cube_r155 = Head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(94, 75).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.9401F, -3.0886F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Snoutbase_r23 = Head.addOrReplaceChild("Snoutbase_r23", CubeListBuilder.create().texOffs(41, 29).addBox(-1.9985F, -1.575F, -1.475F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0015F, 0.305F, -1.4115F, 0.1571F, -0.0007F, 0.0029F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.0015F, 0.305F, -1.4115F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(7, 60).addBox(-1.0F, -0.7003F, 0.1869F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.85F, 0.8263F, 4.2251F, 3.1266F, 0.0163F, -0.3666F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(60, 10).addBox(-1.0F, -1.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2515F, -0.6091F, 1.5109F, 2.8068F, 0.1813F, -0.4237F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(60, 5).addBox(-1.0F, -0.7139F, 0.0902F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.85F, 0.8263F, 4.2251F, 2.7775F, 0.0163F, -0.3666F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(89, 66).addBox(-0.5F, -0.275F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(3.6F, 1.6031F, 4.5229F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5F, -0.6F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 1.6031F, 4.5229F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(74, 27).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 2.3198F, 2.6558F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(92, 53).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 1.4964F, 1.8995F, -1.4547F, -0.2545F, 1.137F));

		PartDefinition Snoutbase_r24 = leftFace.addOrReplaceChild("Snoutbase_r24", CubeListBuilder.create().texOffs(72, 76).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4143F, -0.0221F, -7.353F, 0.5062F, 0.1913F, 0.042F));

		PartDefinition Snoutbase_r25 = leftFace.addOrReplaceChild("Snoutbase_r25", CubeListBuilder.create().texOffs(49, 92).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6056F, -0.4052F, -6.4493F, 0.4014F, 0.1913F, 0.042F));

		PartDefinition Snoutbase_r26 = leftFace.addOrReplaceChild("Snoutbase_r26", CubeListBuilder.create().texOffs(65, 76).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0061F, -1.0035F, -4.5431F, 0.3192F, 0.2023F, 0.0552F));

		PartDefinition Snoutbase_r27 = leftFace.addOrReplaceChild("Snoutbase_r27", CubeListBuilder.create().texOffs(31, 77).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4143F, -0.0221F, -7.353F, 0.4039F, 0.366F, -0.3246F));

		PartDefinition Snoutbase_r28 = leftFace.addOrReplaceChild("Snoutbase_r28", CubeListBuilder.create().texOffs(85, 18).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6056F, -0.4052F, -6.4493F, 0.316F, 0.3151F, -0.2955F));

		PartDefinition Snoutbase_r29 = leftFace.addOrReplaceChild("Snoutbase_r29", CubeListBuilder.create().texOffs(15, 94).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(0, 94).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.818F, -0.4728F, -3.6353F, -1.5377F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r30 = leftFace.addOrReplaceChild("Snoutbase_r30", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2327F, -0.0122F, -2.8505F, -0.6215F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r31 = leftFace.addOrReplaceChild("Snoutbase_r31", CubeListBuilder.create().texOffs(16, 64).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.624F, 0.9051F, -2.7766F, 0.0767F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r32 = leftFace.addOrReplaceChild("Snoutbase_r32", CubeListBuilder.create().texOffs(60, 93).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.6157F, 1.478F, -3.5961F, 0.5566F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r33 = leftFace.addOrReplaceChild("Snoutbase_r33", CubeListBuilder.create().texOffs(41, 93).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4377F, 1.7258F, -4.5484F, 1.7347F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r34 = leftFace.addOrReplaceChild("Snoutbase_r34", CubeListBuilder.create().texOffs(93, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.1754F, 1.773F, -5.5123F, 3.0874F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r35 = leftFace.addOrReplaceChild("Snoutbase_r35", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8289F, 1.5776F, -6.4297F, -1.8868F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r36 = leftFace.addOrReplaceChild("Snoutbase_r36", CubeListBuilder.create().texOffs(93, 9).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4287F, 0.6685F, -6.5456F, -1.4505F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r37 = leftFace.addOrReplaceChild("Snoutbase_r37", CubeListBuilder.create().texOffs(93, 6).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3595F, -0.0235F, -5.8271F, -0.8396F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r38 = leftFace.addOrReplaceChild("Snoutbase_r38", CubeListBuilder.create().texOffs(5, 93).addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.9041F, 0.5107F, -4.6985F, 0.2076F, 0.2643F, -0.3831F));

		PartDefinition Snoutbase_r39 = leftFace.addOrReplaceChild("Snoutbase_r39", CubeListBuilder.create().texOffs(43, 69).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5904F, -0.398F, -6.4034F, 0.2211F, 0.2532F, -0.3302F));

		PartDefinition Snoutbase_r40 = leftFace.addOrReplaceChild("Snoutbase_r40", CubeListBuilder.create().texOffs(85, 14).addBox(-1.05F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.006F, -1.0832F, -4.0496F, 0.1494F, 0.2319F, -0.3595F));

		PartDefinition Snoutbase_r41 = leftFace.addOrReplaceChild("Snoutbase_r41", CubeListBuilder.create().texOffs(23, 69).addBox(-1.05F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3514F, -1.4924F, -1.6138F, 0.0812F, 0.2102F, -0.4178F));

		PartDefinition Snoutbase_r42 = leftFace.addOrReplaceChild("Snoutbase_r42", CubeListBuilder.create().texOffs(79, 37).addBox(-0.4F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4866F, -1.1633F, 0.4661F, 0.5079F, -1.1289F, -0.463F));

		PartDefinition Snoutbase_r43 = leftFace.addOrReplaceChild("Snoutbase_r43", CubeListBuilder.create().texOffs(71, 92).addBox(-0.1F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4866F, -1.1633F, 0.4661F, 0.2145F, -0.214F, -0.0432F));

		PartDefinition Snoutbase_r44 = leftFace.addOrReplaceChild("Snoutbase_r44", CubeListBuilder.create().texOffs(79, 34).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1695F, 0.4739F, 0.2225F, 0.3404F, 0.0785F));

		PartDefinition Snoutbase_r45 = leftFace.addOrReplaceChild("Snoutbase_r45", CubeListBuilder.create().texOffs(7, 70).addBox(-0.625F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0048F, -1.4754F, -0.7143F, 0.1434F, 0.1359F, -0.4273F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(89, 34).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 2.5955F, 1.6945F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(79, 31).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 1.6532F, 1.0927F, 0.046F, -0.0941F, 1.1148F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(89, 28).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6F, 2.7F, 0.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(76, 92).addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.369F, 3.2779F, -11.3673F, -1.2643F, 0.6184F, 0.0196F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(23, 92).addBox(-0.7733F, 0.3798F, -0.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 59).addBox(-0.7733F, -0.2202F, -0.6682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 65).addBox(-0.7733F, -0.2202F, -0.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0929F, 3.4976F, -10.8154F, -1.6133F, 0.6184F, 0.0196F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(94, 75).addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.049F, 3.3337F, -10.6257F, -1.6219F, 0.6703F, 0.0056F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(89, 81).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.8276F, 2.4261F, -10.0941F, -2.4101F, -0.4171F, 0.8901F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(60, 90).addBox(-0.9F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.34F, 3.013F, -10.5735F, -2.4994F, 0.1952F, 1.19F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(89, 91).addBox(-0.9265F, -0.3326F, -0.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.6F, 3.5516F, -10.2838F, -3.0631F, 0.6632F, 0.0F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(81, 87).addBox(-0.875F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1749F, 2.4921F, -9.6329F, -2.6724F, -0.1774F, 0.9277F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(88, 6).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.751F, 2.7909F, -9.9139F, -2.7224F, 0.1793F, 1.1901F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 88).addBox(-1.0353F, -0.2393F, -0.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.5516F, -9.4838F, 3.1416F, 0.4538F, 0.0F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(83, 6).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8839F, 2.052F, -8.7398F, 1.8764F, -0.0713F, 0.9414F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(95, 46).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0663F, 2.7407F, -9.1F, 1.8555F, 0.0078F, 1.1294F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(46, 95).addBox(-0.9868F, -2.8901F, 0.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 3.5516F, -6.6838F, 1.6842F, 0.2618F, 0.0F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 53).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3408F, 1.6873F, -6.6126F, 1.8475F, -0.0001F, 1.074F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(17, 80).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4457F, 2.6463F, -7.6839F, 1.8294F, 0.0602F, 1.1802F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(12, 80).addBox(-0.9868F, -1.9914F, -0.0506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.5516F, -6.6838F, 1.6144F, 0.2618F, 0.0F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(73, 54).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8942F, 2.4798F, -5.8339F, 1.8143F, -0.0384F, 1.1596F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 80).addBox(-1.0648F, -4.9819F, -0.2017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 2.7515F, -1.8838F, 1.7017F, 0.2094F, 0.0F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(59, 66).addBox(-2.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1898F, 2.2637F, -4.443F, 0.2678F, -0.093F, 1.1453F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(89, 75).addBox(-1.0648F, -0.9808F, -2.9887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 2.7515F, -1.8838F, 0.192F, 0.2094F, 0.0F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(68, 43).addBox(-2.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4874F, 1.9506F, -3.0432F, 0.2822F, -0.124F, 1.1365F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(5, 96).addBox(-0.7545F, -0.8239F, -1.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 95).addBox(-0.7545F, -0.8239F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2271F, 4.2035F, -10.4139F, -0.063F, 0.6281F, 0.0155F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(95, 71).addBox(-0.3545F, -0.8239F, -1.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 95).addBox(-0.3545F, -0.8239F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4838F, 4.1462F, -8.7858F, 0.0366F, 0.4013F, 0.0053F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(95, 68).addBox(-0.3545F, -0.8239F, -2.2843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 49).addBox(-0.3545F, -0.8239F, -1.4843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0787F, 4.066F, -6.5655F, 0.0349F, 0.2618F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 95).addBox(-0.3545F, -0.8597F, -0.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0787F, 4.066F, -6.5655F, 0.0873F, 0.2618F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(95, 18).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.3894F, 3.9352F, -5.8039F, 0.0873F, 0.2094F, 0.0F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 91).addBox(-1.0648F, -0.5752F, -4.1881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 91).addBox(-1.0648F, -0.5752F, -3.3881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 90).addBox(-1.0648F, -0.5752F, -2.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 72).addBox(-1.0648F, -0.5752F, -1.7881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 69).addBox(-1.0648F, -0.5752F, -0.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(58, 76).addBox(-1.0648F, -1.0502F, -1.9881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 2.7515F, -1.8838F, 0.2269F, 0.2094F, 0.0F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(83, 22).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2208F, 2.864F, -3.2929F, 0.3392F, 0.1784F, 0.1296F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(41, 83).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2444F, 3.7731F, -8.012F, 0.121F, 0.1784F, 0.1296F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(83, 10).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9088F, 3.298F, -4.6979F, 0.2519F, 0.1784F, 0.1296F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(54, 28).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.889F, 1.7F, -0.7852F, 0.1267F, 0.0589F, 1.1382F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(60, 0).addBox(-1.0F, -1.0515F, -3.0162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, 2.7515F, 0.7162F, 0.0F, 0.1396F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.0015F, 0.305F, -1.4115F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(7, 60).mirror().addBox(0.0F, -0.7003F, 0.1869F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.85F, 0.8263F, 4.2251F, 3.1266F, -0.0163F, 0.3666F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(0.0F, -1.2F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2515F, -0.6091F, 1.5109F, 2.8068F, -0.1813F, 0.4237F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(60, 5).mirror().addBox(0.0F, -0.7139F, 0.0902F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.85F, 0.8263F, 4.2251F, 2.7775F, -0.0163F, 0.3666F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-0.5F, -0.275F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.6031F, 4.5229F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(49, 89).mirror().addBox(-0.5F, -0.6F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 1.6031F, 4.5229F, -1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 2.3198F, 2.6558F, -2.7751F, 0.0F, 0.0F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 53).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 1.4964F, 1.8995F, -1.4547F, 0.2545F, -1.137F));

		PartDefinition Snoutbase_r46 = rightFace.addOrReplaceChild("Snoutbase_r46", CubeListBuilder.create().texOffs(72, 76).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4143F, -0.0221F, -7.353F, 0.5062F, -0.1913F, -0.042F));

		PartDefinition Snoutbase_r47 = rightFace.addOrReplaceChild("Snoutbase_r47", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6056F, -0.4052F, -6.4493F, 0.4014F, -0.1913F, -0.042F));

		PartDefinition Snoutbase_r48 = rightFace.addOrReplaceChild("Snoutbase_r48", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0061F, -1.0035F, -4.5431F, 0.3192F, -0.2023F, -0.0552F));

		PartDefinition Snoutbase_r49 = rightFace.addOrReplaceChild("Snoutbase_r49", CubeListBuilder.create().texOffs(31, 77).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4143F, -0.0221F, -7.353F, 0.4039F, -0.366F, 0.3246F));

		PartDefinition Snoutbase_r50 = rightFace.addOrReplaceChild("Snoutbase_r50", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6056F, -0.4052F, -6.4493F, 0.316F, -0.3151F, 0.2955F));

		PartDefinition Snoutbase_r51 = rightFace.addOrReplaceChild("Snoutbase_r51", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.5F, 0.3F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 94).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.818F, -0.4728F, -3.6353F, -1.5377F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r52 = rightFace.addOrReplaceChild("Snoutbase_r52", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2327F, -0.0122F, -2.8505F, -0.6215F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r53 = rightFace.addOrReplaceChild("Snoutbase_r53", CubeListBuilder.create().texOffs(16, 64).mirror().addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.624F, 0.9051F, -2.7766F, 0.0767F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r54 = rightFace.addOrReplaceChild("Snoutbase_r54", CubeListBuilder.create().texOffs(60, 93).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.6157F, 1.478F, -3.5961F, 0.5566F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r55 = rightFace.addOrReplaceChild("Snoutbase_r55", CubeListBuilder.create().texOffs(41, 93).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4377F, 1.7258F, -4.5484F, 1.7347F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r56 = rightFace.addOrReplaceChild("Snoutbase_r56", CubeListBuilder.create().texOffs(93, 21).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1754F, 1.773F, -5.5123F, 3.0874F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r57 = rightFace.addOrReplaceChild("Snoutbase_r57", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8289F, 1.5776F, -6.4297F, -1.8868F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r58 = rightFace.addOrReplaceChild("Snoutbase_r58", CubeListBuilder.create().texOffs(93, 9).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4287F, 0.6685F, -6.5456F, -1.4505F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r59 = rightFace.addOrReplaceChild("Snoutbase_r59", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3595F, -0.0235F, -5.8271F, -0.8396F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r60 = rightFace.addOrReplaceChild("Snoutbase_r60", CubeListBuilder.create().texOffs(5, 93).mirror().addBox(-0.5F, -0.925F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9041F, 0.5107F, -4.6985F, 0.2076F, -0.2643F, 0.3831F));

		PartDefinition Snoutbase_r61 = rightFace.addOrReplaceChild("Snoutbase_r61", CubeListBuilder.create().texOffs(43, 69).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5904F, -0.398F, -6.4034F, 0.2211F, -0.2532F, 0.3302F));

		PartDefinition Snoutbase_r62 = rightFace.addOrReplaceChild("Snoutbase_r62", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(0.05F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.006F, -1.0832F, -4.0496F, 0.1494F, -0.2319F, 0.3595F));

		PartDefinition Snoutbase_r63 = rightFace.addOrReplaceChild("Snoutbase_r63", CubeListBuilder.create().texOffs(23, 69).mirror().addBox(0.05F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3514F, -1.4924F, -1.6138F, 0.0812F, -0.2102F, 0.4178F));

		PartDefinition Snoutbase_r64 = rightFace.addOrReplaceChild("Snoutbase_r64", CubeListBuilder.create().texOffs(79, 37).mirror().addBox(-1.6F, -0.5F, -0.95F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4866F, -1.1633F, 0.4661F, 0.5079F, 1.1289F, 0.463F));

		PartDefinition Snoutbase_r65 = rightFace.addOrReplaceChild("Snoutbase_r65", CubeListBuilder.create().texOffs(71, 92).mirror().addBox(-0.9F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4866F, -1.1633F, 0.4661F, 0.2145F, 0.214F, 0.0432F));

		PartDefinition Snoutbase_r66 = rightFace.addOrReplaceChild("Snoutbase_r66", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.1695F, 0.4739F, 0.2225F, -0.3404F, -0.0785F));

		PartDefinition Snoutbase_r67 = rightFace.addOrReplaceChild("Snoutbase_r67", CubeListBuilder.create().texOffs(7, 70).mirror().addBox(-0.375F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0048F, -1.4754F, -0.7143F, 0.1434F, -0.1359F, 0.4273F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 34).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 2.5955F, 1.6945F, -1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 31).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 1.6532F, 1.0927F, 0.046F, 0.0941F, -1.1148F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6F, 2.7F, 0.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(76, 92).mirror().addBox(-0.5F, -0.575F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.369F, 3.2779F, -11.3673F, -1.2643F, -0.6184F, -0.0196F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(23, 92).mirror().addBox(-0.2267F, 0.3798F, -0.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 59).mirror().addBox(-0.2267F, -0.2202F, -0.6682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 65).mirror().addBox(-0.2267F, -0.2202F, -0.4682F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0929F, 3.4976F, -10.8154F, -1.6133F, -0.6184F, -0.0196F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-0.5F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.049F, 3.3337F, -10.6257F, -1.6219F, -0.6703F, -0.0056F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(89, 81).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.8276F, 2.4261F, -10.0941F, -2.4101F, 0.4171F, -0.8901F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(-0.1F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.34F, 3.013F, -10.5735F, -2.4994F, -0.1952F, -1.19F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(89, 91).mirror().addBox(-0.0735F, -0.3326F, -0.1551F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 3.5516F, -10.2838F, -3.0631F, -0.6632F, 0.0F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(81, 87).mirror().addBox(-0.125F, -0.525F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1749F, 2.4921F, -9.6329F, -2.6724F, 0.1774F, -0.9277F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(88, 6).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.751F, 2.7909F, -9.9139F, -2.7224F, -0.1793F, -1.1901F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(0.0353F, -0.2393F, -0.0043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.5516F, -9.4838F, 3.1416F, -0.4538F, 0.0F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8839F, 2.052F, -8.7398F, 1.8764F, 0.0713F, -0.9414F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(95, 46).mirror().addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0663F, 2.7407F, -9.1F, 1.8555F, -0.0078F, -1.1294F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(46, 95).mirror().addBox(-0.0132F, -2.8901F, 0.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.5516F, -6.6838F, 1.6842F, -0.2618F, 0.0F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(80, 53).mirror().addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3408F, 1.6873F, -6.6126F, 1.8475F, 0.0001F, -1.074F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(17, 80).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4457F, 2.6463F, -7.6839F, 1.8294F, -0.0602F, -1.1802F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(-0.0132F, -1.9914F, -0.0506F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 3.5516F, -6.6838F, 1.6144F, -0.2618F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8942F, 2.4798F, -5.8339F, 1.8143F, 0.0384F, -1.1596F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(70, 80).mirror().addBox(0.0648F, -4.9819F, -0.2017F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 2.7515F, -1.8838F, 1.7017F, -0.2094F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(59, 66).mirror().addBox(0.0F, 0.0F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1898F, 2.2637F, -4.443F, 0.2678F, 0.093F, -1.1453F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 75).mirror().addBox(0.0648F, -0.9808F, -2.9887F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 2.7515F, -1.8838F, 0.192F, -0.2094F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(68, 43).mirror().addBox(0.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4874F, 1.9506F, -3.0432F, 0.2822F, 0.124F, -1.1365F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(5, 96).mirror().addBox(-0.2455F, -0.8239F, -1.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 95).mirror().addBox(-0.2455F, -0.8239F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2271F, 4.2035F, -10.4139F, -0.063F, -0.6281F, -0.0155F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(95, 71).mirror().addBox(-0.6455F, -0.8239F, -1.5843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 95).mirror().addBox(-0.6455F, -0.8239F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4838F, 4.1462F, -8.7858F, 0.0366F, -0.4013F, -0.0053F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(95, 68).mirror().addBox(-0.6455F, -0.8239F, -2.2843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 49).mirror().addBox(-0.6455F, -0.8239F, -1.4843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0787F, 4.066F, -6.5655F, 0.0349F, -0.2618F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(23, 95).mirror().addBox(-0.6455F, -0.8597F, -0.6821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0787F, 4.066F, -6.5655F, 0.0873F, -0.2618F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(95, 18).mirror().addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.3894F, 3.9352F, -5.8039F, 0.0873F, -0.2094F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 91).mirror().addBox(0.0648F, -0.5752F, -4.1881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 91).mirror().addBox(0.0648F, -0.5752F, -3.3881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 90).mirror().addBox(0.0648F, -0.5752F, -2.5881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 72).mirror().addBox(0.0648F, -0.5752F, -1.7881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 69).mirror().addBox(0.0648F, -0.5752F, -0.9881F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(58, 76).mirror().addBox(0.0648F, -1.0502F, -1.9881F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 2.7515F, -1.8838F, 0.2269F, -0.2094F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(83, 22).mirror().addBox(-0.5F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2208F, 2.864F, -3.2929F, 0.3392F, -0.1784F, -0.1296F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2444F, 3.7731F, -8.012F, 0.121F, -0.1784F, -0.1296F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(83, 10).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9088F, 3.298F, -4.6979F, 0.2519F, -0.1784F, -0.1296F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(54, 28).mirror().addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.889F, 1.7F, -0.7852F, 0.1267F, -0.0589F, -1.1382F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.0F, -1.0515F, -3.0162F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, 2.7515F, 0.7162F, 0.0F, -0.1396F, 0.0F));

		PartDefinition Lowerjawback = Head.addOrReplaceChild("Lowerjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6675F, 2.8557F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r1 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r1", CubeListBuilder.create().texOffs(41, 90).mirror().addBox(0.0201F, -3.0429F, -3.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(94, 37).mirror().addBox(0.0201F, -3.0627F, -2.665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.3375F, 6.8339F, -5.0218F, 0.3927F, -0.2094F, -0.1047F));

		PartDefinition Lowerjawmidbase_r2 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r2", CubeListBuilder.create().texOffs(94, 34).mirror().addBox(0.0201F, -3.1664F, -1.629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 94).mirror().addBox(0.0201F, -3.2414F, -0.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(77, 58).mirror().addBox(0.0201F, -2.6914F, -1.529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.3375F, 6.8339F, -5.0218F, 0.48F, -0.2094F, -0.1047F));

		PartDefinition Lowerjawmidbase_r3 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r3", CubeListBuilder.create().texOffs(28, 94).mirror().addBox(0.0F, -3.5857F, -2.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.6375F, 6.2339F, -3.1218F, 0.4738F, -0.1399F, -0.0862F));

		PartDefinition Lowerjawmidbase_r4 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r4", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(0.0201F, 0.7205F, 1.8792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(74, 0).mirror().addBox(0.0201F, 0.2205F, 1.8792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.3375F, 6.8339F, -5.0218F, -2.8623F, -0.2094F, -0.1047F));

		PartDefinition Lowerjawmidbase_r5 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r5", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(0.0201F, -2.5782F, -3.613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3375F, 6.8339F, -5.0218F, 0.4102F, -0.2094F, -0.1047F));

		PartDefinition Lowerjawmidbase_r6 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r6", CubeListBuilder.create().texOffs(57, 70).mirror().addBox(0.0201F, 0.1192F, -0.0072F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3375F, 6.8339F, -5.0218F, -2.9147F, -0.2094F, -0.1047F));

		PartDefinition Lowerjawmidbase_r7 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r7", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(0.0F, -3.2792F, -1.2506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.6375F, 6.2339F, -3.1218F, 0.6484F, -0.1399F, -0.0862F));

		PartDefinition Lowerjawmidbase_r8 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r8", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(-0.5F, -2.0F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(77, 43).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(49, 77).addBox(5.7749F, -2.0F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(77, 43).addBox(5.7749F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.1375F, 0.4342F, 1.4373F, 1.4399F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r9 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r9", CubeListBuilder.create().texOffs(71, 71).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(71, 71).addBox(5.7749F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1375F, 1.9859F, -4.2174F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r10 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r10", CubeListBuilder.create().texOffs(64, 71).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(64, 71).addBox(5.7749F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.1375F, 0.9859F, -2.4854F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r11 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r11", CubeListBuilder.create().texOffs(72, 32).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 32).addBox(5.7749F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1375F, 1.4342F, -0.2947F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r12 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r12", CubeListBuilder.create().texOffs(30, 70).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.6375F, 6.2339F, -3.1218F, -2.8859F, -0.1399F, -0.0862F));

		PartDefinition Lowerjawmidbase_r13 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r13", CubeListBuilder.create().texOffs(25, 64).mirror().addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(25, 64).addBox(5.7749F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.1375F, 5.8512F, -2.1979F, 1.9635F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r14 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r14", CubeListBuilder.create().texOffs(27, 58).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(27, 58).addBox(5.7749F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1375F, 4.9277F, -0.4239F, 2.0508F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r15 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r15", CubeListBuilder.create().texOffs(43, 58).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(43, 58).addBox(5.7749F, -2.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-3.1375F, 3.341F, 0.7936F, 2.4871F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r16 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r16", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(79, 76).addBox(5.7749F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1375F, 2.4171F, 1.1763F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r17 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r17", CubeListBuilder.create().texOffs(76, 10).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(76, 10).addBox(5.7749F, -0.7F, -0.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.1375F, 0.8244F, 0.1615F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Lowerjawmidbase_r18 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r18", CubeListBuilder.create().texOffs(78, 18).addBox(-1.0201F, 0.7205F, 1.8792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(74, 0).addBox(-1.0201F, 0.2205F, 1.8792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.3375F, 6.8339F, -5.0218F, -2.8623F, 0.2094F, 0.1047F));

		PartDefinition Lowerjawmidbase_r19 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r19", CubeListBuilder.create().texOffs(57, 70).addBox(-1.0201F, 0.1192F, -0.0072F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3375F, 6.8339F, -5.0218F, -2.9147F, 0.2094F, 0.1047F));

		PartDefinition Lowerjawmidbase_r20 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r20", CubeListBuilder.create().texOffs(30, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.6375F, 6.2339F, -3.1218F, -2.8859F, 0.1399F, 0.0862F));

		PartDefinition Lowerjawmidbase_r21 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r21", CubeListBuilder.create().texOffs(0, 78).addBox(-1.0201F, -2.5782F, -3.613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3375F, 6.8339F, -5.0218F, 0.4102F, 0.2094F, 0.1047F));

		PartDefinition Lowerjawmidbase_r22 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r22", CubeListBuilder.create().texOffs(41, 90).addBox(-1.0201F, -3.0429F, -3.4619F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(94, 37).addBox(-1.0201F, -3.0627F, -2.665F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3375F, 6.8339F, -5.0218F, 0.3927F, 0.2094F, 0.1047F));

		PartDefinition Lowerjawmidbase_r23 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r23", CubeListBuilder.create().texOffs(94, 34).addBox(-1.0201F, -3.1664F, -1.629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 94).addBox(-1.0201F, -3.2414F, -0.829F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(77, 58).addBox(-1.0201F, -2.6914F, -1.529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.3375F, 6.8339F, -5.0218F, 0.48F, 0.2094F, 0.1047F));

		PartDefinition Lowerjawmidbase_r24 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r24", CubeListBuilder.create().texOffs(28, 94).addBox(-1.0F, -3.5857F, -2.0184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.6375F, 6.2339F, -3.1218F, 0.4738F, 0.1399F, 0.0862F));

		PartDefinition Lowerjawmidbase_r25 = Lowerjawback.addOrReplaceChild("Lowerjawmidbase_r25", CubeListBuilder.create().texOffs(50, 70).addBox(-1.0F, -3.2792F, -1.2506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.6375F, 6.2339F, -3.1218F, 0.6484F, 0.1399F, 0.0862F));

		PartDefinition bone3 = Lowerjawback.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.5375F, 6.8339F, -8.8218F));

		PartDefinition Lowerjawmidbase_r26 = bone3.addOrReplaceChild("Lowerjawmidbase_r26", CubeListBuilder.create().texOffs(94, 56).mirror().addBox(-0.0026F, -0.009F, 0.0347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, -1.1796F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r27 = bone3.addOrReplaceChild("Lowerjawmidbase_r27", CubeListBuilder.create().texOffs(27, 89).mirror().addBox(-0.0026F, -0.4818F, -2.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(90, 47).mirror().addBox(-0.0026F, -0.339F, -1.7685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, 0.2428F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r28 = bone3.addOrReplaceChild("Lowerjawmidbase_r28", CubeListBuilder.create().texOffs(94, 43).mirror().addBox(-0.0026F, -0.5044F, -0.9446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, 0.3825F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r29 = bone3.addOrReplaceChild("Lowerjawmidbase_r29", CubeListBuilder.create().texOffs(96, 30).mirror().addBox(0.0319F, -1.5102F, -3.0663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, 0.3828F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r30 = bone3.addOrReplaceChild("Lowerjawmidbase_r30", CubeListBuilder.create().texOffs(94, 40).mirror().addBox(0.0319F, -1.635F, -2.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, 0.4352F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r31 = bone3.addOrReplaceChild("Lowerjawmidbase_r31", CubeListBuilder.create().texOffs(95, 15).mirror().addBox(0.0319F, -1.6357F, -1.4334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 14).mirror().addBox(0.0319F, -1.1068F, -2.0193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, 0.4177F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r32 = bone3.addOrReplaceChild("Lowerjawmidbase_r32", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(0.0319F, -1.6706F, -0.5841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, 0.4526F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r33 = bone3.addOrReplaceChild("Lowerjawmidbase_r33", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-0.0026F, 1.5715F, 0.1889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(94, 27).mirror().addBox(-0.0026F, 0.9715F, 0.1889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, -1.3542F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r34 = bone3.addOrReplaceChild("Lowerjawmidbase_r34", CubeListBuilder.create().texOffs(95, 12).mirror().addBox(-0.0026F, 0.4029F, -1.7979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, 0.1119F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r35 = bone3.addOrReplaceChild("Lowerjawmidbase_r35", CubeListBuilder.create().texOffs(94, 24).mirror().addBox(0.0319F, 1.9579F, -0.9686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, -1.2141F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r36 = bone3.addOrReplaceChild("Lowerjawmidbase_r36", CubeListBuilder.create().texOffs(38, 96).mirror().addBox(-0.0026F, -0.1417F, 0.3668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1749F, 0.0F, -3.0F, -1.4152F, -0.5563F, -0.1207F));

		PartDefinition Lowerjawmidbase_r37 = bone3.addOrReplaceChild("Lowerjawmidbase_r37", CubeListBuilder.create().texOffs(89, 25).mirror().addBox(0.0319F, -0.9529F, 2.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, -2.9769F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r38 = bone3.addOrReplaceChild("Lowerjawmidbase_r38", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(0.0319F, -0.7731F, 0.0972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0749F, 0.0F, 0.0F, -2.8897F, -0.2789F, -0.1066F));

		PartDefinition Lowerjawmidbase_r39 = bone3.addOrReplaceChild("Lowerjawmidbase_r39", CubeListBuilder.create().texOffs(10, 90).addBox(-1.0319F, -1.6706F, -0.5841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4526F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r40 = bone3.addOrReplaceChild("Lowerjawmidbase_r40", CubeListBuilder.create().texOffs(27, 89).addBox(-0.9974F, -0.4818F, -2.6202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(90, 47).addBox(-0.9974F, -0.339F, -1.7685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, 0.2428F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r41 = bone3.addOrReplaceChild("Lowerjawmidbase_r41", CubeListBuilder.create().texOffs(94, 43).addBox(-0.9974F, -0.5044F, -0.9446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, 0.3825F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r42 = bone3.addOrReplaceChild("Lowerjawmidbase_r42", CubeListBuilder.create().texOffs(96, 30).addBox(-1.0319F, -1.5102F, -3.0663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3828F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r43 = bone3.addOrReplaceChild("Lowerjawmidbase_r43", CubeListBuilder.create().texOffs(94, 40).addBox(-1.0319F, -1.635F, -2.2111F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4352F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r44 = bone3.addOrReplaceChild("Lowerjawmidbase_r44", CubeListBuilder.create().texOffs(95, 15).addBox(-1.0319F, -1.6357F, -1.4334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 14).addBox(-1.0319F, -1.1068F, -2.0193F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4177F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r45 = bone3.addOrReplaceChild("Lowerjawmidbase_r45", CubeListBuilder.create().texOffs(5, 90).addBox(-0.9974F, 1.5715F, 0.1889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(94, 27).addBox(-0.9974F, 0.9715F, 0.1889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, -1.3542F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r46 = bone3.addOrReplaceChild("Lowerjawmidbase_r46", CubeListBuilder.create().texOffs(95, 12).addBox(-0.9974F, 0.4029F, -1.7979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, 0.1119F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r47 = bone3.addOrReplaceChild("Lowerjawmidbase_r47", CubeListBuilder.create().texOffs(94, 56).addBox(-0.9974F, -0.009F, 0.0347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, -1.1796F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r48 = bone3.addOrReplaceChild("Lowerjawmidbase_r48", CubeListBuilder.create().texOffs(94, 24).addBox(-1.0319F, 1.9579F, -0.9686F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2141F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r49 = bone3.addOrReplaceChild("Lowerjawmidbase_r49", CubeListBuilder.create().texOffs(38, 96).addBox(-0.9974F, -0.1417F, 0.3668F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 0.0F, -3.0F, -1.4152F, 0.5563F, 0.1207F));

		PartDefinition Lowerjawmidbase_r50 = bone3.addOrReplaceChild("Lowerjawmidbase_r50", CubeListBuilder.create().texOffs(89, 25).addBox(-1.0319F, -0.9529F, 2.0219F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9769F, 0.2789F, 0.1066F));

		PartDefinition Lowerjawmidbase_r51 = bone3.addOrReplaceChild("Lowerjawmidbase_r51", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0319F, -0.7731F, 0.0972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.8897F, 0.2789F, 0.1066F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(36, 0).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0479F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(38, 77).addBox(0.0F, -4.2F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(64, 84).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(61, 84).addBox(0.0F, -3.3F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(34, 16).mirror().addBox(-2.0F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.0247F, 0.0F, 0.0524F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(34, 16).addBox(0.0F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.0247F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(34, 22).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1347F, 4.7908F, 0.0997F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(57, 86).addBox(0.0F, -2.975F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(46, 78).addBox(0.0F, -3.6F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.2443F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(49, 18).mirror().addBox(-1.6F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.1F, 0.0F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(49, 18).addBox(-0.4F, 0.0F, 1.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.1F, 0.0F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(22, 39).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.041F, 4.9007F, -0.0441F, 0.1745F, 0.0F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(10, 96).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1281F, 4.0688F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(51, 95).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 2.0764F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(54, 86).addBox(0.0F, -2.6F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailmiddle.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(24, 86).addBox(0.0F, -1.6F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2758F, 5.1565F, 0.733F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailmiddle.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(68, 47).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1905F, 0.3865F, 0.8639F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailmiddle.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(86, 26).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1483F, 2.7185F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(9, 47).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, -0.04F, 0.1743F, 0.0082F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(57, 96).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 3.0255F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(86, 91).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 1.0255F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tailmiddleend.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(46, 84).addBox(0.0F, 0.2F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2968F, 1.1304F, 0.8029F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(44, 46).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9584F, 0.037F, 0.1308F, 0.0048F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(63, 96).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 3.0424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(60, 96).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 1.0424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r10 = Tailend.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(91, 57).addBox(0.0F, -1.3F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5959F, 3.598F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Tailbase_r11 = Tailend.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(35, 89).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8925F, 1.425F, 0.6894F, 0.0F, 0.0F));

		PartDefinition tail = Tailend.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 46).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0558F, 3.998F, 0.1145F, 0.1741F, 0.0123F));

		PartDefinition Tailend_r3 = tail.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(81, 96).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.0444F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = tail.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(66, 96).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r12 = tail.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(20, 96).addBox(0.0F, 13.5437F, 19.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 96).addBox(0.0F, 12.7437F, 17.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -20.4F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 39).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0088F, 3.9157F, 0.0457F, 0.3051F, 0.0138F));

		PartDefinition Tailend_r5 = tail2.addOrReplaceChild("Tailend_r5", CubeListBuilder.create().texOffs(92, 96).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.0444F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailend_r6 = tail2.addOrReplaceChild("Tailend_r6", CubeListBuilder.create().texOffs(84, 96).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = tail2.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(28, 97).addBox(0.0F, 14.4437F, 21.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4088F, -24.3157F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(49, 6).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0004F, 4.0027F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Tailend_r7 = tail3.addOrReplaceChild("Tailend_r7", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.0444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r8 = tail3.addOrReplaceChild("Tailend_r8", CubeListBuilder.create().texOffs(95, 96).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = tail3.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(97, 52).addBox(0.0F, 16.9437F, 25.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 97).addBox(0.0F, 15.3437F, 23.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4091F, -28.3184F, 0.5585F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(49, 12).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0852F, 0.3051F, -0.0138F));

		PartDefinition Tailend_r9 = tail4.addOrReplaceChild("Tailend_r9", CubeListBuilder.create().texOffs(16, 97).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.0444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r10 = tail4.addOrReplaceChild("Tailend_r10", CubeListBuilder.create().texOffs(13, 97).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(20, 52).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0025F, 3.9539F, -0.0888F, 0.2615F, -0.0117F));

		PartDefinition Tailend_r11 = tail5.addOrReplaceChild("Tailend_r11", CubeListBuilder.create().texOffs(96, 62).addBox(0.0F, -0.875F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.0444F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Tailend_r12 = tail5.addOrReplaceChild("Tailend_r12", CubeListBuilder.create().texOffs(34, 81).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(31, 52).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0003F, 4.0038F, -0.1761F, 0.2615F, -0.0117F));

		PartDefinition Tailend_r13 = tail6.addOrReplaceChild("Tailend_r13", CubeListBuilder.create().texOffs(34, 97).addBox(0.0F, -0.4F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 3.1444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r14 = tail6.addOrReplaceChild("Tailend_r14", CubeListBuilder.create().texOffs(96, 78).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5576F, 1.0444F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(42, 52).addBox(-0.5F, -0.5576F, 0.0444F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0004F, 4.0038F, -0.176F, 0.1289F, -0.0229F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1645F, 4.2536F, -1.3236F, -0.3601F, -0.1141F, -1.2006F));

		PartDefinition cube_r238 = hindlegL.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(69, 0).addBox(-0.502F, -2.2905F, -0.0105F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 2.5022F, -0.061F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r239 = hindlegL.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(90, 50).addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0538F, 6.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r240 = hindlegL.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(75, 67).addBox(-0.0538F, -2.1973F, 0.2132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 7.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r241 = hindlegL.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0538F, 6.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r242 = hindlegL.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(68, 66).addBox(-0.5F, -0.8F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0475F, 4.715F, 0.5691F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r243 = hindlegL.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.45F, -0.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.0174F, 1.5015F, -0.1006F, 0.288F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(7, 86).addBox(-0.5F, 2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(37, 70).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.2583F, 6.157F, 1.4833F, 0.7423F, 0.9531F, 1.7729F));

		PartDefinition cube_r244 = hindlegL2.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(71, 47).addBox(5.0F, 0.2F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-5.5F, -1.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r245 = hindlegL2.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(70, 58).addBox(-0.5F, -0.8F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r246 = hindlegL2.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(85, 51).addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)), PartPose.offsetAndRotation(0.0F, 2.4F, -1.6F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r247 = hindlegL2.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(49, 85).addBox(-0.5F, -2.0F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 2.4F, -1.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r248 = hindlegL2.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(12, 86).addBox(-0.5F, -0.85F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.2F, -1.2F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.1F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5417F, 4.0962F, 0.2501F, -0.1278F, -0.0918F, -1.1851F));

		PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(28, 29).addBox(-0.5F, -0.1F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0624F, 3.6301F, 0.0098F, 0.0F, 0.0F, -0.2094F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1645F, 4.2536F, -1.3236F, -0.3601F, 0.1141F, 1.2006F));

		PartDefinition cube_r249 = hindlegL3.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(69, 0).mirror().addBox(-0.498F, -2.2905F, -0.0105F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5022F, -0.061F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r250 = hindlegL3.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(90, 50).mirror().addBox(-0.5F, -0.775F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0538F, 6.3059F, 1.6307F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r251 = hindlegL3.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(75, 67).mirror().addBox(-0.9462F, -2.1973F, 0.2132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 7.7632F, 0.3923F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r252 = hindlegL3.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, -1.675F, 0.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0538F, 6.1486F, 0.7849F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r253 = hindlegL3.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(68, 66).mirror().addBox(-0.5F, -0.8F, -0.575F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0475F, 4.715F, 0.5691F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r254 = hindlegL3.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -1.45F, -0.3F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0174F, 1.5015F, -0.1006F, 0.288F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(7, 86).mirror().addBox(-0.5F, 2.2F, -1.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(37, 70).mirror().addBox(-0.5F, -0.6F, 0.1F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.2583F, 6.157F, 1.4833F, 0.4468F, -0.4368F, -1.3307F));

		PartDefinition cube_r255 = hindlegL4.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-6.0F, 0.2F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(5.5F, -1.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r256 = hindlegL4.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(70, 58).mirror().addBox(-0.5F, -0.8F, 0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r257 = hindlegL4.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-0.5F, -2.2F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, -1.6F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r258 = hindlegL4.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(49, 85).mirror().addBox(-0.5F, -2.0F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.4F, -1.6F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r259 = hindlegL4.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(-0.5F, -0.85F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.2F, -1.2F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone9 = hindlegL4.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.1F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.5417F, 4.0962F, 0.2501F, -0.1274F, 0.0485F, 1.1906F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(28, 29).mirror().addBox(-0.5F, -0.1F, -3.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0624F, 3.6301F, 0.0098F, 0.0F, 0.0F, 0.2094F));

		PartDefinition bone5 = Hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -2.171F, -1.9828F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r260 = bone5.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(91, 62).addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r261 = bone5.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 1.8908F, 1.6787F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r262 = bone5.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(91, 31).addBox(2.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r263 = bone5.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(11, 37).addBox(-1.0F, -4.6376F, 2.3243F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, -1.1558F, -0.2162F, 0.313F));

		PartDefinition cube_r264 = bone5.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(71, 17).addBox(-1.0F, -7.2454F, -5.0015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, -2.4866F, -0.2162F, 0.313F));

		PartDefinition cube_r265 = bone5.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(69, 22).addBox(-1.0F, 2.2218F, -8.5191F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 2.5749F, -0.2162F, 0.313F));

		PartDefinition cube_r266 = bone5.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(36, 58).addBox(-1.0F, 3.71F, -3.8123F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.8767F, -0.2162F, 0.313F));

		PartDefinition cube_r267 = bone5.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, 0.7019F, -2.8825F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.5102F, -0.2162F, 0.313F));

		PartDefinition cube_r268 = bone5.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 84).addBox(-1.0F, 2.0145F, 0.6674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.0739F, -0.2162F, 0.313F));

		PartDefinition cube_r269 = bone5.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(52, 64).addBox(-1.0F, -0.4487F, -1.4647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.5626F, -0.2162F, 0.313F));

		PartDefinition cube_r270 = bone5.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(90, 12).addBox(-0.5F, 0.525F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(7, 75).addBox(-0.5F, 0.125F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 3.4253F, -0.3777F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone5.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(18, 58).addBox(-1.0F, -3.0481F, -5.7569F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 2.3567F, -0.2162F, 0.313F));

		PartDefinition cube_r272 = bone5.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(16, 69).addBox(-1.0F, -3.0781F, 4.0387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, -1.8757F, -0.2162F, 0.313F));

		PartDefinition cube_r273 = bone5.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(69, 12).addBox(-1.0F, 1.8103F, 4.5317F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, -1.134F, -0.2162F, 0.313F));

		PartDefinition cube_r274 = bone5.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(69, 7).addBox(-1.0F, 5.5359F, -1.3748F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, -0.174F, -0.2162F, 0.313F));

		PartDefinition cube_r275 = bone5.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(9, 53).addBox(-1.0F, 1.9424F, -4.8866F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 0.6114F, -0.2162F, 0.313F));

		PartDefinition cube_r276 = bone5.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(53, 52).addBox(-1.0F, -0.0755F, -5.258F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.0041F, -0.2162F, 0.313F));

		PartDefinition cube_r277 = bone5.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 50).addBox(-1.0F, -0.5527F, -2.883F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6F, 3.8253F, 0.6223F, 1.1786F, -0.2162F, 0.313F));

		PartDefinition cube_r278 = bone5.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(76, 6).addBox(-0.5F, -0.05F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.5333F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r279 = bone5.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(63, 33).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1F, 2.1305F, 0.1035F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r280 = bone5.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(62, 51).addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1F, 2.1305F, 0.1035F, 2.1904F, 0.0F, 0.0F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -2.171F, -1.9828F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r281 = bone8.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(91, 62).mirror().addBox(-0.5F, 0.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9833F, 0.5919F, 1.946F, 0.0F, 0.0F));

		PartDefinition cube_r282 = bone8.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(13, 29).mirror().addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.8908F, 1.6787F, 0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r283 = bone8.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-3.0F, 0.3866F, 0.1444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 1.325F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r284 = bone8.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(11, 37).mirror().addBox(0.0F, -4.6376F, 2.3243F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, -1.1558F, 0.2162F, -0.313F));

		PartDefinition cube_r285 = bone8.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(0.0F, -7.2454F, -5.0015F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, -2.4866F, 0.2162F, -0.313F));

		PartDefinition cube_r286 = bone8.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(69, 22).mirror().addBox(0.0F, 2.2218F, -8.5191F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 2.5749F, 0.2162F, -0.313F));

		PartDefinition cube_r287 = bone8.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(36, 58).mirror().addBox(0.0F, 3.71F, -3.8123F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.8767F, 0.2162F, -0.313F));

		PartDefinition cube_r288 = bone8.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0F, 0.7019F, -2.8825F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.5102F, 0.2162F, -0.313F));

		PartDefinition cube_r289 = bone8.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(67, 84).mirror().addBox(0.0F, 2.0145F, 0.6674F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.0739F, 0.2162F, -0.313F));

		PartDefinition cube_r290 = bone8.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(0.0F, -0.4487F, -1.4647F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.5626F, 0.2162F, -0.313F));

		PartDefinition cube_r291 = bone8.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(90, 12).mirror().addBox(-0.5F, 0.525F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(7, 75).mirror().addBox(-0.5F, 0.125F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.4253F, -0.3777F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r292 = bone8.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(18, 58).mirror().addBox(0.0F, -3.0481F, -5.7569F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 2.3567F, 0.2162F, -0.313F));

		PartDefinition cube_r293 = bone8.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(16, 69).mirror().addBox(0.0F, -3.0781F, 4.0387F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, -1.8757F, 0.2162F, -0.313F));

		PartDefinition cube_r294 = bone8.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(0.0F, 1.8103F, 4.5317F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, -1.134F, 0.2162F, -0.313F));

		PartDefinition cube_r295 = bone8.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(69, 7).mirror().addBox(0.0F, 5.5359F, -1.3748F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, -0.174F, 0.2162F, -0.313F));

		PartDefinition cube_r296 = bone8.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(0.0F, 1.9424F, -4.8866F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 0.6114F, 0.2162F, -0.313F));

		PartDefinition cube_r297 = bone8.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(0.0F, -0.0755F, -5.258F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.0041F, 0.2162F, -0.313F));

		PartDefinition cube_r298 = bone8.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.0F, -0.5527F, -2.883F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 3.8253F, 0.6223F, 1.1786F, 0.2162F, -0.313F));

		PartDefinition cube_r299 = bone8.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(76, 6).mirror().addBox(-0.5F, -0.05F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5333F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r300 = bone8.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1305F, 0.1035F, 1.9722F, 0.0F, 0.0F));

		PartDefinition cube_r301 = bone8.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.1305F, 0.1035F, 2.1904F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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