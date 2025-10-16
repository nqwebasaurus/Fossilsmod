package fossils.fossils.client.blockentity.model.gerrothorax;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class GerrothoraxFossilModel extends SkullModelBase {
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
	private final ModelPart Tailend2;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;
	private final ModelPart bone3;
	private final ModelPart bone6;

	public GerrothoraxFossilModel(ModelPart root) {
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
		this.Tailend2 = this.Tailend.getChild("Tailend2");
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

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(36, 19).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(62, 2).addBox(0.5F, -0.1957F, -1.495F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 4).addBox(0.5F, -0.1957F, -3.495F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 2).mirror().addBox(-4.5F, -0.1957F, -1.495F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 4).mirror().addBox(-4.5F, -0.1957F, -3.495F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 2.281F, 15.8867F, -0.1255F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(21, 84).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -1.4109F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(18, 84).addBox(0.0F, -1.5F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.5109F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Hips.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(25, 62).addBox(0.0F, -0.5F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7167F, -0.1695F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(37, 35).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0268F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(35, 82).addBox(0.0F, -1.3121F, 0.1978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(15, 22).addBox(0.0F, -1.1551F, -0.0364F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(52, 24).mirror().addBox(-2.4839F, 0.1412F, 4.7675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7309F, 5.1052F, -8.8674F, 0.2382F, 0.1839F, 0.3467F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(52, 24).addBox(-0.5161F, 0.1412F, 4.7675F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7309F, 5.1052F, -8.8674F, 0.2382F, -0.1839F, -0.3467F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 7).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(15, 83).addBox(0.0F, -1.1016F, 0.0359F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(-1.8575F, -0.1243F, 1.0692F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.7309F, 4.9267F, -4.9425F, 0.1489F, 0.0675F, 0.3138F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 6).mirror().addBox(-4.4509F, -1.9924F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2016F, 2.5396F, 0.4108F, 0.2726F, -0.5537F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 60).mirror().addBox(-3.9696F, -0.3473F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2016F, 2.5396F, 0.4824F, 0.0816F, -0.1544F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 54).mirror().addBox(-5.4509F, -1.9924F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2016F, 0.5396F, 0.4108F, 0.2726F, -0.5537F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(65, 58).mirror().addBox(-3.9696F, -0.3473F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2016F, 0.5396F, 0.4824F, 0.0816F, -0.1544F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 68).mirror().addBox(-4.4049F, -4.6999F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2016F, 0.5396F, 0.1883F, 0.4537F, -1.1607F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(65, 56).mirror().addBox(-2.9848F, -0.1737F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2016F, -1.4604F, 0.4824F, 0.0816F, -0.0846F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 52).mirror().addBox(-5.0465F, -3.7663F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2016F, -1.4604F, 0.1883F, 0.4537F, -1.0909F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-4.6318F, -1.4188F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2016F, -1.4604F, 0.4108F, 0.2726F, -0.4839F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-2.9069F, 0.1722F, -0.6966F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1984F, -3.5604F, 0.5336F, 0.0721F, -0.0104F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 48).mirror().addBox(-4.7074F, -1.0724F, -0.6966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1984F, -3.5604F, 0.4636F, 0.2835F, -0.3992F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(62, 16).mirror().addBox(-6.3029F, -3.5214F, -0.6966F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.1984F, -3.5604F, 0.2283F, 0.4915F, -1.0024F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 68).addBox(3.4049F, -4.6999F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2016F, 0.5396F, 0.1883F, -0.4537F, 1.1607F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 60).addBox(0.9696F, -0.3473F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2016F, 2.5396F, 0.4824F, -0.0816F, 0.1544F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(83, 6).addBox(3.4509F, -1.9924F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2016F, 2.5396F, 0.4108F, -0.2726F, 0.5537F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 58).addBox(0.9696F, -0.3473F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2016F, 0.5396F, 0.4824F, -0.0816F, 0.1544F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 54).addBox(3.4509F, -1.9924F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2016F, 0.5396F, 0.4108F, -0.2726F, 0.5537F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 50).addBox(2.6318F, -1.4188F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2016F, -1.4604F, 0.4108F, -0.2726F, 0.4839F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 52).addBox(3.0465F, -3.7663F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2016F, -1.4604F, 0.1883F, -0.4537F, 1.0909F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 56).addBox(-0.0152F, -0.1737F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2016F, -1.4604F, 0.4824F, -0.0816F, 0.0846F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 45).addBox(-0.0931F, 0.1722F, -0.6966F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.5336F, -0.0721F, 0.0104F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(73, 48).addBox(2.7074F, -1.0724F, -0.6966F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.4636F, -0.2835F, 0.3992F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 16).addBox(3.3029F, -3.5214F, -0.6966F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.2283F, -0.4915F, 1.0024F));

		PartDefinition Bodymiddle_r7 = body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(5, 83).addBox(0.0F, -1.0516F, 0.0359F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r8 = body.addOrReplaceChild("Bodymiddle_r8", CubeListBuilder.create().texOffs(15, 28).addBox(-1.1425F, -0.1243F, 1.0692F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7309F, 4.9267F, -4.9425F, 0.1489F, -0.0675F, -0.3138F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(24, 35).addBox(-0.4F, -0.4874F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(83, 37).addBox(0.1F, -1.4874F, -2.0045F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.0641F, -0.0871F, -0.0056F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(19, 21).mirror().addBox(-1.744F, -0.2361F, -3.6563F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.6309F, 4.7486F, -1.3482F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(-3.0069F, 0.158F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.5604F, 0.5122F, 0.0054F, -0.0189F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(36, 74).mirror().addBox(-4.7919F, -1.1276F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.5604F, 0.4692F, 0.2136F, -0.4054F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-7.3421F, -3.6144F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.0984F, -1.5604F, 0.277F, 0.4366F, -0.9882F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 6).mirror().addBox(-3.3039F, 0.1999F, -0.4647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0984F, -3.5604F, 0.6031F, -0.0738F, 0.0084F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-5.0789F, -1.2152F, -0.4647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0984F, -3.5604F, 0.5849F, 0.1731F, -0.3527F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-8.531F, -3.8475F, -0.4647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0984F, -3.5604F, 0.4076F, 0.4633F, -0.901F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 47).addBox(0.0069F, 0.158F, -0.4853F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.5604F, 0.5122F, -0.0054F, 0.0189F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(36, 74).addBox(2.7919F, -1.1276F, -0.4853F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.5604F, 0.4692F, -0.2136F, 0.4054F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 10).addBox(3.3421F, -3.6144F, -0.4853F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0984F, -1.5604F, 0.277F, -0.4366F, 0.9882F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 6).addBox(-0.6961F, 0.1999F, -0.4647F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0984F, -3.5604F, 0.6031F, 0.0738F, -0.0084F));

		PartDefinition cube_r33 = Bodyfront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(74, 20).addBox(3.0789F, -1.2152F, -0.4647F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0984F, -3.5604F, 0.5849F, -0.1731F, 0.3527F));

		PartDefinition cube_r34 = Bodyfront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 13).addBox(3.531F, -3.8475F, -0.4647F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0984F, -3.5604F, 0.4076F, -0.4633F, 0.901F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(25, 83).addBox(0.0F, -1.35F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(19, 21).addBox(-1.256F, -0.2361F, -3.6563F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.8309F, 4.7486F, -1.3482F, 0.0F, 0.0F, -0.3054F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(38, 83).addBox(0.0F, -1.6F, -4.975F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(83, 41).addBox(0.0F, -1.4F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(41, 83).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(19, 14).mirror().addBox(-1.905F, -0.3522F, -8.371F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.7309F, 4.7508F, 3.4929F, 0.0013F, -0.0464F, 0.3053F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-3.992F, 0.087F, -0.3443F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5214F, -0.0893F, -0.0011F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 75).mirror().addBox(-5.6548F, -1.6082F, -0.3443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.5137F, 0.1292F, -0.3796F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(49, 4).mirror().addBox(-8.7887F, -4.4954F, -0.3443F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.2209F, -0.5556F, 0.367F, 0.3891F, -0.9339F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-8.7629F, -4.5129F, -0.352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.3312F, 0.3615F, -0.9588F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(75, 22).mirror().addBox(-5.6432F, -1.6372F, -0.352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4705F, 0.1234F, -0.3968F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(59, 38).mirror().addBox(-3.9937F, 0.0559F, -0.352F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -2.5556F, 0.4793F, -0.0786F, -0.0093F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(59, 36).mirror().addBox(-3.9915F, -0.0253F, -0.318F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5173F, -0.073F, -0.056F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(74, 60).mirror().addBox(-5.6069F, -1.7098F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.5038F, 0.1428F, -0.4362F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-8.6922F, -4.5528F, -0.318F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2209F, -4.5556F, 0.3502F, 0.3954F, -0.9956F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(9, 60).addBox(-0.008F, 0.087F, -0.3443F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5214F, 0.0893F, 0.0011F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 75).addBox(3.6548F, -1.6082F, -0.3443F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.5137F, -0.1292F, 0.3796F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(49, 4).addBox(3.7887F, -4.4954F, -0.3443F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.2209F, -0.5556F, 0.367F, -0.3891F, 0.9339F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(49, 2).addBox(3.7629F, -4.5129F, -0.352F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3312F, -0.3615F, 0.9588F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(75, 22).addBox(3.6432F, -1.6372F, -0.352F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4705F, -0.1234F, 0.3968F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(59, 38).addBox(-0.0063F, 0.0559F, -0.352F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.4793F, 0.0786F, 0.0093F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(59, 36).addBox(-0.0085F, -0.0253F, -0.318F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5173F, 0.073F, 0.056F));

		PartDefinition cube_r51 = body2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 60).addBox(3.6069F, -1.7098F, -0.318F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.5038F, -0.1428F, 0.4362F));

		PartDefinition cube_r52 = body2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(49, 0).addBox(3.6922F, -4.5528F, -0.318F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -4.5556F, 0.3502F, -0.3954F, 0.9956F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(19, 14).addBox(-1.095F, -0.3522F, -8.371F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.7309F, 4.7508F, 3.4929F, 0.0013F, 0.0464F, -0.3053F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(84, 15).addBox(0.0F, -1.4F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(47, 83).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(44, 83).addBox(0.0F, -1.625F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(75, 32).addBox(-0.5F, -0.005F, -0.7969F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 1.9135F, -17.4587F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(75, 28).addBox(-0.5F, -10.98F, 0.5031F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.4534F, -8.7272F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(35, 47).addBox(-1.5F, -5.005F, -0.7969F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 10).addBox(-5.0F, -0.0077F, -0.8281F, 10.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.4534F, -8.4272F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(49, 80).addBox(-0.5F, 7.4797F, -1.1256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(19, 0).addBox(-3.5F, 1.8797F, -1.1256F, 7.0F, 6.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.4534F, -8.4272F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(64, 62).addBox(-1.05F, -1.1F, -0.475F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.9957F, -13.7391F, 1.2552F, -0.7601F, 0.2213F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-7.1162F, -3.6491F, -0.6079F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1209F, -5.3806F, 0.3607F, 0.5657F, -1.104F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(74, 56).mirror().addBox(-4.624F, -1.2827F, -0.6079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1209F, -5.3806F, 0.6055F, 0.2815F, -0.528F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-2.9203F, -0.0536F, -0.6079F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1209F, -5.3806F, 0.6599F, 0.0207F, -0.173F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-8.5551F, -4.635F, -0.484F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2503F, 0.4612F, -1.0655F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(75, 70).mirror().addBox(-5.5392F, -1.8546F, -0.484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4626F, 0.2474F, -0.4726F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(62, 0).mirror().addBox(-3.9914F, -0.1851F, -0.484F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.519F, 0.0391F, -0.0844F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-3.999F, -0.0247F, -0.4435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.5073F, -0.0187F, -0.0245F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-5.6139F, -1.7125F, -0.4435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.4738F, 0.1895F, -0.4101F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(-8.6966F, -4.559F, -0.4435F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.0791F, -1.4806F, 0.2957F, 0.4189F, -0.9861F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(56, 32).addBox(3.1162F, -3.6491F, -0.6079F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1209F, -5.3806F, 0.3607F, -0.5657F, 1.104F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(74, 56).addBox(2.624F, -1.2827F, -0.6079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1209F, -5.3806F, 0.6055F, -0.2815F, 0.528F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(64, 49).addBox(-0.0797F, -0.0536F, -0.6079F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1209F, -5.3806F, 0.6599F, -0.0207F, 0.173F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(49, 17).addBox(3.5551F, -4.635F, -0.484F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.2503F, -0.4612F, 1.0655F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(75, 70).addBox(3.5392F, -1.8546F, -0.484F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.4626F, -0.2474F, 0.4726F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(62, 0).addBox(-0.0086F, -0.1851F, -0.484F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0791F, -3.4806F, 0.519F, -0.0391F, 0.0844F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 62).addBox(-0.001F, -0.0247F, -0.4435F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.5073F, 0.0187F, 0.0245F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(50, 75).addBox(3.6139F, -1.7125F, -0.4435F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.4738F, -0.1895F, 0.4101F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 15).addBox(3.6965F, -4.559F, -0.4435F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0791F, -1.4806F, 0.2957F, -0.4189F, 0.9861F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(74, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(7.5849F, 3.477F, -4.2047F, 0.4004F, 0.336F, -1.0527F));

		PartDefinition cube_r76 = forelegL.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(44, 77).addBox(-0.5F, -3.375F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(39, 77).addBox(-0.5F, -3.375F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r77 = forelegL.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(76, 65).addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.2109F, 0.5435F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r78 = forelegL.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(77, 36).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0554F, 3.3442F, -0.1694F, -1.2193F, -0.3333F, -0.2185F));

		PartDefinition cube_r79 = forelegL2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(49, 77).addBox(-0.5F, -0.075F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(73, 76).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.4234F, 0.8486F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r80 = forelegL2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 76).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r81 = forelegL2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r82 = forelegL2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 22).addBox(-0.5F, -1.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3235F, 2.3362F, -0.249F));

		PartDefinition cube_r83 = bone.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(43, 25).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(74, 16).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-7.5849F, 3.477F, -4.2047F, -0.1882F, -0.0008F, 1.3148F));

		PartDefinition cube_r84 = forelegL3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 77).mirror().addBox(-0.5F, -3.375F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(39, 77).mirror().addBox(-0.5F, -3.375F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r85 = forelegL3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(76, 65).mirror().addBox(-0.5F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2109F, 0.5435F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r86 = forelegL3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(77, 36).mirror().addBox(-0.5F, -0.675F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0554F, 3.3442F, -0.1694F, -1.1496F, -0.1198F, 0.0577F));

		PartDefinition cube_r87 = forelegL4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(49, 77).mirror().addBox(-0.5F, -0.075F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(73, 76).mirror().addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.4234F, 0.8486F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r88 = forelegL4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(34, 76).mirror().addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r89 = forelegL4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(73, 0).mirror().addBox(-0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r90 = forelegL4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-0.5F, -1.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone8 = forelegL4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-0.3235F, 2.3362F, -0.249F));

		PartDefinition cube_r91 = bone8.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.9227F, -3.3227F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 66).addBox(-0.5F, 0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9618F, 0.4434F, -0.6259F, 1.5606F, -0.0965F, -0.2997F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 40).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9618F, 0.4434F, -0.6259F, 1.2116F, -0.0965F, -0.2997F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(47, 57).addBox(-0.5F, 0.7F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9094F, -2.5355F, 0.6773F, 0.8189F, -0.0965F, -0.2997F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(63, 24).addBox(-0.5F, 0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9094F, -2.5355F, 0.6773F, 0.208F, -0.0965F, -0.2997F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -0.75F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.8784F, -0.0435F, -1.2882F, 0.9934F, -0.0965F, -0.2997F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(5, 76).addBox(-0.9251F, -2.3942F, 2.4519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 0.5658F, -0.0965F, -0.2997F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(53, 70).addBox(-0.9251F, 0.0074F, -0.3295F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(63, 75).addBox(-0.9251F, 0.9074F, 0.1705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 1.1766F, -0.0965F, -0.2997F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(73, 44).addBox(1.7506F, 0.9742F, -0.8148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 70).addBox(1.5283F, -0.9128F, 1.3946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.4216F, 0.1459F, 0.1202F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 37).addBox(-5.1F, -2.1F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.1274F, 3.111F, 3.004F, 2.1088F, 0.373F, 0.2141F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(44, 52).addBox(-3.0893F, -0.0033F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5893F, 4.5058F, 0.4351F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(20, 58).addBox(-3.0893F, -2.0033F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5893F, 4.5058F, 0.4351F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(36, 62).addBox(-1.425F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8012F, 6.7669F, -6.3036F, 1.9634F, 0.6108F, 0.2516F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(73, 4).addBox(-0.3844F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4081F, 6.1572F, -6.675F, 1.984F, 0.6064F, 0.2633F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(71, 62).addBox(-0.406F, -0.253F, -0.5706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4081F, 6.1572F, -6.675F, 2.1112F, 0.3724F, 0.0899F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(14, 68).addBox(-1.1356F, -1.7171F, -0.6298F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.2006F, 7.0496F, -10.5653F, 1.8501F, 0.2915F, 0.4412F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(76, 11).addBox(-1.1356F, -1.3189F, -1.251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2006F, 7.0496F, -10.5653F, 1.3439F, 0.2915F, 0.4412F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(29, 76).addBox(-1.1356F, 0.3159F, -2.0623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-1.2006F, 7.0496F, -10.5653F, 2.5482F, 0.2915F, 0.4412F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(62, 51).addBox(-1.1356F, -0.3124F, -1.3053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.2006F, 7.0496F, -10.5653F, 1.8675F, 0.2915F, 0.4412F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(20, 62).addBox(-1.1356F, -3.1908F, -0.0707F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.144F)), PartPose.offsetAndRotation(-1.2006F, 7.0496F, -10.5653F, 2.1293F, 0.2915F, 0.4412F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(69, 51).addBox(-0.465F, 0.6465F, -0.9532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7006F, 7.0496F, -12.0653F, 1.6811F, 0.5248F, 0.2665F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 72).addBox(0.3056F, -0.8259F, -1.3983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7006F, 7.0496F, -12.0653F, 1.8252F, 0.7077F, 0.3614F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(71, 66).addBox(-0.6462F, -1.0114F, -1.1293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7006F, 7.0496F, -12.0653F, 1.9512F, 0.7808F, 0.408F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(5, 72).addBox(-0.3844F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2919F, 5.6572F, -6.875F, 2.1339F, 0.567F, 0.3465F));

		PartDefinition cube_r116 = bone2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(43, 71).addBox(-0.406F, -0.253F, -0.5456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2919F, 5.6572F, -6.875F, 2.2504F, 0.3574F, 0.1396F));

		PartDefinition cube_r117 = bone2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(26, 69).addBox(-0.406F, -0.253F, -0.5956F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7919F, 5.1572F, -7.575F, 2.487F, 0.3168F, 0.288F));

		PartDefinition cube_r118 = bone2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(48, 71).addBox(-0.3844F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7919F, 5.1572F, -7.575F, 2.3744F, 0.4768F, 0.5367F));

		PartDefinition cube_r119 = bone2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 40).addBox(-3.0551F, 0.054F, -0.0259F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4318F, 6.6248F, -4.4196F, 1.9522F, 0.3072F, 0.0419F));

		PartDefinition cube_r120 = bone2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(22, 48).addBox(-3.6078F, -2.9212F, -0.2771F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.975F, 6.4002F, -4.3269F, 2.0818F, 0.8739F, 0.4013F));

		PartDefinition cube_r121 = bone2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(58, 19).addBox(-0.6F, -0.7F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.4428F, 5.6448F, -3.3281F, 0.5715F, 0.2538F, 0.3262F));

		PartDefinition cube_r122 = bone2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(29, 59).addBox(1.3617F, -2.8778F, -1.3512F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.1111F, 0.1725F, 0.1928F));

		PartDefinition cube_r123 = bone2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(70, 32).addBox(1.5283F, -2.6686F, 0.571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.2435F, 0.1459F, 0.1202F));

		PartDefinition cube_r124 = bone2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(19, 69).addBox(-0.8589F, -1.0409F, -1.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.975F, 6.4002F, -4.3269F, 0.8244F, 0.6456F, 0.6334F));

		PartDefinition cube_r125 = bone2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.6399F, -0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.0988F, 5.6939F, -4.1675F, 0.6436F, 0.2896F, 0.3216F));

		PartDefinition cube_r126 = bone2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(46, 67).addBox(-0.5F, -0.6399F, -0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0988F, 5.6939F, -4.1675F, 1.1236F, 0.2896F, 0.3216F));

		PartDefinition cube_r127 = bone2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(11, 49).addBox(1.295F, -3.1431F, -0.9549F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.9132F, 0.1516F, 0.2096F));

		PartDefinition cube_r128 = bone2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(82, 69).addBox(1.7506F, -2.2487F, -3.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 3.6278F, -0.7079F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r129 = bone2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(54, 77).addBox(1.7506F, -0.0627F, -3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 3.6278F, -0.7079F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r130 = bone2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 76).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5F, 3.5032F, 1.5847F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r131 = bone2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(57, 62).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 3.5032F, 1.5847F, 2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r132 = bone2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(63, 28).addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5202F, 2.7256F, 0.7166F, 2.2372F, -0.0678F, -0.3072F));

		PartDefinition cube_r133 = bone2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(43, 62).addBox(-0.9251F, -0.2185F, -0.3601F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.0F, 1.7849F, -2.1053F, 1.6217F, -0.0965F, -0.2997F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.9227F, -3.3227F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r134 = bone5.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-0.5F, 0.2F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9618F, 0.4434F, -0.6259F, 1.5606F, 0.0965F, 0.2997F));

		PartDefinition cube_r135 = bone5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9618F, 0.4434F, -0.6259F, 1.2116F, 0.0965F, 0.2997F));

		PartDefinition cube_r136 = bone5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(47, 57).mirror().addBox(-0.5F, 0.7F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9094F, -2.5355F, 0.6773F, 0.8189F, 0.0965F, 0.2997F));

		PartDefinition cube_r137 = bone5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.5F, 0.6F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9094F, -2.5355F, 0.6773F, 0.208F, 0.0965F, 0.2997F));

		PartDefinition cube_r138 = bone5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(50, 62).mirror().addBox(-0.5F, -0.75F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.8784F, -0.0435F, -1.2882F, 0.9934F, 0.0965F, 0.2997F));

		PartDefinition cube_r139 = bone5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.0749F, -2.3942F, 2.4519F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 0.5658F, 0.0965F, 0.2997F));

		PartDefinition cube_r140 = bone5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 70).mirror().addBox(-0.0749F, 0.0074F, -0.3295F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(63, 75).mirror().addBox(-0.0749F, 0.9074F, 0.1705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 1.1766F, 0.0965F, 0.2997F));

		PartDefinition cube_r141 = bone5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(73, 44).mirror().addBox(-2.7506F, 0.9742F, -0.8148F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-2.5283F, -0.9128F, 1.3946F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.4216F, -0.1459F, -0.1202F));

		PartDefinition cube_r143 = bone5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.1F, -2.1F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1274F, 3.111F, 3.004F, 2.1088F, -0.373F, -0.2141F));

		PartDefinition cube_r144 = bone5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(0.0893F, -0.0033F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5893F, 4.5058F, 0.4351F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r145 = bone5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(20, 58).mirror().addBox(0.0893F, -2.0033F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5893F, 4.5058F, 0.4351F, 1.7628F, 0.0F, 0.0F));

		PartDefinition cube_r146 = bone5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(36, 62).mirror().addBox(-0.575F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8012F, 6.7669F, -6.3036F, 1.9634F, -0.6108F, -0.2516F));

		PartDefinition cube_r147 = bone5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.6156F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4081F, 6.1572F, -6.675F, 1.984F, -0.6064F, -0.2633F));

		PartDefinition cube_r148 = bone5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-0.594F, -0.253F, -0.5706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4081F, 6.1572F, -6.675F, 2.1112F, -0.3724F, -0.0899F));

		PartDefinition cube_r149 = bone5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(14, 68).mirror().addBox(0.1356F, -1.7171F, -0.6298F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.2006F, 7.0496F, -10.5653F, 1.8501F, -0.2915F, -0.4412F));

		PartDefinition cube_r150 = bone5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(0.1356F, -1.3189F, -1.251F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2006F, 7.0496F, -10.5653F, 1.3439F, -0.2915F, -0.4412F));

		PartDefinition cube_r151 = bone5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(29, 76).mirror().addBox(0.1356F, 0.3159F, -2.0623F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(1.2006F, 7.0496F, -10.5653F, 2.5482F, -0.2915F, -0.4412F));

		PartDefinition cube_r152 = bone5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(0.1356F, -0.3124F, -1.3053F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(1.2006F, 7.0496F, -10.5653F, 1.8675F, -0.2915F, -0.4412F));

		PartDefinition cube_r153 = bone5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(20, 62).mirror().addBox(0.1356F, -3.1908F, -0.0707F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.144F)).mirror(false), PartPose.offsetAndRotation(1.2006F, 7.0496F, -10.5653F, 2.1293F, -0.2915F, -0.4412F));

		PartDefinition cube_r154 = bone5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-0.535F, 0.6465F, -0.9532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.7006F, 7.0496F, -12.0653F, 1.6811F, -0.5248F, -0.2665F));

		PartDefinition cube_r155 = bone5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.3056F, -0.8259F, -1.3983F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.7006F, 7.0496F, -12.0653F, 1.8252F, -0.7077F, -0.3614F));

		PartDefinition cube_r156 = bone5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(71, 66).mirror().addBox(-0.3538F, -1.0114F, -1.1293F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.7006F, 7.0496F, -12.0653F, 1.9512F, -0.7808F, -0.408F));

		PartDefinition cube_r157 = bone5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.6156F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2919F, 5.6572F, -6.875F, 2.1339F, -0.567F, -0.3465F));

		PartDefinition cube_r158 = bone5.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(43, 71).mirror().addBox(-0.594F, -0.253F, -0.5456F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2919F, 5.6572F, -6.875F, 2.2504F, -0.3574F, -0.1396F));

		PartDefinition cube_r159 = bone5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(26, 69).mirror().addBox(-0.594F, -0.253F, -0.5956F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7919F, 5.1572F, -7.575F, 2.487F, -0.3168F, -0.288F));

		PartDefinition cube_r160 = bone5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(48, 71).mirror().addBox(-0.6156F, -1.7476F, -0.5612F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7919F, 5.1572F, -7.575F, 2.3744F, -0.4768F, -0.5367F));

		PartDefinition cube_r161 = bone5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(48, 40).mirror().addBox(0.0551F, 0.054F, -0.0259F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4318F, 6.6248F, -4.4196F, 1.9522F, -0.3072F, -0.0419F));

		PartDefinition cube_r162 = bone5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(22, 48).mirror().addBox(-0.3922F, -2.9212F, -0.2771F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 6.4002F, -4.3269F, 2.0818F, -0.8739F, -0.4013F));

		PartDefinition cube_r163 = bone5.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-0.4F, -0.7F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4428F, 5.6448F, -3.3281F, 0.5715F, -0.2538F, -0.3262F));

		PartDefinition cube_r164 = bone5.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(29, 59).mirror().addBox(-2.3617F, -2.8778F, -1.3512F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.1111F, -0.1725F, -0.1928F));

		PartDefinition cube_r165 = bone5.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(70, 32).mirror().addBox(-2.5283F, -2.6686F, 0.571F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.2435F, -0.1459F, -0.1202F));

		PartDefinition cube_r166 = bone5.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(19, 69).mirror().addBox(-0.1411F, -1.0409F, -1.1651F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 6.4002F, -4.3269F, 0.8244F, -0.6456F, -0.6334F));

		PartDefinition cube_r167 = bone5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -0.6399F, -0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.0988F, 5.6939F, -4.1675F, 0.6436F, -0.2896F, -0.3216F));

		PartDefinition cube_r168 = bone5.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(46, 67).mirror().addBox(-0.5F, -0.6399F, -0.0534F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0988F, 5.6939F, -4.1675F, 1.1236F, -0.2896F, -0.3216F));

		PartDefinition cube_r169 = bone5.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(11, 49).mirror().addBox(-2.295F, -3.1431F, -0.9549F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.9132F, -0.1516F, -0.2096F));

		PartDefinition cube_r170 = bone5.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(82, 69).mirror().addBox(-2.7506F, -2.2487F, -3.0269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 3.6278F, -0.7079F, -2.4958F, 0.0F, 0.0F));

		PartDefinition cube_r171 = bone5.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-2.7506F, -0.0627F, -3.7602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 3.6278F, -0.7079F, 3.1329F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone5.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(78, 76).mirror().addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.5032F, 1.5847F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r173 = bone5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(57, 62).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.5032F, 1.5847F, 2.7402F, 0.0F, 0.0F));

		PartDefinition cube_r174 = bone5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(63, 28).mirror().addBox(-0.5F, -0.3F, -0.55F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5202F, 2.7256F, 0.7166F, 2.2372F, 0.0678F, 0.3072F));

		PartDefinition cube_r175 = bone5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(43, 62).mirror().addBox(-0.0749F, -0.2185F, -0.3601F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7849F, -2.1053F, 1.6217F, 0.0965F, 0.2997F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(37, 41).addBox(-0.5F, -0.7596F, -3.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, 0.0641F, -0.0435F, -0.0028F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(53, 83).addBox(0.0F, -1.3743F, -0.0076F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -3.9227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(50, 83).addBox(0.0F, -1.175F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r176 = Neck.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(7, 66).mirror().addBox(-2.7518F, 0.0263F, -0.6366F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.3633F, -3.3797F, 0.5847F, 0.2471F, -0.3299F));

		PartDefinition cube_r177 = Neck.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9158F, 0.6009F, -2.8028F, 0.4676F, 0.4376F, -0.674F));

		PartDefinition cube_r178 = Neck.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(75, 24).mirror().addBox(-5.0792F, -2.1719F, -0.3962F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1367F, -1.4797F, 0.3893F, 0.4715F, -0.8014F));

		PartDefinition cube_r179 = Neck.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(59, 34).mirror().addBox(-3.7673F, -0.0788F, -0.3962F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1367F, -1.4797F, 0.5751F, 0.1886F, -0.2467F));

		PartDefinition cube_r180 = Neck.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(74, 58).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9158F, 0.6009F, -2.8028F, 0.4676F, -0.4376F, 0.674F));

		PartDefinition cube_r181 = Neck.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(7, 66).addBox(-0.2482F, 0.0263F, -0.6366F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3633F, -3.3797F, 0.5847F, -0.2471F, 0.3299F));

		PartDefinition cube_r182 = Neck.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(75, 24).addBox(3.0792F, -2.1719F, -0.3962F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1367F, -1.4797F, 0.3893F, -0.4715F, 0.8014F));

		PartDefinition cube_r183 = Neck.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(59, 34).addBox(-0.2327F, -0.0788F, -0.3962F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1367F, -1.4797F, 0.5751F, -0.1886F, 0.2467F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.2568F, -4.3419F, -0.8019F, -0.0617F, 0.001F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(36, 25).addBox(-1.0108F, -0.6052F, -2.6665F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0155F, -1.0882F, -9.16F, 0.2273F, -0.0062F, -0.0008F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(29, 54).addBox(-0.5164F, -0.0195F, 0.0106F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0264F, -1.2815F, -10.9524F, 0.0746F, -0.0062F, -0.0008F));

		PartDefinition Neck_r3 = Head.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(11, 43).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.4972F, 0.4191F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 41).addBox(-1.1399F, -0.0117F, -4.0238F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -1.7387F, -4.7007F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(48, 35).mirror().addBox(-2.3F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.6787F, -0.3728F, -5.2F, -0.0168F, 0.5666F, -0.0278F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(48, 35).addBox(0.3F, -0.5F, -3.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.6987F, -0.3728F, -5.2F, -0.0168F, -0.5666F, 0.0278F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-1.8F, -0.5F, -6.2F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.01F, -0.359F, -4.8827F, -0.7771F, 1.5091F, -0.7849F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 14).addBox(-1.2F, -0.5F, -6.2F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -0.359F, -4.8827F, -0.7771F, -1.5091F, 0.7849F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(32, 67).addBox(0.0F, -1.0236F, -0.1105F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.49F, 0.0179F, -7.1753F, -0.384F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(56, 57).addBox(0.0F, 0.0F, -0.1071F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 0).addBox(0.0F, -0.6F, -6.1F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.49F, -0.2765F, -5.2867F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(47, 19).addBox(-1.6399F, 0.0457F, -2.4301F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -1.9703F, -2.8149F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5504F, -1.7091F, -7.7339F, 0.2804F, -0.0215F, 0.0505F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(82, 34).addBox(-0.8493F, 0.0447F, 0.0691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7654F, -0.5479F, -3.2918F, -2.362F, 1.3089F, -2.3747F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(81, 60).addBox(-0.8205F, 0.0447F, -0.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.7654F, -0.5479F, -3.2918F, -1.5513F, 1.3877F, -1.5463F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(81, 12).addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.995F, 1.4006F, -1.0397F, -0.1806F, 0.8872F, -0.0248F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.4F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 79).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.4296F, 0.7871F, -2.302F, -0.2678F, 0.8872F, -0.0248F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(74, 79).addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(69, 79).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.2353F, 0.4206F, -3.1322F, -0.2933F, 0.9543F, -0.0568F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(64, 79).addBox(-0.9228F, -0.3134F, 0.7041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 79).addBox(-0.9228F, -0.3134F, -0.1959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(79, 15).addBox(-0.9228F, -0.7134F, 0.0041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3612F, 0.1804F, -4.167F, -0.1415F, 1.2582F, -0.1302F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(5, 80).addBox(-0.6F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3361F, 0.3732F, -3.9543F, -0.7366F, 1.5062F, -0.731F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(78, 6).addBox(-0.4663F, -0.5F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3914F, -0.2597F, -3.703F, -1.2942F, 1.4203F, -1.3081F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(78, 3).addBox(-0.4937F, -0.5F, -0.2452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.3914F, -0.2597F, -3.703F, -0.6367F, 1.3257F, -0.6391F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(82, 24).addBox(-0.9978F, -0.7134F, 0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.288F, 0.1923F, -3.9914F, -0.093F, 1.0848F, -0.0777F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(36, 14).addBox(-4.9985F, -0.5007F, 4.627F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2607F, -0.0056F, -3.5394F, -0.2185F, 0.3874F, -0.0892F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(0, 47).addBox(0.4505F, -0.4287F, 5.0547F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.1722F, 0.0275F, 0.1648F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(81, 9).addBox(1.4159F, -1.4031F, 7.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, 0.0947F, 0.325F, 0.9187F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(44, 47).addBox(0.1743F, -0.2753F, 5.4698F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.1833F, 0.2856F, 0.0477F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(0, 83).addBox(3.2273F, 3.3516F, 6.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.1361F, -0.1117F, -0.5464F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(10, 81).addBox(4.2039F, 0.4822F, 6.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(62, 8).addBox(4.1442F, -0.2753F, 5.5108F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.1758F, -0.0064F, 0.101F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(39, 67).addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1548F, 2.1258F, 3.496F, -0.2553F, 0.8061F, -0.0863F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(64, 66).addBox(2.125F, -0.2753F, 8.2751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.2015F, 0.5084F, 0.0008F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(83, 3).addBox(0.2569F, -0.2753F, 7.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.235F, 0.7214F, -0.0569F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(0, 52).addBox(-2.4254F, -0.2753F, 5.8452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.2553F, 0.8061F, -0.0863F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(52, 28).addBox(-2.6301F, -0.2753F, 3.8629F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.265F, 0.8398F, -0.0995F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(25, 65).addBox(-0.9794F, -0.4845F, -0.0314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.35F, 0.9797F, -0.1269F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(62, 12).addBox(0.147F, -0.4287F, -6.0315F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -2.9479F, -0.474F, -3.0614F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(11, 62).addBox(-0.8129F, -0.4951F, -6.6254F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2607F, -0.0056F, -3.5394F, -2.9408F, 0.0214F, -3.1372F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(36, 71).addBox(-2.9605F, -0.4951F, -5.3277F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2607F, -0.0056F, -3.5394F, -2.8864F, 0.6603F, -2.9829F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(54, 80).addBox(-5.7476F, -0.4951F, -2.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(43, 32).addBox(-5.7476F, -0.5451F, -3.3761F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2607F, -0.0056F, -3.5394F, -2.0621F, 1.3427F, -2.0731F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(15, 77).addBox(-0.6101F, -0.7983F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8596F, 2.706F, 5.3238F, -1.1868F, 0.2182F, 0.0F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(53, 52).addBox(-0.6003F, -0.6464F, -2.5485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.8596F, 2.706F, 5.3238F, -0.3491F, 0.2182F, 0.0F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(67, 18).addBox(-0.6003F, 0.1215F, -2.5894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8596F, 2.706F, 5.3238F, -0.48F, 0.2182F, 0.0F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(69, 82).addBox(-0.6101F, 0.6064F, 0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.8596F, 2.706F, 5.3238F, 0.4102F, 0.2182F, 0.0F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(20, 53).addBox(-0.6101F, 0.0215F, -0.778F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8596F, 2.706F, 5.3238F, -0.288F, 0.2182F, 0.0F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(20, 81).addBox(-1.1023F, 0.0574F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(80, 72).addBox(-1.9023F, 0.0574F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7654F, -0.5479F, -3.2918F, -0.4727F, 1.159F, -0.4382F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(0, 64).addBox(3.1194F, -0.489F, -3.5439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -1.9026F, -1.3736F, 2.0827F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(78, 0).addBox(1.5706F, -0.489F, -3.3361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -2.6322F, -1.1811F, 2.8386F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(58, 70).addBox(2.3154F, -0.489F, -2.0992F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.8634F, -1.3246F, 1.0222F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(70, 37).addBox(1.9312F, -0.489F, -0.1627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1607F, 0.0444F, -3.5144F, -0.231F, -0.6281F, 0.3113F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5304F, -1.7091F, -7.7339F, 0.2804F, 0.0215F, -0.0505F));

		PartDefinition Head_r47 = rightFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(82, 34).mirror().addBox(-0.1507F, 0.0447F, 0.0691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7654F, -0.5479F, -3.2918F, -2.362F, -1.3089F, 2.3747F));

		PartDefinition Head_r48 = rightFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(81, 60).mirror().addBox(-0.1795F, 0.0447F, -0.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.7654F, -0.5479F, -3.2918F, -1.5513F, -1.3877F, 1.5463F));

		PartDefinition Head_r49 = rightFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.5F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.995F, 1.4006F, -1.0397F, -0.1806F, -0.8872F, 0.0248F));

		PartDefinition Head_r50 = rightFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.4F, 0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 79).mirror().addBox(-0.5F, -0.4F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.4296F, 0.7871F, -2.302F, -0.2678F, -0.8872F, 0.0248F));

		PartDefinition Head_r51 = rightFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(74, 79).mirror().addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(69, 79).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.2353F, 0.4206F, -3.1322F, -0.2933F, -0.9543F, 0.0568F));

		PartDefinition Head_r52 = rightFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.0772F, -0.3134F, 0.7041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 79).mirror().addBox(-0.0772F, -0.3134F, -0.1959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(79, 15).mirror().addBox(-0.0772F, -0.7134F, 0.0041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3612F, 0.1804F, -4.167F, -0.1415F, -1.2582F, 0.1302F));

		PartDefinition Head_r53 = rightFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(5, 80).mirror().addBox(-0.4F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.3361F, 0.3732F, -3.9543F, -0.7366F, -1.5062F, 0.731F));

		PartDefinition Head_r54 = rightFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(78, 6).mirror().addBox(-0.5337F, -0.5F, -0.7527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3914F, -0.2597F, -3.703F, -1.2942F, -1.4203F, 1.3081F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(-0.5063F, -0.5F, -0.2452F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-0.3914F, -0.2597F, -3.703F, -0.6367F, -1.3257F, 0.6391F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-0.0022F, -0.7134F, 0.0541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.288F, 0.1923F, -3.9914F, -0.093F, -1.0848F, 0.0777F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(36, 14).mirror().addBox(1.9985F, -0.5007F, 4.627F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2607F, -0.0056F, -3.5394F, -0.2185F, -0.3874F, 0.0892F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-2.4505F, -0.4287F, 5.0547F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.1722F, -0.0275F, -0.1648F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-2.4159F, -1.4031F, 7.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, 0.0947F, -0.325F, -0.9187F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(44, 47).mirror().addBox(-2.1743F, -0.2753F, 5.4698F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.1833F, -0.2856F, -0.0477F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-4.2273F, 3.3516F, 6.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.1361F, 0.1117F, 0.5464F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-5.2039F, 0.4822F, 6.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(62, 8).mirror().addBox(-6.1442F, -0.2753F, 5.5108F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.1758F, 0.0064F, -0.101F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(39, 67).mirror().addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.1548F, 2.1258F, 3.496F, -0.2553F, -0.8061F, 0.0863F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-3.125F, -0.2753F, 8.2751F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.2015F, -0.5084F, -0.0008F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-1.2569F, -0.2753F, 7.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.235F, -0.7214F, 0.0569F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-0.5746F, -0.2753F, 5.8452F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.2553F, -0.8061F, 0.0863F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(52, 28).mirror().addBox(-0.3699F, -0.2753F, 3.8629F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.265F, -0.8398F, 0.0995F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(25, 65).mirror().addBox(-0.0206F, -0.4845F, -0.0314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.35F, -0.9797F, 0.1269F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(62, 12).mirror().addBox(-2.147F, -0.4287F, -6.0315F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -2.9479F, 0.474F, 3.0614F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(11, 62).mirror().addBox(-1.1871F, -0.4951F, -6.6254F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2607F, -0.0056F, -3.5394F, -2.9408F, -0.0214F, 3.1372F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(36, 71).mirror().addBox(0.9605F, -0.4951F, -5.3277F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2607F, -0.0056F, -3.5394F, -2.8864F, -0.6603F, 2.9829F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(54, 80).mirror().addBox(4.7476F, -0.4951F, -2.3761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(43, 32).mirror().addBox(0.7476F, -0.5451F, -3.3761F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2607F, -0.0056F, -3.5394F, -2.0621F, -1.3427F, 2.0731F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(15, 77).mirror().addBox(-0.3899F, -0.7983F, -0.1898F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8596F, 2.706F, 5.3238F, -1.1868F, -0.2182F, 0.0F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(53, 52).mirror().addBox(-0.3997F, -0.6464F, -2.5485F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8596F, 2.706F, 5.3238F, -0.3491F, -0.2182F, 0.0F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-0.3997F, 0.1215F, -2.5894F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8596F, 2.706F, 5.3238F, -0.48F, -0.2182F, 0.0F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(69, 82).mirror().addBox(-0.3899F, 0.6064F, 0.6839F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.8596F, 2.706F, 5.3238F, 0.4102F, -0.2182F, 0.0F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-0.3899F, 0.0215F, -0.778F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8596F, 2.706F, 5.3238F, -0.288F, -0.2182F, 0.0F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(0.1023F, 0.0574F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(80, 72).mirror().addBox(0.9023F, 0.0574F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7654F, -0.5479F, -3.2918F, -0.4727F, -1.159F, 0.4382F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-4.1194F, -0.489F, -3.5439F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -1.9026F, 1.3736F, -2.0827F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(-2.5706F, -0.489F, -3.3361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -2.6322F, 1.1811F, -2.8386F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-4.3154F, -0.489F, -2.0992F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.8634F, 1.3246F, -1.0222F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(70, 37).mirror().addBox(-3.9312F, -0.489F, -0.1627F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1607F, 0.0444F, -3.5144F, -0.231F, 0.6281F, -0.3113F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0011F, 1.587F, -2.7976F, 0.5507F, -0.0057F, 0.0071F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(34, 79).mirror().addBox(0.028F, 0.8042F, -1.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.4137F, -0.2182F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(0.028F, -0.0506F, -1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.5097F, -0.2182F, 0.0F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(64, 82).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-3.7793F, 1.4008F, -7.6076F, -1.5295F, -0.8126F, 0.0335F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(59, 82).mirror().addBox(-0.413F, 1.4815F, -0.2944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2799F, 1.3457F, -6.3053F, -1.6342F, -0.8126F, 0.0335F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(73, 40).mirror().addBox(-0.7011F, 2.0218F, -0.3022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2799F, 1.3457F, -6.3053F, -1.6451F, -0.9432F, 0.0476F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-0.35F, -1.4F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(78, 39).mirror().addBox(-0.35F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2023F, 1.1061F, -6.0024F, -1.4059F, -0.4038F, 0.0792F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.6F, -1.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 78).mirror().addBox(-0.6F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.9122F, 1.3152F, -7.2451F, -1.528F, -0.7526F, 0.0633F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(82, 21).mirror().addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.2867F, 1.2905F, -7.9224F, -1.6942F, -0.9608F, 0.0984F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(81, 66).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.5584F, 1.1979F, -8.4531F, -1.6467F, -1.0043F, 0.1042F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(81, 63).mirror().addBox(-1.3147F, 3.7689F, -0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 51).mirror().addBox(-1.3147F, 4.5689F, -0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 18).mirror().addBox(-1.4147F, 4.6689F, -0.4691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(24, 74).mirror().addBox(-1.4147F, 3.4689F, -0.4691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2799F, 1.3457F, -6.3053F, -1.6673F, -1.1348F, 0.1276F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(78, 45).mirror().addBox(-0.325F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2905F, 1.2461F, -9.5041F, -1.9214F, -1.4357F, 0.3444F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(31, 71).mirror().addBox(-0.527F, 2.407F, -1.3953F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.3614F, -0.4102F, 0.0F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(71, 11).mirror().addBox(-0.527F, 2.5426F, -0.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.501F, -0.4102F, 0.0F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(10, 74).mirror().addBox(-0.2554F, -0.09F, -0.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-5.2799F, 1.3457F, -6.3053F, -1.4832F, -0.7417F, -0.012F));

		PartDefinition cube_r198 = jaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(19, 73).mirror().addBox(-0.2554F, -0.073F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-5.2799F, 1.3457F, -6.3053F, -1.5356F, -0.7417F, -0.012F));

		PartDefinition cube_r199 = jaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.1311F, 1.8101F, -0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.5097F, -0.3054F, 0.0F));

		PartDefinition cube_r200 = jaw.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(30, 82).mirror().addBox(-0.1311F, 1.4337F, -1.764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.1868F, -0.3054F, 0.0F));

		PartDefinition cube_r201 = jaw.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(58, 73).mirror().addBox(0.028F, -0.1176F, -0.8365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-7.0602F, 1.1462F, -1.3578F, -1.4486F, -0.2182F, 0.0F));

		PartDefinition cube_r202 = jaw.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.5F, -1.225F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(65, 70).addBox(12.68F, -1.225F, -0.675F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-6.58F, 0.7345F, 0.2885F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r203 = jaw.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(70, 27).mirror().addBox(-5.0F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(70, 27).addBox(8.18F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.08F, -0.5F, 1.3F, -1.6057F, 0.0F, 0.0F));

		PartDefinition cube_r204 = jaw.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-5.0F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(76, 62).addBox(8.18F, -0.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.08F, 0.4F, 2.2F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r205 = jaw.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(34, 79).addBox(-1.0279F, 0.8042F, -1.4068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.4137F, 0.2182F, 0.0F));

		PartDefinition cube_r206 = jaw.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(83, 0).addBox(-1.0279F, -0.0506F, -1.3351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.5097F, 0.2182F, 0.0F));

		PartDefinition cube_r207 = jaw.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(71, 8).addBox(-2.2229F, 0.5787F, -0.0585F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2329F, 0.9893F, -8.3153F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r208 = jaw.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(64, 82).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(3.7993F, 1.4008F, -7.6076F, -1.5295F, 0.8126F, -0.0335F));

		PartDefinition cube_r209 = jaw.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(59, 82).addBox(-0.587F, 1.4815F, -0.2944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2999F, 1.3457F, -6.3053F, -1.6342F, 0.8126F, -0.0335F));

		PartDefinition cube_r210 = jaw.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(73, 40).addBox(-0.2989F, 2.0218F, -0.3022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2999F, 1.3457F, -6.3053F, -1.6451F, 0.9432F, -0.0476F));

		PartDefinition cube_r211 = jaw.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(78, 42).addBox(-0.65F, -1.4F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(78, 39).addBox(-0.65F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2223F, 1.1061F, -6.0024F, -1.4059F, 0.4038F, -0.0792F));

		PartDefinition cube_r212 = jaw.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(20, 78).addBox(-0.4F, -1.4F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 78).addBox(-0.4F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9322F, 1.3152F, -7.2451F, -1.528F, 0.7526F, -0.0633F));

		PartDefinition cube_r213 = jaw.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(82, 21).addBox(-0.5F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.3067F, 1.2905F, -7.9224F, -1.6942F, 0.9608F, -0.0984F));

		PartDefinition cube_r214 = jaw.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(81, 66).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.5784F, 1.1979F, -8.4531F, -1.6467F, 1.0043F, -0.1042F));

		PartDefinition cube_r215 = jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(81, 63).addBox(0.3147F, 3.7689F, -0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 51).addBox(0.3147F, 4.5689F, -0.6692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 18).addBox(0.4147F, 4.6689F, -0.4691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(24, 74).addBox(0.4147F, 3.4689F, -0.4691F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2999F, 1.3457F, -6.3053F, -1.6673F, 1.1348F, -0.1276F));

		PartDefinition cube_r216 = jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(78, 45).addBox(-0.675F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3105F, 1.2461F, -9.5041F, -1.9214F, 1.4357F, -0.3444F));

		PartDefinition cube_r217 = jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(31, 71).addBox(-0.473F, 2.407F, -1.3953F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.3614F, 0.4102F, 0.0F));

		PartDefinition cube_r218 = jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 11).addBox(-0.473F, 2.5426F, -0.6436F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.501F, 0.4102F, 0.0F));

		PartDefinition cube_r219 = jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(10, 74).addBox(-0.7446F, -0.09F, -0.5358F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.2999F, 1.3457F, -6.3053F, -1.4832F, 0.7417F, 0.012F));

		PartDefinition cube_r220 = jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(19, 73).addBox(-0.7446F, -0.073F, -0.4431F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(5.2999F, 1.3457F, -6.3053F, -1.5356F, 0.7417F, 0.012F));

		PartDefinition cube_r221 = jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(15, 80).addBox(-0.8689F, 1.8101F, -0.7085F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.5097F, 0.3054F, 0.0F));

		PartDefinition cube_r222 = jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(30, 82).addBox(-0.8689F, 1.4337F, -1.764F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.1868F, 0.3054F, 0.0F));

		PartDefinition cube_r223 = jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(58, 73).addBox(-1.0279F, -0.1176F, -0.8365F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(7.0802F, 1.1462F, -1.3578F, -1.4486F, 0.2182F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(30, 28).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0307F, 0.1308F, -0.004F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(28, 85).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(11, 84).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(8, 84).addBox(0.0F, -0.2527F, -0.0699F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2822F, 3.5565F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(83, 75).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4598F, 0.7945F, 0.384F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(56, 83).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(23, 8).mirror().addBox(-2.4F, 0.0F, -0.1F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.0247F, 0.0F, 0.1047F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(23, 8).addBox(-0.6F, 0.0F, -0.1F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.0247F, 0.0F, -0.1047F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, -0.0139F, 0.1309F, -0.0018F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(85, 27).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(-1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1F, 1.0F, -0.0013F, 0.0522F, -0.0017F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(75, 26).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, 0.1F, 1.0F, -0.0013F, -0.0522F, 0.0017F));

		PartDefinition Tailbase_r9 = Tailmiddlebase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(85, 30).addBox(0.0F, 1.0473F, 1.9301F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3233F, -1.2898F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, 0.0084F, 0.1309F, 0.0011F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(83, 45).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 2.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(15, 74).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.3024F, 0.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-1.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1976F, 0.0764F, 0.0F, 0.0698F, 0.0F));

		PartDefinition Tailmiddle_r4 = Tailmiddle.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(51, 6).addBox(-0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1976F, 0.0764F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(24, 42).addBox(-0.5F, -0.6008F, 0.0255F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3225F, 3.0314F, -0.0413F, 0.1744F, -0.0072F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(53, 67).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 3.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(84, 82).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.6008F, 1.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(55, 46).addBox(-0.5F, -0.5018F, 0.0424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1177F, 3.9583F, -0.1479F, 0.1295F, -0.0192F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(84, 79).addBox(0.0F, -0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5018F, 1.0424F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend2 = Tailend.addOrReplaceChild("Tailend2", CubeListBuilder.create().texOffs(57, 40).addBox(-0.5F, -0.5518F, -0.0075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.028F, 2.9273F, 0.0293F, 0.3053F, 0.0088F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7184F, 1.4802F, -3.0397F, 0.4573F, 0.4613F, -0.8021F));

		PartDefinition cube_r224 = hindlegL.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(81, 57).addBox(5.0F, -4.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r225 = hindlegL.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(81, 54).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r226 = hindlegL.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(0, 76).addBox(5.0F, 0.9F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(68, 75).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(75, 72).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2898F, 4.4132F, 0.2538F, 0.8707F, -0.5225F, -0.1926F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(13, 34).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 1.7421F, 0.1848F, -0.3054F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7184F, 1.4802F, -3.0397F, 0.6876F, -0.0897F, 0.8707F));

		PartDefinition cube_r227 = hindlegL3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-6.0F, -4.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r228 = hindlegL3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(81, 54).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r229 = hindlegL3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-6.0F, 0.9F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(68, 75).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(75, 72).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.2898F, 4.4132F, 0.2538F, 0.8112F, 0.4384F, 0.2145F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(13, 34).mirror().addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7421F, 0.1848F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4F, 0.1615F, -3.012F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r230 = bone3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(44, 80).addBox(-0.5F, -0.05F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.4061F, 1.2058F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r231 = bone3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(38, 54).addBox(-0.5F, -1.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r232 = bone3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(39, 80).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5698F, 0.7389F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r233 = bone3.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(80, 31).addBox(2.0F, 0.0866F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, -1.4506F, 1.068F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r234 = bone3.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(11, 55).addBox(-1.0F, -0.3298F, 0.8554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 2.0715F, 0.2481F, -0.3101F, -0.314F, 0.9373F));

		PartDefinition cube_r235 = bone3.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, 0.6702F, -1.1446F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 2.0715F, 0.2481F, -0.0919F, -0.314F, 0.9373F));

		PartDefinition cube_r236 = bone3.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 82).addBox(-1.1F, 0.584F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.9687F, 0.0F, 0.4538F));

		PartDefinition cube_r237 = bone3.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(7, 68).addBox(-1.1F, 0.5066F, -1.4162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.3578F, 0.0F, 0.4538F));

		PartDefinition cube_r238 = bone3.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 82).addBox(-1.1F, 0.1214F, -1.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.6196F, 0.0F, 0.4538F));

		PartDefinition cube_r239 = bone3.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(81, 48).addBox(-1.1F, -0.6809F, -1.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 1.4399F, 0.0F, 0.4538F));

		PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(80, 28).addBox(-0.5F, -0.25F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.0667F, 0.7895F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(25, 80).addBox(-1.1F, -0.3727F, -0.4026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.3142F, 0.0F, 0.4538F));

		PartDefinition bone6 = Hips.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, 0.1615F, -3.012F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r242 = bone6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(44, 80).mirror().addBox(-0.5F, -0.05F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4061F, 1.2058F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r243 = bone6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(38, 54).mirror().addBox(-0.5F, -1.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r244 = bone6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(39, 80).mirror().addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5698F, 0.7389F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r245 = bone6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-3.0F, 0.0866F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, -1.4506F, 1.068F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r246 = bone6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(11, 55).mirror().addBox(0.0F, -0.3298F, 0.8554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.0715F, 0.2481F, -0.3101F, 0.314F, -0.9373F));

		PartDefinition cube_r247 = bone6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(0.0F, 0.6702F, -1.1446F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.0715F, 0.2481F, -0.0919F, 0.314F, -0.9373F));

		PartDefinition cube_r248 = bone6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(79, 82).mirror().addBox(0.1F, 0.584F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.9687F, 0.0F, -0.4538F));

		PartDefinition cube_r249 = bone6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(0.1F, 0.5066F, -1.4162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.3578F, 0.0F, -0.4538F));

		PartDefinition cube_r250 = bone6.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(74, 82).mirror().addBox(0.1F, 0.1214F, -1.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.6196F, 0.0F, -0.4538F));

		PartDefinition cube_r251 = bone6.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(81, 48).mirror().addBox(0.1F, -0.6809F, -1.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 1.4399F, 0.0F, -0.4538F));

		PartDefinition cube_r252 = bone6.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(80, 28).mirror().addBox(-0.5F, -0.25F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0667F, 0.7895F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r253 = bone6.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(25, 80).mirror().addBox(0.1F, -0.3727F, -0.4026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.3142F, 0.0F, -0.4538F));

		return LayerDefinition.create(meshdefinition, 88, 88);
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