package fossils.fossils.client.blockentity.model.lusovenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LusovenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart HEADPART;
	private final ModelPart HEADPART2;
	private final ModelPart HEADPART3;
	private final ModelPart HEADPART5;
	private final ModelPart HEADPART6;
	private final ModelPart HEADPART7;
	private final ModelPart HEADPART8;
	private final ModelPart HEADPART4;
	private final ModelPart HEADPART9;
	private final ModelPart HEADPART10;
	private final ModelPart HEADPART12;
	private final ModelPart jaw;
	private final ModelPart JAWPART;
	private final ModelPart throat;
	private final ModelPart throatpouch;
	private final ModelPart throat2;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;

	public LusovenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.HEADPART = this.head.getChild("HEADPART");
		this.HEADPART2 = this.HEADPART.getChild("HEADPART2");
		this.HEADPART3 = this.HEADPART2.getChild("HEADPART3");
		this.HEADPART5 = this.head.getChild("HEADPART5");
		this.HEADPART6 = this.HEADPART5.getChild("HEADPART6");
		this.HEADPART7 = this.HEADPART6.getChild("HEADPART7");
		this.HEADPART8 = this.HEADPART7.getChild("HEADPART8");
		this.HEADPART4 = this.HEADPART5.getChild("HEADPART4");
		this.HEADPART9 = this.HEADPART4.getChild("HEADPART9");
		this.HEADPART10 = this.HEADPART9.getChild("HEADPART10");
		this.HEADPART12 = this.HEADPART5.getChild("HEADPART12");
		this.jaw = this.head.getChild("jaw");
		this.JAWPART = this.jaw.getChild("JAWPART");
		this.throat = this.jaw.getChild("throat");
		this.throatpouch = this.throat.getChild("throatpouch");
		this.throat2 = this.throat.getChild("throat2");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, -0.0903F, 0.2608F, -0.0233F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 65).addBox(0.0F, -3.1841F, -0.0038F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 5.55F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 24).addBox(0.0F, -2.9F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 24).addBox(0.0F, -2.2F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7887F, 2.0531F, -0.0089F, 0.0011F, 0.0048F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 20).addBox(0.0F, -2.049F, -8.9939F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, 4.55F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 30).mirror().addBox(-2.352F, -5.4651F, 0.7019F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.1222F, -0.2094F, 0.1309F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 20).mirror().addBox(-2.352F, -8.0856F, -2.3368F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, -0.2967F, -0.2094F, 0.1309F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 46).mirror().addBox(-2.352F, -6.9076F, -0.6887F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.0349F, -0.2094F, 0.1309F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(75, 13).mirror().addBox(-0.9332F, -8.4823F, -2.9762F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.6109F, 0.3054F, 0.1309F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(21, 73).mirror().addBox(-0.9332F, -9.4125F, -4.1794F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.3665F, 0.3054F, 0.1309F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 72).mirror().addBox(-0.9332F, -7.2894F, -7.2718F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.0F, 0.3054F, 0.1309F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 13).mirror().addBox(-2.3255F, -8.4248F, -4.0801F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.0349F, 0.0F, 0.1309F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 63).mirror().addBox(0.3046F, -0.9395F, -6.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, -0.8203F, 0.0F, -0.4625F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 13).mirror().addBox(-0.0265F, 0.0104F, -4.2349F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.8745F, -1.0187F, 1.6222F, 0.0337F, -0.0346F, -0.1322F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 75).mirror().addBox(0.3057F, 0.1515F, -4.7324F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, -0.1396F, 0.0024F, 0.0435F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 76).mirror().addBox(-0.3687F, -2.6105F, -0.8659F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5498F, 3.1246F, 4.2272F, 1.0069F, 0.0228F, -0.076F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(30, 32).mirror().addBox(-0.3687F, 2.1695F, -1.348F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5498F, 3.1246F, 4.2272F, 1.2163F, 0.0228F, -0.076F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(0.1157F, -5.3163F, -2.6697F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5498F, 3.1246F, 4.2272F, 0.507F, 0.3128F, -0.0902F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 31).mirror().addBox(0.3046F, -4.5091F, -4.6934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.1222F, 0.0F, -0.4625F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 51).mirror().addBox(0.1963F, 3.8798F, -8.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(46, 16).mirror().addBox(0.1963F, 2.8798F, -7.2445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.4189F, 0.0F, 0.0262F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(11, 43).mirror().addBox(0.1963F, 7.2237F, -2.5681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, -0.4363F, 0.0F, 0.0262F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(52, 49).mirror().addBox(0.1963F, 5.6328F, -9.8032F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, 0.2967F, 0.0F, 0.0262F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(27, 44).mirror().addBox(0.3046F, -2.2798F, -4.6552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 3.6813F, 1.6222F, -0.1396F, 0.0F, -0.4625F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(58, 20).addBox(1.352F, -8.0856F, -2.3368F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, -0.2967F, 0.2094F, -0.1309F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(43, 46).addBox(1.352F, -6.9076F, -0.6887F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.0349F, 0.2094F, -0.1309F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 30).addBox(1.352F, -5.4651F, 0.7019F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.1222F, 0.2094F, -0.1309F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(75, 13).addBox(-0.0668F, -8.4823F, -2.9762F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.6109F, -0.3054F, -0.1309F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(38, 72).addBox(-0.0668F, -7.2894F, -7.2718F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.0F, -0.3054F, -0.1309F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(21, 73).addBox(-0.0668F, -9.4125F, -4.1794F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.3665F, -0.3054F, -0.1309F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(52, 49).addBox(-1.1963F, 5.6328F, -9.8032F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.2967F, 0.0F, -0.0262F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 43).addBox(-1.1963F, 7.2237F, -2.5681F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, -0.4363F, 0.0F, -0.0262F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(84, 51).addBox(-1.1963F, 3.8798F, -8.2445F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(46, 16).addBox(-1.1963F, 2.8798F, -7.2445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.4189F, 0.0F, -0.0262F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(8, 63).addBox(-1.3046F, -0.9395F, -6.4296F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, -0.8203F, 0.0F, 0.4625F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 31).addBox(-1.3046F, -4.5091F, -4.6934F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.1222F, 0.0F, 0.4625F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 32).addBox(-0.6313F, 2.1695F, -1.348F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5498F, 3.1246F, 4.2272F, 1.2163F, -0.0228F, 0.076F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-1.5F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.35F, 7.25F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(83, 80).addBox(-0.5F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.35F, 7.25F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(66, 76).addBox(-0.6313F, -2.6105F, -0.8659F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5498F, 3.1246F, 4.2272F, 1.0069F, -0.0228F, 0.076F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(42, 0).addBox(-1.1157F, -5.3163F, -2.6697F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5498F, 3.1246F, 4.2272F, 0.507F, -0.3128F, 0.0902F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(61, 75).addBox(-1.3057F, 0.1515F, -4.7324F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, -0.1396F, -0.0024F, -0.0435F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(27, 44).addBox(-1.3046F, -2.2798F, -4.6552F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, -0.1396F, 0.0F, 0.4625F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(18, 13).addBox(1.3255F, -8.4248F, -4.0801F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.1745F, 3.6813F, 1.6222F, 0.0349F, 0.0F, -0.1309F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(18, 13).addBox(-0.9735F, 0.0104F, -4.2349F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.8745F, -1.0187F, 1.6222F, 0.0337F, 0.0346F, 0.1322F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, -5.45F, 0.0349F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 1).addBox(-1.0F, -0.7272F, -0.0515F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.4F, 7.3F, 0.0948F, -0.079F, -0.0948F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(79, 87).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, 9.9485F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(85, 87).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, 7.9485F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(12, 88).addBox(-0.006F, -1.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 88).addBox(0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, 5.9485F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(15, 88).addBox(-0.006F, -2.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 88).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, 3.9485F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(27, 88).addBox(-0.006F, -2.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 88).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, 1.9485F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(3, 84).addBox(0.0F, 3.8F, 8.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 84).addBox(0.0F, 2.7F, 6.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 43).addBox(0.0F, 0.8F, 4.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 83).addBox(0.0F, -0.2F, 2.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 84).addBox(0.0F, -1.5F, 0.8F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2988F, -0.2537F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 85).addBox(0.0F, -2.8F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7272F, -0.0515F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-2.0F, 0.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 23).mirror().addBox(-2.0F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 54).mirror().addBox(-2.0F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 31).mirror().addBox(-2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 33).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.2728F, -0.0515F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r51 = tail.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(71, 13).addBox(0.0F, 0.0F, 8.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 23).addBox(0.0F, 0.0F, 6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 54).addBox(0.0F, 0.0F, 4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 31).addBox(0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 33).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2728F, -0.0515F, 0.0F, -0.1745F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.55F, -0.1F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(65, 70).addBox(0.0F, -1.65F, 5.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 75).addBox(0.0F, -1.45F, 9.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1272F, 11.9485F, 0.1274F, -0.294F, -0.1209F));

		PartDefinition cube_r52 = tail2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 43).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 7.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 70).addBox(0.0F, -1.2F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 3.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(44, 78).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, 1.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r55 = tail2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(87, 66).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.55F, -0.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(18, 13).addBox(0.0F, 10.4F, 18.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 53).addBox(0.0F, 9.2F, 16.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 25).addBox(0.0F, 8.0F, 14.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 28).addBox(0.0F, 6.9F, 12.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 37).addBox(0.0F, 5.6F, 10.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4261F, -12.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(25, 32).addBox(-0.5F, -0.75F, -0.2F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.005F))
				.texOffs(74, 22).addBox(0.0F, -1.75F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 0).addBox(0.0F, -1.75F, 2.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 72).addBox(0.0F, -1.75F, 4.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 70).addBox(0.0F, -1.65F, 6.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(0.0F, -1.35F, 8.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 11.0F, -0.065F, -0.1839F, -0.1173F));

		PartDefinition cube_r57 = tail3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(5, 89).addBox(0.0F, 15.0F, 26.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 12).addBox(0.0F, 13.6F, 24.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 87).addBox(0.0F, 12.6F, 22.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 88).addBox(0.0F, 11.3F, 20.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1761F, -23.2022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(39, 35).addBox(-0.5F, -0.3465F, -0.2277F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(0.0F, -0.8465F, 0.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -0.7465F, 2.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(0.0F, -0.6465F, 4.7723F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.35F, 9.9F, -0.1439F, -0.1358F, -0.0241F));

		PartDefinition cube_r58 = tail4.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(31, 54).addBox(0.0F, 21.1F, 34.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 54).addBox(0.0F, 19.8F, 32.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 0).addBox(0.0F, 18.5F, 30.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 89).addBox(0.0F, 16.3F, 28.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5261F, -33.1022F, 0.6109F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.2674F, -0.1872F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.0465F, 8.8723F, -0.3335F, 0.248F, -0.0848F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.3316F, -0.1028F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1326F, 7.8128F, -0.3512F, 0.3293F, -0.1179F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9F, -5.2F, 0.3503F, 0.082F, 0.0299F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(34, 85).addBox(0.0F, -3.0705F, 0.1374F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7102F, -1.0697F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(37, 85).addBox(0.0F, -2.9652F, -0.0493F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0102F, -2.8697F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 85).addBox(0.0F, -2.8803F, 0.1477F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0102F, -5.0697F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(53, 85).addBox(0.0F, -2.5748F, -0.0443F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2102F, -6.8697F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(56, 85).addBox(0.0F, -2.2797F, -0.0366F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4102F, -8.8697F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -3.0F, -5.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 13).addBox(0.0F, -2.6F, -7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 16).addBox(-1.0F, -1.0F, -7.5F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1102F, -5.4697F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(82, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.1066F, -0.0282F, -0.5665F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 76).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0852F, -0.0515F, -1.09F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(38, 39).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0765F, -0.4601F, -0.0518F, -0.085F, -1.5699F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 60).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0457F, -0.0155F, -1.5353F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(83, 5).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0477F, 0.0074F, -1.0559F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(83, 11).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.2765F, -2.4601F, -0.0446F, 0.004F, -0.5323F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(83, 25).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0137F, 0.0201F, -0.497F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(35, 83).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0289F, 0.0368F, -1.0206F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-7.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -4.4601F, -0.0426F, 0.0193F, -1.5004F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 10).mirror().addBox(-8.8493F, -2.6091F, -0.5523F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0396F, 0.0541F, -1.4654F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(49, 83).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, -0.0101F, 0.0662F, -0.9847F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -6.4601F, 0.0173F, 0.0362F, -0.4612F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(84, 8).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0484F, 0.0523F, -0.4424F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 83).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, 0.0088F, 0.0956F, -0.9657F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(61, 7).mirror().addBox(-9.8493F, -2.6091F, -0.5523F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -8.4601F, -0.0365F, 0.0888F, -1.4477F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(68, 9).mirror().addBox(-9.8493F, -2.6091F, -0.5523F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, -0.0334F, 0.1236F, -1.43F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0794F, 0.0683F, -0.4231F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(63, 83).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -10.4601F, 0.0278F, 0.125F, -0.9462F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(76, 83).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.1418F, 0.1001F, -0.4353F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(83, 70).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, 0.0662F, 0.1836F, -0.9577F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(68, 11).mirror().addBox(-8.8493F, -2.6091F, -0.5523F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4765F, -12.4601F, -0.0271F, 0.1931F, -1.4464F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(82, 82).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.1066F, 0.0282F, 0.5665F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(82, 76).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0852F, 0.0515F, 1.09F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(38, 39).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0765F, -0.4601F, -0.0518F, 0.085F, 1.5699F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(83, 11).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0446F, -0.004F, 0.5323F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(83, 5).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0477F, -0.0074F, 1.0559F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(70, 60).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2765F, -2.4601F, -0.0457F, 0.0155F, 1.5353F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(0, 23).addBox(2.8493F, -2.6091F, -0.5523F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0426F, -0.0193F, 1.5004F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(35, 83).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0289F, -0.0368F, 1.0206F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(83, 25).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -4.4601F, -0.0137F, -0.0201F, 0.497F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 10).addBox(2.8493F, -2.6091F, -0.5523F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0396F, -0.0541F, 1.4654F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(49, 83).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, -0.0101F, -0.0662F, 0.9847F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(83, 39).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -6.4601F, 0.0173F, -0.0362F, 0.4612F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 8).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0484F, -0.0523F, 0.4424F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(56, 83).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, 0.0088F, -0.0956F, 0.9657F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(61, 7).addBox(2.8493F, -2.6091F, -0.5523F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -8.4601F, -0.0365F, -0.0888F, 1.4477F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(84, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0794F, -0.0683F, 0.4231F));

		PartDefinition cube_r102 = body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(63, 83).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, 0.0278F, -0.125F, 0.9462F));

		PartDefinition cube_r103 = body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(68, 9).addBox(2.8493F, -2.6091F, -0.5523F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -10.4601F, -0.0334F, -0.1236F, 1.43F));

		PartDefinition cube_r104 = body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(68, 11).addBox(2.8493F, -2.6091F, -0.5523F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, -0.0271F, -0.1931F, 1.4464F));

		PartDefinition cube_r105 = body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(83, 70).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.0662F, -0.1836F, 0.9577F));

		PartDefinition cube_r106 = body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(76, 83).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4765F, -12.4601F, 0.1418F, -0.1001F, 0.4353F));

		PartDefinition cube_r107 = body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0901F, -10.0635F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.6859F, -3.7785F, -0.2618F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(26, 45).addBox(-1.0F, -1.1236F, -5.7348F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2602F, -12.9697F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(30, 88).addBox(0.0F, -2.2F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 30).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 88).addBox(0.0F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1236F, -5.7348F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(22, 54).mirror().addBox(-0.5746F, 0.0815F, -0.5328F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5764F, -4.5348F, -0.3856F, -0.7775F, 0.767F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(66, 23).mirror().addBox(-0.4084F, 0.165F, 0.0074F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8764F, -5.7348F, -0.3633F, -0.8845F, 0.8548F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-0.5F, 0.013F, -0.5653F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3764F, -6.5348F, -0.4082F, -1.0178F, 0.9299F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(66, 22).mirror().addBox(-0.5F, -1.005F, -1.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 22).addBox(6.5F, -1.005F, -1.0121F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.9127F, -5.0977F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -1.4141F, -2.9676F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 2.9127F, -6.2977F, 0.5742F, -0.4356F, -0.2665F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(13, 51).mirror().addBox(-0.5F, -0.0659F, -0.1024F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 51).addBox(6.5F, -0.0659F, -0.1024F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 2.1127F, -5.5977F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-0.5F, -0.3F, -3.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(51, 35).addBox(6.5F, -0.3F, -3.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-3.5F, 0.4127F, -2.9977F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(53, 5).mirror().addBox(-6.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0426F, 0.0193F, -1.483F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0289F, 0.0368F, -1.0031F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(82, 59).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -1.1752F, -0.0137F, 0.0201F, -0.4796F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(43, 82).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, 0.0328F, 0.0443F, -0.5304F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(82, 3).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, -0.0007F, 0.0809F, -1.0538F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(25, 39).mirror().addBox(-5.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -3.1752F, -0.038F, 0.0715F, -1.5351F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-4.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -5.1752F, -0.0303F, 0.1584F, -1.5866F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(81, 56).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -5.1752F, 0.0469F, 0.1543F, -1.1006F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.19F, -5.1752F, 0.1106F, 0.0842F, -0.5778F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(81, 78).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -5.1752F, 0.1106F, -0.0842F, 0.5778F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(81, 56).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -5.1752F, 0.0469F, -0.1543F, 1.1006F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(81, 49).addBox(2.8493F, -2.6091F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -5.1752F, -0.0303F, -0.1584F, 1.5866F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(43, 82).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, 0.0328F, -0.0443F, 0.5304F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(82, 3).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, -0.0007F, -0.0809F, 1.0538F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(25, 39).addBox(2.8493F, -2.6091F, -0.5523F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -3.1752F, -0.038F, -0.0715F, 1.5351F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(82, 64).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0289F, -0.0368F, 1.0031F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(53, 5).addBox(2.8493F, -2.6091F, -0.5523F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0426F, -0.0193F, 1.483F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(82, 59).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.19F, -1.1752F, -0.0137F, -0.0201F, 0.4796F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.4141F, -2.9676F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.9127F, -6.2977F, 0.5742F, 0.4356F, 0.2665F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 70).addBox(-1.5F, -1.0035F, -2.9709F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.8764F, -8.0348F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(22, 54).addBox(-0.4254F, 0.0815F, -0.5328F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5764F, -4.5348F, -0.3856F, 0.7775F, -0.767F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(66, 23).addBox(-0.5916F, 0.165F, 0.0074F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8764F, -5.7348F, -0.3633F, 0.8845F, -0.8548F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(67, 50).addBox(-0.5F, 0.013F, -0.5653F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3764F, -6.5348F, -0.4082F, 1.0178F, -0.9299F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, 0.0F, -2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3764F, -5.7348F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(46, 29).addBox(-3.0F, -2.0922F, -2.9192F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0482F, -2.2485F, -0.6283F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(14, 76).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.8264F, -6.7348F, 0.3491F, 0.3491F, -0.0436F));

		PartDefinition cube_r141 = leftarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(0, 63).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(71, 79).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(79, 40).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(0, 53).addBox(-2.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 4.5F, 0.8F, 0.0F, 0.0F, 0.48F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.8264F, -6.7348F, -0.4034F, -0.2267F, 0.385F));

		PartDefinition cube_r142 = rightarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(52, 48).addBox(-0.5F, -1.9F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 2.9F, 0.0F, 0.733F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(24, 79).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(19, 79).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 4.5F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, -2.5F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5F, 0.8F, 0.0F, 0.0F, -0.6109F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4736F, -5.6848F, -0.6584F, -0.1103F, 0.0706F));

		PartDefinition cube_r143 = neck.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(88, 48).addBox(0.0F, -2.2295F, -1.942F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 53).addBox(0.0F, -2.2295F, -3.942F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 0).addBox(-0.5F, -0.8295F, -4.942F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.1208F, 0.1209F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(-3.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2545F, -1.2195F, 0.4057F, 0.8401F, -1.0862F));

		PartDefinition cube_r145 = neck.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2545F, -1.2195F, 0.757F, 0.5206F, -0.5429F));

		PartDefinition cube_r146 = neck.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(36, 22).mirror().addBox(-3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.8545F, -3.4195F, 0.8825F, 0.8467F, -0.6128F));

		PartDefinition cube_r147 = neck.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(36, 22).addBox(0.0F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.8545F, -3.4195F, 0.8825F, -0.8467F, 0.6128F));

		PartDefinition cube_r148 = neck.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(59, 67).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2545F, -1.2195F, 0.757F, -0.5206F, 0.5429F));

		PartDefinition cube_r149 = neck.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(81, 47).addBox(1.7321F, -0.9986F, -0.5523F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2545F, -1.2195F, 0.4057F, -0.8401F, 1.0862F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1708F, -4.3791F, -0.4391F, -0.123F, 0.045F));

		PartDefinition cube_r150 = neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 88).addBox(0.0F, -2.3F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 88).addBox(0.0F, -2.3F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6124F, 0.076F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-2.9912F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4736F, -1.8643F, 1.2191F, 1.0722F, -0.2405F));

		PartDefinition cube_r152 = neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-2.8846F, -0.1529F, -0.5077F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.4716F, -3.5044F, 0.8404F, 1.0473F, -0.6712F));

		PartDefinition cube_r153 = neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(52, 46).addBox(-0.1154F, -0.1529F, -0.5077F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4716F, -3.5044F, 0.8404F, -1.0473F, 0.6712F));

		PartDefinition cube_r154 = neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 7).addBox(-0.0088F, -0.1051F, -0.3453F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.4736F, -1.8643F, 1.2191F, -1.0722F, 0.2405F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(75, 35).addBox(-0.5F, -0.5128F, -3.0845F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.3624F, -4.774F, 0.1578F, -0.2467F, -0.1241F));

		PartDefinition cube_r155 = neck3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(88, 60).addBox(0.0F, -2.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 88).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5128F, -3.0845F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-1.9953F, -0.1005F, -0.4583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3035F, -0.8335F, 0.6856F, 1.0826F, -0.8511F));

		PartDefinition cube_r157 = neck3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(29, 61).mirror().addBox(-1.9395F, -0.1288F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.2009F, -2.8557F, 0.5737F, 1.1238F, -0.9764F));

		PartDefinition cube_r158 = neck3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(29, 61).addBox(-0.0605F, -0.1288F, -0.5363F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.2009F, -2.8557F, 0.5737F, -1.1238F, 0.9764F));

		PartDefinition cube_r159 = neck3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(81, 35).addBox(-0.0047F, -0.1005F, -0.4583F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.3035F, -0.8335F, 0.6856F, -1.0826F, 0.8511F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(73, 0).addBox(-0.5F, -0.566F, -2.7794F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0872F, -3.0345F, 0.5509F, -0.3007F, -0.18F));

		PartDefinition cube_r160 = neck4.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(76, 88).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.566F, -1.7794F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r161 = neck4.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(42, 63).mirror().addBox(-1.9468F, -0.1344F, -0.8566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2023F, -1.5007F, 0.5182F, 0.8958F, -1.0833F));

		PartDefinition cube_r162 = neck4.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(42, 63).addBox(-0.0532F, -0.1344F, -0.8566F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2023F, -1.5007F, 0.5182F, -0.8958F, 1.0833F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.034F, -2.6794F, 0.0875F, -0.0831F, -0.0511F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(86, 27).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.7383F, -2.1399F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(76, 79).mirror().addBox(-2.0F, -0.0137F, -0.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(76, 79).addBox(1.0F, -0.0137F, -0.0163F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -1.8723F, -0.5663F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(60, 37).mirror().addBox(-2.0F, -0.9266F, -1.6992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 37).addBox(1.0F, -0.9266F, -1.6992F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.1277F, 0.3337F, -0.925F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(70, 56).addBox(-2.0F, -0.0539F, -1.0121F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.9723F, -1.5663F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(31, 63).addBox(-2.0F, 0.1594F, -2.3209F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3723F, 0.0337F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(68, 29).addBox(-2.0F, -1.9F, -0.4F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, 1.2277F, -1.4663F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create().texOffs(37, 55).addBox(-1.5F, 0.55F, -4.2F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.01F))
				.texOffs(37, 46).addBox(-2.5F, 0.55F, -0.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.6223F, -2.9663F, 0.1833F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r169 = HEADPART2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, -0.05F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r170 = HEADPART3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(37, 78).addBox(-1.5F, -0.0043F, -0.0544F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.6F, -0.1F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r171 = HEADPART3.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(79, 72).addBox(-1.5F, -0.02F, -0.0545F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.6F, -1.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r172 = HEADPART3.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(29, 81).addBox(-1.5F, -0.05F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 0.7F, -2.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create().texOffs(9, 53).addBox(-1.5F, -1.55F, 0.55F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(13, 71).addBox(-2.0F, -2.3504F, 2.6657F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.8277F, -10.9163F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r173 = HEADPART5.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(58, 15).addBox(-1.5F, -1.0004F, -1.9843F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, -0.35F, 2.65F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r174 = HEADPART5.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(0, 81).addBox(-1.5F, -1.1F, 1.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, 0.6F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r175 = HEADPART5.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(86, 72).addBox(-1.0F, -1.35F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.55F, 0.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create().texOffs(0, 75).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.55F, 1.65F, 0.5172F, 0.0757F, 0.245F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create().texOffs(74, 22).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create().texOffs(52, 75).addBox(-1.0F, -0.9F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 2.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.55F, 1.65F, 0.5172F, -0.0757F, -0.245F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create().texOffs(74, 22).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create().texOffs(52, 75).mirror().addBox(0.0F, -0.9F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3F, 2.7F, 0.7854F, 0.0F, 0.0F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create().texOffs(46, 16).addBox(-2.0F, -3.3F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(52, 69).addBox(-2.5F, -3.3F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r176 = HEADPART12.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(79, 28).addBox(-1.5F, -0.8F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -0.05F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r177 = HEADPART12.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(81, 13).addBox(-1.5F, -1.0F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.45F, -0.05F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r178 = HEADPART12.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(80, 19).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.2427F, -2.7297F, -1.256F, 0.3429F, -0.1504F, -0.099F));

		PartDefinition cube_r179 = HEADPART12.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(40, 87).mirror().addBox(-0.5F, 0.3727F, -1.1466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(87, 21).mirror().addBox(-0.31F, -0.0273F, -0.0466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(87, 21).addBox(1.71F, -0.0273F, -0.0466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(40, 87).addBox(1.9F, 0.3727F, -1.1466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.7F, -2.8254F, 0.9114F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r180 = HEADPART12.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(87, 45).mirror().addBox(-0.51F, 0.0539F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(87, 45).addBox(1.51F, 0.0539F, -0.0147F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.5F, -3.4254F, 1.8114F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r181 = HEADPART12.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(87, 36).mirror().addBox(-0.51F, 0.0525F, 0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(87, 36).addBox(1.51F, 0.0525F, 0.0101F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -1.9254F, 0.7114F, 0.9774F, 0.0F, 0.0F));

		PartDefinition cube_r182 = HEADPART12.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-0.51F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(51, 35).addBox(1.51F, -1.1F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -2.2254F, 2.0114F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r183 = HEADPART12.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(84, 41).mirror().addBox(-0.5F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 41).addBox(2.7F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, -1.8F, 3.8F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r184 = HEADPART12.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(23, 86).mirror().addBox(-0.5F, -1.0148F, -0.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(64, 85).mirror().addBox(-0.63F, -1.1148F, 0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(59, 85).mirror().addBox(-0.84F, -1.1148F, 0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(59, 85).addBox(3.04F, -1.1148F, 0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(64, 85).addBox(2.83F, -1.1148F, 0.2831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(23, 86).addBox(2.7F, -1.0148F, -0.0169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.1F, -2.5F, 3.2F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r185 = HEADPART12.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(18, 86).mirror().addBox(-0.5F, -0.9858F, 0.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(18, 86).addBox(2.7F, -0.9858F, 0.0181F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.1F, -3.4F, 3.7F, -1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r186 = HEADPART12.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(45, 84).mirror().addBox(-0.5F, -1.8877F, -1.0144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(45, 84).addBox(2.7F, -1.8877F, -1.0144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.1F, -1.3F, 4.4F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r187 = HEADPART12.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -0.0148F, 0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(85, 84).mirror().addBox(-0.5F, -0.4148F, 0.4198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(85, 84).addBox(2.7F, -0.4148F, 0.4198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(86, 0).addBox(2.7F, -0.0148F, 0.0198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.1F, -1.2153F, 4.9067F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r188 = HEADPART12.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(29, 84).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(29, 84).addBox(2.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, -1.9153F, 5.8067F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r189 = HEADPART12.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(75, 85).addBox(-0.5F, -0.0436F, -1.0309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.1F, -0.7153F, 6.4067F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r190 = HEADPART12.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 19).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2427F, -2.7297F, -1.256F, 0.3429F, 0.1504F, 0.099F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(39, 65).addBox(0.5F, 0.15F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F))
				.texOffs(78, 5).addBox(0.5F, -0.2283F, -3.6589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(34, 70).addBox(0.5F, 1.1262F, -5.2497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(39, 65).mirror().addBox(-2.5F, 0.15F, -4.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(78, 5).mirror().addBox(-2.5F, -0.2283F, -3.6589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(34, 70).mirror().addBox(-2.5F, 1.1262F, -5.2497F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.8777F, 0.8337F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(40, 83).mirror().addBox(-0.93F, -0.032F, 2.611F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.35F, -4.1F, 0.3375F, 0.0673F, 0.1175F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(76, 67).mirror().addBox(0.0F, -1.0238F, -0.0497F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.35F, -4.1F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(13, 84).mirror().addBox(-0.6F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(13, 84).addBox(2.8F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.1F, 1.2729F, -3.0558F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(85, 18).mirror().addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(85, 18).addBox(1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-1.0F, 0.15F, -0.7F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(70, 43).mirror().addBox(-1.5F, -0.9F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(70, 43).addBox(1.5F, -0.9F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.0F, 1.05F, 0.6F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r196 = jaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(40, 83).addBox(0.93F, -0.032F, 2.611F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.35F, -4.1F, 0.3375F, -0.0673F, -0.1175F));

		PartDefinition cube_r197 = jaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(76, 67).addBox(0.0F, -1.0238F, -0.0497F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.35F, -4.1F, 0.0F, 0.2618F, 0.0F));

		PartDefinition JAWPART = jaw.addOrReplaceChild("JAWPART", CubeListBuilder.create().texOffs(73, 73).addBox(0.0F, 0.1F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F))
				.texOffs(73, 73).mirror().addBox(-2.0F, 0.1F, -2.8F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.25F, -3.6F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r198 = JAWPART.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-1.0F, -0.9517F, -0.4358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(31, 54).addBox(1.0F, -0.9517F, -0.4358F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 1.4F, -5.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r199 = JAWPART.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-1.0F, -0.9412F, -4.0155F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)).mirror(false)
				.texOffs(65, 70).addBox(1.0F, -0.9412F, -4.0155F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(-1.0F, 2.4F, -1.5F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r200 = JAWPART.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(75, 49).mirror().addBox(-1.0F, 0.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(75, 49).addBox(1.0F, 0.0F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-1.0F, 0.1F, -2.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r201 = JAWPART.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(79, 0).addBox(-1.5F, -0.9284F, -0.9361F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.026F)), PartPose.offsetAndRotation(0.0F, 1.0F, -6.9F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r202 = JAWPART.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(80, 67).addBox(-1.5F, -0.9964F, -1.0187F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 1.4F, -6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r203 = JAWPART.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(52, 80).addBox(-1.5F, -0.4F, 2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 61).addBox(-1.5F, -0.4F, 0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.25F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r204 = JAWPART.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(69, 86).addBox(-1.0F, -0.4F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.25F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r205 = JAWPART.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(27, 6).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.75F, -3.8F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(61, 43).addBox(-0.5F, -1.0F, -1.25F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5014F, -0.0536F, 0.0375F, -0.6541F, 0.025F, 0.0357F));

		PartDefinition cube_r206 = leftleg.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(38, 33).addBox(-0.5F, 0.0F, -0.05F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.0F, -1.2F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftleg.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(46, 55).addBox(0.0F, 0.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.7F, 0.2793F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(22, 61).addBox(-1.0F, 2.2627F, 0.1756F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 63).addBox(-1.0F, 0.2627F, -0.8244F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftleg2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.0F, 0.8627F, 1.5756F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftleg2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(9, 75).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.7627F, 1.7756F, -0.0698F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(59, 57).addBox(-1.5F, 0.0F, -0.25F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.2627F, 0.1756F, -1.3945F, -0.0715F, -0.0501F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(54, 10).addBox(-2.5F, 0.0152F, -2.0764F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 1.8326F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(11, 44).addBox(-2.5F, 0.0F, -4.8F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0152F, -1.2764F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(13, 59).addBox(-1.5F, -1.0F, -1.25F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5057F, -0.1306F, 0.0057F, -0.0435F, 0.0F, 0.0F));

		PartDefinition cube_r210 = rightleg.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(36, 16).addBox(-1.5F, 0.0F, -0.05F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 8.0F, -1.2F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightleg.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(22, 53).addBox(-1.0F, 0.0F, -0.95F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.7F, 0.2793F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(50, 57).addBox(-1.0F, 2.2627F, 0.1756F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 15).addBox(-1.0F, 0.2627F, -0.8244F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightleg2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(75, 62).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.0F, 0.8627F, 1.5756F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightleg2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(47, 72).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.7627F, 1.7756F, -0.0698F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, 0.0F, -0.25F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.2627F, 0.1756F, -0.7376F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(53, 0).addBox(-2.5F, 0.0152F, -2.0764F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(14, 32).addBox(-2.5F, 0.0F, -4.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0152F, -1.1764F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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