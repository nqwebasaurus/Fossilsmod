package fossils.fossils.client.blockentity.model.livyatan;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LivyatanFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public LivyatanFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.4609F, -55.701F, 0.0232F, -0.0121F, 0.4798F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(130, 159).mirror().addBox(0.0F, 0.0153F, -5.9392F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -6.0146F, -3.2706F, 0.3712F, -0.1313F, 0.3244F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 179).mirror().addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.177F, 23.4709F, 4.5365F, 1.3562F, -0.2002F, -1.1166F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(207, 169).mirror().addBox(0.2F, -0.5F, -0.3F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.8098F, 22.341F, 2.7369F, 1.401F, -0.1621F, -0.8803F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(185, 134).mirror().addBox(-1.424F, -5.1967F, -2.7119F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 2.9294F, -0.5954F, -1.2119F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(125, 208).mirror().addBox(-1.7454F, -7.1833F, -2.0919F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 0.2578F, -0.6155F, -1.1599F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(179, 26).mirror().addBox(-1.7454F, -6.6445F, 0.1305F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 1.305F, -0.6155F, -1.1599F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 196).mirror().addBox(3.8438F, 1.1828F, -7.7237F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, -2.6511F, -0.9835F, 3.0631F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(120, 144).mirror().addBox(-1.424F, 0.4706F, 0.8875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, -2.8738F, -0.5954F, -1.2119F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(172, 3).mirror().addBox(-1.424F, 5.9063F, -1.334F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, -1.783F, -0.5954F, -1.2119F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(207, 200).mirror().addBox(-1.424F, -0.9498F, 1.2618F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, -2.3066F, -0.5954F, -1.2119F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(111, 185).mirror().addBox(-1.424F, -1.6016F, -3.1942F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 2.5803F, -0.5954F, -1.2119F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(164, 156).mirror().addBox(-1.424F, -2.3613F, -1.4438F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 2.5367F, -0.5954F, -1.2119F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(17, 174).mirror().addBox(-1.7454F, -7.3868F, 2.3021F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 1.7414F, -0.6155F, -1.1599F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(140, 181).mirror().addBox(-1.4397F, -4.3888F, 6.9753F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, 2.6414F, -0.5954F, -1.2119F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(149, 54).mirror().addBox(-5.6033F, 0.8843F, -8.2955F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9361F, 27.5663F, 8.8273F, -2.8274F, -0.1428F, -2.8776F));

		PartDefinition cube_r16 = chest.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 210).mirror().addBox(-1.1675F, -3.8959F, -5.9864F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(185, 143).mirror().addBox(-2.1675F, -0.8959F, -5.9864F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.3231F, -0.2621F, 0.1955F));

		PartDefinition cube_r17 = chest.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 129).mirror().addBox(-0.6675F, -4.9949F, -5.0479F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(132, 119).mirror().addBox(-1.1675F, 0.9518F, -1.943F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.5413F, -0.2621F, 0.1955F));

		PartDefinition cube_r18 = chest.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(74, 208).mirror().addBox(-1.1675F, -6.9511F, 2.9714F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 2.1522F, -0.2621F, 0.1955F));

		PartDefinition cube_r19 = chest.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(208, 163).mirror().addBox(-1.1675F, -5.5813F, -3.7125F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.0177F, -0.2621F, 0.1955F));

		PartDefinition cube_r20 = chest.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(209, 17).mirror().addBox(-1.1675F, -1.6278F, -1.4052F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 2.1085F, -0.2621F, 0.1955F));

		PartDefinition cube_r21 = chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(205, 31).mirror().addBox(-1.1675F, -3.9521F, -2.6751F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(22, 185).mirror().addBox(-1.1675F, -7.9521F, -3.4751F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.3668F, -0.2621F, 0.1955F));

		PartDefinition cube_r22 = chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(162, 30).mirror().addBox(-1.1675F, -0.2688F, -5.2249F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.2795F, -0.2621F, 0.1955F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(164, 168).mirror().addBox(-1.1675F, 2.0732F, 0.8465F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 2.5885F, -0.2621F, 0.1955F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(137, 34).mirror().addBox(-1.1832F, -1.7267F, 2.0045F, 2.0F, 6.0F, 10.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 0.433F, -0.2621F, 0.1955F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 147).mirror().addBox(-1.1832F, 0.3781F, 2.9365F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 0.7733F, -0.2621F, 0.1955F));

		PartDefinition chest13_r1 = chest.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-21.2965F, -7.6605F, -1.2618F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.3277F, 0.7557F, -0.3196F, 0.0414F, -1.4746F));

		PartDefinition chest12_r1 = chest.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(166, 114).mirror().addBox(-11.1471F, -1.9869F, -1.2405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.3277F, 0.7557F, -0.2504F, 0.205F, -0.9265F));

		PartDefinition chest11_r1 = chest.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(197, 132).mirror().addBox(-3.692F, -0.4707F, -1.2405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.3277F, 0.7557F, -0.1401F, 0.2911F, -0.4849F));

		PartDefinition chest10_r1 = chest.addOrReplaceChild("chest10_r1", CubeListBuilder.create().texOffs(149, 62).mirror().addBox(-3.692F, -0.4707F, -1.2405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.9276F, 3.2557F, -0.1401F, 0.2911F, -0.354F));

		PartDefinition chest11_r2 = chest.addOrReplaceChild("chest11_r2", CubeListBuilder.create().texOffs(44, 144).mirror().addBox(-11.1471F, -1.9869F, -1.2405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.9276F, 3.2557F, -0.2504F, 0.205F, -0.7956F));

		PartDefinition chest12_r2 = chest.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(61, 18).mirror().addBox(-24.2965F, -7.6605F, -1.2618F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -0.9276F, 3.2557F, -0.3196F, 0.0414F, -1.3437F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(177, 210).mirror().addBox(-0.9015F, -4.0219F, -0.4549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8146F, 0.2294F, 0.1216F, 0.3737F, -1.477F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(84, 159).mirror().addBox(-0.5F, -5.0181F, -1.3376F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.3834F, 0.3737F, -1.477F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(2, 133).mirror().addBox(-1.1675F, 0.2307F, 0.2115F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.8904F, -0.2621F, 0.1955F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 146).mirror().addBox(-1.1832F, -0.1107F, 2.2793F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.4183F, 12.6222F, 6.0413F, 1.0788F, -0.2621F, 0.1955F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(140, 181).addBox(0.4397F, -4.3888F, 6.9753F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 2.6414F, 0.5954F, 1.2119F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(125, 208).addBox(0.7454F, -7.1833F, -2.0919F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 0.2578F, 0.6155F, 1.1599F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(179, 26).addBox(0.7454F, -6.6445F, 0.1305F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 1.305F, 0.6155F, 1.1599F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 179).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.177F, 23.4709F, 4.5365F, 1.3562F, 0.2002F, 1.1166F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(207, 169).addBox(-0.2F, -0.5F, -0.3F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.8098F, 22.341F, 2.7369F, 1.401F, 0.1621F, 0.8803F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(17, 174).addBox(0.7454F, -7.3868F, 2.3021F, 1.0F, 4.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 1.7414F, 0.6155F, 1.1599F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(164, 156).addBox(0.424F, -2.3613F, -1.4438F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 2.5367F, 0.5954F, 1.2119F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(185, 134).addBox(0.424F, -5.1967F, -2.7119F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 2.9294F, 0.5954F, 1.2119F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(111, 185).addBox(0.424F, -1.6016F, -3.1942F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, 2.5803F, 0.5954F, 1.2119F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(207, 200).addBox(0.424F, -0.9498F, 1.2618F, 1.0F, 5.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -2.3066F, 0.5954F, 1.2119F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(172, 3).addBox(0.424F, 5.9063F, -1.334F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -1.783F, 0.5954F, 1.2119F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(120, 144).addBox(0.424F, 0.4706F, 0.8875F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -2.8738F, 0.5954F, 1.2119F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(137, 34).addBox(-0.8168F, -1.7267F, 2.0045F, 2.0F, 6.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 0.433F, 0.2621F, -0.1955F));

		PartDefinition cube_r43 = chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 147).addBox(-0.8168F, 0.3781F, 2.9365F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 0.7733F, 0.2621F, -0.1955F));

		PartDefinition cube_r44 = chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(44, 146).addBox(-0.8168F, -0.1107F, 2.2793F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.0788F, 0.2621F, -0.1955F));

		PartDefinition cube_r45 = chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(132, 119).addBox(-0.8325F, 0.9518F, -1.943F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(93, 129).addBox(-0.3325F, -4.9949F, -5.0479F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.5413F, 0.2621F, -0.1955F));

		PartDefinition cube_r46 = chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(164, 168).addBox(-0.8325F, 2.0732F, 0.8465F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 2.5885F, 0.2621F, -0.1955F));

		PartDefinition cube_r47 = chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 210).addBox(-0.8325F, -3.8959F, -5.9864F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(185, 143).addBox(-1.8325F, -0.8959F, -5.9864F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.3231F, 0.2621F, -0.1955F));

		PartDefinition cube_r48 = chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(162, 30).addBox(-0.8325F, -0.2688F, -5.2249F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.2795F, 0.2621F, -0.1955F));

		PartDefinition cube_r49 = chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(209, 17).addBox(-0.8325F, -1.6278F, -1.4052F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 2.1085F, 0.2621F, -0.1955F));

		PartDefinition cube_r50 = chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(74, 208).addBox(-0.8325F, -6.9511F, 2.9714F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 2.1522F, 0.2621F, -0.1955F));

		PartDefinition cube_r51 = chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(208, 163).addBox(-0.8325F, -5.5813F, -3.7125F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.0177F, 0.2621F, -0.1955F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(205, 31).addBox(-0.8325F, -3.9521F, -2.6751F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(22, 185).addBox(-0.8325F, -7.9521F, -3.4751F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.3668F, 0.2621F, -0.1955F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(2, 133).addBox(-0.8325F, 0.2307F, 0.2115F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(16.4183F, 12.6222F, 6.0413F, 1.8904F, 0.2621F, -0.1955F));

		PartDefinition chest10_r2 = chest.addOrReplaceChild("chest10_r2", CubeListBuilder.create().texOffs(197, 132).addBox(-0.308F, -0.4707F, -1.2405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.3277F, 0.7557F, -0.1401F, -0.2911F, 0.4849F));

		PartDefinition chest11_r3 = chest.addOrReplaceChild("chest11_r3", CubeListBuilder.create().texOffs(166, 114).addBox(3.1472F, -1.9869F, -1.2405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.3277F, 0.7557F, -0.2504F, -0.205F, 0.9265F));

		PartDefinition chest12_r3 = chest.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(0, 86).addBox(8.2965F, -7.6605F, -1.2618F, 13.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.3277F, 0.7557F, -0.3196F, -0.0414F, 1.4746F));

		PartDefinition chest9_r1 = chest.addOrReplaceChild("chest9_r1", CubeListBuilder.create().texOffs(149, 62).addBox(-0.308F, -0.4707F, -1.2405F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.9276F, 3.2557F, -0.1401F, -0.2911F, 0.354F));

		PartDefinition chest10_r3 = chest.addOrReplaceChild("chest10_r3", CubeListBuilder.create().texOffs(44, 144).addBox(3.1472F, -1.9869F, -1.2405F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.9276F, 3.2557F, -0.2504F, -0.205F, 0.7956F));

		PartDefinition chest11_r4 = chest.addOrReplaceChild("chest11_r4", CubeListBuilder.create().texOffs(61, 18).addBox(8.2965F, -7.6605F, -1.2618F, 16.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -0.9276F, 3.2557F, -0.3196F, -0.0414F, 1.3437F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(38, 201).addBox(-0.5F, -5.9606F, 0.0306F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3146F, -1.2706F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(177, 210).addBox(-0.0985F, -4.0219F, -0.4549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8146F, 0.2294F, 0.1216F, -0.3737F, 1.477F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(84, 159).addBox(-0.5F, -5.0181F, -1.3376F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.3834F, -0.3737F, 1.477F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 201).addBox(-0.5F, -6.0181F, -2.1376F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(130, 159).addBox(0.0F, 0.0153F, -5.9392F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0146F, -3.2706F, 0.3712F, 0.1313F, -0.3244F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(207, 139).addBox(-5.7011F, 1.1828F, 7.5747F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -0.2658F, -0.1109F, -0.3097F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 196).addBox(-5.8438F, 1.1828F, -7.7237F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -2.6511F, 0.9835F, -3.0631F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(149, 54).addBox(0.6033F, 0.8843F, -8.2955F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9361F, 27.5663F, 8.8273F, -2.8274F, 0.1428F, 2.8776F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(64, 111).addBox(-2.0F, -0.1935F, -0.3873F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2854F, -5.5706F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(27, 111).addBox(-2.0F, -1.4F, -0.3F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.009F))
				.texOffs(195, 208).addBox(-0.5F, -5.4F, -0.3F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.393F, 6.83F, 0.2137F, -0.0762F, -0.061F));

		PartDefinition cube_r63 = body6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(202, 208).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -5.4F, 1.7F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(194, 90).addBox(-0.5F, -7.9698F, -0.0994F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 11.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(194, 79).addBox(-0.5F, -8.0F, -0.1F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 7.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest14_r1 = body6.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(100, 61).mirror().addBox(-32.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.0188F, 11.4694F, -0.2704F, -0.0873F, -1.454F));

		PartDefinition chest12_r4 = body6.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(198, 197).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.0188F, 11.4694F, -0.2218F, 0.1785F, -0.4822F));

		PartDefinition chest13_r2 = body6.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(161, 0).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.0188F, 11.4694F, -0.2754F, 0.0695F, -0.9082F));

		PartDefinition chest14_r2 = body6.addOrReplaceChild("chest14_r2", CubeListBuilder.create().texOffs(100, 58).mirror().addBox(-32.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 3.0694F, -0.34F, -0.0789F, -1.4482F));

		PartDefinition chest13_r3 = body6.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(160, 101).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 3.0694F, -0.3308F, 0.1123F, -0.9133F));

		PartDefinition chest12_r5 = body6.addOrReplaceChild("chest12_r5", CubeListBuilder.create().texOffs(198, 194).mirror().addBox(-4.7702F, -0.8374F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 3.0694F, -0.2551F, 0.2403F, -0.4891F));

		PartDefinition chest13_r4 = body6.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(100, 55).mirror().addBox(-32.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 7.0694F, -0.3378F, -0.0616F, -1.4483F));

		PartDefinition chest11_r5 = body6.addOrReplaceChild("chest11_r5", CubeListBuilder.create().texOffs(197, 121).mirror().addBox(-4.7702F, -0.8374F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 7.0694F, -0.2392F, 0.2485F, -0.4853F));

		PartDefinition chest12_r6 = body6.addOrReplaceChild("chest12_r6", CubeListBuilder.create().texOffs(159, 15).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.3188F, 7.0694F, -0.32F, 0.1261F, -0.912F));

		PartDefinition cube_r66 = body6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(203, 22).mirror().addBox(-1.0F, -7.9F, -5.4F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(203, 0).mirror().addBox(-1.2F, -3.2F, 5.6F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(53, 202).mirror().addBox(-1.1F, -4.9F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.4097F, 0.0187F, -1.326F));

		PartDefinition cube_r67 = body6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(25, 202).mirror().addBox(-1.1F, -6.5F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.3748F, 0.0187F, -1.326F));

		PartDefinition chest11_r6 = body6.addOrReplaceChild("chest11_r6", CubeListBuilder.create().texOffs(112, 15).mirror().addBox(-29.2965F, -7.6605F, -1.2618F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -1.6188F, -0.5306F, -0.3551F, -0.1117F, -1.3424F));

		PartDefinition chest10_r4 = body6.addOrReplaceChild("chest10_r4", CubeListBuilder.create().texOffs(139, 30).mirror().addBox(-11.1471F, -1.9869F, -1.2405F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -1.6188F, -0.5306F, -0.3605F, 0.0918F, -0.812F));

		PartDefinition chest9_r2 = body6.addOrReplaceChild("chest9_r2", CubeListBuilder.create().texOffs(201, 47).mirror().addBox(-3.692F, -0.4707F, -1.2405F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.1F, -1.6188F, -0.5306F, -0.2916F, 0.2337F, -0.3934F));

		PartDefinition cube_r68 = body6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(203, 0).addBox(0.2F, -3.2F, 5.6F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(53, 202).addBox(0.1F, -4.9F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(203, 22).addBox(0.0F, -7.9F, -5.4F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.4097F, -0.0187F, 1.326F));

		PartDefinition cube_r69 = body6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(25, 202).addBox(0.1F, -6.5F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.3748F, -0.0187F, 1.326F));

		PartDefinition cube_r70 = body6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(194, 39).addBox(-0.5F, -8.0F, -2.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.1047F, 0.0F, 0.0F));

		PartDefinition chest11_r7 = body6.addOrReplaceChild("chest11_r7", CubeListBuilder.create().texOffs(198, 194).addBox(-0.2298F, -0.8374F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 3.0694F, -0.2551F, -0.2403F, 0.4891F));

		PartDefinition chest12_r7 = body6.addOrReplaceChild("chest12_r7", CubeListBuilder.create().texOffs(160, 101).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 3.0694F, -0.3308F, -0.1123F, 0.9133F));

		PartDefinition chest13_r5 = body6.addOrReplaceChild("chest13_r5", CubeListBuilder.create().texOffs(100, 58).addBox(10.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 3.0694F, -0.34F, 0.0789F, 1.4482F));

		PartDefinition chest12_r8 = body6.addOrReplaceChild("chest12_r8", CubeListBuilder.create().texOffs(161, 0).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.0188F, 11.4694F, -0.3308F, -0.1123F, 0.9133F));

		PartDefinition chest11_r8 = body6.addOrReplaceChild("chest11_r8", CubeListBuilder.create().texOffs(198, 197).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.0188F, 11.4694F, -0.2551F, -0.2403F, 0.4891F));

		PartDefinition chest13_r6 = body6.addOrReplaceChild("chest13_r6", CubeListBuilder.create().texOffs(100, 61).addBox(10.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.0188F, 11.4694F, -0.34F, 0.0789F, 1.4482F));

		PartDefinition chest11_r9 = body6.addOrReplaceChild("chest11_r9", CubeListBuilder.create().texOffs(159, 15).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 7.0694F, -0.32F, -0.1261F, 0.912F));

		PartDefinition chest10_r5 = body6.addOrReplaceChild("chest10_r5", CubeListBuilder.create().texOffs(197, 121).addBox(-0.2298F, -0.8374F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 7.0694F, -0.2392F, -0.2485F, 0.4853F));

		PartDefinition chest12_r9 = body6.addOrReplaceChild("chest12_r9", CubeListBuilder.create().texOffs(100, 55).addBox(10.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.3188F, 7.0694F, -0.3378F, 0.0616F, 1.4483F));

		PartDefinition chest8_r1 = body6.addOrReplaceChild("chest8_r1", CubeListBuilder.create().texOffs(201, 47).addBox(-0.308F, -0.4707F, -1.2405F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -1.6188F, -0.5306F, -0.2916F, -0.2337F, 0.3934F));

		PartDefinition chest9_r3 = body6.addOrReplaceChild("chest9_r3", CubeListBuilder.create().texOffs(139, 30).addBox(3.1472F, -1.9869F, -1.2405F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -1.6188F, -0.5306F, -0.3605F, -0.0918F, 0.812F));

		PartDefinition chest10_r6 = body6.addOrReplaceChild("chest10_r6", CubeListBuilder.create().texOffs(112, 15).addBox(8.2965F, -7.6605F, -1.2618F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1F, -1.6188F, -0.5306F, -0.3551F, 0.1117F, 1.3424F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7413F, 13.7215F, -0.1402F, -0.0864F, 0.0122F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(79, 188).addBox(-0.5F, -8.5603F, 0.0117F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 13.6F, -0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(194, 160).addBox(-0.5F, -8.0905F, 0.0111F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 9.6F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(114, 194).addBox(-0.5F, -8.0207F, 0.0105F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 5.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition chest18_r1 = body.addOrReplaceChild("chest18_r1", CubeListBuilder.create().texOffs(137, 51).mirror().addBox(-27.2665F, -9.8669F, -1.6398F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 13.9009F, -0.3378F, -0.0616F, -1.4483F));

		PartDefinition chest17_r1 = body.addOrReplaceChild("chest17_r1", CubeListBuilder.create().texOffs(164, 76).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 13.9009F, -0.32F, 0.1261F, -0.912F));

		PartDefinition chest16_r1 = body.addOrReplaceChild("chest16_r1", CubeListBuilder.create().texOffs(200, 104).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 13.9009F, -0.2392F, 0.2485F, -0.4853F));

		PartDefinition chest17_r2 = body.addOrReplaceChild("chest17_r2", CubeListBuilder.create().texOffs(132, 116).mirror().addBox(-29.2665F, -9.8669F, -1.6398F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 9.9009F, -0.3336F, -0.027F, -1.4485F));

		PartDefinition chest16_r2 = body.addOrReplaceChild("chest16_r2", CubeListBuilder.create().texOffs(162, 48).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 9.9009F, -0.2984F, 0.1537F, -0.909F));

		PartDefinition chest15_r1 = body.addOrReplaceChild("chest15_r1", CubeListBuilder.create().texOffs(200, 101).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 9.9009F, -0.2072F, 0.2646F, -0.4772F));

		PartDefinition chest14_r3 = body.addOrReplaceChild("chest14_r3", CubeListBuilder.create().texOffs(62, 200).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 5.9009F, -0.175F, 0.2805F, -0.4685F));

		PartDefinition chest15_r2 = body.addOrReplaceChild("chest15_r2", CubeListBuilder.create().texOffs(162, 45).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 5.9009F, -0.2766F, 0.1812F, -0.9053F));

		PartDefinition chest16_r3 = body.addOrReplaceChild("chest16_r3", CubeListBuilder.create().texOffs(127, 105).mirror().addBox(-30.2665F, -9.8669F, -1.6398F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 5.9009F, -0.3293F, 0.0077F, -1.4486F));

		PartDefinition chest15_r3 = body.addOrReplaceChild("chest15_r3", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-32.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 1.9009F, -0.3272F, 0.025F, -1.4485F));

		PartDefinition chest14_r4 = body.addOrReplaceChild("chest14_r4", CubeListBuilder.create().texOffs(162, 42).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 1.9009F, -0.2656F, 0.1949F, -0.9033F));

		PartDefinition chest13_r7 = body.addOrReplaceChild("chest13_r7", CubeListBuilder.create().texOffs(199, 124).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.7494F, 1.9009F, -0.1587F, 0.2884F, -0.4639F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(93, 203).mirror().addBox(-0.6F, -1.7561F, 11.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(86, 203).mirror().addBox(-0.8F, -3.1561F, 7.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(67, 203).mirror().addBox(-0.9F, -4.7561F, 3.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(60, 203).mirror().addBox(-1.0F, -6.0561F, -0.2883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, 0.3438F, -0.0166F, -1.2653F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(93, 203).addBox(-0.4F, -1.7561F, 11.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(86, 203).addBox(-0.2F, -3.1561F, 7.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(67, 203).addBox(-0.1F, -4.7561F, 3.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(60, 203).addBox(0.0F, -6.0561F, -0.2883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, 0.3438F, 0.0166F, 1.2653F));

		PartDefinition chest15_r4 = body.addOrReplaceChild("chest15_r4", CubeListBuilder.create().texOffs(200, 104).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 13.9009F, -0.2392F, -0.2485F, 0.4853F));

		PartDefinition chest16_r4 = body.addOrReplaceChild("chest16_r4", CubeListBuilder.create().texOffs(164, 76).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 13.9009F, -0.32F, -0.1261F, 0.912F));

		PartDefinition chest17_r3 = body.addOrReplaceChild("chest17_r3", CubeListBuilder.create().texOffs(137, 51).addBox(10.2665F, -9.8669F, -1.6398F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 13.9009F, -0.3378F, 0.0616F, 1.4483F));

		PartDefinition chest14_r5 = body.addOrReplaceChild("chest14_r5", CubeListBuilder.create().texOffs(200, 101).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 9.9009F, -0.2072F, -0.2646F, 0.4772F));

		PartDefinition chest15_r5 = body.addOrReplaceChild("chest15_r5", CubeListBuilder.create().texOffs(162, 48).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 9.9009F, -0.2984F, -0.1537F, 0.909F));

		PartDefinition chest16_r5 = body.addOrReplaceChild("chest16_r5", CubeListBuilder.create().texOffs(132, 116).addBox(10.2665F, -9.8669F, -1.6398F, 19.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 9.9009F, -0.3336F, 0.027F, 1.4485F));

		PartDefinition chest15_r6 = body.addOrReplaceChild("chest15_r6", CubeListBuilder.create().texOffs(127, 105).addBox(10.2665F, -9.8669F, -1.6398F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 5.9009F, -0.3293F, -0.0077F, 1.4486F));

		PartDefinition chest14_r6 = body.addOrReplaceChild("chest14_r6", CubeListBuilder.create().texOffs(162, 45).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 5.9009F, -0.2766F, -0.1812F, 0.9053F));

		PartDefinition chest13_r8 = body.addOrReplaceChild("chest13_r8", CubeListBuilder.create().texOffs(62, 200).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 5.9009F, -0.175F, -0.2805F, 0.4685F));

		PartDefinition chest12_r10 = body.addOrReplaceChild("chest12_r10", CubeListBuilder.create().texOffs(199, 124).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 1.9009F, -0.1386F, -0.2493F, 0.4586F));

		PartDefinition chest13_r9 = body.addOrReplaceChild("chest13_r9", CubeListBuilder.create().texOffs(162, 42).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 1.9009F, -0.2309F, -0.1678F, 0.897F));

		PartDefinition chest14_r7 = body.addOrReplaceChild("chest14_r7", CubeListBuilder.create().texOffs(112, 0).addBox(10.2665F, -9.8669F, -1.6398F, 22.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.7494F, 1.9009F, -0.2839F, -0.0197F, 1.4476F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(107, 194).addBox(-0.5F, -8.0561F, -0.2883F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(55, 88).addBox(-2.0F, -3.9154F, 0.0794F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(49, 21).addBox(-2.0F, -2.4F, 0.0F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 16.9254F, -0.131F, -0.0435F, 0.0038F));

		PartDefinition cube_r78 = body5.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(72, 188).addBox(-0.5F, -9.1F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 16.0F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r79 = body5.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(187, 42).addBox(-0.5F, -9.0F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 12.1F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r80 = body5.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(133, 186).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 8.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r81 = body5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(65, 184).addBox(-0.5F, -8.5F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 4.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition chest20_r1 = body5.addOrReplaceChild("chest20_r1", CubeListBuilder.create().texOffs(44, 141).mirror().addBox(-17.2665F, -9.8669F, -1.6398F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 4.9755F, -0.3887F, -0.0464F, -1.4435F));

		PartDefinition chest19_r1 = body5.addOrReplaceChild("chest19_r1", CubeListBuilder.create().texOffs(166, 111).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 4.9755F, -0.3565F, 0.165F, -0.9152F));

		PartDefinition chest18_r2 = body5.addOrReplaceChild("chest18_r2", CubeListBuilder.create().texOffs(200, 110).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 4.9755F, -0.2566F, 0.2988F, -0.4879F));

		PartDefinition chest19_r2 = body5.addOrReplaceChild("chest19_r2", CubeListBuilder.create().texOffs(139, 27).mirror().addBox(-24.2665F, -9.8669F, -1.6398F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 0.9755F, -0.3444F, 0.0271F, -1.4462F));

		PartDefinition chest18_r3 = body5.addOrReplaceChild("chest18_r3", CubeListBuilder.create().texOffs(166, 108).mirror().addBox(-13.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 0.9755F, -0.2796F, 0.2057F, -0.9033F));

		PartDefinition chest17_r4 = body5.addOrReplaceChild("chest17_r4", CubeListBuilder.create().texOffs(200, 107).mirror().addBox(-4.7702F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6F, -1.5985F, 0.9755F, -0.1669F, 0.3039F, -0.4636F));

		PartDefinition cube_r82 = body5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(194, 50).mirror().addBox(-5.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4F, 17.0F, 0.0F, 0.0F, -0.1047F));

		PartDefinition cube_r83 = body5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(192, 157).mirror().addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, -0.4F, 13.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r84 = body5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(204, 53).mirror().addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4F, 9.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r85 = body5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(158, 206).mirror().addBox(-0.9298F, -5.143F, -0.7236F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4F, 4.8F, 0.0488F, -0.0209F, -1.4027F));

		PartDefinition cube_r86 = body5.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(100, 203).mirror().addBox(-1.0F, -5.5F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.091F, -0.0116F, -1.3578F));

		PartDefinition cube_r87 = body5.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(158, 206).addBox(-0.0702F, -5.143F, -0.7236F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 4.8F, 0.0488F, 0.0209F, 1.4027F));

		PartDefinition cube_r88 = body5.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(100, 203).addBox(0.0F, -5.5F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.091F, 0.0116F, 1.3578F));

		PartDefinition cube_r89 = body5.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(151, 181).addBox(-0.5F, -8.5F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r90 = body5.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(194, 50).addBox(0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.4F, 17.0F, 0.0F, 0.0F, 0.1047F));

		PartDefinition cube_r91 = body5.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(192, 157).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, -0.4F, 13.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r92 = body5.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(204, 53).addBox(0.0F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, 9.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition chest17_r5 = body5.addOrReplaceChild("chest17_r5", CubeListBuilder.create().texOffs(200, 110).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 4.9755F, -0.271F, -0.2321F, 0.4928F));

		PartDefinition chest18_r4 = body5.addOrReplaceChild("chest18_r4", CubeListBuilder.create().texOffs(166, 111).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 4.9755F, -0.3415F, -0.0985F, 0.9144F));

		PartDefinition chest19_r3 = body5.addOrReplaceChild("chest19_r3", CubeListBuilder.create().texOffs(44, 141).addBox(10.2665F, -9.8669F, -1.6398F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 4.9755F, -0.3421F, 0.0963F, 1.448F));

		PartDefinition chest18_r5 = body5.addOrReplaceChild("chest18_r5", CubeListBuilder.create().texOffs(139, 27).addBox(10.2665F, -9.8669F, -1.6398F, 14.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 0.9755F, -0.3336F, 0.027F, 1.4485F));

		PartDefinition chest17_r6 = body5.addOrReplaceChild("chest17_r6", CubeListBuilder.create().texOffs(166, 108).addBox(3.9694F, -2.775F, -1.6185F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 0.9755F, -0.2984F, -0.1537F, 0.909F));

		PartDefinition chest16_r6 = body5.addOrReplaceChild("chest16_r6", CubeListBuilder.create().texOffs(200, 107).addBox(-0.2298F, -0.8375F, -1.6185F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, -1.5985F, 0.9755F, -0.2072F, -0.2646F, 0.4772F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -1.0F, 0.1F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2953F, 18.7348F, -0.2999F, -0.115F, 0.1073F));

		PartDefinition cube_r93 = body4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(39, 189).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 17.1F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r94 = body4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(189, 10).addBox(-0.5F, -9.1F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 13.1F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r95 = body4.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 189).addBox(-0.5F, -9.1F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 9.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r96 = body4.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(165, 188).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.1F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r97 = body4.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(158, 188).addBox(-0.5F, -9.1F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.1F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r98 = body4.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(200, 113).mirror().addBox(-5.0F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0F, 18.1F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r99 = body4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(196, 14).mirror().addBox(-4.9F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.0F, 14.1F, 0.0F, 0.0F, -0.1047F));

		PartDefinition cube_r100 = body4.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(196, 11).mirror().addBox(-4.9F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.0F, 10.1F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r101 = body4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(194, 72).mirror().addBox(-5.1F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(194, 69).mirror().addBox(-5.1F, 0.0F, -5.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.0F, 6.1F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r102 = body4.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(200, 113).addBox(0.0F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 18.1F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r103 = body4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(196, 14).addBox(-0.1F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 1.0F, 14.1F, 0.0F, 0.0F, 0.1047F));

		PartDefinition cube_r104 = body4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(196, 11).addBox(-0.1F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.0F, 10.1F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r105 = body4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(194, 72).addBox(0.1F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(194, 69).addBox(0.1F, 0.0F, -5.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.0F, 6.1F, 0.0F, 0.0F, 0.1309F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.85F, 0.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9902F, 18.8764F, -0.2453F, -0.1696F, 0.0706F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(100, 191).addBox(-0.5F, -8.5F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 18.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(93, 191).addBox(-0.5F, -8.4F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.95F, 14.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(86, 191).addBox(-0.5F, -9.0F, 0.2F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 9.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(31, 190).addBox(-0.5F, -8.9F, 0.2F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 5.8F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(184, 189).addBox(-0.5F, -8.7F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, 2.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(176, 51).mirror().addBox(-3.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.15F, 19.0F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(172, 104).mirror().addBox(-3.8F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.15F, 15.0F, 0.0F, 0.0F, -0.1047F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(189, 76).mirror().addBox(-4.2F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.15F, 11.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(184, 124).mirror().addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.15F, 7.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(193, 186).mirror().addBox(-4.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.15F, 3.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(176, 51).addBox(0.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.15F, 19.0F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(172, 104).addBox(-0.2F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.15F, 15.0F, 0.0F, 0.0F, 0.1047F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(189, 76).addBox(-0.8F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.15F, 11.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(184, 124).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.15F, 7.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(193, 186).addBox(-0.5F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.15F, 3.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.493F, 20.1306F, -0.01F, -0.1807F, 0.0394F));

		PartDefinition cube_r121 = body2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(121, 195).addBox(-0.5F, -8.0143F, -0.0217F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5344F, 13.8003F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body2.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(46, 192).addBox(-0.5F, -8.4426F, -0.0406F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7344F, 9.9003F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r123 = body2.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(191, 189).addBox(-0.5F, -8.6648F, -0.5694F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0344F, 6.5003F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body2.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(210, 89).addBox(-0.5F, 0.0887F, -0.0202F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 7.1748F, 4.6194F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(77, 200).addBox(-0.5F, -1.0F, -1.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1718F, 10.4272F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r126 = body2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(210, 84).addBox(-0.5F, 0.6F, 3.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(210, 79).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4748F, 0.8194F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r127 = body2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(172, 191).addBox(-0.5F, -8.5015F, -0.0576F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9656F, 2.1003F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r128 = body2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(209, 50).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.6801F, 15.3443F, -0.333F, -0.7683F, 0.1732F));

		PartDefinition cube_r129 = body2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(207, 175).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8485F, 11.4317F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r130 = body2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(175, 116).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.0168F, 7.5192F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r131 = body2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(57, 171).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1852F, 3.6066F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r132 = body2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(209, 50).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.6801F, 15.3443F, -0.333F, 0.7683F, -0.1732F));

		PartDefinition cube_r133 = body2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(207, 175).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.8485F, 11.4317F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r134 = body2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(175, 116).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.0168F, 7.5192F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r135 = body2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(57, 171).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1852F, 3.6066F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r136 = body2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(92, 64).addBox(-1.5F, -0.1513F, 8.7474F, 3.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 17.4822F, 0.1061F, -0.2276F, 0.0014F));

		PartDefinition cube_r137 = hips.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(201, 160).addBox(-0.5F, -5.7986F, 16.0389F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(47, 64).addBox(-1.5F, -0.0986F, 0.0389F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r138 = hips.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(144, 200).addBox(-0.5F, -6.3036F, -2.0973F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.9F, 13.2F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r139 = hips.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(128, 198).addBox(-0.5F, -6.5246F, -1.8495F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.0F, 9.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r140 = hips.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(151, 193).addBox(-0.5F, -7.0401F, -0.0325F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.1F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r141 = hips.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(196, 0).addBox(-0.5F, -7.6986F, 0.0389F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r142 = hips.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(191, 106).addBox(-0.5F, -2.5381F, -10.3562F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9748F, 5.5499F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r143 = hips.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(194, 22).addBox(-0.5F, -4.293F, -3.9785F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9748F, 5.5499F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r144 = hips.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(198, 200).addBox(-0.5F, -3.2191F, 1.6526F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 201).addBox(-0.5F, -3.2191F, 7.6526F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.9748F, 5.5499F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r145 = hips.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(7, 196).addBox(-0.5F, -2.7F, -2.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 16.9588F, 13.7147F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r146 = hips.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(187, 0).addBox(-0.5F, -2.3759F, 1.5411F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 11.9748F, 5.5499F, -0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r147 = hips.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(201, 39).addBox(-0.5F, 1.9958F, -2.8411F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 11.9748F, 5.5499F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r148 = hips.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(210, 44).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 7.9516F, 15.9605F, -0.7618F, -0.8973F, 0.6407F));

		PartDefinition cube_r149 = hips.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(210, 41).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.2296F, 12.3502F, -0.6646F, -0.7982F, 0.5113F));

		PartDefinition cube_r150 = hips.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(210, 94).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.5075F, 8.7398F, -0.6937F, -0.8321F, 0.5513F));

		PartDefinition cube_r151 = hips.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(210, 38).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.7855F, 5.1295F, -0.6646F, -0.7982F, 0.5113F));

		PartDefinition cube_r152 = hips.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(210, 27).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0634F, 1.5191F, -0.5934F, -0.6922F, 0.4065F));

		PartDefinition cube_r153 = hips.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(210, 44).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 7.9516F, 15.9605F, -0.7618F, 0.8973F, -0.6407F));

		PartDefinition cube_r154 = hips.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(210, 41).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 6.2296F, 12.3502F, -0.6646F, 0.7982F, -0.5113F));

		PartDefinition cube_r155 = hips.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(210, 94).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.5075F, 8.7398F, -0.6937F, 0.8321F, -0.5513F));

		PartDefinition cube_r156 = hips.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(210, 38).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.7855F, 5.1295F, -0.6646F, 0.7982F, -0.5113F));

		PartDefinition cube_r157 = hips.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(210, 27).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0634F, 1.5191F, -0.5934F, 0.6922F, -0.4065F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(100, 34).addBox(-1.0F, -1.8F, 0.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(209, 63).addBox(-0.5F, -4.8F, 13.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6562F, 16.6935F, -0.3584F, -0.2316F, 0.0042F));

		PartDefinition cube_r158 = tail.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(16, 209).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 9.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r159 = tail.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(151, 204).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r160 = tail.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(135, 200).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5976F, 15.4909F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r161 = tail.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(53, 192).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0088F, 10.0733F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r162 = tail.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(13, 185).addBox(-0.5F, -4.1F, 1.1F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1777F, 2.1832F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r163 = tail.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(179, 201).addBox(-0.5F, -5.1F, 0.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(64, 129).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.009F))
				.texOffs(209, 69).addBox(-0.5F, -4.3F, 1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(210, 0).addBox(-0.5F, -3.9F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(210, 5).addBox(-0.5F, -3.2F, 9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0898F, 15.9733F, 0.0089F, -0.1745F, -0.0015F));

		PartDefinition cube_r164 = tail2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(186, 201).addBox(-0.5F, -2.0F, 3.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(201, 93).addBox(-0.5F, -2.0F, -1.1F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3614F, 4.0843F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(67, 146).addBox(-1.0F, -1.3F, 0.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(210, 22).addBox(-0.5F, -2.7F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(210, 127).addBox(-0.5F, -2.3F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2449F, 11.7572F, 0.248F, -0.1693F, -0.0426F));

		PartDefinition cube_r165 = tail3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(170, 210).addBox(-0.5F, -2.4F, 14.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 210).addBox(-0.5F, -2.4F, 11.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(209, 132).addBox(-0.5F, -2.6F, 7.2F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6219F, -7.5471F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(135, 64).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, 0.2443F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(19.3771F, 18.9206F, 5.6884F, 0.5895F, 0.1069F, -1.0829F));

		PartDefinition cube_r166 = leftarm.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(7, 212).addBox(-1.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0062F, 5.824F, -0.1751F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r167 = leftarm.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(209, 147).addBox(-1.5F, -0.9F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0061F, 7.1647F, -1.0709F, -0.0699F, 0.0014F, -0.001F));

		PartDefinition cube_r168 = leftarm.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(140, 192).addBox(-1.5F, -2.5F, -0.8F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.0049F, 5.7072F, 0.7773F, 0.4537F, 0.0014F, -0.001F));

		PartDefinition cube_r169 = leftarm.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(98, 183).addBox(-1.5F, -1.0F, -1.7F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0091F, 2.1599F, 0.2237F, -0.0699F, 0.0014F, -0.001F));

		PartDefinition cube_r170 = leftarm.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(177, 79).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5106F, -0.2658F, 0.8287F, -0.2444F, 0.0014F, -0.001F));

		PartDefinition cube_r171 = leftarm.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(111, 154).addBox(-1.5F, 1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r172 = leftarm.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(179, 69).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 8.1511F, 0.1813F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftarm2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(196, 17).addBox(-1.2853F, 2.8888F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(201, 86).addBox(-0.2853F, -0.8112F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1764F, 0.4793F, 2.8228F, 1.5708F, -1.117F, -1.5708F));

		PartDefinition cube_r174 = leftarm2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 215).addBox(0.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6764F, -2.3232F, 5.2941F, -1.5708F, -0.1222F, 1.5708F));

		PartDefinition cube_r175 = leftarm2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(132, 208).addBox(-0.9409F, -2.236F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 0.4793F, 2.8228F, -1.5708F, -0.8639F, 1.5708F));

		PartDefinition cube_r176 = leftarm2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(72, 174).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1764F, 1.4441F, -0.3362F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r177 = leftarm2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(16, 196).addBox(-1.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 0.5919F, -0.9948F, -1.5708F, -1.0385F, 1.5708F));

		PartDefinition cube_r178 = leftarm2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(197, 127).addBox(-2.5335F, 3.8378F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(194, 32).addBox(-2.0335F, 0.4378F, 0.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 6.4838F, 1.9099F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r179 = leftArm3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(100, 87).addBox(0.4F, -2.0F, -7.5F, 0.0F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.3771F, 18.9206F, 5.6884F, 0.3529F, -0.1337F, 0.9011F));

		PartDefinition cube_r180 = rightarm.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(62, 212).mirror().addBox(-0.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0062F, 5.824F, -0.1751F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r181 = rightarm.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(209, 208).mirror().addBox(-0.5F, -0.9F, -0.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0061F, 7.1647F, -1.0709F, -0.0699F, -0.0014F, 0.001F));

		PartDefinition cube_r182 = rightarm.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(193, 178).mirror().addBox(-0.5F, -2.5F, -0.8F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(0.0049F, 5.7072F, 0.7773F, 0.4537F, -0.0014F, 0.001F));

		PartDefinition cube_r183 = rightarm.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(52, 184).mirror().addBox(-0.5F, -1.0F, -1.7F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0091F, 2.1599F, 0.2237F, -0.0699F, -0.0014F, 0.001F));

		PartDefinition cube_r184 = rightarm.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(177, 87).mirror().addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.5106F, -0.2658F, 0.8287F, -0.2444F, -0.0014F, 0.001F));

		PartDefinition cube_r185 = rightarm.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(186, 208).mirror().addBox(-0.5F, 1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r186 = rightarm.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(181, 171).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.5128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 8.1511F, 0.1813F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r187 = rightarm2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(197, 116).mirror().addBox(-2.7147F, 2.8888F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(7, 205).mirror().addBox(-1.7147F, -0.8112F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.4793F, 2.8228F, 1.5708F, 1.117F, 1.5708F));

		PartDefinition cube_r188 = rightarm2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(33, 215).mirror().addBox(-1.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6764F, -2.3232F, 5.2941F, -1.5708F, 0.1222F, -1.5708F));

		PartDefinition cube_r189 = rightarm2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(208, 157).mirror().addBox(-1.0591F, -2.236F, -0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.4793F, 2.8228F, -1.5708F, 0.8639F, -1.5708F));

		PartDefinition cube_r190 = rightarm2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(204, 178).mirror().addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 1.4441F, -0.3362F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r191 = rightarm2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(0, 220).mirror().addBox(-3.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1764F, 0.5919F, -0.9948F, -1.5708F, 1.0385F, -1.5708F));

		PartDefinition cube_r192 = rightarm2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(198, 189).mirror().addBox(-1.4665F, 3.8378F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(196, 171).mirror().addBox(-0.9665F, 0.4378F, 0.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 6.4838F, 1.9099F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r193 = rightArm3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.4F, -2.0F, -7.5F, 0.0F, 16.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, -3.1416F, 0.0F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, -0.043F, -0.0076F, -0.1744F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(40, 171).addBox(-2.5F, -3.7679F, -0.0951F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(191, 54).mirror().addBox(-0.5F, 0.0154F, -5.0652F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1559F, 11.5945F, -16.7161F, -2.3851F, 0.1544F, -1.2181F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(192, 151).mirror().addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.234F, 9.8596F, -13.0869F, -3.0314F, 0.4148F, -1.1893F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(211, 14).mirror().addBox(-0.9F, 0.0154F, -2.0652F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 12.7705F, -16.9036F, -1.6016F, 0.3291F, -0.7757F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(196, 60).mirror().addBox(-5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 14.0534F, -16.1741F, -1.0138F, 1.0756F, 0.0943F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(204, 56).mirror().addBox(-4.0441F, -0.0551F, -0.8436F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2567F, 14.1621F, -11.7495F, 0.0249F, 1.3168F, 1.1896F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(45, 204).mirror().addBox(0.0F, -0.0351F, 0.4575F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.8088F, -3.8916F, -0.282F, 0.1593F, 0.5009F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(29, 86).mirror().addBox(-3.5417F, -0.0539F, -0.7166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6112F, 13.2696F, -7.7604F, 0.0098F, 0.8805F, 1.1731F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(45, 204).addBox(0.0F, -0.0351F, 0.4575F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8088F, -3.8916F, -0.282F, -0.1593F, -0.5009F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(204, 56).addBox(0.0441F, -0.0551F, -0.8436F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2567F, 14.1621F, -11.7495F, 0.0249F, -1.3168F, -1.1896F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(29, 86).addBox(-0.4583F, -0.0539F, -0.7166F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6112F, 13.2696F, -7.7604F, 0.0098F, -0.8805F, -1.1731F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(196, 60).addBox(0.0F, 0.0F, -0.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 14.0534F, -16.1741F, -1.0138F, -1.0756F, -0.0943F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(192, 151).addBox(-0.5F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.234F, 9.8596F, -13.0869F, -3.0314F, -0.4148F, 1.1893F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(191, 54).addBox(-0.5F, 0.0154F, -5.0652F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1559F, 11.5945F, -16.7161F, -2.3851F, -0.1544F, 1.2181F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(211, 14).addBox(-0.1F, 0.0154F, -2.0652F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 12.7705F, -16.9036F, -1.6016F, -0.3291F, 0.7757F));

		PartDefinition cube_r209 = neck.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(204, 75).addBox(-1.0F, 0.3F, -2.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.3848F, -15.7996F, -1.117F, 0.0F, 0.0F));

		PartDefinition cube_r210 = neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(0, 171).addBox(-2.5F, -2.0F, -1.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.438F, -5.5409F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6832F, -8.526F, -1.0384F, 0.4668F, -0.1748F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(196, 63).addBox(-2.0F, -0.6F, -1.4F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 30.4803F, -38.487F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(179, 36).addBox(-2.5F, -2.9F, -2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 32.2668F, -36.5744F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(169, 203).addBox(1.5F, -3.9F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(161, 119).addBox(-3.5F, -2.9F, -4.0F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 30.5134F, -32.9792F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(21, 162).addBox(3.0F, -3.9F, -7.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(93, 143).mirror().addBox(-3.6F, -2.9F, -7.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(93, 143).addBox(-2.4F, -2.9F, -7.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 26.8039F, -27.0429F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 70).addBox(-5.0F, 2.2F, -5.1F, 10.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.8154F, -13.0756F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(47, 46).addBox(-6.0F, -2.0F, -0.1F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.1126F, -21.8719F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(27, 130).addBox(-5.0F, -2.9F, -0.1F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 26.8075F, -27.0078F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(93, 136).addBox(-8.0F, -1.7F, -1.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.2458F, -12.0727F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(0, 159).mirror().addBox(0.3F, -1.5F, -4.5F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 3.4341F, -0.5905F, 1.0778F, -0.2929F, -0.493F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(0, 159).addBox(-2.3F, -1.5F, -4.5F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.4341F, -0.5905F, 1.0778F, 0.2929F, 0.493F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(112, 3).addBox(-8.0F, 0.1F, 0.0F, 15.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.257F, -6.9443F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(127, 108).addBox(-8.0F, 0.1F, 0.0F, 15.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2541F, -7.0752F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 88).addBox(-12.0F, 0.1F, -4.0F, 23.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.6277F, -4.926F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(143, 144).addBox(-2.0F, 0.1F, -2.5F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6103F, -6.0297F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(27, 101).addBox(-5.0F, -3.0F, 7.5F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(96, 18).addBox(-5.0F, -1.0F, -3.5F, 10.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.651F, -10.7465F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(61, 0).addBox(-7.0F, -7.0F, -5.0F, 14.0F, 6.0F, 11.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 10.6437F, -7.2424F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.9F, -12.0F, 18.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3662F, -7.9146F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(135, 79).addBox(-8.0F, 0.1F, -2.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -8.0503F, -9.794F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(139, 18).addBox(-6.0F, -0.0075F, -2.9172F, 12.0F, 5.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.1727F, -15.1881F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(130, 136).addBox(-7.0F, 0.0F, -0.9F, 14.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -7.1286F, -15.213F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r231 = leftOrbit.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(210, 116).addBox(2.5476F, -1.4869F, 6.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(210, 97).addBox(2.5476F, -1.4869F, 4.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, -0.8894F, -3.4801F, 0.2801F, -0.7353F, 1.2628F));

		PartDefinition cube_r232 = leftOrbit.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(211, 189).addBox(1.3545F, -0.9733F, 2.8847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, -0.8894F, -3.4801F, 0.337F, -0.499F, 1.3747F));

		PartDefinition cube_r233 = leftOrbit.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(211, 10).addBox(1.119F, -0.5163F, 1.1876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(7.4F, -0.8894F, -3.4801F, 0.4523F, -0.3058F, 1.1807F));

		PartDefinition cube_r234 = leftOrbit.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(101, 167).addBox(0.1522F, -0.5163F, -0.4728F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, -0.8894F, -3.4801F, 0.4305F, 0.0501F, 1.349F));

		PartDefinition cube_r235 = leftOrbit.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(172, 26).addBox(0.8941F, -0.5163F, -0.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(7.4F, -0.8894F, -3.4801F, 0.435F, -0.1481F, 1.2575F));

		PartDefinition cube_r236 = leftOrbit.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(209, 143).addBox(1.3241F, -1.7008F, -5.1045F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(9.6138F, -0.7879F, 0.0686F, 0.9037F, 0.3508F, 1.7121F));

		PartDefinition cube_r237 = leftOrbit.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(182, 127).addBox(-1.1788F, -1.7008F, -9.0364F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.6138F, -0.7879F, 0.0686F, 0.8334F, -0.0811F, 1.2116F));

		PartDefinition cube_r238 = leftOrbit.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(196, 134).addBox(1.1066F, -1.7008F, -7.4808F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.6138F, -0.7879F, 0.0686F, 0.8918F, 0.3236F, 1.6759F));

		PartDefinition cube_r239 = leftOrbit.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(172, 54).addBox(-3.2908F, -0.8757F, -5.2089F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.8937F, -0.3637F, 0.9092F));

		PartDefinition cube_r240 = leftOrbit.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(168, 151).addBox(-1.2256F, -1.1759F, 1.8535F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.3395F, 0.035F, 1.1819F));

		PartDefinition cube_r241 = leftOrbit.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(177, 95).addBox(-4.1773F, -1.2222F, -3.9767F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.7403F, 0.763F, 1.5138F));

		PartDefinition cube_r242 = leftOrbit.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(107, 205).addBox(-1.6249F, -0.4881F, 1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0333F, -8.8235F, 6.3498F, 0.1944F, 0.1307F, -0.0004F));

		PartDefinition cube_r243 = leftOrbit.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(90, 154).addBox(-1.1437F, -4.2327F, -6.0782F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5333F, -8.6235F, 6.3498F, -0.6205F, 0.1612F, -0.031F));

		PartDefinition cube_r244 = leftOrbit.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(143, 156).addBox(1.323F, -14.896F, -8.8347F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4F, -0.7894F, 0.0199F, -0.4905F, 0.4861F, -0.2388F));

		PartDefinition cube_r245 = leftOrbit.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(39, 180).addBox(-0.1477F, -2.0318F, -2.4015F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(9.5333F, -8.6235F, 6.3498F, 0.0199F, 0.1307F, -0.0004F));

		PartDefinition cube_r246 = leftOrbit.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(184, 116).addBox(-0.1477F, -1.6306F, -5.2107F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5333F, -8.6235F, 6.3498F, 1.0671F, 0.1307F, -0.0004F));

		PartDefinition cube_r247 = leftOrbit.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(151, 3).addBox(-0.1477F, 0.0046F, -4.5146F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(9.5333F, -8.6235F, 6.3498F, 0.7616F, 0.1307F, -0.0004F));

		PartDefinition cube_r248 = leftOrbit.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(170, 18).addBox(-4.0F, -3.7F, -1.5F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.3F, -12.7873F, 9.0684F, 0.5744F, 0.3332F, -0.468F));

		PartDefinition cube_r249 = leftOrbit.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(181, 151).addBox(1.0F, 0.1F, -3.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -14.9698F, 9.2844F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r250 = leftOrbit.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(185, 101).addBox(-4.1773F, -1.1759F, -0.3134F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.4785F, 0.763F, 1.5138F));

		PartDefinition cube_r251 = leftOrbit.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(211, 59).addBox(-0.5158F, -0.6783F, 0.3537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.6166F, 0.4218F, 1.4039F));

		PartDefinition cube_r252 = leftOrbit.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(122, 186).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4924F, -6.055F, -6.712F, 1.2771F, 0.0035F, 0.0356F));

		PartDefinition cube_r253 = leftOrbit.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(111, 159).addBox(-1.6F, -2.5F, 0.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9517F, -10.9308F, -6.2064F, 1.48F, -0.0312F, -0.2255F));

		PartDefinition cube_r254 = leftOrbit.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(101, 172).addBox(-1.0183F, -2.2164F, -1.1336F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4248F, -7.423F, -6.4438F, 1.5812F, -0.0473F, -0.0267F));

		PartDefinition cube_r255 = leftOrbit.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(179, 61).addBox(1.3F, -0.5F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -3.4552F, -10.2945F, 1.0845F, -0.097F, -0.0571F));

		PartDefinition cube_r256 = leftOrbit.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(84, 167).addBox(-0.5F, -3.2582F, 10.3088F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 9.4864F, -14.4475F, 1.0608F, 0.1036F, 0.0938F));

		PartDefinition cube_r257 = leftOrbit.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(165, 127).addBox(-2.1074F, -0.7561F, 4.8687F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 9.4864F, -14.4475F, 1.3117F, 0.1872F, 0.2278F));

		PartDefinition cube_r258 = leftOrbit.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(99, 117).addBox(-1.5F, -2.0F, -9.5F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 11.6605F, -17.8492F, 0.6115F, 0.0429F, 0.0301F));

		PartDefinition cube_r259 = leftOrbit.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(127, 87).addBox(-2.9218F, -2.2199F, -0.7577F, 3.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 9.4864F, -14.4475F, 0.7108F, 0.17F, 0.151F));

		PartDefinition cube_r260 = leftOrbit.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(181, 162).addBox(-2.1F, -2.0F, -3.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 17.3405F, -26.7084F, 0.5406F, 0.3912F, 0.2493F));

		PartDefinition cube_r261 = leftOrbit.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(158, 200).addBox(-1.5F, -2.3F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 19.2901F, -30.1947F, 0.3819F, 0.5142F, 0.1353F));

		PartDefinition cube_r262 = leftOrbit.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(196, 139).addBox(-1.5F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 19.2901F, -30.1947F, 0.1201F, 0.5142F, 0.1353F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(112, 212).addBox(4.5F, -3.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.2F, 10.4672F, -9.8343F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(15, 216).addBox(4.5F, -0.4F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 214).addBox(4.2F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, 10.2816F, -12.7128F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(214, 120).addBox(2.5F, -3.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.5F, 12.793F, -11.2628F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(23, 211).addBox(2.5F, -0.6423F, 0.0041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, 12.2854F, -15.3192F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(117, 212).addBox(2.5F, -0.9737F, 0.713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4F, 12.2854F, -15.3192F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(98, 212).addBox(2.5F, -0.0038F, -0.8186F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.4F, 12.2854F, -15.3192F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(215, 101).addBox(-0.5F, -1.6026F, -0.9097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6F, 21.6498F, -29.6172F, -0.2217F, 0.2797F, -0.0406F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(172, 79).addBox(-0.5F, -2.7054F, -0.0933F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.6F, 21.6498F, -29.6172F, -0.3264F, 0.2797F, -0.0406F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(52, 180).addBox(-0.5F, -0.0365F, -0.9491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 21.6498F, -29.6172F, 0.2932F, 0.2797F, -0.0406F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(184, 14).addBox(-0.5F, -0.0598F, -1.0064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 20.8664F, -27.0596F, 0.4363F, 0.3054F, 0.0F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(7, 189).addBox(-0.5F, -2.6911F, -0.1535F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, 20.8664F, -27.0596F, -0.1833F, 0.3054F, 0.0F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(62, 216).addBox(-0.5F, -1.5946F, -0.9711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1F, 20.8664F, -27.0596F, -0.0785F, 0.3054F, 0.0F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(182, 213).addBox(2.5F, -2.6118F, -1.0542F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.1F, 20.29F, -24.6781F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(165, 210).addBox(2.5F, -2.6994F, -0.238F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.1F, 20.29F, -24.6781F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(215, 75).addBox(2.5F, -0.1157F, -1.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 20.29F, -24.6781F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(216, 67).addBox(2.5F, -0.1919F, -1.1159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 18.9249F, -21.8964F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(57, 212).addBox(2.5F, -2.7351F, -0.3193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 18.9249F, -21.8964F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(214, 151).addBox(2.5F, -2.6557F, -1.1314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.0F, 18.9249F, -21.8964F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(209, 212).addBox(2.5F, -2.9557F, -0.1314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.9F, 17.9841F, -20.1255F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(107, 211).addBox(2.5F, -2.7351F, -0.1193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.9F, 17.4249F, -19.2964F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(44, 213).addBox(2.5F, -2.1632F, -0.6595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.9F, 17.4249F, -19.2964F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(5, 216).addBox(2.5F, -0.1919F, -1.1159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 17.4249F, -19.2964F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(52, 211).addBox(2.5F, -3.5F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.6F, 15.8277F, -15.7236F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(151, 212).addBox(2.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-1.6F, 15.8277F, -15.7236F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r287 = leftOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(38, 216).addBox(2.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.6F, 16.0427F, -17.1795F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r288 = leftOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(10, 216).addBox(2.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 16.1874F, -16.0709F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r289 = leftOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(44, 160).addBox(-1.3F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 10.2396F, -18.5897F, 0.7437F, 0.0643F, 0.059F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(168, 139).addBox(-1.6275F, -3.1487F, 0.247F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 9.4864F, -14.4475F, 0.9424F, 0.1363F, 0.1559F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(208, 183).addBox(-1.9652F, -0.6783F, -1.0217F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5047F, -4.9257F, -3.4487F, 0.5584F, -0.0916F, 1.0643F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r292 = rightOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(210, 116).mirror().addBox(-3.5476F, -1.4869F, 6.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(210, 97).mirror().addBox(-3.5476F, -1.4869F, 4.1469F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.8894F, -3.4801F, 0.2801F, 0.7353F, -1.2628F));

		PartDefinition cube_r293 = rightOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(211, 189).mirror().addBox(-2.3545F, -0.9733F, 2.8847F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.8894F, -3.4801F, 0.337F, 0.499F, -1.3747F));

		PartDefinition cube_r294 = rightOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(211, 10).mirror().addBox(-2.119F, -0.5163F, 1.1876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.8894F, -3.4801F, 0.4523F, 0.3058F, -1.1807F));

		PartDefinition cube_r295 = rightOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(101, 167).mirror().addBox(-1.1522F, -0.5163F, -0.4728F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.8894F, -3.4801F, 0.4305F, -0.0501F, -1.349F));

		PartDefinition cube_r296 = rightOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(172, 26).mirror().addBox(-1.8941F, -0.5163F, -0.4312F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.8894F, -3.4801F, 0.435F, 0.1481F, -1.2575F));

		PartDefinition cube_r297 = rightOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(209, 143).mirror().addBox(-3.3241F, -1.7008F, -5.1045F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-9.6138F, -0.7879F, 0.0686F, 0.9037F, -0.3508F, -1.7121F));

		PartDefinition cube_r298 = rightOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(182, 127).mirror().addBox(-0.8212F, -1.7008F, -9.0364F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.6138F, -0.7879F, 0.0686F, 0.8334F, 0.0811F, -1.2116F));

		PartDefinition cube_r299 = rightOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(196, 134).mirror().addBox(-4.1066F, -1.7008F, -7.4808F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.6138F, -0.7879F, 0.0686F, 0.8918F, -0.3236F, -1.6759F));

		PartDefinition cube_r300 = rightOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(172, 54).mirror().addBox(-0.7092F, -0.8757F, -5.2089F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.8937F, 0.3637F, -0.9092F));

		PartDefinition cube_r301 = rightOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(168, 151).mirror().addBox(-1.7744F, -1.1759F, 1.8535F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.3395F, -0.035F, -1.1819F));

		PartDefinition cube_r302 = rightOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(177, 95).mirror().addBox(0.1773F, -1.2222F, -3.9767F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.7403F, -0.763F, -1.5138F));

		PartDefinition cube_r303 = rightOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(107, 205).mirror().addBox(0.6249F, -0.4881F, 1.95F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0333F, -8.8235F, 6.3498F, 0.1944F, -0.1307F, 0.0004F));

		PartDefinition cube_r304 = rightOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(90, 154).mirror().addBox(-0.8563F, -4.2327F, -6.0782F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.5333F, -8.6235F, 6.3498F, -0.6205F, -0.1612F, 0.031F));

		PartDefinition cube_r305 = rightOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(143, 156).mirror().addBox(-3.323F, -14.896F, -8.8347F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.4F, -0.7894F, 0.0199F, -0.4905F, -0.4861F, 0.2388F));

		PartDefinition cube_r306 = rightOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(39, 180).mirror().addBox(-0.8523F, -2.0318F, -2.4015F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-9.5333F, -8.6235F, 6.3498F, 0.0199F, -0.1307F, 0.0004F));

		PartDefinition cube_r307 = rightOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(184, 116).mirror().addBox(-0.8523F, -1.6306F, -5.2107F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.5333F, -8.6235F, 6.3498F, 1.0671F, -0.1307F, 0.0004F));

		PartDefinition cube_r308 = rightOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(151, 3).mirror().addBox(-0.8523F, 0.0046F, -4.5146F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-9.5333F, -8.6235F, 6.3498F, 0.7616F, -0.1307F, 0.0004F));

		PartDefinition cube_r309 = rightOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(170, 18).mirror().addBox(-2.0F, -3.7F, -1.5F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3F, -12.7873F, 9.0684F, 0.5744F, -0.3332F, 0.468F));

		PartDefinition cube_r310 = rightOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(181, 151).mirror().addBox(-3.0F, 0.1F, -3.0F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, -14.9698F, 9.2844F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(185, 101).mirror().addBox(0.1773F, -1.1759F, -0.3134F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.4785F, -0.763F, -1.5138F));

		PartDefinition cube_r312 = rightOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(211, 59).mirror().addBox(-0.4842F, -0.6783F, 0.3537F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.6166F, -0.4218F, -1.4039F));

		PartDefinition cube_r313 = rightOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(122, 186).mirror().addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4924F, -6.055F, -6.712F, 1.2771F, -0.0035F, -0.0356F));

		PartDefinition cube_r314 = rightOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(111, 159).mirror().addBox(-0.4F, -2.5F, 0.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9517F, -10.9308F, -6.2064F, 1.48F, 0.0312F, 0.2255F));

		PartDefinition cube_r315 = rightOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(101, 172).mirror().addBox(-0.9817F, -2.2164F, -1.1336F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4248F, -7.423F, -6.4438F, 1.5812F, 0.0473F, 0.0267F));

		PartDefinition cube_r316 = rightOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(179, 61).mirror().addBox(-3.3F, -0.5F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -3.4552F, -10.2945F, 1.0845F, 0.097F, 0.0571F));

		PartDefinition cube_r317 = rightOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(84, 167).mirror().addBox(-1.5F, -3.2582F, 10.3088F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 9.4864F, -14.4475F, 1.0608F, -0.1036F, -0.0938F));

		PartDefinition cube_r318 = rightOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(165, 127).mirror().addBox(0.1074F, -0.7561F, 4.8687F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 9.4864F, -14.4475F, 1.3117F, -0.1872F, -0.2278F));

		PartDefinition cube_r319 = rightOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(99, 117).mirror().addBox(-0.5F, -2.0F, -9.5F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 11.6605F, -17.8492F, 0.6115F, -0.0429F, -0.0301F));

		PartDefinition cube_r320 = rightOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(127, 87).mirror().addBox(-0.0782F, -2.2199F, -0.7577F, 3.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 9.4864F, -14.4475F, 0.7108F, -0.17F, -0.151F));

		PartDefinition cube_r321 = rightOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(181, 162).mirror().addBox(0.1F, -2.0F, -3.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 17.3405F, -26.7084F, 0.5406F, -0.3912F, -0.2493F));

		PartDefinition cube_r322 = rightOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(158, 200).mirror().addBox(-0.5F, -2.3F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 19.2901F, -30.1947F, 0.3819F, -0.5142F, -0.1353F));

		PartDefinition cube_r323 = rightOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(196, 139).mirror().addBox(-0.5F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 19.2901F, -30.1947F, 0.1201F, -0.5142F, -0.1353F));

		PartDefinition cube_r324 = rightOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(112, 212).mirror().addBox(-5.5F, -3.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.2F, 10.4672F, -9.8343F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r325 = rightOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(15, 216).mirror().addBox(-5.5F, -0.4F, 1.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 214).mirror().addBox(-5.2F, -0.1F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2F, 10.2816F, -12.7128F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r326 = rightOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(214, 120).mirror().addBox(-3.5F, -3.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.5F, 12.793F, -11.2628F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r327 = rightOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(23, 211).mirror().addBox(-3.5F, -0.6423F, 0.0041F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4F, 12.2854F, -15.3192F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r328 = rightOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(117, 212).mirror().addBox(-3.5F, -0.9737F, 0.713F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.4F, 12.2854F, -15.3192F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r329 = rightOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(98, 212).mirror().addBox(-3.5F, -0.0038F, -0.8186F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.4F, 12.2854F, -15.3192F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r330 = rightOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(215, 101).mirror().addBox(-0.5F, -1.6026F, -0.9097F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6F, 21.6498F, -29.6172F, -0.2217F, -0.2797F, 0.0406F));

		PartDefinition cube_r331 = rightOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(172, 79).mirror().addBox(-0.5F, -2.7054F, -0.0933F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.6F, 21.6498F, -29.6172F, -0.3264F, -0.2797F, 0.0406F));

		PartDefinition cube_r332 = rightOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(52, 180).mirror().addBox(-0.5F, -0.0365F, -0.9491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 21.6498F, -29.6172F, 0.2932F, -0.2797F, 0.0406F));

		PartDefinition cube_r333 = rightOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(184, 14).mirror().addBox(-0.5F, -0.0598F, -1.0064F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 20.8664F, -27.0596F, 0.4363F, -0.3054F, 0.0F));

		PartDefinition cube_r334 = rightOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(7, 189).mirror().addBox(-0.5F, -2.6911F, -0.1535F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 20.8664F, -27.0596F, -0.1833F, -0.3054F, 0.0F));

		PartDefinition cube_r335 = rightOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(62, 216).mirror().addBox(-0.5F, -1.5946F, -0.9711F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 20.8664F, -27.0596F, -0.0785F, -0.3054F, 0.0F));

		PartDefinition cube_r336 = rightOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(182, 213).mirror().addBox(-3.5F, -2.6118F, -1.0542F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.1F, 20.29F, -24.6781F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r337 = rightOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(165, 210).mirror().addBox(-3.5F, -2.6994F, -0.238F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.1F, 20.29F, -24.6781F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(215, 75).mirror().addBox(-3.5F, -0.1157F, -1.0704F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1F, 20.29F, -24.6781F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(216, 67).mirror().addBox(-3.5F, -0.1919F, -1.1159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 18.9249F, -21.8964F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r340 = rightOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(57, 212).mirror().addBox(-3.5F, -2.7351F, -0.3193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 18.9249F, -21.8964F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r341 = rightOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(214, 151).mirror().addBox(-3.5F, -2.6557F, -1.1314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.0F, 18.9249F, -21.8964F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r342 = rightOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(209, 212).mirror().addBox(-3.5F, -2.9557F, -0.1314F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.9F, 17.9841F, -20.1255F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r343 = rightOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(107, 211).mirror().addBox(-3.5F, -2.7351F, -0.1193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.9F, 17.4249F, -19.2964F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(44, 213).mirror().addBox(-3.5F, -2.1632F, -0.6595F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.9F, 17.4249F, -19.2964F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r345 = rightOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 216).mirror().addBox(-3.5F, -0.1919F, -1.1159F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9F, 17.4249F, -19.2964F, 0.8029F, 0.0F, 0.0F));

		PartDefinition cube_r346 = rightOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(52, 211).mirror().addBox(-3.5F, -3.5F, -0.6F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.6F, 15.8277F, -15.7236F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r347 = rightOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(151, 212).mirror().addBox(-3.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(1.6F, 15.8277F, -15.7236F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r348 = rightOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(38, 216).mirror().addBox(-3.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.6F, 16.0427F, -17.1795F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r349 = rightOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(10, 216).mirror().addBox(-3.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6F, 16.1874F, -16.0709F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r350 = rightOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(44, 160).mirror().addBox(-0.7F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 10.2396F, -18.5897F, 0.7437F, -0.0643F, -0.059F));

		PartDefinition cube_r351 = rightOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(168, 139).mirror().addBox(-0.3725F, -3.1487F, 0.247F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 9.4864F, -14.4475F, 0.9424F, -0.1363F, -0.1559F));

		PartDefinition cube_r352 = rightOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(208, 183).mirror().addBox(-1.0348F, -0.6783F, -1.0217F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5047F, -4.9257F, -3.4487F, 0.5584F, 0.0916F, -1.0643F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 4.4061F, 5.2837F, 1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r353 = jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 180).mirror().addBox(-0.0829F, -1.1F, 0.4599F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(201, 79).mirror().addBox(-2.0829F, -1.1F, 2.4599F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -1.282F, -0.1477F, 0.18F));

		PartDefinition cube_r354 = jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(32, 174).mirror().addBox(-0.1F, -7.0F, -0.5F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.393F, 3.8594F, -10.4262F, -1.4556F, -0.1911F, 0.175F));

		PartDefinition cube_r355 = jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(27, 141).mirror().addBox(-0.0829F, 2.08F, -1.0869F, 2.0F, 14.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -1.4565F, -0.1477F, 0.18F));

		PartDefinition cube_r356 = jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(143, 169).mirror().addBox(-0.2499F, -1.8407F, 0.2391F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -2.4286F, -0.1455F, 0.2167F));

		PartDefinition cube_r357 = jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(57, 174).mirror().addBox(-0.2499F, 3.5805F, -2.0541F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -1.8614F, -0.1455F, 0.2167F));

		PartDefinition cube_r358 = jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(158, 179).mirror().addBox(-0.0829F, 6.7171F, -4.2329F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -1.5525F, -0.1477F, 0.18F));

		PartDefinition cube_r359 = jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(164, 62).mirror().addBox(-0.0829F, 7.0084F, -7.9852F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-8.6023F, -1.5057F, -1.8422F, -1.1162F, -0.1477F, 0.18F));

		PartDefinition cube_r360 = jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(184, 178).mirror().addBox(-1.0F, -4.3733F, -2.4082F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6185F, 1.6505F, -21.1162F, -1.2751F, -0.0619F, 0.1784F));

		PartDefinition cube_r361 = jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(158, 169).mirror().addBox(0.0F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.8076F, 5.2677F, -20.9623F, -1.4925F, -0.1489F, 0.1716F));

		PartDefinition cube_r362 = jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(67, 159).mirror().addBox(-1.0F, -3.9404F, -1.5444F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-5.6185F, 1.6505F, -21.1162F, -1.4932F, -0.0619F, 0.1784F));

		PartDefinition cube_r363 = jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(160, 86).mirror().addBox(-0.3395F, -14.26F, 0.2895F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, -0.7027F, -38.3908F, -1.6398F, -0.1477F, 0.1626F));

		PartDefinition cube_r364 = jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(116, 172).mirror().addBox(-1.6829F, -0.2095F, 0.7402F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -31.5908F, -1.8235F, -0.1471F, 0.1637F));

		PartDefinition cube_r365 = jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(116, 206).mirror().addBox(-0.3106F, 6.7718F, 2.2761F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -39.6908F, -2.2317F, -0.1824F, 0.0327F));

		PartDefinition cube_r366 = jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(216, 63).mirror().addBox(-0.2651F, -3.6105F, 5.1593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.2797F, 0.1559F, 2.8785F));

		PartDefinition cube_r367 = jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(202, 215).mirror().addBox(-0.2651F, 0.6486F, 5.0142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, 0.3399F, 0.1559F, 2.8785F));

		PartDefinition cube_r368 = jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(46, 189).mirror().addBox(-0.2651F, -1.3075F, 2.9542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(21, 159).mirror().addBox(-0.2651F, -0.8883F, 0.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(214, 198).mirror().addBox(-0.2651F, -2.1709F, -1.236F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.0179F, 0.1559F, 2.8785F));

		PartDefinition cube_r369 = jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(122, 216).mirror().addBox(-0.2651F, -1.8104F, 3.6757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(216, 71).mirror().addBox(-0.2651F, -1.1639F, 1.5352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(170, 214).mirror().addBox(-0.2651F, -1.242F, -0.3727F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.1226F, 0.1559F, 2.8785F));

		PartDefinition cube_r370 = jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(197, 215).mirror().addBox(-0.2651F, 1.2526F, 2.761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(215, 105).mirror().addBox(-0.2651F, 0.5359F, 0.6429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(192, 215).mirror().addBox(-0.2651F, 0.1785F, -1.4457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, 0.497F, 0.1559F, 2.8785F));

		PartDefinition cube_r371 = jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(215, 178).mirror().addBox(-0.2384F, -0.5423F, -3.6312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, 0.3317F, 0.2075F, 2.8794F));

		PartDefinition cube_r372 = jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(69, 212).mirror().addBox(-0.2384F, -1.5597F, -2.5706F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.2879F, 0.2075F, 2.8794F));

		PartDefinition cube_r373 = jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(156, 214).mirror().addBox(-0.2384F, -1.7221F, -3.4932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.1832F, 0.2075F, 2.8794F));

		PartDefinition cube_r374 = jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(213, 193).mirror().addBox(-0.7279F, 0.6025F, -5.0607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7572F, -3.3454F, -45.1341F, -0.5961F, 0.2267F, 2.7822F));

		PartDefinition cube_r375 = jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(179, 191).mirror().addBox(-0.7279F, 0.916F, -3.8866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7572F, -3.3454F, -45.1341F, -0.7009F, 0.2267F, 2.7822F));

		PartDefinition cube_r376 = jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(215, 109).mirror().addBox(-0.7279F, 0.709F, -6.1402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7572F, -3.3454F, -45.1341F, -0.0813F, 0.2267F, 2.7822F));

		PartDefinition cube_r377 = jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(93, 212).mirror().addBox(-0.8845F, -0.7261F, -3.7991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.2859F, 0.1891F, 2.9206F));

		PartDefinition cube_r378 = jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(146, 210).mirror().addBox(-0.8845F, -0.5372F, -2.7707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.3906F, 0.1891F, 2.9206F));

		PartDefinition cube_r379 = jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(214, 212).mirror().addBox(-0.8845F, 0.1739F, -4.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, 0.229F, 0.1891F, 2.9206F));

		PartDefinition cube_r380 = jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(187, 213).mirror().addBox(-0.6845F, -1.4303F, -1.4806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.1986F, 0.1891F, 2.9206F));

		PartDefinition cube_r381 = jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(141, 210).mirror().addBox(-0.6845F, -1.4799F, -0.5386F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.3034F, 0.1891F, 2.9206F));

		PartDefinition cube_r382 = jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(214, 203).mirror().addBox(-0.6845F, 0.7027F, -2.0233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, 0.3162F, 0.1891F, 2.9206F));

		PartDefinition cube_r383 = jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(132, 214).mirror().addBox(-0.3845F, -2.7322F, 1.1228F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.155F, 0.1891F, 2.9206F));

		PartDefinition cube_r384 = jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(39, 210).mirror().addBox(-0.3845F, -3.0468F, 1.9145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.2597F, 0.1891F, 2.9206F));

		PartDefinition cube_r385 = jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(179, 197).mirror().addBox(-0.3845F, 0.8516F, 0.8838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, 0.3599F, 0.1891F, 2.9206F));

		PartDefinition cube_r386 = jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(88, 212).mirror().addBox(-0.002F, -4.2567F, 4.0357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.1971F, 0.1553F, 2.9653F));

		PartDefinition cube_r387 = jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(32, 202).mirror().addBox(-0.002F, -4.8674F, 4.6521F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, -0.3018F, 0.1553F, 2.9653F));

		PartDefinition cube_r388 = jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(189, 22).mirror().addBox(-0.002F, 0.9591F, 4.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4572F, -3.3454F, -45.1341F, 0.3178F, 0.1553F, 2.9653F));

		PartDefinition cube_r389 = jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(28, 215).mirror().addBox(-0.9407F, -0.6472F, -6.7001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, 0.3317F, 0.0853F, 2.8794F));

		PartDefinition cube_r390 = jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(83, 212).mirror().addBox(-0.9407F, 0.137F, -5.1299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.2879F, 0.0853F, 2.8794F));

		PartDefinition cube_r391 = jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(214, 30).mirror().addBox(-0.9407F, -0.3022F, -6.2158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4981F, -0.5437F, -31.1159F, -0.1832F, 0.0853F, 2.8794F));

		PartDefinition cube_r392 = jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(87, 179).mirror().addBox(-0.3106F, -0.4825F, -0.267F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -39.6908F, -2.0136F, -0.1824F, 0.0327F));

		PartDefinition cube_r393 = jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(173, 179).mirror().addBox(-1.6829F, -0.7034F, -1.3168F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -31.5908F, -1.6402F, -0.1471F, 0.1637F));

		PartDefinition cube_r394 = jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(205, 151).mirror().addBox(-0.3106F, 7.1305F, -3.5881F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -39.6908F, -1.6383F, -0.1824F, 0.0327F));

		PartDefinition cube_r395 = jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(129, 174).mirror().addBox(-0.3106F, -0.2619F, -1.9597F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8742F, 1.3973F, -39.6908F, -1.8565F, -0.1824F, 0.0327F));

		PartDefinition cube_r396 = jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(201, 79).addBox(0.0829F, -1.1F, 2.4599F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 180).addBox(-1.9171F, -1.1F, 0.4599F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -1.282F, 0.1477F, -0.18F));

		PartDefinition cube_r397 = jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(32, 174).addBox(-1.9F, -7.0F, -0.5F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.193F, 3.8594F, -10.4262F, -1.4556F, 0.1911F, -0.175F));

		PartDefinition cube_r398 = jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(27, 141).addBox(-1.9171F, 2.08F, -1.0869F, 2.0F, 14.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -1.4565F, 0.1477F, -0.18F));

		PartDefinition cube_r399 = jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(143, 169).addBox(-1.7501F, -1.8407F, 0.2391F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -2.4286F, 0.1455F, -0.2167F));

		PartDefinition cube_r400 = jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(57, 174).addBox(-1.7501F, 3.5805F, -2.0541F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -1.8614F, 0.1455F, -0.2167F));

		PartDefinition cube_r401 = jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(158, 179).addBox(-1.9171F, 6.7171F, -4.2329F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -1.5525F, 0.1477F, -0.18F));

		PartDefinition cube_r402 = jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(164, 62).addBox(-1.9171F, 7.0084F, -7.9852F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(7.4023F, -1.5057F, -1.8422F, -1.1162F, 0.1477F, -0.18F));

		PartDefinition cube_r403 = jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(184, 178).addBox(-1.0F, -4.3733F, -2.4082F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4185F, 1.6505F, -21.1162F, -1.2751F, 0.0619F, -0.1784F));

		PartDefinition cube_r404 = jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(158, 169).addBox(-1.0F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6076F, 5.2677F, -20.9623F, -1.4925F, 0.1489F, -0.1716F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(67, 159).addBox(-1.0F, -3.9404F, -1.5444F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(4.4185F, 1.6505F, -21.1162F, -1.4932F, 0.0619F, -0.1784F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(160, 86).addBox(-1.6605F, -14.26F, 0.2895F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6742F, -0.7027F, -38.3908F, -1.6398F, 0.1477F, -0.1626F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(116, 172).addBox(-0.3171F, -0.2095F, 0.7402F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -31.5908F, -1.8235F, 0.1471F, -0.1637F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(116, 206).addBox(-1.6894F, 6.7718F, 2.2761F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -39.6908F, -2.2317F, 0.1824F, -0.0327F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(216, 63).addBox(-0.7349F, -3.6105F, 5.1593F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.2797F, -0.1559F, -2.8785F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(202, 215).addBox(-0.7349F, 0.6486F, 5.0142F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, 0.3399F, -0.1559F, -2.8785F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(46, 189).addBox(-0.7349F, -1.3075F, 2.9542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(21, 159).addBox(-0.7349F, -0.8883F, 0.7578F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(214, 198).addBox(-0.7349F, -2.1709F, -1.236F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.0179F, -0.1559F, -2.8785F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(122, 216).addBox(-0.7349F, -1.8104F, 3.6757F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(216, 71).addBox(-0.7349F, -1.1639F, 1.5352F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(170, 214).addBox(-0.7349F, -1.242F, -0.3727F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.1226F, -0.1559F, -2.8785F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(197, 215).addBox(-0.7349F, 1.2526F, 2.761F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(215, 105).addBox(-0.7349F, 0.5359F, 0.6429F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(192, 215).addBox(-0.7349F, 0.1785F, -1.4457F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, 0.497F, -0.1559F, -2.8785F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(215, 178).addBox(-0.7616F, -0.5423F, -3.6312F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, 0.3317F, -0.2075F, -2.8794F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(69, 212).addBox(-0.7616F, -1.5597F, -2.5706F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.2879F, -0.2075F, -2.8794F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(156, 214).addBox(-0.7616F, -1.7221F, -3.4932F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.1832F, -0.2075F, -2.8794F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(213, 193).addBox(-0.2721F, 0.6025F, -5.0607F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.5572F, -3.3454F, -45.1341F, -0.5961F, -0.2267F, -2.7822F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(179, 191).addBox(-0.2721F, 0.916F, -3.8866F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5572F, -3.3454F, -45.1341F, -0.7009F, -0.2267F, -2.7822F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(215, 109).addBox(-0.2721F, 0.709F, -6.1402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5572F, -3.3454F, -45.1341F, -0.0813F, -0.2267F, -2.7822F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(93, 212).addBox(-0.1156F, -0.7261F, -3.7991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.2859F, -0.1891F, -2.9206F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(146, 210).addBox(-0.1156F, -0.5372F, -2.7707F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.3906F, -0.1891F, -2.9206F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(214, 212).addBox(-0.1156F, 0.1739F, -4.3879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, 0.229F, -0.1891F, -2.9206F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(187, 213).addBox(-0.3155F, -1.4303F, -1.4806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.1986F, -0.1891F, -2.9206F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(141, 210).addBox(-0.3155F, -1.4799F, -0.5386F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.3034F, -0.1891F, -2.9206F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(214, 203).addBox(-0.3155F, 0.7027F, -2.0233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, 0.3162F, -0.1891F, -2.9206F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(132, 214).addBox(-0.6156F, -2.7322F, 1.1228F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.155F, -0.1891F, -2.9206F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(39, 210).addBox(-0.6156F, -3.0468F, 1.9145F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.2597F, -0.1891F, -2.9206F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(179, 197).addBox(-0.6156F, 0.8516F, 0.8838F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, 0.3599F, -0.1891F, -2.9206F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(88, 212).addBox(-0.998F, -4.2567F, 4.0357F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.1971F, -0.1553F, -2.9653F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(32, 202).addBox(-0.998F, -4.8674F, 4.6521F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, -0.3018F, -0.1553F, -2.9653F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(189, 22).addBox(-0.998F, 0.9591F, 4.1697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2572F, -3.3454F, -45.1341F, 0.3178F, -0.1553F, -2.9653F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(28, 215).addBox(-0.0593F, -0.6472F, -6.7001F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, 0.3317F, -0.0853F, -2.8794F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(83, 212).addBox(-0.0593F, 0.137F, -5.1299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.2879F, -0.0853F, -2.8794F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(214, 30).addBox(-0.0593F, -0.3022F, -6.2158F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.2981F, -0.5437F, -31.1159F, -0.1832F, -0.0853F, -2.8794F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(87, 179).addBox(-1.6894F, -0.4825F, -0.267F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -39.6908F, -2.0136F, 0.1824F, -0.0327F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(173, 179).addBox(-0.3171F, -0.7034F, -1.3168F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -31.5908F, -1.6402F, 0.1471F, -0.1637F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(205, 151).addBox(-1.6894F, 7.1305F, -3.5881F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -39.6908F, -1.6383F, 0.1824F, -0.0327F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(129, 174).addBox(-1.6894F, -0.2619F, -1.9597F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6742F, 1.3973F, -39.6908F, -1.8565F, 0.1824F, -0.0327F));

		return LayerDefinition.create(meshdefinition, 224, 224);
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