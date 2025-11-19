package fossils.fossils.client.blockentity.model.laidleria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LaidleriaFossilModel extends SkullModelBase {
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
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone8;

	public LaidleriaFossilModel(ModelPart root) {
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
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
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

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -7.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(41, 33).addBox(0.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 38).addBox(0.5F, -0.1957F, -3.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 33).mirror().addBox(-2.5F, -0.1957F, -1.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 38).mirror().addBox(-2.5F, -0.1957F, -3.495F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.2439F, 15.8867F, -0.1693F, 0.043F, -0.0073F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(33, 77).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -1.4109F, -0.0087F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(30, 77).addBox(0.0F, -1.0F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -3.5109F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Tailbase_r1 = Hips.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(78, 26).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7167F, -0.1695F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(37, 35).addBox(-0.5F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.0618F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(33, 44).addBox(0.0F, -0.8121F, 0.1978F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -2.1999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(77, 68).addBox(0.0F, -0.7551F, -0.0364F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -3.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-2.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0124F, -1.8603F, -0.0263F, 0.2073F, 0.0365F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 34).mirror().addBox(-2.8892F, -0.6312F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0124F, -1.8603F, -0.1042F, 0.2525F, -0.2884F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(-3.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0124F, -3.8603F, -0.1042F, 0.2525F, -0.2884F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 46).mirror().addBox(-2.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0124F, -3.8603F, -0.0263F, 0.2073F, 0.0365F));

		PartDefinition Bodymiddle_r3 = Bodymiddle.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(36, 16).mirror().addBox(-2.8883F, -0.1869F, 5.0115F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9422F, 4.7857F, -9.2384F, 0.2874F, 0.3295F, 0.374F));

		PartDefinition Bodymiddle_r4 = Bodymiddle.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(36, 16).addBox(-0.1117F, -0.1869F, 5.0115F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9422F, 4.7857F, -9.2384F, 0.2874F, -0.3295F, -0.374F));

		PartDefinition cube_r5 = Bodymiddle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 34).addBox(1.8892F, -0.6312F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0124F, -1.8603F, -0.1042F, -0.2525F, 0.2884F));

		PartDefinition cube_r6 = Bodymiddle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 50).addBox(0.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0124F, -1.8603F, -0.0263F, -0.2073F, -0.0365F));

		PartDefinition cube_r7 = Bodymiddle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 46).addBox(0.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0124F, -3.8603F, -0.0263F, -0.2073F, -0.0365F));

		PartDefinition cube_r8 = Bodymiddle.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(67, 48).addBox(1.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0124F, -3.8603F, -0.1042F, -0.2525F, 0.2884F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -0.4F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 21).addBox(0.0F, -1.1516F, -3.9641F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0367F, -0.2176F, -0.0142F));

		PartDefinition Bodymiddle_r5 = body.addOrReplaceChild("Bodymiddle_r5", CubeListBuilder.create().texOffs(48, 43).addBox(0.0F, -0.8016F, 0.0359F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 44).mirror().addBox(-2.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0034F, -1.7604F, -0.0263F, 0.2073F, 0.0365F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(67, 42).mirror().addBox(-3.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0034F, -1.7604F, -0.1042F, 0.2525F, -0.2884F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(76, 32).mirror().addBox(-4.3695F, -2.0422F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0034F, -1.7604F, -0.1918F, 0.1951F, -0.6779F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 12).mirror().addBox(-4.3695F, -2.0422F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0034F, -3.7604F, -0.1367F, 0.1269F, -0.6167F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-3.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0034F, -3.7604F, -0.0791F, 0.1687F, -0.2307F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 8).mirror().addBox(-2.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0034F, -3.7604F, -0.0296F, 0.1201F, 0.0883F));

		PartDefinition Bodymiddle_r6 = body.addOrReplaceChild("Bodymiddle_r6", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-2.2266F, -0.4674F, 1.3464F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9422F, 4.5945F, -5.3022F, 0.1913F, 0.2151F, 0.3292F));

		PartDefinition Bodymiddle_r7 = body.addOrReplaceChild("Bodymiddle_r7", CubeListBuilder.create().texOffs(25, 0).addBox(-0.7734F, -0.4674F, 1.3464F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9422F, 4.5945F, -5.3022F, 0.1913F, -0.2151F, -0.3292F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 32).addBox(3.3695F, -2.0422F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0034F, -1.7604F, -0.1918F, -0.1951F, 0.6779F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 42).addBox(1.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0034F, -1.7604F, -0.1042F, -0.2525F, 0.2884F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(67, 44).addBox(0.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.0034F, -1.7604F, -0.0263F, -0.2073F, -0.0365F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(67, 8).addBox(0.0023F, -0.0198F, -0.2191F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0034F, -3.7604F, -0.0296F, -0.1201F, -0.0883F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(67, 10).addBox(1.8892F, -0.6312F, -0.3445F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0034F, -3.7604F, -0.0791F, -0.1687F, 0.2307F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(76, 12).addBox(3.3695F, -2.0422F, -0.3445F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0034F, -3.7604F, -0.1367F, -0.1269F, 0.6167F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(28, 28).addBox(-0.4F, -0.4874F, -5.0045F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(77, 71).addBox(0.1F, -1.2874F, -2.0045F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.1F, 0.1018F, -3.9F, 0.0556F, -0.1307F, -0.0073F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(71, 77).addBox(0.0F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 63).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0984F, -1.6604F, -0.0296F, 0.1201F, 0.036F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-4.8594F, -0.9036F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -0.0984F, -1.6604F, -0.0791F, 0.1687F, -0.2831F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(52, 31).mirror().addBox(-5.1671F, -2.6582F, -0.5319F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -0.0984F, -1.6604F, -0.1367F, 0.1269F, -0.6691F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 66).mirror().addBox(-6.1671F, -2.6582F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -0.0984F, -3.6604F, -0.0954F, 0.1592F, -0.6687F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(-4.8594F, -0.9036F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.275F, -0.0984F, -3.6604F, -0.0283F, 0.1832F, -0.2797F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 63).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -0.0984F, -3.6604F, 0.0229F, 0.1182F, 0.0367F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(19, 13).mirror().addBox(-2.0679F, -0.5534F, -3.5464F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.8422F, 4.4367F, -1.5703F, 0.1073F, 0.1267F, 0.3212F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(19, 13).addBox(-0.9321F, -0.5534F, -3.5464F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.0422F, 4.4367F, -1.5703F, 0.1073F, -0.1267F, -0.3212F));

		PartDefinition cube_r27 = Bodyfront.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 31).addBox(4.1671F, -2.6582F, -0.5319F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0984F, -1.6604F, -0.1367F, -0.1269F, 0.6691F));

		PartDefinition cube_r28 = Bodyfront.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(66, 40).addBox(2.8594F, -0.9036F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0984F, -1.6604F, -0.0791F, -0.1687F, 0.2831F));

		PartDefinition cube_r29 = Bodyfront.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(30, 63).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0984F, -1.6604F, -0.0296F, -0.1201F, -0.036F));

		PartDefinition cube_r30 = Bodyfront.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(21, 63).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0984F, -3.6604F, 0.0229F, -0.1182F, -0.0367F));

		PartDefinition cube_r31 = Bodyfront.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(65, 24).addBox(2.8594F, -0.9036F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0984F, -3.6604F, -0.0283F, -0.1832F, 0.2797F));

		PartDefinition cube_r32 = Bodyfront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(10, 66).addBox(4.1671F, -2.6582F, -0.5319F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.475F, -0.0984F, -3.6604F, -0.0954F, -0.1592F, 0.6687F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(74, 77).addBox(0.0F, -1.5F, -4.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -5.0048F, 0.0528F, 0.1307F, 0.0069F));

		PartDefinition Bodyfront_r4 = body2.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(77, 77).addBox(0.0F, -1.3F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(77, 74).addBox(0.0F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -0.6306F, 0.0216F, 0.0833F, 0.0366F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(33, 69).mirror().addBox(-4.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -0.6306F, -0.0185F, 0.1496F, -0.2781F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(62, 61).mirror().addBox(-7.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -0.6306F, -0.0736F, 0.1317F, -0.6655F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -4.6306F, 0.0901F, 0.0459F, 0.0374F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-4.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -4.6306F, 0.0588F, 0.1349F, -0.2707F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 12).mirror().addBox(-7.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -4.6306F, 0.0036F, 0.1471F, -0.6584F));

		PartDefinition cube_r39 = body2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(48, 57).mirror().addBox(-7.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -2.6306F, 0.0036F, 0.1471F, -0.6584F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(67, 52).mirror().addBox(-4.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -2.6306F, 0.0588F, 0.1349F, -0.2707F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(57, 40).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2209F, -2.6306F, 0.0901F, 0.0459F, 0.0374F));

		PartDefinition Bodyfront_r5 = body2.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-2.3696F, -0.2203F, -9.0728F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.9422F, 4.3735F, 3.3587F, -0.0145F, 0.0288F, 0.3078F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(60, 12).addBox(4.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -4.6306F, 0.0036F, -0.1471F, 0.6584F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(69, 12).addBox(2.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -4.6306F, 0.0588F, -0.1349F, 0.2707F));

		PartDefinition cube_r44 = body2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(60, 54).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -4.6306F, 0.0901F, -0.0459F, -0.0374F));

		PartDefinition cube_r45 = body2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(62, 61).addBox(4.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -0.6306F, -0.0736F, -0.1317F, 0.6655F));

		PartDefinition cube_r46 = body2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 69).addBox(2.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -0.6306F, -0.0185F, -0.1496F, 0.2781F));

		PartDefinition cube_r47 = body2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 63).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -0.6306F, 0.0216F, -0.0833F, -0.0366F));

		PartDefinition cube_r48 = body2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 57).addBox(4.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -2.6306F, 0.0036F, -0.1471F, 0.6584F));

		PartDefinition cube_r49 = body2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(67, 52).addBox(2.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -2.6306F, 0.0588F, -0.1349F, 0.2707F));

		PartDefinition cube_r50 = body2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(57, 40).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -2.6306F, 0.0901F, -0.0459F, -0.0374F));

		PartDefinition Bodyfront_r6 = body2.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(0, 13).addBox(-0.6304F, -0.2203F, -9.0728F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.9422F, 4.3735F, 3.3587F, -0.0145F, -0.0288F, -0.3078F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(10, 78).addBox(0.0F, -1.15F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0617F, 0.2179F, 0.0008F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(20, 78).addBox(0.0F, -1.275F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r8 = chest.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(14, 57).addBox(0.0F, -1.325F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 47).addBox(-1.5F, -10.5558F, -2.1797F, 3.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(36, 12).addBox(-3.0F, -6.5585F, -2.211F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.4957F, -1.7391F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(34, 20).addBox(-2.5F, -4.7998F, -1.5833F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.4957F, -1.7391F, 1.4923F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(57, 57).addBox(-8.4619F, -8.4619F, -3.1724F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.4957F, -1.7391F, 1.1514F, -0.7401F, 0.2921F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-4.6555F, -2.2605F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0291F, -5.6806F, -0.0588F, 0.0989F, -0.6633F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(40, 69).mirror().addBox(-4.2361F, -0.7265F, -0.4805F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0291F, -5.6806F, -0.0173F, 0.1137F, -0.2775F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(64, 31).mirror().addBox(-2.395F, -0.0021F, -0.3292F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0291F, -5.6806F, 0.0116F, 0.0488F, 0.0364F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-6.1474F, -2.6429F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -3.6806F, -0.0696F, 0.1126F, -0.6645F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-4.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -3.6806F, -0.0222F, 0.1305F, -0.278F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(9, 64).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -3.6806F, 0.0122F, 0.0662F, 0.0364F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 63).mirror().addBox(-2.9945F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -1.6806F, 0.0116F, 0.0488F, 0.0364F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(69, 33).mirror().addBox(-4.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -1.6806F, -0.0173F, 0.1137F, -0.2775F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-7.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.0291F, -1.6806F, -0.0588F, 0.0989F, -0.6633F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 31).addBox(-0.605F, -0.0021F, -0.3292F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0291F, -5.6806F, 0.0116F, -0.0488F, -0.0364F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(40, 69).addBox(2.2361F, -0.7265F, -0.4805F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0291F, -5.6806F, -0.0173F, -0.1137F, 0.2775F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(9, 62).addBox(3.6555F, -2.2605F, -0.4805F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0291F, -5.6806F, -0.0588F, -0.0989F, 0.6633F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(9, 64).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -3.6806F, 0.0122F, -0.0662F, -0.0364F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 35).addBox(2.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -3.6806F, -0.0222F, -0.1305F, 0.278F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 0).addBox(4.1474F, -2.6429F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -3.6806F, -0.0696F, -0.1126F, 0.6645F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(46, 63).addBox(4.1474F, -2.6429F, -0.5299F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -1.6806F, -0.0588F, -0.0989F, 0.6633F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 33).addBox(2.8354F, -0.8968F, -0.5299F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -1.6806F, -0.0173F, -0.1137F, 0.2775F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(62, 63).addBox(-0.0055F, 0.0197F, -0.3378F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.0291F, -1.6806F, 0.0116F, -0.0488F, -0.0364F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(64, 33).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.7849F, 4.4746F, -4.2745F, -0.4626F, -0.1806F, -1.1754F));

		PartDefinition cube_r72 = forelegL.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(5, 70).addBox(-0.503F, -2.6399F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(0, 70).addBox(-0.503F, -2.6399F, -0.2924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r73 = forelegL.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 69).addBox(-0.503F, -0.4229F, -1.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 2.2109F, 0.5435F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r74 = forelegL.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(62, 69).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2854F, 3.2348F, -0.1233F, -1.3668F, 0.4555F, -0.6456F));

		PartDefinition cube_r75 = forelegL2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(70, 17).addBox(-0.5F, -0.075F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(15, 70).addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.4234F, 0.8486F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r76 = forelegL2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 14).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r77 = forelegL2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r78 = forelegL2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(64, 56).addBox(-0.5F, -1.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0429F, 1.8208F, -0.0755F, -0.299F, -0.2367F, -0.0657F));

		PartDefinition cube_r79 = bone.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(33, 47).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(64, 33).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.7849F, 4.4746F, -4.2745F, 0.9947F, -0.8658F, 0.833F));

		PartDefinition cube_r80 = forelegL3.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 70).mirror().addBox(-0.497F, -2.6399F, -0.9924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(0, 70).mirror().addBox(-0.497F, -2.6399F, -0.2924F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r81 = forelegL3.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(67, 69).mirror().addBox(-0.497F, -0.4229F, -1.281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.2109F, 0.5435F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r82 = forelegL3.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(62, 69).mirror().addBox(-0.5F, -0.675F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2854F, 3.2348F, -0.1233F, -1.6173F, -1.2863F, 0.9425F));

		PartDefinition cube_r83 = forelegL4.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 17).mirror().addBox(-0.5F, -0.075F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(15, 70).mirror().addBox(-0.5F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.4234F, 0.8486F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r84 = forelegL4.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 14).mirror().addBox(-0.5F, -1.125F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r85 = forelegL4.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(27, 50).mirror().addBox(-0.5F, -1.3F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.152F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r86 = forelegL4.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(64, 56).mirror().addBox(-0.5F, -1.6F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4429F, 2.0208F, -0.0755F, -0.3712F, 0.1313F, 0.3244F));

		PartDefinition cube_r87 = bone5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 47).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 0.5721F, -2.735F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(32, 59).addBox(-0.4691F, -0.503F, -1.7583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 1.4901F, 0.2439F, -0.0576F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(57, 36).addBox(-0.4691F, -0.609F, -0.1073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 1.141F, 0.2439F, -0.0576F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(18, 50).addBox(-0.4691F, -1.114F, 0.5295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 0.7483F, 0.2439F, -0.0576F));

		PartDefinition cube_r91 = bone2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(41, 57).addBox(-0.4691F, -2.5089F, -0.1227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 0.1375F, 0.2439F, -0.0576F));

		PartDefinition cube_r92 = bone2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(57, 31).addBox(-0.4691F, -2.2438F, -1.211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 0.9229F, 0.2439F, -0.0576F));

		PartDefinition cube_r93 = bone2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(47, 69).addBox(-0.4435F, -2.3754F, -0.2034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 0.4953F, 0.2439F, -0.0576F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 65).addBox(-0.4435F, -1.5002F, -2.5154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(35, 65).addBox(-0.4435F, -0.6002F, -2.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 1.1061F, 0.2439F, -0.0576F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(7, 57).addBox(-1.5125F, -1.5236F, -0.5923F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.3875F, 3.8215F, 1.3837F, 2.046F, 0.1243F, 0.0637F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 33).addBox(-4.0893F, -0.2783F, -0.325F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5893F, 4.5058F, 0.4351F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(51, 53).addBox(-4.0893F, -2.0033F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5893F, 4.3558F, 0.4351F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(18, 55).addBox(-1.575F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.8012F, 6.7669F, -6.3036F, 2.0052F, 0.7307F, 0.3187F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(0, 48).addBox(-4.1551F, 0.054F, -0.0259F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.4318F, 6.4748F, -4.4196F, 1.9522F, 0.3072F, 0.0419F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(47, 22).addBox(-4.0078F, -0.0212F, -0.2771F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.8413F, 6.8724F, -5.8631F, 1.9978F, 0.533F, 0.1662F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(48, 38).addBox(-0.5083F, -0.1169F, -1.349F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.4876F, 5.1045F, -3.4562F, 0.6489F, 0.4596F, 0.3534F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(34, 54).addBox(-0.1471F, 1.2321F, -1.2139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7264F, 1.9716F, -1.3895F, 0.1464F, 0.3437F, 0.2018F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(30, 65).addBox(0.1149F, 1.3464F, 0.3178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3514F, 1.9716F, -1.3895F, 0.2654F, 0.3191F, 0.1252F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(25, 59).addBox(-1.7339F, -1.0409F, -2.1151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.975F, 6.4002F, -4.3269F, 0.7428F, 0.5217F, 0.4858F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 59).addBox(-0.4787F, -0.4715F, -0.9506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4876F, 5.1045F, -3.4562F, 0.7215F, 0.4956F, 0.3515F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(58, 23).addBox(-0.4787F, -0.9048F, -0.927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4876F, 5.1045F, -3.4562F, 1.2014F, 0.4956F, 0.3515F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(27, 54).addBox(-0.1772F, -0.8452F, -3.2141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.7264F, 1.9716F, -1.3895F, 0.9513F, 0.3221F, 0.2185F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(58, 19).addBox(0.1F, -0.7F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8008F, 3.135F, 1.7762F, -3.0636F, 0.131F, -0.0035F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(58, 15).addBox(-0.5145F, -1.1469F, -2.6779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 2.1636F, 0.2719F, -0.0675F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 54).addBox(-0.4435F, -2.5203F, -1.684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8623F, 1.3851F, -0.4578F, 1.5512F, 0.2439F, -0.0576F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 0.5721F, -2.735F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r111 = bone7.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(32, 59).mirror().addBox(-0.5309F, -0.503F, -1.7583F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 1.4901F, -0.2439F, 0.0576F));

		PartDefinition cube_r112 = bone7.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(57, 36).mirror().addBox(-0.5309F, -0.609F, -0.1073F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 1.141F, -0.2439F, 0.0576F));

		PartDefinition cube_r113 = bone7.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(18, 50).mirror().addBox(-0.5309F, -1.114F, 0.5295F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 0.7483F, -0.2439F, 0.0576F));

		PartDefinition cube_r114 = bone7.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(41, 57).mirror().addBox(-0.5309F, -2.5089F, -0.1227F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 0.1375F, -0.2439F, 0.0576F));

		PartDefinition cube_r115 = bone7.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 31).mirror().addBox(-0.5309F, -2.2438F, -1.211F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 0.9229F, -0.2439F, 0.0576F));

		PartDefinition cube_r116 = bone7.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(47, 69).mirror().addBox(-0.5565F, -2.3754F, -0.2034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 0.4953F, -0.2439F, 0.0576F));

		PartDefinition cube_r117 = bone7.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-0.5565F, -1.5002F, -2.5154F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(35, 65).mirror().addBox(-0.5565F, -0.6002F, -2.0154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 1.1061F, -0.2439F, 0.0576F));

		PartDefinition cube_r118 = bone7.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(7, 57).mirror().addBox(-0.4875F, -1.5236F, -0.5923F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.3875F, 3.8215F, 1.3837F, 2.046F, -0.1243F, -0.0637F));

		PartDefinition cube_r119 = bone7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(48, 33).mirror().addBox(1.0893F, -0.2783F, -0.325F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5893F, 4.5058F, 0.4351F, 2.0682F, 0.0F, 0.0F));

		PartDefinition cube_r120 = bone7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(51, 53).mirror().addBox(1.0893F, -2.0033F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5893F, 4.3558F, 0.4351F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r121 = bone7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(18, 55).mirror().addBox(-0.425F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.8012F, 6.7669F, -6.3036F, 2.0052F, -0.7307F, -0.3187F));

		PartDefinition cube_r122 = bone7.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(1.1551F, 0.054F, -0.0259F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4318F, 6.4748F, -4.4196F, 1.9522F, -0.3072F, -0.0419F));

		PartDefinition cube_r123 = bone7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(47, 22).mirror().addBox(0.0078F, -0.0212F, -0.2771F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.8413F, 6.8724F, -5.8631F, 1.9978F, -0.533F, -0.1662F));

		PartDefinition cube_r124 = bone7.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 38).mirror().addBox(-0.4917F, -0.1169F, -1.349F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, 5.1045F, -3.4562F, 0.6489F, -0.4596F, -0.3534F));

		PartDefinition cube_r125 = bone7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 54).mirror().addBox(-0.8529F, 1.2321F, -1.2139F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7264F, 1.9716F, -1.3895F, 0.1464F, -0.3437F, -0.2018F));

		PartDefinition cube_r126 = bone7.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(30, 65).mirror().addBox(-1.1149F, 1.3464F, 0.3178F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3514F, 1.9716F, -1.3895F, 0.2654F, -0.3191F, -0.1252F));

		PartDefinition cube_r127 = bone7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(25, 59).mirror().addBox(0.7339F, -1.0409F, -2.1151F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.975F, 6.4002F, -4.3269F, 0.7428F, -0.5217F, -0.4858F));

		PartDefinition cube_r128 = bone7.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-0.5213F, -0.4715F, -0.9506F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, 5.1045F, -3.4562F, 0.7215F, -0.4956F, -0.3515F));

		PartDefinition cube_r129 = bone7.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-0.5213F, -0.9048F, -0.927F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4876F, 5.1045F, -3.4562F, 1.2014F, -0.4956F, -0.3515F));

		PartDefinition cube_r130 = bone7.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(27, 54).mirror().addBox(-0.8228F, -0.8452F, -3.2141F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.7264F, 1.9716F, -1.3895F, 0.9513F, -0.3221F, -0.2185F));

		PartDefinition cube_r131 = bone7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-1.1F, -0.7F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8008F, 3.135F, 1.7762F, -3.0636F, -0.131F, 0.0035F));

		PartDefinition cube_r132 = bone7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(58, 15).mirror().addBox(-0.4855F, -1.1469F, -2.6779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 2.1636F, -0.2719F, 0.0675F));

		PartDefinition cube_r133 = bone7.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.5565F, -2.5203F, -1.684F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8623F, 1.3851F, -0.4578F, 1.5512F, -0.2439F, 0.0576F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(19, 20).addBox(-0.5F, -0.7596F, -5.9227F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(40, 74).addBox(0.0F, -1.3339F, -3.9303F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 24).addBox(0.0F, -1.2339F, -5.9303F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, -0.006F, 0.2618F, -0.0015F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(21, 60).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r134 = Neck.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 66).mirror().addBox(-0.9461F, -0.0545F, -0.3085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -3.6797F, 0.0141F, 0.1185F, 0.0366F));

		PartDefinition cube_r135 = Neck.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-3.5143F, -1.3734F, -0.3658F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -3.6797F, -0.1023F, 0.1538F, -0.6688F));

		PartDefinition cube_r136 = Neck.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(67, 6).mirror().addBox(-2.8457F, -0.3315F, -0.3658F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -3.6797F, -0.0368F, 0.1808F, -0.2803F));

		PartDefinition cube_r137 = Neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(67, 4).mirror().addBox(-3.8046F, -0.6039F, -0.4449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -1.6797F, -0.0319F, 0.164F, -0.2795F));

		PartDefinition cube_r138 = Neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-4.3013F, -1.9852F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -1.6797F, -0.0913F, 0.1401F, -0.6672F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 2).mirror().addBox(-1.9453F, -0.0183F, -0.3228F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.45F, -0.3133F, -1.6797F, 0.0135F, 0.1011F, 0.0365F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(67, 6).addBox(0.8457F, -0.3315F, -0.3658F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -3.6797F, -0.0368F, -0.1808F, 0.2803F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(74, 58).addBox(2.5143F, -1.3734F, -0.3658F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -3.6797F, -0.1023F, -0.1538F, 0.6688F));

		PartDefinition cube_r142 = Neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 66).addBox(-0.0539F, -0.0545F, -0.3085F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -3.6797F, 0.0141F, -0.1185F, -0.0366F));

		PartDefinition cube_r143 = Neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(67, 2).addBox(-0.0547F, -0.0183F, -0.3228F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -1.6797F, 0.0135F, -0.1011F, -0.0365F));

		PartDefinition cube_r144 = Neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(76, 36).addBox(3.3013F, -1.9852F, -0.4449F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -1.6797F, -0.0913F, -0.1401F, 0.6672F));

		PartDefinition cube_r145 = Neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(67, 4).addBox(1.8046F, -0.6039F, -0.4449F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.45F, -0.3133F, -1.6797F, -0.0319F, -0.164F, 0.2795F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.4846F, -5.7751F, -0.1139F, -0.1745F, 0.0046F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(75, 63).addBox(-0.175F, -0.45F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0245F, 0.0786F, -10.7744F, 0.123F, 0.7754F, 0.086F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(48, 59).addBox(-0.5F, -0.475F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0214F, 0.0099F, -10.2785F, 0.0877F, -0.0062F, -0.0008F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(51, 5).addBox(-0.5121F, 0.0571F, 0.0064F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0265F, -0.5219F, -10.1348F, 0.0572F, -0.0063F, -0.0005F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(40, 6).addBox(-0.5165F, -0.0219F, 2.9377F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F))
				.texOffs(51, 0).addBox(-0.5165F, -0.0307F, 6.9303F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0265F, -0.5219F, -10.1348F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -11.1F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.5964F, -0.0594F, 0.0131F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1052F, -0.4508F, -3.593F, 0.3139F, -0.0359F, 0.1008F));

		PartDefinition Head_r6 = leftFace.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(70, 20).addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.2097F, -1.2072F, -5.4762F, -0.2933F, 0.9543F, -0.0568F));

		PartDefinition Head_r7 = leftFace.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 42).addBox(-0.325F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.6228F, 0.5264F, 1.3294F, -0.2831F, 0.1989F, -0.2723F));

		PartDefinition Head_r8 = leftFace.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(11, 42).addBox(-0.5F, 0.0F, -3.825F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6229F, -0.8785F, -2.4144F, -0.2621F, 0.1235F, -0.2502F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(37, 41).addBox(-0.575F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.196F, 0.1067F, -0.5402F, -0.2779F, 0.0606F, -0.2321F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(74, 3).addBox(-1.1168F, 0.3445F, 0.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)), PartPose.offsetAndRotation(-1.4867F, 0.7857F, 3.1954F, -0.4232F, 0.7141F, -0.7726F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(42, 53).addBox(-0.6668F, 0.3445F, -1.2961F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4867F, 0.7857F, 3.1954F, -0.324F, 0.2246F, -0.5604F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(9, 53).addBox(-0.1168F, -0.0555F, -1.8211F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.4867F, 0.7857F, 3.1954F, -0.282F, 0.178F, -0.2661F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(55, 61).addBox(0.025F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3264F, 0.2857F, 3.298F, -0.2139F, -0.1551F, 0.1179F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(60, 50).addBox(-0.975F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.3264F, 0.2857F, 3.298F, -0.1119F, -0.2391F, -0.3914F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(39, 61).addBox(-0.975F, 0.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1408F, 0.0745F, 2.3046F, 0.1923F, -0.4794F, -0.6861F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(60, 46).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.2964F, 0.6571F, 2.4482F, -0.2067F, -0.4738F, 0.1441F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(60, 42).addBox(0.8939F, 0.0663F, 1.3996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.1838F, -0.0454F, 0.0572F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(14, 60).addBox(1.8572F, 0.0663F, 1.168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.1865F, -0.1741F, 0.0814F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(67, 72).addBox(2.0796F, 0.0663F, 2.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.1838F, 0.0403F, 0.0413F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(62, 72).addBox(1.5988F, 0.0663F, 3.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.1982F, 0.3832F, -0.0262F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(52, 27).addBox(-0.5829F, 0.0663F, 2.1528F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2374F, 0.6816F, -0.1025F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(51, 48).addBox(-0.2099F, -0.0028F, -4.978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2054F, 0.1984F, 0.0543F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(47, 16).addBox(0.4699F, -0.0028F, -1.8719F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.22F, 0.4117F, 0.0061F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(22, 44).addBox(-0.012F, -0.0028F, -1.9822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2098F, 0.2838F, 0.0358F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(57, 69).addBox(0.9871F, -0.054F, 1.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.242F, 0.4451F, -0.0055F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(51, 10).addBox(0.9838F, 0.0006F, -1.9584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2354F, 0.4253F, -0.0231F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(5, 73).addBox(0.1237F, -0.0208F, -1.1285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 73).addBox(0.1237F, -0.0208F, -1.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.232F, 0.3796F, -0.0291F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(72, 71).addBox(-0.3451F, -0.0208F, -2.4176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2159F, 0.0816F, 0.0404F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(61, 27).addBox(0.265F, -0.0208F, -2.1767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2282F, 0.3371F, -0.0184F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(60, 4).addBox(0.9163F, -0.0185F, -3.0715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2247F, 0.3748F, -0.0138F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(58, 75).addBox(-0.5F, -0.575F, 1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(53, 75).addBox(-0.5F, -0.575F, 1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(48, 75).addBox(-0.5F, -0.575F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 20).addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1912F, 0.1292F, -2.5484F, -0.313F, 0.3977F, -0.1943F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(25, 76).addBox(-0.35F, -0.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(20, 75).addBox(-0.35F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(69, 57).addBox(-0.35F, -0.725F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.8833F, -0.0568F, -4.3086F, -0.3203F, 0.4475F, -0.2122F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(74, 6).addBox(-0.35F, -0.675F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(75, 17).addBox(-0.35F, -0.65F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(5, 66).addBox(-0.35F, -1.45F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 65).addBox(-0.35F, -1.35F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(60, 65).addBox(-0.35F, -1.45F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0027F, -0.7765F, -6.9973F, -0.3067F, 0.3479F, -0.1772F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(28, 69).addBox(-0.275F, -0.975F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5932F, -0.5294F, -4.4555F, -0.257F, 0.2932F, -0.2066F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(68, 26).addBox(-0.2F, -1.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1892F, -0.0602F, -6.5803F, -0.2744F, 0.2932F, -0.2066F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(72, 68).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-2.0028F, -1.4632F, -6.8693F, -0.2146F, 0.3789F, -0.0411F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(25, 73).addBox(-0.425F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.183F))
				.texOffs(15, 73).addBox(-0.425F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-1.6589F, -1.2352F, -5.9292F, -0.2277F, 0.3447F, -0.0244F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(60, 0).addBox(0.7853F, 0.028F, -6.7736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.2315F, 0.3872F, -0.035F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(23, 65).addBox(-4.7172F, -0.0009F, -2.2369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -0.3579F, 0.2811F, -0.4198F, -1.039F, 0.4276F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0852F, -0.4508F, -3.593F, 0.3139F, 0.0359F, -0.1008F));

		PartDefinition Head_r40 = rightFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(70, 20).mirror().addBox(-0.5F, -0.4F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(2.2097F, -1.2072F, -5.4762F, -0.2933F, -0.9543F, 0.0568F));

		PartDefinition Head_r41 = rightFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.675F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.6228F, 0.5264F, 1.3294F, -0.2831F, -0.1989F, 0.2723F));

		PartDefinition Head_r42 = rightFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(11, 42).mirror().addBox(-0.5F, 0.0F, -3.825F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6229F, -0.8785F, -2.4144F, -0.2621F, -0.1235F, 0.2502F));

		PartDefinition Head_r43 = rightFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(37, 41).mirror().addBox(-0.425F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.196F, 0.1067F, -0.5402F, -0.2779F, -0.0606F, 0.2321F));

		PartDefinition Head_r44 = rightFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(74, 3).mirror().addBox(0.1168F, 0.3445F, 0.1539F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.13F)).mirror(false), PartPose.offsetAndRotation(1.4867F, 0.7857F, 3.1954F, -0.4232F, -0.7141F, 0.7726F));

		PartDefinition Head_r45 = rightFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(42, 53).mirror().addBox(-1.3332F, 0.3445F, -1.2961F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4867F, 0.7857F, 3.1954F, -0.324F, -0.2246F, 0.5604F));

		PartDefinition Head_r46 = rightFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(9, 53).mirror().addBox(-1.8832F, -0.0555F, -1.8211F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(1.4867F, 0.7857F, 3.1954F, -0.282F, -0.178F, 0.2661F));

		PartDefinition Head_r47 = rightFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(55, 61).mirror().addBox(-1.025F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 0.2857F, 3.298F, -0.2139F, 0.1551F, -0.1179F));

		PartDefinition Head_r48 = rightFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(60, 50).mirror().addBox(-0.025F, 0.0F, -1.975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.3264F, 0.2857F, 3.298F, -0.1119F, 0.2391F, 0.3914F));

		PartDefinition Head_r49 = rightFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(39, 61).mirror().addBox(-0.025F, 0.025F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1408F, 0.0745F, 2.3046F, 0.1923F, 0.4794F, 0.6861F));

		PartDefinition Head_r50 = rightFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(60, 46).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2964F, 0.6571F, 2.4482F, -0.2067F, 0.4738F, -0.1441F));

		PartDefinition Head_r51 = rightFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(60, 42).mirror().addBox(-1.8939F, 0.0663F, 1.3996F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.1838F, 0.0454F, -0.0572F));

		PartDefinition Head_r52 = rightFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(14, 60).mirror().addBox(-2.8572F, 0.0663F, 1.168F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.1865F, 0.1741F, -0.0814F));

		PartDefinition Head_r53 = rightFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(67, 72).mirror().addBox(-3.0796F, 0.0663F, 2.7189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.1838F, -0.0403F, -0.0413F));

		PartDefinition Head_r54 = rightFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-2.5988F, 0.0663F, 3.5117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.1982F, -0.3832F, 0.0262F));

		PartDefinition Head_r55 = rightFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-1.4171F, 0.0663F, 2.1528F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2374F, -0.6816F, 0.1025F));

		PartDefinition Head_r56 = rightFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(51, 48).mirror().addBox(-0.7901F, -0.0028F, -4.978F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2054F, -0.1984F, -0.0543F));

		PartDefinition Head_r57 = rightFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(47, 16).mirror().addBox(-1.4699F, -0.0028F, -1.8719F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.22F, -0.4117F, -0.0061F));

		PartDefinition Head_r58 = rightFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(22, 44).mirror().addBox(-0.988F, -0.0028F, -1.9822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2098F, -0.2838F, -0.0358F));

		PartDefinition Head_r59 = rightFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(57, 69).mirror().addBox(-1.9871F, -0.054F, 1.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.242F, -0.4451F, 0.0055F));

		PartDefinition Head_r60 = rightFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-1.9838F, 0.0006F, -1.9584F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2354F, -0.4253F, 0.0231F));

		PartDefinition Head_r61 = rightFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(5, 73).mirror().addBox(-1.1237F, -0.0208F, -1.1285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 73).mirror().addBox(-1.1237F, -0.0208F, -1.5035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.232F, -0.3796F, 0.0291F));

		PartDefinition Head_r62 = rightFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-0.6549F, -0.0208F, -2.4176F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2159F, -0.0816F, -0.0404F));

		PartDefinition Head_r63 = rightFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(61, 27).mirror().addBox(-1.265F, -0.0208F, -2.1767F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2282F, -0.3371F, 0.0184F));

		PartDefinition Head_r64 = rightFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-1.9163F, -0.0185F, -3.0715F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2247F, -0.3748F, 0.0138F));

		PartDefinition Head_r65 = rightFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(58, 75).mirror().addBox(-0.5F, -0.575F, 1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 75).mirror().addBox(-0.5F, -0.575F, 1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(48, 75).mirror().addBox(-0.5F, -0.575F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 20).mirror().addBox(-0.5F, -0.575F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1912F, 0.1292F, -2.5484F, -0.313F, -0.3977F, 0.1943F));

		PartDefinition Head_r66 = rightFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-0.65F, -0.75F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(20, 75).mirror().addBox(-0.65F, -0.7F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(69, 57).mirror().addBox(-0.65F, -0.725F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.8833F, -0.0568F, -4.3086F, -0.3203F, -0.4475F, 0.2122F));

		PartDefinition Head_r67 = rightFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(74, 6).mirror().addBox(-0.65F, -0.675F, 1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(75, 17).mirror().addBox(-0.65F, -0.65F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 66).mirror().addBox(-0.65F, -1.45F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 65).mirror().addBox(-0.65F, -1.35F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(60, 65).mirror().addBox(-0.65F, -1.45F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.0027F, -0.7765F, -6.9973F, -0.3067F, -0.3479F, 0.1772F));

		PartDefinition Head_r68 = rightFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(28, 69).mirror().addBox(-0.725F, -0.975F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.5932F, -0.5294F, -4.4555F, -0.257F, -0.2932F, 0.2066F));

		PartDefinition Head_r69 = rightFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(68, 26).mirror().addBox(-0.8F, -1.8F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1892F, -0.0602F, -6.5803F, -0.2744F, -0.2932F, 0.2066F));

		PartDefinition Head_r70 = rightFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(72, 68).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(2.0028F, -1.4632F, -6.8693F, -0.2146F, -0.3789F, 0.0411F));

		PartDefinition Head_r71 = rightFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.575F, -0.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.183F)).mirror(false)
				.texOffs(15, 73).mirror().addBox(-0.575F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(1.6589F, -1.2352F, -5.9292F, -0.2277F, -0.3447F, 0.0244F));

		PartDefinition Head_r72 = rightFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-1.7853F, 0.028F, -6.7736F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.2315F, -0.3872F, 0.035F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(23, 65).mirror().addBox(2.7172F, -0.0009F, -2.2369F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4292F, -0.3579F, 0.2811F, -0.4198F, 1.039F, -0.4276F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6113F, -0.1349F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(75, 14).mirror().addBox(0.258F, -1.0848F, -0.5371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(10, 75).mirror().addBox(0.258F, -0.3848F, -0.6121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(72, 74).mirror().addBox(0.258F, 0.3152F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 55).mirror().addBox(0.258F, 1.0152F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 52).mirror().addBox(0.258F, 1.7152F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 49).mirror().addBox(0.258F, 2.4152F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 46).mirror().addBox(0.258F, 3.1152F, -0.5621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 43).mirror().addBox(0.258F, 3.8152F, -0.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 40).mirror().addBox(0.258F, 4.5152F, -0.5621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(35, 74).mirror().addBox(0.258F, 5.2152F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(30, 74).mirror().addBox(0.258F, 5.9152F, -0.5871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(74, 9).mirror().addBox(0.258F, 6.6152F, -0.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(65, 19).mirror().addBox(0.458F, 4.2152F, -0.0371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(55, 65).mirror().addBox(0.458F, 2.2152F, -0.0371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 0.7229F, -4.201F, -1.3952F, -0.3488F, -0.0165F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(69, 54).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(69, 54).addBox(8.28F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.38F, -0.2872F, 1.2413F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(74, 0).mirror().addBox(0.458F, -0.3158F, 0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 0.7229F, -4.201F, -1.4836F, -0.349F, -0.0101F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(0.458F, 0.6842F, 0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 0.7229F, -4.201F, -1.465F, -0.3488F, -0.0165F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(73, 29).mirror().addBox(6.5394F, 1.714F, -0.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 0.7229F, -4.201F, -1.2541F, 0.7599F, 0.222F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(73, 26).mirror().addBox(-0.0208F, -0.0204F, -0.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 1.0229F, -2.801F, -1.5114F, -0.3492F, -0.0006F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(50, 65).mirror().addBox(0.458F, 0.2155F, 0.0016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 0.7229F, -4.201F, -1.4126F, -0.3488F, -0.0165F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-0.0208F, -0.4677F, -0.5752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.43F, 1.0229F, -2.801F, -1.3718F, -0.3492F, -0.0006F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(0.0F, 2.0847F, 0.9605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.1771F, -0.001F, -1.5708F, -0.4712F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(0.0F, 1.5267F, 0.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.1771F, -0.001F, -1.309F, -0.4712F, 0.0F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(23, 68).mirror().addBox(0.0F, 0.8528F, 0.2216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.1771F, -0.001F, -1.4573F, -0.4712F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.5F, -1.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(5, 76).addBox(8.28F, -1.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.38F, 0.6845F, -0.3917F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(0.0F, 0.8674F, -0.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.1771F, -0.001F, -1.0036F, -0.4712F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(0.0F, 0.0347F, 0.0565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.88F, -0.1771F, -0.001F, -1.2828F, -0.4712F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(74, 0).addBox(-1.458F, -0.3158F, 0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.45F, 0.7229F, -4.201F, -1.4836F, 0.349F, 0.0101F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(43, 73).addBox(-1.458F, 0.6842F, 0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.45F, 0.7229F, -4.201F, -1.465F, 0.3488F, 0.0165F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(73, 26).addBox(-0.9792F, -0.0204F, -0.2383F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.45F, 1.0229F, -2.801F, -1.5114F, 0.3492F, 0.0006F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(15, 76).addBox(-1.0F, 2.0847F, 0.9605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -0.1771F, -0.001F, -1.5708F, 0.4712F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(52, 69).addBox(-1.0F, 1.5267F, 0.3468F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.9F, -0.1771F, -0.001F, -1.309F, 0.4712F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 76).addBox(-1.0F, 0.8674F, -0.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.9F, -0.1771F, -0.001F, -1.0036F, 0.4712F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(73, 29).addBox(-7.5394F, 1.714F, -0.3167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(3.45F, 0.7229F, -4.201F, -1.2541F, -0.7599F, -0.222F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(75, 14).addBox(-1.258F, -1.0848F, -0.5371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(10, 75).addBox(-1.258F, -0.3848F, -0.6121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(72, 74).addBox(-1.258F, 0.3152F, -0.6871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 55).addBox(-1.258F, 1.0152F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 52).addBox(-1.258F, 1.7152F, -0.7121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 49).addBox(-1.258F, 2.4152F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 46).addBox(-1.258F, 3.1152F, -0.5621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 43).addBox(-1.258F, 3.8152F, -0.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 40).addBox(-1.258F, 4.5152F, -0.5621F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(35, 74).addBox(-1.258F, 5.2152F, -0.6371F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(30, 74).addBox(-1.258F, 5.9152F, -0.5871F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(74, 9).addBox(-1.258F, 6.6152F, -0.5121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(65, 19).addBox(-1.458F, 4.2152F, -0.0371F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(55, 65).addBox(-1.458F, 2.2152F, -0.0371F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.45F, 0.7229F, -4.201F, -1.3952F, 0.3488F, 0.0165F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 65).addBox(-1.458F, 0.2155F, 0.0016F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.45F, 0.7229F, -4.201F, -1.4126F, 0.3488F, 0.0165F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(45, 65).addBox(-0.9792F, -0.4677F, -0.5752F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.45F, 1.0229F, -2.801F, -1.3718F, 0.3492F, 0.0006F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(23, 68).addBox(-1.0F, 0.8528F, 0.2216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.9F, -0.1771F, -0.001F, -1.4573F, 0.4712F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(10, 68).addBox(-1.0F, 0.0347F, 0.0565F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, -0.1771F, -0.001F, -1.2828F, 0.4712F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(13, 35).addBox(-0.5F, -0.4594F, -0.1247F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2381F, 0.6623F, 0.0134F, 0.1745F, 0.0023F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(77, 23).addBox(0.0F, -0.275F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 3.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(76, 60).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, 1.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(39, 77).addBox(0.0F, 0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 76).addBox(0.0F, 0.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4598F, 0.7945F, 0.384F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(68, 75).addBox(0.0F, -0.55F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4594F, -0.1247F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(25, 6).mirror().addBox(-1.5F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0406F, -0.0247F, 0.0F, 0.1047F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(25, 6).addBox(-0.5F, 0.0F, -0.1F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0406F, -0.0247F, 0.0F, -0.1047F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(51, 43).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0411F, 4.8463F, 0.0313F, 0.3053F, 0.0094F));

		PartDefinition Tailbase_r8 = Tailmiddlebase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(36, 77).addBox(0.0F, 0.2473F, 0.9301F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3233F, -1.2898F, 0.4276F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(41, 27).addBox(-0.5F, -0.3024F, 0.0764F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -0.1069F, 2.8993F, 0.0562F, -0.3921F, -0.0215F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4184F, 2.8316F, -2.5669F, 0.7555F, 0.7423F, -0.5932F));

		PartDefinition cube_r172 = hindlegL.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(33, 71).addBox(5.0F, -4.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r173 = hindlegL.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(70, 65).addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r174 = hindlegL.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(40, 65).addBox(5.0F, 0.9F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(65, 14).addBox(-0.5F, -0.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(18, 65).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0147F, 3.8969F, 0.2254F, 0.7155F, 1.034F, 1.538F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(26, 35).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.0985F, 2.664F, 0.4438F, 0.1304F, -0.2072F, -2.143F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4184F, 2.8316F, -2.5669F, -0.9856F, 0.4936F, 0.9813F));

		PartDefinition cube_r175 = hindlegL3.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(33, 71).mirror().addBox(-6.0F, -4.125F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(5.5F, 4.0F, 0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r176 = hindlegL3.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(70, 65).mirror().addBox(-0.5F, -1.0F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5634F, 0.1343F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r177 = hindlegL3.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(40, 65).mirror().addBox(-6.0F, 0.9F, -2.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(5.5F, 0.0F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(65, 14).mirror().addBox(-0.5F, -0.5F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(18, 65).mirror().addBox(-0.5F, -0.6F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0147F, 3.8969F, 0.2254F, 0.5663F, -0.8199F, -0.8916F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(26, 35).mirror().addBox(-0.5F, -0.1F, -2.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.0985F, 2.664F, 0.4438F, -0.2089F, 0.1276F, 0.5452F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.4592F, -2.9745F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r178 = bone3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(63, 75).addBox(-0.5F, -0.05F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, -1.4061F, 1.2058F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r179 = bone3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(57, 72).addBox(-0.5F, -1.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r180 = bone3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(52, 72).addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -0.5698F, 0.7389F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r181 = bone3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(72, 23).addBox(2.0F, 0.0866F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, -1.4506F, 1.068F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r182 = bone3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(9, 48).addBox(-1.0F, -0.3298F, 0.8554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 2.0715F, 0.2481F, -0.3101F, -0.314F, 0.9373F));

		PartDefinition cube_r183 = bone3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(15, 28).addBox(-1.0F, 0.6702F, -1.1446F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 2.0715F, 0.2481F, -0.0919F, -0.314F, 0.9373F));

		PartDefinition cube_r184 = bone3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(20, 72).addBox(-1.1F, 0.584F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.9687F, 0.0F, 0.4538F));

		PartDefinition cube_r185 = bone3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(60, 8).addBox(-1.1F, 0.5066F, -1.4162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.3578F, 0.0F, 0.4538F));

		PartDefinition cube_r186 = bone3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(10, 72).addBox(-1.1F, 0.1214F, -1.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.6196F, 0.0F, 0.4538F));

		PartDefinition cube_r187 = bone3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(71, 60).addBox(-1.1F, -0.6809F, -1.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 1.4399F, 0.0F, 0.4538F));

		PartDefinition cube_r188 = bone3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(38, 71).addBox(-0.5F, -0.25F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.0667F, 0.7895F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r189 = bone3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(71, 37).addBox(-1.1F, -0.3727F, -0.4026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6F, 1.0602F, 0.7192F, 0.3142F, 0.0F, 0.4538F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.4592F, -2.9745F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r190 = bone8.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-0.5F, -0.05F, -0.975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -1.4061F, 1.2058F, 1.7715F, 0.0F, 0.0F));

		PartDefinition cube_r191 = bone8.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(57, 72).mirror().addBox(-0.5F, -1.175F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.2908F, 1.6787F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r192 = bone8.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(-0.5F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5698F, 0.7389F, 1.1956F, 0.0F, 0.0F));

		PartDefinition cube_r193 = bone8.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(72, 23).mirror().addBox(-3.0F, 0.0866F, -0.9556F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, -1.4506F, 1.068F, 1.0647F, 0.0F, 0.0F));

		PartDefinition cube_r194 = bone8.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(0.0F, -0.3298F, 0.8554F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.0715F, 0.2481F, -0.3101F, 0.314F, -0.9373F));

		PartDefinition cube_r195 = bone8.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(15, 28).mirror().addBox(0.0F, 0.6702F, -1.1446F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 2.0715F, 0.2481F, -0.0919F, 0.314F, -0.9373F));

		PartDefinition cube_r196 = bone8.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(0.1F, 0.584F, -0.741F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.9687F, 0.0F, -0.4538F));

		PartDefinition cube_r197 = bone8.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(60, 8).mirror().addBox(0.1F, 0.5066F, -1.4162F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.3578F, 0.0F, -0.4538F));

		PartDefinition cube_r198 = bone8.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(0.1F, 0.1214F, -1.6623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.6196F, 0.0F, -0.4538F));

		PartDefinition cube_r199 = bone8.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(71, 60).mirror().addBox(0.1F, -0.6809F, -1.0545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 1.4399F, 0.0F, -0.4538F));

		PartDefinition cube_r200 = bone8.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(38, 71).mirror().addBox(-0.5F, -0.25F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0667F, 0.7895F, 1.1606F, 0.0F, 0.0F));

		PartDefinition cube_r201 = bone8.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(71, 37).mirror().addBox(0.1F, -0.3727F, -0.4026F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 1.0602F, 0.7192F, 0.3142F, 0.0F, -0.4538F));

		return LayerDefinition.create(meshdefinition, 80, 80);
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