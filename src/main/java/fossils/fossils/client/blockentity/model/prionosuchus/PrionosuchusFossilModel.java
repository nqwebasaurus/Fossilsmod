package fossils.fossils.client.blockentity.model.prionosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PrionosuchusFossilModel extends SkullModelBase {
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
	private final ModelPart bone6;
	private final ModelPart bone2;
	private final ModelPart bone7;
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
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone5;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone8;

	public PrionosuchusFossilModel(ModelPart root) {
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
		this.bone6 = this.forelegL4.getChild("bone6");
		this.bone2 = this.chest.getChild("bone2");
		this.bone7 = this.chest.getChild("bone7");
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
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone5 = this.hindlegL4.getChild("bone5");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone8 = this.Hips.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(63, 0).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(89, 90).addBox(0.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 90).mirror().addBox(-2.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.6682F, 15.6011F, -0.7364F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(50, 96).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7028F, -1.4109F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(47, 96).addBox(0.0F, -2.4F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6528F, -3.5109F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Hips.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(7, 76).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7167F, -0.1695F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0519F, 0.083F, 0.0914F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(53, 98).addBox(0.0F, -2.7F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(102, 24).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -1.6602F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(101, 100).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -3.6602F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(101, 79).mirror().addBox(-2.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0106F, -3.6602F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(102, 24).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -1.6602F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(101, 79).addBox(1.8126F, -0.8452F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -3.6602F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(101, 100).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -3.6602F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(72, 97).addBox(0.0F, -2.65F, -0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(59, 62).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0948F, 0.079F, 0.0948F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(17, 96).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(101, 53).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -1.5604F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -1.5604F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(69, 74).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.2459F, 0.5651F, -1.1326F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 101).mirror().addBox(-3.2441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 1.8284F, 1.3566F, 0.5681F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(33, 101).mirror().addBox(0.2722F, -2.8298F, -5.9443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 2.8669F, 0.7111F, 1.6935F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 12).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.5208F, 0.3352F, -0.5208F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0016F, -3.5604F, 0.6037F, 0.0998F, -0.1434F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 14).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -1.5604F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(101, 53).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -1.5604F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(28, 101).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.6037F, -0.0998F, 0.1434F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 12).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.5208F, -0.3352F, 0.5208F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(33, 101).addBox(-1.2722F, -2.8298F, -5.9443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 2.8669F, -0.7111F, -1.6935F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 101).addBox(2.2441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 1.8284F, -1.3566F, -0.5681F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(69, 74).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -3.5604F, 0.2459F, -0.5651F, 1.1326F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(14, 96).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(59, 8).addBox(-0.4F, -0.4874F, -4.7045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(11, 96).addBox(0.1F, -3.3874F, -1.7045F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1F, -4.2F, -0.0933F, 0.1309F, -0.0008F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 51).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.9223F, 0.9564F, -0.5347F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-0.2278F, -2.8298F, -5.9443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 2.5886F, 0.5061F, 1.4931F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 101).mirror().addBox(-3.5441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 1.9508F, 1.0533F, 0.6439F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.6075F, 0.6353F, -0.9665F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-4.4684F, -2.8139F, 0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.5601F, 0.526F, -1.0527F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-3.8538F, -0.8339F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8512F, 0.325F, -0.3733F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8231F, 0.2373F, -0.4745F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(15, 101).mirror().addBox(-2.1517F, 0.009F, -0.534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8415F, -0.0302F, -0.1165F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.2604F, 0.8454F, -0.0883F, -0.1818F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(93, 61).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7406F, -0.0823F, -0.1967F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 49).mirror().addBox(-3.8538F, -0.8339F, -0.4714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7425F, 0.3088F, -0.431F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(35, 93).mirror().addBox(-2.1433F, 0.0061F, -0.5625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7385F, 0.0468F, -0.0792F));

		PartDefinition cube_r33 = Bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(90, 2).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7192F, 0.2112F, -0.5214F));

		PartDefinition cube_r34 = Bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(93, 30).mirror().addBox(-4.4684F, -2.8139F, 0.3666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.4808F, 0.4483F, -1.1137F));

		PartDefinition cube_r35 = Bodyfront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.5155F, 0.5634F, -1.0422F));

		PartDefinition cube_r36 = Bodyfront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(5, 101).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 1.7942F, 1.1292F, 0.481F));

		PartDefinition cube_r37 = Bodyfront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(90, 47).mirror().addBox(-0.2278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 2.6084F, 0.6093F, 1.4798F));

		PartDefinition cube_r38 = Bodyfront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0984F, -3.2604F, 0.7572F, 0.9188F, -0.6917F));

		PartDefinition cube_r39 = Bodyfront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(10, 101).addBox(1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8454F, 0.0883F, 0.1818F));

		PartDefinition cube_r40 = Bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(15, 101).addBox(1.1517F, 0.009F, -0.534F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8415F, 0.0302F, 0.1165F));

		PartDefinition cube_r41 = Bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(89, 55).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8231F, -0.2373F, 0.4745F));

		PartDefinition cube_r42 = Bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(90, 20).addBox(1.8538F, -0.8339F, -0.5714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.8512F, -0.325F, 0.3733F));

		PartDefinition cube_r43 = Bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(90, 22).addBox(2.4684F, -2.8139F, 0.2666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.5601F, -0.526F, 1.0527F));

		PartDefinition cube_r44 = Bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 29).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.6075F, -0.6353F, 0.9665F));

		PartDefinition cube_r45 = Bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(23, 101).addBox(2.5441F, -2.8308F, -4.8261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 1.9508F, -1.0533F, -0.6439F));

		PartDefinition cube_r46 = Bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 24).addBox(-1.7722F, -2.8298F, -5.9443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 2.5886F, -0.5061F, -1.4931F));

		PartDefinition cube_r47 = Bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 51).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.2604F, 0.9223F, -0.9564F, 0.5347F));

		PartDefinition cube_r48 = Bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 61).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7406F, 0.0823F, 0.1967F));

		PartDefinition cube_r49 = Bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 49).addBox(1.8538F, -0.8339F, -0.4714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7425F, -0.3088F, 0.431F));

		PartDefinition cube_r50 = Bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(35, 93).addBox(0.1433F, 0.0061F, -0.5625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7385F, -0.0468F, 0.0792F));

		PartDefinition cube_r51 = Bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 2).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7192F, -0.2112F, 0.5214F));

		PartDefinition cube_r52 = Bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(93, 30).addBox(2.4684F, -2.8139F, 0.3666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.4808F, -0.4483F, 1.1137F));

		PartDefinition cube_r53 = Bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(73, 59).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.5155F, -0.5634F, 1.0422F));

		PartDefinition cube_r54 = Bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 101).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 1.7942F, -1.1292F, -0.481F));

		PartDefinition cube_r55 = Bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(90, 47).addBox(-1.7722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 2.6084F, -0.6093F, -1.4798F));

		PartDefinition cube_r56 = Bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 16).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.0984F, -3.2604F, 0.7572F, -0.9188F, 0.6917F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(8, 96).addBox(0.0F, -3.25F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -3.7045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(59, 29).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(95, 94).addBox(0.0F, -3.2F, -4.975F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -4.7048F, -0.0523F, 0.0436F, 0.0015F));

		PartDefinition Bodyfront_r2 = body2.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(97, 20).addBox(0.0F, -3.3F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(5, 96).addBox(0.0F, -3.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-7.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5486F, 0.8449F, -0.9363F));

		PartDefinition cube_r58 = body2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-0.6278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 2.6446F, 0.7582F, 1.4195F));

		PartDefinition cube_r59 = body2.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(100, 64).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 1.4701F, 1.2154F, 0.0984F));

		PartDefinition cube_r60 = body2.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.3954F, 0.4539F, -1.184F));

		PartDefinition cube_r61 = body2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(93, 28).mirror().addBox(-4.4684F, -2.8139F, 0.5666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.375F, 0.3326F, -1.2372F));

		PartDefinition cube_r62 = body2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(89, 53).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5705F, 0.1708F, -0.6329F));

		PartDefinition cube_r63 = body2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.587F, 0.2804F, -0.5595F));

		PartDefinition cube_r64 = body2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5892F, 0.0743F, -0.1714F));

		PartDefinition cube_r65 = body2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(85, 92).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.589F, -0.071F, -0.2683F));

		PartDefinition cube_r66 = body2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(91, 77).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5132F, -0.0698F, -0.2562F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 10).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4988F, 0.1443F, -0.6374F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(91, 37).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5117F, 0.2589F, -0.5728F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(73, 91).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.5138F, 0.0823F, -0.1705F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(93, 65).mirror().addBox(-4.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.3671F, 0.5167F, -1.1474F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.3447F, 0.394F, -1.1981F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(101, 102).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 1.2547F, 1.2363F, -0.0976F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(-0.8278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 2.6591F, 0.8332F, 1.4366F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(32, 80).mirror().addBox(-8.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4628F, 0.7969F, -0.9923F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(69, 76).mirror().addBox(-9.8502F, -2.8387F, -3.2797F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.4983F, 0.8264F, -0.9757F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-0.8278F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 2.6609F, 0.795F, 1.4289F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.3639F, 0.428F, -1.1995F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(70, 102).mirror().addBox(-4.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 1.3706F, 1.2341F, 0.0028F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(93, 63).mirror().addBox(-4.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.3895F, 0.5497F, -1.145F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-3.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5471F, 0.2761F, -0.5725F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 8).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5321F, 0.1637F, -0.6413F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(66, 91).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.552F, 0.0849F, -0.1764F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(91, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5511F, -0.0638F, -0.2678F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(85, 92).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.589F, 0.071F, 0.2683F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 92).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5892F, -0.0743F, 0.1714F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(90, 18).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.587F, -0.2804F, 0.5595F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(89, 53).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5705F, -0.1708F, 0.6329F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(93, 28).addBox(2.4684F, -2.8139F, 0.5666F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.375F, -0.3326F, 1.2372F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 53).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.3954F, -0.4539F, 1.184F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(100, 64).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 1.4701F, -1.2154F, -0.0984F));

		PartDefinition cube_r91 = body2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(91, 57).addBox(-1.3722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 2.6446F, -0.7582F, -1.4195F));

		PartDefinition cube_r92 = body2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(90, 42).addBox(5.8502F, -2.8387F, -3.2797F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5486F, -0.8449F, 0.9363F));

		PartDefinition cube_r93 = body2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(32, 80).addBox(5.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4628F, -0.7969F, 0.9923F));

		PartDefinition cube_r94 = body2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(90, 40).addBox(-1.1722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 2.6591F, -0.8332F, -1.4366F));

		PartDefinition cube_r95 = body2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(101, 102).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 1.2547F, -1.2363F, 0.0976F));

		PartDefinition cube_r96 = body2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(58, 74).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3447F, -0.394F, 1.1981F));

		PartDefinition cube_r97 = body2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(93, 65).addBox(2.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3671F, -0.5167F, 1.1474F));

		PartDefinition cube_r98 = body2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(73, 91).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5138F, -0.0823F, 0.1705F));

		PartDefinition cube_r99 = body2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(91, 37).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5117F, -0.2589F, 0.5728F));

		PartDefinition cube_r100 = body2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(90, 10).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4988F, -0.1443F, 0.6374F));

		PartDefinition cube_r101 = body2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(91, 77).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.5132F, 0.0698F, 0.2562F));

		PartDefinition cube_r102 = body2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(91, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5511F, 0.0638F, 0.2678F));

		PartDefinition cube_r103 = body2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 91).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.552F, -0.0849F, 0.1764F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(90, 8).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5321F, -0.1637F, 0.6413F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(91, 35).addBox(1.8538F, -0.8339F, -0.2714F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5471F, -0.2761F, 0.5725F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(93, 63).addBox(2.7328F, -2.8139F, -0.163F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.3895F, -0.5497F, 1.145F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(70, 102).addBox(3.0441F, -2.8308F, -5.5261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 1.3706F, -1.2341F, -0.0028F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(74, 27).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.3639F, -0.428F, 1.1995F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 26).addBox(-1.1722F, -2.8298F, -7.0443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 2.6609F, -0.795F, -1.4289F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(69, 76).addBox(5.8502F, -2.8387F, -3.2797F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.4983F, -0.8264F, 0.9757F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(13, 53).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(79, 95).addBox(0.0F, -2.8F, -6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, -0.0571F, 0.0839F, 0.0498F));

		PartDefinition Bodyfront_r3 = chest.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(36, 86).addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = chest.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(82, 95).addBox(0.0F, -3.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(102, 47).mirror().addBox(-1.9909F, -0.0515F, -0.5853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6599F, 0.0207F, -0.3301F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(89, 88).mirror().addBox(-3.7827F, -0.888F, -0.5853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(89, 86).mirror().addBox(-3.7827F, -0.8767F, -0.0853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6055F, 0.2815F, -0.6851F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(48, 8).mirror().addBox(-6.6394F, -2.8514F, -0.5853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.3607F, 0.5657F, -1.261F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(66, 42).mirror().addBox(-4.4638F, -2.8326F, 0.3164F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.3321F, 0.4179F, -1.3215F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(-2.1195F, -0.0453F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 0.6696F, 0.1582F, -0.2221F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-3.5459F, -2.8496F, -5.2265F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.1209F, -5.3806F, 1.7993F, 1.2599F, 0.3498F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(92, 75).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4682F, 0.0265F, -0.2432F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(88, 71).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 69).mirror().addBox(-3.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4193F, 0.2164F, -0.6396F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(51, 44).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 0).mirror().addBox(-4.6882F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2308F, 0.4119F, -1.2308F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(63, 6).mirror().addBox(-8.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.3168F, 0.8328F, -1.0867F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(92, 73).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4765F, 0.182F, -0.1634F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(100, 33).mirror().addBox(-3.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 1.1282F, 1.3367F, -0.2072F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 101).mirror().addBox(0.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 2.8144F, 0.8603F, 1.5652F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(100, 70).mirror().addBox(0.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 2.7344F, 0.8663F, 1.5492F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(99, 45).mirror().addBox(-3.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 1.1388F, 1.2845F, -0.152F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 92).mirror().addBox(-2.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4772F, 0.1297F, -0.1184F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(88, 33).mirror().addBox(-3.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 45).mirror().addBox(-3.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4443F, 0.1701F, -0.5899F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(90, 6).mirror().addBox(-4.6882F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 51).mirror().addBox(-6.6882F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.2806F, 0.3868F, -1.1666F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(58, 76).mirror().addBox(-9.8502F, -2.8387F, -3.2797F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.3774F, 0.8009F, -0.9976F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(91, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4731F, -0.0256F, -0.1983F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 103).addBox(2.5459F, -2.8496F, -5.2265F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 1.7993F, -1.2599F, -0.3498F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(102, 26).addBox(1.1195F, -0.0453F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6696F, -0.1582F, 0.2221F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(89, 86).addBox(1.7826F, -0.8767F, -0.0853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 88).addBox(1.7826F, -0.888F, -0.5853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6055F, -0.2815F, 0.6851F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(66, 42).addBox(2.4638F, -2.8326F, 0.3164F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.3321F, -0.4179F, 1.3215F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(48, 8).addBox(2.6394F, -2.8514F, -0.5853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.3607F, -0.5657F, 1.261F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(102, 47).addBox(0.9909F, -0.0515F, -0.5853F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, -0.1209F, -5.3806F, 0.6599F, -0.0207F, 0.3301F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(0, 101).addBox(-1.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 2.8144F, -0.8603F, -1.5652F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(100, 33).addBox(2.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 1.1282F, -1.3367F, 0.2072F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(92, 73).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4765F, -0.182F, 0.1634F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(88, 69).addBox(1.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 71).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4193F, -0.2164F, 0.6396F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(90, 0).addBox(2.6881F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 44).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2308F, -0.4119F, 1.2308F));

		PartDefinition cube_r142 = chest.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(63, 6).addBox(5.8502F, -2.8387F, -3.2797F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.3168F, -0.8328F, 1.0867F));

		PartDefinition cube_r143 = chest.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(92, 75).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4682F, -0.0265F, 0.2432F));

		PartDefinition cube_r144 = chest.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(59, 92).addBox(0.1433F, 0.0061F, -0.3625F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4772F, -0.1297F, 0.1184F));

		PartDefinition cube_r145 = chest.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(91, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4731F, 0.0256F, 0.1983F));

		PartDefinition cube_r146 = chest.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(88, 33).addBox(1.8126F, -0.8339F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(87, 45).addBox(1.8126F, -0.8452F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4443F, -0.1701F, 0.5899F));

		PartDefinition cube_r147 = chest.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(58, 76).addBox(5.8502F, -2.8387F, -3.2797F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.3774F, -0.8009F, 0.9976F));

		PartDefinition cube_r148 = chest.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(90, 6).addBox(2.6881F, -2.8139F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 51).addBox(2.6881F, -2.8327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.2806F, -0.3868F, 1.1666F));

		PartDefinition cube_r149 = chest.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(100, 70).addBox(-1.1722F, -2.8298F, -6.6443F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 2.7344F, -0.8663F, -1.5492F));

		PartDefinition cube_r150 = chest.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(99, 45).addBox(2.7441F, -2.8308F, -5.4261F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 1.1388F, -1.2845F, 0.152F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(27, 78).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.7503F, 3.6469F, -5.0538F, 0.9063F, -0.1048F, -0.2995F));

		PartDefinition cube_r151 = forelegL.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(44, 85).addBox(-0.5F, -3.075F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r152 = forelegL.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 88).addBox(-0.5F, 1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(88, 61).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r153 = forelegL.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(87, 73).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0543F, 5.2384F, -0.1672F, -0.3206F, 0.1198F, -0.0577F));

		PartDefinition cube_r154 = forelegL2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(20, 94).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r155 = forelegL2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(94, 44).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 94).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r156 = forelegL2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(86, 36).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r157 = forelegL2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(14, 79).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(32, 42).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3235F, 3.2362F, -0.249F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(38, 36).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(42, 78).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.7503F, 3.6469F, -5.0538F, 0.894F, -0.2044F, 0.5429F));

		PartDefinition cube_r159 = forelegL3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(85, 48).addBox(-0.5F, -3.075F, -0.975F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r160 = forelegL3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(88, 29).addBox(-0.5F, 1.45F, -0.85F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(88, 65).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r161 = forelegL3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0543F, 5.2384F, -0.1672F, -0.3376F, 0.053F, 0.5529F));

		PartDefinition cube_r162 = forelegL4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(90, 94).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r163 = forelegL4.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(85, 94).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(59, 94).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r164 = forelegL4.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(54, 87).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r165 = forelegL4.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(85, 40).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(85, 24).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone6 = forelegL4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.3235F, 3.2362F, -0.249F));

		PartDefinition cube_r166 = bone6.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(19, 42).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -0.1798F, -4.8989F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 74).addBox(-0.4101F, 2.5534F, 4.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.625F, 2.7848F, -2.3803F, 1.2515F, -0.0704F, -0.3066F));

		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(84, 57).addBox(-0.4101F, -1.9397F, 4.6403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(2.625F, 2.7848F, -2.3803F, 0.597F, -0.0704F, -0.3066F));

		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(95, 70).addBox(-0.4101F, -3.2596F, 5.9562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.7848F, -2.8053F, 0.6494F, -0.0704F, -0.3066F));

		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(22, 72).addBox(-0.4101F, 2.5949F, 1.3968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 3.7848F, -2.8053F, 1.2602F, -0.0704F, -0.3066F));

		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(91, 79).addBox(2.0F, -0.0256F, -0.0263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 6.4529F, 0.9549F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -1.1238F, -0.6562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 5.6173F, 0.2395F, 1.3075F, 0.1585F, 0.1029F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(73, 53).addBox(1.4156F, -1.6043F, 0.0618F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 6.5711F, 0.6588F, 1.9098F, -0.7561F, -0.2374F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(77, 36).addBox(1.5F, -0.1902F, 0.0618F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 6.5711F, 0.6588F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 7.2139F, -3.4882F, 1.6232F, 0.0F, 0.0F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(32, 82).addBox(-0.7401F, -4.6928F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 6.3226F, -3.6135F, 1.6999F, 0.9544F, 0.123F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 17).addBox(-3.0F, -3.0F, -0.9F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5F, 6.3226F, -3.6135F, 1.6567F, 0.5204F, 0.0603F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(28, 55).addBox(-3.5F, -0.5F, -0.9F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 6.253F, -3.1184F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(81, 61).addBox(-1.0F, 0.1052F, -1.8654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(81, 69).addBox(-1.0F, 1.1052F, -1.8654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.7F, 4.5495F, -1.0737F, 0.1285F, 0.1931F, 0.1721F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0362F, 1.2753F, -2.1479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.4F, 4.5495F, -2.7737F, 0.2073F, 0.4068F, 0.2868F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(81, 29).addBox(-0.5F, -0.135F, -1.0172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4F, 5.6173F, 0.2395F, 0.1294F, 0.1585F, 0.1029F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(70, 78).addBox(-1.0362F, -0.4383F, -3.8907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4F, 4.5495F, -2.7737F, 0.8618F, 0.4068F, 0.2868F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(58, 78).addBox(-1.0362F, -0.7709F, -1.9644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.4F, 4.5495F, -2.7737F, 1.0363F, 0.4068F, 0.2868F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(72, 29).addBox(-1.4939F, -0.2955F, -0.7099F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 3.7848F, -2.8053F, 1.0187F, 0.1742F, 0.1913F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(25, 95).addBox(2.0F, -0.0256F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 5.5205F, 3.1058F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(0, 95).addBox(2.0F, -1.0256F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 4.5279F, 3.2276F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(96, 53).addBox(2.0F, -1.0256F, -1.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(78, 48).addBox(2.0F, -2.0256F, -1.5263F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.3845F, 1.7102F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(85, 97).addBox(-1.0F, -0.4149F, -0.5481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 3.0848F, 0.9947F, 1.9104F, -0.1016F, -0.298F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 55).addBox(-0.4101F, -0.0321F, 1.8013F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 3.7848F, -2.8053F, 1.1381F, -0.0704F, -0.3066F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -0.1798F, -4.8989F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r190 = bone7.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-0.5899F, 2.5534F, 4.9609F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.625F, 2.7848F, -2.3803F, 1.2515F, 0.0704F, 0.3066F));

		PartDefinition cube_r191 = bone7.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(84, 57).mirror().addBox(-0.5899F, -1.9397F, 4.6403F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-2.625F, 2.7848F, -2.3803F, 0.597F, 0.0704F, 0.3066F));

		PartDefinition cube_r192 = bone7.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(95, 70).mirror().addBox(-0.5899F, -3.2596F, 5.9562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7848F, -2.8053F, 0.6494F, 0.0704F, 0.3066F));

		PartDefinition cube_r193 = bone7.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(22, 72).mirror().addBox(-0.5899F, 2.5949F, 1.3968F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7848F, -2.8053F, 1.2602F, 0.0704F, 0.3066F));

		PartDefinition cube_r194 = bone7.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(91, 79).mirror().addBox(-3.0F, -0.0256F, -0.0263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4529F, 0.9549F, 1.9286F, 0.0F, 0.0F));

		PartDefinition cube_r195 = bone7.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(-0.5F, -1.1238F, -0.6562F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.6173F, 0.2395F, 1.3075F, -0.1585F, -0.1029F));

		PartDefinition cube_r196 = bone7.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(73, 53).mirror().addBox(-4.4156F, -1.6043F, 0.0618F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(81, 65).mirror().addBox(-4.3906F, 2.4207F, 0.0618F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.5711F, 0.6588F, 1.9098F, 0.7561F, 0.2374F));

		PartDefinition cube_r197 = bone7.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-4.5F, -0.1902F, 0.0618F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(33, 73).mirror().addBox(-1.5F, -0.1902F, 0.0618F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.5711F, 0.6588F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r198 = bone7.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(-4.5F, 0.0F, 0.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 6.9355F, -1.5077F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r199 = bone7.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(32, 82).mirror().addBox(-1.2599F, -4.6928F, -0.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.3226F, -3.6135F, 1.6999F, -0.9544F, -0.123F));

		PartDefinition cube_r200 = bone7.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(74, 17).mirror().addBox(0.0F, -3.0F, -0.9F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.3226F, -3.6135F, 1.6567F, -0.5204F, -0.0603F));

		PartDefinition cube_r201 = bone7.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(81, 61).mirror().addBox(0.0F, 0.1052F, -1.8654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(81, 69).mirror().addBox(0.0F, 1.1052F, -1.8654F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 4.5495F, -1.0737F, 0.1285F, -0.1931F, -0.1721F));

		PartDefinition cube_r202 = bone7.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0362F, 1.2753F, -2.1479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.5495F, -2.7737F, 0.2073F, -0.4068F, -0.2868F));

		PartDefinition cube_r203 = bone7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-0.5F, -0.135F, -1.0172F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 5.6173F, 0.2395F, 0.1294F, -0.1585F, -0.1029F));

		PartDefinition cube_r204 = bone7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(0.0362F, -0.4383F, -3.8907F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.5495F, -2.7737F, 0.8618F, -0.4068F, -0.2868F));

		PartDefinition cube_r205 = bone7.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(58, 78).mirror().addBox(0.0362F, -0.7709F, -1.9644F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.5495F, -2.7737F, 1.0363F, -0.4068F, -0.2868F));

		PartDefinition cube_r206 = bone7.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(72, 29).mirror().addBox(0.4939F, -0.2955F, -0.7099F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7848F, -2.8053F, 1.0187F, -0.1742F, -0.1913F));

		PartDefinition cube_r207 = bone7.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(25, 95).mirror().addBox(-3.0F, -0.0256F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5205F, 3.1058F, -2.6093F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone7.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-3.0F, -1.0256F, -0.0263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5279F, 3.2276F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r209 = bone7.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(96, 53).mirror().addBox(-3.0F, -1.0256F, -1.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(78, 48).mirror().addBox(-3.0F, -2.0256F, -1.5263F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.3845F, 1.7102F, 2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r210 = bone7.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(85, 97).mirror().addBox(0.0F, -0.4149F, -0.5481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.0848F, 0.9947F, 1.9104F, 0.1016F, 0.298F));

		PartDefinition cube_r211 = bone7.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.5899F, -0.0321F, 1.8013F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.7848F, -2.8053F, 1.1381F, 0.0704F, 0.3066F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(26, 66).addBox(-0.5F, -0.7596F, -3.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 66).addBox(-0.5F, -0.7596F, -5.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, -0.1196F, 0.0866F, -0.0104F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(20, 97).addBox(0.0F, -2.1743F, -0.0076F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -3.9227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(76, 93).addBox(0.0F, -2.275F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(35, 91).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -3.1797F, 0.5976F, 0.4183F, -0.4951F));

		PartDefinition cube_r213 = Neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(90, 4).mirror().addBox(-1.8934F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -1.1797F, 0.5976F, 0.4183F, -0.7569F));

		PartDefinition cube_r214 = Neck.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(59, 90).mirror().addBox(-3.558F, -1.076F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0633F, -1.1797F, 0.2576F, 0.6742F, -1.3902F));

		PartDefinition cube_r215 = Neck.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(35, 91).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -3.1797F, 0.5976F, -0.4183F, 0.4951F));

		PartDefinition cube_r216 = Neck.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(59, 90).addBox(1.558F, -1.076F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.2576F, -0.6742F, 1.3902F));

		PartDefinition cube_r217 = Neck.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(90, 4).addBox(-0.1066F, -0.0208F, -0.6084F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.5976F, -0.4183F, 0.7569F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -1.9076F, -3.8117F, -0.3981F, 0.1611F, -0.0674F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(7, 83).addBox(-0.49F, -0.075F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.9728F, -24.1986F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(97, 47).addBox(-0.49F, -0.85F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(0.0F, 1.6436F, -23.7979F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(59, 68).addBox(-0.49F, -0.5F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.9825F, -16.4914F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.49F, -0.4F, -7.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.5F, -17.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(19, 32).addBox(-0.49F, -0.075F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 0.2F, -9.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(66, 36).addBox(-0.99F, -0.9F, -2.9F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(42, 73).addBox(-1.49F, -0.05F, -0.625F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 0.2F, -9.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(78, 45).addBox(-2.3124F, 0.05F, 2.7863F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F))
				.texOffs(67, 97).addBox(-1.3224F, -0.375F, 0.3863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(45, 55).addBox(-2.8124F, 0.05F, -0.0137F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8224F, -0.75F, -3.9863F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.925F, 0.5F, -14.0F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(30, 91).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.85F, 1.4289F, -10.4426F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(25, 91).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.6F, 1.5559F, -10.0632F, -0.3255F, 0.1241F, -0.0417F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(83, 20).addBox(-0.5F, -0.5737F, -0.493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.775F, 1.1991F, -9.8836F, -0.1484F, 0.0F, 1.5708F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(97, 50).addBox(-0.5F, -0.7062F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.775F, 1.1991F, -9.8836F, 0.4102F, 0.0F, 1.5708F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(62, 97).addBox(-0.525F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.525F, 1.0825F, -2.4984F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(0, 91).addBox(-0.4F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, 1.4617F, -9.5991F, -0.1927F, -0.0857F, 0.0167F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(44, 90).addBox(-0.4F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8F, 1.5406F, -9.2928F, 0.0697F, 0.003F, -0.0435F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(61, 15).addBox(-0.4F, -0.5F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.925F, 1.4668F, -3.3913F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(83, 16).addBox(-0.375F, -0.05F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.563F, -0.2829F, 5.6668F, 0.2764F, 0.2325F, 0.5935F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(74, 22).addBox(0.0F, -0.05F, -0.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, -0.3F, 5.0F, 0.2753F, -0.1121F, 0.3772F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(51, 36).addBox(-0.9F, -0.075F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.4043F, 0.5624F, -0.8154F, 0.1494F, 0.121F, 0.0166F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(48, 0).addBox(-0.2F, -0.8F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2578F, 1.7341F, 3.7444F, 0.0181F, 0.3665F, 0.0004F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(0, 70).addBox(-0.9954F, 0.9963F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0168F, 0.2792F, -0.0032F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(7, 79).addBox(-0.1181F, -1.0084F, -1.9693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4105F, -0.2247F, 8.3764F, 0.3606F, 0.3012F, -0.5366F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(95, 32).addBox(-0.0845F, -0.8528F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4105F, -0.2247F, 8.3764F, 0.5335F, 0.3179F, -0.5419F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(30, 95).addBox(-0.0845F, -0.6187F, -0.5898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 12).addBox(-0.1095F, -0.8187F, -0.5898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4105F, -0.2247F, 8.3764F, -0.2955F, 0.3179F, -0.5419F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(47, 47).addBox(-1.3877F, -0.3088F, 0.0912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0461F, 0.2141F, -1.002F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(32, 47).addBox(-1.3453F, -0.2638F, 0.1268F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, 0.2361F, -0.8458F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(54, 95).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.751F, -0.3499F, 7.6179F, -1.1747F, 0.2834F, -0.96F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(95, 67).addBox(-0.5F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0595F, -0.2817F, 8.0334F, -0.0839F, 0.2834F, -0.96F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(35, 95).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0595F, -0.2817F, 8.0334F, -0.4329F, 0.2834F, -0.96F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(83, 12).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3639F, -0.2986F, 8.9462F, -0.302F, 0.2834F, -0.96F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(62, 44).addBox(-1.0F, -2.05F, -3.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8643F, -1.0747F, 13.0482F, -0.3869F, -0.1293F, -1.748F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(70, 68).addBox(-1.0F, -0.05F, -3.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8337F, -1.034F, 13.0604F, -0.2927F, 0.256F, -0.753F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(61, 22).addBox(-1.0F, -1.05F, -4.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.596F, -0.427F, 12.8359F, -0.2327F, 0.2295F, -0.9521F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(99, 73).addBox(-1.0366F, -1.0704F, -0.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2134F, 0.3293F, 13.4044F, 0.822F, -0.2455F, -0.8917F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(11, 68).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.475F, 0.5F, 5.0F, -0.2425F, 0.2834F, -0.7242F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(83, 8).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9247F, 0.5F, 8.728F, -0.3043F, 0.2472F, -0.5824F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(13, 61).addBox(-0.7F, 0.15F, -4.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2536F, -0.4527F, 12.9459F, -0.1277F, 0.2895F, -0.541F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(99, 42).addBox(-0.9373F, -0.9704F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1918F, 0.7296F, 12.4938F, 0.4554F, 0.2574F, -0.6118F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(98, 97).addBox(-1.0418F, -0.9581F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1918F, 0.8218F, 11.7783F, 0.1045F, 0.2117F, -0.6232F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(99, 76).addBox(-0.9768F, -0.9407F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9004F, 0.7989F, 11.04F, -0.125F, 0.2061F, -0.6217F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(98, 94).addBox(-0.9665F, -1.0F, -0.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6484F, 0.7651F, 10.5055F, -0.3998F, 0.2879F, -0.6406F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(37, 67).addBox(-1.0F, 0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.475F, 0.0F, 5.0F, 0.0F, 0.3709F, 0.0F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(23, 98).addBox(-1.9721F, -1.0128F, -0.7599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.7668F, 1.075F, 14.1862F, -0.1625F, -0.6539F, 1.0253F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(40, 97).addBox(-1.0196F, -1.0128F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7668F, 1.075F, 14.1862F, -2.8195F, -1.1531F, -2.5118F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(81, 33).addBox(1.3228F, 0.05F, 2.2162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1026F, -1.25F, 10.0137F, -0.1609F, -0.518F, 0.0802F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(97, 39).addBox(-0.3366F, -0.9704F, 0.693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1918F, 1.6F, 12.9862F, 0.6644F, -0.6458F, -0.4405F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(38, 100).addBox(-0.9373F, -0.9704F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.1918F, 1.6F, 12.9862F, 0.5158F, -0.057F, -0.0323F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(98, 82).addBox(-1.0418F, -0.9581F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1918F, 1.8F, 11.9862F, 0.2107F, 0.1067F, 0.0228F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(98, 35).addBox(-1.2768F, -0.9407F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.1918F, 1.8F, 10.9862F, 0.018F, 0.2399F, 0.0043F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(70, 62).addBox(-2.0F, 0.0F, 0.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.075F, -1.0365F, 7.0572F, 0.0496F, 0.4366F, 0.0052F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(98, 56).addBox(-0.9665F, -0.9F, -0.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.564F, 1.6538F, 10.3911F, -0.143F, 0.4683F, 0.0298F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(83, 4).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9247F, 0.5F, 8.728F, -0.1222F, 0.3709F, 0.0F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(60, 55).addBox(-0.6F, -0.25F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.3F, 0.8F, 0.0F, 0.0262F, 0.1047F, 0.0F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(46, 21).addBox(-1.0F, 0.5F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.288F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.905F, 0.5F, -14.0F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(30, 91).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.85F, 1.4289F, -10.4426F, -0.4974F, 0.0F, 0.0F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(25, 91).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.6F, 1.5559F, -10.0632F, -0.3255F, -0.1241F, 0.0417F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(83, 20).mirror().addBox(-0.5F, -0.5737F, -0.493F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(0.775F, 1.1991F, -9.8836F, -0.1484F, 0.0F, -1.5708F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-0.5F, -0.7062F, -0.969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.775F, 1.1991F, -9.8836F, 0.4102F, 0.0F, -1.5708F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(-0.475F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.525F, 1.0825F, -2.4984F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.6F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.4617F, -9.5991F, -0.1927F, 0.0857F, -0.0167F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(44, 90).mirror().addBox(-0.6F, -1.1F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8F, 1.5406F, -9.2928F, 0.0697F, -0.003F, 0.0435F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(61, 15).mirror().addBox(-0.6F, -0.5F, -1.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.925F, 1.4668F, -3.3913F, -0.0175F, -0.0873F, 0.0015F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(83, 16).mirror().addBox(-0.625F, -0.05F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.563F, -0.2829F, 5.6668F, 0.2764F, -0.2325F, -0.5935F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(-1.0F, -0.05F, -0.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, -0.3F, 5.0F, 0.2753F, 0.1121F, -0.3772F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-0.1F, -0.075F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.4043F, 0.5624F, -0.8154F, 0.1494F, -0.121F, -0.0166F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-0.8F, -0.8F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2578F, 1.7341F, 3.7444F, 0.0181F, -0.3665F, -0.0004F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(-0.0046F, 0.9963F, -0.0684F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0168F, -0.2792F, 0.0032F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-0.8819F, -1.0084F, -1.9693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, -0.2247F, 8.3764F, 0.3606F, -0.3012F, 0.5366F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(95, 32).mirror().addBox(-0.9155F, -0.8528F, -0.9423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, -0.2247F, 8.3764F, 0.5335F, -0.3179F, 0.5419F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(30, 95).mirror().addBox(-0.9155F, -0.6187F, -0.5898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 12).mirror().addBox(-0.8905F, -0.8187F, -0.5898F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4105F, -0.2247F, 8.3764F, -0.2955F, -0.3179F, 0.5419F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(47, 47).mirror().addBox(0.3877F, -0.3088F, 0.0912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0461F, -0.2141F, 1.002F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(32, 47).mirror().addBox(0.3453F, -0.2638F, 0.1268F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1484F, -0.2361F, 0.8458F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(54, 95).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.751F, -0.3499F, 7.6179F, -1.1747F, -0.2834F, 0.96F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(-0.5F, -0.55F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0595F, -0.2817F, 8.0334F, -0.0839F, -0.2834F, 0.96F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(35, 95).mirror().addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0595F, -0.2817F, 8.0334F, -0.4329F, -0.2834F, 0.96F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(83, 12).mirror().addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3639F, -0.2986F, 8.9462F, -0.302F, -0.2834F, 0.96F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(0.0F, -2.05F, -3.925F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8643F, -1.0747F, 13.0482F, -0.3869F, 0.1293F, 1.748F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(70, 68).mirror().addBox(0.0F, -0.05F, -3.925F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8337F, -1.034F, 13.0604F, -0.2927F, -0.256F, 0.753F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(61, 22).mirror().addBox(0.0F, -1.05F, -4.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.596F, -0.427F, 12.8359F, -0.2327F, -0.2295F, 0.9521F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(99, 73).mirror().addBox(0.0366F, -1.0704F, -0.007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2134F, 0.3293F, 13.4044F, 0.822F, 0.2455F, 0.8917F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.475F, 0.5F, 5.0F, -0.2425F, -0.2834F, 0.7242F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9247F, 0.5F, 8.728F, -0.3043F, -0.2472F, 0.5824F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(13, 61).mirror().addBox(-0.3F, 0.15F, -4.925F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2536F, -0.4527F, 12.9459F, -0.1277F, -0.2895F, 0.541F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(99, 42).mirror().addBox(-0.0627F, -0.9704F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 0.7296F, 12.4938F, 0.4554F, -0.2574F, 0.6118F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(0.0418F, -0.9581F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 0.8218F, 11.7783F, 0.1045F, -0.2117F, 0.6232F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(99, 76).mirror().addBox(-0.0232F, -0.9407F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9004F, 0.7989F, 11.04F, -0.125F, -0.2061F, 0.6217F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-0.0335F, -1.0F, -0.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6484F, 0.7651F, 10.5055F, -0.3998F, -0.2879F, 0.6406F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.475F, 0.0F, 5.0F, 0.0F, -0.3709F, 0.0F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(23, 98).mirror().addBox(0.9721F, -1.0128F, -0.7599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7668F, 1.075F, 14.1862F, -0.1625F, 0.6539F, -1.0253F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(40, 97).mirror().addBox(0.0196F, -1.0128F, 0.0011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7668F, 1.075F, 14.1862F, -2.8195F, 1.1531F, 2.5118F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(81, 33).mirror().addBox(-3.3228F, 0.05F, 2.2162F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.1026F, -1.25F, 10.0137F, -0.1609F, 0.518F, -0.0802F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(97, 39).mirror().addBox(-0.6634F, -0.9704F, 0.693F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 1.6F, 12.9862F, 0.6644F, 0.6458F, 0.4405F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(38, 100).mirror().addBox(-0.0627F, -0.9704F, -0.0427F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 1.6F, 12.9862F, 0.5158F, 0.057F, 0.0323F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(98, 82).mirror().addBox(0.0418F, -0.9581F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 1.8F, 11.9862F, 0.2107F, -0.1067F, -0.0228F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(98, 35).mirror().addBox(0.2768F, -0.9407F, -0.0516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.1918F, 1.8F, 10.9862F, 0.018F, -0.2399F, -0.0043F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(0.0F, 0.0F, 0.2F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, -1.0365F, 7.0572F, 0.0496F, -0.4366F, -0.0052F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(98, 56).mirror().addBox(-0.0335F, -0.9F, -0.2842F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.564F, 1.6538F, 10.3911F, -0.143F, -0.4683F, -0.0298F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(83, 4).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9247F, 0.5F, 8.728F, -0.1222F, -0.3709F, 0.0F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(60, 55).mirror().addBox(-0.4F, -0.25F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.8F, 0.0F, 0.0262F, -0.1047F, 0.0F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(46, 21).mirror().addBox(0.0F, 0.5F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.288F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(100, 6).addBox(3.6F, -1.3F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(100, 6).mirror().addBox(-4.58F, -1.3F, 0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1376F, -0.9445F, 0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(100, 15).mirror().addBox(0.0168F, -0.087F, -0.4342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.805F, 1.7075F, -4.0685F, -1.501F, -0.3927F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(47, 78).mirror().addBox(0.0168F, 1.8522F, 0.1547F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-3.805F, 1.7075F, -4.0685F, -1.5097F, -0.3927F, 0.0F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(54, 91).mirror().addBox(-0.9207F, -0.1944F, -0.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.405F, 2.8075F, -10.0685F, -1.501F, -0.1571F, 0.0F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(21, 84).mirror().addBox(-0.9207F, -0.2779F, -0.8061F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1331F, 3.4239F, -11.785F, -1.4966F, -0.1571F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(99, 88).mirror().addBox(-0.5F, -0.0628F, -0.3224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.105F, 4.7362F, -22.3631F, -1.9535F, -0.2252F, 1.681F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(49, 92).mirror().addBox(-0.5F, -1.4694F, -0.4515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.105F, 4.7362F, -22.3631F, -1.4648F, -0.2252F, 1.681F));

		PartDefinition cube_r224 = jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 78).mirror().addBox(0.0168F, 0.0131F, -1.3124F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(49, 87).mirror().addBox(0.0168F, -0.0616F, -0.7859F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.805F, 1.7075F, -4.0685F, -1.3788F, -0.3927F, 0.0F));

		PartDefinition cube_r225 = jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 93).mirror().addBox(-0.0075F, -1.9926F, -1.3113F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(100, 12).mirror().addBox(-0.0075F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.78F, 1.7075F, -4.0685F, -1.3788F, -0.2356F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(39, 85).mirror().addBox(-0.9207F, -2.253F, -1.0789F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.405F, 2.8075F, -10.0685F, -1.3788F, -0.1571F, 0.0F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(84, 82).mirror().addBox(0.0F, 19.9503F, -9.978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 82).addBox(-0.02F, 19.9503F, -9.978F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.48F, 1.7075F, -0.7685F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(100, 3).mirror().addBox(-0.05F, 20.2406F, -2.1592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(100, 3).addBox(0.03F, 20.2406F, -2.1592F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(73, 42).addBox(-0.01F, 11.6406F, -1.9592F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(54, 61).addBox(-0.01F, 11.8406F, -1.6592F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.48F, 1.7075F, -0.7685F, -1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(14, 84).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.08F, 4.2738F, -22.0153F, -1.2926F, 0.024F, -0.0839F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(84, 78).mirror().addBox(-0.15F, 20.8667F, -6.3302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(84, 78).addBox(0.13F, 20.8667F, -6.3302F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.48F, 1.7075F, -0.7685F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.5F, -1.5F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.6057F, 2.8195F, -11.4905F, -1.4312F, -0.1571F, 0.0F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(26, 85).mirror().addBox(0.0168F, 2.9451F, -0.7612F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.805F, 1.7075F, -4.0685F, -1.3875F, -0.3927F, 0.0F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(79, 86).mirror().addBox(0.0168F, -0.0619F, 0.2957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.805F, 1.7075F, -4.0685F, -1.5795F, -0.3927F, 0.0F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(0.0F, 0.3738F, -0.3821F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.58F, 1.7075F, -0.7685F, -1.6668F, -0.2356F, 0.0F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(52, 83).mirror().addBox(0.0F, 0.0786F, -0.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 83).addBox(8.18F, 0.0786F, -0.7375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.58F, 1.7075F, -0.7685F, -1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-5.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(78, 40).addBox(3.18F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.42F, 1.5057F, 1.058F, -0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(77, 78).mirror().addBox(-5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(77, 78).addBox(3.18F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.42F, 0.6397F, 1.558F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(100, 18).mirror().addBox(-5.0F, 0.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(100, 9).mirror().addBox(-5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(100, 18).addBox(3.18F, 0.0F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F))
				.texOffs(100, 9).addBox(3.18F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.42F, -0.3F, 1.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-5.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(84, 86).addBox(3.18F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.42F, -1.3F, 0.9F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(0.0F, 0.0055F, -1.582F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.58F, 1.7075F, -0.7685F, -1.3177F, -0.2356F, 0.0F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(20, 78).addBox(-1.0F, 0.0055F, -1.582F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.6F, 1.7075F, -0.7685F, -1.3177F, 0.2356F, 0.0F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(100, 15).addBox(-1.0168F, -0.087F, -0.4342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.825F, 1.7075F, -4.0685F, -1.501F, 0.3927F, 0.0F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(47, 78).addBox(-1.0168F, 1.8522F, 0.1547F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.825F, 1.7075F, -4.0685F, -1.5097F, 0.3927F, 0.0F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(54, 91).addBox(-0.0793F, -0.1944F, -0.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.425F, 2.8075F, -10.0685F, -1.501F, 0.1571F, 0.0F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(21, 84).addBox(-0.0793F, -0.2779F, -0.8061F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1531F, 3.4239F, -11.785F, -1.4966F, 0.1571F, 0.0F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(99, 88).addBox(-0.5F, -0.0628F, -0.3224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.125F, 4.7362F, -22.3631F, -1.9535F, 0.2252F, -1.681F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(49, 92).addBox(-0.5F, -1.4694F, -0.4515F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.125F, 4.7362F, -22.3631F, -1.4648F, 0.2252F, -1.681F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(66, 93).addBox(-0.99F, 19.9835F, -4.4766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.5F, 1.7075F, -0.7685F, -1.2392F, 0.0F, 0.0F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(100, 0).addBox(-0.99F, 20.7686F, 6.1952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(0.5F, 1.7075F, -0.7685F, -1.7279F, 0.0F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(65, 78).addBox(-1.0168F, 0.0131F, -1.3124F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(49, 87).addBox(-1.0168F, -0.0616F, -0.7859F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.825F, 1.7075F, -4.0685F, -1.3788F, 0.3927F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 93).addBox(-0.9925F, -1.9926F, -1.3113F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(100, 12).addBox(-0.9925F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 1.7075F, -4.0685F, -1.3788F, 0.2356F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(39, 85).addBox(-0.0793F, -2.253F, -1.0789F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.425F, 2.8075F, -10.0685F, -1.3788F, 0.1571F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(14, 84).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, 4.2738F, -22.0153F, -1.2926F, -0.024F, 0.0839F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -1.5F, -0.55F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.6257F, 2.8195F, -11.4905F, -1.4312F, 0.1571F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(26, 85).addBox(-1.0168F, 2.9451F, -0.7612F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.825F, 1.7075F, -4.0685F, -1.3875F, 0.3927F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(79, 86).addBox(-1.0168F, -0.0619F, 0.2957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.825F, 1.7075F, -4.0685F, -1.5795F, 0.3927F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 0.3738F, -0.3821F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.6F, 1.7075F, -0.7685F, -1.6668F, 0.2356F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(25, 21).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0044F, -0.2182F, 0.0009F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(59, 97).addBox(0.0F, -2.5F, 2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(97, 10).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 5.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(97, 5).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(97, 0).addBox(0.0F, -2.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(75, 98).addBox(0.0F, 1.3437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 28).addBox(0.0F, -0.0563F, -0.5671F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 6.2753F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(100, 59).addBox(0.0F, -0.0527F, -0.9698F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2594F, 4.2753F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(95, 99).addBox(0.0F, 1.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(96, 85).addBox(0.0F, -2.2F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r9 = Tailbase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-1.5F, 0.0F, 0.1F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.2247F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailbase_r10 = Tailbase.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, 0.0F, 0.1F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.2247F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(25, 10).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0591F, 8.8013F, -0.0177F, -0.2586F, -0.0601F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(20, 102).addBox(0.0F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(59, 102).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(100, 66).addBox(0.0F, -1.975F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(97, 15).addBox(0.0F, -2.1F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.2F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, 1.0F, -0.0013F, 0.0522F, -0.0017F));

		PartDefinition Tailmiddlebase_r5 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(0, 36).addBox(-0.8F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.1F, 1.0F, -0.0013F, -0.0522F, 0.0017F));

		PartDefinition Tailbase_r11 = Tailmiddlebase.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(5, 103).addBox(0.0F, 4.5437F, 5.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 100).addBox(0.0F, 2.5437F, 3.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 98).addBox(0.0F, 1.3437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2124F, -0.5236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(28, 59).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F))
				.texOffs(14, 103).addBox(0.0F, -2.0024F, 2.0764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(17, 103).addBox(0.0F, -2.0024F, 4.0764F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.109F, 8.9001F, 0.0174F, -0.2181F, -0.0038F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(67, 100).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-0.975F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.1976F, 0.0764F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(41, 61).addBox(-0.025F, 0.0F, 0.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.1976F, 0.0764F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tailbase_r12 = Tailmiddle.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(11, 103).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 68).addBox(0.0F, 4.5437F, 5.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 49).addBox(0.0F, 5.5437F, 7.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1124F, -7.4236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3416F, 5.0413F, 0.0959F, 0.3476F, 0.0328F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(102, 38).addBox(0.0F, -1.45F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(84, 100).addBox(0.0F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 5.0255F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(81, 100).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 3.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(78, 100).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 1.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tailmiddleend.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(29, 103).addBox(0.0F, 9.7437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 103).addBox(0.0F, 7.6437F, 11.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(98, 100).addBox(0.0F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4235F, -10.4427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0801F, 7.9632F, -0.0655F, 0.4355F, -0.0277F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(23, 103).addBox(0.0F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 7.0424F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(39, 82).addBox(0.0F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 5.0424F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tailend.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(90, 100).addBox(0.0F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 3.0424F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tailend.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(87, 100).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 1.0424F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tailend.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(103, 28).addBox(0.0F, 12.7437F, 19.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 103).addBox(0.0F, 11.8437F, 17.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 103).addBox(0.0F, 10.9437F, 15.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 103).addBox(0.0F, 9.8437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3442F, -16.402F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9654F, 4.183F, -3.4726F, 1.3019F, -0.2164F, 0.1524F));

		PartDefinition cube_r258 = hindlegL3.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(53, 74).addBox(-6.0F, -4.125F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r259 = hindlegL3.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(33, 98).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 98).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6132F, 0.2673F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r260 = hindlegL3.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(15, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.6132F, 0.2673F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r261 = hindlegL3.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(10, 92).addBox(-6.0F, -0.125F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 4.9763F, 1.0164F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r262 = hindlegL3.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(59, 83).addBox(-6.0F, 0.0F, -1.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(74, 86).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(31, 86).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 91).addBox(-0.5F, 2.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1147F, 8.4057F, 0.4241F, 0.0426F, 0.0094F, -0.0434F));

		PartDefinition bone5 = hindlegL4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(46, 10).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9654F, 4.183F, -3.4726F, 0.8656F, 0.2164F, -0.1524F));

		PartDefinition cube_r263 = hindlegL.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(13, 44).addBox(5.0F, -4.125F, -0.8F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r264 = hindlegL.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 97).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 6.6132F, 0.2673F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r265 = hindlegL.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(5, 92).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 6.6132F, 0.2673F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r266 = hindlegL.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(80, 91).addBox(5.0F, -0.125F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 4.9763F, 1.0164F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r267 = hindlegL.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(48, 67).addBox(5.0F, 0.0F, -1.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(69, 86).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 86).addBox(-0.5F, -0.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(99, 85).addBox(-0.5F, 2.2F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1147F, 8.4057F, 0.4241F, 0.0435F, 0.0038F, -0.2617F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone3.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(62, 100).addBox(-0.5F, 0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.4079F, 1.1058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone3.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(100, 21).addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r270 = bone3.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(97, 25).addBox(2.0F, 0.7866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 53).addBox(2.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone3.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(83, 0).addBox(0.8F, -0.3134F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, 0.2054F, 0.9746F, 0.4211F));

		PartDefinition cube_r272 = bone3.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(64, 85).addBox(-1.0F, -0.5136F, -1.1967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, 1.1562F, -0.1719F, 0.9626F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(20, 90).addBox(-1.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, -1.0254F, -0.1719F, 0.9626F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(11, 74).addBox(-1.0F, 0.6702F, -0.9446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, -0.1964F, -0.1719F, 0.9626F));

		PartDefinition cube_r275 = bone3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 82).addBox(2.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r276 = bone3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(70, 82).addBox(2.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.05F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.0668F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(96, 79).addBox(2.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r279 = bone8.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(62, 100).mirror().addBox(-0.5F, 0.05F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4079F, 1.1058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r280 = bone8.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(100, 21).mirror().addBox(-0.5F, -0.975F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r281 = bone8.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(97, 25).mirror().addBox(-3.0F, 0.7866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 53).mirror().addBox(-3.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r282 = bone8.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-1.8F, -0.3134F, 0.0444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, 0.2054F, -0.9746F, -0.4211F));

		PartDefinition cube_r283 = bone8.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(64, 85).mirror().addBox(0.0F, -0.5136F, -1.1967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, 1.1562F, 0.1719F, -0.9626F));

		PartDefinition cube_r284 = bone8.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(0.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, -1.0254F, 0.1719F, -0.9626F));

		PartDefinition cube_r285 = bone8.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(11, 74).mirror().addBox(0.0F, 0.6702F, -0.9446F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, -0.1964F, 0.1719F, -0.9626F));

		PartDefinition cube_r286 = bone8.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(77, 82).mirror().addBox(-3.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r287 = bone8.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-3.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r288 = bone8.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.5F, -0.05F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0668F, 0.7895F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r289 = bone8.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(-3.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 106, 106);
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