package fossils.fossils.client.blockentity.model.melosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MelosaurusFossilModel extends SkullModelBase {
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
	private final ModelPart bone8;
	private final ModelPart bone2;
	private final ModelPart bone5;
	private final ModelPart Neck;
	private final ModelPart Head;
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
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone6;

	public MelosaurusFossilModel(ModelPart root) {
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
		this.bone8 = this.forelegL4.getChild("bone8");
		this.bone2 = this.chest.getChild("bone2");
		this.bone5 = this.chest.getChild("bone5");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
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
		this.bone7 = this.hindlegL4.getChild("bone7");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone6 = this.Hips.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(59, 4).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(85, 82).addBox(0.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 82).mirror().addBox(-2.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.6682F, 15.6011F, -0.1691F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(93, 77).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -1.4109F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(73, 93).addBox(0.0F, -2.4F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.5109F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Hips.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(74, 62).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7167F, -0.1695F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0443F, 0.0436F, 0.0019F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(35, 89).addBox(0.0F, -2.3121F, 0.1978F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -1.6602F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(95, 52).mirror().addBox(-2.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -3.6602F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -3.6602F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(58, 95).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -1.6602F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(95, 52).addBox(1.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -3.6602F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 50).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -3.6602F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(13, 54).addBox(0.0F, -2.2551F, -0.0364F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(57, 19).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0797F, 0.221F, -0.0252F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(8, 90).addBox(0.0F, -2.4016F, 0.0359F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 37).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -1.5604F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -1.5604F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.6037F, 0.0998F, -0.1434F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 82).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.5208F, 0.3352F, -0.5208F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(16, 97).mirror().addBox(-0.6732F, 0.0005F, -0.7225F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7126F, 2.2638F, -1.2512F, 2.9341F, 0.6999F, 1.7895F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(94, 75).mirror().addBox(-0.2202F, -0.0005F, -0.4652F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7126F, 2.2638F, -1.2512F, 2.0085F, 1.3959F, 0.7971F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 37).mirror().addBox(-5.6882F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.2459F, 0.5651F, -1.1326F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(82, 37).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -1.5604F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 82).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -1.5604F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 95).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.6037F, -0.0998F, 0.1434F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 82).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.5208F, -0.3352F, 0.5208F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 97).addBox(-0.3268F, 0.0005F, -0.7225F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7126F, 2.2638F, -1.2512F, 2.9341F, -0.6999F, -1.7895F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(94, 75).addBox(-0.7798F, -0.0005F, -0.4652F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7126F, 2.2638F, -1.2512F, 2.0085F, -1.3959F, -0.7971F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(57, 37).addBox(2.6881F, -2.8327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.2459F, -0.5651F, 1.1326F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(5, 90).addBox(0.0F, -2.4516F, 0.0359F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(43, 51).addBox(-0.4F, -0.4874F, -4.7045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(43, 90).addBox(0.1F, -2.9874F, -1.7045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -4.2F, -0.006F, 0.1309F, -0.0008F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(96, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8454F, -0.0883F, -0.1818F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-2.1517F, 0.009F, -0.534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8415F, -0.0302F, -0.1165F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(71, 83).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8231F, 0.2373F, -0.4745F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(64, 83).mirror().addBox(-3.8538F, -0.8339F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8512F, 0.325F, -0.3733F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(83, 49).mirror().addBox(-4.4684F, -2.8139F, 0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.5601F, 0.526F, -1.0527F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(68, 35).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.6075F, 0.6353F, -0.9665F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-3.5441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 1.9508F, 1.0533F, 0.6439F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-0.2278F, -2.8298F, -5.9443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 2.5886F, 0.5061F, 1.4931F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(95, 84).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8175F, 3.6921F, 1.2481F, 0.8178F, 1.0366F, -0.659F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(43, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7406F, -0.0823F, -0.1967F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-3.8538F, -0.8339F, -0.4714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7425F, 0.3088F, -0.431F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(82, 74).mirror().addBox(-2.1433F, 0.0061F, -0.5625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7385F, 0.0468F, -0.0792F));

		PartDefinition cube_r33 = Bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(82, 66).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7192F, 0.2112F, -0.5214F));

		PartDefinition cube_r34 = Bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-4.4684F, -2.8139F, 0.3666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.4808F, 0.4483F, -1.1137F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(25, 10).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.5155F, 0.5634F, -1.0422F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(95, 42).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 1.7942F, 1.1292F, 0.481F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-0.2278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 2.6084F, 0.6093F, 1.4798F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7572F, 0.9188F, -0.6917F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(96, 11).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8454F, 0.0883F, 0.1818F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(96, 9).addBox(1.1517F, 0.009F, -0.534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8415F, 0.0302F, 0.1165F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(71, 83).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8231F, -0.2373F, 0.4745F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(64, 83).addBox(1.8538F, -0.8339F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8512F, -0.325F, 0.3733F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(83, 49).addBox(2.4684F, -2.8139F, 0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.5601F, -0.526F, 1.0527F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(68, 35).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.6075F, -0.6353F, 0.9665F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(96, 3).addBox(2.5441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 1.9508F, -1.0533F, -0.6439F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(83, 47).addBox(-1.7722F, -2.8298F, -5.9443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 2.5886F, -0.5061F, -1.4931F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(95, 84).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0175F, 3.6921F, 1.2481F, 0.8178F, -1.0366F, 0.659F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(43, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7406F, 0.0823F, 0.1967F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(82, 76).addBox(1.8538F, -0.8339F, -0.4714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7425F, -0.3088F, 0.431F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 74).addBox(0.1433F, 0.0061F, -0.5625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7385F, -0.0468F, 0.0792F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(82, 66).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7192F, -0.2112F, 0.5214F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 64).addBox(2.4684F, -2.8139F, 0.3666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.4808F, -0.4483F, 1.1137F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(25, 10).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.5155F, -0.5634F, 1.0422F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(95, 42).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 1.7942F, -1.1292F, -0.481F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 62).addBox(-1.7722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 2.6084F, -0.6093F, -1.4798F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(82, 39).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7572F, -0.9188F, 0.6917F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(11, 90).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -3.7045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(17, 52).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(46, 90).addBox(0.0F, -2.8F, -4.975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -4.7048F, -0.0106F, 0.0432F, -0.0421F));

		PartDefinition Bodyfront_r2 = body2.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(52, 90).addBox(0.0F, -2.9F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(49, 90).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(84, 26).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.589F, -0.071F, -0.2683F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5892F, 0.0743F, -0.1714F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(84, 24).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.587F, 0.2804F, -0.5595F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(84, 22).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5705F, 0.1708F, -0.6329F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(15, 86).mirror().addBox(-4.4684F, -2.8139F, 0.5666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.375F, 0.3326F, -1.2372F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 4).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.3954F, 0.4539F, -1.184F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(96, 58).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 1.4701F, 1.2154F, 0.0984F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 72).mirror().addBox(-0.6278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 2.6446F, 0.7582F, 1.4195F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 34).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5486F, 0.8449F, -0.9363F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(81, 8).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4628F, 0.7969F, -0.9923F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(-0.8278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 2.6591F, 0.8332F, 1.4366F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 1.2547F, 1.2363F, -0.0976F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(69, 56).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.3447F, 0.394F, -1.1981F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(19, 84).mirror().addBox(-4.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.3671F, 0.5167F, -1.1474F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(84, 18).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5138F, 0.0823F, -0.1705F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5117F, 0.2589F, -0.5728F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(84, 14).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4988F, 0.1443F, -0.6374F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(84, 12).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5132F, -0.0698F, -0.2562F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(12, 84).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5511F, -0.0638F, -0.2678F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.552F, 0.0849F, -0.1764F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5321F, 0.1637F, -0.6413F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5471F, 0.2761F, -0.5725F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-4.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.3895F, 0.5497F, -1.145F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(96, 13).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 1.3706F, 1.2341F, 0.0028F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.3639F, 0.428F, -1.1995F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-0.8278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 2.6609F, 0.795F, 1.4289F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(30, 48).mirror().addBox(-8.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.4983F, 0.8264F, -0.9757F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(84, 26).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.589F, 0.071F, 0.2683F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(26, 84).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5892F, -0.0743F, 0.1714F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(84, 24).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.587F, -0.2804F, 0.5595F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(84, 22).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5705F, -0.1708F, 0.6329F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(15, 86).addBox(2.4684F, -2.8139F, 0.5666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.375F, -0.3326F, 1.2372F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 4).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.3954F, -0.4539F, 1.184F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(96, 58).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 1.4701F, -1.2154F, -0.0984F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(77, 72).addBox(-1.3722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 2.6446F, -0.7582F, -1.4195F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(86, 34).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5486F, -0.8449F, 0.9363F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(81, 8).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4628F, -0.7969F, 0.9923F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(84, 20).addBox(-1.1722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 2.6591F, -0.8332F, -1.4366F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(96, 15).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 1.2547F, -1.2363F, 0.0976F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(69, 56).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3447F, -0.394F, 1.1981F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(19, 84).addBox(2.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3671F, -0.5167F, 1.1474F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 18).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5138F, -0.0823F, 0.1705F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(84, 16).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5117F, -0.2589F, 0.5728F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 14).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4988F, -0.1443F, 0.6374F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 12).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5132F, 0.0698F, 0.2562F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 84).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5511F, 0.0638F, 0.2678F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(84, 10).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.552F, -0.0849F, 0.1764F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(5, 84).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5321F, -0.1637F, 0.6413F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 80).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5471F, -0.2761F, 0.5725F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(83, 78).addBox(2.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.3895F, -0.5497F, 1.145F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(96, 13).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 1.3706F, -1.2341F, -0.0028F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(69, 54).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.3639F, -0.428F, 1.1995F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(78, 83).addBox(-1.1722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 2.6609F, -0.795F, -1.4289F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(30, 48).addBox(5.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.4983F, -0.8264F, 0.9757F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(44, 4).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(60, 90).addBox(0.0F, -2.5F, -6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0696F, 0.0496F, -0.084F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(78, 90).addBox(0.0F, -2.7F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(90, 77).addBox(0.0F, -2.825F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 50).addBox(-3.5F, -2.005F, -0.6719F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(44, 0).addBox(-4.0F, -0.0077F, -0.6531F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.9784F, -8.4272F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(24, 59).addBox(-2.0F, 1.8797F, -0.9256F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.9784F, -8.4272F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 62).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.3331F, -12.2775F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(96, 33).mirror().addBox(-3.5459F, -2.8496F, -5.2265F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 1.7993F, 1.2599F, 0.3498F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(96, 31).mirror().addBox(-2.1195F, -0.0453F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6696F, 0.1582F, -0.2221F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(96, 25).mirror().addBox(-1.9909F, -0.0515F, -0.5853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6599F, 0.0207F, -0.3301F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(59, 85).mirror().addBox(-4.4638F, -2.8326F, 0.3164F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.3321F, 0.4179F, -1.3215F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(66, 85).mirror().addBox(-3.7827F, -0.8767F, -0.0853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 55).mirror().addBox(-3.7827F, -0.888F, -0.5853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6055F, 0.2815F, -0.6851F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(85, 53).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4765F, 0.182F, -0.1634F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(45, 85).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4682F, 0.0265F, -0.2432F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 45).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 85).mirror().addBox(-3.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4193F, 0.2164F, -0.6396F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(33, 70).mirror().addBox(-6.6394F, -2.8514F, -0.5853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.3607F, 0.5657F, -1.261F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 23).mirror().addBox(0.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 2.8144F, 0.8603F, 1.5652F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(96, 21).mirror().addBox(-3.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 1.1282F, 1.3367F, -0.2072F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-4.6882F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 8).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2308F, 0.4119F, -1.2308F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(85, 51).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.3168F, 0.8328F, -1.0867F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4772F, 0.1297F, -0.1184F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(85, 41).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4731F, -0.0256F, -0.1983F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 85).mirror().addBox(-3.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 72).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4443F, 0.1701F, -0.5899F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(59, 10).mirror().addBox(-8.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.3774F, 0.8009F, -0.9976F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(84, 32).mirror().addBox(-4.6882F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 6).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.2806F, 0.3868F, -1.1666F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(96, 19).mirror().addBox(0.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 2.7344F, 0.8663F, 1.5492F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(96, 17).mirror().addBox(-3.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 1.1388F, 1.2845F, -0.152F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(96, 33).addBox(2.5459F, -2.8496F, -5.2265F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 1.7993F, -1.2599F, -0.3498F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(96, 31).addBox(1.1195F, -0.0453F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6696F, -0.1582F, 0.2221F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(66, 85).addBox(1.7826F, -0.8767F, -0.0853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 55).addBox(1.7826F, -0.888F, -0.5853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6055F, -0.2815F, 0.6851F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(59, 85).addBox(2.4638F, -2.8326F, 0.3164F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.3321F, -0.4179F, 1.3215F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(33, 70).addBox(2.6394F, -2.8514F, -0.5853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.3607F, -0.5657F, 1.261F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(96, 25).addBox(0.9909F, -0.0515F, -0.5853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6599F, -0.0207F, 0.3301F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(96, 23).addBox(-1.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 2.8144F, -0.8603F, -1.5652F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(96, 21).addBox(2.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 1.1282F, -1.3367F, 0.2072F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(85, 53).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4765F, -0.182F, 0.1634F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(52, 85).addBox(1.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 45).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4193F, -0.2164F, 0.6396F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(81, 60).addBox(2.6881F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 8).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2308F, -0.4119F, 1.2308F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(85, 51).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.3168F, -0.8328F, 1.0867F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(45, 85).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4682F, -0.0265F, 0.2432F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(85, 43).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4772F, -0.1297F, 0.1184F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(85, 41).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4731F, 0.0256F, 0.1983F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(38, 85).addBox(1.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 72).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4443F, -0.1701F, 0.5899F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 10).addBox(5.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.3774F, -0.8009F, 0.9976F));

		PartDefinition cube_r151 = chest.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(84, 32).addBox(2.6881F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 6).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.2806F, -0.3868F, 1.1666F));

		PartDefinition cube_r152 = chest.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(96, 19).addBox(-1.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 2.7344F, -0.8663F, -1.5492F));

		PartDefinition cube_r153 = chest.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(96, 17).addBox(2.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 1.1388F, -1.2845F, 0.152F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(44, 71).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.7503F, 3.6469F, -5.0538F, 0.894F, 0.2044F, -0.5429F));

		PartDefinition cube_r154 = forelegL.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(73, 78).addBox(-0.5F, -3.075F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r155 = forelegL.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 85).addBox(-0.5F, 1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(84, 68).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r156 = forelegL.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(84, 28).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0543F, 5.2384F, -0.1672F, -0.341F, 0.0199F, -0.3472F));

		PartDefinition cube_r157 = forelegL2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(55, 90).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r158 = forelegL2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(90, 47).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(89, 74).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r159 = forelegL2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(33, 85).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r160 = forelegL2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(7, 79).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(78, 78).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3235F, 3.2362F, -0.249F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(40, 40).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(44, 71).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.7503F, 3.6469F, -5.0538F, 0.7778F, -0.0793F, 0.486F));

		PartDefinition cube_r162 = forelegL3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 78).mirror().addBox(-0.5F, -3.075F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r163 = forelegL3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5F, 1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(84, 68).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r164 = forelegL3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 28).mirror().addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0543F, 5.2384F, -0.1672F, -0.3399F, -0.0345F, 0.306F));

		PartDefinition cube_r165 = forelegL4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r166 = forelegL4.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(90, 47).mirror().addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(89, 74).mirror().addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r167 = forelegL4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(33, 85).mirror().addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r168 = forelegL4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false)
				.texOffs(78, 78).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone8 = forelegL4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.3235F, 3.2362F, -0.249F));

		PartDefinition cube_r169 = bone8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(40, 40).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0898F, -5.0304F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(75, 37).addBox(-0.9507F, 2.2516F, 4.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 1.1679F, -0.0965F, -0.2997F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 72).addBox(-0.9507F, -1.8854F, 4.0737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 0.5134F, -0.0965F, -0.2997F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(73, 90).addBox(-0.9251F, -2.6442F, 4.4019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 0.5658F, -0.0965F, -0.2997F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 65).addBox(-0.9251F, 2.2074F, -0.2295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 1.1766F, -0.0965F, -0.2997F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(38, 87).addBox(1.7506F, 0.9742F, -1.8148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(66, 37).addBox(1.5283F, 0.0872F, -0.6054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.4216F, 0.1459F, 0.1202F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(65, 59).addBox(0.4472F, 0.6085F, -1.645F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(77, 18).addBox(1.4222F, 4.6335F, -1.645F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 2.0572F, -0.7239F, -0.3369F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(18, 71).addBox(-0.7494F, 0.6897F, -1.645F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(14, 75).addBox(2.5147F, -5.4258F, -1.8459F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.8894F, 0.9318F, 0.2766F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(68, 65).addBox(-0.36F, -5.0397F, -1.8459F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.7865F, 0.51F, 0.1243F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(7, 75).addBox(1.3617F, -0.8778F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(74, 58).addBox(1.3617F, 0.1222F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.242F, 0.1725F, 0.1928F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(68, 74).addBox(1.5649F, -0.1175F, -3.1196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.3241F, 0.3723F, 0.3312F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(74, 0).addBox(1.5283F, 0.2814F, 0.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.2435F, 0.1459F, 0.1202F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(37, 72).addBox(1.5649F, -2.1348F, -3.8137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.9786F, 0.3723F, 0.3312F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(35, 59).addBox(1.5649F, -2.4283F, -1.5939F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.1532F, 0.3723F, 0.3312F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(30, 41).addBox(1.295F, -2.7431F, -0.0549F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.1314F, 0.1516F, 0.2096F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(68, 90).addBox(1.7506F, -2.2487F, -3.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(63, 90).addBox(1.7506F, 0.0373F, -3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(30, 89).addBox(1.7506F, 1.7618F, -2.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(61, 71).addBox(1.7506F, 0.7618F, -2.3285F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(94, 66).addBox(2.3751F, 1.1611F, 0.1099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 2.0191F, -0.0678F, -0.3072F));

		PartDefinition cube_r190 = bone2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(44, 12).addBox(-0.9251F, -0.2185F, 0.1399F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 1.0545F, -0.0965F, -0.2997F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0898F, -5.0304F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r191 = bone5.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(75, 37).mirror().addBox(-0.0493F, 2.2516F, 4.4783F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 1.1679F, 0.0965F, 0.2997F));

		PartDefinition cube_r192 = bone5.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.0493F, -1.8854F, 4.0737F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 0.5134F, 0.0965F, 0.2997F));

		PartDefinition cube_r193 = bone5.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(73, 90).mirror().addBox(-0.0749F, -2.6442F, 4.4019F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 0.5658F, 0.0965F, 0.2997F));

		PartDefinition cube_r194 = bone5.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 65).mirror().addBox(-0.0749F, 2.2074F, -0.2295F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 1.1766F, 0.0965F, 0.2997F));

		PartDefinition cube_r195 = bone5.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(38, 87).mirror().addBox(-2.7506F, 0.9742F, -1.8148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r196 = bone5.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(66, 37).mirror().addBox(-2.5283F, 0.0872F, -0.6054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.4216F, -0.1459F, -0.1202F));

		PartDefinition cube_r197 = bone5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(65, 59).mirror().addBox(-3.4472F, 0.6085F, -1.645F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 2.0572F, 0.7239F, 0.3369F));

		PartDefinition cube_r198 = bone5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(18, 71).mirror().addBox(-2.2506F, 0.6897F, -1.645F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(14, 75).mirror().addBox(-4.5147F, -5.4258F, -1.8459F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.8894F, -0.9318F, -0.2766F));

		PartDefinition cube_r200 = bone5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(68, 65).mirror().addBox(-2.64F, -5.0397F, -1.8459F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.7865F, -0.51F, -0.1243F));

		PartDefinition cube_r201 = bone5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-2.3617F, -0.8778F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(74, 58).mirror().addBox(-2.3617F, 0.1222F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.242F, -0.1725F, -0.1928F));

		PartDefinition cube_r202 = bone5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(68, 74).mirror().addBox(-2.5649F, -0.1175F, -3.1196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.3241F, -0.3723F, -0.3312F));

		PartDefinition cube_r203 = bone5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-2.5283F, 0.2814F, 0.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.2435F, -0.1459F, -0.1202F));

		PartDefinition cube_r204 = bone5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(37, 72).mirror().addBox(-2.5649F, -2.1348F, -3.8137F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.9786F, -0.3723F, -0.3312F));

		PartDefinition cube_r205 = bone5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(35, 59).mirror().addBox(-2.5649F, -2.4283F, -1.5939F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.1532F, -0.3723F, -0.3312F));

		PartDefinition cube_r206 = bone5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 41).mirror().addBox(-2.295F, -2.7431F, -0.0549F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.1314F, -0.1516F, -0.2096F));

		PartDefinition cube_r207 = bone5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(-2.7506F, -2.2487F, -3.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(63, 90).mirror().addBox(-2.7506F, 0.0373F, -3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(30, 89).mirror().addBox(-2.7506F, 1.7618F, -2.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(61, 71).mirror().addBox(-2.7506F, 0.7618F, -2.3285F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(-3.3751F, 1.1611F, 0.1099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 2.0191F, 0.0678F, 0.3072F));

		PartDefinition cube_r211 = bone5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(44, 12).mirror().addBox(-0.0749F, -0.2185F, 0.1399F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 1.0545F, 0.0965F, 0.2997F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(43, 58).addBox(-0.5F, -0.7596F, -3.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(48, 67).addBox(-0.5F, -0.7596F, -5.9227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, -0.2063F, -0.0028F, -0.0872F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(91, 90).addBox(0.0F, -1.7743F, -0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -3.9227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(38, 91).addBox(0.0F, -1.975F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(80, 85).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -3.1797F, 0.5976F, 0.4183F, -0.4951F));

		PartDefinition cube_r213 = Neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(22, 86).mirror().addBox(-3.558F, -1.076F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -1.1797F, 0.2576F, 0.6742F, -1.3902F));

		PartDefinition cube_r214 = Neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(73, 85).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -1.1797F, 0.5976F, 0.4183F, -0.7569F));

		PartDefinition cube_r215 = Neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(80, 85).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -3.1797F, 0.5976F, -0.4183F, 0.4951F));

		PartDefinition cube_r216 = Neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(22, 86).addBox(1.558F, -1.076F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.2576F, -0.6742F, 1.3902F));

		PartDefinition cube_r217 = Neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(73, 85).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.5976F, -0.4183F, 0.7569F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.9076F, -3.8117F, -0.3924F, 0.1128F, -0.1468F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(68, 70).addBox(-1.49F, -0.9F, -0.9F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(17, 81).addBox(-1.0108F, -1.3473F, -2.0532F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0217F, 0.4372F, -12.1343F, 0.7509F, -0.0062F, -0.0008F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(81, 0).addBox(-1.0108F, -0.6052F, -2.6665F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0155F, 0.2118F, -11.16F, 0.2273F, -0.0062F, -0.0008F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(68, 30).addBox(-0.5108F, -0.7195F, -2.7894F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 0.8629F, -10.1925F, -0.0519F, -0.0062F, -0.0008F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 61).addBox(-1.1399F, 0.1383F, -5.9238F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -0.6703F, -4.8149F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(77, 22).addBox(-0.5327F, 0.5379F, -2.1426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -0.6703F, -4.8149F, 0.1849F, 0.0621F, -0.7873F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(63, 0).addBox(-2.1399F, 0.0457F, -1.9301F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -0.6703F, -4.8149F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(81, 90).addBox(-1.3124F, -0.325F, 0.5613F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F))
				.texOffs(56, 47).addBox(-2.3124F, 0.05F, -0.0137F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8224F, -0.75F, -3.9863F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create().texOffs(63, 87).addBox(-1.715F, 0.8453F, -0.6253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offset(1.625F, 0.5F, -14.0F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(40, 22).addBox(-0.9034F, 0.2571F, -6.9185F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.7304F, 0.5797F, 9.5706F, 0.049F, 0.3839F, 0.0015F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(21, 23).addBox(-0.1034F, 0.2571F, -5.9185F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3042F, 0.6085F, 8.0255F, 0.0181F, 0.3316F, 0.0004F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5122F, -0.9027F, -1.94F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.6334F, 8.9976F, 0.284F, 0.2722F, -0.8811F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(91, 19).addBox(-0.4801F, -0.7487F, -0.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1223F, -0.6334F, 8.9976F, 0.4538F, 0.2466F, -0.9002F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(86, 93).addBox(-0.4801F, -0.5527F, -0.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 91).addBox(-0.4801F, -0.5527F, -0.509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1223F, -0.6334F, 8.9976F, -0.3752F, 0.2466F, -0.9002F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(75, 74).addBox(-0.5051F, -0.7027F, -0.559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.6334F, 8.9976F, -0.4625F, 0.2466F, -0.9002F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(91, 16).addBox(-0.475F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1423F, -0.3481F, 8.1707F, -1.1634F, 0.2663F, -0.9183F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(81, 93).addBox(-0.5F, -0.25F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 91).addBox(-0.5F, -0.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3595F, -0.4317F, 8.8334F, -0.0839F, 0.2834F, -0.96F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(19, 94).addBox(-1.025F, -0.175F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1692F, -0.2719F, 1.6209F, 0.46F, -0.1873F, -0.7242F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(89, 69).addBox(-1.075F, -0.35F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1692F, -0.2719F, 1.6209F, 0.1735F, -0.0892F, -0.9243F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(91, 13).addBox(-0.5F, -0.525F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3595F, -0.4317F, 8.8334F, -0.4329F, 0.2834F, -0.96F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(57, 12).addBox(-0.375F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0791F, -0.4525F, 11.1692F, -0.4211F, -0.1407F, -1.7497F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(54, 59).addBox(-0.575F, -0.65F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3431F, -0.4526F, 11.7071F, -0.3189F, 0.2161F, -0.7509F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(57, 31).addBox(-0.9599F, -1.0469F, 0.305F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9248F, -0.2F, 9.328F, -0.1669F, 0.1239F, -1.0609F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(91, 10).addBox(1.0138F, 2.6944F, 2.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.9516F, -0.342F, -0.9293F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(15, 88).addBox(-0.9478F, -0.7134F, -1.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 7).addBox(-0.9478F, -0.7134F, -0.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F))
				.texOffs(73, 87).addBox(-0.853F, -0.2634F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.536F, 1.1329F, 0.5179F, -0.0639F, 0.8237F, -0.0423F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(88, 57).addBox(-0.9478F, -0.0135F, -0.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5392F, 0.4336F, 0.5483F, 0.4788F, 0.7013F, 0.7222F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(25, 88).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6553F, 0.4402F, 1.0089F, 0.0467F, 0.1518F, 0.5762F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(78, 44).addBox(-0.8337F, -0.7425F, -0.2848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 87).addBox(0.2498F, -0.2925F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5302F, 1.1804F, 0.9413F, -0.0441F, 0.1526F, -0.0067F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(43, 87).addBox(-0.4287F, -0.2634F, -1.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.536F, 1.1329F, 0.5179F, -0.1415F, 1.2582F, -0.1302F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(83, 87).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9276F, 1.4077F, 1.3891F, -0.0541F, 0.632F, -0.032F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(78, 87).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0949F, 1.7548F, 2.4622F, -0.0468F, -0.3705F, 0.017F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(68, 87).addBox(0.3767F, -0.2925F, 0.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(48, 87).addBox(0.3267F, -0.7425F, 0.2624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5302F, 1.1804F, 0.9413F, -0.0441F, -0.1526F, 0.0067F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(58, 87).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6651F, 0.4803F, 1.9281F, -0.1203F, -0.1039F, 0.5856F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(20, 88).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5637F, 0.5F, 2.7064F, -0.0202F, -0.0337F, 0.5414F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(0, 43).addBox(-2.525F, -0.5F, -1.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0891F, 1.0F, 2.6878F, 0.0F, -0.0393F, 0.0F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(68, 20).addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5588F, 0.5405F, 6.2581F, -0.2592F, 0.1924F, -0.9627F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(30, 51).addBox(-0.9105F, -2.0669F, -4.9373F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6042F, 0.6085F, 9.4255F, -0.2593F, 0.2099F, -0.9634F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(77, 68).addBox(-1.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0838F, 0.8064F, 11.253F, -0.328F, 0.0885F, -0.761F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(11, 65).addBox(-0.9636F, -1.035F, -3.9792F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9919F, -0.2775F, 9.6017F, -0.2309F, 0.2404F, -1.1623F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(35, 64).addBox(-0.9636F, -0.035F, -3.9792F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9919F, -0.2775F, 9.6017F, -0.0481F, 0.3284F, -0.5314F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(22, 65).addBox(-1.1636F, -1.035F, 0.2208F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, -0.0461F, 0.154F, -0.523F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(94, 36).addBox(-1.0205F, 1.555F, 3.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.5461F, 0.128F, -0.5943F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(94, 28).addBox(-0.8606F, 0.3667F, 3.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.1962F, 0.0835F, -0.6097F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(95, 39).addBox(-0.8441F, -0.4337F, 2.4206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, -0.0335F, 0.0778F, -0.6087F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(41, 95).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4937F, 0.6637F, 11.6229F, -0.2613F, 0.1609F, -0.6194F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(23, 13).addBox(-2.2077F, -0.1085F, -5.187F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3042F, 0.6085F, 8.0255F, 0.0F, 0.336F, 0.0F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(95, 47).addBox(1.673F, -1.2458F, 3.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.8998F, 0.5F, 9.278F, -0.3426F, -0.7278F, 1.1402F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(91, 3).addBox(3.8836F, -1.2458F, -2.4588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8998F, 0.5F, 9.278F, -2.6429F, -1.0188F, -2.6685F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(81, 57).addBox(-1.25F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.5509F, -0.2163F, 13.4167F, -0.3899F, -1.1959F, 0.3652F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(78, 41).addBox(-1.25F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5509F, -0.2163F, 13.4167F, -0.2403F, -0.9462F, 0.1962F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(89, 36).addBox(2.767F, 2.0838F, 2.1027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.7589F, -0.7859F, -0.5027F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(24, 94).addBox(0.5341F, 2.0838F, 3.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.521F, -0.214F, -0.033F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(86, 90).addBox(-0.0998F, 0.9909F, 3.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.2071F, -0.0503F, 0.0227F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(94, 72).addBox(-0.5773F, 0.3985F, 2.4206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, 0.0173F, 0.0829F, 0.0042F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(94, 69).addBox(-1.1162F, -0.0321F, 1.6471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, -0.1479F, 0.3112F, 0.0279F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(36, 10).addBox(-0.2F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-1.615F, -0.3037F, 12.7954F, -0.143F, -0.216F, 0.0308F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(0, 54).addBox(0.2114F, 0.1383F, -6.7243F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.9751F, -1.1703F, 9.1851F, 0.1244F, 0.1905F, 0.0237F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(68, 15).addBox(-1.1649F, -0.6949F, -2.7635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.715F, 0.3375F, 3.8119F, -0.0528F, -0.1805F, 0.0083F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(68, 25).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5611F, -0.4482F, 2.0859F, -0.1635F, -0.0932F, 0.7791F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(94, 90).addBox(-0.2414F, -1.1799F, -2.0855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.9071F, 0.3728F, 2.5355F, 0.2324F, 0.2063F, 0.049F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(94, 93).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4983F, -0.3912F, 0.604F, -0.0014F, 0.3094F, -0.8131F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(3, 95).addBox(-0.575F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5159F, 0.2356F, 0.0887F, -0.6358F, 0.5306F, -0.9002F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(94, 60).addBox(-0.8F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2603F, 0.3592F, -0.2879F, -0.9545F, 0.7567F, -1.1668F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(8, 95).addBox(-0.575F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5159F, 0.2356F, 0.0887F, -0.8976F, 0.5306F, -0.9002F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0105F, -0.0669F, -3.0373F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4613F, -0.5696F, 5.274F, -0.041F, 0.1924F, -0.9627F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(77, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6247F, 0.5F, 9.328F, -0.1222F, 0.2138F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create().texOffs(63, 87).mirror().addBox(0.715F, 0.8453F, -0.6253F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offset(-1.605F, 0.5F, -14.0F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(40, 22).mirror().addBox(-0.0966F, 0.2571F, -6.9185F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.7304F, 0.5797F, 9.5706F, 0.049F, -0.3839F, -0.0015F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(21, 23).mirror().addBox(-0.8966F, 0.2571F, -5.9185F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3042F, 0.6085F, 8.0255F, 0.0181F, -0.3316F, -0.0004F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.4878F, -0.9027F, -1.94F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1223F, -0.6334F, 8.9976F, 0.284F, -0.2722F, 0.8811F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.5199F, -0.7487F, -0.9364F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1223F, -0.6334F, 8.9976F, 0.4538F, -0.2466F, 0.9002F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(86, 93).mirror().addBox(-0.5199F, -0.5527F, -0.109F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 91).mirror().addBox(-0.5199F, -0.5527F, -0.509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1223F, -0.6334F, 8.9976F, -0.3752F, -0.2466F, 0.9002F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(75, 74).mirror().addBox(-0.4949F, -0.7027F, -0.559F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1223F, -0.6334F, 8.9976F, -0.4625F, -0.2466F, 0.9002F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-0.525F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1423F, -0.3481F, 8.1707F, -1.1634F, -0.2663F, 0.9183F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(81, 93).mirror().addBox(-0.5F, -0.25F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 91).mirror().addBox(-0.5F, -0.25F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3595F, -0.4317F, 8.8334F, -0.0839F, -0.2834F, 0.96F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(19, 94).mirror().addBox(0.025F, -0.175F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1692F, -0.2719F, 1.6209F, 0.46F, 0.1873F, 0.7242F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(89, 69).mirror().addBox(0.075F, -0.35F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1692F, -0.2719F, 1.6209F, 0.1735F, 0.0892F, 0.9243F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(91, 13).mirror().addBox(-0.5F, -0.525F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.3595F, -0.4317F, 8.8334F, -0.4329F, -0.2834F, 0.96F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-0.625F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0791F, -0.4525F, 11.1692F, -0.4211F, 0.1407F, 1.7497F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(54, 59).mirror().addBox(-0.425F, -0.65F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3431F, -0.4526F, 11.7071F, -0.3189F, -0.2161F, 0.7509F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(57, 31).mirror().addBox(-0.0401F, -1.0469F, 0.305F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9248F, -0.2F, 9.328F, -0.1669F, -0.1239F, 1.0609F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(91, 10).mirror().addBox(-2.0138F, 2.6944F, 2.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.9516F, 0.342F, 0.9293F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(9, 71).mirror().addBox(0.0848F, -0.7425F, -1.5295F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5302F, 1.1804F, 0.9413F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(15, 88).mirror().addBox(-0.0522F, -0.7134F, -1.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 7).mirror().addBox(-0.0522F, -0.7134F, -0.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(73, 87).mirror().addBox(-0.147F, -0.2634F, -0.9032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.536F, 1.1329F, 0.5179F, -0.0639F, -0.8237F, 0.0423F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(88, 57).mirror().addBox(-0.0522F, -0.0135F, -0.9959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5392F, 0.4336F, 0.5483F, 0.4788F, -0.7013F, -0.7222F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(25, 88).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6553F, 0.4402F, 1.0089F, 0.0467F, -0.1518F, -0.5762F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(78, 44).mirror().addBox(-1.1663F, -0.7425F, -0.2848F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 87).mirror().addBox(-1.2498F, -0.2925F, -0.2123F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5302F, 1.1804F, 0.9413F, -0.0441F, -0.1526F, 0.0067F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.5713F, -0.2634F, -1.699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.536F, 1.1329F, 0.5179F, -0.1415F, -1.2582F, 0.1302F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(83, 87).mirror().addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9276F, 1.4077F, 1.3891F, -0.0541F, -0.632F, 0.032F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(78, 87).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0949F, 1.7548F, 2.4622F, -0.0468F, 0.3705F, -0.017F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(68, 87).mirror().addBox(-1.3767F, -0.2925F, 0.4124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(48, 87).mirror().addBox(-1.3267F, -0.7425F, 0.2624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5302F, 1.1804F, 0.9413F, -0.0441F, 0.1526F, -0.0067F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(58, 87).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6651F, 0.4803F, 1.9281F, -0.1203F, 0.1039F, -0.5856F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(20, 88).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5637F, 0.5F, 2.7064F, -0.0202F, 0.0337F, -0.5414F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.475F, -0.5F, -1.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.0891F, 1.0F, 2.6878F, 0.0F, 0.0393F, 0.0F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(68, 20).mirror().addBox(-0.5F, -0.3F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5588F, 0.5405F, 6.2581F, -0.2592F, -0.1924F, 0.9627F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(30, 51).mirror().addBox(-0.0895F, -2.0669F, -4.9373F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6042F, 0.6085F, 9.4255F, -0.2593F, -0.2099F, 0.9634F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(0.0F, -0.9F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0838F, 0.8064F, 11.253F, -0.328F, -0.0885F, 0.761F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-0.0364F, -1.035F, -3.9792F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9919F, -0.2775F, 9.6017F, -0.2309F, -0.2404F, 1.1623F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(35, 64).mirror().addBox(-0.0364F, -0.035F, -3.9792F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9919F, -0.2775F, 9.6017F, -0.0481F, -0.3284F, 0.5314F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(22, 65).mirror().addBox(0.1636F, -1.035F, 0.2208F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, -0.0461F, -0.154F, 0.523F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(0.0205F, 1.555F, 3.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.5461F, -0.128F, 0.5943F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(94, 28).mirror().addBox(-0.1394F, 0.3667F, 3.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.1962F, -0.0835F, 0.6097F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(95, 39).mirror().addBox(-0.1559F, -0.4337F, 2.4206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, -0.0335F, -0.0778F, 0.6087F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(41, 95).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4937F, 0.6637F, 11.6229F, -0.2613F, -0.1609F, 0.6194F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(23, 13).mirror().addBox(-0.7923F, -0.1085F, -5.187F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3042F, 0.6085F, 8.0255F, 0.0F, -0.336F, 0.0F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(95, 47).mirror().addBox(-2.673F, -1.2458F, 3.3396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.8998F, 0.5F, 9.278F, -0.3426F, 0.7278F, -1.1402F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(91, 3).mirror().addBox(-4.8836F, -1.2458F, -2.4588F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8998F, 0.5F, 9.278F, -2.6429F, 1.0188F, 2.6685F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-0.75F, -0.5F, -0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, -0.2163F, 13.4167F, -0.3899F, 1.1959F, -0.3652F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(78, 41).mirror().addBox(-0.75F, -0.5F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.5509F, -0.2163F, 13.4167F, -0.2403F, 0.9462F, -0.1962F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(89, 36).mirror().addBox(-3.767F, 2.0838F, 2.1027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.7589F, 0.7859F, 0.5027F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(24, 94).mirror().addBox(-1.5341F, 2.0838F, 3.0321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.521F, 0.214F, 0.033F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(86, 90).mirror().addBox(-0.9002F, 0.9909F, 3.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.2071F, 0.0503F, -0.0227F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(94, 72).mirror().addBox(-0.4227F, 0.3985F, 2.4206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, 0.0173F, -0.0829F, -0.0042F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(94, 69).mirror().addBox(0.1162F, -0.0321F, 1.6471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, -0.1479F, -0.3112F, -0.0279F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(36, 10).mirror().addBox(-1.8F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.615F, -0.3037F, 12.7954F, -0.143F, 0.216F, -0.0308F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-1.2114F, 0.1383F, -6.7243F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.9751F, -1.1703F, 9.1851F, 0.1244F, -0.1905F, -0.0237F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(68, 15).mirror().addBox(0.1649F, -0.6949F, -2.7635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.715F, 0.3375F, 3.8119F, -0.0528F, 0.1805F, -0.0083F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.5611F, -0.4482F, 2.0859F, -0.1635F, 0.0932F, -0.7791F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(94, 90).mirror().addBox(-0.7586F, -1.1799F, -2.0855F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.9071F, 0.3728F, 2.5355F, 0.2324F, -0.2063F, -0.049F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(94, 93).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.4983F, -0.3912F, 0.604F, -0.0014F, -0.3094F, 0.8131F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(3, 95).mirror().addBox(-0.425F, -0.4F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5159F, 0.2356F, 0.0887F, -0.6358F, -0.5306F, 0.9002F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.2F, -0.8F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2603F, 0.3592F, -0.2879F, -0.9545F, -0.7567F, 1.1668F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(8, 95).mirror().addBox(-0.425F, -0.65F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5159F, 0.2356F, 0.0887F, -0.8976F, -0.5306F, 0.9002F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(0.0105F, -0.0669F, -3.0373F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4613F, -0.5696F, 5.274F, -0.041F, -0.1924F, 0.9627F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6247F, 0.5F, 9.328F, -0.1222F, -0.2138F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(91, 22).addBox(3.6F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(91, 22).mirror().addBox(-4.58F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6854F, -0.0196F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(54, 71).mirror().addBox(-0.5F, -0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.6551F, 0.853F, -3.3794F, -0.8378F, -0.2356F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(76, 48).mirror().addBox(0.0F, -0.0195F, -2.782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.58F, 2.2075F, -1.6685F, -1.3177F, -0.2356F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(68, 78).mirror().addBox(-0.0195F, 0.1271F, -1.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.501F, -0.3229F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(32, 72).mirror().addBox(-0.0195F, 2.0627F, -0.8428F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.4661F, -0.3229F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(89, 63).mirror().addBox(-1.2876F, 0.4623F, -0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.3671F, -0.8595F, -0.1017F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 87).mirror().addBox(-1.1566F, -0.0702F, -0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 89).mirror().addBox(-1.1566F, -0.1452F, -0.0901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.5801F, -0.6477F, -0.1196F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(87, 84).mirror().addBox(-1.1101F, -0.5467F, -0.2889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.4477F, -0.3423F, -0.1226F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-1.1101F, -0.4526F, -0.1069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.4041F, -0.3423F, -0.1226F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(-1.2876F, 0.4693F, -0.1015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.5416F, -0.8595F, -0.1017F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(80, 52).mirror().addBox(-0.2095F, -1.207F, -0.4244F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9057F, 3.2695F, -10.8905F, -1.4137F, 0.1484F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(94, 63).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9386F, 2.9131F, -12.8924F, -1.5519F, -0.4188F, -0.0103F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(89, 66).mirror().addBox(-0.25F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.4647F, 3.0762F, -14.2064F, -1.0623F, -1.0896F, -0.5329F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(77, 26).mirror().addBox(-1.1566F, 0.2028F, -1.2615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.2129F, 3.1893F, -12.5153F, -1.4143F, -0.6477F, -0.1196F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(27, 71).mirror().addBox(0.0483F, 0.0697F, -2.3616F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.2657F, -0.3013F, -0.0433F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(38, 80).mirror().addBox(-0.575F, -0.925F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5453F, 2.5952F, -10.3534F, -1.3789F, 0.0841F, 0.0333F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(33, 80).mirror().addBox(-0.2095F, -1.151F, -0.6396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.9057F, 3.2695F, -10.8905F, -1.3439F, 0.1484F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(14, 94).mirror().addBox(-0.0195F, 2.5557F, -2.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.1694F, -0.3229F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.0195F, 2.9373F, -1.4849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.3614F, -0.3229F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(44, 78).mirror().addBox(-0.0195F, -0.0935F, -1.888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.2915F, -0.3229F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-0.0075F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.78F, 2.2075F, -4.9685F, -1.3788F, -0.2356F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(49, 78).mirror().addBox(-0.0195F, -0.0107F, -0.485F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.8746F, 2.8407F, -4.7057F, -1.5795F, -0.3229F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(93, 87).mirror().addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.656F, 1.7973F, -3.3756F, -1.3177F, -0.2356F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(69, 48).mirror().addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.6602F, 1.9462F, -3.3578F, -1.4486F, -0.2356F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(37, 76).mirror().addBox(0.0F, -0.4463F, -1.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 76).addBox(8.18F, -0.4463F, -1.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.58F, 2.2075F, -1.6685F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(69, 43).mirror().addBox(-5.0F, 0.025F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(69, 43).addBox(3.18F, 0.025F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.42F, 2.2849F, -0.2687F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 67).mirror().addBox(-5.0F, 0.5F, -2.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 67).addBox(3.18F, 0.5F, -2.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.42F, 1.1397F, 0.658F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 78).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(26, 78).addBox(7.68F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-4.08F, 0.5672F, 0.5471F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(24, 91).mirror().addBox(-5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(24, 91).addBox(3.18F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.42F, 0.2F, 1.4F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(12, 79).mirror().addBox(-5.0F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(12, 79).addBox(3.18F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.42F, -0.8F, 0.4F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(54, 71).addBox(-0.5F, -0.9F, -0.675F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.6751F, 0.853F, -3.3794F, -0.8378F, 0.2356F, 0.0F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(76, 48).addBox(-1.0F, -0.0195F, -2.782F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.6F, 2.2075F, -1.6685F, -1.3177F, 0.2356F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(68, 78).addBox(-0.9805F, 0.1271F, -1.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.501F, 0.3229F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(32, 72).addBox(-0.9805F, 2.0627F, -0.8428F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.4661F, 0.3229F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(89, 63).addBox(0.2876F, 0.4623F, -0.3819F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.3671F, 0.8595F, 0.1017F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(88, 87).addBox(0.1566F, -0.0702F, -0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 89).addBox(0.1566F, -0.1452F, -0.0901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.5801F, 0.6477F, 0.1196F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(79, 34).addBox(-2.2229F, 0.8787F, -0.0585F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(87, 84).addBox(0.1101F, -0.5467F, -0.2889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.4477F, 0.3423F, 0.1226F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(89, 28).addBox(0.1101F, -0.4526F, -0.1069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.4041F, 0.3423F, 0.1226F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 60).addBox(0.2876F, 0.4693F, -0.1015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.5416F, 0.8595F, 0.1017F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(80, 52).addBox(-0.7905F, -1.207F, -0.4244F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -10.8905F, -1.4137F, -0.1484F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(94, 63).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9586F, 2.9131F, -12.8924F, -1.5519F, 0.4188F, 0.0103F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(89, 66).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4847F, 3.0762F, -14.2064F, -1.0623F, 1.0896F, 0.5329F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(77, 26).addBox(0.1566F, 0.2028F, -1.2615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.2329F, 3.1893F, -12.5153F, -1.4143F, 0.6477F, 0.1196F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(27, 71).addBox(-1.0483F, 0.0697F, -2.3616F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.2657F, 0.3013F, 0.0433F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(38, 80).addBox(-0.425F, -0.925F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5653F, 2.5952F, -10.3534F, -1.3789F, -0.0841F, -0.0333F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(33, 80).addBox(-0.7905F, -1.151F, -0.6396F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -10.8905F, -1.3439F, -0.1484F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(14, 94).addBox(-0.9805F, 2.5557F, -2.2217F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.1694F, 0.3229F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(0, 80).addBox(-0.9805F, 2.9373F, -1.4849F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.3614F, 0.3229F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(44, 78).addBox(-0.9805F, -0.0935F, -1.888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.2915F, 0.3229F, 0.0F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(88, 0).addBox(-0.9925F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 2.2075F, -4.9685F, -1.3788F, 0.2356F, 0.0F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(49, 78).addBox(-0.9805F, -0.0107F, -0.485F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.8946F, 2.8407F, -4.7057F, -1.5795F, 0.3229F, 0.0F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(93, 87).addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.676F, 1.7973F, -3.3756F, -1.3177F, 0.2356F, 0.0F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(69, 48).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.6802F, 1.9462F, -3.3578F, -1.4486F, 0.2356F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, 0.0114F, -0.3051F, -0.0894F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(93, 55).addBox(0.0F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 93).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 5.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(93, 31).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(92, 82).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(92, 50).addBox(0.0F, 1.3437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 39).addBox(0.0F, -0.0563F, -0.5671F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 6.2753F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(17, 34).addBox(0.0F, -0.0527F, -0.9698F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 4.2753F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(35, 94).addBox(0.0F, 1.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(0, 97).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tailbase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-1.5F, 0.0F, 0.1F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.2247F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailbase_r10 = Tailbase.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, 0.1F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.2247F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(40, 31).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0591F, 8.8013F, 0.058F, -0.2614F, -0.015F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(94, 96).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(87, 96).addBox(0.0F, -1.975F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(32, 92).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(21, 33).mirror().addBox(-1.2F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, 1.0F, -0.0013F, 0.0522F, -0.0017F));

		PartDefinition Tailmiddlebase_r5 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(21, 33).addBox(-0.8F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.1F, 1.0F, -0.0013F, -0.0522F, 0.0017F));

		PartDefinition Tailbase_r11 = Tailmiddlebase.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(29, 92).addBox(0.0F, 2.5437F, 3.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 92).addBox(0.0F, 1.3437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2124F, -0.5236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(53, 40).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F))
				.texOffs(81, 96).addBox(0.0F, -2.0024F, 2.0764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(84, 96).addBox(0.0F, -2.0024F, 4.0764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.075F, 6.9004F, 0.0178F, -0.3054F, -0.0054F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(96, 77).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(56, 53).mirror().addBox(-0.975F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1976F, 0.0764F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(56, 53).addBox(-0.025F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1976F, 0.0764F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tailbase_r12 = Tailmiddle.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(13, 97).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 97).addBox(0.0F, 4.5437F, 5.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 47).addBox(0.0F, 5.5437F, 7.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1124F, -7.4236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.0934F, -0.2607F, -0.0241F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(69, 96).addBox(0.0F, -1.45F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(66, 96).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 5.0255F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(63, 96).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 3.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(96, 54).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 1.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tailmiddleend.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(64, 80).addBox(0.0F, 9.7437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 95).addBox(0.0F, 7.6437F, 11.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 43).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4235F, -10.4427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0801F, 7.9632F, -0.0748F, 0.6531F, -0.0455F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(58, 97).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 7.0424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(97, 44).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 5.0424F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tailend.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(38, 96).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 3.0424F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tailend.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(91, 95).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 1.0424F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tailend.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(30, 97).addBox(0.0F, 12.7437F, 19.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 97).addBox(0.0F, 11.8437F, 17.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 97).addBox(0.0F, 10.9437F, 15.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 86).addBox(0.0F, 9.8437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -16.402F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9384F, 3.8946F, -3.3948F, 1.2527F, 0.5928F, -0.2752F));

		PartDefinition cube_r271 = hindlegL.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(49, 71).addBox(5.0F, -4.125F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r272 = hindlegL.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(92, 44).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(91, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 5.3132F, 0.0673F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r273 = hindlegL.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(5, 86).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 5.3132F, 0.0673F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r274 = hindlegL.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(86, 3).addBox(5.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 3.6763F, 0.8164F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r275 = hindlegL.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(21, 75).addBox(5.0F, 0.0F, -1.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(59, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 3).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(93, 0).addBox(-0.5F, 2.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1672F, 7.208F, 0.373F, 0.0378F, -0.0218F, 0.3487F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(17, 41).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9384F, 3.8946F, -3.3948F, 1.3084F, -0.0058F, 0.0949F));

		PartDefinition cube_r276 = hindlegL3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(49, 71).mirror().addBox(-6.0F, -4.125F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r277 = hindlegL3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(92, 44).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 25).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.3132F, 0.0673F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r278 = hindlegL3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(5, 86).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.3132F, 0.0673F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r279 = hindlegL3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-6.0F, -0.125F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5F, 3.6763F, 0.8164F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r280 = hindlegL3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(21, 75).mirror().addBox(-6.0F, 0.0F, -1.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(59, 80).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(81, 3).mirror().addBox(-0.5F, -0.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(93, 0).mirror().addBox(-0.5F, 2.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1672F, 7.208F, 0.373F, 0.0436F, 0.0019F, 0.1309F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(17, 41).mirror().addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(68, 93).addBox(-0.5F, 0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.4079F, 1.1058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(46, 95).addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(63, 93).addBox(2.0F, 0.7866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(77, 10).addBox(2.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(77, 14).addBox(0.8F, -0.3134F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, 0.2054F, 0.9746F, 0.4211F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(54, 80).addBox(-1.0F, -0.5136F, -1.1967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, 1.1562F, -0.1719F, 0.9626F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(10, 86).addBox(-1.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, -1.0254F, -0.1719F, 0.9626F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(68, 10).addBox(-1.0F, 0.6702F, -0.9446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, -0.1964F, -0.1719F, 0.9626F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(61, 76).addBox(2.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(54, 76).addBox(2.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(13, 59).addBox(-0.5F, -0.05F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.0668F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(93, 6).addBox(2.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r292 = bone6.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-0.5F, 0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4079F, 1.1058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r293 = bone6.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(46, 95).mirror().addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r294 = bone6.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(63, 93).mirror().addBox(-3.0F, 0.7866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 10).mirror().addBox(-3.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r295 = bone6.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-1.8F, -0.3134F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, 0.2054F, -0.9746F, -0.4211F));

		PartDefinition cube_r296 = bone6.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(0.0F, -0.5136F, -1.1967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, 1.1562F, 0.1719F, -0.9626F));

		PartDefinition cube_r297 = bone6.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(10, 86).mirror().addBox(0.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, -1.0254F, 0.1719F, -0.9626F));

		PartDefinition cube_r298 = bone6.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(0.0F, 0.6702F, -0.9446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, -0.1964F, 0.1719F, -0.9626F));

		PartDefinition cube_r299 = bone6.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(61, 76).mirror().addBox(-3.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r300 = bone6.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(54, 76).mirror().addBox(-3.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r301 = bone6.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(13, 59).mirror().addBox(-0.5F, -0.05F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0668F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r302 = bone6.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-3.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

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