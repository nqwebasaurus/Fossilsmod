package fossils.fossils.client.blockentity.model.cacops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CacopsFossilModel extends SkullModelBase {
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

	public CacopsFossilModel(ModelPart root) {
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

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(52, 48).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -3.9168F, 13.4065F, -0.3349F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(46, 74).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -1.4109F, -0.096F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(11, 51).addBox(0.0F, -2.0F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.5109F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 30).mirror().addBox(-2.6644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.5011F, -0.9717F, 0.1668F, 0.0463F, -0.4857F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-2.6644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.5011F, -2.9717F, 0.1469F, 0.0842F, -0.4782F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 30).addBox(0.6643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.5011F, -0.9717F, 0.1668F, -0.0463F, 0.4857F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 88).addBox(0.6643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.5011F, -2.9717F, 0.1469F, -0.0842F, 0.4782F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(11, 55).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, -0.0081F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(76, 99).addBox(0.0F, -1.9121F, 0.1978F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(48, 94).addBox(0.0F, -2.0551F, -0.0364F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-2.1644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2126F, -1.6602F, 0.1788F, 0.0238F, -0.4912F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(86, 74).mirror().addBox(-2.2643F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2126F, -3.6602F, 0.1668F, 0.0464F, -0.4861F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(89, 4).addBox(0.1644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2126F, -1.6602F, 0.1788F, -0.0238F, 0.4912F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 74).addBox(0.2644F, -0.0334F, -0.44F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2126F, -3.6602F, 0.1668F, -0.0464F, 0.4861F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(39, 53).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0087F, 0.0436F, 0.0004F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(72, 93).addBox(0.0F, -2.4016F, 0.0359F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(7, 66).addBox(0.0F, -3.2516F, 0.0359F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -4.0F, -0.0785F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(78, 62).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.2F, -4.4F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-2.758F, -0.9954F, -0.5612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2216F, -1.5604F, 0.0903F, 0.2043F, -0.9236F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 54).mirror().addBox(-2.0413F, -0.1267F, -0.4413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.2216F, -1.5604F, 0.1469F, 0.0842F, -0.4782F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(86, 72).mirror().addBox(-2.4233F, -0.3131F, -0.4348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0784F, -3.4604F, 0.2319F, 0.1055F, -0.4527F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-4.02F, -1.3299F, -0.5738F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0784F, -3.4604F, 0.1595F, 0.2598F, -0.8902F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(86, 54).addBox(0.0413F, -0.1267F, -0.4413F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2216F, -1.5604F, 0.1469F, -0.0842F, 0.4782F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 72).addBox(1.758F, -0.9954F, -0.5612F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.2216F, -1.5604F, 0.0903F, -0.2043F, 0.9236F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(81, 46).addBox(2.02F, -1.3299F, -0.5738F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0784F, -3.4604F, 0.1595F, -0.2598F, 0.8902F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(86, 72).addBox(0.4233F, -0.3131F, -0.4348F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0784F, -3.4604F, 0.2319F, -0.1055F, 0.4527F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(41, 36).addBox(-0.4F, -0.4874F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.1166F, 0.0867F, 0.0101F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(44, 88).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.1874F, -2.0045F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(35, 90).addBox(0.0F, -4.1F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Bodyfront.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-2.5987F, -0.1394F, -0.4841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.0234F, -1.5604F, 0.3602F, 0.1361F, -0.4547F));

		PartDefinition cube_r18 = Bodyfront.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(27, 86).mirror().addBox(-4.25F, -1.25F, -0.6376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.175F, -0.0234F, -1.5604F, 0.2673F, 0.3406F, -0.8757F));

		PartDefinition cube_r19 = Bodyfront.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 6).mirror().addBox(-3.671F, -3.4325F, -0.6008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.0508F, 0.5299F, -1.3304F));

		PartDefinition cube_r20 = Bodyfront.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(46, 78).mirror().addBox(-2.5314F, -0.2452F, -0.4538F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.4635F, 0.159F, -0.2649F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 68).mirror().addBox(-4.1455F, -1.316F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.075F, 0.0766F, -3.5604F, 0.358F, 0.4025F, -0.6683F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(27, 86).addBox(2.25F, -1.25F, -0.6376F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, -0.0234F, -1.5604F, 0.2673F, -0.3406F, 0.8757F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 66).addBox(-0.4013F, -0.1394F, -0.4841F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.375F, -0.0234F, -1.5604F, 0.3602F, -0.1361F, 0.4547F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(86, 68).addBox(2.1455F, -1.316F, -0.6008F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.358F, -0.4025F, 0.6683F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(46, 78).addBox(-0.4686F, -0.2452F, -0.4538F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.4635F, -0.159F, 0.2649F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(98, 6).addBox(2.671F, -3.4325F, -0.6008F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 0.0766F, -3.5604F, 0.0508F, -0.5299F, 1.3304F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(66, 0).addBox(-1.0F, 0.15F, -2.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1F, -4.6491F, -3.1263F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, 0.15F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1F, -4.6491F, -3.1263F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(41, 29).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.0611F, 0.0436F, 0.0027F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(52, 86).addBox(0.0F, -4.1F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(81, 86).addBox(0.0F, -3.9F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = body2.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(86, 48).addBox(0.0F, -3.7F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-2.5563F, -0.1476F, -0.5018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.429F, 0.1516F, -0.2179F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-4.2072F, -1.2387F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.3273F, 0.3822F, -0.6276F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 6).mirror().addBox(-4.7657F, -3.4039F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.1459F, -0.5556F, 0.0393F, 0.4965F, -1.2837F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(75, 8).mirror().addBox(-2.5615F, -0.1015F, -0.6577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.4117F, 0.1478F, -0.2205F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(87, 91).mirror().addBox(-4.2219F, -1.1985F, -0.8094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.3121F, 0.3719F, -0.6332F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(21, 77).mirror().addBox(-5.8006F, -3.379F, -0.8094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.2459F, -2.4556F, 0.0337F, 0.4797F, -1.2863F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(63, 52).mirror().addBox(-2.5621F, -0.1919F, -0.1157F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.3259F, 0.1282F, -0.2323F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 29).mirror().addBox(-4.2181F, -1.2836F, -0.2665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.238F, 0.3194F, -0.6583F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-5.7492F, -3.447F, -0.2665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -4.8556F, 0.0072F, 0.3958F, -1.2975F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(91, 6).addBox(2.7657F, -3.4039F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.0393F, -0.4965F, 1.2837F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(88, 56).addBox(2.2072F, -1.2387F, -0.6525F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.3273F, -0.3822F, 0.6276F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(30, 77).addBox(-0.4437F, -0.1476F, -0.5018F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.1459F, -0.5556F, 0.429F, -0.1516F, 0.2179F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 77).addBox(2.8006F, -3.379F, -0.8094F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.0337F, -0.4797F, 1.2863F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(87, 91).addBox(2.2219F, -1.1985F, -0.8094F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.3121F, -0.3719F, 0.6332F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(75, 8).addBox(-0.4385F, -0.1015F, -0.6577F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.2459F, -2.4556F, 0.4117F, -0.1478F, 0.2205F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 45).addBox(2.7492F, -3.447F, -0.2665F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.0072F, -0.3958F, 1.2975F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(34, 29).addBox(2.2181F, -1.2836F, -0.2665F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.238F, -0.3194F, 0.6583F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 52).addBox(-0.4379F, -0.1919F, -0.1157F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -4.8556F, 0.3259F, -0.1282F, 0.2323F));

		PartDefinition Bodyfront_r8 = body2.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(16, 70).addBox(-1.0F, 0.1F, 0.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(0.0F, -4.647F, -2.2231F, 0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = body2.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -0.3F, -0.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -3.9997F, -4.7728F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(50, 54).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.1139F, 0.0867F, 0.0099F));

		PartDefinition Bodyfront_r10 = chest.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(84, 87).addBox(0.0F, -3.575F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r11 = chest.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(75, 94).addBox(0.0F, -3.025F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(49, 69).addBox(-1.783F, -2.2138F, -0.639F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(87, 87).mirror().addBox(-0.9451F, -0.8517F, -0.5313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.283F, 8.294F, -5.3644F, 1.4199F, 0.5187F, -0.0752F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 27).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, 0.2831F, 0.118F, -0.2375F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(89, 52).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, 0.202F, 0.2925F, -0.6692F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(63, 79).mirror().addBox(-5.7578F, -3.4248F, -0.4651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.025F, 0.0291F, -3.6806F, -0.0053F, 0.3538F, -1.3021F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-5.8257F, -3.4047F, -0.49F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, -0.0293F, 0.2695F, -1.3095F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(55, 91).mirror().addBox(-4.2572F, -1.2055F, -0.49F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, 0.1316F, 0.2377F, -0.6877F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(12, 77).mirror().addBox(-2.5767F, -0.0996F, -0.3367F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.475F, -0.0459F, -1.6806F, 0.1979F, 0.0971F, -0.2467F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(87, 87).addBox(-0.0549F, -0.8517F, -0.5313F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.4199F, -0.5187F, 0.0752F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 19).addBox(-0.783F, -0.2786F, -0.5313F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.283F, 8.294F, -5.3644F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 79).addBox(2.7578F, -3.4248F, -0.4651F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, -0.0053F, -0.3538F, 1.3021F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(89, 52).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, 0.202F, -0.2925F, 0.6692F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 27).addBox(0.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.0291F, -3.6806F, 0.2831F, -0.118F, 0.2375F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(79, 56).addBox(2.8256F, -3.4047F, -0.49F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, -0.0293F, -0.2695F, 1.3095F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(55, 91).addBox(2.2571F, -1.2055F, -0.49F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, 0.1316F, -0.2377F, 0.6877F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(12, 77).addBox(-0.4233F, -0.0996F, -0.3367F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0459F, -1.6806F, 0.1979F, -0.0971F, 0.2467F));

		PartDefinition Bodyfront_r12 = chest.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(26, 44).addBox(-1.0F, -0.5F, -1.6F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.103F)), PartPose.offsetAndRotation(0.0F, -3.35F, -2.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition forelegL2 = chest.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1131F, 6.4544F, -0.3203F, -0.376F, -0.1284F, -1.3038F));

		PartDefinition cube_r61 = forelegL2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(89, 0).addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.003F, 3.9448F, -1.6777F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r62 = forelegL2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(26, 79).addBox(-0.503F, -0.4399F, -0.9924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -1.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r63 = forelegL2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(53, 99).addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.003F, 4.608F, -0.9208F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r64 = forelegL2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(65, 74).addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1982F, 0.1974F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r65 = forelegL2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 72).addBox(5.0F, -2.7F, 0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 2.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition forelegL5 = forelegL2.addOrReplaceChild("forelegL5", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5765F, -1.4562F, 0.2799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.6472F, 5.7766F, -2.5301F, -1.0094F, 0.3305F, -0.5337F));

		PartDefinition cube_r66 = forelegL5.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(71, 85).addBox(-0.4994F, -2.0966F, -0.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.2471F, -0.0563F, -0.0026F));

		PartDefinition cube_r67 = forelegL5.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(13, 28).addBox(-0.4994F, -0.5003F, -0.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.4304F, -0.0563F, -0.0026F));

		PartDefinition cube_r68 = forelegL5.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 85).addBox(-0.4994F, 0.1028F, -0.324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0098F, 3.2522F, 0.1234F, -0.6049F, -0.0563F, -0.0026F));

		PartDefinition cube_r69 = forelegL5.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(80, 14).addBox(-0.5F, -2.4628F, -0.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.1405F, 1.133F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r70 = forelegL5.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(92, 17).addBox(-0.5F, -2.3504F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.8951F, 0.8017F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r71 = forelegL5.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(20, 90).addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 0.6246F, -0.6241F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r72 = forelegL5.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(23, 97).addBox(-0.5F, -2.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 68).addBox(-0.5F, -2.2F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r73 = forelegL5.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(86, 78).addBox(-0.5F, 0.7F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 1.9899F, -0.9497F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone4 = forelegL5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4518F, 4.6239F, -1.4815F, -0.3679F, -0.1166F, -0.6865F));

		PartDefinition cube_r74 = bone4.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.9F, 0.075F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r75 = bone5.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1131F, 6.4544F, -0.3203F, 0.3143F, -0.1473F, 0.945F));

		PartDefinition cube_r76 = forelegL3.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-0.5F, -0.4F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.003F, 3.9448F, -1.6777F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r77 = forelegL3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-0.497F, -0.4399F, -0.9924F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0884F, -1.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r78 = forelegL3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(53, 99).mirror().addBox(-0.5F, -0.4F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.003F, 4.608F, -0.9208F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r79 = forelegL3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 74).mirror().addBox(-0.5F, -0.9F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1982F, 0.1974F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r80 = forelegL3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-6.0F, -2.7F, 0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.5F, 2.0F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.4235F, -1.4562F, 0.2799F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.6472F, 5.7766F, -2.5301F, -1.5175F, -1.1353F, 1.0616F));

		PartDefinition cube_r81 = forelegL4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(71, 85).mirror().addBox(-0.5006F, -2.0966F, -0.3039F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.2471F, 0.0563F, 0.0026F));

		PartDefinition cube_r82 = forelegL4.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(13, 28).mirror().addBox(-0.5006F, -0.5003F, -0.368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.4304F, 0.0563F, 0.0026F));

		PartDefinition cube_r83 = forelegL4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-0.5006F, 0.1028F, -0.324F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0098F, 3.2522F, 0.1234F, -0.6049F, 0.0563F, 0.0026F));

		PartDefinition cube_r84 = forelegL4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(80, 14).mirror().addBox(-0.5F, -2.4628F, -0.7371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.1405F, 1.133F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r85 = forelegL4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-0.5F, -2.3504F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.8951F, 0.8017F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r86 = forelegL4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(-0.5F, -1.7F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.6246F, -0.6241F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r87 = forelegL4.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(23, 97).mirror().addBox(-0.5F, -2.2F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 68).mirror().addBox(-0.5F, -2.2F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r88 = forelegL4.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(86, 78).mirror().addBox(-0.5F, 0.7F, -0.075F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.9899F, -0.9497F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bone10 = forelegL4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4518F, 4.6239F, -1.4815F, -0.0581F, 0.4927F, 1.3945F));

		PartDefinition cube_r89 = bone10.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition cube_r90 = bone11.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5871F, 3.0945F, -1.2202F, -0.3203F, -0.0414F, -0.1242F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(49, 73).addBox(-0.5F, -1.15F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2169F, -3.9032F, 2.6496F, 0.1375F, 0.2439F, -0.0576F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(19, 14).addBox(-0.4691F, -0.203F, -3.7583F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.8666F, -2.5984F, 1.0703F, 0.8792F, 0.2439F, -0.0576F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(75, 0).addBox(-0.4691F, -0.609F, -0.1073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.8666F, -2.5984F, 1.0703F, 1.141F, 0.2439F, -0.0576F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(62, 58).addBox(-0.4691F, -0.214F, 1.7295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.8666F, -2.5984F, 1.0703F, 0.7483F, 0.2439F, -0.0576F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 78).addBox(-0.5F, -0.4F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.354F, -5.5442F, 3.58F, 0.2247F, 0.2439F, -0.0576F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 72).addBox(-0.5F, -0.675F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.9181F, -4.715F, 1.639F, 0.312F, 0.2439F, -0.0576F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(33, 65).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.4659F, -4.5618F, -0.2112F, 0.8007F, 0.2439F, -0.0576F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(85, 61).addBox(-0.4435F, -2.3754F, -0.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8666F, -2.5984F, 1.0703F, 0.4953F, 0.2439F, -0.0576F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(28, 50).addBox(-0.4435F, -1.4502F, -4.5154F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.8666F, -2.5984F, 1.0703F, 1.1061F, 0.2439F, -0.0576F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(39, 74).addBox(-0.8844F, -3.5078F, -4.1741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 1.5581F, 0.2886F, 0.3005F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(71, 62).addBox(-0.8844F, -2.6738F, -3.1197F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 1.2526F, 0.2886F, 0.3005F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(32, 71).addBox(-0.8844F, -2.2026F, -1.9162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0635F, 1.2333F, -0.0543F, 0.9472F, 0.2886F, 0.3005F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0409F, -1.1125F, -3.6839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4576F, 3.0883F, 1.2216F, -3.0241F, -0.3159F, 0.2753F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(98, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4456F, 5.1435F, -2.878F, -2.8925F, 0.2886F, 0.3005F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(33, 59).addBox(-0.5F, -1.5F, 0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1496F, 3.029F, 0.1461F, -2.718F, 0.2886F, 0.3005F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(95, 23).addBox(-0.05F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.2996F, 3.113F, -3.7602F, -2.4095F, -0.3515F, -1.1143F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(33, 83).addBox(0.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.549F, 5.3078F, -3.4125F, -2.3996F, -0.1604F, -1.1174F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(15, 47).addBox(-2.0F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3845F, 5.7771F, -3.6984F, -2.5367F, -0.2899F, -0.5118F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(72, 73).addBox(-0.9669F, -2.174F, -1.6604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6886F, 2.6967F, -0.6548F, -2.8096F, -0.0123F, 0.3924F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(75, 4).addBox(-1.0409F, -0.2183F, -1.4032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.4576F, 3.0883F, 1.2216F, 2.6482F, -0.3159F, 0.2753F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(5, 77).addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4898F, 1.9213F, 0.4235F, 1.3792F, -0.0123F, 0.3924F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(56, 76).addBox(-0.9669F, 0.756F, -0.9111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6886F, 2.6967F, -0.6548F, 2.0337F, -0.0123F, 0.3924F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(74, 30).addBox(-0.5F, -0.75F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5895F, -1.9272F, -0.4314F, 1.9875F, 0.2439F, -0.0576F));

		PartDefinition bone12 = chest.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5871F, 3.0945F, -1.2202F, -0.3203F, 0.0414F, 0.1242F));

		PartDefinition cube_r114 = bone12.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(49, 73).mirror().addBox(-0.5F, -1.15F, -0.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2169F, -3.9032F, 2.6496F, 0.1375F, -0.2439F, 0.0576F));

		PartDefinition cube_r115 = bone12.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(19, 14).mirror().addBox(-0.5309F, -0.203F, -3.7583F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5984F, 1.0703F, 0.8792F, -0.2439F, 0.0576F));

		PartDefinition cube_r116 = bone12.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5309F, -0.609F, -0.1073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5984F, 1.0703F, 1.141F, -0.2439F, 0.0576F));

		PartDefinition cube_r117 = bone12.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(62, 58).mirror().addBox(-0.5309F, -0.214F, 1.7295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5984F, 1.0703F, 0.7483F, -0.2439F, 0.0576F));

		PartDefinition cube_r118 = bone12.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-0.5F, -0.4F, -1.075F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.354F, -5.5442F, 3.58F, 0.2247F, -0.2439F, 0.0576F));

		PartDefinition cube_r119 = bone12.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.5F, -0.675F, -0.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9181F, -4.715F, 1.639F, 0.312F, -0.2439F, 0.0576F));

		PartDefinition cube_r120 = bone12.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(33, 65).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.4659F, -4.5618F, -0.2112F, 0.8007F, -0.2439F, 0.0576F));

		PartDefinition cube_r121 = bone12.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(85, 61).mirror().addBox(-0.5565F, -2.3754F, -0.2035F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5984F, 1.0703F, 0.4953F, -0.2439F, 0.0576F));

		PartDefinition cube_r122 = bone12.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(28, 50).mirror().addBox(-0.5565F, -1.4502F, -4.5154F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -2.5984F, 1.0703F, 1.1061F, -0.2439F, 0.0576F));

		PartDefinition cube_r123 = bone12.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(39, 74).mirror().addBox(-0.1156F, -3.5078F, -4.1741F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 1.5581F, -0.2886F, -0.3005F));

		PartDefinition cube_r124 = bone12.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-0.1156F, -2.6738F, -3.1197F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 1.2526F, -0.2886F, -0.3005F));

		PartDefinition cube_r125 = bone12.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(32, 71).mirror().addBox(-0.1156F, -2.2026F, -1.9162F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.0635F, 1.2333F, -0.0543F, 0.9472F, -0.2886F, -0.3005F));

		PartDefinition cube_r126 = bone12.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.0409F, -1.1125F, -3.6839F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0883F, 1.2216F, -3.0241F, 0.3159F, -0.2753F));

		PartDefinition cube_r127 = bone12.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(98, 73).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.4456F, 5.1435F, -2.878F, -2.8925F, -0.2886F, -0.3005F));

		PartDefinition cube_r128 = bone12.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(33, 59).mirror().addBox(-0.5F, -1.5F, 0.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1496F, 3.029F, 0.1461F, -2.718F, -0.2886F, -0.3005F));

		PartDefinition cube_r129 = bone12.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(95, 23).mirror().addBox(-0.95F, -1.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.2996F, 3.113F, -3.7602F, -2.4095F, 0.3515F, 1.1143F));

		PartDefinition cube_r130 = bone12.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(33, 83).mirror().addBox(-2.0F, 0.0F, -0.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.549F, 5.3078F, -3.4125F, -2.3996F, 0.1604F, 1.1174F));

		PartDefinition cube_r131 = bone12.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(15, 47).mirror().addBox(-1.0F, 0.0F, -0.8F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.3845F, 5.7771F, -3.6984F, -2.5367F, 0.2899F, 0.5118F));

		PartDefinition cube_r132 = bone12.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-0.0331F, -2.174F, -1.6604F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6886F, 2.6967F, -0.6548F, -2.8096F, 0.0123F, -0.3924F));

		PartDefinition cube_r133 = bone12.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(75, 4).mirror().addBox(0.0409F, -0.2183F, -1.4032F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 3.0883F, 1.2216F, 2.6482F, 0.3159F, -0.2753F));

		PartDefinition cube_r134 = bone12.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(5, 77).mirror().addBox(-0.5F, -1.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4898F, 1.9213F, 0.4235F, 1.3792F, 0.0123F, -0.3924F));

		PartDefinition cube_r135 = bone12.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(56, 76).mirror().addBox(-0.0331F, 0.756F, -0.9111F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6886F, 2.6967F, -0.6548F, 2.0337F, 0.0123F, -0.3924F));

		PartDefinition cube_r136 = bone12.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-0.5F, -0.75F, -0.45F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5895F, -1.9272F, -0.4314F, 1.9875F, -0.2439F, 0.0576F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.7596F, -5.9227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3591F, -3.9996F, -0.058F, 0.0433F, 0.0051F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(58, 99).addBox(0.0F, -1.65F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 95).addBox(0.0F, -2.05F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(85, 17).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 47).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1558F, -0.6987F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(33, 57).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.525F, -0.43F, -3.781F, 0.3687F, 0.1381F, -0.2266F));

		PartDefinition cube_r138 = Neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(86, 76).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.525F, -0.43F, -3.781F, 0.2747F, 0.3459F, -0.6464F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(22, 55).mirror().addBox(-3.7578F, -3.4248F, -0.4651F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.525F, -0.43F, -3.781F, 0.0202F, 0.4378F, -1.2923F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(87, 65).mirror().addBox(-4.7578F, -3.4248F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.0202F, 0.4378F, -1.2923F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(86, 70).mirror().addBox(-4.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.2747F, 0.3459F, -0.6464F));

		PartDefinition cube_r142 = Neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(87, 58).mirror().addBox(-2.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.525F, -0.33F, -1.681F, 0.3687F, 0.1381F, -0.2266F));

		PartDefinition cube_r143 = Neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(22, 55).addBox(2.7578F, -3.4248F, -0.4651F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -0.43F, -3.781F, 0.0202F, -0.4378F, 1.2923F));

		PartDefinition cube_r144 = Neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(86, 76).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -0.43F, -3.781F, 0.2747F, -0.3459F, 0.6464F));

		PartDefinition cube_r145 = Neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(33, 57).addBox(1.5591F, -0.169F, -0.3143F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.525F, -0.43F, -3.781F, 0.3687F, -0.1381F, 0.2266F));

		PartDefinition cube_r146 = Neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(87, 58).addBox(0.5591F, -0.169F, -0.3143F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.3687F, -0.1381F, 0.2266F));

		PartDefinition cube_r147 = Neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(86, 70).addBox(2.2126F, -1.2604F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.2747F, -0.3459F, 0.6464F));

		PartDefinition cube_r148 = Neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(87, 65).addBox(2.7578F, -3.4248F, -0.4651F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.525F, -0.33F, -1.681F, 0.0202F, -0.4378F, 1.2923F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 23).addBox(-3.49F, -1.4683F, -4.8449F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.01F, 1.6037F, -2.4286F, -0.03F, 0.0848F, -0.0898F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(98, 35).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.49F, -3.36F, -16.7505F, 0.829F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(57, 84).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.49F, -3.7826F, -15.8442F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(84, 6).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.49F, -3.9562F, -14.8594F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(62, 11).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -2.9913F, -12.8422F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 62).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -4.4748F, -11.1692F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(61, 54).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.99F, -4.9247F, -9.2205F, 0.2269F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(11, 61).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.99F, -5.2031F, -7.2399F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(54, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -5.2729F, -5.2411F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r149 = Head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(92, 8).addBox(-0.6F, -0.5F, -0.4177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0575F, -2.1F, -17.2696F, -1.5871F, 1.309F, -1.5877F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4F, -7.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -1.1386F, -9.6181F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(98, 67).addBox(-0.5F, -0.025F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(0, 47).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -5.0986F, -3.2487F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(76, 35).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -4.7965F, -1.9254F, 0.6894F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(44, 6).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.01F, -4.3947F, -1.8329F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.0881F, -0.149F, -3.4852F));

		PartDefinition cube_r150 = leftFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(38, 95).addBox(-0.4F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-5.0781F, -2.442F, -13.419F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r151 = leftFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(5, 81).addBox(-3.3198F, -0.8815F, -4.3387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.6353F, 1.182F, -0.5987F));

		PartDefinition cube_r152 = leftFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(83, 24).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1716F, -2.8457F, -13.2112F, 0.3387F, 0.9228F, 0.5766F));

		PartDefinition cube_r153 = leftFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(79, 80).addBox(-4.2615F, -0.8815F, -2.7798F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.3763F, 0.9121F, -0.3029F));

		PartDefinition cube_r154 = leftFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(57, 81).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4612F, -2.6886F, -12.531F, 0.1164F, 0.6664F, 0.4795F));

		PartDefinition cube_r155 = leftFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(80, 58).addBox(-4.6909F, -0.8815F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(50, 80).addBox(-5.0382F, -0.8815F, 1.3597F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.2805F, 0.6224F, -0.1664F));

		PartDefinition cube_r156 = leftFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(67, 40).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7096F, -2.3968F, -11.2669F, 0.0723F, 0.5108F, 0.5669F));

		PartDefinition cube_r157 = leftFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(96, 76).addBox(-0.85F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1712F, 0.4458F, -4.2886F, -0.073F, 0.1658F, -0.0386F));

		PartDefinition cube_r158 = leftFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(67, 96).addBox(-0.85F, -0.5F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 96).addBox(-0.85F, -0.5F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(51, 96).addBox(-0.85F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(96, 50).addBox(-0.85F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.249F, -0.2435F, -7.2743F, -0.2191F, 0.2846F, -0.0676F));

		PartDefinition cube_r159 = leftFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(96, 3).addBox(-0.4219F, -0.5F, 0.6769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 96).addBox(-0.4219F, -0.5F, -0.1231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6735F, -0.6198F, -8.6876F, -0.2682F, 0.3333F, -0.0897F));

		PartDefinition cube_r160 = leftFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(95, 95).addBox(-0.4341F, -0.5F, -0.8776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 92).addBox(-0.4341F, -0.5F, -1.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6735F, -0.6198F, -8.6876F, -0.2819F, 0.4509F, -0.1255F));

		PartDefinition cube_r161 = leftFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(95, 82).addBox(-0.7614F, -0.29F, -0.8043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(62, 95).addBox(-0.7614F, -0.29F, -1.6044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(95, 60).addBox(-0.7614F, -0.29F, -2.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1343F, -1.2187F, -10.2398F, -0.2915F, 0.4498F, -0.1297F));

		PartDefinition cube_r162 = leftFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(88, 44).addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.5503F, -1.1059F, -12.1239F, -0.2666F, 0.9192F, -0.2597F));

		PartDefinition cube_r163 = leftFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(97, 20).addBox(-0.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.6277F, -0.3493F, -6.4759F, -0.284F, 0.4033F, -0.1368F));

		PartDefinition cube_r164 = leftFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(18, 97).addBox(-0.725F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.9267F, -0.5428F, -7.2268F, -0.3203F, 0.6117F, -0.2109F));

		PartDefinition cube_r165 = leftFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(97, 14).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.6224F, -0.633F, -7.624F, -0.5889F, 1.0883F, -0.5571F));

		PartDefinition cube_r166 = leftFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(97, 17).addBox(-0.575F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.1889F, -0.1796F, -7.913F, -0.9388F, 1.2496F, -0.9415F));

		PartDefinition cube_r167 = leftFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(88, 40).addBox(0.0F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2048F, -0.2602F, -8.3977F, -0.1396F, 0.4563F, -0.0817F));

		PartDefinition cube_r168 = leftFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(67, 44).addBox(2.18F, -0.29F, -4.3867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1343F, -1.2187F, -10.2398F, -0.901F, 1.2343F, -0.8728F));

		PartDefinition cube_r169 = leftFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(49, 26).addBox(1.0759F, -0.29F, -4.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1343F, -1.2187F, -10.2398F, -0.5151F, 1.0176F, -0.4489F));

		PartDefinition cube_r170 = leftFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(93, 32).addBox(0.3795F, -0.29F, -3.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1343F, -1.2187F, -10.2398F, -0.4006F, 0.8451F, -0.3068F));

		PartDefinition cube_r171 = leftFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(48, 99).addBox(-0.2624F, -0.29F, -3.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1343F, -1.2187F, -10.2398F, -0.3309F, 0.6493F, -0.2048F));

		PartDefinition cube_r172 = leftFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 36).addBox(-4.6514F, -0.8815F, 0.4619F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.253F, 0.454F, -0.1129F));

		PartDefinition cube_r173 = leftFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(64, 81).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3217F, -2.2148F, -10.4785F, 0.2094F, 0.6466F, 0.6318F));

		PartDefinition cube_r174 = leftFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 16).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5548F, -1.9248F, -9.2226F, 0.1029F, 0.5219F, 0.6083F));

		PartDefinition cube_r175 = leftFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(40, 66).addBox(-4.6314F, -0.8815F, 2.8099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.2552F, 0.4709F, -0.1178F));

		PartDefinition cube_r176 = leftFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(51, 60).addBox(-3.0003F, 0.0279F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1387F, -1.756F, -8.3667F, -0.083F, 0.4658F, 0.6168F));

		PartDefinition cube_r177 = leftFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(16, 66).addBox(-0.9625F, -0.0965F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8392F, -1.2F, -7.2133F, -0.3795F, 0.2936F, -0.1055F));

		PartDefinition cube_r178 = leftFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(27, 9).addBox(-5.0F, 0.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8129F, -0.7968F, -5.5134F, 0.0485F, 0.3732F, 0.7075F));

		PartDefinition cube_r179 = leftFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(57, 6).addBox(-0.0044F, -1.8326F, -0.1985F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 0.85F, -6.5F, -0.2198F, 0.3078F, -0.0602F));

		PartDefinition cube_r180 = leftFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(82, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2857F, -0.3947F, -3.6356F, -0.0872F, 0.211F, 0.7267F));

		PartDefinition cube_r181 = leftFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(50, 83).addBox(-2.0326F, -1.3759F, -0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, 0.85F, -4.4F, -0.2092F, 0.0916F, -0.0416F));

		PartDefinition cube_r182 = leftFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(71, 82).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8061F, 0.0028F, 0.9597F, -0.0901F, -0.1291F, 0.5655F));

		PartDefinition cube_r183 = leftFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(81, 30).addBox(-1.6872F, -0.3708F, 3.0631F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.85F, -2.5F, 0.1387F, -0.2251F, -0.0264F));

		PartDefinition cube_r184 = leftFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(65, 28).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2366F, 0.4385F, 2.2174F, -0.679F, -0.2289F, 0.5667F));

		PartDefinition cube_r185 = leftFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(65, 24).addBox(-1.075F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5508F, 0.8197F, 1.6255F, -0.5196F, -0.5093F, 0.135F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(39, 48).addBox(-0.2F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.2161F, -2.0938F, 1.3499F, -0.0691F, 0.1214F, 1.0517F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(15, 50).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0378F, -1.3447F, 4.1657F, -3.0307F, 0.9634F, -1.9469F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(22, 62).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9458F, -3.1094F, 4.4137F, -2.6704F, 1.4312F, -1.5708F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(74, 24).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3177F, -3.9119F, 3.9473F, -0.1346F, 1.0807F, 0.9845F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(14, 74).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5781F, -4.532F, 3.2073F, -0.0852F, 0.7336F, 1.0464F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(71, 99).addBox(-1.5838F, -0.4628F, 1.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -2.5462F, -1.4579F, -2.648F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(40, 85).addBox(-2.2474F, -0.4628F, 0.7586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.2925F, -1.3499F, 1.3718F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(92, 14).addBox(0.1813F, -0.4756F, 0.3805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(85, 20).addBox(0.0813F, -0.4756F, 1.3805F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0695F, 0.4291F, 1.0222F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(72, 44).addBox(-0.4346F, -0.4756F, -0.2082F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0656F, -0.2676F, 1.0685F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(74, 27).addBox(-0.1637F, -0.4756F, -1.1554F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0775F, -0.6158F, 1.096F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(64, 84).addBox(-2.0766F, -0.4628F, -1.156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0732F, -0.5288F, 1.123F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(85, 14).addBox(-1.8326F, -0.4628F, 0.6972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0638F, -0.1369F, 1.0948F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(65, 32).addBox(-2.1316F, -0.4628F, -1.1801F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.6281F, -1.9855F, 1.3971F, -0.0641F, 0.1679F, 1.0753F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(47, 16).addBox(0.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5781F, -4.7408F, 1.7219F, -0.0637F, 0.1243F, 1.0956F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(82, 3).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2579F, -0.2224F, -2.7054F, -0.2312F, -0.0071F, 0.7652F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(81, 43).addBox(-1.7737F, -1.3301F, 0.9843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.85F, -4.4F, -0.1628F, -0.165F, 0.0099F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(79, 68).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5781F, -5.1239F, -1.7559F, 0.036F, 0.2442F, 0.0087F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(98, 70).addBox(-0.825F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-4.0781F, -3.2109F, -13.2653F, 0.2976F, 0.8446F, -0.7229F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(98, 38).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.0781F, -3.2109F, -13.2653F, 0.851F, 0.2727F, 0.2267F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(98, 41).addBox(-1.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.8483F, -3.6433F, -12.3425F, 0.0854F, 0.4777F, -0.9037F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(38, 98).addBox(-0.975F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.8781F, -3.6336F, -12.359F, 0.431F, 0.2289F, 0.0247F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(13, 97).addBox(-0.5F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.5699F, -2.912F, -12.6014F, 0.7228F, 0.3586F, -0.9542F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(43, 94).addBox(-1.0754F, 0.2721F, -0.6475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(30, 94).addBox(-1.0754F, -0.0279F, -0.6475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-3.3759F, -3.6257F, -11.7774F, -0.0796F, 0.3118F, -0.9302F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(94, 64).addBox(-0.3774F, -0.3279F, 0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(94, 47).addBox(-0.3774F, -0.6279F, 0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.2323F, -2.8003F, -11.6427F, -0.0816F, -0.1071F, -0.9137F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(25, 94).addBox(-1.0754F, -0.0529F, -0.8725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.3759F, -3.6257F, -11.7774F, -0.1145F, 0.3118F, -0.9302F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(20, 94).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5781F, -3.8072F, -11.3742F, -0.1078F, 0.2936F, -0.9262F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(33, 97).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5781F, -3.8072F, -11.3742F, 0.1736F, 0.2608F, 0.0289F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(40, 70).addBox(0.0F, 0.0F, -2.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5781F, -3.8421F, -9.3744F, 0.0134F, -0.0112F, 0.6981F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(62, 20).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5781F, -4.3258F, -7.684F, 0.1935F, -0.1774F, 0.7332F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(22, 57).addBox(-1.0F, 0.025F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7081F, -3.55F, -7.6381F, 0.1306F, -0.0657F, 0.6389F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(49, 21).addBox(0.0F, 0.0F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5781F, -4.7757F, -5.7352F, 0.1396F, -0.1794F, 0.9037F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(72, 68).addBox(-0.975F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9983F, -4.7582F, -5.0223F, -0.0106F, 0.0114F, -0.26F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(88, 36).addBox(-0.975F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9784F, -4.6394F, -6.0151F, 0.1203F, 0.0114F, -0.26F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(39, 88).addBox(-0.975F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.9034F, -4.3158F, -6.9583F, 0.9493F, 0.0114F, -0.26F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(88, 32).addBox(-0.975F, 0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(19, 79).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.1015F, -5.0947F, -6.181F, 0.3384F, 0.0114F, -0.26F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(54, 32).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0265F, -4.7711F, -7.1242F, 0.6002F, 0.0114F, -0.26F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(51, 64).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0964F, -5.1643F, -4.1823F, 0.033F, 0.0114F, -0.26F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(12, 83).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0619F, -5.0561F, -3.6953F, -0.2288F, 0.0114F, -0.26F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(95, 57).addBox(-0.5F, -0.325F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(95, 54).addBox(-0.5F, -1.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.7673F, -3.7F, -3.2058F, 0.6588F, 0.2327F, -0.4854F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(25, 66).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5781F, -5.1239F, -1.7559F, -0.083F, 0.2327F, -0.4854F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(79, 72).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0781F, -5.0541F, -3.7547F, 0.1445F, 0.2592F, 0.0373F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(40, 0).addBox(-0.8F, -0.075F, -0.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.7964F, -3.0445F, -2.7483F, -0.1368F, 0.2061F, 0.7184F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(5, 74).addBox(-0.8F, -0.075F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.9466F, -3.1837F, -3.7271F, -0.0059F, 0.2061F, 0.7184F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(71, 15).addBox(-0.525F, -0.2F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 3.0543F, 0.4899F, -2.4938F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(61, 98).addBox(-0.775F, -0.2F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 3.0057F, 0.9671F, -2.5648F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(80, 10).addBox(-0.975F, -0.2F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 2.567F, 1.4289F, -3.0227F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(98, 44).addBox(-1.0F, -0.2F, 0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 0.1936F, 1.1597F, 0.8667F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(79, 76).addBox(-1.0F, -0.2F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 0.0994F, 0.6842F, 0.7518F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(55, 0).addBox(-0.9F, -0.225F, -1.65F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3606F, -3.2047F, -5.5783F, 0.0786F, 0.206F, 0.705F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(26, 38).addBox(-1.0F, -0.175F, -2.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.3606F, -3.2297F, -5.3783F, 0.0786F, 0.206F, 0.705F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(43, 97).addBox(-0.3292F, -0.5F, -0.5945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.9936F, -4.6618F, -1.4416F, 0.2523F, 1.1199F, 1.467F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(55, 87).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.7401F, -5.4652F, -1.4559F, 0.0416F, 0.5614F, 1.3078F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(47, 12).addBox(0.0F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5781F, -4.9496F, 0.2365F, -0.0397F, 0.0777F, 1.098F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(73, 10).addBox(-0.975F, 0.325F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(68, 4).addBox(-1.0F, 0.0F, -1.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.0781F, -5.0541F, -3.7547F, 0.0013F, 0.2959F, -0.4744F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(41, 43).addBox(-4.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0554F, -0.0442F, -0.8089F, -0.12F, -0.0174F, 0.77F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(71, 58).addBox(-1.075F, -0.5F, -2.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0098F)), PartPose.offsetAndRotation(-2.0781F, -1.3249F, -8.1071F, -0.6353F, 1.1974F, -0.6016F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(0, 14).addBox(-1.475F, -0.5F, -4.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.0781F, -1.3249F, -8.1071F, -0.2449F, 0.4677F, -0.1122F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(26, 31).addBox(2.4F, -0.4F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-5.0781F, -0.9896F, -6.1329F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(19, 83).addBox(0.0F, 0.0F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.5781F, -5.4149F, 1.7047F, 0.5277F, -0.4665F, 0.6572F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(78, 83).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.5781F, -4.3152F, 1.1572F, -0.2294F, -0.9122F, 0.1826F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(5, 84).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.5758F, -4.1767F, 2.1429F, -1.6328F, -1.4309F, 1.6334F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(56, 42).addBox(-2.0857F, -1.0176F, 0.1359F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.3F, 0.85F, -2.5F, -0.0745F, -0.0958F, 0.0045F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.0681F, -0.149F, -3.4852F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(38, 95).mirror().addBox(-0.6F, -0.425F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0781F, -2.442F, -13.419F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(1.3198F, -0.8815F, -4.3387F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.6353F, -1.182F, 0.5987F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1716F, -2.8457F, -13.2112F, 0.3387F, -0.9228F, -0.5766F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(79, 80).mirror().addBox(2.2615F, -0.8815F, -2.7798F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.3763F, -0.9121F, 0.3029F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(57, 81).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4612F, -2.6886F, -12.531F, 0.1164F, -0.6664F, -0.4795F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(2.6909F, -0.8815F, -1.0099F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(50, 80).mirror().addBox(3.0382F, -0.8815F, 1.3597F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.2805F, -0.6224F, 0.1664F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(67, 40).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7096F, -2.3968F, -11.2669F, 0.0723F, -0.5108F, -0.5669F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(96, 76).mirror().addBox(-0.15F, -0.55F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1712F, 0.4458F, -4.2886F, -0.073F, -0.1658F, 0.0386F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(67, 96).mirror().addBox(-0.15F, -0.5F, 2.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(56, 96).mirror().addBox(-0.15F, -0.5F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(51, 96).mirror().addBox(-0.15F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(96, 50).mirror().addBox(-0.15F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.249F, -0.2435F, -7.2743F, -0.2191F, -0.2846F, 0.0676F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-0.5781F, -0.5F, 0.6769F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 96).mirror().addBox(-0.5781F, -0.5F, -0.1231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6735F, -0.6198F, -8.6876F, -0.2682F, -0.3333F, 0.0897F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(95, 95).mirror().addBox(-0.5659F, -0.5F, -0.8776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 92).mirror().addBox(-0.5659F, -0.5F, -1.6776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.6735F, -0.6198F, -8.6876F, -0.2819F, -0.4509F, 0.1255F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(95, 82).mirror().addBox(-0.2386F, -0.29F, -0.8043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(62, 95).mirror().addBox(-0.2386F, -0.29F, -1.6044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(95, 60).mirror().addBox(-0.2386F, -0.29F, -2.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1343F, -1.2187F, -10.2398F, -0.2915F, -0.4498F, 0.1297F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(88, 44).mirror().addBox(-0.5F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.5503F, -1.1059F, -12.1239F, -0.2666F, -0.9192F, 0.2597F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(97, 20).mirror().addBox(-0.375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.6277F, -0.3493F, -6.4759F, -0.284F, -0.4033F, 0.1368F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(18, 97).mirror().addBox(-0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.9267F, -0.5428F, -7.2268F, -0.3203F, -0.6117F, 0.2109F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(97, 14).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.6224F, -0.633F, -7.624F, -0.5889F, -1.0883F, 0.5571F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(97, 17).mirror().addBox(-0.425F, -1.0F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.1889F, -0.1796F, -7.913F, -0.9388F, -1.2496F, 0.9415F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(-1.0F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.2048F, -0.2602F, -8.3977F, -0.1396F, -0.4563F, 0.0817F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-3.18F, -0.29F, -4.3867F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1343F, -1.2187F, -10.2398F, -0.901F, -1.2343F, 0.8728F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(49, 26).mirror().addBox(-2.0759F, -0.29F, -4.2691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1343F, -1.2187F, -10.2398F, -0.5151F, -1.0176F, 0.4489F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(93, 32).mirror().addBox(-1.3795F, -0.29F, -3.7633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1343F, -1.2187F, -10.2398F, -0.4006F, -0.8451F, 0.3068F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(48, 99).mirror().addBox(-0.7376F, -0.29F, -3.1438F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.1343F, -1.2187F, -10.2398F, -0.3309F, -0.6493F, 0.2048F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(67, 36).mirror().addBox(2.6514F, -0.8815F, 0.4619F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.253F, -0.454F, 0.1129F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3217F, -2.2148F, -10.4785F, 0.2094F, -0.6466F, -0.6318F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(60, 16).mirror().addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5548F, -1.9248F, -9.2226F, 0.1029F, -0.5219F, -0.6083F));

		PartDefinition cube_r215 = rightFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(40, 66).mirror().addBox(2.6314F, -0.8815F, 2.8099F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, -13.9F, -0.2552F, -0.4709F, 0.1178F));

		PartDefinition cube_r216 = rightFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(51, 60).mirror().addBox(0.0003F, 0.0279F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1387F, -1.756F, -8.3667F, -0.083F, -0.4658F, -0.6168F));

		PartDefinition cube_r217 = rightFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(16, 66).mirror().addBox(-1.0375F, -0.0965F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8392F, -1.2F, -7.2133F, -0.3795F, -0.2936F, 0.1055F));

		PartDefinition cube_r218 = rightFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(27, 9).mirror().addBox(0.0F, 0.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8129F, -0.7968F, -5.5134F, 0.0485F, -0.3732F, -0.7075F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-1.9956F, -1.8326F, -0.1985F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 0.85F, -6.5F, -0.2198F, -0.3078F, 0.0602F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2857F, -0.3947F, -3.6356F, -0.0872F, -0.211F, -0.7267F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(50, 83).mirror().addBox(0.0326F, -1.3759F, -0.0104F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.85F, -4.4F, -0.2092F, -0.0916F, 0.0416F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8061F, 0.0028F, 0.9597F, -0.0901F, 0.1291F, -0.5655F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(81, 30).mirror().addBox(-0.3128F, -0.3708F, 3.0631F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.85F, -2.5F, 0.1387F, 0.2251F, 0.0264F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2366F, 0.4385F, 2.2174F, -0.679F, 0.2289F, -0.5667F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-0.925F, -0.5F, -1.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5508F, 0.8197F, 1.6255F, -0.5196F, 0.5093F, -0.135F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(39, 48).mirror().addBox(-2.8F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.2161F, -2.0938F, 1.3499F, -0.0691F, -0.1214F, -1.0517F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(15, 50).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.0378F, -1.3447F, 4.1657F, -3.0307F, -0.9634F, 1.9469F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(22, 62).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9458F, -3.1094F, 4.4137F, -2.6704F, -1.4312F, 1.5708F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(74, 24).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3177F, -3.9119F, 3.9473F, -0.1346F, -1.0807F, -0.9845F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(14, 74).mirror().addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5781F, -4.532F, 3.2073F, -0.0852F, -0.7336F, -1.0464F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(71, 99).mirror().addBox(0.5838F, -0.4628F, 1.3788F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -2.5462F, 1.4579F, 2.648F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(40, 85).mirror().addBox(0.2474F, -0.4628F, 0.7586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.2925F, 1.3499F, -1.3718F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-1.1813F, -0.4756F, 0.3805F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(85, 20).mirror().addBox(-2.0813F, -0.4756F, 1.3805F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0695F, -0.4291F, -1.0222F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(72, 44).mirror().addBox(-1.5654F, -0.4756F, -0.2082F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0656F, 0.2676F, -1.0685F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(74, 27).mirror().addBox(-2.8363F, -0.4756F, -1.1554F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0775F, 0.6158F, -1.096F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(0.0766F, -0.4628F, -1.156F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0732F, 0.5288F, -1.123F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(85, 14).mirror().addBox(-0.1674F, -0.4628F, 0.6972F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0638F, 0.1369F, -1.0948F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(65, 32).mirror().addBox(0.1316F, -0.4628F, -1.1801F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.6281F, -1.9855F, 1.3971F, -0.0641F, -0.1679F, -1.0753F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-3.0F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5781F, -4.7408F, 1.7219F, -0.0637F, -0.1243F, -1.0956F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2579F, -0.2224F, -2.7054F, -0.2312F, 0.0071F, -0.7652F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(81, 43).mirror().addBox(-0.2263F, -1.3301F, 0.9843F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.85F, -4.4F, -0.1628F, 0.165F, -0.0099F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(79, 68).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5781F, -5.1239F, -1.7559F, 0.036F, -0.2442F, -0.0087F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(98, 70).mirror().addBox(-0.175F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(4.0781F, -3.2109F, -13.2653F, 0.2976F, -0.8446F, 0.7229F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(98, 38).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.0781F, -3.2109F, -13.2653F, 0.851F, -0.2727F, -0.2267F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(98, 41).mirror().addBox(0.0F, 0.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.8483F, -3.6433F, -12.3425F, 0.0854F, -0.4777F, 0.9037F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(38, 98).mirror().addBox(-0.025F, 0.0F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.8781F, -3.6336F, -12.359F, 0.431F, -0.2289F, -0.0247F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(13, 97).mirror().addBox(-0.5F, -0.4F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.5699F, -2.912F, -12.6014F, 0.7228F, -0.3586F, 0.9542F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(43, 94).mirror().addBox(0.0754F, 0.2721F, -0.6475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(30, 94).mirror().addBox(0.0754F, -0.0279F, -0.6475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(3.3759F, -3.6257F, -11.7774F, -0.0796F, -0.3118F, 0.9302F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(94, 64).mirror().addBox(-0.6226F, -0.3279F, 0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(94, 47).mirror().addBox(-0.6226F, -0.6279F, 0.1087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.2323F, -2.8003F, -11.6427F, -0.0816F, 0.1071F, 0.9137F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(25, 94).mirror().addBox(0.0754F, -0.0529F, -0.8725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.3759F, -3.6257F, -11.7774F, -0.1145F, -0.3118F, 0.9302F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5781F, -3.8072F, -11.3742F, -0.1078F, -0.2936F, 0.9262F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(33, 97).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5781F, -3.8072F, -11.3742F, 0.1736F, -0.2608F, -0.0289F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-2.0F, 0.0F, -2.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5781F, -3.8421F, -9.3744F, 0.0134F, 0.0112F, -0.6981F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(62, 20).mirror().addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5781F, -4.3258F, -7.684F, 0.1935F, 0.1774F, -0.7332F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(22, 57).mirror().addBox(-1.0F, 0.025F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7081F, -3.55F, -7.6381F, 0.1306F, 0.0657F, -0.6389F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(49, 21).mirror().addBox(-3.0F, 0.0F, -2.3F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.5781F, -4.7757F, -5.7352F, 0.1396F, 0.1794F, -0.9037F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-0.025F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9983F, -4.7582F, -5.0223F, -0.0106F, -0.0114F, 0.26F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(88, 36).mirror().addBox(-0.025F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9784F, -4.6394F, -6.0151F, 0.1203F, -0.0114F, 0.26F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(39, 88).mirror().addBox(-0.025F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.9034F, -4.3158F, -6.9583F, 0.9493F, -0.0114F, 0.26F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(88, 32).mirror().addBox(-0.025F, 0.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(19, 79).mirror().addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.1015F, -5.0947F, -6.181F, 0.3384F, -0.0114F, 0.26F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(54, 32).mirror().addBox(0.0F, 0.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0265F, -4.7711F, -7.1242F, 0.6002F, -0.0114F, 0.26F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0964F, -5.1643F, -4.1823F, 0.033F, -0.0114F, 0.26F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(12, 83).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.0619F, -5.0561F, -3.6953F, -0.2288F, -0.0114F, 0.26F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(95, 57).mirror().addBox(-0.5F, -0.325F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(95, 54).mirror().addBox(-0.5F, -1.0F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.7673F, -3.7F, -3.2058F, 0.6588F, -0.2327F, 0.4854F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(25, 66).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5781F, -5.1239F, -1.7559F, -0.083F, -0.2327F, 0.4854F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(79, 72).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0781F, -5.0541F, -3.7547F, 0.1445F, -0.2592F, -0.0373F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-2.2F, -0.075F, -0.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.7964F, -3.0445F, -2.7483F, -0.1368F, -0.2061F, -0.7184F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(5, 74).mirror().addBox(-2.2F, -0.075F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(1.9466F, -3.1837F, -3.7271F, -0.0059F, -0.2061F, -0.7184F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(71, 15).mirror().addBox(-1.475F, -0.2F, -0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 3.0543F, -0.4899F, 2.4938F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(61, 98).mirror().addBox(-0.225F, -0.2F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 3.0057F, -0.9671F, 2.5648F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(80, 10).mirror().addBox(-0.025F, -0.2F, -0.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 2.567F, -1.4289F, 3.0227F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(98, 44).mirror().addBox(0.0F, -0.2F, 0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 0.1936F, -1.1597F, -0.8667F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(79, 76).mirror().addBox(0.0F, -0.2F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 0.0994F, -0.6842F, -0.7518F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.1F, -0.225F, -1.65F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2047F, -5.5783F, 0.0786F, -0.206F, -0.705F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(26, 38).mirror().addBox(-2.0F, -0.175F, -2.3F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.3606F, -3.2297F, -5.3783F, 0.0786F, -0.206F, -0.705F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(43, 97).mirror().addBox(-0.6708F, -0.5F, -0.5945F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.9936F, -4.6618F, -1.4416F, 0.2523F, -1.1199F, -1.467F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.7401F, -5.4652F, -1.4559F, 0.0416F, -0.5614F, -1.3078F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(47, 12).mirror().addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5781F, -4.9496F, 0.2365F, -0.0397F, -0.0777F, -1.098F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(73, 10).mirror().addBox(-0.025F, 0.325F, -1.925F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(68, 4).mirror().addBox(0.0F, 0.0F, -1.925F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(3.0781F, -5.0541F, -3.7547F, 0.0013F, -0.2959F, 0.4744F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(41, 43).mirror().addBox(0.0F, 0.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0554F, -0.0442F, -0.8089F, -0.12F, 0.0174F, -0.77F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(71, 58).mirror().addBox(-0.925F, -0.5F, -2.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0098F)).mirror(false), PartPose.offsetAndRotation(2.0781F, -1.3249F, -8.1071F, -0.6353F, -1.1974F, 0.6016F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(0, 14).mirror().addBox(-0.525F, -0.5F, -4.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.0781F, -1.3249F, -8.1071F, -0.2449F, -0.4677F, 0.1122F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(26, 31).mirror().addBox(-4.4F, -0.4F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(5.0781F, -0.9896F, -6.1329F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(19, 83).mirror().addBox(-2.0F, 0.0F, -1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(4.5781F, -5.4149F, 1.7047F, 0.5277F, 0.4665F, -0.6572F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(78, 83).mirror().addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(4.5781F, -4.3152F, 1.1572F, -0.2294F, 0.9122F, -0.1826F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.5758F, -4.1767F, 2.1429F, -1.6328F, 1.4309F, -1.6334F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(56, 42).mirror().addBox(0.0857F, -1.0176F, 0.1359F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.85F, -2.5F, -0.0745F, 0.0958F, -0.0045F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2235F, -1.5296F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r230 = jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(85, 93).mirror().addBox(0.0572F, 0.8127F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 70).mirror().addBox(0.0572F, 0.0127F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.18F, -1.7872F, -13.9337F, -1.9032F, -0.585F, 0.2272F));

		PartDefinition cube_r231 = jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(0.0572F, -0.0254F, -0.5331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.18F, -1.7872F, -13.9337F, -1.9119F, -0.585F, 0.2272F));

		PartDefinition cube_r232 = jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(92, 11).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.084F, -2.3299F, -15.6446F, 3.1039F, -1.2426F, 1.5898F));

		PartDefinition cube_r233 = jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(66, 99).mirror().addBox(-0.0339F, 0.0187F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.1575F, -1.9857F, -16.0667F, -2.6996F, -1.2065F, 1.0812F));

		PartDefinition cube_r234 = jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(99, 63).mirror().addBox(-0.0339F, 0.0187F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.98F, -1.7872F, -15.5337F, -2.1143F, -0.8985F, 0.4208F));

		PartDefinition cube_r235 = jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(0.0209F, 0.0923F, -0.6906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(67, 93).mirror().addBox(0.0209F, -0.1077F, -0.6906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.18F, -1.1872F, -12.1587F, -1.8812F, -0.4658F, 0.2117F));

		PartDefinition cube_r236 = jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(0.0112F, 0.7946F, -0.7959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.6872F, -10.4587F, -1.8521F, -0.3376F, 0.2003F));

		PartDefinition cube_r237 = jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(12, 86).mirror().addBox(0.0112F, 0.0564F, -0.6191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.6872F, -10.4587F, -1.9394F, -0.3376F, 0.2003F));

		PartDefinition cube_r238 = jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(57, 93).mirror().addBox(0.0112F, -0.1697F, -0.7685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.6872F, -10.4587F, -1.8783F, -0.3376F, 0.2003F));

		PartDefinition cube_r239 = jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-0.077F, -0.0456F, -1.0692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.48F, 0.1128F, -8.5587F, -1.8639F, -0.2692F, 0.196F));

		PartDefinition cube_r240 = jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(34, 86).mirror().addBox(-0.077F, 0.2272F, -0.6931F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.48F, 0.1128F, -8.5587F, -1.9686F, -0.2692F, 0.196F));

		PartDefinition cube_r241 = jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(0.0852F, 1.5003F, -0.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-6.08F, 0.1128F, -4.3587F, -1.7844F, -0.0089F, 0.0871F));

		PartDefinition cube_r242 = jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(93, 38).mirror().addBox(0.0052F, 0.1477F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(22, 86).mirror().addBox(0.0052F, -0.0523F, -0.6973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.98F, 0.1128F, -6.5587F, -1.7976F, -0.2007F, 0.1928F));

		PartDefinition cube_r243 = jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(98, 98).mirror().addBox(-0.3F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.7921F, -2.7069F, -15.543F, -2.3599F, -1.1071F, 0.7202F));

		PartDefinition cube_r244 = jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(93, 98).mirror().addBox(-0.4596F, -0.8796F, -0.5615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.0881F, -2.6062F, -15.3207F, -2.1365F, -0.8792F, 0.5273F));

		PartDefinition cube_r245 = jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(92, 86).mirror().addBox(0.0209F, 1.329F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(0.0209F, 0.529F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(38, 92).mirror().addBox(0.0209F, -0.271F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.18F, -1.1872F, -12.1587F, -1.8724F, -0.4658F, 0.2117F));

		PartDefinition cube_r246 = jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(93, 67).mirror().addBox(0.0112F, 0.8303F, -1.3112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 73).mirror().addBox(0.0112F, 0.0303F, -1.3112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.6872F, -10.4587F, -1.8434F, -0.3376F, 0.2003F));

		PartDefinition cube_r247 = jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(92, 20).mirror().addBox(0.0052F, 3.3624F, -1.2811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.98F, 0.1128F, -6.5587F, -1.8151F, -0.2007F, 0.1928F));

		PartDefinition cube_r248 = jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(52, 93).mirror().addBox(0.0052F, 2.5661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(93, 44).mirror().addBox(0.0052F, 1.7661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(80, 93).mirror().addBox(0.0052F, 0.9661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.98F, 0.1128F, -6.5587F, -1.8326F, -0.2007F, 0.1928F));

		PartDefinition cube_r249 = jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(85, 83).mirror().addBox(0.0052F, 0.1694F, 0.0835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.98F, 0.1128F, -6.5587F, -1.9984F, -0.2007F, 0.1928F));

		PartDefinition cube_r250 = jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(75, 90).mirror().addBox(0.0852F, 0.1247F, 0.3433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 60).mirror().addBox(0.0852F, 0.1247F, 1.0933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.08F, 0.1128F, -4.3587F, -2.0462F, -0.0089F, 0.0871F));

		PartDefinition cube_r251 = jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(76, 86).mirror().addBox(0.0852F, 0.0533F, -0.6363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-6.08F, 0.1128F, -4.3587F, -1.5924F, -0.0089F, 0.0871F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(73, 19).mirror().addBox(0.0671F, 1.1477F, 1.0603F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-5.68F, 0.1128F, -1.4587F, -1.9199F, 0.1309F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(15, 90).mirror().addBox(0.0671F, 1.0444F, -0.2492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.68F, 0.1128F, -1.4587F, -1.7017F, 0.1309F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(65, 87).mirror().addBox(-0.2F, -0.0826F, 0.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -2.0508F, 0.2618F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(60, 87).mirror().addBox(-0.2F, 1.7829F, -0.7967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -1.4399F, 0.2618F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(42, 60).mirror().addBox(0.0671F, 0.0149F, -0.4264F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.68F, 0.1128F, -1.4587F, -1.6144F, 0.1309F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(72, 48).mirror().addBox(-0.2F, 1.6925F, -0.6085F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -1.2217F, 0.2618F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(76, 39).mirror().addBox(-0.2F, 1.0326F, -1.1819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -0.9163F, 0.2618F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(90, 93).mirror().addBox(-0.2F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.68F, 0.1128F, 1.2413F, -0.829F, 0.2618F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(85, 93).addBox(-1.0572F, 0.8127F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 70).addBox(-1.0572F, 0.0127F, -1.0133F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.2F, -1.7872F, -13.9337F, -1.9032F, 0.585F, -0.2272F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0572F, -0.0254F, -0.5331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.2F, -1.7872F, -13.9337F, -1.9119F, 0.585F, -0.2272F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(92, 11).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.104F, -2.3299F, -15.6446F, 3.1039F, 1.2426F, -1.5898F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(66, 99).addBox(-0.9661F, 0.0187F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1775F, -1.9857F, -16.0667F, -2.6996F, 1.2065F, -1.0812F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(99, 63).addBox(-0.9661F, 0.0187F, -0.9406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.0F, -1.7872F, -15.5337F, -2.1143F, 0.8985F, -0.4208F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(47, 86).addBox(-1.0209F, 0.0923F, -0.6906F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(67, 93).addBox(-1.0209F, -0.1077F, -0.6906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.2F, -1.1872F, -12.1587F, -1.8812F, 0.4658F, -0.2117F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(93, 35).addBox(-1.0112F, 0.7946F, -0.7959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.9F, -0.6872F, -10.4587F, -1.8521F, 0.3376F, -0.2003F));

		PartDefinition cube_r267 = jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(12, 86).addBox(-1.0112F, 0.0564F, -0.6191F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.9F, -0.6872F, -10.4587F, -1.9394F, 0.3376F, -0.2003F));

		PartDefinition cube_r268 = jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(57, 93).addBox(-1.0112F, -0.1697F, -0.7685F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.9F, -0.6872F, -10.4587F, -1.8783F, 0.3376F, -0.2003F));

		PartDefinition cube_r269 = jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(17, 86).addBox(-0.923F, -0.0456F, -1.0692F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.5F, 0.1128F, -8.5587F, -1.8639F, 0.2692F, -0.196F));

		PartDefinition cube_r270 = jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(34, 86).addBox(-0.923F, 0.2272F, -0.6931F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.5F, 0.1128F, -8.5587F, -1.9686F, 0.2692F, -0.196F));

		PartDefinition cube_r271 = jaw.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(93, 41).addBox(-1.0852F, 1.5003F, -0.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.1F, 0.1128F, -4.3587F, -1.7844F, 0.0089F, -0.0871F));

		PartDefinition cube_r272 = jaw.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(93, 38).addBox(-1.0052F, 0.1477F, -1.1973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(22, 86).addBox(-1.0052F, -0.0523F, -0.6973F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.0F, 0.1128F, -6.5587F, -1.7976F, 0.2007F, -0.1928F));

		PartDefinition cube_r273 = jaw.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(0, 99).addBox(-0.6F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0386F, -2.7363F, -15.6004F, 3.1106F, 1.2476F, -1.5903F));

		PartDefinition cube_r274 = jaw.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(98, 98).addBox(-0.7F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8121F, -2.7069F, -15.543F, -2.3599F, 1.1071F, -0.7202F));

		PartDefinition cube_r275 = jaw.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(93, 98).addBox(-0.5404F, -0.8796F, -0.5615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1081F, -2.6062F, -15.3207F, -2.1365F, 0.8792F, -0.5273F));

		PartDefinition cube_r276 = jaw.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(92, 86).addBox(-1.0209F, 1.329F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 93).addBox(-1.0209F, 0.529F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 92).addBox(-1.0209F, -0.271F, -1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.2F, -1.1872F, -12.1587F, -1.8724F, 0.4658F, -0.2117F));

		PartDefinition cube_r277 = jaw.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(93, 67).addBox(-1.0112F, 0.8303F, -1.3112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 73).addBox(-1.0112F, 0.0303F, -1.3112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(4.9F, -0.6872F, -10.4587F, -1.8434F, 0.3376F, -0.2003F));

		PartDefinition cube_r278 = jaw.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(92, 20).addBox(-1.0052F, 3.3624F, -1.2811F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.0F, 0.1128F, -6.5587F, -1.8151F, 0.2007F, -0.1928F));

		PartDefinition cube_r279 = jaw.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(52, 93).addBox(-1.0052F, 2.5661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(93, 44).addBox(-1.0052F, 1.7661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(80, 93).addBox(-1.0052F, 0.9661F, -1.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(6.0F, 0.1128F, -6.5587F, -1.8326F, 0.2007F, -0.1928F));

		PartDefinition cube_r280 = jaw.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 83).addBox(-1.0052F, 0.1694F, 0.0835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.0F, 0.1128F, -6.5587F, -1.9984F, 0.2007F, -0.1928F));

		PartDefinition cube_r281 = jaw.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(75, 90).addBox(-1.0852F, 0.1247F, 0.3433F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 60).addBox(-1.0852F, 0.1247F, 1.0933F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.1F, 0.1128F, -4.3587F, -2.0462F, 0.0089F, -0.0871F));

		PartDefinition cube_r282 = jaw.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(76, 86).addBox(-1.0852F, 0.0533F, -0.6363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(6.1F, 0.1128F, -4.3587F, -1.5924F, 0.0089F, -0.0871F));

		PartDefinition cube_r283 = jaw.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(73, 19).addBox(-1.0671F, 1.1477F, 1.0603F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.7F, 0.1128F, -1.4587F, -1.9199F, -0.1309F, 0.0F));

		PartDefinition cube_r284 = jaw.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(15, 90).addBox(-1.0671F, 1.0444F, -0.2492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.7F, 0.1128F, -1.4587F, -1.7017F, -0.1309F, 0.0F));

		PartDefinition cube_r285 = jaw.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(65, 87).addBox(-0.8F, -0.0826F, 0.37F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -2.0508F, -0.2618F, 0.0F));

		PartDefinition cube_r286 = jaw.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(60, 87).addBox(-0.8F, 1.7829F, -0.7967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -1.4399F, -0.2618F, 0.0F));

		PartDefinition cube_r287 = jaw.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(42, 60).addBox(-1.0671F, 0.0149F, -0.4264F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.7F, 0.1128F, -1.4587F, -1.6144F, -0.1309F, 0.0F));

		PartDefinition cube_r288 = jaw.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(72, 48).addBox(-0.8F, 1.6925F, -0.6085F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -1.2217F, -0.2618F, 0.0F));

		PartDefinition cube_r289 = jaw.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(76, 39).addBox(-0.8F, 1.0326F, -1.1819F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -0.9163F, -0.2618F, 0.0F));

		PartDefinition cube_r290 = jaw.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(90, 93).addBox(-0.8F, 0.1F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.7F, 0.1128F, 1.2413F, -0.829F, -0.2618F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(13, 40).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, -0.0575F, -0.1743F, 0.01F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(85, 99).addBox(0.0F, -0.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(56, 73).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(40, 6).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9141F, 3.6744F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4598F, 0.7945F, 0.5149F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(79, 99).addBox(0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(-2.2F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0406F, -0.0247F, -0.0051F, 0.182F, -0.006F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(34, 23).addBox(0.2F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0406F, -0.0247F, -0.0051F, -0.182F, 0.006F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(62, 63).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(88, 99).addBox(0.0F, -0.6F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, 0.1005F, -0.1302F, -0.0131F));

		PartDefinition Tailbase_r8 = Tailmiddlebase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(8, 100).addBox(0.0F, 0.9473F, 2.9302F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 100).addBox(0.0F, 0.3473F, 0.9302F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3233F, -1.2898F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(54, 26).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
				.texOffs(99, 88).addBox(0.0F, -0.4024F, 0.0764F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, 0.0527F, -0.1743F, -0.0092F));

		PartDefinition hindlegL2 = Hips.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6894F, 2.7467F, -1.4043F, -0.3333F, 0.3516F, -1.2744F));

		PartDefinition cube_r291 = hindlegL2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 94).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(94, 0).addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5259F, -0.2775F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r292 = hindlegL2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(79, 52).addBox(-0.5F, -1.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r293 = hindlegL2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(79, 48).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r294 = hindlegL2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(33, 79).addBox(-0.5F, 2.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r295 = hindlegL2.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(83, 27).addBox(-0.3F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(26, 83).addBox(-0.3F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.3193F, 2.1311F, -0.1375F, -0.0106F, -0.0138F, -0.9162F));

		PartDefinition cube_r296 = hindlegL2.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(78, 96).addBox(0.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(89, 48).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.023F, 5.5176F, -0.1966F, -0.0162F, -0.0065F, -0.3839F));

		PartDefinition cube_r297 = hindlegL2.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(65, 68).addBox(-1.0F, -1.7F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.5F, 3.4646F, -0.1608F, -0.0174F, -0.0015F, -0.0873F));

		PartDefinition cube_r298 = hindlegL2.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(11, 65).addBox(5.0F, 0.0F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL5 = hindlegL2.addOrReplaceChild("hindlegL5", CubeListBuilder.create().texOffs(40, 79).addBox(-0.5F, -0.4849F, -1.5823F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.8677F, 7.1136F, -0.122F, 0.1378F, 1.0288F, 1.2525F));

		PartDefinition cube_r299 = hindlegL5.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(28, 97).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 4.5611F, 0.1246F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r300 = hindlegL5.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(30, 90).addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0F, 4.4453F, 1.1252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r301 = hindlegL5.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(25, 90).addBox(-0.5022F, -0.1559F, -0.2112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0022F, 2.0717F, 1.0316F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r302 = hindlegL5.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(97, 26).addBox(-0.5022F, -2.7939F, -1.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0022F, 2.0967F, 1.0566F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r303 = hindlegL5.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(83, 33).addBox(-0.5022F, -2.8345F, -0.2332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(0.0022F, 2.0967F, 1.0566F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r304 = hindlegL5.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(83, 38).addBox(-0.4829F, -3.2578F, -0.6646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r305 = hindlegL5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(90, 23).addBox(-0.4829F, -2.9077F, -1.1273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r306 = hindlegL5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(98, 32).addBox(-0.4829F, -2.9919F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r307 = hindlegL5.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(96, 79).addBox(-0.4829F, 1.3949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(97, 85).addBox(-0.4829F, 1.8949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r308 = hindlegL5.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(90, 82).addBox(-0.4829F, 1.2658F, -0.9115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.0171F, 1.9496F, -0.8688F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bone6 = hindlegL5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.153F, 5.3736F, 0.4297F, -0.0449F, -0.1378F, -1.4599F));

		PartDefinition cube_r309 = bone6.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(34, 14).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone9 = bone6.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition cube_r310 = bone9.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6894F, 2.7467F, -1.4043F, 0.2991F, -0.2394F, 1.3263F));

		PartDefinition cube_r311 = hindlegL3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(94, 0).mirror().addBox(-0.5F, -0.7F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5259F, -0.2775F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r312 = hindlegL3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(79, 52).mirror().addBox(-0.5F, -1.7F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r313 = hindlegL3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(79, 48).mirror().addBox(-0.5F, -0.8F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.4851F, 0.8784F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r314 = hindlegL3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(33, 79).mirror().addBox(-0.5F, 2.5F, -2.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r315 = hindlegL3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(83, 27).mirror().addBox(-1.7F, 0.1F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(26, 83).mirror().addBox(-1.7F, -0.3F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.3193F, 2.1311F, -0.1375F, -0.0106F, 0.0138F, 0.9162F));

		PartDefinition cube_r316 = hindlegL3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-1.1F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(89, 48).mirror().addBox(-0.7F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.023F, 5.5176F, -0.1966F, -0.0162F, 0.0065F, 0.3839F));

		PartDefinition cube_r317 = hindlegL3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(65, 68).mirror().addBox(-1.0F, -1.7F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.5F, 3.4646F, -0.1608F, -0.0174F, 0.0015F, 0.0873F));

		PartDefinition cube_r318 = hindlegL3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-6.0F, 0.0F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(40, 79).mirror().addBox(-0.5F, -0.4849F, -1.5823F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.8677F, 7.1136F, -0.122F, 0.1378F, -1.0288F, -1.2525F));

		PartDefinition cube_r319 = hindlegL4.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(28, 97).mirror().addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5611F, 0.1246F, -0.8116F, 0.0F, 0.0F));

		PartDefinition cube_r320 = hindlegL4.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(-0.5F, -0.95F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.4453F, 1.1252F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r321 = hindlegL4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(25, 90).mirror().addBox(-0.4978F, -0.1559F, -0.2112F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0717F, 1.0316F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r322 = hindlegL4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(97, 26).mirror().addBox(-0.4978F, -2.7939F, -1.1413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0967F, 1.0566F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r323 = hindlegL4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(83, 33).mirror().addBox(-0.4978F, -2.8345F, -0.2332F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.0022F, 2.0967F, 1.0566F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r324 = hindlegL4.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(83, 38).mirror().addBox(-0.5171F, -3.2578F, -0.6646F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r325 = hindlegL4.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(90, 23).mirror().addBox(-0.5171F, -2.9077F, -1.1273F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r326 = hindlegL4.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(98, 32).mirror().addBox(-0.5171F, -2.9919F, -1.3755F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r327 = hindlegL4.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(96, 79).mirror().addBox(-0.5171F, 1.3949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(97, 85).mirror().addBox(-0.5171F, 1.8949F, -1.6127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r328 = hindlegL4.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(90, 82).mirror().addBox(-0.5171F, 1.2658F, -0.9115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.0171F, 1.9496F, -0.8688F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.153F, 5.3736F, 0.4297F, -0.0391F, 0.1832F, 1.5022F));

		PartDefinition cube_r329 = bone7.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(34, 14).mirror().addBox(-0.5F, -0.4F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, -0.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 2.9F, 0.075F));

		PartDefinition cube_r330 = bone8.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(-0.5F, -0.6F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4142F, 0.6287F, -2.9893F, -0.0852F, 0.0189F, 0.2174F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(83, 96).addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.6183F, 0.5094F, 2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(10, 90).addBox(-0.5F, -0.725F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, -1.4061F, 1.2058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, 2.852F, 1.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -1.4877F, -0.0878F, 0.3248F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(95, 29).addBox(-1.0F, 3.7894F, -0.1684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -1.2085F, -0.0878F, 0.3248F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(97, 11).addBox(-1.0F, 2.5108F, -1.798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 90).addBox(-1.0F, 2.5108F, -1.648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -0.7722F, -0.0878F, 0.3248F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(12, 79).addBox(-1.0F, 1.4195F, -1.5228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, -0.1177F, -0.0878F, 0.3248F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(91, 78).addBox(-1.0F, 0.4655F, -0.0828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.1005F, -0.0878F, 0.3248F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(62, 91).addBox(-1.0F, 0.5691F, 0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.2401F, -0.0878F, 0.3248F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(5, 91).addBox(-1.0F, 0.6936F, 1.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.3274F, -0.0878F, 0.3248F));

		PartDefinition cube_r340 = bone3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, 0.0196F, -3.1923F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.2314F, -0.0878F, 0.3248F));

		PartDefinition cube_r341 = bone3.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(87, 9).addBox(-1.0F, 0.952F, 1.9151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.4496F, -0.0878F, 0.3248F));

		PartDefinition cube_r342 = bone3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(8, 97).addBox(-1.0F, 2.7403F, 1.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 0.7812F, -0.0878F, 0.3248F));

		PartDefinition cube_r343 = bone3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(45, 80).addBox(-1.0F, 1.6383F, 0.2804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 2.0754F, 1.8415F, 1.3571F, -0.0878F, 0.3248F));

		PartDefinition cube_r344 = bone3.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(97, 8).addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(88, 96).addBox(-0.5F, 1.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1777F, 2.6408F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r345 = bone3.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 1.5651F, 0.5537F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r346 = bone3.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.025F, -1.425F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.151F, 2.0642F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r347 = bone3.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(72, 53).addBox(-0.5F, -0.625F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.9908F, 0.6078F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r348 = bone3.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(70, 89).addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1F, -0.352F, 0.8725F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r349 = bone3.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(15, 94).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 1.9643F, -1.0794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r350 = bone3.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(94, 89).addBox(-0.5F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.1F, 2.3096F, -0.5163F, 2.0769F, 0.0F, 0.0F));

		PartDefinition bone13 = Hips.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4142F, 0.6287F, -2.9893F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition cube_r351 = bone13.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(-0.5F, -1.025F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.6183F, 0.5094F, 2.1206F, 0.0F, 0.0F));

		PartDefinition cube_r352 = bone13.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-0.5F, -0.725F, -0.825F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4061F, 1.2058F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r353 = bone13.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(99, 0).mirror().addBox(0.0F, 2.852F, 1.46F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -1.4877F, 0.0878F, -0.3248F));

		PartDefinition cube_r354 = bone13.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(95, 29).mirror().addBox(0.0F, 3.7894F, -0.1684F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -1.2085F, 0.0878F, -0.3248F));

		PartDefinition cube_r355 = bone13.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(97, 11).mirror().addBox(0.0F, 2.5108F, -1.798F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 90).mirror().addBox(0.0F, 2.5108F, -1.648F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -0.7722F, 0.0878F, -0.3248F));

		PartDefinition cube_r356 = bone13.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(12, 79).mirror().addBox(0.0F, 1.4195F, -1.5228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, -0.1177F, 0.0878F, -0.3248F));

		PartDefinition cube_r357 = bone13.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(91, 78).mirror().addBox(0.0F, 0.4655F, -0.0828F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.1005F, 0.0878F, -0.3248F));

		PartDefinition cube_r358 = bone13.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(62, 91).mirror().addBox(0.0F, 0.5691F, 0.5402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.2401F, 0.0878F, -0.3248F));

		PartDefinition cube_r359 = bone13.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(5, 91).mirror().addBox(0.0F, 0.6936F, 1.2854F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.3274F, 0.0878F, -0.3248F));

		PartDefinition cube_r360 = bone13.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(0.0F, 0.0196F, -3.1923F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.2314F, 0.0878F, -0.3248F));

		PartDefinition cube_r361 = bone13.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(87, 9).mirror().addBox(0.0F, 0.952F, 1.9151F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.4496F, 0.0878F, -0.3248F));

		PartDefinition cube_r362 = bone13.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(8, 97).mirror().addBox(0.0F, 2.7403F, 1.7702F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 0.7812F, 0.0878F, -0.3248F));

		PartDefinition cube_r363 = bone13.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(45, 80).mirror().addBox(0.0F, 1.6383F, 0.2804F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.0754F, 1.8415F, 1.3571F, 0.0878F, -0.3248F));

		PartDefinition cube_r364 = bone13.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(97, 8).mirror().addBox(-0.5F, 0.025F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(88, 96).mirror().addBox(-0.5F, 1.0F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1777F, 2.6408F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r365 = bone13.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(5, 87).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.5651F, 0.5537F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r366 = bone13.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -1.025F, -1.425F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.151F, 2.0642F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r367 = bone13.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-0.5F, -0.625F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.9908F, 0.6078F, 1.021F, 0.0F, 0.0F));

		PartDefinition cube_r368 = bone13.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(70, 89).mirror().addBox(-0.5F, -1.05F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.352F, 0.8725F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r369 = bone13.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(15, 94).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.9643F, -1.0794F, 1.3788F, 0.0F, 0.0F));

		PartDefinition cube_r370 = bone13.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(94, 89).mirror().addBox(-0.5F, -0.325F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 2.3096F, -0.5163F, 2.0769F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 105, 105);
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