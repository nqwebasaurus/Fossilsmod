package fossils.fossils.client.blockentity.model.platyhystrix;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PlatyhystrixFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart forelegL2;
	private final ModelPart forelegL5;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart hindlegL2;
	private final ModelPart hindlegL5;
	private final ModelPart bone6;
	private final ModelPart bone9;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone13;

	public PlatyhystrixFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.forelegL2 = this.chest.getChild("forelegL2");
		this.forelegL5 = this.forelegL2.getChild("forelegL5");
		this.bone4 = this.forelegL5.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone10 = this.forelegL4.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone2 = this.chest.getChild("bone2");
		this.bone12 = this.chest.getChild("bone12");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.hindlegL2 = this.Hips.getChild("hindlegL2");
		this.hindlegL5 = this.hindlegL2.getChild("hindlegL5");
		this.bone6 = this.hindlegL5.getChild("bone6");
		this.bone9 = this.bone6.getChild("bone9");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone7 = this.hindlegL4.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone13 = this.Hips.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(38, 57).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, 2.0832F, 13.4065F, -0.204F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(49, 112).addBox(0.0F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -1.4109F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(112, 45).addBox(0.0F, -1.7F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.5109F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 99).mirror().addBox(-2.6644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.5011F, -0.9717F, 0.1668F, 0.0463F, -0.4857F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 55).mirror().addBox(-2.6644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.5011F, -2.9717F, 0.1469F, 0.0842F, -0.4782F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 99).addBox(0.6643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.5011F, -0.9717F, 0.1668F, -0.0463F, 0.4857F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(98, 55).addBox(0.6643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.5011F, -2.9717F, 0.1469F, -0.0842F, 0.4782F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(54, 27).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, -0.0081F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(112, 41).addBox(0.0F, -1.4121F, 0.1978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 68).mirror().addBox(-2.1644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2126F, -1.6602F, 0.1788F, 0.0238F, -0.4912F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 89).mirror().addBox(-2.2643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2126F, -3.6602F, 0.1668F, 0.0464F, -0.4861F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 68).addBox(0.1644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2126F, -1.6602F, 0.1788F, -0.0238F, 0.4912F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 89).addBox(0.2644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2126F, -3.6602F, 0.1668F, -0.0464F, 0.4861F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, -0.0087F, 0.0873F, 0.0008F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 86).mirror().addBox(-2.0413F, -0.1267F, -0.4413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2216F, -1.5604F, 0.1469F, 0.0842F, -0.4782F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 8).mirror().addBox(-2.758F, -0.9954F, -0.5612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2216F, -1.5604F, 0.0903F, 0.2043F, -0.9236F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 20).mirror().addBox(-4.02F, -1.3299F, -0.5738F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0784F, -3.4604F, 0.1595F, 0.2598F, -0.8902F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-2.4233F, -0.3131F, -0.4348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0784F, -3.4604F, 0.2319F, 0.1055F, -0.4527F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 86).addBox(0.0413F, -0.1267F, -0.4413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2216F, -1.5604F, 0.1469F, -0.0842F, 0.4782F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 8).addBox(1.758F, -0.9954F, -0.5612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2216F, -1.5604F, 0.0903F, -0.2043F, 0.9236F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(96, 20).addBox(2.02F, -1.3299F, -0.5738F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0784F, -3.4604F, 0.1595F, -0.2598F, 0.8902F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 3).addBox(0.4233F, -0.3131F, -0.4348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0784F, -3.4604F, 0.2319F, -0.1055F, 0.4527F));

		PartDefinition Bodyfront_r1 = body.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(115, 76).addBox(0.003F, -3.08F, -2.7937F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -1.5926F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = body.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(58, 115).addBox(0.01F, -2.8218F, -2.7927F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -1.5053F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = body.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(115, 53).addBox(0.007F, -2.7815F, -1.8174F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -1.1999F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = body.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(115, 44).addBox(0.008F, -3.2897F, -2.7692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -1.4966F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(57, 63).addBox(0.005F, -2.7489F, -1.8624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -1.1039F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(113, 70).addBox(0.003F, -2.1172F, -1.0675F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -0.8029F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(115, 41).addBox(0.01F, -2.2126F, -1.3011F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -0.8072F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(26, 112).addBox(-0.002F, -1.7573F, -0.3667F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.3386F, 0.3691F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(33, 105).addBox(-0.002F, -2.7235F, -1.0658F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.2886F, -0.1309F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(36, 110).addBox(0.006F, -2.8671F, -0.9892F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -0.2886F, -0.1309F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(112, 26).addBox(0.01F, -1.9388F, -0.069F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.0136F, -0.8309F, -0.5978F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(112, 22).addBox(0.003F, -1.838F, 0.159F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.0136F, -0.8309F, -0.5934F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(114, 4).addBox(0.005F, -1.8972F, -0.0028F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.7136F, 0.2691F, -0.9643F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(111, 99).addBox(0.0F, -0.55F, -0.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -5.0426F, 2.8846F, -1.357F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(35, 115).addBox(0.003F, 0.0021F, -0.9536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.674F, 3.4589F, -1.453F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(32, 115).addBox(-0.001F, -0.9729F, -0.9536F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -4.0757F, 2.6576F, -0.9294F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(3, 114).addBox(0.007F, -1.9728F, -0.9536F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -3.5834F, 0.7192F, -1.3221F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(114, 8).addBox(0.01F, -0.9553F, -0.1108F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -5.7136F, 1.8691F, -1.3657F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r19 = body.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(101, 68).addBox(0.0F, -0.775F, -1.4F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.003F, -7.9886F, 2.9691F, -1.3395F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r20 = body.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(103, 20).addBox(0.0F, -0.9811F, -0.0304F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.2119F, 1.9868F, -1.357F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r21 = body.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(115, 56).addBox(0.0F, -0.425F, -0.65F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.002F, -7.3578F, 3.1499F, -2.3431F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r22 = body.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(96, 43).addBox(-0.003F, -0.9845F, 0.0661F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.8848F, 1.1248F, -1.1301F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r23 = body.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(114, 0).addBox(0.007F, -1.2878F, 1.6383F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.8848F, 1.1248F, -1.2435F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r24 = body.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(42, 113).addBox(0.007F, -2.0004F, -0.0839F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4348F, -0.1752F, -0.8072F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r25 = body.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(70, 111).addBox(0.0F, -3.0533F, 0.2723F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9348F, -1.2752F, -0.973F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r26 = body.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(23, 112).addBox(0.005F, -1.9787F, 0.3113F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4348F, -0.1752F, -0.9643F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r27 = body.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(86, 111).addBox(0.002F, -1.8689F, 0.0131F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9348F, -1.2752F, -0.5629F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r28 = body.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(89, 104).addBox(0.0F, -2.8432F, 0.2738F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0348F, -2.0752F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r29 = body.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(96, 74).addBox(0.003F, -4.0523F, -0.1637F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2348F, -2.2752F, -0.1571F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r30 = body.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(93, 94).addBox(-0.005F, -3.8799F, -0.2344F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2348F, -2.2752F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r31 = body.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(111, 66).addBox(0.007F, -2.0695F, 0.0457F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0348F, -2.0752F, -0.3709F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r32 = body.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(20, 112).addBox(0.007F, -2.0568F, -0.0188F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0348F, -3.4752F, -0.2662F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r33 = body.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(30, 93).addBox(-0.005F, -3.8955F, 0.0652F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2348F, -3.7752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r34 = body.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(96, 14).addBox(0.003F, -4.0784F, 0.1352F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2348F, -3.7752F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r35 = body.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(41, 104).addBox(0.0F, -2.8308F, 0.2093F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0348F, -3.4752F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r36 = body.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(106, 111).addBox(0.002F, -1.8245F, -0.0436F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0348F, -2.8752F, -0.3534F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r37 = body.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(39, 112).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -8.2102F, -0.6607F, -0.7199F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r38 = body.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(111, 33).addBox(0.0F, -1.2297F, 0.4247F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6848F, -2.2002F, -0.5018F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r39 = body.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(33, 110).addBox(0.007F, -3.0315F, -0.0792F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.6848F, -2.2002F, -0.5629F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r40 = body.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(76, 111).addBox(0.007F, -2.5665F, 0.941F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.2848F, -0.6002F, -0.9468F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r41 = body.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(15, 88).addBox(-0.003F, -2.9744F, -0.0329F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.2848F, -0.6002F, -0.8334F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r42 = body.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(6, 114).addBox(0.002F, -1.4683F, 1.6317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 22).addBox(-0.003F, -2.2683F, 1.6067F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.2848F, 1.5998F, -1.3046F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r43 = body.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(70, 94).addBox(0.0F, -1.9996F, -0.0267F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.2848F, 1.5998F, -1.1301F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(41, 27).addBox(-0.4F, -0.4874F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(60, 73).addBox(0.103F, -8.4013F, -4.7222F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.0992F, 0.0867F, 0.0101F));

		PartDefinition cube_r17 = Bodyfront.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 26).mirror().addBox(-4.25F, -1.25F, -0.6376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.0234F, -1.5604F, 0.2673F, 0.3406F, -0.8757F));

		PartDefinition cube_r18 = Bodyfront.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(-2.5987F, -0.1394F, -0.4841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.0234F, -1.5604F, 0.3602F, 0.1361F, -0.4547F));

		PartDefinition cube_r19 = Bodyfront.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(100, 91).mirror().addBox(-4.1455F, -1.316F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.358F, 0.4025F, -0.6683F));

		PartDefinition cube_r20 = Bodyfront.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-2.5314F, -0.2452F, -0.4538F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.4635F, 0.159F, -0.2649F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 37).mirror().addBox(-3.671F, -3.4325F, -0.6008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.0508F, 0.5299F, -1.3304F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(95, 26).addBox(2.25F, -1.25F, -0.6376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, -0.0234F, -1.5604F, 0.2673F, -0.3406F, 0.8757F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(82, 20).addBox(-0.4013F, -0.1394F, -0.4841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, -0.0234F, -1.5604F, 0.3602F, -0.1361F, 0.4547F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(100, 91).addBox(2.1455F, -1.316F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.358F, -0.4025F, 0.6683F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(81, 31).addBox(-0.4686F, -0.2452F, -0.4538F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.4635F, -0.159F, 0.2649F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(86, 37).addBox(2.671F, -3.4325F, -0.6008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.0508F, -0.5299F, 1.3304F));

		PartDefinition Bodyfront_r44 = Bodyfront.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(115, 25).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -21.7825F, -0.9602F, -0.2356F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r45 = Bodyfront.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(98, 114).addBox(0.006F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -22.6813F, -0.5218F, -0.4538F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r46 = Bodyfront.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(114, 96).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -22.5768F, 0.4727F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r47 = Bodyfront.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(57, 66).addBox(-0.008F, -1.5F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -20.9614F, 0.4953F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r48 = Bodyfront.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(33, 92).addBox(-0.003F, -4.3677F, -1.1186F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -17.458F, 1.2818F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r49 = Bodyfront.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(66, 17).addBox(-0.009F, -2.9677F, -0.1186F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -18.0817F, -1.6526F, -0.2094F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r50 = Bodyfront.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(10, 80).addBox(-0.006F, -3.9905F, -0.0382F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -17.0938F, 2.4819F, -0.7505F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r51 = Bodyfront.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(92, 47).addBox(0.0F, -1.9905F, -0.0382F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -15.5178F, 1.2506F, -0.6632F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r52 = Bodyfront.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(92, 6).addBox(-0.006F, -1.9905F, -0.0382F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -13.8404F, 0.1613F, -0.576F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r53 = Bodyfront.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(45, 113).addBox(0.0F, -1.9905F, -0.0382F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -11.9994F, -0.6202F, -0.4014F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r54 = Bodyfront.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(59, 110).addBox(0.003F, -2.9905F, -0.0382F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -9.1085F, -1.4219F, -0.2705F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r55 = Bodyfront.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(77, 74).addBox(0.0F, -3.2F, -1.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.098F, -16.4152F, 4.2632F, -0.9687F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r56 = Bodyfront.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(36, 77).addBox(-0.006F, -3.8F, -2.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.098F, -12.8113F, 2.6317F, -0.7069F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r57 = Bodyfront.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(31, 77).addBox(0.0F, -2.0F, -1.1F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.098F, -11.5148F, 0.8099F, -0.4887F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r58 = Bodyfront.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(50, 78).addBox(0.0F, -5.0318F, -0.0188F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -7.9259F, 1.0647F, -0.4843F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r59 = Bodyfront.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(63, 101).addBox(0.005F, -0.0318F, -0.0188F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -11.0886F, 3.5136F, -0.6589F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r60 = Bodyfront.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(100, 109).addBox(0.007F, -0.0318F, -0.0188F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -13.007F, 5.8201F, -0.877F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r61 = Bodyfront.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(113, 18).addBox(0.002F, -0.0318F, 1.9812F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 8).addBox(-0.003F, -1.0318F, -0.0188F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -15.7007F, 6.6824F, -1.0952F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r62 = Bodyfront.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(92, 60).addBox(0.0F, -2.0318F, -0.0188F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -14.4901F, 5.0904F, -0.9207F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r63 = Bodyfront.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(57, 87).addBox(-0.003F, -3.0318F, -0.0188F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -12.3231F, 3.0158F, -0.7636F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r64 = Bodyfront.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(73, 111).addBox(0.007F, -3.0568F, -0.0188F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -9.737F, 1.4466F, -0.5454F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r65 = Bodyfront.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(56, 105).addBox(0.002F, -3.0568F, -0.0188F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -7.0017F, 0.2144F, -0.4232F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r66 = Bodyfront.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(36, 105).addBox(0.007F, -3.0568F, -0.0188F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -4.1366F, -0.6752F, -0.3011F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r67 = Bodyfront.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(86, 92).addBox(-0.005F, -3.8955F, 0.0652F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3366F, -0.9752F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r68 = Bodyfront.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(5, 96).addBox(0.003F, -4.0784F, 0.1352F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.3366F, -0.9752F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r69 = Bodyfront.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(23, 104).addBox(0.008F, -2.8308F, 0.2093F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -4.1366F, -0.6752F, -0.2967F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r70 = Bodyfront.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(20, 88).addBox(0.0F, -2.0F, -0.325F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -7.9366F, -0.5752F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r71 = Bodyfront.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(12, 87).addBox(0.0F, -5.7577F, -0.2001F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -0.6332F, -1.8184F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r72 = Bodyfront.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(25, 80).addBox(-0.008F, -5.5867F, -0.281F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -0.6332F, -1.8184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r73 = Bodyfront.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(92, 104).addBox(0.004F, -3.0579F, -0.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -6.1332F, -1.8184F, -0.144F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r74 = Bodyfront.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(73, 87).addBox(0.004F, -5.1164F, 0.0551F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -6.1332F, -3.5184F, -0.1091F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r75 = Bodyfront.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(80, 56).addBox(-0.008F, -5.692F, 0.0172F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -0.5332F, -3.5184F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r76 = Bodyfront.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(70, 86).addBox(0.0F, -5.8681F, 0.0962F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -0.5332F, -3.5184F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r77 = Bodyfront.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(60, 95).addBox(-0.003F, -4.1133F, -0.9313F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -5.853F, -2.3515F, -0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r78 = Bodyfront.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(5, 102).addBox(-0.005F, -7.9303F, -0.103F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -6.1332F, -3.5184F, -0.2531F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r79 = Bodyfront.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(90, 91).addBox(-0.012F, -4.9934F, 0.0025F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -13.8149F, -1.6742F, -0.4276F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r80 = Bodyfront.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(77, 20).addBox(0.0F, -3.9978F, 0.0116F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -14.1761F, -2.5273F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r81 = Bodyfront.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(97, 109).addBox(0.0F, -2.9978F, 0.0116F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -11.2017F, -2.9189F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r82 = Bodyfront.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(0, 87).addBox(0.0F, 0.0215F, 0.0029F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -24.283F, -3.5631F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r83 = Bodyfront.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(43, 34).addBox(0.0F, -10.9785F, 0.0029F, 0.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -13.2415F, -5.4092F, 0.0044F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r84 = Bodyfront.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(0, 62).addBox(-0.003F, -7.0003F, -1.9687F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -13.4332F, -3.4184F, -0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r85 = Bodyfront.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(113, 49).addBox(-0.005F, -2.0176F, -1.0249F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -11.4332F, -3.5184F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r86 = Bodyfront.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(95, 52).addBox(-0.003F, -3.0352F, -0.9085F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -8.4332F, -3.8184F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r87 = Bodyfront.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(13, 65).addBox(-0.008F, -8.2126F, -0.515F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -0.0332F, -4.2184F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r88 = Bodyfront.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(15, 80).addBox(0.004F, -5.9839F, -1.0071F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, -7.6306F, -4.0079F, 0.0654F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(57, 73).addBox(0.003F, -8.7238F, -1.0174F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.0442F, 0.1307F, 0.008F));

		PartDefinition Bodyfront_r89 = body2.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(114, 99).addBox(0.004F, -23.5997F, 2.4097F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 32).addBox(0.0F, -23.5997F, 0.8097F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.1789F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r90 = body2.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(95, 102).addBox(-0.006F, -22.1944F, 6.0628F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.4931F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r91 = body2.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(36, 63).addBox(-0.005F, -22.2212F, 3.4171F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.3709F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r92 = body2.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(5, 65).addBox(0.0F, -18.5471F, 2.1646F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r93 = body2.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(0, 49).addBox(-0.003F, -23.2607F, 0.0605F, 0.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r94 = body2.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(52, 113).addBox(-0.005F, -13.3947F, 0.0149F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r95 = body2.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(73, 79).addBox(0.004F, -13.5397F, -0.2586F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.0654F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r96 = body2.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(53, 78).addBox(-0.006F, -13.4842F, 0.6793F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.1876F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r97 = body2.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(10, 95).addBox(-0.003F, -11.4384F, -0.5818F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r98 = body2.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(10, 65).addBox(-0.008F, -8.2126F, -0.515F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.3557F, -0.5136F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r99 = body2.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(74, 20).addBox(-0.008F, -6.8217F, -0.5916F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.7447F, -1.9656F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r100 = body2.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(63, 95).addBox(0.0F, -3.9529F, -0.5704F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.7447F, -1.9656F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r101 = body2.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(49, 12).addBox(-0.005F, -5.9016F, -0.1623F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.7447F, -1.9656F, 0.0611F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r102 = body2.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(111, 95).addBox(-0.003F, -7.8249F, 0.2448F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -0.7447F, -1.9656F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r103 = body2.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(28, 80).addBox(0.0F, -4.0F, -0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -6.694F, -2.4669F, 0.2923F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r104 = body2.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(79, 112).addBox(-0.005F, -2.0124F, -0.9863F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -8.6447F, -1.7656F, 0.1658F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r105 = body2.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(15, 94).addBox(-0.003F, -3.994F, -1.8661F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -8.6447F, -1.7656F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r106 = body2.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(0, 72).addBox(0.0F, -5.119F, -2.0309F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -12.4447F, -2.4656F, 0.3403F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r107 = body2.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(0, 80).addBox(-0.005F, -3.9146F, -0.0374F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -14.1106F, -5.5241F, 0.5629F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r108 = body2.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(68, 79).addBox(-0.005F, -2.7146F, -2.2374F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -12.4447F, -2.4656F, 0.3883F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r109 = body2.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(5, 74).addBox(0.0F, -2.0F, -1.05F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.006F, -18.6614F, -7.2656F, 0.6676F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r110 = body2.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(18, 101).addBox(-0.001F, -2.4135F, -2.0174F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(91, 42).addBox(-0.005F, -2.0135F, -2.0174F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -19.0697F, -4.9906F, 0.4887F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r111 = body2.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(45, 91).addBox(-0.012F, -1.9431F, -1.9567F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -17.2697F, -4.2906F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r112 = body2.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(100, 102).addBox(0.0F, -0.9413F, -2.052F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -21.2922F, -6.1353F, 0.8596F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r113 = body2.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(91, 37).addBox(-0.006F, 0.025F, -2.025F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -17.2999F, -10.7886F, 1.3046F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r114 = body2.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(13, 101).addBox(0.0F, -0.775F, -0.325F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -16.8447F, -10.0656F, 0.6501F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r115 = body2.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(20, 95).addBox(0.0F, -0.375F, -0.6F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.003F, -7.8938F, -5.0914F, 0.3883F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r116 = body2.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(63, 79).addBox(0.008F, -3.5F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -13.0725F, -8.5409F, 0.8858F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r117 = body2.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(79, 39).addBox(0.0F, -1.3F, -1.2F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.002F, -12.6433F, -6.8246F, 0.5803F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r118 = body2.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(45, 85).addBox(-0.002F, -3.0333F, -2.0067F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.6659F, -7.0127F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r119 = body2.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(91, 18).addBox(-0.009F, -2.0332F, -2.0067F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.9885F, -5.9235F, 0.576F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r120 = body2.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(0, 93).addBox(0.003F, -2.0689F, -1.8928F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0885F, -5.2235F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r121 = body2.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(55, 93).addBox(0.0F, -2.0212F, -1.9072F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.2885F, -4.5235F, 0.3665F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r122 = body2.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(23, 88).addBox(-0.002F, -9.6278F, 0.2771F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4885F, -3.7235F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r123 = body2.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(109, 111).addBox(0.0F, -7.8023F, 0.6063F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4885F, -3.7235F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r124 = body2.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(103, 111).addBox(-0.002F, -5.9042F, 0.1999F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4885F, -3.7235F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r125 = body2.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(42, 74).addBox(0.0F, -1.5F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -5.8019F, -4.1969F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r126 = body2.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(71, 99).addBox(0.003F, -3.9934F, -0.2104F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4885F, -3.7235F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r127 = body2.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(92, 114).addBox(0.0F, -1.3339F, -2.0563F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 112).addBox(-0.002F, -2.0339F, -1.0563F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.2885F, -9.2235F, 0.9861F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r128 = body2.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(5, 91).addBox(0.003F, -2.0339F, -2.0563F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.7564F, -7.9379F, 0.6981F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r129 = body2.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(90, 86).addBox(0.0F, -2.0339F, -2.0563F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0696F, -6.8633F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r130 = body2.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(90, 81).addBox(-0.002F, -2.0339F, -2.0563F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.257F, -6.0181F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r131 = body2.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(62, 112).addBox(0.0F, -2.0339F, -1.0563F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.3776F, -5.334F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r132 = body2.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(112, 57).addBox(-0.002F, -2.0339F, -0.8563F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -4.975F, 0.2793F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r133 = body2.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(67, 90).addBox(0.003F, -4.2339F, -0.0563F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.9284F, -6.4929F, 0.685F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r134 = body2.addOrReplaceChild("Bodyfront_r134", CubeListBuilder.create().texOffs(76, 47).addBox(0.003F, -0.0339F, -0.0563F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5024F, -12.165F, 1.3657F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r135 = body2.addOrReplaceChild("Bodyfront_r135", CubeListBuilder.create().texOffs(45, 74).addBox(-0.002F, -4.0339F, -0.0563F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.026F, -9.0237F, 0.9032F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r136 = body2.addOrReplaceChild("Bodyfront_r136", CubeListBuilder.create().texOffs(30, 109).addBox(-0.005F, -3.0339F, -0.8563F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4F, -4.975F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r137 = body2.addOrReplaceChild("Bodyfront_r137", CubeListBuilder.create().texOffs(33, 99).addBox(0.003F, -2.102F, -0.4916F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -4.975F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(96, 96).mirror().addBox(-4.7657F, -3.4039F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.0393F, 0.4965F, -1.2837F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(101, 11).mirror().addBox(-4.2072F, -1.2387F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.3273F, 0.3822F, -0.6276F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(82, 75).mirror().addBox(-2.5563F, -0.1476F, -0.5018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.429F, 0.1516F, -0.2179F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-5.8006F, -3.379F, -0.8094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.0337F, 0.4797F, -1.2863F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(96, 94).mirror().addBox(-4.2219F, -1.1985F, -0.8094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.3121F, 0.3719F, -0.6332F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(-2.5615F, -0.1015F, -0.6577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.4117F, 0.1478F, -0.2205F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 50).mirror().addBox(-5.7492F, -3.447F, -0.2665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.0072F, 0.3958F, -1.2975F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(101, 72).mirror().addBox(-4.2181F, -1.2836F, -0.2665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.238F, 0.3194F, -0.6583F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(82, 22).mirror().addBox(-2.5621F, -0.1919F, -0.1157F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.3259F, 0.1282F, -0.2323F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(96, 96).addBox(2.7657F, -3.4039F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.0393F, -0.4965F, 1.2837F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(101, 11).addBox(2.2072F, -1.2387F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.3273F, -0.3822F, 0.6276F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(82, 75).addBox(-0.4437F, -0.1476F, -0.5018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.429F, -0.1516F, 0.2179F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 73).addBox(2.8006F, -3.379F, -0.8094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.0337F, -0.4797F, 1.2863F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(96, 94).addBox(2.2219F, -1.1985F, -0.8094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.3121F, -0.3719F, 0.6332F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 24).addBox(-0.4385F, -0.1015F, -0.6577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.4117F, -0.1478F, 0.2205F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(83, 50).addBox(2.7492F, -3.447F, -0.2665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.0072F, -0.3958F, 1.2975F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(101, 72).addBox(2.2181F, -1.2836F, -0.2665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.238F, -0.3194F, 0.6583F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(82, 22).addBox(-0.4379F, -0.1919F, -0.1157F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.3259F, -0.1282F, 0.2323F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(55, 18).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(86, 106).addBox(0.0F, -3.075F, -1.6F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.1313F, 0.0867F, 0.0099F));

		PartDefinition Bodyfront_r138 = chest.addOrReplaceChild("Bodyfront_r138", CubeListBuilder.create().texOffs(94, 109).addBox(0.0F, -2.5893F, -0.3606F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4857F, -2.6394F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r139 = chest.addOrReplaceChild("Bodyfront_r139", CubeListBuilder.create().texOffs(55, 113).addBox(0.0F, -3.9205F, -0.376F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0857F, -2.1394F, 0.7592F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r140 = chest.addOrReplaceChild("Bodyfront_r140", CubeListBuilder.create().texOffs(113, 89).addBox(0.003F, -2.018F, -0.9899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0857F, -2.1394F, 0.4538F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r141 = chest.addOrReplaceChild("Bodyfront_r141", CubeListBuilder.create().texOffs(58, 101).addBox(0.004F, -0.1851F, -2.5135F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0857F, -2.1394F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r142 = chest.addOrReplaceChild("Bodyfront_r142", CubeListBuilder.create().texOffs(95, 85).addBox(-0.005F, -0.4312F, -1.934F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.7969F, -3.8949F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r143 = chest.addOrReplaceChild("Bodyfront_r143", CubeListBuilder.create().texOffs(0, 112).addBox(0.004F, -0.4815F, -1.6882F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2857F, -4.4394F, -0.1484F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r144 = chest.addOrReplaceChild("Bodyfront_r144", CubeListBuilder.create().texOffs(114, 93).addBox(0.007F, -0.9999F, -0.9047F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2857F, -4.4394F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r145 = chest.addOrReplaceChild("Bodyfront_r145", CubeListBuilder.create().texOffs(101, 40).addBox(0.004F, 0.025F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.4652F, -1.3508F, -1.1868F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r146 = chest.addOrReplaceChild("Bodyfront_r146", CubeListBuilder.create().texOffs(101, 36).addBox(-0.005F, 0.025F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0084F, -2.6229F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r147 = chest.addOrReplaceChild("Bodyfront_r147", CubeListBuilder.create().texOffs(27, 63).addBox(-0.004F, -0.5F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.4873F, -3.5096F, -0.8814F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r148 = chest.addOrReplaceChild("Bodyfront_r148", CubeListBuilder.create().texOffs(36, 101).addBox(0.0F, -0.975F, -0.3F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1815F, -4.5876F, -0.6196F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r149 = chest.addOrReplaceChild("Bodyfront_r149", CubeListBuilder.create().texOffs(91, 76).addBox(0.006F, -1.975F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.1815F, -4.5876F, -0.5323F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r150 = chest.addOrReplaceChild("Bodyfront_r150", CubeListBuilder.create().texOffs(91, 71).addBox(0.0F, -1.9926F, -0.0318F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.1711F, -6.2849F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r151 = chest.addOrReplaceChild("Bodyfront_r151", CubeListBuilder.create().texOffs(112, 111).addBox(0.004F, -1.975F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0572F, -4.1729F, 1.0821F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r152 = chest.addOrReplaceChild("Bodyfront_r152", CubeListBuilder.create().texOffs(50, 91).addBox(-0.005F, -1.975F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5139F, -2.9008F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r153 = chest.addOrReplaceChild("Bodyfront_r153", CubeListBuilder.create().texOffs(89, 112).addBox(0.004F, -1.975F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8857F, -1.7394F, 0.6196F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r154 = chest.addOrReplaceChild("Bodyfront_r154", CubeListBuilder.create().texOffs(112, 85).addBox(0.0F, -1.975F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0805F, -0.8783F, 0.4451F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r155 = chest.addOrReplaceChild("Bodyfront_r155", CubeListBuilder.create().texOffs(82, 112).addBox(0.003F, -1.975F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -0.6F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r156 = chest.addOrReplaceChild("Bodyfront_r156", CubeListBuilder.create().texOffs(95, 114).addBox(-0.004F, -1.025F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7017F, -3.3365F, 0.4102F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r157 = chest.addOrReplaceChild("Bodyfront_r157", CubeListBuilder.create().texOffs(59, 105).addBox(0.0F, -2.725F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(67, 48).addBox(-1.783F, -2.2138F, -0.639F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(36, 97).mirror().addBox(-0.9451F, -0.8517F, -0.5313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.283F, 8.294F, -5.3644F, 1.4199F, 0.5187F, -0.0752F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(41, 83).mirror().addBox(-5.7578F, -3.4248F, -0.4651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, -0.0053F, 0.3538F, -1.3021F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(99, 18).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, 0.202F, 0.2925F, -0.6692F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(97, 7).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, 0.2831F, 0.118F, -0.2375F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 79).mirror().addBox(-5.8257F, -3.4047F, -0.49F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, -0.0293F, 0.2695F, -1.3095F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(97, 5).mirror().addBox(-4.2572F, -1.2055F, -0.49F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, 0.1316F, 0.2377F, -0.6877F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 77).mirror().addBox(-2.5767F, -0.0996F, -0.3367F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, 0.1979F, 0.0971F, -0.2467F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(36, 97).addBox(-0.0549F, -0.8517F, -0.5313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.4199F, -0.5187F, 0.0752F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 88).addBox(-0.783F, -0.2786F, -0.5313F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(41, 83).addBox(2.7578F, -3.4248F, -0.4651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, -0.0053F, -0.3538F, 1.3021F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(99, 18).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, 0.202F, -0.2925F, 0.6692F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(97, 7).addBox(0.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, 0.2831F, -0.118F, 0.2375F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 79).addBox(2.8256F, -3.4047F, -0.49F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, -0.0293F, -0.2695F, 1.3095F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(97, 5).addBox(2.2571F, -1.2055F, -0.49F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, 0.1316F, -0.2377F, 0.6877F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(82, 77).addBox(-0.4233F, -0.0996F, -0.3367F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, 0.1979F, -0.0971F, 0.2467F));

		PartDefinition forelegL2 = chest.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1131F, 6.4544F, -0.3203F, 1.5424F, 0.3208F, -1.3156F));

		PartDefinition cube_r61 = forelegL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(97, 28).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.003F, 3.9448F, -1.6777F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r62 = forelegL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(83, 46).addBox(-0.503F, -0.4399F, -0.9924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -1.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r63 = forelegL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(81, 106).addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.003F, 4.608F, -0.9208F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r64 = forelegL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(78, 65).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1982F, 0.1974F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r65 = forelegL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(64, 66).addBox(5.0F, -2.7F, 0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 2.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition forelegL5 = forelegL2.addOrReplaceChild("forelegL5", CubeListBuilder.create().texOffs(76, 92).addBox(-0.5765F, -1.4562F, 0.2799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.6472F, 5.7766F, -2.5301F, -2.4547F, -0.1446F, -0.1234F));

		PartDefinition cube_r66 = forelegL5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 102).addBox(-0.4994F, -2.0966F, -0.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.2471F, -0.0563F, -0.0026F));

		PartDefinition cube_r67 = forelegL5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 54).addBox(-0.4994F, -0.5003F, -0.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.4304F, -0.0563F, -0.0026F));

		PartDefinition cube_r68 = forelegL5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(79, 101).addBox(-0.4994F, 0.1028F, -0.324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.6049F, -0.0563F, -0.0026F));

		PartDefinition cube_r69 = forelegL5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(81, 92).addBox(-0.5F, -2.4628F, -0.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.1405F, 1.133F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r70 = forelegL5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(54, 110).addBox(-0.5F, -2.3504F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.8951F, 0.8017F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r71 = forelegL5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(74, 101).addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 0.6246F, -0.6241F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r72 = forelegL5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(44, 110).addBox(-0.5F, -2.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(16, 67).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r73 = forelegL5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(102, 44).addBox(-0.5F, 0.7F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 1.9899F, -0.9497F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone4 = forelegL5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.042F, 4.3875F, -1.3198F, -0.4266F, -0.2103F, -0.4562F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(15, 28).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(28, 28).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1131F, 6.4544F, -0.3203F, 1.1209F, -0.3171F, 1.4074F));

		PartDefinition cube_r76 = forelegL3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(97, 28).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.003F, 3.9448F, -1.6777F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r77 = forelegL3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(83, 46).mirror().addBox(-0.497F, -0.4399F, -0.9924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0884F, -1.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r78 = forelegL3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 106).mirror().addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.003F, 4.608F, -0.9208F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r79 = forelegL3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(78, 65).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1982F, 0.1974F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r80 = forelegL3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(64, 66).mirror().addBox(-6.0F, -2.7F, 0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.5F, 2.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(76, 92).mirror().addBox(-0.4235F, -1.4562F, 0.2799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 5.7766F, -2.5301F, -1.9252F, 0.5791F, 0.3689F));

		PartDefinition cube_r81 = forelegL4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(51, 102).mirror().addBox(-0.5006F, -2.0966F, -0.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.2471F, 0.0563F, 0.0026F));

		PartDefinition cube_r82 = forelegL4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(110, 54).mirror().addBox(-0.5006F, -0.5003F, -0.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.4304F, 0.0563F, 0.0026F));

		PartDefinition cube_r83 = forelegL4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(79, 101).mirror().addBox(-0.5006F, 0.1028F, -0.324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.6049F, 0.0563F, 0.0026F));

		PartDefinition cube_r84 = forelegL4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 92).mirror().addBox(-0.5F, -2.4628F, -0.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.1405F, 1.133F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r85 = forelegL4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(54, 110).mirror().addBox(-0.5F, -2.3504F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.8951F, 0.8017F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r86 = forelegL4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(74, 101).mirror().addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.6246F, -0.6241F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r87 = forelegL4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(44, 110).mirror().addBox(-0.5F, -2.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(16, 67).mirror().addBox(-0.5F, -2.2F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r88 = forelegL4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(102, 44).mirror().addBox(-0.5F, 0.7F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.9899F, -0.9497F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone10 = forelegL4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1398F, 4.5864F, -1.234F, -0.5755F, 0.626F, 0.0898F));

		PartDefinition cube_r89 = bone10.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition cube_r90 = bone11.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(28, 28).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5871F, 3.0945F, -1.2202F, -0.3203F, -0.0414F, -0.1242F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(17, 75).addBox(-0.5F, -1.15F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2169F, -3.9032F, 2.6496F, 0.1375F, 0.2439F, -0.0576F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(21, 14).addBox(-0.4691F, -0.203F, -3.7583F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8666F, -2.5983F, 1.0703F, 0.8792F, 0.2439F, -0.0576F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(65, 24).addBox(-0.4691F, -0.214F, 1.7295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8666F, -2.5983F, 1.0703F, 0.7483F, 0.2439F, -0.0576F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(83, 56).addBox(-0.5F, -0.4F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.354F, -5.5442F, 3.58F, 0.2247F, 0.2439F, -0.0576F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5F, -0.675F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9181F, -4.715F, 1.639F, 0.312F, 0.2439F, -0.0576F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 69).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.4659F, -4.5618F, -0.2112F, 0.8007F, 0.2439F, -0.0576F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(97, 47).addBox(-0.4435F, -2.3754F, -0.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8666F, -2.5983F, 1.0703F, 0.4953F, 0.2439F, -0.0576F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(26, 50).addBox(-0.4435F, -1.4502F, -4.5154F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8666F, -2.5983F, 1.0703F, 1.1061F, 0.2439F, -0.0576F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(70, 74).addBox(-0.8844F, -3.5078F, -4.1741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 1.5581F, 0.2886F, 0.3005F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(21, 69).addBox(-0.8844F, -2.6738F, -3.1197F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 1.2526F, 0.2886F, 0.3005F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(43, 68).addBox(-0.8844F, -2.2026F, -1.9162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 0.9472F, 0.2886F, 0.3005F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(53, 12).addBox(-1.0409F, -1.1125F, -3.6839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4576F, 3.0883F, 1.2216F, -3.0241F, -0.3159F, 0.2753F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(61, 38).addBox(-0.5F, -1.5F, 0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1496F, 3.029F, 0.1461F, -2.718F, 0.2886F, 0.3005F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(95, 106).addBox(-0.05F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2996F, 3.113F, -3.7602F, -2.4095F, -0.3515F, -1.1143F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(88, 52).addBox(0.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.549F, 5.3078F, -3.4125F, -2.3996F, -0.1604F, -1.1174F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(16, 54).addBox(-2.0F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3845F, 5.7771F, -3.6984F, -2.5367F, -0.2899F, -0.5118F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(63, 74).addBox(-0.9669F, -2.174F, -1.6604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6886F, 2.6967F, -0.6548F, -2.8096F, -0.0123F, 0.3924F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(50, 87).addBox(-1.0409F, -0.2183F, -1.4032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4576F, 3.0883F, 1.2216F, 2.6482F, -0.3159F, 0.2753F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(81, 27).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4898F, 1.9213F, 0.4235F, 1.3792F, -0.0123F, 0.3924F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(56, 83).addBox(-0.9669F, 0.756F, -0.9111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6886F, 2.6967F, -0.6548F, 2.0337F, -0.0123F, 0.3924F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(74, 29).addBox(-0.5F, -0.75F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5895F, -1.9272F, -0.4314F, 1.9875F, 0.2439F, -0.0576F));

		PartDefinition bone12 = chest.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5871F, 3.0945F, -1.2202F, -0.3203F, 0.0414F, 0.1242F));

		PartDefinition cube_r112 = bone12.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(17, 75).mirror().addBox(-0.5F, -1.15F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2169F, -3.9032F, 2.6496F, 0.1375F, -0.2439F, 0.0576F));

		PartDefinition cube_r113 = bone12.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(21, 14).mirror().addBox(-0.5309F, -0.203F, -3.7583F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5983F, 1.0703F, 0.8792F, -0.2439F, 0.0576F));

		PartDefinition cube_r114 = bone12.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-0.5309F, -0.214F, 1.7295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5983F, 1.0703F, 0.7483F, -0.2439F, 0.0576F));

		PartDefinition cube_r115 = bone12.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.5F, -0.4F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.354F, -5.5442F, 3.58F, 0.2247F, -0.2439F, 0.0576F));

		PartDefinition cube_r116 = bone12.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.5F, -0.675F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, -4.715F, 1.639F, 0.312F, -0.2439F, 0.0576F));

		PartDefinition cube_r117 = bone12.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.4659F, -4.5618F, -0.2112F, 0.8007F, -0.2439F, 0.0576F));

		PartDefinition cube_r118 = bone12.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(97, 47).mirror().addBox(-0.5565F, -2.3754F, -0.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5983F, 1.0703F, 0.4953F, -0.2439F, 0.0576F));

		PartDefinition cube_r119 = bone12.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5565F, -1.4502F, -4.5154F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5983F, 1.0703F, 1.1061F, -0.2439F, 0.0576F));

		PartDefinition cube_r120 = bone12.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(70, 74).mirror().addBox(-0.1156F, -3.5078F, -4.1741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 1.5581F, -0.2886F, -0.3005F));

		PartDefinition cube_r121 = bone12.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(21, 69).mirror().addBox(-0.1156F, -2.6738F, -3.1197F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 1.2526F, -0.2886F, -0.3005F));

		PartDefinition cube_r122 = bone12.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(43, 68).mirror().addBox(-0.1156F, -2.2026F, -1.9162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 0.9472F, -0.2886F, -0.3005F));

		PartDefinition cube_r123 = bone12.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(0.0409F, -1.1125F, -3.6839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0883F, 1.2216F, -3.0241F, 0.3159F, -0.2753F));

		PartDefinition cube_r124 = bone12.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(61, 38).mirror().addBox(-0.5F, -1.5F, 0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1496F, 3.029F, 0.1461F, -2.718F, -0.2886F, -0.3005F));

		PartDefinition cube_r125 = bone12.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(95, 106).mirror().addBox(-0.95F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2996F, 3.113F, -3.7602F, -2.4095F, 0.3515F, 1.1143F));

		PartDefinition cube_r126 = bone12.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 52).mirror().addBox(-2.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.549F, 5.3078F, -3.4125F, -2.3996F, 0.1604F, 1.1174F));

		PartDefinition cube_r127 = bone12.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(16, 54).mirror().addBox(-1.0F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3845F, 5.7771F, -3.6984F, -2.5367F, 0.2899F, 0.5118F));

		PartDefinition cube_r128 = bone12.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(63, 74).mirror().addBox(-0.0331F, -2.174F, -1.6604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6886F, 2.6967F, -0.6548F, -2.8096F, 0.0123F, -0.3924F));

		PartDefinition cube_r129 = bone12.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(0.0409F, -0.2183F, -1.4032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0883F, 1.2216F, 2.6482F, 0.3159F, -0.2753F));

		PartDefinition cube_r130 = bone12.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(81, 27).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4898F, 1.9213F, 0.4235F, 1.3792F, 0.0123F, -0.3924F));

		PartDefinition cube_r131 = bone12.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(56, 83).mirror().addBox(-0.0331F, 0.756F, -0.9111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6886F, 2.6967F, -0.6548F, 2.0337F, 0.0123F, -0.3924F));

		PartDefinition cube_r132 = bone12.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(74, 29).mirror().addBox(-0.5F, -0.75F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5895F, -1.9272F, -0.4314F, 1.9875F, -0.2439F, 0.0576F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.7596F, -5.9227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3591F, -3.9996F, 0.1087F, 0.13F, 0.0153F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(9, 114).addBox(0.0F, -0.95F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(62, 107).addBox(0.0F, -2.85F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r133 = Neck.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.525F, -0.43F, -3.781F, 0.2747F, 0.3459F, -0.6464F));

		PartDefinition cube_r134 = Neck.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 81).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.525F, -0.43F, -3.781F, 0.3687F, 0.1381F, -0.2266F));

		PartDefinition cube_r135 = Neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.3687F, 0.1381F, -0.2266F));

		PartDefinition cube_r136 = Neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(97, 9).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.2747F, 0.3459F, -0.6464F));

		PartDefinition cube_r137 = Neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(95, 58).mirror().addBox(-4.7578F, -3.4248F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.0202F, 0.4378F, -1.2923F));

		PartDefinition cube_r138 = Neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(66, 4).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -0.43F, -3.781F, 0.2747F, -0.3459F, 0.6464F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(45, 81).addBox(1.5591F, -0.169F, -0.3143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -0.43F, -3.781F, 0.3687F, -0.1381F, 0.2266F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(98, 0).addBox(0.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.3687F, -0.1381F, 0.2266F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(97, 9).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.2747F, -0.3459F, 0.6464F));

		PartDefinition cube_r142 = Neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(95, 58).addBox(2.7578F, -3.4248F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.0202F, -0.4378F, 1.2923F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 34).addBox(-2.49F, -3.0963F, -2.2414F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(106, 99).addBox(-0.49F, -3.1213F, -1.7414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(21, 23).addBox(-3.49F, 0.5317F, -1.8449F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.01F, -0.4198F, -6.3283F, 0.2256F, 0.139F, -0.1556F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(102, 48).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.49F, -1.36F, -13.7505F, 0.829F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(104, 74).addBox(-0.5F, 0.0178F, -0.0153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -1.3826F, -13.7442F, 0.4014F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(100, 106).addBox(-0.5F, -0.2376F, 0.9558F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -1.3826F, -13.7442F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(70, 37).mirror().addBox(-2.0F, -0.9648F, -0.0369F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.01F, -0.9248F, -11.8205F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(69, 66).addBox(0.0F, -0.6408F, 1.8045F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.99F, -0.9248F, -11.8205F, 0.2007F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(62, 6).addBox(-0.5F, -0.0578F, -0.0125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, -2.247F, -8.359F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(55, 24).addBox(-1.5F, 0.0081F, -0.0817F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 44).addBox(-1.5F, 0.0081F, 0.2183F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -2.8986F, -6.4488F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(48, 44).addBox(-2.0F, -0.1273F, 2.2146F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -2.8986F, -6.4488F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, -7.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, 0.8614F, -6.6181F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(13, 48).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -2.3947F, 1.1671F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.0881F, 1.851F, -1.3852F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(71, 108).addBox(-1.1F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.7025F, -2.5168F, -13.0843F, -1.6274F, 1.3435F, -1.6289F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(71, 108).addBox(-2.3198F, -0.8815F, -4.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.2F, -2.1F, -12.975F, -0.6353F, 1.182F, -0.5987F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(84, 0).addBox(-1.4286F, -0.8734F, -0.81F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0393F, -2.1762F, -11.5039F, 0.1307F, 0.6539F, 0.4275F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(108, 70).addBox(-0.0684F, -0.4707F, -0.81F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0393F, -2.1762F, -11.5039F, -0.2661F, 0.6169F, -0.2257F));

		PartDefinition cube_r147 = leftFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(33, 89).addBox(-1.4078F, -0.8759F, -0.0914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0393F, -2.1762F, -11.5039F, -0.0341F, 0.3896F, 0.4029F));

		PartDefinition cube_r148 = leftFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 104).addBox(-0.0533F, -0.4707F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.0393F, -2.1762F, -11.5039F, -0.228F, 0.3205F, -0.1423F));

		PartDefinition cube_r149 = leftFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(72, 52).addBox(-1.7785F, -0.7526F, -1.3371F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.6679F, -0.108F, 0.2245F, 0.5012F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(15, 108).addBox(0.7806F, 0.0493F, -6.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.15F, 0.85F, 1.4F, -0.2191F, 0.2846F, -0.0676F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(111, 15).addBox(-0.85F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(15, 111).addBox(-0.85F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.801F, -0.2435F, -6.3743F, -0.2191F, 0.2846F, -0.0676F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(10, 108).addBox(-0.8273F, 0.6062F, -1.5509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 108).addBox(-0.8273F, 0.6062F, -2.3509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.5892F, -1.2F, -5.6133F, -0.284F, 0.4897F, -0.096F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(108, 0).addBox(-0.8383F, 0.1248F, -1.1916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.5142F, -1.2F, -7.4133F, -0.2894F, 0.5028F, -0.129F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(107, 89).addBox(-0.8341F, -0.5F, -1.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.7235F, -0.6198F, -7.7876F, -0.2819F, 0.4509F, -0.1255F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(106, 33).addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.7721F, -1.0557F, -9.2513F, -0.2662F, 0.3164F, -0.1539F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(53, 98).addBox(-0.5F, -1.4F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.6003F, -1.1059F, -11.2238F, -0.2666F, 0.9192F, -0.2597F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(66, 106).addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.3767F, -0.5428F, -6.3268F, -0.3203F, 0.6117F, -0.2109F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(107, 60).addBox(-0.575F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.6389F, -0.1796F, -7.013F, -0.9388F, 1.2496F, -0.9415F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(98, 51).addBox(0.5F, -1.3F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.2548F, -0.2602F, -7.4977F, -0.1396F, 0.4563F, -0.0817F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(106, 30).addBox(-0.265F, 0.1079F, -0.4894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.7679F, -0.2574F, 0.19F, -0.1189F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(103, 51).addBox(2.155F, -0.29F, -4.4617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.3343F, -1.2187F, -9.3148F, -0.901F, 1.2343F, -0.8728F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(104, 5).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.9441F, -1.8197F, -12.3695F, -0.4085F, 0.8611F, -0.3172F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(28, 103).addBox(0.043F, 0.0749F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0393F, -2.1762F, -11.5039F, -0.2938F, 0.5505F, -0.2374F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(107, 57).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.3254F, -1.5234F, -11.2886F, -0.2799F, 0.3577F, -0.1003F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(26, 106).addBox(-0.215F, 0.1079F, -1.3394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.6679F, -0.2491F, 0.1206F, -0.1176F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(18, 80).addBox(-0.3912F, -0.4947F, -1.3371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.6679F, -0.216F, 0.1243F, -0.1022F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(92, 65).addBox(-1.9045F, -0.6861F, 0.1542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.7679F, 0.0406F, 0.4282F, 0.5447F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(107, 48).addBox(-0.5151F, -0.4947F, 0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.2516F, -1.7854F, -9.7679F, -0.2346F, 0.3637F, -0.1445F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(16, 63).addBox(-3.2397F, -0.481F, -2.0013F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5142F, -1.2F, -7.4133F, 0.1383F, 0.5646F, 0.6266F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(85, 64).addBox(-0.9066F, -0.5293F, -2.0013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5142F, -1.2F, -7.4133F, -0.2623F, 0.5229F, -0.1212F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(60, 62).addBox(-2.8921F, 0.089F, -2.0219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5892F, -1.2F, -5.6133F, 0.0262F, 0.5915F, 0.672F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(38, 85).addBox(-0.9974F, 0.1631F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5892F, -1.2F, -5.6133F, -0.3978F, 0.4497F, -0.1122F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(36, 16).addBox(-3.8657F, -1.4851F, -7.4489F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 0.85F, 1.4F, 0.0485F, 0.3732F, 0.7075F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 57).addBox(-0.1664F, -0.3607F, -7.4489F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 0.85F, 1.4F, -0.2198F, 0.3078F, -0.0602F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(36, 94).addBox(-1.6606F, -0.82F, -4.7442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.15F, 0.85F, 1.4F, -0.0872F, 0.211F, 0.7267F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(93, 32).addBox(-1.1862F, -0.354F, -4.7442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.15F, 0.85F, 1.4F, -0.2092F, 0.0916F, -0.0416F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(88, 26).addBox(-2.3346F, -0.8201F, 2.9724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.85F, -1.6F, -0.0062F, 0.0039F, 0.5602F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(93, 91).addBox(-1.5898F, -0.3713F, 3.0406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.85F, -1.6F, 0.1346F, -0.0681F, -0.0258F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(66, 0).addBox(-2.2995F, -0.7816F, -0.2688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.85F, 2.2F, -0.5487F, -0.0214F, 0.5504F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(73, 4).addBox(-1.8975F, -0.8307F, -0.2688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.85F, 2.2F, -0.4858F, -0.2669F, 0.1221F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(49, 7).addBox(2.6963F, 0.0764F, -0.4266F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0691F, 0.1214F, 1.1041F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(50, 52).addBox(-5.037F, -0.05F, 1.0865F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -3.0307F, 0.9634F, -1.8945F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(63, 33).addBox(-3.9662F, -0.05F, 1.2896F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -2.6704F, 1.4312F, -1.5184F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(78, 70).addBox(-2.5092F, -0.05F, 2.3313F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.1346F, 1.0807F, 1.0369F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(78, 13).addBox(-1.5606F, -0.05F, 2.0489F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0852F, 0.7336F, 1.0988F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(18, 105).addBox(-1.0775F, -0.0492F, -1.5927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -2.5462F, -1.4579F, -2.5956F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(89, 15).addBox(-0.871F, -0.0492F, -1.9232F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.2925F, -1.3499F, 1.4242F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(65, 29).addBox(-0.5F, -0.5F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6977F, -1.6033F, 3.207F, -0.0748F, 0.0401F, 1.1427F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(75, 0).addBox(2.652F, 0.0391F, -2.1871F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0775F, -0.6158F, 1.1483F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(89, 3).addBox(0.8306F, -0.0492F, -1.953F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0732F, -0.5288F, 1.1754F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(87, 68).addBox(1.1582F, -0.0492F, 1.0734F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0638F, -0.1369F, 1.1471F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(73, 16).addBox(0.6077F, -0.0492F, 0.0781F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0641F, 0.1679F, 1.1277F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(37, 52).addBox(-0.1031F, -0.05F, -0.4266F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.0637F, 0.1243F, 1.1479F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(23, 93).addBox(-2.7865F, -0.8623F, -0.0093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.85F, -2.475F, -0.0603F, 0.1684F, 0.7791F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(94, 11).addBox(-1.9667F, -1.1666F, -0.0093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.85F, -2.475F, -0.1604F, 0.0793F, 0.0098F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(85, 7).addBox(-0.971F, -0.0788F, -2.0919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.8767F, -0.7571F, 0.009F, 0.2439F, -0.0153F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(103, 2).addBox(-0.3519F, 0.6071F, -0.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-5.5781F, -3.2109F, -12.3653F, 0.1234F, 0.7209F, -0.8462F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(13, 105).addBox(-0.9982F, 0.0242F, -0.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.6281F, -3.2572F, -12.2992F, 0.1084F, 0.4457F, -0.8117F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(8, 105).addBox(-0.7228F, -0.4587F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.6281F, -3.2109F, -11.1653F, 0.3997F, 0.2296F, 0.0176F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(106, 16).addBox(-0.3064F, -1.01F, -0.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.9992F, -2.8408F, -10.8753F, 0.7041F, 0.3336F, -0.8384F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(105, 102).addBox(-1.0163F, -0.5841F, 0.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.55F, -3.2615F, -10.5683F, -0.1012F, -0.1834F, -0.749F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(105, 83).addBox(-1.0277F, -0.585F, -0.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.55F, -3.2615F, -10.5683F, -0.0912F, 0.2822F, -0.7767F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(107, 45).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.2575F, -3.6831F, -10.9363F, -0.0974F, 0.2808F, -0.8233F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(44, 107).addBox(-1.003F, -0.2296F, 0.9571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.6281F, -3.2572F, -12.2992F, 0.142F, 0.2615F, 0.0207F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(49, 57).addBox(0.825F, 0.025F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.0774F, -3.7472F, -10.4799F, 0.1289F, 0.2021F, 0.8973F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(48, 38).addBox(0.025F, 0.025F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.0774F, -3.7472F, -10.4799F, 0.1262F, -0.0056F, 0.8706F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(56, 48).addBox(-0.025F, 0.025F, -0.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5614F, -4.1562F, -6.9595F, 0.1603F, -0.2184F, 1.0235F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(23, 96).addBox(-0.6595F, -1.3767F, 0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, -0.0389F, 0.1845F, -0.2613F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(98, 22).addBox(-0.6595F, -1.3128F, -0.4244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.092F, 0.1845F, -0.2613F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(0, 98).addBox(-0.6595F, -1.7734F, -1.138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.921F, 0.1845F, -0.2613F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(80, 97).addBox(-0.6595F, -1.3735F, -1.1302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(81, 52).addBox(-1.7102F, -1.7825F, -1.1626F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.3102F, 0.1845F, -0.2613F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(5, 54).addBox(-1.7102F, -2.0226F, -3.6617F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.572F, 0.1845F, -0.2613F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(43, 63).addBox(-1.7102F, -1.6511F, -0.6911F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.0047F, 0.1845F, -0.2613F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(71, 61).addBox(-1.7102F, -1.7968F, 1.0127F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, -0.1262F, 0.1845F, -0.2613F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(107, 42).addBox(-0.3749F, -0.8831F, 1.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, -0.0181F, 0.1478F, -0.474F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(75, 97).addBox(-0.5F, -0.525F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.8918F, -4.0208F, -2.1931F, -0.1926F, 0.1478F, -0.474F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(35, 71).addBox(-0.9441F, -0.0284F, -2.091F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.8767F, -0.7571F, -0.1074F, 0.2216F, -0.4385F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(84, 39).addBox(-0.9398F, -0.2974F, -4.1335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5758F, -4.8767F, -0.7571F, 0.1174F, 0.2596F, 0.0129F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(28, 37).addBox(-1.5F, -0.45F, -2.825F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6126F, -1.8285F, -0.3998F, 0.0462F, 0.208F, 0.9803F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(71, 57).addBox(-0.8236F, -0.4551F, -0.2231F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 2.9308F, 0.3616F, -2.2643F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(107, 27).addBox(-0.889F, -0.4551F, 0.9278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 2.8482F, 0.8274F, -2.4076F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(31, 84).addBox(-0.8785F, -0.4551F, 0.1071F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 2.4467F, 1.2602F, -2.8597F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(107, 24).addBox(-0.7004F, -0.4551F, 1.251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.6224F, 1.2284F, 1.5472F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(18, 84).addBox(-0.5837F, -0.4551F, 0.3008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.2815F, 0.7889F, 1.1552F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(16, 57).addBox(-0.4611F, -0.4801F, -1.7084F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.2078F, 0.3224F, 1.0196F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(13, 37).addBox(-1.5F, -0.075F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3656F, -2.6702F, -4.8483F, 0.1139F, 0.1984F, 0.8461F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(41, 48).addBox(-0.0229F, 0.0149F, -2.02F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5462F, -4.9329F, 1.1552F, -0.0003F, -0.0095F, 1.1538F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(97, 60).addBox(-0.5065F, -1.0826F, 0.6181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9964F, -3.3497F, -4.0265F, 0.0661F, 0.2102F, -0.4591F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(13, 43).addBox(-4.0468F, 0.0586F, 0.1263F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4973F, -0.1738F, -1.5299F, -0.0142F, 0.0948F, 0.7348F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(69, 70).addBox(-0.875F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(-3.1281F, -1.3249F, -7.2071F, -0.6353F, 1.1974F, -0.6016F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(0, 14).addBox(2.4661F, 4.7639F, -12.3849F, 2.0F, 1.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.2449F, 0.4677F, -0.0598F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(27, 0).addBox(-0.1023F, 4.7639F, -5.7955F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.2182F, 0.0F, 0.0524F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5417F, -0.4461F, 0.0297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3089F, -3.3634F, -8.8077F, 0.1482F, 0.1823F, -0.081F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(90, 29).addBox(-0.747F, -0.1146F, 0.9442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -0.2294F, -0.9122F, 0.235F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(84, 43).addBox(0.5688F, -0.1146F, -0.0137F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.7767F, 1.5429F, -1.6328F, -1.4309F, 1.6858F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(5, 60).addBox(-1.9862F, -1.0173F, 0.1263F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4F, 0.85F, -1.6F, -0.0738F, 0.0613F, 0.0045F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.0681F, 1.851F, -1.3852F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(71, 108).mirror().addBox(1.3198F, -0.8815F, -4.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.2F, -2.1F, -12.975F, -0.6353F, -1.182F, 0.5987F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5714F, -0.8734F, -0.81F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0393F, -2.1762F, -11.5039F, 0.1307F, -0.6539F, -0.4275F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(108, 70).mirror().addBox(-0.9316F, -0.4707F, -0.81F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0393F, -2.1762F, -11.5039F, -0.2661F, -0.6169F, 0.2257F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(33, 89).mirror().addBox(-0.5922F, -0.8759F, -0.0914F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0393F, -2.1762F, -11.5039F, -0.0341F, -0.3896F, -0.4029F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(44, 104).mirror().addBox(-0.9467F, -0.4707F, -0.0914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.0393F, -2.1762F, -11.5039F, -0.228F, -0.3205F, 0.1423F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(72, 52).mirror().addBox(-0.2215F, -0.7526F, -1.3371F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.6679F, -0.108F, -0.2245F, -0.5012F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(15, 108).mirror().addBox(-1.7806F, 0.0493F, -6.2876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.85F, 1.4F, -0.2191F, -0.2846F, 0.0676F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(111, 15).mirror().addBox(-0.15F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 111).mirror().addBox(-0.15F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.801F, -0.2435F, -6.3743F, -0.2191F, -0.2846F, 0.0676F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(10, 108).mirror().addBox(-0.1727F, 0.6062F, -1.5509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 108).mirror().addBox(-0.1727F, 0.6062F, -2.3509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.5892F, -1.2F, -5.6133F, -0.284F, -0.4897F, 0.096F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(108, 0).mirror().addBox(-0.1617F, 0.1248F, -1.1916F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.5142F, -1.2F, -7.4133F, -0.2894F, -0.5028F, 0.129F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(107, 89).mirror().addBox(-0.1659F, -0.5F, -1.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.7235F, -0.6198F, -7.7876F, -0.2819F, -0.4509F, 0.1255F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(106, 33).mirror().addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.7721F, -1.0557F, -9.2513F, -0.2662F, -0.3164F, 0.1539F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(53, 98).mirror().addBox(-0.5F, -1.4F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(5.6003F, -1.1059F, -11.2238F, -0.2666F, -0.9192F, 0.2597F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(66, 106).mirror().addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.3767F, -0.5428F, -6.3268F, -0.3203F, -0.6117F, 0.2109F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(107, 60).mirror().addBox(-0.425F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.6389F, -0.1796F, -7.013F, -0.9388F, -1.2496F, 0.9415F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(98, 51).mirror().addBox(-1.5F, -1.3F, 0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.2548F, -0.2602F, -7.4977F, -0.1396F, -0.4563F, 0.0817F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 30).mirror().addBox(-0.735F, 0.1079F, -0.4894F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.7679F, -0.2574F, -0.19F, 0.1189F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(103, 51).mirror().addBox(-3.155F, -0.29F, -4.4617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.3343F, -1.2187F, -9.3148F, -0.901F, -1.2343F, 0.8728F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(104, 5).mirror().addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.9441F, -1.8197F, -12.3695F, -0.4085F, -0.8611F, 0.3172F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(28, 103).mirror().addBox(-1.043F, 0.0749F, -0.4796F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.0393F, -2.1762F, -11.5039F, -0.2938F, -0.5505F, 0.2374F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(107, 57).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.3254F, -1.5234F, -11.2886F, -0.2799F, -0.3577F, 0.1003F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(26, 106).mirror().addBox(-0.785F, 0.1079F, -1.3394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.6679F, -0.2491F, -0.1206F, 0.1176F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(18, 80).mirror().addBox(-0.6088F, -0.4947F, -1.3371F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.6679F, -0.216F, -0.1243F, 0.1022F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(92, 65).mirror().addBox(-0.0955F, -0.6861F, 0.1542F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.7679F, 0.0406F, -0.4282F, -0.5447F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(107, 48).mirror().addBox(-0.4848F, -0.4947F, 0.1542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.2516F, -1.7854F, -9.7679F, -0.2346F, -0.3637F, 0.1445F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(16, 63).mirror().addBox(0.2397F, -0.481F, -2.0013F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5142F, -1.2F, -7.4133F, 0.1383F, -0.5646F, -0.6266F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(85, 64).mirror().addBox(-0.0934F, -0.5293F, -2.0013F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5142F, -1.2F, -7.4133F, -0.2623F, -0.5229F, 0.1212F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(60, 62).mirror().addBox(-0.1079F, 0.089F, -2.0219F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5892F, -1.2F, -5.6133F, 0.0262F, -0.5915F, -0.672F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(38, 85).mirror().addBox(-0.0026F, 0.1631F, -2.0206F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.5892F, -1.2F, -5.6133F, -0.3978F, -0.4497F, 0.1122F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(36, 16).mirror().addBox(-1.1343F, -1.4851F, -7.4489F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.85F, 1.4F, 0.0485F, -0.3732F, -0.7075F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(60, 57).mirror().addBox(-1.8336F, -0.3607F, -7.4489F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.85F, 1.4F, -0.2198F, -0.3078F, 0.0602F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(36, 94).mirror().addBox(-0.3394F, -0.82F, -4.7442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.85F, 1.4F, -0.0872F, -0.211F, -0.7267F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(93, 32).mirror().addBox(-0.8138F, -0.354F, -4.7442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.15F, 0.85F, 1.4F, -0.2092F, -0.0916F, 0.0416F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(88, 26).mirror().addBox(0.3346F, -0.8201F, 2.9724F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.85F, -1.6F, -0.0062F, -0.0039F, -0.5602F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.4102F, -0.3713F, 3.0406F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.85F, -1.6F, 0.1346F, 0.0681F, 0.0258F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(0.2995F, -0.7816F, -0.2688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.85F, 2.2F, -0.5487F, 0.0214F, -0.5504F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.1025F, -0.8307F, -0.2688F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.85F, 2.2F, -0.4858F, 0.2669F, -0.1221F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(49, 7).mirror().addBox(-5.6963F, 0.0764F, -0.4266F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0691F, -0.1214F, -1.1041F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(50, 52).mirror().addBox(2.037F, -0.05F, 1.0865F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -3.0307F, -0.9634F, 1.8945F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(63, 33).mirror().addBox(0.9662F, -0.05F, 1.2896F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -2.6704F, -1.4312F, 1.5184F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(78, 70).mirror().addBox(-0.4908F, -0.05F, 2.3313F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.1346F, -1.0807F, -1.0369F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(78, 13).mirror().addBox(-1.4394F, -0.05F, 2.0489F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0852F, -0.7336F, -1.0988F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(18, 105).mirror().addBox(0.0775F, -0.0492F, -1.5927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -2.5462F, 1.4579F, 2.5956F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(89, 15).mirror().addBox(-1.129F, -0.0492F, -1.9232F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.2925F, 1.3499F, -1.4242F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(65, 29).mirror().addBox(-1.5F, -0.5F, -1.225F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6977F, -1.6033F, 3.207F, -0.0748F, -0.0401F, -1.1427F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-5.652F, 0.0391F, -2.1871F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0775F, 0.6158F, -1.1483F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(89, 3).mirror().addBox(-2.8306F, -0.0492F, -1.953F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0732F, 0.5288F, -1.1754F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(87, 68).mirror().addBox(-3.1582F, -0.0492F, 1.0734F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0638F, 0.1369F, -1.1471F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(73, 16).mirror().addBox(-2.6077F, -0.0492F, 0.0781F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0641F, -0.1679F, -1.1277F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(37, 52).mirror().addBox(-2.8969F, -0.05F, -0.4266F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.0637F, -0.1243F, -1.1479F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(23, 93).mirror().addBox(0.7865F, -0.8623F, -0.0093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, 0.85F, -2.475F, -0.0603F, -0.1684F, -0.7791F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(94, 11).mirror().addBox(-0.0333F, -1.1666F, -0.0093F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, 0.85F, -2.475F, -0.1604F, -0.0793F, -0.0098F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(85, 7).mirror().addBox(-0.029F, -0.0788F, -2.0919F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.8767F, -0.7571F, 0.009F, -0.2439F, 0.0153F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(103, 2).mirror().addBox(-0.6481F, 0.6071F, -0.4501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(5.5781F, -3.2109F, -12.3653F, 0.1234F, -0.7209F, 0.8462F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(13, 105).mirror().addBox(-0.0018F, 0.0242F, -0.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.6281F, -3.2572F, -12.2992F, 0.1084F, -0.4457F, 0.8117F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(8, 105).mirror().addBox(-0.2772F, -0.4587F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.6281F, -3.2109F, -11.1653F, 0.3997F, -0.2296F, -0.0176F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(106, 16).mirror().addBox(-0.6936F, -1.01F, -0.7285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.9992F, -2.8408F, -10.8753F, 0.7041F, -0.3336F, 0.8384F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(105, 102).mirror().addBox(0.0163F, -0.5841F, 0.0062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.55F, -3.2615F, -10.5683F, -0.1012F, 0.1834F, 0.749F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(105, 83).mirror().addBox(0.0277F, -0.585F, -0.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.55F, -3.2615F, -10.5683F, -0.0912F, -0.2822F, 0.7767F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(107, 45).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.2575F, -3.6831F, -10.9363F, -0.0974F, -0.2808F, 0.8233F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(44, 107).mirror().addBox(0.003F, -0.2296F, 0.9571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.6281F, -3.2572F, -12.2992F, 0.142F, -0.2615F, -0.0207F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(49, 57).mirror().addBox(-1.825F, 0.025F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(4.0774F, -3.7472F, -10.4799F, 0.1289F, -0.2021F, -0.8973F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-2.025F, 0.025F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.0774F, -3.7472F, -10.4799F, 0.1262F, 0.0056F, -0.8706F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(56, 48).mirror().addBox(-2.975F, 0.025F, -0.075F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5614F, -4.1562F, -6.9595F, 0.1603F, 0.2184F, -1.0235F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(23, 96).mirror().addBox(-0.3405F, -1.3767F, 0.2993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, -0.0389F, -0.1845F, 0.2613F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(98, 22).mirror().addBox(-0.3405F, -1.3128F, -0.4244F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.092F, -0.1845F, 0.2613F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.3405F, -1.7734F, -1.138F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.921F, -0.1845F, 0.2613F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(80, 97).mirror().addBox(-0.3405F, -1.3735F, -1.1302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(81, 52).mirror().addBox(-0.2898F, -1.7825F, -1.1626F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.3102F, -0.1845F, 0.2613F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-0.2898F, -2.0226F, -3.6617F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.572F, -0.1845F, 0.2613F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(43, 63).mirror().addBox(-0.2898F, -1.6511F, -0.6911F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.0047F, -0.1845F, 0.2613F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(71, 61).mirror().addBox(-0.2898F, -1.7968F, 1.0127F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, -0.1262F, -0.1845F, 0.2613F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(107, 42).mirror().addBox(-0.6251F, -0.8831F, 1.312F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, -0.0181F, -0.1478F, 0.474F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(75, 97).mirror().addBox(-0.5F, -0.525F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.8918F, -4.0208F, -2.1931F, -0.1926F, -0.1478F, 0.474F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-0.0559F, -0.0284F, -2.091F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.8767F, -0.7571F, -0.1074F, -0.2216F, 0.4385F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-0.0602F, -0.2974F, -4.1335F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.8767F, -0.7571F, 0.1174F, -0.2596F, -0.0129F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(28, 37).mirror().addBox(-1.5F, -0.45F, -2.825F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6126F, -1.8285F, -0.3998F, 0.0462F, -0.208F, -0.9803F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(71, 57).mirror().addBox(-1.1764F, -0.4551F, -0.2231F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 2.9308F, -0.3616F, 2.2643F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(107, 27).mirror().addBox(-0.111F, -0.4551F, 0.9278F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 2.8482F, -0.8274F, 2.4076F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(31, 84).mirror().addBox(-0.1215F, -0.4551F, 0.1071F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 2.4467F, -1.2602F, 2.8597F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(107, 24).mirror().addBox(-0.2996F, -0.4551F, 1.251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.6224F, -1.2284F, -1.5472F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(18, 84).mirror().addBox(-0.4163F, -0.4551F, 0.3008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.2815F, -0.7889F, -1.1552F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(16, 57).mirror().addBox(-0.5389F, -0.4801F, -1.7084F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.2078F, -0.3224F, -1.0196F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(13, 37).mirror().addBox(-1.5F, -0.075F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3656F, -2.6702F, -4.8483F, 0.1139F, -0.1984F, -0.8461F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(-4.9771F, 0.0149F, -2.02F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5462F, -4.9329F, 1.1552F, -0.0003F, 0.0095F, -1.1538F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(97, 60).mirror().addBox(-0.4935F, -1.0826F, 0.6181F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9964F, -3.3497F, -4.0265F, 0.0661F, -0.2102F, 0.4591F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(13, 43).mirror().addBox(0.0468F, 0.0586F, 0.1263F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4973F, -0.1738F, -1.5299F, -0.0142F, -0.0948F, -0.7348F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(69, 70).mirror().addBox(-1.125F, -0.5F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(3.1281F, -1.3249F, -7.2071F, -0.6353F, -1.1974F, 0.6016F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-4.4661F, 4.7639F, -12.3849F, 2.0F, 1.0F, 8.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.2449F, -0.4677F, 0.0598F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-1.8977F, 4.7639F, -5.7955F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.2182F, 0.0F, -0.0524F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.4583F, -0.4461F, 0.0297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.3089F, -3.3634F, -8.8077F, 0.1482F, -0.1823F, 0.081F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(-1.253F, -0.1146F, 0.9442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -0.2294F, 0.9122F, -0.235F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(84, 43).mirror().addBox(-2.5688F, -0.1146F, -0.0137F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.7767F, 1.5429F, -1.6328F, 1.4309F, -1.6858F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-0.0138F, -1.0173F, 0.1263F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.85F, -1.6F, -0.0738F, -0.0613F, -0.0045F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.2235F, 1.4704F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r226 = jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(105, 108).mirror().addBox(-0.9836F, 0.7731F, -1.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(71, 105).mirror().addBox(-0.9836F, -0.0269F, -1.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.38F, -1.1872F, -13.3587F, -1.8202F, -0.2264F, 0.1939F));

		PartDefinition cube_r227 = jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(15, 24).mirror().addBox(-0.9836F, -0.0614F, -0.9624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.38F, -1.1872F, -13.3587F, -1.829F, -0.2264F, 0.1939F));

		PartDefinition cube_r228 = jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(104, 13).mirror().addBox(-0.3899F, 0.907F, -0.9661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.78F, -1.7872F, -15.4587F, -2.4731F, -1.1475F, 0.8718F));

		PartDefinition cube_r229 = jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(103, 93).mirror().addBox(0.0083F, -0.0485F, -0.9661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.78F, -1.7872F, -15.4587F, -2.0529F, -0.8019F, 0.3746F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-0.5169F, -0.9965F, -0.245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.0269F, -1.7412F, -12.4186F, -1.8536F, -0.2572F, 0.2001F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(110, 102).mirror().addBox(-0.8748F, -0.2222F, -1.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.08F, -0.6872F, -11.6587F, -1.9167F, -0.602F, 0.2298F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(49, 106).mirror().addBox(0.0334F, 0.9495F, -0.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.88F, -0.6872F, -10.2587F, -1.8832F, -0.4743F, 0.2127F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(84, 102).mirror().addBox(0.0334F, 0.2081F, -0.5764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.88F, -0.6872F, -10.2587F, -1.9705F, -0.4743F, 0.2127F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(106, 39).mirror().addBox(0.0334F, -0.0156F, -0.7351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.88F, -0.6872F, -10.2587F, -1.9094F, -0.4743F, 0.2127F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(0.1751F, 0.0268F, -0.2625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.78F, -0.6872F, -8.3587F, -1.8857F, -0.3718F, 0.2029F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(102, 57).mirror().addBox(0.1751F, 0.2149F, 0.1168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.78F, -0.6872F, -8.3587F, -1.9904F, -0.3718F, 0.2029F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(66, 103).mirror().addBox(-0.122F, 0.6259F, -1.4291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.78F, -1.7872F, -15.4587F, -2.2269F, -1.0244F, 0.6036F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(104, 8).mirror().addBox(-0.0249F, -0.209F, -1.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.78F, -1.7872F, -15.4587F, -2.0619F, -0.7872F, 0.472F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(108, 92).mirror().addBox(-0.5169F, 0.2441F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(76, 105).mirror().addBox(-0.5169F, -0.5559F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0269F, -1.7412F, -12.4186F, -1.8449F, -0.2572F, 0.2001F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(104, 64).mirror().addBox(-0.4431F, -1.2516F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0269F, -1.7412F, -12.4186F, -1.8569F, -0.383F, 0.2382F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(10, 111).mirror().addBox(0.0334F, 0.9854F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(110, 82).mirror().addBox(0.0334F, 0.1854F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.88F, -0.6872F, -10.2587F, -1.8745F, -0.4743F, 0.2127F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(76, 108).mirror().addBox(0.1928F, 1.436F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.78F, -0.6872F, -8.3587F, -1.8361F, -0.3034F, 0.198F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(105, 77).mirror().addBox(0.1928F, 0.6332F, -0.7974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(111, 30).mirror().addBox(0.1928F, -0.1668F, -0.7974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.78F, -0.6872F, -8.3587F, -1.8535F, -0.3034F, 0.198F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(110, 79).mirror().addBox(-0.3209F, 2.6359F, -0.7154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.38F, 0.1128F, -4.8587F, -1.8464F, -0.2692F, 0.196F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(96, 98).mirror().addBox(-0.3209F, 1.6319F, -0.3135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.38F, 0.1128F, -4.8587F, -1.8115F, -0.2692F, 0.196F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(96, 35).mirror().addBox(-0.3209F, 1.7433F, 0.7954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.38F, 0.1128F, -4.8587F, -2.0122F, -0.2692F, 0.196F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(96, 70).mirror().addBox(0.0147F, -0.2721F, 0.1464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 96).mirror().addBox(0.0147F, -0.2721F, 0.8964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.38F, 0.1128F, -4.8587F, -2.0523F, -0.0785F, 0.0874F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(43, 96).mirror().addBox(0.0147F, -0.3897F, -0.6394F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.38F, 0.1128F, -4.8587F, -1.5985F, -0.0785F, 0.0874F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(5, 49).mirror().addBox(-0.1859F, 2.2216F, 1.4512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.28F, 0.1128F, -0.3587F, -1.9199F, -0.0087F, 0.0F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(85, 98).mirror().addBox(-0.1859F, 2.1774F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.28F, 0.1128F, -0.3587F, -1.7017F, -0.0087F, 0.0F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(101, 98).mirror().addBox(-0.2F, -0.0826F, 0.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -2.0508F, 0.2618F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(95, 81).mirror().addBox(-0.0346F, 0.0967F, -0.5747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.28F, 0.1128F, -0.3587F, -1.4399F, 0.1222F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(27, 7).mirror().addBox(-0.1859F, 1.1566F, -0.3766F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.28F, 0.1128F, -0.3587F, -1.6144F, -0.0087F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(79, 34).mirror().addBox(-0.0346F, 0.0943F, -0.0268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.28F, 0.1128F, -0.3587F, -1.2217F, 0.1222F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(76, 81).mirror().addBox(-0.2F, 1.0326F, -1.1819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -0.9163F, 0.2618F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(110, 76).mirror().addBox(-0.2F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -0.829F, 0.2618F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(105, 108).addBox(-0.0164F, 0.7731F, -1.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(71, 105).addBox(-0.0164F, -0.0269F, -1.4423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4F, -1.1872F, -13.3587F, -1.8202F, 0.2264F, -0.1939F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(15, 24).addBox(-0.0164F, -0.0614F, -0.9624F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.4F, -1.1872F, -13.3587F, -1.829F, 0.2264F, -0.1939F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(104, 13).addBox(-0.6101F, 0.907F, -0.9661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.8F, -1.7872F, -15.4587F, -2.4731F, 1.1475F, -0.8718F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(103, 93).addBox(-1.0083F, -0.0485F, -0.9661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8F, -1.7872F, -15.4587F, -2.0529F, 0.8019F, -0.3746F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 102).addBox(-0.4831F, -0.9965F, -0.245F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0469F, -1.7412F, -12.4186F, -1.8536F, 0.2572F, -0.2001F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(110, 102).addBox(-0.1252F, -0.2222F, -1.0612F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.1F, -0.6872F, -11.6587F, -1.9167F, 0.602F, -0.2298F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(49, 106).addBox(-1.0334F, 0.9495F, -0.7666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.9F, -0.6872F, -10.2587F, -1.8832F, 0.4743F, -0.2127F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(84, 102).addBox(-1.0334F, 0.2081F, -0.5764F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9F, -0.6872F, -10.2587F, -1.9705F, 0.4743F, -0.2127F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(106, 39).addBox(-1.0334F, -0.0156F, -0.7351F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.9F, -0.6872F, -10.2587F, -1.9094F, 0.4743F, -0.2127F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(96, 39).addBox(-1.1751F, 0.0268F, -0.2625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.8F, -0.6872F, -8.3587F, -1.8857F, 0.3718F, -0.2029F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(102, 57).addBox(-1.1751F, 0.2149F, 0.1168F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.8F, -0.6872F, -8.3587F, -1.9904F, 0.3718F, -0.2029F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(102, 88).addBox(-0.5F, -0.6F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0549F, -2.7038F, -15.5487F, 2.9981F, 1.2448F, -1.744F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 103).addBox(-0.878F, 0.6259F, -1.4291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -1.7872F, -15.4587F, -2.2269F, 1.0244F, -0.6036F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(104, 8).addBox(-0.9751F, -0.209F, -1.4868F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.8F, -1.7872F, -15.4587F, -2.0619F, 0.7872F, -0.472F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(108, 92).addBox(-0.4831F, 0.2441F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 105).addBox(-0.4831F, -0.5559F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0469F, -1.7412F, -12.4186F, -1.8449F, 0.2572F, -0.2001F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(104, 64).addBox(-0.5569F, -1.2516F, -0.7341F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0469F, -1.7412F, -12.4186F, -1.8569F, 0.383F, -0.2382F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(10, 111).addBox(-1.0334F, 0.9854F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(110, 82).addBox(-1.0334F, 0.1854F, -1.2832F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.9F, -0.6872F, -10.2587F, -1.8745F, 0.4743F, -0.2127F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(76, 108).addBox(-1.1928F, 1.436F, -0.8871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.8F, -0.6872F, -8.3587F, -1.8361F, 0.3034F, -0.198F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(105, 77).addBox(-1.1928F, 0.6332F, -0.7974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(111, 30).addBox(-1.1928F, -0.1668F, -0.7974F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.8F, -0.6872F, -8.3587F, -1.8535F, 0.3034F, -0.198F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(110, 79).addBox(-0.6791F, 2.6359F, -0.7154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.4F, 0.1128F, -4.8587F, -1.8464F, 0.2692F, -0.196F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(96, 98).addBox(-0.6791F, 1.6319F, -0.3135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.4F, 0.1128F, -4.8587F, -1.8115F, 0.2692F, -0.196F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(96, 35).addBox(-0.6791F, 1.7433F, 0.7954F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.4F, 0.1128F, -4.8587F, -2.0122F, 0.2692F, -0.196F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(96, 70).addBox(-1.0147F, -0.2721F, 0.1464F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 96).addBox(-1.0147F, -0.2721F, 0.8964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.4F, 0.1128F, -4.8587F, -2.0523F, 0.0785F, -0.0874F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(43, 96).addBox(-1.0147F, -0.3897F, -0.6394F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.4F, 0.1128F, -4.8587F, -1.5985F, 0.0785F, -0.0874F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(5, 49).addBox(-0.8141F, 2.2216F, 1.4512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.1128F, -0.3587F, -1.9199F, 0.0087F, 0.0F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(85, 98).addBox(-0.8141F, 2.1774F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.3F, 0.1128F, -0.3587F, -1.7017F, 0.0087F, 0.0F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(101, 98).addBox(-0.8F, -0.0826F, 0.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -2.0508F, -0.2618F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(95, 81).addBox(-0.9654F, 0.0967F, -0.5747F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.3F, 0.1128F, -0.3587F, -1.4399F, -0.1222F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(27, 7).addBox(-0.8141F, 1.1566F, -0.3766F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.3F, 0.1128F, -0.3587F, -1.6144F, 0.0087F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(79, 34).addBox(-0.9654F, 0.0943F, -0.0268F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.3F, 0.1128F, -0.3587F, -1.2217F, -0.1222F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(76, 81).addBox(-0.8F, 1.0326F, -1.1819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -0.9163F, -0.2618F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(110, 76).addBox(-0.8F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -0.829F, -0.2618F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.1895F, -0.2614F, 0.0152F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(114, 73).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(114, 67).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(114, 64).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9141F, 3.6744F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(114, 61).addBox(0.0F, -0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4598F, 0.7945F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(114, 33).addBox(0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(40, 21).mirror().addBox(-2.2F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0406F, -0.0247F, -0.0051F, 0.182F, -0.006F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(40, 21).addBox(0.2F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0406F, -0.0247F, -0.0051F, -0.182F, 0.006F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(63, 52).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(29, 114).addBox(0.0F, -0.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, -0.1137F, -0.3039F, -0.0314F));

		PartDefinition Tailbase_r8 = Tailmiddlebase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(114, 11).addBox(0.0F, 0.3473F, 0.9302F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3233F, -1.2898F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(27, 57).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, -0.032F, -0.3486F, -0.0189F));

		PartDefinition hindlegL2 = Hips.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6894F, 2.7466F, -1.4043F, -1.3459F, -0.3357F, -1.5362F));

		PartDefinition cube_r289 = hindlegL2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(109, 3).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(110, 105).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5259F, -0.2775F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r290 = hindlegL2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(86, 33).addBox(-0.5F, -1.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r291 = hindlegL2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(83, 85).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r292 = hindlegL2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(76, 85).addBox(-0.5F, 2.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r293 = hindlegL2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(83, 89).addBox(-0.3F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(76, 89).addBox(-0.3F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3193F, 2.1311F, -0.1375F, -0.0106F, -0.0138F, -0.9162F));

		PartDefinition cube_r294 = hindlegL2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(0, 109).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(99, 14).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.023F, 5.5176F, -0.1966F, -0.0162F, -0.0065F, -0.3839F));

		PartDefinition cube_r295 = hindlegL2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 41).addBox(-1.0F, -1.7F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5F, 3.4646F, -0.1608F, -0.0174F, -0.0015F, -0.0873F));

		PartDefinition cube_r296 = hindlegL2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(52, 63).addBox(5.0F, 0.0F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL5 = hindlegL2.addOrReplaceChild("hindlegL5", CubeListBuilder.create().texOffs(5, 81).addBox(-0.5F, -0.4849F, -1.5823F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8677F, 7.1136F, -0.122F, 0.399F, -0.1583F, 2.9064F));

		PartDefinition cube_r297 = hindlegL5.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(25, 109).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.5611F, 0.1246F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r298 = hindlegL5.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(99, 74).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 4.4454F, 1.1252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r299 = hindlegL5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(66, 99).addBox(-0.5022F, -0.1559F, -0.2112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0022F, 2.0717F, 1.0316F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r300 = hindlegL5.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(20, 109).addBox(-0.5022F, -2.7939F, -1.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0022F, 2.0967F, 1.0566F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r301 = hindlegL5.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(90, 55).addBox(-0.5022F, -2.8345F, -0.2332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0022F, 2.0967F, 1.0566F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r302 = hindlegL5.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(40, 89).addBox(-0.4829F, -3.2578F, -0.6646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r303 = hindlegL5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(99, 64).addBox(-0.4829F, -2.9077F, -1.1273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r304 = hindlegL5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(109, 12).addBox(-0.4829F, -2.9919F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r305 = hindlegL5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(109, 9).addBox(-0.4829F, 1.3949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(109, 6).addBox(-0.4829F, 1.8949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r306 = hindlegL5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(28, 99).addBox(-0.4829F, 1.2659F, -0.9115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bone6 = hindlegL5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.153F, 5.3736F, 0.4297F, 0.0508F, -0.1803F, -1.9903F));

		PartDefinition cube_r307 = bone6.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r308 = bone9.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(36, 7).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6894F, 2.7466F, -1.4043F, -0.893F, 0.1084F, 1.5867F));

		PartDefinition cube_r309 = hindlegL3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(109, 3).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(110, 105).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5259F, -0.2775F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r310 = hindlegL3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.5F, -1.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r311 = hindlegL3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(83, 85).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r312 = hindlegL3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(76, 85).mirror().addBox(-0.5F, 2.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r313 = hindlegL3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(83, 89).mirror().addBox(-1.7F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(76, 89).mirror().addBox(-1.7F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3193F, 2.1311F, -0.1375F, -0.0106F, 0.0138F, 0.9162F));

		PartDefinition cube_r314 = hindlegL3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(0, 109).mirror().addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(99, 14).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.023F, 5.5176F, -0.1966F, -0.0162F, 0.0065F, 0.3839F));

		PartDefinition cube_r315 = hindlegL3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(72, 41).mirror().addBox(-1.0F, -1.7F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.4646F, -0.1608F, -0.0174F, 0.0015F, 0.0873F));

		PartDefinition cube_r316 = hindlegL3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(52, 63).mirror().addBox(-6.0F, 0.0F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.5F, -0.4849F, -1.5823F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8677F, 7.1136F, -0.122F, 1.0767F, 0.0718F, -2.7034F));

		PartDefinition cube_r317 = hindlegL4.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(25, 109).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5611F, 0.1246F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r318 = hindlegL4.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(99, 74).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4454F, 1.1252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r319 = hindlegL4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.4978F, -0.1559F, -0.2112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0717F, 1.0316F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r320 = hindlegL4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(20, 109).mirror().addBox(-0.4978F, -2.7939F, -1.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0967F, 1.0566F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r321 = hindlegL4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(90, 55).mirror().addBox(-0.4978F, -2.8345F, -0.2332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0967F, 1.0566F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r322 = hindlegL4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(-0.5171F, -3.2578F, -0.6646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r323 = hindlegL4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(99, 64).mirror().addBox(-0.5171F, -2.9077F, -1.1273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r324 = hindlegL4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-0.5171F, -2.9919F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r325 = hindlegL4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(109, 9).mirror().addBox(-0.5171F, 1.3949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(109, 6).mirror().addBox(-0.5171F, 1.8949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r326 = hindlegL4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(28, 99).mirror().addBox(-0.5171F, 1.2659F, -0.9115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.153F, 5.3736F, 0.4297F, -0.1848F, -0.0305F, -0.0186F));

		PartDefinition cube_r327 = bone7.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r328 = bone8.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(36, 7).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4142F, 0.6287F, -2.9893F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition cube_r329 = bone3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(89, 109).addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.6183F, 0.5094F, 2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r330 = bone3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(8, 101).addBox(-0.5F, -0.725F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, -1.4061F, 1.2058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(81, 109).addBox(-1.0F, 2.852F, 1.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -1.4877F, -0.0878F, 0.3248F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(109, 73).addBox(-1.0F, 3.7894F, -0.1684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -1.2085F, -0.0878F, 0.3248F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(65, 109).addBox(-1.0F, 2.5108F, -1.798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 100).addBox(-1.0F, 2.5108F, -1.648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -0.7722F, -0.0878F, 0.3248F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(63, 86).addBox(-1.0F, 1.4196F, -1.5228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -0.1177F, -0.0878F, 0.3248F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(100, 82).addBox(-1.0F, 0.4655F, -0.0828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.1005F, -0.0878F, 0.3248F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(100, 78).addBox(-1.0F, 0.5692F, 0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.2401F, -0.0878F, 0.3248F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(46, 100).addBox(-1.0F, 0.6936F, 1.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.3274F, -0.0878F, 0.3248F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, 0.0196F, -3.1923F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.2314F, -0.0878F, 0.3248F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(41, 100).addBox(-1.0F, 0.9521F, 1.9151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.4496F, -0.0878F, 0.3248F));

		PartDefinition cube_r340 = bone3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(109, 63).addBox(-1.0F, 2.7403F, 1.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.7812F, -0.0878F, 0.3248F));

		PartDefinition cube_r341 = bone3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(62, 90).addBox(-1.0F, 1.6383F, 0.2804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 1.3571F, -0.0878F, 0.3248F));

		PartDefinition cube_r342 = bone3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(49, 109).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(39, 109).addBox(-0.5F, 1.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1777F, 2.6408F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r343 = bone3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(102, 26).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 1.5651F, 0.5537F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r344 = bone3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(50, 72).addBox(-0.5F, -1.025F, -1.425F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.151F, 2.0642F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(24, 75).addBox(-0.5F, -0.625F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.9908F, 0.6078F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r346 = bone3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(23, 100).addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1F, -0.352F, 0.8725F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r347 = bone3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(106, 67).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.9643F, -1.0794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(110, 108).addBox(-0.5F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 2.3096F, -0.5163F, 2.0769F, 0.0F, 0.0F));

		PartDefinition bone13 = Hips.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4142F, 0.6287F, -2.9893F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition cube_r349 = bone13.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(89, 109).mirror().addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6183F, 0.5094F, 2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone13.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(8, 101).mirror().addBox(-0.5F, -0.725F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4061F, 1.2058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r351 = bone13.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(81, 109).mirror().addBox(0.0F, 2.852F, 1.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -1.4877F, 0.0878F, -0.3248F));

		PartDefinition cube_r352 = bone13.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(109, 73).mirror().addBox(0.0F, 3.7894F, -0.1684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -1.2085F, 0.0878F, -0.3248F));

		PartDefinition cube_r353 = bone13.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(65, 109).mirror().addBox(0.0F, 2.5108F, -1.798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 100).mirror().addBox(0.0F, 2.5108F, -1.648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -0.7722F, 0.0878F, -0.3248F));

		PartDefinition cube_r354 = bone13.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(63, 86).mirror().addBox(0.0F, 1.4196F, -1.5228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -0.1177F, 0.0878F, -0.3248F));

		PartDefinition cube_r355 = bone13.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(100, 82).mirror().addBox(0.0F, 0.4655F, -0.0828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.1005F, 0.0878F, -0.3248F));

		PartDefinition cube_r356 = bone13.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(100, 78).mirror().addBox(0.0F, 0.5692F, 0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.2401F, 0.0878F, -0.3248F));

		PartDefinition cube_r357 = bone13.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(46, 100).mirror().addBox(0.0F, 0.6936F, 1.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.3274F, 0.0878F, -0.3248F));

		PartDefinition cube_r358 = bone13.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(0.0F, 0.0196F, -3.1923F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.2314F, 0.0878F, -0.3248F));

		PartDefinition cube_r359 = bone13.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(41, 100).mirror().addBox(0.0F, 0.9521F, 1.9151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.4496F, 0.0878F, -0.3248F));

		PartDefinition cube_r360 = bone13.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(109, 63).mirror().addBox(0.0F, 2.7403F, 1.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.7812F, 0.0878F, -0.3248F));

		PartDefinition cube_r361 = bone13.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(0.0F, 1.6383F, 0.2804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 1.3571F, 0.0878F, -0.3248F));

		PartDefinition cube_r362 = bone13.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(49, 109).mirror().addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(39, 109).mirror().addBox(-0.5F, 1.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1777F, 2.6408F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r363 = bone13.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(102, 26).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5651F, 0.5537F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r364 = bone13.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(50, 72).mirror().addBox(-0.5F, -1.025F, -1.425F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.151F, 2.0642F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone13.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.5F, -0.625F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9908F, 0.6078F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r366 = bone13.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(23, 100).mirror().addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.352F, 0.8725F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r367 = bone13.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(106, 67).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.9643F, -1.0794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r368 = bone13.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(110, 108).mirror().addBox(-0.5F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.3096F, -0.5163F, 2.0769F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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